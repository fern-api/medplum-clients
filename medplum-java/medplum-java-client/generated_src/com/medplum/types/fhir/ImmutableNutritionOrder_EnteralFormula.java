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
 * Immutable implementation of {@link NutritionOrder_EnteralFormula}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNutritionOrder_EnteralFormula.builder()}.
 */
@Generated(from = "NutritionOrder_EnteralFormula", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableNutritionOrder_EnteralFormula
    implements NutritionOrder_EnteralFormula {
  private final @Nullable String id;
  private final @Nullable String baseFormulaProductName;
  private final @Nullable CodeableConcept baseFormulaType;
  private final @Nullable String administrationInstruction;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Quantity caloricDensity;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept routeofAdministration;
  private final @Nullable CodeableConcept additiveType;
  private final @Nullable List<NutritionOrder_Administration> administration;
  private final @Nullable Quantity maxVolumeToDeliver;
  private final @Nullable String additiveProductName;

  private ImmutableNutritionOrder_EnteralFormula(
      @Nullable String id,
      @Nullable String baseFormulaProductName,
      @Nullable CodeableConcept baseFormulaType,
      @Nullable String administrationInstruction,
      @Nullable List<Extension> modifierExtension,
      @Nullable Quantity caloricDensity,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept routeofAdministration,
      @Nullable CodeableConcept additiveType,
      @Nullable List<NutritionOrder_Administration> administration,
      @Nullable Quantity maxVolumeToDeliver,
      @Nullable String additiveProductName) {
    this.id = id;
    this.baseFormulaProductName = baseFormulaProductName;
    this.baseFormulaType = baseFormulaType;
    this.administrationInstruction = administrationInstruction;
    this.modifierExtension = modifierExtension;
    this.caloricDensity = caloricDensity;
    this.extension = extension;
    this.routeofAdministration = routeofAdministration;
    this.additiveType = additiveType;
    this.administration = administration;
    this.maxVolumeToDeliver = maxVolumeToDeliver;
    this.additiveProductName = additiveProductName;
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
   * @return The value of the {@code baseFormulaProductName} attribute
   */
  @JsonProperty("baseFormulaProductName")
  @Override
  public Optional<String> baseFormulaProductName() {
    return Optional.ofNullable(baseFormulaProductName);
  }

  /**
   * @return The value of the {@code baseFormulaType} attribute
   */
  @JsonProperty("baseFormulaType")
  @Override
  public Optional<CodeableConcept> baseFormulaType() {
    return Optional.ofNullable(baseFormulaType);
  }

  /**
   * @return The value of the {@code administrationInstruction} attribute
   */
  @JsonProperty("administrationInstruction")
  @Override
  public Optional<String> administrationInstruction() {
    return Optional.ofNullable(administrationInstruction);
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
   * @return The value of the {@code caloricDensity} attribute
   */
  @JsonProperty("caloricDensity")
  @Override
  public Optional<Quantity> caloricDensity() {
    return Optional.ofNullable(caloricDensity);
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
   * @return The value of the {@code routeofAdministration} attribute
   */
  @JsonProperty("routeofAdministration")
  @Override
  public Optional<CodeableConcept> routeofAdministration() {
    return Optional.ofNullable(routeofAdministration);
  }

  /**
   * @return The value of the {@code additiveType} attribute
   */
  @JsonProperty("additiveType")
  @Override
  public Optional<CodeableConcept> additiveType() {
    return Optional.ofNullable(additiveType);
  }

  /**
   * @return The value of the {@code administration} attribute
   */
  @JsonProperty("administration")
  @Override
  public Optional<List<NutritionOrder_Administration>> administration() {
    return Optional.ofNullable(administration);
  }

  /**
   * @return The value of the {@code maxVolumeToDeliver} attribute
   */
  @JsonProperty("maxVolumeToDeliver")
  @Override
  public Optional<Quantity> maxVolumeToDeliver() {
    return Optional.ofNullable(maxVolumeToDeliver);
  }

  /**
   * @return The value of the {@code additiveProductName} attribute
   */
  @JsonProperty("additiveProductName")
  @Override
  public Optional<String> additiveProductName() {
    return Optional.ofNullable(additiveProductName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_EnteralFormula#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_EnteralFormula withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        newValue,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_EnteralFormula#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_EnteralFormula withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        value,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_EnteralFormula#baseFormulaProductName() baseFormulaProductName} attribute.
   * @param value The value for baseFormulaProductName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_EnteralFormula withBaseFormulaProductName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "baseFormulaProductName");
    if (Objects.equals(this.baseFormulaProductName, newValue)) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        newValue,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_EnteralFormula#baseFormulaProductName() baseFormulaProductName} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for baseFormulaProductName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_EnteralFormula withBaseFormulaProductName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.baseFormulaProductName, value)) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        value,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_EnteralFormula#baseFormulaType() baseFormulaType} attribute.
   * @param value The value for baseFormulaType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_EnteralFormula withBaseFormulaType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "baseFormulaType");
    if (this.baseFormulaType == newValue) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        newValue,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_EnteralFormula#baseFormulaType() baseFormulaType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for baseFormulaType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_EnteralFormula withBaseFormulaType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.baseFormulaType == value) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        value,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_EnteralFormula#administrationInstruction() administrationInstruction} attribute.
   * @param value The value for administrationInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_EnteralFormula withAdministrationInstruction(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "administrationInstruction");
    if (Objects.equals(this.administrationInstruction, newValue)) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        newValue,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_EnteralFormula#administrationInstruction() administrationInstruction} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for administrationInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_EnteralFormula withAdministrationInstruction(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.administrationInstruction, value)) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        value,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_EnteralFormula#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_EnteralFormula withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        newValue,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_EnteralFormula#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_EnteralFormula withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        value,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_EnteralFormula#caloricDensity() caloricDensity} attribute.
   * @param value The value for caloricDensity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_EnteralFormula withCaloricDensity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "caloricDensity");
    if (this.caloricDensity == newValue) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        newValue,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_EnteralFormula#caloricDensity() caloricDensity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for caloricDensity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_EnteralFormula withCaloricDensity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.caloricDensity == value) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        value,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_EnteralFormula#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_EnteralFormula withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        newValue,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_EnteralFormula#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_EnteralFormula withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        value,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_EnteralFormula#routeofAdministration() routeofAdministration} attribute.
   * @param value The value for routeofAdministration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_EnteralFormula withRouteofAdministration(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "routeofAdministration");
    if (this.routeofAdministration == newValue) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        newValue,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_EnteralFormula#routeofAdministration() routeofAdministration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for routeofAdministration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_EnteralFormula withRouteofAdministration(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.routeofAdministration == value) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        value,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_EnteralFormula#additiveType() additiveType} attribute.
   * @param value The value for additiveType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_EnteralFormula withAdditiveType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "additiveType");
    if (this.additiveType == newValue) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        newValue,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_EnteralFormula#additiveType() additiveType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additiveType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_EnteralFormula withAdditiveType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.additiveType == value) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        value,
        this.administration,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_EnteralFormula#administration() administration} attribute.
   * @param value The value for administration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_EnteralFormula withAdministration(List<NutritionOrder_Administration> value) {
    @Nullable List<NutritionOrder_Administration> newValue = Objects.requireNonNull(value, "administration");
    if (this.administration == newValue) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        newValue,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_EnteralFormula#administration() administration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for administration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_EnteralFormula withAdministration(Optional<? extends List<NutritionOrder_Administration>> optional) {
    @Nullable List<NutritionOrder_Administration> value = optional.orElse(null);
    if (this.administration == value) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        value,
        this.maxVolumeToDeliver,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_EnteralFormula#maxVolumeToDeliver() maxVolumeToDeliver} attribute.
   * @param value The value for maxVolumeToDeliver
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_EnteralFormula withMaxVolumeToDeliver(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "maxVolumeToDeliver");
    if (this.maxVolumeToDeliver == newValue) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        newValue,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_EnteralFormula#maxVolumeToDeliver() maxVolumeToDeliver} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maxVolumeToDeliver
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNutritionOrder_EnteralFormula withMaxVolumeToDeliver(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.maxVolumeToDeliver == value) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        value,
        this.additiveProductName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NutritionOrder_EnteralFormula#additiveProductName() additiveProductName} attribute.
   * @param value The value for additiveProductName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_EnteralFormula withAdditiveProductName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "additiveProductName");
    if (Objects.equals(this.additiveProductName, newValue)) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NutritionOrder_EnteralFormula#additiveProductName() additiveProductName} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additiveProductName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNutritionOrder_EnteralFormula withAdditiveProductName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.additiveProductName, value)) return this;
    return new ImmutableNutritionOrder_EnteralFormula(
        this.id,
        this.baseFormulaProductName,
        this.baseFormulaType,
        this.administrationInstruction,
        this.modifierExtension,
        this.caloricDensity,
        this.extension,
        this.routeofAdministration,
        this.additiveType,
        this.administration,
        this.maxVolumeToDeliver,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNutritionOrder_EnteralFormula} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNutritionOrder_EnteralFormula
        && equalTo((ImmutableNutritionOrder_EnteralFormula) another);
  }

  private boolean equalTo(ImmutableNutritionOrder_EnteralFormula another) {
    return Objects.equals(id, another.id)
        && Objects.equals(baseFormulaProductName, another.baseFormulaProductName)
        && Objects.equals(baseFormulaType, another.baseFormulaType)
        && Objects.equals(administrationInstruction, another.administrationInstruction)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(caloricDensity, another.caloricDensity)
        && Objects.equals(extension, another.extension)
        && Objects.equals(routeofAdministration, another.routeofAdministration)
        && Objects.equals(additiveType, another.additiveType)
        && Objects.equals(administration, another.administration)
        && Objects.equals(maxVolumeToDeliver, another.maxVolumeToDeliver)
        && Objects.equals(additiveProductName, another.additiveProductName);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code baseFormulaProductName}, {@code baseFormulaType}, {@code administrationInstruction}, {@code modifierExtension}, {@code caloricDensity}, {@code extension}, {@code routeofAdministration}, {@code additiveType}, {@code administration}, {@code maxVolumeToDeliver}, {@code additiveProductName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(baseFormulaProductName);
    h += (h << 5) + Objects.hashCode(baseFormulaType);
    h += (h << 5) + Objects.hashCode(administrationInstruction);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(caloricDensity);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(routeofAdministration);
    h += (h << 5) + Objects.hashCode(additiveType);
    h += (h << 5) + Objects.hashCode(administration);
    h += (h << 5) + Objects.hashCode(maxVolumeToDeliver);
    h += (h << 5) + Objects.hashCode(additiveProductName);
    return h;
  }

  /**
   * Prints the immutable value {@code NutritionOrder_EnteralFormula} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("NutritionOrder_EnteralFormula{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (baseFormulaProductName != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("baseFormulaProductName=").append(baseFormulaProductName);
    }
    if (baseFormulaType != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("baseFormulaType=").append(baseFormulaType);
    }
    if (administrationInstruction != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("administrationInstruction=").append(administrationInstruction);
    }
    if (modifierExtension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (caloricDensity != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("caloricDensity=").append(caloricDensity);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (routeofAdministration != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("routeofAdministration=").append(routeofAdministration);
    }
    if (additiveType != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("additiveType=").append(additiveType);
    }
    if (administration != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("administration=").append(administration);
    }
    if (maxVolumeToDeliver != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("maxVolumeToDeliver=").append(maxVolumeToDeliver);
    }
    if (additiveProductName != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("additiveProductName=").append(additiveProductName);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "NutritionOrder_EnteralFormula", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements NutritionOrder_EnteralFormula {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> baseFormulaProductName = Optional.empty();
    boolean baseFormulaProductNameIsSet;
    @Nullable Optional<CodeableConcept> baseFormulaType = Optional.empty();
    boolean baseFormulaTypeIsSet;
    @Nullable Optional<String> administrationInstruction = Optional.empty();
    boolean administrationInstructionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Quantity> caloricDensity = Optional.empty();
    boolean caloricDensityIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> routeofAdministration = Optional.empty();
    boolean routeofAdministrationIsSet;
    @Nullable Optional<CodeableConcept> additiveType = Optional.empty();
    boolean additiveTypeIsSet;
    @Nullable Optional<List<NutritionOrder_Administration>> administration = Optional.empty();
    boolean administrationIsSet;
    @Nullable Optional<Quantity> maxVolumeToDeliver = Optional.empty();
    boolean maxVolumeToDeliverIsSet;
    @Nullable Optional<String> additiveProductName = Optional.empty();
    boolean additiveProductNameIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("baseFormulaProductName")
    public void setBaseFormulaProductName(Optional<String> baseFormulaProductName) {
      this.baseFormulaProductName = baseFormulaProductName;
      this.baseFormulaProductNameIsSet = true;
    }
    @JsonProperty("baseFormulaType")
    public void setBaseFormulaType(Optional<CodeableConcept> baseFormulaType) {
      this.baseFormulaType = baseFormulaType;
      this.baseFormulaTypeIsSet = true;
    }
    @JsonProperty("administrationInstruction")
    public void setAdministrationInstruction(Optional<String> administrationInstruction) {
      this.administrationInstruction = administrationInstruction;
      this.administrationInstructionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("caloricDensity")
    public void setCaloricDensity(Optional<Quantity> caloricDensity) {
      this.caloricDensity = caloricDensity;
      this.caloricDensityIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("routeofAdministration")
    public void setRouteofAdministration(Optional<CodeableConcept> routeofAdministration) {
      this.routeofAdministration = routeofAdministration;
      this.routeofAdministrationIsSet = true;
    }
    @JsonProperty("additiveType")
    public void setAdditiveType(Optional<CodeableConcept> additiveType) {
      this.additiveType = additiveType;
      this.additiveTypeIsSet = true;
    }
    @JsonProperty("administration")
    public void setAdministration(Optional<List<NutritionOrder_Administration>> administration) {
      this.administration = administration;
      this.administrationIsSet = true;
    }
    @JsonProperty("maxVolumeToDeliver")
    public void setMaxVolumeToDeliver(Optional<Quantity> maxVolumeToDeliver) {
      this.maxVolumeToDeliver = maxVolumeToDeliver;
      this.maxVolumeToDeliverIsSet = true;
    }
    @JsonProperty("additiveProductName")
    public void setAdditiveProductName(Optional<String> additiveProductName) {
      this.additiveProductName = additiveProductName;
      this.additiveProductNameIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> baseFormulaProductName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> baseFormulaType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> administrationInstruction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> caloricDensity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> routeofAdministration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> additiveType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<NutritionOrder_Administration>> administration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> maxVolumeToDeliver() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> additiveProductName() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableNutritionOrder_EnteralFormula fromJson(Json json) {
    ImmutableNutritionOrder_EnteralFormula.Builder builder = ImmutableNutritionOrder_EnteralFormula.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.baseFormulaProductNameIsSet) {
      builder.baseFormulaProductName(json.baseFormulaProductName);
    }
    if (json.baseFormulaTypeIsSet) {
      builder.baseFormulaType(json.baseFormulaType);
    }
    if (json.administrationInstructionIsSet) {
      builder.administrationInstruction(json.administrationInstruction);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.caloricDensityIsSet) {
      builder.caloricDensity(json.caloricDensity);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.routeofAdministrationIsSet) {
      builder.routeofAdministration(json.routeofAdministration);
    }
    if (json.additiveTypeIsSet) {
      builder.additiveType(json.additiveType);
    }
    if (json.administrationIsSet) {
      builder.administration(json.administration);
    }
    if (json.maxVolumeToDeliverIsSet) {
      builder.maxVolumeToDeliver(json.maxVolumeToDeliver);
    }
    if (json.additiveProductNameIsSet) {
      builder.additiveProductName(json.additiveProductName);
    }
    return (ImmutableNutritionOrder_EnteralFormula) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link NutritionOrder_EnteralFormula} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable NutritionOrder_EnteralFormula instance
   */
  public static NutritionOrder_EnteralFormula copyOf(NutritionOrder_EnteralFormula instance) {
    if (instance instanceof ImmutableNutritionOrder_EnteralFormula) {
      return (ImmutableNutritionOrder_EnteralFormula) instance;
    }
    return ImmutableNutritionOrder_EnteralFormula.builder()
        .id(instance.id())
        .baseFormulaProductName(instance.baseFormulaProductName())
        .baseFormulaType(instance.baseFormulaType())
        .administrationInstruction(instance.administrationInstruction())
        .modifierExtension(instance.modifierExtension())
        .caloricDensity(instance.caloricDensity())
        .extension(instance.extension())
        .routeofAdministration(instance.routeofAdministration())
        .additiveType(instance.additiveType())
        .administration(instance.administration())
        .maxVolumeToDeliver(instance.maxVolumeToDeliver())
        .additiveProductName(instance.additiveProductName())
        .build();
  }

  /**
   * Creates a builder for {@link NutritionOrder_EnteralFormula NutritionOrder_EnteralFormula}.
   * <pre>
   * ImmutableNutritionOrder_EnteralFormula.builder()
   *    .id(String) // optional {@link NutritionOrder_EnteralFormula#id() id}
   *    .baseFormulaProductName(String) // optional {@link NutritionOrder_EnteralFormula#baseFormulaProductName() baseFormulaProductName}
   *    .baseFormulaType(com.medplum.types.fhir.CodeableConcept) // optional {@link NutritionOrder_EnteralFormula#baseFormulaType() baseFormulaType}
   *    .administrationInstruction(String) // optional {@link NutritionOrder_EnteralFormula#administrationInstruction() administrationInstruction}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link NutritionOrder_EnteralFormula#modifierExtension() modifierExtension}
   *    .caloricDensity(com.medplum.types.fhir.Quantity) // optional {@link NutritionOrder_EnteralFormula#caloricDensity() caloricDensity}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link NutritionOrder_EnteralFormula#extension() extension}
   *    .routeofAdministration(com.medplum.types.fhir.CodeableConcept) // optional {@link NutritionOrder_EnteralFormula#routeofAdministration() routeofAdministration}
   *    .additiveType(com.medplum.types.fhir.CodeableConcept) // optional {@link NutritionOrder_EnteralFormula#additiveType() additiveType}
   *    .administration(List&amp;lt;com.medplum.types.fhir.NutritionOrder_Administration&amp;gt;) // optional {@link NutritionOrder_EnteralFormula#administration() administration}
   *    .maxVolumeToDeliver(com.medplum.types.fhir.Quantity) // optional {@link NutritionOrder_EnteralFormula#maxVolumeToDeliver() maxVolumeToDeliver}
   *    .additiveProductName(String) // optional {@link NutritionOrder_EnteralFormula#additiveProductName() additiveProductName}
   *    .build();
   * </pre>
   * @return A new NutritionOrder_EnteralFormula builder
   */
  public static ImmutableNutritionOrder_EnteralFormula.Builder builder() {
    return new ImmutableNutritionOrder_EnteralFormula.Builder();
  }

  /**
   * Builds instances of type {@link NutritionOrder_EnteralFormula NutritionOrder_EnteralFormula}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "NutritionOrder_EnteralFormula", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_BASE_FORMULA_PRODUCT_NAME = 0x2L;
    private static final long OPT_BIT_BASE_FORMULA_TYPE = 0x4L;
    private static final long OPT_BIT_ADMINISTRATION_INSTRUCTION = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_CALORIC_DENSITY = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_ROUTEOF_ADMINISTRATION = 0x80L;
    private static final long OPT_BIT_ADDITIVE_TYPE = 0x100L;
    private static final long OPT_BIT_ADMINISTRATION = 0x200L;
    private static final long OPT_BIT_MAX_VOLUME_TO_DELIVER = 0x400L;
    private static final long OPT_BIT_ADDITIVE_PRODUCT_NAME = 0x800L;
    private long optBits;

    private @Nullable String id;
    private @Nullable String baseFormulaProductName;
    private @Nullable CodeableConcept baseFormulaType;
    private @Nullable String administrationInstruction;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Quantity caloricDensity;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept routeofAdministration;
    private @Nullable CodeableConcept additiveType;
    private @Nullable List<NutritionOrder_Administration> administration;
    private @Nullable Quantity maxVolumeToDeliver;
    private @Nullable String additiveProductName;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#id() id} to id.
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
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#id() id} to id.
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
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#baseFormulaProductName() baseFormulaProductName} to baseFormulaProductName.
     * @param baseFormulaProductName The value for baseFormulaProductName
     * @return {@code this} builder for chained invocation
     */
    public final Builder baseFormulaProductName(String baseFormulaProductName) {
      checkNotIsSet(baseFormulaProductNameIsSet(), "baseFormulaProductName");
      this.baseFormulaProductName = Objects.requireNonNull(baseFormulaProductName, "baseFormulaProductName");
      optBits |= OPT_BIT_BASE_FORMULA_PRODUCT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#baseFormulaProductName() baseFormulaProductName} to baseFormulaProductName.
     * @param baseFormulaProductName The value for baseFormulaProductName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("baseFormulaProductName")
    public final Builder baseFormulaProductName(Optional<String> baseFormulaProductName) {
      checkNotIsSet(baseFormulaProductNameIsSet(), "baseFormulaProductName");
      this.baseFormulaProductName = baseFormulaProductName.orElse(null);
      optBits |= OPT_BIT_BASE_FORMULA_PRODUCT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#baseFormulaType() baseFormulaType} to baseFormulaType.
     * @param baseFormulaType The value for baseFormulaType
     * @return {@code this} builder for chained invocation
     */
    public final Builder baseFormulaType(CodeableConcept baseFormulaType) {
      checkNotIsSet(baseFormulaTypeIsSet(), "baseFormulaType");
      this.baseFormulaType = Objects.requireNonNull(baseFormulaType, "baseFormulaType");
      optBits |= OPT_BIT_BASE_FORMULA_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#baseFormulaType() baseFormulaType} to baseFormulaType.
     * @param baseFormulaType The value for baseFormulaType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("baseFormulaType")
    public final Builder baseFormulaType(Optional<? extends CodeableConcept> baseFormulaType) {
      checkNotIsSet(baseFormulaTypeIsSet(), "baseFormulaType");
      this.baseFormulaType = baseFormulaType.orElse(null);
      optBits |= OPT_BIT_BASE_FORMULA_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#administrationInstruction() administrationInstruction} to administrationInstruction.
     * @param administrationInstruction The value for administrationInstruction
     * @return {@code this} builder for chained invocation
     */
    public final Builder administrationInstruction(String administrationInstruction) {
      checkNotIsSet(administrationInstructionIsSet(), "administrationInstruction");
      this.administrationInstruction = Objects.requireNonNull(administrationInstruction, "administrationInstruction");
      optBits |= OPT_BIT_ADMINISTRATION_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#administrationInstruction() administrationInstruction} to administrationInstruction.
     * @param administrationInstruction The value for administrationInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("administrationInstruction")
    public final Builder administrationInstruction(Optional<String> administrationInstruction) {
      checkNotIsSet(administrationInstructionIsSet(), "administrationInstruction");
      this.administrationInstruction = administrationInstruction.orElse(null);
      optBits |= OPT_BIT_ADMINISTRATION_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#caloricDensity() caloricDensity} to caloricDensity.
     * @param caloricDensity The value for caloricDensity
     * @return {@code this} builder for chained invocation
     */
    public final Builder caloricDensity(Quantity caloricDensity) {
      checkNotIsSet(caloricDensityIsSet(), "caloricDensity");
      this.caloricDensity = Objects.requireNonNull(caloricDensity, "caloricDensity");
      optBits |= OPT_BIT_CALORIC_DENSITY;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#caloricDensity() caloricDensity} to caloricDensity.
     * @param caloricDensity The value for caloricDensity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("caloricDensity")
    public final Builder caloricDensity(Optional<? extends Quantity> caloricDensity) {
      checkNotIsSet(caloricDensityIsSet(), "caloricDensity");
      this.caloricDensity = caloricDensity.orElse(null);
      optBits |= OPT_BIT_CALORIC_DENSITY;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#extension() extension} to extension.
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
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#extension() extension} to extension.
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
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#routeofAdministration() routeofAdministration} to routeofAdministration.
     * @param routeofAdministration The value for routeofAdministration
     * @return {@code this} builder for chained invocation
     */
    public final Builder routeofAdministration(CodeableConcept routeofAdministration) {
      checkNotIsSet(routeofAdministrationIsSet(), "routeofAdministration");
      this.routeofAdministration = Objects.requireNonNull(routeofAdministration, "routeofAdministration");
      optBits |= OPT_BIT_ROUTEOF_ADMINISTRATION;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#routeofAdministration() routeofAdministration} to routeofAdministration.
     * @param routeofAdministration The value for routeofAdministration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("routeofAdministration")
    public final Builder routeofAdministration(Optional<? extends CodeableConcept> routeofAdministration) {
      checkNotIsSet(routeofAdministrationIsSet(), "routeofAdministration");
      this.routeofAdministration = routeofAdministration.orElse(null);
      optBits |= OPT_BIT_ROUTEOF_ADMINISTRATION;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#additiveType() additiveType} to additiveType.
     * @param additiveType The value for additiveType
     * @return {@code this} builder for chained invocation
     */
    public final Builder additiveType(CodeableConcept additiveType) {
      checkNotIsSet(additiveTypeIsSet(), "additiveType");
      this.additiveType = Objects.requireNonNull(additiveType, "additiveType");
      optBits |= OPT_BIT_ADDITIVE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#additiveType() additiveType} to additiveType.
     * @param additiveType The value for additiveType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("additiveType")
    public final Builder additiveType(Optional<? extends CodeableConcept> additiveType) {
      checkNotIsSet(additiveTypeIsSet(), "additiveType");
      this.additiveType = additiveType.orElse(null);
      optBits |= OPT_BIT_ADDITIVE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#administration() administration} to administration.
     * @param administration The value for administration
     * @return {@code this} builder for chained invocation
     */
    public final Builder administration(List<NutritionOrder_Administration> administration) {
      checkNotIsSet(administrationIsSet(), "administration");
      this.administration = Objects.requireNonNull(administration, "administration");
      optBits |= OPT_BIT_ADMINISTRATION;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#administration() administration} to administration.
     * @param administration The value for administration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("administration")
    public final Builder administration(Optional<? extends List<NutritionOrder_Administration>> administration) {
      checkNotIsSet(administrationIsSet(), "administration");
      this.administration = administration.orElse(null);
      optBits |= OPT_BIT_ADMINISTRATION;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#maxVolumeToDeliver() maxVolumeToDeliver} to maxVolumeToDeliver.
     * @param maxVolumeToDeliver The value for maxVolumeToDeliver
     * @return {@code this} builder for chained invocation
     */
    public final Builder maxVolumeToDeliver(Quantity maxVolumeToDeliver) {
      checkNotIsSet(maxVolumeToDeliverIsSet(), "maxVolumeToDeliver");
      this.maxVolumeToDeliver = Objects.requireNonNull(maxVolumeToDeliver, "maxVolumeToDeliver");
      optBits |= OPT_BIT_MAX_VOLUME_TO_DELIVER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#maxVolumeToDeliver() maxVolumeToDeliver} to maxVolumeToDeliver.
     * @param maxVolumeToDeliver The value for maxVolumeToDeliver
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("maxVolumeToDeliver")
    public final Builder maxVolumeToDeliver(Optional<? extends Quantity> maxVolumeToDeliver) {
      checkNotIsSet(maxVolumeToDeliverIsSet(), "maxVolumeToDeliver");
      this.maxVolumeToDeliver = maxVolumeToDeliver.orElse(null);
      optBits |= OPT_BIT_MAX_VOLUME_TO_DELIVER;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#additiveProductName() additiveProductName} to additiveProductName.
     * @param additiveProductName The value for additiveProductName
     * @return {@code this} builder for chained invocation
     */
    public final Builder additiveProductName(String additiveProductName) {
      checkNotIsSet(additiveProductNameIsSet(), "additiveProductName");
      this.additiveProductName = Objects.requireNonNull(additiveProductName, "additiveProductName");
      optBits |= OPT_BIT_ADDITIVE_PRODUCT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link NutritionOrder_EnteralFormula#additiveProductName() additiveProductName} to additiveProductName.
     * @param additiveProductName The value for additiveProductName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("additiveProductName")
    public final Builder additiveProductName(Optional<String> additiveProductName) {
      checkNotIsSet(additiveProductNameIsSet(), "additiveProductName");
      this.additiveProductName = additiveProductName.orElse(null);
      optBits |= OPT_BIT_ADDITIVE_PRODUCT_NAME;
      return this;
    }

    /**
     * Builds a new {@link NutritionOrder_EnteralFormula NutritionOrder_EnteralFormula}.
     * @return An immutable instance of NutritionOrder_EnteralFormula
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public NutritionOrder_EnteralFormula build() {
      return new ImmutableNutritionOrder_EnteralFormula(
          id,
          baseFormulaProductName,
          baseFormulaType,
          administrationInstruction,
          modifierExtension,
          caloricDensity,
          extension,
          routeofAdministration,
          additiveType,
          administration,
          maxVolumeToDeliver,
          additiveProductName);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean baseFormulaProductNameIsSet() {
      return (optBits & OPT_BIT_BASE_FORMULA_PRODUCT_NAME) != 0;
    }

    private boolean baseFormulaTypeIsSet() {
      return (optBits & OPT_BIT_BASE_FORMULA_TYPE) != 0;
    }

    private boolean administrationInstructionIsSet() {
      return (optBits & OPT_BIT_ADMINISTRATION_INSTRUCTION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean caloricDensityIsSet() {
      return (optBits & OPT_BIT_CALORIC_DENSITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean routeofAdministrationIsSet() {
      return (optBits & OPT_BIT_ROUTEOF_ADMINISTRATION) != 0;
    }

    private boolean additiveTypeIsSet() {
      return (optBits & OPT_BIT_ADDITIVE_TYPE) != 0;
    }

    private boolean administrationIsSet() {
      return (optBits & OPT_BIT_ADMINISTRATION) != 0;
    }

    private boolean maxVolumeToDeliverIsSet() {
      return (optBits & OPT_BIT_MAX_VOLUME_TO_DELIVER) != 0;
    }

    private boolean additiveProductNameIsSet() {
      return (optBits & OPT_BIT_ADDITIVE_PRODUCT_NAME) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of NutritionOrder_EnteralFormula is strict, attribute is already set: ".concat(name));
    }
  }
}
