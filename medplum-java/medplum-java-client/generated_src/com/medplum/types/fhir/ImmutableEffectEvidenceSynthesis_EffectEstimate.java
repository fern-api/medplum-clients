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
 * Immutable implementation of {@link EffectEvidenceSynthesis_EffectEstimate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEffectEvidenceSynthesis_EffectEstimate.builder()}.
 */
@Generated(from = "EffectEvidenceSynthesis_EffectEstimate", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEffectEvidenceSynthesis_EffectEstimate
    implements EffectEvidenceSynthesis_EffectEstimate {
  private final @Nullable Decimal value;
  private final @Nullable CodeableConcept type;
  private final @Nullable String id;
  private final @Nullable CodeableConcept unitOfMeasure;
  private final @Nullable CodeableConcept variantState;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<EffectEvidenceSynthesis_PrecisionEstimate> precisionEstimate;
  private final @Nullable List<Extension> extension;
  private final @Nullable String description;

  private ImmutableEffectEvidenceSynthesis_EffectEstimate(
      @Nullable Decimal value,
      @Nullable CodeableConcept type,
      @Nullable String id,
      @Nullable CodeableConcept unitOfMeasure,
      @Nullable CodeableConcept variantState,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<EffectEvidenceSynthesis_PrecisionEstimate> precisionEstimate,
      @Nullable List<Extension> extension,
      @Nullable String description) {
    this.value = value;
    this.type = type;
    this.id = id;
    this.unitOfMeasure = unitOfMeasure;
    this.variantState = variantState;
    this.modifierExtension = modifierExtension;
    this.precisionEstimate = precisionEstimate;
    this.extension = extension;
    this.description = description;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code unitOfMeasure} attribute
   */
  @JsonProperty("unitOfMeasure")
  @Override
  public Optional<CodeableConcept> unitOfMeasure() {
    return Optional.ofNullable(unitOfMeasure);
  }

  /**
   * @return The value of the {@code variantState} attribute
   */
  @JsonProperty("variantState")
  @Override
  public Optional<CodeableConcept> variantState() {
    return Optional.ofNullable(variantState);
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
   * @return The value of the {@code precisionEstimate} attribute
   */
  @JsonProperty("precisionEstimate")
  @Override
  public Optional<List<EffectEvidenceSynthesis_PrecisionEstimate>> precisionEstimate() {
    return Optional.ofNullable(precisionEstimate);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_EffectEstimate#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withValue(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        newValue,
        this.type,
        this.id,
        this.unitOfMeasure,
        this.variantState,
        this.modifierExtension,
        this.precisionEstimate,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_EffectEstimate#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withValue(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        value,
        this.type,
        this.id,
        this.unitOfMeasure,
        this.variantState,
        this.modifierExtension,
        this.precisionEstimate,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_EffectEstimate#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        this.value,
        newValue,
        this.id,
        this.unitOfMeasure,
        this.variantState,
        this.modifierExtension,
        this.precisionEstimate,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_EffectEstimate#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        this.value,
        value,
        this.id,
        this.unitOfMeasure,
        this.variantState,
        this.modifierExtension,
        this.precisionEstimate,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_EffectEstimate#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        this.value,
        this.type,
        newValue,
        this.unitOfMeasure,
        this.variantState,
        this.modifierExtension,
        this.precisionEstimate,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_EffectEstimate#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        this.value,
        this.type,
        value,
        this.unitOfMeasure,
        this.variantState,
        this.modifierExtension,
        this.precisionEstimate,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_EffectEstimate#unitOfMeasure() unitOfMeasure} attribute.
   * @param value The value for unitOfMeasure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withUnitOfMeasure(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "unitOfMeasure");
    if (this.unitOfMeasure == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        this.value,
        this.type,
        this.id,
        newValue,
        this.variantState,
        this.modifierExtension,
        this.precisionEstimate,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_EffectEstimate#unitOfMeasure() unitOfMeasure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitOfMeasure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withUnitOfMeasure(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.unitOfMeasure == value) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        this.value,
        this.type,
        this.id,
        value,
        this.variantState,
        this.modifierExtension,
        this.precisionEstimate,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_EffectEstimate#variantState() variantState} attribute.
   * @param value The value for variantState
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withVariantState(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "variantState");
    if (this.variantState == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        this.value,
        this.type,
        this.id,
        this.unitOfMeasure,
        newValue,
        this.modifierExtension,
        this.precisionEstimate,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_EffectEstimate#variantState() variantState} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for variantState
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withVariantState(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.variantState == value) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        this.value,
        this.type,
        this.id,
        this.unitOfMeasure,
        value,
        this.modifierExtension,
        this.precisionEstimate,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_EffectEstimate#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        this.value,
        this.type,
        this.id,
        this.unitOfMeasure,
        this.variantState,
        newValue,
        this.precisionEstimate,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_EffectEstimate#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        this.value,
        this.type,
        this.id,
        this.unitOfMeasure,
        this.variantState,
        value,
        this.precisionEstimate,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_EffectEstimate#precisionEstimate() precisionEstimate} attribute.
   * @param value The value for precisionEstimate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withPrecisionEstimate(List<EffectEvidenceSynthesis_PrecisionEstimate> value) {
    @Nullable List<EffectEvidenceSynthesis_PrecisionEstimate> newValue = Objects.requireNonNull(value, "precisionEstimate");
    if (this.precisionEstimate == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        this.value,
        this.type,
        this.id,
        this.unitOfMeasure,
        this.variantState,
        this.modifierExtension,
        newValue,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_EffectEstimate#precisionEstimate() precisionEstimate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for precisionEstimate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withPrecisionEstimate(Optional<? extends List<EffectEvidenceSynthesis_PrecisionEstimate>> optional) {
    @Nullable List<EffectEvidenceSynthesis_PrecisionEstimate> value = optional.orElse(null);
    if (this.precisionEstimate == value) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        this.value,
        this.type,
        this.id,
        this.unitOfMeasure,
        this.variantState,
        this.modifierExtension,
        value,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_EffectEstimate#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        this.value,
        this.type,
        this.id,
        this.unitOfMeasure,
        this.variantState,
        this.modifierExtension,
        this.precisionEstimate,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_EffectEstimate#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        this.value,
        this.type,
        this.id,
        this.unitOfMeasure,
        this.variantState,
        this.modifierExtension,
        this.precisionEstimate,
        value,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_EffectEstimate#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        this.value,
        this.type,
        this.id,
        this.unitOfMeasure,
        this.variantState,
        this.modifierExtension,
        this.precisionEstimate,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_EffectEstimate#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_EffectEstimate withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
        this.value,
        this.type,
        this.id,
        this.unitOfMeasure,
        this.variantState,
        this.modifierExtension,
        this.precisionEstimate,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEffectEvidenceSynthesis_EffectEstimate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEffectEvidenceSynthesis_EffectEstimate
        && equalTo((ImmutableEffectEvidenceSynthesis_EffectEstimate) another);
  }

  private boolean equalTo(ImmutableEffectEvidenceSynthesis_EffectEstimate another) {
    return Objects.equals(value, another.value)
        && Objects.equals(type, another.type)
        && Objects.equals(id, another.id)
        && Objects.equals(unitOfMeasure, another.unitOfMeasure)
        && Objects.equals(variantState, another.variantState)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(precisionEstimate, another.precisionEstimate)
        && Objects.equals(extension, another.extension)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code value}, {@code type}, {@code id}, {@code unitOfMeasure}, {@code variantState}, {@code modifierExtension}, {@code precisionEstimate}, {@code extension}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(unitOfMeasure);
    h += (h << 5) + Objects.hashCode(variantState);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(precisionEstimate);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code EffectEvidenceSynthesis_EffectEstimate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EffectEvidenceSynthesis_EffectEstimate{");
    if (value != null) {
      builder.append("value=").append(value);
    }
    if (type != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (id != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (unitOfMeasure != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("unitOfMeasure=").append(unitOfMeasure);
    }
    if (variantState != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("variantState=").append(variantState);
    }
    if (modifierExtension != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (precisionEstimate != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("precisionEstimate=").append(precisionEstimate);
    }
    if (extension != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (description != null) {
      if (builder.length() > 39) builder.append(", ");
      builder.append("description=").append(description);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "EffectEvidenceSynthesis_EffectEstimate", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements EffectEvidenceSynthesis_EffectEstimate {
    @Nullable Optional<Decimal> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> unitOfMeasure = Optional.empty();
    boolean unitOfMeasureIsSet;
    @Nullable Optional<CodeableConcept> variantState = Optional.empty();
    boolean variantStateIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<EffectEvidenceSynthesis_PrecisionEstimate>> precisionEstimate = Optional.empty();
    boolean precisionEstimateIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @JsonProperty("value")
    public void setValue(Optional<Decimal> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(Optional<CodeableConcept> unitOfMeasure) {
      this.unitOfMeasure = unitOfMeasure;
      this.unitOfMeasureIsSet = true;
    }
    @JsonProperty("variantState")
    public void setVariantState(Optional<CodeableConcept> variantState) {
      this.variantState = variantState;
      this.variantStateIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("precisionEstimate")
    public void setPrecisionEstimate(Optional<List<EffectEvidenceSynthesis_PrecisionEstimate>> precisionEstimate) {
      this.precisionEstimate = precisionEstimate;
      this.precisionEstimateIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @Override
    public Optional<Decimal> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> unitOfMeasure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> variantState() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<EffectEvidenceSynthesis_PrecisionEstimate>> precisionEstimate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEffectEvidenceSynthesis_EffectEstimate fromJson(Json json) {
    ImmutableEffectEvidenceSynthesis_EffectEstimate.Builder builder = ImmutableEffectEvidenceSynthesis_EffectEstimate.builder();
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.unitOfMeasureIsSet) {
      builder.unitOfMeasure(json.unitOfMeasure);
    }
    if (json.variantStateIsSet) {
      builder.variantState(json.variantState);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.precisionEstimateIsSet) {
      builder.precisionEstimate(json.precisionEstimate);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    return (ImmutableEffectEvidenceSynthesis_EffectEstimate) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EffectEvidenceSynthesis_EffectEstimate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EffectEvidenceSynthesis_EffectEstimate instance
   */
  public static EffectEvidenceSynthesis_EffectEstimate copyOf(EffectEvidenceSynthesis_EffectEstimate instance) {
    if (instance instanceof ImmutableEffectEvidenceSynthesis_EffectEstimate) {
      return (ImmutableEffectEvidenceSynthesis_EffectEstimate) instance;
    }
    return ImmutableEffectEvidenceSynthesis_EffectEstimate.builder()
        .value(instance.value())
        .type(instance.type())
        .id(instance.id())
        .unitOfMeasure(instance.unitOfMeasure())
        .variantState(instance.variantState())
        .modifierExtension(instance.modifierExtension())
        .precisionEstimate(instance.precisionEstimate())
        .extension(instance.extension())
        .description(instance.description())
        .build();
  }

  /**
   * Creates a builder for {@link EffectEvidenceSynthesis_EffectEstimate EffectEvidenceSynthesis_EffectEstimate}.
   * <pre>
   * ImmutableEffectEvidenceSynthesis_EffectEstimate.builder()
   *    .value(com.medplum.types.fhir.Decimal) // optional {@link EffectEvidenceSynthesis_EffectEstimate#value() value}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link EffectEvidenceSynthesis_EffectEstimate#type() type}
   *    .id(String) // optional {@link EffectEvidenceSynthesis_EffectEstimate#id() id}
   *    .unitOfMeasure(com.medplum.types.fhir.CodeableConcept) // optional {@link EffectEvidenceSynthesis_EffectEstimate#unitOfMeasure() unitOfMeasure}
   *    .variantState(com.medplum.types.fhir.CodeableConcept) // optional {@link EffectEvidenceSynthesis_EffectEstimate#variantState() variantState}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link EffectEvidenceSynthesis_EffectEstimate#modifierExtension() modifierExtension}
   *    .precisionEstimate(List&amp;lt;com.medplum.types.fhir.EffectEvidenceSynthesis_PrecisionEstimate&amp;gt;) // optional {@link EffectEvidenceSynthesis_EffectEstimate#precisionEstimate() precisionEstimate}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link EffectEvidenceSynthesis_EffectEstimate#extension() extension}
   *    .description(String) // optional {@link EffectEvidenceSynthesis_EffectEstimate#description() description}
   *    .build();
   * </pre>
   * @return A new EffectEvidenceSynthesis_EffectEstimate builder
   */
  public static ImmutableEffectEvidenceSynthesis_EffectEstimate.Builder builder() {
    return new ImmutableEffectEvidenceSynthesis_EffectEstimate.Builder();
  }

  /**
   * Builds instances of type {@link EffectEvidenceSynthesis_EffectEstimate EffectEvidenceSynthesis_EffectEstimate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "EffectEvidenceSynthesis_EffectEstimate", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_VALUE = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_UNIT_OF_MEASURE = 0x8L;
    private static final long OPT_BIT_VARIANT_STATE = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_PRECISION_ESTIMATE = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_DESCRIPTION = 0x100L;
    private long optBits;

    private @Nullable Decimal value;
    private @Nullable CodeableConcept type;
    private @Nullable String id;
    private @Nullable CodeableConcept unitOfMeasure;
    private @Nullable CodeableConcept variantState;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<EffectEvidenceSynthesis_PrecisionEstimate> precisionEstimate;
    private @Nullable List<Extension> extension;
    private @Nullable String description;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#value() value} to value.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#value() value} to value.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#type() type} to type.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#type() type} to type.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#id() id} to id.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#id() id} to id.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#unitOfMeasure() unitOfMeasure} to unitOfMeasure.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#unitOfMeasure() unitOfMeasure} to unitOfMeasure.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#variantState() variantState} to variantState.
     * @param variantState The value for variantState
     * @return {@code this} builder for chained invocation
     */
    public final Builder variantState(CodeableConcept variantState) {
      checkNotIsSet(variantStateIsSet(), "variantState");
      this.variantState = Objects.requireNonNull(variantState, "variantState");
      optBits |= OPT_BIT_VARIANT_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#variantState() variantState} to variantState.
     * @param variantState The value for variantState
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("variantState")
    public final Builder variantState(Optional<? extends CodeableConcept> variantState) {
      checkNotIsSet(variantStateIsSet(), "variantState");
      this.variantState = variantState.orElse(null);
      optBits |= OPT_BIT_VARIANT_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#precisionEstimate() precisionEstimate} to precisionEstimate.
     * @param precisionEstimate The value for precisionEstimate
     * @return {@code this} builder for chained invocation
     */
    public final Builder precisionEstimate(List<EffectEvidenceSynthesis_PrecisionEstimate> precisionEstimate) {
      checkNotIsSet(precisionEstimateIsSet(), "precisionEstimate");
      this.precisionEstimate = Objects.requireNonNull(precisionEstimate, "precisionEstimate");
      optBits |= OPT_BIT_PRECISION_ESTIMATE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#precisionEstimate() precisionEstimate} to precisionEstimate.
     * @param precisionEstimate The value for precisionEstimate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("precisionEstimate")
    public final Builder precisionEstimate(Optional<? extends List<EffectEvidenceSynthesis_PrecisionEstimate>> precisionEstimate) {
      checkNotIsSet(precisionEstimateIsSet(), "precisionEstimate");
      this.precisionEstimate = precisionEstimate.orElse(null);
      optBits |= OPT_BIT_PRECISION_ESTIMATE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#extension() extension} to extension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#extension() extension} to extension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#description() description} to description.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_EffectEstimate#description() description} to description.
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
     * Builds a new {@link EffectEvidenceSynthesis_EffectEstimate EffectEvidenceSynthesis_EffectEstimate}.
     * @return An immutable instance of EffectEvidenceSynthesis_EffectEstimate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public EffectEvidenceSynthesis_EffectEstimate build() {
      return new ImmutableEffectEvidenceSynthesis_EffectEstimate(
          value,
          type,
          id,
          unitOfMeasure,
          variantState,
          modifierExtension,
          precisionEstimate,
          extension,
          description);
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean unitOfMeasureIsSet() {
      return (optBits & OPT_BIT_UNIT_OF_MEASURE) != 0;
    }

    private boolean variantStateIsSet() {
      return (optBits & OPT_BIT_VARIANT_STATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean precisionEstimateIsSet() {
      return (optBits & OPT_BIT_PRECISION_ESTIMATE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of EffectEvidenceSynthesis_EffectEstimate is strict, attribute is already set: ".concat(name));
    }
  }
}
