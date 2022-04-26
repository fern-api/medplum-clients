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
 * Immutable implementation of {@link ImmunizationRecommendation_Recommendation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImmunizationRecommendation_Recommendation.builder()}.
 */
@Generated(from = "ImmunizationRecommendation_Recommendation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImmunizationRecommendation_Recommendation
    implements ImmunizationRecommendation_Recommendation {
  private final @Nullable CodeableConcept targetDisease;
  private final @Nullable List<Reference> supportingPatientInformation;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<CodeableConcept> contraindicatedVaccineCode;
  private final @Nullable Double doseNumberPositiveInt;
  private final @Nullable String description;
  private final @Nullable String id;
  private final @Nullable List<Reference> supportingImmunization;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<CodeableConcept> forecastReason;
  private final @Nullable String doseNumberString;
  private final @Nullable List<ImmunizationRecommendation_DateCriterion> dateCriterion;
  private final @Nullable Double seriesDosesPositiveInt;
  private final @Nullable String seriesDosesString;
  private final CodeableConcept forecastStatus;
  private final @Nullable String series;
  private final @Nullable List<CodeableConcept> vaccineCode;

  private ImmutableImmunizationRecommendation_Recommendation(
      @Nullable CodeableConcept targetDisease,
      @Nullable List<Reference> supportingPatientInformation,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<CodeableConcept> contraindicatedVaccineCode,
      @Nullable Double doseNumberPositiveInt,
      @Nullable String description,
      @Nullable String id,
      @Nullable List<Reference> supportingImmunization,
      @Nullable List<Extension> extension,
      @Nullable List<CodeableConcept> forecastReason,
      @Nullable String doseNumberString,
      @Nullable List<ImmunizationRecommendation_DateCriterion> dateCriterion,
      @Nullable Double seriesDosesPositiveInt,
      @Nullable String seriesDosesString,
      CodeableConcept forecastStatus,
      @Nullable String series,
      @Nullable List<CodeableConcept> vaccineCode) {
    this.targetDisease = targetDisease;
    this.supportingPatientInformation = supportingPatientInformation;
    this.modifierExtension = modifierExtension;
    this.contraindicatedVaccineCode = contraindicatedVaccineCode;
    this.doseNumberPositiveInt = doseNumberPositiveInt;
    this.description = description;
    this.id = id;
    this.supportingImmunization = supportingImmunization;
    this.extension = extension;
    this.forecastReason = forecastReason;
    this.doseNumberString = doseNumberString;
    this.dateCriterion = dateCriterion;
    this.seriesDosesPositiveInt = seriesDosesPositiveInt;
    this.seriesDosesString = seriesDosesString;
    this.forecastStatus = forecastStatus;
    this.series = series;
    this.vaccineCode = vaccineCode;
  }

  /**
   * @return The value of the {@code targetDisease} attribute
   */
  @JsonProperty("targetDisease")
  @Override
  public Optional<CodeableConcept> targetDisease() {
    return Optional.ofNullable(targetDisease);
  }

  /**
   * @return The value of the {@code supportingPatientInformation} attribute
   */
  @JsonProperty("supportingPatientInformation")
  @Override
  public Optional<List<Reference>> supportingPatientInformation() {
    return Optional.ofNullable(supportingPatientInformation);
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
   * @return The value of the {@code contraindicatedVaccineCode} attribute
   */
  @JsonProperty("contraindicatedVaccineCode")
  @Override
  public Optional<List<CodeableConcept>> contraindicatedVaccineCode() {
    return Optional.ofNullable(contraindicatedVaccineCode);
  }

  /**
   * @return The value of the {@code doseNumberPositiveInt} attribute
   */
  @JsonProperty("doseNumberPositiveInt")
  @Override
  public Optional<Double> doseNumberPositiveInt() {
    return Optional.ofNullable(doseNumberPositiveInt);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code supportingImmunization} attribute
   */
  @JsonProperty("supportingImmunization")
  @Override
  public Optional<List<Reference>> supportingImmunization() {
    return Optional.ofNullable(supportingImmunization);
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
   * @return The value of the {@code forecastReason} attribute
   */
  @JsonProperty("forecastReason")
  @Override
  public Optional<List<CodeableConcept>> forecastReason() {
    return Optional.ofNullable(forecastReason);
  }

  /**
   * @return The value of the {@code doseNumberString} attribute
   */
  @JsonProperty("doseNumberString")
  @Override
  public Optional<String> doseNumberString() {
    return Optional.ofNullable(doseNumberString);
  }

  /**
   * @return The value of the {@code dateCriterion} attribute
   */
  @JsonProperty("dateCriterion")
  @Override
  public Optional<List<ImmunizationRecommendation_DateCriterion>> dateCriterion() {
    return Optional.ofNullable(dateCriterion);
  }

  /**
   * @return The value of the {@code seriesDosesPositiveInt} attribute
   */
  @JsonProperty("seriesDosesPositiveInt")
  @Override
  public Optional<Double> seriesDosesPositiveInt() {
    return Optional.ofNullable(seriesDosesPositiveInt);
  }

  /**
   * @return The value of the {@code seriesDosesString} attribute
   */
  @JsonProperty("seriesDosesString")
  @Override
  public Optional<String> seriesDosesString() {
    return Optional.ofNullable(seriesDosesString);
  }

  /**
   * @return The value of the {@code forecastStatus} attribute
   */
  @JsonProperty("forecastStatus")
  @Override
  public CodeableConcept forecastStatus() {
    return forecastStatus;
  }

  /**
   * @return The value of the {@code series} attribute
   */
  @JsonProperty("series")
  @Override
  public Optional<String> series() {
    return Optional.ofNullable(series);
  }

  /**
   * @return The value of the {@code vaccineCode} attribute
   */
  @JsonProperty("vaccineCode")
  @Override
  public Optional<List<CodeableConcept>> vaccineCode() {
    return Optional.ofNullable(vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_Recommendation#targetDisease() targetDisease} attribute.
   * @param value The value for targetDisease
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withTargetDisease(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "targetDisease");
    if (this.targetDisease == newValue) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        newValue,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_Recommendation#targetDisease() targetDisease} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetDisease
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation_Recommendation withTargetDisease(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.targetDisease == value) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        value,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_Recommendation#supportingPatientInformation() supportingPatientInformation} attribute.
   * @param value The value for supportingPatientInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withSupportingPatientInformation(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "supportingPatientInformation");
    if (this.supportingPatientInformation == newValue) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        newValue,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_Recommendation#supportingPatientInformation() supportingPatientInformation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingPatientInformation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation_Recommendation withSupportingPatientInformation(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.supportingPatientInformation == value) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        value,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_Recommendation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        newValue,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_Recommendation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation_Recommendation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        value,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_Recommendation#contraindicatedVaccineCode() contraindicatedVaccineCode} attribute.
   * @param value The value for contraindicatedVaccineCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withContraindicatedVaccineCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "contraindicatedVaccineCode");
    if (this.contraindicatedVaccineCode == newValue) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        newValue,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_Recommendation#contraindicatedVaccineCode() contraindicatedVaccineCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contraindicatedVaccineCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation_Recommendation withContraindicatedVaccineCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.contraindicatedVaccineCode == value) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        value,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_Recommendation#doseNumberPositiveInt() doseNumberPositiveInt} attribute.
   * @param value The value for doseNumberPositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withDoseNumberPositiveInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.doseNumberPositiveInt, newValue)) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        newValue,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_Recommendation#doseNumberPositiveInt() doseNumberPositiveInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseNumberPositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withDoseNumberPositiveInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.doseNumberPositiveInt, value)) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        value,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_Recommendation#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        newValue,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_Recommendation#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        value,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_Recommendation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        newValue,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_Recommendation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        value,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_Recommendation#supportingImmunization() supportingImmunization} attribute.
   * @param value The value for supportingImmunization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withSupportingImmunization(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "supportingImmunization");
    if (this.supportingImmunization == newValue) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        newValue,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_Recommendation#supportingImmunization() supportingImmunization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingImmunization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation_Recommendation withSupportingImmunization(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.supportingImmunization == value) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        value,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_Recommendation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        newValue,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_Recommendation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation_Recommendation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        value,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_Recommendation#forecastReason() forecastReason} attribute.
   * @param value The value for forecastReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withForecastReason(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "forecastReason");
    if (this.forecastReason == newValue) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        newValue,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_Recommendation#forecastReason() forecastReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for forecastReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation_Recommendation withForecastReason(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.forecastReason == value) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        value,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_Recommendation#doseNumberString() doseNumberString} attribute.
   * @param value The value for doseNumberString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withDoseNumberString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "doseNumberString");
    if (Objects.equals(this.doseNumberString, newValue)) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        newValue,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_Recommendation#doseNumberString() doseNumberString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseNumberString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withDoseNumberString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.doseNumberString, value)) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        value,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_Recommendation#dateCriterion() dateCriterion} attribute.
   * @param value The value for dateCriterion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withDateCriterion(List<ImmunizationRecommendation_DateCriterion> value) {
    @Nullable List<ImmunizationRecommendation_DateCriterion> newValue = Objects.requireNonNull(value, "dateCriterion");
    if (this.dateCriterion == newValue) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        newValue,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_Recommendation#dateCriterion() dateCriterion} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dateCriterion
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation_Recommendation withDateCriterion(Optional<? extends List<ImmunizationRecommendation_DateCriterion>> optional) {
    @Nullable List<ImmunizationRecommendation_DateCriterion> value = optional.orElse(null);
    if (this.dateCriterion == value) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        value,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_Recommendation#seriesDosesPositiveInt() seriesDosesPositiveInt} attribute.
   * @param value The value for seriesDosesPositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withSeriesDosesPositiveInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.seriesDosesPositiveInt, newValue)) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        newValue,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_Recommendation#seriesDosesPositiveInt() seriesDosesPositiveInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for seriesDosesPositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withSeriesDosesPositiveInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.seriesDosesPositiveInt, value)) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        value,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_Recommendation#seriesDosesString() seriesDosesString} attribute.
   * @param value The value for seriesDosesString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withSeriesDosesString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "seriesDosesString");
    if (Objects.equals(this.seriesDosesString, newValue)) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        newValue,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_Recommendation#seriesDosesString() seriesDosesString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for seriesDosesString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withSeriesDosesString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.seriesDosesString, value)) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        value,
        this.forecastStatus,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImmunizationRecommendation_Recommendation#forecastStatus() forecastStatus} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for forecastStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withForecastStatus(CodeableConcept value) {
    if (this.forecastStatus == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "forecastStatus");
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        newValue,
        this.series,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_Recommendation#series() series} attribute.
   * @param value The value for series
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withSeries(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "series");
    if (Objects.equals(this.series, newValue)) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        newValue,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_Recommendation#series() series} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for series
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withSeries(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.series, value)) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        value,
        this.vaccineCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_Recommendation#vaccineCode() vaccineCode} attribute.
   * @param value The value for vaccineCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_Recommendation withVaccineCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "vaccineCode");
    if (this.vaccineCode == newValue) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_Recommendation#vaccineCode() vaccineCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for vaccineCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation_Recommendation withVaccineCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.vaccineCode == value) return this;
    return new ImmutableImmunizationRecommendation_Recommendation(
        this.targetDisease,
        this.supportingPatientInformation,
        this.modifierExtension,
        this.contraindicatedVaccineCode,
        this.doseNumberPositiveInt,
        this.description,
        this.id,
        this.supportingImmunization,
        this.extension,
        this.forecastReason,
        this.doseNumberString,
        this.dateCriterion,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.forecastStatus,
        this.series,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImmunizationRecommendation_Recommendation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImmunizationRecommendation_Recommendation
        && equalTo((ImmutableImmunizationRecommendation_Recommendation) another);
  }

  private boolean equalTo(ImmutableImmunizationRecommendation_Recommendation another) {
    return Objects.equals(targetDisease, another.targetDisease)
        && Objects.equals(supportingPatientInformation, another.supportingPatientInformation)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(contraindicatedVaccineCode, another.contraindicatedVaccineCode)
        && Objects.equals(doseNumberPositiveInt, another.doseNumberPositiveInt)
        && Objects.equals(description, another.description)
        && Objects.equals(id, another.id)
        && Objects.equals(supportingImmunization, another.supportingImmunization)
        && Objects.equals(extension, another.extension)
        && Objects.equals(forecastReason, another.forecastReason)
        && Objects.equals(doseNumberString, another.doseNumberString)
        && Objects.equals(dateCriterion, another.dateCriterion)
        && Objects.equals(seriesDosesPositiveInt, another.seriesDosesPositiveInt)
        && Objects.equals(seriesDosesString, another.seriesDosesString)
        && forecastStatus.equals(another.forecastStatus)
        && Objects.equals(series, another.series)
        && Objects.equals(vaccineCode, another.vaccineCode);
  }

  /**
   * Computes a hash code from attributes: {@code targetDisease}, {@code supportingPatientInformation}, {@code modifierExtension}, {@code contraindicatedVaccineCode}, {@code doseNumberPositiveInt}, {@code description}, {@code id}, {@code supportingImmunization}, {@code extension}, {@code forecastReason}, {@code doseNumberString}, {@code dateCriterion}, {@code seriesDosesPositiveInt}, {@code seriesDosesString}, {@code forecastStatus}, {@code series}, {@code vaccineCode}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(targetDisease);
    h += (h << 5) + Objects.hashCode(supportingPatientInformation);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(contraindicatedVaccineCode);
    h += (h << 5) + Objects.hashCode(doseNumberPositiveInt);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(supportingImmunization);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(forecastReason);
    h += (h << 5) + Objects.hashCode(doseNumberString);
    h += (h << 5) + Objects.hashCode(dateCriterion);
    h += (h << 5) + Objects.hashCode(seriesDosesPositiveInt);
    h += (h << 5) + Objects.hashCode(seriesDosesString);
    h += (h << 5) + forecastStatus.hashCode();
    h += (h << 5) + Objects.hashCode(series);
    h += (h << 5) + Objects.hashCode(vaccineCode);
    return h;
  }

  /**
   * Prints the immutable value {@code ImmunizationRecommendation_Recommendation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImmunizationRecommendation_Recommendation{");
    if (targetDisease != null) {
      builder.append("targetDisease=").append(targetDisease);
    }
    if (supportingPatientInformation != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("supportingPatientInformation=").append(supportingPatientInformation);
    }
    if (modifierExtension != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (contraindicatedVaccineCode != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("contraindicatedVaccineCode=").append(contraindicatedVaccineCode);
    }
    if (doseNumberPositiveInt != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("doseNumberPositiveInt=").append(doseNumberPositiveInt);
    }
    if (description != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (id != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (supportingImmunization != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("supportingImmunization=").append(supportingImmunization);
    }
    if (extension != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (forecastReason != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("forecastReason=").append(forecastReason);
    }
    if (doseNumberString != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("doseNumberString=").append(doseNumberString);
    }
    if (dateCriterion != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("dateCriterion=").append(dateCriterion);
    }
    if (seriesDosesPositiveInt != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("seriesDosesPositiveInt=").append(seriesDosesPositiveInt);
    }
    if (seriesDosesString != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("seriesDosesString=").append(seriesDosesString);
    }
    if (builder.length() > 42) builder.append(", ");
    builder.append("forecastStatus=").append(forecastStatus);
    if (series != null) {
      builder.append(", ");
      builder.append("series=").append(series);
    }
    if (vaccineCode != null) {
      builder.append(", ");
      builder.append("vaccineCode=").append(vaccineCode);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImmunizationRecommendation_Recommendation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImmunizationRecommendation_Recommendation {
    @Nullable Optional<CodeableConcept> targetDisease = Optional.empty();
    boolean targetDiseaseIsSet;
    @Nullable Optional<List<Reference>> supportingPatientInformation = Optional.empty();
    boolean supportingPatientInformationIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<CodeableConcept>> contraindicatedVaccineCode = Optional.empty();
    boolean contraindicatedVaccineCodeIsSet;
    @Nullable Optional<Double> doseNumberPositiveInt = Optional.empty();
    boolean doseNumberPositiveIntIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Reference>> supportingImmunization = Optional.empty();
    boolean supportingImmunizationIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<CodeableConcept>> forecastReason = Optional.empty();
    boolean forecastReasonIsSet;
    @Nullable Optional<String> doseNumberString = Optional.empty();
    boolean doseNumberStringIsSet;
    @Nullable Optional<List<ImmunizationRecommendation_DateCriterion>> dateCriterion = Optional.empty();
    boolean dateCriterionIsSet;
    @Nullable Optional<Double> seriesDosesPositiveInt = Optional.empty();
    boolean seriesDosesPositiveIntIsSet;
    @Nullable Optional<String> seriesDosesString = Optional.empty();
    boolean seriesDosesStringIsSet;
    @Nullable CodeableConcept forecastStatus;
    @Nullable Optional<String> series = Optional.empty();
    boolean seriesIsSet;
    @Nullable Optional<List<CodeableConcept>> vaccineCode = Optional.empty();
    boolean vaccineCodeIsSet;
    @JsonProperty("targetDisease")
    public void setTargetDisease(Optional<CodeableConcept> targetDisease) {
      this.targetDisease = targetDisease;
      this.targetDiseaseIsSet = true;
    }
    @JsonProperty("supportingPatientInformation")
    public void setSupportingPatientInformation(Optional<List<Reference>> supportingPatientInformation) {
      this.supportingPatientInformation = supportingPatientInformation;
      this.supportingPatientInformationIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("contraindicatedVaccineCode")
    public void setContraindicatedVaccineCode(Optional<List<CodeableConcept>> contraindicatedVaccineCode) {
      this.contraindicatedVaccineCode = contraindicatedVaccineCode;
      this.contraindicatedVaccineCodeIsSet = true;
    }
    @JsonProperty("doseNumberPositiveInt")
    public void setDoseNumberPositiveInt(Optional<Double> doseNumberPositiveInt) {
      this.doseNumberPositiveInt = doseNumberPositiveInt;
      this.doseNumberPositiveIntIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("supportingImmunization")
    public void setSupportingImmunization(Optional<List<Reference>> supportingImmunization) {
      this.supportingImmunization = supportingImmunization;
      this.supportingImmunizationIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("forecastReason")
    public void setForecastReason(Optional<List<CodeableConcept>> forecastReason) {
      this.forecastReason = forecastReason;
      this.forecastReasonIsSet = true;
    }
    @JsonProperty("doseNumberString")
    public void setDoseNumberString(Optional<String> doseNumberString) {
      this.doseNumberString = doseNumberString;
      this.doseNumberStringIsSet = true;
    }
    @JsonProperty("dateCriterion")
    public void setDateCriterion(Optional<List<ImmunizationRecommendation_DateCriterion>> dateCriterion) {
      this.dateCriterion = dateCriterion;
      this.dateCriterionIsSet = true;
    }
    @JsonProperty("seriesDosesPositiveInt")
    public void setSeriesDosesPositiveInt(Optional<Double> seriesDosesPositiveInt) {
      this.seriesDosesPositiveInt = seriesDosesPositiveInt;
      this.seriesDosesPositiveIntIsSet = true;
    }
    @JsonProperty("seriesDosesString")
    public void setSeriesDosesString(Optional<String> seriesDosesString) {
      this.seriesDosesString = seriesDosesString;
      this.seriesDosesStringIsSet = true;
    }
    @JsonProperty("forecastStatus")
    public void setForecastStatus(CodeableConcept forecastStatus) {
      this.forecastStatus = forecastStatus;
    }
    @JsonProperty("series")
    public void setSeries(Optional<String> series) {
      this.series = series;
      this.seriesIsSet = true;
    }
    @JsonProperty("vaccineCode")
    public void setVaccineCode(Optional<List<CodeableConcept>> vaccineCode) {
      this.vaccineCode = vaccineCode;
      this.vaccineCodeIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> targetDisease() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> supportingPatientInformation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> contraindicatedVaccineCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> doseNumberPositiveInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> supportingImmunization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> forecastReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> doseNumberString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ImmunizationRecommendation_DateCriterion>> dateCriterion() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> seriesDosesPositiveInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> seriesDosesString() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept forecastStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> series() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> vaccineCode() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImmunizationRecommendation_Recommendation fromJson(Json json) {
    ImmutableImmunizationRecommendation_Recommendation.Builder builder = ((ImmutableImmunizationRecommendation_Recommendation.Builder) ImmutableImmunizationRecommendation_Recommendation.builder());
    if (json.targetDiseaseIsSet) {
      builder.targetDisease(json.targetDisease);
    }
    if (json.supportingPatientInformationIsSet) {
      builder.supportingPatientInformation(json.supportingPatientInformation);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.contraindicatedVaccineCodeIsSet) {
      builder.contraindicatedVaccineCode(json.contraindicatedVaccineCode);
    }
    if (json.doseNumberPositiveIntIsSet) {
      builder.doseNumberPositiveInt(json.doseNumberPositiveInt);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.supportingImmunizationIsSet) {
      builder.supportingImmunization(json.supportingImmunization);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.forecastReasonIsSet) {
      builder.forecastReason(json.forecastReason);
    }
    if (json.doseNumberStringIsSet) {
      builder.doseNumberString(json.doseNumberString);
    }
    if (json.dateCriterionIsSet) {
      builder.dateCriterion(json.dateCriterion);
    }
    if (json.seriesDosesPositiveIntIsSet) {
      builder.seriesDosesPositiveInt(json.seriesDosesPositiveInt);
    }
    if (json.seriesDosesStringIsSet) {
      builder.seriesDosesString(json.seriesDosesString);
    }
    if (json.forecastStatus != null) {
      builder.forecastStatus(json.forecastStatus);
    }
    if (json.seriesIsSet) {
      builder.series(json.series);
    }
    if (json.vaccineCodeIsSet) {
      builder.vaccineCode(json.vaccineCode);
    }
    return (ImmutableImmunizationRecommendation_Recommendation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImmunizationRecommendation_Recommendation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImmunizationRecommendation_Recommendation instance
   */
  public static ImmunizationRecommendation_Recommendation copyOf(ImmunizationRecommendation_Recommendation instance) {
    if (instance instanceof ImmutableImmunizationRecommendation_Recommendation) {
      return (ImmutableImmunizationRecommendation_Recommendation) instance;
    }
    return ((ImmutableImmunizationRecommendation_Recommendation.Builder) ImmutableImmunizationRecommendation_Recommendation.builder())
        .targetDisease(instance.targetDisease())
        .supportingPatientInformation(instance.supportingPatientInformation())
        .modifierExtension(instance.modifierExtension())
        .contraindicatedVaccineCode(instance.contraindicatedVaccineCode())
        .doseNumberPositiveInt(instance.doseNumberPositiveInt())
        .description(instance.description())
        .id(instance.id())
        .supportingImmunization(instance.supportingImmunization())
        .extension(instance.extension())
        .forecastReason(instance.forecastReason())
        .doseNumberString(instance.doseNumberString())
        .dateCriterion(instance.dateCriterion())
        .seriesDosesPositiveInt(instance.seriesDosesPositiveInt())
        .seriesDosesString(instance.seriesDosesString())
        .forecastStatus(instance.forecastStatus())
        .series(instance.series())
        .vaccineCode(instance.vaccineCode())
        .build();
  }

  /**
   * Creates a builder for {@link ImmunizationRecommendation_Recommendation ImmunizationRecommendation_Recommendation}.
   * <pre>
   * ImmutableImmunizationRecommendation_Recommendation.builder()
   *    .targetDisease(com.medplum.types.fhir.CodeableConcept) // optional {@link ImmunizationRecommendation_Recommendation#targetDisease() targetDisease}
   *    .supportingPatientInformation(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ImmunizationRecommendation_Recommendation#supportingPatientInformation() supportingPatientInformation}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImmunizationRecommendation_Recommendation#modifierExtension() modifierExtension}
   *    .contraindicatedVaccineCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ImmunizationRecommendation_Recommendation#contraindicatedVaccineCode() contraindicatedVaccineCode}
   *    .doseNumberPositiveInt(Double) // optional {@link ImmunizationRecommendation_Recommendation#doseNumberPositiveInt() doseNumberPositiveInt}
   *    .description(String) // optional {@link ImmunizationRecommendation_Recommendation#description() description}
   *    .id(String) // optional {@link ImmunizationRecommendation_Recommendation#id() id}
   *    .supportingImmunization(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ImmunizationRecommendation_Recommendation#supportingImmunization() supportingImmunization}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImmunizationRecommendation_Recommendation#extension() extension}
   *    .forecastReason(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ImmunizationRecommendation_Recommendation#forecastReason() forecastReason}
   *    .doseNumberString(String) // optional {@link ImmunizationRecommendation_Recommendation#doseNumberString() doseNumberString}
   *    .dateCriterion(List&amp;lt;com.medplum.types.fhir.ImmunizationRecommendation_DateCriterion&amp;gt;) // optional {@link ImmunizationRecommendation_Recommendation#dateCriterion() dateCriterion}
   *    .seriesDosesPositiveInt(Double) // optional {@link ImmunizationRecommendation_Recommendation#seriesDosesPositiveInt() seriesDosesPositiveInt}
   *    .seriesDosesString(String) // optional {@link ImmunizationRecommendation_Recommendation#seriesDosesString() seriesDosesString}
   *    .forecastStatus(com.medplum.types.fhir.CodeableConcept) // required {@link ImmunizationRecommendation_Recommendation#forecastStatus() forecastStatus}
   *    .series(String) // optional {@link ImmunizationRecommendation_Recommendation#series() series}
   *    .vaccineCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ImmunizationRecommendation_Recommendation#vaccineCode() vaccineCode}
   *    .build();
   * </pre>
   * @return A new ImmunizationRecommendation_Recommendation builder
   */
  public static ForecastStatusBuildStage builder() {
    return new ImmutableImmunizationRecommendation_Recommendation.Builder();
  }

  /**
   * Builds instances of type {@link ImmunizationRecommendation_Recommendation ImmunizationRecommendation_Recommendation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImmunizationRecommendation_Recommendation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ForecastStatusBuildStage, BuildFinal {
    private static final long INIT_BIT_FORECAST_STATUS = 0x1L;
    private static final long OPT_BIT_TARGET_DISEASE = 0x1L;
    private static final long OPT_BIT_SUPPORTING_PATIENT_INFORMATION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_CONTRAINDICATED_VACCINE_CODE = 0x8L;
    private static final long OPT_BIT_DOSE_NUMBER_POSITIVE_INT = 0x10L;
    private static final long OPT_BIT_DESCRIPTION = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_SUPPORTING_IMMUNIZATION = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private static final long OPT_BIT_FORECAST_REASON = 0x200L;
    private static final long OPT_BIT_DOSE_NUMBER_STRING = 0x400L;
    private static final long OPT_BIT_DATE_CRITERION = 0x800L;
    private static final long OPT_BIT_SERIES_DOSES_POSITIVE_INT = 0x1000L;
    private static final long OPT_BIT_SERIES_DOSES_STRING = 0x2000L;
    private static final long OPT_BIT_SERIES = 0x4000L;
    private static final long OPT_BIT_VACCINE_CODE = 0x8000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable CodeableConcept targetDisease;
    private @Nullable List<Reference> supportingPatientInformation;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<CodeableConcept> contraindicatedVaccineCode;
    private @Nullable Double doseNumberPositiveInt;
    private @Nullable String description;
    private @Nullable String id;
    private @Nullable List<Reference> supportingImmunization;
    private @Nullable List<Extension> extension;
    private @Nullable List<CodeableConcept> forecastReason;
    private @Nullable String doseNumberString;
    private @Nullable List<ImmunizationRecommendation_DateCriterion> dateCriterion;
    private @Nullable Double seriesDosesPositiveInt;
    private @Nullable String seriesDosesString;
    private @Nullable CodeableConcept forecastStatus;
    private @Nullable String series;
    private @Nullable List<CodeableConcept> vaccineCode;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#targetDisease() targetDisease} to targetDisease.
     * @param targetDisease The value for targetDisease
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetDisease(CodeableConcept targetDisease) {
      checkNotIsSet(targetDiseaseIsSet(), "targetDisease");
      this.targetDisease = Objects.requireNonNull(targetDisease, "targetDisease");
      optBits |= OPT_BIT_TARGET_DISEASE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#targetDisease() targetDisease} to targetDisease.
     * @param targetDisease The value for targetDisease
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("targetDisease")
    public final Builder targetDisease(Optional<? extends CodeableConcept> targetDisease) {
      checkNotIsSet(targetDiseaseIsSet(), "targetDisease");
      this.targetDisease = targetDisease.orElse(null);
      optBits |= OPT_BIT_TARGET_DISEASE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#supportingPatientInformation() supportingPatientInformation} to supportingPatientInformation.
     * @param supportingPatientInformation The value for supportingPatientInformation
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingPatientInformation(List<Reference> supportingPatientInformation) {
      checkNotIsSet(supportingPatientInformationIsSet(), "supportingPatientInformation");
      this.supportingPatientInformation = Objects.requireNonNull(supportingPatientInformation, "supportingPatientInformation");
      optBits |= OPT_BIT_SUPPORTING_PATIENT_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#supportingPatientInformation() supportingPatientInformation} to supportingPatientInformation.
     * @param supportingPatientInformation The value for supportingPatientInformation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportingPatientInformation")
    public final Builder supportingPatientInformation(Optional<? extends List<Reference>> supportingPatientInformation) {
      checkNotIsSet(supportingPatientInformationIsSet(), "supportingPatientInformation");
      this.supportingPatientInformation = supportingPatientInformation.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_PATIENT_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#contraindicatedVaccineCode() contraindicatedVaccineCode} to contraindicatedVaccineCode.
     * @param contraindicatedVaccineCode The value for contraindicatedVaccineCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder contraindicatedVaccineCode(List<CodeableConcept> contraindicatedVaccineCode) {
      checkNotIsSet(contraindicatedVaccineCodeIsSet(), "contraindicatedVaccineCode");
      this.contraindicatedVaccineCode = Objects.requireNonNull(contraindicatedVaccineCode, "contraindicatedVaccineCode");
      optBits |= OPT_BIT_CONTRAINDICATED_VACCINE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#contraindicatedVaccineCode() contraindicatedVaccineCode} to contraindicatedVaccineCode.
     * @param contraindicatedVaccineCode The value for contraindicatedVaccineCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contraindicatedVaccineCode")
    public final Builder contraindicatedVaccineCode(Optional<? extends List<CodeableConcept>> contraindicatedVaccineCode) {
      checkNotIsSet(contraindicatedVaccineCodeIsSet(), "contraindicatedVaccineCode");
      this.contraindicatedVaccineCode = contraindicatedVaccineCode.orElse(null);
      optBits |= OPT_BIT_CONTRAINDICATED_VACCINE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#doseNumberPositiveInt() doseNumberPositiveInt} to doseNumberPositiveInt.
     * @param doseNumberPositiveInt The value for doseNumberPositiveInt
     * @return {@code this} builder for chained invocation
     */
    public final Builder doseNumberPositiveInt(double doseNumberPositiveInt) {
      checkNotIsSet(doseNumberPositiveIntIsSet(), "doseNumberPositiveInt");
      this.doseNumberPositiveInt = doseNumberPositiveInt;
      optBits |= OPT_BIT_DOSE_NUMBER_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#doseNumberPositiveInt() doseNumberPositiveInt} to doseNumberPositiveInt.
     * @param doseNumberPositiveInt The value for doseNumberPositiveInt
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("doseNumberPositiveInt")
    public final Builder doseNumberPositiveInt(Optional<Double> doseNumberPositiveInt) {
      checkNotIsSet(doseNumberPositiveIntIsSet(), "doseNumberPositiveInt");
      this.doseNumberPositiveInt = doseNumberPositiveInt.orElse(null);
      optBits |= OPT_BIT_DOSE_NUMBER_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#description() description} to description.
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
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#description() description} to description.
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
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#id() id} to id.
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
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#id() id} to id.
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
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#supportingImmunization() supportingImmunization} to supportingImmunization.
     * @param supportingImmunization The value for supportingImmunization
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingImmunization(List<Reference> supportingImmunization) {
      checkNotIsSet(supportingImmunizationIsSet(), "supportingImmunization");
      this.supportingImmunization = Objects.requireNonNull(supportingImmunization, "supportingImmunization");
      optBits |= OPT_BIT_SUPPORTING_IMMUNIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#supportingImmunization() supportingImmunization} to supportingImmunization.
     * @param supportingImmunization The value for supportingImmunization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportingImmunization")
    public final Builder supportingImmunization(Optional<? extends List<Reference>> supportingImmunization) {
      checkNotIsSet(supportingImmunizationIsSet(), "supportingImmunization");
      this.supportingImmunization = supportingImmunization.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_IMMUNIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#extension() extension} to extension.
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
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#extension() extension} to extension.
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
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#forecastReason() forecastReason} to forecastReason.
     * @param forecastReason The value for forecastReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder forecastReason(List<CodeableConcept> forecastReason) {
      checkNotIsSet(forecastReasonIsSet(), "forecastReason");
      this.forecastReason = Objects.requireNonNull(forecastReason, "forecastReason");
      optBits |= OPT_BIT_FORECAST_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#forecastReason() forecastReason} to forecastReason.
     * @param forecastReason The value for forecastReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("forecastReason")
    public final Builder forecastReason(Optional<? extends List<CodeableConcept>> forecastReason) {
      checkNotIsSet(forecastReasonIsSet(), "forecastReason");
      this.forecastReason = forecastReason.orElse(null);
      optBits |= OPT_BIT_FORECAST_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#doseNumberString() doseNumberString} to doseNumberString.
     * @param doseNumberString The value for doseNumberString
     * @return {@code this} builder for chained invocation
     */
    public final Builder doseNumberString(String doseNumberString) {
      checkNotIsSet(doseNumberStringIsSet(), "doseNumberString");
      this.doseNumberString = Objects.requireNonNull(doseNumberString, "doseNumberString");
      optBits |= OPT_BIT_DOSE_NUMBER_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#doseNumberString() doseNumberString} to doseNumberString.
     * @param doseNumberString The value for doseNumberString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("doseNumberString")
    public final Builder doseNumberString(Optional<String> doseNumberString) {
      checkNotIsSet(doseNumberStringIsSet(), "doseNumberString");
      this.doseNumberString = doseNumberString.orElse(null);
      optBits |= OPT_BIT_DOSE_NUMBER_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#dateCriterion() dateCriterion} to dateCriterion.
     * @param dateCriterion The value for dateCriterion
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateCriterion(List<ImmunizationRecommendation_DateCriterion> dateCriterion) {
      checkNotIsSet(dateCriterionIsSet(), "dateCriterion");
      this.dateCriterion = Objects.requireNonNull(dateCriterion, "dateCriterion");
      optBits |= OPT_BIT_DATE_CRITERION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#dateCriterion() dateCriterion} to dateCriterion.
     * @param dateCriterion The value for dateCriterion
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dateCriterion")
    public final Builder dateCriterion(Optional<? extends List<ImmunizationRecommendation_DateCriterion>> dateCriterion) {
      checkNotIsSet(dateCriterionIsSet(), "dateCriterion");
      this.dateCriterion = dateCriterion.orElse(null);
      optBits |= OPT_BIT_DATE_CRITERION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#seriesDosesPositiveInt() seriesDosesPositiveInt} to seriesDosesPositiveInt.
     * @param seriesDosesPositiveInt The value for seriesDosesPositiveInt
     * @return {@code this} builder for chained invocation
     */
    public final Builder seriesDosesPositiveInt(double seriesDosesPositiveInt) {
      checkNotIsSet(seriesDosesPositiveIntIsSet(), "seriesDosesPositiveInt");
      this.seriesDosesPositiveInt = seriesDosesPositiveInt;
      optBits |= OPT_BIT_SERIES_DOSES_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#seriesDosesPositiveInt() seriesDosesPositiveInt} to seriesDosesPositiveInt.
     * @param seriesDosesPositiveInt The value for seriesDosesPositiveInt
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("seriesDosesPositiveInt")
    public final Builder seriesDosesPositiveInt(Optional<Double> seriesDosesPositiveInt) {
      checkNotIsSet(seriesDosesPositiveIntIsSet(), "seriesDosesPositiveInt");
      this.seriesDosesPositiveInt = seriesDosesPositiveInt.orElse(null);
      optBits |= OPT_BIT_SERIES_DOSES_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#seriesDosesString() seriesDosesString} to seriesDosesString.
     * @param seriesDosesString The value for seriesDosesString
     * @return {@code this} builder for chained invocation
     */
    public final Builder seriesDosesString(String seriesDosesString) {
      checkNotIsSet(seriesDosesStringIsSet(), "seriesDosesString");
      this.seriesDosesString = Objects.requireNonNull(seriesDosesString, "seriesDosesString");
      optBits |= OPT_BIT_SERIES_DOSES_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#seriesDosesString() seriesDosesString} to seriesDosesString.
     * @param seriesDosesString The value for seriesDosesString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("seriesDosesString")
    public final Builder seriesDosesString(Optional<String> seriesDosesString) {
      checkNotIsSet(seriesDosesStringIsSet(), "seriesDosesString");
      this.seriesDosesString = seriesDosesString.orElse(null);
      optBits |= OPT_BIT_SERIES_DOSES_STRING;
      return this;
    }

    /**
     * Initializes the value for the {@link ImmunizationRecommendation_Recommendation#forecastStatus() forecastStatus} attribute.
     * @param forecastStatus The value for forecastStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("forecastStatus")
    public final Builder forecastStatus(CodeableConcept forecastStatus) {
      checkNotIsSet(forecastStatusIsSet(), "forecastStatus");
      this.forecastStatus = Objects.requireNonNull(forecastStatus, "forecastStatus");
      initBits &= ~INIT_BIT_FORECAST_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for chained invocation
     */
    public final Builder series(String series) {
      checkNotIsSet(seriesIsSet(), "series");
      this.series = Objects.requireNonNull(series, "series");
      optBits |= OPT_BIT_SERIES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("series")
    public final Builder series(Optional<String> series) {
      checkNotIsSet(seriesIsSet(), "series");
      this.series = series.orElse(null);
      optBits |= OPT_BIT_SERIES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#vaccineCode() vaccineCode} to vaccineCode.
     * @param vaccineCode The value for vaccineCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder vaccineCode(List<CodeableConcept> vaccineCode) {
      checkNotIsSet(vaccineCodeIsSet(), "vaccineCode");
      this.vaccineCode = Objects.requireNonNull(vaccineCode, "vaccineCode");
      optBits |= OPT_BIT_VACCINE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#vaccineCode() vaccineCode} to vaccineCode.
     * @param vaccineCode The value for vaccineCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("vaccineCode")
    public final Builder vaccineCode(Optional<? extends List<CodeableConcept>> vaccineCode) {
      checkNotIsSet(vaccineCodeIsSet(), "vaccineCode");
      this.vaccineCode = vaccineCode.orElse(null);
      optBits |= OPT_BIT_VACCINE_CODE;
      return this;
    }

    /**
     * Builds a new {@link ImmunizationRecommendation_Recommendation ImmunizationRecommendation_Recommendation}.
     * @return An immutable instance of ImmunizationRecommendation_Recommendation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmunizationRecommendation_Recommendation build() {
      checkRequiredAttributes();
      return new ImmutableImmunizationRecommendation_Recommendation(
          targetDisease,
          supportingPatientInformation,
          modifierExtension,
          contraindicatedVaccineCode,
          doseNumberPositiveInt,
          description,
          id,
          supportingImmunization,
          extension,
          forecastReason,
          doseNumberString,
          dateCriterion,
          seriesDosesPositiveInt,
          seriesDosesString,
          forecastStatus,
          series,
          vaccineCode);
    }

    private boolean targetDiseaseIsSet() {
      return (optBits & OPT_BIT_TARGET_DISEASE) != 0;
    }

    private boolean supportingPatientInformationIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_PATIENT_INFORMATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean contraindicatedVaccineCodeIsSet() {
      return (optBits & OPT_BIT_CONTRAINDICATED_VACCINE_CODE) != 0;
    }

    private boolean doseNumberPositiveIntIsSet() {
      return (optBits & OPT_BIT_DOSE_NUMBER_POSITIVE_INT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean supportingImmunizationIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_IMMUNIZATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean forecastReasonIsSet() {
      return (optBits & OPT_BIT_FORECAST_REASON) != 0;
    }

    private boolean doseNumberStringIsSet() {
      return (optBits & OPT_BIT_DOSE_NUMBER_STRING) != 0;
    }

    private boolean dateCriterionIsSet() {
      return (optBits & OPT_BIT_DATE_CRITERION) != 0;
    }

    private boolean seriesDosesPositiveIntIsSet() {
      return (optBits & OPT_BIT_SERIES_DOSES_POSITIVE_INT) != 0;
    }

    private boolean seriesDosesStringIsSet() {
      return (optBits & OPT_BIT_SERIES_DOSES_STRING) != 0;
    }

    private boolean seriesIsSet() {
      return (optBits & OPT_BIT_SERIES) != 0;
    }

    private boolean vaccineCodeIsSet() {
      return (optBits & OPT_BIT_VACCINE_CODE) != 0;
    }

    private boolean forecastStatusIsSet() {
      return (initBits & INIT_BIT_FORECAST_STATUS) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImmunizationRecommendation_Recommendation is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!forecastStatusIsSet()) attributes.add("forecastStatus");
      return "Cannot build ImmunizationRecommendation_Recommendation, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ImmunizationRecommendation_Recommendation", generator = "Immutables")
  public interface ForecastStatusBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationRecommendation_Recommendation#forecastStatus() forecastStatus} attribute.
     * @param forecastStatus The value for forecastStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal forecastStatus(CodeableConcept forecastStatus);
  }

  @Generated(from = "ImmunizationRecommendation_Recommendation", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#targetDisease() targetDisease} to targetDisease.
     * @param targetDisease The value for targetDisease
     * @return {@code this} builder for chained invocation
     */
    BuildFinal targetDisease(CodeableConcept targetDisease);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#targetDisease() targetDisease} to targetDisease.
     * @param targetDisease The value for targetDisease
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal targetDisease(Optional<? extends CodeableConcept> targetDisease);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#supportingPatientInformation() supportingPatientInformation} to supportingPatientInformation.
     * @param supportingPatientInformation The value for supportingPatientInformation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingPatientInformation(List<Reference> supportingPatientInformation);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#supportingPatientInformation() supportingPatientInformation} to supportingPatientInformation.
     * @param supportingPatientInformation The value for supportingPatientInformation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingPatientInformation(Optional<? extends List<Reference>> supportingPatientInformation);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#contraindicatedVaccineCode() contraindicatedVaccineCode} to contraindicatedVaccineCode.
     * @param contraindicatedVaccineCode The value for contraindicatedVaccineCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contraindicatedVaccineCode(List<CodeableConcept> contraindicatedVaccineCode);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#contraindicatedVaccineCode() contraindicatedVaccineCode} to contraindicatedVaccineCode.
     * @param contraindicatedVaccineCode The value for contraindicatedVaccineCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contraindicatedVaccineCode(Optional<? extends List<CodeableConcept>> contraindicatedVaccineCode);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#doseNumberPositiveInt() doseNumberPositiveInt} to doseNumberPositiveInt.
     * @param doseNumberPositiveInt The value for doseNumberPositiveInt
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doseNumberPositiveInt(double doseNumberPositiveInt);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#doseNumberPositiveInt() doseNumberPositiveInt} to doseNumberPositiveInt.
     * @param doseNumberPositiveInt The value for doseNumberPositiveInt
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doseNumberPositiveInt(Optional<Double> doseNumberPositiveInt);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#supportingImmunization() supportingImmunization} to supportingImmunization.
     * @param supportingImmunization The value for supportingImmunization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingImmunization(List<Reference> supportingImmunization);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#supportingImmunization() supportingImmunization} to supportingImmunization.
     * @param supportingImmunization The value for supportingImmunization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingImmunization(Optional<? extends List<Reference>> supportingImmunization);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#forecastReason() forecastReason} to forecastReason.
     * @param forecastReason The value for forecastReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal forecastReason(List<CodeableConcept> forecastReason);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#forecastReason() forecastReason} to forecastReason.
     * @param forecastReason The value for forecastReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal forecastReason(Optional<? extends List<CodeableConcept>> forecastReason);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#doseNumberString() doseNumberString} to doseNumberString.
     * @param doseNumberString The value for doseNumberString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doseNumberString(String doseNumberString);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#doseNumberString() doseNumberString} to doseNumberString.
     * @param doseNumberString The value for doseNumberString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doseNumberString(Optional<String> doseNumberString);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#dateCriterion() dateCriterion} to dateCriterion.
     * @param dateCriterion The value for dateCriterion
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dateCriterion(List<ImmunizationRecommendation_DateCriterion> dateCriterion);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#dateCriterion() dateCriterion} to dateCriterion.
     * @param dateCriterion The value for dateCriterion
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dateCriterion(Optional<? extends List<ImmunizationRecommendation_DateCriterion>> dateCriterion);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#seriesDosesPositiveInt() seriesDosesPositiveInt} to seriesDosesPositiveInt.
     * @param seriesDosesPositiveInt The value for seriesDosesPositiveInt
     * @return {@code this} builder for chained invocation
     */
    BuildFinal seriesDosesPositiveInt(double seriesDosesPositiveInt);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#seriesDosesPositiveInt() seriesDosesPositiveInt} to seriesDosesPositiveInt.
     * @param seriesDosesPositiveInt The value for seriesDosesPositiveInt
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal seriesDosesPositiveInt(Optional<Double> seriesDosesPositiveInt);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#seriesDosesString() seriesDosesString} to seriesDosesString.
     * @param seriesDosesString The value for seriesDosesString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal seriesDosesString(String seriesDosesString);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#seriesDosesString() seriesDosesString} to seriesDosesString.
     * @param seriesDosesString The value for seriesDosesString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal seriesDosesString(Optional<String> seriesDosesString);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for chained invocation
     */
    BuildFinal series(String series);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal series(Optional<String> series);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#vaccineCode() vaccineCode} to vaccineCode.
     * @param vaccineCode The value for vaccineCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal vaccineCode(List<CodeableConcept> vaccineCode);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_Recommendation#vaccineCode() vaccineCode} to vaccineCode.
     * @param vaccineCode The value for vaccineCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal vaccineCode(Optional<? extends List<CodeableConcept>> vaccineCode);

    /**
     * Builds a new {@link ImmunizationRecommendation_Recommendation ImmunizationRecommendation_Recommendation}.
     * @return An immutable instance of ImmunizationRecommendation_Recommendation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImmunizationRecommendation_Recommendation build();
  }
}
