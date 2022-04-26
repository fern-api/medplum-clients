package com.fhir.types.fhir;

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
 * Immutable implementation of {@link MedicinalProductIngredient_Strength}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductIngredient_Strength.builder()}.
 */
@Generated(from = "MedicinalProductIngredient_Strength", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductIngredient_Strength
    implements MedicinalProductIngredient_Strength {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable Ratio presentationLowLimit;
  private final @Nullable List<CodeableConcept> country;
  private final @Nullable Ratio concentrationLowLimit;
  private final @Nullable List<MedicinalProductIngredient_ReferenceStrength> referenceStrength;
  private final Ratio presentation;
  private final @Nullable Ratio concentration;
  private final @Nullable String id;
  private final @Nullable String measurementPoint;

  private ImmutableMedicinalProductIngredient_Strength(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable Ratio presentationLowLimit,
      @Nullable List<CodeableConcept> country,
      @Nullable Ratio concentrationLowLimit,
      @Nullable List<MedicinalProductIngredient_ReferenceStrength> referenceStrength,
      Ratio presentation,
      @Nullable Ratio concentration,
      @Nullable String id,
      @Nullable String measurementPoint) {
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.presentationLowLimit = presentationLowLimit;
    this.country = country;
    this.concentrationLowLimit = concentrationLowLimit;
    this.referenceStrength = referenceStrength;
    this.presentation = presentation;
    this.concentration = concentration;
    this.id = id;
    this.measurementPoint = measurementPoint;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code presentationLowLimit} attribute
   */
  @JsonProperty("presentationLowLimit")
  @Override
  public Optional<Ratio> presentationLowLimit() {
    return Optional.ofNullable(presentationLowLimit);
  }

  /**
   * @return The value of the {@code country} attribute
   */
  @JsonProperty("country")
  @Override
  public Optional<List<CodeableConcept>> country() {
    return Optional.ofNullable(country);
  }

  /**
   * @return The value of the {@code concentrationLowLimit} attribute
   */
  @JsonProperty("concentrationLowLimit")
  @Override
  public Optional<Ratio> concentrationLowLimit() {
    return Optional.ofNullable(concentrationLowLimit);
  }

  /**
   * @return The value of the {@code referenceStrength} attribute
   */
  @JsonProperty("referenceStrength")
  @Override
  public Optional<List<MedicinalProductIngredient_ReferenceStrength>> referenceStrength() {
    return Optional.ofNullable(referenceStrength);
  }

  /**
   * @return The value of the {@code presentation} attribute
   */
  @JsonProperty("presentation")
  @Override
  public Ratio presentation() {
    return presentation;
  }

  /**
   * @return The value of the {@code concentration} attribute
   */
  @JsonProperty("concentration")
  @Override
  public Optional<Ratio> concentration() {
    return Optional.ofNullable(concentration);
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
   * @return The value of the {@code measurementPoint} attribute
   */
  @JsonProperty("measurementPoint")
  @Override
  public Optional<String> measurementPoint() {
    return Optional.ofNullable(measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_Strength#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_Strength withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        newValue,
        this.extension,
        this.presentationLowLimit,
        this.country,
        this.concentrationLowLimit,
        this.referenceStrength,
        this.presentation,
        this.concentration,
        this.id,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_Strength#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient_Strength withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        value,
        this.extension,
        this.presentationLowLimit,
        this.country,
        this.concentrationLowLimit,
        this.referenceStrength,
        this.presentation,
        this.concentration,
        this.id,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_Strength#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_Strength withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        newValue,
        this.presentationLowLimit,
        this.country,
        this.concentrationLowLimit,
        this.referenceStrength,
        this.presentation,
        this.concentration,
        this.id,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_Strength#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient_Strength withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        value,
        this.presentationLowLimit,
        this.country,
        this.concentrationLowLimit,
        this.referenceStrength,
        this.presentation,
        this.concentration,
        this.id,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_Strength#presentationLowLimit() presentationLowLimit} attribute.
   * @param value The value for presentationLowLimit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_Strength withPresentationLowLimit(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "presentationLowLimit");
    if (this.presentationLowLimit == newValue) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        this.extension,
        newValue,
        this.country,
        this.concentrationLowLimit,
        this.referenceStrength,
        this.presentation,
        this.concentration,
        this.id,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_Strength#presentationLowLimit() presentationLowLimit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for presentationLowLimit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient_Strength withPresentationLowLimit(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.presentationLowLimit == value) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        this.extension,
        value,
        this.country,
        this.concentrationLowLimit,
        this.referenceStrength,
        this.presentation,
        this.concentration,
        this.id,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_Strength#country() country} attribute.
   * @param value The value for country
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_Strength withCountry(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "country");
    if (this.country == newValue) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        this.extension,
        this.presentationLowLimit,
        newValue,
        this.concentrationLowLimit,
        this.referenceStrength,
        this.presentation,
        this.concentration,
        this.id,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_Strength#country() country} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for country
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient_Strength withCountry(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.country == value) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        this.extension,
        this.presentationLowLimit,
        value,
        this.concentrationLowLimit,
        this.referenceStrength,
        this.presentation,
        this.concentration,
        this.id,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_Strength#concentrationLowLimit() concentrationLowLimit} attribute.
   * @param value The value for concentrationLowLimit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_Strength withConcentrationLowLimit(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "concentrationLowLimit");
    if (this.concentrationLowLimit == newValue) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        this.extension,
        this.presentationLowLimit,
        this.country,
        newValue,
        this.referenceStrength,
        this.presentation,
        this.concentration,
        this.id,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_Strength#concentrationLowLimit() concentrationLowLimit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for concentrationLowLimit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient_Strength withConcentrationLowLimit(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.concentrationLowLimit == value) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        this.extension,
        this.presentationLowLimit,
        this.country,
        value,
        this.referenceStrength,
        this.presentation,
        this.concentration,
        this.id,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_Strength#referenceStrength() referenceStrength} attribute.
   * @param value The value for referenceStrength
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_Strength withReferenceStrength(List<MedicinalProductIngredient_ReferenceStrength> value) {
    @Nullable List<MedicinalProductIngredient_ReferenceStrength> newValue = Objects.requireNonNull(value, "referenceStrength");
    if (this.referenceStrength == newValue) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        this.extension,
        this.presentationLowLimit,
        this.country,
        this.concentrationLowLimit,
        newValue,
        this.presentation,
        this.concentration,
        this.id,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_Strength#referenceStrength() referenceStrength} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referenceStrength
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient_Strength withReferenceStrength(Optional<? extends List<MedicinalProductIngredient_ReferenceStrength>> optional) {
    @Nullable List<MedicinalProductIngredient_ReferenceStrength> value = optional.orElse(null);
    if (this.referenceStrength == value) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        this.extension,
        this.presentationLowLimit,
        this.country,
        this.concentrationLowLimit,
        value,
        this.presentation,
        this.concentration,
        this.id,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductIngredient_Strength#presentation() presentation} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for presentation
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_Strength withPresentation(Ratio value) {
    if (this.presentation == value) return this;
    Ratio newValue = Objects.requireNonNull(value, "presentation");
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        this.extension,
        this.presentationLowLimit,
        this.country,
        this.concentrationLowLimit,
        this.referenceStrength,
        newValue,
        this.concentration,
        this.id,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_Strength#concentration() concentration} attribute.
   * @param value The value for concentration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_Strength withConcentration(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "concentration");
    if (this.concentration == newValue) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        this.extension,
        this.presentationLowLimit,
        this.country,
        this.concentrationLowLimit,
        this.referenceStrength,
        this.presentation,
        newValue,
        this.id,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_Strength#concentration() concentration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for concentration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient_Strength withConcentration(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.concentration == value) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        this.extension,
        this.presentationLowLimit,
        this.country,
        this.concentrationLowLimit,
        this.referenceStrength,
        this.presentation,
        value,
        this.id,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_Strength#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_Strength withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        this.extension,
        this.presentationLowLimit,
        this.country,
        this.concentrationLowLimit,
        this.referenceStrength,
        this.presentation,
        this.concentration,
        newValue,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_Strength#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_Strength withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        this.extension,
        this.presentationLowLimit,
        this.country,
        this.concentrationLowLimit,
        this.referenceStrength,
        this.presentation,
        this.concentration,
        value,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_Strength#measurementPoint() measurementPoint} attribute.
   * @param value The value for measurementPoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_Strength withMeasurementPoint(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "measurementPoint");
    if (Objects.equals(this.measurementPoint, newValue)) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        this.extension,
        this.presentationLowLimit,
        this.country,
        this.concentrationLowLimit,
        this.referenceStrength,
        this.presentation,
        this.concentration,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_Strength#measurementPoint() measurementPoint} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for measurementPoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_Strength withMeasurementPoint(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.measurementPoint, value)) return this;
    return new ImmutableMedicinalProductIngredient_Strength(
        this.modifierExtension,
        this.extension,
        this.presentationLowLimit,
        this.country,
        this.concentrationLowLimit,
        this.referenceStrength,
        this.presentation,
        this.concentration,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductIngredient_Strength} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductIngredient_Strength
        && equalTo((ImmutableMedicinalProductIngredient_Strength) another);
  }

  private boolean equalTo(ImmutableMedicinalProductIngredient_Strength another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(presentationLowLimit, another.presentationLowLimit)
        && Objects.equals(country, another.country)
        && Objects.equals(concentrationLowLimit, another.concentrationLowLimit)
        && Objects.equals(referenceStrength, another.referenceStrength)
        && presentation.equals(another.presentation)
        && Objects.equals(concentration, another.concentration)
        && Objects.equals(id, another.id)
        && Objects.equals(measurementPoint, another.measurementPoint);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code extension}, {@code presentationLowLimit}, {@code country}, {@code concentrationLowLimit}, {@code referenceStrength}, {@code presentation}, {@code concentration}, {@code id}, {@code measurementPoint}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(presentationLowLimit);
    h += (h << 5) + Objects.hashCode(country);
    h += (h << 5) + Objects.hashCode(concentrationLowLimit);
    h += (h << 5) + Objects.hashCode(referenceStrength);
    h += (h << 5) + presentation.hashCode();
    h += (h << 5) + Objects.hashCode(concentration);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(measurementPoint);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductIngredient_Strength} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductIngredient_Strength{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (presentationLowLimit != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("presentationLowLimit=").append(presentationLowLimit);
    }
    if (country != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("country=").append(country);
    }
    if (concentrationLowLimit != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("concentrationLowLimit=").append(concentrationLowLimit);
    }
    if (referenceStrength != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("referenceStrength=").append(referenceStrength);
    }
    if (builder.length() > 36) builder.append(", ");
    builder.append("presentation=").append(presentation);
    if (concentration != null) {
      builder.append(", ");
      builder.append("concentration=").append(concentration);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (measurementPoint != null) {
      builder.append(", ");
      builder.append("measurementPoint=").append(measurementPoint);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProductIngredient_Strength", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductIngredient_Strength {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Ratio> presentationLowLimit = Optional.empty();
    boolean presentationLowLimitIsSet;
    @Nullable Optional<List<CodeableConcept>> country = Optional.empty();
    boolean countryIsSet;
    @Nullable Optional<Ratio> concentrationLowLimit = Optional.empty();
    boolean concentrationLowLimitIsSet;
    @Nullable Optional<List<MedicinalProductIngredient_ReferenceStrength>> referenceStrength = Optional.empty();
    boolean referenceStrengthIsSet;
    @Nullable Ratio presentation;
    @Nullable Optional<Ratio> concentration = Optional.empty();
    boolean concentrationIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> measurementPoint = Optional.empty();
    boolean measurementPointIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("presentationLowLimit")
    public void setPresentationLowLimit(Optional<Ratio> presentationLowLimit) {
      this.presentationLowLimit = presentationLowLimit;
      this.presentationLowLimitIsSet = true;
    }
    @JsonProperty("country")
    public void setCountry(Optional<List<CodeableConcept>> country) {
      this.country = country;
      this.countryIsSet = true;
    }
    @JsonProperty("concentrationLowLimit")
    public void setConcentrationLowLimit(Optional<Ratio> concentrationLowLimit) {
      this.concentrationLowLimit = concentrationLowLimit;
      this.concentrationLowLimitIsSet = true;
    }
    @JsonProperty("referenceStrength")
    public void setReferenceStrength(Optional<List<MedicinalProductIngredient_ReferenceStrength>> referenceStrength) {
      this.referenceStrength = referenceStrength;
      this.referenceStrengthIsSet = true;
    }
    @JsonProperty("presentation")
    public void setPresentation(Ratio presentation) {
      this.presentation = presentation;
    }
    @JsonProperty("concentration")
    public void setConcentration(Optional<Ratio> concentration) {
      this.concentration = concentration;
      this.concentrationIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("measurementPoint")
    public void setMeasurementPoint(Optional<String> measurementPoint) {
      this.measurementPoint = measurementPoint;
      this.measurementPointIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> presentationLowLimit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> country() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> concentrationLowLimit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicinalProductIngredient_ReferenceStrength>> referenceStrength() { throw new UnsupportedOperationException(); }
    @Override
    public Ratio presentation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> concentration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> measurementPoint() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductIngredient_Strength fromJson(Json json) {
    ImmutableMedicinalProductIngredient_Strength.Builder builder = ((ImmutableMedicinalProductIngredient_Strength.Builder) ImmutableMedicinalProductIngredient_Strength.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.presentationLowLimitIsSet) {
      builder.presentationLowLimit(json.presentationLowLimit);
    }
    if (json.countryIsSet) {
      builder.country(json.country);
    }
    if (json.concentrationLowLimitIsSet) {
      builder.concentrationLowLimit(json.concentrationLowLimit);
    }
    if (json.referenceStrengthIsSet) {
      builder.referenceStrength(json.referenceStrength);
    }
    if (json.presentation != null) {
      builder.presentation(json.presentation);
    }
    if (json.concentrationIsSet) {
      builder.concentration(json.concentration);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.measurementPointIsSet) {
      builder.measurementPoint(json.measurementPoint);
    }
    return (ImmutableMedicinalProductIngredient_Strength) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductIngredient_Strength} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductIngredient_Strength instance
   */
  public static MedicinalProductIngredient_Strength copyOf(MedicinalProductIngredient_Strength instance) {
    if (instance instanceof ImmutableMedicinalProductIngredient_Strength) {
      return (ImmutableMedicinalProductIngredient_Strength) instance;
    }
    return ((ImmutableMedicinalProductIngredient_Strength.Builder) ImmutableMedicinalProductIngredient_Strength.builder())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .presentationLowLimit(instance.presentationLowLimit())
        .country(instance.country())
        .concentrationLowLimit(instance.concentrationLowLimit())
        .referenceStrength(instance.referenceStrength())
        .presentation(instance.presentation())
        .concentration(instance.concentration())
        .id(instance.id())
        .measurementPoint(instance.measurementPoint())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductIngredient_Strength MedicinalProductIngredient_Strength}.
   * <pre>
   * ImmutableMedicinalProductIngredient_Strength.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductIngredient_Strength#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductIngredient_Strength#extension() extension}
   *    .presentationLowLimit(com.fhir.types.fhir.Ratio) // optional {@link MedicinalProductIngredient_Strength#presentationLowLimit() presentationLowLimit}
   *    .country(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProductIngredient_Strength#country() country}
   *    .concentrationLowLimit(com.fhir.types.fhir.Ratio) // optional {@link MedicinalProductIngredient_Strength#concentrationLowLimit() concentrationLowLimit}
   *    .referenceStrength(List&amp;lt;com.fhir.types.fhir.MedicinalProductIngredient_ReferenceStrength&amp;gt;) // optional {@link MedicinalProductIngredient_Strength#referenceStrength() referenceStrength}
   *    .presentation(com.fhir.types.fhir.Ratio) // required {@link MedicinalProductIngredient_Strength#presentation() presentation}
   *    .concentration(com.fhir.types.fhir.Ratio) // optional {@link MedicinalProductIngredient_Strength#concentration() concentration}
   *    .id(String) // optional {@link MedicinalProductIngredient_Strength#id() id}
   *    .measurementPoint(String) // optional {@link MedicinalProductIngredient_Strength#measurementPoint() measurementPoint}
   *    .build();
   * </pre>
   * @return A new MedicinalProductIngredient_Strength builder
   */
  public static PresentationBuildStage builder() {
    return new ImmutableMedicinalProductIngredient_Strength.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductIngredient_Strength MedicinalProductIngredient_Strength}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductIngredient_Strength", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements PresentationBuildStage, BuildFinal {
    private static final long INIT_BIT_PRESENTATION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_PRESENTATION_LOW_LIMIT = 0x4L;
    private static final long OPT_BIT_COUNTRY = 0x8L;
    private static final long OPT_BIT_CONCENTRATION_LOW_LIMIT = 0x10L;
    private static final long OPT_BIT_REFERENCE_STRENGTH = 0x20L;
    private static final long OPT_BIT_CONCENTRATION = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_MEASUREMENT_POINT = 0x100L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable Ratio presentationLowLimit;
    private @Nullable List<CodeableConcept> country;
    private @Nullable Ratio concentrationLowLimit;
    private @Nullable List<MedicinalProductIngredient_ReferenceStrength> referenceStrength;
    private @Nullable Ratio presentation;
    private @Nullable Ratio concentration;
    private @Nullable String id;
    private @Nullable String measurementPoint;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#presentationLowLimit() presentationLowLimit} to presentationLowLimit.
     * @param presentationLowLimit The value for presentationLowLimit
     * @return {@code this} builder for chained invocation
     */
    public final Builder presentationLowLimit(Ratio presentationLowLimit) {
      checkNotIsSet(presentationLowLimitIsSet(), "presentationLowLimit");
      this.presentationLowLimit = Objects.requireNonNull(presentationLowLimit, "presentationLowLimit");
      optBits |= OPT_BIT_PRESENTATION_LOW_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#presentationLowLimit() presentationLowLimit} to presentationLowLimit.
     * @param presentationLowLimit The value for presentationLowLimit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("presentationLowLimit")
    public final Builder presentationLowLimit(Optional<? extends Ratio> presentationLowLimit) {
      checkNotIsSet(presentationLowLimitIsSet(), "presentationLowLimit");
      this.presentationLowLimit = presentationLowLimit.orElse(null);
      optBits |= OPT_BIT_PRESENTATION_LOW_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for chained invocation
     */
    public final Builder country(List<CodeableConcept> country) {
      checkNotIsSet(countryIsSet(), "country");
      this.country = Objects.requireNonNull(country, "country");
      optBits |= OPT_BIT_COUNTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("country")
    public final Builder country(Optional<? extends List<CodeableConcept>> country) {
      checkNotIsSet(countryIsSet(), "country");
      this.country = country.orElse(null);
      optBits |= OPT_BIT_COUNTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#concentrationLowLimit() concentrationLowLimit} to concentrationLowLimit.
     * @param concentrationLowLimit The value for concentrationLowLimit
     * @return {@code this} builder for chained invocation
     */
    public final Builder concentrationLowLimit(Ratio concentrationLowLimit) {
      checkNotIsSet(concentrationLowLimitIsSet(), "concentrationLowLimit");
      this.concentrationLowLimit = Objects.requireNonNull(concentrationLowLimit, "concentrationLowLimit");
      optBits |= OPT_BIT_CONCENTRATION_LOW_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#concentrationLowLimit() concentrationLowLimit} to concentrationLowLimit.
     * @param concentrationLowLimit The value for concentrationLowLimit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("concentrationLowLimit")
    public final Builder concentrationLowLimit(Optional<? extends Ratio> concentrationLowLimit) {
      checkNotIsSet(concentrationLowLimitIsSet(), "concentrationLowLimit");
      this.concentrationLowLimit = concentrationLowLimit.orElse(null);
      optBits |= OPT_BIT_CONCENTRATION_LOW_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#referenceStrength() referenceStrength} to referenceStrength.
     * @param referenceStrength The value for referenceStrength
     * @return {@code this} builder for chained invocation
     */
    public final Builder referenceStrength(List<MedicinalProductIngredient_ReferenceStrength> referenceStrength) {
      checkNotIsSet(referenceStrengthIsSet(), "referenceStrength");
      this.referenceStrength = Objects.requireNonNull(referenceStrength, "referenceStrength");
      optBits |= OPT_BIT_REFERENCE_STRENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#referenceStrength() referenceStrength} to referenceStrength.
     * @param referenceStrength The value for referenceStrength
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referenceStrength")
    public final Builder referenceStrength(Optional<? extends List<MedicinalProductIngredient_ReferenceStrength>> referenceStrength) {
      checkNotIsSet(referenceStrengthIsSet(), "referenceStrength");
      this.referenceStrength = referenceStrength.orElse(null);
      optBits |= OPT_BIT_REFERENCE_STRENGTH;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProductIngredient_Strength#presentation() presentation} attribute.
     * @param presentation The value for presentation 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("presentation")
    public final Builder presentation(Ratio presentation) {
      checkNotIsSet(presentationIsSet(), "presentation");
      this.presentation = Objects.requireNonNull(presentation, "presentation");
      initBits &= ~INIT_BIT_PRESENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#concentration() concentration} to concentration.
     * @param concentration The value for concentration
     * @return {@code this} builder for chained invocation
     */
    public final Builder concentration(Ratio concentration) {
      checkNotIsSet(concentrationIsSet(), "concentration");
      this.concentration = Objects.requireNonNull(concentration, "concentration");
      optBits |= OPT_BIT_CONCENTRATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#concentration() concentration} to concentration.
     * @param concentration The value for concentration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("concentration")
    public final Builder concentration(Optional<? extends Ratio> concentration) {
      checkNotIsSet(concentrationIsSet(), "concentration");
      this.concentration = concentration.orElse(null);
      optBits |= OPT_BIT_CONCENTRATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#measurementPoint() measurementPoint} to measurementPoint.
     * @param measurementPoint The value for measurementPoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder measurementPoint(String measurementPoint) {
      checkNotIsSet(measurementPointIsSet(), "measurementPoint");
      this.measurementPoint = Objects.requireNonNull(measurementPoint, "measurementPoint");
      optBits |= OPT_BIT_MEASUREMENT_POINT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#measurementPoint() measurementPoint} to measurementPoint.
     * @param measurementPoint The value for measurementPoint
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("measurementPoint")
    public final Builder measurementPoint(Optional<String> measurementPoint) {
      checkNotIsSet(measurementPointIsSet(), "measurementPoint");
      this.measurementPoint = measurementPoint.orElse(null);
      optBits |= OPT_BIT_MEASUREMENT_POINT;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProductIngredient_Strength MedicinalProductIngredient_Strength}.
     * @return An immutable instance of MedicinalProductIngredient_Strength
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductIngredient_Strength build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductIngredient_Strength(
          modifierExtension,
          extension,
          presentationLowLimit,
          country,
          concentrationLowLimit,
          referenceStrength,
          presentation,
          concentration,
          id,
          measurementPoint);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean presentationLowLimitIsSet() {
      return (optBits & OPT_BIT_PRESENTATION_LOW_LIMIT) != 0;
    }

    private boolean countryIsSet() {
      return (optBits & OPT_BIT_COUNTRY) != 0;
    }

    private boolean concentrationLowLimitIsSet() {
      return (optBits & OPT_BIT_CONCENTRATION_LOW_LIMIT) != 0;
    }

    private boolean referenceStrengthIsSet() {
      return (optBits & OPT_BIT_REFERENCE_STRENGTH) != 0;
    }

    private boolean concentrationIsSet() {
      return (optBits & OPT_BIT_CONCENTRATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean measurementPointIsSet() {
      return (optBits & OPT_BIT_MEASUREMENT_POINT) != 0;
    }

    private boolean presentationIsSet() {
      return (initBits & INIT_BIT_PRESENTATION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductIngredient_Strength is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!presentationIsSet()) attributes.add("presentation");
      return "Cannot build MedicinalProductIngredient_Strength, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductIngredient_Strength", generator = "Immutables")
  public interface PresentationBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductIngredient_Strength#presentation() presentation} attribute.
     * @param presentation The value for presentation 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal presentation(Ratio presentation);
  }

  @Generated(from = "MedicinalProductIngredient_Strength", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#presentationLowLimit() presentationLowLimit} to presentationLowLimit.
     * @param presentationLowLimit The value for presentationLowLimit
     * @return {@code this} builder for chained invocation
     */
    BuildFinal presentationLowLimit(Ratio presentationLowLimit);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#presentationLowLimit() presentationLowLimit} to presentationLowLimit.
     * @param presentationLowLimit The value for presentationLowLimit
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal presentationLowLimit(Optional<? extends Ratio> presentationLowLimit);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for chained invocation
     */
    BuildFinal country(List<CodeableConcept> country);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal country(Optional<? extends List<CodeableConcept>> country);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#concentrationLowLimit() concentrationLowLimit} to concentrationLowLimit.
     * @param concentrationLowLimit The value for concentrationLowLimit
     * @return {@code this} builder for chained invocation
     */
    BuildFinal concentrationLowLimit(Ratio concentrationLowLimit);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#concentrationLowLimit() concentrationLowLimit} to concentrationLowLimit.
     * @param concentrationLowLimit The value for concentrationLowLimit
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal concentrationLowLimit(Optional<? extends Ratio> concentrationLowLimit);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#referenceStrength() referenceStrength} to referenceStrength.
     * @param referenceStrength The value for referenceStrength
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referenceStrength(List<MedicinalProductIngredient_ReferenceStrength> referenceStrength);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#referenceStrength() referenceStrength} to referenceStrength.
     * @param referenceStrength The value for referenceStrength
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referenceStrength(Optional<? extends List<MedicinalProductIngredient_ReferenceStrength>> referenceStrength);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#concentration() concentration} to concentration.
     * @param concentration The value for concentration
     * @return {@code this} builder for chained invocation
     */
    BuildFinal concentration(Ratio concentration);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#concentration() concentration} to concentration.
     * @param concentration The value for concentration
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal concentration(Optional<? extends Ratio> concentration);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#measurementPoint() measurementPoint} to measurementPoint.
     * @param measurementPoint The value for measurementPoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal measurementPoint(String measurementPoint);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_Strength#measurementPoint() measurementPoint} to measurementPoint.
     * @param measurementPoint The value for measurementPoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal measurementPoint(Optional<String> measurementPoint);

    /**
     * Builds a new {@link MedicinalProductIngredient_Strength MedicinalProductIngredient_Strength}.
     * @return An immutable instance of MedicinalProductIngredient_Strength
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductIngredient_Strength build();
  }
}
