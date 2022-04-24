//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ObservationDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableObservationDefinition.builder()}.
 */
@org.immutables.value.Generated(from = "ObservationDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableObservationDefinition implements com.fhir.ObservationDefinition {
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Reference criticalCodedValueSet;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept method;
  private final @javax.annotation.Nullable com.fhir.ObservationDefinition_QuantitativeDetails quantitativeDetails;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ObservationdefinitionPermitteddatatypeItem> permittedDataType;
  private final @javax.annotation.Nullable com.fhir.Reference normalCodedValueSet;
  private final @javax.annotation.Nullable java.lang.Boolean multipleResultsAllowed;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Reference validCodedValueSet;
  private final @javax.annotation.Nullable com.fhir.Reference abnormalCodedValueSet;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
  private final @javax.annotation.Nullable java.lang.String preferredReportName;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ObservationDefinition_QualifiedInterval> qualifiedInterval;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableObservationDefinition(
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Reference criticalCodedValueSet,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.CodeableConcept method,
      @javax.annotation.Nullable com.fhir.ObservationDefinition_QuantitativeDetails quantitativeDetails,
      @javax.annotation.Nullable java.util.List<com.fhir.ObservationdefinitionPermitteddatatypeItem> permittedDataType,
      @javax.annotation.Nullable com.fhir.Reference normalCodedValueSet,
      @javax.annotation.Nullable java.lang.Boolean multipleResultsAllowed,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Reference validCodedValueSet,
      @javax.annotation.Nullable com.fhir.Reference abnormalCodedValueSet,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category,
      @javax.annotation.Nullable java.lang.String preferredReportName,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      com.fhir.CodeableConcept code,
      @javax.annotation.Nullable java.util.List<com.fhir.ObservationDefinition_QualifiedInterval> qualifiedInterval,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.criticalCodedValueSet = criticalCodedValueSet;
    this.meta = meta;
    this.language = language;
    this.method = method;
    this.quantitativeDetails = quantitativeDetails;
    this.permittedDataType = permittedDataType;
    this.normalCodedValueSet = normalCodedValueSet;
    this.multipleResultsAllowed = multipleResultsAllowed;
    this.id = id;
    this.text = text;
    this.extension = extension;
    this.validCodedValueSet = validCodedValueSet;
    this.abnormalCodedValueSet = abnormalCodedValueSet;
    this.category = category;
    this.preferredReportName = preferredReportName;
    this.identifier = identifier;
    this.code = code;
    this.qualifiedInterval = qualifiedInterval;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code criticalCodedValueSet} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("criticalCodedValueSet")
  @Override
  public java.util.Optional<com.fhir.Reference> criticalCodedValueSet() {
    return java.util.Optional.ofNullable(criticalCodedValueSet);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code method} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("method")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> method() {
    return java.util.Optional.ofNullable(method);
  }

  /**
   * @return The value of the {@code quantitativeDetails} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("quantitativeDetails")
  @Override
  public java.util.Optional<com.fhir.ObservationDefinition_QuantitativeDetails> quantitativeDetails() {
    return java.util.Optional.ofNullable(quantitativeDetails);
  }

  /**
   * @return The value of the {@code permittedDataType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("permittedDataType")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ObservationdefinitionPermitteddatatypeItem>> permittedDataType() {
    return java.util.Optional.ofNullable(permittedDataType);
  }

  /**
   * @return The value of the {@code normalCodedValueSet} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("normalCodedValueSet")
  @Override
  public java.util.Optional<com.fhir.Reference> normalCodedValueSet() {
    return java.util.Optional.ofNullable(normalCodedValueSet);
  }

  /**
   * @return The value of the {@code multipleResultsAllowed} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("multipleResultsAllowed")
  @Override
  public java.util.Optional<java.lang.Boolean> multipleResultsAllowed() {
    return java.util.Optional.ofNullable(multipleResultsAllowed);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code validCodedValueSet} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("validCodedValueSet")
  @Override
  public java.util.Optional<com.fhir.Reference> validCodedValueSet() {
    return java.util.Optional.ofNullable(validCodedValueSet);
  }

  /**
   * @return The value of the {@code abnormalCodedValueSet} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("abnormalCodedValueSet")
  @Override
  public java.util.Optional<com.fhir.Reference> abnormalCodedValueSet() {
    return java.util.Optional.ofNullable(abnormalCodedValueSet);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() {
    return java.util.Optional.ofNullable(category);
  }

  /**
   * @return The value of the {@code preferredReportName} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preferredReportName")
  @Override
  public java.util.Optional<java.lang.String> preferredReportName() {
    return java.util.Optional.ofNullable(preferredReportName);
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public com.fhir.CodeableConcept code() {
    return code;
  }

  /**
   * @return The value of the {@code qualifiedInterval} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("qualifiedInterval")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ObservationDefinition_QualifiedInterval>> qualifiedInterval() {
    return java.util.Optional.ofNullable(qualifiedInterval);
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
   * Copy the current immutable object by setting a value for the {@link ObservationDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableObservationDefinition withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableObservationDefinition(
        newValue,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        newValue,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        value,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        newValue,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        value,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#criticalCodedValueSet() criticalCodedValueSet} attribute.
   * @param value The value for criticalCodedValueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withCriticalCodedValueSet(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "criticalCodedValueSet");
    if (this.criticalCodedValueSet == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        newValue,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#criticalCodedValueSet() criticalCodedValueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for criticalCodedValueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withCriticalCodedValueSet(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.criticalCodedValueSet == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        value,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        newValue,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        value,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        newValue,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        value,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withMethod(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        newValue,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withMethod(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        value,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#quantitativeDetails() quantitativeDetails} attribute.
   * @param value The value for quantitativeDetails
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withQuantitativeDetails(com.fhir.ObservationDefinition_QuantitativeDetails value) {
    @javax.annotation.Nullable com.fhir.ObservationDefinition_QuantitativeDetails newValue = java.util.Objects.requireNonNull(value, "quantitativeDetails");
    if (this.quantitativeDetails == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        newValue,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#quantitativeDetails() quantitativeDetails} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantitativeDetails
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withQuantitativeDetails(java.util.Optional<? extends com.fhir.ObservationDefinition_QuantitativeDetails> optional) {
    @javax.annotation.Nullable com.fhir.ObservationDefinition_QuantitativeDetails value = optional.orElse(null);
    if (this.quantitativeDetails == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        value,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#permittedDataType() permittedDataType} attribute.
   * @param value The value for permittedDataType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withPermittedDataType(java.util.List<com.fhir.ObservationdefinitionPermitteddatatypeItem> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ObservationdefinitionPermitteddatatypeItem> newValue = java.util.Objects.requireNonNull(value, "permittedDataType");
    if (this.permittedDataType == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        newValue,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#permittedDataType() permittedDataType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for permittedDataType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withPermittedDataType(java.util.Optional<? extends java.util.List<com.fhir.ObservationdefinitionPermitteddatatypeItem>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ObservationdefinitionPermitteddatatypeItem> value = optional.orElse(null);
    if (this.permittedDataType == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        value,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#normalCodedValueSet() normalCodedValueSet} attribute.
   * @param value The value for normalCodedValueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withNormalCodedValueSet(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "normalCodedValueSet");
    if (this.normalCodedValueSet == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        newValue,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#normalCodedValueSet() normalCodedValueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for normalCodedValueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withNormalCodedValueSet(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.normalCodedValueSet == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        value,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#multipleResultsAllowed() multipleResultsAllowed} attribute.
   * @param value The value for multipleResultsAllowed
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withMultipleResultsAllowed(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.multipleResultsAllowed, newValue)) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        newValue,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#multipleResultsAllowed() multipleResultsAllowed} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for multipleResultsAllowed
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withMultipleResultsAllowed(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.multipleResultsAllowed, value)) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        value,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        newValue,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        value,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        newValue,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        value,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        newValue,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        value,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#validCodedValueSet() validCodedValueSet} attribute.
   * @param value The value for validCodedValueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withValidCodedValueSet(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "validCodedValueSet");
    if (this.validCodedValueSet == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        newValue,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#validCodedValueSet() validCodedValueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validCodedValueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withValidCodedValueSet(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.validCodedValueSet == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        value,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#abnormalCodedValueSet() abnormalCodedValueSet} attribute.
   * @param value The value for abnormalCodedValueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withAbnormalCodedValueSet(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "abnormalCodedValueSet");
    if (this.abnormalCodedValueSet == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        newValue,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#abnormalCodedValueSet() abnormalCodedValueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for abnormalCodedValueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withAbnormalCodedValueSet(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.abnormalCodedValueSet == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        value,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        newValue,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        value,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#preferredReportName() preferredReportName} attribute.
   * @param value The value for preferredReportName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withPreferredReportName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "preferredReportName");
    if (java.util.Objects.equals(this.preferredReportName, newValue)) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        newValue,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#preferredReportName() preferredReportName} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preferredReportName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withPreferredReportName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.preferredReportName, value)) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        value,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        newValue,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        value,
        this.code,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ObservationDefinition#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableObservationDefinition withCode(com.fhir.CodeableConcept value) {
    if (this.code == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        newValue,
        this.qualifiedInterval,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#qualifiedInterval() qualifiedInterval} attribute.
   * @param value The value for qualifiedInterval
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withQualifiedInterval(java.util.List<com.fhir.ObservationDefinition_QualifiedInterval> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ObservationDefinition_QualifiedInterval> newValue = java.util.Objects.requireNonNull(value, "qualifiedInterval");
    if (this.qualifiedInterval == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#qualifiedInterval() qualifiedInterval} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for qualifiedInterval
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withQualifiedInterval(java.util.Optional<? extends java.util.List<com.fhir.ObservationDefinition_QualifiedInterval>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ObservationDefinition_QualifiedInterval> value = optional.orElse(null);
    if (this.qualifiedInterval == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableObservationDefinition(
        this.resourceType,
        this.implicitRules,
        this.contained,
        this.criticalCodedValueSet,
        this.meta,
        this.language,
        this.method,
        this.quantitativeDetails,
        this.permittedDataType,
        this.normalCodedValueSet,
        this.multipleResultsAllowed,
        this.id,
        this.text,
        this.extension,
        this.validCodedValueSet,
        this.abnormalCodedValueSet,
        this.category,
        this.preferredReportName,
        this.identifier,
        this.code,
        this.qualifiedInterval,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableObservationDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableObservationDefinition
        && equalTo((ImmutableObservationDefinition) another);
  }

  private boolean equalTo(ImmutableObservationDefinition another) {
    return resourceType.equals(another.resourceType)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(criticalCodedValueSet, another.criticalCodedValueSet)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(method, another.method)
        && java.util.Objects.equals(quantitativeDetails, another.quantitativeDetails)
        && java.util.Objects.equals(permittedDataType, another.permittedDataType)
        && java.util.Objects.equals(normalCodedValueSet, another.normalCodedValueSet)
        && java.util.Objects.equals(multipleResultsAllowed, another.multipleResultsAllowed)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(validCodedValueSet, another.validCodedValueSet)
        && java.util.Objects.equals(abnormalCodedValueSet, another.abnormalCodedValueSet)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(preferredReportName, another.preferredReportName)
        && java.util.Objects.equals(identifier, another.identifier)
        && code.equals(another.code)
        && java.util.Objects.equals(qualifiedInterval, another.qualifiedInterval)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code resourceType}, {@code implicitRules}, {@code contained}, {@code criticalCodedValueSet}, {@code meta}, {@code language}, {@code method}, {@code quantitativeDetails}, {@code permittedDataType}, {@code normalCodedValueSet}, {@code multipleResultsAllowed}, {@code id}, {@code text}, {@code extension}, {@code validCodedValueSet}, {@code abnormalCodedValueSet}, {@code category}, {@code preferredReportName}, {@code identifier}, {@code code}, {@code qualifiedInterval}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(criticalCodedValueSet);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(method);
    h += (h << 5) + java.util.Objects.hashCode(quantitativeDetails);
    h += (h << 5) + java.util.Objects.hashCode(permittedDataType);
    h += (h << 5) + java.util.Objects.hashCode(normalCodedValueSet);
    h += (h << 5) + java.util.Objects.hashCode(multipleResultsAllowed);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(validCodedValueSet);
    h += (h << 5) + java.util.Objects.hashCode(abnormalCodedValueSet);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(preferredReportName);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(qualifiedInterval);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ObservationDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ObservationDefinition{");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (criticalCodedValueSet != null) {
      builder.append(", ");
      builder.append("criticalCodedValueSet=").append(criticalCodedValueSet);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (method != null) {
      builder.append(", ");
      builder.append("method=").append(method);
    }
    if (quantitativeDetails != null) {
      builder.append(", ");
      builder.append("quantitativeDetails=").append(quantitativeDetails);
    }
    if (permittedDataType != null) {
      builder.append(", ");
      builder.append("permittedDataType=").append(permittedDataType);
    }
    if (normalCodedValueSet != null) {
      builder.append(", ");
      builder.append("normalCodedValueSet=").append(normalCodedValueSet);
    }
    if (multipleResultsAllowed != null) {
      builder.append(", ");
      builder.append("multipleResultsAllowed=").append(multipleResultsAllowed);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (validCodedValueSet != null) {
      builder.append(", ");
      builder.append("validCodedValueSet=").append(validCodedValueSet);
    }
    if (abnormalCodedValueSet != null) {
      builder.append(", ");
      builder.append("abnormalCodedValueSet=").append(abnormalCodedValueSet);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (preferredReportName != null) {
      builder.append(", ");
      builder.append("preferredReportName=").append(preferredReportName);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    builder.append(", ");
    builder.append("code=").append(code);
    if (qualifiedInterval != null) {
      builder.append(", ");
      builder.append("qualifiedInterval=").append(qualifiedInterval);
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
  @org.immutables.value.Generated(from = "ObservationDefinition", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ObservationDefinition {
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> criticalCodedValueSet = java.util.Optional.empty();
    boolean criticalCodedValueSetIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> method = java.util.Optional.empty();
    boolean methodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ObservationDefinition_QuantitativeDetails> quantitativeDetails = java.util.Optional.empty();
    boolean quantitativeDetailsIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ObservationdefinitionPermitteddatatypeItem>> permittedDataType = java.util.Optional.empty();
    boolean permittedDataTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> normalCodedValueSet = java.util.Optional.empty();
    boolean normalCodedValueSetIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> multipleResultsAllowed = java.util.Optional.empty();
    boolean multipleResultsAllowedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> validCodedValueSet = java.util.Optional.empty();
    boolean validCodedValueSetIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> abnormalCodedValueSet = java.util.Optional.empty();
    boolean abnormalCodedValueSetIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> preferredReportName = java.util.Optional.empty();
    boolean preferredReportNameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept code;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ObservationDefinition_QualifiedInterval>> qualifiedInterval = java.util.Optional.empty();
    boolean qualifiedIntervalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("criticalCodedValueSet")
    public void setCriticalCodedValueSet(java.util.Optional<com.fhir.Reference> criticalCodedValueSet) {
      this.criticalCodedValueSet = criticalCodedValueSet;
      this.criticalCodedValueSetIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("method")
    public void setMethod(java.util.Optional<com.fhir.CodeableConcept> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantitativeDetails")
    public void setQuantitativeDetails(java.util.Optional<com.fhir.ObservationDefinition_QuantitativeDetails> quantitativeDetails) {
      this.quantitativeDetails = quantitativeDetails;
      this.quantitativeDetailsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("permittedDataType")
    public void setPermittedDataType(java.util.Optional<java.util.List<com.fhir.ObservationdefinitionPermitteddatatypeItem>> permittedDataType) {
      this.permittedDataType = permittedDataType;
      this.permittedDataTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("normalCodedValueSet")
    public void setNormalCodedValueSet(java.util.Optional<com.fhir.Reference> normalCodedValueSet) {
      this.normalCodedValueSet = normalCodedValueSet;
      this.normalCodedValueSetIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("multipleResultsAllowed")
    public void setMultipleResultsAllowed(java.util.Optional<java.lang.Boolean> multipleResultsAllowed) {
      this.multipleResultsAllowed = multipleResultsAllowed;
      this.multipleResultsAllowedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("validCodedValueSet")
    public void setValidCodedValueSet(java.util.Optional<com.fhir.Reference> validCodedValueSet) {
      this.validCodedValueSet = validCodedValueSet;
      this.validCodedValueSetIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("abnormalCodedValueSet")
    public void setAbnormalCodedValueSet(java.util.Optional<com.fhir.Reference> abnormalCodedValueSet) {
      this.abnormalCodedValueSet = abnormalCodedValueSet;
      this.abnormalCodedValueSetIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("preferredReportName")
    public void setPreferredReportName(java.util.Optional<java.lang.String> preferredReportName) {
      this.preferredReportName = preferredReportName;
      this.preferredReportNameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(com.fhir.CodeableConcept code) {
      this.code = code;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("qualifiedInterval")
    public void setQualifiedInterval(java.util.Optional<java.util.List<com.fhir.ObservationDefinition_QualifiedInterval>> qualifiedInterval) {
      this.qualifiedInterval = qualifiedInterval;
      this.qualifiedIntervalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> criticalCodedValueSet() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> method() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ObservationDefinition_QuantitativeDetails> quantitativeDetails() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ObservationdefinitionPermitteddatatypeItem>> permittedDataType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> normalCodedValueSet() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> multipleResultsAllowed() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> validCodedValueSet() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> abnormalCodedValueSet() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> preferredReportName() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ObservationDefinition_QualifiedInterval>> qualifiedInterval() { throw new UnsupportedOperationException(); }
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
  static ImmutableObservationDefinition fromJson(Json json) {
    ImmutableObservationDefinition.Builder builder = ((ImmutableObservationDefinition.Builder) ImmutableObservationDefinition.builder());
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.criticalCodedValueSetIsSet) {
      builder.criticalCodedValueSet(json.criticalCodedValueSet);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    if (json.quantitativeDetailsIsSet) {
      builder.quantitativeDetails(json.quantitativeDetails);
    }
    if (json.permittedDataTypeIsSet) {
      builder.permittedDataType(json.permittedDataType);
    }
    if (json.normalCodedValueSetIsSet) {
      builder.normalCodedValueSet(json.normalCodedValueSet);
    }
    if (json.multipleResultsAllowedIsSet) {
      builder.multipleResultsAllowed(json.multipleResultsAllowed);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.validCodedValueSetIsSet) {
      builder.validCodedValueSet(json.validCodedValueSet);
    }
    if (json.abnormalCodedValueSetIsSet) {
      builder.abnormalCodedValueSet(json.abnormalCodedValueSet);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.preferredReportNameIsSet) {
      builder.preferredReportName(json.preferredReportName);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.qualifiedIntervalIsSet) {
      builder.qualifiedInterval(json.qualifiedInterval);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableObservationDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ObservationDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ObservationDefinition instance
   */
  public static ObservationDefinition copyOf(ObservationDefinition instance) {
    if (instance instanceof ImmutableObservationDefinition) {
      return (ImmutableObservationDefinition) instance;
    }
    return ((ImmutableObservationDefinition.Builder) ImmutableObservationDefinition.builder())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .criticalCodedValueSet(instance.criticalCodedValueSet())
        .meta(instance.meta())
        .language(instance.language())
        .method(instance.method())
        .quantitativeDetails(instance.quantitativeDetails())
        .permittedDataType(instance.permittedDataType())
        .normalCodedValueSet(instance.normalCodedValueSet())
        .multipleResultsAllowed(instance.multipleResultsAllowed())
        .id(instance.id())
        .text(instance.text())
        .extension(instance.extension())
        .validCodedValueSet(instance.validCodedValueSet())
        .abnormalCodedValueSet(instance.abnormalCodedValueSet())
        .category(instance.category())
        .preferredReportName(instance.preferredReportName())
        .identifier(instance.identifier())
        .code(instance.code())
        .qualifiedInterval(instance.qualifiedInterval())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ObservationDefinition ObservationDefinition}.
   * <pre>
   * ImmutableObservationDefinition.builder()
   *    .resourceType(String) // required {@link ObservationDefinition#resourceType() resourceType}
   *    .implicitRules(com.fhir.uri) // optional {@link ObservationDefinition#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link ObservationDefinition#contained() contained}
   *    .criticalCodedValueSet(com.fhir.Reference) // optional {@link ObservationDefinition#criticalCodedValueSet() criticalCodedValueSet}
   *    .meta(com.fhir.Meta) // optional {@link ObservationDefinition#meta() meta}
   *    .language(com.fhir.code) // optional {@link ObservationDefinition#language() language}
   *    .method(com.fhir.CodeableConcept) // optional {@link ObservationDefinition#method() method}
   *    .quantitativeDetails(com.fhir.ObservationDefinition_QuantitativeDetails) // optional {@link ObservationDefinition#quantitativeDetails() quantitativeDetails}
   *    .permittedDataType(List&amp;lt;com.fhir.ObservationdefinitionPermitteddatatypeItem&amp;gt;) // optional {@link ObservationDefinition#permittedDataType() permittedDataType}
   *    .normalCodedValueSet(com.fhir.Reference) // optional {@link ObservationDefinition#normalCodedValueSet() normalCodedValueSet}
   *    .multipleResultsAllowed(Boolean) // optional {@link ObservationDefinition#multipleResultsAllowed() multipleResultsAllowed}
   *    .id(com.fhir.id) // optional {@link ObservationDefinition#id() id}
   *    .text(com.fhir.Narrative) // optional {@link ObservationDefinition#text() text}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ObservationDefinition#extension() extension}
   *    .validCodedValueSet(com.fhir.Reference) // optional {@link ObservationDefinition#validCodedValueSet() validCodedValueSet}
   *    .abnormalCodedValueSet(com.fhir.Reference) // optional {@link ObservationDefinition#abnormalCodedValueSet() abnormalCodedValueSet}
   *    .category(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ObservationDefinition#category() category}
   *    .preferredReportName(String) // optional {@link ObservationDefinition#preferredReportName() preferredReportName}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link ObservationDefinition#identifier() identifier}
   *    .code(com.fhir.CodeableConcept) // required {@link ObservationDefinition#code() code}
   *    .qualifiedInterval(List&amp;lt;com.fhir.ObservationDefinition_QualifiedInterval&amp;gt;) // optional {@link ObservationDefinition#qualifiedInterval() qualifiedInterval}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ObservationDefinition#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ObservationDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableObservationDefinition.Builder();
  }

  /**
   * Builds instances of type {@link ObservationDefinition ObservationDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ObservationDefinition", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, CodeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_CODE = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x2L;
    private static final long OPT_BIT_CRITICAL_CODED_VALUE_SET = 0x4L;
    private static final long OPT_BIT_META = 0x8L;
    private static final long OPT_BIT_LANGUAGE = 0x10L;
    private static final long OPT_BIT_METHOD = 0x20L;
    private static final long OPT_BIT_QUANTITATIVE_DETAILS = 0x40L;
    private static final long OPT_BIT_PERMITTED_DATA_TYPE = 0x80L;
    private static final long OPT_BIT_NORMAL_CODED_VALUE_SET = 0x100L;
    private static final long OPT_BIT_MULTIPLE_RESULTS_ALLOWED = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private static final long OPT_BIT_VALID_CODED_VALUE_SET = 0x2000L;
    private static final long OPT_BIT_ABNORMAL_CODED_VALUE_SET = 0x4000L;
    private static final long OPT_BIT_CATEGORY = 0x8000L;
    private static final long OPT_BIT_PREFERRED_REPORT_NAME = 0x10000L;
    private static final long OPT_BIT_IDENTIFIER = 0x20000L;
    private static final long OPT_BIT_QUALIFIED_INTERVAL = 0x40000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Reference criticalCodedValueSet;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept method;
    private @javax.annotation.Nullable com.fhir.ObservationDefinition_QuantitativeDetails quantitativeDetails;
    private @javax.annotation.Nullable java.util.List<com.fhir.ObservationdefinitionPermitteddatatypeItem> permittedDataType;
    private @javax.annotation.Nullable com.fhir.Reference normalCodedValueSet;
    private @javax.annotation.Nullable java.lang.Boolean multipleResultsAllowed;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference validCodedValueSet;
    private @javax.annotation.Nullable com.fhir.Reference abnormalCodedValueSet;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
    private @javax.annotation.Nullable java.lang.String preferredReportName;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable java.util.List<com.fhir.ObservationDefinition_QualifiedInterval> qualifiedInterval;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link ObservationDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ObservationDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ObservationDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ObservationDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link ObservationDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link ObservationDefinition#criticalCodedValueSet() criticalCodedValueSet} to criticalCodedValueSet.
     * @param criticalCodedValueSet The value for criticalCodedValueSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder criticalCodedValueSet(com.fhir.Reference criticalCodedValueSet) {
      checkNotIsSet(criticalCodedValueSetIsSet(), "criticalCodedValueSet");
      this.criticalCodedValueSet = java.util.Objects.requireNonNull(criticalCodedValueSet, "criticalCodedValueSet");
      optBits |= OPT_BIT_CRITICAL_CODED_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#criticalCodedValueSet() criticalCodedValueSet} to criticalCodedValueSet.
     * @param criticalCodedValueSet The value for criticalCodedValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("criticalCodedValueSet")
    public final Builder criticalCodedValueSet(java.util.Optional<? extends com.fhir.Reference> criticalCodedValueSet) {
      checkNotIsSet(criticalCodedValueSetIsSet(), "criticalCodedValueSet");
      this.criticalCodedValueSet = criticalCodedValueSet.orElse(null);
      optBits |= OPT_BIT_CRITICAL_CODED_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link ObservationDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link ObservationDefinition#language() language} to language.
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
     * Initializes the optional value {@link ObservationDefinition#language() language} to language.
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
     * Initializes the optional value {@link ObservationDefinition#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(com.fhir.CodeableConcept method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = java.util.Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("method")
    public final Builder method(java.util.Optional<? extends com.fhir.CodeableConcept> method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = method.orElse(null);
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#quantitativeDetails() quantitativeDetails} to quantitativeDetails.
     * @param quantitativeDetails The value for quantitativeDetails
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantitativeDetails(com.fhir.ObservationDefinition_QuantitativeDetails quantitativeDetails) {
      checkNotIsSet(quantitativeDetailsIsSet(), "quantitativeDetails");
      this.quantitativeDetails = java.util.Objects.requireNonNull(quantitativeDetails, "quantitativeDetails");
      optBits |= OPT_BIT_QUANTITATIVE_DETAILS;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#quantitativeDetails() quantitativeDetails} to quantitativeDetails.
     * @param quantitativeDetails The value for quantitativeDetails
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantitativeDetails")
    public final Builder quantitativeDetails(java.util.Optional<? extends com.fhir.ObservationDefinition_QuantitativeDetails> quantitativeDetails) {
      checkNotIsSet(quantitativeDetailsIsSet(), "quantitativeDetails");
      this.quantitativeDetails = quantitativeDetails.orElse(null);
      optBits |= OPT_BIT_QUANTITATIVE_DETAILS;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#permittedDataType() permittedDataType} to permittedDataType.
     * @param permittedDataType The value for permittedDataType
     * @return {@code this} builder for chained invocation
     */
    public final Builder permittedDataType(java.util.List<com.fhir.ObservationdefinitionPermitteddatatypeItem> permittedDataType) {
      checkNotIsSet(permittedDataTypeIsSet(), "permittedDataType");
      this.permittedDataType = java.util.Objects.requireNonNull(permittedDataType, "permittedDataType");
      optBits |= OPT_BIT_PERMITTED_DATA_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#permittedDataType() permittedDataType} to permittedDataType.
     * @param permittedDataType The value for permittedDataType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("permittedDataType")
    public final Builder permittedDataType(java.util.Optional<? extends java.util.List<com.fhir.ObservationdefinitionPermitteddatatypeItem>> permittedDataType) {
      checkNotIsSet(permittedDataTypeIsSet(), "permittedDataType");
      this.permittedDataType = permittedDataType.orElse(null);
      optBits |= OPT_BIT_PERMITTED_DATA_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#normalCodedValueSet() normalCodedValueSet} to normalCodedValueSet.
     * @param normalCodedValueSet The value for normalCodedValueSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder normalCodedValueSet(com.fhir.Reference normalCodedValueSet) {
      checkNotIsSet(normalCodedValueSetIsSet(), "normalCodedValueSet");
      this.normalCodedValueSet = java.util.Objects.requireNonNull(normalCodedValueSet, "normalCodedValueSet");
      optBits |= OPT_BIT_NORMAL_CODED_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#normalCodedValueSet() normalCodedValueSet} to normalCodedValueSet.
     * @param normalCodedValueSet The value for normalCodedValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("normalCodedValueSet")
    public final Builder normalCodedValueSet(java.util.Optional<? extends com.fhir.Reference> normalCodedValueSet) {
      checkNotIsSet(normalCodedValueSetIsSet(), "normalCodedValueSet");
      this.normalCodedValueSet = normalCodedValueSet.orElse(null);
      optBits |= OPT_BIT_NORMAL_CODED_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#multipleResultsAllowed() multipleResultsAllowed} to multipleResultsAllowed.
     * @param multipleResultsAllowed The value for multipleResultsAllowed
     * @return {@code this} builder for chained invocation
     */
    public final Builder multipleResultsAllowed(boolean multipleResultsAllowed) {
      checkNotIsSet(multipleResultsAllowedIsSet(), "multipleResultsAllowed");
      this.multipleResultsAllowed = multipleResultsAllowed;
      optBits |= OPT_BIT_MULTIPLE_RESULTS_ALLOWED;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#multipleResultsAllowed() multipleResultsAllowed} to multipleResultsAllowed.
     * @param multipleResultsAllowed The value for multipleResultsAllowed
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("multipleResultsAllowed")
    public final Builder multipleResultsAllowed(java.util.Optional<java.lang.Boolean> multipleResultsAllowed) {
      checkNotIsSet(multipleResultsAllowedIsSet(), "multipleResultsAllowed");
      this.multipleResultsAllowed = multipleResultsAllowed.orElse(null);
      optBits |= OPT_BIT_MULTIPLE_RESULTS_ALLOWED;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#id() id} to id.
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
     * Initializes the optional value {@link ObservationDefinition#id() id} to id.
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
     * Initializes the optional value {@link ObservationDefinition#text() text} to text.
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
     * Initializes the optional value {@link ObservationDefinition#text() text} to text.
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
     * Initializes the optional value {@link ObservationDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ObservationDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ObservationDefinition#validCodedValueSet() validCodedValueSet} to validCodedValueSet.
     * @param validCodedValueSet The value for validCodedValueSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder validCodedValueSet(com.fhir.Reference validCodedValueSet) {
      checkNotIsSet(validCodedValueSetIsSet(), "validCodedValueSet");
      this.validCodedValueSet = java.util.Objects.requireNonNull(validCodedValueSet, "validCodedValueSet");
      optBits |= OPT_BIT_VALID_CODED_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#validCodedValueSet() validCodedValueSet} to validCodedValueSet.
     * @param validCodedValueSet The value for validCodedValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validCodedValueSet")
    public final Builder validCodedValueSet(java.util.Optional<? extends com.fhir.Reference> validCodedValueSet) {
      checkNotIsSet(validCodedValueSetIsSet(), "validCodedValueSet");
      this.validCodedValueSet = validCodedValueSet.orElse(null);
      optBits |= OPT_BIT_VALID_CODED_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#abnormalCodedValueSet() abnormalCodedValueSet} to abnormalCodedValueSet.
     * @param abnormalCodedValueSet The value for abnormalCodedValueSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder abnormalCodedValueSet(com.fhir.Reference abnormalCodedValueSet) {
      checkNotIsSet(abnormalCodedValueSetIsSet(), "abnormalCodedValueSet");
      this.abnormalCodedValueSet = java.util.Objects.requireNonNull(abnormalCodedValueSet, "abnormalCodedValueSet");
      optBits |= OPT_BIT_ABNORMAL_CODED_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#abnormalCodedValueSet() abnormalCodedValueSet} to abnormalCodedValueSet.
     * @param abnormalCodedValueSet The value for abnormalCodedValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("abnormalCodedValueSet")
    public final Builder abnormalCodedValueSet(java.util.Optional<? extends com.fhir.Reference> abnormalCodedValueSet) {
      checkNotIsSet(abnormalCodedValueSetIsSet(), "abnormalCodedValueSet");
      this.abnormalCodedValueSet = abnormalCodedValueSet.orElse(null);
      optBits |= OPT_BIT_ABNORMAL_CODED_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(java.util.List<com.fhir.CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#preferredReportName() preferredReportName} to preferredReportName.
     * @param preferredReportName The value for preferredReportName
     * @return {@code this} builder for chained invocation
     */
    public final Builder preferredReportName(java.lang.String preferredReportName) {
      checkNotIsSet(preferredReportNameIsSet(), "preferredReportName");
      this.preferredReportName = java.util.Objects.requireNonNull(preferredReportName, "preferredReportName");
      optBits |= OPT_BIT_PREFERRED_REPORT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#preferredReportName() preferredReportName} to preferredReportName.
     * @param preferredReportName The value for preferredReportName
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredReportName")
    public final Builder preferredReportName(java.util.Optional<java.lang.String> preferredReportName) {
      checkNotIsSet(preferredReportNameIsSet(), "preferredReportName");
      this.preferredReportName = preferredReportName.orElse(null);
      optBits |= OPT_BIT_PREFERRED_REPORT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ObservationDefinition#identifier() identifier} to identifier.
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
     * Initializes the value for the {@link ObservationDefinition#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#qualifiedInterval() qualifiedInterval} to qualifiedInterval.
     * @param qualifiedInterval The value for qualifiedInterval
     * @return {@code this} builder for chained invocation
     */
    public final Builder qualifiedInterval(java.util.List<com.fhir.ObservationDefinition_QualifiedInterval> qualifiedInterval) {
      checkNotIsSet(qualifiedIntervalIsSet(), "qualifiedInterval");
      this.qualifiedInterval = java.util.Objects.requireNonNull(qualifiedInterval, "qualifiedInterval");
      optBits |= OPT_BIT_QUALIFIED_INTERVAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#qualifiedInterval() qualifiedInterval} to qualifiedInterval.
     * @param qualifiedInterval The value for qualifiedInterval
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("qualifiedInterval")
    public final Builder qualifiedInterval(java.util.Optional<? extends java.util.List<com.fhir.ObservationDefinition_QualifiedInterval>> qualifiedInterval) {
      checkNotIsSet(qualifiedIntervalIsSet(), "qualifiedInterval");
      this.qualifiedInterval = qualifiedInterval.orElse(null);
      optBits |= OPT_BIT_QUALIFIED_INTERVAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ObservationDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ObservationDefinition ObservationDefinition}.
     * @return An immutable instance of ObservationDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ObservationDefinition build() {
      checkRequiredAttributes();
      return new ImmutableObservationDefinition(
          resourceType,
          implicitRules,
          contained,
          criticalCodedValueSet,
          meta,
          language,
          method,
          quantitativeDetails,
          permittedDataType,
          normalCodedValueSet,
          multipleResultsAllowed,
          id,
          text,
          extension,
          validCodedValueSet,
          abnormalCodedValueSet,
          category,
          preferredReportName,
          identifier,
          code,
          qualifiedInterval,
          modifierExtension);
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean criticalCodedValueSetIsSet() {
      return (optBits & OPT_BIT_CRITICAL_CODED_VALUE_SET) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private boolean quantitativeDetailsIsSet() {
      return (optBits & OPT_BIT_QUANTITATIVE_DETAILS) != 0;
    }

    private boolean permittedDataTypeIsSet() {
      return (optBits & OPT_BIT_PERMITTED_DATA_TYPE) != 0;
    }

    private boolean normalCodedValueSetIsSet() {
      return (optBits & OPT_BIT_NORMAL_CODED_VALUE_SET) != 0;
    }

    private boolean multipleResultsAllowedIsSet() {
      return (optBits & OPT_BIT_MULTIPLE_RESULTS_ALLOWED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean validCodedValueSetIsSet() {
      return (optBits & OPT_BIT_VALID_CODED_VALUE_SET) != 0;
    }

    private boolean abnormalCodedValueSetIsSet() {
      return (optBits & OPT_BIT_ABNORMAL_CODED_VALUE_SET) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean preferredReportNameIsSet() {
      return (optBits & OPT_BIT_PREFERRED_REPORT_NAME) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean qualifiedIntervalIsSet() {
      return (optBits & OPT_BIT_QUALIFIED_INTERVAL) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ObservationDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!codeIsSet()) attributes.add("code");
      return "Cannot build ObservationDefinition, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ObservationDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ObservationDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    CodeBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "ObservationDefinition", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link ObservationDefinition#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);
  }

  @org.immutables.value.Generated(from = "ObservationDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ObservationDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ObservationDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ObservationDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link ObservationDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link ObservationDefinition#criticalCodedValueSet() criticalCodedValueSet} to criticalCodedValueSet.
     * @param criticalCodedValueSet The value for criticalCodedValueSet
     * @return {@code this} builder for chained invocation
     */
    BuildFinal criticalCodedValueSet(com.fhir.Reference criticalCodedValueSet);

    /**
     * Initializes the optional value {@link ObservationDefinition#criticalCodedValueSet() criticalCodedValueSet} to criticalCodedValueSet.
     * @param criticalCodedValueSet The value for criticalCodedValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal criticalCodedValueSet(java.util.Optional<? extends com.fhir.Reference> criticalCodedValueSet);

    /**
     * Initializes the optional value {@link ObservationDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ObservationDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ObservationDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ObservationDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ObservationDefinition#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    BuildFinal method(com.fhir.CodeableConcept method);

    /**
     * Initializes the optional value {@link ObservationDefinition#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal method(java.util.Optional<? extends com.fhir.CodeableConcept> method);

    /**
     * Initializes the optional value {@link ObservationDefinition#quantitativeDetails() quantitativeDetails} to quantitativeDetails.
     * @param quantitativeDetails The value for quantitativeDetails
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantitativeDetails(com.fhir.ObservationDefinition_QuantitativeDetails quantitativeDetails);

    /**
     * Initializes the optional value {@link ObservationDefinition#quantitativeDetails() quantitativeDetails} to quantitativeDetails.
     * @param quantitativeDetails The value for quantitativeDetails
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantitativeDetails(java.util.Optional<? extends com.fhir.ObservationDefinition_QuantitativeDetails> quantitativeDetails);

    /**
     * Initializes the optional value {@link ObservationDefinition#permittedDataType() permittedDataType} to permittedDataType.
     * @param permittedDataType The value for permittedDataType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal permittedDataType(java.util.List<com.fhir.ObservationdefinitionPermitteddatatypeItem> permittedDataType);

    /**
     * Initializes the optional value {@link ObservationDefinition#permittedDataType() permittedDataType} to permittedDataType.
     * @param permittedDataType The value for permittedDataType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal permittedDataType(java.util.Optional<? extends java.util.List<com.fhir.ObservationdefinitionPermitteddatatypeItem>> permittedDataType);

    /**
     * Initializes the optional value {@link ObservationDefinition#normalCodedValueSet() normalCodedValueSet} to normalCodedValueSet.
     * @param normalCodedValueSet The value for normalCodedValueSet
     * @return {@code this} builder for chained invocation
     */
    BuildFinal normalCodedValueSet(com.fhir.Reference normalCodedValueSet);

    /**
     * Initializes the optional value {@link ObservationDefinition#normalCodedValueSet() normalCodedValueSet} to normalCodedValueSet.
     * @param normalCodedValueSet The value for normalCodedValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal normalCodedValueSet(java.util.Optional<? extends com.fhir.Reference> normalCodedValueSet);

    /**
     * Initializes the optional value {@link ObservationDefinition#multipleResultsAllowed() multipleResultsAllowed} to multipleResultsAllowed.
     * @param multipleResultsAllowed The value for multipleResultsAllowed
     * @return {@code this} builder for chained invocation
     */
    BuildFinal multipleResultsAllowed(boolean multipleResultsAllowed);

    /**
     * Initializes the optional value {@link ObservationDefinition#multipleResultsAllowed() multipleResultsAllowed} to multipleResultsAllowed.
     * @param multipleResultsAllowed The value for multipleResultsAllowed
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal multipleResultsAllowed(java.util.Optional<java.lang.Boolean> multipleResultsAllowed);

    /**
     * Initializes the optional value {@link ObservationDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ObservationDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link ObservationDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link ObservationDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link ObservationDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ObservationDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ObservationDefinition#validCodedValueSet() validCodedValueSet} to validCodedValueSet.
     * @param validCodedValueSet The value for validCodedValueSet
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validCodedValueSet(com.fhir.Reference validCodedValueSet);

    /**
     * Initializes the optional value {@link ObservationDefinition#validCodedValueSet() validCodedValueSet} to validCodedValueSet.
     * @param validCodedValueSet The value for validCodedValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validCodedValueSet(java.util.Optional<? extends com.fhir.Reference> validCodedValueSet);

    /**
     * Initializes the optional value {@link ObservationDefinition#abnormalCodedValueSet() abnormalCodedValueSet} to abnormalCodedValueSet.
     * @param abnormalCodedValueSet The value for abnormalCodedValueSet
     * @return {@code this} builder for chained invocation
     */
    BuildFinal abnormalCodedValueSet(com.fhir.Reference abnormalCodedValueSet);

    /**
     * Initializes the optional value {@link ObservationDefinition#abnormalCodedValueSet() abnormalCodedValueSet} to abnormalCodedValueSet.
     * @param abnormalCodedValueSet The value for abnormalCodedValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal abnormalCodedValueSet(java.util.Optional<? extends com.fhir.Reference> abnormalCodedValueSet);

    /**
     * Initializes the optional value {@link ObservationDefinition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link ObservationDefinition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category);

    /**
     * Initializes the optional value {@link ObservationDefinition#preferredReportName() preferredReportName} to preferredReportName.
     * @param preferredReportName The value for preferredReportName
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preferredReportName(java.lang.String preferredReportName);

    /**
     * Initializes the optional value {@link ObservationDefinition#preferredReportName() preferredReportName} to preferredReportName.
     * @param preferredReportName The value for preferredReportName
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preferredReportName(java.util.Optional<java.lang.String> preferredReportName);

    /**
     * Initializes the optional value {@link ObservationDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link ObservationDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link ObservationDefinition#qualifiedInterval() qualifiedInterval} to qualifiedInterval.
     * @param qualifiedInterval The value for qualifiedInterval
     * @return {@code this} builder for chained invocation
     */
    BuildFinal qualifiedInterval(java.util.List<com.fhir.ObservationDefinition_QualifiedInterval> qualifiedInterval);

    /**
     * Initializes the optional value {@link ObservationDefinition#qualifiedInterval() qualifiedInterval} to qualifiedInterval.
     * @param qualifiedInterval The value for qualifiedInterval
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal qualifiedInterval(java.util.Optional<? extends java.util.List<com.fhir.ObservationDefinition_QualifiedInterval>> qualifiedInterval);

    /**
     * Initializes the optional value {@link ObservationDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ObservationDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Builds a new {@link ObservationDefinition ObservationDefinition}.
     * @return An immutable instance of ObservationDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ObservationDefinition build();
  }
}
