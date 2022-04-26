package com.fhir.types.fhir;

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
  private final @Nullable List<PositiveInt> itemSequence;
  private final @Nullable String servicedDate;
  private final @Nullable CodeableConcept locationCodeableConcept;
  private final @Nullable List<CodeableConcept> modifier;
  private final @Nullable List<PositiveInt> detailSequence;
  private final @Nullable List<Reference> provider;
  private final @Nullable Quantity quantity;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<PositiveInt> subdetailSequence;
  private final @Nullable String id;
  private final @Nullable Money unitPrice;
  private final @Nullable Decimal factor;
  private final @Nullable CodeableConcept bodySite;
  private final @Nullable Period servicedPeriod;
  private final @Nullable Reference locationReference;
  private final @Nullable List<CodeableConcept> subSite;
  private final @Nullable List<PositiveInt> noteNumber;
  private final @Nullable List<CodeableConcept> programCode;
  private final @Nullable Money net;
  private final CodeableConcept productOrService;
  private final @Nullable Address locationAddress;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<ClaimResponse_Detail1> detail;
  private final List<ClaimResponse_Adjudication> adjudication;

  private ImmutableClaimResponse_AddItem(
      @Nullable List<PositiveInt> itemSequence,
      @Nullable String servicedDate,
      @Nullable CodeableConcept locationCodeableConcept,
      @Nullable List<CodeableConcept> modifier,
      @Nullable List<PositiveInt> detailSequence,
      @Nullable List<Reference> provider,
      @Nullable Quantity quantity,
      @Nullable List<Extension> extension,
      @Nullable List<PositiveInt> subdetailSequence,
      @Nullable String id,
      @Nullable Money unitPrice,
      @Nullable Decimal factor,
      @Nullable CodeableConcept bodySite,
      @Nullable Period servicedPeriod,
      @Nullable Reference locationReference,
      @Nullable List<CodeableConcept> subSite,
      @Nullable List<PositiveInt> noteNumber,
      @Nullable List<CodeableConcept> programCode,
      @Nullable Money net,
      CodeableConcept productOrService,
      @Nullable Address locationAddress,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<ClaimResponse_Detail1> detail,
      List<ClaimResponse_Adjudication> adjudication) {
    this.itemSequence = itemSequence;
    this.servicedDate = servicedDate;
    this.locationCodeableConcept = locationCodeableConcept;
    this.modifier = modifier;
    this.detailSequence = detailSequence;
    this.provider = provider;
    this.quantity = quantity;
    this.extension = extension;
    this.subdetailSequence = subdetailSequence;
    this.id = id;
    this.unitPrice = unitPrice;
    this.factor = factor;
    this.bodySite = bodySite;
    this.servicedPeriod = servicedPeriod;
    this.locationReference = locationReference;
    this.subSite = subSite;
    this.noteNumber = noteNumber;
    this.programCode = programCode;
    this.net = net;
    this.productOrService = productOrService;
    this.locationAddress = locationAddress;
    this.modifierExtension = modifierExtension;
    this.detail = detail;
    this.adjudication = adjudication;
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
   * @return The value of the {@code servicedDate} attribute
   */
  @JsonProperty("servicedDate")
  @Override
  public Optional<String> servicedDate() {
    return Optional.ofNullable(servicedDate);
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
   * @return The value of the {@code modifier} attribute
   */
  @JsonProperty("modifier")
  @Override
  public Optional<List<CodeableConcept>> modifier() {
    return Optional.ofNullable(modifier);
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
   * @return The value of the {@code provider} attribute
   */
  @JsonProperty("provider")
  @Override
  public Optional<List<Reference>> provider() {
    return Optional.ofNullable(provider);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code factor} attribute
   */
  @JsonProperty("factor")
  @Override
  public Optional<Decimal> factor() {
    return Optional.ofNullable(factor);
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
   * @return The value of the {@code subSite} attribute
   */
  @JsonProperty("subSite")
  @Override
  public Optional<List<CodeableConcept>> subSite() {
    return Optional.ofNullable(subSite);
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
   * @return The value of the {@code programCode} attribute
   */
  @JsonProperty("programCode")
  @Override
  public Optional<List<CodeableConcept>> programCode() {
    return Optional.ofNullable(programCode);
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
   * @return The value of the {@code productOrService} attribute
   */
  @JsonProperty("productOrService")
  @Override
  public CodeableConcept productOrService() {
    return productOrService;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code adjudication} attribute
   */
  @JsonProperty("adjudication")
  @Override
  public List<ClaimResponse_Adjudication> adjudication() {
    return adjudication;
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
        newValue,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        value,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        newValue,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        value,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        newValue,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        value,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        newValue,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        value,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        newValue,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        value,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        newValue,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        value,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        newValue,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        value,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        newValue,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        value,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        newValue,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        value,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        newValue,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        value,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        newValue,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        value,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        newValue,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        value,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        newValue,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        value,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        newValue,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        value,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        newValue,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        value,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        newValue,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        value,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        newValue,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        value,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        newValue,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        value,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        newValue,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        value,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        newValue,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        newValue,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        value,
        this.modifierExtension,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        newValue,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        value,
        this.detail,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        newValue,
        this.adjudication);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        value,
        this.adjudication);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClaimResponse_AddItem#adjudication() adjudication}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_AddItem withAdjudication(ClaimResponse_Adjudication... elements) {
    List<ClaimResponse_Adjudication> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableClaimResponse_AddItem(
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        newValue);
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
        this.itemSequence,
        this.servicedDate,
        this.locationCodeableConcept,
        this.modifier,
        this.detailSequence,
        this.provider,
        this.quantity,
        this.extension,
        this.subdetailSequence,
        this.id,
        this.unitPrice,
        this.factor,
        this.bodySite,
        this.servicedPeriod,
        this.locationReference,
        this.subSite,
        this.noteNumber,
        this.programCode,
        this.net,
        this.productOrService,
        this.locationAddress,
        this.modifierExtension,
        this.detail,
        newValue);
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
    return Objects.equals(itemSequence, another.itemSequence)
        && Objects.equals(servicedDate, another.servicedDate)
        && Objects.equals(locationCodeableConcept, another.locationCodeableConcept)
        && Objects.equals(modifier, another.modifier)
        && Objects.equals(detailSequence, another.detailSequence)
        && Objects.equals(provider, another.provider)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(extension, another.extension)
        && Objects.equals(subdetailSequence, another.subdetailSequence)
        && Objects.equals(id, another.id)
        && Objects.equals(unitPrice, another.unitPrice)
        && Objects.equals(factor, another.factor)
        && Objects.equals(bodySite, another.bodySite)
        && Objects.equals(servicedPeriod, another.servicedPeriod)
        && Objects.equals(locationReference, another.locationReference)
        && Objects.equals(subSite, another.subSite)
        && Objects.equals(noteNumber, another.noteNumber)
        && Objects.equals(programCode, another.programCode)
        && Objects.equals(net, another.net)
        && productOrService.equals(another.productOrService)
        && Objects.equals(locationAddress, another.locationAddress)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(detail, another.detail)
        && adjudication.equals(another.adjudication);
  }

  /**
   * Computes a hash code from attributes: {@code itemSequence}, {@code servicedDate}, {@code locationCodeableConcept}, {@code modifier}, {@code detailSequence}, {@code provider}, {@code quantity}, {@code extension}, {@code subdetailSequence}, {@code id}, {@code unitPrice}, {@code factor}, {@code bodySite}, {@code servicedPeriod}, {@code locationReference}, {@code subSite}, {@code noteNumber}, {@code programCode}, {@code net}, {@code productOrService}, {@code locationAddress}, {@code modifierExtension}, {@code detail}, {@code adjudication}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(itemSequence);
    h += (h << 5) + Objects.hashCode(servicedDate);
    h += (h << 5) + Objects.hashCode(locationCodeableConcept);
    h += (h << 5) + Objects.hashCode(modifier);
    h += (h << 5) + Objects.hashCode(detailSequence);
    h += (h << 5) + Objects.hashCode(provider);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(subdetailSequence);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(unitPrice);
    h += (h << 5) + Objects.hashCode(factor);
    h += (h << 5) + Objects.hashCode(bodySite);
    h += (h << 5) + Objects.hashCode(servicedPeriod);
    h += (h << 5) + Objects.hashCode(locationReference);
    h += (h << 5) + Objects.hashCode(subSite);
    h += (h << 5) + Objects.hashCode(noteNumber);
    h += (h << 5) + Objects.hashCode(programCode);
    h += (h << 5) + Objects.hashCode(net);
    h += (h << 5) + productOrService.hashCode();
    h += (h << 5) + Objects.hashCode(locationAddress);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(detail);
    h += (h << 5) + adjudication.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ClaimResponse_AddItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ClaimResponse_AddItem{");
    if (itemSequence != null) {
      builder.append("itemSequence=").append(itemSequence);
    }
    if (servicedDate != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("servicedDate=").append(servicedDate);
    }
    if (locationCodeableConcept != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("locationCodeableConcept=").append(locationCodeableConcept);
    }
    if (modifier != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifier=").append(modifier);
    }
    if (detailSequence != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("detailSequence=").append(detailSequence);
    }
    if (provider != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("provider=").append(provider);
    }
    if (quantity != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (subdetailSequence != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("subdetailSequence=").append(subdetailSequence);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (unitPrice != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("unitPrice=").append(unitPrice);
    }
    if (factor != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("factor=").append(factor);
    }
    if (bodySite != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (servicedPeriod != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("servicedPeriod=").append(servicedPeriod);
    }
    if (locationReference != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("locationReference=").append(locationReference);
    }
    if (subSite != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("subSite=").append(subSite);
    }
    if (noteNumber != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("noteNumber=").append(noteNumber);
    }
    if (programCode != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("programCode=").append(programCode);
    }
    if (net != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("net=").append(net);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("productOrService=").append(productOrService);
    if (locationAddress != null) {
      builder.append(", ");
      builder.append("locationAddress=").append(locationAddress);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (detail != null) {
      builder.append(", ");
      builder.append("detail=").append(detail);
    }
    builder.append(", ");
    builder.append("adjudication=").append(adjudication);
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
    @Nullable Optional<List<PositiveInt>> itemSequence = Optional.empty();
    boolean itemSequenceIsSet;
    @Nullable Optional<String> servicedDate = Optional.empty();
    boolean servicedDateIsSet;
    @Nullable Optional<CodeableConcept> locationCodeableConcept = Optional.empty();
    boolean locationCodeableConceptIsSet;
    @Nullable Optional<List<CodeableConcept>> modifier = Optional.empty();
    boolean modifierIsSet;
    @Nullable Optional<List<PositiveInt>> detailSequence = Optional.empty();
    boolean detailSequenceIsSet;
    @Nullable Optional<List<Reference>> provider = Optional.empty();
    boolean providerIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<PositiveInt>> subdetailSequence = Optional.empty();
    boolean subdetailSequenceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Money> unitPrice = Optional.empty();
    boolean unitPriceIsSet;
    @Nullable Optional<Decimal> factor = Optional.empty();
    boolean factorIsSet;
    @Nullable Optional<CodeableConcept> bodySite = Optional.empty();
    boolean bodySiteIsSet;
    @Nullable Optional<Period> servicedPeriod = Optional.empty();
    boolean servicedPeriodIsSet;
    @Nullable Optional<Reference> locationReference = Optional.empty();
    boolean locationReferenceIsSet;
    @Nullable Optional<List<CodeableConcept>> subSite = Optional.empty();
    boolean subSiteIsSet;
    @Nullable Optional<List<PositiveInt>> noteNumber = Optional.empty();
    boolean noteNumberIsSet;
    @Nullable Optional<List<CodeableConcept>> programCode = Optional.empty();
    boolean programCodeIsSet;
    @Nullable Optional<Money> net = Optional.empty();
    boolean netIsSet;
    @Nullable CodeableConcept productOrService;
    @Nullable Optional<Address> locationAddress = Optional.empty();
    boolean locationAddressIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<ClaimResponse_Detail1>> detail = Optional.empty();
    boolean detailIsSet;
    @Nullable List<ClaimResponse_Adjudication> adjudication = Collections.emptyList();
    @JsonProperty("itemSequence")
    public void setItemSequence(Optional<List<PositiveInt>> itemSequence) {
      this.itemSequence = itemSequence;
      this.itemSequenceIsSet = true;
    }
    @JsonProperty("servicedDate")
    public void setServicedDate(Optional<String> servicedDate) {
      this.servicedDate = servicedDate;
      this.servicedDateIsSet = true;
    }
    @JsonProperty("locationCodeableConcept")
    public void setLocationCodeableConcept(Optional<CodeableConcept> locationCodeableConcept) {
      this.locationCodeableConcept = locationCodeableConcept;
      this.locationCodeableConceptIsSet = true;
    }
    @JsonProperty("modifier")
    public void setModifier(Optional<List<CodeableConcept>> modifier) {
      this.modifier = modifier;
      this.modifierIsSet = true;
    }
    @JsonProperty("detailSequence")
    public void setDetailSequence(Optional<List<PositiveInt>> detailSequence) {
      this.detailSequence = detailSequence;
      this.detailSequenceIsSet = true;
    }
    @JsonProperty("provider")
    public void setProvider(Optional<List<Reference>> provider) {
      this.provider = provider;
      this.providerIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("subdetailSequence")
    public void setSubdetailSequence(Optional<List<PositiveInt>> subdetailSequence) {
      this.subdetailSequence = subdetailSequence;
      this.subdetailSequenceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("unitPrice")
    public void setUnitPrice(Optional<Money> unitPrice) {
      this.unitPrice = unitPrice;
      this.unitPriceIsSet = true;
    }
    @JsonProperty("factor")
    public void setFactor(Optional<Decimal> factor) {
      this.factor = factor;
      this.factorIsSet = true;
    }
    @JsonProperty("bodySite")
    public void setBodySite(Optional<CodeableConcept> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
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
    @JsonProperty("subSite")
    public void setSubSite(Optional<List<CodeableConcept>> subSite) {
      this.subSite = subSite;
      this.subSiteIsSet = true;
    }
    @JsonProperty("noteNumber")
    public void setNoteNumber(Optional<List<PositiveInt>> noteNumber) {
      this.noteNumber = noteNumber;
      this.noteNumberIsSet = true;
    }
    @JsonProperty("programCode")
    public void setProgramCode(Optional<List<CodeableConcept>> programCode) {
      this.programCode = programCode;
      this.programCodeIsSet = true;
    }
    @JsonProperty("net")
    public void setNet(Optional<Money> net) {
      this.net = net;
      this.netIsSet = true;
    }
    @JsonProperty("productOrService")
    public void setProductOrService(CodeableConcept productOrService) {
      this.productOrService = productOrService;
    }
    @JsonProperty("locationAddress")
    public void setLocationAddress(Optional<Address> locationAddress) {
      this.locationAddress = locationAddress;
      this.locationAddressIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("detail")
    public void setDetail(Optional<List<ClaimResponse_Detail1>> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @JsonProperty("adjudication")
    public void setAdjudication(List<ClaimResponse_Adjudication> adjudication) {
      this.adjudication = adjudication;
    }
    @Override
    public Optional<List<PositiveInt>> itemSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> servicedDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> locationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> detailSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> provider() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> subdetailSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> unitPrice() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> factor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> servicedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> locationReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> subSite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> noteNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> programCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> net() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept productOrService() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Address> locationAddress() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ClaimResponse_Detail1>> detail() { throw new UnsupportedOperationException(); }
    @Override
    public List<ClaimResponse_Adjudication> adjudication() { throw new UnsupportedOperationException(); }
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
    if (json.itemSequenceIsSet) {
      builder.itemSequence(json.itemSequence);
    }
    if (json.servicedDateIsSet) {
      builder.servicedDate(json.servicedDate);
    }
    if (json.locationCodeableConceptIsSet) {
      builder.locationCodeableConcept(json.locationCodeableConcept);
    }
    if (json.modifierIsSet) {
      builder.modifier(json.modifier);
    }
    if (json.detailSequenceIsSet) {
      builder.detailSequence(json.detailSequence);
    }
    if (json.providerIsSet) {
      builder.provider(json.provider);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.subdetailSequenceIsSet) {
      builder.subdetailSequence(json.subdetailSequence);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.unitPriceIsSet) {
      builder.unitPrice(json.unitPrice);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.servicedPeriodIsSet) {
      builder.servicedPeriod(json.servicedPeriod);
    }
    if (json.locationReferenceIsSet) {
      builder.locationReference(json.locationReference);
    }
    if (json.subSiteIsSet) {
      builder.subSite(json.subSite);
    }
    if (json.noteNumberIsSet) {
      builder.noteNumber(json.noteNumber);
    }
    if (json.programCodeIsSet) {
      builder.programCode(json.programCode);
    }
    if (json.netIsSet) {
      builder.net(json.net);
    }
    if (json.productOrService != null) {
      builder.productOrService(json.productOrService);
    }
    if (json.locationAddressIsSet) {
      builder.locationAddress(json.locationAddress);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.adjudication != null) {
      builder.addAllAdjudication(json.adjudication);
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
        .itemSequence(instance.itemSequence())
        .servicedDate(instance.servicedDate())
        .locationCodeableConcept(instance.locationCodeableConcept())
        .modifier(instance.modifier())
        .detailSequence(instance.detailSequence())
        .provider(instance.provider())
        .quantity(instance.quantity())
        .extension(instance.extension())
        .subdetailSequence(instance.subdetailSequence())
        .id(instance.id())
        .unitPrice(instance.unitPrice())
        .factor(instance.factor())
        .bodySite(instance.bodySite())
        .servicedPeriod(instance.servicedPeriod())
        .locationReference(instance.locationReference())
        .subSite(instance.subSite())
        .noteNumber(instance.noteNumber())
        .programCode(instance.programCode())
        .net(instance.net())
        .productOrService(instance.productOrService())
        .locationAddress(instance.locationAddress())
        .modifierExtension(instance.modifierExtension())
        .detail(instance.detail())
        .addAllAdjudication(instance.adjudication())
        .build();
  }

  /**
   * Creates a builder for {@link ClaimResponse_AddItem ClaimResponse_AddItem}.
   * <pre>
   * ImmutableClaimResponse_AddItem.builder()
   *    .itemSequence(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ClaimResponse_AddItem#itemSequence() itemSequence}
   *    .servicedDate(String) // optional {@link ClaimResponse_AddItem#servicedDate() servicedDate}
   *    .locationCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link ClaimResponse_AddItem#locationCodeableConcept() locationCodeableConcept}
   *    .modifier(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ClaimResponse_AddItem#modifier() modifier}
   *    .detailSequence(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ClaimResponse_AddItem#detailSequence() detailSequence}
   *    .provider(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ClaimResponse_AddItem#provider() provider}
   *    .quantity(com.fhir.types.fhir.Quantity) // optional {@link ClaimResponse_AddItem#quantity() quantity}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_AddItem#extension() extension}
   *    .subdetailSequence(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ClaimResponse_AddItem#subdetailSequence() subdetailSequence}
   *    .id(String) // optional {@link ClaimResponse_AddItem#id() id}
   *    .unitPrice(com.fhir.types.fhir.Money) // optional {@link ClaimResponse_AddItem#unitPrice() unitPrice}
   *    .factor(com.fhir.types.fhir.Decimal) // optional {@link ClaimResponse_AddItem#factor() factor}
   *    .bodySite(com.fhir.types.fhir.CodeableConcept) // optional {@link ClaimResponse_AddItem#bodySite() bodySite}
   *    .servicedPeriod(com.fhir.types.fhir.Period) // optional {@link ClaimResponse_AddItem#servicedPeriod() servicedPeriod}
   *    .locationReference(com.fhir.types.fhir.Reference) // optional {@link ClaimResponse_AddItem#locationReference() locationReference}
   *    .subSite(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ClaimResponse_AddItem#subSite() subSite}
   *    .noteNumber(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ClaimResponse_AddItem#noteNumber() noteNumber}
   *    .programCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ClaimResponse_AddItem#programCode() programCode}
   *    .net(com.fhir.types.fhir.Money) // optional {@link ClaimResponse_AddItem#net() net}
   *    .productOrService(com.fhir.types.fhir.CodeableConcept) // required {@link ClaimResponse_AddItem#productOrService() productOrService}
   *    .locationAddress(com.fhir.types.fhir.Address) // optional {@link ClaimResponse_AddItem#locationAddress() locationAddress}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_AddItem#modifierExtension() modifierExtension}
   *    .detail(List&amp;lt;com.fhir.types.fhir.ClaimResponse_Detail1&amp;gt;) // optional {@link ClaimResponse_AddItem#detail() detail}
   *    .addAdjudication|addAllAdjudication(com.fhir.types.fhir.ClaimResponse_Adjudication) // {@link ClaimResponse_AddItem#adjudication() adjudication} elements
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
    private static final long OPT_BIT_ITEM_SEQUENCE = 0x1L;
    private static final long OPT_BIT_SERVICED_DATE = 0x2L;
    private static final long OPT_BIT_LOCATION_CODEABLE_CONCEPT = 0x4L;
    private static final long OPT_BIT_MODIFIER = 0x8L;
    private static final long OPT_BIT_DETAIL_SEQUENCE = 0x10L;
    private static final long OPT_BIT_PROVIDER = 0x20L;
    private static final long OPT_BIT_QUANTITY = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_SUBDETAIL_SEQUENCE = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_UNIT_PRICE = 0x400L;
    private static final long OPT_BIT_FACTOR = 0x800L;
    private static final long OPT_BIT_BODY_SITE = 0x1000L;
    private static final long OPT_BIT_SERVICED_PERIOD = 0x2000L;
    private static final long OPT_BIT_LOCATION_REFERENCE = 0x4000L;
    private static final long OPT_BIT_SUB_SITE = 0x8000L;
    private static final long OPT_BIT_NOTE_NUMBER = 0x10000L;
    private static final long OPT_BIT_PROGRAM_CODE = 0x20000L;
    private static final long OPT_BIT_NET = 0x40000L;
    private static final long OPT_BIT_LOCATION_ADDRESS = 0x80000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100000L;
    private static final long OPT_BIT_DETAIL = 0x200000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<PositiveInt> itemSequence;
    private @Nullable String servicedDate;
    private @Nullable CodeableConcept locationCodeableConcept;
    private @Nullable List<CodeableConcept> modifier;
    private @Nullable List<PositiveInt> detailSequence;
    private @Nullable List<Reference> provider;
    private @Nullable Quantity quantity;
    private @Nullable List<Extension> extension;
    private @Nullable List<PositiveInt> subdetailSequence;
    private @Nullable String id;
    private @Nullable Money unitPrice;
    private @Nullable Decimal factor;
    private @Nullable CodeableConcept bodySite;
    private @Nullable Period servicedPeriod;
    private @Nullable Reference locationReference;
    private @Nullable List<CodeableConcept> subSite;
    private @Nullable List<PositiveInt> noteNumber;
    private @Nullable List<CodeableConcept> programCode;
    private @Nullable Money net;
    private @Nullable CodeableConcept productOrService;
    private @Nullable Address locationAddress;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<ClaimResponse_Detail1> detail;
    private final List<ClaimResponse_Adjudication> adjudication = new ArrayList<ClaimResponse_Adjudication>();

    private Builder() {
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
     * Builds a new {@link ClaimResponse_AddItem ClaimResponse_AddItem}.
     * @return An immutable instance of ClaimResponse_AddItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ClaimResponse_AddItem build() {
      checkRequiredAttributes();
      return new ImmutableClaimResponse_AddItem(
          itemSequence,
          servicedDate,
          locationCodeableConcept,
          modifier,
          detailSequence,
          provider,
          quantity,
          extension,
          subdetailSequence,
          id,
          unitPrice,
          factor,
          bodySite,
          servicedPeriod,
          locationReference,
          subSite,
          noteNumber,
          programCode,
          net,
          productOrService,
          locationAddress,
          modifierExtension,
          detail,
          createUnmodifiableList(true, adjudication));
    }

    private boolean itemSequenceIsSet() {
      return (optBits & OPT_BIT_ITEM_SEQUENCE) != 0;
    }

    private boolean servicedDateIsSet() {
      return (optBits & OPT_BIT_SERVICED_DATE) != 0;
    }

    private boolean locationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_LOCATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean modifierIsSet() {
      return (optBits & OPT_BIT_MODIFIER) != 0;
    }

    private boolean detailSequenceIsSet() {
      return (optBits & OPT_BIT_DETAIL_SEQUENCE) != 0;
    }

    private boolean providerIsSet() {
      return (optBits & OPT_BIT_PROVIDER) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean subdetailSequenceIsSet() {
      return (optBits & OPT_BIT_SUBDETAIL_SEQUENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean unitPriceIsSet() {
      return (optBits & OPT_BIT_UNIT_PRICE) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean servicedPeriodIsSet() {
      return (optBits & OPT_BIT_SERVICED_PERIOD) != 0;
    }

    private boolean locationReferenceIsSet() {
      return (optBits & OPT_BIT_LOCATION_REFERENCE) != 0;
    }

    private boolean subSiteIsSet() {
      return (optBits & OPT_BIT_SUB_SITE) != 0;
    }

    private boolean noteNumberIsSet() {
      return (optBits & OPT_BIT_NOTE_NUMBER) != 0;
    }

    private boolean programCodeIsSet() {
      return (optBits & OPT_BIT_PROGRAM_CODE) != 0;
    }

    private boolean netIsSet() {
      return (optBits & OPT_BIT_NET) != 0;
    }

    private boolean locationAddressIsSet() {
      return (optBits & OPT_BIT_LOCATION_ADDRESS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
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
