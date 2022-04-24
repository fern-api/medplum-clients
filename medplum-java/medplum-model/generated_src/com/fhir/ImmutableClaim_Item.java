//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Claim_Item}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaim_Item.builder()}.
 */
@org.immutables.value.Generated(from = "Claim_Item", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaim_Item implements com.fhir.Claim_Item {
  private final com.fhir.CodeableConcept productOrService;
  private final @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> procedureSequence;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String servicedDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> udi;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.Reference locationReference;
  private final @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> informationSequence;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> encounter;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept locationCodeableConcept;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> modifier;
  private final @javax.annotation.Nullable com.fhir.Money unitPrice;
  private final @javax.annotation.Nullable com.fhir.Address locationAddress;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept bodySite;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept revenue;
  private final @javax.annotation.Nullable com.fhir.positiveInt sequence;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> subSite;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept category;
  private final @javax.annotation.Nullable com.fhir.Period servicedPeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Money net;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> programCode;
  private final @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> careTeamSequence;
  private final @javax.annotation.Nullable com.fhir.Quantity quantity;
  private final @javax.annotation.Nullable com.fhir.decimal factor;
  private final @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> diagnosisSequence;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Claim_Detail> detail;

  private ImmutableClaim_Item(
      com.fhir.CodeableConcept productOrService,
      @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> procedureSequence,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String servicedDate,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> udi,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.Reference locationReference,
      @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> informationSequence,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> encounter,
      @javax.annotation.Nullable com.fhir.CodeableConcept locationCodeableConcept,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> modifier,
      @javax.annotation.Nullable com.fhir.Money unitPrice,
      @javax.annotation.Nullable com.fhir.Address locationAddress,
      @javax.annotation.Nullable com.fhir.CodeableConcept bodySite,
      @javax.annotation.Nullable com.fhir.CodeableConcept revenue,
      @javax.annotation.Nullable com.fhir.positiveInt sequence,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> subSite,
      @javax.annotation.Nullable com.fhir.CodeableConcept category,
      @javax.annotation.Nullable com.fhir.Period servicedPeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Money net,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> programCode,
      @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> careTeamSequence,
      @javax.annotation.Nullable com.fhir.Quantity quantity,
      @javax.annotation.Nullable com.fhir.decimal factor,
      @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> diagnosisSequence,
      @javax.annotation.Nullable java.util.List<com.fhir.Claim_Detail> detail) {
    this.productOrService = productOrService;
    this.procedureSequence = procedureSequence;
    this.modifierExtension = modifierExtension;
    this.servicedDate = servicedDate;
    this.udi = udi;
    this.id = id;
    this.locationReference = locationReference;
    this.informationSequence = informationSequence;
    this.encounter = encounter;
    this.locationCodeableConcept = locationCodeableConcept;
    this.modifier = modifier;
    this.unitPrice = unitPrice;
    this.locationAddress = locationAddress;
    this.bodySite = bodySite;
    this.revenue = revenue;
    this.sequence = sequence;
    this.subSite = subSite;
    this.category = category;
    this.servicedPeriod = servicedPeriod;
    this.extension = extension;
    this.net = net;
    this.programCode = programCode;
    this.careTeamSequence = careTeamSequence;
    this.quantity = quantity;
    this.factor = factor;
    this.diagnosisSequence = diagnosisSequence;
    this.detail = detail;
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
   * @return The value of the {@code procedureSequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("procedureSequence")
  @Override
  public java.util.Optional<java.util.List<com.fhir.positiveInt>> procedureSequence() {
    return java.util.Optional.ofNullable(procedureSequence);
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
   * @return The value of the {@code servicedDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("servicedDate")
  @Override
  public java.util.Optional<java.lang.String> servicedDate() {
    return java.util.Optional.ofNullable(servicedDate);
  }

  /**
   * @return The value of the {@code udi} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("udi")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> udi() {
    return java.util.Optional.ofNullable(udi);
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
   * @return The value of the {@code locationReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("locationReference")
  @Override
  public java.util.Optional<com.fhir.Reference> locationReference() {
    return java.util.Optional.ofNullable(locationReference);
  }

  /**
   * @return The value of the {@code informationSequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("informationSequence")
  @Override
  public java.util.Optional<java.util.List<com.fhir.positiveInt>> informationSequence() {
    return java.util.Optional.ofNullable(informationSequence);
  }

  /**
   * @return The value of the {@code encounter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("encounter")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> encounter() {
    return java.util.Optional.ofNullable(encounter);
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
   * @return The value of the {@code modifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier() {
    return java.util.Optional.ofNullable(modifier);
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
   * @return The value of the {@code locationAddress} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("locationAddress")
  @Override
  public java.util.Optional<com.fhir.Address> locationAddress() {
    return java.util.Optional.ofNullable(locationAddress);
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
   * @return The value of the {@code revenue} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("revenue")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> revenue() {
    return java.util.Optional.ofNullable(revenue);
  }

  /**
   * @return The value of the {@code sequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sequence")
  @Override
  public java.util.Optional<com.fhir.positiveInt> sequence() {
    return java.util.Optional.ofNullable(sequence);
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
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> category() {
    return java.util.Optional.ofNullable(category);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code programCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("programCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> programCode() {
    return java.util.Optional.ofNullable(programCode);
  }

  /**
   * @return The value of the {@code careTeamSequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("careTeamSequence")
  @Override
  public java.util.Optional<java.util.List<com.fhir.positiveInt>> careTeamSequence() {
    return java.util.Optional.ofNullable(careTeamSequence);
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
   * @return The value of the {@code factor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("factor")
  @Override
  public java.util.Optional<com.fhir.decimal> factor() {
    return java.util.Optional.ofNullable(factor);
  }

  /**
   * @return The value of the {@code diagnosisSequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("diagnosisSequence")
  @Override
  public java.util.Optional<java.util.List<com.fhir.positiveInt>> diagnosisSequence() {
    return java.util.Optional.ofNullable(diagnosisSequence);
  }

  /**
   * @return The value of the {@code detail} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("detail")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Claim_Detail>> detail() {
    return java.util.Optional.ofNullable(detail);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim_Item#productOrService() productOrService} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for productOrService
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim_Item withProductOrService(com.fhir.CodeableConcept value) {
    if (this.productOrService == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "productOrService");
    return new ImmutableClaim_Item(
        newValue,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#procedureSequence() procedureSequence} attribute.
   * @param value The value for procedureSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withProcedureSequence(java.util.List<com.fhir.positiveInt> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> newValue = java.util.Objects.requireNonNull(value, "procedureSequence");
    if (this.procedureSequence == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        newValue,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#procedureSequence() procedureSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedureSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withProcedureSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> value = optional.orElse(null);
    if (this.procedureSequence == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        value,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        newValue,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        value,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#servicedDate() servicedDate} attribute.
   * @param value The value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withServicedDate(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "servicedDate");
    if (java.util.Objects.equals(this.servicedDate, newValue)) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        newValue,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#servicedDate() servicedDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withServicedDate(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.servicedDate, value)) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        value,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#udi() udi} attribute.
   * @param value The value for udi
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withUdi(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "udi");
    if (this.udi == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        newValue,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#udi() udi} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for udi
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withUdi(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.udi == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        value,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        newValue,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        value,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#locationReference() locationReference} attribute.
   * @param value The value for locationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withLocationReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "locationReference");
    if (this.locationReference == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        newValue,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#locationReference() locationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withLocationReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.locationReference == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        value,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#informationSequence() informationSequence} attribute.
   * @param value The value for informationSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withInformationSequence(java.util.List<com.fhir.positiveInt> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> newValue = java.util.Objects.requireNonNull(value, "informationSequence");
    if (this.informationSequence == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        newValue,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#informationSequence() informationSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for informationSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withInformationSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> value = optional.orElse(null);
    if (this.informationSequence == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        value,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withEncounter(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        newValue,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withEncounter(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        value,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#locationCodeableConcept() locationCodeableConcept} attribute.
   * @param value The value for locationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withLocationCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "locationCodeableConcept");
    if (this.locationCodeableConcept == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        newValue,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#locationCodeableConcept() locationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withLocationCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.locationCodeableConcept == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        value,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#modifier() modifier} attribute.
   * @param value The value for modifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withModifier(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "modifier");
    if (this.modifier == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        newValue,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#modifier() modifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withModifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.modifier == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        value,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#unitPrice() unitPrice} attribute.
   * @param value The value for unitPrice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withUnitPrice(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "unitPrice");
    if (this.unitPrice == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        newValue,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#unitPrice() unitPrice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitPrice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withUnitPrice(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.unitPrice == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        value,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#locationAddress() locationAddress} attribute.
   * @param value The value for locationAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withLocationAddress(com.fhir.Address value) {
    @javax.annotation.Nullable com.fhir.Address newValue = java.util.Objects.requireNonNull(value, "locationAddress");
    if (this.locationAddress == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        newValue,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#locationAddress() locationAddress} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationAddress
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withLocationAddress(java.util.Optional<? extends com.fhir.Address> optional) {
    @javax.annotation.Nullable com.fhir.Address value = optional.orElse(null);
    if (this.locationAddress == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        value,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withBodySite(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        newValue,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withBodySite(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        value,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#revenue() revenue} attribute.
   * @param value The value for revenue
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withRevenue(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "revenue");
    if (this.revenue == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        newValue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#revenue() revenue} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for revenue
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withRevenue(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.revenue == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        value,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withSequence(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        newValue,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withSequence(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        value,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#subSite() subSite} attribute.
   * @param value The value for subSite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withSubSite(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "subSite");
    if (this.subSite == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        newValue,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#subSite() subSite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subSite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withSubSite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.subSite == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        value,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withCategory(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        newValue,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withCategory(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        value,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#servicedPeriod() servicedPeriod} attribute.
   * @param value The value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withServicedPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "servicedPeriod");
    if (this.servicedPeriod == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        newValue,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#servicedPeriod() servicedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withServicedPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.servicedPeriod == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        value,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        newValue,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        value,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#net() net} attribute.
   * @param value The value for net
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withNet(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "net");
    if (this.net == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        newValue,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#net() net} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for net
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withNet(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.net == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        value,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#programCode() programCode} attribute.
   * @param value The value for programCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withProgramCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "programCode");
    if (this.programCode == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        newValue,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#programCode() programCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for programCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withProgramCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.programCode == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        value,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#careTeamSequence() careTeamSequence} attribute.
   * @param value The value for careTeamSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withCareTeamSequence(java.util.List<com.fhir.positiveInt> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> newValue = java.util.Objects.requireNonNull(value, "careTeamSequence");
    if (this.careTeamSequence == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        newValue,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#careTeamSequence() careTeamSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for careTeamSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withCareTeamSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> value = optional.orElse(null);
    if (this.careTeamSequence == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        value,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        newValue,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        value,
        this.factor,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withFactor(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        newValue,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withFactor(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        value,
        this.diagnosisSequence,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#diagnosisSequence() diagnosisSequence} attribute.
   * @param value The value for diagnosisSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withDiagnosisSequence(java.util.List<com.fhir.positiveInt> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> newValue = java.util.Objects.requireNonNull(value, "diagnosisSequence");
    if (this.diagnosisSequence == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        newValue,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#diagnosisSequence() diagnosisSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosisSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withDiagnosisSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> value = optional.orElse(null);
    if (this.diagnosisSequence == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        value,
        this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Item#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Item withDetail(java.util.List<com.fhir.Claim_Detail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Claim_Detail> newValue = java.util.Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Item#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Item withDetail(java.util.Optional<? extends java.util.List<com.fhir.Claim_Detail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Claim_Detail> value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutableClaim_Item(
        this.productOrService,
        this.procedureSequence,
        this.modifierExtension,
        this.servicedDate,
        this.udi,
        this.id,
        this.locationReference,
        this.informationSequence,
        this.encounter,
        this.locationCodeableConcept,
        this.modifier,
        this.unitPrice,
        this.locationAddress,
        this.bodySite,
        this.revenue,
        this.sequence,
        this.subSite,
        this.category,
        this.servicedPeriod,
        this.extension,
        this.net,
        this.programCode,
        this.careTeamSequence,
        this.quantity,
        this.factor,
        this.diagnosisSequence,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaim_Item} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaim_Item
        && equalTo((ImmutableClaim_Item) another);
  }

  private boolean equalTo(ImmutableClaim_Item another) {
    return productOrService.equals(another.productOrService)
        && java.util.Objects.equals(procedureSequence, another.procedureSequence)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(servicedDate, another.servicedDate)
        && java.util.Objects.equals(udi, another.udi)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(locationReference, another.locationReference)
        && java.util.Objects.equals(informationSequence, another.informationSequence)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(locationCodeableConcept, another.locationCodeableConcept)
        && java.util.Objects.equals(modifier, another.modifier)
        && java.util.Objects.equals(unitPrice, another.unitPrice)
        && java.util.Objects.equals(locationAddress, another.locationAddress)
        && java.util.Objects.equals(bodySite, another.bodySite)
        && java.util.Objects.equals(revenue, another.revenue)
        && java.util.Objects.equals(sequence, another.sequence)
        && java.util.Objects.equals(subSite, another.subSite)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(servicedPeriod, another.servicedPeriod)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(net, another.net)
        && java.util.Objects.equals(programCode, another.programCode)
        && java.util.Objects.equals(careTeamSequence, another.careTeamSequence)
        && java.util.Objects.equals(quantity, another.quantity)
        && java.util.Objects.equals(factor, another.factor)
        && java.util.Objects.equals(diagnosisSequence, another.diagnosisSequence)
        && java.util.Objects.equals(detail, another.detail);
  }

  /**
   * Computes a hash code from attributes: {@code productOrService}, {@code procedureSequence}, {@code modifierExtension}, {@code servicedDate}, {@code udi}, {@code id}, {@code locationReference}, {@code informationSequence}, {@code encounter}, {@code locationCodeableConcept}, {@code modifier}, {@code unitPrice}, {@code locationAddress}, {@code bodySite}, {@code revenue}, {@code sequence}, {@code subSite}, {@code category}, {@code servicedPeriod}, {@code extension}, {@code net}, {@code programCode}, {@code careTeamSequence}, {@code quantity}, {@code factor}, {@code diagnosisSequence}, {@code detail}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + productOrService.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(procedureSequence);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(servicedDate);
    h += (h << 5) + java.util.Objects.hashCode(udi);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(locationReference);
    h += (h << 5) + java.util.Objects.hashCode(informationSequence);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(locationCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(modifier);
    h += (h << 5) + java.util.Objects.hashCode(unitPrice);
    h += (h << 5) + java.util.Objects.hashCode(locationAddress);
    h += (h << 5) + java.util.Objects.hashCode(bodySite);
    h += (h << 5) + java.util.Objects.hashCode(revenue);
    h += (h << 5) + java.util.Objects.hashCode(sequence);
    h += (h << 5) + java.util.Objects.hashCode(subSite);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(servicedPeriod);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(net);
    h += (h << 5) + java.util.Objects.hashCode(programCode);
    h += (h << 5) + java.util.Objects.hashCode(careTeamSequence);
    h += (h << 5) + java.util.Objects.hashCode(quantity);
    h += (h << 5) + java.util.Objects.hashCode(factor);
    h += (h << 5) + java.util.Objects.hashCode(diagnosisSequence);
    h += (h << 5) + java.util.Objects.hashCode(detail);
    return h;
  }

  /**
   * Prints the immutable value {@code Claim_Item} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Claim_Item{");
    builder.append("productOrService=").append(productOrService);
    if (procedureSequence != null) {
      builder.append(", ");
      builder.append("procedureSequence=").append(procedureSequence);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (servicedDate != null) {
      builder.append(", ");
      builder.append("servicedDate=").append(servicedDate);
    }
    if (udi != null) {
      builder.append(", ");
      builder.append("udi=").append(udi);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (locationReference != null) {
      builder.append(", ");
      builder.append("locationReference=").append(locationReference);
    }
    if (informationSequence != null) {
      builder.append(", ");
      builder.append("informationSequence=").append(informationSequence);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (locationCodeableConcept != null) {
      builder.append(", ");
      builder.append("locationCodeableConcept=").append(locationCodeableConcept);
    }
    if (modifier != null) {
      builder.append(", ");
      builder.append("modifier=").append(modifier);
    }
    if (unitPrice != null) {
      builder.append(", ");
      builder.append("unitPrice=").append(unitPrice);
    }
    if (locationAddress != null) {
      builder.append(", ");
      builder.append("locationAddress=").append(locationAddress);
    }
    if (bodySite != null) {
      builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (revenue != null) {
      builder.append(", ");
      builder.append("revenue=").append(revenue);
    }
    if (sequence != null) {
      builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (subSite != null) {
      builder.append(", ");
      builder.append("subSite=").append(subSite);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (servicedPeriod != null) {
      builder.append(", ");
      builder.append("servicedPeriod=").append(servicedPeriod);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (net != null) {
      builder.append(", ");
      builder.append("net=").append(net);
    }
    if (programCode != null) {
      builder.append(", ");
      builder.append("programCode=").append(programCode);
    }
    if (careTeamSequence != null) {
      builder.append(", ");
      builder.append("careTeamSequence=").append(careTeamSequence);
    }
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (factor != null) {
      builder.append(", ");
      builder.append("factor=").append(factor);
    }
    if (diagnosisSequence != null) {
      builder.append(", ");
      builder.append("diagnosisSequence=").append(diagnosisSequence);
    }
    if (detail != null) {
      builder.append(", ");
      builder.append("detail=").append(detail);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Claim_Item", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Claim_Item {
    @javax.annotation.Nullable com.fhir.CodeableConcept productOrService;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.positiveInt>> procedureSequence = java.util.Optional.empty();
    boolean procedureSequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> servicedDate = java.util.Optional.empty();
    boolean servicedDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> udi = java.util.Optional.empty();
    boolean udiIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> locationReference = java.util.Optional.empty();
    boolean locationReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.positiveInt>> informationSequence = java.util.Optional.empty();
    boolean informationSequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> locationCodeableConcept = java.util.Optional.empty();
    boolean locationCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier = java.util.Optional.empty();
    boolean modifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> unitPrice = java.util.Optional.empty();
    boolean unitPriceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Address> locationAddress = java.util.Optional.empty();
    boolean locationAddressIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> bodySite = java.util.Optional.empty();
    boolean bodySiteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> revenue = java.util.Optional.empty();
    boolean revenueIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> sequence = java.util.Optional.empty();
    boolean sequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> subSite = java.util.Optional.empty();
    boolean subSiteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> servicedPeriod = java.util.Optional.empty();
    boolean servicedPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> net = java.util.Optional.empty();
    boolean netIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> programCode = java.util.Optional.empty();
    boolean programCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.positiveInt>> careTeamSequence = java.util.Optional.empty();
    boolean careTeamSequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> quantity = java.util.Optional.empty();
    boolean quantityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> factor = java.util.Optional.empty();
    boolean factorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.positiveInt>> diagnosisSequence = java.util.Optional.empty();
    boolean diagnosisSequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Claim_Detail>> detail = java.util.Optional.empty();
    boolean detailIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("productOrService")
    public void setProductOrService(com.fhir.CodeableConcept productOrService) {
      this.productOrService = productOrService;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("procedureSequence")
    public void setProcedureSequence(java.util.Optional<java.util.List<com.fhir.positiveInt>> procedureSequence) {
      this.procedureSequence = procedureSequence;
      this.procedureSequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("servicedDate")
    public void setServicedDate(java.util.Optional<java.lang.String> servicedDate) {
      this.servicedDate = servicedDate;
      this.servicedDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("udi")
    public void setUdi(java.util.Optional<java.util.List<com.fhir.Reference>> udi) {
      this.udi = udi;
      this.udiIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("locationReference")
    public void setLocationReference(java.util.Optional<com.fhir.Reference> locationReference) {
      this.locationReference = locationReference;
      this.locationReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("informationSequence")
    public void setInformationSequence(java.util.Optional<java.util.List<com.fhir.positiveInt>> informationSequence) {
      this.informationSequence = informationSequence;
      this.informationSequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<java.util.List<com.fhir.Reference>> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("locationCodeableConcept")
    public void setLocationCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> locationCodeableConcept) {
      this.locationCodeableConcept = locationCodeableConcept;
      this.locationCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifier")
    public void setModifier(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier) {
      this.modifier = modifier;
      this.modifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
    public void setUnitPrice(java.util.Optional<com.fhir.Money> unitPrice) {
      this.unitPrice = unitPrice;
      this.unitPriceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("locationAddress")
    public void setLocationAddress(java.util.Optional<com.fhir.Address> locationAddress) {
      this.locationAddress = locationAddress;
      this.locationAddressIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public void setBodySite(java.util.Optional<com.fhir.CodeableConcept> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("revenue")
    public void setRevenue(java.util.Optional<com.fhir.CodeableConcept> revenue) {
      this.revenue = revenue;
      this.revenueIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public void setSequence(java.util.Optional<com.fhir.positiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subSite")
    public void setSubSite(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> subSite) {
      this.subSite = subSite;
      this.subSiteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<com.fhir.CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("servicedPeriod")
    public void setServicedPeriod(java.util.Optional<com.fhir.Period> servicedPeriod) {
      this.servicedPeriod = servicedPeriod;
      this.servicedPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("net")
    public void setNet(java.util.Optional<com.fhir.Money> net) {
      this.net = net;
      this.netIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("programCode")
    public void setProgramCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> programCode) {
      this.programCode = programCode;
      this.programCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("careTeamSequence")
    public void setCareTeamSequence(java.util.Optional<java.util.List<com.fhir.positiveInt>> careTeamSequence) {
      this.careTeamSequence = careTeamSequence;
      this.careTeamSequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public void setQuantity(java.util.Optional<com.fhir.Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("factor")
    public void setFactor(java.util.Optional<com.fhir.decimal> factor) {
      this.factor = factor;
      this.factorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosisSequence")
    public void setDiagnosisSequence(java.util.Optional<java.util.List<com.fhir.positiveInt>> diagnosisSequence) {
      this.diagnosisSequence = diagnosisSequence;
      this.diagnosisSequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    public void setDetail(java.util.Optional<java.util.List<com.fhir.Claim_Detail>> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @Override
    public com.fhir.CodeableConcept productOrService() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.positiveInt>> procedureSequence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> servicedDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> udi() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> locationReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.positiveInt>> informationSequence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> locationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> unitPrice() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Address> locationAddress() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> revenue() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> subSite() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> servicedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> net() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> programCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.positiveInt>> careTeamSequence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> factor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.positiveInt>> diagnosisSequence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Claim_Detail>> detail() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableClaim_Item fromJson(Json json) {
    ImmutableClaim_Item.Builder builder = ((ImmutableClaim_Item.Builder) ImmutableClaim_Item.builder());
    if (json.productOrService != null) {
      builder.productOrService(json.productOrService);
    }
    if (json.procedureSequenceIsSet) {
      builder.procedureSequence(json.procedureSequence);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.servicedDateIsSet) {
      builder.servicedDate(json.servicedDate);
    }
    if (json.udiIsSet) {
      builder.udi(json.udi);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.locationReferenceIsSet) {
      builder.locationReference(json.locationReference);
    }
    if (json.informationSequenceIsSet) {
      builder.informationSequence(json.informationSequence);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.locationCodeableConceptIsSet) {
      builder.locationCodeableConcept(json.locationCodeableConcept);
    }
    if (json.modifierIsSet) {
      builder.modifier(json.modifier);
    }
    if (json.unitPriceIsSet) {
      builder.unitPrice(json.unitPrice);
    }
    if (json.locationAddressIsSet) {
      builder.locationAddress(json.locationAddress);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.revenueIsSet) {
      builder.revenue(json.revenue);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.subSiteIsSet) {
      builder.subSite(json.subSite);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.servicedPeriodIsSet) {
      builder.servicedPeriod(json.servicedPeriod);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.netIsSet) {
      builder.net(json.net);
    }
    if (json.programCodeIsSet) {
      builder.programCode(json.programCode);
    }
    if (json.careTeamSequenceIsSet) {
      builder.careTeamSequence(json.careTeamSequence);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    if (json.diagnosisSequenceIsSet) {
      builder.diagnosisSequence(json.diagnosisSequence);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    return (ImmutableClaim_Item) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Claim_Item} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Claim_Item instance
   */
  public static Claim_Item copyOf(Claim_Item instance) {
    if (instance instanceof ImmutableClaim_Item) {
      return (ImmutableClaim_Item) instance;
    }
    return ((ImmutableClaim_Item.Builder) ImmutableClaim_Item.builder())
        .productOrService(instance.productOrService())
        .procedureSequence(instance.procedureSequence())
        .modifierExtension(instance.modifierExtension())
        .servicedDate(instance.servicedDate())
        .udi(instance.udi())
        .id(instance.id())
        .locationReference(instance.locationReference())
        .informationSequence(instance.informationSequence())
        .encounter(instance.encounter())
        .locationCodeableConcept(instance.locationCodeableConcept())
        .modifier(instance.modifier())
        .unitPrice(instance.unitPrice())
        .locationAddress(instance.locationAddress())
        .bodySite(instance.bodySite())
        .revenue(instance.revenue())
        .sequence(instance.sequence())
        .subSite(instance.subSite())
        .category(instance.category())
        .servicedPeriod(instance.servicedPeriod())
        .extension(instance.extension())
        .net(instance.net())
        .programCode(instance.programCode())
        .careTeamSequence(instance.careTeamSequence())
        .quantity(instance.quantity())
        .factor(instance.factor())
        .diagnosisSequence(instance.diagnosisSequence())
        .detail(instance.detail())
        .build();
  }

  /**
   * Creates a builder for {@link Claim_Item Claim_Item}.
   * <pre>
   * ImmutableClaim_Item.builder()
   *    .productOrService(com.fhir.CodeableConcept) // required {@link Claim_Item#productOrService() productOrService}
   *    .procedureSequence(List&amp;lt;com.fhir.positiveInt&amp;gt;) // optional {@link Claim_Item#procedureSequence() procedureSequence}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Claim_Item#modifierExtension() modifierExtension}
   *    .servicedDate(String) // optional {@link Claim_Item#servicedDate() servicedDate}
   *    .udi(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Claim_Item#udi() udi}
   *    .id(String) // optional {@link Claim_Item#id() id}
   *    .locationReference(com.fhir.Reference) // optional {@link Claim_Item#locationReference() locationReference}
   *    .informationSequence(List&amp;lt;com.fhir.positiveInt&amp;gt;) // optional {@link Claim_Item#informationSequence() informationSequence}
   *    .encounter(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Claim_Item#encounter() encounter}
   *    .locationCodeableConcept(com.fhir.CodeableConcept) // optional {@link Claim_Item#locationCodeableConcept() locationCodeableConcept}
   *    .modifier(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Claim_Item#modifier() modifier}
   *    .unitPrice(com.fhir.Money) // optional {@link Claim_Item#unitPrice() unitPrice}
   *    .locationAddress(com.fhir.Address) // optional {@link Claim_Item#locationAddress() locationAddress}
   *    .bodySite(com.fhir.CodeableConcept) // optional {@link Claim_Item#bodySite() bodySite}
   *    .revenue(com.fhir.CodeableConcept) // optional {@link Claim_Item#revenue() revenue}
   *    .sequence(com.fhir.positiveInt) // optional {@link Claim_Item#sequence() sequence}
   *    .subSite(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Claim_Item#subSite() subSite}
   *    .category(com.fhir.CodeableConcept) // optional {@link Claim_Item#category() category}
   *    .servicedPeriod(com.fhir.Period) // optional {@link Claim_Item#servicedPeriod() servicedPeriod}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Claim_Item#extension() extension}
   *    .net(com.fhir.Money) // optional {@link Claim_Item#net() net}
   *    .programCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Claim_Item#programCode() programCode}
   *    .careTeamSequence(List&amp;lt;com.fhir.positiveInt&amp;gt;) // optional {@link Claim_Item#careTeamSequence() careTeamSequence}
   *    .quantity(com.fhir.Quantity) // optional {@link Claim_Item#quantity() quantity}
   *    .factor(com.fhir.decimal) // optional {@link Claim_Item#factor() factor}
   *    .diagnosisSequence(List&amp;lt;com.fhir.positiveInt&amp;gt;) // optional {@link Claim_Item#diagnosisSequence() diagnosisSequence}
   *    .detail(List&amp;lt;com.fhir.Claim_Detail&amp;gt;) // optional {@link Claim_Item#detail() detail}
   *    .build();
   * </pre>
   * @return A new Claim_Item builder
   */
  public static ProductOrServiceBuildStage builder() {
    return new ImmutableClaim_Item.Builder();
  }

  /**
   * Builds instances of type {@link Claim_Item Claim_Item}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Claim_Item", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ProductOrServiceBuildStage, BuildFinal {
    private static final long INIT_BIT_PRODUCT_OR_SERVICE = 0x1L;
    private static final long OPT_BIT_PROCEDURE_SEQUENCE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_SERVICED_DATE = 0x4L;
    private static final long OPT_BIT_UDI = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_LOCATION_REFERENCE = 0x20L;
    private static final long OPT_BIT_INFORMATION_SEQUENCE = 0x40L;
    private static final long OPT_BIT_ENCOUNTER = 0x80L;
    private static final long OPT_BIT_LOCATION_CODEABLE_CONCEPT = 0x100L;
    private static final long OPT_BIT_MODIFIER = 0x200L;
    private static final long OPT_BIT_UNIT_PRICE = 0x400L;
    private static final long OPT_BIT_LOCATION_ADDRESS = 0x800L;
    private static final long OPT_BIT_BODY_SITE = 0x1000L;
    private static final long OPT_BIT_REVENUE = 0x2000L;
    private static final long OPT_BIT_SEQUENCE = 0x4000L;
    private static final long OPT_BIT_SUB_SITE = 0x8000L;
    private static final long OPT_BIT_CATEGORY = 0x10000L;
    private static final long OPT_BIT_SERVICED_PERIOD = 0x20000L;
    private static final long OPT_BIT_EXTENSION = 0x40000L;
    private static final long OPT_BIT_NET = 0x80000L;
    private static final long OPT_BIT_PROGRAM_CODE = 0x100000L;
    private static final long OPT_BIT_CARE_TEAM_SEQUENCE = 0x200000L;
    private static final long OPT_BIT_QUANTITY = 0x400000L;
    private static final long OPT_BIT_FACTOR = 0x800000L;
    private static final long OPT_BIT_DIAGNOSIS_SEQUENCE = 0x1000000L;
    private static final long OPT_BIT_DETAIL = 0x2000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.CodeableConcept productOrService;
    private @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> procedureSequence;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String servicedDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> udi;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.Reference locationReference;
    private @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> informationSequence;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> encounter;
    private @javax.annotation.Nullable com.fhir.CodeableConcept locationCodeableConcept;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> modifier;
    private @javax.annotation.Nullable com.fhir.Money unitPrice;
    private @javax.annotation.Nullable com.fhir.Address locationAddress;
    private @javax.annotation.Nullable com.fhir.CodeableConcept bodySite;
    private @javax.annotation.Nullable com.fhir.CodeableConcept revenue;
    private @javax.annotation.Nullable com.fhir.positiveInt sequence;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> subSite;
    private @javax.annotation.Nullable com.fhir.CodeableConcept category;
    private @javax.annotation.Nullable com.fhir.Period servicedPeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Money net;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> programCode;
    private @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> careTeamSequence;
    private @javax.annotation.Nullable com.fhir.Quantity quantity;
    private @javax.annotation.Nullable com.fhir.decimal factor;
    private @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> diagnosisSequence;
    private @javax.annotation.Nullable java.util.List<com.fhir.Claim_Detail> detail;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link Claim_Item#productOrService() productOrService} attribute.
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
     * Initializes the optional value {@link Claim_Item#procedureSequence() procedureSequence} to procedureSequence.
     * @param procedureSequence The value for procedureSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedureSequence(java.util.List<com.fhir.positiveInt> procedureSequence) {
      checkNotIsSet(procedureSequenceIsSet(), "procedureSequence");
      this.procedureSequence = java.util.Objects.requireNonNull(procedureSequence, "procedureSequence");
      optBits |= OPT_BIT_PROCEDURE_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#procedureSequence() procedureSequence} to procedureSequence.
     * @param procedureSequence The value for procedureSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("procedureSequence")
    public final Builder procedureSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> procedureSequence) {
      checkNotIsSet(procedureSequenceIsSet(), "procedureSequence");
      this.procedureSequence = procedureSequence.orElse(null);
      optBits |= OPT_BIT_PROCEDURE_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim_Item#servicedDate() servicedDate} to servicedDate.
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
     * Initializes the optional value {@link Claim_Item#servicedDate() servicedDate} to servicedDate.
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
     * Initializes the optional value {@link Claim_Item#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for chained invocation
     */
    public final Builder udi(java.util.List<com.fhir.Reference> udi) {
      checkNotIsSet(udiIsSet(), "udi");
      this.udi = java.util.Objects.requireNonNull(udi, "udi");
      optBits |= OPT_BIT_UDI;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("udi")
    public final Builder udi(java.util.Optional<? extends java.util.List<com.fhir.Reference>> udi) {
      checkNotIsSet(udiIsSet(), "udi");
      this.udi = udi.orElse(null);
      optBits |= OPT_BIT_UDI;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#id() id} to id.
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
     * Initializes the optional value {@link Claim_Item#id() id} to id.
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
     * Initializes the optional value {@link Claim_Item#locationReference() locationReference} to locationReference.
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
     * Initializes the optional value {@link Claim_Item#locationReference() locationReference} to locationReference.
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
     * Initializes the optional value {@link Claim_Item#informationSequence() informationSequence} to informationSequence.
     * @param informationSequence The value for informationSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder informationSequence(java.util.List<com.fhir.positiveInt> informationSequence) {
      checkNotIsSet(informationSequenceIsSet(), "informationSequence");
      this.informationSequence = java.util.Objects.requireNonNull(informationSequence, "informationSequence");
      optBits |= OPT_BIT_INFORMATION_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#informationSequence() informationSequence} to informationSequence.
     * @param informationSequence The value for informationSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("informationSequence")
    public final Builder informationSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> informationSequence) {
      checkNotIsSet(informationSequenceIsSet(), "informationSequence");
      this.informationSequence = informationSequence.orElse(null);
      optBits |= OPT_BIT_INFORMATION_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(java.util.List<com.fhir.Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = java.util.Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public final Builder encounter(java.util.Optional<? extends java.util.List<com.fhir.Reference>> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
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
     * Initializes the optional value {@link Claim_Item#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
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
     * Initializes the optional value {@link Claim_Item#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link Claim_Item#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link Claim_Item#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link Claim_Item#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link Claim_Item#locationAddress() locationAddress} to locationAddress.
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
     * Initializes the optional value {@link Claim_Item#locationAddress() locationAddress} to locationAddress.
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
     * Initializes the optional value {@link Claim_Item#bodySite() bodySite} to bodySite.
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
     * Initializes the optional value {@link Claim_Item#bodySite() bodySite} to bodySite.
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
     * Initializes the optional value {@link Claim_Item#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for chained invocation
     */
    public final Builder revenue(com.fhir.CodeableConcept revenue) {
      checkNotIsSet(revenueIsSet(), "revenue");
      this.revenue = java.util.Objects.requireNonNull(revenue, "revenue");
      optBits |= OPT_BIT_REVENUE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("revenue")
    public final Builder revenue(java.util.Optional<? extends com.fhir.CodeableConcept> revenue) {
      checkNotIsSet(revenueIsSet(), "revenue");
      this.revenue = revenue.orElse(null);
      optBits |= OPT_BIT_REVENUE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(com.fhir.positiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = java.util.Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public final Builder sequence(java.util.Optional<? extends com.fhir.positiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#subSite() subSite} to subSite.
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
     * Initializes the optional value {@link Claim_Item#subSite() subSite} to subSite.
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
     * Initializes the optional value {@link Claim_Item#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(com.fhir.CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(java.util.Optional<? extends com.fhir.CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#servicedPeriod() servicedPeriod} to servicedPeriod.
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
     * Initializes the optional value {@link Claim_Item#servicedPeriod() servicedPeriod} to servicedPeriod.
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
     * Initializes the optional value {@link Claim_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim_Item#net() net} to net.
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
     * Initializes the optional value {@link Claim_Item#net() net} to net.
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
     * Initializes the optional value {@link Claim_Item#programCode() programCode} to programCode.
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
     * Initializes the optional value {@link Claim_Item#programCode() programCode} to programCode.
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
     * Initializes the optional value {@link Claim_Item#careTeamSequence() careTeamSequence} to careTeamSequence.
     * @param careTeamSequence The value for careTeamSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder careTeamSequence(java.util.List<com.fhir.positiveInt> careTeamSequence) {
      checkNotIsSet(careTeamSequenceIsSet(), "careTeamSequence");
      this.careTeamSequence = java.util.Objects.requireNonNull(careTeamSequence, "careTeamSequence");
      optBits |= OPT_BIT_CARE_TEAM_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#careTeamSequence() careTeamSequence} to careTeamSequence.
     * @param careTeamSequence The value for careTeamSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("careTeamSequence")
    public final Builder careTeamSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> careTeamSequence) {
      checkNotIsSet(careTeamSequenceIsSet(), "careTeamSequence");
      this.careTeamSequence = careTeamSequence.orElse(null);
      optBits |= OPT_BIT_CARE_TEAM_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link Claim_Item#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link Claim_Item#factor() factor} to factor.
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
     * Initializes the optional value {@link Claim_Item#factor() factor} to factor.
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
     * Initializes the optional value {@link Claim_Item#diagnosisSequence() diagnosisSequence} to diagnosisSequence.
     * @param diagnosisSequence The value for diagnosisSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosisSequence(java.util.List<com.fhir.positiveInt> diagnosisSequence) {
      checkNotIsSet(diagnosisSequenceIsSet(), "diagnosisSequence");
      this.diagnosisSequence = java.util.Objects.requireNonNull(diagnosisSequence, "diagnosisSequence");
      optBits |= OPT_BIT_DIAGNOSIS_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#diagnosisSequence() diagnosisSequence} to diagnosisSequence.
     * @param diagnosisSequence The value for diagnosisSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosisSequence")
    public final Builder diagnosisSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> diagnosisSequence) {
      checkNotIsSet(diagnosisSequenceIsSet(), "diagnosisSequence");
      this.diagnosisSequence = diagnosisSequence.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(java.util.List<com.fhir.Claim_Detail> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = java.util.Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Item#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    public final Builder detail(java.util.Optional<? extends java.util.List<com.fhir.Claim_Detail>> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Builds a new {@link Claim_Item Claim_Item}.
     * @return An immutable instance of Claim_Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Claim_Item build() {
      checkRequiredAttributes();
      return new ImmutableClaim_Item(
          productOrService,
          procedureSequence,
          modifierExtension,
          servicedDate,
          udi,
          id,
          locationReference,
          informationSequence,
          encounter,
          locationCodeableConcept,
          modifier,
          unitPrice,
          locationAddress,
          bodySite,
          revenue,
          sequence,
          subSite,
          category,
          servicedPeriod,
          extension,
          net,
          programCode,
          careTeamSequence,
          quantity,
          factor,
          diagnosisSequence,
          detail);
    }

    private boolean procedureSequenceIsSet() {
      return (optBits & OPT_BIT_PROCEDURE_SEQUENCE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean servicedDateIsSet() {
      return (optBits & OPT_BIT_SERVICED_DATE) != 0;
    }

    private boolean udiIsSet() {
      return (optBits & OPT_BIT_UDI) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean locationReferenceIsSet() {
      return (optBits & OPT_BIT_LOCATION_REFERENCE) != 0;
    }

    private boolean informationSequenceIsSet() {
      return (optBits & OPT_BIT_INFORMATION_SEQUENCE) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean locationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_LOCATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean modifierIsSet() {
      return (optBits & OPT_BIT_MODIFIER) != 0;
    }

    private boolean unitPriceIsSet() {
      return (optBits & OPT_BIT_UNIT_PRICE) != 0;
    }

    private boolean locationAddressIsSet() {
      return (optBits & OPT_BIT_LOCATION_ADDRESS) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean revenueIsSet() {
      return (optBits & OPT_BIT_REVENUE) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean subSiteIsSet() {
      return (optBits & OPT_BIT_SUB_SITE) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean servicedPeriodIsSet() {
      return (optBits & OPT_BIT_SERVICED_PERIOD) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean netIsSet() {
      return (optBits & OPT_BIT_NET) != 0;
    }

    private boolean programCodeIsSet() {
      return (optBits & OPT_BIT_PROGRAM_CODE) != 0;
    }

    private boolean careTeamSequenceIsSet() {
      return (optBits & OPT_BIT_CARE_TEAM_SEQUENCE) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private boolean diagnosisSequenceIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS_SEQUENCE) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean productOrServiceIsSet() {
      return (initBits & INIT_BIT_PRODUCT_OR_SERVICE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Claim_Item is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!productOrServiceIsSet()) attributes.add("productOrService");
      return "Cannot build Claim_Item, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Claim_Item", generator = "Immutables")
  public interface ProductOrServiceBuildStage {
    /**
     * Initializes the value for the {@link Claim_Item#productOrService() productOrService} attribute.
     * @param productOrService The value for productOrService 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productOrService(com.fhir.CodeableConcept productOrService);
  }

  @org.immutables.value.Generated(from = "Claim_Item", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Claim_Item#procedureSequence() procedureSequence} to procedureSequence.
     * @param procedureSequence The value for procedureSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal procedureSequence(java.util.List<com.fhir.positiveInt> procedureSequence);

    /**
     * Initializes the optional value {@link Claim_Item#procedureSequence() procedureSequence} to procedureSequence.
     * @param procedureSequence The value for procedureSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal procedureSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> procedureSequence);

    /**
     * Initializes the optional value {@link Claim_Item#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Claim_Item#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Claim_Item#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedDate(java.lang.String servicedDate);

    /**
     * Initializes the optional value {@link Claim_Item#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedDate(java.util.Optional<java.lang.String> servicedDate);

    /**
     * Initializes the optional value {@link Claim_Item#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for chained invocation
     */
    BuildFinal udi(java.util.List<com.fhir.Reference> udi);

    /**
     * Initializes the optional value {@link Claim_Item#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal udi(java.util.Optional<? extends java.util.List<com.fhir.Reference>> udi);

    /**
     * Initializes the optional value {@link Claim_Item#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link Claim_Item#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link Claim_Item#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationReference(com.fhir.Reference locationReference);

    /**
     * Initializes the optional value {@link Claim_Item#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationReference(java.util.Optional<? extends com.fhir.Reference> locationReference);

    /**
     * Initializes the optional value {@link Claim_Item#informationSequence() informationSequence} to informationSequence.
     * @param informationSequence The value for informationSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal informationSequence(java.util.List<com.fhir.positiveInt> informationSequence);

    /**
     * Initializes the optional value {@link Claim_Item#informationSequence() informationSequence} to informationSequence.
     * @param informationSequence The value for informationSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal informationSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> informationSequence);

    /**
     * Initializes the optional value {@link Claim_Item#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(java.util.List<com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link Claim_Item#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends java.util.List<com.fhir.Reference>> encounter);

    /**
     * Initializes the optional value {@link Claim_Item#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
     * @param locationCodeableConcept The value for locationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationCodeableConcept(com.fhir.CodeableConcept locationCodeableConcept);

    /**
     * Initializes the optional value {@link Claim_Item#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
     * @param locationCodeableConcept The value for locationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> locationCodeableConcept);

    /**
     * Initializes the optional value {@link Claim_Item#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifier(java.util.List<com.fhir.CodeableConcept> modifier);

    /**
     * Initializes the optional value {@link Claim_Item#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> modifier);

    /**
     * Initializes the optional value {@link Claim_Item#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unitPrice(com.fhir.Money unitPrice);

    /**
     * Initializes the optional value {@link Claim_Item#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unitPrice(java.util.Optional<? extends com.fhir.Money> unitPrice);

    /**
     * Initializes the optional value {@link Claim_Item#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationAddress(com.fhir.Address locationAddress);

    /**
     * Initializes the optional value {@link Claim_Item#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationAddress(java.util.Optional<? extends com.fhir.Address> locationAddress);

    /**
     * Initializes the optional value {@link Claim_Item#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(com.fhir.CodeableConcept bodySite);

    /**
     * Initializes the optional value {@link Claim_Item#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(java.util.Optional<? extends com.fhir.CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link Claim_Item#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for chained invocation
     */
    BuildFinal revenue(com.fhir.CodeableConcept revenue);

    /**
     * Initializes the optional value {@link Claim_Item#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal revenue(java.util.Optional<? extends com.fhir.CodeableConcept> revenue);

    /**
     * Initializes the optional value {@link Claim_Item#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequence(com.fhir.positiveInt sequence);

    /**
     * Initializes the optional value {@link Claim_Item#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequence(java.util.Optional<? extends com.fhir.positiveInt> sequence);

    /**
     * Initializes the optional value {@link Claim_Item#subSite() subSite} to subSite.
     * @param subSite The value for subSite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subSite(java.util.List<com.fhir.CodeableConcept> subSite);

    /**
     * Initializes the optional value {@link Claim_Item#subSite() subSite} to subSite.
     * @param subSite The value for subSite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subSite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> subSite);

    /**
     * Initializes the optional value {@link Claim_Item#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(com.fhir.CodeableConcept category);

    /**
     * Initializes the optional value {@link Claim_Item#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link Claim_Item#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedPeriod(com.fhir.Period servicedPeriod);

    /**
     * Initializes the optional value {@link Claim_Item#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedPeriod(java.util.Optional<? extends com.fhir.Period> servicedPeriod);

    /**
     * Initializes the optional value {@link Claim_Item#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Claim_Item#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Claim_Item#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for chained invocation
     */
    BuildFinal net(com.fhir.Money net);

    /**
     * Initializes the optional value {@link Claim_Item#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal net(java.util.Optional<? extends com.fhir.Money> net);

    /**
     * Initializes the optional value {@link Claim_Item#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal programCode(java.util.List<com.fhir.CodeableConcept> programCode);

    /**
     * Initializes the optional value {@link Claim_Item#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal programCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> programCode);

    /**
     * Initializes the optional value {@link Claim_Item#careTeamSequence() careTeamSequence} to careTeamSequence.
     * @param careTeamSequence The value for careTeamSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal careTeamSequence(java.util.List<com.fhir.positiveInt> careTeamSequence);

    /**
     * Initializes the optional value {@link Claim_Item#careTeamSequence() careTeamSequence} to careTeamSequence.
     * @param careTeamSequence The value for careTeamSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal careTeamSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> careTeamSequence);

    /**
     * Initializes the optional value {@link Claim_Item#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(com.fhir.Quantity quantity);

    /**
     * Initializes the optional value {@link Claim_Item#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(java.util.Optional<? extends com.fhir.Quantity> quantity);

    /**
     * Initializes the optional value {@link Claim_Item#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal factor(com.fhir.decimal factor);

    /**
     * Initializes the optional value {@link Claim_Item#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal factor(java.util.Optional<? extends com.fhir.decimal> factor);

    /**
     * Initializes the optional value {@link Claim_Item#diagnosisSequence() diagnosisSequence} to diagnosisSequence.
     * @param diagnosisSequence The value for diagnosisSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diagnosisSequence(java.util.List<com.fhir.positiveInt> diagnosisSequence);

    /**
     * Initializes the optional value {@link Claim_Item#diagnosisSequence() diagnosisSequence} to diagnosisSequence.
     * @param diagnosisSequence The value for diagnosisSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diagnosisSequence(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> diagnosisSequence);

    /**
     * Initializes the optional value {@link Claim_Item#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detail(java.util.List<com.fhir.Claim_Detail> detail);

    /**
     * Initializes the optional value {@link Claim_Item#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detail(java.util.Optional<? extends java.util.List<com.fhir.Claim_Detail>> detail);

    /**
     * Builds a new {@link Claim_Item Claim_Item}.
     * @return An immutable instance of Claim_Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Claim_Item build();
  }
}
