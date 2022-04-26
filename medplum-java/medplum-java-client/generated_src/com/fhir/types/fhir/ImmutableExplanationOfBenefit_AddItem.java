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
 * Immutable implementation of {@link ExplanationOfBenefit_AddItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_AddItem.builder()}.
 */
@Generated(from = "ExplanationOfBenefit_AddItem", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_AddItem
    implements ExplanationOfBenefit_AddItem {
  private final @Nullable Reference locationReference;
  private final @Nullable List<PositiveInt> detailSequence;
  private final @Nullable List<PositiveInt> noteNumber;
  private final @Nullable Money net;
  private final @Nullable Period servicedPeriod;
  private final @Nullable CodeableConcept bodySite;
  private final @Nullable Address locationAddress;
  private final @Nullable List<ExplanationOfBenefit_Adjudication> adjudication;
  private final @Nullable String id;
  private final CodeableConcept productOrService;
  private final @Nullable List<ExplanationOfBenefit_Detail1> detail;
  private final @Nullable List<PositiveInt> itemSequence;
  private final @Nullable CodeableConcept locationCodeableConcept;
  private final @Nullable List<Extension> extension;
  private final @Nullable Money unitPrice;
  private final @Nullable Decimal factor;
  private final @Nullable List<CodeableConcept> programCode;
  private final @Nullable List<CodeableConcept> subSite;
  private final @Nullable List<CodeableConcept> modifier;
  private final @Nullable List<Reference> provider;
  private final @Nullable List<PositiveInt> subDetailSequence;
  private final @Nullable String servicedDate;
  private final @Nullable Quantity quantity;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableExplanationOfBenefit_AddItem(
      @Nullable Reference locationReference,
      @Nullable List<PositiveInt> detailSequence,
      @Nullable List<PositiveInt> noteNumber,
      @Nullable Money net,
      @Nullable Period servicedPeriod,
      @Nullable CodeableConcept bodySite,
      @Nullable Address locationAddress,
      @Nullable List<ExplanationOfBenefit_Adjudication> adjudication,
      @Nullable String id,
      CodeableConcept productOrService,
      @Nullable List<ExplanationOfBenefit_Detail1> detail,
      @Nullable List<PositiveInt> itemSequence,
      @Nullable CodeableConcept locationCodeableConcept,
      @Nullable List<Extension> extension,
      @Nullable Money unitPrice,
      @Nullable Decimal factor,
      @Nullable List<CodeableConcept> programCode,
      @Nullable List<CodeableConcept> subSite,
      @Nullable List<CodeableConcept> modifier,
      @Nullable List<Reference> provider,
      @Nullable List<PositiveInt> subDetailSequence,
      @Nullable String servicedDate,
      @Nullable Quantity quantity,
      @Nullable List<Extension> modifierExtension) {
    this.locationReference = locationReference;
    this.detailSequence = detailSequence;
    this.noteNumber = noteNumber;
    this.net = net;
    this.servicedPeriod = servicedPeriod;
    this.bodySite = bodySite;
    this.locationAddress = locationAddress;
    this.adjudication = adjudication;
    this.id = id;
    this.productOrService = productOrService;
    this.detail = detail;
    this.itemSequence = itemSequence;
    this.locationCodeableConcept = locationCodeableConcept;
    this.extension = extension;
    this.unitPrice = unitPrice;
    this.factor = factor;
    this.programCode = programCode;
    this.subSite = subSite;
    this.modifier = modifier;
    this.provider = provider;
    this.subDetailSequence = subDetailSequence;
    this.servicedDate = servicedDate;
    this.quantity = quantity;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code detailSequence} attribute
   */
  @JsonProperty("detailSequence")
  @Override
  public Optional<List<PositiveInt>> detailSequence() {
    return Optional.ofNullable(detailSequence);
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
   * @return The value of the {@code net} attribute
   */
  @JsonProperty("net")
  @Override
  public Optional<Money> net() {
    return Optional.ofNullable(net);
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
   * @return The value of the {@code bodySite} attribute
   */
  @JsonProperty("bodySite")
  @Override
  public Optional<CodeableConcept> bodySite() {
    return Optional.ofNullable(bodySite);
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
   * @return The value of the {@code adjudication} attribute
   */
  @JsonProperty("adjudication")
  @Override
  public Optional<List<ExplanationOfBenefit_Adjudication>> adjudication() {
    return Optional.ofNullable(adjudication);
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
   * @return The value of the {@code productOrService} attribute
   */
  @JsonProperty("productOrService")
  @Override
  public CodeableConcept productOrService() {
    return productOrService;
  }

  /**
   * @return The value of the {@code detail} attribute
   */
  @JsonProperty("detail")
  @Override
  public Optional<List<ExplanationOfBenefit_Detail1>> detail() {
    return Optional.ofNullable(detail);
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
   * @return The value of the {@code locationCodeableConcept} attribute
   */
  @JsonProperty("locationCodeableConcept")
  @Override
  public Optional<CodeableConcept> locationCodeableConcept() {
    return Optional.ofNullable(locationCodeableConcept);
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
   * @return The value of the {@code programCode} attribute
   */
  @JsonProperty("programCode")
  @Override
  public Optional<List<CodeableConcept>> programCode() {
    return Optional.ofNullable(programCode);
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
   * @return The value of the {@code modifier} attribute
   */
  @JsonProperty("modifier")
  @Override
  public Optional<List<CodeableConcept>> modifier() {
    return Optional.ofNullable(modifier);
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
   * @return The value of the {@code subDetailSequence} attribute
   */
  @JsonProperty("subDetailSequence")
  @Override
  public Optional<List<PositiveInt>> subDetailSequence() {
    return Optional.ofNullable(subDetailSequence);
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
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Optional<Quantity> quantity() {
    return Optional.ofNullable(quantity);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#locationReference() locationReference} attribute.
   * @param value The value for locationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withLocationReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "locationReference");
    if (this.locationReference == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        newValue,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#locationReference() locationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withLocationReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.locationReference == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        value,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#detailSequence() detailSequence} attribute.
   * @param value The value for detailSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withDetailSequence(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "detailSequence");
    if (this.detailSequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        newValue,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#detailSequence() detailSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detailSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withDetailSequence(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.detailSequence == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        value,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#noteNumber() noteNumber} attribute.
   * @param value The value for noteNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withNoteNumber(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "noteNumber");
    if (this.noteNumber == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        newValue,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#noteNumber() noteNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for noteNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withNoteNumber(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.noteNumber == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        value,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#net() net} attribute.
   * @param value The value for net
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withNet(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "net");
    if (this.net == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        newValue,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#net() net} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for net
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withNet(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.net == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        value,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#servicedPeriod() servicedPeriod} attribute.
   * @param value The value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withServicedPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "servicedPeriod");
    if (this.servicedPeriod == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        newValue,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#servicedPeriod() servicedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withServicedPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.servicedPeriod == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        value,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withBodySite(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        newValue,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withBodySite(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        value,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#locationAddress() locationAddress} attribute.
   * @param value The value for locationAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withLocationAddress(Address value) {
    @Nullable Address newValue = Objects.requireNonNull(value, "locationAddress");
    if (this.locationAddress == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        newValue,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#locationAddress() locationAddress} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationAddress
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withLocationAddress(Optional<? extends Address> optional) {
    @Nullable Address value = optional.orElse(null);
    if (this.locationAddress == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        value,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#adjudication() adjudication} attribute.
   * @param value The value for adjudication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withAdjudication(List<ExplanationOfBenefit_Adjudication> value) {
    @Nullable List<ExplanationOfBenefit_Adjudication> newValue = Objects.requireNonNull(value, "adjudication");
    if (this.adjudication == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        newValue,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#adjudication() adjudication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjudication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withAdjudication(Optional<? extends List<ExplanationOfBenefit_Adjudication>> optional) {
    @Nullable List<ExplanationOfBenefit_Adjudication> value = optional.orElse(null);
    if (this.adjudication == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        value,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        newValue,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        value,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit_AddItem#productOrService() productOrService} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for productOrService
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withProductOrService(CodeableConcept value) {
    if (this.productOrService == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "productOrService");
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        newValue,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withDetail(List<ExplanationOfBenefit_Detail1> value) {
    @Nullable List<ExplanationOfBenefit_Detail1> newValue = Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        newValue,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withDetail(Optional<? extends List<ExplanationOfBenefit_Detail1>> optional) {
    @Nullable List<ExplanationOfBenefit_Detail1> value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        value,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#itemSequence() itemSequence} attribute.
   * @param value The value for itemSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withItemSequence(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "itemSequence");
    if (this.itemSequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        newValue,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#itemSequence() itemSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for itemSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withItemSequence(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.itemSequence == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        value,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#locationCodeableConcept() locationCodeableConcept} attribute.
   * @param value The value for locationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withLocationCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "locationCodeableConcept");
    if (this.locationCodeableConcept == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        newValue,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#locationCodeableConcept() locationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withLocationCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.locationCodeableConcept == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        value,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        newValue,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        value,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#unitPrice() unitPrice} attribute.
   * @param value The value for unitPrice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withUnitPrice(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "unitPrice");
    if (this.unitPrice == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        newValue,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#unitPrice() unitPrice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitPrice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withUnitPrice(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.unitPrice == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        value,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withFactor(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        newValue,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withFactor(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        value,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#programCode() programCode} attribute.
   * @param value The value for programCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withProgramCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "programCode");
    if (this.programCode == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        newValue,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#programCode() programCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for programCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withProgramCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.programCode == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        value,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#subSite() subSite} attribute.
   * @param value The value for subSite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withSubSite(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "subSite");
    if (this.subSite == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        newValue,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#subSite() subSite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subSite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withSubSite(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.subSite == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        value,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#modifier() modifier} attribute.
   * @param value The value for modifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withModifier(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "modifier");
    if (this.modifier == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        newValue,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#modifier() modifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withModifier(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.modifier == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        value,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#provider() provider} attribute.
   * @param value The value for provider
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withProvider(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "provider");
    if (this.provider == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        newValue,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#provider() provider} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for provider
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withProvider(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.provider == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        value,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#subDetailSequence() subDetailSequence} attribute.
   * @param value The value for subDetailSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withSubDetailSequence(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "subDetailSequence");
    if (this.subDetailSequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        newValue,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#subDetailSequence() subDetailSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subDetailSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withSubDetailSequence(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.subDetailSequence == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        value,
        this.servicedDate,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#servicedDate() servicedDate} attribute.
   * @param value The value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withServicedDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "servicedDate");
    if (Objects.equals(this.servicedDate, newValue)) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        newValue,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#servicedDate() servicedDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withServicedDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.servicedDate, value)) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        value,
        this.quantity,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationReference,
        this.detailSequence,
        this.noteNumber,
        this.net,
        this.servicedPeriod,
        this.bodySite,
        this.locationAddress,
        this.adjudication,
        this.id,
        this.productOrService,
        this.detail,
        this.itemSequence,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.factor,
        this.programCode,
        this.subSite,
        this.modifier,
        this.provider,
        this.subDetailSequence,
        this.servicedDate,
        this.quantity,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_AddItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_AddItem
        && equalTo((ImmutableExplanationOfBenefit_AddItem) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_AddItem another) {
    return Objects.equals(locationReference, another.locationReference)
        && Objects.equals(detailSequence, another.detailSequence)
        && Objects.equals(noteNumber, another.noteNumber)
        && Objects.equals(net, another.net)
        && Objects.equals(servicedPeriod, another.servicedPeriod)
        && Objects.equals(bodySite, another.bodySite)
        && Objects.equals(locationAddress, another.locationAddress)
        && Objects.equals(adjudication, another.adjudication)
        && Objects.equals(id, another.id)
        && productOrService.equals(another.productOrService)
        && Objects.equals(detail, another.detail)
        && Objects.equals(itemSequence, another.itemSequence)
        && Objects.equals(locationCodeableConcept, another.locationCodeableConcept)
        && Objects.equals(extension, another.extension)
        && Objects.equals(unitPrice, another.unitPrice)
        && Objects.equals(factor, another.factor)
        && Objects.equals(programCode, another.programCode)
        && Objects.equals(subSite, another.subSite)
        && Objects.equals(modifier, another.modifier)
        && Objects.equals(provider, another.provider)
        && Objects.equals(subDetailSequence, another.subDetailSequence)
        && Objects.equals(servicedDate, another.servicedDate)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code locationReference}, {@code detailSequence}, {@code noteNumber}, {@code net}, {@code servicedPeriod}, {@code bodySite}, {@code locationAddress}, {@code adjudication}, {@code id}, {@code productOrService}, {@code detail}, {@code itemSequence}, {@code locationCodeableConcept}, {@code extension}, {@code unitPrice}, {@code factor}, {@code programCode}, {@code subSite}, {@code modifier}, {@code provider}, {@code subDetailSequence}, {@code servicedDate}, {@code quantity}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(locationReference);
    h += (h << 5) + Objects.hashCode(detailSequence);
    h += (h << 5) + Objects.hashCode(noteNumber);
    h += (h << 5) + Objects.hashCode(net);
    h += (h << 5) + Objects.hashCode(servicedPeriod);
    h += (h << 5) + Objects.hashCode(bodySite);
    h += (h << 5) + Objects.hashCode(locationAddress);
    h += (h << 5) + Objects.hashCode(adjudication);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + productOrService.hashCode();
    h += (h << 5) + Objects.hashCode(detail);
    h += (h << 5) + Objects.hashCode(itemSequence);
    h += (h << 5) + Objects.hashCode(locationCodeableConcept);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(unitPrice);
    h += (h << 5) + Objects.hashCode(factor);
    h += (h << 5) + Objects.hashCode(programCode);
    h += (h << 5) + Objects.hashCode(subSite);
    h += (h << 5) + Objects.hashCode(modifier);
    h += (h << 5) + Objects.hashCode(provider);
    h += (h << 5) + Objects.hashCode(subDetailSequence);
    h += (h << 5) + Objects.hashCode(servicedDate);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_AddItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExplanationOfBenefit_AddItem{");
    if (locationReference != null) {
      builder.append("locationReference=").append(locationReference);
    }
    if (detailSequence != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("detailSequence=").append(detailSequence);
    }
    if (noteNumber != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("noteNumber=").append(noteNumber);
    }
    if (net != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("net=").append(net);
    }
    if (servicedPeriod != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("servicedPeriod=").append(servicedPeriod);
    }
    if (bodySite != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (locationAddress != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("locationAddress=").append(locationAddress);
    }
    if (adjudication != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("adjudication=").append(adjudication);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 29) builder.append(", ");
    builder.append("productOrService=").append(productOrService);
    if (detail != null) {
      builder.append(", ");
      builder.append("detail=").append(detail);
    }
    if (itemSequence != null) {
      builder.append(", ");
      builder.append("itemSequence=").append(itemSequence);
    }
    if (locationCodeableConcept != null) {
      builder.append(", ");
      builder.append("locationCodeableConcept=").append(locationCodeableConcept);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (unitPrice != null) {
      builder.append(", ");
      builder.append("unitPrice=").append(unitPrice);
    }
    if (factor != null) {
      builder.append(", ");
      builder.append("factor=").append(factor);
    }
    if (programCode != null) {
      builder.append(", ");
      builder.append("programCode=").append(programCode);
    }
    if (subSite != null) {
      builder.append(", ");
      builder.append("subSite=").append(subSite);
    }
    if (modifier != null) {
      builder.append(", ");
      builder.append("modifier=").append(modifier);
    }
    if (provider != null) {
      builder.append(", ");
      builder.append("provider=").append(provider);
    }
    if (subDetailSequence != null) {
      builder.append(", ");
      builder.append("subDetailSequence=").append(subDetailSequence);
    }
    if (servicedDate != null) {
      builder.append(", ");
      builder.append("servicedDate=").append(servicedDate);
    }
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExplanationOfBenefit_AddItem", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExplanationOfBenefit_AddItem {
    @Nullable Optional<Reference> locationReference = Optional.empty();
    boolean locationReferenceIsSet;
    @Nullable Optional<List<PositiveInt>> detailSequence = Optional.empty();
    boolean detailSequenceIsSet;
    @Nullable Optional<List<PositiveInt>> noteNumber = Optional.empty();
    boolean noteNumberIsSet;
    @Nullable Optional<Money> net = Optional.empty();
    boolean netIsSet;
    @Nullable Optional<Period> servicedPeriod = Optional.empty();
    boolean servicedPeriodIsSet;
    @Nullable Optional<CodeableConcept> bodySite = Optional.empty();
    boolean bodySiteIsSet;
    @Nullable Optional<Address> locationAddress = Optional.empty();
    boolean locationAddressIsSet;
    @Nullable Optional<List<ExplanationOfBenefit_Adjudication>> adjudication = Optional.empty();
    boolean adjudicationIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable CodeableConcept productOrService;
    @Nullable Optional<List<ExplanationOfBenefit_Detail1>> detail = Optional.empty();
    boolean detailIsSet;
    @Nullable Optional<List<PositiveInt>> itemSequence = Optional.empty();
    boolean itemSequenceIsSet;
    @Nullable Optional<CodeableConcept> locationCodeableConcept = Optional.empty();
    boolean locationCodeableConceptIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Money> unitPrice = Optional.empty();
    boolean unitPriceIsSet;
    @Nullable Optional<Decimal> factor = Optional.empty();
    boolean factorIsSet;
    @Nullable Optional<List<CodeableConcept>> programCode = Optional.empty();
    boolean programCodeIsSet;
    @Nullable Optional<List<CodeableConcept>> subSite = Optional.empty();
    boolean subSiteIsSet;
    @Nullable Optional<List<CodeableConcept>> modifier = Optional.empty();
    boolean modifierIsSet;
    @Nullable Optional<List<Reference>> provider = Optional.empty();
    boolean providerIsSet;
    @Nullable Optional<List<PositiveInt>> subDetailSequence = Optional.empty();
    boolean subDetailSequenceIsSet;
    @Nullable Optional<String> servicedDate = Optional.empty();
    boolean servicedDateIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("locationReference")
    public void setLocationReference(Optional<Reference> locationReference) {
      this.locationReference = locationReference;
      this.locationReferenceIsSet = true;
    }
    @JsonProperty("detailSequence")
    public void setDetailSequence(Optional<List<PositiveInt>> detailSequence) {
      this.detailSequence = detailSequence;
      this.detailSequenceIsSet = true;
    }
    @JsonProperty("noteNumber")
    public void setNoteNumber(Optional<List<PositiveInt>> noteNumber) {
      this.noteNumber = noteNumber;
      this.noteNumberIsSet = true;
    }
    @JsonProperty("net")
    public void setNet(Optional<Money> net) {
      this.net = net;
      this.netIsSet = true;
    }
    @JsonProperty("servicedPeriod")
    public void setServicedPeriod(Optional<Period> servicedPeriod) {
      this.servicedPeriod = servicedPeriod;
      this.servicedPeriodIsSet = true;
    }
    @JsonProperty("bodySite")
    public void setBodySite(Optional<CodeableConcept> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @JsonProperty("locationAddress")
    public void setLocationAddress(Optional<Address> locationAddress) {
      this.locationAddress = locationAddress;
      this.locationAddressIsSet = true;
    }
    @JsonProperty("adjudication")
    public void setAdjudication(Optional<List<ExplanationOfBenefit_Adjudication>> adjudication) {
      this.adjudication = adjudication;
      this.adjudicationIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("productOrService")
    public void setProductOrService(CodeableConcept productOrService) {
      this.productOrService = productOrService;
    }
    @JsonProperty("detail")
    public void setDetail(Optional<List<ExplanationOfBenefit_Detail1>> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @JsonProperty("itemSequence")
    public void setItemSequence(Optional<List<PositiveInt>> itemSequence) {
      this.itemSequence = itemSequence;
      this.itemSequenceIsSet = true;
    }
    @JsonProperty("locationCodeableConcept")
    public void setLocationCodeableConcept(Optional<CodeableConcept> locationCodeableConcept) {
      this.locationCodeableConcept = locationCodeableConcept;
      this.locationCodeableConceptIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
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
    @JsonProperty("programCode")
    public void setProgramCode(Optional<List<CodeableConcept>> programCode) {
      this.programCode = programCode;
      this.programCodeIsSet = true;
    }
    @JsonProperty("subSite")
    public void setSubSite(Optional<List<CodeableConcept>> subSite) {
      this.subSite = subSite;
      this.subSiteIsSet = true;
    }
    @JsonProperty("modifier")
    public void setModifier(Optional<List<CodeableConcept>> modifier) {
      this.modifier = modifier;
      this.modifierIsSet = true;
    }
    @JsonProperty("provider")
    public void setProvider(Optional<List<Reference>> provider) {
      this.provider = provider;
      this.providerIsSet = true;
    }
    @JsonProperty("subDetailSequence")
    public void setSubDetailSequence(Optional<List<PositiveInt>> subDetailSequence) {
      this.subDetailSequence = subDetailSequence;
      this.subDetailSequenceIsSet = true;
    }
    @JsonProperty("servicedDate")
    public void setServicedDate(Optional<String> servicedDate) {
      this.servicedDate = servicedDate;
      this.servicedDateIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<Reference> locationReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> detailSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> noteNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> net() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> servicedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Address> locationAddress() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_Adjudication>> adjudication() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept productOrService() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_Detail1>> detail() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> itemSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> locationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> unitPrice() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> factor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> programCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> subSite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> provider() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> subDetailSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> servicedDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_AddItem fromJson(Json json) {
    ImmutableExplanationOfBenefit_AddItem.Builder builder = ((ImmutableExplanationOfBenefit_AddItem.Builder) ImmutableExplanationOfBenefit_AddItem.builder());
    if (json.locationReferenceIsSet) {
      builder.locationReference(json.locationReference);
    }
    if (json.detailSequenceIsSet) {
      builder.detailSequence(json.detailSequence);
    }
    if (json.noteNumberIsSet) {
      builder.noteNumber(json.noteNumber);
    }
    if (json.netIsSet) {
      builder.net(json.net);
    }
    if (json.servicedPeriodIsSet) {
      builder.servicedPeriod(json.servicedPeriod);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.locationAddressIsSet) {
      builder.locationAddress(json.locationAddress);
    }
    if (json.adjudicationIsSet) {
      builder.adjudication(json.adjudication);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.productOrService != null) {
      builder.productOrService(json.productOrService);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.itemSequenceIsSet) {
      builder.itemSequence(json.itemSequence);
    }
    if (json.locationCodeableConceptIsSet) {
      builder.locationCodeableConcept(json.locationCodeableConcept);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.unitPriceIsSet) {
      builder.unitPrice(json.unitPrice);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    if (json.programCodeIsSet) {
      builder.programCode(json.programCode);
    }
    if (json.subSiteIsSet) {
      builder.subSite(json.subSite);
    }
    if (json.modifierIsSet) {
      builder.modifier(json.modifier);
    }
    if (json.providerIsSet) {
      builder.provider(json.provider);
    }
    if (json.subDetailSequenceIsSet) {
      builder.subDetailSequence(json.subDetailSequence);
    }
    if (json.servicedDateIsSet) {
      builder.servicedDate(json.servicedDate);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableExplanationOfBenefit_AddItem) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_AddItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_AddItem instance
   */
  public static ExplanationOfBenefit_AddItem copyOf(ExplanationOfBenefit_AddItem instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_AddItem) {
      return (ImmutableExplanationOfBenefit_AddItem) instance;
    }
    return ((ImmutableExplanationOfBenefit_AddItem.Builder) ImmutableExplanationOfBenefit_AddItem.builder())
        .locationReference(instance.locationReference())
        .detailSequence(instance.detailSequence())
        .noteNumber(instance.noteNumber())
        .net(instance.net())
        .servicedPeriod(instance.servicedPeriod())
        .bodySite(instance.bodySite())
        .locationAddress(instance.locationAddress())
        .adjudication(instance.adjudication())
        .id(instance.id())
        .productOrService(instance.productOrService())
        .detail(instance.detail())
        .itemSequence(instance.itemSequence())
        .locationCodeableConcept(instance.locationCodeableConcept())
        .extension(instance.extension())
        .unitPrice(instance.unitPrice())
        .factor(instance.factor())
        .programCode(instance.programCode())
        .subSite(instance.subSite())
        .modifier(instance.modifier())
        .provider(instance.provider())
        .subDetailSequence(instance.subDetailSequence())
        .servicedDate(instance.servicedDate())
        .quantity(instance.quantity())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_AddItem ExplanationOfBenefit_AddItem}.
   * <pre>
   * ImmutableExplanationOfBenefit_AddItem.builder()
   *    .locationReference(com.fhir.types.fhir.Reference) // optional {@link ExplanationOfBenefit_AddItem#locationReference() locationReference}
   *    .detailSequence(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#detailSequence() detailSequence}
   *    .noteNumber(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#noteNumber() noteNumber}
   *    .net(com.fhir.types.fhir.Money) // optional {@link ExplanationOfBenefit_AddItem#net() net}
   *    .servicedPeriod(com.fhir.types.fhir.Period) // optional {@link ExplanationOfBenefit_AddItem#servicedPeriod() servicedPeriod}
   *    .bodySite(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_AddItem#bodySite() bodySite}
   *    .locationAddress(com.fhir.types.fhir.Address) // optional {@link ExplanationOfBenefit_AddItem#locationAddress() locationAddress}
   *    .adjudication(List&amp;lt;com.fhir.types.fhir.ExplanationOfBenefit_Adjudication&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#adjudication() adjudication}
   *    .id(String) // optional {@link ExplanationOfBenefit_AddItem#id() id}
   *    .productOrService(com.fhir.types.fhir.CodeableConcept) // required {@link ExplanationOfBenefit_AddItem#productOrService() productOrService}
   *    .detail(List&amp;lt;com.fhir.types.fhir.ExplanationOfBenefit_Detail1&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#detail() detail}
   *    .itemSequence(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#itemSequence() itemSequence}
   *    .locationCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_AddItem#locationCodeableConcept() locationCodeableConcept}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#extension() extension}
   *    .unitPrice(com.fhir.types.fhir.Money) // optional {@link ExplanationOfBenefit_AddItem#unitPrice() unitPrice}
   *    .factor(com.fhir.types.fhir.Decimal) // optional {@link ExplanationOfBenefit_AddItem#factor() factor}
   *    .programCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#programCode() programCode}
   *    .subSite(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#subSite() subSite}
   *    .modifier(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#modifier() modifier}
   *    .provider(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#provider() provider}
   *    .subDetailSequence(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#subDetailSequence() subDetailSequence}
   *    .servicedDate(String) // optional {@link ExplanationOfBenefit_AddItem#servicedDate() servicedDate}
   *    .quantity(com.fhir.types.fhir.Quantity) // optional {@link ExplanationOfBenefit_AddItem#quantity() quantity}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_AddItem builder
   */
  public static ProductOrServiceBuildStage builder() {
    return new ImmutableExplanationOfBenefit_AddItem.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_AddItem ExplanationOfBenefit_AddItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExplanationOfBenefit_AddItem", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ProductOrServiceBuildStage, BuildFinal {
    private static final long INIT_BIT_PRODUCT_OR_SERVICE = 0x1L;
    private static final long OPT_BIT_LOCATION_REFERENCE = 0x1L;
    private static final long OPT_BIT_DETAIL_SEQUENCE = 0x2L;
    private static final long OPT_BIT_NOTE_NUMBER = 0x4L;
    private static final long OPT_BIT_NET = 0x8L;
    private static final long OPT_BIT_SERVICED_PERIOD = 0x10L;
    private static final long OPT_BIT_BODY_SITE = 0x20L;
    private static final long OPT_BIT_LOCATION_ADDRESS = 0x40L;
    private static final long OPT_BIT_ADJUDICATION = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_DETAIL = 0x200L;
    private static final long OPT_BIT_ITEM_SEQUENCE = 0x400L;
    private static final long OPT_BIT_LOCATION_CODEABLE_CONCEPT = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private static final long OPT_BIT_UNIT_PRICE = 0x2000L;
    private static final long OPT_BIT_FACTOR = 0x4000L;
    private static final long OPT_BIT_PROGRAM_CODE = 0x8000L;
    private static final long OPT_BIT_SUB_SITE = 0x10000L;
    private static final long OPT_BIT_MODIFIER = 0x20000L;
    private static final long OPT_BIT_PROVIDER = 0x40000L;
    private static final long OPT_BIT_SUB_DETAIL_SEQUENCE = 0x80000L;
    private static final long OPT_BIT_SERVICED_DATE = 0x100000L;
    private static final long OPT_BIT_QUANTITY = 0x200000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Reference locationReference;
    private @Nullable List<PositiveInt> detailSequence;
    private @Nullable List<PositiveInt> noteNumber;
    private @Nullable Money net;
    private @Nullable Period servicedPeriod;
    private @Nullable CodeableConcept bodySite;
    private @Nullable Address locationAddress;
    private @Nullable List<ExplanationOfBenefit_Adjudication> adjudication;
    private @Nullable String id;
    private @Nullable CodeableConcept productOrService;
    private @Nullable List<ExplanationOfBenefit_Detail1> detail;
    private @Nullable List<PositiveInt> itemSequence;
    private @Nullable CodeableConcept locationCodeableConcept;
    private @Nullable List<Extension> extension;
    private @Nullable Money unitPrice;
    private @Nullable Decimal factor;
    private @Nullable List<CodeableConcept> programCode;
    private @Nullable List<CodeableConcept> subSite;
    private @Nullable List<CodeableConcept> modifier;
    private @Nullable List<Reference> provider;
    private @Nullable List<PositiveInt> subDetailSequence;
    private @Nullable String servicedDate;
    private @Nullable Quantity quantity;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationReference() locationReference} to locationReference.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationReference() locationReference} to locationReference.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#detailSequence() detailSequence} to detailSequence.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#detailSequence() detailSequence} to detailSequence.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#noteNumber() noteNumber} to noteNumber.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#noteNumber() noteNumber} to noteNumber.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#net() net} to net.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#net() net} to net.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#servicedPeriod() servicedPeriod} to servicedPeriod.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#servicedPeriod() servicedPeriod} to servicedPeriod.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#bodySite() bodySite} to bodySite.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#bodySite() bodySite} to bodySite.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationAddress() locationAddress} to locationAddress.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationAddress() locationAddress} to locationAddress.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    public final Builder adjudication(List<ExplanationOfBenefit_Adjudication> adjudication) {
      checkNotIsSet(adjudicationIsSet(), "adjudication");
      this.adjudication = Objects.requireNonNull(adjudication, "adjudication");
      optBits |= OPT_BIT_ADJUDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("adjudication")
    public final Builder adjudication(Optional<? extends List<ExplanationOfBenefit_Adjudication>> adjudication) {
      checkNotIsSet(adjudicationIsSet(), "adjudication");
      this.adjudication = adjudication.orElse(null);
      optBits |= OPT_BIT_ADJUDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#id() id} to id.
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
     * Initializes the value for the {@link ExplanationOfBenefit_AddItem#productOrService() productOrService} attribute.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(List<ExplanationOfBenefit_Detail1> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detail")
    public final Builder detail(Optional<? extends List<ExplanationOfBenefit_Detail1>> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#itemSequence() itemSequence} to itemSequence.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#itemSequence() itemSequence} to itemSequence.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#factor() factor} to factor.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#factor() factor} to factor.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#programCode() programCode} to programCode.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#programCode() programCode} to programCode.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#subSite() subSite} to subSite.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#subSite() subSite} to subSite.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#provider() provider} to provider.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#provider() provider} to provider.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#subDetailSequence() subDetailSequence} to subDetailSequence.
     * @param subDetailSequence The value for subDetailSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder subDetailSequence(List<PositiveInt> subDetailSequence) {
      checkNotIsSet(subDetailSequenceIsSet(), "subDetailSequence");
      this.subDetailSequence = Objects.requireNonNull(subDetailSequence, "subDetailSequence");
      optBits |= OPT_BIT_SUB_DETAIL_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#subDetailSequence() subDetailSequence} to subDetailSequence.
     * @param subDetailSequence The value for subDetailSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subDetailSequence")
    public final Builder subDetailSequence(Optional<? extends List<PositiveInt>> subDetailSequence) {
      checkNotIsSet(subDetailSequenceIsSet(), "subDetailSequence");
      this.subDetailSequence = subDetailSequence.orElse(null);
      optBits |= OPT_BIT_SUB_DETAIL_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#servicedDate() servicedDate} to servicedDate.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#servicedDate() servicedDate} to servicedDate.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ExplanationOfBenefit_AddItem ExplanationOfBenefit_AddItem}.
     * @return An immutable instance of ExplanationOfBenefit_AddItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExplanationOfBenefit_AddItem build() {
      checkRequiredAttributes();
      return new ImmutableExplanationOfBenefit_AddItem(
          locationReference,
          detailSequence,
          noteNumber,
          net,
          servicedPeriod,
          bodySite,
          locationAddress,
          adjudication,
          id,
          productOrService,
          detail,
          itemSequence,
          locationCodeableConcept,
          extension,
          unitPrice,
          factor,
          programCode,
          subSite,
          modifier,
          provider,
          subDetailSequence,
          servicedDate,
          quantity,
          modifierExtension);
    }

    private boolean locationReferenceIsSet() {
      return (optBits & OPT_BIT_LOCATION_REFERENCE) != 0;
    }

    private boolean detailSequenceIsSet() {
      return (optBits & OPT_BIT_DETAIL_SEQUENCE) != 0;
    }

    private boolean noteNumberIsSet() {
      return (optBits & OPT_BIT_NOTE_NUMBER) != 0;
    }

    private boolean netIsSet() {
      return (optBits & OPT_BIT_NET) != 0;
    }

    private boolean servicedPeriodIsSet() {
      return (optBits & OPT_BIT_SERVICED_PERIOD) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean locationAddressIsSet() {
      return (optBits & OPT_BIT_LOCATION_ADDRESS) != 0;
    }

    private boolean adjudicationIsSet() {
      return (optBits & OPT_BIT_ADJUDICATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean itemSequenceIsSet() {
      return (optBits & OPT_BIT_ITEM_SEQUENCE) != 0;
    }

    private boolean locationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_LOCATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean unitPriceIsSet() {
      return (optBits & OPT_BIT_UNIT_PRICE) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private boolean programCodeIsSet() {
      return (optBits & OPT_BIT_PROGRAM_CODE) != 0;
    }

    private boolean subSiteIsSet() {
      return (optBits & OPT_BIT_SUB_SITE) != 0;
    }

    private boolean modifierIsSet() {
      return (optBits & OPT_BIT_MODIFIER) != 0;
    }

    private boolean providerIsSet() {
      return (optBits & OPT_BIT_PROVIDER) != 0;
    }

    private boolean subDetailSequenceIsSet() {
      return (optBits & OPT_BIT_SUB_DETAIL_SEQUENCE) != 0;
    }

    private boolean servicedDateIsSet() {
      return (optBits & OPT_BIT_SERVICED_DATE) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean productOrServiceIsSet() {
      return (initBits & INIT_BIT_PRODUCT_OR_SERVICE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExplanationOfBenefit_AddItem is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!productOrServiceIsSet()) attributes.add("productOrService");
      return "Cannot build ExplanationOfBenefit_AddItem, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ExplanationOfBenefit_AddItem", generator = "Immutables")
  public interface ProductOrServiceBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit_AddItem#productOrService() productOrService} attribute.
     * @param productOrService The value for productOrService 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productOrService(CodeableConcept productOrService);
  }

  @Generated(from = "ExplanationOfBenefit_AddItem", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationReference(Reference locationReference);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationReference(Optional<? extends Reference> locationReference);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#detailSequence() detailSequence} to detailSequence.
     * @param detailSequence The value for detailSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detailSequence(List<PositiveInt> detailSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#detailSequence() detailSequence} to detailSequence.
     * @param detailSequence The value for detailSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detailSequence(Optional<? extends List<PositiveInt>> detailSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal noteNumber(List<PositiveInt> noteNumber);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal noteNumber(Optional<? extends List<PositiveInt>> noteNumber);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for chained invocation
     */
    BuildFinal net(Money net);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal net(Optional<? extends Money> net);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedPeriod(Period servicedPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedPeriod(Optional<? extends Period> servicedPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(CodeableConcept bodySite);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(Optional<? extends CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationAddress(Address locationAddress);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationAddress(Optional<? extends Address> locationAddress);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal adjudication(List<ExplanationOfBenefit_Adjudication> adjudication);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal adjudication(Optional<? extends List<ExplanationOfBenefit_Adjudication>> adjudication);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detail(List<ExplanationOfBenefit_Detail1> detail);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detail(Optional<? extends List<ExplanationOfBenefit_Detail1>> detail);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#itemSequence() itemSequence} to itemSequence.
     * @param itemSequence The value for itemSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal itemSequence(List<PositiveInt> itemSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#itemSequence() itemSequence} to itemSequence.
     * @param itemSequence The value for itemSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal itemSequence(Optional<? extends List<PositiveInt>> itemSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
     * @param locationCodeableConcept The value for locationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationCodeableConcept(CodeableConcept locationCodeableConcept);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
     * @param locationCodeableConcept The value for locationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationCodeableConcept(Optional<? extends CodeableConcept> locationCodeableConcept);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unitPrice(Money unitPrice);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unitPrice(Optional<? extends Money> unitPrice);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal factor(Decimal factor);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal factor(Optional<? extends Decimal> factor);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal programCode(List<CodeableConcept> programCode);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal programCode(Optional<? extends List<CodeableConcept>> programCode);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#subSite() subSite} to subSite.
     * @param subSite The value for subSite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subSite(List<CodeableConcept> subSite);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#subSite() subSite} to subSite.
     * @param subSite The value for subSite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subSite(Optional<? extends List<CodeableConcept>> subSite);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifier(List<CodeableConcept> modifier);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifier(Optional<? extends List<CodeableConcept>> modifier);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    BuildFinal provider(List<Reference> provider);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal provider(Optional<? extends List<Reference>> provider);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#subDetailSequence() subDetailSequence} to subDetailSequence.
     * @param subDetailSequence The value for subDetailSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subDetailSequence(List<PositiveInt> subDetailSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#subDetailSequence() subDetailSequence} to subDetailSequence.
     * @param subDetailSequence The value for subDetailSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subDetailSequence(Optional<? extends List<PositiveInt>> subDetailSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedDate(String servicedDate);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedDate(Optional<String> servicedDate);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(Quantity quantity);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(Optional<? extends Quantity> quantity);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link ExplanationOfBenefit_AddItem ExplanationOfBenefit_AddItem}.
     * @return An immutable instance of ExplanationOfBenefit_AddItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExplanationOfBenefit_AddItem build();
  }
}
