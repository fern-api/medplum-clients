//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ExplanationOfBenefit_AddItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_AddItem.builder()}.
 */
@org.immutables.value.Generated(from = "ExplanationOfBenefit_AddItem", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_AddItem implements com.fhir.ExplanationOfBenefit_AddItem {
  private final @javax.annotation.Nullable com.fhir.Address locationAddress;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Detail1> detail;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> provider;
  private final @javax.annotation.Nullable com.fhir.Money net;
  private final com.fhir.CodeableConcept productOrService;
  private final @javax.annotation.Nullable java.lang.String servicedDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> noteNumber;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> adjudication;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> itemSequence;
  private final @javax.annotation.Nullable com.fhir.Period servicedPeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> subSite;
  private final @javax.annotation.Nullable com.fhir.Reference locationReference;
  private final @javax.annotation.Nullable com.fhir.decimal factor;
  private final @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> detailSequence;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> modifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Money unitPrice;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> programCode;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept locationCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.Quantity quantity;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept bodySite;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> subDetailSequence;

  private ImmutableExplanationOfBenefit_AddItem(
      @javax.annotation.Nullable com.fhir.Address locationAddress,
      @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Detail1> detail,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> provider,
      @javax.annotation.Nullable com.fhir.Money net,
      com.fhir.CodeableConcept productOrService,
      @javax.annotation.Nullable java.lang.String servicedDate,
      @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> noteNumber,
      @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> adjudication,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> itemSequence,
      @javax.annotation.Nullable com.fhir.Period servicedPeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> subSite,
      @javax.annotation.Nullable com.fhir.Reference locationReference,
      @javax.annotation.Nullable com.fhir.decimal factor,
      @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> detailSequence,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> modifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Money unitPrice,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> programCode,
      @javax.annotation.Nullable com.fhir.CodeableConcept locationCodeableConcept,
      @javax.annotation.Nullable com.fhir.Quantity quantity,
      @javax.annotation.Nullable com.fhir.CodeableConcept bodySite,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> subDetailSequence) {
    this.locationAddress = locationAddress;
    this.detail = detail;
    this.provider = provider;
    this.net = net;
    this.productOrService = productOrService;
    this.servicedDate = servicedDate;
    this.noteNumber = noteNumber;
    this.adjudication = adjudication;
    this.modifierExtension = modifierExtension;
    this.itemSequence = itemSequence;
    this.servicedPeriod = servicedPeriod;
    this.subSite = subSite;
    this.locationReference = locationReference;
    this.factor = factor;
    this.detailSequence = detailSequence;
    this.modifier = modifier;
    this.extension = extension;
    this.unitPrice = unitPrice;
    this.programCode = programCode;
    this.locationCodeableConcept = locationCodeableConcept;
    this.quantity = quantity;
    this.bodySite = bodySite;
    this.id = id;
    this.subDetailSequence = subDetailSequence;
  }

  /**
   * @return The value of the {@code locationAddress} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("locationAddress")
  @Override
  public java.util.Optional<com.fhir.Address> locationAddress() {
    return java.util.Optional.ofNullable(locationAddress);
  }

  /**
   * @return The value of the {@code detail} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("detail")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Detail1>> detail() {
    return java.util.Optional.ofNullable(detail);
  }

  /**
   * @return The value of the {@code provider} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("provider")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> provider() {
    return java.util.Optional.ofNullable(provider);
  }

  /**
   * @return The value of the {@code net} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("net")
  @Override
  public java.util.Optional<com.fhir.Money> net() {
    return java.util.Optional.ofNullable(net);
  }

  /**
   * @return The value of the {@code productOrService} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("productOrService")
  @Override
  public com.fhir.CodeableConcept productOrService() {
    return productOrService;
  }

  /**
   * @return The value of the {@code servicedDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("servicedDate")
  @Override
  public java.util.Optional<java.lang.String> servicedDate() {
    return java.util.Optional.ofNullable(servicedDate);
  }

  /**
   * @return The value of the {@code noteNumber} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("noteNumber")
  @Override
  public java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber() {
    return java.util.Optional.ofNullable(noteNumber);
  }

  /**
   * @return The value of the {@code adjudication} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication() {
    return java.util.Optional.ofNullable(adjudication);
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
   * @return The value of the {@code itemSequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("itemSequence")
  @Override
  public java.util.Optional<java.util.List<com.fhir.positiveInt>> itemSequence() {
    return java.util.Optional.ofNullable(itemSequence);
  }

  /**
   * @return The value of the {@code servicedPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("servicedPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> servicedPeriod() {
    return java.util.Optional.ofNullable(servicedPeriod);
  }

  /**
   * @return The value of the {@code subSite} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subSite")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> subSite() {
    return java.util.Optional.ofNullable(subSite);
  }

  /**
   * @return The value of the {@code locationReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("locationReference")
  @Override
  public java.util.Optional<com.fhir.Reference> locationReference() {
    return java.util.Optional.ofNullable(locationReference);
  }

  /**
   * @return The value of the {@code factor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("factor")
  @Override
  public java.util.Optional<com.fhir.decimal> factor() {
    return java.util.Optional.ofNullable(factor);
  }

  /**
   * @return The value of the {@code detailSequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("detailSequence")
  @Override
  public java.util.Optional<java.util.List<com.fhir.positiveInt>> detailSequence() {
    return java.util.Optional.ofNullable(detailSequence);
  }

  /**
   * @return The value of the {@code modifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier() {
    return java.util.Optional.ofNullable(modifier);
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
   * @return The value of the {@code unitPrice} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
  @Override
  public java.util.Optional<com.fhir.Money> unitPrice() {
    return java.util.Optional.ofNullable(unitPrice);
  }

  /**
   * @return The value of the {@code programCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("programCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> programCode() {
    return java.util.Optional.ofNullable(programCode);
  }

  /**
   * @return The value of the {@code locationCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("locationCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> locationCodeableConcept() {
    return java.util.Optional.ofNullable(locationCodeableConcept);
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
   * @return The value of the {@code bodySite} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> bodySite() {
    return java.util.Optional.ofNullable(bodySite);
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
   * @return The value of the {@code subDetailSequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subDetailSequence")
  @Override
  public java.util.Optional<java.util.List<com.fhir.positiveInt>> subDetailSequence() {
    return java.util.Optional.ofNullable(subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#locationAddress() locationAddress} attribute.
   * @param value The value for locationAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withLocationAddress(com.fhir.Address value) {
    @javax.annotation.Nullable com.fhir.Address newValue = java.util.Objects.requireNonNull(value, "locationAddress");
    if (this.locationAddress == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        newValue,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#locationAddress() locationAddress} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationAddress
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withLocationAddress(java.util.Optional<? extends com.fhir.Address> optional) {
    @javax.annotation.Nullable com.fhir.Address value = optional.orElse(null);
    if (this.locationAddress == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        value,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withDetail(java.util.List<com.fhir.ExplanationOfBenefit_Detail1> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Detail1> newValue = java.util.Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        newValue,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withDetail(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Detail1>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Detail1> value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        value,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#provider() provider} attribute.
   * @param value The value for provider
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withProvider(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "provider");
    if (this.provider == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        newValue,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#provider() provider} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for provider
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withProvider(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.provider == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        value,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#net() net} attribute.
   * @param value The value for net
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withNet(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "net");
    if (this.net == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        newValue,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#net() net} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for net
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withNet(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.net == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        value,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit_AddItem#productOrService() productOrService} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for productOrService
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withProductOrService(com.fhir.CodeableConcept value) {
    if (this.productOrService == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "productOrService");
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        newValue,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#servicedDate() servicedDate} attribute.
   * @param value The value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withServicedDate(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "servicedDate");
    if (java.util.Objects.equals(this.servicedDate, newValue)) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        newValue,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#servicedDate() servicedDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withServicedDate(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.servicedDate, value)) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        value,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#noteNumber() noteNumber} attribute.
   * @param value The value for noteNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withNoteNumber(java.util.List<com.fhir.positiveInt> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> newValue = java.util.Objects.requireNonNull(value, "noteNumber");
    if (this.noteNumber == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        newValue,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#noteNumber() noteNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for noteNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withNoteNumber(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> value = optional.orElse(null);
    if (this.noteNumber == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        value,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#adjudication() adjudication} attribute.
   * @param value The value for adjudication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withAdjudication(java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> newValue = java.util.Objects.requireNonNull(value, "adjudication");
    if (this.adjudication == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        newValue,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#adjudication() adjudication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjudication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withAdjudication(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> value = optional.orElse(null);
    if (this.adjudication == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        value,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        newValue,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        value,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#itemSequence() itemSequence} attribute.
   * @param value The value for itemSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withItemSequence(java.util.List<com.fhir.positiveInt> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> newValue = java.util.Objects.requireNonNull(value, "itemSequence");
    if (this.itemSequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        newValue,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#itemSequence() itemSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for itemSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withItemSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> value = optional.orElse(null);
    if (this.itemSequence == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        value,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#servicedPeriod() servicedPeriod} attribute.
   * @param value The value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withServicedPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "servicedPeriod");
    if (this.servicedPeriod == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        newValue,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#servicedPeriod() servicedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withServicedPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.servicedPeriod == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        value,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#subSite() subSite} attribute.
   * @param value The value for subSite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withSubSite(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "subSite");
    if (this.subSite == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        newValue,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#subSite() subSite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subSite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withSubSite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.subSite == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        value,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#locationReference() locationReference} attribute.
   * @param value The value for locationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withLocationReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "locationReference");
    if (this.locationReference == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        newValue,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#locationReference() locationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withLocationReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.locationReference == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        value,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withFactor(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        newValue,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withFactor(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        value,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#detailSequence() detailSequence} attribute.
   * @param value The value for detailSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withDetailSequence(java.util.List<com.fhir.positiveInt> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> newValue = java.util.Objects.requireNonNull(value, "detailSequence");
    if (this.detailSequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        newValue,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#detailSequence() detailSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detailSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withDetailSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> value = optional.orElse(null);
    if (this.detailSequence == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        value,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#modifier() modifier} attribute.
   * @param value The value for modifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withModifier(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "modifier");
    if (this.modifier == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        newValue,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#modifier() modifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withModifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.modifier == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        value,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        newValue,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        value,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#unitPrice() unitPrice} attribute.
   * @param value The value for unitPrice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withUnitPrice(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "unitPrice");
    if (this.unitPrice == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        newValue,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#unitPrice() unitPrice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitPrice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withUnitPrice(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.unitPrice == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        value,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#programCode() programCode} attribute.
   * @param value The value for programCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withProgramCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "programCode");
    if (this.programCode == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        newValue,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#programCode() programCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for programCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withProgramCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.programCode == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        value,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#locationCodeableConcept() locationCodeableConcept} attribute.
   * @param value The value for locationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withLocationCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "locationCodeableConcept");
    if (this.locationCodeableConcept == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        newValue,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#locationCodeableConcept() locationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withLocationCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.locationCodeableConcept == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        value,
        this.quantity,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        newValue,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        value,
        this.bodySite,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withBodySite(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        newValue,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withBodySite(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        value,
        this.id,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        newValue,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        value,
        this.subDetailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_AddItem#subDetailSequence() subDetailSequence} attribute.
   * @param value The value for subDetailSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_AddItem withSubDetailSequence(java.util.List<com.fhir.positiveInt> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> newValue = java.util.Objects.requireNonNull(value, "subDetailSequence");
    if (this.subDetailSequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_AddItem#subDetailSequence() subDetailSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subDetailSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_AddItem withSubDetailSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> value = optional.orElse(null);
    if (this.subDetailSequence == value) return this;
    return new ImmutableExplanationOfBenefit_AddItem(
        this.locationAddress,
        this.detail,
        this.provider,
        this.net,
        this.productOrService,
        this.servicedDate,
        this.noteNumber,
        this.adjudication,
        this.modifierExtension,
        this.itemSequence,
        this.servicedPeriod,
        this.subSite,
        this.locationReference,
        this.factor,
        this.detailSequence,
        this.modifier,
        this.extension,
        this.unitPrice,
        this.programCode,
        this.locationCodeableConcept,
        this.quantity,
        this.bodySite,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_AddItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_AddItem
        && equalTo((ImmutableExplanationOfBenefit_AddItem) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_AddItem another) {
    return java.util.Objects.equals(locationAddress, another.locationAddress)
        && java.util.Objects.equals(detail, another.detail)
        && java.util.Objects.equals(provider, another.provider)
        && java.util.Objects.equals(net, another.net)
        && productOrService.equals(another.productOrService)
        && java.util.Objects.equals(servicedDate, another.servicedDate)
        && java.util.Objects.equals(noteNumber, another.noteNumber)
        && java.util.Objects.equals(adjudication, another.adjudication)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(itemSequence, another.itemSequence)
        && java.util.Objects.equals(servicedPeriod, another.servicedPeriod)
        && java.util.Objects.equals(subSite, another.subSite)
        && java.util.Objects.equals(locationReference, another.locationReference)
        && java.util.Objects.equals(factor, another.factor)
        && java.util.Objects.equals(detailSequence, another.detailSequence)
        && java.util.Objects.equals(modifier, another.modifier)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(unitPrice, another.unitPrice)
        && java.util.Objects.equals(programCode, another.programCode)
        && java.util.Objects.equals(locationCodeableConcept, another.locationCodeableConcept)
        && java.util.Objects.equals(quantity, another.quantity)
        && java.util.Objects.equals(bodySite, another.bodySite)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(subDetailSequence, another.subDetailSequence);
  }

  /**
   * Computes a hash code from attributes: {@code locationAddress}, {@code detail}, {@code provider}, {@code net}, {@code productOrService}, {@code servicedDate}, {@code noteNumber}, {@code adjudication}, {@code modifierExtension}, {@code itemSequence}, {@code servicedPeriod}, {@code subSite}, {@code locationReference}, {@code factor}, {@code detailSequence}, {@code modifier}, {@code extension}, {@code unitPrice}, {@code programCode}, {@code locationCodeableConcept}, {@code quantity}, {@code bodySite}, {@code id}, {@code subDetailSequence}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(locationAddress);
    h += (h << 5) + java.util.Objects.hashCode(detail);
    h += (h << 5) + java.util.Objects.hashCode(provider);
    h += (h << 5) + java.util.Objects.hashCode(net);
    h += (h << 5) + productOrService.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(servicedDate);
    h += (h << 5) + java.util.Objects.hashCode(noteNumber);
    h += (h << 5) + java.util.Objects.hashCode(adjudication);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(itemSequence);
    h += (h << 5) + java.util.Objects.hashCode(servicedPeriod);
    h += (h << 5) + java.util.Objects.hashCode(subSite);
    h += (h << 5) + java.util.Objects.hashCode(locationReference);
    h += (h << 5) + java.util.Objects.hashCode(factor);
    h += (h << 5) + java.util.Objects.hashCode(detailSequence);
    h += (h << 5) + java.util.Objects.hashCode(modifier);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(unitPrice);
    h += (h << 5) + java.util.Objects.hashCode(programCode);
    h += (h << 5) + java.util.Objects.hashCode(locationCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(quantity);
    h += (h << 5) + java.util.Objects.hashCode(bodySite);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(subDetailSequence);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_AddItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ExplanationOfBenefit_AddItem{");
    if (locationAddress != null) {
      builder.append("locationAddress=").append(locationAddress);
    }
    if (detail != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("detail=").append(detail);
    }
    if (provider != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("provider=").append(provider);
    }
    if (net != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("net=").append(net);
    }
    if (builder.length() > 29) builder.append(", ");
    builder.append("productOrService=").append(productOrService);
    if (servicedDate != null) {
      builder.append(", ");
      builder.append("servicedDate=").append(servicedDate);
    }
    if (noteNumber != null) {
      builder.append(", ");
      builder.append("noteNumber=").append(noteNumber);
    }
    if (adjudication != null) {
      builder.append(", ");
      builder.append("adjudication=").append(adjudication);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (itemSequence != null) {
      builder.append(", ");
      builder.append("itemSequence=").append(itemSequence);
    }
    if (servicedPeriod != null) {
      builder.append(", ");
      builder.append("servicedPeriod=").append(servicedPeriod);
    }
    if (subSite != null) {
      builder.append(", ");
      builder.append("subSite=").append(subSite);
    }
    if (locationReference != null) {
      builder.append(", ");
      builder.append("locationReference=").append(locationReference);
    }
    if (factor != null) {
      builder.append(", ");
      builder.append("factor=").append(factor);
    }
    if (detailSequence != null) {
      builder.append(", ");
      builder.append("detailSequence=").append(detailSequence);
    }
    if (modifier != null) {
      builder.append(", ");
      builder.append("modifier=").append(modifier);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (unitPrice != null) {
      builder.append(", ");
      builder.append("unitPrice=").append(unitPrice);
    }
    if (programCode != null) {
      builder.append(", ");
      builder.append("programCode=").append(programCode);
    }
    if (locationCodeableConcept != null) {
      builder.append(", ");
      builder.append("locationCodeableConcept=").append(locationCodeableConcept);
    }
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (bodySite != null) {
      builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (subDetailSequence != null) {
      builder.append(", ");
      builder.append("subDetailSequence=").append(subDetailSequence);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ExplanationOfBenefit_AddItem", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ExplanationOfBenefit_AddItem {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Address> locationAddress = java.util.Optional.empty();
    boolean locationAddressIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Detail1>> detail = java.util.Optional.empty();
    boolean detailIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> provider = java.util.Optional.empty();
    boolean providerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> net = java.util.Optional.empty();
    boolean netIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept productOrService;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> servicedDate = java.util.Optional.empty();
    boolean servicedDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber = java.util.Optional.empty();
    boolean noteNumberIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication = java.util.Optional.empty();
    boolean adjudicationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.positiveInt>> itemSequence = java.util.Optional.empty();
    boolean itemSequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> servicedPeriod = java.util.Optional.empty();
    boolean servicedPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> subSite = java.util.Optional.empty();
    boolean subSiteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> locationReference = java.util.Optional.empty();
    boolean locationReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> factor = java.util.Optional.empty();
    boolean factorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.positiveInt>> detailSequence = java.util.Optional.empty();
    boolean detailSequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier = java.util.Optional.empty();
    boolean modifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> unitPrice = java.util.Optional.empty();
    boolean unitPriceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> programCode = java.util.Optional.empty();
    boolean programCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> locationCodeableConcept = java.util.Optional.empty();
    boolean locationCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> quantity = java.util.Optional.empty();
    boolean quantityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> bodySite = java.util.Optional.empty();
    boolean bodySiteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.positiveInt>> subDetailSequence = java.util.Optional.empty();
    boolean subDetailSequenceIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("locationAddress")
    public void setLocationAddress(java.util.Optional<com.fhir.Address> locationAddress) {
      this.locationAddress = locationAddress;
      this.locationAddressIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    public void setDetail(java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Detail1>> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    public void setProvider(java.util.Optional<java.util.List<com.fhir.Reference>> provider) {
      this.provider = provider;
      this.providerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("net")
    public void setNet(java.util.Optional<com.fhir.Money> net) {
      this.net = net;
      this.netIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("productOrService")
    public void setProductOrService(com.fhir.CodeableConcept productOrService) {
      this.productOrService = productOrService;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("servicedDate")
    public void setServicedDate(java.util.Optional<java.lang.String> servicedDate) {
      this.servicedDate = servicedDate;
      this.servicedDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("noteNumber")
    public void setNoteNumber(java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber) {
      this.noteNumber = noteNumber;
      this.noteNumberIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
    public void setAdjudication(java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication) {
      this.adjudication = adjudication;
      this.adjudicationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("itemSequence")
    public void setItemSequence(java.util.Optional<java.util.List<com.fhir.positiveInt>> itemSequence) {
      this.itemSequence = itemSequence;
      this.itemSequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("servicedPeriod")
    public void setServicedPeriod(java.util.Optional<com.fhir.Period> servicedPeriod) {
      this.servicedPeriod = servicedPeriod;
      this.servicedPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subSite")
    public void setSubSite(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> subSite) {
      this.subSite = subSite;
      this.subSiteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("locationReference")
    public void setLocationReference(java.util.Optional<com.fhir.Reference> locationReference) {
      this.locationReference = locationReference;
      this.locationReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("factor")
    public void setFactor(java.util.Optional<com.fhir.decimal> factor) {
      this.factor = factor;
      this.factorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("detailSequence")
    public void setDetailSequence(java.util.Optional<java.util.List<com.fhir.positiveInt>> detailSequence) {
      this.detailSequence = detailSequence;
      this.detailSequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifier")
    public void setModifier(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier) {
      this.modifier = modifier;
      this.modifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
    public void setUnitPrice(java.util.Optional<com.fhir.Money> unitPrice) {
      this.unitPrice = unitPrice;
      this.unitPriceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("programCode")
    public void setProgramCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> programCode) {
      this.programCode = programCode;
      this.programCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("locationCodeableConcept")
    public void setLocationCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> locationCodeableConcept) {
      this.locationCodeableConcept = locationCodeableConcept;
      this.locationCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public void setQuantity(java.util.Optional<com.fhir.Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public void setBodySite(java.util.Optional<com.fhir.CodeableConcept> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subDetailSequence")
    public void setSubDetailSequence(java.util.Optional<java.util.List<com.fhir.positiveInt>> subDetailSequence) {
      this.subDetailSequence = subDetailSequence;
      this.subDetailSequenceIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Address> locationAddress() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Detail1>> detail() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> provider() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> net() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept productOrService() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> servicedDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.positiveInt>> itemSequence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> servicedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> subSite() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> locationReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> factor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.positiveInt>> detailSequence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> unitPrice() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> programCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> locationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.positiveInt>> subDetailSequence() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_AddItem fromJson(Json json) {
    ImmutableExplanationOfBenefit_AddItem.Builder builder = ((ImmutableExplanationOfBenefit_AddItem.Builder) ImmutableExplanationOfBenefit_AddItem.builder());
    if (json.locationAddressIsSet) {
      builder.locationAddress(json.locationAddress);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.providerIsSet) {
      builder.provider(json.provider);
    }
    if (json.netIsSet) {
      builder.net(json.net);
    }
    if (json.productOrService != null) {
      builder.productOrService(json.productOrService);
    }
    if (json.servicedDateIsSet) {
      builder.servicedDate(json.servicedDate);
    }
    if (json.noteNumberIsSet) {
      builder.noteNumber(json.noteNumber);
    }
    if (json.adjudicationIsSet) {
      builder.adjudication(json.adjudication);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.itemSequenceIsSet) {
      builder.itemSequence(json.itemSequence);
    }
    if (json.servicedPeriodIsSet) {
      builder.servicedPeriod(json.servicedPeriod);
    }
    if (json.subSiteIsSet) {
      builder.subSite(json.subSite);
    }
    if (json.locationReferenceIsSet) {
      builder.locationReference(json.locationReference);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    if (json.detailSequenceIsSet) {
      builder.detailSequence(json.detailSequence);
    }
    if (json.modifierIsSet) {
      builder.modifier(json.modifier);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.unitPriceIsSet) {
      builder.unitPrice(json.unitPrice);
    }
    if (json.programCodeIsSet) {
      builder.programCode(json.programCode);
    }
    if (json.locationCodeableConceptIsSet) {
      builder.locationCodeableConcept(json.locationCodeableConcept);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.subDetailSequenceIsSet) {
      builder.subDetailSequence(json.subDetailSequence);
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
        .locationAddress(instance.locationAddress())
        .detail(instance.detail())
        .provider(instance.provider())
        .net(instance.net())
        .productOrService(instance.productOrService())
        .servicedDate(instance.servicedDate())
        .noteNumber(instance.noteNumber())
        .adjudication(instance.adjudication())
        .modifierExtension(instance.modifierExtension())
        .itemSequence(instance.itemSequence())
        .servicedPeriod(instance.servicedPeriod())
        .subSite(instance.subSite())
        .locationReference(instance.locationReference())
        .factor(instance.factor())
        .detailSequence(instance.detailSequence())
        .modifier(instance.modifier())
        .extension(instance.extension())
        .unitPrice(instance.unitPrice())
        .programCode(instance.programCode())
        .locationCodeableConcept(instance.locationCodeableConcept())
        .quantity(instance.quantity())
        .bodySite(instance.bodySite())
        .id(instance.id())
        .subDetailSequence(instance.subDetailSequence())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_AddItem ExplanationOfBenefit_AddItem}.
   * <pre>
   * ImmutableExplanationOfBenefit_AddItem.builder()
   *    .locationAddress(com.fhir.Address) // optional {@link ExplanationOfBenefit_AddItem#locationAddress() locationAddress}
   *    .detail(List&amp;lt;com.fhir.ExplanationOfBenefit_Detail1&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#detail() detail}
   *    .provider(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#provider() provider}
   *    .net(com.fhir.Money) // optional {@link ExplanationOfBenefit_AddItem#net() net}
   *    .productOrService(com.fhir.CodeableConcept) // required {@link ExplanationOfBenefit_AddItem#productOrService() productOrService}
   *    .servicedDate(String) // optional {@link ExplanationOfBenefit_AddItem#servicedDate() servicedDate}
   *    .noteNumber(List&amp;lt;com.fhir.positiveInt&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#noteNumber() noteNumber}
   *    .adjudication(List&amp;lt;com.fhir.ExplanationOfBenefit_Adjudication&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#adjudication() adjudication}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#modifierExtension() modifierExtension}
   *    .itemSequence(List&amp;lt;com.fhir.positiveInt&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#itemSequence() itemSequence}
   *    .servicedPeriod(com.fhir.Period) // optional {@link ExplanationOfBenefit_AddItem#servicedPeriod() servicedPeriod}
   *    .subSite(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#subSite() subSite}
   *    .locationReference(com.fhir.Reference) // optional {@link ExplanationOfBenefit_AddItem#locationReference() locationReference}
   *    .factor(com.fhir.decimal) // optional {@link ExplanationOfBenefit_AddItem#factor() factor}
   *    .detailSequence(List&amp;lt;com.fhir.positiveInt&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#detailSequence() detailSequence}
   *    .modifier(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#modifier() modifier}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#extension() extension}
   *    .unitPrice(com.fhir.Money) // optional {@link ExplanationOfBenefit_AddItem#unitPrice() unitPrice}
   *    .programCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#programCode() programCode}
   *    .locationCodeableConcept(com.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_AddItem#locationCodeableConcept() locationCodeableConcept}
   *    .quantity(com.fhir.Quantity) // optional {@link ExplanationOfBenefit_AddItem#quantity() quantity}
   *    .bodySite(com.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_AddItem#bodySite() bodySite}
   *    .id(String) // optional {@link ExplanationOfBenefit_AddItem#id() id}
   *    .subDetailSequence(List&amp;lt;com.fhir.positiveInt&amp;gt;) // optional {@link ExplanationOfBenefit_AddItem#subDetailSequence() subDetailSequence}
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
  @org.immutables.value.Generated(from = "ExplanationOfBenefit_AddItem", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ProductOrServiceBuildStage, BuildFinal {
    private static final long INIT_BIT_PRODUCT_OR_SERVICE = 0x1L;
    private static final long OPT_BIT_LOCATION_ADDRESS = 0x1L;
    private static final long OPT_BIT_DETAIL = 0x2L;
    private static final long OPT_BIT_PROVIDER = 0x4L;
    private static final long OPT_BIT_NET = 0x8L;
    private static final long OPT_BIT_SERVICED_DATE = 0x10L;
    private static final long OPT_BIT_NOTE_NUMBER = 0x20L;
    private static final long OPT_BIT_ADJUDICATION = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_ITEM_SEQUENCE = 0x100L;
    private static final long OPT_BIT_SERVICED_PERIOD = 0x200L;
    private static final long OPT_BIT_SUB_SITE = 0x400L;
    private static final long OPT_BIT_LOCATION_REFERENCE = 0x800L;
    private static final long OPT_BIT_FACTOR = 0x1000L;
    private static final long OPT_BIT_DETAIL_SEQUENCE = 0x2000L;
    private static final long OPT_BIT_MODIFIER = 0x4000L;
    private static final long OPT_BIT_EXTENSION = 0x8000L;
    private static final long OPT_BIT_UNIT_PRICE = 0x10000L;
    private static final long OPT_BIT_PROGRAM_CODE = 0x20000L;
    private static final long OPT_BIT_LOCATION_CODEABLE_CONCEPT = 0x40000L;
    private static final long OPT_BIT_QUANTITY = 0x80000L;
    private static final long OPT_BIT_BODY_SITE = 0x100000L;
    private static final long OPT_BIT_ID = 0x200000L;
    private static final long OPT_BIT_SUB_DETAIL_SEQUENCE = 0x400000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Address locationAddress;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Detail1> detail;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> provider;
    private @javax.annotation.Nullable com.fhir.Money net;
    private @javax.annotation.Nullable com.fhir.CodeableConcept productOrService;
    private @javax.annotation.Nullable java.lang.String servicedDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> noteNumber;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> adjudication;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> itemSequence;
    private @javax.annotation.Nullable com.fhir.Period servicedPeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> subSite;
    private @javax.annotation.Nullable com.fhir.Reference locationReference;
    private @javax.annotation.Nullable com.fhir.decimal factor;
    private @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> detailSequence;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> modifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Money unitPrice;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> programCode;
    private @javax.annotation.Nullable com.fhir.CodeableConcept locationCodeableConcept;
    private @javax.annotation.Nullable com.fhir.Quantity quantity;
    private @javax.annotation.Nullable com.fhir.CodeableConcept bodySite;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> subDetailSequence;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for chained invocation
     */
    public final Builder locationAddress(com.fhir.Address locationAddress) {
      checkNotIsSet(locationAddressIsSet(), "locationAddress");
      this.locationAddress = java.util.Objects.requireNonNull(locationAddress, "locationAddress");
      optBits |= OPT_BIT_LOCATION_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("locationAddress")
    public final Builder locationAddress(java.util.Optional<? extends com.fhir.Address> locationAddress) {
      checkNotIsSet(locationAddressIsSet(), "locationAddress");
      this.locationAddress = locationAddress.orElse(null);
      optBits |= OPT_BIT_LOCATION_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(java.util.List<com.fhir.ExplanationOfBenefit_Detail1> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = java.util.Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    public final Builder detail(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Detail1>> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    public final Builder provider(java.util.List<com.fhir.Reference> provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = java.util.Objects.requireNonNull(provider, "provider");
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    public final Builder provider(java.util.Optional<? extends java.util.List<com.fhir.Reference>> provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = provider.orElse(null);
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for chained invocation
     */
    public final Builder net(com.fhir.Money net) {
      checkNotIsSet(netIsSet(), "net");
      this.net = java.util.Objects.requireNonNull(net, "net");
      optBits |= OPT_BIT_NET;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("net")
    public final Builder net(java.util.Optional<? extends com.fhir.Money> net) {
      checkNotIsSet(netIsSet(), "net");
      this.net = net.orElse(null);
      optBits |= OPT_BIT_NET;
      return this;
    }

    /**
     * Initializes the value for the {@link ExplanationOfBenefit_AddItem#productOrService() productOrService} attribute.
     * @param productOrService The value for productOrService 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productOrService")
    public final Builder productOrService(com.fhir.CodeableConcept productOrService) {
      checkNotIsSet(productOrServiceIsSet(), "productOrService");
      this.productOrService = java.util.Objects.requireNonNull(productOrService, "productOrService");
      initBits &= ~INIT_BIT_PRODUCT_OR_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder servicedDate(java.lang.String servicedDate) {
      checkNotIsSet(servicedDateIsSet(), "servicedDate");
      this.servicedDate = java.util.Objects.requireNonNull(servicedDate, "servicedDate");
      optBits |= OPT_BIT_SERVICED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("servicedDate")
    public final Builder servicedDate(java.util.Optional<java.lang.String> servicedDate) {
      checkNotIsSet(servicedDateIsSet(), "servicedDate");
      this.servicedDate = servicedDate.orElse(null);
      optBits |= OPT_BIT_SERVICED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder noteNumber(java.util.List<com.fhir.positiveInt> noteNumber) {
      checkNotIsSet(noteNumberIsSet(), "noteNumber");
      this.noteNumber = java.util.Objects.requireNonNull(noteNumber, "noteNumber");
      optBits |= OPT_BIT_NOTE_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("noteNumber")
    public final Builder noteNumber(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> noteNumber) {
      checkNotIsSet(noteNumberIsSet(), "noteNumber");
      this.noteNumber = noteNumber.orElse(null);
      optBits |= OPT_BIT_NOTE_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    public final Builder adjudication(java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> adjudication) {
      checkNotIsSet(adjudicationIsSet(), "adjudication");
      this.adjudication = java.util.Objects.requireNonNull(adjudication, "adjudication");
      optBits |= OPT_BIT_ADJUDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
    public final Builder adjudication(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication) {
      checkNotIsSet(adjudicationIsSet(), "adjudication");
      this.adjudication = adjudication.orElse(null);
      optBits |= OPT_BIT_ADJUDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#itemSequence() itemSequence} to itemSequence.
     * @param itemSequence The value for itemSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder itemSequence(java.util.List<com.fhir.positiveInt> itemSequence) {
      checkNotIsSet(itemSequenceIsSet(), "itemSequence");
      this.itemSequence = java.util.Objects.requireNonNull(itemSequence, "itemSequence");
      optBits |= OPT_BIT_ITEM_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#itemSequence() itemSequence} to itemSequence.
     * @param itemSequence The value for itemSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("itemSequence")
    public final Builder itemSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> itemSequence) {
      checkNotIsSet(itemSequenceIsSet(), "itemSequence");
      this.itemSequence = itemSequence.orElse(null);
      optBits |= OPT_BIT_ITEM_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder servicedPeriod(com.fhir.Period servicedPeriod) {
      checkNotIsSet(servicedPeriodIsSet(), "servicedPeriod");
      this.servicedPeriod = java.util.Objects.requireNonNull(servicedPeriod, "servicedPeriod");
      optBits |= OPT_BIT_SERVICED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("servicedPeriod")
    public final Builder servicedPeriod(java.util.Optional<? extends com.fhir.Period> servicedPeriod) {
      checkNotIsSet(servicedPeriodIsSet(), "servicedPeriod");
      this.servicedPeriod = servicedPeriod.orElse(null);
      optBits |= OPT_BIT_SERVICED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#subSite() subSite} to subSite.
     * @param subSite The value for subSite
     * @return {@code this} builder for chained invocation
     */
    public final Builder subSite(java.util.List<com.fhir.CodeableConcept> subSite) {
      checkNotIsSet(subSiteIsSet(), "subSite");
      this.subSite = java.util.Objects.requireNonNull(subSite, "subSite");
      optBits |= OPT_BIT_SUB_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#subSite() subSite} to subSite.
     * @param subSite The value for subSite
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subSite")
    public final Builder subSite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> subSite) {
      checkNotIsSet(subSiteIsSet(), "subSite");
      this.subSite = subSite.orElse(null);
      optBits |= OPT_BIT_SUB_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder locationReference(com.fhir.Reference locationReference) {
      checkNotIsSet(locationReferenceIsSet(), "locationReference");
      this.locationReference = java.util.Objects.requireNonNull(locationReference, "locationReference");
      optBits |= OPT_BIT_LOCATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("locationReference")
    public final Builder locationReference(java.util.Optional<? extends com.fhir.Reference> locationReference) {
      checkNotIsSet(locationReferenceIsSet(), "locationReference");
      this.locationReference = locationReference.orElse(null);
      optBits |= OPT_BIT_LOCATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    public final Builder factor(com.fhir.decimal factor) {
      checkNotIsSet(factorIsSet(), "factor");
      this.factor = java.util.Objects.requireNonNull(factor, "factor");
      optBits |= OPT_BIT_FACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("factor")
    public final Builder factor(java.util.Optional<? extends com.fhir.decimal> factor) {
      checkNotIsSet(factorIsSet(), "factor");
      this.factor = factor.orElse(null);
      optBits |= OPT_BIT_FACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#detailSequence() detailSequence} to detailSequence.
     * @param detailSequence The value for detailSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder detailSequence(java.util.List<com.fhir.positiveInt> detailSequence) {
      checkNotIsSet(detailSequenceIsSet(), "detailSequence");
      this.detailSequence = java.util.Objects.requireNonNull(detailSequence, "detailSequence");
      optBits |= OPT_BIT_DETAIL_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#detailSequence() detailSequence} to detailSequence.
     * @param detailSequence The value for detailSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("detailSequence")
    public final Builder detailSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> detailSequence) {
      checkNotIsSet(detailSequenceIsSet(), "detailSequence");
      this.detailSequence = detailSequence.orElse(null);
      optBits |= OPT_BIT_DETAIL_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifier(java.util.List<com.fhir.CodeableConcept> modifier) {
      checkNotIsSet(modifierIsSet(), "modifier");
      this.modifier = java.util.Objects.requireNonNull(modifier, "modifier");
      optBits |= OPT_BIT_MODIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifier")
    public final Builder modifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> modifier) {
      checkNotIsSet(modifierIsSet(), "modifier");
      this.modifier = modifier.orElse(null);
      optBits |= OPT_BIT_MODIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for chained invocation
     */
    public final Builder unitPrice(com.fhir.Money unitPrice) {
      checkNotIsSet(unitPriceIsSet(), "unitPrice");
      this.unitPrice = java.util.Objects.requireNonNull(unitPrice, "unitPrice");
      optBits |= OPT_BIT_UNIT_PRICE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
    public final Builder unitPrice(java.util.Optional<? extends com.fhir.Money> unitPrice) {
      checkNotIsSet(unitPriceIsSet(), "unitPrice");
      this.unitPrice = unitPrice.orElse(null);
      optBits |= OPT_BIT_UNIT_PRICE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder programCode(java.util.List<com.fhir.CodeableConcept> programCode) {
      checkNotIsSet(programCodeIsSet(), "programCode");
      this.programCode = java.util.Objects.requireNonNull(programCode, "programCode");
      optBits |= OPT_BIT_PROGRAM_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("programCode")
    public final Builder programCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> programCode) {
      checkNotIsSet(programCodeIsSet(), "programCode");
      this.programCode = programCode.orElse(null);
      optBits |= OPT_BIT_PROGRAM_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
     * @param locationCodeableConcept The value for locationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder locationCodeableConcept(com.fhir.CodeableConcept locationCodeableConcept) {
      checkNotIsSet(locationCodeableConceptIsSet(), "locationCodeableConcept");
      this.locationCodeableConcept = java.util.Objects.requireNonNull(locationCodeableConcept, "locationCodeableConcept");
      optBits |= OPT_BIT_LOCATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
     * @param locationCodeableConcept The value for locationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("locationCodeableConcept")
    public final Builder locationCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> locationCodeableConcept) {
      checkNotIsSet(locationCodeableConceptIsSet(), "locationCodeableConcept");
      this.locationCodeableConcept = locationCodeableConcept.orElse(null);
      optBits |= OPT_BIT_LOCATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    public final Builder bodySite(com.fhir.CodeableConcept bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = java.util.Objects.requireNonNull(bodySite, "bodySite");
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public final Builder bodySite(java.util.Optional<? extends com.fhir.CodeableConcept> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = bodySite.orElse(null);
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#subDetailSequence() subDetailSequence} to subDetailSequence.
     * @param subDetailSequence The value for subDetailSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder subDetailSequence(java.util.List<com.fhir.positiveInt> subDetailSequence) {
      checkNotIsSet(subDetailSequenceIsSet(), "subDetailSequence");
      this.subDetailSequence = java.util.Objects.requireNonNull(subDetailSequence, "subDetailSequence");
      optBits |= OPT_BIT_SUB_DETAIL_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#subDetailSequence() subDetailSequence} to subDetailSequence.
     * @param subDetailSequence The value for subDetailSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subDetailSequence")
    public final Builder subDetailSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> subDetailSequence) {
      checkNotIsSet(subDetailSequenceIsSet(), "subDetailSequence");
      this.subDetailSequence = subDetailSequence.orElse(null);
      optBits |= OPT_BIT_SUB_DETAIL_SEQUENCE;
      return this;
    }

    /**
     * Builds a new {@link ExplanationOfBenefit_AddItem ExplanationOfBenefit_AddItem}.
     * @return An immutable instance of ExplanationOfBenefit_AddItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ExplanationOfBenefit_AddItem build() {
      checkRequiredAttributes();
      return new ImmutableExplanationOfBenefit_AddItem(
          locationAddress,
          detail,
          provider,
          net,
          productOrService,
          servicedDate,
          noteNumber,
          adjudication,
          modifierExtension,
          itemSequence,
          servicedPeriod,
          subSite,
          locationReference,
          factor,
          detailSequence,
          modifier,
          extension,
          unitPrice,
          programCode,
          locationCodeableConcept,
          quantity,
          bodySite,
          id,
          subDetailSequence);
    }

    private boolean locationAddressIsSet() {
      return (optBits & OPT_BIT_LOCATION_ADDRESS) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean providerIsSet() {
      return (optBits & OPT_BIT_PROVIDER) != 0;
    }

    private boolean netIsSet() {
      return (optBits & OPT_BIT_NET) != 0;
    }

    private boolean servicedDateIsSet() {
      return (optBits & OPT_BIT_SERVICED_DATE) != 0;
    }

    private boolean noteNumberIsSet() {
      return (optBits & OPT_BIT_NOTE_NUMBER) != 0;
    }

    private boolean adjudicationIsSet() {
      return (optBits & OPT_BIT_ADJUDICATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean itemSequenceIsSet() {
      return (optBits & OPT_BIT_ITEM_SEQUENCE) != 0;
    }

    private boolean servicedPeriodIsSet() {
      return (optBits & OPT_BIT_SERVICED_PERIOD) != 0;
    }

    private boolean subSiteIsSet() {
      return (optBits & OPT_BIT_SUB_SITE) != 0;
    }

    private boolean locationReferenceIsSet() {
      return (optBits & OPT_BIT_LOCATION_REFERENCE) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private boolean detailSequenceIsSet() {
      return (optBits & OPT_BIT_DETAIL_SEQUENCE) != 0;
    }

    private boolean modifierIsSet() {
      return (optBits & OPT_BIT_MODIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean unitPriceIsSet() {
      return (optBits & OPT_BIT_UNIT_PRICE) != 0;
    }

    private boolean programCodeIsSet() {
      return (optBits & OPT_BIT_PROGRAM_CODE) != 0;
    }

    private boolean locationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_LOCATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean subDetailSequenceIsSet() {
      return (optBits & OPT_BIT_SUB_DETAIL_SEQUENCE) != 0;
    }

    private boolean productOrServiceIsSet() {
      return (initBits & INIT_BIT_PRODUCT_OR_SERVICE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ExplanationOfBenefit_AddItem is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!productOrServiceIsSet()) attributes.add("productOrService");
      return "Cannot build ExplanationOfBenefit_AddItem, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ExplanationOfBenefit_AddItem", generator = "Immutables")
  public interface ProductOrServiceBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit_AddItem#productOrService() productOrService} attribute.
     * @param productOrService The value for productOrService 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productOrService(com.fhir.CodeableConcept productOrService);
  }

  @org.immutables.value.Generated(from = "ExplanationOfBenefit_AddItem", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationAddress(com.fhir.Address locationAddress);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationAddress(java.util.Optional<? extends com.fhir.Address> locationAddress);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detail(java.util.List<com.fhir.ExplanationOfBenefit_Detail1> detail);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detail(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Detail1>> detail);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    BuildFinal provider(java.util.List<com.fhir.Reference> provider);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal provider(java.util.Optional<? extends java.util.List<com.fhir.Reference>> provider);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for chained invocation
     */
    BuildFinal net(com.fhir.Money net);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal net(java.util.Optional<? extends com.fhir.Money> net);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedDate(java.lang.String servicedDate);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedDate(java.util.Optional<java.lang.String> servicedDate);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal noteNumber(java.util.List<com.fhir.positiveInt> noteNumber);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal noteNumber(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> noteNumber);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal adjudication(java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> adjudication);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal adjudication(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#itemSequence() itemSequence} to itemSequence.
     * @param itemSequence The value for itemSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal itemSequence(java.util.List<com.fhir.positiveInt> itemSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#itemSequence() itemSequence} to itemSequence.
     * @param itemSequence The value for itemSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal itemSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> itemSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedPeriod(com.fhir.Period servicedPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedPeriod(java.util.Optional<? extends com.fhir.Period> servicedPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#subSite() subSite} to subSite.
     * @param subSite The value for subSite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subSite(java.util.List<com.fhir.CodeableConcept> subSite);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#subSite() subSite} to subSite.
     * @param subSite The value for subSite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subSite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> subSite);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationReference(com.fhir.Reference locationReference);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationReference(java.util.Optional<? extends com.fhir.Reference> locationReference);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal factor(com.fhir.decimal factor);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal factor(java.util.Optional<? extends com.fhir.decimal> factor);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#detailSequence() detailSequence} to detailSequence.
     * @param detailSequence The value for detailSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detailSequence(java.util.List<com.fhir.positiveInt> detailSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#detailSequence() detailSequence} to detailSequence.
     * @param detailSequence The value for detailSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detailSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> detailSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifier(java.util.List<com.fhir.CodeableConcept> modifier);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> modifier);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unitPrice(com.fhir.Money unitPrice);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unitPrice(java.util.Optional<? extends com.fhir.Money> unitPrice);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal programCode(java.util.List<com.fhir.CodeableConcept> programCode);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal programCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> programCode);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
     * @param locationCodeableConcept The value for locationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationCodeableConcept(com.fhir.CodeableConcept locationCodeableConcept);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
     * @param locationCodeableConcept The value for locationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> locationCodeableConcept);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(com.fhir.Quantity quantity);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(java.util.Optional<? extends com.fhir.Quantity> quantity);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(com.fhir.CodeableConcept bodySite);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(java.util.Optional<? extends com.fhir.CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#subDetailSequence() subDetailSequence} to subDetailSequence.
     * @param subDetailSequence The value for subDetailSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subDetailSequence(java.util.List<com.fhir.positiveInt> subDetailSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_AddItem#subDetailSequence() subDetailSequence} to subDetailSequence.
     * @param subDetailSequence The value for subDetailSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subDetailSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> subDetailSequence);

    /**
     * Builds a new {@link ExplanationOfBenefit_AddItem ExplanationOfBenefit_AddItem}.
     * @return An immutable instance of ExplanationOfBenefit_AddItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExplanationOfBenefit_AddItem build();
  }
}
