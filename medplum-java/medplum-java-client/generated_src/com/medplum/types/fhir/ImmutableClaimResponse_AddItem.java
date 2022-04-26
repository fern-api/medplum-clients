package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ClaimResponse_AddItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaimResponse_AddItem.builder()}.
 */
@Generated(from = "ClaimResponse_AddItem", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaimResponse_AddItem implements ClaimResponse_AddItem {
  private final @Nullable Money net;
  private final @Nullable List<PositiveInt> itemSequence;
  private final @Nullable List<CodeableConcept> modifier;
  private final @Nullable Quantity quantity;
  private final @Nullable List<CodeableConcept> subSite;
  private final @Nullable CodeableConcept locationCodeableConcept;
  private final @Nullable String id;
  private final @Nullable List<PositiveInt> detailSequence;
  private final @Nullable List<CodeableConcept> programCode;
  private final @Nullable List<PositiveInt> subdetailSequence;
  private final @Nullable Decimal factor;
  private final @Nullable Address locationAddress;
  private final @Nullable String servicedDate;
  private final @Nullable List<Reference> provider;
  private final @Nullable List<Extension> modifierExtension;
  private final List<ClaimResponse_Adjudication> adjudication;
  private final @Nullable CodeableConcept bodySite;
  private final @Nullable List<PositiveInt> noteNumber;
  private final @Nullable List<ClaimResponse_Detail1> detail;
  private final CodeableConcept productOrService;
  private final @Nullable Period servicedPeriod;
  private final @Nullable Reference locationReference;
  private final @Nullable Money unitPrice;
  private final @Nullable List<Extension> extension;

  private ImmutableClaimResponse_AddItem(
      @Nullable Money net,
      @Nullable List<PositiveInt> itemSequence,
      @Nullable List<CodeableConcept> modifier,
      @Nullable Quantity quantity,
      @Nullable List<CodeableConcept> subSite,
      @Nullable CodeableConcept locationCodeableConcept,
      @Nullable String id,
      @Nullable List<PositiveInt> detailSequence,
      @Nullable List<CodeableConcept> programCode,
      @Nullable List<PositiveInt> subdetailSequence,
      @Nullable Decimal factor,
      @Nullable Address locationAddress,
      @Nullable String servicedDate,
      @Nullable List<Reference> provider,
      @Nullable List<Extension> modifierExtension,
      List<ClaimResponse_Adjudication> adjudication,
      @Nullable CodeableConcept bodySite,
      @Nullable List<PositiveInt> noteNumber,
      @Nullable List<ClaimResponse_Detail1> detail,
      CodeableConcept productOrService,
      @Nullable Period servicedPeriod,
      @Nullable Reference locationReference,
      @Nullable Money unitPrice,
      @Nullable List<Extension> extension) {
    this.net = net;
    this.itemSequence = itemSequence;
    this.modifier = modifier;
    this.quantity = quantity;
    this.subSite = subSite;
    this.locationCodeableConcept = locationCodeableConcept;
    this.id = id;
    this.detailSequence = detailSequence;
    this.programCode = programCode;
    this.subdetailSequence = subdetailSequence;
    this.factor = factor;
    this.locationAddress = locationAddress;
    this.servicedDate = servicedDate;
    this.provider = provider;
    this.modifierExtension = modifierExtension;
    this.adjudication = adjudication;
    this.bodySite = bodySite;
    this.noteNumber = noteNumber;
    this.detail = detail;
    this.productOrService = productOrService;
    this.servicedPeriod = servicedPeriod;
    this.locationReference = locationReference;
    this.unitPrice = unitPrice;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code net} attribute
   */
  @JsonProperty("net")
  @Override
  public Optional<Money> net() {
    return Optional.ofNullable(net);
  }

  /**
   * @return The value of the {@code itemSequence} attribute
   */
  @JsonProperty("itemSequence")
  @Override
  public Optional<List<PositiveInt>> itemSequence() {
    return Optional.ofNullable(itemSequence);
  }

  /**
   * @return The value of the {@code modifier} attribute
   */
  @JsonProperty("modifier")
  @Override
  public Optional<List<CodeableConcept>> modifier() {
    return Optional.ofNullable(modifier);
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
   * @return The value of the {@code subSite} attribute
   */
  @JsonProperty("subSite")
  @Override
  public Optional<List<CodeableConcept>> subSite() {
    return Optional.ofNullable(subSite);
  }

  /**
   * @return The value of the {@code locationCodeableConcept} attribute
   */
  @JsonProperty("locationCodeableConcept")
  @Override
  public Optional<CodeableConcept> locationCodeableConcept() {
    return Optional.ofNullable(locationCodeableConcept);
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
   * @return The value of the {@code detailSequence} attribute
   */
  @JsonProperty("detailSequence")
  @Override
  public Optional<List<PositiveInt>> detailSequence() {
    return Optional.ofNullable(detailSequence);
  }

  /**
   * @return The value of the {@code programCode} attribute
   */
  @JsonProperty("programCode")
  @Override
  public Optional<List<CodeableConcept>> programCode() {
    return Optional.ofNullable(programCode);
  }

  /**
   * @return The value of the {@code subdetailSequence} attribute
   */
  @JsonProperty("subdetailSequence")
  @Override
  public Optional<List<PositiveInt>> subdetailSequence() {
    return Optional.ofNullable(subdetailSequence);
  }

  /**
   * @return The value of the {@code factor} attribute
   */
  @JsonProperty("factor")
  @Override
  public Optional<Decimal> factor() {
    return Optional.ofNullable(factor);
  }

  /**
   * @return The value of the {@code locationAddress} attribute
   */
  @JsonProperty("locationAddress")
  @Override
  public Optional<Address> locationAddress() {
    return Optional.ofNullable(locationAddress);
  }

  /**
   * @return The value of the {@code servicedDate} attribute
   */
  @JsonProperty("servicedDate")
  @Override
  public Optional<String> servicedDate() {
    return Optional.ofNullable(servicedDate);
  }

  /**
   * @return The value of the {@code provider} attribute
   */
  @JsonProperty("provider")
  @Override
  public Optional<List<Reference>> provider() {
    return Optional.ofNullable(provider);
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
   * @return The value of the {@code adjudication} attribute
   */
  @JsonProperty("adjudication")
  @Override
  public List<ClaimResponse_Adjudication> adjudication() {
    return adjudication;
  }

  /**
   * @return The value of the {@code bodySite} attribute
   */
  @JsonProperty("bodySite")
  @Override
  public Optional<CodeableConcept> bodySite() {
    return Optional.ofNullable(bodySite);
  }

  /**
   * @return The value of the {@code noteNumber} attribute
   */
  @JsonProperty("noteNumber")
  @Override
  public Optional<List<PositiveInt>> noteNumber() {
    return Optional.ofNullable(noteNumber);
  }

  /**
   * @return The value of the {@code detail} attribute
   */
  @JsonProperty("detail")
  @Override
  public Optional<List<ClaimResponse_Detail1>> detail() {
    return Optional.ofNullable(detail);
  }

  /**
   * @return The value of the {@code productOrService} attribute
   */
  @JsonProperty("productOrService")
  @Override
  public CodeableConcept productOrService() {
    return productOrService;
  }

  /**
   * @return The value of the {@code servicedPeriod} attribute
   */
  @JsonProperty("servicedPeriod")
  @Override
  public Optional<Period> servicedPeriod() {
    return Optional.ofNullable(servicedPeriod);
  }

  /**
   * @return The value of the {@code locationReference} attribute
   */
  @JsonProperty("locationReference")
  @Override
  public Optional<Reference> locationReference() {
    return Optional.ofNullable(locationReference);
  }

  /**
   * @return The value of the {@code unitPrice} attribute
   */
  @JsonProperty("unitPrice")
  @Override
  public Optional<Money> unitPrice() {
    return Optional.ofNullable(unitPrice);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#net() net} attribute.
   * @param value The value for net
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withNet(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "net");
    if (this.net == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        newValue,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#net() net} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for net
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withNet(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.net == value) return this;
    return new ImmutableClaimResponse_AddItem(
        value,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#itemSequence() itemSequence} attribute.
   * @param value The value for itemSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withItemSequence(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "itemSequence");
    if (this.itemSequence == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        newValue,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#itemSequence() itemSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for itemSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withItemSequence(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.itemSequence == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        value,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#modifier() modifier} attribute.
   * @param value The value for modifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withModifier(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "modifier");
    if (this.modifier == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        newValue,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#modifier() modifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withModifier(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.modifier == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        value,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        newValue,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        value,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#subSite() subSite} attribute.
   * @param value The value for subSite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withSubSite(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "subSite");
    if (this.subSite == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        newValue,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#subSite() subSite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subSite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withSubSite(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.subSite == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        value,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#locationCodeableConcept() locationCodeableConcept} attribute.
   * @param value The value for locationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withLocationCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "locationCodeableConcept");
    if (this.locationCodeableConcept == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        newValue,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#locationCodeableConcept() locationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withLocationCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.locationCodeableConcept == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        value,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        newValue,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        value,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#detailSequence() detailSequence} attribute.
   * @param value The value for detailSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withDetailSequence(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "detailSequence");
    if (this.detailSequence == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        newValue,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#detailSequence() detailSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detailSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withDetailSequence(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.detailSequence == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        value,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#programCode() programCode} attribute.
   * @param value The value for programCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withProgramCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "programCode");
    if (this.programCode == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        newValue,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#programCode() programCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for programCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withProgramCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.programCode == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        value,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#subdetailSequence() subdetailSequence} attribute.
   * @param value The value for subdetailSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withSubdetailSequence(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "subdetailSequence");
    if (this.subdetailSequence == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        newValue,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#subdetailSequence() subdetailSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subdetailSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withSubdetailSequence(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.subdetailSequence == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        value,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withFactor(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        newValue,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withFactor(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        value,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#locationAddress() locationAddress} attribute.
   * @param value The value for locationAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withLocationAddress(Address value) {
    @Nullable Address newValue = Objects.requireNonNull(value, "locationAddress");
    if (this.locationAddress == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        newValue,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#locationAddress() locationAddress} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationAddress
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withLocationAddress(Optional<? extends Address> optional) {
    @Nullable Address value = optional.orElse(null);
    if (this.locationAddress == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        value,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#servicedDate() servicedDate} attribute.
   * @param value The value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withServicedDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "servicedDate");
    if (Objects.equals(this.servicedDate, newValue)) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        newValue,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#servicedDate() servicedDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withServicedDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.servicedDate, value)) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        value,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#provider() provider} attribute.
   * @param value The value for provider
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withProvider(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "provider");
    if (this.provider == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        newValue,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#provider() provider} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for provider
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withProvider(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.provider == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        value,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        newValue,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        value,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClaimResponse_AddItem#adjudication() adjudication}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withAdjudication(ClaimResponse_Adjudication... elements) {
    List<ClaimResponse_Adjudication> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        newValue,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClaimResponse_AddItem#adjudication() adjudication}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of adjudication elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withAdjudication(Iterable<? extends ClaimResponse_Adjudication> elements) {
    if (this.adjudication == elements) return this;
    List<ClaimResponse_Adjudication> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        newValue,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withBodySite(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        newValue,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withBodySite(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        value,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#noteNumber() noteNumber} attribute.
   * @param value The value for noteNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withNoteNumber(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "noteNumber");
    if (this.noteNumber == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        newValue,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#noteNumber() noteNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for noteNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withNoteNumber(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.noteNumber == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        value,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withDetail(List<ClaimResponse_Detail1> value) {
    @Nullable List<ClaimResponse_Detail1> newValue = Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        newValue,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withDetail(Optional<? extends List<ClaimResponse_Detail1>> optional) {
    @Nullable List<ClaimResponse_Detail1> value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        value,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse_AddItem#productOrService() productOrService} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for productOrService
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withProductOrService(CodeableConcept value) {
    if (this.productOrService == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "productOrService");
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        newValue,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#servicedPeriod() servicedPeriod} attribute.
   * @param value The value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withServicedPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "servicedPeriod");
    if (this.servicedPeriod == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        newValue,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#servicedPeriod() servicedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withServicedPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.servicedPeriod == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        value,
        this.locationReference,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#locationReference() locationReference} attribute.
   * @param value The value for locationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withLocationReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "locationReference");
    if (this.locationReference == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        newValue,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#locationReference() locationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withLocationReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.locationReference == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        value,
        this.unitPrice,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#unitPrice() unitPrice} attribute.
   * @param value The value for unitPrice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withUnitPrice(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "unitPrice");
    if (this.unitPrice == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#unitPrice() unitPrice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitPrice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withUnitPrice(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.unitPrice == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_AddItem#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_AddItem#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_AddItem withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaimResponse_AddItem(
        this.net,
        this.itemSequence,
        this.modifier,
        this.quantity,
        this.subSite,
        this.locationCodeableConcept,
        this.id,
        this.detailSequence,
        this.programCode,
        this.subdetailSequence,
        this.factor,
        this.locationAddress,
        this.servicedDate,
        this.provider,
        this.modifierExtension,
        this.adjudication,
        this.bodySite,
        this.noteNumber,
        this.detail,
        this.productOrService,
        this.servicedPeriod,
        this.locationReference,
        this.unitPrice,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaimResponse_AddItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaimResponse_AddItem
        && equalTo((ImmutableClaimResponse_AddItem) another);
  }

  private boolean equalTo(ImmutableClaimResponse_AddItem another) {
    return Objects.equals(net, another.net)
        && Objects.equals(itemSequence, another.itemSequence)
        && Objects.equals(modifier, another.modifier)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(subSite, another.subSite)
        && Objects.equals(locationCodeableConcept, another.locationCodeableConcept)
        && Objects.equals(id, another.id)
        && Objects.equals(detailSequence, another.detailSequence)
        && Objects.equals(programCode, another.programCode)
        && Objects.equals(subdetailSequence, another.subdetailSequence)
        && Objects.equals(factor, another.factor)
        && Objects.equals(locationAddress, another.locationAddress)
        && Objects.equals(servicedDate, another.servicedDate)
        && Objects.equals(provider, another.provider)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && adjudication.equals(another.adjudication)
        && Objects.equals(bodySite, another.bodySite)
        && Objects.equals(noteNumber, another.noteNumber)
        && Objects.equals(detail, another.detail)
        && productOrService.equals(another.productOrService)
        && Objects.equals(servicedPeriod, another.servicedPeriod)
        && Objects.equals(locationReference, another.locationReference)
        && Objects.equals(unitPrice, another.unitPrice)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code net}, {@code itemSequence}, {@code modifier}, {@code quantity}, {@code subSite}, {@code locationCodeableConcept}, {@code id}, {@code detailSequence}, {@code programCode}, {@code subdetailSequence}, {@code factor}, {@code locationAddress}, {@code servicedDate}, {@code provider}, {@code modifierExtension}, {@code adjudication}, {@code bodySite}, {@code noteNumber}, {@code detail}, {@code productOrService}, {@code servicedPeriod}, {@code locationReference}, {@code unitPrice}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(net);
    h += (h << 5) + Objects.hashCode(itemSequence);
    h += (h << 5) + Objects.hashCode(modifier);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(subSite);
    h += (h << 5) + Objects.hashCode(locationCodeableConcept);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(detailSequence);
    h += (h << 5) + Objects.hashCode(programCode);
    h += (h << 5) + Objects.hashCode(subdetailSequence);
    h += (h << 5) + Objects.hashCode(factor);
    h += (h << 5) + Objects.hashCode(locationAddress);
    h += (h << 5) + Objects.hashCode(servicedDate);
    h += (h << 5) + Objects.hashCode(provider);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + adjudication.hashCode();
    h += (h << 5) + Objects.hashCode(bodySite);
    h += (h << 5) + Objects.hashCode(noteNumber);
    h += (h << 5) + Objects.hashCode(detail);
    h += (h << 5) + productOrService.hashCode();
    h += (h << 5) + Objects.hashCode(servicedPeriod);
    h += (h << 5) + Objects.hashCode(locationReference);
    h += (h << 5) + Objects.hashCode(unitPrice);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code ClaimResponse_AddItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ClaimResponse_AddItem{");
    if (net != null) {
      builder.append("net=").append(net);
    }
    if (itemSequence != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("itemSequence=").append(itemSequence);
    }
    if (modifier != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifier=").append(modifier);
    }
    if (quantity != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (subSite != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("subSite=").append(subSite);
    }
    if (locationCodeableConcept != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("locationCodeableConcept=").append(locationCodeableConcept);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (detailSequence != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("detailSequence=").append(detailSequence);
    }
    if (programCode != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("programCode=").append(programCode);
    }
    if (subdetailSequence != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("subdetailSequence=").append(subdetailSequence);
    }
    if (factor != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("factor=").append(factor);
    }
    if (locationAddress != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("locationAddress=").append(locationAddress);
    }
    if (servicedDate != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("servicedDate=").append(servicedDate);
    }
    if (provider != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("provider=").append(provider);
    }
    if (modifierExtension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("adjudication=").append(adjudication);
    if (bodySite != null) {
      builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (noteNumber != null) {
      builder.append(", ");
      builder.append("noteNumber=").append(noteNumber);
    }
    if (detail != null) {
      builder.append(", ");
      builder.append("detail=").append(detail);
    }
    builder.append(", ");
    builder.append("productOrService=").append(productOrService);
    if (servicedPeriod != null) {
      builder.append(", ");
      builder.append("servicedPeriod=").append(servicedPeriod);
    }
    if (locationReference != null) {
      builder.append(", ");
      builder.append("locationReference=").append(locationReference);
    }
    if (unitPrice != null) {
      builder.append(", ");
      builder.append("unitPrice=").append(unitPrice);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ClaimResponse_AddItem", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ClaimResponse_AddItem {
    @Nullable Optional<Money> net = Optional.empty();
    boolean netIsSet;
    @Nullable Optional<List<PositiveInt>> itemSequence = Optional.empty();
    boolean itemSequenceIsSet;
    @Nullable Optional<List<CodeableConcept>> modifier = Optional.empty();
    boolean modifierIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<List<CodeableConcept>> subSite = Optional.empty();
    boolean subSiteIsSet;
    @Nullable Optional<CodeableConcept> locationCodeableConcept = Optional.empty();
    boolean locationCodeableConceptIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<PositiveInt>> detailSequence = Optional.empty();
    boolean detailSequenceIsSet;
    @Nullable Optional<List<CodeableConcept>> programCode = Optional.empty();
    boolean programCodeIsSet;
    @Nullable Optional<List<PositiveInt>> subdetailSequence = Optional.empty();
    boolean subdetailSequenceIsSet;
    @Nullable Optional<Decimal> factor = Optional.empty();
    boolean factorIsSet;
    @Nullable Optional<Address> locationAddress = Optional.empty();
    boolean locationAddressIsSet;
    @Nullable Optional<String> servicedDate = Optional.empty();
    boolean servicedDateIsSet;
    @Nullable Optional<List<Reference>> provider = Optional.empty();
    boolean providerIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable List<ClaimResponse_Adjudication> adjudication = Collections.emptyList();
    @Nullable Optional<CodeableConcept> bodySite = Optional.empty();
    boolean bodySiteIsSet;
    @Nullable Optional<List<PositiveInt>> noteNumber = Optional.empty();
    boolean noteNumberIsSet;
    @Nullable Optional<List<ClaimResponse_Detail1>> detail = Optional.empty();
    boolean detailIsSet;
    @Nullable CodeableConcept productOrService;
    @Nullable Optional<Period> servicedPeriod = Optional.empty();
    boolean servicedPeriodIsSet;
    @Nullable Optional<Reference> locationReference = Optional.empty();
    boolean locationReferenceIsSet;
    @Nullable Optional<Money> unitPrice = Optional.empty();
    boolean unitPriceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("net")
    public void setNet(Optional<Money> net) {
      this.net = net;
      this.netIsSet = true;
    }
    @JsonProperty("itemSequence")
    public void setItemSequence(Optional<List<PositiveInt>> itemSequence) {
      this.itemSequence = itemSequence;
      this.itemSequenceIsSet = true;
    }
    @JsonProperty("modifier")
    public void setModifier(Optional<List<CodeableConcept>> modifier) {
      this.modifier = modifier;
      this.modifierIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("subSite")
    public void setSubSite(Optional<List<CodeableConcept>> subSite) {
      this.subSite = subSite;
      this.subSiteIsSet = true;
    }
    @JsonProperty("locationCodeableConcept")
    public void setLocationCodeableConcept(Optional<CodeableConcept> locationCodeableConcept) {
      this.locationCodeableConcept = locationCodeableConcept;
      this.locationCodeableConceptIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("detailSequence")
    public void setDetailSequence(Optional<List<PositiveInt>> detailSequence) {
      this.detailSequence = detailSequence;
      this.detailSequenceIsSet = true;
    }
    @JsonProperty("programCode")
    public void setProgramCode(Optional<List<CodeableConcept>> programCode) {
      this.programCode = programCode;
      this.programCodeIsSet = true;
    }
    @JsonProperty("subdetailSequence")
    public void setSubdetailSequence(Optional<List<PositiveInt>> subdetailSequence) {
      this.subdetailSequence = subdetailSequence;
      this.subdetailSequenceIsSet = true;
    }
    @JsonProperty("factor")
    public void setFactor(Optional<Decimal> factor) {
      this.factor = factor;
      this.factorIsSet = true;
    }
    @JsonProperty("locationAddress")
    public void setLocationAddress(Optional<Address> locationAddress) {
      this.locationAddress = locationAddress;
      this.locationAddressIsSet = true;
    }
    @JsonProperty("servicedDate")
    public void setServicedDate(Optional<String> servicedDate) {
      this.servicedDate = servicedDate;
      this.servicedDateIsSet = true;
    }
    @JsonProperty("provider")
    public void setProvider(Optional<List<Reference>> provider) {
      this.provider = provider;
      this.providerIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("adjudication")
    public void setAdjudication(List<ClaimResponse_Adjudication> adjudication) {
      this.adjudication = adjudication;
    }
    @JsonProperty("bodySite")
    public void setBodySite(Optional<CodeableConcept> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @JsonProperty("noteNumber")
    public void setNoteNumber(Optional<List<PositiveInt>> noteNumber) {
      this.noteNumber = noteNumber;
      this.noteNumberIsSet = true;
    }
    @JsonProperty("detail")
    public void setDetail(Optional<List<ClaimResponse_Detail1>> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @JsonProperty("productOrService")
    public void setProductOrService(CodeableConcept productOrService) {
      this.productOrService = productOrService;
    }
    @JsonProperty("servicedPeriod")
    public void setServicedPeriod(Optional<Period> servicedPeriod) {
      this.servicedPeriod = servicedPeriod;
      this.servicedPeriodIsSet = true;
    }
    @JsonProperty("locationReference")
    public void setLocationReference(Optional<Reference> locationReference) {
      this.locationReference = locationReference;
      this.locationReferenceIsSet = true;
    }
    @JsonProperty("unitPrice")
    public void setUnitPrice(Optional<Money> unitPrice) {
      this.unitPrice = unitPrice;
      this.unitPriceIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<Money> net() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> itemSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> subSite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> locationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> detailSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> programCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> subdetailSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> factor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Address> locationAddress() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> servicedDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> provider() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public List<ClaimResponse_Adjudication> adjudication() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> noteNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ClaimResponse_Detail1>> detail() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept productOrService() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> servicedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> locationReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> unitPrice() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClaimResponse_AddItem fromJson(Json json) {
    ImmutableClaimResponse_AddItem.Builder builder = ((ImmutableClaimResponse_AddItem.Builder) ImmutableClaimResponse_AddItem.builder());
    if (json.netIsSet) {
      builder.net(json.net);
    }
    if (json.itemSequenceIsSet) {
      builder.itemSequence(json.itemSequence);
    }
    if (json.modifierIsSet) {
      builder.modifier(json.modifier);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.subSiteIsSet) {
      builder.subSite(json.subSite);
    }
    if (json.locationCodeableConceptIsSet) {
      builder.locationCodeableConcept(json.locationCodeableConcept);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.detailSequenceIsSet) {
      builder.detailSequence(json.detailSequence);
    }
    if (json.programCodeIsSet) {
      builder.programCode(json.programCode);
    }
    if (json.subdetailSequenceIsSet) {
      builder.subdetailSequence(json.subdetailSequence);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    if (json.locationAddressIsSet) {
      builder.locationAddress(json.locationAddress);
    }
    if (json.servicedDateIsSet) {
      builder.servicedDate(json.servicedDate);
    }
    if (json.providerIsSet) {
      builder.provider(json.provider);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.adjudication != null) {
      builder.addAllAdjudication(json.adjudication);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.noteNumberIsSet) {
      builder.noteNumber(json.noteNumber);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.productOrService != null) {
      builder.productOrService(json.productOrService);
    }
    if (json.servicedPeriodIsSet) {
      builder.servicedPeriod(json.servicedPeriod);
    }
    if (json.locationReferenceIsSet) {
      builder.locationReference(json.locationReference);
    }
    if (json.unitPriceIsSet) {
      builder.unitPrice(json.unitPrice);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableClaimResponse_AddItem) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClaimResponse_AddItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClaimResponse_AddItem instance
   */
  public static ClaimResponse_AddItem copyOf(ClaimResponse_AddItem instance) {
    if (instance instanceof ImmutableClaimResponse_AddItem) {
      return (ImmutableClaimResponse_AddItem) instance;
    }
    return ((ImmutableClaimResponse_AddItem.Builder) ImmutableClaimResponse_AddItem.builder())
        .net(instance.net())
        .itemSequence(instance.itemSequence())
        .modifier(instance.modifier())
        .quantity(instance.quantity())
        .subSite(instance.subSite())
        .locationCodeableConcept(instance.locationCodeableConcept())
        .id(instance.id())
        .detailSequence(instance.detailSequence())
        .programCode(instance.programCode())
        .subdetailSequence(instance.subdetailSequence())
        .factor(instance.factor())
        .locationAddress(instance.locationAddress())
        .servicedDate(instance.servicedDate())
        .provider(instance.provider())
        .modifierExtension(instance.modifierExtension())
        .addAllAdjudication(instance.adjudication())
        .bodySite(instance.bodySite())
        .noteNumber(instance.noteNumber())
        .detail(instance.detail())
        .productOrService(instance.productOrService())
        .servicedPeriod(instance.servicedPeriod())
        .locationReference(instance.locationReference())
        .unitPrice(instance.unitPrice())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link ClaimResponse_AddItem ClaimResponse_AddItem}.
   * <pre>
   * ImmutableClaimResponse_AddItem.builder()
   *    .net(com.medplum.types.fhir.Money) // optional {@link ClaimResponse_AddItem#net() net}
   *    .itemSequence(List&amp;lt;com.medplum.types.fhir.PositiveInt&amp;gt;) // optional {@link ClaimResponse_AddItem#itemSequence() itemSequence}
   *    .modifier(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ClaimResponse_AddItem#modifier() modifier}
   *    .quantity(com.medplum.types.fhir.Quantity) // optional {@link ClaimResponse_AddItem#quantity() quantity}
   *    .subSite(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ClaimResponse_AddItem#subSite() subSite}
   *    .locationCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link ClaimResponse_AddItem#locationCodeableConcept() locationCodeableConcept}
   *    .id(String) // optional {@link ClaimResponse_AddItem#id() id}
   *    .detailSequence(List&amp;lt;com.medplum.types.fhir.PositiveInt&amp;gt;) // optional {@link ClaimResponse_AddItem#detailSequence() detailSequence}
   *    .programCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ClaimResponse_AddItem#programCode() programCode}
   *    .subdetailSequence(List&amp;lt;com.medplum.types.fhir.PositiveInt&amp;gt;) // optional {@link ClaimResponse_AddItem#subdetailSequence() subdetailSequence}
   *    .factor(com.medplum.types.fhir.Decimal) // optional {@link ClaimResponse_AddItem#factor() factor}
   *    .locationAddress(com.medplum.types.fhir.Address) // optional {@link ClaimResponse_AddItem#locationAddress() locationAddress}
   *    .servicedDate(String) // optional {@link ClaimResponse_AddItem#servicedDate() servicedDate}
   *    .provider(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ClaimResponse_AddItem#provider() provider}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_AddItem#modifierExtension() modifierExtension}
   *    .addAdjudication|addAllAdjudication(com.medplum.types.fhir.ClaimResponse_Adjudication) // {@link ClaimResponse_AddItem#adjudication() adjudication} elements
   *    .bodySite(com.medplum.types.fhir.CodeableConcept) // optional {@link ClaimResponse_AddItem#bodySite() bodySite}
   *    .noteNumber(List&amp;lt;com.medplum.types.fhir.PositiveInt&amp;gt;) // optional {@link ClaimResponse_AddItem#noteNumber() noteNumber}
   *    .detail(List&amp;lt;com.medplum.types.fhir.ClaimResponse_Detail1&amp;gt;) // optional {@link ClaimResponse_AddItem#detail() detail}
   *    .productOrService(com.medplum.types.fhir.CodeableConcept) // required {@link ClaimResponse_AddItem#productOrService() productOrService}
   *    .servicedPeriod(com.medplum.types.fhir.Period) // optional {@link ClaimResponse_AddItem#servicedPeriod() servicedPeriod}
   *    .locationReference(com.medplum.types.fhir.Reference) // optional {@link ClaimResponse_AddItem#locationReference() locationReference}
   *    .unitPrice(com.medplum.types.fhir.Money) // optional {@link ClaimResponse_AddItem#unitPrice() unitPrice}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_AddItem#extension() extension}
   *    .build();
   * </pre>
   * @return A new ClaimResponse_AddItem builder
   */
  public static ProductOrServiceBuildStage builder() {
    return new ImmutableClaimResponse_AddItem.Builder();
  }

  /**
   * Builds instances of type {@link ClaimResponse_AddItem ClaimResponse_AddItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ClaimResponse_AddItem", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ProductOrServiceBuildStage, BuildFinal {
    private static final long INIT_BIT_PRODUCT_OR_SERVICE = 0x1L;
    private static final long OPT_BIT_NET = 0x1L;
    private static final long OPT_BIT_ITEM_SEQUENCE = 0x2L;
    private static final long OPT_BIT_MODIFIER = 0x4L;
    private static final long OPT_BIT_QUANTITY = 0x8L;
    private static final long OPT_BIT_SUB_SITE = 0x10L;
    private static final long OPT_BIT_LOCATION_CODEABLE_CONCEPT = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_DETAIL_SEQUENCE = 0x80L;
    private static final long OPT_BIT_PROGRAM_CODE = 0x100L;
    private static final long OPT_BIT_SUBDETAIL_SEQUENCE = 0x200L;
    private static final long OPT_BIT_FACTOR = 0x400L;
    private static final long OPT_BIT_LOCATION_ADDRESS = 0x800L;
    private static final long OPT_BIT_SERVICED_DATE = 0x1000L;
    private static final long OPT_BIT_PROVIDER = 0x2000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000L;
    private static final long OPT_BIT_BODY_SITE = 0x8000L;
    private static final long OPT_BIT_NOTE_NUMBER = 0x10000L;
    private static final long OPT_BIT_DETAIL = 0x20000L;
    private static final long OPT_BIT_SERVICED_PERIOD = 0x40000L;
    private static final long OPT_BIT_LOCATION_REFERENCE = 0x80000L;
    private static final long OPT_BIT_UNIT_PRICE = 0x100000L;
    private static final long OPT_BIT_EXTENSION = 0x200000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Money net;
    private @Nullable List<PositiveInt> itemSequence;
    private @Nullable List<CodeableConcept> modifier;
    private @Nullable Quantity quantity;
    private @Nullable List<CodeableConcept> subSite;
    private @Nullable CodeableConcept locationCodeableConcept;
    private @Nullable String id;
    private @Nullable List<PositiveInt> detailSequence;
    private @Nullable List<CodeableConcept> programCode;
    private @Nullable List<PositiveInt> subdetailSequence;
    private @Nullable Decimal factor;
    private @Nullable Address locationAddress;
    private @Nullable String servicedDate;
    private @Nullable List<Reference> provider;
    private @Nullable List<Extension> modifierExtension;
    private final List<ClaimResponse_Adjudication> adjudication = new ArrayList<ClaimResponse_Adjudication>();
    private @Nullable CodeableConcept bodySite;
    private @Nullable List<PositiveInt> noteNumber;
    private @Nullable List<ClaimResponse_Detail1> detail;
    private @Nullable CodeableConcept productOrService;
    private @Nullable Period servicedPeriod;
    private @Nullable Reference locationReference;
    private @Nullable Money unitPrice;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for chained invocation
     */
    public final Builder net(Money net) {
      checkNotIsSet(netIsSet(), "net");
      this.net = Objects.requireNonNull(net, "net");
      optBits |= OPT_BIT_NET;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("net")
    public final Builder net(Optional<? extends Money> net) {
      checkNotIsSet(netIsSet(), "net");
      this.net = net.orElse(null);
      optBits |= OPT_BIT_NET;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#itemSequence() itemSequence} to itemSequence.
     * @param itemSequence The value for itemSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder itemSequence(List<PositiveInt> itemSequence) {
      checkNotIsSet(itemSequenceIsSet(), "itemSequence");
      this.itemSequence = Objects.requireNonNull(itemSequence, "itemSequence");
      optBits |= OPT_BIT_ITEM_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#itemSequence() itemSequence} to itemSequence.
     * @param itemSequence The value for itemSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("itemSequence")
    public final Builder itemSequence(Optional<? extends List<PositiveInt>> itemSequence) {
      checkNotIsSet(itemSequenceIsSet(), "itemSequence");
      this.itemSequence = itemSequence.orElse(null);
      optBits |= OPT_BIT_ITEM_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifier(List<CodeableConcept> modifier) {
      checkNotIsSet(modifierIsSet(), "modifier");
      this.modifier = Objects.requireNonNull(modifier, "modifier");
      optBits |= OPT_BIT_MODIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifier")
    public final Builder modifier(Optional<? extends List<CodeableConcept>> modifier) {
      checkNotIsSet(modifierIsSet(), "modifier");
      this.modifier = modifier.orElse(null);
      optBits |= OPT_BIT_MODIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ClaimResponse_AddItem#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ClaimResponse_AddItem#subSite() subSite} to subSite.
     * @param subSite The value for subSite
     * @return {@code this} builder for chained invocation
     */
    public final Builder subSite(List<CodeableConcept> subSite) {
      checkNotIsSet(subSiteIsSet(), "subSite");
      this.subSite = Objects.requireNonNull(subSite, "subSite");
      optBits |= OPT_BIT_SUB_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#subSite() subSite} to subSite.
     * @param subSite The value for subSite
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subSite")
    public final Builder subSite(Optional<? extends List<CodeableConcept>> subSite) {
      checkNotIsSet(subSiteIsSet(), "subSite");
      this.subSite = subSite.orElse(null);
      optBits |= OPT_BIT_SUB_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
     * @param locationCodeableConcept The value for locationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder locationCodeableConcept(CodeableConcept locationCodeableConcept) {
      checkNotIsSet(locationCodeableConceptIsSet(), "locationCodeableConcept");
      this.locationCodeableConcept = Objects.requireNonNull(locationCodeableConcept, "locationCodeableConcept");
      optBits |= OPT_BIT_LOCATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
     * @param locationCodeableConcept The value for locationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("locationCodeableConcept")
    public final Builder locationCodeableConcept(Optional<? extends CodeableConcept> locationCodeableConcept) {
      checkNotIsSet(locationCodeableConceptIsSet(), "locationCodeableConcept");
      this.locationCodeableConcept = locationCodeableConcept.orElse(null);
      optBits |= OPT_BIT_LOCATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_AddItem#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_AddItem#detailSequence() detailSequence} to detailSequence.
     * @param detailSequence The value for detailSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder detailSequence(List<PositiveInt> detailSequence) {
      checkNotIsSet(detailSequenceIsSet(), "detailSequence");
      this.detailSequence = Objects.requireNonNull(detailSequence, "detailSequence");
      optBits |= OPT_BIT_DETAIL_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#detailSequence() detailSequence} to detailSequence.
     * @param detailSequence The value for detailSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detailSequence")
    public final Builder detailSequence(Optional<? extends List<PositiveInt>> detailSequence) {
      checkNotIsSet(detailSequenceIsSet(), "detailSequence");
      this.detailSequence = detailSequence.orElse(null);
      optBits |= OPT_BIT_DETAIL_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder programCode(List<CodeableConcept> programCode) {
      checkNotIsSet(programCodeIsSet(), "programCode");
      this.programCode = Objects.requireNonNull(programCode, "programCode");
      optBits |= OPT_BIT_PROGRAM_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("programCode")
    public final Builder programCode(Optional<? extends List<CodeableConcept>> programCode) {
      checkNotIsSet(programCodeIsSet(), "programCode");
      this.programCode = programCode.orElse(null);
      optBits |= OPT_BIT_PROGRAM_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#subdetailSequence() subdetailSequence} to subdetailSequence.
     * @param subdetailSequence The value for subdetailSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder subdetailSequence(List<PositiveInt> subdetailSequence) {
      checkNotIsSet(subdetailSequenceIsSet(), "subdetailSequence");
      this.subdetailSequence = Objects.requireNonNull(subdetailSequence, "subdetailSequence");
      optBits |= OPT_BIT_SUBDETAIL_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#subdetailSequence() subdetailSequence} to subdetailSequence.
     * @param subdetailSequence The value for subdetailSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subdetailSequence")
    public final Builder subdetailSequence(Optional<? extends List<PositiveInt>> subdetailSequence) {
      checkNotIsSet(subdetailSequenceIsSet(), "subdetailSequence");
      this.subdetailSequence = subdetailSequence.orElse(null);
      optBits |= OPT_BIT_SUBDETAIL_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    public final Builder factor(Decimal factor) {
      checkNotIsSet(factorIsSet(), "factor");
      this.factor = Objects.requireNonNull(factor, "factor");
      optBits |= OPT_BIT_FACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("factor")
    public final Builder factor(Optional<? extends Decimal> factor) {
      checkNotIsSet(factorIsSet(), "factor");
      this.factor = factor.orElse(null);
      optBits |= OPT_BIT_FACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for chained invocation
     */
    public final Builder locationAddress(Address locationAddress) {
      checkNotIsSet(locationAddressIsSet(), "locationAddress");
      this.locationAddress = Objects.requireNonNull(locationAddress, "locationAddress");
      optBits |= OPT_BIT_LOCATION_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("locationAddress")
    public final Builder locationAddress(Optional<? extends Address> locationAddress) {
      checkNotIsSet(locationAddressIsSet(), "locationAddress");
      this.locationAddress = locationAddress.orElse(null);
      optBits |= OPT_BIT_LOCATION_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder servicedDate(String servicedDate) {
      checkNotIsSet(servicedDateIsSet(), "servicedDate");
      this.servicedDate = Objects.requireNonNull(servicedDate, "servicedDate");
      optBits |= OPT_BIT_SERVICED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("servicedDate")
    public final Builder servicedDate(Optional<String> servicedDate) {
      checkNotIsSet(servicedDateIsSet(), "servicedDate");
      this.servicedDate = servicedDate.orElse(null);
      optBits |= OPT_BIT_SERVICED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    public final Builder provider(List<Reference> provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = Objects.requireNonNull(provider, "provider");
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provider")
    public final Builder provider(Optional<? extends List<Reference>> provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = provider.orElse(null);
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_AddItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Adds one element to {@link ClaimResponse_AddItem#adjudication() adjudication} list.
     * @param element A adjudication element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdjudication(ClaimResponse_Adjudication element) {
      this.adjudication.add(Objects.requireNonNull(element, "adjudication element"));
      return this;
    }

    /**
     * Adds elements to {@link ClaimResponse_AddItem#adjudication() adjudication} list.
     * @param elements An array of adjudication elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdjudication(ClaimResponse_Adjudication... elements) {
      for (ClaimResponse_Adjudication element : elements) {
        this.adjudication.add(Objects.requireNonNull(element, "adjudication element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link ClaimResponse_AddItem#adjudication() adjudication} list.
     * @param elements An iterable of adjudication elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAdjudication(Iterable<? extends ClaimResponse_Adjudication> elements) {
      for (ClaimResponse_Adjudication element : elements) {
        this.adjudication.add(Objects.requireNonNull(element, "adjudication element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    public final Builder bodySite(CodeableConcept bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = Objects.requireNonNull(bodySite, "bodySite");
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("bodySite")
    public final Builder bodySite(Optional<? extends CodeableConcept> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = bodySite.orElse(null);
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder noteNumber(List<PositiveInt> noteNumber) {
      checkNotIsSet(noteNumberIsSet(), "noteNumber");
      this.noteNumber = Objects.requireNonNull(noteNumber, "noteNumber");
      optBits |= OPT_BIT_NOTE_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("noteNumber")
    public final Builder noteNumber(Optional<? extends List<PositiveInt>> noteNumber) {
      checkNotIsSet(noteNumberIsSet(), "noteNumber");
      this.noteNumber = noteNumber.orElse(null);
      optBits |= OPT_BIT_NOTE_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(List<ClaimResponse_Detail1> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detail")
    public final Builder detail(Optional<? extends List<ClaimResponse_Detail1>> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the value for the {@link ClaimResponse_AddItem#productOrService() productOrService} attribute.
     * @param productOrService The value for productOrService 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productOrService")
    public final Builder productOrService(CodeableConcept productOrService) {
      checkNotIsSet(productOrServiceIsSet(), "productOrService");
      this.productOrService = Objects.requireNonNull(productOrService, "productOrService");
      initBits &= ~INIT_BIT_PRODUCT_OR_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder servicedPeriod(Period servicedPeriod) {
      checkNotIsSet(servicedPeriodIsSet(), "servicedPeriod");
      this.servicedPeriod = Objects.requireNonNull(servicedPeriod, "servicedPeriod");
      optBits |= OPT_BIT_SERVICED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("servicedPeriod")
    public final Builder servicedPeriod(Optional<? extends Period> servicedPeriod) {
      checkNotIsSet(servicedPeriodIsSet(), "servicedPeriod");
      this.servicedPeriod = servicedPeriod.orElse(null);
      optBits |= OPT_BIT_SERVICED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder locationReference(Reference locationReference) {
      checkNotIsSet(locationReferenceIsSet(), "locationReference");
      this.locationReference = Objects.requireNonNull(locationReference, "locationReference");
      optBits |= OPT_BIT_LOCATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("locationReference")
    public final Builder locationReference(Optional<? extends Reference> locationReference) {
      checkNotIsSet(locationReferenceIsSet(), "locationReference");
      this.locationReference = locationReference.orElse(null);
      optBits |= OPT_BIT_LOCATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for chained invocation
     */
    public final Builder unitPrice(Money unitPrice) {
      checkNotIsSet(unitPriceIsSet(), "unitPrice");
      this.unitPrice = Objects.requireNonNull(unitPrice, "unitPrice");
      optBits |= OPT_BIT_UNIT_PRICE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("unitPrice")
    public final Builder unitPrice(Optional<? extends Money> unitPrice) {
      checkNotIsSet(unitPriceIsSet(), "unitPrice");
      this.unitPrice = unitPrice.orElse(null);
      optBits |= OPT_BIT_UNIT_PRICE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_AddItem#extension() extension} to extension.
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
     * Builds a new {@link ClaimResponse_AddItem ClaimResponse_AddItem}.
     * @return An immutable instance of ClaimResponse_AddItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ClaimResponse_AddItem build() {
      checkRequiredAttributes();
      return new ImmutableClaimResponse_AddItem(
          net,
          itemSequence,
          modifier,
          quantity,
          subSite,
          locationCodeableConcept,
          id,
          detailSequence,
          programCode,
          subdetailSequence,
          factor,
          locationAddress,
          servicedDate,
          provider,
          modifierExtension,
          createUnmodifiableList(true, adjudication),
          bodySite,
          noteNumber,
          detail,
          productOrService,
          servicedPeriod,
          locationReference,
          unitPrice,
          extension);
    }

    private boolean netIsSet() {
      return (optBits & OPT_BIT_NET) != 0;
    }

    private boolean itemSequenceIsSet() {
      return (optBits & OPT_BIT_ITEM_SEQUENCE) != 0;
    }

    private boolean modifierIsSet() {
      return (optBits & OPT_BIT_MODIFIER) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean subSiteIsSet() {
      return (optBits & OPT_BIT_SUB_SITE) != 0;
    }

    private boolean locationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_LOCATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean detailSequenceIsSet() {
      return (optBits & OPT_BIT_DETAIL_SEQUENCE) != 0;
    }

    private boolean programCodeIsSet() {
      return (optBits & OPT_BIT_PROGRAM_CODE) != 0;
    }

    private boolean subdetailSequenceIsSet() {
      return (optBits & OPT_BIT_SUBDETAIL_SEQUENCE) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private boolean locationAddressIsSet() {
      return (optBits & OPT_BIT_LOCATION_ADDRESS) != 0;
    }

    private boolean servicedDateIsSet() {
      return (optBits & OPT_BIT_SERVICED_DATE) != 0;
    }

    private boolean providerIsSet() {
      return (optBits & OPT_BIT_PROVIDER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean noteNumberIsSet() {
      return (optBits & OPT_BIT_NOTE_NUMBER) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean servicedPeriodIsSet() {
      return (optBits & OPT_BIT_SERVICED_PERIOD) != 0;
    }

    private boolean locationReferenceIsSet() {
      return (optBits & OPT_BIT_LOCATION_REFERENCE) != 0;
    }

    private boolean unitPriceIsSet() {
      return (optBits & OPT_BIT_UNIT_PRICE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean productOrServiceIsSet() {
      return (initBits & INIT_BIT_PRODUCT_OR_SERVICE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ClaimResponse_AddItem is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!productOrServiceIsSet()) attributes.add("productOrService");
      return "Cannot build ClaimResponse_AddItem, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ClaimResponse_AddItem", generator = "Immutables")
  public interface ProductOrServiceBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse_AddItem#productOrService() productOrService} attribute.
     * @param productOrService The value for productOrService 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productOrService(CodeableConcept productOrService);
  }

  @Generated(from = "ClaimResponse_AddItem", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for chained invocation
     */
    BuildFinal net(Money net);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal net(Optional<? extends Money> net);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#itemSequence() itemSequence} to itemSequence.
     * @param itemSequence The value for itemSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal itemSequence(List<PositiveInt> itemSequence);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#itemSequence() itemSequence} to itemSequence.
     * @param itemSequence The value for itemSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal itemSequence(Optional<? extends List<PositiveInt>> itemSequence);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifier(List<CodeableConcept> modifier);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifier(Optional<? extends List<CodeableConcept>> modifier);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(Quantity quantity);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(Optional<? extends Quantity> quantity);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#subSite() subSite} to subSite.
     * @param subSite The value for subSite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subSite(List<CodeableConcept> subSite);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#subSite() subSite} to subSite.
     * @param subSite The value for subSite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subSite(Optional<? extends List<CodeableConcept>> subSite);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
     * @param locationCodeableConcept The value for locationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationCodeableConcept(CodeableConcept locationCodeableConcept);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
     * @param locationCodeableConcept The value for locationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationCodeableConcept(Optional<? extends CodeableConcept> locationCodeableConcept);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#detailSequence() detailSequence} to detailSequence.
     * @param detailSequence The value for detailSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detailSequence(List<PositiveInt> detailSequence);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#detailSequence() detailSequence} to detailSequence.
     * @param detailSequence The value for detailSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detailSequence(Optional<? extends List<PositiveInt>> detailSequence);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal programCode(List<CodeableConcept> programCode);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal programCode(Optional<? extends List<CodeableConcept>> programCode);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#subdetailSequence() subdetailSequence} to subdetailSequence.
     * @param subdetailSequence The value for subdetailSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subdetailSequence(List<PositiveInt> subdetailSequence);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#subdetailSequence() subdetailSequence} to subdetailSequence.
     * @param subdetailSequence The value for subdetailSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subdetailSequence(Optional<? extends List<PositiveInt>> subdetailSequence);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal factor(Decimal factor);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal factor(Optional<? extends Decimal> factor);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationAddress(Address locationAddress);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationAddress(Optional<? extends Address> locationAddress);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedDate(String servicedDate);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedDate(Optional<String> servicedDate);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    BuildFinal provider(List<Reference> provider);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal provider(Optional<? extends List<Reference>> provider);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Adds one element to {@link ClaimResponse_AddItem#adjudication() adjudication} list.
     * @param element A adjudication element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAdjudication(ClaimResponse_Adjudication element);

    /**
     * Adds elements to {@link ClaimResponse_AddItem#adjudication() adjudication} list.
     * @param elements An array of adjudication elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAdjudication(ClaimResponse_Adjudication... elements);

    /**
     * Adds elements to {@link ClaimResponse_AddItem#adjudication() adjudication} list.
     * @param elements An iterable of adjudication elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllAdjudication(Iterable<? extends ClaimResponse_Adjudication> elements);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(CodeableConcept bodySite);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(Optional<? extends CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal noteNumber(List<PositiveInt> noteNumber);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal noteNumber(Optional<? extends List<PositiveInt>> noteNumber);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detail(List<ClaimResponse_Detail1> detail);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detail(Optional<? extends List<ClaimResponse_Detail1>> detail);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedPeriod(Period servicedPeriod);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedPeriod(Optional<? extends Period> servicedPeriod);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationReference(Reference locationReference);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationReference(Optional<? extends Reference> locationReference);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unitPrice(Money unitPrice);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unitPrice(Optional<? extends Money> unitPrice);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ClaimResponse_AddItem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link ClaimResponse_AddItem ClaimResponse_AddItem}.
     * @return An immutable instance of ClaimResponse_AddItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ClaimResponse_AddItem build();
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
