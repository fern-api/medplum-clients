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
 * Immutable implementation of {@link MedicinalProductPackaged}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductPackaged.builder()}.
 */
@Generated(from = "MedicinalProductPackaged", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductPackaged
    implements MedicinalProductPackaged {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference marketingAuthorization;
  private final List<MedicinalProductPackaged_PackageItem> packageItem;
  private final @Nullable List<Reference> manufacturer;
  private final @Nullable Narrative text;
  private final @Nullable Id id;
  private final @Nullable String description;
  private final @Nullable CodeableConcept legalStatusOfSupply;
  private final @Nullable Meta meta;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Reference> subject;
  private final String resourceType;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code language;
  private final @Nullable List<MedicinalProductPackaged_BatchIdentifier> batchIdentifier;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<MarketingStatus> marketingStatus;

  private ImmutableMedicinalProductPackaged(
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference marketingAuthorization,
      List<MedicinalProductPackaged_PackageItem> packageItem,
      @Nullable List<Reference> manufacturer,
      @Nullable Narrative text,
      @Nullable Id id,
      @Nullable String description,
      @Nullable CodeableConcept legalStatusOfSupply,
      @Nullable Meta meta,
      @Nullable Uri implicitRules,
      @Nullable List<Reference> subject,
      String resourceType,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> extension,
      @Nullable Code language,
      @Nullable List<MedicinalProductPackaged_BatchIdentifier> batchIdentifier,
      @Nullable List<Identifier> identifier,
      @Nullable List<MarketingStatus> marketingStatus) {
    this.modifierExtension = modifierExtension;
    this.marketingAuthorization = marketingAuthorization;
    this.packageItem = packageItem;
    this.manufacturer = manufacturer;
    this.text = text;
    this.id = id;
    this.description = description;
    this.legalStatusOfSupply = legalStatusOfSupply;
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.subject = subject;
    this.resourceType = resourceType;
    this.contained = contained;
    this.extension = extension;
    this.language = language;
    this.batchIdentifier = batchIdentifier;
    this.identifier = identifier;
    this.marketingStatus = marketingStatus;
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
   * @return The value of the {@code marketingAuthorization} attribute
   */
  @JsonProperty("marketingAuthorization")
  @Override
  public Optional<Reference> marketingAuthorization() {
    return Optional.ofNullable(marketingAuthorization);
  }

  /**
   * @return The value of the {@code packageItem} attribute
   */
  @JsonProperty("packageItem")
  @Override
  public List<MedicinalProductPackaged_PackageItem> packageItem() {
    return packageItem;
  }

  /**
   * @return The value of the {@code manufacturer} attribute
   */
  @JsonProperty("manufacturer")
  @Override
  public Optional<List<Reference>> manufacturer() {
    return Optional.ofNullable(manufacturer);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code legalStatusOfSupply} attribute
   */
  @JsonProperty("legalStatusOfSupply")
  @Override
  public Optional<CodeableConcept> legalStatusOfSupply() {
    return Optional.ofNullable(legalStatusOfSupply);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<List<Reference>> subject() {
    return Optional.ofNullable(subject);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code batchIdentifier} attribute
   */
  @JsonProperty("batchIdentifier")
  @Override
  public Optional<List<MedicinalProductPackaged_BatchIdentifier>> batchIdentifier() {
    return Optional.ofNullable(batchIdentifier);
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
   * @return The value of the {@code marketingStatus} attribute
   */
  @JsonProperty("marketingStatus")
  @Override
  public Optional<List<MarketingStatus>> marketingStatus() {
    return Optional.ofNullable(marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        newValue,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductPackaged(
        value,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#marketingAuthorization() marketingAuthorization} attribute.
   * @param value The value for marketingAuthorization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withMarketingAuthorization(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "marketingAuthorization");
    if (this.marketingAuthorization == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        newValue,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#marketingAuthorization() marketingAuthorization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for marketingAuthorization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withMarketingAuthorization(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.marketingAuthorization == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        value,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MedicinalProductPackaged#packageItem() packageItem}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withPackageItem(MedicinalProductPackaged_PackageItem... elements) {
    List<MedicinalProductPackaged_PackageItem> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        newValue,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MedicinalProductPackaged#packageItem() packageItem}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of packageItem elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withPackageItem(Iterable<? extends MedicinalProductPackaged_PackageItem> elements) {
    if (this.packageItem == elements) return this;
    List<MedicinalProductPackaged_PackageItem> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        newValue,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#manufacturer() manufacturer} attribute.
   * @param value The value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withManufacturer(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "manufacturer");
    if (this.manufacturer == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        newValue,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#manufacturer() manufacturer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withManufacturer(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.manufacturer == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        value,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        newValue,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        value,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        newValue,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        value,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        newValue,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        value,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#legalStatusOfSupply() legalStatusOfSupply} attribute.
   * @param value The value for legalStatusOfSupply
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withLegalStatusOfSupply(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "legalStatusOfSupply");
    if (this.legalStatusOfSupply == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        newValue,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#legalStatusOfSupply() legalStatusOfSupply} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for legalStatusOfSupply
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withLegalStatusOfSupply(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.legalStatusOfSupply == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        value,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        newValue,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        value,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        newValue,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        value,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withSubject(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        newValue,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withSubject(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        value,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductPackaged#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        newValue,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        newValue,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        value,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        newValue,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        value,
        this.language,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        newValue,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        value,
        this.batchIdentifier,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#batchIdentifier() batchIdentifier} attribute.
   * @param value The value for batchIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withBatchIdentifier(List<MedicinalProductPackaged_BatchIdentifier> value) {
    @Nullable List<MedicinalProductPackaged_BatchIdentifier> newValue = Objects.requireNonNull(value, "batchIdentifier");
    if (this.batchIdentifier == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        newValue,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#batchIdentifier() batchIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for batchIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withBatchIdentifier(Optional<? extends List<MedicinalProductPackaged_BatchIdentifier>> optional) {
    @Nullable List<MedicinalProductPackaged_BatchIdentifier> value = optional.orElse(null);
    if (this.batchIdentifier == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        value,
        this.identifier,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        newValue,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        value,
        this.marketingStatus);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#marketingStatus() marketingStatus} attribute.
   * @param value The value for marketingStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withMarketingStatus(List<MarketingStatus> value) {
    @Nullable List<MarketingStatus> newValue = Objects.requireNonNull(value, "marketingStatus");
    if (this.marketingStatus == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#marketingStatus() marketingStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for marketingStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withMarketingStatus(Optional<? extends List<MarketingStatus>> optional) {
    @Nullable List<MarketingStatus> value = optional.orElse(null);
    if (this.marketingStatus == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.modifierExtension,
        this.marketingAuthorization,
        this.packageItem,
        this.manufacturer,
        this.text,
        this.id,
        this.description,
        this.legalStatusOfSupply,
        this.meta,
        this.implicitRules,
        this.subject,
        this.resourceType,
        this.contained,
        this.extension,
        this.language,
        this.batchIdentifier,
        this.identifier,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductPackaged} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductPackaged
        && equalTo((ImmutableMedicinalProductPackaged) another);
  }

  private boolean equalTo(ImmutableMedicinalProductPackaged another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(marketingAuthorization, another.marketingAuthorization)
        && packageItem.equals(another.packageItem)
        && Objects.equals(manufacturer, another.manufacturer)
        && Objects.equals(text, another.text)
        && Objects.equals(id, another.id)
        && Objects.equals(description, another.description)
        && Objects.equals(legalStatusOfSupply, another.legalStatusOfSupply)
        && Objects.equals(meta, another.meta)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(subject, another.subject)
        && resourceType.equals(another.resourceType)
        && Objects.equals(contained, another.contained)
        && Objects.equals(extension, another.extension)
        && Objects.equals(language, another.language)
        && Objects.equals(batchIdentifier, another.batchIdentifier)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(marketingStatus, another.marketingStatus);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code marketingAuthorization}, {@code packageItem}, {@code manufacturer}, {@code text}, {@code id}, {@code description}, {@code legalStatusOfSupply}, {@code meta}, {@code implicitRules}, {@code subject}, {@code resourceType}, {@code contained}, {@code extension}, {@code language}, {@code batchIdentifier}, {@code identifier}, {@code marketingStatus}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(marketingAuthorization);
    h += (h << 5) + packageItem.hashCode();
    h += (h << 5) + Objects.hashCode(manufacturer);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(legalStatusOfSupply);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(batchIdentifier);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(marketingStatus);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductPackaged} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductPackaged{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (marketingAuthorization != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("marketingAuthorization=").append(marketingAuthorization);
    }
    if (builder.length() > 25) builder.append(", ");
    builder.append("packageItem=").append(packageItem);
    if (manufacturer != null) {
      builder.append(", ");
      builder.append("manufacturer=").append(manufacturer);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (legalStatusOfSupply != null) {
      builder.append(", ");
      builder.append("legalStatusOfSupply=").append(legalStatusOfSupply);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (batchIdentifier != null) {
      builder.append(", ");
      builder.append("batchIdentifier=").append(batchIdentifier);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (marketingStatus != null) {
      builder.append(", ");
      builder.append("marketingStatus=").append(marketingStatus);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProductPackaged", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductPackaged {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> marketingAuthorization = Optional.empty();
    boolean marketingAuthorizationIsSet;
    @Nullable List<MedicinalProductPackaged_PackageItem> packageItem = Collections.emptyList();
    @Nullable Optional<List<Reference>> manufacturer = Optional.empty();
    boolean manufacturerIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<CodeableConcept> legalStatusOfSupply = Optional.empty();
    boolean legalStatusOfSupplyIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Reference>> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<MedicinalProductPackaged_BatchIdentifier>> batchIdentifier = Optional.empty();
    boolean batchIdentifierIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<MarketingStatus>> marketingStatus = Optional.empty();
    boolean marketingStatusIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("marketingAuthorization")
    public void setMarketingAuthorization(Optional<Reference> marketingAuthorization) {
      this.marketingAuthorization = marketingAuthorization;
      this.marketingAuthorizationIsSet = true;
    }
    @JsonProperty("packageItem")
    public void setPackageItem(List<MedicinalProductPackaged_PackageItem> packageItem) {
      this.packageItem = packageItem;
    }
    @JsonProperty("manufacturer")
    public void setManufacturer(Optional<List<Reference>> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("legalStatusOfSupply")
    public void setLegalStatusOfSupply(Optional<CodeableConcept> legalStatusOfSupply) {
      this.legalStatusOfSupply = legalStatusOfSupply;
      this.legalStatusOfSupplyIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<List<Reference>> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("batchIdentifier")
    public void setBatchIdentifier(Optional<List<MedicinalProductPackaged_BatchIdentifier>> batchIdentifier) {
      this.batchIdentifier = batchIdentifier;
      this.batchIdentifierIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("marketingStatus")
    public void setMarketingStatus(Optional<List<MarketingStatus>> marketingStatus) {
      this.marketingStatus = marketingStatus;
      this.marketingStatusIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> marketingAuthorization() { throw new UnsupportedOperationException(); }
    @Override
    public List<MedicinalProductPackaged_PackageItem> packageItem() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> legalStatusOfSupply() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> subject() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicinalProductPackaged_BatchIdentifier>> batchIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MarketingStatus>> marketingStatus() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductPackaged fromJson(Json json) {
    ImmutableMedicinalProductPackaged.Builder builder = ((ImmutableMedicinalProductPackaged.Builder) ImmutableMedicinalProductPackaged.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.marketingAuthorizationIsSet) {
      builder.marketingAuthorization(json.marketingAuthorization);
    }
    if (json.packageItem != null) {
      builder.addAllPackageItem(json.packageItem);
    }
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.legalStatusOfSupplyIsSet) {
      builder.legalStatusOfSupply(json.legalStatusOfSupply);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.batchIdentifierIsSet) {
      builder.batchIdentifier(json.batchIdentifier);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.marketingStatusIsSet) {
      builder.marketingStatus(json.marketingStatus);
    }
    return (ImmutableMedicinalProductPackaged) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductPackaged} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductPackaged instance
   */
  public static MedicinalProductPackaged copyOf(MedicinalProductPackaged instance) {
    if (instance instanceof ImmutableMedicinalProductPackaged) {
      return (ImmutableMedicinalProductPackaged) instance;
    }
    return ((ImmutableMedicinalProductPackaged.Builder) ImmutableMedicinalProductPackaged.builder())
        .modifierExtension(instance.modifierExtension())
        .marketingAuthorization(instance.marketingAuthorization())
        .addAllPackageItem(instance.packageItem())
        .manufacturer(instance.manufacturer())
        .text(instance.text())
        .id(instance.id())
        .description(instance.description())
        .legalStatusOfSupply(instance.legalStatusOfSupply())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .subject(instance.subject())
        .resourceType(instance.resourceType())
        .contained(instance.contained())
        .extension(instance.extension())
        .language(instance.language())
        .batchIdentifier(instance.batchIdentifier())
        .identifier(instance.identifier())
        .marketingStatus(instance.marketingStatus())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductPackaged MedicinalProductPackaged}.
   * <pre>
   * ImmutableMedicinalProductPackaged.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPackaged#modifierExtension() modifierExtension}
   *    .marketingAuthorization(com.medplum.types.fhir.Reference) // optional {@link MedicinalProductPackaged#marketingAuthorization() marketingAuthorization}
   *    .addPackageItem|addAllPackageItem(com.medplum.types.fhir.MedicinalProductPackaged_PackageItem) // {@link MedicinalProductPackaged#packageItem() packageItem} elements
   *    .manufacturer(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProductPackaged#manufacturer() manufacturer}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link MedicinalProductPackaged#text() text}
   *    .id(com.medplum.types.fhir.Id) // optional {@link MedicinalProductPackaged#id() id}
   *    .description(String) // optional {@link MedicinalProductPackaged#description() description}
   *    .legalStatusOfSupply(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductPackaged#legalStatusOfSupply() legalStatusOfSupply}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link MedicinalProductPackaged#meta() meta}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link MedicinalProductPackaged#implicitRules() implicitRules}
   *    .subject(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProductPackaged#subject() subject}
   *    .resourceType(String) // required {@link MedicinalProductPackaged#resourceType() resourceType}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductPackaged#contained() contained}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPackaged#extension() extension}
   *    .language(com.medplum.types.fhir.Code) // optional {@link MedicinalProductPackaged#language() language}
   *    .batchIdentifier(List&amp;lt;com.medplum.types.fhir.MedicinalProductPackaged_BatchIdentifier&amp;gt;) // optional {@link MedicinalProductPackaged#batchIdentifier() batchIdentifier}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link MedicinalProductPackaged#identifier() identifier}
   *    .marketingStatus(List&amp;lt;com.medplum.types.fhir.MarketingStatus&amp;gt;) // optional {@link MedicinalProductPackaged#marketingStatus() marketingStatus}
   *    .build();
   * </pre>
   * @return A new MedicinalProductPackaged builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedicinalProductPackaged.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductPackaged MedicinalProductPackaged}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductPackaged", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_MARKETING_AUTHORIZATION = 0x2L;
    private static final long OPT_BIT_MANUFACTURER = 0x4L;
    private static final long OPT_BIT_TEXT = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_DESCRIPTION = 0x20L;
    private static final long OPT_BIT_LEGAL_STATUS_OF_SUPPLY = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100L;
    private static final long OPT_BIT_SUBJECT = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_LANGUAGE = 0x1000L;
    private static final long OPT_BIT_BATCH_IDENTIFIER = 0x2000L;
    private static final long OPT_BIT_IDENTIFIER = 0x4000L;
    private static final long OPT_BIT_MARKETING_STATUS = 0x8000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference marketingAuthorization;
    private final List<MedicinalProductPackaged_PackageItem> packageItem = new ArrayList<MedicinalProductPackaged_PackageItem>();
    private @Nullable List<Reference> manufacturer;
    private @Nullable Narrative text;
    private @Nullable Id id;
    private @Nullable String description;
    private @Nullable CodeableConcept legalStatusOfSupply;
    private @Nullable Meta meta;
    private @Nullable Uri implicitRules;
    private @Nullable List<Reference> subject;
    private @Nullable String resourceType;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> extension;
    private @Nullable Code language;
    private @Nullable List<MedicinalProductPackaged_BatchIdentifier> batchIdentifier;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<MarketingStatus> marketingStatus;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductPackaged#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductPackaged#marketingAuthorization() marketingAuthorization} to marketingAuthorization.
     * @param marketingAuthorization The value for marketingAuthorization
     * @return {@code this} builder for chained invocation
     */
    public final Builder marketingAuthorization(Reference marketingAuthorization) {
      checkNotIsSet(marketingAuthorizationIsSet(), "marketingAuthorization");
      this.marketingAuthorization = Objects.requireNonNull(marketingAuthorization, "marketingAuthorization");
      optBits |= OPT_BIT_MARKETING_AUTHORIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#marketingAuthorization() marketingAuthorization} to marketingAuthorization.
     * @param marketingAuthorization The value for marketingAuthorization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("marketingAuthorization")
    public final Builder marketingAuthorization(Optional<? extends Reference> marketingAuthorization) {
      checkNotIsSet(marketingAuthorizationIsSet(), "marketingAuthorization");
      this.marketingAuthorization = marketingAuthorization.orElse(null);
      optBits |= OPT_BIT_MARKETING_AUTHORIZATION;
      return this;
    }

    /**
     * Adds one element to {@link MedicinalProductPackaged#packageItem() packageItem} list.
     * @param element A packageItem element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPackageItem(MedicinalProductPackaged_PackageItem element) {
      this.packageItem.add(Objects.requireNonNull(element, "packageItem element"));
      return this;
    }

    /**
     * Adds elements to {@link MedicinalProductPackaged#packageItem() packageItem} list.
     * @param elements An array of packageItem elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPackageItem(MedicinalProductPackaged_PackageItem... elements) {
      for (MedicinalProductPackaged_PackageItem element : elements) {
        this.packageItem.add(Objects.requireNonNull(element, "packageItem element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link MedicinalProductPackaged#packageItem() packageItem} list.
     * @param elements An iterable of packageItem elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPackageItem(Iterable<? extends MedicinalProductPackaged_PackageItem> elements) {
      for (MedicinalProductPackaged_PackageItem element : elements) {
        this.packageItem.add(Objects.requireNonNull(element, "packageItem element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturer(List<Reference> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = Objects.requireNonNull(manufacturer, "manufacturer");
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manufacturer")
    public final Builder manufacturer(Optional<? extends List<Reference>> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = manufacturer.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductPackaged#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductPackaged#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductPackaged#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductPackaged#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for chained invocation
     */
    public final Builder legalStatusOfSupply(CodeableConcept legalStatusOfSupply) {
      checkNotIsSet(legalStatusOfSupplyIsSet(), "legalStatusOfSupply");
      this.legalStatusOfSupply = Objects.requireNonNull(legalStatusOfSupply, "legalStatusOfSupply");
      optBits |= OPT_BIT_LEGAL_STATUS_OF_SUPPLY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("legalStatusOfSupply")
    public final Builder legalStatusOfSupply(Optional<? extends CodeableConcept> legalStatusOfSupply) {
      checkNotIsSet(legalStatusOfSupplyIsSet(), "legalStatusOfSupply");
      this.legalStatusOfSupply = legalStatusOfSupply.orElse(null);
      optBits |= OPT_BIT_LEGAL_STATUS_OF_SUPPLY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductPackaged#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductPackaged#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductPackaged#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductPackaged#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(List<Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Optional<? extends List<Reference>> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProductPackaged#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicinalProductPackaged#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductPackaged#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductPackaged#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductPackaged#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductPackaged#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductPackaged#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductPackaged#batchIdentifier() batchIdentifier} to batchIdentifier.
     * @param batchIdentifier The value for batchIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder batchIdentifier(List<MedicinalProductPackaged_BatchIdentifier> batchIdentifier) {
      checkNotIsSet(batchIdentifierIsSet(), "batchIdentifier");
      this.batchIdentifier = Objects.requireNonNull(batchIdentifier, "batchIdentifier");
      optBits |= OPT_BIT_BATCH_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#batchIdentifier() batchIdentifier} to batchIdentifier.
     * @param batchIdentifier The value for batchIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("batchIdentifier")
    public final Builder batchIdentifier(Optional<? extends List<MedicinalProductPackaged_BatchIdentifier>> batchIdentifier) {
      checkNotIsSet(batchIdentifierIsSet(), "batchIdentifier");
      this.batchIdentifier = batchIdentifier.orElse(null);
      optBits |= OPT_BIT_BATCH_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicinalProductPackaged#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicinalProductPackaged#marketingStatus() marketingStatus} to marketingStatus.
     * @param marketingStatus The value for marketingStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder marketingStatus(List<MarketingStatus> marketingStatus) {
      checkNotIsSet(marketingStatusIsSet(), "marketingStatus");
      this.marketingStatus = Objects.requireNonNull(marketingStatus, "marketingStatus");
      optBits |= OPT_BIT_MARKETING_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#marketingStatus() marketingStatus} to marketingStatus.
     * @param marketingStatus The value for marketingStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("marketingStatus")
    public final Builder marketingStatus(Optional<? extends List<MarketingStatus>> marketingStatus) {
      checkNotIsSet(marketingStatusIsSet(), "marketingStatus");
      this.marketingStatus = marketingStatus.orElse(null);
      optBits |= OPT_BIT_MARKETING_STATUS;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProductPackaged MedicinalProductPackaged}.
     * @return An immutable instance of MedicinalProductPackaged
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductPackaged build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductPackaged(
          modifierExtension,
          marketingAuthorization,
          createUnmodifiableList(true, packageItem),
          manufacturer,
          text,
          id,
          description,
          legalStatusOfSupply,
          meta,
          implicitRules,
          subject,
          resourceType,
          contained,
          extension,
          language,
          batchIdentifier,
          identifier,
          marketingStatus);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean marketingAuthorizationIsSet() {
      return (optBits & OPT_BIT_MARKETING_AUTHORIZATION) != 0;
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean legalStatusOfSupplyIsSet() {
      return (optBits & OPT_BIT_LEGAL_STATUS_OF_SUPPLY) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean batchIdentifierIsSet() {
      return (optBits & OPT_BIT_BATCH_IDENTIFIER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean marketingStatusIsSet() {
      return (optBits & OPT_BIT_MARKETING_STATUS) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductPackaged is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProductPackaged, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductPackaged", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductPackaged#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MedicinalProductPackaged", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#marketingAuthorization() marketingAuthorization} to marketingAuthorization.
     * @param marketingAuthorization The value for marketingAuthorization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal marketingAuthorization(Reference marketingAuthorization);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#marketingAuthorization() marketingAuthorization} to marketingAuthorization.
     * @param marketingAuthorization The value for marketingAuthorization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal marketingAuthorization(Optional<? extends Reference> marketingAuthorization);

    /**
     * Adds one element to {@link MedicinalProductPackaged#packageItem() packageItem} list.
     * @param element A packageItem element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addPackageItem(MedicinalProductPackaged_PackageItem element);

    /**
     * Adds elements to {@link MedicinalProductPackaged#packageItem() packageItem} list.
     * @param elements An array of packageItem elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addPackageItem(MedicinalProductPackaged_PackageItem... elements);

    /**
     * Adds elements to {@link MedicinalProductPackaged#packageItem() packageItem} list.
     * @param elements An iterable of packageItem elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllPackageItem(Iterable<? extends MedicinalProductPackaged_PackageItem> elements);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturer(List<Reference> manufacturer);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturer(Optional<? extends List<Reference>> manufacturer);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for chained invocation
     */
    BuildFinal legalStatusOfSupply(CodeableConcept legalStatusOfSupply);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal legalStatusOfSupply(Optional<? extends CodeableConcept> legalStatusOfSupply);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(List<Reference> subject);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends List<Reference>> subject);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#batchIdentifier() batchIdentifier} to batchIdentifier.
     * @param batchIdentifier The value for batchIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal batchIdentifier(List<MedicinalProductPackaged_BatchIdentifier> batchIdentifier);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#batchIdentifier() batchIdentifier} to batchIdentifier.
     * @param batchIdentifier The value for batchIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal batchIdentifier(Optional<? extends List<MedicinalProductPackaged_BatchIdentifier>> batchIdentifier);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#marketingStatus() marketingStatus} to marketingStatus.
     * @param marketingStatus The value for marketingStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal marketingStatus(List<MarketingStatus> marketingStatus);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#marketingStatus() marketingStatus} to marketingStatus.
     * @param marketingStatus The value for marketingStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal marketingStatus(Optional<? extends List<MarketingStatus>> marketingStatus);

    /**
     * Builds a new {@link MedicinalProductPackaged MedicinalProductPackaged}.
     * @return An immutable instance of MedicinalProductPackaged
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductPackaged build();
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
