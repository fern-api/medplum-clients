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
 * Immutable implementation of {@link RiskAssessment_Prediction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRiskAssessment_Prediction.builder()}.
 */
@Generated(from = "RiskAssessment_Prediction", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRiskAssessment_Prediction
    implements RiskAssessment_Prediction {
  private final @Nullable CodeableConcept outcome;
  private final @Nullable Range probabilityRange;
  private final @Nullable Range whenRange;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String rationale;
  private final @Nullable CodeableConcept qualitativeRisk;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable Double probabilityDecimal;
  private final @Nullable Decimal relativeRisk;
  private final @Nullable Period whenPeriod;

  private ImmutableRiskAssessment_Prediction(
      @Nullable CodeableConcept outcome,
      @Nullable Range probabilityRange,
      @Nullable Range whenRange,
      @Nullable List<Extension> modifierExtension,
      @Nullable String rationale,
      @Nullable CodeableConcept qualitativeRisk,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable Double probabilityDecimal,
      @Nullable Decimal relativeRisk,
      @Nullable Period whenPeriod) {
    this.outcome = outcome;
    this.probabilityRange = probabilityRange;
    this.whenRange = whenRange;
    this.modifierExtension = modifierExtension;
    this.rationale = rationale;
    this.qualitativeRisk = qualitativeRisk;
    this.extension = extension;
    this.id = id;
    this.probabilityDecimal = probabilityDecimal;
    this.relativeRisk = relativeRisk;
    this.whenPeriod = whenPeriod;
  }

  /**
   * @return The value of the {@code outcome} attribute
   */
  @JsonProperty("outcome")
  @Override
  public Optional<CodeableConcept> outcome() {
    return Optional.ofNullable(outcome);
  }

  /**
   * @return The value of the {@code probabilityRange} attribute
   */
  @JsonProperty("probabilityRange")
  @Override
  public Optional<Range> probabilityRange() {
    return Optional.ofNullable(probabilityRange);
  }

  /**
   * @return The value of the {@code whenRange} attribute
   */
  @JsonProperty("whenRange")
  @Override
  public Optional<Range> whenRange() {
    return Optional.ofNullable(whenRange);
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
   * @return The value of the {@code rationale} attribute
   */
  @JsonProperty("rationale")
  @Override
  public Optional<String> rationale() {
    return Optional.ofNullable(rationale);
  }

  /**
   * @return The value of the {@code qualitativeRisk} attribute
   */
  @JsonProperty("qualitativeRisk")
  @Override
  public Optional<CodeableConcept> qualitativeRisk() {
    return Optional.ofNullable(qualitativeRisk);
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
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code probabilityDecimal} attribute
   */
  @JsonProperty("probabilityDecimal")
  @Override
  public Optional<Double> probabilityDecimal() {
    return Optional.ofNullable(probabilityDecimal);
  }

  /**
   * @return The value of the {@code relativeRisk} attribute
   */
  @JsonProperty("relativeRisk")
  @Override
  public Optional<Decimal> relativeRisk() {
    return Optional.ofNullable(relativeRisk);
  }

  /**
   * @return The value of the {@code whenPeriod} attribute
   */
  @JsonProperty("whenPeriod")
  @Override
  public Optional<Period> whenPeriod() {
    return Optional.ofNullable(whenPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withOutcome(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableRiskAssessment_Prediction(
        newValue,
        this.probabilityRange,
        this.whenRange,
        this.modifierExtension,
        this.rationale,
        this.qualitativeRisk,
        this.extension,
        this.id,
        this.probabilityDecimal,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment_Prediction withOutcome(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableRiskAssessment_Prediction(
        value,
        this.probabilityRange,
        this.whenRange,
        this.modifierExtension,
        this.rationale,
        this.qualitativeRisk,
        this.extension,
        this.id,
        this.probabilityDecimal,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#probabilityRange() probabilityRange} attribute.
   * @param value The value for probabilityRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withProbabilityRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "probabilityRange");
    if (this.probabilityRange == newValue) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        newValue,
        this.whenRange,
        this.modifierExtension,
        this.rationale,
        this.qualitativeRisk,
        this.extension,
        this.id,
        this.probabilityDecimal,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#probabilityRange() probabilityRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for probabilityRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment_Prediction withProbabilityRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.probabilityRange == value) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        value,
        this.whenRange,
        this.modifierExtension,
        this.rationale,
        this.qualitativeRisk,
        this.extension,
        this.id,
        this.probabilityDecimal,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#whenRange() whenRange} attribute.
   * @param value The value for whenRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withWhenRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "whenRange");
    if (this.whenRange == newValue) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        newValue,
        this.modifierExtension,
        this.rationale,
        this.qualitativeRisk,
        this.extension,
        this.id,
        this.probabilityDecimal,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#whenRange() whenRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for whenRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment_Prediction withWhenRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.whenRange == value) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        value,
        this.modifierExtension,
        this.rationale,
        this.qualitativeRisk,
        this.extension,
        this.id,
        this.probabilityDecimal,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        this.whenRange,
        newValue,
        this.rationale,
        this.qualitativeRisk,
        this.extension,
        this.id,
        this.probabilityDecimal,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment_Prediction withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        this.whenRange,
        value,
        this.rationale,
        this.qualitativeRisk,
        this.extension,
        this.id,
        this.probabilityDecimal,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#rationale() rationale} attribute.
   * @param value The value for rationale
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withRationale(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "rationale");
    if (Objects.equals(this.rationale, newValue)) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        this.whenRange,
        this.modifierExtension,
        newValue,
        this.qualitativeRisk,
        this.extension,
        this.id,
        this.probabilityDecimal,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#rationale() rationale} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rationale
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withRationale(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.rationale, value)) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        this.whenRange,
        this.modifierExtension,
        value,
        this.qualitativeRisk,
        this.extension,
        this.id,
        this.probabilityDecimal,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#qualitativeRisk() qualitativeRisk} attribute.
   * @param value The value for qualitativeRisk
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withQualitativeRisk(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "qualitativeRisk");
    if (this.qualitativeRisk == newValue) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        this.whenRange,
        this.modifierExtension,
        this.rationale,
        newValue,
        this.extension,
        this.id,
        this.probabilityDecimal,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#qualitativeRisk() qualitativeRisk} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for qualitativeRisk
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment_Prediction withQualitativeRisk(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.qualitativeRisk == value) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        this.whenRange,
        this.modifierExtension,
        this.rationale,
        value,
        this.extension,
        this.id,
        this.probabilityDecimal,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        this.whenRange,
        this.modifierExtension,
        this.rationale,
        this.qualitativeRisk,
        newValue,
        this.id,
        this.probabilityDecimal,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment_Prediction withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        this.whenRange,
        this.modifierExtension,
        this.rationale,
        this.qualitativeRisk,
        value,
        this.id,
        this.probabilityDecimal,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        this.whenRange,
        this.modifierExtension,
        this.rationale,
        this.qualitativeRisk,
        this.extension,
        newValue,
        this.probabilityDecimal,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        this.whenRange,
        this.modifierExtension,
        this.rationale,
        this.qualitativeRisk,
        this.extension,
        value,
        this.probabilityDecimal,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#probabilityDecimal() probabilityDecimal} attribute.
   * @param value The value for probabilityDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withProbabilityDecimal(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.probabilityDecimal, newValue)) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        this.whenRange,
        this.modifierExtension,
        this.rationale,
        this.qualitativeRisk,
        this.extension,
        this.id,
        newValue,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#probabilityDecimal() probabilityDecimal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for probabilityDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withProbabilityDecimal(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.probabilityDecimal, value)) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        this.whenRange,
        this.modifierExtension,
        this.rationale,
        this.qualitativeRisk,
        this.extension,
        this.id,
        value,
        this.relativeRisk,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#relativeRisk() relativeRisk} attribute.
   * @param value The value for relativeRisk
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withRelativeRisk(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "relativeRisk");
    if (this.relativeRisk == newValue) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        this.whenRange,
        this.modifierExtension,
        this.rationale,
        this.qualitativeRisk,
        this.extension,
        this.id,
        this.probabilityDecimal,
        newValue,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#relativeRisk() relativeRisk} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relativeRisk
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment_Prediction withRelativeRisk(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.relativeRisk == value) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        this.whenRange,
        this.modifierExtension,
        this.rationale,
        this.qualitativeRisk,
        this.extension,
        this.id,
        this.probabilityDecimal,
        value,
        this.whenPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#whenPeriod() whenPeriod} attribute.
   * @param value The value for whenPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withWhenPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "whenPeriod");
    if (this.whenPeriod == newValue) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        this.whenRange,
        this.modifierExtension,
        this.rationale,
        this.qualitativeRisk,
        this.extension,
        this.id,
        this.probabilityDecimal,
        this.relativeRisk,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#whenPeriod() whenPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for whenPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment_Prediction withWhenPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.whenPeriod == value) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.outcome,
        this.probabilityRange,
        this.whenRange,
        this.modifierExtension,
        this.rationale,
        this.qualitativeRisk,
        this.extension,
        this.id,
        this.probabilityDecimal,
        this.relativeRisk,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRiskAssessment_Prediction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRiskAssessment_Prediction
        && equalTo((ImmutableRiskAssessment_Prediction) another);
  }

  private boolean equalTo(ImmutableRiskAssessment_Prediction another) {
    return Objects.equals(outcome, another.outcome)
        && Objects.equals(probabilityRange, another.probabilityRange)
        && Objects.equals(whenRange, another.whenRange)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(rationale, another.rationale)
        && Objects.equals(qualitativeRisk, another.qualitativeRisk)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(probabilityDecimal, another.probabilityDecimal)
        && Objects.equals(relativeRisk, another.relativeRisk)
        && Objects.equals(whenPeriod, another.whenPeriod);
  }

  /**
   * Computes a hash code from attributes: {@code outcome}, {@code probabilityRange}, {@code whenRange}, {@code modifierExtension}, {@code rationale}, {@code qualitativeRisk}, {@code extension}, {@code id}, {@code probabilityDecimal}, {@code relativeRisk}, {@code whenPeriod}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(outcome);
    h += (h << 5) + Objects.hashCode(probabilityRange);
    h += (h << 5) + Objects.hashCode(whenRange);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(rationale);
    h += (h << 5) + Objects.hashCode(qualitativeRisk);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(probabilityDecimal);
    h += (h << 5) + Objects.hashCode(relativeRisk);
    h += (h << 5) + Objects.hashCode(whenPeriod);
    return h;
  }

  /**
   * Prints the immutable value {@code RiskAssessment_Prediction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("RiskAssessment_Prediction{");
    if (outcome != null) {
      builder.append("outcome=").append(outcome);
    }
    if (probabilityRange != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("probabilityRange=").append(probabilityRange);
    }
    if (whenRange != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("whenRange=").append(whenRange);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (rationale != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("rationale=").append(rationale);
    }
    if (qualitativeRisk != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("qualitativeRisk=").append(qualitativeRisk);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (probabilityDecimal != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("probabilityDecimal=").append(probabilityDecimal);
    }
    if (relativeRisk != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("relativeRisk=").append(relativeRisk);
    }
    if (whenPeriod != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("whenPeriod=").append(whenPeriod);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "RiskAssessment_Prediction", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RiskAssessment_Prediction {
    @Nullable Optional<CodeableConcept> outcome = Optional.empty();
    boolean outcomeIsSet;
    @Nullable Optional<Range> probabilityRange = Optional.empty();
    boolean probabilityRangeIsSet;
    @Nullable Optional<Range> whenRange = Optional.empty();
    boolean whenRangeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> rationale = Optional.empty();
    boolean rationaleIsSet;
    @Nullable Optional<CodeableConcept> qualitativeRisk = Optional.empty();
    boolean qualitativeRiskIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Double> probabilityDecimal = Optional.empty();
    boolean probabilityDecimalIsSet;
    @Nullable Optional<Decimal> relativeRisk = Optional.empty();
    boolean relativeRiskIsSet;
    @Nullable Optional<Period> whenPeriod = Optional.empty();
    boolean whenPeriodIsSet;
    @JsonProperty("outcome")
    public void setOutcome(Optional<CodeableConcept> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @JsonProperty("probabilityRange")
    public void setProbabilityRange(Optional<Range> probabilityRange) {
      this.probabilityRange = probabilityRange;
      this.probabilityRangeIsSet = true;
    }
    @JsonProperty("whenRange")
    public void setWhenRange(Optional<Range> whenRange) {
      this.whenRange = whenRange;
      this.whenRangeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("rationale")
    public void setRationale(Optional<String> rationale) {
      this.rationale = rationale;
      this.rationaleIsSet = true;
    }
    @JsonProperty("qualitativeRisk")
    public void setQualitativeRisk(Optional<CodeableConcept> qualitativeRisk) {
      this.qualitativeRisk = qualitativeRisk;
      this.qualitativeRiskIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("probabilityDecimal")
    public void setProbabilityDecimal(Optional<Double> probabilityDecimal) {
      this.probabilityDecimal = probabilityDecimal;
      this.probabilityDecimalIsSet = true;
    }
    @JsonProperty("relativeRisk")
    public void setRelativeRisk(Optional<Decimal> relativeRisk) {
      this.relativeRisk = relativeRisk;
      this.relativeRiskIsSet = true;
    }
    @JsonProperty("whenPeriod")
    public void setWhenPeriod(Optional<Period> whenPeriod) {
      this.whenPeriod = whenPeriod;
      this.whenPeriodIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> probabilityRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> whenRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> rationale() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> qualitativeRisk() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> probabilityDecimal() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> relativeRisk() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> whenPeriod() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRiskAssessment_Prediction fromJson(Json json) {
    ImmutableRiskAssessment_Prediction.Builder builder = ImmutableRiskAssessment_Prediction.builder();
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.probabilityRangeIsSet) {
      builder.probabilityRange(json.probabilityRange);
    }
    if (json.whenRangeIsSet) {
      builder.whenRange(json.whenRange);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.rationaleIsSet) {
      builder.rationale(json.rationale);
    }
    if (json.qualitativeRiskIsSet) {
      builder.qualitativeRisk(json.qualitativeRisk);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.probabilityDecimalIsSet) {
      builder.probabilityDecimal(json.probabilityDecimal);
    }
    if (json.relativeRiskIsSet) {
      builder.relativeRisk(json.relativeRisk);
    }
    if (json.whenPeriodIsSet) {
      builder.whenPeriod(json.whenPeriod);
    }
    return (ImmutableRiskAssessment_Prediction) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RiskAssessment_Prediction} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RiskAssessment_Prediction instance
   */
  public static RiskAssessment_Prediction copyOf(RiskAssessment_Prediction instance) {
    if (instance instanceof ImmutableRiskAssessment_Prediction) {
      return (ImmutableRiskAssessment_Prediction) instance;
    }
    return ImmutableRiskAssessment_Prediction.builder()
        .outcome(instance.outcome())
        .probabilityRange(instance.probabilityRange())
        .whenRange(instance.whenRange())
        .modifierExtension(instance.modifierExtension())
        .rationale(instance.rationale())
        .qualitativeRisk(instance.qualitativeRisk())
        .extension(instance.extension())
        .id(instance.id())
        .probabilityDecimal(instance.probabilityDecimal())
        .relativeRisk(instance.relativeRisk())
        .whenPeriod(instance.whenPeriod())
        .build();
  }

  /**
   * Creates a builder for {@link RiskAssessment_Prediction RiskAssessment_Prediction}.
   * <pre>
   * ImmutableRiskAssessment_Prediction.builder()
   *    .outcome(com.medplum.types.fhir.CodeableConcept) // optional {@link RiskAssessment_Prediction#outcome() outcome}
   *    .probabilityRange(com.medplum.types.fhir.Range) // optional {@link RiskAssessment_Prediction#probabilityRange() probabilityRange}
   *    .whenRange(com.medplum.types.fhir.Range) // optional {@link RiskAssessment_Prediction#whenRange() whenRange}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link RiskAssessment_Prediction#modifierExtension() modifierExtension}
   *    .rationale(String) // optional {@link RiskAssessment_Prediction#rationale() rationale}
   *    .qualitativeRisk(com.medplum.types.fhir.CodeableConcept) // optional {@link RiskAssessment_Prediction#qualitativeRisk() qualitativeRisk}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link RiskAssessment_Prediction#extension() extension}
   *    .id(String) // optional {@link RiskAssessment_Prediction#id() id}
   *    .probabilityDecimal(Double) // optional {@link RiskAssessment_Prediction#probabilityDecimal() probabilityDecimal}
   *    .relativeRisk(com.medplum.types.fhir.Decimal) // optional {@link RiskAssessment_Prediction#relativeRisk() relativeRisk}
   *    .whenPeriod(com.medplum.types.fhir.Period) // optional {@link RiskAssessment_Prediction#whenPeriod() whenPeriod}
   *    .build();
   * </pre>
   * @return A new RiskAssessment_Prediction builder
   */
  public static ImmutableRiskAssessment_Prediction.Builder builder() {
    return new ImmutableRiskAssessment_Prediction.Builder();
  }

  /**
   * Builds instances of type {@link RiskAssessment_Prediction RiskAssessment_Prediction}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "RiskAssessment_Prediction", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_OUTCOME = 0x1L;
    private static final long OPT_BIT_PROBABILITY_RANGE = 0x2L;
    private static final long OPT_BIT_WHEN_RANGE = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_RATIONALE = 0x10L;
    private static final long OPT_BIT_QUALITATIVE_RISK = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_PROBABILITY_DECIMAL = 0x100L;
    private static final long OPT_BIT_RELATIVE_RISK = 0x200L;
    private static final long OPT_BIT_WHEN_PERIOD = 0x400L;
    private long optBits;

    private @Nullable CodeableConcept outcome;
    private @Nullable Range probabilityRange;
    private @Nullable Range whenRange;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String rationale;
    private @Nullable CodeableConcept qualitativeRisk;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Double probabilityDecimal;
    private @Nullable Decimal relativeRisk;
    private @Nullable Period whenPeriod;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(CodeableConcept outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder outcome(Optional<? extends CodeableConcept> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#probabilityRange() probabilityRange} to probabilityRange.
     * @param probabilityRange The value for probabilityRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder probabilityRange(Range probabilityRange) {
      checkNotIsSet(probabilityRangeIsSet(), "probabilityRange");
      this.probabilityRange = Objects.requireNonNull(probabilityRange, "probabilityRange");
      optBits |= OPT_BIT_PROBABILITY_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#probabilityRange() probabilityRange} to probabilityRange.
     * @param probabilityRange The value for probabilityRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("probabilityRange")
    public final Builder probabilityRange(Optional<? extends Range> probabilityRange) {
      checkNotIsSet(probabilityRangeIsSet(), "probabilityRange");
      this.probabilityRange = probabilityRange.orElse(null);
      optBits |= OPT_BIT_PROBABILITY_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#whenRange() whenRange} to whenRange.
     * @param whenRange The value for whenRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder whenRange(Range whenRange) {
      checkNotIsSet(whenRangeIsSet(), "whenRange");
      this.whenRange = Objects.requireNonNull(whenRange, "whenRange");
      optBits |= OPT_BIT_WHEN_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#whenRange() whenRange} to whenRange.
     * @param whenRange The value for whenRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("whenRange")
    public final Builder whenRange(Optional<? extends Range> whenRange) {
      checkNotIsSet(whenRangeIsSet(), "whenRange");
      this.whenRange = whenRange.orElse(null);
      optBits |= OPT_BIT_WHEN_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskAssessment_Prediction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskAssessment_Prediction#rationale() rationale} to rationale.
     * @param rationale The value for rationale
     * @return {@code this} builder for chained invocation
     */
    public final Builder rationale(String rationale) {
      checkNotIsSet(rationaleIsSet(), "rationale");
      this.rationale = Objects.requireNonNull(rationale, "rationale");
      optBits |= OPT_BIT_RATIONALE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#rationale() rationale} to rationale.
     * @param rationale The value for rationale
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rationale")
    public final Builder rationale(Optional<String> rationale) {
      checkNotIsSet(rationaleIsSet(), "rationale");
      this.rationale = rationale.orElse(null);
      optBits |= OPT_BIT_RATIONALE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#qualitativeRisk() qualitativeRisk} to qualitativeRisk.
     * @param qualitativeRisk The value for qualitativeRisk
     * @return {@code this} builder for chained invocation
     */
    public final Builder qualitativeRisk(CodeableConcept qualitativeRisk) {
      checkNotIsSet(qualitativeRiskIsSet(), "qualitativeRisk");
      this.qualitativeRisk = Objects.requireNonNull(qualitativeRisk, "qualitativeRisk");
      optBits |= OPT_BIT_QUALITATIVE_RISK;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#qualitativeRisk() qualitativeRisk} to qualitativeRisk.
     * @param qualitativeRisk The value for qualitativeRisk
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("qualitativeRisk")
    public final Builder qualitativeRisk(Optional<? extends CodeableConcept> qualitativeRisk) {
      checkNotIsSet(qualitativeRiskIsSet(), "qualitativeRisk");
      this.qualitativeRisk = qualitativeRisk.orElse(null);
      optBits |= OPT_BIT_QUALITATIVE_RISK;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskAssessment_Prediction#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskAssessment_Prediction#id() id} to id.
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
     * Initializes the optional value {@link RiskAssessment_Prediction#id() id} to id.
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
     * Initializes the optional value {@link RiskAssessment_Prediction#probabilityDecimal() probabilityDecimal} to probabilityDecimal.
     * @param probabilityDecimal The value for probabilityDecimal
     * @return {@code this} builder for chained invocation
     */
    public final Builder probabilityDecimal(double probabilityDecimal) {
      checkNotIsSet(probabilityDecimalIsSet(), "probabilityDecimal");
      this.probabilityDecimal = probabilityDecimal;
      optBits |= OPT_BIT_PROBABILITY_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#probabilityDecimal() probabilityDecimal} to probabilityDecimal.
     * @param probabilityDecimal The value for probabilityDecimal
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("probabilityDecimal")
    public final Builder probabilityDecimal(Optional<Double> probabilityDecimal) {
      checkNotIsSet(probabilityDecimalIsSet(), "probabilityDecimal");
      this.probabilityDecimal = probabilityDecimal.orElse(null);
      optBits |= OPT_BIT_PROBABILITY_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#relativeRisk() relativeRisk} to relativeRisk.
     * @param relativeRisk The value for relativeRisk
     * @return {@code this} builder for chained invocation
     */
    public final Builder relativeRisk(Decimal relativeRisk) {
      checkNotIsSet(relativeRiskIsSet(), "relativeRisk");
      this.relativeRisk = Objects.requireNonNull(relativeRisk, "relativeRisk");
      optBits |= OPT_BIT_RELATIVE_RISK;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#relativeRisk() relativeRisk} to relativeRisk.
     * @param relativeRisk The value for relativeRisk
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relativeRisk")
    public final Builder relativeRisk(Optional<? extends Decimal> relativeRisk) {
      checkNotIsSet(relativeRiskIsSet(), "relativeRisk");
      this.relativeRisk = relativeRisk.orElse(null);
      optBits |= OPT_BIT_RELATIVE_RISK;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#whenPeriod() whenPeriod} to whenPeriod.
     * @param whenPeriod The value for whenPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder whenPeriod(Period whenPeriod) {
      checkNotIsSet(whenPeriodIsSet(), "whenPeriod");
      this.whenPeriod = Objects.requireNonNull(whenPeriod, "whenPeriod");
      optBits |= OPT_BIT_WHEN_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#whenPeriod() whenPeriod} to whenPeriod.
     * @param whenPeriod The value for whenPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("whenPeriod")
    public final Builder whenPeriod(Optional<? extends Period> whenPeriod) {
      checkNotIsSet(whenPeriodIsSet(), "whenPeriod");
      this.whenPeriod = whenPeriod.orElse(null);
      optBits |= OPT_BIT_WHEN_PERIOD;
      return this;
    }

    /**
     * Builds a new {@link RiskAssessment_Prediction RiskAssessment_Prediction}.
     * @return An immutable instance of RiskAssessment_Prediction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public RiskAssessment_Prediction build() {
      return new ImmutableRiskAssessment_Prediction(
          outcome,
          probabilityRange,
          whenRange,
          modifierExtension,
          rationale,
          qualitativeRisk,
          extension,
          id,
          probabilityDecimal,
          relativeRisk,
          whenPeriod);
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean probabilityRangeIsSet() {
      return (optBits & OPT_BIT_PROBABILITY_RANGE) != 0;
    }

    private boolean whenRangeIsSet() {
      return (optBits & OPT_BIT_WHEN_RANGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean rationaleIsSet() {
      return (optBits & OPT_BIT_RATIONALE) != 0;
    }

    private boolean qualitativeRiskIsSet() {
      return (optBits & OPT_BIT_QUALITATIVE_RISK) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean probabilityDecimalIsSet() {
      return (optBits & OPT_BIT_PROBABILITY_DECIMAL) != 0;
    }

    private boolean relativeRiskIsSet() {
      return (optBits & OPT_BIT_RELATIVE_RISK) != 0;
    }

    private boolean whenPeriodIsSet() {
      return (optBits & OPT_BIT_WHEN_PERIOD) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of RiskAssessment_Prediction is strict, attribute is already set: ".concat(name));
    }
  }
}
