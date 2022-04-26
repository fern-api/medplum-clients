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
 * Immutable implementation of {@link SupplyRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSupplyRequest.builder()}.
 */
@Generated(from = "SupplyRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSupplyRequest implements SupplyRequest {
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Reference itemReference;
  private final Quantity quantity;
  private final @Nullable Uri implicitRules;
  private final @Nullable Narrative text;
  private final @Nullable Meta meta;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable CodeableConcept itemCodeableConcept;
  private final @Nullable List<SupplyRequest_Parameter> parameter;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Code language;
  private final String resourceType;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Reference> supplier;
  private final @Nullable Id id;
  private final @Nullable CodeableConcept category;
  private final @Nullable String occurrenceDateTime;
  private final @Nullable DateTime authoredOn;
  private final @Nullable SupplyrequestStatus status;
  private final @Nullable Period occurrencePeriod;
  private final @Nullable Reference deliverFrom;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable Timing occurrenceTiming;
  private final @Nullable Reference deliverTo;
  private final @Nullable Code priority;
  private final @Nullable Reference requester;

  private ImmutableSupplyRequest(
      @Nullable List<ResourceList> contained,
      @Nullable Reference itemReference,
      Quantity quantity,
      @Nullable Uri implicitRules,
      @Nullable Narrative text,
      @Nullable Meta meta,
      @Nullable List<Reference> reasonReference,
      @Nullable CodeableConcept itemCodeableConcept,
      @Nullable List<SupplyRequest_Parameter> parameter,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Identifier> identifier,
      @Nullable Code language,
      String resourceType,
      @Nullable List<Extension> extension,
      @Nullable List<Reference> supplier,
      @Nullable Id id,
      @Nullable CodeableConcept category,
      @Nullable String occurrenceDateTime,
      @Nullable DateTime authoredOn,
      @Nullable SupplyrequestStatus status,
      @Nullable Period occurrencePeriod,
      @Nullable Reference deliverFrom,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable Timing occurrenceTiming,
      @Nullable Reference deliverTo,
      @Nullable Code priority,
      @Nullable Reference requester) {
    this.contained = contained;
    this.itemReference = itemReference;
    this.quantity = quantity;
    this.implicitRules = implicitRules;
    this.text = text;
    this.meta = meta;
    this.reasonReference = reasonReference;
    this.itemCodeableConcept = itemCodeableConcept;
    this.parameter = parameter;
    this.modifierExtension = modifierExtension;
    this.identifier = identifier;
    this.language = language;
    this.resourceType = resourceType;
    this.extension = extension;
    this.supplier = supplier;
    this.id = id;
    this.category = category;
    this.occurrenceDateTime = occurrenceDateTime;
    this.authoredOn = authoredOn;
    this.status = status;
    this.occurrencePeriod = occurrencePeriod;
    this.deliverFrom = deliverFrom;
    this.reasonCode = reasonCode;
    this.occurrenceTiming = occurrenceTiming;
    this.deliverTo = deliverTo;
    this.priority = priority;
    this.requester = requester;
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
   * @return The value of the {@code itemReference} attribute
   */
  @JsonProperty("itemReference")
  @Override
  public Optional<Reference> itemReference() {
    return Optional.ofNullable(itemReference);
  }

  /**
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Quantity quantity() {
    return quantity;
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code reasonReference} attribute
   */
  @JsonProperty("reasonReference")
  @Override
  public Optional<List<Reference>> reasonReference() {
    return Optional.ofNullable(reasonReference);
  }

  /**
   * @return The value of the {@code itemCodeableConcept} attribute
   */
  @JsonProperty("itemCodeableConcept")
  @Override
  public Optional<CodeableConcept> itemCodeableConcept() {
    return Optional.ofNullable(itemCodeableConcept);
  }

  /**
   * @return The value of the {@code parameter} attribute
   */
  @JsonProperty("parameter")
  @Override
  public Optional<List<SupplyRequest_Parameter>> parameter() {
    return Optional.ofNullable(parameter);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code supplier} attribute
   */
  @JsonProperty("supplier")
  @Override
  public Optional<List<Reference>> supplier() {
    return Optional.ofNullable(supplier);
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<CodeableConcept> category() {
    return Optional.ofNullable(category);
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
   * @return The value of the {@code authoredOn} attribute
   */
  @JsonProperty("authoredOn")
  @Override
  public Optional<DateTime> authoredOn() {
    return Optional.ofNullable(authoredOn);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<SupplyrequestStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code deliverFrom} attribute
   */
  @JsonProperty("deliverFrom")
  @Override
  public Optional<Reference> deliverFrom() {
    return Optional.ofNullable(deliverFrom);
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
   * @return The value of the {@code occurrenceTiming} attribute
   */
  @JsonProperty("occurrenceTiming")
  @Override
  public Optional<Timing> occurrenceTiming() {
    return Optional.ofNullable(occurrenceTiming);
  }

  /**
   * @return The value of the {@code deliverTo} attribute
   */
  @JsonProperty("deliverTo")
  @Override
  public Optional<Reference> deliverTo() {
    return Optional.ofNullable(deliverTo);
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public Optional<Code> priority() {
    return Optional.ofNullable(priority);
  }

  /**
   * @return The value of the {@code requester} attribute
   */
  @JsonProperty("requester")
  @Override
  public Optional<Reference> requester() {
    return Optional.ofNullable(requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSupplyRequest(
        newValue,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSupplyRequest(
        value,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#itemReference() itemReference} attribute.
   * @param value The value for itemReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withItemReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "itemReference");
    if (this.itemReference == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        newValue,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#itemReference() itemReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for itemReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withItemReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.itemReference == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        value,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SupplyRequest#quantity() quantity} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for quantity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSupplyRequest withQuantity(Quantity value) {
    if (this.quantity == value) return this;
    Quantity newValue = Objects.requireNonNull(value, "quantity");
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        newValue,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        newValue,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        value,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        newValue,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        value,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        newValue,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        value,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        newValue,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        value,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#itemCodeableConcept() itemCodeableConcept} attribute.
   * @param value The value for itemCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withItemCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "itemCodeableConcept");
    if (this.itemCodeableConcept == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        newValue,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#itemCodeableConcept() itemCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for itemCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withItemCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.itemCodeableConcept == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        value,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#parameter() parameter} attribute.
   * @param value The value for parameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withParameter(List<SupplyRequest_Parameter> value) {
    @Nullable List<SupplyRequest_Parameter> newValue = Objects.requireNonNull(value, "parameter");
    if (this.parameter == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        newValue,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#parameter() parameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withParameter(Optional<? extends List<SupplyRequest_Parameter>> optional) {
    @Nullable List<SupplyRequest_Parameter> value = optional.orElse(null);
    if (this.parameter == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        value,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        newValue,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        value,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        newValue,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        value,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        newValue,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        value,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SupplyRequest#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSupplyRequest withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        newValue,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        newValue,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        value,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#supplier() supplier} attribute.
   * @param value The value for supplier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withSupplier(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "supplier");
    if (this.supplier == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        newValue,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#supplier() supplier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supplier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withSupplier(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.supplier == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        value,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        newValue,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        value,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withCategory(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        newValue,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withCategory(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        value,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withOccurrenceDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "occurrenceDateTime");
    if (Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        newValue,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withOccurrenceDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        value,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#authoredOn() authoredOn} attribute.
   * @param value The value for authoredOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withAuthoredOn(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "authoredOn");
    if (this.authoredOn == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        newValue,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#authoredOn() authoredOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authoredOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withAuthoredOn(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.authoredOn == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        value,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withStatus(SupplyrequestStatus value) {
    @Nullable SupplyrequestStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        newValue,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withStatus(Optional<? extends SupplyrequestStatus> optional) {
    @Nullable SupplyrequestStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        value,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#occurrencePeriod() occurrencePeriod} attribute.
   * @param value The value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withOccurrencePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "occurrencePeriod");
    if (this.occurrencePeriod == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        newValue,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#occurrencePeriod() occurrencePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withOccurrencePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.occurrencePeriod == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        value,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#deliverFrom() deliverFrom} attribute.
   * @param value The value for deliverFrom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withDeliverFrom(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "deliverFrom");
    if (this.deliverFrom == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        newValue,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#deliverFrom() deliverFrom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deliverFrom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withDeliverFrom(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.deliverFrom == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        value,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        newValue,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        value,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#occurrenceTiming() occurrenceTiming} attribute.
   * @param value The value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withOccurrenceTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "occurrenceTiming");
    if (this.occurrenceTiming == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        newValue,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#occurrenceTiming() occurrenceTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withOccurrenceTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.occurrenceTiming == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        value,
        this.deliverTo,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#deliverTo() deliverTo} attribute.
   * @param value The value for deliverTo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withDeliverTo(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "deliverTo");
    if (this.deliverTo == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        newValue,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#deliverTo() deliverTo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deliverTo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withDeliverTo(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.deliverTo == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        value,
        this.priority,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withPriority(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        newValue,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withPriority(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        value,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#requester() requester} attribute.
   * @param value The value for requester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withRequester(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "requester");
    if (this.requester == newValue) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#requester() requester} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requester
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withRequester(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.requester == value) return this;
    return new ImmutableSupplyRequest(
        this.contained,
        this.itemReference,
        this.quantity,
        this.implicitRules,
        this.text,
        this.meta,
        this.reasonReference,
        this.itemCodeableConcept,
        this.parameter,
        this.modifierExtension,
        this.identifier,
        this.language,
        this.resourceType,
        this.extension,
        this.supplier,
        this.id,
        this.category,
        this.occurrenceDateTime,
        this.authoredOn,
        this.status,
        this.occurrencePeriod,
        this.deliverFrom,
        this.reasonCode,
        this.occurrenceTiming,
        this.deliverTo,
        this.priority,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSupplyRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSupplyRequest
        && equalTo((ImmutableSupplyRequest) another);
  }

  private boolean equalTo(ImmutableSupplyRequest another) {
    return Objects.equals(contained, another.contained)
        && Objects.equals(itemReference, another.itemReference)
        && quantity.equals(another.quantity)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(text, another.text)
        && Objects.equals(meta, another.meta)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(itemCodeableConcept, another.itemCodeableConcept)
        && Objects.equals(parameter, another.parameter)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(language, another.language)
        && resourceType.equals(another.resourceType)
        && Objects.equals(extension, another.extension)
        && Objects.equals(supplier, another.supplier)
        && Objects.equals(id, another.id)
        && Objects.equals(category, another.category)
        && Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && Objects.equals(authoredOn, another.authoredOn)
        && Objects.equals(status, another.status)
        && Objects.equals(occurrencePeriod, another.occurrencePeriod)
        && Objects.equals(deliverFrom, another.deliverFrom)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(occurrenceTiming, another.occurrenceTiming)
        && Objects.equals(deliverTo, another.deliverTo)
        && Objects.equals(priority, another.priority)
        && Objects.equals(requester, another.requester);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code itemReference}, {@code quantity}, {@code implicitRules}, {@code text}, {@code meta}, {@code reasonReference}, {@code itemCodeableConcept}, {@code parameter}, {@code modifierExtension}, {@code identifier}, {@code language}, {@code resourceType}, {@code extension}, {@code supplier}, {@code id}, {@code category}, {@code occurrenceDateTime}, {@code authoredOn}, {@code status}, {@code occurrencePeriod}, {@code deliverFrom}, {@code reasonCode}, {@code occurrenceTiming}, {@code deliverTo}, {@code priority}, {@code requester}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(itemReference);
    h += (h << 5) + quantity.hashCode();
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(itemCodeableConcept);
    h += (h << 5) + Objects.hashCode(parameter);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(supplier);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + Objects.hashCode(authoredOn);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(occurrencePeriod);
    h += (h << 5) + Objects.hashCode(deliverFrom);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(occurrenceTiming);
    h += (h << 5) + Objects.hashCode(deliverTo);
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + Objects.hashCode(requester);
    return h;
  }

  /**
   * Prints the immutable value {@code SupplyRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SupplyRequest{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (itemReference != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("itemReference=").append(itemReference);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("quantity=").append(quantity);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (itemCodeableConcept != null) {
      builder.append(", ");
      builder.append("itemCodeableConcept=").append(itemCodeableConcept);
    }
    if (parameter != null) {
      builder.append(", ");
      builder.append("parameter=").append(parameter);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (supplier != null) {
      builder.append(", ");
      builder.append("supplier=").append(supplier);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (occurrenceDateTime != null) {
      builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (authoredOn != null) {
      builder.append(", ");
      builder.append("authoredOn=").append(authoredOn);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (occurrencePeriod != null) {
      builder.append(", ");
      builder.append("occurrencePeriod=").append(occurrencePeriod);
    }
    if (deliverFrom != null) {
      builder.append(", ");
      builder.append("deliverFrom=").append(deliverFrom);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (occurrenceTiming != null) {
      builder.append(", ");
      builder.append("occurrenceTiming=").append(occurrenceTiming);
    }
    if (deliverTo != null) {
      builder.append(", ");
      builder.append("deliverTo=").append(deliverTo);
    }
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
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
  @Generated(from = "SupplyRequest", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SupplyRequest {
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Reference> itemReference = Optional.empty();
    boolean itemReferenceIsSet;
    @Nullable Quantity quantity;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<CodeableConcept> itemCodeableConcept = Optional.empty();
    boolean itemCodeableConceptIsSet;
    @Nullable Optional<List<SupplyRequest_Parameter>> parameter = Optional.empty();
    boolean parameterIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Reference>> supplier = Optional.empty();
    boolean supplierIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<String> occurrenceDateTime = Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @Nullable Optional<DateTime> authoredOn = Optional.empty();
    boolean authoredOnIsSet;
    @Nullable Optional<SupplyrequestStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Period> occurrencePeriod = Optional.empty();
    boolean occurrencePeriodIsSet;
    @Nullable Optional<Reference> deliverFrom = Optional.empty();
    boolean deliverFromIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<Timing> occurrenceTiming = Optional.empty();
    boolean occurrenceTimingIsSet;
    @Nullable Optional<Reference> deliverTo = Optional.empty();
    boolean deliverToIsSet;
    @Nullable Optional<Code> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable Optional<Reference> requester = Optional.empty();
    boolean requesterIsSet;
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("itemReference")
    public void setItemReference(Optional<Reference> itemReference) {
      this.itemReference = itemReference;
      this.itemReferenceIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
      this.quantity = quantity;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("itemCodeableConcept")
    public void setItemCodeableConcept(Optional<CodeableConcept> itemCodeableConcept) {
      this.itemCodeableConcept = itemCodeableConcept;
      this.itemCodeableConceptIsSet = true;
    }
    @JsonProperty("parameter")
    public void setParameter(Optional<List<SupplyRequest_Parameter>> parameter) {
      this.parameter = parameter;
      this.parameterIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("supplier")
    public void setSupplier(Optional<List<Reference>> supplier) {
      this.supplier = supplier;
      this.supplierIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(Optional<String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @JsonProperty("authoredOn")
    public void setAuthoredOn(Optional<DateTime> authoredOn) {
      this.authoredOn = authoredOn;
      this.authoredOnIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<SupplyrequestStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(Optional<Period> occurrencePeriod) {
      this.occurrencePeriod = occurrencePeriod;
      this.occurrencePeriodIsSet = true;
    }
    @JsonProperty("deliverFrom")
    public void setDeliverFrom(Optional<Reference> deliverFrom) {
      this.deliverFrom = deliverFrom;
      this.deliverFromIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("occurrenceTiming")
    public void setOccurrenceTiming(Optional<Timing> occurrenceTiming) {
      this.occurrenceTiming = occurrenceTiming;
      this.occurrenceTimingIsSet = true;
    }
    @JsonProperty("deliverTo")
    public void setDeliverTo(Optional<Reference> deliverTo) {
      this.deliverTo = deliverTo;
      this.deliverToIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<Code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("requester")
    public void setRequester(Optional<Reference> requester) {
      this.requester = requester;
      this.requesterIsSet = true;
    }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> itemReference() { throw new UnsupportedOperationException(); }
    @Override
    public Quantity quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> itemCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SupplyRequest_Parameter>> parameter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> supplier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> authoredOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SupplyrequestStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> occurrencePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> deliverFrom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> occurrenceTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> deliverTo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> requester() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSupplyRequest fromJson(Json json) {
    ImmutableSupplyRequest.Builder builder = ((ImmutableSupplyRequest.Builder) ImmutableSupplyRequest.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.itemReferenceIsSet) {
      builder.itemReference(json.itemReference);
    }
    if (json.quantity != null) {
      builder.quantity(json.quantity);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.itemCodeableConceptIsSet) {
      builder.itemCodeableConcept(json.itemCodeableConcept);
    }
    if (json.parameterIsSet) {
      builder.parameter(json.parameter);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.supplierIsSet) {
      builder.supplier(json.supplier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.authoredOnIsSet) {
      builder.authoredOn(json.authoredOn);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.occurrencePeriodIsSet) {
      builder.occurrencePeriod(json.occurrencePeriod);
    }
    if (json.deliverFromIsSet) {
      builder.deliverFrom(json.deliverFrom);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.occurrenceTimingIsSet) {
      builder.occurrenceTiming(json.occurrenceTiming);
    }
    if (json.deliverToIsSet) {
      builder.deliverTo(json.deliverTo);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
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
        .contained(instance.contained())
        .itemReference(instance.itemReference())
        .quantity(instance.quantity())
        .implicitRules(instance.implicitRules())
        .text(instance.text())
        .meta(instance.meta())
        .reasonReference(instance.reasonReference())
        .itemCodeableConcept(instance.itemCodeableConcept())
        .parameter(instance.parameter())
        .modifierExtension(instance.modifierExtension())
        .identifier(instance.identifier())
        .language(instance.language())
        .resourceType(instance.resourceType())
        .extension(instance.extension())
        .supplier(instance.supplier())
        .id(instance.id())
        .category(instance.category())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .authoredOn(instance.authoredOn())
        .status(instance.status())
        .occurrencePeriod(instance.occurrencePeriod())
        .deliverFrom(instance.deliverFrom())
        .reasonCode(instance.reasonCode())
        .occurrenceTiming(instance.occurrenceTiming())
        .deliverTo(instance.deliverTo())
        .priority(instance.priority())
        .requester(instance.requester())
        .build();
  }

  /**
   * Creates a builder for {@link SupplyRequest SupplyRequest}.
   * <pre>
   * ImmutableSupplyRequest.builder()
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link SupplyRequest#contained() contained}
   *    .itemReference(com.fhir.types.fhir.Reference) // optional {@link SupplyRequest#itemReference() itemReference}
   *    .quantity(com.fhir.types.fhir.Quantity) // required {@link SupplyRequest#quantity() quantity}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link SupplyRequest#implicitRules() implicitRules}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link SupplyRequest#text() text}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link SupplyRequest#meta() meta}
   *    .reasonReference(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link SupplyRequest#reasonReference() reasonReference}
   *    .itemCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link SupplyRequest#itemCodeableConcept() itemCodeableConcept}
   *    .parameter(List&amp;lt;com.fhir.types.fhir.SupplyRequest_Parameter&amp;gt;) // optional {@link SupplyRequest#parameter() parameter}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SupplyRequest#modifierExtension() modifierExtension}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link SupplyRequest#identifier() identifier}
   *    .language(com.fhir.types.fhir.Code) // optional {@link SupplyRequest#language() language}
   *    .resourceType(String) // required {@link SupplyRequest#resourceType() resourceType}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SupplyRequest#extension() extension}
   *    .supplier(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link SupplyRequest#supplier() supplier}
   *    .id(com.fhir.types.fhir.Id) // optional {@link SupplyRequest#id() id}
   *    .category(com.fhir.types.fhir.CodeableConcept) // optional {@link SupplyRequest#category() category}
   *    .occurrenceDateTime(String) // optional {@link SupplyRequest#occurrenceDateTime() occurrenceDateTime}
   *    .authoredOn(com.fhir.types.fhir.DateTime) // optional {@link SupplyRequest#authoredOn() authoredOn}
   *    .status(com.fhir.types.fhir.SupplyrequestStatus) // optional {@link SupplyRequest#status() status}
   *    .occurrencePeriod(com.fhir.types.fhir.Period) // optional {@link SupplyRequest#occurrencePeriod() occurrencePeriod}
   *    .deliverFrom(com.fhir.types.fhir.Reference) // optional {@link SupplyRequest#deliverFrom() deliverFrom}
   *    .reasonCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link SupplyRequest#reasonCode() reasonCode}
   *    .occurrenceTiming(com.fhir.types.fhir.Timing) // optional {@link SupplyRequest#occurrenceTiming() occurrenceTiming}
   *    .deliverTo(com.fhir.types.fhir.Reference) // optional {@link SupplyRequest#deliverTo() deliverTo}
   *    .priority(com.fhir.types.fhir.Code) // optional {@link SupplyRequest#priority() priority}
   *    .requester(com.fhir.types.fhir.Reference) // optional {@link SupplyRequest#requester() requester}
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
  @Generated(from = "SupplyRequest", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements QuantityBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_QUANTITY = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_ITEM_REFERENCE = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_TEXT = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x20L;
    private static final long OPT_BIT_ITEM_CODEABLE_CONCEPT = 0x40L;
    private static final long OPT_BIT_PARAMETER = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_SUPPLIER = 0x1000L;
    private static final long OPT_BIT_ID = 0x2000L;
    private static final long OPT_BIT_CATEGORY = 0x4000L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x8000L;
    private static final long OPT_BIT_AUTHORED_ON = 0x10000L;
    private static final long OPT_BIT_STATUS = 0x20000L;
    private static final long OPT_BIT_OCCURRENCE_PERIOD = 0x40000L;
    private static final long OPT_BIT_DELIVER_FROM = 0x80000L;
    private static final long OPT_BIT_REASON_CODE = 0x100000L;
    private static final long OPT_BIT_OCCURRENCE_TIMING = 0x200000L;
    private static final long OPT_BIT_DELIVER_TO = 0x400000L;
    private static final long OPT_BIT_PRIORITY = 0x800000L;
    private static final long OPT_BIT_REQUESTER = 0x1000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<ResourceList> contained;
    private @Nullable Reference itemReference;
    private @Nullable Quantity quantity;
    private @Nullable Uri implicitRules;
    private @Nullable Narrative text;
    private @Nullable Meta meta;
    private @Nullable List<Reference> reasonReference;
    private @Nullable CodeableConcept itemCodeableConcept;
    private @Nullable List<SupplyRequest_Parameter> parameter;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Identifier> identifier;
    private @Nullable Code language;
    private @Nullable String resourceType;
    private @Nullable List<Extension> extension;
    private @Nullable List<Reference> supplier;
    private @Nullable Id id;
    private @Nullable CodeableConcept category;
    private @Nullable String occurrenceDateTime;
    private @Nullable DateTime authoredOn;
    private @Nullable SupplyrequestStatus status;
    private @Nullable Period occurrencePeriod;
    private @Nullable Reference deliverFrom;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable Timing occurrenceTiming;
    private @Nullable Reference deliverTo;
    private @Nullable Code priority;
    private @Nullable Reference requester;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SupplyRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link SupplyRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link SupplyRequest#itemReference() itemReference} to itemReference.
     * @param itemReference The value for itemReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder itemReference(Reference itemReference) {
      checkNotIsSet(itemReferenceIsSet(), "itemReference");
      this.itemReference = Objects.requireNonNull(itemReference, "itemReference");
      optBits |= OPT_BIT_ITEM_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#itemReference() itemReference} to itemReference.
     * @param itemReference The value for itemReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("itemReference")
    public final Builder itemReference(Optional<? extends Reference> itemReference) {
      checkNotIsSet(itemReferenceIsSet(), "itemReference");
      this.itemReference = itemReference.orElse(null);
      optBits |= OPT_BIT_ITEM_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link SupplyRequest#quantity() quantity} attribute.
     * @param quantity The value for quantity 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantity")
    public final Builder quantity(Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = Objects.requireNonNull(quantity, "quantity");
      initBits &= ~INIT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SupplyRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SupplyRequest#text() text} to text.
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
     * Initializes the optional value {@link SupplyRequest#text() text} to text.
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
     * Initializes the optional value {@link SupplyRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link SupplyRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link SupplyRequest#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link SupplyRequest#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link SupplyRequest#itemCodeableConcept() itemCodeableConcept} to itemCodeableConcept.
     * @param itemCodeableConcept The value for itemCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder itemCodeableConcept(CodeableConcept itemCodeableConcept) {
      checkNotIsSet(itemCodeableConceptIsSet(), "itemCodeableConcept");
      this.itemCodeableConcept = Objects.requireNonNull(itemCodeableConcept, "itemCodeableConcept");
      optBits |= OPT_BIT_ITEM_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#itemCodeableConcept() itemCodeableConcept} to itemCodeableConcept.
     * @param itemCodeableConcept The value for itemCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("itemCodeableConcept")
    public final Builder itemCodeableConcept(Optional<? extends CodeableConcept> itemCodeableConcept) {
      checkNotIsSet(itemCodeableConceptIsSet(), "itemCodeableConcept");
      this.itemCodeableConcept = itemCodeableConcept.orElse(null);
      optBits |= OPT_BIT_ITEM_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameter(List<SupplyRequest_Parameter> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = Objects.requireNonNull(parameter, "parameter");
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parameter")
    public final Builder parameter(Optional<? extends List<SupplyRequest_Parameter>> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = parameter.orElse(null);
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SupplyRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SupplyRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link SupplyRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link SupplyRequest#language() language} to language.
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
     * Initializes the optional value {@link SupplyRequest#language() language} to language.
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
     * Initializes the value for the {@link SupplyRequest#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link SupplyRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link SupplyRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link SupplyRequest#supplier() supplier} to supplier.
     * @param supplier The value for supplier
     * @return {@code this} builder for chained invocation
     */
    public final Builder supplier(List<Reference> supplier) {
      checkNotIsSet(supplierIsSet(), "supplier");
      this.supplier = Objects.requireNonNull(supplier, "supplier");
      optBits |= OPT_BIT_SUPPLIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#supplier() supplier} to supplier.
     * @param supplier The value for supplier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supplier")
    public final Builder supplier(Optional<? extends List<Reference>> supplier) {
      checkNotIsSet(supplierIsSet(), "supplier");
      this.supplier = supplier.orElse(null);
      optBits |= OPT_BIT_SUPPLIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#id() id} to id.
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
     * Initializes the optional value {@link SupplyRequest#id() id} to id.
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
     * Initializes the optional value {@link SupplyRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link SupplyRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link SupplyRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder authoredOn(DateTime authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = Objects.requireNonNull(authoredOn, "authoredOn");
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authoredOn")
    public final Builder authoredOn(Optional<? extends DateTime> authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = authoredOn.orElse(null);
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(SupplyrequestStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends SupplyrequestStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
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
     * Initializes the optional value {@link SupplyRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
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
     * Initializes the optional value {@link SupplyRequest#deliverFrom() deliverFrom} to deliverFrom.
     * @param deliverFrom The value for deliverFrom
     * @return {@code this} builder for chained invocation
     */
    public final Builder deliverFrom(Reference deliverFrom) {
      checkNotIsSet(deliverFromIsSet(), "deliverFrom");
      this.deliverFrom = Objects.requireNonNull(deliverFrom, "deliverFrom");
      optBits |= OPT_BIT_DELIVER_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#deliverFrom() deliverFrom} to deliverFrom.
     * @param deliverFrom The value for deliverFrom
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("deliverFrom")
    public final Builder deliverFrom(Optional<? extends Reference> deliverFrom) {
      checkNotIsSet(deliverFromIsSet(), "deliverFrom");
      this.deliverFrom = deliverFrom.orElse(null);
      optBits |= OPT_BIT_DELIVER_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link SupplyRequest#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link SupplyRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
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
     * Initializes the optional value {@link SupplyRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
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
     * Initializes the optional value {@link SupplyRequest#deliverTo() deliverTo} to deliverTo.
     * @param deliverTo The value for deliverTo
     * @return {@code this} builder for chained invocation
     */
    public final Builder deliverTo(Reference deliverTo) {
      checkNotIsSet(deliverToIsSet(), "deliverTo");
      this.deliverTo = Objects.requireNonNull(deliverTo, "deliverTo");
      optBits |= OPT_BIT_DELIVER_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#deliverTo() deliverTo} to deliverTo.
     * @param deliverTo The value for deliverTo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("deliverTo")
    public final Builder deliverTo(Optional<? extends Reference> deliverTo) {
      checkNotIsSet(deliverToIsSet(), "deliverTo");
      this.deliverTo = deliverTo.orElse(null);
      optBits |= OPT_BIT_DELIVER_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(Code priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priority")
    public final Builder priority(Optional<? extends Code> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    public final Builder requester(Reference requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = Objects.requireNonNull(requester, "requester");
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requester")
    public final Builder requester(Optional<? extends Reference> requester) {
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
    public SupplyRequest build() {
      checkRequiredAttributes();
      return new ImmutableSupplyRequest(
          contained,
          itemReference,
          quantity,
          implicitRules,
          text,
          meta,
          reasonReference,
          itemCodeableConcept,
          parameter,
          modifierExtension,
          identifier,
          language,
          resourceType,
          extension,
          supplier,
          id,
          category,
          occurrenceDateTime,
          authoredOn,
          status,
          occurrencePeriod,
          deliverFrom,
          reasonCode,
          occurrenceTiming,
          deliverTo,
          priority,
          requester);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean itemReferenceIsSet() {
      return (optBits & OPT_BIT_ITEM_REFERENCE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean itemCodeableConceptIsSet() {
      return (optBits & OPT_BIT_ITEM_CODEABLE_CONCEPT) != 0;
    }

    private boolean parameterIsSet() {
      return (optBits & OPT_BIT_PARAMETER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean supplierIsSet() {
      return (optBits & OPT_BIT_SUPPLIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean authoredOnIsSet() {
      return (optBits & OPT_BIT_AUTHORED_ON) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean occurrencePeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_PERIOD) != 0;
    }

    private boolean deliverFromIsSet() {
      return (optBits & OPT_BIT_DELIVER_FROM) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean occurrenceTimingIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_TIMING) != 0;
    }

    private boolean deliverToIsSet() {
      return (optBits & OPT_BIT_DELIVER_TO) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
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
      if (isSet) throw new IllegalStateException("Builder of SupplyRequest is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!quantityIsSet()) attributes.add("quantity");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SupplyRequest, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "SupplyRequest", generator = "Immutables")
  public interface QuantityBuildStage {
    /**
     * Initializes the value for the {@link SupplyRequest#quantity() quantity} attribute.
     * @param quantity The value for quantity 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage quantity(Quantity quantity);
  }

  @Generated(from = "SupplyRequest", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SupplyRequest#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "SupplyRequest", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SupplyRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link SupplyRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link SupplyRequest#itemReference() itemReference} to itemReference.
     * @param itemReference The value for itemReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal itemReference(Reference itemReference);

    /**
     * Initializes the optional value {@link SupplyRequest#itemReference() itemReference} to itemReference.
     * @param itemReference The value for itemReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal itemReference(Optional<? extends Reference> itemReference);

    /**
     * Initializes the optional value {@link SupplyRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link SupplyRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link SupplyRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link SupplyRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link SupplyRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link SupplyRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link SupplyRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link SupplyRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link SupplyRequest#itemCodeableConcept() itemCodeableConcept} to itemCodeableConcept.
     * @param itemCodeableConcept The value for itemCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal itemCodeableConcept(CodeableConcept itemCodeableConcept);

    /**
     * Initializes the optional value {@link SupplyRequest#itemCodeableConcept() itemCodeableConcept} to itemCodeableConcept.
     * @param itemCodeableConcept The value for itemCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal itemCodeableConcept(Optional<? extends CodeableConcept> itemCodeableConcept);

    /**
     * Initializes the optional value {@link SupplyRequest#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parameter(List<SupplyRequest_Parameter> parameter);

    /**
     * Initializes the optional value {@link SupplyRequest#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parameter(Optional<? extends List<SupplyRequest_Parameter>> parameter);

    /**
     * Initializes the optional value {@link SupplyRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SupplyRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SupplyRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link SupplyRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link SupplyRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link SupplyRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link SupplyRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link SupplyRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link SupplyRequest#supplier() supplier} to supplier.
     * @param supplier The value for supplier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supplier(List<Reference> supplier);

    /**
     * Initializes the optional value {@link SupplyRequest#supplier() supplier} to supplier.
     * @param supplier The value for supplier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supplier(Optional<? extends List<Reference>> supplier);

    /**
     * Initializes the optional value {@link SupplyRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link SupplyRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link SupplyRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(CodeableConcept category);

    /**
     * Initializes the optional value {@link SupplyRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends CodeableConcept> category);

    /**
     * Initializes the optional value {@link SupplyRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(String occurrenceDateTime);

    /**
     * Initializes the optional value {@link SupplyRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(Optional<String> occurrenceDateTime);

    /**
     * Initializes the optional value {@link SupplyRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authoredOn(DateTime authoredOn);

    /**
     * Initializes the optional value {@link SupplyRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authoredOn(Optional<? extends DateTime> authoredOn);

    /**
     * Initializes the optional value {@link SupplyRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(SupplyrequestStatus status);

    /**
     * Initializes the optional value {@link SupplyRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends SupplyrequestStatus> status);

    /**
     * Initializes the optional value {@link SupplyRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrencePeriod(Period occurrencePeriod);

    /**
     * Initializes the optional value {@link SupplyRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrencePeriod(Optional<? extends Period> occurrencePeriod);

    /**
     * Initializes the optional value {@link SupplyRequest#deliverFrom() deliverFrom} to deliverFrom.
     * @param deliverFrom The value for deliverFrom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deliverFrom(Reference deliverFrom);

    /**
     * Initializes the optional value {@link SupplyRequest#deliverFrom() deliverFrom} to deliverFrom.
     * @param deliverFrom The value for deliverFrom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deliverFrom(Optional<? extends Reference> deliverFrom);

    /**
     * Initializes the optional value {@link SupplyRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link SupplyRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link SupplyRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceTiming(Timing occurrenceTiming);

    /**
     * Initializes the optional value {@link SupplyRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceTiming(Optional<? extends Timing> occurrenceTiming);

    /**
     * Initializes the optional value {@link SupplyRequest#deliverTo() deliverTo} to deliverTo.
     * @param deliverTo The value for deliverTo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deliverTo(Reference deliverTo);

    /**
     * Initializes the optional value {@link SupplyRequest#deliverTo() deliverTo} to deliverTo.
     * @param deliverTo The value for deliverTo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deliverTo(Optional<? extends Reference> deliverTo);

    /**
     * Initializes the optional value {@link SupplyRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(Code priority);

    /**
     * Initializes the optional value {@link SupplyRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(Optional<? extends Code> priority);

    /**
     * Initializes the optional value {@link SupplyRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requester(Reference requester);

    /**
     * Initializes the optional value {@link SupplyRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requester(Optional<? extends Reference> requester);

    /**
     * Builds a new {@link SupplyRequest SupplyRequest}.
     * @return An immutable instance of SupplyRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SupplyRequest build();
  }
}
