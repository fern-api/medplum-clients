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
 * Immutable implementation of {@link BiologicallyDerivedProduct}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBiologicallyDerivedProduct.builder()}.
 */
@Generated(from = "BiologicallyDerivedProduct", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBiologicallyDerivedProduct
    implements BiologicallyDerivedProduct {
  private final @Nullable List<Identifier> identifier;
  private final String resourceType;
  private final @Nullable List<Extension> extension;
  private final @Nullable Id id;
  private final @Nullable BiologicallyDerivedProduct_Manipulation manipulation;
  private final @Nullable List<BiologicallyDerivedProduct_Storage> storage;
  private final @Nullable Integer quantity;
  private final @Nullable Narrative text;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable BiologicallyderivedproductStatus status;
  private final @Nullable List<BiologicallyDerivedProduct_Processing> processing;
  private final @Nullable BiologicallyDerivedProduct_Collection collection;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Reference> parent;
  private final @Nullable CodeableConcept productCode;
  private final @Nullable Meta meta;
  private final @Nullable Code language;
  private final @Nullable List<Reference> request;
  private final @Nullable BiologicallyderivedproductProductcategory productCategory;

  private ImmutableBiologicallyDerivedProduct(
      @Nullable List<Identifier> identifier,
      String resourceType,
      @Nullable List<Extension> extension,
      @Nullable Id id,
      @Nullable BiologicallyDerivedProduct_Manipulation manipulation,
      @Nullable List<BiologicallyDerivedProduct_Storage> storage,
      @Nullable Integer quantity,
      @Nullable Narrative text,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<ResourceList> contained,
      @Nullable BiologicallyderivedproductStatus status,
      @Nullable List<BiologicallyDerivedProduct_Processing> processing,
      @Nullable BiologicallyDerivedProduct_Collection collection,
      @Nullable Uri implicitRules,
      @Nullable List<Reference> parent,
      @Nullable CodeableConcept productCode,
      @Nullable Meta meta,
      @Nullable Code language,
      @Nullable List<Reference> request,
      @Nullable BiologicallyderivedproductProductcategory productCategory) {
    this.identifier = identifier;
    this.resourceType = resourceType;
    this.extension = extension;
    this.id = id;
    this.manipulation = manipulation;
    this.storage = storage;
    this.quantity = quantity;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.contained = contained;
    this.status = status;
    this.processing = processing;
    this.collection = collection;
    this.implicitRules = implicitRules;
    this.parent = parent;
    this.productCode = productCode;
    this.meta = meta;
    this.language = language;
    this.request = request;
    this.productCategory = productCategory;
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code manipulation} attribute
   */
  @JsonProperty("manipulation")
  @Override
  public Optional<BiologicallyDerivedProduct_Manipulation> manipulation() {
    return Optional.ofNullable(manipulation);
  }

  /**
   * @return The value of the {@code storage} attribute
   */
  @JsonProperty("storage")
  @Override
  public Optional<List<BiologicallyDerivedProduct_Storage>> storage() {
    return Optional.ofNullable(storage);
  }

  /**
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Optional<Integer> quantity() {
    return Optional.ofNullable(quantity);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<BiologicallyderivedproductStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code processing} attribute
   */
  @JsonProperty("processing")
  @Override
  public Optional<List<BiologicallyDerivedProduct_Processing>> processing() {
    return Optional.ofNullable(processing);
  }

  /**
   * @return The value of the {@code collection} attribute
   */
  @JsonProperty("collection")
  @Override
  public Optional<BiologicallyDerivedProduct_Collection> collection() {
    return Optional.ofNullable(collection);
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
   * @return The value of the {@code parent} attribute
   */
  @JsonProperty("parent")
  @Override
  public Optional<List<Reference>> parent() {
    return Optional.ofNullable(parent);
  }

  /**
   * @return The value of the {@code productCode} attribute
   */
  @JsonProperty("productCode")
  @Override
  public Optional<CodeableConcept> productCode() {
    return Optional.ofNullable(productCode);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code request} attribute
   */
  @JsonProperty("request")
  @Override
  public Optional<List<Reference>> request() {
    return Optional.ofNullable(request);
  }

  /**
   * @return The value of the {@code productCategory} attribute
   */
  @JsonProperty("productCategory")
  @Override
  public Optional<BiologicallyderivedproductProductcategory> productCategory() {
    return Optional.ofNullable(productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        newValue,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        value,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BiologicallyDerivedProduct#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        newValue,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        newValue,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        value,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        newValue,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        value,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#manipulation() manipulation} attribute.
   * @param value The value for manipulation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withManipulation(BiologicallyDerivedProduct_Manipulation value) {
    @Nullable BiologicallyDerivedProduct_Manipulation newValue = Objects.requireNonNull(value, "manipulation");
    if (this.manipulation == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        newValue,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#manipulation() manipulation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manipulation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withManipulation(Optional<? extends BiologicallyDerivedProduct_Manipulation> optional) {
    @Nullable BiologicallyDerivedProduct_Manipulation value = optional.orElse(null);
    if (this.manipulation == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        value,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#storage() storage} attribute.
   * @param value The value for storage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withStorage(List<BiologicallyDerivedProduct_Storage> value) {
    @Nullable List<BiologicallyDerivedProduct_Storage> newValue = Objects.requireNonNull(value, "storage");
    if (this.storage == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        newValue,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#storage() storage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for storage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withStorage(Optional<? extends List<BiologicallyDerivedProduct_Storage>> optional) {
    @Nullable List<BiologicallyDerivedProduct_Storage> value = optional.orElse(null);
    if (this.storage == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        value,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withQuantity(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.quantity, newValue)) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        newValue,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#quantity() quantity} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withQuantity(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.quantity, value)) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        value,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        newValue,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        value,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        newValue,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        value,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        newValue,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        value,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withStatus(BiologicallyderivedproductStatus value) {
    @Nullable BiologicallyderivedproductStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        newValue,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withStatus(Optional<? extends BiologicallyderivedproductStatus> optional) {
    @Nullable BiologicallyderivedproductStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        value,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#processing() processing} attribute.
   * @param value The value for processing
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withProcessing(List<BiologicallyDerivedProduct_Processing> value) {
    @Nullable List<BiologicallyDerivedProduct_Processing> newValue = Objects.requireNonNull(value, "processing");
    if (this.processing == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        newValue,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#processing() processing} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for processing
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withProcessing(Optional<? extends List<BiologicallyDerivedProduct_Processing>> optional) {
    @Nullable List<BiologicallyDerivedProduct_Processing> value = optional.orElse(null);
    if (this.processing == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        value,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#collection() collection} attribute.
   * @param value The value for collection
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withCollection(BiologicallyDerivedProduct_Collection value) {
    @Nullable BiologicallyDerivedProduct_Collection newValue = Objects.requireNonNull(value, "collection");
    if (this.collection == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        newValue,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#collection() collection} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for collection
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withCollection(Optional<? extends BiologicallyDerivedProduct_Collection> optional) {
    @Nullable BiologicallyDerivedProduct_Collection value = optional.orElse(null);
    if (this.collection == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        value,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        newValue,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        value,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#parent() parent} attribute.
   * @param value The value for parent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withParent(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "parent");
    if (this.parent == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        newValue,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#parent() parent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withParent(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.parent == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        value,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#productCode() productCode} attribute.
   * @param value The value for productCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withProductCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "productCode");
    if (this.productCode == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        newValue,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#productCode() productCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withProductCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.productCode == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        value,
        this.meta,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        newValue,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        value,
        this.language,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        newValue,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        value,
        this.request,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withRequest(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        newValue,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withRequest(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        value,
        this.productCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#productCategory() productCategory} attribute.
   * @param value The value for productCategory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withProductCategory(BiologicallyderivedproductProductcategory value) {
    @Nullable BiologicallyderivedproductProductcategory newValue = Objects.requireNonNull(value, "productCategory");
    if (this.productCategory == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#productCategory() productCategory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productCategory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withProductCategory(Optional<? extends BiologicallyderivedproductProductcategory> optional) {
    @Nullable BiologicallyderivedproductProductcategory value = optional.orElse(null);
    if (this.productCategory == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.identifier,
        this.resourceType,
        this.extension,
        this.id,
        this.manipulation,
        this.storage,
        this.quantity,
        this.text,
        this.modifierExtension,
        this.contained,
        this.status,
        this.processing,
        this.collection,
        this.implicitRules,
        this.parent,
        this.productCode,
        this.meta,
        this.language,
        this.request,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBiologicallyDerivedProduct} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBiologicallyDerivedProduct
        && equalTo((ImmutableBiologicallyDerivedProduct) another);
  }

  private boolean equalTo(ImmutableBiologicallyDerivedProduct another) {
    return Objects.equals(identifier, another.identifier)
        && resourceType.equals(another.resourceType)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(manipulation, another.manipulation)
        && Objects.equals(storage, another.storage)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(text, another.text)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(contained, another.contained)
        && Objects.equals(status, another.status)
        && Objects.equals(processing, another.processing)
        && Objects.equals(collection, another.collection)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(parent, another.parent)
        && Objects.equals(productCode, another.productCode)
        && Objects.equals(meta, another.meta)
        && Objects.equals(language, another.language)
        && Objects.equals(request, another.request)
        && Objects.equals(productCategory, another.productCategory);
  }

  /**
   * Computes a hash code from attributes: {@code identifier}, {@code resourceType}, {@code extension}, {@code id}, {@code manipulation}, {@code storage}, {@code quantity}, {@code text}, {@code modifierExtension}, {@code contained}, {@code status}, {@code processing}, {@code collection}, {@code implicitRules}, {@code parent}, {@code productCode}, {@code meta}, {@code language}, {@code request}, {@code productCategory}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(manipulation);
    h += (h << 5) + Objects.hashCode(storage);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(processing);
    h += (h << 5) + Objects.hashCode(collection);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(parent);
    h += (h << 5) + Objects.hashCode(productCode);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(request);
    h += (h << 5) + Objects.hashCode(productCategory);
    return h;
  }

  /**
   * Prints the immutable value {@code BiologicallyDerivedProduct} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("BiologicallyDerivedProduct{");
    if (identifier != null) {
      builder.append("identifier=").append(identifier);
    }
    if (builder.length() > 27) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (manipulation != null) {
      builder.append(", ");
      builder.append("manipulation=").append(manipulation);
    }
    if (storage != null) {
      builder.append(", ");
      builder.append("storage=").append(storage);
    }
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (processing != null) {
      builder.append(", ");
      builder.append("processing=").append(processing);
    }
    if (collection != null) {
      builder.append(", ");
      builder.append("collection=").append(collection);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (parent != null) {
      builder.append(", ");
      builder.append("parent=").append(parent);
    }
    if (productCode != null) {
      builder.append(", ");
      builder.append("productCode=").append(productCode);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (request != null) {
      builder.append(", ");
      builder.append("request=").append(request);
    }
    if (productCategory != null) {
      builder.append(", ");
      builder.append("productCategory=").append(productCategory);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "BiologicallyDerivedProduct", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements BiologicallyDerivedProduct {
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<BiologicallyDerivedProduct_Manipulation> manipulation = Optional.empty();
    boolean manipulationIsSet;
    @Nullable Optional<List<BiologicallyDerivedProduct_Storage>> storage = Optional.empty();
    boolean storageIsSet;
    @Nullable Optional<Integer> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<BiologicallyderivedproductStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<BiologicallyDerivedProduct_Processing>> processing = Optional.empty();
    boolean processingIsSet;
    @Nullable Optional<BiologicallyDerivedProduct_Collection> collection = Optional.empty();
    boolean collectionIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Reference>> parent = Optional.empty();
    boolean parentIsSet;
    @Nullable Optional<CodeableConcept> productCode = Optional.empty();
    boolean productCodeIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Reference>> request = Optional.empty();
    boolean requestIsSet;
    @Nullable Optional<BiologicallyderivedproductProductcategory> productCategory = Optional.empty();
    boolean productCategoryIsSet;
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("manipulation")
    public void setManipulation(Optional<BiologicallyDerivedProduct_Manipulation> manipulation) {
      this.manipulation = manipulation;
      this.manipulationIsSet = true;
    }
    @JsonProperty("storage")
    public void setStorage(Optional<List<BiologicallyDerivedProduct_Storage>> storage) {
      this.storage = storage;
      this.storageIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Integer> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<BiologicallyderivedproductStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("processing")
    public void setProcessing(Optional<List<BiologicallyDerivedProduct_Processing>> processing) {
      this.processing = processing;
      this.processingIsSet = true;
    }
    @JsonProperty("collection")
    public void setCollection(Optional<BiologicallyDerivedProduct_Collection> collection) {
      this.collection = collection;
      this.collectionIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("parent")
    public void setParent(Optional<List<Reference>> parent) {
      this.parent = parent;
      this.parentIsSet = true;
    }
    @JsonProperty("productCode")
    public void setProductCode(Optional<CodeableConcept> productCode) {
      this.productCode = productCode;
      this.productCodeIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("request")
    public void setRequest(Optional<List<Reference>> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @JsonProperty("productCategory")
    public void setProductCategory(Optional<BiologicallyderivedproductProductcategory> productCategory) {
      this.productCategory = productCategory;
      this.productCategoryIsSet = true;
    }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<BiologicallyDerivedProduct_Manipulation> manipulation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<BiologicallyDerivedProduct_Storage>> storage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<BiologicallyderivedproductStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<BiologicallyDerivedProduct_Processing>> processing() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<BiologicallyDerivedProduct_Collection> collection() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> parent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> productCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> request() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<BiologicallyderivedproductProductcategory> productCategory() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableBiologicallyDerivedProduct fromJson(Json json) {
    ImmutableBiologicallyDerivedProduct.Builder builder = ((ImmutableBiologicallyDerivedProduct.Builder) ImmutableBiologicallyDerivedProduct.builder());
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.manipulationIsSet) {
      builder.manipulation(json.manipulation);
    }
    if (json.storageIsSet) {
      builder.storage(json.storage);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.processingIsSet) {
      builder.processing(json.processing);
    }
    if (json.collectionIsSet) {
      builder.collection(json.collection);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.parentIsSet) {
      builder.parent(json.parent);
    }
    if (json.productCodeIsSet) {
      builder.productCode(json.productCode);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.productCategoryIsSet) {
      builder.productCategory(json.productCategory);
    }
    return (ImmutableBiologicallyDerivedProduct) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link BiologicallyDerivedProduct} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable BiologicallyDerivedProduct instance
   */
  public static BiologicallyDerivedProduct copyOf(BiologicallyDerivedProduct instance) {
    if (instance instanceof ImmutableBiologicallyDerivedProduct) {
      return (ImmutableBiologicallyDerivedProduct) instance;
    }
    return ((ImmutableBiologicallyDerivedProduct.Builder) ImmutableBiologicallyDerivedProduct.builder())
        .identifier(instance.identifier())
        .resourceType(instance.resourceType())
        .extension(instance.extension())
        .id(instance.id())
        .manipulation(instance.manipulation())
        .storage(instance.storage())
        .quantity(instance.quantity())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .contained(instance.contained())
        .status(instance.status())
        .processing(instance.processing())
        .collection(instance.collection())
        .implicitRules(instance.implicitRules())
        .parent(instance.parent())
        .productCode(instance.productCode())
        .meta(instance.meta())
        .language(instance.language())
        .request(instance.request())
        .productCategory(instance.productCategory())
        .build();
  }

  /**
   * Creates a builder for {@link BiologicallyDerivedProduct BiologicallyDerivedProduct}.
   * <pre>
   * ImmutableBiologicallyDerivedProduct.builder()
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link BiologicallyDerivedProduct#identifier() identifier}
   *    .resourceType(String) // required {@link BiologicallyDerivedProduct#resourceType() resourceType}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link BiologicallyDerivedProduct#extension() extension}
   *    .id(com.medplum.types.fhir.Id) // optional {@link BiologicallyDerivedProduct#id() id}
   *    .manipulation(com.medplum.types.fhir.BiologicallyDerivedProduct_Manipulation) // optional {@link BiologicallyDerivedProduct#manipulation() manipulation}
   *    .storage(List&amp;lt;com.medplum.types.fhir.BiologicallyDerivedProduct_Storage&amp;gt;) // optional {@link BiologicallyDerivedProduct#storage() storage}
   *    .quantity(Integer) // optional {@link BiologicallyDerivedProduct#quantity() quantity}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link BiologicallyDerivedProduct#text() text}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link BiologicallyDerivedProduct#modifierExtension() modifierExtension}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link BiologicallyDerivedProduct#contained() contained}
   *    .status(com.medplum.types.fhir.BiologicallyderivedproductStatus) // optional {@link BiologicallyDerivedProduct#status() status}
   *    .processing(List&amp;lt;com.medplum.types.fhir.BiologicallyDerivedProduct_Processing&amp;gt;) // optional {@link BiologicallyDerivedProduct#processing() processing}
   *    .collection(com.medplum.types.fhir.BiologicallyDerivedProduct_Collection) // optional {@link BiologicallyDerivedProduct#collection() collection}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link BiologicallyDerivedProduct#implicitRules() implicitRules}
   *    .parent(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link BiologicallyDerivedProduct#parent() parent}
   *    .productCode(com.medplum.types.fhir.CodeableConcept) // optional {@link BiologicallyDerivedProduct#productCode() productCode}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link BiologicallyDerivedProduct#meta() meta}
   *    .language(com.medplum.types.fhir.Code) // optional {@link BiologicallyDerivedProduct#language() language}
   *    .request(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link BiologicallyDerivedProduct#request() request}
   *    .productCategory(com.medplum.types.fhir.BiologicallyderivedproductProductcategory) // optional {@link BiologicallyDerivedProduct#productCategory() productCategory}
   *    .build();
   * </pre>
   * @return A new BiologicallyDerivedProduct builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableBiologicallyDerivedProduct.Builder();
  }

  /**
   * Builds instances of type {@link BiologicallyDerivedProduct BiologicallyDerivedProduct}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "BiologicallyDerivedProduct", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_IDENTIFIER = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MANIPULATION = 0x8L;
    private static final long OPT_BIT_STORAGE = 0x10L;
    private static final long OPT_BIT_QUANTITY = 0x20L;
    private static final long OPT_BIT_TEXT = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_CONTAINED = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_PROCESSING = 0x400L;
    private static final long OPT_BIT_COLLECTION = 0x800L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000L;
    private static final long OPT_BIT_PARENT = 0x2000L;
    private static final long OPT_BIT_PRODUCT_CODE = 0x4000L;
    private static final long OPT_BIT_META = 0x8000L;
    private static final long OPT_BIT_LANGUAGE = 0x10000L;
    private static final long OPT_BIT_REQUEST = 0x20000L;
    private static final long OPT_BIT_PRODUCT_CATEGORY = 0x40000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Identifier> identifier;
    private @Nullable String resourceType;
    private @Nullable List<Extension> extension;
    private @Nullable Id id;
    private @Nullable BiologicallyDerivedProduct_Manipulation manipulation;
    private @Nullable List<BiologicallyDerivedProduct_Storage> storage;
    private @Nullable Integer quantity;
    private @Nullable Narrative text;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<ResourceList> contained;
    private @Nullable BiologicallyderivedproductStatus status;
    private @Nullable List<BiologicallyDerivedProduct_Processing> processing;
    private @Nullable BiologicallyDerivedProduct_Collection collection;
    private @Nullable Uri implicitRules;
    private @Nullable List<Reference> parent;
    private @Nullable CodeableConcept productCode;
    private @Nullable Meta meta;
    private @Nullable Code language;
    private @Nullable List<Reference> request;
    private @Nullable BiologicallyderivedproductProductcategory productCategory;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#identifier() identifier} to identifier.
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
     * Initializes the value for the {@link BiologicallyDerivedProduct#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#extension() extension} to extension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#extension() extension} to extension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#id() id} to id.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#id() id} to id.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#manipulation() manipulation} to manipulation.
     * @param manipulation The value for manipulation
     * @return {@code this} builder for chained invocation
     */
    public final Builder manipulation(BiologicallyDerivedProduct_Manipulation manipulation) {
      checkNotIsSet(manipulationIsSet(), "manipulation");
      this.manipulation = Objects.requireNonNull(manipulation, "manipulation");
      optBits |= OPT_BIT_MANIPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#manipulation() manipulation} to manipulation.
     * @param manipulation The value for manipulation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manipulation")
    public final Builder manipulation(Optional<? extends BiologicallyDerivedProduct_Manipulation> manipulation) {
      checkNotIsSet(manipulationIsSet(), "manipulation");
      this.manipulation = manipulation.orElse(null);
      optBits |= OPT_BIT_MANIPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#storage() storage} to storage.
     * @param storage The value for storage
     * @return {@code this} builder for chained invocation
     */
    public final Builder storage(List<BiologicallyDerivedProduct_Storage> storage) {
      checkNotIsSet(storageIsSet(), "storage");
      this.storage = Objects.requireNonNull(storage, "storage");
      optBits |= OPT_BIT_STORAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#storage() storage} to storage.
     * @param storage The value for storage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("storage")
    public final Builder storage(Optional<? extends List<BiologicallyDerivedProduct_Storage>> storage) {
      checkNotIsSet(storageIsSet(), "storage");
      this.storage = storage.orElse(null);
      optBits |= OPT_BIT_STORAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(int quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity;
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantity")
    public final Builder quantity(Optional<Integer> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#text() text} to text.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#text() text} to text.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#contained() contained} to contained.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#contained() contained} to contained.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(BiologicallyderivedproductStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends BiologicallyderivedproductStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#processing() processing} to processing.
     * @param processing The value for processing
     * @return {@code this} builder for chained invocation
     */
    public final Builder processing(List<BiologicallyDerivedProduct_Processing> processing) {
      checkNotIsSet(processingIsSet(), "processing");
      this.processing = Objects.requireNonNull(processing, "processing");
      optBits |= OPT_BIT_PROCESSING;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#processing() processing} to processing.
     * @param processing The value for processing
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("processing")
    public final Builder processing(Optional<? extends List<BiologicallyDerivedProduct_Processing>> processing) {
      checkNotIsSet(processingIsSet(), "processing");
      this.processing = processing.orElse(null);
      optBits |= OPT_BIT_PROCESSING;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for chained invocation
     */
    public final Builder collection(BiologicallyDerivedProduct_Collection collection) {
      checkNotIsSet(collectionIsSet(), "collection");
      this.collection = Objects.requireNonNull(collection, "collection");
      optBits |= OPT_BIT_COLLECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("collection")
    public final Builder collection(Optional<? extends BiologicallyDerivedProduct_Collection> collection) {
      checkNotIsSet(collectionIsSet(), "collection");
      this.collection = collection.orElse(null);
      optBits |= OPT_BIT_COLLECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    public final Builder parent(List<Reference> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = Objects.requireNonNull(parent, "parent");
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parent")
    public final Builder parent(Optional<? extends List<Reference>> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = parent.orElse(null);
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#productCode() productCode} to productCode.
     * @param productCode The value for productCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder productCode(CodeableConcept productCode) {
      checkNotIsSet(productCodeIsSet(), "productCode");
      this.productCode = Objects.requireNonNull(productCode, "productCode");
      optBits |= OPT_BIT_PRODUCT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#productCode() productCode} to productCode.
     * @param productCode The value for productCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productCode")
    public final Builder productCode(Optional<? extends CodeableConcept> productCode) {
      checkNotIsSet(productCodeIsSet(), "productCode");
      this.productCode = productCode.orElse(null);
      optBits |= OPT_BIT_PRODUCT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#meta() meta} to meta.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#meta() meta} to meta.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#language() language} to language.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#language() language} to language.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    public final Builder request(List<Reference> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = Objects.requireNonNull(request, "request");
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("request")
    public final Builder request(Optional<? extends List<Reference>> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = request.orElse(null);
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#productCategory() productCategory} to productCategory.
     * @param productCategory The value for productCategory
     * @return {@code this} builder for chained invocation
     */
    public final Builder productCategory(BiologicallyderivedproductProductcategory productCategory) {
      checkNotIsSet(productCategoryIsSet(), "productCategory");
      this.productCategory = Objects.requireNonNull(productCategory, "productCategory");
      optBits |= OPT_BIT_PRODUCT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#productCategory() productCategory} to productCategory.
     * @param productCategory The value for productCategory
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productCategory")
    public final Builder productCategory(Optional<? extends BiologicallyderivedproductProductcategory> productCategory) {
      checkNotIsSet(productCategoryIsSet(), "productCategory");
      this.productCategory = productCategory.orElse(null);
      optBits |= OPT_BIT_PRODUCT_CATEGORY;
      return this;
    }

    /**
     * Builds a new {@link BiologicallyDerivedProduct BiologicallyDerivedProduct}.
     * @return An immutable instance of BiologicallyDerivedProduct
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public BiologicallyDerivedProduct build() {
      checkRequiredAttributes();
      return new ImmutableBiologicallyDerivedProduct(
          identifier,
          resourceType,
          extension,
          id,
          manipulation,
          storage,
          quantity,
          text,
          modifierExtension,
          contained,
          status,
          processing,
          collection,
          implicitRules,
          parent,
          productCode,
          meta,
          language,
          request,
          productCategory);
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean manipulationIsSet() {
      return (optBits & OPT_BIT_MANIPULATION) != 0;
    }

    private boolean storageIsSet() {
      return (optBits & OPT_BIT_STORAGE) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean processingIsSet() {
      return (optBits & OPT_BIT_PROCESSING) != 0;
    }

    private boolean collectionIsSet() {
      return (optBits & OPT_BIT_COLLECTION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean parentIsSet() {
      return (optBits & OPT_BIT_PARENT) != 0;
    }

    private boolean productCodeIsSet() {
      return (optBits & OPT_BIT_PRODUCT_CODE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean productCategoryIsSet() {
      return (optBits & OPT_BIT_PRODUCT_CATEGORY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of BiologicallyDerivedProduct is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build BiologicallyDerivedProduct, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "BiologicallyDerivedProduct", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link BiologicallyDerivedProduct#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "BiologicallyDerivedProduct", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#manipulation() manipulation} to manipulation.
     * @param manipulation The value for manipulation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manipulation(BiologicallyDerivedProduct_Manipulation manipulation);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#manipulation() manipulation} to manipulation.
     * @param manipulation The value for manipulation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manipulation(Optional<? extends BiologicallyDerivedProduct_Manipulation> manipulation);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#storage() storage} to storage.
     * @param storage The value for storage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal storage(List<BiologicallyDerivedProduct_Storage> storage);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#storage() storage} to storage.
     * @param storage The value for storage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal storage(Optional<? extends List<BiologicallyDerivedProduct_Storage>> storage);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(int quantity);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(Optional<Integer> quantity);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(BiologicallyderivedproductStatus status);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends BiologicallyderivedproductStatus> status);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#processing() processing} to processing.
     * @param processing The value for processing
     * @return {@code this} builder for chained invocation
     */
    BuildFinal processing(List<BiologicallyDerivedProduct_Processing> processing);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#processing() processing} to processing.
     * @param processing The value for processing
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal processing(Optional<? extends List<BiologicallyDerivedProduct_Processing>> processing);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for chained invocation
     */
    BuildFinal collection(BiologicallyDerivedProduct_Collection collection);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal collection(Optional<? extends BiologicallyDerivedProduct_Collection> collection);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parent(List<Reference> parent);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parent(Optional<? extends List<Reference>> parent);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#productCode() productCode} to productCode.
     * @param productCode The value for productCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal productCode(CodeableConcept productCode);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#productCode() productCode} to productCode.
     * @param productCode The value for productCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productCode(Optional<? extends CodeableConcept> productCode);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    BuildFinal request(List<Reference> request);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal request(Optional<? extends List<Reference>> request);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#productCategory() productCategory} to productCategory.
     * @param productCategory The value for productCategory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal productCategory(BiologicallyderivedproductProductcategory productCategory);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#productCategory() productCategory} to productCategory.
     * @param productCategory The value for productCategory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productCategory(Optional<? extends BiologicallyderivedproductProductcategory> productCategory);

    /**
     * Builds a new {@link BiologicallyDerivedProduct BiologicallyDerivedProduct}.
     * @return An immutable instance of BiologicallyDerivedProduct
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    BiologicallyDerivedProduct build();
  }
}
