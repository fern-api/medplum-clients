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
 * Immutable implementation of {@link SupplyDelivery}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSupplyDelivery.builder()}.
 */
@Generated(from = "SupplyDelivery", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSupplyDelivery implements SupplyDelivery {
  private final String resourceType;
  private final @Nullable Reference destination;
  private final @Nullable List<Reference> receiver;
  private final @Nullable Timing occurrenceTiming;
  private final @Nullable Id id;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Reference patient;
  private final @Nullable String occurrenceDateTime;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable SupplydeliveryStatus status;
  private final @Nullable List<Reference> partOf;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Period occurrencePeriod;
  private final @Nullable Narrative text;
  private final @Nullable List<Reference> basedOn;
  private final @Nullable SupplyDelivery_SuppliedItem suppliedItem;
  private final @Nullable Reference supplier;
  private final @Nullable Meta meta;
  private final @Nullable Code language;
  private final @Nullable CodeableConcept type;

  private ImmutableSupplyDelivery(
      String resourceType,
      @Nullable Reference destination,
      @Nullable List<Reference> receiver,
      @Nullable Timing occurrenceTiming,
      @Nullable Id id,
      @Nullable List<Identifier> identifier,
      @Nullable Reference patient,
      @Nullable String occurrenceDateTime,
      @Nullable Uri implicitRules,
      @Nullable List<ResourceList> contained,
      @Nullable SupplydeliveryStatus status,
      @Nullable List<Reference> partOf,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable Period occurrencePeriod,
      @Nullable Narrative text,
      @Nullable List<Reference> basedOn,
      @Nullable SupplyDelivery_SuppliedItem suppliedItem,
      @Nullable Reference supplier,
      @Nullable Meta meta,
      @Nullable Code language,
      @Nullable CodeableConcept type) {
    this.resourceType = resourceType;
    this.destination = destination;
    this.receiver = receiver;
    this.occurrenceTiming = occurrenceTiming;
    this.id = id;
    this.identifier = identifier;
    this.patient = patient;
    this.occurrenceDateTime = occurrenceDateTime;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.status = status;
    this.partOf = partOf;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.occurrencePeriod = occurrencePeriod;
    this.text = text;
    this.basedOn = basedOn;
    this.suppliedItem = suppliedItem;
    this.supplier = supplier;
    this.meta = meta;
    this.language = language;
    this.type = type;
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
   * @return The value of the {@code destination} attribute
   */
  @JsonProperty("destination")
  @Override
  public Optional<Reference> destination() {
    return Optional.ofNullable(destination);
  }

  /**
   * @return The value of the {@code receiver} attribute
   */
  @JsonProperty("receiver")
  @Override
  public Optional<List<Reference>> receiver() {
    return Optional.ofNullable(receiver);
  }

  /**
   * @return The value of the {@code occurrenceTiming} attribute
   */
  @JsonProperty("occurrenceTiming")
  @Override
  public Optional<Timing> occurrenceTiming() {
    return Optional.ofNullable(occurrenceTiming);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @JsonProperty("patient")
  @Override
  public Optional<Reference> patient() {
    return Optional.ofNullable(patient);
  }

  /**
   * @return The value of the {@code occurrenceDateTime} attribute
   */
  @JsonProperty("occurrenceDateTime")
  @Override
  public Optional<String> occurrenceDateTime() {
    return Optional.ofNullable(occurrenceDateTime);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<SupplydeliveryStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @JsonProperty("partOf")
  @Override
  public Optional<List<Reference>> partOf() {
    return Optional.ofNullable(partOf);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code occurrencePeriod} attribute
   */
  @JsonProperty("occurrencePeriod")
  @Override
  public Optional<Period> occurrencePeriod() {
    return Optional.ofNullable(occurrencePeriod);
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
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<List<Reference>> basedOn() {
    return Optional.ofNullable(basedOn);
  }

  /**
   * @return The value of the {@code suppliedItem} attribute
   */
  @JsonProperty("suppliedItem")
  @Override
  public Optional<SupplyDelivery_SuppliedItem> suppliedItem() {
    return Optional.ofNullable(suppliedItem);
  }

  /**
   * @return The value of the {@code supplier} attribute
   */
  @JsonProperty("supplier")
  @Override
  public Optional<Reference> supplier() {
    return Optional.ofNullable(supplier);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * Copy the current immutable object by setting a value for the {@link SupplyDelivery#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSupplyDelivery withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSupplyDelivery(
        newValue,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#destination() destination} attribute.
   * @param value The value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withDestination(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "destination");
    if (this.destination == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        newValue,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#destination() destination} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for destination
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withDestination(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.destination == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        value,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#receiver() receiver} attribute.
   * @param value The value for receiver
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withReceiver(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "receiver");
    if (this.receiver == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        newValue,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#receiver() receiver} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for receiver
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withReceiver(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.receiver == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        value,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#occurrenceTiming() occurrenceTiming} attribute.
   * @param value The value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withOccurrenceTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "occurrenceTiming");
    if (this.occurrenceTiming == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        newValue,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#occurrenceTiming() occurrenceTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withOccurrenceTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.occurrenceTiming == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        value,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        newValue,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        value,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        newValue,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        value,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#patient() patient} attribute.
   * @param value The value for patient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withPatient(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "patient");
    if (this.patient == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        newValue,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#patient() patient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withPatient(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.patient == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        value,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withOccurrenceDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "occurrenceDateTime");
    if (Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        newValue,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withOccurrenceDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        value,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        newValue,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        value,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        newValue,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        value,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withStatus(SupplydeliveryStatus value) {
    @Nullable SupplydeliveryStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        newValue,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withStatus(Optional<? extends SupplydeliveryStatus> optional) {
    @Nullable SupplydeliveryStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        value,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withPartOf(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        newValue,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withPartOf(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        value,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        newValue,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        value,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        newValue,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        value,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#occurrencePeriod() occurrencePeriod} attribute.
   * @param value The value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withOccurrencePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "occurrencePeriod");
    if (this.occurrencePeriod == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        newValue,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#occurrencePeriod() occurrencePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withOccurrencePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.occurrencePeriod == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        value,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        newValue,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        value,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        newValue,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        value,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#suppliedItem() suppliedItem} attribute.
   * @param value The value for suppliedItem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withSuppliedItem(SupplyDelivery_SuppliedItem value) {
    @Nullable SupplyDelivery_SuppliedItem newValue = Objects.requireNonNull(value, "suppliedItem");
    if (this.suppliedItem == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        newValue,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#suppliedItem() suppliedItem} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for suppliedItem
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withSuppliedItem(Optional<? extends SupplyDelivery_SuppliedItem> optional) {
    @Nullable SupplyDelivery_SuppliedItem value = optional.orElse(null);
    if (this.suppliedItem == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        value,
        this.supplier,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#supplier() supplier} attribute.
   * @param value The value for supplier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withSupplier(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "supplier");
    if (this.supplier == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        newValue,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#supplier() supplier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supplier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withSupplier(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.supplier == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        value,
        this.meta,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        newValue,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        value,
        this.language,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        newValue,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        value,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyDelivery#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyDelivery withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyDelivery#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyDelivery withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSupplyDelivery(
        this.resourceType,
        this.destination,
        this.receiver,
        this.occurrenceTiming,
        this.id,
        this.identifier,
        this.patient,
        this.occurrenceDateTime,
        this.implicitRules,
        this.contained,
        this.status,
        this.partOf,
        this.extension,
        this.modifierExtension,
        this.occurrencePeriod,
        this.text,
        this.basedOn,
        this.suppliedItem,
        this.supplier,
        this.meta,
        this.language,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSupplyDelivery} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSupplyDelivery
        && equalTo((ImmutableSupplyDelivery) another);
  }

  private boolean equalTo(ImmutableSupplyDelivery another) {
    return resourceType.equals(another.resourceType)
        && Objects.equals(destination, another.destination)
        && Objects.equals(receiver, another.receiver)
        && Objects.equals(occurrenceTiming, another.occurrenceTiming)
        && Objects.equals(id, another.id)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(patient, another.patient)
        && Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(contained, another.contained)
        && Objects.equals(status, another.status)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(occurrencePeriod, another.occurrencePeriod)
        && Objects.equals(text, another.text)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(suppliedItem, another.suppliedItem)
        && Objects.equals(supplier, another.supplier)
        && Objects.equals(meta, another.meta)
        && Objects.equals(language, another.language)
        && Objects.equals(type, another.type);
  }

  /**
   * Computes a hash code from attributes: {@code resourceType}, {@code destination}, {@code receiver}, {@code occurrenceTiming}, {@code id}, {@code identifier}, {@code patient}, {@code occurrenceDateTime}, {@code implicitRules}, {@code contained}, {@code status}, {@code partOf}, {@code extension}, {@code modifierExtension}, {@code occurrencePeriod}, {@code text}, {@code basedOn}, {@code suppliedItem}, {@code supplier}, {@code meta}, {@code language}, {@code type}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(destination);
    h += (h << 5) + Objects.hashCode(receiver);
    h += (h << 5) + Objects.hashCode(occurrenceTiming);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(patient);
    h += (h << 5) + Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(occurrencePeriod);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(suppliedItem);
    h += (h << 5) + Objects.hashCode(supplier);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(type);
    return h;
  }

  /**
   * Prints the immutable value {@code SupplyDelivery} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SupplyDelivery{");
    builder.append("resourceType=").append(resourceType);
    if (destination != null) {
      builder.append(", ");
      builder.append("destination=").append(destination);
    }
    if (receiver != null) {
      builder.append(", ");
      builder.append("receiver=").append(receiver);
    }
    if (occurrenceTiming != null) {
      builder.append(", ");
      builder.append("occurrenceTiming=").append(occurrenceTiming);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (patient != null) {
      builder.append(", ");
      builder.append("patient=").append(patient);
    }
    if (occurrenceDateTime != null) {
      builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (occurrencePeriod != null) {
      builder.append(", ");
      builder.append("occurrencePeriod=").append(occurrencePeriod);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (suppliedItem != null) {
      builder.append(", ");
      builder.append("suppliedItem=").append(suppliedItem);
    }
    if (supplier != null) {
      builder.append(", ");
      builder.append("supplier=").append(supplier);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SupplyDelivery", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SupplyDelivery {
    @Nullable String resourceType;
    @Nullable Optional<Reference> destination = Optional.empty();
    boolean destinationIsSet;
    @Nullable Optional<List<Reference>> receiver = Optional.empty();
    boolean receiverIsSet;
    @Nullable Optional<Timing> occurrenceTiming = Optional.empty();
    boolean occurrenceTimingIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Reference> patient = Optional.empty();
    boolean patientIsSet;
    @Nullable Optional<String> occurrenceDateTime = Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<SupplydeliveryStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Reference>> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Period> occurrencePeriod = Optional.empty();
    boolean occurrencePeriodIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<SupplyDelivery_SuppliedItem> suppliedItem = Optional.empty();
    boolean suppliedItemIsSet;
    @Nullable Optional<Reference> supplier = Optional.empty();
    boolean supplierIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("destination")
    public void setDestination(Optional<Reference> destination) {
      this.destination = destination;
      this.destinationIsSet = true;
    }
    @JsonProperty("receiver")
    public void setReceiver(Optional<List<Reference>> receiver) {
      this.receiver = receiver;
      this.receiverIsSet = true;
    }
    @JsonProperty("occurrenceTiming")
    public void setOccurrenceTiming(Optional<Timing> occurrenceTiming) {
      this.occurrenceTiming = occurrenceTiming;
      this.occurrenceTimingIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Optional<Reference> patient) {
      this.patient = patient;
      this.patientIsSet = true;
    }
    @JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(Optional<String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<SupplydeliveryStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<List<Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(Optional<Period> occurrencePeriod) {
      this.occurrencePeriod = occurrencePeriod;
      this.occurrencePeriodIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("suppliedItem")
    public void setSuppliedItem(Optional<SupplyDelivery_SuppliedItem> suppliedItem) {
      this.suppliedItem = suppliedItem;
      this.suppliedItemIsSet = true;
    }
    @JsonProperty("supplier")
    public void setSupplier(Optional<Reference> supplier) {
      this.supplier = supplier;
      this.supplierIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> destination() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> receiver() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> occurrenceTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SupplydeliveryStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> occurrencePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SupplyDelivery_SuppliedItem> suppliedItem() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> supplier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSupplyDelivery fromJson(Json json) {
    ImmutableSupplyDelivery.Builder builder = ((ImmutableSupplyDelivery.Builder) ImmutableSupplyDelivery.builder());
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.destinationIsSet) {
      builder.destination(json.destination);
    }
    if (json.receiverIsSet) {
      builder.receiver(json.receiver);
    }
    if (json.occurrenceTimingIsSet) {
      builder.occurrenceTiming(json.occurrenceTiming);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.patientIsSet) {
      builder.patient(json.patient);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.occurrencePeriodIsSet) {
      builder.occurrencePeriod(json.occurrencePeriod);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.suppliedItemIsSet) {
      builder.suppliedItem(json.suppliedItem);
    }
    if (json.supplierIsSet) {
      builder.supplier(json.supplier);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
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
        .resourceType(instance.resourceType())
        .destination(instance.destination())
        .receiver(instance.receiver())
        .occurrenceTiming(instance.occurrenceTiming())
        .id(instance.id())
        .identifier(instance.identifier())
        .patient(instance.patient())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .status(instance.status())
        .partOf(instance.partOf())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .occurrencePeriod(instance.occurrencePeriod())
        .text(instance.text())
        .basedOn(instance.basedOn())
        .suppliedItem(instance.suppliedItem())
        .supplier(instance.supplier())
        .meta(instance.meta())
        .language(instance.language())
        .type(instance.type())
        .build();
  }

  /**
   * Creates a builder for {@link SupplyDelivery SupplyDelivery}.
   * <pre>
   * ImmutableSupplyDelivery.builder()
   *    .resourceType(String) // required {@link SupplyDelivery#resourceType() resourceType}
   *    .destination(com.fhir.types.fhir.Reference) // optional {@link SupplyDelivery#destination() destination}
   *    .receiver(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link SupplyDelivery#receiver() receiver}
   *    .occurrenceTiming(com.fhir.types.fhir.Timing) // optional {@link SupplyDelivery#occurrenceTiming() occurrenceTiming}
   *    .id(com.fhir.types.fhir.Id) // optional {@link SupplyDelivery#id() id}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link SupplyDelivery#identifier() identifier}
   *    .patient(com.fhir.types.fhir.Reference) // optional {@link SupplyDelivery#patient() patient}
   *    .occurrenceDateTime(String) // optional {@link SupplyDelivery#occurrenceDateTime() occurrenceDateTime}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link SupplyDelivery#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link SupplyDelivery#contained() contained}
   *    .status(com.fhir.types.fhir.SupplydeliveryStatus) // optional {@link SupplyDelivery#status() status}
   *    .partOf(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link SupplyDelivery#partOf() partOf}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SupplyDelivery#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SupplyDelivery#modifierExtension() modifierExtension}
   *    .occurrencePeriod(com.fhir.types.fhir.Period) // optional {@link SupplyDelivery#occurrencePeriod() occurrencePeriod}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link SupplyDelivery#text() text}
   *    .basedOn(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link SupplyDelivery#basedOn() basedOn}
   *    .suppliedItem(com.fhir.types.fhir.SupplyDelivery_SuppliedItem) // optional {@link SupplyDelivery#suppliedItem() suppliedItem}
   *    .supplier(com.fhir.types.fhir.Reference) // optional {@link SupplyDelivery#supplier() supplier}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link SupplyDelivery#meta() meta}
   *    .language(com.fhir.types.fhir.Code) // optional {@link SupplyDelivery#language() language}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link SupplyDelivery#type() type}
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
  @Generated(from = "SupplyDelivery", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_DESTINATION = 0x1L;
    private static final long OPT_BIT_RECEIVER = 0x2L;
    private static final long OPT_BIT_OCCURRENCE_TIMING = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_PATIENT = 0x20L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x40L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80L;
    private static final long OPT_BIT_CONTAINED = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_PART_OF = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000L;
    private static final long OPT_BIT_OCCURRENCE_PERIOD = 0x2000L;
    private static final long OPT_BIT_TEXT = 0x4000L;
    private static final long OPT_BIT_BASED_ON = 0x8000L;
    private static final long OPT_BIT_SUPPLIED_ITEM = 0x10000L;
    private static final long OPT_BIT_SUPPLIER = 0x20000L;
    private static final long OPT_BIT_META = 0x40000L;
    private static final long OPT_BIT_LANGUAGE = 0x80000L;
    private static final long OPT_BIT_TYPE = 0x100000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String resourceType;
    private @Nullable Reference destination;
    private @Nullable List<Reference> receiver;
    private @Nullable Timing occurrenceTiming;
    private @Nullable Id id;
    private @Nullable List<Identifier> identifier;
    private @Nullable Reference patient;
    private @Nullable String occurrenceDateTime;
    private @Nullable Uri implicitRules;
    private @Nullable List<ResourceList> contained;
    private @Nullable SupplydeliveryStatus status;
    private @Nullable List<Reference> partOf;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Period occurrencePeriod;
    private @Nullable Narrative text;
    private @Nullable List<Reference> basedOn;
    private @Nullable SupplyDelivery_SuppliedItem suppliedItem;
    private @Nullable Reference supplier;
    private @Nullable Meta meta;
    private @Nullable Code language;
    private @Nullable CodeableConcept type;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link SupplyDelivery#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link SupplyDelivery#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    public final Builder destination(Reference destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = Objects.requireNonNull(destination, "destination");
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("destination")
    public final Builder destination(Optional<? extends Reference> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = destination.orElse(null);
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for chained invocation
     */
    public final Builder receiver(List<Reference> receiver) {
      checkNotIsSet(receiverIsSet(), "receiver");
      this.receiver = Objects.requireNonNull(receiver, "receiver");
      optBits |= OPT_BIT_RECEIVER;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("receiver")
    public final Builder receiver(Optional<? extends List<Reference>> receiver) {
      checkNotIsSet(receiverIsSet(), "receiver");
      this.receiver = receiver.orElse(null);
      optBits |= OPT_BIT_RECEIVER;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceTiming(Timing occurrenceTiming) {
      checkNotIsSet(occurrenceTimingIsSet(), "occurrenceTiming");
      this.occurrenceTiming = Objects.requireNonNull(occurrenceTiming, "occurrenceTiming");
      optBits |= OPT_BIT_OCCURRENCE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("occurrenceTiming")
    public final Builder occurrenceTiming(Optional<? extends Timing> occurrenceTiming) {
      checkNotIsSet(occurrenceTimingIsSet(), "occurrenceTiming");
      this.occurrenceTiming = occurrenceTiming.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#id() id} to id.
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
     * Initializes the optional value {@link SupplyDelivery#id() id} to id.
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
     * Initializes the optional value {@link SupplyDelivery#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link SupplyDelivery#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link SupplyDelivery#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    public final Builder patient(Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = Objects.requireNonNull(patient, "patient");
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patient")
    public final Builder patient(Optional<? extends Reference> patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = patient.orElse(null);
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceDateTime(String occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = Objects.requireNonNull(occurrenceDateTime, "occurrenceDateTime");
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("occurrenceDateTime")
    public final Builder occurrenceDateTime(Optional<String> occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = occurrenceDateTime.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SupplyDelivery#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SupplyDelivery#contained() contained} to contained.
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
     * Initializes the optional value {@link SupplyDelivery#contained() contained} to contained.
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
     * Initializes the optional value {@link SupplyDelivery#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(SupplydeliveryStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends SupplydeliveryStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(List<Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("partOf")
    public final Builder partOf(Optional<? extends List<Reference>> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#extension() extension} to extension.
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
     * Initializes the optional value {@link SupplyDelivery#extension() extension} to extension.
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
     * Initializes the optional value {@link SupplyDelivery#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SupplyDelivery#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SupplyDelivery#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrencePeriod(Period occurrencePeriod) {
      checkNotIsSet(occurrencePeriodIsSet(), "occurrencePeriod");
      this.occurrencePeriod = Objects.requireNonNull(occurrencePeriod, "occurrencePeriod");
      optBits |= OPT_BIT_OCCURRENCE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("occurrencePeriod")
    public final Builder occurrencePeriod(Optional<? extends Period> occurrencePeriod) {
      checkNotIsSet(occurrencePeriodIsSet(), "occurrencePeriod");
      this.occurrencePeriod = occurrencePeriod.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#text() text} to text.
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
     * Initializes the optional value {@link SupplyDelivery#text() text} to text.
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
     * Initializes the optional value {@link SupplyDelivery#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(List<Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("basedOn")
    public final Builder basedOn(Optional<? extends List<Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#suppliedItem() suppliedItem} to suppliedItem.
     * @param suppliedItem The value for suppliedItem
     * @return {@code this} builder for chained invocation
     */
    public final Builder suppliedItem(SupplyDelivery_SuppliedItem suppliedItem) {
      checkNotIsSet(suppliedItemIsSet(), "suppliedItem");
      this.suppliedItem = Objects.requireNonNull(suppliedItem, "suppliedItem");
      optBits |= OPT_BIT_SUPPLIED_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#suppliedItem() suppliedItem} to suppliedItem.
     * @param suppliedItem The value for suppliedItem
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("suppliedItem")
    public final Builder suppliedItem(Optional<? extends SupplyDelivery_SuppliedItem> suppliedItem) {
      checkNotIsSet(suppliedItemIsSet(), "suppliedItem");
      this.suppliedItem = suppliedItem.orElse(null);
      optBits |= OPT_BIT_SUPPLIED_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#supplier() supplier} to supplier.
     * @param supplier The value for supplier
     * @return {@code this} builder for chained invocation
     */
    public final Builder supplier(Reference supplier) {
      checkNotIsSet(supplierIsSet(), "supplier");
      this.supplier = Objects.requireNonNull(supplier, "supplier");
      optBits |= OPT_BIT_SUPPLIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#supplier() supplier} to supplier.
     * @param supplier The value for supplier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supplier")
    public final Builder supplier(Optional<? extends Reference> supplier) {
      checkNotIsSet(supplierIsSet(), "supplier");
      this.supplier = supplier.orElse(null);
      optBits |= OPT_BIT_SUPPLIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyDelivery#meta() meta} to meta.
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
     * Initializes the optional value {@link SupplyDelivery#meta() meta} to meta.
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
     * Initializes the optional value {@link SupplyDelivery#language() language} to language.
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
     * Initializes the optional value {@link SupplyDelivery#language() language} to language.
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
     * Initializes the optional value {@link SupplyDelivery#type() type} to type.
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
     * Initializes the optional value {@link SupplyDelivery#type() type} to type.
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
     * Builds a new {@link SupplyDelivery SupplyDelivery}.
     * @return An immutable instance of SupplyDelivery
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SupplyDelivery build() {
      checkRequiredAttributes();
      return new ImmutableSupplyDelivery(
          resourceType,
          destination,
          receiver,
          occurrenceTiming,
          id,
          identifier,
          patient,
          occurrenceDateTime,
          implicitRules,
          contained,
          status,
          partOf,
          extension,
          modifierExtension,
          occurrencePeriod,
          text,
          basedOn,
          suppliedItem,
          supplier,
          meta,
          language,
          type);
    }

    private boolean destinationIsSet() {
      return (optBits & OPT_BIT_DESTINATION) != 0;
    }

    private boolean receiverIsSet() {
      return (optBits & OPT_BIT_RECEIVER) != 0;
    }

    private boolean occurrenceTimingIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_TIMING) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean patientIsSet() {
      return (optBits & OPT_BIT_PATIENT) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean occurrencePeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_PERIOD) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean suppliedItemIsSet() {
      return (optBits & OPT_BIT_SUPPLIED_ITEM) != 0;
    }

    private boolean supplierIsSet() {
      return (optBits & OPT_BIT_SUPPLIER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SupplyDelivery is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SupplyDelivery, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "SupplyDelivery", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SupplyDelivery#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "SupplyDelivery", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SupplyDelivery#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    BuildFinal destination(Reference destination);

    /**
     * Initializes the optional value {@link SupplyDelivery#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal destination(Optional<? extends Reference> destination);

    /**
     * Initializes the optional value {@link SupplyDelivery#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for chained invocation
     */
    BuildFinal receiver(List<Reference> receiver);

    /**
     * Initializes the optional value {@link SupplyDelivery#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal receiver(Optional<? extends List<Reference>> receiver);

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceTiming(Timing occurrenceTiming);

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceTiming(Optional<? extends Timing> occurrenceTiming);

    /**
     * Initializes the optional value {@link SupplyDelivery#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link SupplyDelivery#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link SupplyDelivery#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link SupplyDelivery#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link SupplyDelivery#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patient(Reference patient);

    /**
     * Initializes the optional value {@link SupplyDelivery#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(Optional<? extends Reference> patient);

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(String occurrenceDateTime);

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(Optional<String> occurrenceDateTime);

    /**
     * Initializes the optional value {@link SupplyDelivery#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link SupplyDelivery#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link SupplyDelivery#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link SupplyDelivery#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link SupplyDelivery#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(SupplydeliveryStatus status);

    /**
     * Initializes the optional value {@link SupplyDelivery#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends SupplydeliveryStatus> status);

    /**
     * Initializes the optional value {@link SupplyDelivery#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(List<Reference> partOf);

    /**
     * Initializes the optional value {@link SupplyDelivery#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends List<Reference>> partOf);

    /**
     * Initializes the optional value {@link SupplyDelivery#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link SupplyDelivery#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link SupplyDelivery#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SupplyDelivery#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrencePeriod(Period occurrencePeriod);

    /**
     * Initializes the optional value {@link SupplyDelivery#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrencePeriod(Optional<? extends Period> occurrencePeriod);

    /**
     * Initializes the optional value {@link SupplyDelivery#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link SupplyDelivery#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link SupplyDelivery#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link SupplyDelivery#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link SupplyDelivery#suppliedItem() suppliedItem} to suppliedItem.
     * @param suppliedItem The value for suppliedItem
     * @return {@code this} builder for chained invocation
     */
    BuildFinal suppliedItem(SupplyDelivery_SuppliedItem suppliedItem);

    /**
     * Initializes the optional value {@link SupplyDelivery#suppliedItem() suppliedItem} to suppliedItem.
     * @param suppliedItem The value for suppliedItem
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal suppliedItem(Optional<? extends SupplyDelivery_SuppliedItem> suppliedItem);

    /**
     * Initializes the optional value {@link SupplyDelivery#supplier() supplier} to supplier.
     * @param supplier The value for supplier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supplier(Reference supplier);

    /**
     * Initializes the optional value {@link SupplyDelivery#supplier() supplier} to supplier.
     * @param supplier The value for supplier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supplier(Optional<? extends Reference> supplier);

    /**
     * Initializes the optional value {@link SupplyDelivery#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link SupplyDelivery#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link SupplyDelivery#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link SupplyDelivery#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link SupplyDelivery#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link SupplyDelivery#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Builds a new {@link SupplyDelivery SupplyDelivery}.
     * @return An immutable instance of SupplyDelivery
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SupplyDelivery build();
  }
}
