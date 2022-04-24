//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CoverageEligibilityResponse_Item}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoverageEligibilityResponse_Item.builder()}.
 */
@org.immutables.value.Generated(from = "CoverageEligibilityResponse_Item", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoverageEligibilityResponse_Item
    implements com.fhir.CoverageEligibilityResponse_Item {
  private final @javax.annotation.Nullable com.fhir.CodeableConcept term;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept category;
  private final @javax.annotation.Nullable java.lang.Boolean authorizationRequired;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept network;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept unit;
  private final @javax.annotation.Nullable java.lang.Boolean excluded;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityResponse_Benefit> benefit;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> modifier;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept productOrService;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> authorizationSupporting;
  private final @javax.annotation.Nullable com.fhir.uri authorizationUrl;
  private final @javax.annotation.Nullable com.fhir.Reference provider;

  private ImmutableCoverageEligibilityResponse_Item(
      @javax.annotation.Nullable com.fhir.CodeableConcept term,
      @javax.annotation.Nullable com.fhir.CodeableConcept category,
      @javax.annotation.Nullable java.lang.Boolean authorizationRequired,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.CodeableConcept network,
      @javax.annotation.Nullable com.fhir.CodeableConcept unit,
      @javax.annotation.Nullable java.lang.Boolean excluded,
      @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityResponse_Benefit> benefit,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> modifier,
      @javax.annotation.Nullable com.fhir.CodeableConcept productOrService,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> authorizationSupporting,
      @javax.annotation.Nullable com.fhir.uri authorizationUrl,
      @javax.annotation.Nullable com.fhir.Reference provider) {
    this.term = term;
    this.category = category;
    this.authorizationRequired = authorizationRequired;
    this.extension = extension;
    this.description = description;
    this.modifierExtension = modifierExtension;
    this.name = name;
    this.network = network;
    this.unit = unit;
    this.excluded = excluded;
    this.benefit = benefit;
    this.id = id;
    this.modifier = modifier;
    this.productOrService = productOrService;
    this.authorizationSupporting = authorizationSupporting;
    this.authorizationUrl = authorizationUrl;
    this.provider = provider;
  }

  /**
   * @return The value of the {@code term} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("term")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> term() {
    return java.util.Optional.ofNullable(term);
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
   * @return The value of the {@code authorizationRequired} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authorizationRequired")
  @Override
  public java.util.Optional<java.lang.Boolean> authorizationRequired() {
    return java.util.Optional.ofNullable(authorizationRequired);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code network} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("network")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> network() {
    return java.util.Optional.ofNullable(network);
  }

  /**
   * @return The value of the {@code unit} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("unit")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> unit() {
    return java.util.Optional.ofNullable(unit);
  }

  /**
   * @return The value of the {@code excluded} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("excluded")
  @Override
  public java.util.Optional<java.lang.Boolean> excluded() {
    return java.util.Optional.ofNullable(excluded);
  }

  /**
   * @return The value of the {@code benefit} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("benefit")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CoverageEligibilityResponse_Benefit>> benefit() {
    return java.util.Optional.ofNullable(benefit);
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
   * @return The value of the {@code modifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier() {
    return java.util.Optional.ofNullable(modifier);
  }

  /**
   * @return The value of the {@code productOrService} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("productOrService")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> productOrService() {
    return java.util.Optional.ofNullable(productOrService);
  }

  /**
   * @return The value of the {@code authorizationSupporting} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authorizationSupporting")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> authorizationSupporting() {
    return java.util.Optional.ofNullable(authorizationSupporting);
  }

  /**
   * @return The value of the {@code authorizationUrl} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authorizationUrl")
  @Override
  public java.util.Optional<com.fhir.uri> authorizationUrl() {
    return java.util.Optional.ofNullable(authorizationUrl);
  }

  /**
   * @return The value of the {@code provider} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("provider")
  @Override
  public java.util.Optional<com.fhir.Reference> provider() {
    return java.util.Optional.ofNullable(provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#term() term} attribute.
   * @param value The value for term
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withTerm(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "term");
    if (this.term == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        newValue,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#term() term} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for term
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withTerm(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.term == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        value,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withCategory(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        newValue,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withCategory(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        value,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#authorizationRequired() authorizationRequired} attribute.
   * @param value The value for authorizationRequired
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withAuthorizationRequired(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.authorizationRequired, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        newValue,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#authorizationRequired() authorizationRequired} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authorizationRequired
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withAuthorizationRequired(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.authorizationRequired, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        value,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        newValue,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        value,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        newValue,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        value,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        newValue,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        value,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        newValue,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        value,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#network() network} attribute.
   * @param value The value for network
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withNetwork(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "network");
    if (this.network == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        newValue,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#network() network} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for network
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withNetwork(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.network == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        value,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#unit() unit} attribute.
   * @param value The value for unit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withUnit(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "unit");
    if (this.unit == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        newValue,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#unit() unit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withUnit(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.unit == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        value,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#excluded() excluded} attribute.
   * @param value The value for excluded
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withExcluded(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.excluded, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        newValue,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#excluded() excluded} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for excluded
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withExcluded(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.excluded, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        value,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#benefit() benefit} attribute.
   * @param value The value for benefit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withBenefit(java.util.List<com.fhir.CoverageEligibilityResponse_Benefit> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityResponse_Benefit> newValue = java.util.Objects.requireNonNull(value, "benefit");
    if (this.benefit == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        newValue,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#benefit() benefit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for benefit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withBenefit(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityResponse_Benefit>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityResponse_Benefit> value = optional.orElse(null);
    if (this.benefit == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        value,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        newValue,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        value,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#modifier() modifier} attribute.
   * @param value The value for modifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withModifier(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "modifier");
    if (this.modifier == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        newValue,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#modifier() modifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withModifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.modifier == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        value,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#productOrService() productOrService} attribute.
   * @param value The value for productOrService
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withProductOrService(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "productOrService");
    if (this.productOrService == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        newValue,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#productOrService() productOrService} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productOrService
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withProductOrService(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.productOrService == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        value,
        this.authorizationSupporting,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#authorizationSupporting() authorizationSupporting} attribute.
   * @param value The value for authorizationSupporting
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withAuthorizationSupporting(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "authorizationSupporting");
    if (this.authorizationSupporting == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        newValue,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#authorizationSupporting() authorizationSupporting} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authorizationSupporting
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withAuthorizationSupporting(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.authorizationSupporting == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        value,
        this.authorizationUrl,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#authorizationUrl() authorizationUrl} attribute.
   * @param value The value for authorizationUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withAuthorizationUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "authorizationUrl");
    if (this.authorizationUrl == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        newValue,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#authorizationUrl() authorizationUrl} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authorizationUrl
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withAuthorizationUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.authorizationUrl == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        value,
        this.provider);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#provider() provider} attribute.
   * @param value The value for provider
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withProvider(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "provider");
    if (this.provider == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#provider() provider} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for provider
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withProvider(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.provider == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.term,
        this.category,
        this.authorizationRequired,
        this.extension,
        this.description,
        this.modifierExtension,
        this.name,
        this.network,
        this.unit,
        this.excluded,
        this.benefit,
        this.id,
        this.modifier,
        this.productOrService,
        this.authorizationSupporting,
        this.authorizationUrl,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoverageEligibilityResponse_Item} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoverageEligibilityResponse_Item
        && equalTo((ImmutableCoverageEligibilityResponse_Item) another);
  }

  private boolean equalTo(ImmutableCoverageEligibilityResponse_Item another) {
    return java.util.Objects.equals(term, another.term)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(authorizationRequired, another.authorizationRequired)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(network, another.network)
        && java.util.Objects.equals(unit, another.unit)
        && java.util.Objects.equals(excluded, another.excluded)
        && java.util.Objects.equals(benefit, another.benefit)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifier, another.modifier)
        && java.util.Objects.equals(productOrService, another.productOrService)
        && java.util.Objects.equals(authorizationSupporting, another.authorizationSupporting)
        && java.util.Objects.equals(authorizationUrl, another.authorizationUrl)
        && java.util.Objects.equals(provider, another.provider);
  }

  /**
   * Computes a hash code from attributes: {@code term}, {@code category}, {@code authorizationRequired}, {@code extension}, {@code description}, {@code modifierExtension}, {@code name}, {@code network}, {@code unit}, {@code excluded}, {@code benefit}, {@code id}, {@code modifier}, {@code productOrService}, {@code authorizationSupporting}, {@code authorizationUrl}, {@code provider}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(term);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(authorizationRequired);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(network);
    h += (h << 5) + java.util.Objects.hashCode(unit);
    h += (h << 5) + java.util.Objects.hashCode(excluded);
    h += (h << 5) + java.util.Objects.hashCode(benefit);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifier);
    h += (h << 5) + java.util.Objects.hashCode(productOrService);
    h += (h << 5) + java.util.Objects.hashCode(authorizationSupporting);
    h += (h << 5) + java.util.Objects.hashCode(authorizationUrl);
    h += (h << 5) + java.util.Objects.hashCode(provider);
    return h;
  }

  /**
   * Prints the immutable value {@code CoverageEligibilityResponse_Item} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CoverageEligibilityResponse_Item{");
    if (term != null) {
      builder.append("term=").append(term);
    }
    if (category != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (authorizationRequired != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("authorizationRequired=").append(authorizationRequired);
    }
    if (extension != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (description != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (modifierExtension != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (name != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (network != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("network=").append(network);
    }
    if (unit != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("unit=").append(unit);
    }
    if (excluded != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("excluded=").append(excluded);
    }
    if (benefit != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("benefit=").append(benefit);
    }
    if (id != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifier != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("modifier=").append(modifier);
    }
    if (productOrService != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("productOrService=").append(productOrService);
    }
    if (authorizationSupporting != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("authorizationSupporting=").append(authorizationSupporting);
    }
    if (authorizationUrl != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("authorizationUrl=").append(authorizationUrl);
    }
    if (provider != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("provider=").append(provider);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CoverageEligibilityResponse_Item", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CoverageEligibilityResponse_Item {
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> term = java.util.Optional.empty();
    boolean termIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> authorizationRequired = java.util.Optional.empty();
    boolean authorizationRequiredIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> network = java.util.Optional.empty();
    boolean networkIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> unit = java.util.Optional.empty();
    boolean unitIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> excluded = java.util.Optional.empty();
    boolean excludedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CoverageEligibilityResponse_Benefit>> benefit = java.util.Optional.empty();
    boolean benefitIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier = java.util.Optional.empty();
    boolean modifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> productOrService = java.util.Optional.empty();
    boolean productOrServiceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> authorizationSupporting = java.util.Optional.empty();
    boolean authorizationSupportingIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> authorizationUrl = java.util.Optional.empty();
    boolean authorizationUrlIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> provider = java.util.Optional.empty();
    boolean providerIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("term")
    public void setTerm(java.util.Optional<com.fhir.CodeableConcept> term) {
      this.term = term;
      this.termIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<com.fhir.CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationRequired")
    public void setAuthorizationRequired(java.util.Optional<java.lang.Boolean> authorizationRequired) {
      this.authorizationRequired = authorizationRequired;
      this.authorizationRequiredIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("network")
    public void setNetwork(java.util.Optional<com.fhir.CodeableConcept> network) {
      this.network = network;
      this.networkIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    public void setUnit(java.util.Optional<com.fhir.CodeableConcept> unit) {
      this.unit = unit;
      this.unitIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("excluded")
    public void setExcluded(java.util.Optional<java.lang.Boolean> excluded) {
      this.excluded = excluded;
      this.excludedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("benefit")
    public void setBenefit(java.util.Optional<java.util.List<com.fhir.CoverageEligibilityResponse_Benefit>> benefit) {
      this.benefit = benefit;
      this.benefitIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifier")
    public void setModifier(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier) {
      this.modifier = modifier;
      this.modifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("productOrService")
    public void setProductOrService(java.util.Optional<com.fhir.CodeableConcept> productOrService) {
      this.productOrService = productOrService;
      this.productOrServiceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationSupporting")
    public void setAuthorizationSupporting(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> authorizationSupporting) {
      this.authorizationSupporting = authorizationSupporting;
      this.authorizationSupportingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationUrl")
    public void setAuthorizationUrl(java.util.Optional<com.fhir.uri> authorizationUrl) {
      this.authorizationUrl = authorizationUrl;
      this.authorizationUrlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    public void setProvider(java.util.Optional<com.fhir.Reference> provider) {
      this.provider = provider;
      this.providerIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> term() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> authorizationRequired() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> network() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> unit() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> excluded() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CoverageEligibilityResponse_Benefit>> benefit() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> productOrService() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> authorizationSupporting() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> authorizationUrl() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> provider() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCoverageEligibilityResponse_Item fromJson(Json json) {
    ImmutableCoverageEligibilityResponse_Item.Builder builder = ImmutableCoverageEligibilityResponse_Item.builder();
    if (json.termIsSet) {
      builder.term(json.term);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.authorizationRequiredIsSet) {
      builder.authorizationRequired(json.authorizationRequired);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.networkIsSet) {
      builder.network(json.network);
    }
    if (json.unitIsSet) {
      builder.unit(json.unit);
    }
    if (json.excludedIsSet) {
      builder.excluded(json.excluded);
    }
    if (json.benefitIsSet) {
      builder.benefit(json.benefit);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierIsSet) {
      builder.modifier(json.modifier);
    }
    if (json.productOrServiceIsSet) {
      builder.productOrService(json.productOrService);
    }
    if (json.authorizationSupportingIsSet) {
      builder.authorizationSupporting(json.authorizationSupporting);
    }
    if (json.authorizationUrlIsSet) {
      builder.authorizationUrl(json.authorizationUrl);
    }
    if (json.providerIsSet) {
      builder.provider(json.provider);
    }
    return (ImmutableCoverageEligibilityResponse_Item) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CoverageEligibilityResponse_Item} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CoverageEligibilityResponse_Item instance
   */
  public static CoverageEligibilityResponse_Item copyOf(CoverageEligibilityResponse_Item instance) {
    if (instance instanceof ImmutableCoverageEligibilityResponse_Item) {
      return (ImmutableCoverageEligibilityResponse_Item) instance;
    }
    return ImmutableCoverageEligibilityResponse_Item.builder()
        .term(instance.term())
        .category(instance.category())
        .authorizationRequired(instance.authorizationRequired())
        .extension(instance.extension())
        .description(instance.description())
        .modifierExtension(instance.modifierExtension())
        .name(instance.name())
        .network(instance.network())
        .unit(instance.unit())
        .excluded(instance.excluded())
        .benefit(instance.benefit())
        .id(instance.id())
        .modifier(instance.modifier())
        .productOrService(instance.productOrService())
        .authorizationSupporting(instance.authorizationSupporting())
        .authorizationUrl(instance.authorizationUrl())
        .provider(instance.provider())
        .build();
  }

  /**
   * Creates a builder for {@link CoverageEligibilityResponse_Item CoverageEligibilityResponse_Item}.
   * <pre>
   * ImmutableCoverageEligibilityResponse_Item.builder()
   *    .term(com.fhir.CodeableConcept) // optional {@link CoverageEligibilityResponse_Item#term() term}
   *    .category(com.fhir.CodeableConcept) // optional {@link CoverageEligibilityResponse_Item#category() category}
   *    .authorizationRequired(Boolean) // optional {@link CoverageEligibilityResponse_Item#authorizationRequired() authorizationRequired}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityResponse_Item#extension() extension}
   *    .description(String) // optional {@link CoverageEligibilityResponse_Item#description() description}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityResponse_Item#modifierExtension() modifierExtension}
   *    .name(String) // optional {@link CoverageEligibilityResponse_Item#name() name}
   *    .network(com.fhir.CodeableConcept) // optional {@link CoverageEligibilityResponse_Item#network() network}
   *    .unit(com.fhir.CodeableConcept) // optional {@link CoverageEligibilityResponse_Item#unit() unit}
   *    .excluded(Boolean) // optional {@link CoverageEligibilityResponse_Item#excluded() excluded}
   *    .benefit(List&amp;lt;com.fhir.CoverageEligibilityResponse_Benefit&amp;gt;) // optional {@link CoverageEligibilityResponse_Item#benefit() benefit}
   *    .id(String) // optional {@link CoverageEligibilityResponse_Item#id() id}
   *    .modifier(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link CoverageEligibilityResponse_Item#modifier() modifier}
   *    .productOrService(com.fhir.CodeableConcept) // optional {@link CoverageEligibilityResponse_Item#productOrService() productOrService}
   *    .authorizationSupporting(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link CoverageEligibilityResponse_Item#authorizationSupporting() authorizationSupporting}
   *    .authorizationUrl(com.fhir.uri) // optional {@link CoverageEligibilityResponse_Item#authorizationUrl() authorizationUrl}
   *    .provider(com.fhir.Reference) // optional {@link CoverageEligibilityResponse_Item#provider() provider}
   *    .build();
   * </pre>
   * @return A new CoverageEligibilityResponse_Item builder
   */
  public static ImmutableCoverageEligibilityResponse_Item.Builder builder() {
    return new ImmutableCoverageEligibilityResponse_Item.Builder();
  }

  /**
   * Builds instances of type {@link CoverageEligibilityResponse_Item CoverageEligibilityResponse_Item}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CoverageEligibilityResponse_Item", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TERM = 0x1L;
    private static final long OPT_BIT_CATEGORY = 0x2L;
    private static final long OPT_BIT_AUTHORIZATION_REQUIRED = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_DESCRIPTION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_NAME = 0x40L;
    private static final long OPT_BIT_NETWORK = 0x80L;
    private static final long OPT_BIT_UNIT = 0x100L;
    private static final long OPT_BIT_EXCLUDED = 0x200L;
    private static final long OPT_BIT_BENEFIT = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_MODIFIER = 0x1000L;
    private static final long OPT_BIT_PRODUCT_OR_SERVICE = 0x2000L;
    private static final long OPT_BIT_AUTHORIZATION_SUPPORTING = 0x4000L;
    private static final long OPT_BIT_AUTHORIZATION_URL = 0x8000L;
    private static final long OPT_BIT_PROVIDER = 0x10000L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.CodeableConcept term;
    private @javax.annotation.Nullable com.fhir.CodeableConcept category;
    private @javax.annotation.Nullable java.lang.Boolean authorizationRequired;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.CodeableConcept network;
    private @javax.annotation.Nullable com.fhir.CodeableConcept unit;
    private @javax.annotation.Nullable java.lang.Boolean excluded;
    private @javax.annotation.Nullable java.util.List<com.fhir.CoverageEligibilityResponse_Benefit> benefit;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> modifier;
    private @javax.annotation.Nullable com.fhir.CodeableConcept productOrService;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> authorizationSupporting;
    private @javax.annotation.Nullable com.fhir.uri authorizationUrl;
    private @javax.annotation.Nullable com.fhir.Reference provider;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#term() term} to term.
     * @param term The value for term
     * @return {@code this} builder for chained invocation
     */
    public final Builder term(com.fhir.CodeableConcept term) {
      checkNotIsSet(termIsSet(), "term");
      this.term = java.util.Objects.requireNonNull(term, "term");
      optBits |= OPT_BIT_TERM;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#term() term} to term.
     * @param term The value for term
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("term")
    public final Builder term(java.util.Optional<? extends com.fhir.CodeableConcept> term) {
      checkNotIsSet(termIsSet(), "term");
      this.term = term.orElse(null);
      optBits |= OPT_BIT_TERM;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#category() category} to category.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#category() category} to category.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#authorizationRequired() authorizationRequired} to authorizationRequired.
     * @param authorizationRequired The value for authorizationRequired
     * @return {@code this} builder for chained invocation
     */
    public final Builder authorizationRequired(boolean authorizationRequired) {
      checkNotIsSet(authorizationRequiredIsSet(), "authorizationRequired");
      this.authorizationRequired = authorizationRequired;
      optBits |= OPT_BIT_AUTHORIZATION_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#authorizationRequired() authorizationRequired} to authorizationRequired.
     * @param authorizationRequired The value for authorizationRequired
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationRequired")
    public final Builder authorizationRequired(java.util.Optional<java.lang.Boolean> authorizationRequired) {
      checkNotIsSet(authorizationRequiredIsSet(), "authorizationRequired");
      this.authorizationRequired = authorizationRequired.orElse(null);
      optBits |= OPT_BIT_AUTHORIZATION_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#description() description} to description.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#description() description} to description.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.lang.String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<java.lang.String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    public final Builder network(com.fhir.CodeableConcept network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = java.util.Objects.requireNonNull(network, "network");
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("network")
    public final Builder network(java.util.Optional<? extends com.fhir.CodeableConcept> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = network.orElse(null);
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for chained invocation
     */
    public final Builder unit(com.fhir.CodeableConcept unit) {
      checkNotIsSet(unitIsSet(), "unit");
      this.unit = java.util.Objects.requireNonNull(unit, "unit");
      optBits |= OPT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    public final Builder unit(java.util.Optional<? extends com.fhir.CodeableConcept> unit) {
      checkNotIsSet(unitIsSet(), "unit");
      this.unit = unit.orElse(null);
      optBits |= OPT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#excluded() excluded} to excluded.
     * @param excluded The value for excluded
     * @return {@code this} builder for chained invocation
     */
    public final Builder excluded(boolean excluded) {
      checkNotIsSet(excludedIsSet(), "excluded");
      this.excluded = excluded;
      optBits |= OPT_BIT_EXCLUDED;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#excluded() excluded} to excluded.
     * @param excluded The value for excluded
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("excluded")
    public final Builder excluded(java.util.Optional<java.lang.Boolean> excluded) {
      checkNotIsSet(excludedIsSet(), "excluded");
      this.excluded = excluded.orElse(null);
      optBits |= OPT_BIT_EXCLUDED;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#benefit() benefit} to benefit.
     * @param benefit The value for benefit
     * @return {@code this} builder for chained invocation
     */
    public final Builder benefit(java.util.List<com.fhir.CoverageEligibilityResponse_Benefit> benefit) {
      checkNotIsSet(benefitIsSet(), "benefit");
      this.benefit = java.util.Objects.requireNonNull(benefit, "benefit");
      optBits |= OPT_BIT_BENEFIT;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#benefit() benefit} to benefit.
     * @param benefit The value for benefit
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("benefit")
    public final Builder benefit(java.util.Optional<? extends java.util.List<com.fhir.CoverageEligibilityResponse_Benefit>> benefit) {
      checkNotIsSet(benefitIsSet(), "benefit");
      this.benefit = benefit.orElse(null);
      optBits |= OPT_BIT_BENEFIT;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#productOrService() productOrService} to productOrService.
     * @param productOrService The value for productOrService
     * @return {@code this} builder for chained invocation
     */
    public final Builder productOrService(com.fhir.CodeableConcept productOrService) {
      checkNotIsSet(productOrServiceIsSet(), "productOrService");
      this.productOrService = java.util.Objects.requireNonNull(productOrService, "productOrService");
      optBits |= OPT_BIT_PRODUCT_OR_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#productOrService() productOrService} to productOrService.
     * @param productOrService The value for productOrService
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productOrService")
    public final Builder productOrService(java.util.Optional<? extends com.fhir.CodeableConcept> productOrService) {
      checkNotIsSet(productOrServiceIsSet(), "productOrService");
      this.productOrService = productOrService.orElse(null);
      optBits |= OPT_BIT_PRODUCT_OR_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#authorizationSupporting() authorizationSupporting} to authorizationSupporting.
     * @param authorizationSupporting The value for authorizationSupporting
     * @return {@code this} builder for chained invocation
     */
    public final Builder authorizationSupporting(java.util.List<com.fhir.CodeableConcept> authorizationSupporting) {
      checkNotIsSet(authorizationSupportingIsSet(), "authorizationSupporting");
      this.authorizationSupporting = java.util.Objects.requireNonNull(authorizationSupporting, "authorizationSupporting");
      optBits |= OPT_BIT_AUTHORIZATION_SUPPORTING;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#authorizationSupporting() authorizationSupporting} to authorizationSupporting.
     * @param authorizationSupporting The value for authorizationSupporting
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationSupporting")
    public final Builder authorizationSupporting(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> authorizationSupporting) {
      checkNotIsSet(authorizationSupportingIsSet(), "authorizationSupporting");
      this.authorizationSupporting = authorizationSupporting.orElse(null);
      optBits |= OPT_BIT_AUTHORIZATION_SUPPORTING;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#authorizationUrl() authorizationUrl} to authorizationUrl.
     * @param authorizationUrl The value for authorizationUrl
     * @return {@code this} builder for chained invocation
     */
    public final Builder authorizationUrl(com.fhir.uri authorizationUrl) {
      checkNotIsSet(authorizationUrlIsSet(), "authorizationUrl");
      this.authorizationUrl = java.util.Objects.requireNonNull(authorizationUrl, "authorizationUrl");
      optBits |= OPT_BIT_AUTHORIZATION_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#authorizationUrl() authorizationUrl} to authorizationUrl.
     * @param authorizationUrl The value for authorizationUrl
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationUrl")
    public final Builder authorizationUrl(java.util.Optional<? extends com.fhir.uri> authorizationUrl) {
      checkNotIsSet(authorizationUrlIsSet(), "authorizationUrl");
      this.authorizationUrl = authorizationUrl.orElse(null);
      optBits |= OPT_BIT_AUTHORIZATION_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    public final Builder provider(com.fhir.Reference provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = java.util.Objects.requireNonNull(provider, "provider");
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    public final Builder provider(java.util.Optional<? extends com.fhir.Reference> provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = provider.orElse(null);
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Builds a new {@link CoverageEligibilityResponse_Item CoverageEligibilityResponse_Item}.
     * @return An immutable instance of CoverageEligibilityResponse_Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CoverageEligibilityResponse_Item build() {
      return new ImmutableCoverageEligibilityResponse_Item(
          term,
          category,
          authorizationRequired,
          extension,
          description,
          modifierExtension,
          name,
          network,
          unit,
          excluded,
          benefit,
          id,
          modifier,
          productOrService,
          authorizationSupporting,
          authorizationUrl,
          provider);
    }

    private boolean termIsSet() {
      return (optBits & OPT_BIT_TERM) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean authorizationRequiredIsSet() {
      return (optBits & OPT_BIT_AUTHORIZATION_REQUIRED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean networkIsSet() {
      return (optBits & OPT_BIT_NETWORK) != 0;
    }

    private boolean unitIsSet() {
      return (optBits & OPT_BIT_UNIT) != 0;
    }

    private boolean excludedIsSet() {
      return (optBits & OPT_BIT_EXCLUDED) != 0;
    }

    private boolean benefitIsSet() {
      return (optBits & OPT_BIT_BENEFIT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierIsSet() {
      return (optBits & OPT_BIT_MODIFIER) != 0;
    }

    private boolean productOrServiceIsSet() {
      return (optBits & OPT_BIT_PRODUCT_OR_SERVICE) != 0;
    }

    private boolean authorizationSupportingIsSet() {
      return (optBits & OPT_BIT_AUTHORIZATION_SUPPORTING) != 0;
    }

    private boolean authorizationUrlIsSet() {
      return (optBits & OPT_BIT_AUTHORIZATION_URL) != 0;
    }

    private boolean providerIsSet() {
      return (optBits & OPT_BIT_PROVIDER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CoverageEligibilityResponse_Item is strict, attribute is already set: ".concat(name));
    }
  }
}
