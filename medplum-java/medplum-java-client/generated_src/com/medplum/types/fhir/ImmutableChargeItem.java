package com.medplum.types.fhir;

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
 * Immutable implementation of {@link ChargeItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableChargeItem.builder()}.
 */
@Generated(from = "ChargeItem", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableChargeItem implements ChargeItem {
  private final @Nullable Uri implicitRules;
  private final @Nullable String overrideReason;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Reference productReference;
  private final @Nullable List<Extension> extension;
  private final @Nullable Reference costCenter;
  private final @Nullable List<ChargeItem_Performer> performer;
  private final @Nullable Reference performingOrganization;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Reference> account;
  private final CodeableConcept code;
  private final @Nullable DateTime enteredDate;
  private final @Nullable List<Canonical> definitionCanonical;
  private final Reference subject;
  private final @Nullable List<Reference> partOf;
  private final @Nullable Reference requestingOrganization;
  private final @Nullable Money priceOverride;
  private final @Nullable List<Annotation> note;
  private final String resourceType;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Period occurrencePeriod;
  private final @Nullable Reference enterer;
  private final @Nullable List<Reference> supportingInformation;
  private final @Nullable Meta meta;
  private final @Nullable Id id;
  private final @Nullable Narrative text;
  private final @Nullable Code language;
  private final @Nullable List<Uri> definitionUri;
  private final @Nullable ChargeitemStatus status;
  private final @Nullable Quantity quantity;
  private final @Nullable List<Reference> service;
  private final @Nullable CodeableConcept productCodeableConcept;
  private final @Nullable String occurrenceDateTime;
  private final @Nullable List<CodeableConcept> reason;
  private final @Nullable Reference context;
  private final @Nullable List<CodeableConcept> bodysite;
  private final @Nullable Timing occurrenceTiming;
  private final @Nullable Decimal factorOverride;

  private ImmutableChargeItem(
      @Nullable Uri implicitRules,
      @Nullable String overrideReason,
      @Nullable List<ResourceList> contained,
      @Nullable Reference productReference,
      @Nullable List<Extension> extension,
      @Nullable Reference costCenter,
      @Nullable List<ChargeItem_Performer> performer,
      @Nullable Reference performingOrganization,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Reference> account,
      CodeableConcept code,
      @Nullable DateTime enteredDate,
      @Nullable List<Canonical> definitionCanonical,
      Reference subject,
      @Nullable List<Reference> partOf,
      @Nullable Reference requestingOrganization,
      @Nullable Money priceOverride,
      @Nullable List<Annotation> note,
      String resourceType,
      @Nullable List<Identifier> identifier,
      @Nullable Period occurrencePeriod,
      @Nullable Reference enterer,
      @Nullable List<Reference> supportingInformation,
      @Nullable Meta meta,
      @Nullable Id id,
      @Nullable Narrative text,
      @Nullable Code language,
      @Nullable List<Uri> definitionUri,
      @Nullable ChargeitemStatus status,
      @Nullable Quantity quantity,
      @Nullable List<Reference> service,
      @Nullable CodeableConcept productCodeableConcept,
      @Nullable String occurrenceDateTime,
      @Nullable List<CodeableConcept> reason,
      @Nullable Reference context,
      @Nullable List<CodeableConcept> bodysite,
      @Nullable Timing occurrenceTiming,
      @Nullable Decimal factorOverride) {
    this.implicitRules = implicitRules;
    this.overrideReason = overrideReason;
    this.contained = contained;
    this.productReference = productReference;
    this.extension = extension;
    this.costCenter = costCenter;
    this.performer = performer;
    this.performingOrganization = performingOrganization;
    this.modifierExtension = modifierExtension;
    this.account = account;
    this.code = code;
    this.enteredDate = enteredDate;
    this.definitionCanonical = definitionCanonical;
    this.subject = subject;
    this.partOf = partOf;
    this.requestingOrganization = requestingOrganization;
    this.priceOverride = priceOverride;
    this.note = note;
    this.resourceType = resourceType;
    this.identifier = identifier;
    this.occurrencePeriod = occurrencePeriod;
    this.enterer = enterer;
    this.supportingInformation = supportingInformation;
    this.meta = meta;
    this.id = id;
    this.text = text;
    this.language = language;
    this.definitionUri = definitionUri;
    this.status = status;
    this.quantity = quantity;
    this.service = service;
    this.productCodeableConcept = productCodeableConcept;
    this.occurrenceDateTime = occurrenceDateTime;
    this.reason = reason;
    this.context = context;
    this.bodysite = bodysite;
    this.occurrenceTiming = occurrenceTiming;
    this.factorOverride = factorOverride;
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
   * @return The value of the {@code overrideReason} attribute
   */
  @JsonProperty("overrideReason")
  @Override
  public Optional<String> overrideReason() {
    return Optional.ofNullable(overrideReason);
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
   * @return The value of the {@code productReference} attribute
   */
  @JsonProperty("productReference")
  @Override
  public Optional<Reference> productReference() {
    return Optional.ofNullable(productReference);
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
   * @return The value of the {@code costCenter} attribute
   */
  @JsonProperty("costCenter")
  @Override
  public Optional<Reference> costCenter() {
    return Optional.ofNullable(costCenter);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @JsonProperty("performer")
  @Override
  public Optional<List<ChargeItem_Performer>> performer() {
    return Optional.ofNullable(performer);
  }

  /**
   * @return The value of the {@code performingOrganization} attribute
   */
  @JsonProperty("performingOrganization")
  @Override
  public Optional<Reference> performingOrganization() {
    return Optional.ofNullable(performingOrganization);
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
   * @return The value of the {@code account} attribute
   */
  @JsonProperty("account")
  @Override
  public Optional<List<Reference>> account() {
    return Optional.ofNullable(account);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public CodeableConcept code() {
    return code;
  }

  /**
   * @return The value of the {@code enteredDate} attribute
   */
  @JsonProperty("enteredDate")
  @Override
  public Optional<DateTime> enteredDate() {
    return Optional.ofNullable(enteredDate);
  }

  /**
   * @return The value of the {@code definitionCanonical} attribute
   */
  @JsonProperty("definitionCanonical")
  @Override
  public Optional<List<Canonical>> definitionCanonical() {
    return Optional.ofNullable(definitionCanonical);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Reference subject() {
    return subject;
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
   * @return The value of the {@code requestingOrganization} attribute
   */
  @JsonProperty("requestingOrganization")
  @Override
  public Optional<Reference> requestingOrganization() {
    return Optional.ofNullable(requestingOrganization);
  }

  /**
   * @return The value of the {@code priceOverride} attribute
   */
  @JsonProperty("priceOverride")
  @Override
  public Optional<Money> priceOverride() {
    return Optional.ofNullable(priceOverride);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code enterer} attribute
   */
  @JsonProperty("enterer")
  @Override
  public Optional<Reference> enterer() {
    return Optional.ofNullable(enterer);
  }

  /**
   * @return The value of the {@code supportingInformation} attribute
   */
  @JsonProperty("supportingInformation")
  @Override
  public Optional<List<Reference>> supportingInformation() {
    return Optional.ofNullable(supportingInformation);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code definitionUri} attribute
   */
  @JsonProperty("definitionUri")
  @Override
  public Optional<List<Uri>> definitionUri() {
    return Optional.ofNullable(definitionUri);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<ChargeitemStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code service} attribute
   */
  @JsonProperty("service")
  @Override
  public Optional<List<Reference>> service() {
    return Optional.ofNullable(service);
  }

  /**
   * @return The value of the {@code productCodeableConcept} attribute
   */
  @JsonProperty("productCodeableConcept")
  @Override
  public Optional<CodeableConcept> productCodeableConcept() {
    return Optional.ofNullable(productCodeableConcept);
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
   * @return The value of the {@code reason} attribute
   */
  @JsonProperty("reason")
  @Override
  public Optional<List<CodeableConcept>> reason() {
    return Optional.ofNullable(reason);
  }

  /**
   * @return The value of the {@code context} attribute
   */
  @JsonProperty("context")
  @Override
  public Optional<Reference> context() {
    return Optional.ofNullable(context);
  }

  /**
   * @return The value of the {@code bodysite} attribute
   */
  @JsonProperty("bodysite")
  @Override
  public Optional<List<CodeableConcept>> bodysite() {
    return Optional.ofNullable(bodysite);
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
   * @return The value of the {@code factorOverride} attribute
   */
  @JsonProperty("factorOverride")
  @Override
  public Optional<Decimal> factorOverride() {
    return Optional.ofNullable(factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableChargeItem(
        newValue,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableChargeItem(
        value,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#overrideReason() overrideReason} attribute.
   * @param value The value for overrideReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withOverrideReason(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "overrideReason");
    if (Objects.equals(this.overrideReason, newValue)) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        newValue,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#overrideReason() overrideReason} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for overrideReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withOverrideReason(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.overrideReason, value)) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        value,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        newValue,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        value,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#productReference() productReference} attribute.
   * @param value The value for productReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withProductReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "productReference");
    if (this.productReference == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        newValue,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#productReference() productReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withProductReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.productReference == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        value,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        newValue,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        value,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#costCenter() costCenter} attribute.
   * @param value The value for costCenter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withCostCenter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "costCenter");
    if (this.costCenter == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        newValue,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#costCenter() costCenter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for costCenter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withCostCenter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.costCenter == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        value,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withPerformer(List<ChargeItem_Performer> value) {
    @Nullable List<ChargeItem_Performer> newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        newValue,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withPerformer(Optional<? extends List<ChargeItem_Performer>> optional) {
    @Nullable List<ChargeItem_Performer> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        value,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#performingOrganization() performingOrganization} attribute.
   * @param value The value for performingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withPerformingOrganization(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "performingOrganization");
    if (this.performingOrganization == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        newValue,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#performingOrganization() performingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withPerformingOrganization(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.performingOrganization == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        value,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        newValue,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        value,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#account() account} attribute.
   * @param value The value for account
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withAccount(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "account");
    if (this.account == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        newValue,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#account() account} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for account
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withAccount(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.account == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        value,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeItem#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeItem withCode(CodeableConcept value) {
    if (this.code == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "code");
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        newValue,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#enteredDate() enteredDate} attribute.
   * @param value The value for enteredDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withEnteredDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "enteredDate");
    if (this.enteredDate == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        newValue,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#enteredDate() enteredDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enteredDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withEnteredDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.enteredDate == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        value,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#definitionCanonical() definitionCanonical} attribute.
   * @param value The value for definitionCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withDefinitionCanonical(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "definitionCanonical");
    if (this.definitionCanonical == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        newValue,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#definitionCanonical() definitionCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withDefinitionCanonical(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.definitionCanonical == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        value,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeItem#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeItem withSubject(Reference value) {
    if (this.subject == value) return this;
    Reference newValue = Objects.requireNonNull(value, "subject");
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        newValue,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withPartOf(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        newValue,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withPartOf(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        value,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#requestingOrganization() requestingOrganization} attribute.
   * @param value The value for requestingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withRequestingOrganization(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "requestingOrganization");
    if (this.requestingOrganization == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        newValue,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#requestingOrganization() requestingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withRequestingOrganization(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.requestingOrganization == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        value,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#priceOverride() priceOverride} attribute.
   * @param value The value for priceOverride
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withPriceOverride(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "priceOverride");
    if (this.priceOverride == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        newValue,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#priceOverride() priceOverride} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priceOverride
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withPriceOverride(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.priceOverride == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        value,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        newValue,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        value,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeItem#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeItem withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        newValue,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        newValue,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        value,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#occurrencePeriod() occurrencePeriod} attribute.
   * @param value The value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withOccurrencePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "occurrencePeriod");
    if (this.occurrencePeriod == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        newValue,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#occurrencePeriod() occurrencePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withOccurrencePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.occurrencePeriod == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        value,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#enterer() enterer} attribute.
   * @param value The value for enterer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withEnterer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "enterer");
    if (this.enterer == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        newValue,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#enterer() enterer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enterer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withEnterer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.enterer == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        value,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#supportingInformation() supportingInformation} attribute.
   * @param value The value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withSupportingInformation(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "supportingInformation");
    if (this.supportingInformation == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        newValue,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#supportingInformation() supportingInformation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withSupportingInformation(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.supportingInformation == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        value,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        newValue,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        value,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        newValue,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        value,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        newValue,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        value,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        newValue,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        value,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#definitionUri() definitionUri} attribute.
   * @param value The value for definitionUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withDefinitionUri(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "definitionUri");
    if (this.definitionUri == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        newValue,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#definitionUri() definitionUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withDefinitionUri(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.definitionUri == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        value,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withStatus(ChargeitemStatus value) {
    @Nullable ChargeitemStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        newValue,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withStatus(Optional<? extends ChargeitemStatus> optional) {
    @Nullable ChargeitemStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        value,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        newValue,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        value,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#service() service} attribute.
   * @param value The value for service
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withService(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "service");
    if (this.service == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        newValue,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#service() service} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for service
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withService(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.service == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        value,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#productCodeableConcept() productCodeableConcept} attribute.
   * @param value The value for productCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withProductCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "productCodeableConcept");
    if (this.productCodeableConcept == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        newValue,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#productCodeableConcept() productCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withProductCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.productCodeableConcept == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        value,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withOccurrenceDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "occurrenceDateTime");
    if (Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        newValue,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withOccurrenceDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        value,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withReason(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        newValue,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withReason(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        value,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withContext(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        newValue,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withContext(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        value,
        this.bodysite,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#bodysite() bodysite} attribute.
   * @param value The value for bodysite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withBodysite(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "bodysite");
    if (this.bodysite == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        newValue,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#bodysite() bodysite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodysite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withBodysite(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.bodysite == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        value,
        this.occurrenceTiming,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#occurrenceTiming() occurrenceTiming} attribute.
   * @param value The value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withOccurrenceTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "occurrenceTiming");
    if (this.occurrenceTiming == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        newValue,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#occurrenceTiming() occurrenceTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withOccurrenceTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.occurrenceTiming == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        value,
        this.factorOverride);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#factorOverride() factorOverride} attribute.
   * @param value The value for factorOverride
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withFactorOverride(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "factorOverride");
    if (this.factorOverride == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#factorOverride() factorOverride} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factorOverride
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withFactorOverride(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.factorOverride == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.overrideReason,
        this.contained,
        this.productReference,
        this.extension,
        this.costCenter,
        this.performer,
        this.performingOrganization,
        this.modifierExtension,
        this.account,
        this.code,
        this.enteredDate,
        this.definitionCanonical,
        this.subject,
        this.partOf,
        this.requestingOrganization,
        this.priceOverride,
        this.note,
        this.resourceType,
        this.identifier,
        this.occurrencePeriod,
        this.enterer,
        this.supportingInformation,
        this.meta,
        this.id,
        this.text,
        this.language,
        this.definitionUri,
        this.status,
        this.quantity,
        this.service,
        this.productCodeableConcept,
        this.occurrenceDateTime,
        this.reason,
        this.context,
        this.bodysite,
        this.occurrenceTiming,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableChargeItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableChargeItem
        && equalTo((ImmutableChargeItem) another);
  }

  private boolean equalTo(ImmutableChargeItem another) {
    return Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(overrideReason, another.overrideReason)
        && Objects.equals(contained, another.contained)
        && Objects.equals(productReference, another.productReference)
        && Objects.equals(extension, another.extension)
        && Objects.equals(costCenter, another.costCenter)
        && Objects.equals(performer, another.performer)
        && Objects.equals(performingOrganization, another.performingOrganization)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(account, another.account)
        && code.equals(another.code)
        && Objects.equals(enteredDate, another.enteredDate)
        && Objects.equals(definitionCanonical, another.definitionCanonical)
        && subject.equals(another.subject)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(requestingOrganization, another.requestingOrganization)
        && Objects.equals(priceOverride, another.priceOverride)
        && Objects.equals(note, another.note)
        && resourceType.equals(another.resourceType)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(occurrencePeriod, another.occurrencePeriod)
        && Objects.equals(enterer, another.enterer)
        && Objects.equals(supportingInformation, another.supportingInformation)
        && Objects.equals(meta, another.meta)
        && Objects.equals(id, another.id)
        && Objects.equals(text, another.text)
        && Objects.equals(language, another.language)
        && Objects.equals(definitionUri, another.definitionUri)
        && Objects.equals(status, another.status)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(service, another.service)
        && Objects.equals(productCodeableConcept, another.productCodeableConcept)
        && Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && Objects.equals(reason, another.reason)
        && Objects.equals(context, another.context)
        && Objects.equals(bodysite, another.bodysite)
        && Objects.equals(occurrenceTiming, another.occurrenceTiming)
        && Objects.equals(factorOverride, another.factorOverride);
  }

  /**
   * Computes a hash code from attributes: {@code implicitRules}, {@code overrideReason}, {@code contained}, {@code productReference}, {@code extension}, {@code costCenter}, {@code performer}, {@code performingOrganization}, {@code modifierExtension}, {@code account}, {@code code}, {@code enteredDate}, {@code definitionCanonical}, {@code subject}, {@code partOf}, {@code requestingOrganization}, {@code priceOverride}, {@code note}, {@code resourceType}, {@code identifier}, {@code occurrencePeriod}, {@code enterer}, {@code supportingInformation}, {@code meta}, {@code id}, {@code text}, {@code language}, {@code definitionUri}, {@code status}, {@code quantity}, {@code service}, {@code productCodeableConcept}, {@code occurrenceDateTime}, {@code reason}, {@code context}, {@code bodysite}, {@code occurrenceTiming}, {@code factorOverride}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(overrideReason);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(productReference);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(costCenter);
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + Objects.hashCode(performingOrganization);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(account);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + Objects.hashCode(enteredDate);
    h += (h << 5) + Objects.hashCode(definitionCanonical);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(requestingOrganization);
    h += (h << 5) + Objects.hashCode(priceOverride);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(occurrencePeriod);
    h += (h << 5) + Objects.hashCode(enterer);
    h += (h << 5) + Objects.hashCode(supportingInformation);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(definitionUri);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(service);
    h += (h << 5) + Objects.hashCode(productCodeableConcept);
    h += (h << 5) + Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + Objects.hashCode(reason);
    h += (h << 5) + Objects.hashCode(context);
    h += (h << 5) + Objects.hashCode(bodysite);
    h += (h << 5) + Objects.hashCode(occurrenceTiming);
    h += (h << 5) + Objects.hashCode(factorOverride);
    return h;
  }

  /**
   * Prints the immutable value {@code ChargeItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ChargeItem{");
    if (implicitRules != null) {
      builder.append("implicitRules=").append(implicitRules);
    }
    if (overrideReason != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("overrideReason=").append(overrideReason);
    }
    if (contained != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (productReference != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("productReference=").append(productReference);
    }
    if (extension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (costCenter != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("costCenter=").append(costCenter);
    }
    if (performer != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (performingOrganization != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("performingOrganization=").append(performingOrganization);
    }
    if (modifierExtension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (account != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("account=").append(account);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("code=").append(code);
    if (enteredDate != null) {
      builder.append(", ");
      builder.append("enteredDate=").append(enteredDate);
    }
    if (definitionCanonical != null) {
      builder.append(", ");
      builder.append("definitionCanonical=").append(definitionCanonical);
    }
    builder.append(", ");
    builder.append("subject=").append(subject);
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (requestingOrganization != null) {
      builder.append(", ");
      builder.append("requestingOrganization=").append(requestingOrganization);
    }
    if (priceOverride != null) {
      builder.append(", ");
      builder.append("priceOverride=").append(priceOverride);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (occurrencePeriod != null) {
      builder.append(", ");
      builder.append("occurrencePeriod=").append(occurrencePeriod);
    }
    if (enterer != null) {
      builder.append(", ");
      builder.append("enterer=").append(enterer);
    }
    if (supportingInformation != null) {
      builder.append(", ");
      builder.append("supportingInformation=").append(supportingInformation);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (definitionUri != null) {
      builder.append(", ");
      builder.append("definitionUri=").append(definitionUri);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (service != null) {
      builder.append(", ");
      builder.append("service=").append(service);
    }
    if (productCodeableConcept != null) {
      builder.append(", ");
      builder.append("productCodeableConcept=").append(productCodeableConcept);
    }
    if (occurrenceDateTime != null) {
      builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (reason != null) {
      builder.append(", ");
      builder.append("reason=").append(reason);
    }
    if (context != null) {
      builder.append(", ");
      builder.append("context=").append(context);
    }
    if (bodysite != null) {
      builder.append(", ");
      builder.append("bodysite=").append(bodysite);
    }
    if (occurrenceTiming != null) {
      builder.append(", ");
      builder.append("occurrenceTiming=").append(occurrenceTiming);
    }
    if (factorOverride != null) {
      builder.append(", ");
      builder.append("factorOverride=").append(factorOverride);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ChargeItem", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ChargeItem {
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<String> overrideReason = Optional.empty();
    boolean overrideReasonIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Reference> productReference = Optional.empty();
    boolean productReferenceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Reference> costCenter = Optional.empty();
    boolean costCenterIsSet;
    @Nullable Optional<List<ChargeItem_Performer>> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable Optional<Reference> performingOrganization = Optional.empty();
    boolean performingOrganizationIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Reference>> account = Optional.empty();
    boolean accountIsSet;
    @Nullable CodeableConcept code;
    @Nullable Optional<DateTime> enteredDate = Optional.empty();
    boolean enteredDateIsSet;
    @Nullable Optional<List<Canonical>> definitionCanonical = Optional.empty();
    boolean definitionCanonicalIsSet;
    @Nullable Reference subject;
    @Nullable Optional<List<Reference>> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<Reference> requestingOrganization = Optional.empty();
    boolean requestingOrganizationIsSet;
    @Nullable Optional<Money> priceOverride = Optional.empty();
    boolean priceOverrideIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Period> occurrencePeriod = Optional.empty();
    boolean occurrencePeriodIsSet;
    @Nullable Optional<Reference> enterer = Optional.empty();
    boolean entererIsSet;
    @Nullable Optional<List<Reference>> supportingInformation = Optional.empty();
    boolean supportingInformationIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Uri>> definitionUri = Optional.empty();
    boolean definitionUriIsSet;
    @Nullable Optional<ChargeitemStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<List<Reference>> service = Optional.empty();
    boolean serviceIsSet;
    @Nullable Optional<CodeableConcept> productCodeableConcept = Optional.empty();
    boolean productCodeableConceptIsSet;
    @Nullable Optional<String> occurrenceDateTime = Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @Nullable Optional<List<CodeableConcept>> reason = Optional.empty();
    boolean reasonIsSet;
    @Nullable Optional<Reference> context = Optional.empty();
    boolean contextIsSet;
    @Nullable Optional<List<CodeableConcept>> bodysite = Optional.empty();
    boolean bodysiteIsSet;
    @Nullable Optional<Timing> occurrenceTiming = Optional.empty();
    boolean occurrenceTimingIsSet;
    @Nullable Optional<Decimal> factorOverride = Optional.empty();
    boolean factorOverrideIsSet;
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("overrideReason")
    public void setOverrideReason(Optional<String> overrideReason) {
      this.overrideReason = overrideReason;
      this.overrideReasonIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("productReference")
    public void setProductReference(Optional<Reference> productReference) {
      this.productReference = productReference;
      this.productReferenceIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("costCenter")
    public void setCostCenter(Optional<Reference> costCenter) {
      this.costCenter = costCenter;
      this.costCenterIsSet = true;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<List<ChargeItem_Performer>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @JsonProperty("performingOrganization")
    public void setPerformingOrganization(Optional<Reference> performingOrganization) {
      this.performingOrganization = performingOrganization;
      this.performingOrganizationIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("account")
    public void setAccount(Optional<List<Reference>> account) {
      this.account = account;
      this.accountIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
      this.code = code;
    }
    @JsonProperty("enteredDate")
    public void setEnteredDate(Optional<DateTime> enteredDate) {
      this.enteredDate = enteredDate;
      this.enteredDateIsSet = true;
    }
    @JsonProperty("definitionCanonical")
    public void setDefinitionCanonical(Optional<List<Canonical>> definitionCanonical) {
      this.definitionCanonical = definitionCanonical;
      this.definitionCanonicalIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
      this.subject = subject;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<List<Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("requestingOrganization")
    public void setRequestingOrganization(Optional<Reference> requestingOrganization) {
      this.requestingOrganization = requestingOrganization;
      this.requestingOrganizationIsSet = true;
    }
    @JsonProperty("priceOverride")
    public void setPriceOverride(Optional<Money> priceOverride) {
      this.priceOverride = priceOverride;
      this.priceOverrideIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(Optional<Period> occurrencePeriod) {
      this.occurrencePeriod = occurrencePeriod;
      this.occurrencePeriodIsSet = true;
    }
    @JsonProperty("enterer")
    public void setEnterer(Optional<Reference> enterer) {
      this.enterer = enterer;
      this.entererIsSet = true;
    }
    @JsonProperty("supportingInformation")
    public void setSupportingInformation(Optional<List<Reference>> supportingInformation) {
      this.supportingInformation = supportingInformation;
      this.supportingInformationIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("definitionUri")
    public void setDefinitionUri(Optional<List<Uri>> definitionUri) {
      this.definitionUri = definitionUri;
      this.definitionUriIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<ChargeitemStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("service")
    public void setService(Optional<List<Reference>> service) {
      this.service = service;
      this.serviceIsSet = true;
    }
    @JsonProperty("productCodeableConcept")
    public void setProductCodeableConcept(Optional<CodeableConcept> productCodeableConcept) {
      this.productCodeableConcept = productCodeableConcept;
      this.productCodeableConceptIsSet = true;
    }
    @JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(Optional<String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @JsonProperty("reason")
    public void setReason(Optional<List<CodeableConcept>> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @JsonProperty("context")
    public void setContext(Optional<Reference> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @JsonProperty("bodysite")
    public void setBodysite(Optional<List<CodeableConcept>> bodysite) {
      this.bodysite = bodysite;
      this.bodysiteIsSet = true;
    }
    @JsonProperty("occurrenceTiming")
    public void setOccurrenceTiming(Optional<Timing> occurrenceTiming) {
      this.occurrenceTiming = occurrenceTiming;
      this.occurrenceTimingIsSet = true;
    }
    @JsonProperty("factorOverride")
    public void setFactorOverride(Optional<Decimal> factorOverride) {
      this.factorOverride = factorOverride;
      this.factorOverrideIsSet = true;
    }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> overrideReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> productReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> costCenter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ChargeItem_Performer>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> performingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> account() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> enteredDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> definitionCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> requestingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> priceOverride() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> occurrencePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> enterer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> supportingInformation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> definitionUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ChargeitemStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> service() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> productCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> context() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> bodysite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> occurrenceTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> factorOverride() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableChargeItem fromJson(Json json) {
    ImmutableChargeItem.Builder builder = ((ImmutableChargeItem.Builder) ImmutableChargeItem.builder());
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.overrideReasonIsSet) {
      builder.overrideReason(json.overrideReason);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.productReferenceIsSet) {
      builder.productReference(json.productReference);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.costCenterIsSet) {
      builder.costCenter(json.costCenter);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.performingOrganizationIsSet) {
      builder.performingOrganization(json.performingOrganization);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.accountIsSet) {
      builder.account(json.account);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.enteredDateIsSet) {
      builder.enteredDate(json.enteredDate);
    }
    if (json.definitionCanonicalIsSet) {
      builder.definitionCanonical(json.definitionCanonical);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.requestingOrganizationIsSet) {
      builder.requestingOrganization(json.requestingOrganization);
    }
    if (json.priceOverrideIsSet) {
      builder.priceOverride(json.priceOverride);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.occurrencePeriodIsSet) {
      builder.occurrencePeriod(json.occurrencePeriod);
    }
    if (json.entererIsSet) {
      builder.enterer(json.enterer);
    }
    if (json.supportingInformationIsSet) {
      builder.supportingInformation(json.supportingInformation);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.definitionUriIsSet) {
      builder.definitionUri(json.definitionUri);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.serviceIsSet) {
      builder.service(json.service);
    }
    if (json.productCodeableConceptIsSet) {
      builder.productCodeableConcept(json.productCodeableConcept);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.bodysiteIsSet) {
      builder.bodysite(json.bodysite);
    }
    if (json.occurrenceTimingIsSet) {
      builder.occurrenceTiming(json.occurrenceTiming);
    }
    if (json.factorOverrideIsSet) {
      builder.factorOverride(json.factorOverride);
    }
    return (ImmutableChargeItem) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ChargeItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ChargeItem instance
   */
  public static ChargeItem copyOf(ChargeItem instance) {
    if (instance instanceof ImmutableChargeItem) {
      return (ImmutableChargeItem) instance;
    }
    return ((ImmutableChargeItem.Builder) ImmutableChargeItem.builder())
        .implicitRules(instance.implicitRules())
        .overrideReason(instance.overrideReason())
        .contained(instance.contained())
        .productReference(instance.productReference())
        .extension(instance.extension())
        .costCenter(instance.costCenter())
        .performer(instance.performer())
        .performingOrganization(instance.performingOrganization())
        .modifierExtension(instance.modifierExtension())
        .account(instance.account())
        .code(instance.code())
        .enteredDate(instance.enteredDate())
        .definitionCanonical(instance.definitionCanonical())
        .subject(instance.subject())
        .partOf(instance.partOf())
        .requestingOrganization(instance.requestingOrganization())
        .priceOverride(instance.priceOverride())
        .note(instance.note())
        .resourceType(instance.resourceType())
        .identifier(instance.identifier())
        .occurrencePeriod(instance.occurrencePeriod())
        .enterer(instance.enterer())
        .supportingInformation(instance.supportingInformation())
        .meta(instance.meta())
        .id(instance.id())
        .text(instance.text())
        .language(instance.language())
        .definitionUri(instance.definitionUri())
        .status(instance.status())
        .quantity(instance.quantity())
        .service(instance.service())
        .productCodeableConcept(instance.productCodeableConcept())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .reason(instance.reason())
        .context(instance.context())
        .bodysite(instance.bodysite())
        .occurrenceTiming(instance.occurrenceTiming())
        .factorOverride(instance.factorOverride())
        .build();
  }

  /**
   * Creates a builder for {@link ChargeItem ChargeItem}.
   * <pre>
   * ImmutableChargeItem.builder()
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link ChargeItem#implicitRules() implicitRules}
   *    .overrideReason(String) // optional {@link ChargeItem#overrideReason() overrideReason}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link ChargeItem#contained() contained}
   *    .productReference(com.medplum.types.fhir.Reference) // optional {@link ChargeItem#productReference() productReference}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ChargeItem#extension() extension}
   *    .costCenter(com.medplum.types.fhir.Reference) // optional {@link ChargeItem#costCenter() costCenter}
   *    .performer(List&amp;lt;com.medplum.types.fhir.ChargeItem_Performer&amp;gt;) // optional {@link ChargeItem#performer() performer}
   *    .performingOrganization(com.medplum.types.fhir.Reference) // optional {@link ChargeItem#performingOrganization() performingOrganization}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ChargeItem#modifierExtension() modifierExtension}
   *    .account(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ChargeItem#account() account}
   *    .code(com.medplum.types.fhir.CodeableConcept) // required {@link ChargeItem#code() code}
   *    .enteredDate(com.medplum.types.fhir.DateTime) // optional {@link ChargeItem#enteredDate() enteredDate}
   *    .definitionCanonical(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link ChargeItem#definitionCanonical() definitionCanonical}
   *    .subject(com.medplum.types.fhir.Reference) // required {@link ChargeItem#subject() subject}
   *    .partOf(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ChargeItem#partOf() partOf}
   *    .requestingOrganization(com.medplum.types.fhir.Reference) // optional {@link ChargeItem#requestingOrganization() requestingOrganization}
   *    .priceOverride(com.medplum.types.fhir.Money) // optional {@link ChargeItem#priceOverride() priceOverride}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link ChargeItem#note() note}
   *    .resourceType(String) // required {@link ChargeItem#resourceType() resourceType}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link ChargeItem#identifier() identifier}
   *    .occurrencePeriod(com.medplum.types.fhir.Period) // optional {@link ChargeItem#occurrencePeriod() occurrencePeriod}
   *    .enterer(com.medplum.types.fhir.Reference) // optional {@link ChargeItem#enterer() enterer}
   *    .supportingInformation(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ChargeItem#supportingInformation() supportingInformation}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link ChargeItem#meta() meta}
   *    .id(com.medplum.types.fhir.Id) // optional {@link ChargeItem#id() id}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link ChargeItem#text() text}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ChargeItem#language() language}
   *    .definitionUri(List&amp;lt;com.medplum.types.fhir.Uri&amp;gt;) // optional {@link ChargeItem#definitionUri() definitionUri}
   *    .status(com.medplum.types.fhir.ChargeitemStatus) // optional {@link ChargeItem#status() status}
   *    .quantity(com.medplum.types.fhir.Quantity) // optional {@link ChargeItem#quantity() quantity}
   *    .service(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ChargeItem#service() service}
   *    .productCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link ChargeItem#productCodeableConcept() productCodeableConcept}
   *    .occurrenceDateTime(String) // optional {@link ChargeItem#occurrenceDateTime() occurrenceDateTime}
   *    .reason(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ChargeItem#reason() reason}
   *    .context(com.medplum.types.fhir.Reference) // optional {@link ChargeItem#context() context}
   *    .bodysite(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ChargeItem#bodysite() bodysite}
   *    .occurrenceTiming(com.medplum.types.fhir.Timing) // optional {@link ChargeItem#occurrenceTiming() occurrenceTiming}
   *    .factorOverride(com.medplum.types.fhir.Decimal) // optional {@link ChargeItem#factorOverride() factorOverride}
   *    .build();
   * </pre>
   * @return A new ChargeItem builder
   */
  public static CodeBuildStage builder() {
    return new ImmutableChargeItem.Builder();
  }

  /**
   * Builds instances of type {@link ChargeItem ChargeItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ChargeItem", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CodeBuildStage, SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long INIT_BIT_SUBJECT = 0x2L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1L;
    private static final long OPT_BIT_OVERRIDE_REASON = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x4L;
    private static final long OPT_BIT_PRODUCT_REFERENCE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_COST_CENTER = 0x20L;
    private static final long OPT_BIT_PERFORMER = 0x40L;
    private static final long OPT_BIT_PERFORMING_ORGANIZATION = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_ACCOUNT = 0x200L;
    private static final long OPT_BIT_ENTERED_DATE = 0x400L;
    private static final long OPT_BIT_DEFINITION_CANONICAL = 0x800L;
    private static final long OPT_BIT_PART_OF = 0x1000L;
    private static final long OPT_BIT_REQUESTING_ORGANIZATION = 0x2000L;
    private static final long OPT_BIT_PRICE_OVERRIDE = 0x4000L;
    private static final long OPT_BIT_NOTE = 0x8000L;
    private static final long OPT_BIT_IDENTIFIER = 0x10000L;
    private static final long OPT_BIT_OCCURRENCE_PERIOD = 0x20000L;
    private static final long OPT_BIT_ENTERER = 0x40000L;
    private static final long OPT_BIT_SUPPORTING_INFORMATION = 0x80000L;
    private static final long OPT_BIT_META = 0x100000L;
    private static final long OPT_BIT_ID = 0x200000L;
    private static final long OPT_BIT_TEXT = 0x400000L;
    private static final long OPT_BIT_LANGUAGE = 0x800000L;
    private static final long OPT_BIT_DEFINITION_URI = 0x1000000L;
    private static final long OPT_BIT_STATUS = 0x2000000L;
    private static final long OPT_BIT_QUANTITY = 0x4000000L;
    private static final long OPT_BIT_SERVICE = 0x8000000L;
    private static final long OPT_BIT_PRODUCT_CODEABLE_CONCEPT = 0x10000000L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x20000000L;
    private static final long OPT_BIT_REASON = 0x40000000L;
    private static final long OPT_BIT_CONTEXT = 0x80000000L;
    private static final long OPT_BIT_BODYSITE = 0x100000000L;
    private static final long OPT_BIT_OCCURRENCE_TIMING = 0x200000000L;
    private static final long OPT_BIT_FACTOR_OVERRIDE = 0x400000000L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable Uri implicitRules;
    private @Nullable String overrideReason;
    private @Nullable List<ResourceList> contained;
    private @Nullable Reference productReference;
    private @Nullable List<Extension> extension;
    private @Nullable Reference costCenter;
    private @Nullable List<ChargeItem_Performer> performer;
    private @Nullable Reference performingOrganization;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Reference> account;
    private @Nullable CodeableConcept code;
    private @Nullable DateTime enteredDate;
    private @Nullable List<Canonical> definitionCanonical;
    private @Nullable Reference subject;
    private @Nullable List<Reference> partOf;
    private @Nullable Reference requestingOrganization;
    private @Nullable Money priceOverride;
    private @Nullable List<Annotation> note;
    private @Nullable String resourceType;
    private @Nullable List<Identifier> identifier;
    private @Nullable Period occurrencePeriod;
    private @Nullable Reference enterer;
    private @Nullable List<Reference> supportingInformation;
    private @Nullable Meta meta;
    private @Nullable Id id;
    private @Nullable Narrative text;
    private @Nullable Code language;
    private @Nullable List<Uri> definitionUri;
    private @Nullable ChargeitemStatus status;
    private @Nullable Quantity quantity;
    private @Nullable List<Reference> service;
    private @Nullable CodeableConcept productCodeableConcept;
    private @Nullable String occurrenceDateTime;
    private @Nullable List<CodeableConcept> reason;
    private @Nullable Reference context;
    private @Nullable List<CodeableConcept> bodysite;
    private @Nullable Timing occurrenceTiming;
    private @Nullable Decimal factorOverride;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ChargeItem#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ChargeItem#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ChargeItem#overrideReason() overrideReason} to overrideReason.
     * @param overrideReason The value for overrideReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder overrideReason(String overrideReason) {
      checkNotIsSet(overrideReasonIsSet(), "overrideReason");
      this.overrideReason = Objects.requireNonNull(overrideReason, "overrideReason");
      optBits |= OPT_BIT_OVERRIDE_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#overrideReason() overrideReason} to overrideReason.
     * @param overrideReason The value for overrideReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("overrideReason")
    public final Builder overrideReason(Optional<String> overrideReason) {
      checkNotIsSet(overrideReasonIsSet(), "overrideReason");
      this.overrideReason = overrideReason.orElse(null);
      optBits |= OPT_BIT_OVERRIDE_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#contained() contained} to contained.
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
     * Initializes the optional value {@link ChargeItem#contained() contained} to contained.
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
     * Initializes the optional value {@link ChargeItem#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder productReference(Reference productReference) {
      checkNotIsSet(productReferenceIsSet(), "productReference");
      this.productReference = Objects.requireNonNull(productReference, "productReference");
      optBits |= OPT_BIT_PRODUCT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productReference")
    public final Builder productReference(Optional<? extends Reference> productReference) {
      checkNotIsSet(productReferenceIsSet(), "productReference");
      this.productReference = productReference.orElse(null);
      optBits |= OPT_BIT_PRODUCT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#extension() extension} to extension.
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
     * Initializes the optional value {@link ChargeItem#extension() extension} to extension.
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
     * Initializes the optional value {@link ChargeItem#costCenter() costCenter} to costCenter.
     * @param costCenter The value for costCenter
     * @return {@code this} builder for chained invocation
     */
    public final Builder costCenter(Reference costCenter) {
      checkNotIsSet(costCenterIsSet(), "costCenter");
      this.costCenter = Objects.requireNonNull(costCenter, "costCenter");
      optBits |= OPT_BIT_COST_CENTER;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#costCenter() costCenter} to costCenter.
     * @param costCenter The value for costCenter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("costCenter")
    public final Builder costCenter(Optional<? extends Reference> costCenter) {
      checkNotIsSet(costCenterIsSet(), "costCenter");
      this.costCenter = costCenter.orElse(null);
      optBits |= OPT_BIT_COST_CENTER;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(List<ChargeItem_Performer> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performer")
    public final Builder performer(Optional<? extends List<ChargeItem_Performer>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#performingOrganization() performingOrganization} to performingOrganization.
     * @param performingOrganization The value for performingOrganization
     * @return {@code this} builder for chained invocation
     */
    public final Builder performingOrganization(Reference performingOrganization) {
      checkNotIsSet(performingOrganizationIsSet(), "performingOrganization");
      this.performingOrganization = Objects.requireNonNull(performingOrganization, "performingOrganization");
      optBits |= OPT_BIT_PERFORMING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#performingOrganization() performingOrganization} to performingOrganization.
     * @param performingOrganization The value for performingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performingOrganization")
    public final Builder performingOrganization(Optional<? extends Reference> performingOrganization) {
      checkNotIsSet(performingOrganizationIsSet(), "performingOrganization");
      this.performingOrganization = performingOrganization.orElse(null);
      optBits |= OPT_BIT_PERFORMING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ChargeItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ChargeItem#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for chained invocation
     */
    public final Builder account(List<Reference> account) {
      checkNotIsSet(accountIsSet(), "account");
      this.account = Objects.requireNonNull(account, "account");
      optBits |= OPT_BIT_ACCOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("account")
    public final Builder account(Optional<? extends List<Reference>> account) {
      checkNotIsSet(accountIsSet(), "account");
      this.account = account.orElse(null);
      optBits |= OPT_BIT_ACCOUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeItem#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#enteredDate() enteredDate} to enteredDate.
     * @param enteredDate The value for enteredDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder enteredDate(DateTime enteredDate) {
      checkNotIsSet(enteredDateIsSet(), "enteredDate");
      this.enteredDate = Objects.requireNonNull(enteredDate, "enteredDate");
      optBits |= OPT_BIT_ENTERED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#enteredDate() enteredDate} to enteredDate.
     * @param enteredDate The value for enteredDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("enteredDate")
    public final Builder enteredDate(Optional<? extends DateTime> enteredDate) {
      checkNotIsSet(enteredDateIsSet(), "enteredDate");
      this.enteredDate = enteredDate.orElse(null);
      optBits |= OPT_BIT_ENTERED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#definitionCanonical() definitionCanonical} to definitionCanonical.
     * @param definitionCanonical The value for definitionCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder definitionCanonical(List<Canonical> definitionCanonical) {
      checkNotIsSet(definitionCanonicalIsSet(), "definitionCanonical");
      this.definitionCanonical = Objects.requireNonNull(definitionCanonical, "definitionCanonical");
      optBits |= OPT_BIT_DEFINITION_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#definitionCanonical() definitionCanonical} to definitionCanonical.
     * @param definitionCanonical The value for definitionCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definitionCanonical")
    public final Builder definitionCanonical(Optional<? extends List<Canonical>> definitionCanonical) {
      checkNotIsSet(definitionCanonicalIsSet(), "definitionCanonical");
      this.definitionCanonical = definitionCanonical.orElse(null);
      optBits |= OPT_BIT_DEFINITION_CANONICAL;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeItem#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      initBits &= ~INIT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link ChargeItem#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link ChargeItem#requestingOrganization() requestingOrganization} to requestingOrganization.
     * @param requestingOrganization The value for requestingOrganization
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestingOrganization(Reference requestingOrganization) {
      checkNotIsSet(requestingOrganizationIsSet(), "requestingOrganization");
      this.requestingOrganization = Objects.requireNonNull(requestingOrganization, "requestingOrganization");
      optBits |= OPT_BIT_REQUESTING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#requestingOrganization() requestingOrganization} to requestingOrganization.
     * @param requestingOrganization The value for requestingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requestingOrganization")
    public final Builder requestingOrganization(Optional<? extends Reference> requestingOrganization) {
      checkNotIsSet(requestingOrganizationIsSet(), "requestingOrganization");
      this.requestingOrganization = requestingOrganization.orElse(null);
      optBits |= OPT_BIT_REQUESTING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#priceOverride() priceOverride} to priceOverride.
     * @param priceOverride The value for priceOverride
     * @return {@code this} builder for chained invocation
     */
    public final Builder priceOverride(Money priceOverride) {
      checkNotIsSet(priceOverrideIsSet(), "priceOverride");
      this.priceOverride = Objects.requireNonNull(priceOverride, "priceOverride");
      optBits |= OPT_BIT_PRICE_OVERRIDE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#priceOverride() priceOverride} to priceOverride.
     * @param priceOverride The value for priceOverride
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priceOverride")
    public final Builder priceOverride(Optional<? extends Money> priceOverride) {
      checkNotIsSet(priceOverrideIsSet(), "priceOverride");
      this.priceOverride = priceOverride.orElse(null);
      optBits |= OPT_BIT_PRICE_OVERRIDE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(List<Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("note")
    public final Builder note(Optional<? extends List<Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeItem#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ChargeItem#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ChargeItem#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ChargeItem#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
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
     * Initializes the optional value {@link ChargeItem#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
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
     * Initializes the optional value {@link ChargeItem#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for chained invocation
     */
    public final Builder enterer(Reference enterer) {
      checkNotIsSet(entererIsSet(), "enterer");
      this.enterer = Objects.requireNonNull(enterer, "enterer");
      optBits |= OPT_BIT_ENTERER;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("enterer")
    public final Builder enterer(Optional<? extends Reference> enterer) {
      checkNotIsSet(entererIsSet(), "enterer");
      this.enterer = enterer.orElse(null);
      optBits |= OPT_BIT_ENTERER;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInformation(List<Reference> supportingInformation) {
      checkNotIsSet(supportingInformationIsSet(), "supportingInformation");
      this.supportingInformation = Objects.requireNonNull(supportingInformation, "supportingInformation");
      optBits |= OPT_BIT_SUPPORTING_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportingInformation")
    public final Builder supportingInformation(Optional<? extends List<Reference>> supportingInformation) {
      checkNotIsSet(supportingInformationIsSet(), "supportingInformation");
      this.supportingInformation = supportingInformation.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#meta() meta} to meta.
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
     * Initializes the optional value {@link ChargeItem#meta() meta} to meta.
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
     * Initializes the optional value {@link ChargeItem#id() id} to id.
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
     * Initializes the optional value {@link ChargeItem#id() id} to id.
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
     * Initializes the optional value {@link ChargeItem#text() text} to text.
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
     * Initializes the optional value {@link ChargeItem#text() text} to text.
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
     * Initializes the optional value {@link ChargeItem#language() language} to language.
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
     * Initializes the optional value {@link ChargeItem#language() language} to language.
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
     * Initializes the optional value {@link ChargeItem#definitionUri() definitionUri} to definitionUri.
     * @param definitionUri The value for definitionUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder definitionUri(List<Uri> definitionUri) {
      checkNotIsSet(definitionUriIsSet(), "definitionUri");
      this.definitionUri = Objects.requireNonNull(definitionUri, "definitionUri");
      optBits |= OPT_BIT_DEFINITION_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#definitionUri() definitionUri} to definitionUri.
     * @param definitionUri The value for definitionUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definitionUri")
    public final Builder definitionUri(Optional<? extends List<Uri>> definitionUri) {
      checkNotIsSet(definitionUriIsSet(), "definitionUri");
      this.definitionUri = definitionUri.orElse(null);
      optBits |= OPT_BIT_DEFINITION_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(ChargeitemStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends ChargeitemStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ChargeItem#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ChargeItem#service() service} to service.
     * @param service The value for service
     * @return {@code this} builder for chained invocation
     */
    public final Builder service(List<Reference> service) {
      checkNotIsSet(serviceIsSet(), "service");
      this.service = Objects.requireNonNull(service, "service");
      optBits |= OPT_BIT_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#service() service} to service.
     * @param service The value for service
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("service")
    public final Builder service(Optional<? extends List<Reference>> service) {
      checkNotIsSet(serviceIsSet(), "service");
      this.service = service.orElse(null);
      optBits |= OPT_BIT_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder productCodeableConcept(CodeableConcept productCodeableConcept) {
      checkNotIsSet(productCodeableConceptIsSet(), "productCodeableConcept");
      this.productCodeableConcept = Objects.requireNonNull(productCodeableConcept, "productCodeableConcept");
      optBits |= OPT_BIT_PRODUCT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productCodeableConcept")
    public final Builder productCodeableConcept(Optional<? extends CodeableConcept> productCodeableConcept) {
      checkNotIsSet(productCodeableConceptIsSet(), "productCodeableConcept");
      this.productCodeableConcept = productCodeableConcept.orElse(null);
      optBits |= OPT_BIT_PRODUCT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link ChargeItem#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link ChargeItem#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(List<CodeableConcept> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = Objects.requireNonNull(reason, "reason");
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reason")
    public final Builder reason(Optional<? extends List<CodeableConcept>> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = reason.orElse(null);
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    public final Builder context(Reference context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = Objects.requireNonNull(context, "context");
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("context")
    public final Builder context(Optional<? extends Reference> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = context.orElse(null);
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#bodysite() bodysite} to bodysite.
     * @param bodysite The value for bodysite
     * @return {@code this} builder for chained invocation
     */
    public final Builder bodysite(List<CodeableConcept> bodysite) {
      checkNotIsSet(bodysiteIsSet(), "bodysite");
      this.bodysite = Objects.requireNonNull(bodysite, "bodysite");
      optBits |= OPT_BIT_BODYSITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#bodysite() bodysite} to bodysite.
     * @param bodysite The value for bodysite
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("bodysite")
    public final Builder bodysite(Optional<? extends List<CodeableConcept>> bodysite) {
      checkNotIsSet(bodysiteIsSet(), "bodysite");
      this.bodysite = bodysite.orElse(null);
      optBits |= OPT_BIT_BODYSITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
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
     * Initializes the optional value {@link ChargeItem#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
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
     * Initializes the optional value {@link ChargeItem#factorOverride() factorOverride} to factorOverride.
     * @param factorOverride The value for factorOverride
     * @return {@code this} builder for chained invocation
     */
    public final Builder factorOverride(Decimal factorOverride) {
      checkNotIsSet(factorOverrideIsSet(), "factorOverride");
      this.factorOverride = Objects.requireNonNull(factorOverride, "factorOverride");
      optBits |= OPT_BIT_FACTOR_OVERRIDE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#factorOverride() factorOverride} to factorOverride.
     * @param factorOverride The value for factorOverride
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("factorOverride")
    public final Builder factorOverride(Optional<? extends Decimal> factorOverride) {
      checkNotIsSet(factorOverrideIsSet(), "factorOverride");
      this.factorOverride = factorOverride.orElse(null);
      optBits |= OPT_BIT_FACTOR_OVERRIDE;
      return this;
    }

    /**
     * Builds a new {@link ChargeItem ChargeItem}.
     * @return An immutable instance of ChargeItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ChargeItem build() {
      checkRequiredAttributes();
      return new ImmutableChargeItem(
          implicitRules,
          overrideReason,
          contained,
          productReference,
          extension,
          costCenter,
          performer,
          performingOrganization,
          modifierExtension,
          account,
          code,
          enteredDate,
          definitionCanonical,
          subject,
          partOf,
          requestingOrganization,
          priceOverride,
          note,
          resourceType,
          identifier,
          occurrencePeriod,
          enterer,
          supportingInformation,
          meta,
          id,
          text,
          language,
          definitionUri,
          status,
          quantity,
          service,
          productCodeableConcept,
          occurrenceDateTime,
          reason,
          context,
          bodysite,
          occurrenceTiming,
          factorOverride);
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean overrideReasonIsSet() {
      return (optBits & OPT_BIT_OVERRIDE_REASON) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean productReferenceIsSet() {
      return (optBits & OPT_BIT_PRODUCT_REFERENCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean costCenterIsSet() {
      return (optBits & OPT_BIT_COST_CENTER) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean performingOrganizationIsSet() {
      return (optBits & OPT_BIT_PERFORMING_ORGANIZATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean accountIsSet() {
      return (optBits & OPT_BIT_ACCOUNT) != 0;
    }

    private boolean enteredDateIsSet() {
      return (optBits & OPT_BIT_ENTERED_DATE) != 0;
    }

    private boolean definitionCanonicalIsSet() {
      return (optBits & OPT_BIT_DEFINITION_CANONICAL) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean requestingOrganizationIsSet() {
      return (optBits & OPT_BIT_REQUESTING_ORGANIZATION) != 0;
    }

    private boolean priceOverrideIsSet() {
      return (optBits & OPT_BIT_PRICE_OVERRIDE) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean occurrencePeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_PERIOD) != 0;
    }

    private boolean entererIsSet() {
      return (optBits & OPT_BIT_ENTERER) != 0;
    }

    private boolean supportingInformationIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFORMATION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean definitionUriIsSet() {
      return (optBits & OPT_BIT_DEFINITION_URI) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean serviceIsSet() {
      return (optBits & OPT_BIT_SERVICE) != 0;
    }

    private boolean productCodeableConceptIsSet() {
      return (optBits & OPT_BIT_PRODUCT_CODEABLE_CONCEPT) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean bodysiteIsSet() {
      return (optBits & OPT_BIT_BODYSITE) != 0;
    }

    private boolean occurrenceTimingIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_TIMING) != 0;
    }

    private boolean factorOverrideIsSet() {
      return (optBits & OPT_BIT_FACTOR_OVERRIDE) != 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ChargeItem is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!codeIsSet()) attributes.add("code");
      if (!subjectIsSet()) attributes.add("subject");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ChargeItem, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ChargeItem", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link ChargeItem#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    SubjectBuildStage code(CodeableConcept code);
  }

  @Generated(from = "ChargeItem", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link ChargeItem#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(Reference subject);
  }

  @Generated(from = "ChargeItem", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ChargeItem#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "ChargeItem", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ChargeItem#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ChargeItem#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ChargeItem#overrideReason() overrideReason} to overrideReason.
     * @param overrideReason The value for overrideReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal overrideReason(String overrideReason);

    /**
     * Initializes the optional value {@link ChargeItem#overrideReason() overrideReason} to overrideReason.
     * @param overrideReason The value for overrideReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal overrideReason(Optional<String> overrideReason);

    /**
     * Initializes the optional value {@link ChargeItem#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ChargeItem#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ChargeItem#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal productReference(Reference productReference);

    /**
     * Initializes the optional value {@link ChargeItem#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productReference(Optional<? extends Reference> productReference);

    /**
     * Initializes the optional value {@link ChargeItem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ChargeItem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ChargeItem#costCenter() costCenter} to costCenter.
     * @param costCenter The value for costCenter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal costCenter(Reference costCenter);

    /**
     * Initializes the optional value {@link ChargeItem#costCenter() costCenter} to costCenter.
     * @param costCenter The value for costCenter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal costCenter(Optional<? extends Reference> costCenter);

    /**
     * Initializes the optional value {@link ChargeItem#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(List<ChargeItem_Performer> performer);

    /**
     * Initializes the optional value {@link ChargeItem#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(Optional<? extends List<ChargeItem_Performer>> performer);

    /**
     * Initializes the optional value {@link ChargeItem#performingOrganization() performingOrganization} to performingOrganization.
     * @param performingOrganization The value for performingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performingOrganization(Reference performingOrganization);

    /**
     * Initializes the optional value {@link ChargeItem#performingOrganization() performingOrganization} to performingOrganization.
     * @param performingOrganization The value for performingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performingOrganization(Optional<? extends Reference> performingOrganization);

    /**
     * Initializes the optional value {@link ChargeItem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ChargeItem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ChargeItem#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for chained invocation
     */
    BuildFinal account(List<Reference> account);

    /**
     * Initializes the optional value {@link ChargeItem#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal account(Optional<? extends List<Reference>> account);

    /**
     * Initializes the optional value {@link ChargeItem#enteredDate() enteredDate} to enteredDate.
     * @param enteredDate The value for enteredDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal enteredDate(DateTime enteredDate);

    /**
     * Initializes the optional value {@link ChargeItem#enteredDate() enteredDate} to enteredDate.
     * @param enteredDate The value for enteredDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal enteredDate(Optional<? extends DateTime> enteredDate);

    /**
     * Initializes the optional value {@link ChargeItem#definitionCanonical() definitionCanonical} to definitionCanonical.
     * @param definitionCanonical The value for definitionCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal definitionCanonical(List<Canonical> definitionCanonical);

    /**
     * Initializes the optional value {@link ChargeItem#definitionCanonical() definitionCanonical} to definitionCanonical.
     * @param definitionCanonical The value for definitionCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal definitionCanonical(Optional<? extends List<Canonical>> definitionCanonical);

    /**
     * Initializes the optional value {@link ChargeItem#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(List<Reference> partOf);

    /**
     * Initializes the optional value {@link ChargeItem#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends List<Reference>> partOf);

    /**
     * Initializes the optional value {@link ChargeItem#requestingOrganization() requestingOrganization} to requestingOrganization.
     * @param requestingOrganization The value for requestingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requestingOrganization(Reference requestingOrganization);

    /**
     * Initializes the optional value {@link ChargeItem#requestingOrganization() requestingOrganization} to requestingOrganization.
     * @param requestingOrganization The value for requestingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requestingOrganization(Optional<? extends Reference> requestingOrganization);

    /**
     * Initializes the optional value {@link ChargeItem#priceOverride() priceOverride} to priceOverride.
     * @param priceOverride The value for priceOverride
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priceOverride(Money priceOverride);

    /**
     * Initializes the optional value {@link ChargeItem#priceOverride() priceOverride} to priceOverride.
     * @param priceOverride The value for priceOverride
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priceOverride(Optional<? extends Money> priceOverride);

    /**
     * Initializes the optional value {@link ChargeItem#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link ChargeItem#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link ChargeItem#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link ChargeItem#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link ChargeItem#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrencePeriod(Period occurrencePeriod);

    /**
     * Initializes the optional value {@link ChargeItem#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrencePeriod(Optional<? extends Period> occurrencePeriod);

    /**
     * Initializes the optional value {@link ChargeItem#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal enterer(Reference enterer);

    /**
     * Initializes the optional value {@link ChargeItem#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal enterer(Optional<? extends Reference> enterer);

    /**
     * Initializes the optional value {@link ChargeItem#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInformation(List<Reference> supportingInformation);

    /**
     * Initializes the optional value {@link ChargeItem#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInformation(Optional<? extends List<Reference>> supportingInformation);

    /**
     * Initializes the optional value {@link ChargeItem#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ChargeItem#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ChargeItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ChargeItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ChargeItem#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ChargeItem#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ChargeItem#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ChargeItem#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ChargeItem#definitionUri() definitionUri} to definitionUri.
     * @param definitionUri The value for definitionUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal definitionUri(List<Uri> definitionUri);

    /**
     * Initializes the optional value {@link ChargeItem#definitionUri() definitionUri} to definitionUri.
     * @param definitionUri The value for definitionUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal definitionUri(Optional<? extends List<Uri>> definitionUri);

    /**
     * Initializes the optional value {@link ChargeItem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(ChargeitemStatus status);

    /**
     * Initializes the optional value {@link ChargeItem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends ChargeitemStatus> status);

    /**
     * Initializes the optional value {@link ChargeItem#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(Quantity quantity);

    /**
     * Initializes the optional value {@link ChargeItem#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(Optional<? extends Quantity> quantity);

    /**
     * Initializes the optional value {@link ChargeItem#service() service} to service.
     * @param service The value for service
     * @return {@code this} builder for chained invocation
     */
    BuildFinal service(List<Reference> service);

    /**
     * Initializes the optional value {@link ChargeItem#service() service} to service.
     * @param service The value for service
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal service(Optional<? extends List<Reference>> service);

    /**
     * Initializes the optional value {@link ChargeItem#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal productCodeableConcept(CodeableConcept productCodeableConcept);

    /**
     * Initializes the optional value {@link ChargeItem#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productCodeableConcept(Optional<? extends CodeableConcept> productCodeableConcept);

    /**
     * Initializes the optional value {@link ChargeItem#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(String occurrenceDateTime);

    /**
     * Initializes the optional value {@link ChargeItem#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(Optional<String> occurrenceDateTime);

    /**
     * Initializes the optional value {@link ChargeItem#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reason(List<CodeableConcept> reason);

    /**
     * Initializes the optional value {@link ChargeItem#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reason(Optional<? extends List<CodeableConcept>> reason);

    /**
     * Initializes the optional value {@link ChargeItem#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    BuildFinal context(Reference context);

    /**
     * Initializes the optional value {@link ChargeItem#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal context(Optional<? extends Reference> context);

    /**
     * Initializes the optional value {@link ChargeItem#bodysite() bodysite} to bodysite.
     * @param bodysite The value for bodysite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodysite(List<CodeableConcept> bodysite);

    /**
     * Initializes the optional value {@link ChargeItem#bodysite() bodysite} to bodysite.
     * @param bodysite The value for bodysite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodysite(Optional<? extends List<CodeableConcept>> bodysite);

    /**
     * Initializes the optional value {@link ChargeItem#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceTiming(Timing occurrenceTiming);

    /**
     * Initializes the optional value {@link ChargeItem#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceTiming(Optional<? extends Timing> occurrenceTiming);

    /**
     * Initializes the optional value {@link ChargeItem#factorOverride() factorOverride} to factorOverride.
     * @param factorOverride The value for factorOverride
     * @return {@code this} builder for chained invocation
     */
    BuildFinal factorOverride(Decimal factorOverride);

    /**
     * Initializes the optional value {@link ChargeItem#factorOverride() factorOverride} to factorOverride.
     * @param factorOverride The value for factorOverride
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal factorOverride(Optional<? extends Decimal> factorOverride);

    /**
     * Builds a new {@link ChargeItem ChargeItem}.
     * @return An immutable instance of ChargeItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ChargeItem build();
  }
}