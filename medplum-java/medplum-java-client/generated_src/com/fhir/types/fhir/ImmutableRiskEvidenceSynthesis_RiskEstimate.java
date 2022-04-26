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
 * Immutable implementation of {@link RiskEvidenceSynthesis_RiskEstimate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRiskEvidenceSynthesis_RiskEstimate.builder()}.
 */
@Generated(from = "RiskEvidenceSynthesis_RiskEstimate", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRiskEvidenceSynthesis_RiskEstimate
    implements RiskEvidenceSynthesis_RiskEstimate {
  private final @Nullable String id;
  private final @Nullable String description;
  private final @Nullable CodeableConcept unitOfMeasure;
  private final @Nullable List<RiskEvidenceSynthesis_PrecisionEstimate> precisionEstimate;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Decimal value;
  private final @Nullable Integer denominatorCount;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept type;
  private final @Nullable Integer numeratorCount;

  private ImmutableRiskEvidenceSynthesis_RiskEstimate(
      @Nullable String id,
      @Nullable String description,
      @Nullable CodeableConcept unitOfMeasure,
      @Nullable List<RiskEvidenceSynthesis_PrecisionEstimate> precisionEstimate,
      @Nullable List<Extension> modifierExtension,
      @Nullable Decimal value,
      @Nullable Integer denominatorCount,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept type,
      @Nullable Integer numeratorCount) {
    this.id = id;
    this.description = description;
    this.unitOfMeasure = unitOfMeasure;
    this.precisionEstimate = precisionEstimate;
    this.modifierExtension = modifierExtension;
    this.value = value;
    this.denominatorCount = denominatorCount;
    this.extension = extension;
    this.type = type;
    this.numeratorCount = numeratorCount;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code unitOfMeasure} attribute
   */
  @JsonProperty("unitOfMeasure")
  @Override
  public Optional<CodeableConcept> unitOfMeasure() {
    return Optional.ofNullable(unitOfMeasure);
  }

  /**
   * @return The value of the {@code precisionEstimate} attribute
   */
  @JsonProperty("precisionEstimate")
  @Override
  public Optional<List<RiskEvidenceSynthesis_PrecisionEstimate>> precisionEstimate() {
    return Optional.ofNullable(precisionEstimate);
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
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<Decimal> value() {
    return Optional.ofNullable(value);
  }

  /**
   * @return The value of the {@code denominatorCount} attribute
   */
  @JsonProperty("denominatorCount")
  @Override
  public Optional<Integer> denominatorCount() {
    return Optional.ofNullable(denominatorCount);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code numeratorCount} attribute
   */
  @JsonProperty("numeratorCount")
  @Override
  public Optional<Integer> numeratorCount() {
    return Optional.ofNullable(numeratorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        newValue,
        this.description,
        this.unitOfMeasure,
        this.precisionEstimate,
        this.modifierExtension,
        this.value,
        this.denominatorCount,
        this.extension,
        this.type,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        value,
        this.description,
        this.unitOfMeasure,
        this.precisionEstimate,
        this.modifierExtension,
        this.value,
        this.denominatorCount,
        this.extension,
        this.type,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        newValue,
        this.unitOfMeasure,
        this.precisionEstimate,
        this.modifierExtension,
        this.value,
        this.denominatorCount,
        this.extension,
        this.type,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        value,
        this.unitOfMeasure,
        this.precisionEstimate,
        this.modifierExtension,
        this.value,
        this.denominatorCount,
        this.extension,
        this.type,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#unitOfMeasure() unitOfMeasure} attribute.
   * @param value The value for unitOfMeasure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withUnitOfMeasure(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "unitOfMeasure");
    if (this.unitOfMeasure == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        this.description,
        newValue,
        this.precisionEstimate,
        this.modifierExtension,
        this.value,
        this.denominatorCount,
        this.extension,
        this.type,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#unitOfMeasure() unitOfMeasure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitOfMeasure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withUnitOfMeasure(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.unitOfMeasure == value) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        this.description,
        value,
        this.precisionEstimate,
        this.modifierExtension,
        this.value,
        this.denominatorCount,
        this.extension,
        this.type,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#precisionEstimate() precisionEstimate} attribute.
   * @param value The value for precisionEstimate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withPrecisionEstimate(List<RiskEvidenceSynthesis_PrecisionEstimate> value) {
    @Nullable List<RiskEvidenceSynthesis_PrecisionEstimate> newValue = Objects.requireNonNull(value, "precisionEstimate");
    if (this.precisionEstimate == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        this.description,
        this.unitOfMeasure,
        newValue,
        this.modifierExtension,
        this.value,
        this.denominatorCount,
        this.extension,
        this.type,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#precisionEstimate() precisionEstimate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for precisionEstimate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withPrecisionEstimate(Optional<? extends List<RiskEvidenceSynthesis_PrecisionEstimate>> optional) {
    @Nullable List<RiskEvidenceSynthesis_PrecisionEstimate> value = optional.orElse(null);
    if (this.precisionEstimate == value) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        this.description,
        this.unitOfMeasure,
        value,
        this.modifierExtension,
        this.value,
        this.denominatorCount,
        this.extension,
        this.type,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        this.description,
        this.unitOfMeasure,
        this.precisionEstimate,
        newValue,
        this.value,
        this.denominatorCount,
        this.extension,
        this.type,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        this.description,
        this.unitOfMeasure,
        this.precisionEstimate,
        value,
        this.value,
        this.denominatorCount,
        this.extension,
        this.type,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withValue(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        this.description,
        this.unitOfMeasure,
        this.precisionEstimate,
        this.modifierExtension,
        newValue,
        this.denominatorCount,
        this.extension,
        this.type,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withValue(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        this.description,
        this.unitOfMeasure,
        this.precisionEstimate,
        this.modifierExtension,
        value,
        this.denominatorCount,
        this.extension,
        this.type,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#denominatorCount() denominatorCount} attribute.
   * @param value The value for denominatorCount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withDenominatorCount(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.denominatorCount, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        this.description,
        this.unitOfMeasure,
        this.precisionEstimate,
        this.modifierExtension,
        this.value,
        newValue,
        this.extension,
        this.type,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#denominatorCount() denominatorCount} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for denominatorCount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withDenominatorCount(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.denominatorCount, value)) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        this.description,
        this.unitOfMeasure,
        this.precisionEstimate,
        this.modifierExtension,
        this.value,
        value,
        this.extension,
        this.type,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        this.description,
        this.unitOfMeasure,
        this.precisionEstimate,
        this.modifierExtension,
        this.value,
        this.denominatorCount,
        newValue,
        this.type,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        this.description,
        this.unitOfMeasure,
        this.precisionEstimate,
        this.modifierExtension,
        this.value,
        this.denominatorCount,
        value,
        this.type,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        this.description,
        this.unitOfMeasure,
        this.precisionEstimate,
        this.modifierExtension,
        this.value,
        this.denominatorCount,
        this.extension,
        newValue,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        this.description,
        this.unitOfMeasure,
        this.precisionEstimate,
        this.modifierExtension,
        this.value,
        this.denominatorCount,
        this.extension,
        value,
        this.numeratorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#numeratorCount() numeratorCount} attribute.
   * @param value The value for numeratorCount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withNumeratorCount(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.numeratorCount, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        this.description,
        this.unitOfMeasure,
        this.precisionEstimate,
        this.modifierExtension,
        this.value,
        this.denominatorCount,
        this.extension,
        this.type,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#numeratorCount() numeratorCount} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numeratorCount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withNumeratorCount(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.numeratorCount, value)) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.id,
        this.description,
        this.unitOfMeasure,
        this.precisionEstimate,
        this.modifierExtension,
        this.value,
        this.denominatorCount,
        this.extension,
        this.type,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRiskEvidenceSynthesis_RiskEstimate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRiskEvidenceSynthesis_RiskEstimate
        && equalTo((ImmutableRiskEvidenceSynthesis_RiskEstimate) another);
  }

  private boolean equalTo(ImmutableRiskEvidenceSynthesis_RiskEstimate another) {
    return Objects.equals(id, another.id)
        && Objects.equals(description, another.description)
        && Objects.equals(unitOfMeasure, another.unitOfMeasure)
        && Objects.equals(precisionEstimate, another.precisionEstimate)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(value, another.value)
        && Objects.equals(denominatorCount, another.denominatorCount)
        && Objects.equals(extension, another.extension)
        && Objects.equals(type, another.type)
        && Objects.equals(numeratorCount, another.numeratorCount);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code description}, {@code unitOfMeasure}, {@code precisionEstimate}, {@code modifierExtension}, {@code value}, {@code denominatorCount}, {@code extension}, {@code type}, {@code numeratorCount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(unitOfMeasure);
    h += (h << 5) + Objects.hashCode(precisionEstimate);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(denominatorCount);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(numeratorCount);
    return h;
  }

  /**
   * Prints the immutable value {@code RiskEvidenceSynthesis_RiskEstimate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("RiskEvidenceSynthesis_RiskEstimate{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (description != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (unitOfMeasure != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("unitOfMeasure=").append(unitOfMeasure);
    }
    if (precisionEstimate != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("precisionEstimate=").append(precisionEstimate);
    }
    if (modifierExtension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (value != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (denominatorCount != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("denominatorCount=").append(denominatorCount);
    }
    if (extension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (type != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (numeratorCount != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("numeratorCount=").append(numeratorCount);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "RiskEvidenceSynthesis_RiskEstimate", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RiskEvidenceSynthesis_RiskEstimate {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<CodeableConcept> unitOfMeasure = Optional.empty();
    boolean unitOfMeasureIsSet;
    @Nullable Optional<List<RiskEvidenceSynthesis_PrecisionEstimate>> precisionEstimate = Optional.empty();
    boolean precisionEstimateIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Decimal> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<Integer> denominatorCount = Optional.empty();
    boolean denominatorCountIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Integer> numeratorCount = Optional.empty();
    boolean numeratorCountIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(Optional<CodeableConcept> unitOfMeasure) {
      this.unitOfMeasure = unitOfMeasure;
      this.unitOfMeasureIsSet = true;
    }
    @JsonProperty("precisionEstimate")
    public void setPrecisionEstimate(Optional<List<RiskEvidenceSynthesis_PrecisionEstimate>> precisionEstimate) {
      this.precisionEstimate = precisionEstimate;
      this.precisionEstimateIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<Decimal> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("denominatorCount")
    public void setDenominatorCount(Optional<Integer> denominatorCount) {
      this.denominatorCount = denominatorCount;
      this.denominatorCountIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("numeratorCount")
    public void setNumeratorCount(Optional<Integer> numeratorCount) {
      this.numeratorCount = numeratorCount;
      this.numeratorCountIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> unitOfMeasure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RiskEvidenceSynthesis_PrecisionEstimate>> precisionEstimate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> denominatorCount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> numeratorCount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRiskEvidenceSynthesis_RiskEstimate fromJson(Json json) {
    ImmutableRiskEvidenceSynthesis_RiskEstimate.Builder builder = ImmutableRiskEvidenceSynthesis_RiskEstimate.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.unitOfMeasureIsSet) {
      builder.unitOfMeasure(json.unitOfMeasure);
    }
    if (json.precisionEstimateIsSet) {
      builder.precisionEstimate(json.precisionEstimate);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.denominatorCountIsSet) {
      builder.denominatorCount(json.denominatorCount);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.numeratorCountIsSet) {
      builder.numeratorCount(json.numeratorCount);
    }
    return (ImmutableRiskEvidenceSynthesis_RiskEstimate) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RiskEvidenceSynthesis_RiskEstimate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RiskEvidenceSynthesis_RiskEstimate instance
   */
  public static RiskEvidenceSynthesis_RiskEstimate copyOf(RiskEvidenceSynthesis_RiskEstimate instance) {
    if (instance instanceof ImmutableRiskEvidenceSynthesis_RiskEstimate) {
      return (ImmutableRiskEvidenceSynthesis_RiskEstimate) instance;
    }
    return ImmutableRiskEvidenceSynthesis_RiskEstimate.builder()
        .id(instance.id())
        .description(instance.description())
        .unitOfMeasure(instance.unitOfMeasure())
        .precisionEstimate(instance.precisionEstimate())
        .modifierExtension(instance.modifierExtension())
        .value(instance.value())
        .denominatorCount(instance.denominatorCount())
        .extension(instance.extension())
        .type(instance.type())
        .numeratorCount(instance.numeratorCount())
        .build();
  }

  /**
   * Creates a builder for {@link RiskEvidenceSynthesis_RiskEstimate RiskEvidenceSynthesis_RiskEstimate}.
   * <pre>
   * ImmutableRiskEvidenceSynthesis_RiskEstimate.builder()
   *    .id(String) // optional {@link RiskEvidenceSynthesis_RiskEstimate#id() id}
   *    .description(String) // optional {@link RiskEvidenceSynthesis_RiskEstimate#description() description}
   *    .unitOfMeasure(com.fhir.types.fhir.CodeableConcept) // optional {@link RiskEvidenceSynthesis_RiskEstimate#unitOfMeasure() unitOfMeasure}
   *    .precisionEstimate(List&amp;lt;com.fhir.types.fhir.RiskEvidenceSynthesis_PrecisionEstimate&amp;gt;) // optional {@link RiskEvidenceSynthesis_RiskEstimate#precisionEstimate() precisionEstimate}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link RiskEvidenceSynthesis_RiskEstimate#modifierExtension() modifierExtension}
   *    .value(com.fhir.types.fhir.Decimal) // optional {@link RiskEvidenceSynthesis_RiskEstimate#value() value}
   *    .denominatorCount(Integer) // optional {@link RiskEvidenceSynthesis_RiskEstimate#denominatorCount() denominatorCount}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link RiskEvidenceSynthesis_RiskEstimate#extension() extension}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link RiskEvidenceSynthesis_RiskEstimate#type() type}
   *    .numeratorCount(Integer) // optional {@link RiskEvidenceSynthesis_RiskEstimate#numeratorCount() numeratorCount}
   *    .build();
   * </pre>
   * @return A new RiskEvidenceSynthesis_RiskEstimate builder
   */
  public static ImmutableRiskEvidenceSynthesis_RiskEstimate.Builder builder() {
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate.Builder();
  }

  /**
   * Builds instances of type {@link RiskEvidenceSynthesis_RiskEstimate RiskEvidenceSynthesis_RiskEstimate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "RiskEvidenceSynthesis_RiskEstimate", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_DESCRIPTION = 0x2L;
    private static final long OPT_BIT_UNIT_OF_MEASURE = 0x4L;
    private static final long OPT_BIT_PRECISION_ESTIMATE = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_VALUE = 0x20L;
    private static final long OPT_BIT_DENOMINATOR_COUNT = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_TYPE = 0x100L;
    private static final long OPT_BIT_NUMERATOR_COUNT = 0x200L;
    private long optBits;

    private @Nullable String id;
    private @Nullable String description;
    private @Nullable CodeableConcept unitOfMeasure;
    private @Nullable List<RiskEvidenceSynthesis_PrecisionEstimate> precisionEstimate;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Decimal value;
    private @Nullable Integer denominatorCount;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept type;
    private @Nullable Integer numeratorCount;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#id() id} to id.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#id() id} to id.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#description() description} to description.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#description() description} to description.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#unitOfMeasure() unitOfMeasure} to unitOfMeasure.
     * @param unitOfMeasure The value for unitOfMeasure
     * @return {@code this} builder for chained invocation
     */
    public final Builder unitOfMeasure(CodeableConcept unitOfMeasure) {
      checkNotIsSet(unitOfMeasureIsSet(), "unitOfMeasure");
      this.unitOfMeasure = Objects.requireNonNull(unitOfMeasure, "unitOfMeasure");
      optBits |= OPT_BIT_UNIT_OF_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#unitOfMeasure() unitOfMeasure} to unitOfMeasure.
     * @param unitOfMeasure The value for unitOfMeasure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("unitOfMeasure")
    public final Builder unitOfMeasure(Optional<? extends CodeableConcept> unitOfMeasure) {
      checkNotIsSet(unitOfMeasureIsSet(), "unitOfMeasure");
      this.unitOfMeasure = unitOfMeasure.orElse(null);
      optBits |= OPT_BIT_UNIT_OF_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#precisionEstimate() precisionEstimate} to precisionEstimate.
     * @param precisionEstimate The value for precisionEstimate
     * @return {@code this} builder for chained invocation
     */
    public final Builder precisionEstimate(List<RiskEvidenceSynthesis_PrecisionEstimate> precisionEstimate) {
      checkNotIsSet(precisionEstimateIsSet(), "precisionEstimate");
      this.precisionEstimate = Objects.requireNonNull(precisionEstimate, "precisionEstimate");
      optBits |= OPT_BIT_PRECISION_ESTIMATE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#precisionEstimate() precisionEstimate} to precisionEstimate.
     * @param precisionEstimate The value for precisionEstimate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("precisionEstimate")
    public final Builder precisionEstimate(Optional<? extends List<RiskEvidenceSynthesis_PrecisionEstimate>> precisionEstimate) {
      checkNotIsSet(precisionEstimateIsSet(), "precisionEstimate");
      this.precisionEstimate = precisionEstimate.orElse(null);
      optBits |= OPT_BIT_PRECISION_ESTIMATE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(Decimal value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<? extends Decimal> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#denominatorCount() denominatorCount} to denominatorCount.
     * @param denominatorCount The value for denominatorCount
     * @return {@code this} builder for chained invocation
     */
    public final Builder denominatorCount(int denominatorCount) {
      checkNotIsSet(denominatorCountIsSet(), "denominatorCount");
      this.denominatorCount = denominatorCount;
      optBits |= OPT_BIT_DENOMINATOR_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#denominatorCount() denominatorCount} to denominatorCount.
     * @param denominatorCount The value for denominatorCount
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("denominatorCount")
    public final Builder denominatorCount(Optional<Integer> denominatorCount) {
      checkNotIsSet(denominatorCountIsSet(), "denominatorCount");
      this.denominatorCount = denominatorCount.orElse(null);
      optBits |= OPT_BIT_DENOMINATOR_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#type() type} to type.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#type() type} to type.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#numeratorCount() numeratorCount} to numeratorCount.
     * @param numeratorCount The value for numeratorCount
     * @return {@code this} builder for chained invocation
     */
    public final Builder numeratorCount(int numeratorCount) {
      checkNotIsSet(numeratorCountIsSet(), "numeratorCount");
      this.numeratorCount = numeratorCount;
      optBits |= OPT_BIT_NUMERATOR_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#numeratorCount() numeratorCount} to numeratorCount.
     * @param numeratorCount The value for numeratorCount
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("numeratorCount")
    public final Builder numeratorCount(Optional<Integer> numeratorCount) {
      checkNotIsSet(numeratorCountIsSet(), "numeratorCount");
      this.numeratorCount = numeratorCount.orElse(null);
      optBits |= OPT_BIT_NUMERATOR_COUNT;
      return this;
    }

    /**
     * Builds a new {@link RiskEvidenceSynthesis_RiskEstimate RiskEvidenceSynthesis_RiskEstimate}.
     * @return An immutable instance of RiskEvidenceSynthesis_RiskEstimate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public RiskEvidenceSynthesis_RiskEstimate build() {
      return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
          id,
          description,
          unitOfMeasure,
          precisionEstimate,
          modifierExtension,
          value,
          denominatorCount,
          extension,
          type,
          numeratorCount);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean unitOfMeasureIsSet() {
      return (optBits & OPT_BIT_UNIT_OF_MEASURE) != 0;
    }

    private boolean precisionEstimateIsSet() {
      return (optBits & OPT_BIT_PRECISION_ESTIMATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean denominatorCountIsSet() {
      return (optBits & OPT_BIT_DENOMINATOR_COUNT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean numeratorCountIsSet() {
      return (optBits & OPT_BIT_NUMERATOR_COUNT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of RiskEvidenceSynthesis_RiskEstimate is strict, attribute is already set: ".concat(name));
    }
  }
}
