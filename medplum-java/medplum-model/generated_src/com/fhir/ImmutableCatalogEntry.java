//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CatalogEntry}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCatalogEntry.builder()}.
 */
@org.immutables.value.Generated(from = "CatalogEntry", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCatalogEntry implements com.fhir.CatalogEntry {
  private final com.fhir.Reference referencedItem;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CatalogEntry_RelatedEntry> relatedEntry;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> additionalIdentifier;
  private final @javax.annotation.Nullable java.lang.Boolean orderable;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> additionalClassification;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.dateTime validTo;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CatalogentryStatus status;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> classification;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Period validityPeriod;
  private final @javax.annotation.Nullable com.fhir.dateTime lastUpdated;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> additionalCharacteristic;

  private ImmutableCatalogEntry(
      com.fhir.Reference referencedItem,
      @javax.annotation.Nullable java.util.List<com.fhir.CatalogEntry_RelatedEntry> relatedEntry,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> additionalIdentifier,
      @javax.annotation.Nullable java.lang.Boolean orderable,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> additionalClassification,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.dateTime validTo,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CatalogentryStatus status,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> classification,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Period validityPeriod,
      @javax.annotation.Nullable com.fhir.dateTime lastUpdated,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> additionalCharacteristic) {
    this.referencedItem = referencedItem;
    this.relatedEntry = relatedEntry;
    this.language = language;
    this.modifierExtension = modifierExtension;
    this.type = type;
    this.additionalIdentifier = additionalIdentifier;
    this.orderable = orderable;
    this.additionalClassification = additionalClassification;
    this.contained = contained;
    this.validTo = validTo;
    this.resourceType = resourceType;
    this.extension = extension;
    this.status = status;
    this.id = id;
    this.implicitRules = implicitRules;
    this.classification = classification;
    this.text = text;
    this.meta = meta;
    this.identifier = identifier;
    this.validityPeriod = validityPeriod;
    this.lastUpdated = lastUpdated;
    this.additionalCharacteristic = additionalCharacteristic;
  }

  /**
   * @return The value of the {@code referencedItem} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("referencedItem")
  @Override
  public com.fhir.Reference referencedItem() {
    return referencedItem;
  }

  /**
   * @return The value of the {@code relatedEntry} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relatedEntry")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CatalogEntry_RelatedEntry>> relatedEntry() {
    return java.util.Optional.ofNullable(relatedEntry);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code additionalIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("additionalIdentifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> additionalIdentifier() {
    return java.util.Optional.ofNullable(additionalIdentifier);
  }

  /**
   * @return The value of the {@code orderable} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("orderable")
  @Override
  public java.util.Optional<java.lang.Boolean> orderable() {
    return java.util.Optional.ofNullable(orderable);
  }

  /**
   * @return The value of the {@code additionalClassification} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("additionalClassification")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> additionalClassification() {
    return java.util.Optional.ofNullable(additionalClassification);
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
   * @return The value of the {@code validTo} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("validTo")
  @Override
  public java.util.Optional<com.fhir.dateTime> validTo() {
    return java.util.Optional.ofNullable(validTo);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.CatalogentryStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code classification} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("classification")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> classification() {
    return java.util.Optional.ofNullable(classification);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code validityPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("validityPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> validityPeriod() {
    return java.util.Optional.ofNullable(validityPeriod);
  }

  /**
   * @return The value of the {@code lastUpdated} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lastUpdated")
  @Override
  public java.util.Optional<com.fhir.dateTime> lastUpdated() {
    return java.util.Optional.ofNullable(lastUpdated);
  }

  /**
   * @return The value of the {@code additionalCharacteristic} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("additionalCharacteristic")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> additionalCharacteristic() {
    return java.util.Optional.ofNullable(additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CatalogEntry#referencedItem() referencedItem} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for referencedItem
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCatalogEntry withReferencedItem(com.fhir.Reference value) {
    if (this.referencedItem == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "referencedItem");
    return new ImmutableCatalogEntry(
        newValue,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#relatedEntry() relatedEntry} attribute.
   * @param value The value for relatedEntry
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withRelatedEntry(java.util.List<com.fhir.CatalogEntry_RelatedEntry> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CatalogEntry_RelatedEntry> newValue = java.util.Objects.requireNonNull(value, "relatedEntry");
    if (this.relatedEntry == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        newValue,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#relatedEntry() relatedEntry} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedEntry
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withRelatedEntry(java.util.Optional<? extends java.util.List<com.fhir.CatalogEntry_RelatedEntry>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CatalogEntry_RelatedEntry> value = optional.orElse(null);
    if (this.relatedEntry == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        value,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        newValue,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        value,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        newValue,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        value,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        newValue,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        value,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#additionalIdentifier() additionalIdentifier} attribute.
   * @param value The value for additionalIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withAdditionalIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "additionalIdentifier");
    if (this.additionalIdentifier == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        newValue,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#additionalIdentifier() additionalIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additionalIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withAdditionalIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.additionalIdentifier == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        value,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#orderable() orderable} attribute.
   * @param value The value for orderable
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withOrderable(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.orderable, newValue)) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        newValue,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#orderable() orderable} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for orderable
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withOrderable(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.orderable, value)) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        value,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#additionalClassification() additionalClassification} attribute.
   * @param value The value for additionalClassification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withAdditionalClassification(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "additionalClassification");
    if (this.additionalClassification == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        newValue,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#additionalClassification() additionalClassification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additionalClassification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withAdditionalClassification(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.additionalClassification == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        value,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        newValue,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        value,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#validTo() validTo} attribute.
   * @param value The value for validTo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withValidTo(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "validTo");
    if (this.validTo == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        newValue,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#validTo() validTo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validTo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withValidTo(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.validTo == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        value,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CatalogEntry#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCatalogEntry withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        newValue,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        newValue,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        value,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withStatus(com.fhir.CatalogentryStatus value) {
    @javax.annotation.Nullable com.fhir.CatalogentryStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        newValue,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withStatus(java.util.Optional<? extends com.fhir.CatalogentryStatus> optional) {
    @javax.annotation.Nullable com.fhir.CatalogentryStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        value,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        newValue,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        value,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        newValue,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        value,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#classification() classification} attribute.
   * @param value The value for classification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withClassification(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "classification");
    if (this.classification == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        newValue,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#classification() classification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for classification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withClassification(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.classification == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        value,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        newValue,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        value,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        newValue,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        value,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        newValue,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        value,
        this.validityPeriod,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#validityPeriod() validityPeriod} attribute.
   * @param value The value for validityPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withValidityPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "validityPeriod");
    if (this.validityPeriod == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        newValue,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#validityPeriod() validityPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validityPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withValidityPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.validityPeriod == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        value,
        this.lastUpdated,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#lastUpdated() lastUpdated} attribute.
   * @param value The value for lastUpdated
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withLastUpdated(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "lastUpdated");
    if (this.lastUpdated == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        newValue,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#lastUpdated() lastUpdated} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastUpdated
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withLastUpdated(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.lastUpdated == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        value,
        this.additionalCharacteristic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#additionalCharacteristic() additionalCharacteristic} attribute.
   * @param value The value for additionalCharacteristic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withAdditionalCharacteristic(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "additionalCharacteristic");
    if (this.additionalCharacteristic == newValue) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#additionalCharacteristic() additionalCharacteristic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additionalCharacteristic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withAdditionalCharacteristic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.additionalCharacteristic == value) return this;
    return new ImmutableCatalogEntry(
        this.referencedItem,
        this.relatedEntry,
        this.language,
        this.modifierExtension,
        this.type,
        this.additionalIdentifier,
        this.orderable,
        this.additionalClassification,
        this.contained,
        this.validTo,
        this.resourceType,
        this.extension,
        this.status,
        this.id,
        this.implicitRules,
        this.classification,
        this.text,
        this.meta,
        this.identifier,
        this.validityPeriod,
        this.lastUpdated,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCatalogEntry} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCatalogEntry
        && equalTo((ImmutableCatalogEntry) another);
  }

  private boolean equalTo(ImmutableCatalogEntry another) {
    return referencedItem.equals(another.referencedItem)
        && java.util.Objects.equals(relatedEntry, another.relatedEntry)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(additionalIdentifier, another.additionalIdentifier)
        && java.util.Objects.equals(orderable, another.orderable)
        && java.util.Objects.equals(additionalClassification, another.additionalClassification)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(validTo, another.validTo)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(classification, another.classification)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(validityPeriod, another.validityPeriod)
        && java.util.Objects.equals(lastUpdated, another.lastUpdated)
        && java.util.Objects.equals(additionalCharacteristic, another.additionalCharacteristic);
  }

  /**
   * Computes a hash code from attributes: {@code referencedItem}, {@code relatedEntry}, {@code language}, {@code modifierExtension}, {@code type}, {@code additionalIdentifier}, {@code orderable}, {@code additionalClassification}, {@code contained}, {@code validTo}, {@code resourceType}, {@code extension}, {@code status}, {@code id}, {@code implicitRules}, {@code classification}, {@code text}, {@code meta}, {@code identifier}, {@code validityPeriod}, {@code lastUpdated}, {@code additionalCharacteristic}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + referencedItem.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(relatedEntry);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(additionalIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(orderable);
    h += (h << 5) + java.util.Objects.hashCode(additionalClassification);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(validTo);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(classification);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(validityPeriod);
    h += (h << 5) + java.util.Objects.hashCode(lastUpdated);
    h += (h << 5) + java.util.Objects.hashCode(additionalCharacteristic);
    return h;
  }

  /**
   * Prints the immutable value {@code CatalogEntry} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CatalogEntry{");
    builder.append("referencedItem=").append(referencedItem);
    if (relatedEntry != null) {
      builder.append(", ");
      builder.append("relatedEntry=").append(relatedEntry);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (additionalIdentifier != null) {
      builder.append(", ");
      builder.append("additionalIdentifier=").append(additionalIdentifier);
    }
    if (orderable != null) {
      builder.append(", ");
      builder.append("orderable=").append(orderable);
    }
    if (additionalClassification != null) {
      builder.append(", ");
      builder.append("additionalClassification=").append(additionalClassification);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (validTo != null) {
      builder.append(", ");
      builder.append("validTo=").append(validTo);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (classification != null) {
      builder.append(", ");
      builder.append("classification=").append(classification);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (validityPeriod != null) {
      builder.append(", ");
      builder.append("validityPeriod=").append(validityPeriod);
    }
    if (lastUpdated != null) {
      builder.append(", ");
      builder.append("lastUpdated=").append(lastUpdated);
    }
    if (additionalCharacteristic != null) {
      builder.append(", ");
      builder.append("additionalCharacteristic=").append(additionalCharacteristic);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CatalogEntry", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CatalogEntry {
    @javax.annotation.Nullable com.fhir.Reference referencedItem;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CatalogEntry_RelatedEntry>> relatedEntry = java.util.Optional.empty();
    boolean relatedEntryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> additionalIdentifier = java.util.Optional.empty();
    boolean additionalIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> orderable = java.util.Optional.empty();
    boolean orderableIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> additionalClassification = java.util.Optional.empty();
    boolean additionalClassificationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> validTo = java.util.Optional.empty();
    boolean validToIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CatalogentryStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> classification = java.util.Optional.empty();
    boolean classificationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> validityPeriod = java.util.Optional.empty();
    boolean validityPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> lastUpdated = java.util.Optional.empty();
    boolean lastUpdatedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> additionalCharacteristic = java.util.Optional.empty();
    boolean additionalCharacteristicIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("referencedItem")
    public void setReferencedItem(com.fhir.Reference referencedItem) {
      this.referencedItem = referencedItem;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relatedEntry")
    public void setRelatedEntry(java.util.Optional<java.util.List<com.fhir.CatalogEntry_RelatedEntry>> relatedEntry) {
      this.relatedEntry = relatedEntry;
      this.relatedEntryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("additionalIdentifier")
    public void setAdditionalIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> additionalIdentifier) {
      this.additionalIdentifier = additionalIdentifier;
      this.additionalIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("orderable")
    public void setOrderable(java.util.Optional<java.lang.Boolean> orderable) {
      this.orderable = orderable;
      this.orderableIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("additionalClassification")
    public void setAdditionalClassification(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> additionalClassification) {
      this.additionalClassification = additionalClassification;
      this.additionalClassificationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("validTo")
    public void setValidTo(java.util.Optional<com.fhir.dateTime> validTo) {
      this.validTo = validTo;
      this.validToIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.CatalogentryStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("classification")
    public void setClassification(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> classification) {
      this.classification = classification;
      this.classificationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("validityPeriod")
    public void setValidityPeriod(java.util.Optional<com.fhir.Period> validityPeriod) {
      this.validityPeriod = validityPeriod;
      this.validityPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdated")
    public void setLastUpdated(java.util.Optional<com.fhir.dateTime> lastUpdated) {
      this.lastUpdated = lastUpdated;
      this.lastUpdatedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("additionalCharacteristic")
    public void setAdditionalCharacteristic(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> additionalCharacteristic) {
      this.additionalCharacteristic = additionalCharacteristic;
      this.additionalCharacteristicIsSet = true;
    }
    @Override
    public com.fhir.Reference referencedItem() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CatalogEntry_RelatedEntry>> relatedEntry() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> additionalIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> orderable() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> additionalClassification() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> validTo() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CatalogentryStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> classification() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> validityPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> lastUpdated() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> additionalCharacteristic() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCatalogEntry fromJson(Json json) {
    ImmutableCatalogEntry.Builder builder = ((ImmutableCatalogEntry.Builder) ImmutableCatalogEntry.builder());
    if (json.referencedItem != null) {
      builder.referencedItem(json.referencedItem);
    }
    if (json.relatedEntryIsSet) {
      builder.relatedEntry(json.relatedEntry);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.additionalIdentifierIsSet) {
      builder.additionalIdentifier(json.additionalIdentifier);
    }
    if (json.orderableIsSet) {
      builder.orderable(json.orderable);
    }
    if (json.additionalClassificationIsSet) {
      builder.additionalClassification(json.additionalClassification);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.validToIsSet) {
      builder.validTo(json.validTo);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.classificationIsSet) {
      builder.classification(json.classification);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.validityPeriodIsSet) {
      builder.validityPeriod(json.validityPeriod);
    }
    if (json.lastUpdatedIsSet) {
      builder.lastUpdated(json.lastUpdated);
    }
    if (json.additionalCharacteristicIsSet) {
      builder.additionalCharacteristic(json.additionalCharacteristic);
    }
    return (ImmutableCatalogEntry) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CatalogEntry} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CatalogEntry instance
   */
  public static CatalogEntry copyOf(CatalogEntry instance) {
    if (instance instanceof ImmutableCatalogEntry) {
      return (ImmutableCatalogEntry) instance;
    }
    return ((ImmutableCatalogEntry.Builder) ImmutableCatalogEntry.builder())
        .referencedItem(instance.referencedItem())
        .relatedEntry(instance.relatedEntry())
        .language(instance.language())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .additionalIdentifier(instance.additionalIdentifier())
        .orderable(instance.orderable())
        .additionalClassification(instance.additionalClassification())
        .contained(instance.contained())
        .validTo(instance.validTo())
        .resourceType(instance.resourceType())
        .extension(instance.extension())
        .status(instance.status())
        .id(instance.id())
        .implicitRules(instance.implicitRules())
        .classification(instance.classification())
        .text(instance.text())
        .meta(instance.meta())
        .identifier(instance.identifier())
        .validityPeriod(instance.validityPeriod())
        .lastUpdated(instance.lastUpdated())
        .additionalCharacteristic(instance.additionalCharacteristic())
        .build();
  }

  /**
   * Creates a builder for {@link CatalogEntry CatalogEntry}.
   * <pre>
   * ImmutableCatalogEntry.builder()
   *    .referencedItem(com.fhir.Reference) // required {@link CatalogEntry#referencedItem() referencedItem}
   *    .relatedEntry(List&amp;lt;com.fhir.CatalogEntry_RelatedEntry&amp;gt;) // optional {@link CatalogEntry#relatedEntry() relatedEntry}
   *    .language(com.fhir.code) // optional {@link CatalogEntry#language() language}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CatalogEntry#modifierExtension() modifierExtension}
   *    .type(com.fhir.CodeableConcept) // optional {@link CatalogEntry#type() type}
   *    .additionalIdentifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link CatalogEntry#additionalIdentifier() additionalIdentifier}
   *    .orderable(Boolean) // optional {@link CatalogEntry#orderable() orderable}
   *    .additionalClassification(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link CatalogEntry#additionalClassification() additionalClassification}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link CatalogEntry#contained() contained}
   *    .validTo(com.fhir.dateTime) // optional {@link CatalogEntry#validTo() validTo}
   *    .resourceType(String) // required {@link CatalogEntry#resourceType() resourceType}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CatalogEntry#extension() extension}
   *    .status(com.fhir.CatalogentryStatus) // optional {@link CatalogEntry#status() status}
   *    .id(com.fhir.id) // optional {@link CatalogEntry#id() id}
   *    .implicitRules(com.fhir.uri) // optional {@link CatalogEntry#implicitRules() implicitRules}
   *    .classification(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link CatalogEntry#classification() classification}
   *    .text(com.fhir.Narrative) // optional {@link CatalogEntry#text() text}
   *    .meta(com.fhir.Meta) // optional {@link CatalogEntry#meta() meta}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link CatalogEntry#identifier() identifier}
   *    .validityPeriod(com.fhir.Period) // optional {@link CatalogEntry#validityPeriod() validityPeriod}
   *    .lastUpdated(com.fhir.dateTime) // optional {@link CatalogEntry#lastUpdated() lastUpdated}
   *    .additionalCharacteristic(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link CatalogEntry#additionalCharacteristic() additionalCharacteristic}
   *    .build();
   * </pre>
   * @return A new CatalogEntry builder
   */
  public static ReferencedItemBuildStage builder() {
    return new ImmutableCatalogEntry.Builder();
  }

  /**
   * Builds instances of type {@link CatalogEntry CatalogEntry}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CatalogEntry", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ReferencedItemBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_REFERENCED_ITEM = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_RELATED_ENTRY = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_ADDITIONAL_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_ORDERABLE = 0x20L;
    private static final long OPT_BIT_ADDITIONAL_CLASSIFICATION = 0x40L;
    private static final long OPT_BIT_CONTAINED = 0x80L;
    private static final long OPT_BIT_VALID_TO = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_STATUS = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000L;
    private static final long OPT_BIT_CLASSIFICATION = 0x2000L;
    private static final long OPT_BIT_TEXT = 0x4000L;
    private static final long OPT_BIT_META = 0x8000L;
    private static final long OPT_BIT_IDENTIFIER = 0x10000L;
    private static final long OPT_BIT_VALIDITY_PERIOD = 0x20000L;
    private static final long OPT_BIT_LAST_UPDATED = 0x40000L;
    private static final long OPT_BIT_ADDITIONAL_CHARACTERISTIC = 0x80000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Reference referencedItem;
    private @javax.annotation.Nullable java.util.List<com.fhir.CatalogEntry_RelatedEntry> relatedEntry;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> additionalIdentifier;
    private @javax.annotation.Nullable java.lang.Boolean orderable;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> additionalClassification;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.dateTime validTo;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CatalogentryStatus status;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> classification;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Period validityPeriod;
    private @javax.annotation.Nullable com.fhir.dateTime lastUpdated;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> additionalCharacteristic;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link CatalogEntry#referencedItem() referencedItem} attribute.
     * @param referencedItem The value for referencedItem 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referencedItem")
    public final Builder referencedItem(com.fhir.Reference referencedItem) {
      checkNotIsSet(referencedItemIsSet(), "referencedItem");
      this.referencedItem = java.util.Objects.requireNonNull(referencedItem, "referencedItem");
      initBits &= ~INIT_BIT_REFERENCED_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#relatedEntry() relatedEntry} to relatedEntry.
     * @param relatedEntry The value for relatedEntry
     * @return {@code this} builder for chained invocation
     */
    public final Builder relatedEntry(java.util.List<com.fhir.CatalogEntry_RelatedEntry> relatedEntry) {
      checkNotIsSet(relatedEntryIsSet(), "relatedEntry");
      this.relatedEntry = java.util.Objects.requireNonNull(relatedEntry, "relatedEntry");
      optBits |= OPT_BIT_RELATED_ENTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#relatedEntry() relatedEntry} to relatedEntry.
     * @param relatedEntry The value for relatedEntry
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relatedEntry")
    public final Builder relatedEntry(java.util.Optional<? extends java.util.List<com.fhir.CatalogEntry_RelatedEntry>> relatedEntry) {
      checkNotIsSet(relatedEntryIsSet(), "relatedEntry");
      this.relatedEntry = relatedEntry.orElse(null);
      optBits |= OPT_BIT_RELATED_ENTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#language() language} to language.
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
     * Initializes the optional value {@link CatalogEntry#language() language} to language.
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
     * Initializes the optional value {@link CatalogEntry#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CatalogEntry#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CatalogEntry#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#additionalIdentifier() additionalIdentifier} to additionalIdentifier.
     * @param additionalIdentifier The value for additionalIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder additionalIdentifier(java.util.List<com.fhir.Identifier> additionalIdentifier) {
      checkNotIsSet(additionalIdentifierIsSet(), "additionalIdentifier");
      this.additionalIdentifier = java.util.Objects.requireNonNull(additionalIdentifier, "additionalIdentifier");
      optBits |= OPT_BIT_ADDITIONAL_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#additionalIdentifier() additionalIdentifier} to additionalIdentifier.
     * @param additionalIdentifier The value for additionalIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalIdentifier")
    public final Builder additionalIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> additionalIdentifier) {
      checkNotIsSet(additionalIdentifierIsSet(), "additionalIdentifier");
      this.additionalIdentifier = additionalIdentifier.orElse(null);
      optBits |= OPT_BIT_ADDITIONAL_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#orderable() orderable} to orderable.
     * @param orderable The value for orderable
     * @return {@code this} builder for chained invocation
     */
    public final Builder orderable(boolean orderable) {
      checkNotIsSet(orderableIsSet(), "orderable");
      this.orderable = orderable;
      optBits |= OPT_BIT_ORDERABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#orderable() orderable} to orderable.
     * @param orderable The value for orderable
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("orderable")
    public final Builder orderable(java.util.Optional<java.lang.Boolean> orderable) {
      checkNotIsSet(orderableIsSet(), "orderable");
      this.orderable = orderable.orElse(null);
      optBits |= OPT_BIT_ORDERABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#additionalClassification() additionalClassification} to additionalClassification.
     * @param additionalClassification The value for additionalClassification
     * @return {@code this} builder for chained invocation
     */
    public final Builder additionalClassification(java.util.List<com.fhir.CodeableConcept> additionalClassification) {
      checkNotIsSet(additionalClassificationIsSet(), "additionalClassification");
      this.additionalClassification = java.util.Objects.requireNonNull(additionalClassification, "additionalClassification");
      optBits |= OPT_BIT_ADDITIONAL_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#additionalClassification() additionalClassification} to additionalClassification.
     * @param additionalClassification The value for additionalClassification
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalClassification")
    public final Builder additionalClassification(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> additionalClassification) {
      checkNotIsSet(additionalClassificationIsSet(), "additionalClassification");
      this.additionalClassification = additionalClassification.orElse(null);
      optBits |= OPT_BIT_ADDITIONAL_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#contained() contained} to contained.
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
     * Initializes the optional value {@link CatalogEntry#contained() contained} to contained.
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
     * Initializes the optional value {@link CatalogEntry#validTo() validTo} to validTo.
     * @param validTo The value for validTo
     * @return {@code this} builder for chained invocation
     */
    public final Builder validTo(com.fhir.dateTime validTo) {
      checkNotIsSet(validToIsSet(), "validTo");
      this.validTo = java.util.Objects.requireNonNull(validTo, "validTo");
      optBits |= OPT_BIT_VALID_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#validTo() validTo} to validTo.
     * @param validTo The value for validTo
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validTo")
    public final Builder validTo(java.util.Optional<? extends com.fhir.dateTime> validTo) {
      checkNotIsSet(validToIsSet(), "validTo");
      this.validTo = validTo.orElse(null);
      optBits |= OPT_BIT_VALID_TO;
      return this;
    }

    /**
     * Initializes the value for the {@link CatalogEntry#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link CatalogEntry#extension() extension} to extension.
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
     * Initializes the optional value {@link CatalogEntry#extension() extension} to extension.
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
     * Initializes the optional value {@link CatalogEntry#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.CatalogentryStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.CatalogentryStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#id() id} to id.
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
     * Initializes the optional value {@link CatalogEntry#id() id} to id.
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
     * Initializes the optional value {@link CatalogEntry#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CatalogEntry#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CatalogEntry#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for chained invocation
     */
    public final Builder classification(java.util.List<com.fhir.CodeableConcept> classification) {
      checkNotIsSet(classificationIsSet(), "classification");
      this.classification = java.util.Objects.requireNonNull(classification, "classification");
      optBits |= OPT_BIT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("classification")
    public final Builder classification(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> classification) {
      checkNotIsSet(classificationIsSet(), "classification");
      this.classification = classification.orElse(null);
      optBits |= OPT_BIT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#text() text} to text.
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
     * Initializes the optional value {@link CatalogEntry#text() text} to text.
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
     * Initializes the optional value {@link CatalogEntry#meta() meta} to meta.
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
     * Initializes the optional value {@link CatalogEntry#meta() meta} to meta.
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
     * Initializes the optional value {@link CatalogEntry#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CatalogEntry#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CatalogEntry#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder validityPeriod(com.fhir.Period validityPeriod) {
      checkNotIsSet(validityPeriodIsSet(), "validityPeriod");
      this.validityPeriod = java.util.Objects.requireNonNull(validityPeriod, "validityPeriod");
      optBits |= OPT_BIT_VALIDITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validityPeriod")
    public final Builder validityPeriod(java.util.Optional<? extends com.fhir.Period> validityPeriod) {
      checkNotIsSet(validityPeriodIsSet(), "validityPeriod");
      this.validityPeriod = validityPeriod.orElse(null);
      optBits |= OPT_BIT_VALIDITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#lastUpdated() lastUpdated} to lastUpdated.
     * @param lastUpdated The value for lastUpdated
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastUpdated(com.fhir.dateTime lastUpdated) {
      checkNotIsSet(lastUpdatedIsSet(), "lastUpdated");
      this.lastUpdated = java.util.Objects.requireNonNull(lastUpdated, "lastUpdated");
      optBits |= OPT_BIT_LAST_UPDATED;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#lastUpdated() lastUpdated} to lastUpdated.
     * @param lastUpdated The value for lastUpdated
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdated")
    public final Builder lastUpdated(java.util.Optional<? extends com.fhir.dateTime> lastUpdated) {
      checkNotIsSet(lastUpdatedIsSet(), "lastUpdated");
      this.lastUpdated = lastUpdated.orElse(null);
      optBits |= OPT_BIT_LAST_UPDATED;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#additionalCharacteristic() additionalCharacteristic} to additionalCharacteristic.
     * @param additionalCharacteristic The value for additionalCharacteristic
     * @return {@code this} builder for chained invocation
     */
    public final Builder additionalCharacteristic(java.util.List<com.fhir.CodeableConcept> additionalCharacteristic) {
      checkNotIsSet(additionalCharacteristicIsSet(), "additionalCharacteristic");
      this.additionalCharacteristic = java.util.Objects.requireNonNull(additionalCharacteristic, "additionalCharacteristic");
      optBits |= OPT_BIT_ADDITIONAL_CHARACTERISTIC;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#additionalCharacteristic() additionalCharacteristic} to additionalCharacteristic.
     * @param additionalCharacteristic The value for additionalCharacteristic
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalCharacteristic")
    public final Builder additionalCharacteristic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> additionalCharacteristic) {
      checkNotIsSet(additionalCharacteristicIsSet(), "additionalCharacteristic");
      this.additionalCharacteristic = additionalCharacteristic.orElse(null);
      optBits |= OPT_BIT_ADDITIONAL_CHARACTERISTIC;
      return this;
    }

    /**
     * Builds a new {@link CatalogEntry CatalogEntry}.
     * @return An immutable instance of CatalogEntry
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CatalogEntry build() {
      checkRequiredAttributes();
      return new ImmutableCatalogEntry(
          referencedItem,
          relatedEntry,
          language,
          modifierExtension,
          type,
          additionalIdentifier,
          orderable,
          additionalClassification,
          contained,
          validTo,
          resourceType,
          extension,
          status,
          id,
          implicitRules,
          classification,
          text,
          meta,
          identifier,
          validityPeriod,
          lastUpdated,
          additionalCharacteristic);
    }

    private boolean relatedEntryIsSet() {
      return (optBits & OPT_BIT_RELATED_ENTRY) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean additionalIdentifierIsSet() {
      return (optBits & OPT_BIT_ADDITIONAL_IDENTIFIER) != 0;
    }

    private boolean orderableIsSet() {
      return (optBits & OPT_BIT_ORDERABLE) != 0;
    }

    private boolean additionalClassificationIsSet() {
      return (optBits & OPT_BIT_ADDITIONAL_CLASSIFICATION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean validToIsSet() {
      return (optBits & OPT_BIT_VALID_TO) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean classificationIsSet() {
      return (optBits & OPT_BIT_CLASSIFICATION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean validityPeriodIsSet() {
      return (optBits & OPT_BIT_VALIDITY_PERIOD) != 0;
    }

    private boolean lastUpdatedIsSet() {
      return (optBits & OPT_BIT_LAST_UPDATED) != 0;
    }

    private boolean additionalCharacteristicIsSet() {
      return (optBits & OPT_BIT_ADDITIONAL_CHARACTERISTIC) != 0;
    }

    private boolean referencedItemIsSet() {
      return (initBits & INIT_BIT_REFERENCED_ITEM) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CatalogEntry is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!referencedItemIsSet()) attributes.add("referencedItem");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build CatalogEntry, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "CatalogEntry", generator = "Immutables")
  public interface ReferencedItemBuildStage {
    /**
     * Initializes the value for the {@link CatalogEntry#referencedItem() referencedItem} attribute.
     * @param referencedItem The value for referencedItem 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage referencedItem(com.fhir.Reference referencedItem);
  }

  @org.immutables.value.Generated(from = "CatalogEntry", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link CatalogEntry#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "CatalogEntry", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CatalogEntry#relatedEntry() relatedEntry} to relatedEntry.
     * @param relatedEntry The value for relatedEntry
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedEntry(java.util.List<com.fhir.CatalogEntry_RelatedEntry> relatedEntry);

    /**
     * Initializes the optional value {@link CatalogEntry#relatedEntry() relatedEntry} to relatedEntry.
     * @param relatedEntry The value for relatedEntry
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedEntry(java.util.Optional<? extends java.util.List<com.fhir.CatalogEntry_RelatedEntry>> relatedEntry);

    /**
     * Initializes the optional value {@link CatalogEntry#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link CatalogEntry#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link CatalogEntry#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CatalogEntry#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CatalogEntry#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link CatalogEntry#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link CatalogEntry#additionalIdentifier() additionalIdentifier} to additionalIdentifier.
     * @param additionalIdentifier The value for additionalIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal additionalIdentifier(java.util.List<com.fhir.Identifier> additionalIdentifier);

    /**
     * Initializes the optional value {@link CatalogEntry#additionalIdentifier() additionalIdentifier} to additionalIdentifier.
     * @param additionalIdentifier The value for additionalIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal additionalIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> additionalIdentifier);

    /**
     * Initializes the optional value {@link CatalogEntry#orderable() orderable} to orderable.
     * @param orderable The value for orderable
     * @return {@code this} builder for chained invocation
     */
    BuildFinal orderable(boolean orderable);

    /**
     * Initializes the optional value {@link CatalogEntry#orderable() orderable} to orderable.
     * @param orderable The value for orderable
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal orderable(java.util.Optional<java.lang.Boolean> orderable);

    /**
     * Initializes the optional value {@link CatalogEntry#additionalClassification() additionalClassification} to additionalClassification.
     * @param additionalClassification The value for additionalClassification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal additionalClassification(java.util.List<com.fhir.CodeableConcept> additionalClassification);

    /**
     * Initializes the optional value {@link CatalogEntry#additionalClassification() additionalClassification} to additionalClassification.
     * @param additionalClassification The value for additionalClassification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal additionalClassification(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> additionalClassification);

    /**
     * Initializes the optional value {@link CatalogEntry#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link CatalogEntry#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link CatalogEntry#validTo() validTo} to validTo.
     * @param validTo The value for validTo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validTo(com.fhir.dateTime validTo);

    /**
     * Initializes the optional value {@link CatalogEntry#validTo() validTo} to validTo.
     * @param validTo The value for validTo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validTo(java.util.Optional<? extends com.fhir.dateTime> validTo);

    /**
     * Initializes the optional value {@link CatalogEntry#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link CatalogEntry#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link CatalogEntry#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.CatalogentryStatus status);

    /**
     * Initializes the optional value {@link CatalogEntry#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.CatalogentryStatus> status);

    /**
     * Initializes the optional value {@link CatalogEntry#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link CatalogEntry#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link CatalogEntry#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link CatalogEntry#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link CatalogEntry#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal classification(java.util.List<com.fhir.CodeableConcept> classification);

    /**
     * Initializes the optional value {@link CatalogEntry#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal classification(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> classification);

    /**
     * Initializes the optional value {@link CatalogEntry#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link CatalogEntry#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link CatalogEntry#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link CatalogEntry#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link CatalogEntry#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link CatalogEntry#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link CatalogEntry#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validityPeriod(com.fhir.Period validityPeriod);

    /**
     * Initializes the optional value {@link CatalogEntry#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validityPeriod(java.util.Optional<? extends com.fhir.Period> validityPeriod);

    /**
     * Initializes the optional value {@link CatalogEntry#lastUpdated() lastUpdated} to lastUpdated.
     * @param lastUpdated The value for lastUpdated
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastUpdated(com.fhir.dateTime lastUpdated);

    /**
     * Initializes the optional value {@link CatalogEntry#lastUpdated() lastUpdated} to lastUpdated.
     * @param lastUpdated The value for lastUpdated
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastUpdated(java.util.Optional<? extends com.fhir.dateTime> lastUpdated);

    /**
     * Initializes the optional value {@link CatalogEntry#additionalCharacteristic() additionalCharacteristic} to additionalCharacteristic.
     * @param additionalCharacteristic The value for additionalCharacteristic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal additionalCharacteristic(java.util.List<com.fhir.CodeableConcept> additionalCharacteristic);

    /**
     * Initializes the optional value {@link CatalogEntry#additionalCharacteristic() additionalCharacteristic} to additionalCharacteristic.
     * @param additionalCharacteristic The value for additionalCharacteristic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal additionalCharacteristic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> additionalCharacteristic);

    /**
     * Builds a new {@link CatalogEntry CatalogEntry}.
     * @return An immutable instance of CatalogEntry
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CatalogEntry build();
  }
}
