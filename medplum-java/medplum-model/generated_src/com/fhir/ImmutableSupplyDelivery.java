//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link SupplyDelivery}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSupplyDelivery.builder()}.
 */
@org.immutables.value.Generated(from = "SupplyDelivery", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSupplyDelivery implements com.fhir.SupplyDelivery {
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.SupplydeliveryStatus status;
  private final @javax.annotation.Nullable com.fhir.Reference patient;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Timing occurrenceTiming;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Reference supplier;
  private final @javax.annotation.Nullable com.fhir.Reference destination;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> receiver;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable com.fhir.Period occurrencePeriod;
  private final @javax.annotation.Nullable java.lang.String occurrenceDateTime;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.SupplyDelivery_SuppliedItem suppliedItem;

  private ImmutableSupplyDelivery(
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.SupplydeliveryStatus status,
      @javax.annotation.Nullable com.fhir.Reference patient,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Timing occurrenceTiming,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Reference supplier,
      @javax.annotation.Nullable com.fhir.Reference destination,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> receiver,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable com.fhir.Period occurrencePeriod,
      @javax.annotation.Nullable java.lang.String occurrenceDateTime,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.SupplyDelivery_SuppliedItem suppliedItem) {
    this.implicitRules = implicitRules;
    this.extension = extension;
    this.status = status;
    this.patient = patient;
    this.identifier = identifier;
    this.contained = contained;
    this.id = id;
    this.occurrenceTiming = occurrenceTiming;
    this.text = text;
    this.supplier = supplier;
    this.destination = destination;
    this.modifierExtension = modifierExtension;
    this.type = type;
    this.receiver = receiver;
    this.resourceType = resourceType;
    this.partOf = partOf;
    this.basedOn = basedOn;
    this.occurrencePeriod = occurrencePeriod;
    this.occurrenceDateTime = occurrenceDateTime;
    this.language = language;
    this.meta = meta;
    this.suppliedItem = suppliedItem;
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.SupplydeliveryStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patient")
  @Override
  public java.util.Optional<com.fhir.Reference> patient() {
    return java.util.Optional.ofNullable(patient);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * @return The value of the {@code occurrenceTiming} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurrenceTiming")
  @Override
  public java.util.Optional<com.fhir.Timing> occurrenceTiming() {
    return java.util.Optional.ofNullable(occurrenceTiming);
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
   * @return The value of the {@code supplier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supplier")
  @Override
  public java.util.Optional<com.fhir.Reference> supplier() {
    return java.util.Optional.ofNullable(supplier);
  }

  /**
   * @return The value of the {@code destination} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("destination")
  @Override
  public java.util.Optional<com.fhir.Reference> destination() {
    return java.util.Optional.ofNullable(destination);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code receiver} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("receiver")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> receiver() {
    return java.util.Optional.ofNullable(receiver);
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
   * @return The value of the {@code partOf} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("partOf")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() {
    return java.util.Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code basedOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() {
    return java.util.Optional.ofNullable(basedOn);
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
   * @return The value of the {@code occurrenceDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
  @Override
  public java.util.Optional<java.lang.String> occurrenceDateTime() {
    return java.util.Optional.ofNullable(occurrenceDateTime);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code suppliedItem} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("suppliedItem")
  @Override
  public java.util.Optional<com.fhir.SupplyDelivery_SuppliedItem> suppliedItem() {
    return java.util.Optional.ofNullable(suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSupplyDelivery(
        newValue,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSupplyDelivery(
        value,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        newValue,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        value,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withStatus(com.fhir.SupplydeliveryStatus value) {
    @javax.annotation.Nullable com.fhir.SupplydeliveryStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        newValue,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withStatus(java.util.Optional<? extends com.fhir.SupplydeliveryStatus> optional) {
    @javax.annotation.Nullable com.fhir.SupplydeliveryStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        value,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#patient() patient} attribute.
   * @param value The value for patient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withPatient(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    if (this.patient == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        newValue,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#patient() patient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withPatient(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.patient == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        value,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        newValue,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        value,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        newValue,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        value,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        newValue,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        value,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#occurrenceTiming() occurrenceTiming} attribute.
   * @param value The value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withOccurrenceTiming(com.fhir.Timing value) {
    @javax.annotation.Nullable com.fhir.Timing newValue = java.util.Objects.requireNonNull(value, "occurrenceTiming");
    if (this.occurrenceTiming == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        newValue,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#occurrenceTiming() occurrenceTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withOccurrenceTiming(java.util.Optional<? extends com.fhir.Timing> optional) {
    @javax.annotation.Nullable com.fhir.Timing value = optional.orElse(null);
    if (this.occurrenceTiming == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        value,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        newValue,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        value,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#supplier() supplier} attribute.
   * @param value The value for supplier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withSupplier(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "supplier");
    if (this.supplier == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        newValue,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#supplier() supplier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supplier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withSupplier(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.supplier == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        value,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#destination() destination} attribute.
   * @param value The value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withDestination(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "destination");
    if (this.destination == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        newValue,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#destination() destination} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for destination
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withDestination(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.destination == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        value,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        newValue,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        value,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        newValue,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        value,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#receiver() receiver} attribute.
   * @param value The value for receiver
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withReceiver(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "receiver");
    if (this.receiver == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        newValue,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#receiver() receiver} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for receiver
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withReceiver(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.receiver == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        value,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SupplyDelivery#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSupplyDelivery withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        newValue,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withPartOf(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        newValue,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withPartOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        value,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        newValue,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        value,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#occurrencePeriod() occurrencePeriod} attribute.
   * @param value The value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withOccurrencePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "occurrencePeriod");
    if (this.occurrencePeriod == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        newValue,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#occurrencePeriod() occurrencePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withOccurrencePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.occurrencePeriod == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        value,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withOccurrenceDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "occurrenceDateTime");
    if (java.util.Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        newValue,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withOccurrenceDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        value,
        this.language,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        newValue,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        value,
        this.meta,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        newValue,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        value,
        this.suppliedItem);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#suppliedItem() suppliedItem} attribute.
   * @param value The value for suppliedItem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withSuppliedItem(com.fhir.SupplyDelivery_SuppliedItem value) {
    @javax.annotation.Nullable com.fhir.SupplyDelivery_SuppliedItem newValue = java.util.Objects.requireNonNull(value, "suppliedItem");
    if (this.suppliedItem == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#suppliedItem() suppliedItem} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for suppliedItem
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withSuppliedItem(java.util.Optional<? extends com.fhir.SupplyDelivery_SuppliedItem> optional) {
    @javax.annotation.Nullable com.fhir.SupplyDelivery_SuppliedItem value = optional.orElse(null);
    if (this.suppliedItem == value) return this;
    return new ImmutableSupplyDelivery(
        this.implicitRules,
        this.extension,
        this.status,
        this.patient,
        this.identifier,
        this.contained,
        this.id,
        this.occurrenceTiming,
        this.text,
        this.supplier,
        this.destination,
        this.modifierExtension,
        this.type,
        this.receiver,
        this.resourceType,
        this.partOf,
        this.basedOn,
        this.occurrencePeriod,
        this.occurrenceDateTime,
        this.language,
        this.meta,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSupplyDelivery} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSupplyDelivery
        && equalTo((ImmutableSupplyDelivery) another);
  }

  private boolean equalTo(ImmutableSupplyDelivery another) {
    return java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(patient, another.patient)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(occurrenceTiming, another.occurrenceTiming)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(supplier, another.supplier)
        && java.util.Objects.equals(destination, another.destination)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(receiver, another.receiver)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(occurrencePeriod, another.occurrencePeriod)
        && java.util.Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(suppliedItem, another.suppliedItem);
  }

  /**
   * Computes a hash code from attributes: {@code implicitRules}, {@code extension}, {@code status}, {@code patient}, {@code identifier}, {@code contained}, {@code id}, {@code occurrenceTiming}, {@code text}, {@code supplier}, {@code destination}, {@code modifierExtension}, {@code type}, {@code receiver}, {@code resourceType}, {@code partOf}, {@code basedOn}, {@code occurrencePeriod}, {@code occurrenceDateTime}, {@code language}, {@code meta}, {@code suppliedItem}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(patient);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(occurrenceTiming);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(supplier);
    h += (h << 5) + java.util.Objects.hashCode(destination);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(receiver);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(occurrencePeriod);
    h += (h << 5) + java.util.Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(suppliedItem);
    return h;
  }

  /**
   * Prints the immutable value {@code SupplyDelivery} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("SupplyDelivery{");
    if (implicitRules != null) {
      builder.append("implicitRules=").append(implicitRules);
    }
    if (extension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (status != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (patient != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("patient=").append(patient);
    }
    if (identifier != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (contained != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (id != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (occurrenceTiming != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("occurrenceTiming=").append(occurrenceTiming);
    }
    if (text != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (supplier != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("supplier=").append(supplier);
    }
    if (destination != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("destination=").append(destination);
    }
    if (modifierExtension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (type != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (receiver != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("receiver=").append(receiver);
    }
    if (builder.length() > 15) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (occurrencePeriod != null) {
      builder.append(", ");
      builder.append("occurrencePeriod=").append(occurrencePeriod);
    }
    if (occurrenceDateTime != null) {
      builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (suppliedItem != null) {
      builder.append(", ");
      builder.append("suppliedItem=").append(suppliedItem);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "SupplyDelivery", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.SupplyDelivery {
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.SupplydeliveryStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> patient = java.util.Optional.empty();
    boolean patientIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing> occurrenceTiming = java.util.Optional.empty();
    boolean occurrenceTimingIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> supplier = java.util.Optional.empty();
    boolean supplierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> destination = java.util.Optional.empty();
    boolean destinationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> receiver = java.util.Optional.empty();
    boolean receiverIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> occurrencePeriod = java.util.Optional.empty();
    boolean occurrencePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> occurrenceDateTime = java.util.Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.SupplyDelivery_SuppliedItem> suppliedItem = java.util.Optional.empty();
    boolean suppliedItemIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.SupplydeliveryStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(java.util.Optional<com.fhir.Reference> patient) {
      this.patient = patient;
      this.patientIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceTiming")
    public void setOccurrenceTiming(java.util.Optional<com.fhir.Timing> occurrenceTiming) {
      this.occurrenceTiming = occurrenceTiming;
      this.occurrenceTimingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supplier")
    public void setSupplier(java.util.Optional<com.fhir.Reference> supplier) {
      this.supplier = supplier;
      this.supplierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    public void setDestination(java.util.Optional<com.fhir.Reference> destination) {
      this.destination = destination;
      this.destinationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("receiver")
    public void setReceiver(java.util.Optional<java.util.List<com.fhir.Reference>> receiver) {
      this.receiver = receiver;
      this.receiverIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<java.util.List<com.fhir.Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(java.util.Optional<com.fhir.Period> occurrencePeriod) {
      this.occurrencePeriod = occurrencePeriod;
      this.occurrencePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("suppliedItem")
    public void setSuppliedItem(java.util.Optional<com.fhir.SupplyDelivery_SuppliedItem> suppliedItem) {
      this.suppliedItem = suppliedItem;
      this.suppliedItemIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.SupplydeliveryStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> patient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Timing> occurrenceTiming() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> supplier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> destination() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> receiver() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> occurrencePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.SupplyDelivery_SuppliedItem> suppliedItem() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSupplyDelivery fromJson(Json json) {
    ImmutableSupplyDelivery.Builder builder = ((ImmutableSupplyDelivery.Builder) ImmutableSupplyDelivery.builder());
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.patientIsSet) {
      builder.patient(json.patient);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.occurrenceTimingIsSet) {
      builder.occurrenceTiming(json.occurrenceTiming);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.supplierIsSet) {
      builder.supplier(json.supplier);
    }
    if (json.destinationIsSet) {
      builder.destination(json.destination);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.receiverIsSet) {
      builder.receiver(json.receiver);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.occurrencePeriodIsSet) {
      builder.occurrencePeriod(json.occurrencePeriod);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.suppliedItemIsSet) {
      builder.suppliedItem(json.suppliedItem);
    }
    return (ImmutableSupplyDelivery) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SupplyDelivery} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SupplyDelivery instance
   */
  public static SupplyDelivery copyOf(SupplyDelivery instance) {
    if (instance instanceof ImmutableSupplyDelivery) {
      return (ImmutableSupplyDelivery) instance;
    }
    return ((ImmutableSupplyDelivery.Builder) ImmutableSupplyDelivery.builder())
        .implicitRules(instance.implicitRules())
        .extension(instance.extension())
        .status(instance.status())
        .patient(instance.patient())
        .identifier(instance.identifier())
        .contained(instance.contained())
        .id(instance.id())
        .occurrenceTiming(instance.occurrenceTiming())
        .text(instance.text())
        .supplier(instance.supplier())
        .destination(instance.destination())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .receiver(instance.receiver())
        .resourceType(instance.resourceType())
        .partOf(instance.partOf())
        .basedOn(instance.basedOn())
        .occurrencePeriod(instance.occurrencePeriod())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .language(instance.language())
        .meta(instance.meta())
        .suppliedItem(instance.suppliedItem())
        .build();
  }

  /**
   * Creates a builder for {@link SupplyDelivery SupplyDelivery}.
   * <pre>
   * ImmutableSupplyDelivery.builder()
   *    .implicitRules(com.fhir.uri) // optional {@link SupplyDelivery#implicitRules() implicitRules}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SupplyDelivery#extension() extension}
   *    .status(com.fhir.SupplydeliveryStatus) // optional {@link SupplyDelivery#status() status}
   *    .patient(com.fhir.Reference) // optional {@link SupplyDelivery#patient() patient}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link SupplyDelivery#identifier() identifier}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link SupplyDelivery#contained() contained}
   *    .id(com.fhir.id) // optional {@link SupplyDelivery#id() id}
   *    .occurrenceTiming(com.fhir.Timing) // optional {@link SupplyDelivery#occurrenceTiming() occurrenceTiming}
   *    .text(com.fhir.Narrative) // optional {@link SupplyDelivery#text() text}
   *    .supplier(com.fhir.Reference) // optional {@link SupplyDelivery#supplier() supplier}
   *    .destination(com.fhir.Reference) // optional {@link SupplyDelivery#destination() destination}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SupplyDelivery#modifierExtension() modifierExtension}
   *    .type(com.fhir.CodeableConcept) // optional {@link SupplyDelivery#type() type}
   *    .receiver(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link SupplyDelivery#receiver() receiver}
   *    .resourceType(String) // required {@link SupplyDelivery#resourceType() resourceType}
   *    .partOf(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link SupplyDelivery#partOf() partOf}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link SupplyDelivery#basedOn() basedOn}
   *    .occurrencePeriod(com.fhir.Period) // optional {@link SupplyDelivery#occurrencePeriod() occurrencePeriod}
   *    .occurrenceDateTime(String) // optional {@link SupplyDelivery#occurrenceDateTime() occurrenceDateTime}
   *    .language(com.fhir.code) // optional {@link SupplyDelivery#language() language}
   *    .meta(com.fhir.Meta) // optional {@link SupplyDelivery#meta() meta}
   *    .suppliedItem(com.fhir.SupplyDelivery_SuppliedItem) // optional {@link SupplyDelivery#suppliedItem() suppliedItem}
   *    .build();
   * </pre>
   * @return A new SupplyDelivery builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableSupplyDelivery.Builder();
  }

  /**
   * Builds instances of type {@link SupplyDelivery SupplyDelivery}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "SupplyDelivery", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_STATUS = 0x4L;
    private static final long OPT_BIT_PATIENT = 0x8L;
    private static final long OPT_BIT_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_OCCURRENCE_TIMING = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_SUPPLIER = 0x200L;
    private static final long OPT_BIT_DESTINATION = 0x400L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800L;
    private static final long OPT_BIT_TYPE = 0x1000L;
    private static final long OPT_BIT_RECEIVER = 0x2000L;
    private static final long OPT_BIT_PART_OF = 0x4000L;
    private static final long OPT_BIT_BASED_ON = 0x8000L;
    private static final long OPT_BIT_OCCURRENCE_PERIOD = 0x10000L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x20000L;
    private static final long OPT_BIT_LANGUAGE = 0x40000L;
    private static final long OPT_BIT_META = 0x80000L;
    private static final long OPT_BIT_SUPPLIED_ITEM = 0x100000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.SupplydeliveryStatus status;
    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Timing occurrenceTiming;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Reference supplier;
    private @javax.annotation.Nullable com.fhir.Reference destination;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> receiver;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable com.fhir.Period occurrencePeriod;
    private @javax.annotation.Nullable java.lang.String occurrenceDateTime;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.SupplyDelivery_SuppliedItem suppliedItem;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SupplyDelivery#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SupplyDelivery#extension() extension} to extension.
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
     * Initializes the optional value {@link SupplyDelivery#extension() extension} to extension.
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
     * Initializes the optional value {@link SupplyDelivery#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.SupplydeliveryStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.SupplydeliveryStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    public final Builder patient(com.fhir.Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = java.util.Objects.requireNonNull(patient, "patient");
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public final Builder patient(java.util.Optional<? extends com.fhir.Reference> patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = patient.orElse(null);
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link SupplyDelivery#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link SupplyDelivery#contained() contained} to contained.
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
     * Initializes the optional value {@link SupplyDelivery#contained() contained} to contained.
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
     * Initializes the optional value {@link SupplyDelivery#id() id} to id.
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
     * Initializes the optional value {@link SupplyDelivery#id() id} to id.
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
     * Initializes the optional value {@link SupplyDelivery#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
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
     * Initializes the optional value {@link SupplyDelivery#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
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
     * Initializes the optional value {@link SupplyDelivery#text() text} to text.
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
     * Initializes the optional value {@link SupplyDelivery#text() text} to text.
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
     * Initializes the optional value {@link SupplyDelivery#supplier() supplier} to supplier.
     * @param supplier The value for supplier
     * @return {@code this} builder for chained invocation
     */
    public final Builder supplier(com.fhir.Reference supplier) {
      checkNotIsSet(supplierIsSet(), "supplier");
      this.supplier = java.util.Objects.requireNonNull(supplier, "supplier");
      optBits |= OPT_BIT_SUPPLIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#supplier() supplier} to supplier.
     * @param supplier The value for supplier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supplier")
    public final Builder supplier(java.util.Optional<? extends com.fhir.Reference> supplier) {
      checkNotIsSet(supplierIsSet(), "supplier");
      this.supplier = supplier.orElse(null);
      optBits |= OPT_BIT_SUPPLIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    public final Builder destination(com.fhir.Reference destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = java.util.Objects.requireNonNull(destination, "destination");
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    public final Builder destination(java.util.Optional<? extends com.fhir.Reference> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = destination.orElse(null);
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SupplyDelivery#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SupplyDelivery#type() type} to type.
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
     * Initializes the optional value {@link SupplyDelivery#type() type} to type.
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
     * Initializes the optional value {@link SupplyDelivery#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for chained invocation
     */
    public final Builder receiver(java.util.List<com.fhir.Reference> receiver) {
      checkNotIsSet(receiverIsSet(), "receiver");
      this.receiver = java.util.Objects.requireNonNull(receiver, "receiver");
      optBits |= OPT_BIT_RECEIVER;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("receiver")
    public final Builder receiver(java.util.Optional<? extends java.util.List<com.fhir.Reference>> receiver) {
      checkNotIsSet(receiverIsSet(), "receiver");
      this.receiver = receiver.orElse(null);
      optBits |= OPT_BIT_RECEIVER;
      return this;
    }

    /**
     * Initializes the value for the {@link SupplyDelivery#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link SupplyDelivery#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link SupplyDelivery#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link SupplyDelivery#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(java.util.List<com.fhir.Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = java.util.Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public final Builder basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
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
     * Initializes the optional value {@link SupplyDelivery#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
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
     * Initializes the optional value {@link SupplyDelivery#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link SupplyDelivery#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link SupplyDelivery#language() language} to language.
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
     * Initializes the optional value {@link SupplyDelivery#language() language} to language.
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
     * Initializes the optional value {@link SupplyDelivery#meta() meta} to meta.
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
     * Initializes the optional value {@link SupplyDelivery#meta() meta} to meta.
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
     * Initializes the optional value {@link SupplyDelivery#suppliedItem() suppliedItem} to suppliedItem.
     * @param suppliedItem The value for suppliedItem
     * @return {@code this} builder for chained invocation
     */
    public final Builder suppliedItem(com.fhir.SupplyDelivery_SuppliedItem suppliedItem) {
      checkNotIsSet(suppliedItemIsSet(), "suppliedItem");
      this.suppliedItem = java.util.Objects.requireNonNull(suppliedItem, "suppliedItem");
      optBits |= OPT_BIT_SUPPLIED_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#suppliedItem() suppliedItem} to suppliedItem.
     * @param suppliedItem The value for suppliedItem
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("suppliedItem")
    public final Builder suppliedItem(java.util.Optional<? extends com.fhir.SupplyDelivery_SuppliedItem> suppliedItem) {
      checkNotIsSet(suppliedItemIsSet(), "suppliedItem");
      this.suppliedItem = suppliedItem.orElse(null);
      optBits |= OPT_BIT_SUPPLIED_ITEM;
      return this;
    }

    /**
     * Builds a new {@link SupplyDelivery SupplyDelivery}.
     * @return An immutable instance of SupplyDelivery
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.SupplyDelivery build() {
      checkRequiredAttributes();
      return new ImmutableSupplyDelivery(
          implicitRules,
          extension,
          status,
          patient,
          identifier,
          contained,
          id,
          occurrenceTiming,
          text,
          supplier,
          destination,
          modifierExtension,
          type,
          receiver,
          resourceType,
          partOf,
          basedOn,
          occurrencePeriod,
          occurrenceDateTime,
          language,
          meta,
          suppliedItem);
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean patientIsSet() {
      return (optBits & OPT_BIT_PATIENT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean occurrenceTimingIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_TIMING) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean supplierIsSet() {
      return (optBits & OPT_BIT_SUPPLIER) != 0;
    }

    private boolean destinationIsSet() {
      return (optBits & OPT_BIT_DESTINATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean receiverIsSet() {
      return (optBits & OPT_BIT_RECEIVER) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean occurrencePeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_PERIOD) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean suppliedItemIsSet() {
      return (optBits & OPT_BIT_SUPPLIED_ITEM) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of SupplyDelivery is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SupplyDelivery, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "SupplyDelivery", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SupplyDelivery#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "SupplyDelivery", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SupplyDelivery#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link SupplyDelivery#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link SupplyDelivery#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link SupplyDelivery#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link SupplyDelivery#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.SupplydeliveryStatus status);

    /**
     * Initializes the optional value {@link SupplyDelivery#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.SupplydeliveryStatus> status);

    /**
     * Initializes the optional value {@link SupplyDelivery#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patient(com.fhir.Reference patient);

    /**
     * Initializes the optional value {@link SupplyDelivery#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(java.util.Optional<? extends com.fhir.Reference> patient);

    /**
     * Initializes the optional value {@link SupplyDelivery#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link SupplyDelivery#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link SupplyDelivery#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link SupplyDelivery#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link SupplyDelivery#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link SupplyDelivery#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceTiming(com.fhir.Timing occurrenceTiming);

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceTiming(java.util.Optional<? extends com.fhir.Timing> occurrenceTiming);

    /**
     * Initializes the optional value {@link SupplyDelivery#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link SupplyDelivery#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link SupplyDelivery#supplier() supplier} to supplier.
     * @param supplier The value for supplier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supplier(com.fhir.Reference supplier);

    /**
     * Initializes the optional value {@link SupplyDelivery#supplier() supplier} to supplier.
     * @param supplier The value for supplier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supplier(java.util.Optional<? extends com.fhir.Reference> supplier);

    /**
     * Initializes the optional value {@link SupplyDelivery#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    BuildFinal destination(com.fhir.Reference destination);

    /**
     * Initializes the optional value {@link SupplyDelivery#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal destination(java.util.Optional<? extends com.fhir.Reference> destination);

    /**
     * Initializes the optional value {@link SupplyDelivery#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SupplyDelivery#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SupplyDelivery#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link SupplyDelivery#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link SupplyDelivery#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for chained invocation
     */
    BuildFinal receiver(java.util.List<com.fhir.Reference> receiver);

    /**
     * Initializes the optional value {@link SupplyDelivery#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal receiver(java.util.Optional<? extends java.util.List<com.fhir.Reference>> receiver);

    /**
     * Initializes the optional value {@link SupplyDelivery#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(java.util.List<com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link SupplyDelivery#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf);

    /**
     * Initializes the optional value {@link SupplyDelivery#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link SupplyDelivery#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrencePeriod(com.fhir.Period occurrencePeriod);

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrencePeriod(java.util.Optional<? extends com.fhir.Period> occurrencePeriod);

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(java.lang.String occurrenceDateTime);

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime);

    /**
     * Initializes the optional value {@link SupplyDelivery#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link SupplyDelivery#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link SupplyDelivery#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link SupplyDelivery#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link SupplyDelivery#suppliedItem() suppliedItem} to suppliedItem.
     * @param suppliedItem The value for suppliedItem
     * @return {@code this} builder for chained invocation
     */
    BuildFinal suppliedItem(com.fhir.SupplyDelivery_SuppliedItem suppliedItem);

    /**
     * Initializes the optional value {@link SupplyDelivery#suppliedItem() suppliedItem} to suppliedItem.
     * @param suppliedItem The value for suppliedItem
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal suppliedItem(java.util.Optional<? extends com.fhir.SupplyDelivery_SuppliedItem> suppliedItem);

    /**
     * Builds a new {@link SupplyDelivery SupplyDelivery}.
     * @return An immutable instance of SupplyDelivery
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SupplyDelivery build();
  }
}
