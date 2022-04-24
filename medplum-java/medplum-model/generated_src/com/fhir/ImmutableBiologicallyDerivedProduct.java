//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link BiologicallyDerivedProduct}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBiologicallyDerivedProduct.builder()}.
 */
@org.immutables.value.Generated(from = "BiologicallyDerivedProduct", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBiologicallyDerivedProduct implements com.fhir.BiologicallyDerivedProduct {
  private final @javax.annotation.Nullable java.util.List<com.fhir.BiologicallyDerivedProduct_Processing> processing;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept productCode;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> parent;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.lang.Integer quantity;
  private final @javax.annotation.Nullable com.fhir.BiologicallyDerivedProduct_Collection collection;
  private final @javax.annotation.Nullable java.util.List<com.fhir.BiologicallyDerivedProduct_Storage> storage;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> request;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.BiologicallyderivedproductProductcategory productCategory;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.BiologicallyderivedproductStatus status;
  private final @javax.annotation.Nullable com.fhir.BiologicallyDerivedProduct_Manipulation manipulation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableBiologicallyDerivedProduct(
      @javax.annotation.Nullable java.util.List<com.fhir.BiologicallyDerivedProduct_Processing> processing,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.CodeableConcept productCode,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> parent,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.lang.Integer quantity,
      @javax.annotation.Nullable com.fhir.BiologicallyDerivedProduct_Collection collection,
      @javax.annotation.Nullable java.util.List<com.fhir.BiologicallyDerivedProduct_Storage> storage,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> request,
      @javax.annotation.Nullable com.fhir.Narrative text,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.BiologicallyderivedproductProductcategory productCategory,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.BiologicallyderivedproductStatus status,
      @javax.annotation.Nullable com.fhir.BiologicallyDerivedProduct_Manipulation manipulation,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.processing = processing;
    this.identifier = identifier;
    this.productCode = productCode;
    this.meta = meta;
    this.parent = parent;
    this.language = language;
    this.extension = extension;
    this.implicitRules = implicitRules;
    this.quantity = quantity;
    this.collection = collection;
    this.storage = storage;
    this.contained = contained;
    this.request = request;
    this.text = text;
    this.resourceType = resourceType;
    this.productCategory = productCategory;
    this.id = id;
    this.status = status;
    this.manipulation = manipulation;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code processing} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("processing")
  @Override
  public java.util.Optional<java.util.List<com.fhir.BiologicallyDerivedProduct_Processing>> processing() {
    return java.util.Optional.ofNullable(processing);
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
   * @return The value of the {@code productCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("productCode")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> productCode() {
    return java.util.Optional.ofNullable(productCode);
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
   * @return The value of the {@code parent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parent")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> parent() {
    return java.util.Optional.ofNullable(parent);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code quantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("quantity")
  @Override
  public java.util.Optional<java.lang.Integer> quantity() {
    return java.util.Optional.ofNullable(quantity);
  }

  /**
   * @return The value of the {@code collection} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("collection")
  @Override
  public java.util.Optional<com.fhir.BiologicallyDerivedProduct_Collection> collection() {
    return java.util.Optional.ofNullable(collection);
  }

  /**
   * @return The value of the {@code storage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("storage")
  @Override
  public java.util.Optional<java.util.List<com.fhir.BiologicallyDerivedProduct_Storage>> storage() {
    return java.util.Optional.ofNullable(storage);
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
   * @return The value of the {@code request} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("request")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> request() {
    return java.util.Optional.ofNullable(request);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code productCategory} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("productCategory")
  @Override
  public java.util.Optional<com.fhir.BiologicallyderivedproductProductcategory> productCategory() {
    return java.util.Optional.ofNullable(productCategory);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.BiologicallyderivedproductStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code manipulation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("manipulation")
  @Override
  public java.util.Optional<com.fhir.BiologicallyDerivedProduct_Manipulation> manipulation() {
    return java.util.Optional.ofNullable(manipulation);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#processing() processing} attribute.
   * @param value The value for processing
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withProcessing(java.util.List<com.fhir.BiologicallyDerivedProduct_Processing> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.BiologicallyDerivedProduct_Processing> newValue = java.util.Objects.requireNonNull(value, "processing");
    if (this.processing == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        newValue,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#processing() processing} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for processing
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withProcessing(java.util.Optional<? extends java.util.List<com.fhir.BiologicallyDerivedProduct_Processing>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.BiologicallyDerivedProduct_Processing> value = optional.orElse(null);
    if (this.processing == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        value,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        newValue,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        value,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#productCode() productCode} attribute.
   * @param value The value for productCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withProductCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "productCode");
    if (this.productCode == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        newValue,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#productCode() productCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withProductCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.productCode == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        value,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        newValue,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        value,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#parent() parent} attribute.
   * @param value The value for parent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withParent(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "parent");
    if (this.parent == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        newValue,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#parent() parent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withParent(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.parent == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        value,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        newValue,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        value,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        newValue,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        value,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        newValue,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        value,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withQuantity(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.quantity, newValue)) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        newValue,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#quantity() quantity} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withQuantity(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.quantity, value)) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        value,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#collection() collection} attribute.
   * @param value The value for collection
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withCollection(com.fhir.BiologicallyDerivedProduct_Collection value) {
    @javax.annotation.Nullable com.fhir.BiologicallyDerivedProduct_Collection newValue = java.util.Objects.requireNonNull(value, "collection");
    if (this.collection == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        newValue,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#collection() collection} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for collection
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withCollection(java.util.Optional<? extends com.fhir.BiologicallyDerivedProduct_Collection> optional) {
    @javax.annotation.Nullable com.fhir.BiologicallyDerivedProduct_Collection value = optional.orElse(null);
    if (this.collection == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        value,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#storage() storage} attribute.
   * @param value The value for storage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withStorage(java.util.List<com.fhir.BiologicallyDerivedProduct_Storage> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.BiologicallyDerivedProduct_Storage> newValue = java.util.Objects.requireNonNull(value, "storage");
    if (this.storage == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        newValue,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#storage() storage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for storage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withStorage(java.util.Optional<? extends java.util.List<com.fhir.BiologicallyDerivedProduct_Storage>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.BiologicallyDerivedProduct_Storage> value = optional.orElse(null);
    if (this.storage == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        value,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        newValue,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        value,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withRequest(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        newValue,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withRequest(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        value,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        newValue,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        value,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BiologicallyDerivedProduct#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        newValue,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#productCategory() productCategory} attribute.
   * @param value The value for productCategory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withProductCategory(com.fhir.BiologicallyderivedproductProductcategory value) {
    @javax.annotation.Nullable com.fhir.BiologicallyderivedproductProductcategory newValue = java.util.Objects.requireNonNull(value, "productCategory");
    if (this.productCategory == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        newValue,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#productCategory() productCategory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productCategory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withProductCategory(java.util.Optional<? extends com.fhir.BiologicallyderivedproductProductcategory> optional) {
    @javax.annotation.Nullable com.fhir.BiologicallyderivedproductProductcategory value = optional.orElse(null);
    if (this.productCategory == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        value,
        this.id,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        newValue,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        value,
        this.status,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withStatus(com.fhir.BiologicallyderivedproductStatus value) {
    @javax.annotation.Nullable com.fhir.BiologicallyderivedproductStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        newValue,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withStatus(java.util.Optional<? extends com.fhir.BiologicallyderivedproductStatus> optional) {
    @javax.annotation.Nullable com.fhir.BiologicallyderivedproductStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        value,
        this.manipulation,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#manipulation() manipulation} attribute.
   * @param value The value for manipulation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withManipulation(com.fhir.BiologicallyDerivedProduct_Manipulation value) {
    @javax.annotation.Nullable com.fhir.BiologicallyDerivedProduct_Manipulation newValue = java.util.Objects.requireNonNull(value, "manipulation");
    if (this.manipulation == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#manipulation() manipulation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manipulation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withManipulation(java.util.Optional<? extends com.fhir.BiologicallyDerivedProduct_Manipulation> optional) {
    @javax.annotation.Nullable com.fhir.BiologicallyDerivedProduct_Manipulation value = optional.orElse(null);
    if (this.manipulation == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableBiologicallyDerivedProduct(
        this.processing,
        this.identifier,
        this.productCode,
        this.meta,
        this.parent,
        this.language,
        this.extension,
        this.implicitRules,
        this.quantity,
        this.collection,
        this.storage,
        this.contained,
        this.request,
        this.text,
        this.resourceType,
        this.productCategory,
        this.id,
        this.status,
        this.manipulation,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBiologicallyDerivedProduct} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBiologicallyDerivedProduct
        && equalTo((ImmutableBiologicallyDerivedProduct) another);
  }

  private boolean equalTo(ImmutableBiologicallyDerivedProduct another) {
    return java.util.Objects.equals(processing, another.processing)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(productCode, another.productCode)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(parent, another.parent)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(quantity, another.quantity)
        && java.util.Objects.equals(collection, another.collection)
        && java.util.Objects.equals(storage, another.storage)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(request, another.request)
        && java.util.Objects.equals(text, another.text)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(productCategory, another.productCategory)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(manipulation, another.manipulation)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code processing}, {@code identifier}, {@code productCode}, {@code meta}, {@code parent}, {@code language}, {@code extension}, {@code implicitRules}, {@code quantity}, {@code collection}, {@code storage}, {@code contained}, {@code request}, {@code text}, {@code resourceType}, {@code productCategory}, {@code id}, {@code status}, {@code manipulation}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(processing);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(productCode);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(parent);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(quantity);
    h += (h << 5) + java.util.Objects.hashCode(collection);
    h += (h << 5) + java.util.Objects.hashCode(storage);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(request);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(productCategory);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(manipulation);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code BiologicallyDerivedProduct} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("BiologicallyDerivedProduct{");
    if (processing != null) {
      builder.append("processing=").append(processing);
    }
    if (identifier != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (productCode != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("productCode=").append(productCode);
    }
    if (meta != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (parent != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("parent=").append(parent);
    }
    if (language != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (implicitRules != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (quantity != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (collection != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("collection=").append(collection);
    }
    if (storage != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("storage=").append(storage);
    }
    if (contained != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (request != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("request=").append(request);
    }
    if (text != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (builder.length() > 27) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (productCategory != null) {
      builder.append(", ");
      builder.append("productCategory=").append(productCategory);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (manipulation != null) {
      builder.append(", ");
      builder.append("manipulation=").append(manipulation);
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
  @org.immutables.value.Generated(from = "BiologicallyDerivedProduct", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.BiologicallyDerivedProduct {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.BiologicallyDerivedProduct_Processing>> processing = java.util.Optional.empty();
    boolean processingIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> productCode = java.util.Optional.empty();
    boolean productCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> parent = java.util.Optional.empty();
    boolean parentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> quantity = java.util.Optional.empty();
    boolean quantityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.BiologicallyDerivedProduct_Collection> collection = java.util.Optional.empty();
    boolean collectionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.BiologicallyDerivedProduct_Storage>> storage = java.util.Optional.empty();
    boolean storageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> request = java.util.Optional.empty();
    boolean requestIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.BiologicallyderivedproductProductcategory> productCategory = java.util.Optional.empty();
    boolean productCategoryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.BiologicallyderivedproductStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.BiologicallyDerivedProduct_Manipulation> manipulation = java.util.Optional.empty();
    boolean manipulationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("processing")
    public void setProcessing(java.util.Optional<java.util.List<com.fhir.BiologicallyDerivedProduct_Processing>> processing) {
      this.processing = processing;
      this.processingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("productCode")
    public void setProductCode(java.util.Optional<com.fhir.CodeableConcept> productCode) {
      this.productCode = productCode;
      this.productCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parent")
    public void setParent(java.util.Optional<java.util.List<com.fhir.Reference>> parent) {
      this.parent = parent;
      this.parentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public void setQuantity(java.util.Optional<java.lang.Integer> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("collection")
    public void setCollection(java.util.Optional<com.fhir.BiologicallyDerivedProduct_Collection> collection) {
      this.collection = collection;
      this.collectionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("storage")
    public void setStorage(java.util.Optional<java.util.List<com.fhir.BiologicallyDerivedProduct_Storage>> storage) {
      this.storage = storage;
      this.storageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public void setRequest(java.util.Optional<java.util.List<com.fhir.Reference>> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("productCategory")
    public void setProductCategory(java.util.Optional<com.fhir.BiologicallyderivedproductProductcategory> productCategory) {
      this.productCategory = productCategory;
      this.productCategoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.BiologicallyderivedproductStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("manipulation")
    public void setManipulation(java.util.Optional<com.fhir.BiologicallyDerivedProduct_Manipulation> manipulation) {
      this.manipulation = manipulation;
      this.manipulationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.BiologicallyDerivedProduct_Processing>> processing() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> productCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> parent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.BiologicallyDerivedProduct_Collection> collection() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.BiologicallyDerivedProduct_Storage>> storage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> request() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.BiologicallyderivedproductProductcategory> productCategory() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.BiologicallyderivedproductStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.BiologicallyDerivedProduct_Manipulation> manipulation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableBiologicallyDerivedProduct fromJson(Json json) {
    ImmutableBiologicallyDerivedProduct.Builder builder = ((ImmutableBiologicallyDerivedProduct.Builder) ImmutableBiologicallyDerivedProduct.builder());
    if (json.processingIsSet) {
      builder.processing(json.processing);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.productCodeIsSet) {
      builder.productCode(json.productCode);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.parentIsSet) {
      builder.parent(json.parent);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.collectionIsSet) {
      builder.collection(json.collection);
    }
    if (json.storageIsSet) {
      builder.storage(json.storage);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.productCategoryIsSet) {
      builder.productCategory(json.productCategory);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.manipulationIsSet) {
      builder.manipulation(json.manipulation);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
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
        .processing(instance.processing())
        .identifier(instance.identifier())
        .productCode(instance.productCode())
        .meta(instance.meta())
        .parent(instance.parent())
        .language(instance.language())
        .extension(instance.extension())
        .implicitRules(instance.implicitRules())
        .quantity(instance.quantity())
        .collection(instance.collection())
        .storage(instance.storage())
        .contained(instance.contained())
        .request(instance.request())
        .text(instance.text())
        .resourceType(instance.resourceType())
        .productCategory(instance.productCategory())
        .id(instance.id())
        .status(instance.status())
        .manipulation(instance.manipulation())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link BiologicallyDerivedProduct BiologicallyDerivedProduct}.
   * <pre>
   * ImmutableBiologicallyDerivedProduct.builder()
   *    .processing(List&amp;lt;com.fhir.BiologicallyDerivedProduct_Processing&amp;gt;) // optional {@link BiologicallyDerivedProduct#processing() processing}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link BiologicallyDerivedProduct#identifier() identifier}
   *    .productCode(com.fhir.CodeableConcept) // optional {@link BiologicallyDerivedProduct#productCode() productCode}
   *    .meta(com.fhir.Meta) // optional {@link BiologicallyDerivedProduct#meta() meta}
   *    .parent(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link BiologicallyDerivedProduct#parent() parent}
   *    .language(com.fhir.code) // optional {@link BiologicallyDerivedProduct#language() language}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link BiologicallyDerivedProduct#extension() extension}
   *    .implicitRules(com.fhir.uri) // optional {@link BiologicallyDerivedProduct#implicitRules() implicitRules}
   *    .quantity(Integer) // optional {@link BiologicallyDerivedProduct#quantity() quantity}
   *    .collection(com.fhir.BiologicallyDerivedProduct_Collection) // optional {@link BiologicallyDerivedProduct#collection() collection}
   *    .storage(List&amp;lt;com.fhir.BiologicallyDerivedProduct_Storage&amp;gt;) // optional {@link BiologicallyDerivedProduct#storage() storage}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link BiologicallyDerivedProduct#contained() contained}
   *    .request(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link BiologicallyDerivedProduct#request() request}
   *    .text(com.fhir.Narrative) // optional {@link BiologicallyDerivedProduct#text() text}
   *    .resourceType(String) // required {@link BiologicallyDerivedProduct#resourceType() resourceType}
   *    .productCategory(com.fhir.BiologicallyderivedproductProductcategory) // optional {@link BiologicallyDerivedProduct#productCategory() productCategory}
   *    .id(com.fhir.id) // optional {@link BiologicallyDerivedProduct#id() id}
   *    .status(com.fhir.BiologicallyderivedproductStatus) // optional {@link BiologicallyDerivedProduct#status() status}
   *    .manipulation(com.fhir.BiologicallyDerivedProduct_Manipulation) // optional {@link BiologicallyDerivedProduct#manipulation() manipulation}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link BiologicallyDerivedProduct#modifierExtension() modifierExtension}
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
  @org.immutables.value.Generated(from = "BiologicallyDerivedProduct", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_PROCESSING = 0x1L;
    private static final long OPT_BIT_IDENTIFIER = 0x2L;
    private static final long OPT_BIT_PRODUCT_CODE = 0x4L;
    private static final long OPT_BIT_META = 0x8L;
    private static final long OPT_BIT_PARENT = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80L;
    private static final long OPT_BIT_QUANTITY = 0x100L;
    private static final long OPT_BIT_COLLECTION = 0x200L;
    private static final long OPT_BIT_STORAGE = 0x400L;
    private static final long OPT_BIT_CONTAINED = 0x800L;
    private static final long OPT_BIT_REQUEST = 0x1000L;
    private static final long OPT_BIT_TEXT = 0x2000L;
    private static final long OPT_BIT_PRODUCT_CATEGORY = 0x4000L;
    private static final long OPT_BIT_ID = 0x8000L;
    private static final long OPT_BIT_STATUS = 0x10000L;
    private static final long OPT_BIT_MANIPULATION = 0x20000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.BiologicallyDerivedProduct_Processing> processing;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.CodeableConcept productCode;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> parent;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.lang.Integer quantity;
    private @javax.annotation.Nullable com.fhir.BiologicallyDerivedProduct_Collection collection;
    private @javax.annotation.Nullable java.util.List<com.fhir.BiologicallyDerivedProduct_Storage> storage;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> request;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.BiologicallyderivedproductProductcategory productCategory;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.BiologicallyderivedproductStatus status;
    private @javax.annotation.Nullable com.fhir.BiologicallyDerivedProduct_Manipulation manipulation;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#processing() processing} to processing.
     * @param processing The value for processing
     * @return {@code this} builder for chained invocation
     */
    public final Builder processing(java.util.List<com.fhir.BiologicallyDerivedProduct_Processing> processing) {
      checkNotIsSet(processingIsSet(), "processing");
      this.processing = java.util.Objects.requireNonNull(processing, "processing");
      optBits |= OPT_BIT_PROCESSING;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#processing() processing} to processing.
     * @param processing The value for processing
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("processing")
    public final Builder processing(java.util.Optional<? extends java.util.List<com.fhir.BiologicallyDerivedProduct_Processing>> processing) {
      checkNotIsSet(processingIsSet(), "processing");
      this.processing = processing.orElse(null);
      optBits |= OPT_BIT_PROCESSING;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#productCode() productCode} to productCode.
     * @param productCode The value for productCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder productCode(com.fhir.CodeableConcept productCode) {
      checkNotIsSet(productCodeIsSet(), "productCode");
      this.productCode = java.util.Objects.requireNonNull(productCode, "productCode");
      optBits |= OPT_BIT_PRODUCT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#productCode() productCode} to productCode.
     * @param productCode The value for productCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productCode")
    public final Builder productCode(java.util.Optional<? extends com.fhir.CodeableConcept> productCode) {
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
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#meta() meta} to meta.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    public final Builder parent(java.util.List<com.fhir.Reference> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = java.util.Objects.requireNonNull(parent, "parent");
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parent")
    public final Builder parent(java.util.Optional<? extends java.util.List<com.fhir.Reference>> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = parent.orElse(null);
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#language() language} to language.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#language() language} to language.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#extension() extension} to extension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#extension() extension} to extension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#implicitRules() implicitRules} to implicitRules.
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
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public final Builder quantity(java.util.Optional<java.lang.Integer> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for chained invocation
     */
    public final Builder collection(com.fhir.BiologicallyDerivedProduct_Collection collection) {
      checkNotIsSet(collectionIsSet(), "collection");
      this.collection = java.util.Objects.requireNonNull(collection, "collection");
      optBits |= OPT_BIT_COLLECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("collection")
    public final Builder collection(java.util.Optional<? extends com.fhir.BiologicallyDerivedProduct_Collection> collection) {
      checkNotIsSet(collectionIsSet(), "collection");
      this.collection = collection.orElse(null);
      optBits |= OPT_BIT_COLLECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#storage() storage} to storage.
     * @param storage The value for storage
     * @return {@code this} builder for chained invocation
     */
    public final Builder storage(java.util.List<com.fhir.BiologicallyDerivedProduct_Storage> storage) {
      checkNotIsSet(storageIsSet(), "storage");
      this.storage = java.util.Objects.requireNonNull(storage, "storage");
      optBits |= OPT_BIT_STORAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#storage() storage} to storage.
     * @param storage The value for storage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storage")
    public final Builder storage(java.util.Optional<? extends java.util.List<com.fhir.BiologicallyDerivedProduct_Storage>> storage) {
      checkNotIsSet(storageIsSet(), "storage");
      this.storage = storage.orElse(null);
      optBits |= OPT_BIT_STORAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#contained() contained} to contained.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#contained() contained} to contained.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    public final Builder request(java.util.List<com.fhir.Reference> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = java.util.Objects.requireNonNull(request, "request");
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public final Builder request(java.util.Optional<? extends java.util.List<com.fhir.Reference>> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = request.orElse(null);
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#text() text} to text.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#text() text} to text.
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
     * Initializes the value for the {@link BiologicallyDerivedProduct#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#productCategory() productCategory} to productCategory.
     * @param productCategory The value for productCategory
     * @return {@code this} builder for chained invocation
     */
    public final Builder productCategory(com.fhir.BiologicallyderivedproductProductcategory productCategory) {
      checkNotIsSet(productCategoryIsSet(), "productCategory");
      this.productCategory = java.util.Objects.requireNonNull(productCategory, "productCategory");
      optBits |= OPT_BIT_PRODUCT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#productCategory() productCategory} to productCategory.
     * @param productCategory The value for productCategory
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productCategory")
    public final Builder productCategory(java.util.Optional<? extends com.fhir.BiologicallyderivedproductProductcategory> productCategory) {
      checkNotIsSet(productCategoryIsSet(), "productCategory");
      this.productCategory = productCategory.orElse(null);
      optBits |= OPT_BIT_PRODUCT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#id() id} to id.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#id() id} to id.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.BiologicallyderivedproductStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.BiologicallyderivedproductStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#manipulation() manipulation} to manipulation.
     * @param manipulation The value for manipulation
     * @return {@code this} builder for chained invocation
     */
    public final Builder manipulation(com.fhir.BiologicallyDerivedProduct_Manipulation manipulation) {
      checkNotIsSet(manipulationIsSet(), "manipulation");
      this.manipulation = java.util.Objects.requireNonNull(manipulation, "manipulation");
      optBits |= OPT_BIT_MANIPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#manipulation() manipulation} to manipulation.
     * @param manipulation The value for manipulation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manipulation")
    public final Builder manipulation(java.util.Optional<? extends com.fhir.BiologicallyDerivedProduct_Manipulation> manipulation) {
      checkNotIsSet(manipulationIsSet(), "manipulation");
      this.manipulation = manipulation.orElse(null);
      optBits |= OPT_BIT_MANIPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link BiologicallyDerivedProduct BiologicallyDerivedProduct}.
     * @return An immutable instance of BiologicallyDerivedProduct
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.BiologicallyDerivedProduct build() {
      checkRequiredAttributes();
      return new ImmutableBiologicallyDerivedProduct(
          processing,
          identifier,
          productCode,
          meta,
          parent,
          language,
          extension,
          implicitRules,
          quantity,
          collection,
          storage,
          contained,
          request,
          text,
          resourceType,
          productCategory,
          id,
          status,
          manipulation,
          modifierExtension);
    }

    private boolean processingIsSet() {
      return (optBits & OPT_BIT_PROCESSING) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean productCodeIsSet() {
      return (optBits & OPT_BIT_PRODUCT_CODE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean parentIsSet() {
      return (optBits & OPT_BIT_PARENT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean collectionIsSet() {
      return (optBits & OPT_BIT_COLLECTION) != 0;
    }

    private boolean storageIsSet() {
      return (optBits & OPT_BIT_STORAGE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean productCategoryIsSet() {
      return (optBits & OPT_BIT_PRODUCT_CATEGORY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean manipulationIsSet() {
      return (optBits & OPT_BIT_MANIPULATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of BiologicallyDerivedProduct is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build BiologicallyDerivedProduct, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "BiologicallyDerivedProduct", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link BiologicallyDerivedProduct#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "BiologicallyDerivedProduct", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#processing() processing} to processing.
     * @param processing The value for processing
     * @return {@code this} builder for chained invocation
     */
    BuildFinal processing(java.util.List<com.fhir.BiologicallyDerivedProduct_Processing> processing);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#processing() processing} to processing.
     * @param processing The value for processing
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal processing(java.util.Optional<? extends java.util.List<com.fhir.BiologicallyDerivedProduct_Processing>> processing);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#productCode() productCode} to productCode.
     * @param productCode The value for productCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal productCode(com.fhir.CodeableConcept productCode);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#productCode() productCode} to productCode.
     * @param productCode The value for productCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productCode(java.util.Optional<? extends com.fhir.CodeableConcept> productCode);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parent(java.util.List<com.fhir.Reference> parent);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parent(java.util.Optional<? extends java.util.List<com.fhir.Reference>> parent);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

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
    BuildFinal quantity(java.util.Optional<java.lang.Integer> quantity);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for chained invocation
     */
    BuildFinal collection(com.fhir.BiologicallyDerivedProduct_Collection collection);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal collection(java.util.Optional<? extends com.fhir.BiologicallyDerivedProduct_Collection> collection);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#storage() storage} to storage.
     * @param storage The value for storage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal storage(java.util.List<com.fhir.BiologicallyDerivedProduct_Storage> storage);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#storage() storage} to storage.
     * @param storage The value for storage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal storage(java.util.Optional<? extends java.util.List<com.fhir.BiologicallyDerivedProduct_Storage>> storage);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    BuildFinal request(java.util.List<com.fhir.Reference> request);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal request(java.util.Optional<? extends java.util.List<com.fhir.Reference>> request);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#productCategory() productCategory} to productCategory.
     * @param productCategory The value for productCategory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal productCategory(com.fhir.BiologicallyderivedproductProductcategory productCategory);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#productCategory() productCategory} to productCategory.
     * @param productCategory The value for productCategory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productCategory(java.util.Optional<? extends com.fhir.BiologicallyderivedproductProductcategory> productCategory);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.BiologicallyderivedproductStatus status);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.BiologicallyderivedproductStatus> status);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#manipulation() manipulation} to manipulation.
     * @param manipulation The value for manipulation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manipulation(com.fhir.BiologicallyDerivedProduct_Manipulation manipulation);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#manipulation() manipulation} to manipulation.
     * @param manipulation The value for manipulation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manipulation(java.util.Optional<? extends com.fhir.BiologicallyDerivedProduct_Manipulation> manipulation);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Builds a new {@link BiologicallyDerivedProduct BiologicallyDerivedProduct}.
     * @return An immutable instance of BiologicallyDerivedProduct
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    BiologicallyDerivedProduct build();
  }
}
