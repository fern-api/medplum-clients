package com.fhir.types.fhir;

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
  private final @Nullable CodeableConcept additiveType;
  private final @Nullable Quantity maxVolumeToDeliver;
  private final @Nullable List<Extension> extension;
  private final @Nullable String administrationInstruction;
  private final @Nullable CodeableConcept routeofAdministration;
  private final @Nullable String additiveProductName;
  private final @Nullable String id;
  private final @Nullable Quantity caloricDensity;
  private final @Nullable CodeableConcept baseFormulaType;
  private final @Nullable String baseFormulaProductName;
  private final @Nullable List<NutritionOrder_Administration> administration;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableNutritionOrder_EnteralFormula(
      @Nullable CodeableConcept additiveType,
      @Nullable Quantity maxVolumeToDeliver,
      @Nullable List<Extension> extension,
      @Nullable String administrationInstruction,
      @Nullable CodeableConcept routeofAdministration,
      @Nullable String additiveProductName,
      @Nullable String id,
      @Nullable Quantity caloricDensity,
      @Nullable CodeableConcept baseFormulaType,
      @Nullable String baseFormulaProductName,
      @Nullable List<NutritionOrder_Administration> administration,
      @Nullable List<Extension> modifierExtension) {
    this.additiveType = additiveType;
    this.maxVolumeToDeliver = maxVolumeToDeliver;
    this.extension = extension;
    this.administrationInstruction = administrationInstruction;
    this.routeofAdministration = routeofAdministration;
    this.additiveProductName = additiveProductName;
    this.id = id;
    this.caloricDensity = caloricDensity;
    this.baseFormulaType = baseFormulaType;
    this.baseFormulaProductName = baseFormulaProductName;
    this.administration = administration;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code maxVolumeToDeliver} attribute
   */
  @JsonProperty("maxVolumeToDeliver")
  @Override
  public Optional<Quantity> maxVolumeToDeliver() {
    return Optional.ofNullable(maxVolumeToDeliver);
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
   * @return The value of the {@code administrationInstruction} attribute
   */
  @JsonProperty("administrationInstruction")
  @Override
  public Optional<String> administrationInstruction() {
    return Optional.ofNullable(administrationInstruction);
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
   * @return The value of the {@code additiveProductName} attribute
   */
  @JsonProperty("additiveProductName")
  @Override
  public Optional<String> additiveProductName() {
    return Optional.ofNullable(additiveProductName);
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
   * @return The value of the {@code caloricDensity} attribute
   */
  @JsonProperty("caloricDensity")
  @Override
  public Optional<Quantity> caloricDensity() {
    return Optional.ofNullable(caloricDensity);
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
   * @return The value of the {@code baseFormulaProductName} attribute
   */
  @JsonProperty("baseFormulaProductName")
  @Override
  public Optional<String> baseFormulaProductName() {
    return Optional.ofNullable(baseFormulaProductName);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
        newValue,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        value,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        newValue,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        value,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        newValue,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        value,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        newValue,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        value,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        newValue,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        value,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        newValue,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        value,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        newValue,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        value,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        newValue,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        value,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        newValue,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        value,
        this.baseFormulaProductName,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        newValue,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        value,
        this.administration,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        newValue,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        value,
        this.modifierExtension);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
        newValue);
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
        this.additiveType,
        this.maxVolumeToDeliver,
        this.extension,
        this.administrationInstruction,
        this.routeofAdministration,
        this.additiveProductName,
        this.id,
        this.caloricDensity,
        this.baseFormulaType,
        this.baseFormulaProductName,
        this.administration,
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
    return Objects.equals(additiveType, another.additiveType)
        && Objects.equals(maxVolumeToDeliver, another.maxVolumeToDeliver)
        && Objects.equals(extension, another.extension)
        && Objects.equals(administrationInstruction, another.administrationInstruction)
        && Objects.equals(routeofAdministration, another.routeofAdministration)
        && Objects.equals(additiveProductName, another.additiveProductName)
        && Objects.equals(id, another.id)
        && Objects.equals(caloricDensity, another.caloricDensity)
        && Objects.equals(baseFormulaType, another.baseFormulaType)
        && Objects.equals(baseFormulaProductName, another.baseFormulaProductName)
        && Objects.equals(administration, another.administration)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code additiveType}, {@code maxVolumeToDeliver}, {@code extension}, {@code administrationInstruction}, {@code routeofAdministration}, {@code additiveProductName}, {@code id}, {@code caloricDensity}, {@code baseFormulaType}, {@code baseFormulaProductName}, {@code administration}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(additiveType);
    h += (h << 5) + Objects.hashCode(maxVolumeToDeliver);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(administrationInstruction);
    h += (h << 5) + Objects.hashCode(routeofAdministration);
    h += (h << 5) + Objects.hashCode(additiveProductName);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(caloricDensity);
    h += (h << 5) + Objects.hashCode(baseFormulaType);
    h += (h << 5) + Objects.hashCode(baseFormulaProductName);
    h += (h << 5) + Objects.hashCode(administration);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code NutritionOrder_EnteralFormula} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("NutritionOrder_EnteralFormula{");
    if (additiveType != null) {
      builder.append("additiveType=").append(additiveType);
    }
    if (maxVolumeToDeliver != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("maxVolumeToDeliver=").append(maxVolumeToDeliver);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (administrationInstruction != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("administrationInstruction=").append(administrationInstruction);
    }
    if (routeofAdministration != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("routeofAdministration=").append(routeofAdministration);
    }
    if (additiveProductName != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("additiveProductName=").append(additiveProductName);
    }
    if (id != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (caloricDensity != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("caloricDensity=").append(caloricDensity);
    }
    if (baseFormulaType != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("baseFormulaType=").append(baseFormulaType);
    }
    if (baseFormulaProductName != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("baseFormulaProductName=").append(baseFormulaProductName);
    }
    if (administration != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("administration=").append(administration);
    }
    if (modifierExtension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
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
    @Nullable Optional<CodeableConcept> additiveType = Optional.empty();
    boolean additiveTypeIsSet;
    @Nullable Optional<Quantity> maxVolumeToDeliver = Optional.empty();
    boolean maxVolumeToDeliverIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> administrationInstruction = Optional.empty();
    boolean administrationInstructionIsSet;
    @Nullable Optional<CodeableConcept> routeofAdministration = Optional.empty();
    boolean routeofAdministrationIsSet;
    @Nullable Optional<String> additiveProductName = Optional.empty();
    boolean additiveProductNameIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Quantity> caloricDensity = Optional.empty();
    boolean caloricDensityIsSet;
    @Nullable Optional<CodeableConcept> baseFormulaType = Optional.empty();
    boolean baseFormulaTypeIsSet;
    @Nullable Optional<String> baseFormulaProductName = Optional.empty();
    boolean baseFormulaProductNameIsSet;
    @Nullable Optional<List<NutritionOrder_Administration>> administration = Optional.empty();
    boolean administrationIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("additiveType")
    public void setAdditiveType(Optional<CodeableConcept> additiveType) {
      this.additiveType = additiveType;
      this.additiveTypeIsSet = true;
    }
    @JsonProperty("maxVolumeToDeliver")
    public void setMaxVolumeToDeliver(Optional<Quantity> maxVolumeToDeliver) {
      this.maxVolumeToDeliver = maxVolumeToDeliver;
      this.maxVolumeToDeliverIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("administrationInstruction")
    public void setAdministrationInstruction(Optional<String> administrationInstruction) {
      this.administrationInstruction = administrationInstruction;
      this.administrationInstructionIsSet = true;
    }
    @JsonProperty("routeofAdministration")
    public void setRouteofAdministration(Optional<CodeableConcept> routeofAdministration) {
      this.routeofAdministration = routeofAdministration;
      this.routeofAdministrationIsSet = true;
    }
    @JsonProperty("additiveProductName")
    public void setAdditiveProductName(Optional<String> additiveProductName) {
      this.additiveProductName = additiveProductName;
      this.additiveProductNameIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("caloricDensity")
    public void setCaloricDensity(Optional<Quantity> caloricDensity) {
      this.caloricDensity = caloricDensity;
      this.caloricDensityIsSet = true;
    }
    @JsonProperty("baseFormulaType")
    public void setBaseFormulaType(Optional<CodeableConcept> baseFormulaType) {
      this.baseFormulaType = baseFormulaType;
      this.baseFormulaTypeIsSet = true;
    }
    @JsonProperty("baseFormulaProductName")
    public void setBaseFormulaProductName(Optional<String> baseFormulaProductName) {
      this.baseFormulaProductName = baseFormulaProductName;
      this.baseFormulaProductNameIsSet = true;
    }
    @JsonProperty("administration")
    public void setAdministration(Optional<List<NutritionOrder_Administration>> administration) {
      this.administration = administration;
      this.administrationIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> additiveType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> maxVolumeToDeliver() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> administrationInstruction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> routeofAdministration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> additiveProductName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> caloricDensity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> baseFormulaType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> baseFormulaProductName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<NutritionOrder_Administration>> administration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
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
    if (json.additiveTypeIsSet) {
      builder.additiveType(json.additiveType);
    }
    if (json.maxVolumeToDeliverIsSet) {
      builder.maxVolumeToDeliver(json.maxVolumeToDeliver);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.administrationInstructionIsSet) {
      builder.administrationInstruction(json.administrationInstruction);
    }
    if (json.routeofAdministrationIsSet) {
      builder.routeofAdministration(json.routeofAdministration);
    }
    if (json.additiveProductNameIsSet) {
      builder.additiveProductName(json.additiveProductName);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.caloricDensityIsSet) {
      builder.caloricDensity(json.caloricDensity);
    }
    if (json.baseFormulaTypeIsSet) {
      builder.baseFormulaType(json.baseFormulaType);
    }
    if (json.baseFormulaProductNameIsSet) {
      builder.baseFormulaProductName(json.baseFormulaProductName);
    }
    if (json.administrationIsSet) {
      builder.administration(json.administration);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
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
        .additiveType(instance.additiveType())
        .maxVolumeToDeliver(instance.maxVolumeToDeliver())
        .extension(instance.extension())
        .administrationInstruction(instance.administrationInstruction())
        .routeofAdministration(instance.routeofAdministration())
        .additiveProductName(instance.additiveProductName())
        .id(instance.id())
        .caloricDensity(instance.caloricDensity())
        .baseFormulaType(instance.baseFormulaType())
        .baseFormulaProductName(instance.baseFormulaProductName())
        .administration(instance.administration())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link NutritionOrder_EnteralFormula NutritionOrder_EnteralFormula}.
   * <pre>
   * ImmutableNutritionOrder_EnteralFormula.builder()
   *    .additiveType(com.fhir.types.fhir.CodeableConcept) // optional {@link NutritionOrder_EnteralFormula#additiveType() additiveType}
   *    .maxVolumeToDeliver(com.fhir.types.fhir.Quantity) // optional {@link NutritionOrder_EnteralFormula#maxVolumeToDeliver() maxVolumeToDeliver}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link NutritionOrder_EnteralFormula#extension() extension}
   *    .administrationInstruction(String) // optional {@link NutritionOrder_EnteralFormula#administrationInstruction() administrationInstruction}
   *    .routeofAdministration(com.fhir.types.fhir.CodeableConcept) // optional {@link NutritionOrder_EnteralFormula#routeofAdministration() routeofAdministration}
   *    .additiveProductName(String) // optional {@link NutritionOrder_EnteralFormula#additiveProductName() additiveProductName}
   *    .id(String) // optional {@link NutritionOrder_EnteralFormula#id() id}
   *    .caloricDensity(com.fhir.types.fhir.Quantity) // optional {@link NutritionOrder_EnteralFormula#caloricDensity() caloricDensity}
   *    .baseFormulaType(com.fhir.types.fhir.CodeableConcept) // optional {@link NutritionOrder_EnteralFormula#baseFormulaType() baseFormulaType}
   *    .baseFormulaProductName(String) // optional {@link NutritionOrder_EnteralFormula#baseFormulaProductName() baseFormulaProductName}
   *    .administration(List&amp;lt;com.fhir.types.fhir.NutritionOrder_Administration&amp;gt;) // optional {@link NutritionOrder_EnteralFormula#administration() administration}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link NutritionOrder_EnteralFormula#modifierExtension() modifierExtension}
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
    private static final long OPT_BIT_ADDITIVE_TYPE = 0x1L;
    private static final long OPT_BIT_MAX_VOLUME_TO_DELIVER = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ADMINISTRATION_INSTRUCTION = 0x8L;
    private static final long OPT_BIT_ROUTEOF_ADMINISTRATION = 0x10L;
    private static final long OPT_BIT_ADDITIVE_PRODUCT_NAME = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_CALORIC_DENSITY = 0x80L;
    private static final long OPT_BIT_BASE_FORMULA_TYPE = 0x100L;
    private static final long OPT_BIT_BASE_FORMULA_PRODUCT_NAME = 0x200L;
    private static final long OPT_BIT_ADMINISTRATION = 0x400L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800L;
    private long optBits;

    private @Nullable CodeableConcept additiveType;
    private @Nullable Quantity maxVolumeToDeliver;
    private @Nullable List<Extension> extension;
    private @Nullable String administrationInstruction;
    private @Nullable CodeableConcept routeofAdministration;
    private @Nullable String additiveProductName;
    private @Nullable String id;
    private @Nullable Quantity caloricDensity;
    private @Nullable CodeableConcept baseFormulaType;
    private @Nullable String baseFormulaProductName;
    private @Nullable List<NutritionOrder_Administration> administration;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
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
     * Builds a new {@link NutritionOrder_EnteralFormula NutritionOrder_EnteralFormula}.
     * @return An immutable instance of NutritionOrder_EnteralFormula
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public NutritionOrder_EnteralFormula build() {
      return new ImmutableNutritionOrder_EnteralFormula(
          additiveType,
          maxVolumeToDeliver,
          extension,
          administrationInstruction,
          routeofAdministration,
          additiveProductName,
          id,
          caloricDensity,
          baseFormulaType,
          baseFormulaProductName,
          administration,
          modifierExtension);
    }

    private boolean additiveTypeIsSet() {
      return (optBits & OPT_BIT_ADDITIVE_TYPE) != 0;
    }

    private boolean maxVolumeToDeliverIsSet() {
      return (optBits & OPT_BIT_MAX_VOLUME_TO_DELIVER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean administrationInstructionIsSet() {
      return (optBits & OPT_BIT_ADMINISTRATION_INSTRUCTION) != 0;
    }

    private boolean routeofAdministrationIsSet() {
      return (optBits & OPT_BIT_ROUTEOF_ADMINISTRATION) != 0;
    }

    private boolean additiveProductNameIsSet() {
      return (optBits & OPT_BIT_ADDITIVE_PRODUCT_NAME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean caloricDensityIsSet() {
      return (optBits & OPT_BIT_CALORIC_DENSITY) != 0;
    }

    private boolean baseFormulaTypeIsSet() {
      return (optBits & OPT_BIT_BASE_FORMULA_TYPE) != 0;
    }

    private boolean baseFormulaProductNameIsSet() {
      return (optBits & OPT_BIT_BASE_FORMULA_PRODUCT_NAME) != 0;
    }

    private boolean administrationIsSet() {
      return (optBits & OPT_BIT_ADMINISTRATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of NutritionOrder_EnteralFormula is strict, attribute is already set: ".concat(name));
    }
  }
}
