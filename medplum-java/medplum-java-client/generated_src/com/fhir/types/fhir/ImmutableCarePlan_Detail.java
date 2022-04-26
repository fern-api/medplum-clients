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
 * Immutable implementation of {@link CarePlan_Detail}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCarePlan_Detail.builder()}.
 */
@Generated(from = "CarePlan_Detail", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCarePlan_Detail implements CarePlan_Detail {
  private final @Nullable Quantity quantity;
  private final @Nullable Period scheduledPeriod;
  private final @Nullable Code kind;
  private final @Nullable Careplan_DetailStatus status;
  private final @Nullable Timing scheduledTiming;
  private final @Nullable Reference location;
  private final @Nullable CodeableConcept productCodeableConcept;
  private final @Nullable String description;
  private final @Nullable CodeableConcept code;
  private final @Nullable List<Reference> performer;
  private final @Nullable List<Uri> instantiatesUri;
  private final @Nullable CodeableConcept statusReason;
  private final @Nullable List<Canonical> instantiatesCanonical;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable Quantity dailyAmount;
  private final @Nullable Boolean doNotPerform;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable String id;
  private final @Nullable String scheduledString;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Reference> goal;
  private final @Nullable Reference productReference;

  private ImmutableCarePlan_Detail(
      @Nullable Quantity quantity,
      @Nullable Period scheduledPeriod,
      @Nullable Code kind,
      @Nullable Careplan_DetailStatus status,
      @Nullable Timing scheduledTiming,
      @Nullable Reference location,
      @Nullable CodeableConcept productCodeableConcept,
      @Nullable String description,
      @Nullable CodeableConcept code,
      @Nullable List<Reference> performer,
      @Nullable List<Uri> instantiatesUri,
      @Nullable CodeableConcept statusReason,
      @Nullable List<Canonical> instantiatesCanonical,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable Quantity dailyAmount,
      @Nullable Boolean doNotPerform,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Reference> reasonReference,
      @Nullable String id,
      @Nullable String scheduledString,
      @Nullable List<Extension> extension,
      @Nullable List<Reference> goal,
      @Nullable Reference productReference) {
    this.quantity = quantity;
    this.scheduledPeriod = scheduledPeriod;
    this.kind = kind;
    this.status = status;
    this.scheduledTiming = scheduledTiming;
    this.location = location;
    this.productCodeableConcept = productCodeableConcept;
    this.description = description;
    this.code = code;
    this.performer = performer;
    this.instantiatesUri = instantiatesUri;
    this.statusReason = statusReason;
    this.instantiatesCanonical = instantiatesCanonical;
    this.reasonCode = reasonCode;
    this.dailyAmount = dailyAmount;
    this.doNotPerform = doNotPerform;
    this.modifierExtension = modifierExtension;
    this.reasonReference = reasonReference;
    this.id = id;
    this.scheduledString = scheduledString;
    this.extension = extension;
    this.goal = goal;
    this.productReference = productReference;
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
   * @return The value of the {@code scheduledPeriod} attribute
   */
  @JsonProperty("scheduledPeriod")
  @Override
  public Optional<Period> scheduledPeriod() {
    return Optional.ofNullable(scheduledPeriod);
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public Optional<Code> kind() {
    return Optional.ofNullable(kind);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Careplan_DetailStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code scheduledTiming} attribute
   */
  @JsonProperty("scheduledTiming")
  @Override
  public Optional<Timing> scheduledTiming() {
    return Optional.ofNullable(scheduledTiming);
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Optional<Reference> location() {
    return Optional.ofNullable(location);
  }

  /**
   * @return The value of the {@code productCodeableConcept} attribute
   */
  @JsonProperty("productCodeableConcept")
  @Override
  public Optional<CodeableConcept> productCodeableConcept() {
    return Optional.ofNullable(productCodeableConcept);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @JsonProperty("performer")
  @Override
  public Optional<List<Reference>> performer() {
    return Optional.ofNullable(performer);
  }

  /**
   * @return The value of the {@code instantiatesUri} attribute
   */
  @JsonProperty("instantiatesUri")
  @Override
  public Optional<List<Uri>> instantiatesUri() {
    return Optional.ofNullable(instantiatesUri);
  }

  /**
   * @return The value of the {@code statusReason} attribute
   */
  @JsonProperty("statusReason")
  @Override
  public Optional<CodeableConcept> statusReason() {
    return Optional.ofNullable(statusReason);
  }

  /**
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @JsonProperty("instantiatesCanonical")
  @Override
  public Optional<List<Canonical>> instantiatesCanonical() {
    return Optional.ofNullable(instantiatesCanonical);
  }

  /**
   * @return The value of the {@code reasonCode} attribute
   */
  @JsonProperty("reasonCode")
  @Override
  public Optional<List<CodeableConcept>> reasonCode() {
    return Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code dailyAmount} attribute
   */
  @JsonProperty("dailyAmount")
  @Override
  public Optional<Quantity> dailyAmount() {
    return Optional.ofNullable(dailyAmount);
  }

  /**
   * @return The value of the {@code doNotPerform} attribute
   */
  @JsonProperty("doNotPerform")
  @Override
  public Optional<Boolean> doNotPerform() {
    return Optional.ofNullable(doNotPerform);
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
   * @return The value of the {@code reasonReference} attribute
   */
  @JsonProperty("reasonReference")
  @Override
  public Optional<List<Reference>> reasonReference() {
    return Optional.ofNullable(reasonReference);
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
   * @return The value of the {@code scheduledString} attribute
   */
  @JsonProperty("scheduledString")
  @Override
  public Optional<String> scheduledString() {
    return Optional.ofNullable(scheduledString);
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
   * @return The value of the {@code goal} attribute
   */
  @JsonProperty("goal")
  @Override
  public Optional<List<Reference>> goal() {
    return Optional.ofNullable(goal);
  }

  /**
   * @return The value of the {@code productReference} attribute
   */
  @JsonProperty("productReference")
  @Override
  public Optional<Reference> productReference() {
    return Optional.ofNullable(productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableCarePlan_Detail(
        newValue,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableCarePlan_Detail(
        value,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#scheduledPeriod() scheduledPeriod} attribute.
   * @param value The value for scheduledPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withScheduledPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "scheduledPeriod");
    if (this.scheduledPeriod == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        newValue,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#scheduledPeriod() scheduledPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for scheduledPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withScheduledPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.scheduledPeriod == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        value,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#kind() kind} attribute.
   * @param value The value for kind
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withKind(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "kind");
    if (this.kind == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        newValue,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#kind() kind} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kind
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withKind(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.kind == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        value,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withStatus(Careplan_DetailStatus value) {
    @Nullable Careplan_DetailStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        newValue,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withStatus(Optional<? extends Careplan_DetailStatus> optional) {
    @Nullable Careplan_DetailStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        value,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#scheduledTiming() scheduledTiming} attribute.
   * @param value The value for scheduledTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withScheduledTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "scheduledTiming");
    if (this.scheduledTiming == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        newValue,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#scheduledTiming() scheduledTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for scheduledTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withScheduledTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.scheduledTiming == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        value,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withLocation(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        newValue,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withLocation(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        value,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#productCodeableConcept() productCodeableConcept} attribute.
   * @param value The value for productCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withProductCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "productCodeableConcept");
    if (this.productCodeableConcept == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        newValue,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#productCodeableConcept() productCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withProductCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.productCodeableConcept == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        value,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        newValue,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        value,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        newValue,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        value,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withPerformer(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        newValue,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withPerformer(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        value,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withInstantiatesUri(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        newValue,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withInstantiatesUri(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        value,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withStatusReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        newValue,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withStatusReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        value,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withInstantiatesCanonical(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        newValue,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withInstantiatesCanonical(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        value,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        newValue,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        value,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#dailyAmount() dailyAmount} attribute.
   * @param value The value for dailyAmount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withDailyAmount(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "dailyAmount");
    if (this.dailyAmount == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        newValue,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#dailyAmount() dailyAmount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dailyAmount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withDailyAmount(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.dailyAmount == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        value,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#doNotPerform() doNotPerform} attribute.
   * @param value The value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withDoNotPerform(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.doNotPerform, newValue)) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        newValue,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#doNotPerform() doNotPerform} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withDoNotPerform(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.doNotPerform, value)) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        value,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        newValue,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        value,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        newValue,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        value,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        newValue,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        value,
        this.scheduledString,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#scheduledString() scheduledString} attribute.
   * @param value The value for scheduledString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withScheduledString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "scheduledString");
    if (Objects.equals(this.scheduledString, newValue)) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        newValue,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#scheduledString() scheduledString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for scheduledString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withScheduledString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.scheduledString, value)) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        value,
        this.extension,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        newValue,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        value,
        this.goal,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#goal() goal} attribute.
   * @param value The value for goal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withGoal(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "goal");
    if (this.goal == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        newValue,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#goal() goal} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for goal
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withGoal(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.goal == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        value,
        this.productReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Detail#productReference() productReference} attribute.
   * @param value The value for productReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Detail withProductReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "productReference");
    if (this.productReference == newValue) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Detail#productReference() productReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Detail withProductReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.productReference == value) return this;
    return new ImmutableCarePlan_Detail(
        this.quantity,
        this.scheduledPeriod,
        this.kind,
        this.status,
        this.scheduledTiming,
        this.location,
        this.productCodeableConcept,
        this.description,
        this.code,
        this.performer,
        this.instantiatesUri,
        this.statusReason,
        this.instantiatesCanonical,
        this.reasonCode,
        this.dailyAmount,
        this.doNotPerform,
        this.modifierExtension,
        this.reasonReference,
        this.id,
        this.scheduledString,
        this.extension,
        this.goal,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCarePlan_Detail} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCarePlan_Detail
        && equalTo((ImmutableCarePlan_Detail) another);
  }

  private boolean equalTo(ImmutableCarePlan_Detail another) {
    return Objects.equals(quantity, another.quantity)
        && Objects.equals(scheduledPeriod, another.scheduledPeriod)
        && Objects.equals(kind, another.kind)
        && Objects.equals(status, another.status)
        && Objects.equals(scheduledTiming, another.scheduledTiming)
        && Objects.equals(location, another.location)
        && Objects.equals(productCodeableConcept, another.productCodeableConcept)
        && Objects.equals(description, another.description)
        && Objects.equals(code, another.code)
        && Objects.equals(performer, another.performer)
        && Objects.equals(instantiatesUri, another.instantiatesUri)
        && Objects.equals(statusReason, another.statusReason)
        && Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(dailyAmount, another.dailyAmount)
        && Objects.equals(doNotPerform, another.doNotPerform)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(id, another.id)
        && Objects.equals(scheduledString, another.scheduledString)
        && Objects.equals(extension, another.extension)
        && Objects.equals(goal, another.goal)
        && Objects.equals(productReference, another.productReference);
  }

  /**
   * Computes a hash code from attributes: {@code quantity}, {@code scheduledPeriod}, {@code kind}, {@code status}, {@code scheduledTiming}, {@code location}, {@code productCodeableConcept}, {@code description}, {@code code}, {@code performer}, {@code instantiatesUri}, {@code statusReason}, {@code instantiatesCanonical}, {@code reasonCode}, {@code dailyAmount}, {@code doNotPerform}, {@code modifierExtension}, {@code reasonReference}, {@code id}, {@code scheduledString}, {@code extension}, {@code goal}, {@code productReference}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(scheduledPeriod);
    h += (h << 5) + Objects.hashCode(kind);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(scheduledTiming);
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(productCodeableConcept);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + Objects.hashCode(instantiatesUri);
    h += (h << 5) + Objects.hashCode(statusReason);
    h += (h << 5) + Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(dailyAmount);
    h += (h << 5) + Objects.hashCode(doNotPerform);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(scheduledString);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(goal);
    h += (h << 5) + Objects.hashCode(productReference);
    return h;
  }

  /**
   * Prints the immutable value {@code CarePlan_Detail} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CarePlan_Detail{");
    if (quantity != null) {
      builder.append("quantity=").append(quantity);
    }
    if (scheduledPeriod != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("scheduledPeriod=").append(scheduledPeriod);
    }
    if (kind != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("kind=").append(kind);
    }
    if (status != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (scheduledTiming != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("scheduledTiming=").append(scheduledTiming);
    }
    if (location != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("location=").append(location);
    }
    if (productCodeableConcept != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("productCodeableConcept=").append(productCodeableConcept);
    }
    if (description != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (code != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (performer != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (instantiatesUri != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (statusReason != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (instantiatesCanonical != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (reasonCode != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (dailyAmount != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("dailyAmount=").append(dailyAmount);
    }
    if (doNotPerform != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("doNotPerform=").append(doNotPerform);
    }
    if (modifierExtension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (reasonReference != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (scheduledString != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("scheduledString=").append(scheduledString);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (goal != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("goal=").append(goal);
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
  @Generated(from = "CarePlan_Detail", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CarePlan_Detail {
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<Period> scheduledPeriod = Optional.empty();
    boolean scheduledPeriodIsSet;
    @Nullable Optional<Code> kind = Optional.empty();
    boolean kindIsSet;
    @Nullable Optional<Careplan_DetailStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Timing> scheduledTiming = Optional.empty();
    boolean scheduledTimingIsSet;
    @Nullable Optional<Reference> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<CodeableConcept> productCodeableConcept = Optional.empty();
    boolean productCodeableConceptIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<Reference>> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable Optional<List<Uri>> instantiatesUri = Optional.empty();
    boolean instantiatesUriIsSet;
    @Nullable Optional<CodeableConcept> statusReason = Optional.empty();
    boolean statusReasonIsSet;
    @Nullable Optional<List<Canonical>> instantiatesCanonical = Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<Quantity> dailyAmount = Optional.empty();
    boolean dailyAmountIsSet;
    @Nullable Optional<Boolean> doNotPerform = Optional.empty();
    boolean doNotPerformIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> scheduledString = Optional.empty();
    boolean scheduledStringIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Reference>> goal = Optional.empty();
    boolean goalIsSet;
    @Nullable Optional<Reference> productReference = Optional.empty();
    boolean productReferenceIsSet;
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("scheduledPeriod")
    public void setScheduledPeriod(Optional<Period> scheduledPeriod) {
      this.scheduledPeriod = scheduledPeriod;
      this.scheduledPeriodIsSet = true;
    }
    @JsonProperty("kind")
    public void setKind(Optional<Code> kind) {
      this.kind = kind;
      this.kindIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Careplan_DetailStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("scheduledTiming")
    public void setScheduledTiming(Optional<Timing> scheduledTiming) {
      this.scheduledTiming = scheduledTiming;
      this.scheduledTimingIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Optional<Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("productCodeableConcept")
    public void setProductCodeableConcept(Optional<CodeableConcept> productCodeableConcept) {
      this.productCodeableConcept = productCodeableConcept;
      this.productCodeableConceptIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<List<Reference>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(Optional<List<Uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @JsonProperty("statusReason")
    public void setStatusReason(Optional<CodeableConcept> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(Optional<List<Canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("dailyAmount")
    public void setDailyAmount(Optional<Quantity> dailyAmount) {
      this.dailyAmount = dailyAmount;
      this.dailyAmountIsSet = true;
    }
    @JsonProperty("doNotPerform")
    public void setDoNotPerform(Optional<Boolean> doNotPerform) {
      this.doNotPerform = doNotPerform;
      this.doNotPerformIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("scheduledString")
    public void setScheduledString(Optional<String> scheduledString) {
      this.scheduledString = scheduledString;
      this.scheduledStringIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("goal")
    public void setGoal(Optional<List<Reference>> goal) {
      this.goal = goal;
      this.goalIsSet = true;
    }
    @JsonProperty("productReference")
    public void setProductReference(Optional<Reference> productReference) {
      this.productReference = productReference;
      this.productReferenceIsSet = true;
    }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> scheduledPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> kind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Careplan_DetailStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> scheduledTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> productCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> dailyAmount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> doNotPerform() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> scheduledString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> goal() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> productReference() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCarePlan_Detail fromJson(Json json) {
    ImmutableCarePlan_Detail.Builder builder = ImmutableCarePlan_Detail.builder();
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.scheduledPeriodIsSet) {
      builder.scheduledPeriod(json.scheduledPeriod);
    }
    if (json.kindIsSet) {
      builder.kind(json.kind);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.scheduledTimingIsSet) {
      builder.scheduledTiming(json.scheduledTiming);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.productCodeableConceptIsSet) {
      builder.productCodeableConcept(json.productCodeableConcept);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.dailyAmountIsSet) {
      builder.dailyAmount(json.dailyAmount);
    }
    if (json.doNotPerformIsSet) {
      builder.doNotPerform(json.doNotPerform);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.scheduledStringIsSet) {
      builder.scheduledString(json.scheduledString);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.goalIsSet) {
      builder.goal(json.goal);
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
        .quantity(instance.quantity())
        .scheduledPeriod(instance.scheduledPeriod())
        .kind(instance.kind())
        .status(instance.status())
        .scheduledTiming(instance.scheduledTiming())
        .location(instance.location())
        .productCodeableConcept(instance.productCodeableConcept())
        .description(instance.description())
        .code(instance.code())
        .performer(instance.performer())
        .instantiatesUri(instance.instantiatesUri())
        .statusReason(instance.statusReason())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .reasonCode(instance.reasonCode())
        .dailyAmount(instance.dailyAmount())
        .doNotPerform(instance.doNotPerform())
        .modifierExtension(instance.modifierExtension())
        .reasonReference(instance.reasonReference())
        .id(instance.id())
        .scheduledString(instance.scheduledString())
        .extension(instance.extension())
        .goal(instance.goal())
        .productReference(instance.productReference())
        .build();
  }

  /**
   * Creates a builder for {@link CarePlan_Detail CarePlan_Detail}.
   * <pre>
   * ImmutableCarePlan_Detail.builder()
   *    .quantity(com.fhir.types.fhir.Quantity) // optional {@link CarePlan_Detail#quantity() quantity}
   *    .scheduledPeriod(com.fhir.types.fhir.Period) // optional {@link CarePlan_Detail#scheduledPeriod() scheduledPeriod}
   *    .kind(com.fhir.types.fhir.Code) // optional {@link CarePlan_Detail#kind() kind}
   *    .status(Careplan_DetailStatus) // optional {@link CarePlan_Detail#status() status}
   *    .scheduledTiming(com.fhir.types.fhir.Timing) // optional {@link CarePlan_Detail#scheduledTiming() scheduledTiming}
   *    .location(com.fhir.types.fhir.Reference) // optional {@link CarePlan_Detail#location() location}
   *    .productCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link CarePlan_Detail#productCodeableConcept() productCodeableConcept}
   *    .description(String) // optional {@link CarePlan_Detail#description() description}
   *    .code(com.fhir.types.fhir.CodeableConcept) // optional {@link CarePlan_Detail#code() code}
   *    .performer(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link CarePlan_Detail#performer() performer}
   *    .instantiatesUri(List&amp;lt;com.fhir.types.fhir.Uri&amp;gt;) // optional {@link CarePlan_Detail#instantiatesUri() instantiatesUri}
   *    .statusReason(com.fhir.types.fhir.CodeableConcept) // optional {@link CarePlan_Detail#statusReason() statusReason}
   *    .instantiatesCanonical(List&amp;lt;com.fhir.types.fhir.Canonical&amp;gt;) // optional {@link CarePlan_Detail#instantiatesCanonical() instantiatesCanonical}
   *    .reasonCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link CarePlan_Detail#reasonCode() reasonCode}
   *    .dailyAmount(com.fhir.types.fhir.Quantity) // optional {@link CarePlan_Detail#dailyAmount() dailyAmount}
   *    .doNotPerform(Boolean) // optional {@link CarePlan_Detail#doNotPerform() doNotPerform}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CarePlan_Detail#modifierExtension() modifierExtension}
   *    .reasonReference(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link CarePlan_Detail#reasonReference() reasonReference}
   *    .id(String) // optional {@link CarePlan_Detail#id() id}
   *    .scheduledString(String) // optional {@link CarePlan_Detail#scheduledString() scheduledString}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CarePlan_Detail#extension() extension}
   *    .goal(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link CarePlan_Detail#goal() goal}
   *    .productReference(com.fhir.types.fhir.Reference) // optional {@link CarePlan_Detail#productReference() productReference}
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
  @Generated(from = "CarePlan_Detail", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_QUANTITY = 0x1L;
    private static final long OPT_BIT_SCHEDULED_PERIOD = 0x2L;
    private static final long OPT_BIT_KIND = 0x4L;
    private static final long OPT_BIT_STATUS = 0x8L;
    private static final long OPT_BIT_SCHEDULED_TIMING = 0x10L;
    private static final long OPT_BIT_LOCATION = 0x20L;
    private static final long OPT_BIT_PRODUCT_CODEABLE_CONCEPT = 0x40L;
    private static final long OPT_BIT_DESCRIPTION = 0x80L;
    private static final long OPT_BIT_CODE = 0x100L;
    private static final long OPT_BIT_PERFORMER = 0x200L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x400L;
    private static final long OPT_BIT_STATUS_REASON = 0x800L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x1000L;
    private static final long OPT_BIT_REASON_CODE = 0x2000L;
    private static final long OPT_BIT_DAILY_AMOUNT = 0x4000L;
    private static final long OPT_BIT_DO_NOT_PERFORM = 0x8000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x20000L;
    private static final long OPT_BIT_ID = 0x40000L;
    private static final long OPT_BIT_SCHEDULED_STRING = 0x80000L;
    private static final long OPT_BIT_EXTENSION = 0x100000L;
    private static final long OPT_BIT_GOAL = 0x200000L;
    private static final long OPT_BIT_PRODUCT_REFERENCE = 0x400000L;
    private long optBits;

    private @Nullable Quantity quantity;
    private @Nullable Period scheduledPeriod;
    private @Nullable Code kind;
    private @Nullable Careplan_DetailStatus status;
    private @Nullable Timing scheduledTiming;
    private @Nullable Reference location;
    private @Nullable CodeableConcept productCodeableConcept;
    private @Nullable String description;
    private @Nullable CodeableConcept code;
    private @Nullable List<Reference> performer;
    private @Nullable List<Uri> instantiatesUri;
    private @Nullable CodeableConcept statusReason;
    private @Nullable List<Canonical> instantiatesCanonical;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable Quantity dailyAmount;
    private @Nullable Boolean doNotPerform;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Reference> reasonReference;
    private @Nullable String id;
    private @Nullable String scheduledString;
    private @Nullable List<Extension> extension;
    private @Nullable List<Reference> goal;
    private @Nullable Reference productReference;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link CarePlan_Detail#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link CarePlan_Detail#scheduledPeriod() scheduledPeriod} to scheduledPeriod.
     * @param scheduledPeriod The value for scheduledPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder scheduledPeriod(Period scheduledPeriod) {
      checkNotIsSet(scheduledPeriodIsSet(), "scheduledPeriod");
      this.scheduledPeriod = Objects.requireNonNull(scheduledPeriod, "scheduledPeriod");
      optBits |= OPT_BIT_SCHEDULED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#scheduledPeriod() scheduledPeriod} to scheduledPeriod.
     * @param scheduledPeriod The value for scheduledPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scheduledPeriod")
    public final Builder scheduledPeriod(Optional<? extends Period> scheduledPeriod) {
      checkNotIsSet(scheduledPeriodIsSet(), "scheduledPeriod");
      this.scheduledPeriod = scheduledPeriod.orElse(null);
      optBits |= OPT_BIT_SCHEDULED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    public final Builder kind(Code kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = Objects.requireNonNull(kind, "kind");
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(Optional<? extends Code> kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = kind.orElse(null);
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(Careplan_DetailStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends Careplan_DetailStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#scheduledTiming() scheduledTiming} to scheduledTiming.
     * @param scheduledTiming The value for scheduledTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder scheduledTiming(Timing scheduledTiming) {
      checkNotIsSet(scheduledTimingIsSet(), "scheduledTiming");
      this.scheduledTiming = Objects.requireNonNull(scheduledTiming, "scheduledTiming");
      optBits |= OPT_BIT_SCHEDULED_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#scheduledTiming() scheduledTiming} to scheduledTiming.
     * @param scheduledTiming The value for scheduledTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scheduledTiming")
    public final Builder scheduledTiming(Optional<? extends Timing> scheduledTiming) {
      checkNotIsSet(scheduledTimingIsSet(), "scheduledTiming");
      this.scheduledTiming = scheduledTiming.orElse(null);
      optBits |= OPT_BIT_SCHEDULED_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(Optional<? extends Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder productCodeableConcept(CodeableConcept productCodeableConcept) {
      checkNotIsSet(productCodeableConceptIsSet(), "productCodeableConcept");
      this.productCodeableConcept = Objects.requireNonNull(productCodeableConcept, "productCodeableConcept");
      optBits |= OPT_BIT_PRODUCT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productCodeableConcept")
    public final Builder productCodeableConcept(Optional<? extends CodeableConcept> productCodeableConcept) {
      checkNotIsSet(productCodeableConceptIsSet(), "productCodeableConcept");
      this.productCodeableConcept = productCodeableConcept.orElse(null);
      optBits |= OPT_BIT_PRODUCT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(List<Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performer")
    public final Builder performer(Optional<? extends List<Reference>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesUri(List<Uri> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = Objects.requireNonNull(instantiatesUri, "instantiatesUri");
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesUri")
    public final Builder instantiatesUri(Optional<? extends List<Uri>> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = instantiatesUri.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(CodeableConcept statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusReason")
    public final Builder statusReason(Optional<? extends CodeableConcept> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesCanonical(List<Canonical> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = Objects.requireNonNull(instantiatesCanonical, "instantiatesCanonical");
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesCanonical")
    public final Builder instantiatesCanonical(Optional<? extends List<Canonical>> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = instantiatesCanonical.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(List<CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonCode")
    public final Builder reasonCode(Optional<? extends List<CodeableConcept>> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#dailyAmount() dailyAmount} to dailyAmount.
     * @param dailyAmount The value for dailyAmount
     * @return {@code this} builder for chained invocation
     */
    public final Builder dailyAmount(Quantity dailyAmount) {
      checkNotIsSet(dailyAmountIsSet(), "dailyAmount");
      this.dailyAmount = Objects.requireNonNull(dailyAmount, "dailyAmount");
      optBits |= OPT_BIT_DAILY_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#dailyAmount() dailyAmount} to dailyAmount.
     * @param dailyAmount The value for dailyAmount
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dailyAmount")
    public final Builder dailyAmount(Optional<? extends Quantity> dailyAmount) {
      checkNotIsSet(dailyAmountIsSet(), "dailyAmount");
      this.dailyAmount = dailyAmount.orElse(null);
      optBits |= OPT_BIT_DAILY_AMOUNT;
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
    @JsonProperty("doNotPerform")
    public final Builder doNotPerform(Optional<Boolean> doNotPerform) {
      checkNotIsSet(doNotPerformIsSet(), "doNotPerform");
      this.doNotPerform = doNotPerform.orElse(null);
      optBits |= OPT_BIT_DO_NOT_PERFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CarePlan_Detail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CarePlan_Detail#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(List<Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonReference")
    public final Builder reasonReference(Optional<? extends List<Reference>> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#id() id} to id.
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
     * Initializes the optional value {@link CarePlan_Detail#id() id} to id.
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
     * Initializes the optional value {@link CarePlan_Detail#scheduledString() scheduledString} to scheduledString.
     * @param scheduledString The value for scheduledString
     * @return {@code this} builder for chained invocation
     */
    public final Builder scheduledString(String scheduledString) {
      checkNotIsSet(scheduledStringIsSet(), "scheduledString");
      this.scheduledString = Objects.requireNonNull(scheduledString, "scheduledString");
      optBits |= OPT_BIT_SCHEDULED_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#scheduledString() scheduledString} to scheduledString.
     * @param scheduledString The value for scheduledString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scheduledString")
    public final Builder scheduledString(Optional<String> scheduledString) {
      checkNotIsSet(scheduledStringIsSet(), "scheduledString");
      this.scheduledString = scheduledString.orElse(null);
      optBits |= OPT_BIT_SCHEDULED_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#extension() extension} to extension.
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
     * Initializes the optional value {@link CarePlan_Detail#extension() extension} to extension.
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
     * Initializes the optional value {@link CarePlan_Detail#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for chained invocation
     */
    public final Builder goal(List<Reference> goal) {
      checkNotIsSet(goalIsSet(), "goal");
      this.goal = Objects.requireNonNull(goal, "goal");
      optBits |= OPT_BIT_GOAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("goal")
    public final Builder goal(Optional<? extends List<Reference>> goal) {
      checkNotIsSet(goalIsSet(), "goal");
      this.goal = goal.orElse(null);
      optBits |= OPT_BIT_GOAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder productReference(Reference productReference) {
      checkNotIsSet(productReferenceIsSet(), "productReference");
      this.productReference = Objects.requireNonNull(productReference, "productReference");
      optBits |= OPT_BIT_PRODUCT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Detail#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productReference")
    public final Builder productReference(Optional<? extends Reference> productReference) {
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
    public CarePlan_Detail build() {
      return new ImmutableCarePlan_Detail(
          quantity,
          scheduledPeriod,
          kind,
          status,
          scheduledTiming,
          location,
          productCodeableConcept,
          description,
          code,
          performer,
          instantiatesUri,
          statusReason,
          instantiatesCanonical,
          reasonCode,
          dailyAmount,
          doNotPerform,
          modifierExtension,
          reasonReference,
          id,
          scheduledString,
          extension,
          goal,
          productReference);
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean scheduledPeriodIsSet() {
      return (optBits & OPT_BIT_SCHEDULED_PERIOD) != 0;
    }

    private boolean kindIsSet() {
      return (optBits & OPT_BIT_KIND) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean scheduledTimingIsSet() {
      return (optBits & OPT_BIT_SCHEDULED_TIMING) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean productCodeableConceptIsSet() {
      return (optBits & OPT_BIT_PRODUCT_CODEABLE_CONCEPT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean dailyAmountIsSet() {
      return (optBits & OPT_BIT_DAILY_AMOUNT) != 0;
    }

    private boolean doNotPerformIsSet() {
      return (optBits & OPT_BIT_DO_NOT_PERFORM) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean scheduledStringIsSet() {
      return (optBits & OPT_BIT_SCHEDULED_STRING) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean goalIsSet() {
      return (optBits & OPT_BIT_GOAL) != 0;
    }

    private boolean productReferenceIsSet() {
      return (optBits & OPT_BIT_PRODUCT_REFERENCE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CarePlan_Detail is strict, attribute is already set: ".concat(name));
    }
  }
}
