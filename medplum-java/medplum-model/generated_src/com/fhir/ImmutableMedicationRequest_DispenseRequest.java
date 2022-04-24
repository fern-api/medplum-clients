//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicationRequest_DispenseRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationRequest_DispenseRequest.builder()}.
 */
@org.immutables.value.Generated(from = "MedicationRequest_DispenseRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationRequest_DispenseRequest
    implements com.fhir.MedicationRequest_DispenseRequest {
  private final @javax.annotation.Nullable com.fhir.MedicationRequest_InitialFill initialFill;
  private final @javax.annotation.Nullable com.fhir.Reference performer;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Quantity quantity;
  private final @javax.annotation.Nullable com.fhir.Duration dispenseInterval;
  private final @javax.annotation.Nullable com.fhir.Period validityPeriod;
  private final @javax.annotation.Nullable com.fhir.unsignedInt numberOfRepeatsAllowed;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Duration expectedSupplyDuration;

  private ImmutableMedicationRequest_DispenseRequest(
      @javax.annotation.Nullable com.fhir.MedicationRequest_InitialFill initialFill,
      @javax.annotation.Nullable com.fhir.Reference performer,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Quantity quantity,
      @javax.annotation.Nullable com.fhir.Duration dispenseInterval,
      @javax.annotation.Nullable com.fhir.Period validityPeriod,
      @javax.annotation.Nullable com.fhir.unsignedInt numberOfRepeatsAllowed,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Duration expectedSupplyDuration) {
    this.initialFill = initialFill;
    this.performer = performer;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.quantity = quantity;
    this.dispenseInterval = dispenseInterval;
    this.validityPeriod = validityPeriod;
    this.numberOfRepeatsAllowed = numberOfRepeatsAllowed;
    this.extension = extension;
    this.expectedSupplyDuration = expectedSupplyDuration;
  }

  /**
   * @return The value of the {@code initialFill} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("initialFill")
  @Override
  public java.util.Optional<com.fhir.MedicationRequest_InitialFill> initialFill() {
    return java.util.Optional.ofNullable(initialFill);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performer")
  @Override
  public java.util.Optional<com.fhir.Reference> performer() {
    return java.util.Optional.ofNullable(performer);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code dispenseInterval} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dispenseInterval")
  @Override
  public java.util.Optional<com.fhir.Duration> dispenseInterval() {
    return java.util.Optional.ofNullable(dispenseInterval);
  }

  /**
   * @return The value of the {@code validityPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("validityPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> validityPeriod() {
    return java.util.Optional.ofNullable(validityPeriod);
  }

  /**
   * @return The value of the {@code numberOfRepeatsAllowed} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("numberOfRepeatsAllowed")
  @Override
  public java.util.Optional<com.fhir.unsignedInt> numberOfRepeatsAllowed() {
    return java.util.Optional.ofNullable(numberOfRepeatsAllowed);
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
   * @return The value of the {@code expectedSupplyDuration} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("expectedSupplyDuration")
  @Override
  public java.util.Optional<com.fhir.Duration> expectedSupplyDuration() {
    return java.util.Optional.ofNullable(expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#initialFill() initialFill} attribute.
   * @param value The value for initialFill
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withInitialFill(com.fhir.MedicationRequest_InitialFill value) {
    @javax.annotation.Nullable com.fhir.MedicationRequest_InitialFill newValue = java.util.Objects.requireNonNull(value, "initialFill");
    if (this.initialFill == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        newValue,
        this.performer,
        this.id,
        this.modifierExtension,
        this.quantity,
        this.dispenseInterval,
        this.validityPeriod,
        this.numberOfRepeatsAllowed,
        this.extension,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#initialFill() initialFill} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for initialFill
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withInitialFill(java.util.Optional<? extends com.fhir.MedicationRequest_InitialFill> optional) {
    @javax.annotation.Nullable com.fhir.MedicationRequest_InitialFill value = optional.orElse(null);
    if (this.initialFill == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        value,
        this.performer,
        this.id,
        this.modifierExtension,
        this.quantity,
        this.dispenseInterval,
        this.validityPeriod,
        this.numberOfRepeatsAllowed,
        this.extension,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withPerformer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        newValue,
        this.id,
        this.modifierExtension,
        this.quantity,
        this.dispenseInterval,
        this.validityPeriod,
        this.numberOfRepeatsAllowed,
        this.extension,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withPerformer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        value,
        this.id,
        this.modifierExtension,
        this.quantity,
        this.dispenseInterval,
        this.validityPeriod,
        this.numberOfRepeatsAllowed,
        this.extension,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        this.performer,
        newValue,
        this.modifierExtension,
        this.quantity,
        this.dispenseInterval,
        this.validityPeriod,
        this.numberOfRepeatsAllowed,
        this.extension,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        this.performer,
        value,
        this.modifierExtension,
        this.quantity,
        this.dispenseInterval,
        this.validityPeriod,
        this.numberOfRepeatsAllowed,
        this.extension,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        this.performer,
        this.id,
        newValue,
        this.quantity,
        this.dispenseInterval,
        this.validityPeriod,
        this.numberOfRepeatsAllowed,
        this.extension,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        this.performer,
        this.id,
        value,
        this.quantity,
        this.dispenseInterval,
        this.validityPeriod,
        this.numberOfRepeatsAllowed,
        this.extension,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        this.performer,
        this.id,
        this.modifierExtension,
        newValue,
        this.dispenseInterval,
        this.validityPeriod,
        this.numberOfRepeatsAllowed,
        this.extension,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        this.performer,
        this.id,
        this.modifierExtension,
        value,
        this.dispenseInterval,
        this.validityPeriod,
        this.numberOfRepeatsAllowed,
        this.extension,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#dispenseInterval() dispenseInterval} attribute.
   * @param value The value for dispenseInterval
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withDispenseInterval(com.fhir.Duration value) {
    @javax.annotation.Nullable com.fhir.Duration newValue = java.util.Objects.requireNonNull(value, "dispenseInterval");
    if (this.dispenseInterval == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        this.performer,
        this.id,
        this.modifierExtension,
        this.quantity,
        newValue,
        this.validityPeriod,
        this.numberOfRepeatsAllowed,
        this.extension,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#dispenseInterval() dispenseInterval} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dispenseInterval
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withDispenseInterval(java.util.Optional<? extends com.fhir.Duration> optional) {
    @javax.annotation.Nullable com.fhir.Duration value = optional.orElse(null);
    if (this.dispenseInterval == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        this.performer,
        this.id,
        this.modifierExtension,
        this.quantity,
        value,
        this.validityPeriod,
        this.numberOfRepeatsAllowed,
        this.extension,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#validityPeriod() validityPeriod} attribute.
   * @param value The value for validityPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withValidityPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "validityPeriod");
    if (this.validityPeriod == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        this.performer,
        this.id,
        this.modifierExtension,
        this.quantity,
        this.dispenseInterval,
        newValue,
        this.numberOfRepeatsAllowed,
        this.extension,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#validityPeriod() validityPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validityPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withValidityPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.validityPeriod == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        this.performer,
        this.id,
        this.modifierExtension,
        this.quantity,
        this.dispenseInterval,
        value,
        this.numberOfRepeatsAllowed,
        this.extension,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#numberOfRepeatsAllowed() numberOfRepeatsAllowed} attribute.
   * @param value The value for numberOfRepeatsAllowed
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withNumberOfRepeatsAllowed(com.fhir.unsignedInt value) {
    @javax.annotation.Nullable com.fhir.unsignedInt newValue = java.util.Objects.requireNonNull(value, "numberOfRepeatsAllowed");
    if (this.numberOfRepeatsAllowed == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        this.performer,
        this.id,
        this.modifierExtension,
        this.quantity,
        this.dispenseInterval,
        this.validityPeriod,
        newValue,
        this.extension,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#numberOfRepeatsAllowed() numberOfRepeatsAllowed} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numberOfRepeatsAllowed
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withNumberOfRepeatsAllowed(java.util.Optional<? extends com.fhir.unsignedInt> optional) {
    @javax.annotation.Nullable com.fhir.unsignedInt value = optional.orElse(null);
    if (this.numberOfRepeatsAllowed == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        this.performer,
        this.id,
        this.modifierExtension,
        this.quantity,
        this.dispenseInterval,
        this.validityPeriod,
        value,
        this.extension,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        this.performer,
        this.id,
        this.modifierExtension,
        this.quantity,
        this.dispenseInterval,
        this.validityPeriod,
        this.numberOfRepeatsAllowed,
        newValue,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        this.performer,
        this.id,
        this.modifierExtension,
        this.quantity,
        this.dispenseInterval,
        this.validityPeriod,
        this.numberOfRepeatsAllowed,
        value,
        this.expectedSupplyDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#expectedSupplyDuration() expectedSupplyDuration} attribute.
   * @param value The value for expectedSupplyDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withExpectedSupplyDuration(com.fhir.Duration value) {
    @javax.annotation.Nullable com.fhir.Duration newValue = java.util.Objects.requireNonNull(value, "expectedSupplyDuration");
    if (this.expectedSupplyDuration == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        this.performer,
        this.id,
        this.modifierExtension,
        this.quantity,
        this.dispenseInterval,
        this.validityPeriod,
        this.numberOfRepeatsAllowed,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#expectedSupplyDuration() expectedSupplyDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expectedSupplyDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withExpectedSupplyDuration(java.util.Optional<? extends com.fhir.Duration> optional) {
    @javax.annotation.Nullable com.fhir.Duration value = optional.orElse(null);
    if (this.expectedSupplyDuration == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.initialFill,
        this.performer,
        this.id,
        this.modifierExtension,
        this.quantity,
        this.dispenseInterval,
        this.validityPeriod,
        this.numberOfRepeatsAllowed,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationRequest_DispenseRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationRequest_DispenseRequest
        && equalTo((ImmutableMedicationRequest_DispenseRequest) another);
  }

  private boolean equalTo(ImmutableMedicationRequest_DispenseRequest another) {
    return java.util.Objects.equals(initialFill, another.initialFill)
        && java.util.Objects.equals(performer, another.performer)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(quantity, another.quantity)
        && java.util.Objects.equals(dispenseInterval, another.dispenseInterval)
        && java.util.Objects.equals(validityPeriod, another.validityPeriod)
        && java.util.Objects.equals(numberOfRepeatsAllowed, another.numberOfRepeatsAllowed)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(expectedSupplyDuration, another.expectedSupplyDuration);
  }

  /**
   * Computes a hash code from attributes: {@code initialFill}, {@code performer}, {@code id}, {@code modifierExtension}, {@code quantity}, {@code dispenseInterval}, {@code validityPeriod}, {@code numberOfRepeatsAllowed}, {@code extension}, {@code expectedSupplyDuration}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(initialFill);
    h += (h << 5) + java.util.Objects.hashCode(performer);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(quantity);
    h += (h << 5) + java.util.Objects.hashCode(dispenseInterval);
    h += (h << 5) + java.util.Objects.hashCode(validityPeriod);
    h += (h << 5) + java.util.Objects.hashCode(numberOfRepeatsAllowed);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(expectedSupplyDuration);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationRequest_DispenseRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicationRequest_DispenseRequest{");
    if (initialFill != null) {
      builder.append("initialFill=").append(initialFill);
    }
    if (performer != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (id != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (quantity != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (dispenseInterval != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("dispenseInterval=").append(dispenseInterval);
    }
    if (validityPeriod != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("validityPeriod=").append(validityPeriod);
    }
    if (numberOfRepeatsAllowed != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("numberOfRepeatsAllowed=").append(numberOfRepeatsAllowed);
    }
    if (extension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (expectedSupplyDuration != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("expectedSupplyDuration=").append(expectedSupplyDuration);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MedicationRequest_DispenseRequest", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicationRequest_DispenseRequest {
    @javax.annotation.Nullable java.util.Optional<com.fhir.MedicationRequest_InitialFill> initialFill = java.util.Optional.empty();
    boolean initialFillIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> quantity = java.util.Optional.empty();
    boolean quantityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Duration> dispenseInterval = java.util.Optional.empty();
    boolean dispenseIntervalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> validityPeriod = java.util.Optional.empty();
    boolean validityPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.unsignedInt> numberOfRepeatsAllowed = java.util.Optional.empty();
    boolean numberOfRepeatsAllowedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Duration> expectedSupplyDuration = java.util.Optional.empty();
    boolean expectedSupplyDurationIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("initialFill")
    public void setInitialFill(java.util.Optional<com.fhir.MedicationRequest_InitialFill> initialFill) {
      this.initialFill = initialFill;
      this.initialFillIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<com.fhir.Reference> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public void setQuantity(java.util.Optional<com.fhir.Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dispenseInterval")
    public void setDispenseInterval(java.util.Optional<com.fhir.Duration> dispenseInterval) {
      this.dispenseInterval = dispenseInterval;
      this.dispenseIntervalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("validityPeriod")
    public void setValidityPeriod(java.util.Optional<com.fhir.Period> validityPeriod) {
      this.validityPeriod = validityPeriod;
      this.validityPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfRepeatsAllowed")
    public void setNumberOfRepeatsAllowed(java.util.Optional<com.fhir.unsignedInt> numberOfRepeatsAllowed) {
      this.numberOfRepeatsAllowed = numberOfRepeatsAllowed;
      this.numberOfRepeatsAllowedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("expectedSupplyDuration")
    public void setExpectedSupplyDuration(java.util.Optional<com.fhir.Duration> expectedSupplyDuration) {
      this.expectedSupplyDuration = expectedSupplyDuration;
      this.expectedSupplyDurationIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.MedicationRequest_InitialFill> initialFill() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> performer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Duration> dispenseInterval() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> validityPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.unsignedInt> numberOfRepeatsAllowed() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Duration> expectedSupplyDuration() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationRequest_DispenseRequest fromJson(Json json) {
    ImmutableMedicationRequest_DispenseRequest.Builder builder = ImmutableMedicationRequest_DispenseRequest.builder();
    if (json.initialFillIsSet) {
      builder.initialFill(json.initialFill);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.dispenseIntervalIsSet) {
      builder.dispenseInterval(json.dispenseInterval);
    }
    if (json.validityPeriodIsSet) {
      builder.validityPeriod(json.validityPeriod);
    }
    if (json.numberOfRepeatsAllowedIsSet) {
      builder.numberOfRepeatsAllowed(json.numberOfRepeatsAllowed);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.expectedSupplyDurationIsSet) {
      builder.expectedSupplyDuration(json.expectedSupplyDuration);
    }
    return (ImmutableMedicationRequest_DispenseRequest) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationRequest_DispenseRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationRequest_DispenseRequest instance
   */
  public static MedicationRequest_DispenseRequest copyOf(MedicationRequest_DispenseRequest instance) {
    if (instance instanceof ImmutableMedicationRequest_DispenseRequest) {
      return (ImmutableMedicationRequest_DispenseRequest) instance;
    }
    return ImmutableMedicationRequest_DispenseRequest.builder()
        .initialFill(instance.initialFill())
        .performer(instance.performer())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .quantity(instance.quantity())
        .dispenseInterval(instance.dispenseInterval())
        .validityPeriod(instance.validityPeriod())
        .numberOfRepeatsAllowed(instance.numberOfRepeatsAllowed())
        .extension(instance.extension())
        .expectedSupplyDuration(instance.expectedSupplyDuration())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationRequest_DispenseRequest MedicationRequest_DispenseRequest}.
   * <pre>
   * ImmutableMedicationRequest_DispenseRequest.builder()
   *    .initialFill(com.fhir.MedicationRequest_InitialFill) // optional {@link MedicationRequest_DispenseRequest#initialFill() initialFill}
   *    .performer(com.fhir.Reference) // optional {@link MedicationRequest_DispenseRequest#performer() performer}
   *    .id(String) // optional {@link MedicationRequest_DispenseRequest#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationRequest_DispenseRequest#modifierExtension() modifierExtension}
   *    .quantity(com.fhir.Quantity) // optional {@link MedicationRequest_DispenseRequest#quantity() quantity}
   *    .dispenseInterval(com.fhir.Duration) // optional {@link MedicationRequest_DispenseRequest#dispenseInterval() dispenseInterval}
   *    .validityPeriod(com.fhir.Period) // optional {@link MedicationRequest_DispenseRequest#validityPeriod() validityPeriod}
   *    .numberOfRepeatsAllowed(com.fhir.unsignedInt) // optional {@link MedicationRequest_DispenseRequest#numberOfRepeatsAllowed() numberOfRepeatsAllowed}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationRequest_DispenseRequest#extension() extension}
   *    .expectedSupplyDuration(com.fhir.Duration) // optional {@link MedicationRequest_DispenseRequest#expectedSupplyDuration() expectedSupplyDuration}
   *    .build();
   * </pre>
   * @return A new MedicationRequest_DispenseRequest builder
   */
  public static ImmutableMedicationRequest_DispenseRequest.Builder builder() {
    return new ImmutableMedicationRequest_DispenseRequest.Builder();
  }

  /**
   * Builds instances of type {@link MedicationRequest_DispenseRequest MedicationRequest_DispenseRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MedicationRequest_DispenseRequest", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_INITIAL_FILL = 0x1L;
    private static final long OPT_BIT_PERFORMER = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_QUANTITY = 0x10L;
    private static final long OPT_BIT_DISPENSE_INTERVAL = 0x20L;
    private static final long OPT_BIT_VALIDITY_PERIOD = 0x40L;
    private static final long OPT_BIT_NUMBER_OF_REPEATS_ALLOWED = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private static final long OPT_BIT_EXPECTED_SUPPLY_DURATION = 0x200L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.MedicationRequest_InitialFill initialFill;
    private @javax.annotation.Nullable com.fhir.Reference performer;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Quantity quantity;
    private @javax.annotation.Nullable com.fhir.Duration dispenseInterval;
    private @javax.annotation.Nullable com.fhir.Period validityPeriod;
    private @javax.annotation.Nullable com.fhir.unsignedInt numberOfRepeatsAllowed;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Duration expectedSupplyDuration;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#initialFill() initialFill} to initialFill.
     * @param initialFill The value for initialFill
     * @return {@code this} builder for chained invocation
     */
    public final Builder initialFill(com.fhir.MedicationRequest_InitialFill initialFill) {
      checkNotIsSet(initialFillIsSet(), "initialFill");
      this.initialFill = java.util.Objects.requireNonNull(initialFill, "initialFill");
      optBits |= OPT_BIT_INITIAL_FILL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#initialFill() initialFill} to initialFill.
     * @param initialFill The value for initialFill
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialFill")
    public final Builder initialFill(java.util.Optional<? extends com.fhir.MedicationRequest_InitialFill> initialFill) {
      checkNotIsSet(initialFillIsSet(), "initialFill");
      this.initialFill = initialFill.orElse(null);
      optBits |= OPT_BIT_INITIAL_FILL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(com.fhir.Reference performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = java.util.Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public final Builder performer(java.util.Optional<? extends com.fhir.Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#id() id} to id.
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
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#id() id} to id.
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
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#dispenseInterval() dispenseInterval} to dispenseInterval.
     * @param dispenseInterval The value for dispenseInterval
     * @return {@code this} builder for chained invocation
     */
    public final Builder dispenseInterval(com.fhir.Duration dispenseInterval) {
      checkNotIsSet(dispenseIntervalIsSet(), "dispenseInterval");
      this.dispenseInterval = java.util.Objects.requireNonNull(dispenseInterval, "dispenseInterval");
      optBits |= OPT_BIT_DISPENSE_INTERVAL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#dispenseInterval() dispenseInterval} to dispenseInterval.
     * @param dispenseInterval The value for dispenseInterval
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dispenseInterval")
    public final Builder dispenseInterval(java.util.Optional<? extends com.fhir.Duration> dispenseInterval) {
      checkNotIsSet(dispenseIntervalIsSet(), "dispenseInterval");
      this.dispenseInterval = dispenseInterval.orElse(null);
      optBits |= OPT_BIT_DISPENSE_INTERVAL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder validityPeriod(com.fhir.Period validityPeriod) {
      checkNotIsSet(validityPeriodIsSet(), "validityPeriod");
      this.validityPeriod = java.util.Objects.requireNonNull(validityPeriod, "validityPeriod");
      optBits |= OPT_BIT_VALIDITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validityPeriod")
    public final Builder validityPeriod(java.util.Optional<? extends com.fhir.Period> validityPeriod) {
      checkNotIsSet(validityPeriodIsSet(), "validityPeriod");
      this.validityPeriod = validityPeriod.orElse(null);
      optBits |= OPT_BIT_VALIDITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#numberOfRepeatsAllowed() numberOfRepeatsAllowed} to numberOfRepeatsAllowed.
     * @param numberOfRepeatsAllowed The value for numberOfRepeatsAllowed
     * @return {@code this} builder for chained invocation
     */
    public final Builder numberOfRepeatsAllowed(com.fhir.unsignedInt numberOfRepeatsAllowed) {
      checkNotIsSet(numberOfRepeatsAllowedIsSet(), "numberOfRepeatsAllowed");
      this.numberOfRepeatsAllowed = java.util.Objects.requireNonNull(numberOfRepeatsAllowed, "numberOfRepeatsAllowed");
      optBits |= OPT_BIT_NUMBER_OF_REPEATS_ALLOWED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#numberOfRepeatsAllowed() numberOfRepeatsAllowed} to numberOfRepeatsAllowed.
     * @param numberOfRepeatsAllowed The value for numberOfRepeatsAllowed
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfRepeatsAllowed")
    public final Builder numberOfRepeatsAllowed(java.util.Optional<? extends com.fhir.unsignedInt> numberOfRepeatsAllowed) {
      checkNotIsSet(numberOfRepeatsAllowedIsSet(), "numberOfRepeatsAllowed");
      this.numberOfRepeatsAllowed = numberOfRepeatsAllowed.orElse(null);
      optBits |= OPT_BIT_NUMBER_OF_REPEATS_ALLOWED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#expectedSupplyDuration() expectedSupplyDuration} to expectedSupplyDuration.
     * @param expectedSupplyDuration The value for expectedSupplyDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder expectedSupplyDuration(com.fhir.Duration expectedSupplyDuration) {
      checkNotIsSet(expectedSupplyDurationIsSet(), "expectedSupplyDuration");
      this.expectedSupplyDuration = java.util.Objects.requireNonNull(expectedSupplyDuration, "expectedSupplyDuration");
      optBits |= OPT_BIT_EXPECTED_SUPPLY_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#expectedSupplyDuration() expectedSupplyDuration} to expectedSupplyDuration.
     * @param expectedSupplyDuration The value for expectedSupplyDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expectedSupplyDuration")
    public final Builder expectedSupplyDuration(java.util.Optional<? extends com.fhir.Duration> expectedSupplyDuration) {
      checkNotIsSet(expectedSupplyDurationIsSet(), "expectedSupplyDuration");
      this.expectedSupplyDuration = expectedSupplyDuration.orElse(null);
      optBits |= OPT_BIT_EXPECTED_SUPPLY_DURATION;
      return this;
    }

    /**
     * Builds a new {@link MedicationRequest_DispenseRequest MedicationRequest_DispenseRequest}.
     * @return An immutable instance of MedicationRequest_DispenseRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicationRequest_DispenseRequest build() {
      return new ImmutableMedicationRequest_DispenseRequest(
          initialFill,
          performer,
          id,
          modifierExtension,
          quantity,
          dispenseInterval,
          validityPeriod,
          numberOfRepeatsAllowed,
          extension,
          expectedSupplyDuration);
    }

    private boolean initialFillIsSet() {
      return (optBits & OPT_BIT_INITIAL_FILL) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean dispenseIntervalIsSet() {
      return (optBits & OPT_BIT_DISPENSE_INTERVAL) != 0;
    }

    private boolean validityPeriodIsSet() {
      return (optBits & OPT_BIT_VALIDITY_PERIOD) != 0;
    }

    private boolean numberOfRepeatsAllowedIsSet() {
      return (optBits & OPT_BIT_NUMBER_OF_REPEATS_ALLOWED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean expectedSupplyDurationIsSet() {
      return (optBits & OPT_BIT_EXPECTED_SUPPLY_DURATION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicationRequest_DispenseRequest is strict, attribute is already set: ".concat(name));
    }
  }
}
