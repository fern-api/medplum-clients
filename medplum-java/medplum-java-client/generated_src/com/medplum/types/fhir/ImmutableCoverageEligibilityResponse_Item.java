package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link CoverageEligibilityResponse_Item}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoverageEligibilityResponse_Item.builder()}.
 */
@Generated(from = "CoverageEligibilityResponse_Item", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoverageEligibilityResponse_Item
    implements CoverageEligibilityResponse_Item {
  private final @Nullable List<CodeableConcept> authorizationSupporting;
  private final @Nullable Reference provider;
  private final @Nullable Boolean excluded;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<CoverageEligibilityResponse_Benefit> benefit;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String name;
  private final @Nullable CodeableConcept category;
  private final @Nullable List<CodeableConcept> modifier;
  private final @Nullable CodeableConcept term;
  private final @Nullable CodeableConcept network;
  private final @Nullable CodeableConcept productOrService;
  private final @Nullable Boolean authorizationRequired;
  private final @Nullable String description;
  private final @Nullable CodeableConcept unit;
  private final @Nullable Uri authorizationUrl;

  private ImmutableCoverageEligibilityResponse_Item(
      @Nullable List<CodeableConcept> authorizationSupporting,
      @Nullable Reference provider,
      @Nullable Boolean excluded,
      @Nullable List<Extension> extension,
      @Nullable List<CoverageEligibilityResponse_Benefit> benefit,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable String name,
      @Nullable CodeableConcept category,
      @Nullable List<CodeableConcept> modifier,
      @Nullable CodeableConcept term,
      @Nullable CodeableConcept network,
      @Nullable CodeableConcept productOrService,
      @Nullable Boolean authorizationRequired,
      @Nullable String description,
      @Nullable CodeableConcept unit,
      @Nullable Uri authorizationUrl) {
    this.authorizationSupporting = authorizationSupporting;
    this.provider = provider;
    this.excluded = excluded;
    this.extension = extension;
    this.benefit = benefit;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.name = name;
    this.category = category;
    this.modifier = modifier;
    this.term = term;
    this.network = network;
    this.productOrService = productOrService;
    this.authorizationRequired = authorizationRequired;
    this.description = description;
    this.unit = unit;
    this.authorizationUrl = authorizationUrl;
  }

  /**
   * @return The value of the {@code authorizationSupporting} attribute
   */
  @JsonProperty("authorizationSupporting")
  @Override
  public Optional<List<CodeableConcept>> authorizationSupporting() {
    return Optional.ofNullable(authorizationSupporting);
  }

  /**
   * @return The value of the {@code provider} attribute
   */
  @JsonProperty("provider")
  @Override
  public Optional<Reference> provider() {
    return Optional.ofNullable(provider);
  }

  /**
   * @return The value of the {@code excluded} attribute
   */
  @JsonProperty("excluded")
  @Override
  public Optional<Boolean> excluded() {
    return Optional.ofNullable(excluded);
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
   * @return The value of the {@code benefit} attribute
   */
  @JsonProperty("benefit")
  @Override
  public Optional<List<CoverageEligibilityResponse_Benefit>> benefit() {
    return Optional.ofNullable(benefit);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
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
   * @return The value of the {@code modifier} attribute
   */
  @JsonProperty("modifier")
  @Override
  public Optional<List<CodeableConcept>> modifier() {
    return Optional.ofNullable(modifier);
  }

  /**
   * @return The value of the {@code term} attribute
   */
  @JsonProperty("term")
  @Override
  public Optional<CodeableConcept> term() {
    return Optional.ofNullable(term);
  }

  /**
   * @return The value of the {@code network} attribute
   */
  @JsonProperty("network")
  @Override
  public Optional<CodeableConcept> network() {
    return Optional.ofNullable(network);
  }

  /**
   * @return The value of the {@code productOrService} attribute
   */
  @JsonProperty("productOrService")
  @Override
  public Optional<CodeableConcept> productOrService() {
    return Optional.ofNullable(productOrService);
  }

  /**
   * @return The value of the {@code authorizationRequired} attribute
   */
  @JsonProperty("authorizationRequired")
  @Override
  public Optional<Boolean> authorizationRequired() {
    return Optional.ofNullable(authorizationRequired);
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
   * @return The value of the {@code unit} attribute
   */
  @JsonProperty("unit")
  @Override
  public Optional<CodeableConcept> unit() {
    return Optional.ofNullable(unit);
  }

  /**
   * @return The value of the {@code authorizationUrl} attribute
   */
  @JsonProperty("authorizationUrl")
  @Override
  public Optional<Uri> authorizationUrl() {
    return Optional.ofNullable(authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#authorizationSupporting() authorizationSupporting} attribute.
   * @param value The value for authorizationSupporting
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withAuthorizationSupporting(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "authorizationSupporting");
    if (this.authorizationSupporting == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        newValue,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#authorizationSupporting() authorizationSupporting} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authorizationSupporting
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withAuthorizationSupporting(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.authorizationSupporting == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        value,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#provider() provider} attribute.
   * @param value The value for provider
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withProvider(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "provider");
    if (this.provider == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        newValue,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#provider() provider} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for provider
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withProvider(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.provider == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        value,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#excluded() excluded} attribute.
   * @param value The value for excluded
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withExcluded(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.excluded, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        newValue,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#excluded() excluded} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for excluded
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withExcluded(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.excluded, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        value,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        newValue,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        value,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#benefit() benefit} attribute.
   * @param value The value for benefit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withBenefit(List<CoverageEligibilityResponse_Benefit> value) {
    @Nullable List<CoverageEligibilityResponse_Benefit> newValue = Objects.requireNonNull(value, "benefit");
    if (this.benefit == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        newValue,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#benefit() benefit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for benefit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withBenefit(Optional<? extends List<CoverageEligibilityResponse_Benefit>> optional) {
    @Nullable List<CoverageEligibilityResponse_Benefit> value = optional.orElse(null);
    if (this.benefit == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        value,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        newValue,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        value,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        newValue,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        value,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        newValue,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        value,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withCategory(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        newValue,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withCategory(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        value,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#modifier() modifier} attribute.
   * @param value The value for modifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withModifier(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "modifier");
    if (this.modifier == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        newValue,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#modifier() modifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withModifier(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.modifier == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        value,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#term() term} attribute.
   * @param value The value for term
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withTerm(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "term");
    if (this.term == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        newValue,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#term() term} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for term
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withTerm(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.term == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        value,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#network() network} attribute.
   * @param value The value for network
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withNetwork(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "network");
    if (this.network == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        newValue,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#network() network} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for network
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withNetwork(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.network == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        value,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#productOrService() productOrService} attribute.
   * @param value The value for productOrService
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withProductOrService(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "productOrService");
    if (this.productOrService == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        newValue,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#productOrService() productOrService} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productOrService
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withProductOrService(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.productOrService == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        value,
        this.authorizationRequired,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#authorizationRequired() authorizationRequired} attribute.
   * @param value The value for authorizationRequired
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withAuthorizationRequired(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.authorizationRequired, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        newValue,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#authorizationRequired() authorizationRequired} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authorizationRequired
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withAuthorizationRequired(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.authorizationRequired, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        value,
        this.description,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        newValue,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        value,
        this.unit,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#unit() unit} attribute.
   * @param value The value for unit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withUnit(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "unit");
    if (this.unit == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        newValue,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#unit() unit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withUnit(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.unit == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        value,
        this.authorizationUrl);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityResponse_Item#authorizationUrl() authorizationUrl} attribute.
   * @param value The value for authorizationUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityResponse_Item withAuthorizationUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "authorizationUrl");
    if (this.authorizationUrl == newValue) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityResponse_Item#authorizationUrl() authorizationUrl} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authorizationUrl
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityResponse_Item withAuthorizationUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.authorizationUrl == value) return this;
    return new ImmutableCoverageEligibilityResponse_Item(
        this.authorizationSupporting,
        this.provider,
        this.excluded,
        this.extension,
        this.benefit,
        this.id,
        this.modifierExtension,
        this.name,
        this.category,
        this.modifier,
        this.term,
        this.network,
        this.productOrService,
        this.authorizationRequired,
        this.description,
        this.unit,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoverageEligibilityResponse_Item} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoverageEligibilityResponse_Item
        && equalTo((ImmutableCoverageEligibilityResponse_Item) another);
  }

  private boolean equalTo(ImmutableCoverageEligibilityResponse_Item another) {
    return Objects.equals(authorizationSupporting, another.authorizationSupporting)
        && Objects.equals(provider, another.provider)
        && Objects.equals(excluded, another.excluded)
        && Objects.equals(extension, another.extension)
        && Objects.equals(benefit, another.benefit)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(name, another.name)
        && Objects.equals(category, another.category)
        && Objects.equals(modifier, another.modifier)
        && Objects.equals(term, another.term)
        && Objects.equals(network, another.network)
        && Objects.equals(productOrService, another.productOrService)
        && Objects.equals(authorizationRequired, another.authorizationRequired)
        && Objects.equals(description, another.description)
        && Objects.equals(unit, another.unit)
        && Objects.equals(authorizationUrl, another.authorizationUrl);
  }

  /**
   * Computes a hash code from attributes: {@code authorizationSupporting}, {@code provider}, {@code excluded}, {@code extension}, {@code benefit}, {@code id}, {@code modifierExtension}, {@code name}, {@code category}, {@code modifier}, {@code term}, {@code network}, {@code productOrService}, {@code authorizationRequired}, {@code description}, {@code unit}, {@code authorizationUrl}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(authorizationSupporting);
    h += (h << 5) + Objects.hashCode(provider);
    h += (h << 5) + Objects.hashCode(excluded);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(benefit);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(modifier);
    h += (h << 5) + Objects.hashCode(term);
    h += (h << 5) + Objects.hashCode(network);
    h += (h << 5) + Objects.hashCode(productOrService);
    h += (h << 5) + Objects.hashCode(authorizationRequired);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(unit);
    h += (h << 5) + Objects.hashCode(authorizationUrl);
    return h;
  }

  /**
   * Prints the immutable value {@code CoverageEligibilityResponse_Item} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CoverageEligibilityResponse_Item{");
    if (authorizationSupporting != null) {
      builder.append("authorizationSupporting=").append(authorizationSupporting);
    }
    if (provider != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("provider=").append(provider);
    }
    if (excluded != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("excluded=").append(excluded);
    }
    if (extension != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (benefit != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("benefit=").append(benefit);
    }
    if (id != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (name != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (category != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (modifier != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("modifier=").append(modifier);
    }
    if (term != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("term=").append(term);
    }
    if (network != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("network=").append(network);
    }
    if (productOrService != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("productOrService=").append(productOrService);
    }
    if (authorizationRequired != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("authorizationRequired=").append(authorizationRequired);
    }
    if (description != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (unit != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("unit=").append(unit);
    }
    if (authorizationUrl != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("authorizationUrl=").append(authorizationUrl);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CoverageEligibilityResponse_Item", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CoverageEligibilityResponse_Item {
    @Nullable Optional<List<CodeableConcept>> authorizationSupporting = Optional.empty();
    boolean authorizationSupportingIsSet;
    @Nullable Optional<Reference> provider = Optional.empty();
    boolean providerIsSet;
    @Nullable Optional<Boolean> excluded = Optional.empty();
    boolean excludedIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<CoverageEligibilityResponse_Benefit>> benefit = Optional.empty();
    boolean benefitIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<CodeableConcept> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<List<CodeableConcept>> modifier = Optional.empty();
    boolean modifierIsSet;
    @Nullable Optional<CodeableConcept> term = Optional.empty();
    boolean termIsSet;
    @Nullable Optional<CodeableConcept> network = Optional.empty();
    boolean networkIsSet;
    @Nullable Optional<CodeableConcept> productOrService = Optional.empty();
    boolean productOrServiceIsSet;
    @Nullable Optional<Boolean> authorizationRequired = Optional.empty();
    boolean authorizationRequiredIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<CodeableConcept> unit = Optional.empty();
    boolean unitIsSet;
    @Nullable Optional<Uri> authorizationUrl = Optional.empty();
    boolean authorizationUrlIsSet;
    @JsonProperty("authorizationSupporting")
    public void setAuthorizationSupporting(Optional<List<CodeableConcept>> authorizationSupporting) {
      this.authorizationSupporting = authorizationSupporting;
      this.authorizationSupportingIsSet = true;
    }
    @JsonProperty("provider")
    public void setProvider(Optional<Reference> provider) {
      this.provider = provider;
      this.providerIsSet = true;
    }
    @JsonProperty("excluded")
    public void setExcluded(Optional<Boolean> excluded) {
      this.excluded = excluded;
      this.excludedIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("benefit")
    public void setBenefit(Optional<List<CoverageEligibilityResponse_Benefit>> benefit) {
      this.benefit = benefit;
      this.benefitIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("modifier")
    public void setModifier(Optional<List<CodeableConcept>> modifier) {
      this.modifier = modifier;
      this.modifierIsSet = true;
    }
    @JsonProperty("term")
    public void setTerm(Optional<CodeableConcept> term) {
      this.term = term;
      this.termIsSet = true;
    }
    @JsonProperty("network")
    public void setNetwork(Optional<CodeableConcept> network) {
      this.network = network;
      this.networkIsSet = true;
    }
    @JsonProperty("productOrService")
    public void setProductOrService(Optional<CodeableConcept> productOrService) {
      this.productOrService = productOrService;
      this.productOrServiceIsSet = true;
    }
    @JsonProperty("authorizationRequired")
    public void setAuthorizationRequired(Optional<Boolean> authorizationRequired) {
      this.authorizationRequired = authorizationRequired;
      this.authorizationRequiredIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("unit")
    public void setUnit(Optional<CodeableConcept> unit) {
      this.unit = unit;
      this.unitIsSet = true;
    }
    @JsonProperty("authorizationUrl")
    public void setAuthorizationUrl(Optional<Uri> authorizationUrl) {
      this.authorizationUrl = authorizationUrl;
      this.authorizationUrlIsSet = true;
    }
    @Override
    public Optional<List<CodeableConcept>> authorizationSupporting() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> provider() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> excluded() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CoverageEligibilityResponse_Benefit>> benefit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> term() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> network() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> productOrService() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> authorizationRequired() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> unit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> authorizationUrl() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCoverageEligibilityResponse_Item fromJson(Json json) {
    ImmutableCoverageEligibilityResponse_Item.Builder builder = ImmutableCoverageEligibilityResponse_Item.builder();
    if (json.authorizationSupportingIsSet) {
      builder.authorizationSupporting(json.authorizationSupporting);
    }
    if (json.providerIsSet) {
      builder.provider(json.provider);
    }
    if (json.excludedIsSet) {
      builder.excluded(json.excluded);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.benefitIsSet) {
      builder.benefit(json.benefit);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.modifierIsSet) {
      builder.modifier(json.modifier);
    }
    if (json.termIsSet) {
      builder.term(json.term);
    }
    if (json.networkIsSet) {
      builder.network(json.network);
    }
    if (json.productOrServiceIsSet) {
      builder.productOrService(json.productOrService);
    }
    if (json.authorizationRequiredIsSet) {
      builder.authorizationRequired(json.authorizationRequired);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.unitIsSet) {
      builder.unit(json.unit);
    }
    if (json.authorizationUrlIsSet) {
      builder.authorizationUrl(json.authorizationUrl);
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
        .authorizationSupporting(instance.authorizationSupporting())
        .provider(instance.provider())
        .excluded(instance.excluded())
        .extension(instance.extension())
        .benefit(instance.benefit())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .name(instance.name())
        .category(instance.category())
        .modifier(instance.modifier())
        .term(instance.term())
        .network(instance.network())
        .productOrService(instance.productOrService())
        .authorizationRequired(instance.authorizationRequired())
        .description(instance.description())
        .unit(instance.unit())
        .authorizationUrl(instance.authorizationUrl())
        .build();
  }

  /**
   * Creates a builder for {@link CoverageEligibilityResponse_Item CoverageEligibilityResponse_Item}.
   * <pre>
   * ImmutableCoverageEligibilityResponse_Item.builder()
   *    .authorizationSupporting(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link CoverageEligibilityResponse_Item#authorizationSupporting() authorizationSupporting}
   *    .provider(com.medplum.types.fhir.Reference) // optional {@link CoverageEligibilityResponse_Item#provider() provider}
   *    .excluded(Boolean) // optional {@link CoverageEligibilityResponse_Item#excluded() excluded}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityResponse_Item#extension() extension}
   *    .benefit(List&amp;lt;com.medplum.types.fhir.CoverageEligibilityResponse_Benefit&amp;gt;) // optional {@link CoverageEligibilityResponse_Item#benefit() benefit}
   *    .id(String) // optional {@link CoverageEligibilityResponse_Item#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityResponse_Item#modifierExtension() modifierExtension}
   *    .name(String) // optional {@link CoverageEligibilityResponse_Item#name() name}
   *    .category(com.medplum.types.fhir.CodeableConcept) // optional {@link CoverageEligibilityResponse_Item#category() category}
   *    .modifier(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link CoverageEligibilityResponse_Item#modifier() modifier}
   *    .term(com.medplum.types.fhir.CodeableConcept) // optional {@link CoverageEligibilityResponse_Item#term() term}
   *    .network(com.medplum.types.fhir.CodeableConcept) // optional {@link CoverageEligibilityResponse_Item#network() network}
   *    .productOrService(com.medplum.types.fhir.CodeableConcept) // optional {@link CoverageEligibilityResponse_Item#productOrService() productOrService}
   *    .authorizationRequired(Boolean) // optional {@link CoverageEligibilityResponse_Item#authorizationRequired() authorizationRequired}
   *    .description(String) // optional {@link CoverageEligibilityResponse_Item#description() description}
   *    .unit(com.medplum.types.fhir.CodeableConcept) // optional {@link CoverageEligibilityResponse_Item#unit() unit}
   *    .authorizationUrl(com.medplum.types.fhir.Uri) // optional {@link CoverageEligibilityResponse_Item#authorizationUrl() authorizationUrl}
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
  @Generated(from = "CoverageEligibilityResponse_Item", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_AUTHORIZATION_SUPPORTING = 0x1L;
    private static final long OPT_BIT_PROVIDER = 0x2L;
    private static final long OPT_BIT_EXCLUDED = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_BENEFIT = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_NAME = 0x80L;
    private static final long OPT_BIT_CATEGORY = 0x100L;
    private static final long OPT_BIT_MODIFIER = 0x200L;
    private static final long OPT_BIT_TERM = 0x400L;
    private static final long OPT_BIT_NETWORK = 0x800L;
    private static final long OPT_BIT_PRODUCT_OR_SERVICE = 0x1000L;
    private static final long OPT_BIT_AUTHORIZATION_REQUIRED = 0x2000L;
    private static final long OPT_BIT_DESCRIPTION = 0x4000L;
    private static final long OPT_BIT_UNIT = 0x8000L;
    private static final long OPT_BIT_AUTHORIZATION_URL = 0x10000L;
    private long optBits;

    private @Nullable List<CodeableConcept> authorizationSupporting;
    private @Nullable Reference provider;
    private @Nullable Boolean excluded;
    private @Nullable List<Extension> extension;
    private @Nullable List<CoverageEligibilityResponse_Benefit> benefit;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String name;
    private @Nullable CodeableConcept category;
    private @Nullable List<CodeableConcept> modifier;
    private @Nullable CodeableConcept term;
    private @Nullable CodeableConcept network;
    private @Nullable CodeableConcept productOrService;
    private @Nullable Boolean authorizationRequired;
    private @Nullable String description;
    private @Nullable CodeableConcept unit;
    private @Nullable Uri authorizationUrl;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#authorizationSupporting() authorizationSupporting} to authorizationSupporting.
     * @param authorizationSupporting The value for authorizationSupporting
     * @return {@code this} builder for chained invocation
     */
    public final Builder authorizationSupporting(List<CodeableConcept> authorizationSupporting) {
      checkNotIsSet(authorizationSupportingIsSet(), "authorizationSupporting");
      this.authorizationSupporting = Objects.requireNonNull(authorizationSupporting, "authorizationSupporting");
      optBits |= OPT_BIT_AUTHORIZATION_SUPPORTING;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#authorizationSupporting() authorizationSupporting} to authorizationSupporting.
     * @param authorizationSupporting The value for authorizationSupporting
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authorizationSupporting")
    public final Builder authorizationSupporting(Optional<? extends List<CodeableConcept>> authorizationSupporting) {
      checkNotIsSet(authorizationSupportingIsSet(), "authorizationSupporting");
      this.authorizationSupporting = authorizationSupporting.orElse(null);
      optBits |= OPT_BIT_AUTHORIZATION_SUPPORTING;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    public final Builder provider(Reference provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = Objects.requireNonNull(provider, "provider");
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provider")
    public final Builder provider(Optional<? extends Reference> provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = provider.orElse(null);
      optBits |= OPT_BIT_PROVIDER;
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
    @JsonProperty("excluded")
    public final Builder excluded(Optional<Boolean> excluded) {
      checkNotIsSet(excludedIsSet(), "excluded");
      this.excluded = excluded.orElse(null);
      optBits |= OPT_BIT_EXCLUDED;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#benefit() benefit} to benefit.
     * @param benefit The value for benefit
     * @return {@code this} builder for chained invocation
     */
    public final Builder benefit(List<CoverageEligibilityResponse_Benefit> benefit) {
      checkNotIsSet(benefitIsSet(), "benefit");
      this.benefit = Objects.requireNonNull(benefit, "benefit");
      optBits |= OPT_BIT_BENEFIT;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#benefit() benefit} to benefit.
     * @param benefit The value for benefit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("benefit")
    public final Builder benefit(Optional<? extends List<CoverageEligibilityResponse_Benefit>> benefit) {
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
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#category() category} to category.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#category() category} to category.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#term() term} to term.
     * @param term The value for term
     * @return {@code this} builder for chained invocation
     */
    public final Builder term(CodeableConcept term) {
      checkNotIsSet(termIsSet(), "term");
      this.term = Objects.requireNonNull(term, "term");
      optBits |= OPT_BIT_TERM;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#term() term} to term.
     * @param term The value for term
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("term")
    public final Builder term(Optional<? extends CodeableConcept> term) {
      checkNotIsSet(termIsSet(), "term");
      this.term = term.orElse(null);
      optBits |= OPT_BIT_TERM;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    public final Builder network(CodeableConcept network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = Objects.requireNonNull(network, "network");
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("network")
    public final Builder network(Optional<? extends CodeableConcept> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = network.orElse(null);
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#productOrService() productOrService} to productOrService.
     * @param productOrService The value for productOrService
     * @return {@code this} builder for chained invocation
     */
    public final Builder productOrService(CodeableConcept productOrService) {
      checkNotIsSet(productOrServiceIsSet(), "productOrService");
      this.productOrService = Objects.requireNonNull(productOrService, "productOrService");
      optBits |= OPT_BIT_PRODUCT_OR_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#productOrService() productOrService} to productOrService.
     * @param productOrService The value for productOrService
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productOrService")
    public final Builder productOrService(Optional<? extends CodeableConcept> productOrService) {
      checkNotIsSet(productOrServiceIsSet(), "productOrService");
      this.productOrService = productOrService.orElse(null);
      optBits |= OPT_BIT_PRODUCT_OR_SERVICE;
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
    @JsonProperty("authorizationRequired")
    public final Builder authorizationRequired(Optional<Boolean> authorizationRequired) {
      checkNotIsSet(authorizationRequiredIsSet(), "authorizationRequired");
      this.authorizationRequired = authorizationRequired.orElse(null);
      optBits |= OPT_BIT_AUTHORIZATION_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#description() description} to description.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#description() description} to description.
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
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for chained invocation
     */
    public final Builder unit(CodeableConcept unit) {
      checkNotIsSet(unitIsSet(), "unit");
      this.unit = Objects.requireNonNull(unit, "unit");
      optBits |= OPT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("unit")
    public final Builder unit(Optional<? extends CodeableConcept> unit) {
      checkNotIsSet(unitIsSet(), "unit");
      this.unit = unit.orElse(null);
      optBits |= OPT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#authorizationUrl() authorizationUrl} to authorizationUrl.
     * @param authorizationUrl The value for authorizationUrl
     * @return {@code this} builder for chained invocation
     */
    public final Builder authorizationUrl(Uri authorizationUrl) {
      checkNotIsSet(authorizationUrlIsSet(), "authorizationUrl");
      this.authorizationUrl = Objects.requireNonNull(authorizationUrl, "authorizationUrl");
      optBits |= OPT_BIT_AUTHORIZATION_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityResponse_Item#authorizationUrl() authorizationUrl} to authorizationUrl.
     * @param authorizationUrl The value for authorizationUrl
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authorizationUrl")
    public final Builder authorizationUrl(Optional<? extends Uri> authorizationUrl) {
      checkNotIsSet(authorizationUrlIsSet(), "authorizationUrl");
      this.authorizationUrl = authorizationUrl.orElse(null);
      optBits |= OPT_BIT_AUTHORIZATION_URL;
      return this;
    }

    /**
     * Builds a new {@link CoverageEligibilityResponse_Item CoverageEligibilityResponse_Item}.
     * @return An immutable instance of CoverageEligibilityResponse_Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CoverageEligibilityResponse_Item build() {
      return new ImmutableCoverageEligibilityResponse_Item(
          authorizationSupporting,
          provider,
          excluded,
          extension,
          benefit,
          id,
          modifierExtension,
          name,
          category,
          modifier,
          term,
          network,
          productOrService,
          authorizationRequired,
          description,
          unit,
          authorizationUrl);
    }

    private boolean authorizationSupportingIsSet() {
      return (optBits & OPT_BIT_AUTHORIZATION_SUPPORTING) != 0;
    }

    private boolean providerIsSet() {
      return (optBits & OPT_BIT_PROVIDER) != 0;
    }

    private boolean excludedIsSet() {
      return (optBits & OPT_BIT_EXCLUDED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean benefitIsSet() {
      return (optBits & OPT_BIT_BENEFIT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean modifierIsSet() {
      return (optBits & OPT_BIT_MODIFIER) != 0;
    }

    private boolean termIsSet() {
      return (optBits & OPT_BIT_TERM) != 0;
    }

    private boolean networkIsSet() {
      return (optBits & OPT_BIT_NETWORK) != 0;
    }

    private boolean productOrServiceIsSet() {
      return (optBits & OPT_BIT_PRODUCT_OR_SERVICE) != 0;
    }

    private boolean authorizationRequiredIsSet() {
      return (optBits & OPT_BIT_AUTHORIZATION_REQUIRED) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean unitIsSet() {
      return (optBits & OPT_BIT_UNIT) != 0;
    }

    private boolean authorizationUrlIsSet() {
      return (optBits & OPT_BIT_AUTHORIZATION_URL) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CoverageEligibilityResponse_Item is strict, attribute is already set: ".concat(name));
    }
  }
}
