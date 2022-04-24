//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicinalProductPackaged}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductPackaged.builder()}.
 */
@org.immutables.value.Generated(from = "MedicinalProductPackaged", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductPackaged implements com.fhir.MedicinalProductPackaged {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> manufacturer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductPackaged_BatchIdentifier> batchIdentifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final java.util.List<com.fhir.MedicinalProductPackaged_PackageItem> packageItem;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Reference marketingAuthorization;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MarketingStatus> marketingStatus;
  private final @javax.annotation.Nullable java.lang.String description;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept legalStatusOfSupply;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject;
  private final @javax.annotation.Nullable com.fhir.Meta meta;

  private ImmutableMedicinalProductPackaged(
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> manufacturer,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductPackaged_BatchIdentifier> batchIdentifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      java.util.List<com.fhir.MedicinalProductPackaged_PackageItem> packageItem,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Reference marketingAuthorization,
      @javax.annotation.Nullable java.util.List<com.fhir.MarketingStatus> marketingStatus,
      @javax.annotation.Nullable java.lang.String description,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CodeableConcept legalStatusOfSupply,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject,
      @javax.annotation.Nullable com.fhir.Meta meta) {
    this.manufacturer = manufacturer;
    this.batchIdentifier = batchIdentifier;
    this.extension = extension;
    this.packageItem = packageItem;
    this.id = id;
    this.marketingAuthorization = marketingAuthorization;
    this.marketingStatus = marketingStatus;
    this.description = description;
    this.resourceType = resourceType;
    this.language = language;
    this.identifier = identifier;
    this.text = text;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.legalStatusOfSupply = legalStatusOfSupply;
    this.implicitRules = implicitRules;
    this.subject = subject;
    this.meta = meta;
  }

  /**
   * @return The value of the {@code manufacturer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> manufacturer() {
    return java.util.Optional.ofNullable(manufacturer);
  }

  /**
   * @return The value of the {@code batchIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("batchIdentifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicinalProductPackaged_BatchIdentifier>> batchIdentifier() {
    return java.util.Optional.ofNullable(batchIdentifier);
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
   * @return The value of the {@code packageItem} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("packageItem")
  @Override
  public java.util.List<com.fhir.MedicinalProductPackaged_PackageItem> packageItem() {
    return packageItem;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code marketingAuthorization} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("marketingAuthorization")
  @Override
  public java.util.Optional<com.fhir.Reference> marketingAuthorization() {
    return java.util.Optional.ofNullable(marketingAuthorization);
  }

  /**
   * @return The value of the {@code marketingStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("marketingStatus")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MarketingStatus>> marketingStatus() {
    return java.util.Optional.ofNullable(marketingStatus);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * @return The value of the {@code legalStatusOfSupply} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("legalStatusOfSupply")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> legalStatusOfSupply() {
    return java.util.Optional.ofNullable(legalStatusOfSupply);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> subject() {
    return java.util.Optional.ofNullable(subject);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#manufacturer() manufacturer} attribute.
   * @param value The value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withManufacturer(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "manufacturer");
    if (this.manufacturer == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        newValue,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#manufacturer() manufacturer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withManufacturer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.manufacturer == value) return this;
    return new ImmutableMedicinalProductPackaged(
        value,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#batchIdentifier() batchIdentifier} attribute.
   * @param value The value for batchIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withBatchIdentifier(java.util.List<com.fhir.MedicinalProductPackaged_BatchIdentifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductPackaged_BatchIdentifier> newValue = java.util.Objects.requireNonNull(value, "batchIdentifier");
    if (this.batchIdentifier == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        newValue,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#batchIdentifier() batchIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for batchIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withBatchIdentifier(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductPackaged_BatchIdentifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductPackaged_BatchIdentifier> value = optional.orElse(null);
    if (this.batchIdentifier == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        value,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        newValue,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        value,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MedicinalProductPackaged#packageItem() packageItem}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withPackageItem(com.fhir.MedicinalProductPackaged_PackageItem... elements) {
    java.util.List<com.fhir.MedicinalProductPackaged_PackageItem> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        newValue,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MedicinalProductPackaged#packageItem() packageItem}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of packageItem elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withPackageItem(Iterable<? extends com.fhir.MedicinalProductPackaged_PackageItem> elements) {
    if (this.packageItem == elements) return this;
    java.util.List<com.fhir.MedicinalProductPackaged_PackageItem> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        newValue,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        newValue,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        value,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#marketingAuthorization() marketingAuthorization} attribute.
   * @param value The value for marketingAuthorization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withMarketingAuthorization(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "marketingAuthorization");
    if (this.marketingAuthorization == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        newValue,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#marketingAuthorization() marketingAuthorization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for marketingAuthorization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withMarketingAuthorization(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.marketingAuthorization == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        value,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#marketingStatus() marketingStatus} attribute.
   * @param value The value for marketingStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withMarketingStatus(java.util.List<com.fhir.MarketingStatus> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MarketingStatus> newValue = java.util.Objects.requireNonNull(value, "marketingStatus");
    if (this.marketingStatus == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        newValue,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#marketingStatus() marketingStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for marketingStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withMarketingStatus(java.util.Optional<? extends java.util.List<com.fhir.MarketingStatus>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MarketingStatus> value = optional.orElse(null);
    if (this.marketingStatus == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        value,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        newValue,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        value,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductPackaged#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        newValue,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        newValue,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        value,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        newValue,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        value,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        newValue,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        value,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        newValue,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        value,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        newValue,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        value,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#legalStatusOfSupply() legalStatusOfSupply} attribute.
   * @param value The value for legalStatusOfSupply
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withLegalStatusOfSupply(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "legalStatusOfSupply");
    if (this.legalStatusOfSupply == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        newValue,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#legalStatusOfSupply() legalStatusOfSupply} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for legalStatusOfSupply
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withLegalStatusOfSupply(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.legalStatusOfSupply == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        value,
        this.implicitRules,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        newValue,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        value,
        this.subject,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withSubject(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        newValue,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withSubject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        value,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPackaged#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPackaged withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPackaged#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPackaged withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductPackaged(
        this.manufacturer,
        this.batchIdentifier,
        this.extension,
        this.packageItem,
        this.id,
        this.marketingAuthorization,
        this.marketingStatus,
        this.description,
        this.resourceType,
        this.language,
        this.identifier,
        this.text,
        this.contained,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.implicitRules,
        this.subject,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductPackaged} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductPackaged
        && equalTo((ImmutableMedicinalProductPackaged) another);
  }

  private boolean equalTo(ImmutableMedicinalProductPackaged another) {
    return java.util.Objects.equals(manufacturer, another.manufacturer)
        && java.util.Objects.equals(batchIdentifier, another.batchIdentifier)
        && java.util.Objects.equals(extension, another.extension)
        && packageItem.equals(another.packageItem)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(marketingAuthorization, another.marketingAuthorization)
        && java.util.Objects.equals(marketingStatus, another.marketingStatus)
        && java.util.Objects.equals(description, another.description)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(legalStatusOfSupply, another.legalStatusOfSupply)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(meta, another.meta);
  }

  /**
   * Computes a hash code from attributes: {@code manufacturer}, {@code batchIdentifier}, {@code extension}, {@code packageItem}, {@code id}, {@code marketingAuthorization}, {@code marketingStatus}, {@code description}, {@code resourceType}, {@code language}, {@code identifier}, {@code text}, {@code contained}, {@code modifierExtension}, {@code legalStatusOfSupply}, {@code implicitRules}, {@code subject}, {@code meta}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(manufacturer);
    h += (h << 5) + java.util.Objects.hashCode(batchIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + packageItem.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(marketingAuthorization);
    h += (h << 5) + java.util.Objects.hashCode(marketingStatus);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(legalStatusOfSupply);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductPackaged} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicinalProductPackaged{");
    if (manufacturer != null) {
      builder.append("manufacturer=").append(manufacturer);
    }
    if (batchIdentifier != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("batchIdentifier=").append(batchIdentifier);
    }
    if (extension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 25) builder.append(", ");
    builder.append("packageItem=").append(packageItem);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (marketingAuthorization != null) {
      builder.append(", ");
      builder.append("marketingAuthorization=").append(marketingAuthorization);
    }
    if (marketingStatus != null) {
      builder.append(", ");
      builder.append("marketingStatus=").append(marketingStatus);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (legalStatusOfSupply != null) {
      builder.append(", ");
      builder.append("legalStatusOfSupply=").append(legalStatusOfSupply);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MedicinalProductPackaged", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicinalProductPackaged {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> manufacturer = java.util.Optional.empty();
    boolean manufacturerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicinalProductPackaged_BatchIdentifier>> batchIdentifier = java.util.Optional.empty();
    boolean batchIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductPackaged_PackageItem> packageItem = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> marketingAuthorization = java.util.Optional.empty();
    boolean marketingAuthorizationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MarketingStatus>> marketingStatus = java.util.Optional.empty();
    boolean marketingStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> legalStatusOfSupply = java.util.Optional.empty();
    boolean legalStatusOfSupplyIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
    public void setManufacturer(java.util.Optional<java.util.List<com.fhir.Reference>> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("batchIdentifier")
    public void setBatchIdentifier(java.util.Optional<java.util.List<com.fhir.MedicinalProductPackaged_BatchIdentifier>> batchIdentifier) {
      this.batchIdentifier = batchIdentifier;
      this.batchIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("packageItem")
    public void setPackageItem(java.util.List<com.fhir.MedicinalProductPackaged_PackageItem> packageItem) {
      this.packageItem = packageItem;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("marketingAuthorization")
    public void setMarketingAuthorization(java.util.Optional<com.fhir.Reference> marketingAuthorization) {
      this.marketingAuthorization = marketingAuthorization;
      this.marketingAuthorizationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("marketingStatus")
    public void setMarketingStatus(java.util.Optional<java.util.List<com.fhir.MarketingStatus>> marketingStatus) {
      this.marketingStatus = marketingStatus;
      this.marketingStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("legalStatusOfSupply")
    public void setLegalStatusOfSupply(java.util.Optional<com.fhir.CodeableConcept> legalStatusOfSupply) {
      this.legalStatusOfSupply = legalStatusOfSupply;
      this.legalStatusOfSupplyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<java.util.List<com.fhir.Reference>> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicinalProductPackaged_BatchIdentifier>> batchIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.MedicinalProductPackaged_PackageItem> packageItem() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> marketingAuthorization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MarketingStatus>> marketingStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> legalStatusOfSupply() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductPackaged fromJson(Json json) {
    ImmutableMedicinalProductPackaged.Builder builder = ((ImmutableMedicinalProductPackaged.Builder) ImmutableMedicinalProductPackaged.builder());
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.batchIdentifierIsSet) {
      builder.batchIdentifier(json.batchIdentifier);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.packageItem != null) {
      builder.addAllPackageItem(json.packageItem);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.marketingAuthorizationIsSet) {
      builder.marketingAuthorization(json.marketingAuthorization);
    }
    if (json.marketingStatusIsSet) {
      builder.marketingStatus(json.marketingStatus);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.legalStatusOfSupplyIsSet) {
      builder.legalStatusOfSupply(json.legalStatusOfSupply);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
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
        .manufacturer(instance.manufacturer())
        .batchIdentifier(instance.batchIdentifier())
        .extension(instance.extension())
        .addAllPackageItem(instance.packageItem())
        .id(instance.id())
        .marketingAuthorization(instance.marketingAuthorization())
        .marketingStatus(instance.marketingStatus())
        .description(instance.description())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .identifier(instance.identifier())
        .text(instance.text())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .legalStatusOfSupply(instance.legalStatusOfSupply())
        .implicitRules(instance.implicitRules())
        .subject(instance.subject())
        .meta(instance.meta())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductPackaged MedicinalProductPackaged}.
   * <pre>
   * ImmutableMedicinalProductPackaged.builder()
   *    .manufacturer(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProductPackaged#manufacturer() manufacturer}
   *    .batchIdentifier(List&amp;lt;com.fhir.MedicinalProductPackaged_BatchIdentifier&amp;gt;) // optional {@link MedicinalProductPackaged#batchIdentifier() batchIdentifier}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPackaged#extension() extension}
   *    .addPackageItem|addAllPackageItem(com.fhir.MedicinalProductPackaged_PackageItem) // {@link MedicinalProductPackaged#packageItem() packageItem} elements
   *    .id(com.fhir.id) // optional {@link MedicinalProductPackaged#id() id}
   *    .marketingAuthorization(com.fhir.Reference) // optional {@link MedicinalProductPackaged#marketingAuthorization() marketingAuthorization}
   *    .marketingStatus(List&amp;lt;com.fhir.MarketingStatus&amp;gt;) // optional {@link MedicinalProductPackaged#marketingStatus() marketingStatus}
   *    .description(String) // optional {@link MedicinalProductPackaged#description() description}
   *    .resourceType(String) // required {@link MedicinalProductPackaged#resourceType() resourceType}
   *    .language(com.fhir.code) // optional {@link MedicinalProductPackaged#language() language}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link MedicinalProductPackaged#identifier() identifier}
   *    .text(com.fhir.Narrative) // optional {@link MedicinalProductPackaged#text() text}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductPackaged#contained() contained}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPackaged#modifierExtension() modifierExtension}
   *    .legalStatusOfSupply(com.fhir.CodeableConcept) // optional {@link MedicinalProductPackaged#legalStatusOfSupply() legalStatusOfSupply}
   *    .implicitRules(com.fhir.uri) // optional {@link MedicinalProductPackaged#implicitRules() implicitRules}
   *    .subject(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProductPackaged#subject() subject}
   *    .meta(com.fhir.Meta) // optional {@link MedicinalProductPackaged#meta() meta}
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
  @org.immutables.value.Generated(from = "MedicinalProductPackaged", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MANUFACTURER = 0x1L;
    private static final long OPT_BIT_BATCH_IDENTIFIER = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_MARKETING_AUTHORIZATION = 0x10L;
    private static final long OPT_BIT_MARKETING_STATUS = 0x20L;
    private static final long OPT_BIT_DESCRIPTION = 0x40L;
    private static final long OPT_BIT_LANGUAGE = 0x80L;
    private static final long OPT_BIT_IDENTIFIER = 0x100L;
    private static final long OPT_BIT_TEXT = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800L;
    private static final long OPT_BIT_LEGAL_STATUS_OF_SUPPLY = 0x1000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2000L;
    private static final long OPT_BIT_SUBJECT = 0x4000L;
    private static final long OPT_BIT_META = 0x8000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> manufacturer;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductPackaged_BatchIdentifier> batchIdentifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private final java.util.List<com.fhir.MedicinalProductPackaged_PackageItem> packageItem = new java.util.ArrayList<com.fhir.MedicinalProductPackaged_PackageItem>();
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Reference marketingAuthorization;
    private @javax.annotation.Nullable java.util.List<com.fhir.MarketingStatus> marketingStatus;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept legalStatusOfSupply;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject;
    private @javax.annotation.Nullable com.fhir.Meta meta;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturer(java.util.List<com.fhir.Reference> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = java.util.Objects.requireNonNull(manufacturer, "manufacturer");
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
    public final Builder manufacturer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = manufacturer.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#batchIdentifier() batchIdentifier} to batchIdentifier.
     * @param batchIdentifier The value for batchIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder batchIdentifier(java.util.List<com.fhir.MedicinalProductPackaged_BatchIdentifier> batchIdentifier) {
      checkNotIsSet(batchIdentifierIsSet(), "batchIdentifier");
      this.batchIdentifier = java.util.Objects.requireNonNull(batchIdentifier, "batchIdentifier");
      optBits |= OPT_BIT_BATCH_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#batchIdentifier() batchIdentifier} to batchIdentifier.
     * @param batchIdentifier The value for batchIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("batchIdentifier")
    public final Builder batchIdentifier(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductPackaged_BatchIdentifier>> batchIdentifier) {
      checkNotIsSet(batchIdentifierIsSet(), "batchIdentifier");
      this.batchIdentifier = batchIdentifier.orElse(null);
      optBits |= OPT_BIT_BATCH_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductPackaged#extension() extension} to extension.
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
     * Adds one element to {@link MedicinalProductPackaged#packageItem() packageItem} list.
     * @param element A packageItem element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPackageItem(com.fhir.MedicinalProductPackaged_PackageItem element) {
      this.packageItem.add(java.util.Objects.requireNonNull(element, "packageItem element"));
      return this;
    }

    /**
     * Adds elements to {@link MedicinalProductPackaged#packageItem() packageItem} list.
     * @param elements An array of packageItem elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPackageItem(com.fhir.MedicinalProductPackaged_PackageItem... elements) {
      for (com.fhir.MedicinalProductPackaged_PackageItem element : elements) {
        this.packageItem.add(java.util.Objects.requireNonNull(element, "packageItem element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link MedicinalProductPackaged#packageItem() packageItem} list.
     * @param elements An iterable of packageItem elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPackageItem(Iterable<? extends com.fhir.MedicinalProductPackaged_PackageItem> elements) {
      for (com.fhir.MedicinalProductPackaged_PackageItem element : elements) {
        this.packageItem.add(java.util.Objects.requireNonNull(element, "packageItem element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#marketingAuthorization() marketingAuthorization} to marketingAuthorization.
     * @param marketingAuthorization The value for marketingAuthorization
     * @return {@code this} builder for chained invocation
     */
    public final Builder marketingAuthorization(com.fhir.Reference marketingAuthorization) {
      checkNotIsSet(marketingAuthorizationIsSet(), "marketingAuthorization");
      this.marketingAuthorization = java.util.Objects.requireNonNull(marketingAuthorization, "marketingAuthorization");
      optBits |= OPT_BIT_MARKETING_AUTHORIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#marketingAuthorization() marketingAuthorization} to marketingAuthorization.
     * @param marketingAuthorization The value for marketingAuthorization
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("marketingAuthorization")
    public final Builder marketingAuthorization(java.util.Optional<? extends com.fhir.Reference> marketingAuthorization) {
      checkNotIsSet(marketingAuthorizationIsSet(), "marketingAuthorization");
      this.marketingAuthorization = marketingAuthorization.orElse(null);
      optBits |= OPT_BIT_MARKETING_AUTHORIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#marketingStatus() marketingStatus} to marketingStatus.
     * @param marketingStatus The value for marketingStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder marketingStatus(java.util.List<com.fhir.MarketingStatus> marketingStatus) {
      checkNotIsSet(marketingStatusIsSet(), "marketingStatus");
      this.marketingStatus = java.util.Objects.requireNonNull(marketingStatus, "marketingStatus");
      optBits |= OPT_BIT_MARKETING_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#marketingStatus() marketingStatus} to marketingStatus.
     * @param marketingStatus The value for marketingStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("marketingStatus")
    public final Builder marketingStatus(java.util.Optional<? extends java.util.List<com.fhir.MarketingStatus>> marketingStatus) {
      checkNotIsSet(marketingStatusIsSet(), "marketingStatus");
      this.marketingStatus = marketingStatus.orElse(null);
      optBits |= OPT_BIT_MARKETING_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProductPackaged#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(java.util.List<com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(com.fhir.Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public final Builder text(java.util.Optional<? extends com.fhir.Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(java.util.List<com.fhir.ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = java.util.Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public final Builder contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductPackaged#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductPackaged#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for chained invocation
     */
    public final Builder legalStatusOfSupply(com.fhir.CodeableConcept legalStatusOfSupply) {
      checkNotIsSet(legalStatusOfSupplyIsSet(), "legalStatusOfSupply");
      this.legalStatusOfSupply = java.util.Objects.requireNonNull(legalStatusOfSupply, "legalStatusOfSupply");
      optBits |= OPT_BIT_LEGAL_STATUS_OF_SUPPLY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("legalStatusOfSupply")
    public final Builder legalStatusOfSupply(java.util.Optional<? extends com.fhir.CodeableConcept> legalStatusOfSupply) {
      checkNotIsSet(legalStatusOfSupplyIsSet(), "legalStatusOfSupply");
      this.legalStatusOfSupply = legalStatusOfSupply.orElse(null);
      optBits |= OPT_BIT_LEGAL_STATUS_OF_SUPPLY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(com.fhir.uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = java.util.Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public final Builder implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules) {
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
    public final Builder subject(java.util.List<com.fhir.Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public final Builder meta(java.util.Optional<? extends com.fhir.Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProductPackaged MedicinalProductPackaged}.
     * @return An immutable instance of MedicinalProductPackaged
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicinalProductPackaged build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductPackaged(
          manufacturer,
          batchIdentifier,
          extension,
          createUnmodifiableList(true, packageItem),
          id,
          marketingAuthorization,
          marketingStatus,
          description,
          resourceType,
          language,
          identifier,
          text,
          contained,
          modifierExtension,
          legalStatusOfSupply,
          implicitRules,
          subject,
          meta);
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean batchIdentifierIsSet() {
      return (optBits & OPT_BIT_BATCH_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean marketingAuthorizationIsSet() {
      return (optBits & OPT_BIT_MARKETING_AUTHORIZATION) != 0;
    }

    private boolean marketingStatusIsSet() {
      return (optBits & OPT_BIT_MARKETING_STATUS) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean legalStatusOfSupplyIsSet() {
      return (optBits & OPT_BIT_LEGAL_STATUS_OF_SUPPLY) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicinalProductPackaged is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProductPackaged, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MedicinalProductPackaged", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductPackaged#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MedicinalProductPackaged", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturer(java.util.List<com.fhir.Reference> manufacturer);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> manufacturer);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#batchIdentifier() batchIdentifier} to batchIdentifier.
     * @param batchIdentifier The value for batchIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal batchIdentifier(java.util.List<com.fhir.MedicinalProductPackaged_BatchIdentifier> batchIdentifier);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#batchIdentifier() batchIdentifier} to batchIdentifier.
     * @param batchIdentifier The value for batchIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal batchIdentifier(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductPackaged_BatchIdentifier>> batchIdentifier);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Adds one element to {@link MedicinalProductPackaged#packageItem() packageItem} list.
     * @param element A packageItem element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addPackageItem(com.fhir.MedicinalProductPackaged_PackageItem element);

    /**
     * Adds elements to {@link MedicinalProductPackaged#packageItem() packageItem} list.
     * @param elements An array of packageItem elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addPackageItem(com.fhir.MedicinalProductPackaged_PackageItem... elements);

    /**
     * Adds elements to {@link MedicinalProductPackaged#packageItem() packageItem} list.
     * @param elements An iterable of packageItem elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllPackageItem(Iterable<? extends com.fhir.MedicinalProductPackaged_PackageItem> elements);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#marketingAuthorization() marketingAuthorization} to marketingAuthorization.
     * @param marketingAuthorization The value for marketingAuthorization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal marketingAuthorization(com.fhir.Reference marketingAuthorization);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#marketingAuthorization() marketingAuthorization} to marketingAuthorization.
     * @param marketingAuthorization The value for marketingAuthorization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal marketingAuthorization(java.util.Optional<? extends com.fhir.Reference> marketingAuthorization);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#marketingStatus() marketingStatus} to marketingStatus.
     * @param marketingStatus The value for marketingStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal marketingStatus(java.util.List<com.fhir.MarketingStatus> marketingStatus);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#marketingStatus() marketingStatus} to marketingStatus.
     * @param marketingStatus The value for marketingStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal marketingStatus(java.util.Optional<? extends java.util.List<com.fhir.MarketingStatus>> marketingStatus);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for chained invocation
     */
    BuildFinal legalStatusOfSupply(com.fhir.CodeableConcept legalStatusOfSupply);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal legalStatusOfSupply(java.util.Optional<? extends com.fhir.CodeableConcept> legalStatusOfSupply);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(java.util.List<com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> subject);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductPackaged#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Builds a new {@link MedicinalProductPackaged MedicinalProductPackaged}.
     * @return An immutable instance of MedicinalProductPackaged
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductPackaged build();
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    java.util.ArrayList<T> list;
    if (iterable instanceof java.util.Collection<?>) {
      int size = ((java.util.Collection<?>) iterable).size();
      if (size == 0) return java.util.Collections.emptyList();
      list = new java.util.ArrayList<>();
    } else {
      list = new java.util.ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) java.util.Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return java.util.Collections.emptyList();
    case 1: return java.util.Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList<>(list));
      } else {
        if (list instanceof java.util.ArrayList<?>) {
          ((java.util.ArrayList<?>) list).trimToSize();
        }
        return java.util.Collections.unmodifiableList(list);
      }
    }
  }
}
