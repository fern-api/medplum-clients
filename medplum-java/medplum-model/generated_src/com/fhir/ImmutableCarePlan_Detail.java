//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CarePlan_Detail}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCarePlan_Detail.builder()}.
 */
@org.immutables.value.Generated(from = "CarePlan_Detail", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCarePlan_Detail implements com.fhir.CarePlan_Detail {
  private final @javax.annotation.Nullable com.fhir.Timing scheduledTiming;
  private final @javax.annotation.Nullable com.fhir.Period scheduledPeriod;
  private final @javax.annotation.Nullable com.fhir.Careplan_detailStatus status;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept productCodeableConcept;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable com.fhir.Quantity quantity;
  private final @javax.annotation.Nullable java.lang.String scheduledString;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> performer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable java.lang.Boolean doNotPerform;
  private final @javax.annotation.Nullable com.fhir.Quantity dailyAmount;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> goal;
  private final @javax.annotation.Nullable com.fhir.Reference location;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept statusReason;
  private final @javax.annotation.Nullable com.fhir.code kind;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
  private final @javax.annotation.Nullable com.fhir.Reference productReference;

  private ImmutableCarePlan_Detail(
      @javax.annotation.Nullable com.fhir.Timing scheduledTiming,
      @javax.annotation.Nullable com.fhir.Period scheduledPeriod,
      @javax.annotation.Nullable com.fhir.Careplan_detailStatus status,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable com.fhir.CodeableConcept productCodeableConcept,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable com.fhir.Quantity quantity,
      @javax.annotation.Nullable java.lang.String scheduledString,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> performer,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable java.lang.Boolean doNotPerform,
      @javax.annotation.Nullable com.fhir.Quantity dailyAmount,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> goal,
      @javax.annotation.Nullable com.fhir.Reference location,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.CodeableConcept statusReason,
      @javax.annotation.Nullable com.fhir.code kind,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri,
      @javax.annotation.Nullable com.fhir.Reference productReference) {
    this.scheduledTiming = scheduledTiming;
    this.scheduledPeriod = scheduledPeriod;
    this.status = status;
    this.code = code;
    this.productCodeableConcept = productCodeableConcept;
    this.reasonReference = reasonReference;
    this.quantity = quantity;
    this.scheduledString = scheduledString;
    this.modifierExtension = modifierExtension;
    this.instantiatesCanonical = instantiatesCanonical;
    this.performer = performer;
    this.extension = extension;
    this.reasonCode = reasonCode;
    this.doNotPerform = doNotPerform;
    this.dailyAmount = dailyAmount;
    this.description = description;
    this.goal = goal;
    this.location = location;
    this.id = id;
    this.statusReason = statusReason;
    this.kind = kind;
    this.instantiatesUri = instantiatesUri;
    this.productReference = productReference;
  }

  /**
   * @return The value of the {@code scheduledTiming} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("scheduledTiming")
  @Override
  public java.util.Optional<com.fhir.Timing> scheduledTiming() {
    return java.util.Optional.ofNullable(scheduledTiming);
  }

  /**
   * @return The value of the {@code scheduledPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("scheduledPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> scheduledPeriod() {
    return java.util.Optional.ofNullable(scheduledPeriod);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.Careplan_detailStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> code() {
    return java.util.Optional.ofNullable(code);
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
   * @return The value of the {@code reasonReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() {
    return java.util.Optional.ofNullable(reasonReference);
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
   * @return The value of the {@code scheduledString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("scheduledString")
  @Override
  public java.util.Optional<java.lang.String> scheduledString() {
    return java.util.Optional.ofNullable(scheduledString);
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
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() {
    return java.util.Optional.ofNullable(instantiatesCanonical);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> performer() {
    return java.util.Optional.ofNullable(performer);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() {
    return java.util.Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code doNotPerform} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("doNotPerform")
  @Override
  public java.util.Optional<java.lang.Boolean> doNotPerform() {
    return java.util.Optional.ofNullable(doNotPerform);
  }

  /**
   * @return The value of the {@code dailyAmount} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dailyAmount")
  @Override
  public java.util.Optional<com.fhir.Quantity> dailyAmount() {
    return java.util.Optional.ofNullable(dailyAmount);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code goal} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("goal")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> goal() {
    return java.util.Optional.ofNullable(goal);
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("location")
  @Override
  public java.util.Optional<com.fhir.Reference> location() {
    return java.util.Optional.ofNullable(location);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code statusReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> statusReason() {
    return java.util.Optional.ofNullable(statusReason);
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("kind")
  @Override
  public java.util.Optional<com.fhir.code> kind() {
    return java.util.Optional.ofNullable(kind);
  }

  /**
   * @return The value of the {@code instantiatesUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
  @Override
  public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() {
    return java.util.Optional.ofNullable(instantiatesUri);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#scheduledTiming() scheduledTiming} attribute.
   * @param value The value for scheduledTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withScheduledTiming(com.fhir.Timing value) {
    @javax.annotation.Nullable com.fhir.Timing newValue = java.util.Objects.requireNonNull(value, "scheduledTiming");
    if (this.scheduledTiming == newValue) return this;
    return new ImmutableCarePlan_Detail(
        newValue,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#scheduledTiming() scheduledTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for scheduledTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withScheduledTiming(java.util.Optional<? extends com.fhir.Timing> optional) {
    @javax.annotation.Nullable com.fhir.Timing value = optional.orElse(null);
    if (this.scheduledTiming == value) return this;
    return new ImmutableCarePlan_Detail(
        value,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#scheduledPeriod() scheduledPeriod} attribute.
   * @param value The value for scheduledPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withScheduledPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "scheduledPeriod");
    if (this.scheduledPeriod == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        newValue,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#scheduledPeriod() scheduledPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for scheduledPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withScheduledPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.scheduledPeriod == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        value,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withStatus(com.fhir.Careplan_detailStatus value) {
    @javax.annotation.Nullable com.fhir.Careplan_detailStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        newValue,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withStatus(java.util.Optional<? extends com.fhir.Careplan_detailStatus> optional) {
    @javax.annotation.Nullable com.fhir.Careplan_detailStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        value,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        newValue,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        value,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#productCodeableConcept() productCodeableConcept} attribute.
   * @param value The value for productCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withProductCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "productCodeableConcept");
    if (this.productCodeableConcept == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        newValue,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#productCodeableConcept() productCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withProductCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.productCodeableConcept == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        value,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        newValue,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        value,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        newValue,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        value,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#scheduledString() scheduledString} attribute.
   * @param value The value for scheduledString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withScheduledString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "scheduledString");
    if (java.util.Objects.equals(this.scheduledString, newValue)) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        newValue,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#scheduledString() scheduledString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for scheduledString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withScheduledString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.scheduledString, value)) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        value,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        newValue,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        value,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withInstantiatesCanonical(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        newValue,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withInstantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        value,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withPerformer(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        newValue,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withPerformer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        value,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        newValue,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        value,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        newValue,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        value,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#doNotPerform() doNotPerform} attribute.
   * @param value The value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withDoNotPerform(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.doNotPerform, newValue)) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        newValue,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#doNotPerform() doNotPerform} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withDoNotPerform(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.doNotPerform, value)) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        value,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#dailyAmount() dailyAmount} attribute.
   * @param value The value for dailyAmount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withDailyAmount(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "dailyAmount");
    if (this.dailyAmount == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        newValue,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#dailyAmount() dailyAmount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dailyAmount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withDailyAmount(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.dailyAmount == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        value,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        newValue,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        value,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#goal() goal} attribute.
   * @param value The value for goal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withGoal(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "goal");
    if (this.goal == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        newValue,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#goal() goal} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for goal
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withGoal(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.goal == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        value,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withLocation(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        newValue,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withLocation(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        value,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        newValue,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        value,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withStatusReason(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        newValue,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withStatusReason(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        value,
        this.kind,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#kind() kind} attribute.
   * @param value The value for kind
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withKind(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "kind");
    if (this.kind == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        newValue,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#kind() kind} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kind
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withKind(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.kind == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        value,
        this.instantiatesUri,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withInstantiatesUri(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        newValue,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withInstantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        value,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#productReference() productReference} attribute.
   * @param value The value for productReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withProductReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "productReference");
    if (this.productReference == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#productReference() productReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withProductReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.productReference == value) return this;
    return new ImmutableCarePlan_Detail(
        this.scheduledTiming,
        this.scheduledPeriod,
        this.status,
        this.code,
        this.productCodeableConcept,
        this.reasonReference,
        this.quantity,
        this.scheduledString,
        this.modifierExtension,
        this.instantiatesCanonical,
        this.performer,
        this.extension,
        this.reasonCode,
        this.doNotPerform,
        this.dailyAmount,
        this.description,
        this.goal,
        this.location,
        this.id,
        this.statusReason,
        this.kind,
        this.instantiatesUri,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCarePlan_Detail} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCarePlan_Detail
        && equalTo((ImmutableCarePlan_Detail) another);
  }

  private boolean equalTo(ImmutableCarePlan_Detail another) {
    return java.util.Objects.equals(scheduledTiming, another.scheduledTiming)
        && java.util.Objects.equals(scheduledPeriod, another.scheduledPeriod)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(productCodeableConcept, another.productCodeableConcept)
        && java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(quantity, another.quantity)
        && java.util.Objects.equals(scheduledString, another.scheduledString)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && java.util.Objects.equals(performer, another.performer)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(doNotPerform, another.doNotPerform)
        && java.util.Objects.equals(dailyAmount, another.dailyAmount)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(goal, another.goal)
        && java.util.Objects.equals(location, another.location)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(statusReason, another.statusReason)
        && java.util.Objects.equals(kind, another.kind)
        && java.util.Objects.equals(instantiatesUri, another.instantiatesUri)
        && java.util.Objects.equals(productReference, another.productReference);
  }

  /**
   * Computes a hash code from attributes: {@code scheduledTiming}, {@code scheduledPeriod}, {@code status}, {@code code}, {@code productCodeableConcept}, {@code reasonReference}, {@code quantity}, {@code scheduledString}, {@code modifierExtension}, {@code instantiatesCanonical}, {@code performer}, {@code extension}, {@code reasonCode}, {@code doNotPerform}, {@code dailyAmount}, {@code description}, {@code goal}, {@code location}, {@code id}, {@code statusReason}, {@code kind}, {@code instantiatesUri}, {@code productReference}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(scheduledTiming);
    h += (h << 5) + java.util.Objects.hashCode(scheduledPeriod);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(productCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(quantity);
    h += (h << 5) + java.util.Objects.hashCode(scheduledString);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + java.util.Objects.hashCode(performer);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(doNotPerform);
    h += (h << 5) + java.util.Objects.hashCode(dailyAmount);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(goal);
    h += (h << 5) + java.util.Objects.hashCode(location);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(statusReason);
    h += (h << 5) + java.util.Objects.hashCode(kind);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesUri);
    h += (h << 5) + java.util.Objects.hashCode(productReference);
    return h;
  }

  /**
   * Prints the immutable value {@code CarePlan_Detail} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CarePlan_Detail{");
    if (scheduledTiming != null) {
      builder.append("scheduledTiming=").append(scheduledTiming);
    }
    if (scheduledPeriod != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("scheduledPeriod=").append(scheduledPeriod);
    }
    if (status != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (code != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (productCodeableConcept != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("productCodeableConcept=").append(productCodeableConcept);
    }
    if (reasonReference != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (quantity != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (scheduledString != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("scheduledString=").append(scheduledString);
    }
    if (modifierExtension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (instantiatesCanonical != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (performer != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (reasonCode != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (doNotPerform != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("doNotPerform=").append(doNotPerform);
    }
    if (dailyAmount != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("dailyAmount=").append(dailyAmount);
    }
    if (description != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (goal != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("goal=").append(goal);
    }
    if (location != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("location=").append(location);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (statusReason != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (kind != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("kind=").append(kind);
    }
    if (instantiatesUri != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (productReference != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("productReference=").append(productReference);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CarePlan_Detail", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CarePlan_Detail {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing> scheduledTiming = java.util.Optional.empty();
    boolean scheduledTimingIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> scheduledPeriod = java.util.Optional.empty();
    boolean scheduledPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Careplan_detailStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> productCodeableConcept = java.util.Optional.empty();
    boolean productCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> quantity = java.util.Optional.empty();
    boolean quantityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> scheduledString = java.util.Optional.empty();
    boolean scheduledStringIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical = java.util.Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> doNotPerform = java.util.Optional.empty();
    boolean doNotPerformIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> dailyAmount = java.util.Optional.empty();
    boolean dailyAmountIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> goal = java.util.Optional.empty();
    boolean goalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> location = java.util.Optional.empty();
    boolean locationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> statusReason = java.util.Optional.empty();
    boolean statusReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> kind = java.util.Optional.empty();
    boolean kindIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri = java.util.Optional.empty();
    boolean instantiatesUriIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> productReference = java.util.Optional.empty();
    boolean productReferenceIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledTiming")
    public void setScheduledTiming(java.util.Optional<com.fhir.Timing> scheduledTiming) {
      this.scheduledTiming = scheduledTiming;
      this.scheduledTimingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledPeriod")
    public void setScheduledPeriod(java.util.Optional<com.fhir.Period> scheduledPeriod) {
      this.scheduledPeriod = scheduledPeriod;
      this.scheduledPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.Careplan_detailStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("productCodeableConcept")
    public void setProductCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> productCodeableConcept) {
      this.productCodeableConcept = productCodeableConcept;
      this.productCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public void setQuantity(java.util.Optional<com.fhir.Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledString")
    public void setScheduledString(java.util.Optional<java.lang.String> scheduledString) {
      this.scheduledString = scheduledString;
      this.scheduledStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<java.util.List<com.fhir.Reference>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("doNotPerform")
    public void setDoNotPerform(java.util.Optional<java.lang.Boolean> doNotPerform) {
      this.doNotPerform = doNotPerform;
      this.doNotPerformIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dailyAmount")
    public void setDailyAmount(java.util.Optional<com.fhir.Quantity> dailyAmount) {
      this.dailyAmount = dailyAmount;
      this.dailyAmountIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("goal")
    public void setGoal(java.util.Optional<java.util.List<com.fhir.Reference>> goal) {
      this.goal = goal;
      this.goalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<com.fhir.Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public void setStatusReason(java.util.Optional<com.fhir.CodeableConcept> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    public void setKind(java.util.Optional<com.fhir.code> kind) {
      this.kind = kind;
      this.kindIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public void setInstantiatesUri(java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("productReference")
    public void setProductReference(java.util.Optional<com.fhir.Reference> productReference) {
      this.productReference = productReference;
      this.productReferenceIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Timing> scheduledTiming() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> scheduledPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Careplan_detailStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> productCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> scheduledString() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> doNotPerform() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> dailyAmount() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> goal() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> kind() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> productReference() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCarePlan_Detail fromJson(Json json) {
    ImmutableCarePlan_Detail.Builder builder = ImmutableCarePlan_Detail.builder();
    if (json.scheduledTimingIsSet) {
      builder.scheduledTiming(json.scheduledTiming);
    }
    if (json.scheduledPeriodIsSet) {
      builder.scheduledPeriod(json.scheduledPeriod);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.productCodeableConceptIsSet) {
      builder.productCodeableConcept(json.productCodeableConcept);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.scheduledStringIsSet) {
      builder.scheduledString(json.scheduledString);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.doNotPerformIsSet) {
      builder.doNotPerform(json.doNotPerform);
    }
    if (json.dailyAmountIsSet) {
      builder.dailyAmount(json.dailyAmount);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.goalIsSet) {
      builder.goal(json.goal);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.kindIsSet) {
      builder.kind(json.kind);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.productReferenceIsSet) {
      builder.productReference(json.productReference);
    }
    return (ImmutableCarePlan_Detail) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CarePlan_Detail} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CarePlan_Detail instance
   */
  public static CarePlan_Detail copyOf(CarePlan_Detail instance) {
    if (instance instanceof ImmutableCarePlan_Detail) {
      return (ImmutableCarePlan_Detail) instance;
    }
    return ImmutableCarePlan_Detail.builder()
        .scheduledTiming(instance.scheduledTiming())
        .scheduledPeriod(instance.scheduledPeriod())
        .status(instance.status())
        .code(instance.code())
        .productCodeableConcept(instance.productCodeableConcept())
        .reasonReference(instance.reasonReference())
        .quantity(instance.quantity())
        .scheduledString(instance.scheduledString())
        .modifierExtension(instance.modifierExtension())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .performer(instance.performer())
        .extension(instance.extension())
        .reasonCode(instance.reasonCode())
        .doNotPerform(instance.doNotPerform())
        .dailyAmount(instance.dailyAmount())
        .description(instance.description())
        .goal(instance.goal())
        .location(instance.location())
        .id(instance.id())
        .statusReason(instance.statusReason())
        .kind(instance.kind())
        .instantiatesUri(instance.instantiatesUri())
        .productReference(instance.productReference())
        .build();
  }

  /**
   * Creates a builder for {@link CarePlan_Detail CarePlan_Detail}.
   * <pre>
   * ImmutableCarePlan_Detail.builder()
   *    .scheduledTiming(com.fhir.Timing) // optional {@link CarePlan_Detail#scheduledTiming() scheduledTiming}
   *    .scheduledPeriod(com.fhir.Period) // optional {@link CarePlan_Detail#scheduledPeriod() scheduledPeriod}
   *    .status(com.fhir.Careplan_detailStatus) // optional {@link CarePlan_Detail#status() status}
   *    .code(com.fhir.CodeableConcept) // optional {@link CarePlan_Detail#code() code}
   *    .productCodeableConcept(com.fhir.CodeableConcept) // optional {@link CarePlan_Detail#productCodeableConcept() productCodeableConcept}
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link CarePlan_Detail#reasonReference() reasonReference}
   *    .quantity(com.fhir.Quantity) // optional {@link CarePlan_Detail#quantity() quantity}
   *    .scheduledString(String) // optional {@link CarePlan_Detail#scheduledString() scheduledString}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CarePlan_Detail#modifierExtension() modifierExtension}
   *    .instantiatesCanonical(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link CarePlan_Detail#instantiatesCanonical() instantiatesCanonical}
   *    .performer(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link CarePlan_Detail#performer() performer}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CarePlan_Detail#extension() extension}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link CarePlan_Detail#reasonCode() reasonCode}
   *    .doNotPerform(Boolean) // optional {@link CarePlan_Detail#doNotPerform() doNotPerform}
   *    .dailyAmount(com.fhir.Quantity) // optional {@link CarePlan_Detail#dailyAmount() dailyAmount}
   *    .description(String) // optional {@link CarePlan_Detail#description() description}
   *    .goal(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link CarePlan_Detail#goal() goal}
   *    .location(com.fhir.Reference) // optional {@link CarePlan_Detail#location() location}
   *    .id(String) // optional {@link CarePlan_Detail#id() id}
   *    .statusReason(com.fhir.CodeableConcept) // optional {@link CarePlan_Detail#statusReason() statusReason}
   *    .kind(com.fhir.code) // optional {@link CarePlan_Detail#kind() kind}
   *    .instantiatesUri(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link CarePlan_Detail#instantiatesUri() instantiatesUri}
   *    .productReference(com.fhir.Reference) // optional {@link CarePlan_Detail#productReference() productReference}
   *    .build();
   * </pre>
   * @return A new CarePlan_Detail builder
   */
  public static ImmutableCarePlan_Detail.Builder builder() {
    return new ImmutableCarePlan_Detail.Builder();
  }

  /**
   * Builds instances of type {@link CarePlan_Detail CarePlan_Detail}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CarePlan_Detail", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SCHEDULED_TIMING = 0x1L;
    private static final long OPT_BIT_SCHEDULED_PERIOD = 0x2L;
    private static final long OPT_BIT_STATUS = 0x4L;
    private static final long OPT_BIT_CODE = 0x8L;
    private static final long OPT_BIT_PRODUCT_CODEABLE_CONCEPT = 0x10L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x20L;
    private static final long OPT_BIT_QUANTITY = 0x40L;
    private static final long OPT_BIT_SCHEDULED_STRING = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x200L;
    private static final long OPT_BIT_PERFORMER = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_REASON_CODE = 0x1000L;
    private static final long OPT_BIT_DO_NOT_PERFORM = 0x2000L;
    private static final long OPT_BIT_DAILY_AMOUNT = 0x4000L;
    private static final long OPT_BIT_DESCRIPTION = 0x8000L;
    private static final long OPT_BIT_GOAL = 0x10000L;
    private static final long OPT_BIT_LOCATION = 0x20000L;
    private static final long OPT_BIT_ID = 0x40000L;
    private static final long OPT_BIT_STATUS_REASON = 0x80000L;
    private static final long OPT_BIT_KIND = 0x100000L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x200000L;
    private static final long OPT_BIT_PRODUCT_REFERENCE = 0x400000L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Timing scheduledTiming;
    private @javax.annotation.Nullable com.fhir.Period scheduledPeriod;
    private @javax.annotation.Nullable com.fhir.Careplan_detailStatus status;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable com.fhir.CodeableConcept productCodeableConcept;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable com.fhir.Quantity quantity;
    private @javax.annotation.Nullable java.lang.String scheduledString;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> performer;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable java.lang.Boolean doNotPerform;
    private @javax.annotation.Nullable com.fhir.Quantity dailyAmount;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> goal;
    private @javax.annotation.Nullable com.fhir.Reference location;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.CodeableConcept statusReason;
    private @javax.annotation.Nullable com.fhir.code kind;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
    private @javax.annotation.Nullable com.fhir.Reference productReference;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#scheduledTiming() scheduledTiming} to scheduledTiming.
     * @param scheduledTiming The value for scheduledTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder scheduledTiming(com.fhir.Timing scheduledTiming) {
      checkNotIsSet(scheduledTimingIsSet(), "scheduledTiming");
      this.scheduledTiming = java.util.Objects.requireNonNull(scheduledTiming, "scheduledTiming");
      optBits |= OPT_BIT_SCHEDULED_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#scheduledTiming() scheduledTiming} to scheduledTiming.
     * @param scheduledTiming The value for scheduledTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledTiming")
    public final Builder scheduledTiming(java.util.Optional<? extends com.fhir.Timing> scheduledTiming) {
      checkNotIsSet(scheduledTimingIsSet(), "scheduledTiming");
      this.scheduledTiming = scheduledTiming.orElse(null);
      optBits |= OPT_BIT_SCHEDULED_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#scheduledPeriod() scheduledPeriod} to scheduledPeriod.
     * @param scheduledPeriod The value for scheduledPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder scheduledPeriod(com.fhir.Period scheduledPeriod) {
      checkNotIsSet(scheduledPeriodIsSet(), "scheduledPeriod");
      this.scheduledPeriod = java.util.Objects.requireNonNull(scheduledPeriod, "scheduledPeriod");
      optBits |= OPT_BIT_SCHEDULED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#scheduledPeriod() scheduledPeriod} to scheduledPeriod.
     * @param scheduledPeriod The value for scheduledPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledPeriod")
    public final Builder scheduledPeriod(java.util.Optional<? extends com.fhir.Period> scheduledPeriod) {
      checkNotIsSet(scheduledPeriodIsSet(), "scheduledPeriod");
      this.scheduledPeriod = scheduledPeriod.orElse(null);
      optBits |= OPT_BIT_SCHEDULED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.Careplan_detailStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.Careplan_detailStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
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
     * Initializes the optional value {@link CarePlan_Detail#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
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
     * Initializes the optional value {@link CarePlan_Detail#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link CarePlan_Detail#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link CarePlan_Detail#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link CarePlan_Detail#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link CarePlan_Detail#scheduledString() scheduledString} to scheduledString.
     * @param scheduledString The value for scheduledString
     * @return {@code this} builder for chained invocation
     */
    public final Builder scheduledString(java.lang.String scheduledString) {
      checkNotIsSet(scheduledStringIsSet(), "scheduledString");
      this.scheduledString = java.util.Objects.requireNonNull(scheduledString, "scheduledString");
      optBits |= OPT_BIT_SCHEDULED_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#scheduledString() scheduledString} to scheduledString.
     * @param scheduledString The value for scheduledString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledString")
    public final Builder scheduledString(java.util.Optional<java.lang.String> scheduledString) {
      checkNotIsSet(scheduledStringIsSet(), "scheduledString");
      this.scheduledString = scheduledString.orElse(null);
      optBits |= OPT_BIT_SCHEDULED_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CarePlan_Detail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CarePlan_Detail#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesCanonical(java.util.List<com.fhir.canonical> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = java.util.Objects.requireNonNull(instantiatesCanonical, "instantiatesCanonical");
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public final Builder instantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = instantiatesCanonical.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(java.util.List<com.fhir.Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = java.util.Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public final Builder performer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#extension() extension} to extension.
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
     * Initializes the optional value {@link CarePlan_Detail#extension() extension} to extension.
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
     * Initializes the optional value {@link CarePlan_Detail#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link CarePlan_Detail#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link CarePlan_Detail#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for chained invocation
     */
    public final Builder doNotPerform(boolean doNotPerform) {
      checkNotIsSet(doNotPerformIsSet(), "doNotPerform");
      this.doNotPerform = doNotPerform;
      optBits |= OPT_BIT_DO_NOT_PERFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("doNotPerform")
    public final Builder doNotPerform(java.util.Optional<java.lang.Boolean> doNotPerform) {
      checkNotIsSet(doNotPerformIsSet(), "doNotPerform");
      this.doNotPerform = doNotPerform.orElse(null);
      optBits |= OPT_BIT_DO_NOT_PERFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#dailyAmount() dailyAmount} to dailyAmount.
     * @param dailyAmount The value for dailyAmount
     * @return {@code this} builder for chained invocation
     */
    public final Builder dailyAmount(com.fhir.Quantity dailyAmount) {
      checkNotIsSet(dailyAmountIsSet(), "dailyAmount");
      this.dailyAmount = java.util.Objects.requireNonNull(dailyAmount, "dailyAmount");
      optBits |= OPT_BIT_DAILY_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#dailyAmount() dailyAmount} to dailyAmount.
     * @param dailyAmount The value for dailyAmount
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dailyAmount")
    public final Builder dailyAmount(java.util.Optional<? extends com.fhir.Quantity> dailyAmount) {
      checkNotIsSet(dailyAmountIsSet(), "dailyAmount");
      this.dailyAmount = dailyAmount.orElse(null);
      optBits |= OPT_BIT_DAILY_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for chained invocation
     */
    public final Builder goal(java.util.List<com.fhir.Reference> goal) {
      checkNotIsSet(goalIsSet(), "goal");
      this.goal = java.util.Objects.requireNonNull(goal, "goal");
      optBits |= OPT_BIT_GOAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("goal")
    public final Builder goal(java.util.Optional<? extends java.util.List<com.fhir.Reference>> goal) {
      checkNotIsSet(goalIsSet(), "goal");
      this.goal = goal.orElse(null);
      optBits |= OPT_BIT_GOAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(com.fhir.Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = java.util.Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public final Builder location(java.util.Optional<? extends com.fhir.Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(com.fhir.CodeableConcept statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = java.util.Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public final Builder statusReason(java.util.Optional<? extends com.fhir.CodeableConcept> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    public final Builder kind(com.fhir.code kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = java.util.Objects.requireNonNull(kind, "kind");
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    public final Builder kind(java.util.Optional<? extends com.fhir.code> kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = kind.orElse(null);
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesUri(java.util.List<com.fhir.uri> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = java.util.Objects.requireNonNull(instantiatesUri, "instantiatesUri");
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public final Builder instantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = instantiatesUri.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#productReference() productReference} to productReference.
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
     * Initializes the optional value {@link CarePlan_Detail#productReference() productReference} to productReference.
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
     * Builds a new {@link CarePlan_Detail CarePlan_Detail}.
     * @return An immutable instance of CarePlan_Detail
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CarePlan_Detail build() {
      return new ImmutableCarePlan_Detail(
          scheduledTiming,
          scheduledPeriod,
          status,
          code,
          productCodeableConcept,
          reasonReference,
          quantity,
          scheduledString,
          modifierExtension,
          instantiatesCanonical,
          performer,
          extension,
          reasonCode,
          doNotPerform,
          dailyAmount,
          description,
          goal,
          location,
          id,
          statusReason,
          kind,
          instantiatesUri,
          productReference);
    }

    private boolean scheduledTimingIsSet() {
      return (optBits & OPT_BIT_SCHEDULED_TIMING) != 0;
    }

    private boolean scheduledPeriodIsSet() {
      return (optBits & OPT_BIT_SCHEDULED_PERIOD) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean productCodeableConceptIsSet() {
      return (optBits & OPT_BIT_PRODUCT_CODEABLE_CONCEPT) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean scheduledStringIsSet() {
      return (optBits & OPT_BIT_SCHEDULED_STRING) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean doNotPerformIsSet() {
      return (optBits & OPT_BIT_DO_NOT_PERFORM) != 0;
    }

    private boolean dailyAmountIsSet() {
      return (optBits & OPT_BIT_DAILY_AMOUNT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean goalIsSet() {
      return (optBits & OPT_BIT_GOAL) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean kindIsSet() {
      return (optBits & OPT_BIT_KIND) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean productReferenceIsSet() {
      return (optBits & OPT_BIT_PRODUCT_REFERENCE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CarePlan_Detail is strict, attribute is already set: ".concat(name));
    }
  }
}
