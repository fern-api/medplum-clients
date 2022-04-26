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
 * Immutable implementation of {@link CatalogEntry}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCatalogEntry.builder()}.
 */
@Generated(from = "CatalogEntry", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCatalogEntry implements CatalogEntry {
  private final @Nullable List<CodeableConcept> additionalClassification;
  private final @Nullable Uri implicitRules;
  private final @Nullable Period validityPeriod;
  private final @Nullable List<CodeableConcept> additionalCharacteristic;
  private final @Nullable Id id;
  private final @Nullable DateTime lastUpdated;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Identifier> additionalIdentifier;
  private final @Nullable Narrative text;
  private final @Nullable CatalogentryStatus status;
  private final @Nullable CodeableConcept type;
  private final String resourceType;
  private final @Nullable List<CodeableConcept> classification;
  private final @Nullable Meta meta;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Boolean orderable;
  private final @Nullable Code language;
  private final @Nullable List<Extension> extension;
  private final Reference referencedItem;
  private final @Nullable DateTime validTo;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<CatalogEntry_RelatedEntry> relatedEntry;

  private ImmutableCatalogEntry(
      @Nullable List<CodeableConcept> additionalClassification,
      @Nullable Uri implicitRules,
      @Nullable Period validityPeriod,
      @Nullable List<CodeableConcept> additionalCharacteristic,
      @Nullable Id id,
      @Nullable DateTime lastUpdated,
      @Nullable List<Identifier> identifier,
      @Nullable List<Identifier> additionalIdentifier,
      @Nullable Narrative text,
      @Nullable CatalogentryStatus status,
      @Nullable CodeableConcept type,
      String resourceType,
      @Nullable List<CodeableConcept> classification,
      @Nullable Meta meta,
      @Nullable List<Extension> modifierExtension,
      @Nullable Boolean orderable,
      @Nullable Code language,
      @Nullable List<Extension> extension,
      Reference referencedItem,
      @Nullable DateTime validTo,
      @Nullable List<ResourceList> contained,
      @Nullable List<CatalogEntry_RelatedEntry> relatedEntry) {
    this.additionalClassification = additionalClassification;
    this.implicitRules = implicitRules;
    this.validityPeriod = validityPeriod;
    this.additionalCharacteristic = additionalCharacteristic;
    this.id = id;
    this.lastUpdated = lastUpdated;
    this.identifier = identifier;
    this.additionalIdentifier = additionalIdentifier;
    this.text = text;
    this.status = status;
    this.type = type;
    this.resourceType = resourceType;
    this.classification = classification;
    this.meta = meta;
    this.modifierExtension = modifierExtension;
    this.orderable = orderable;
    this.language = language;
    this.extension = extension;
    this.referencedItem = referencedItem;
    this.validTo = validTo;
    this.contained = contained;
    this.relatedEntry = relatedEntry;
  }

  /**
   * @return The value of the {@code additionalClassification} attribute
   */
  @JsonProperty("additionalClassification")
  @Override
  public Optional<List<CodeableConcept>> additionalClassification() {
    return Optional.ofNullable(additionalClassification);
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
   * @return The value of the {@code validityPeriod} attribute
   */
  @JsonProperty("validityPeriod")
  @Override
  public Optional<Period> validityPeriod() {
    return Optional.ofNullable(validityPeriod);
  }

  /**
   * @return The value of the {@code additionalCharacteristic} attribute
   */
  @JsonProperty("additionalCharacteristic")
  @Override
  public Optional<List<CodeableConcept>> additionalCharacteristic() {
    return Optional.ofNullable(additionalCharacteristic);
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
   * @return The value of the {@code lastUpdated} attribute
   */
  @JsonProperty("lastUpdated")
  @Override
  public Optional<DateTime> lastUpdated() {
    return Optional.ofNullable(lastUpdated);
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
   * @return The value of the {@code additionalIdentifier} attribute
   */
  @JsonProperty("additionalIdentifier")
  @Override
  public Optional<List<Identifier>> additionalIdentifier() {
    return Optional.ofNullable(additionalIdentifier);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<CatalogentryStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code classification} attribute
   */
  @JsonProperty("classification")
  @Override
  public Optional<List<CodeableConcept>> classification() {
    return Optional.ofNullable(classification);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code orderable} attribute
   */
  @JsonProperty("orderable")
  @Override
  public Optional<Boolean> orderable() {
    return Optional.ofNullable(orderable);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code referencedItem} attribute
   */
  @JsonProperty("referencedItem")
  @Override
  public Reference referencedItem() {
    return referencedItem;
  }

  /**
   * @return The value of the {@code validTo} attribute
   */
  @JsonProperty("validTo")
  @Override
  public Optional<DateTime> validTo() {
    return Optional.ofNullable(validTo);
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
   * @return The value of the {@code relatedEntry} attribute
   */
  @JsonProperty("relatedEntry")
  @Override
  public Optional<List<CatalogEntry_RelatedEntry>> relatedEntry() {
    return Optional.ofNullable(relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#additionalClassification() additionalClassification} attribute.
   * @param value The value for additionalClassification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withAdditionalClassification(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "additionalClassification");
    if (this.additionalClassification == newValue) return this;
    return new ImmutableCatalogEntry(
        newValue,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#additionalClassification() additionalClassification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additionalClassification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withAdditionalClassification(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.additionalClassification == value) return this;
    return new ImmutableCatalogEntry(
        value,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        newValue,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        value,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#validityPeriod() validityPeriod} attribute.
   * @param value The value for validityPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withValidityPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "validityPeriod");
    if (this.validityPeriod == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        newValue,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#validityPeriod() validityPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validityPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withValidityPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.validityPeriod == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        value,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#additionalCharacteristic() additionalCharacteristic} attribute.
   * @param value The value for additionalCharacteristic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withAdditionalCharacteristic(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "additionalCharacteristic");
    if (this.additionalCharacteristic == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        newValue,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#additionalCharacteristic() additionalCharacteristic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additionalCharacteristic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withAdditionalCharacteristic(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.additionalCharacteristic == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        value,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        newValue,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        value,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#lastUpdated() lastUpdated} attribute.
   * @param value The value for lastUpdated
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withLastUpdated(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "lastUpdated");
    if (this.lastUpdated == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        newValue,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#lastUpdated() lastUpdated} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastUpdated
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withLastUpdated(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.lastUpdated == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        value,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        newValue,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        value,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#additionalIdentifier() additionalIdentifier} attribute.
   * @param value The value for additionalIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withAdditionalIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "additionalIdentifier");
    if (this.additionalIdentifier == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        newValue,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#additionalIdentifier() additionalIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additionalIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withAdditionalIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.additionalIdentifier == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        value,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        newValue,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        value,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withStatus(CatalogentryStatus value) {
    @Nullable CatalogentryStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        newValue,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withStatus(Optional<? extends CatalogentryStatus> optional) {
    @Nullable CatalogentryStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        value,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        newValue,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        value,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CatalogEntry#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCatalogEntry withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        newValue,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#classification() classification} attribute.
   * @param value The value for classification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withClassification(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "classification");
    if (this.classification == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        newValue,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#classification() classification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for classification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withClassification(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.classification == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        value,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        newValue,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        value,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        newValue,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        value,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#orderable() orderable} attribute.
   * @param value The value for orderable
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withOrderable(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.orderable, newValue)) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        newValue,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#orderable() orderable} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for orderable
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withOrderable(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.orderable, value)) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        value,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        newValue,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        value,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        newValue,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        value,
        this.referencedItem,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CatalogEntry#referencedItem() referencedItem} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for referencedItem
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCatalogEntry withReferencedItem(Reference value) {
    if (this.referencedItem == value) return this;
    Reference newValue = Objects.requireNonNull(value, "referencedItem");
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        newValue,
        this.validTo,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#validTo() validTo} attribute.
   * @param value The value for validTo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withValidTo(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "validTo");
    if (this.validTo == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        newValue,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#validTo() validTo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validTo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withValidTo(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.validTo == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        value,
        this.contained,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        newValue,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        value,
        this.relatedEntry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CatalogEntry#relatedEntry() relatedEntry} attribute.
   * @param value The value for relatedEntry
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCatalogEntry withRelatedEntry(List<CatalogEntry_RelatedEntry> value) {
    @Nullable List<CatalogEntry_RelatedEntry> newValue = Objects.requireNonNull(value, "relatedEntry");
    if (this.relatedEntry == newValue) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CatalogEntry#relatedEntry() relatedEntry} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedEntry
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCatalogEntry withRelatedEntry(Optional<? extends List<CatalogEntry_RelatedEntry>> optional) {
    @Nullable List<CatalogEntry_RelatedEntry> value = optional.orElse(null);
    if (this.relatedEntry == value) return this;
    return new ImmutableCatalogEntry(
        this.additionalClassification,
        this.implicitRules,
        this.validityPeriod,
        this.additionalCharacteristic,
        this.id,
        this.lastUpdated,
        this.identifier,
        this.additionalIdentifier,
        this.text,
        this.status,
        this.type,
        this.resourceType,
        this.classification,
        this.meta,
        this.modifierExtension,
        this.orderable,
        this.language,
        this.extension,
        this.referencedItem,
        this.validTo,
        this.contained,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCatalogEntry} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCatalogEntry
        && equalTo((ImmutableCatalogEntry) another);
  }

  private boolean equalTo(ImmutableCatalogEntry another) {
    return Objects.equals(additionalClassification, another.additionalClassification)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(validityPeriod, another.validityPeriod)
        && Objects.equals(additionalCharacteristic, another.additionalCharacteristic)
        && Objects.equals(id, another.id)
        && Objects.equals(lastUpdated, another.lastUpdated)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(additionalIdentifier, another.additionalIdentifier)
        && Objects.equals(text, another.text)
        && Objects.equals(status, another.status)
        && Objects.equals(type, another.type)
        && resourceType.equals(another.resourceType)
        && Objects.equals(classification, another.classification)
        && Objects.equals(meta, another.meta)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(orderable, another.orderable)
        && Objects.equals(language, another.language)
        && Objects.equals(extension, another.extension)
        && referencedItem.equals(another.referencedItem)
        && Objects.equals(validTo, another.validTo)
        && Objects.equals(contained, another.contained)
        && Objects.equals(relatedEntry, another.relatedEntry);
  }

  /**
   * Computes a hash code from attributes: {@code additionalClassification}, {@code implicitRules}, {@code validityPeriod}, {@code additionalCharacteristic}, {@code id}, {@code lastUpdated}, {@code identifier}, {@code additionalIdentifier}, {@code text}, {@code status}, {@code type}, {@code resourceType}, {@code classification}, {@code meta}, {@code modifierExtension}, {@code orderable}, {@code language}, {@code extension}, {@code referencedItem}, {@code validTo}, {@code contained}, {@code relatedEntry}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(additionalClassification);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(validityPeriod);
    h += (h << 5) + Objects.hashCode(additionalCharacteristic);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(lastUpdated);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(additionalIdentifier);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(classification);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(orderable);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + referencedItem.hashCode();
    h += (h << 5) + Objects.hashCode(validTo);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(relatedEntry);
    return h;
  }

  /**
   * Prints the immutable value {@code CatalogEntry} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CatalogEntry{");
    if (additionalClassification != null) {
      builder.append("additionalClassification=").append(additionalClassification);
    }
    if (implicitRules != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (validityPeriod != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("validityPeriod=").append(validityPeriod);
    }
    if (additionalCharacteristic != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("additionalCharacteristic=").append(additionalCharacteristic);
    }
    if (id != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (lastUpdated != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("lastUpdated=").append(lastUpdated);
    }
    if (identifier != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (additionalIdentifier != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("additionalIdentifier=").append(additionalIdentifier);
    }
    if (text != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (status != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (type != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (classification != null) {
      builder.append(", ");
      builder.append("classification=").append(classification);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (orderable != null) {
      builder.append(", ");
      builder.append("orderable=").append(orderable);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    builder.append(", ");
    builder.append("referencedItem=").append(referencedItem);
    if (validTo != null) {
      builder.append(", ");
      builder.append("validTo=").append(validTo);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (relatedEntry != null) {
      builder.append(", ");
      builder.append("relatedEntry=").append(relatedEntry);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CatalogEntry", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CatalogEntry {
    @Nullable Optional<List<CodeableConcept>> additionalClassification = Optional.empty();
    boolean additionalClassificationIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Period> validityPeriod = Optional.empty();
    boolean validityPeriodIsSet;
    @Nullable Optional<List<CodeableConcept>> additionalCharacteristic = Optional.empty();
    boolean additionalCharacteristicIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<DateTime> lastUpdated = Optional.empty();
    boolean lastUpdatedIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Identifier>> additionalIdentifier = Optional.empty();
    boolean additionalIdentifierIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<CatalogentryStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<CodeableConcept>> classification = Optional.empty();
    boolean classificationIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Boolean> orderable = Optional.empty();
    boolean orderableIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Reference referencedItem;
    @Nullable Optional<DateTime> validTo = Optional.empty();
    boolean validToIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<CatalogEntry_RelatedEntry>> relatedEntry = Optional.empty();
    boolean relatedEntryIsSet;
    @JsonProperty("additionalClassification")
    public void setAdditionalClassification(Optional<List<CodeableConcept>> additionalClassification) {
      this.additionalClassification = additionalClassification;
      this.additionalClassificationIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(Optional<Period> validityPeriod) {
      this.validityPeriod = validityPeriod;
      this.validityPeriodIsSet = true;
    }
    @JsonProperty("additionalCharacteristic")
    public void setAdditionalCharacteristic(Optional<List<CodeableConcept>> additionalCharacteristic) {
      this.additionalCharacteristic = additionalCharacteristic;
      this.additionalCharacteristicIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("lastUpdated")
    public void setLastUpdated(Optional<DateTime> lastUpdated) {
      this.lastUpdated = lastUpdated;
      this.lastUpdatedIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("additionalIdentifier")
    public void setAdditionalIdentifier(Optional<List<Identifier>> additionalIdentifier) {
      this.additionalIdentifier = additionalIdentifier;
      this.additionalIdentifierIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<CatalogentryStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("classification")
    public void setClassification(Optional<List<CodeableConcept>> classification) {
      this.classification = classification;
      this.classificationIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("orderable")
    public void setOrderable(Optional<Boolean> orderable) {
      this.orderable = orderable;
      this.orderableIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("referencedItem")
    public void setReferencedItem(Reference referencedItem) {
      this.referencedItem = referencedItem;
    }
    @JsonProperty("validTo")
    public void setValidTo(Optional<DateTime> validTo) {
      this.validTo = validTo;
      this.validToIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("relatedEntry")
    public void setRelatedEntry(Optional<List<CatalogEntry_RelatedEntry>> relatedEntry) {
      this.relatedEntry = relatedEntry;
      this.relatedEntryIsSet = true;
    }
    @Override
    public Optional<List<CodeableConcept>> additionalClassification() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> validityPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> additionalCharacteristic() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> lastUpdated() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> additionalIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CatalogentryStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> classification() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> orderable() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference referencedItem() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> validTo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CatalogEntry_RelatedEntry>> relatedEntry() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCatalogEntry fromJson(Json json) {
    ImmutableCatalogEntry.Builder builder = ((ImmutableCatalogEntry.Builder) ImmutableCatalogEntry.builder());
    if (json.additionalClassificationIsSet) {
      builder.additionalClassification(json.additionalClassification);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.validityPeriodIsSet) {
      builder.validityPeriod(json.validityPeriod);
    }
    if (json.additionalCharacteristicIsSet) {
      builder.additionalCharacteristic(json.additionalCharacteristic);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.lastUpdatedIsSet) {
      builder.lastUpdated(json.lastUpdated);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.additionalIdentifierIsSet) {
      builder.additionalIdentifier(json.additionalIdentifier);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.classificationIsSet) {
      builder.classification(json.classification);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.orderableIsSet) {
      builder.orderable(json.orderable);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.referencedItem != null) {
      builder.referencedItem(json.referencedItem);
    }
    if (json.validToIsSet) {
      builder.validTo(json.validTo);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.relatedEntryIsSet) {
      builder.relatedEntry(json.relatedEntry);
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
        .additionalClassification(instance.additionalClassification())
        .implicitRules(instance.implicitRules())
        .validityPeriod(instance.validityPeriod())
        .additionalCharacteristic(instance.additionalCharacteristic())
        .id(instance.id())
        .lastUpdated(instance.lastUpdated())
        .identifier(instance.identifier())
        .additionalIdentifier(instance.additionalIdentifier())
        .text(instance.text())
        .status(instance.status())
        .type(instance.type())
        .resourceType(instance.resourceType())
        .classification(instance.classification())
        .meta(instance.meta())
        .modifierExtension(instance.modifierExtension())
        .orderable(instance.orderable())
        .language(instance.language())
        .extension(instance.extension())
        .referencedItem(instance.referencedItem())
        .validTo(instance.validTo())
        .contained(instance.contained())
        .relatedEntry(instance.relatedEntry())
        .build();
  }

  /**
   * Creates a builder for {@link CatalogEntry CatalogEntry}.
   * <pre>
   * ImmutableCatalogEntry.builder()
   *    .additionalClassification(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link CatalogEntry#additionalClassification() additionalClassification}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link CatalogEntry#implicitRules() implicitRules}
   *    .validityPeriod(com.medplum.types.fhir.Period) // optional {@link CatalogEntry#validityPeriod() validityPeriod}
   *    .additionalCharacteristic(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link CatalogEntry#additionalCharacteristic() additionalCharacteristic}
   *    .id(com.medplum.types.fhir.Id) // optional {@link CatalogEntry#id() id}
   *    .lastUpdated(com.medplum.types.fhir.DateTime) // optional {@link CatalogEntry#lastUpdated() lastUpdated}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link CatalogEntry#identifier() identifier}
   *    .additionalIdentifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link CatalogEntry#additionalIdentifier() additionalIdentifier}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link CatalogEntry#text() text}
   *    .status(com.medplum.types.fhir.CatalogentryStatus) // optional {@link CatalogEntry#status() status}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link CatalogEntry#type() type}
   *    .resourceType(String) // required {@link CatalogEntry#resourceType() resourceType}
   *    .classification(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link CatalogEntry#classification() classification}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link CatalogEntry#meta() meta}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CatalogEntry#modifierExtension() modifierExtension}
   *    .orderable(Boolean) // optional {@link CatalogEntry#orderable() orderable}
   *    .language(com.medplum.types.fhir.Code) // optional {@link CatalogEntry#language() language}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CatalogEntry#extension() extension}
   *    .referencedItem(com.medplum.types.fhir.Reference) // required {@link CatalogEntry#referencedItem() referencedItem}
   *    .validTo(com.medplum.types.fhir.DateTime) // optional {@link CatalogEntry#validTo() validTo}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link CatalogEntry#contained() contained}
   *    .relatedEntry(List&amp;lt;com.medplum.types.fhir.CatalogEntry_RelatedEntry&amp;gt;) // optional {@link CatalogEntry#relatedEntry() relatedEntry}
   *    .build();
   * </pre>
   * @return A new CatalogEntry builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableCatalogEntry.Builder();
  }

  /**
   * Builds instances of type {@link CatalogEntry CatalogEntry}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CatalogEntry", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, ReferencedItemBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_REFERENCED_ITEM = 0x2L;
    private static final long OPT_BIT_ADDITIONAL_CLASSIFICATION = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_VALIDITY_PERIOD = 0x4L;
    private static final long OPT_BIT_ADDITIONAL_CHARACTERISTIC = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_LAST_UPDATED = 0x20L;
    private static final long OPT_BIT_IDENTIFIER = 0x40L;
    private static final long OPT_BIT_ADDITIONAL_IDENTIFIER = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_TYPE = 0x400L;
    private static final long OPT_BIT_CLASSIFICATION = 0x800L;
    private static final long OPT_BIT_META = 0x1000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000L;
    private static final long OPT_BIT_ORDERABLE = 0x4000L;
    private static final long OPT_BIT_LANGUAGE = 0x8000L;
    private static final long OPT_BIT_EXTENSION = 0x10000L;
    private static final long OPT_BIT_VALID_TO = 0x20000L;
    private static final long OPT_BIT_CONTAINED = 0x40000L;
    private static final long OPT_BIT_RELATED_ENTRY = 0x80000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<CodeableConcept> additionalClassification;
    private @Nullable Uri implicitRules;
    private @Nullable Period validityPeriod;
    private @Nullable List<CodeableConcept> additionalCharacteristic;
    private @Nullable Id id;
    private @Nullable DateTime lastUpdated;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Identifier> additionalIdentifier;
    private @Nullable Narrative text;
    private @Nullable CatalogentryStatus status;
    private @Nullable CodeableConcept type;
    private @Nullable String resourceType;
    private @Nullable List<CodeableConcept> classification;
    private @Nullable Meta meta;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Boolean orderable;
    private @Nullable Code language;
    private @Nullable List<Extension> extension;
    private @Nullable Reference referencedItem;
    private @Nullable DateTime validTo;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<CatalogEntry_RelatedEntry> relatedEntry;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CatalogEntry#additionalClassification() additionalClassification} to additionalClassification.
     * @param additionalClassification The value for additionalClassification
     * @return {@code this} builder for chained invocation
     */
    public final Builder additionalClassification(List<CodeableConcept> additionalClassification) {
      checkNotIsSet(additionalClassificationIsSet(), "additionalClassification");
      this.additionalClassification = Objects.requireNonNull(additionalClassification, "additionalClassification");
      optBits |= OPT_BIT_ADDITIONAL_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#additionalClassification() additionalClassification} to additionalClassification.
     * @param additionalClassification The value for additionalClassification
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("additionalClassification")
    public final Builder additionalClassification(Optional<? extends List<CodeableConcept>> additionalClassification) {
      checkNotIsSet(additionalClassificationIsSet(), "additionalClassification");
      this.additionalClassification = additionalClassification.orElse(null);
      optBits |= OPT_BIT_ADDITIONAL_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CatalogEntry#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CatalogEntry#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder validityPeriod(Period validityPeriod) {
      checkNotIsSet(validityPeriodIsSet(), "validityPeriod");
      this.validityPeriod = Objects.requireNonNull(validityPeriod, "validityPeriod");
      optBits |= OPT_BIT_VALIDITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("validityPeriod")
    public final Builder validityPeriod(Optional<? extends Period> validityPeriod) {
      checkNotIsSet(validityPeriodIsSet(), "validityPeriod");
      this.validityPeriod = validityPeriod.orElse(null);
      optBits |= OPT_BIT_VALIDITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#additionalCharacteristic() additionalCharacteristic} to additionalCharacteristic.
     * @param additionalCharacteristic The value for additionalCharacteristic
     * @return {@code this} builder for chained invocation
     */
    public final Builder additionalCharacteristic(List<CodeableConcept> additionalCharacteristic) {
      checkNotIsSet(additionalCharacteristicIsSet(), "additionalCharacteristic");
      this.additionalCharacteristic = Objects.requireNonNull(additionalCharacteristic, "additionalCharacteristic");
      optBits |= OPT_BIT_ADDITIONAL_CHARACTERISTIC;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#additionalCharacteristic() additionalCharacteristic} to additionalCharacteristic.
     * @param additionalCharacteristic The value for additionalCharacteristic
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("additionalCharacteristic")
    public final Builder additionalCharacteristic(Optional<? extends List<CodeableConcept>> additionalCharacteristic) {
      checkNotIsSet(additionalCharacteristicIsSet(), "additionalCharacteristic");
      this.additionalCharacteristic = additionalCharacteristic.orElse(null);
      optBits |= OPT_BIT_ADDITIONAL_CHARACTERISTIC;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#id() id} to id.
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
     * Initializes the optional value {@link CatalogEntry#id() id} to id.
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
     * Initializes the optional value {@link CatalogEntry#lastUpdated() lastUpdated} to lastUpdated.
     * @param lastUpdated The value for lastUpdated
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastUpdated(DateTime lastUpdated) {
      checkNotIsSet(lastUpdatedIsSet(), "lastUpdated");
      this.lastUpdated = Objects.requireNonNull(lastUpdated, "lastUpdated");
      optBits |= OPT_BIT_LAST_UPDATED;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#lastUpdated() lastUpdated} to lastUpdated.
     * @param lastUpdated The value for lastUpdated
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastUpdated")
    public final Builder lastUpdated(Optional<? extends DateTime> lastUpdated) {
      checkNotIsSet(lastUpdatedIsSet(), "lastUpdated");
      this.lastUpdated = lastUpdated.orElse(null);
      optBits |= OPT_BIT_LAST_UPDATED;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CatalogEntry#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CatalogEntry#additionalIdentifier() additionalIdentifier} to additionalIdentifier.
     * @param additionalIdentifier The value for additionalIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder additionalIdentifier(List<Identifier> additionalIdentifier) {
      checkNotIsSet(additionalIdentifierIsSet(), "additionalIdentifier");
      this.additionalIdentifier = Objects.requireNonNull(additionalIdentifier, "additionalIdentifier");
      optBits |= OPT_BIT_ADDITIONAL_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#additionalIdentifier() additionalIdentifier} to additionalIdentifier.
     * @param additionalIdentifier The value for additionalIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("additionalIdentifier")
    public final Builder additionalIdentifier(Optional<? extends List<Identifier>> additionalIdentifier) {
      checkNotIsSet(additionalIdentifierIsSet(), "additionalIdentifier");
      this.additionalIdentifier = additionalIdentifier.orElse(null);
      optBits |= OPT_BIT_ADDITIONAL_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#text() text} to text.
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
     * Initializes the optional value {@link CatalogEntry#text() text} to text.
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
     * Initializes the optional value {@link CatalogEntry#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(CatalogentryStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends CatalogentryStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link CatalogEntry#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link CatalogEntry#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for chained invocation
     */
    public final Builder classification(List<CodeableConcept> classification) {
      checkNotIsSet(classificationIsSet(), "classification");
      this.classification = Objects.requireNonNull(classification, "classification");
      optBits |= OPT_BIT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("classification")
    public final Builder classification(Optional<? extends List<CodeableConcept>> classification) {
      checkNotIsSet(classificationIsSet(), "classification");
      this.classification = classification.orElse(null);
      optBits |= OPT_BIT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#meta() meta} to meta.
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
     * Initializes the optional value {@link CatalogEntry#meta() meta} to meta.
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
     * Initializes the optional value {@link CatalogEntry#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CatalogEntry#modifierExtension() modifierExtension} to modifierExtension.
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
    @JsonProperty("orderable")
    public final Builder orderable(Optional<Boolean> orderable) {
      checkNotIsSet(orderableIsSet(), "orderable");
      this.orderable = orderable.orElse(null);
      optBits |= OPT_BIT_ORDERABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#language() language} to language.
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
     * Initializes the optional value {@link CatalogEntry#language() language} to language.
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
     * Initializes the optional value {@link CatalogEntry#extension() extension} to extension.
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
     * Initializes the optional value {@link CatalogEntry#extension() extension} to extension.
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
     * Initializes the value for the {@link CatalogEntry#referencedItem() referencedItem} attribute.
     * @param referencedItem The value for referencedItem 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referencedItem")
    public final Builder referencedItem(Reference referencedItem) {
      checkNotIsSet(referencedItemIsSet(), "referencedItem");
      this.referencedItem = Objects.requireNonNull(referencedItem, "referencedItem");
      initBits &= ~INIT_BIT_REFERENCED_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#validTo() validTo} to validTo.
     * @param validTo The value for validTo
     * @return {@code this} builder for chained invocation
     */
    public final Builder validTo(DateTime validTo) {
      checkNotIsSet(validToIsSet(), "validTo");
      this.validTo = Objects.requireNonNull(validTo, "validTo");
      optBits |= OPT_BIT_VALID_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#validTo() validTo} to validTo.
     * @param validTo The value for validTo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("validTo")
    public final Builder validTo(Optional<? extends DateTime> validTo) {
      checkNotIsSet(validToIsSet(), "validTo");
      this.validTo = validTo.orElse(null);
      optBits |= OPT_BIT_VALID_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#contained() contained} to contained.
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
     * Initializes the optional value {@link CatalogEntry#contained() contained} to contained.
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
     * Initializes the optional value {@link CatalogEntry#relatedEntry() relatedEntry} to relatedEntry.
     * @param relatedEntry The value for relatedEntry
     * @return {@code this} builder for chained invocation
     */
    public final Builder relatedEntry(List<CatalogEntry_RelatedEntry> relatedEntry) {
      checkNotIsSet(relatedEntryIsSet(), "relatedEntry");
      this.relatedEntry = Objects.requireNonNull(relatedEntry, "relatedEntry");
      optBits |= OPT_BIT_RELATED_ENTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link CatalogEntry#relatedEntry() relatedEntry} to relatedEntry.
     * @param relatedEntry The value for relatedEntry
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relatedEntry")
    public final Builder relatedEntry(Optional<? extends List<CatalogEntry_RelatedEntry>> relatedEntry) {
      checkNotIsSet(relatedEntryIsSet(), "relatedEntry");
      this.relatedEntry = relatedEntry.orElse(null);
      optBits |= OPT_BIT_RELATED_ENTRY;
      return this;
    }

    /**
     * Builds a new {@link CatalogEntry CatalogEntry}.
     * @return An immutable instance of CatalogEntry
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CatalogEntry build() {
      checkRequiredAttributes();
      return new ImmutableCatalogEntry(
          additionalClassification,
          implicitRules,
          validityPeriod,
          additionalCharacteristic,
          id,
          lastUpdated,
          identifier,
          additionalIdentifier,
          text,
          status,
          type,
          resourceType,
          classification,
          meta,
          modifierExtension,
          orderable,
          language,
          extension,
          referencedItem,
          validTo,
          contained,
          relatedEntry);
    }

    private boolean additionalClassificationIsSet() {
      return (optBits & OPT_BIT_ADDITIONAL_CLASSIFICATION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean validityPeriodIsSet() {
      return (optBits & OPT_BIT_VALIDITY_PERIOD) != 0;
    }

    private boolean additionalCharacteristicIsSet() {
      return (optBits & OPT_BIT_ADDITIONAL_CHARACTERISTIC) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean lastUpdatedIsSet() {
      return (optBits & OPT_BIT_LAST_UPDATED) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean additionalIdentifierIsSet() {
      return (optBits & OPT_BIT_ADDITIONAL_IDENTIFIER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean classificationIsSet() {
      return (optBits & OPT_BIT_CLASSIFICATION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean orderableIsSet() {
      return (optBits & OPT_BIT_ORDERABLE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean validToIsSet() {
      return (optBits & OPT_BIT_VALID_TO) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean relatedEntryIsSet() {
      return (optBits & OPT_BIT_RELATED_ENTRY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean referencedItemIsSet() {
      return (initBits & INIT_BIT_REFERENCED_ITEM) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CatalogEntry is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!referencedItemIsSet()) attributes.add("referencedItem");
      return "Cannot build CatalogEntry, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "CatalogEntry", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link CatalogEntry#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    ReferencedItemBuildStage resourceType(String resourceType);
  }

  @Generated(from = "CatalogEntry", generator = "Immutables")
  public interface ReferencedItemBuildStage {
    /**
     * Initializes the value for the {@link CatalogEntry#referencedItem() referencedItem} attribute.
     * @param referencedItem The value for referencedItem 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referencedItem(Reference referencedItem);
  }

  @Generated(from = "CatalogEntry", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CatalogEntry#additionalClassification() additionalClassification} to additionalClassification.
     * @param additionalClassification The value for additionalClassification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal additionalClassification(List<CodeableConcept> additionalClassification);

    /**
     * Initializes the optional value {@link CatalogEntry#additionalClassification() additionalClassification} to additionalClassification.
     * @param additionalClassification The value for additionalClassification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal additionalClassification(Optional<? extends List<CodeableConcept>> additionalClassification);

    /**
     * Initializes the optional value {@link CatalogEntry#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link CatalogEntry#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link CatalogEntry#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validityPeriod(Period validityPeriod);

    /**
     * Initializes the optional value {@link CatalogEntry#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validityPeriod(Optional<? extends Period> validityPeriod);

    /**
     * Initializes the optional value {@link CatalogEntry#additionalCharacteristic() additionalCharacteristic} to additionalCharacteristic.
     * @param additionalCharacteristic The value for additionalCharacteristic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal additionalCharacteristic(List<CodeableConcept> additionalCharacteristic);

    /**
     * Initializes the optional value {@link CatalogEntry#additionalCharacteristic() additionalCharacteristic} to additionalCharacteristic.
     * @param additionalCharacteristic The value for additionalCharacteristic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal additionalCharacteristic(Optional<? extends List<CodeableConcept>> additionalCharacteristic);

    /**
     * Initializes the optional value {@link CatalogEntry#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link CatalogEntry#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link CatalogEntry#lastUpdated() lastUpdated} to lastUpdated.
     * @param lastUpdated The value for lastUpdated
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastUpdated(DateTime lastUpdated);

    /**
     * Initializes the optional value {@link CatalogEntry#lastUpdated() lastUpdated} to lastUpdated.
     * @param lastUpdated The value for lastUpdated
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastUpdated(Optional<? extends DateTime> lastUpdated);

    /**
     * Initializes the optional value {@link CatalogEntry#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link CatalogEntry#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link CatalogEntry#additionalIdentifier() additionalIdentifier} to additionalIdentifier.
     * @param additionalIdentifier The value for additionalIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal additionalIdentifier(List<Identifier> additionalIdentifier);

    /**
     * Initializes the optional value {@link CatalogEntry#additionalIdentifier() additionalIdentifier} to additionalIdentifier.
     * @param additionalIdentifier The value for additionalIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal additionalIdentifier(Optional<? extends List<Identifier>> additionalIdentifier);

    /**
     * Initializes the optional value {@link CatalogEntry#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link CatalogEntry#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link CatalogEntry#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(CatalogentryStatus status);

    /**
     * Initializes the optional value {@link CatalogEntry#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends CatalogentryStatus> status);

    /**
     * Initializes the optional value {@link CatalogEntry#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link CatalogEntry#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link CatalogEntry#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal classification(List<CodeableConcept> classification);

    /**
     * Initializes the optional value {@link CatalogEntry#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal classification(Optional<? extends List<CodeableConcept>> classification);

    /**
     * Initializes the optional value {@link CatalogEntry#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link CatalogEntry#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link CatalogEntry#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CatalogEntry#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

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
    BuildFinal orderable(Optional<Boolean> orderable);

    /**
     * Initializes the optional value {@link CatalogEntry#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link CatalogEntry#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link CatalogEntry#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link CatalogEntry#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link CatalogEntry#validTo() validTo} to validTo.
     * @param validTo The value for validTo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validTo(DateTime validTo);

    /**
     * Initializes the optional value {@link CatalogEntry#validTo() validTo} to validTo.
     * @param validTo The value for validTo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validTo(Optional<? extends DateTime> validTo);

    /**
     * Initializes the optional value {@link CatalogEntry#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link CatalogEntry#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link CatalogEntry#relatedEntry() relatedEntry} to relatedEntry.
     * @param relatedEntry The value for relatedEntry
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedEntry(List<CatalogEntry_RelatedEntry> relatedEntry);

    /**
     * Initializes the optional value {@link CatalogEntry#relatedEntry() relatedEntry} to relatedEntry.
     * @param relatedEntry The value for relatedEntry
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedEntry(Optional<? extends List<CatalogEntry_RelatedEntry>> relatedEntry);

    /**
     * Builds a new {@link CatalogEntry CatalogEntry}.
     * @return An immutable instance of CatalogEntry
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CatalogEntry build();
  }
}
