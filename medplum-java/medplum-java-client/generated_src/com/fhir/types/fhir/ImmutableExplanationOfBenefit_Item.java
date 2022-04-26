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
 * Immutable implementation of {@link ExplanationOfBenefit_Item}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_Item.builder()}.
 */
@Generated(from = "ExplanationOfBenefit_Item", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_Item implements ExplanationOfBenefit_Item {
  private final @Nullable PositiveInt sequence;
  private final @Nullable List<PositiveInt> diagnosisSequence;
  private final @Nullable String servicedDate;
  private final @Nullable Period servicedPeriod;
  private final @Nullable Quantity quantity;
  private final @Nullable Money net;
  private final @Nullable List<PositiveInt> procedureSequence;
  private final @Nullable List<PositiveInt> informationSequence;
  private final @Nullable List<ExplanationOfBenefit_Detail> detail;
  private final CodeableConcept productOrService;
  private final @Nullable List<CodeableConcept> modifier;
  private final @Nullable List<Reference> udi;
  private final @Nullable Address locationAddress;
  private final @Nullable List<Reference> encounter;
  private final @Nullable String id;
  private final @Nullable CodeableConcept bodySite;
  private final @Nullable CodeableConcept revenue;
  private final @Nullable List<CodeableConcept> programCode;
  private final @Nullable CodeableConcept category;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<PositiveInt> noteNumber;
  private final @Nullable CodeableConcept locationCodeableConcept;
  private final @Nullable List<Extension> extension;
  private final @Nullable Money unitPrice;
  private final @Nullable List<CodeableConcept> subSite;
  private final @Nullable List<PositiveInt> careTeamSequence;
  private final @Nullable Reference locationReference;
  private final @Nullable Decimal factor;
  private final @Nullable List<ExplanationOfBenefit_Adjudication> adjudication;

  private ImmutableExplanationOfBenefit_Item(
      @Nullable PositiveInt sequence,
      @Nullable List<PositiveInt> diagnosisSequence,
      @Nullable String servicedDate,
      @Nullable Period servicedPeriod,
      @Nullable Quantity quantity,
      @Nullable Money net,
      @Nullable List<PositiveInt> procedureSequence,
      @Nullable List<PositiveInt> informationSequence,
      @Nullable List<ExplanationOfBenefit_Detail> detail,
      CodeableConcept productOrService,
      @Nullable List<CodeableConcept> modifier,
      @Nullable List<Reference> udi,
      @Nullable Address locationAddress,
      @Nullable List<Reference> encounter,
      @Nullable String id,
      @Nullable CodeableConcept bodySite,
      @Nullable CodeableConcept revenue,
      @Nullable List<CodeableConcept> programCode,
      @Nullable CodeableConcept category,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<PositiveInt> noteNumber,
      @Nullable CodeableConcept locationCodeableConcept,
      @Nullable List<Extension> extension,
      @Nullable Money unitPrice,
      @Nullable List<CodeableConcept> subSite,
      @Nullable List<PositiveInt> careTeamSequence,
      @Nullable Reference locationReference,
      @Nullable Decimal factor,
      @Nullable List<ExplanationOfBenefit_Adjudication> adjudication) {
    this.sequence = sequence;
    this.diagnosisSequence = diagnosisSequence;
    this.servicedDate = servicedDate;
    this.servicedPeriod = servicedPeriod;
    this.quantity = quantity;
    this.net = net;
    this.procedureSequence = procedureSequence;
    this.informationSequence = informationSequence;
    this.detail = detail;
    this.productOrService = productOrService;
    this.modifier = modifier;
    this.udi = udi;
    this.locationAddress = locationAddress;
    this.encounter = encounter;
    this.id = id;
    this.bodySite = bodySite;
    this.revenue = revenue;
    this.programCode = programCode;
    this.category = category;
    this.modifierExtension = modifierExtension;
    this.noteNumber = noteNumber;
    this.locationCodeableConcept = locationCodeableConcept;
    this.extension = extension;
    this.unitPrice = unitPrice;
    this.subSite = subSite;
    this.careTeamSequence = careTeamSequence;
    this.locationReference = locationReference;
    this.factor = factor;
    this.adjudication = adjudication;
  }

  /**
   * @return The value of the {@code sequence} attribute
   */
  @JsonProperty("sequence")
  @Override
  public Optional<PositiveInt> sequence() {
    return Optional.ofNullable(sequence);
  }

  /**
   * @return The value of the {@code diagnosisSequence} attribute
   */
  @JsonProperty("diagnosisSequence")
  @Override
  public Optional<List<PositiveInt>> diagnosisSequence() {
    return Optional.ofNullable(diagnosisSequence);
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
   * @return The value of the {@code servicedPeriod} attribute
   */
  @JsonProperty("servicedPeriod")
  @Override
  public Optional<Period> servicedPeriod() {
    return Optional.ofNullable(servicedPeriod);
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
   * @return The value of the {@code net} attribute
   */
  @JsonProperty("net")
  @Override
  public Optional<Money> net() {
    return Optional.ofNullable(net);
  }

  /**
   * @return The value of the {@code procedureSequence} attribute
   */
  @JsonProperty("procedureSequence")
  @Override
  public Optional<List<PositiveInt>> procedureSequence() {
    return Optional.ofNullable(procedureSequence);
  }

  /**
   * @return The value of the {@code informationSequence} attribute
   */
  @JsonProperty("informationSequence")
  @Override
  public Optional<List<PositiveInt>> informationSequence() {
    return Optional.ofNullable(informationSequence);
  }

  /**
   * @return The value of the {@code detail} attribute
   */
  @JsonProperty("detail")
  @Override
  public Optional<List<ExplanationOfBenefit_Detail>> detail() {
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
   * @return The value of the {@code modifier} attribute
   */
  @JsonProperty("modifier")
  @Override
  public Optional<List<CodeableConcept>> modifier() {
    return Optional.ofNullable(modifier);
  }

  /**
   * @return The value of the {@code udi} attribute
   */
  @JsonProperty("udi")
  @Override
  public Optional<List<Reference>> udi() {
    return Optional.ofNullable(udi);
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
   * @return The value of the {@code encounter} attribute
   */
  @JsonProperty("encounter")
  @Override
  public Optional<List<Reference>> encounter() {
    return Optional.ofNullable(encounter);
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
   * @return The value of the {@code bodySite} attribute
   */
  @JsonProperty("bodySite")
  @Override
  public Optional<CodeableConcept> bodySite() {
    return Optional.ofNullable(bodySite);
  }

  /**
   * @return The value of the {@code revenue} attribute
   */
  @JsonProperty("revenue")
  @Override
  public Optional<CodeableConcept> revenue() {
    return Optional.ofNullable(revenue);
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<CodeableConcept> category() {
    return Optional.ofNullable(category);
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
   * @return The value of the {@code noteNumber} attribute
   */
  @JsonProperty("noteNumber")
  @Override
  public Optional<List<PositiveInt>> noteNumber() {
    return Optional.ofNullable(noteNumber);
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
   * @return The value of the {@code subSite} attribute
   */
  @JsonProperty("subSite")
  @Override
  public Optional<List<CodeableConcept>> subSite() {
    return Optional.ofNullable(subSite);
  }

  /**
   * @return The value of the {@code careTeamSequence} attribute
   */
  @JsonProperty("careTeamSequence")
  @Override
  public Optional<List<PositiveInt>> careTeamSequence() {
    return Optional.ofNullable(careTeamSequence);
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
   * @return The value of the {@code factor} attribute
   */
  @JsonProperty("factor")
  @Override
  public Optional<Decimal> factor() {
    return Optional.ofNullable(factor);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        newValue,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        value,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#diagnosisSequence() diagnosisSequence} attribute.
   * @param value The value for diagnosisSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withDiagnosisSequence(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "diagnosisSequence");
    if (this.diagnosisSequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        newValue,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#diagnosisSequence() diagnosisSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosisSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withDiagnosisSequence(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.diagnosisSequence == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        value,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#servicedDate() servicedDate} attribute.
   * @param value The value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withServicedDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "servicedDate");
    if (Objects.equals(this.servicedDate, newValue)) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        newValue,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#servicedDate() servicedDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withServicedDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.servicedDate, value)) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        value,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#servicedPeriod() servicedPeriod} attribute.
   * @param value The value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withServicedPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "servicedPeriod");
    if (this.servicedPeriod == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        newValue,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#servicedPeriod() servicedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withServicedPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.servicedPeriod == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        value,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        newValue,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        value,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#net() net} attribute.
   * @param value The value for net
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withNet(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "net");
    if (this.net == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        newValue,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#net() net} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for net
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withNet(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.net == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        value,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#procedureSequence() procedureSequence} attribute.
   * @param value The value for procedureSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withProcedureSequence(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "procedureSequence");
    if (this.procedureSequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        newValue,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#procedureSequence() procedureSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedureSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withProcedureSequence(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.procedureSequence == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        value,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#informationSequence() informationSequence} attribute.
   * @param value The value for informationSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withInformationSequence(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "informationSequence");
    if (this.informationSequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        newValue,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#informationSequence() informationSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for informationSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withInformationSequence(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.informationSequence == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        value,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withDetail(List<ExplanationOfBenefit_Detail> value) {
    @Nullable List<ExplanationOfBenefit_Detail> newValue = Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        newValue,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withDetail(Optional<? extends List<ExplanationOfBenefit_Detail>> optional) {
    @Nullable List<ExplanationOfBenefit_Detail> value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        value,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit_Item#productOrService() productOrService} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for productOrService
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withProductOrService(CodeableConcept value) {
    if (this.productOrService == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "productOrService");
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        newValue,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#modifier() modifier} attribute.
   * @param value The value for modifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withModifier(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "modifier");
    if (this.modifier == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        newValue,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#modifier() modifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withModifier(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.modifier == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        value,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#udi() udi} attribute.
   * @param value The value for udi
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withUdi(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "udi");
    if (this.udi == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        newValue,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#udi() udi} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for udi
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withUdi(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.udi == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        value,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#locationAddress() locationAddress} attribute.
   * @param value The value for locationAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withLocationAddress(Address value) {
    @Nullable Address newValue = Objects.requireNonNull(value, "locationAddress");
    if (this.locationAddress == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        newValue,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#locationAddress() locationAddress} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationAddress
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withLocationAddress(Optional<? extends Address> optional) {
    @Nullable Address value = optional.orElse(null);
    if (this.locationAddress == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        value,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withEncounter(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        newValue,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withEncounter(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        value,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        newValue,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        value,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withBodySite(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        newValue,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withBodySite(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        value,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#revenue() revenue} attribute.
   * @param value The value for revenue
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withRevenue(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "revenue");
    if (this.revenue == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        newValue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#revenue() revenue} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for revenue
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withRevenue(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.revenue == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        value,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#programCode() programCode} attribute.
   * @param value The value for programCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withProgramCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "programCode");
    if (this.programCode == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        newValue,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#programCode() programCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for programCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withProgramCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.programCode == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        value,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withCategory(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        newValue,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withCategory(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        value,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        newValue,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        value,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#noteNumber() noteNumber} attribute.
   * @param value The value for noteNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withNoteNumber(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "noteNumber");
    if (this.noteNumber == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        newValue,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#noteNumber() noteNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for noteNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withNoteNumber(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.noteNumber == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        value,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#locationCodeableConcept() locationCodeableConcept} attribute.
   * @param value The value for locationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withLocationCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "locationCodeableConcept");
    if (this.locationCodeableConcept == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        newValue,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#locationCodeableConcept() locationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withLocationCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.locationCodeableConcept == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        value,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        newValue,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        value,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#unitPrice() unitPrice} attribute.
   * @param value The value for unitPrice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withUnitPrice(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "unitPrice");
    if (this.unitPrice == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        newValue,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#unitPrice() unitPrice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitPrice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withUnitPrice(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.unitPrice == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        value,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#subSite() subSite} attribute.
   * @param value The value for subSite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withSubSite(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "subSite");
    if (this.subSite == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        newValue,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#subSite() subSite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subSite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withSubSite(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.subSite == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        value,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#careTeamSequence() careTeamSequence} attribute.
   * @param value The value for careTeamSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withCareTeamSequence(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "careTeamSequence");
    if (this.careTeamSequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        newValue,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#careTeamSequence() careTeamSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for careTeamSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withCareTeamSequence(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.careTeamSequence == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        value,
        this.locationReference,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#locationReference() locationReference} attribute.
   * @param value The value for locationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withLocationReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "locationReference");
    if (this.locationReference == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        newValue,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#locationReference() locationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withLocationReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.locationReference == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        value,
        this.factor,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withFactor(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        newValue,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withFactor(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        value,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Item#adjudication() adjudication} attribute.
   * @param value The value for adjudication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Item withAdjudication(List<ExplanationOfBenefit_Adjudication> value) {
    @Nullable List<ExplanationOfBenefit_Adjudication> newValue = Objects.requireNonNull(value, "adjudication");
    if (this.adjudication == newValue) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Item#adjudication() adjudication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjudication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Item withAdjudication(Optional<? extends List<ExplanationOfBenefit_Adjudication>> optional) {
    @Nullable List<ExplanationOfBenefit_Adjudication> value = optional.orElse(null);
    if (this.adjudication == value) return this;
    return new ImmutableExplanationOfBenefit_Item(
        this.sequence,
        this.diagnosisSequence,
        this.servicedDate,
        this.servicedPeriod,
        this.quantity,
        this.net,
        this.procedureSequence,
        this.informationSequence,
        this.detail,
        this.productOrService,
        this.modifier,
        this.udi,
        this.locationAddress,
        this.encounter,
        this.id,
        this.bodySite,
        this.revenue,
        this.programCode,
        this.category,
        this.modifierExtension,
        this.noteNumber,
        this.locationCodeableConcept,
        this.extension,
        this.unitPrice,
        this.subSite,
        this.careTeamSequence,
        this.locationReference,
        this.factor,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_Item} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_Item
        && equalTo((ImmutableExplanationOfBenefit_Item) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_Item another) {
    return Objects.equals(sequence, another.sequence)
        && Objects.equals(diagnosisSequence, another.diagnosisSequence)
        && Objects.equals(servicedDate, another.servicedDate)
        && Objects.equals(servicedPeriod, another.servicedPeriod)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(net, another.net)
        && Objects.equals(procedureSequence, another.procedureSequence)
        && Objects.equals(informationSequence, another.informationSequence)
        && Objects.equals(detail, another.detail)
        && productOrService.equals(another.productOrService)
        && Objects.equals(modifier, another.modifier)
        && Objects.equals(udi, another.udi)
        && Objects.equals(locationAddress, another.locationAddress)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(id, another.id)
        && Objects.equals(bodySite, another.bodySite)
        && Objects.equals(revenue, another.revenue)
        && Objects.equals(programCode, another.programCode)
        && Objects.equals(category, another.category)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(noteNumber, another.noteNumber)
        && Objects.equals(locationCodeableConcept, another.locationCodeableConcept)
        && Objects.equals(extension, another.extension)
        && Objects.equals(unitPrice, another.unitPrice)
        && Objects.equals(subSite, another.subSite)
        && Objects.equals(careTeamSequence, another.careTeamSequence)
        && Objects.equals(locationReference, another.locationReference)
        && Objects.equals(factor, another.factor)
        && Objects.equals(adjudication, another.adjudication);
  }

  /**
   * Computes a hash code from attributes: {@code sequence}, {@code diagnosisSequence}, {@code servicedDate}, {@code servicedPeriod}, {@code quantity}, {@code net}, {@code procedureSequence}, {@code informationSequence}, {@code detail}, {@code productOrService}, {@code modifier}, {@code udi}, {@code locationAddress}, {@code encounter}, {@code id}, {@code bodySite}, {@code revenue}, {@code programCode}, {@code category}, {@code modifierExtension}, {@code noteNumber}, {@code locationCodeableConcept}, {@code extension}, {@code unitPrice}, {@code subSite}, {@code careTeamSequence}, {@code locationReference}, {@code factor}, {@code adjudication}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + Objects.hashCode(diagnosisSequence);
    h += (h << 5) + Objects.hashCode(servicedDate);
    h += (h << 5) + Objects.hashCode(servicedPeriod);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(net);
    h += (h << 5) + Objects.hashCode(procedureSequence);
    h += (h << 5) + Objects.hashCode(informationSequence);
    h += (h << 5) + Objects.hashCode(detail);
    h += (h << 5) + productOrService.hashCode();
    h += (h << 5) + Objects.hashCode(modifier);
    h += (h << 5) + Objects.hashCode(udi);
    h += (h << 5) + Objects.hashCode(locationAddress);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(bodySite);
    h += (h << 5) + Objects.hashCode(revenue);
    h += (h << 5) + Objects.hashCode(programCode);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(noteNumber);
    h += (h << 5) + Objects.hashCode(locationCodeableConcept);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(unitPrice);
    h += (h << 5) + Objects.hashCode(subSite);
    h += (h << 5) + Objects.hashCode(careTeamSequence);
    h += (h << 5) + Objects.hashCode(locationReference);
    h += (h << 5) + Objects.hashCode(factor);
    h += (h << 5) + Objects.hashCode(adjudication);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_Item} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExplanationOfBenefit_Item{");
    if (sequence != null) {
      builder.append("sequence=").append(sequence);
    }
    if (diagnosisSequence != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("diagnosisSequence=").append(diagnosisSequence);
    }
    if (servicedDate != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("servicedDate=").append(servicedDate);
    }
    if (servicedPeriod != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("servicedPeriod=").append(servicedPeriod);
    }
    if (quantity != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (net != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("net=").append(net);
    }
    if (procedureSequence != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("procedureSequence=").append(procedureSequence);
    }
    if (informationSequence != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("informationSequence=").append(informationSequence);
    }
    if (detail != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("detail=").append(detail);
    }
    if (builder.length() > 26) builder.append(", ");
    builder.append("productOrService=").append(productOrService);
    if (modifier != null) {
      builder.append(", ");
      builder.append("modifier=").append(modifier);
    }
    if (udi != null) {
      builder.append(", ");
      builder.append("udi=").append(udi);
    }
    if (locationAddress != null) {
      builder.append(", ");
      builder.append("locationAddress=").append(locationAddress);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (bodySite != null) {
      builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (revenue != null) {
      builder.append(", ");
      builder.append("revenue=").append(revenue);
    }
    if (programCode != null) {
      builder.append(", ");
      builder.append("programCode=").append(programCode);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (noteNumber != null) {
      builder.append(", ");
      builder.append("noteNumber=").append(noteNumber);
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
    if (subSite != null) {
      builder.append(", ");
      builder.append("subSite=").append(subSite);
    }
    if (careTeamSequence != null) {
      builder.append(", ");
      builder.append("careTeamSequence=").append(careTeamSequence);
    }
    if (locationReference != null) {
      builder.append(", ");
      builder.append("locationReference=").append(locationReference);
    }
    if (factor != null) {
      builder.append(", ");
      builder.append("factor=").append(factor);
    }
    if (adjudication != null) {
      builder.append(", ");
      builder.append("adjudication=").append(adjudication);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExplanationOfBenefit_Item", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExplanationOfBenefit_Item {
    @Nullable Optional<PositiveInt> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable Optional<List<PositiveInt>> diagnosisSequence = Optional.empty();
    boolean diagnosisSequenceIsSet;
    @Nullable Optional<String> servicedDate = Optional.empty();
    boolean servicedDateIsSet;
    @Nullable Optional<Period> servicedPeriod = Optional.empty();
    boolean servicedPeriodIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<Money> net = Optional.empty();
    boolean netIsSet;
    @Nullable Optional<List<PositiveInt>> procedureSequence = Optional.empty();
    boolean procedureSequenceIsSet;
    @Nullable Optional<List<PositiveInt>> informationSequence = Optional.empty();
    boolean informationSequenceIsSet;
    @Nullable Optional<List<ExplanationOfBenefit_Detail>> detail = Optional.empty();
    boolean detailIsSet;
    @Nullable CodeableConcept productOrService;
    @Nullable Optional<List<CodeableConcept>> modifier = Optional.empty();
    boolean modifierIsSet;
    @Nullable Optional<List<Reference>> udi = Optional.empty();
    boolean udiIsSet;
    @Nullable Optional<Address> locationAddress = Optional.empty();
    boolean locationAddressIsSet;
    @Nullable Optional<List<Reference>> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> bodySite = Optional.empty();
    boolean bodySiteIsSet;
    @Nullable Optional<CodeableConcept> revenue = Optional.empty();
    boolean revenueIsSet;
    @Nullable Optional<List<CodeableConcept>> programCode = Optional.empty();
    boolean programCodeIsSet;
    @Nullable Optional<CodeableConcept> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<PositiveInt>> noteNumber = Optional.empty();
    boolean noteNumberIsSet;
    @Nullable Optional<CodeableConcept> locationCodeableConcept = Optional.empty();
    boolean locationCodeableConceptIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Money> unitPrice = Optional.empty();
    boolean unitPriceIsSet;
    @Nullable Optional<List<CodeableConcept>> subSite = Optional.empty();
    boolean subSiteIsSet;
    @Nullable Optional<List<PositiveInt>> careTeamSequence = Optional.empty();
    boolean careTeamSequenceIsSet;
    @Nullable Optional<Reference> locationReference = Optional.empty();
    boolean locationReferenceIsSet;
    @Nullable Optional<Decimal> factor = Optional.empty();
    boolean factorIsSet;
    @Nullable Optional<List<ExplanationOfBenefit_Adjudication>> adjudication = Optional.empty();
    boolean adjudicationIsSet;
    @JsonProperty("sequence")
    public void setSequence(Optional<PositiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @JsonProperty("diagnosisSequence")
    public void setDiagnosisSequence(Optional<List<PositiveInt>> diagnosisSequence) {
      this.diagnosisSequence = diagnosisSequence;
      this.diagnosisSequenceIsSet = true;
    }
    @JsonProperty("servicedDate")
    public void setServicedDate(Optional<String> servicedDate) {
      this.servicedDate = servicedDate;
      this.servicedDateIsSet = true;
    }
    @JsonProperty("servicedPeriod")
    public void setServicedPeriod(Optional<Period> servicedPeriod) {
      this.servicedPeriod = servicedPeriod;
      this.servicedPeriodIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("net")
    public void setNet(Optional<Money> net) {
      this.net = net;
      this.netIsSet = true;
    }
    @JsonProperty("procedureSequence")
    public void setProcedureSequence(Optional<List<PositiveInt>> procedureSequence) {
      this.procedureSequence = procedureSequence;
      this.procedureSequenceIsSet = true;
    }
    @JsonProperty("informationSequence")
    public void setInformationSequence(Optional<List<PositiveInt>> informationSequence) {
      this.informationSequence = informationSequence;
      this.informationSequenceIsSet = true;
    }
    @JsonProperty("detail")
    public void setDetail(Optional<List<ExplanationOfBenefit_Detail>> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @JsonProperty("productOrService")
    public void setProductOrService(CodeableConcept productOrService) {
      this.productOrService = productOrService;
    }
    @JsonProperty("modifier")
    public void setModifier(Optional<List<CodeableConcept>> modifier) {
      this.modifier = modifier;
      this.modifierIsSet = true;
    }
    @JsonProperty("udi")
    public void setUdi(Optional<List<Reference>> udi) {
      this.udi = udi;
      this.udiIsSet = true;
    }
    @JsonProperty("locationAddress")
    public void setLocationAddress(Optional<Address> locationAddress) {
      this.locationAddress = locationAddress;
      this.locationAddressIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<List<Reference>> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("bodySite")
    public void setBodySite(Optional<CodeableConcept> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @JsonProperty("revenue")
    public void setRevenue(Optional<CodeableConcept> revenue) {
      this.revenue = revenue;
      this.revenueIsSet = true;
    }
    @JsonProperty("programCode")
    public void setProgramCode(Optional<List<CodeableConcept>> programCode) {
      this.programCode = programCode;
      this.programCodeIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("noteNumber")
    public void setNoteNumber(Optional<List<PositiveInt>> noteNumber) {
      this.noteNumber = noteNumber;
      this.noteNumberIsSet = true;
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
    @JsonProperty("subSite")
    public void setSubSite(Optional<List<CodeableConcept>> subSite) {
      this.subSite = subSite;
      this.subSiteIsSet = true;
    }
    @JsonProperty("careTeamSequence")
    public void setCareTeamSequence(Optional<List<PositiveInt>> careTeamSequence) {
      this.careTeamSequence = careTeamSequence;
      this.careTeamSequenceIsSet = true;
    }
    @JsonProperty("locationReference")
    public void setLocationReference(Optional<Reference> locationReference) {
      this.locationReference = locationReference;
      this.locationReferenceIsSet = true;
    }
    @JsonProperty("factor")
    public void setFactor(Optional<Decimal> factor) {
      this.factor = factor;
      this.factorIsSet = true;
    }
    @JsonProperty("adjudication")
    public void setAdjudication(Optional<List<ExplanationOfBenefit_Adjudication>> adjudication) {
      this.adjudication = adjudication;
      this.adjudicationIsSet = true;
    }
    @Override
    public Optional<PositiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> diagnosisSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> servicedDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> servicedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> net() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> procedureSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> informationSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_Detail>> detail() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept productOrService() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> udi() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Address> locationAddress() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> revenue() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> programCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> noteNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> locationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> unitPrice() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> subSite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> careTeamSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> locationReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> factor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_Adjudication>> adjudication() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_Item fromJson(Json json) {
    ImmutableExplanationOfBenefit_Item.Builder builder = ((ImmutableExplanationOfBenefit_Item.Builder) ImmutableExplanationOfBenefit_Item.builder());
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.diagnosisSequenceIsSet) {
      builder.diagnosisSequence(json.diagnosisSequence);
    }
    if (json.servicedDateIsSet) {
      builder.servicedDate(json.servicedDate);
    }
    if (json.servicedPeriodIsSet) {
      builder.servicedPeriod(json.servicedPeriod);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.netIsSet) {
      builder.net(json.net);
    }
    if (json.procedureSequenceIsSet) {
      builder.procedureSequence(json.procedureSequence);
    }
    if (json.informationSequenceIsSet) {
      builder.informationSequence(json.informationSequence);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.productOrService != null) {
      builder.productOrService(json.productOrService);
    }
    if (json.modifierIsSet) {
      builder.modifier(json.modifier);
    }
    if (json.udiIsSet) {
      builder.udi(json.udi);
    }
    if (json.locationAddressIsSet) {
      builder.locationAddress(json.locationAddress);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.revenueIsSet) {
      builder.revenue(json.revenue);
    }
    if (json.programCodeIsSet) {
      builder.programCode(json.programCode);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.noteNumberIsSet) {
      builder.noteNumber(json.noteNumber);
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
    if (json.subSiteIsSet) {
      builder.subSite(json.subSite);
    }
    if (json.careTeamSequenceIsSet) {
      builder.careTeamSequence(json.careTeamSequence);
    }
    if (json.locationReferenceIsSet) {
      builder.locationReference(json.locationReference);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    if (json.adjudicationIsSet) {
      builder.adjudication(json.adjudication);
    }
    return (ImmutableExplanationOfBenefit_Item) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_Item} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_Item instance
   */
  public static ExplanationOfBenefit_Item copyOf(ExplanationOfBenefit_Item instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_Item) {
      return (ImmutableExplanationOfBenefit_Item) instance;
    }
    return ((ImmutableExplanationOfBenefit_Item.Builder) ImmutableExplanationOfBenefit_Item.builder())
        .sequence(instance.sequence())
        .diagnosisSequence(instance.diagnosisSequence())
        .servicedDate(instance.servicedDate())
        .servicedPeriod(instance.servicedPeriod())
        .quantity(instance.quantity())
        .net(instance.net())
        .procedureSequence(instance.procedureSequence())
        .informationSequence(instance.informationSequence())
        .detail(instance.detail())
        .productOrService(instance.productOrService())
        .modifier(instance.modifier())
        .udi(instance.udi())
        .locationAddress(instance.locationAddress())
        .encounter(instance.encounter())
        .id(instance.id())
        .bodySite(instance.bodySite())
        .revenue(instance.revenue())
        .programCode(instance.programCode())
        .category(instance.category())
        .modifierExtension(instance.modifierExtension())
        .noteNumber(instance.noteNumber())
        .locationCodeableConcept(instance.locationCodeableConcept())
        .extension(instance.extension())
        .unitPrice(instance.unitPrice())
        .subSite(instance.subSite())
        .careTeamSequence(instance.careTeamSequence())
        .locationReference(instance.locationReference())
        .factor(instance.factor())
        .adjudication(instance.adjudication())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_Item ExplanationOfBenefit_Item}.
   * <pre>
   * ImmutableExplanationOfBenefit_Item.builder()
   *    .sequence(com.fhir.types.fhir.PositiveInt) // optional {@link ExplanationOfBenefit_Item#sequence() sequence}
   *    .diagnosisSequence(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ExplanationOfBenefit_Item#diagnosisSequence() diagnosisSequence}
   *    .servicedDate(String) // optional {@link ExplanationOfBenefit_Item#servicedDate() servicedDate}
   *    .servicedPeriod(com.fhir.types.fhir.Period) // optional {@link ExplanationOfBenefit_Item#servicedPeriod() servicedPeriod}
   *    .quantity(com.fhir.types.fhir.Quantity) // optional {@link ExplanationOfBenefit_Item#quantity() quantity}
   *    .net(com.fhir.types.fhir.Money) // optional {@link ExplanationOfBenefit_Item#net() net}
   *    .procedureSequence(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ExplanationOfBenefit_Item#procedureSequence() procedureSequence}
   *    .informationSequence(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ExplanationOfBenefit_Item#informationSequence() informationSequence}
   *    .detail(List&amp;lt;com.fhir.types.fhir.ExplanationOfBenefit_Detail&amp;gt;) // optional {@link ExplanationOfBenefit_Item#detail() detail}
   *    .productOrService(com.fhir.types.fhir.CodeableConcept) // required {@link ExplanationOfBenefit_Item#productOrService() productOrService}
   *    .modifier(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_Item#modifier() modifier}
   *    .udi(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ExplanationOfBenefit_Item#udi() udi}
   *    .locationAddress(com.fhir.types.fhir.Address) // optional {@link ExplanationOfBenefit_Item#locationAddress() locationAddress}
   *    .encounter(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ExplanationOfBenefit_Item#encounter() encounter}
   *    .id(String) // optional {@link ExplanationOfBenefit_Item#id() id}
   *    .bodySite(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_Item#bodySite() bodySite}
   *    .revenue(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_Item#revenue() revenue}
   *    .programCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_Item#programCode() programCode}
   *    .category(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_Item#category() category}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Item#modifierExtension() modifierExtension}
   *    .noteNumber(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ExplanationOfBenefit_Item#noteNumber() noteNumber}
   *    .locationCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_Item#locationCodeableConcept() locationCodeableConcept}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Item#extension() extension}
   *    .unitPrice(com.fhir.types.fhir.Money) // optional {@link ExplanationOfBenefit_Item#unitPrice() unitPrice}
   *    .subSite(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_Item#subSite() subSite}
   *    .careTeamSequence(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ExplanationOfBenefit_Item#careTeamSequence() careTeamSequence}
   *    .locationReference(com.fhir.types.fhir.Reference) // optional {@link ExplanationOfBenefit_Item#locationReference() locationReference}
   *    .factor(com.fhir.types.fhir.Decimal) // optional {@link ExplanationOfBenefit_Item#factor() factor}
   *    .adjudication(List&amp;lt;com.fhir.types.fhir.ExplanationOfBenefit_Adjudication&amp;gt;) // optional {@link ExplanationOfBenefit_Item#adjudication() adjudication}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_Item builder
   */
  public static ProductOrServiceBuildStage builder() {
    return new ImmutableExplanationOfBenefit_Item.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_Item ExplanationOfBenefit_Item}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExplanationOfBenefit_Item", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ProductOrServiceBuildStage, BuildFinal {
    private static final long INIT_BIT_PRODUCT_OR_SERVICE = 0x1L;
    private static final long OPT_BIT_SEQUENCE = 0x1L;
    private static final long OPT_BIT_DIAGNOSIS_SEQUENCE = 0x2L;
    private static final long OPT_BIT_SERVICED_DATE = 0x4L;
    private static final long OPT_BIT_SERVICED_PERIOD = 0x8L;
    private static final long OPT_BIT_QUANTITY = 0x10L;
    private static final long OPT_BIT_NET = 0x20L;
    private static final long OPT_BIT_PROCEDURE_SEQUENCE = 0x40L;
    private static final long OPT_BIT_INFORMATION_SEQUENCE = 0x80L;
    private static final long OPT_BIT_DETAIL = 0x100L;
    private static final long OPT_BIT_MODIFIER = 0x200L;
    private static final long OPT_BIT_UDI = 0x400L;
    private static final long OPT_BIT_LOCATION_ADDRESS = 0x800L;
    private static final long OPT_BIT_ENCOUNTER = 0x1000L;
    private static final long OPT_BIT_ID = 0x2000L;
    private static final long OPT_BIT_BODY_SITE = 0x4000L;
    private static final long OPT_BIT_REVENUE = 0x8000L;
    private static final long OPT_BIT_PROGRAM_CODE = 0x10000L;
    private static final long OPT_BIT_CATEGORY = 0x20000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40000L;
    private static final long OPT_BIT_NOTE_NUMBER = 0x80000L;
    private static final long OPT_BIT_LOCATION_CODEABLE_CONCEPT = 0x100000L;
    private static final long OPT_BIT_EXTENSION = 0x200000L;
    private static final long OPT_BIT_UNIT_PRICE = 0x400000L;
    private static final long OPT_BIT_SUB_SITE = 0x800000L;
    private static final long OPT_BIT_CARE_TEAM_SEQUENCE = 0x1000000L;
    private static final long OPT_BIT_LOCATION_REFERENCE = 0x2000000L;
    private static final long OPT_BIT_FACTOR = 0x4000000L;
    private static final long OPT_BIT_ADJUDICATION = 0x8000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable PositiveInt sequence;
    private @Nullable List<PositiveInt> diagnosisSequence;
    private @Nullable String servicedDate;
    private @Nullable Period servicedPeriod;
    private @Nullable Quantity quantity;
    private @Nullable Money net;
    private @Nullable List<PositiveInt> procedureSequence;
    private @Nullable List<PositiveInt> informationSequence;
    private @Nullable List<ExplanationOfBenefit_Detail> detail;
    private @Nullable CodeableConcept productOrService;
    private @Nullable List<CodeableConcept> modifier;
    private @Nullable List<Reference> udi;
    private @Nullable Address locationAddress;
    private @Nullable List<Reference> encounter;
    private @Nullable String id;
    private @Nullable CodeableConcept bodySite;
    private @Nullable CodeableConcept revenue;
    private @Nullable List<CodeableConcept> programCode;
    private @Nullable CodeableConcept category;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<PositiveInt> noteNumber;
    private @Nullable CodeableConcept locationCodeableConcept;
    private @Nullable List<Extension> extension;
    private @Nullable Money unitPrice;
    private @Nullable List<CodeableConcept> subSite;
    private @Nullable List<PositiveInt> careTeamSequence;
    private @Nullable Reference locationReference;
    private @Nullable Decimal factor;
    private @Nullable List<ExplanationOfBenefit_Adjudication> adjudication;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(PositiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sequence")
    public final Builder sequence(Optional<? extends PositiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#diagnosisSequence() diagnosisSequence} to diagnosisSequence.
     * @param diagnosisSequence The value for diagnosisSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosisSequence(List<PositiveInt> diagnosisSequence) {
      checkNotIsSet(diagnosisSequenceIsSet(), "diagnosisSequence");
      this.diagnosisSequence = Objects.requireNonNull(diagnosisSequence, "diagnosisSequence");
      optBits |= OPT_BIT_DIAGNOSIS_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#diagnosisSequence() diagnosisSequence} to diagnosisSequence.
     * @param diagnosisSequence The value for diagnosisSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diagnosisSequence")
    public final Builder diagnosisSequence(Optional<? extends List<PositiveInt>> diagnosisSequence) {
      checkNotIsSet(diagnosisSequenceIsSet(), "diagnosisSequence");
      this.diagnosisSequence = diagnosisSequence.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#servicedDate() servicedDate} to servicedDate.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#servicedDate() servicedDate} to servicedDate.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#servicedPeriod() servicedPeriod} to servicedPeriod.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#servicedPeriod() servicedPeriod} to servicedPeriod.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#net() net} to net.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#net() net} to net.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#procedureSequence() procedureSequence} to procedureSequence.
     * @param procedureSequence The value for procedureSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedureSequence(List<PositiveInt> procedureSequence) {
      checkNotIsSet(procedureSequenceIsSet(), "procedureSequence");
      this.procedureSequence = Objects.requireNonNull(procedureSequence, "procedureSequence");
      optBits |= OPT_BIT_PROCEDURE_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#procedureSequence() procedureSequence} to procedureSequence.
     * @param procedureSequence The value for procedureSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("procedureSequence")
    public final Builder procedureSequence(Optional<? extends List<PositiveInt>> procedureSequence) {
      checkNotIsSet(procedureSequenceIsSet(), "procedureSequence");
      this.procedureSequence = procedureSequence.orElse(null);
      optBits |= OPT_BIT_PROCEDURE_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#informationSequence() informationSequence} to informationSequence.
     * @param informationSequence The value for informationSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder informationSequence(List<PositiveInt> informationSequence) {
      checkNotIsSet(informationSequenceIsSet(), "informationSequence");
      this.informationSequence = Objects.requireNonNull(informationSequence, "informationSequence");
      optBits |= OPT_BIT_INFORMATION_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#informationSequence() informationSequence} to informationSequence.
     * @param informationSequence The value for informationSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("informationSequence")
    public final Builder informationSequence(Optional<? extends List<PositiveInt>> informationSequence) {
      checkNotIsSet(informationSequenceIsSet(), "informationSequence");
      this.informationSequence = informationSequence.orElse(null);
      optBits |= OPT_BIT_INFORMATION_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(List<ExplanationOfBenefit_Detail> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detail")
    public final Builder detail(Optional<? extends List<ExplanationOfBenefit_Detail>> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the value for the {@link ExplanationOfBenefit_Item#productOrService() productOrService} attribute.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for chained invocation
     */
    public final Builder udi(List<Reference> udi) {
      checkNotIsSet(udiIsSet(), "udi");
      this.udi = Objects.requireNonNull(udi, "udi");
      optBits |= OPT_BIT_UDI;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("udi")
    public final Builder udi(Optional<? extends List<Reference>> udi) {
      checkNotIsSet(udiIsSet(), "udi");
      this.udi = udi.orElse(null);
      optBits |= OPT_BIT_UDI;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#locationAddress() locationAddress} to locationAddress.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#locationAddress() locationAddress} to locationAddress.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(List<Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("encounter")
    public final Builder encounter(Optional<? extends List<Reference>> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#bodySite() bodySite} to bodySite.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#bodySite() bodySite} to bodySite.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for chained invocation
     */
    public final Builder revenue(CodeableConcept revenue) {
      checkNotIsSet(revenueIsSet(), "revenue");
      this.revenue = Objects.requireNonNull(revenue, "revenue");
      optBits |= OPT_BIT_REVENUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("revenue")
    public final Builder revenue(Optional<? extends CodeableConcept> revenue) {
      checkNotIsSet(revenueIsSet(), "revenue");
      this.revenue = revenue.orElse(null);
      optBits |= OPT_BIT_REVENUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#programCode() programCode} to programCode.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#programCode() programCode} to programCode.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#category() category} to category.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#category() category} to category.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#noteNumber() noteNumber} to noteNumber.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#noteNumber() noteNumber} to noteNumber.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#subSite() subSite} to subSite.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#subSite() subSite} to subSite.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#careTeamSequence() careTeamSequence} to careTeamSequence.
     * @param careTeamSequence The value for careTeamSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder careTeamSequence(List<PositiveInt> careTeamSequence) {
      checkNotIsSet(careTeamSequenceIsSet(), "careTeamSequence");
      this.careTeamSequence = Objects.requireNonNull(careTeamSequence, "careTeamSequence");
      optBits |= OPT_BIT_CARE_TEAM_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#careTeamSequence() careTeamSequence} to careTeamSequence.
     * @param careTeamSequence The value for careTeamSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("careTeamSequence")
    public final Builder careTeamSequence(Optional<? extends List<PositiveInt>> careTeamSequence) {
      checkNotIsSet(careTeamSequenceIsSet(), "careTeamSequence");
      this.careTeamSequence = careTeamSequence.orElse(null);
      optBits |= OPT_BIT_CARE_TEAM_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#locationReference() locationReference} to locationReference.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#locationReference() locationReference} to locationReference.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#factor() factor} to factor.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#factor() factor} to factor.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#adjudication() adjudication} to adjudication.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Item#adjudication() adjudication} to adjudication.
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
     * Builds a new {@link ExplanationOfBenefit_Item ExplanationOfBenefit_Item}.
     * @return An immutable instance of ExplanationOfBenefit_Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExplanationOfBenefit_Item build() {
      checkRequiredAttributes();
      return new ImmutableExplanationOfBenefit_Item(
          sequence,
          diagnosisSequence,
          servicedDate,
          servicedPeriod,
          quantity,
          net,
          procedureSequence,
          informationSequence,
          detail,
          productOrService,
          modifier,
          udi,
          locationAddress,
          encounter,
          id,
          bodySite,
          revenue,
          programCode,
          category,
          modifierExtension,
          noteNumber,
          locationCodeableConcept,
          extension,
          unitPrice,
          subSite,
          careTeamSequence,
          locationReference,
          factor,
          adjudication);
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean diagnosisSequenceIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS_SEQUENCE) != 0;
    }

    private boolean servicedDateIsSet() {
      return (optBits & OPT_BIT_SERVICED_DATE) != 0;
    }

    private boolean servicedPeriodIsSet() {
      return (optBits & OPT_BIT_SERVICED_PERIOD) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean netIsSet() {
      return (optBits & OPT_BIT_NET) != 0;
    }

    private boolean procedureSequenceIsSet() {
      return (optBits & OPT_BIT_PROCEDURE_SEQUENCE) != 0;
    }

    private boolean informationSequenceIsSet() {
      return (optBits & OPT_BIT_INFORMATION_SEQUENCE) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean modifierIsSet() {
      return (optBits & OPT_BIT_MODIFIER) != 0;
    }

    private boolean udiIsSet() {
      return (optBits & OPT_BIT_UDI) != 0;
    }

    private boolean locationAddressIsSet() {
      return (optBits & OPT_BIT_LOCATION_ADDRESS) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean revenueIsSet() {
      return (optBits & OPT_BIT_REVENUE) != 0;
    }

    private boolean programCodeIsSet() {
      return (optBits & OPT_BIT_PROGRAM_CODE) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean noteNumberIsSet() {
      return (optBits & OPT_BIT_NOTE_NUMBER) != 0;
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

    private boolean subSiteIsSet() {
      return (optBits & OPT_BIT_SUB_SITE) != 0;
    }

    private boolean careTeamSequenceIsSet() {
      return (optBits & OPT_BIT_CARE_TEAM_SEQUENCE) != 0;
    }

    private boolean locationReferenceIsSet() {
      return (optBits & OPT_BIT_LOCATION_REFERENCE) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private boolean adjudicationIsSet() {
      return (optBits & OPT_BIT_ADJUDICATION) != 0;
    }

    private boolean productOrServiceIsSet() {
      return (initBits & INIT_BIT_PRODUCT_OR_SERVICE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExplanationOfBenefit_Item is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!productOrServiceIsSet()) attributes.add("productOrService");
      return "Cannot build ExplanationOfBenefit_Item, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ExplanationOfBenefit_Item", generator = "Immutables")
  public interface ProductOrServiceBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit_Item#productOrService() productOrService} attribute.
     * @param productOrService The value for productOrService 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productOrService(CodeableConcept productOrService);
  }

  @Generated(from = "ExplanationOfBenefit_Item", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequence(PositiveInt sequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequence(Optional<? extends PositiveInt> sequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#diagnosisSequence() diagnosisSequence} to diagnosisSequence.
     * @param diagnosisSequence The value for diagnosisSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diagnosisSequence(List<PositiveInt> diagnosisSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#diagnosisSequence() diagnosisSequence} to diagnosisSequence.
     * @param diagnosisSequence The value for diagnosisSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diagnosisSequence(Optional<? extends List<PositiveInt>> diagnosisSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedDate(String servicedDate);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#servicedDate() servicedDate} to servicedDate.
     * @param servicedDate The value for servicedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedDate(Optional<String> servicedDate);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicedPeriod(Period servicedPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#servicedPeriod() servicedPeriod} to servicedPeriod.
     * @param servicedPeriod The value for servicedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicedPeriod(Optional<? extends Period> servicedPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(Quantity quantity);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(Optional<? extends Quantity> quantity);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for chained invocation
     */
    BuildFinal net(Money net);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal net(Optional<? extends Money> net);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#procedureSequence() procedureSequence} to procedureSequence.
     * @param procedureSequence The value for procedureSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal procedureSequence(List<PositiveInt> procedureSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#procedureSequence() procedureSequence} to procedureSequence.
     * @param procedureSequence The value for procedureSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal procedureSequence(Optional<? extends List<PositiveInt>> procedureSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#informationSequence() informationSequence} to informationSequence.
     * @param informationSequence The value for informationSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal informationSequence(List<PositiveInt> informationSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#informationSequence() informationSequence} to informationSequence.
     * @param informationSequence The value for informationSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal informationSequence(Optional<? extends List<PositiveInt>> informationSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detail(List<ExplanationOfBenefit_Detail> detail);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detail(Optional<? extends List<ExplanationOfBenefit_Detail>> detail);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifier(List<CodeableConcept> modifier);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifier(Optional<? extends List<CodeableConcept>> modifier);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for chained invocation
     */
    BuildFinal udi(List<Reference> udi);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal udi(Optional<? extends List<Reference>> udi);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationAddress(Address locationAddress);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationAddress(Optional<? extends Address> locationAddress);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(List<Reference> encounter);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends List<Reference>> encounter);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(CodeableConcept bodySite);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(Optional<? extends CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for chained invocation
     */
    BuildFinal revenue(CodeableConcept revenue);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal revenue(Optional<? extends CodeableConcept> revenue);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal programCode(List<CodeableConcept> programCode);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal programCode(Optional<? extends List<CodeableConcept>> programCode);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(CodeableConcept category);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends CodeableConcept> category);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal noteNumber(List<PositiveInt> noteNumber);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal noteNumber(Optional<? extends List<PositiveInt>> noteNumber);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
     * @param locationCodeableConcept The value for locationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationCodeableConcept(CodeableConcept locationCodeableConcept);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#locationCodeableConcept() locationCodeableConcept} to locationCodeableConcept.
     * @param locationCodeableConcept The value for locationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationCodeableConcept(Optional<? extends CodeableConcept> locationCodeableConcept);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unitPrice(Money unitPrice);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unitPrice(Optional<? extends Money> unitPrice);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#subSite() subSite} to subSite.
     * @param subSite The value for subSite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subSite(List<CodeableConcept> subSite);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#subSite() subSite} to subSite.
     * @param subSite The value for subSite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subSite(Optional<? extends List<CodeableConcept>> subSite);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#careTeamSequence() careTeamSequence} to careTeamSequence.
     * @param careTeamSequence The value for careTeamSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal careTeamSequence(List<PositiveInt> careTeamSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#careTeamSequence() careTeamSequence} to careTeamSequence.
     * @param careTeamSequence The value for careTeamSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal careTeamSequence(Optional<? extends List<PositiveInt>> careTeamSequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationReference(Reference locationReference);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationReference(Optional<? extends Reference> locationReference);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal factor(Decimal factor);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal factor(Optional<? extends Decimal> factor);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal adjudication(List<ExplanationOfBenefit_Adjudication> adjudication);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Item#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal adjudication(Optional<? extends List<ExplanationOfBenefit_Adjudication>> adjudication);

    /**
     * Builds a new {@link ExplanationOfBenefit_Item ExplanationOfBenefit_Item}.
     * @return An immutable instance of ExplanationOfBenefit_Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExplanationOfBenefit_Item build();
  }
}
