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
 * Immutable implementation of {@link MedicinalProductIngredient_ReferenceStrength}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductIngredient_ReferenceStrength.builder()}.
 */
@Generated(from = "MedicinalProductIngredient_ReferenceStrength", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductIngredient_ReferenceStrength
    implements MedicinalProductIngredient_ReferenceStrength {
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept substance;
  private final Ratio strength;
  private final @Nullable Ratio strengthLowLimit;
  private final @Nullable List<CodeableConcept> country;
  private final @Nullable List<Extension> extension;
  private final @Nullable String measurementPoint;

  private ImmutableMedicinalProductIngredient_ReferenceStrength(
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept substance,
      Ratio strength,
      @Nullable Ratio strengthLowLimit,
      @Nullable List<CodeableConcept> country,
      @Nullable List<Extension> extension,
      @Nullable String measurementPoint) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.substance = substance;
    this.strength = strength;
    this.strengthLowLimit = strengthLowLimit;
    this.country = country;
    this.extension = extension;
    this.measurementPoint = measurementPoint;
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
   * @return The value of the {@code substance} attribute
   */
  @JsonProperty("substance")
  @Override
  public Optional<CodeableConcept> substance() {
    return Optional.ofNullable(substance);
  }

  /**
   * @return The value of the {@code strength} attribute
   */
  @JsonProperty("strength")
  @Override
  public Ratio strength() {
    return strength;
  }

  /**
   * @return The value of the {@code strengthLowLimit} attribute
   */
  @JsonProperty("strengthLowLimit")
  @Override
  public Optional<Ratio> strengthLowLimit() {
    return Optional.ofNullable(strengthLowLimit);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_ReferenceStrength#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_ReferenceStrength withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProductIngredient_ReferenceStrength(
        newValue,
        this.modifierExtension,
        this.substance,
        this.strength,
        this.strengthLowLimit,
        this.country,
        this.extension,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_ReferenceStrength#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_ReferenceStrength withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProductIngredient_ReferenceStrength(
        value,
        this.modifierExtension,
        this.substance,
        this.strength,
        this.strengthLowLimit,
        this.country,
        this.extension,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_ReferenceStrength#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_ReferenceStrength withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductIngredient_ReferenceStrength(
        this.id,
        newValue,
        this.substance,
        this.strength,
        this.strengthLowLimit,
        this.country,
        this.extension,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_ReferenceStrength#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient_ReferenceStrength withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductIngredient_ReferenceStrength(
        this.id,
        value,
        this.substance,
        this.strength,
        this.strengthLowLimit,
        this.country,
        this.extension,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_ReferenceStrength#substance() substance} attribute.
   * @param value The value for substance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_ReferenceStrength withSubstance(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "substance");
    if (this.substance == newValue) return this;
    return new ImmutableMedicinalProductIngredient_ReferenceStrength(
        this.id,
        this.modifierExtension,
        newValue,
        this.strength,
        this.strengthLowLimit,
        this.country,
        this.extension,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_ReferenceStrength#substance() substance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for substance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient_ReferenceStrength withSubstance(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.substance == value) return this;
    return new ImmutableMedicinalProductIngredient_ReferenceStrength(
        this.id,
        this.modifierExtension,
        value,
        this.strength,
        this.strengthLowLimit,
        this.country,
        this.extension,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductIngredient_ReferenceStrength#strength() strength} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for strength
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_ReferenceStrength withStrength(Ratio value) {
    if (this.strength == value) return this;
    Ratio newValue = Objects.requireNonNull(value, "strength");
    return new ImmutableMedicinalProductIngredient_ReferenceStrength(
        this.id,
        this.modifierExtension,
        this.substance,
        newValue,
        this.strengthLowLimit,
        this.country,
        this.extension,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_ReferenceStrength#strengthLowLimit() strengthLowLimit} attribute.
   * @param value The value for strengthLowLimit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_ReferenceStrength withStrengthLowLimit(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "strengthLowLimit");
    if (this.strengthLowLimit == newValue) return this;
    return new ImmutableMedicinalProductIngredient_ReferenceStrength(
        this.id,
        this.modifierExtension,
        this.substance,
        this.strength,
        newValue,
        this.country,
        this.extension,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_ReferenceStrength#strengthLowLimit() strengthLowLimit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for strengthLowLimit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient_ReferenceStrength withStrengthLowLimit(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.strengthLowLimit == value) return this;
    return new ImmutableMedicinalProductIngredient_ReferenceStrength(
        this.id,
        this.modifierExtension,
        this.substance,
        this.strength,
        value,
        this.country,
        this.extension,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_ReferenceStrength#country() country} attribute.
   * @param value The value for country
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_ReferenceStrength withCountry(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "country");
    if (this.country == newValue) return this;
    return new ImmutableMedicinalProductIngredient_ReferenceStrength(
        this.id,
        this.modifierExtension,
        this.substance,
        this.strength,
        this.strengthLowLimit,
        newValue,
        this.extension,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_ReferenceStrength#country() country} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for country
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient_ReferenceStrength withCountry(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.country == value) return this;
    return new ImmutableMedicinalProductIngredient_ReferenceStrength(
        this.id,
        this.modifierExtension,
        this.substance,
        this.strength,
        this.strengthLowLimit,
        value,
        this.extension,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_ReferenceStrength#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_ReferenceStrength withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductIngredient_ReferenceStrength(
        this.id,
        this.modifierExtension,
        this.substance,
        this.strength,
        this.strengthLowLimit,
        this.country,
        newValue,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_ReferenceStrength#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient_ReferenceStrength withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductIngredient_ReferenceStrength(
        this.id,
        this.modifierExtension,
        this.substance,
        this.strength,
        this.strengthLowLimit,
        this.country,
        value,
        this.measurementPoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_ReferenceStrength#measurementPoint() measurementPoint} attribute.
   * @param value The value for measurementPoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_ReferenceStrength withMeasurementPoint(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "measurementPoint");
    if (Objects.equals(this.measurementPoint, newValue)) return this;
    return new ImmutableMedicinalProductIngredient_ReferenceStrength(
        this.id,
        this.modifierExtension,
        this.substance,
        this.strength,
        this.strengthLowLimit,
        this.country,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_ReferenceStrength#measurementPoint() measurementPoint} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for measurementPoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_ReferenceStrength withMeasurementPoint(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.measurementPoint, value)) return this;
    return new ImmutableMedicinalProductIngredient_ReferenceStrength(
        this.id,
        this.modifierExtension,
        this.substance,
        this.strength,
        this.strengthLowLimit,
        this.country,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductIngredient_ReferenceStrength} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductIngredient_ReferenceStrength
        && equalTo((ImmutableMedicinalProductIngredient_ReferenceStrength) another);
  }

  private boolean equalTo(ImmutableMedicinalProductIngredient_ReferenceStrength another) {
    return Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(substance, another.substance)
        && strength.equals(another.strength)
        && Objects.equals(strengthLowLimit, another.strengthLowLimit)
        && Objects.equals(country, another.country)
        && Objects.equals(extension, another.extension)
        && Objects.equals(measurementPoint, another.measurementPoint);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code substance}, {@code strength}, {@code strengthLowLimit}, {@code country}, {@code extension}, {@code measurementPoint}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(substance);
    h += (h << 5) + strength.hashCode();
    h += (h << 5) + Objects.hashCode(strengthLowLimit);
    h += (h << 5) + Objects.hashCode(country);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(measurementPoint);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductIngredient_ReferenceStrength} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductIngredient_ReferenceStrength{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 45) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (substance != null) {
      if (builder.length() > 45) builder.append(", ");
      builder.append("substance=").append(substance);
    }
    if (builder.length() > 45) builder.append(", ");
    builder.append("strength=").append(strength);
    if (strengthLowLimit != null) {
      builder.append(", ");
      builder.append("strengthLowLimit=").append(strengthLowLimit);
    }
    if (country != null) {
      builder.append(", ");
      builder.append("country=").append(country);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
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
  @Generated(from = "MedicinalProductIngredient_ReferenceStrength", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductIngredient_ReferenceStrength {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> substance = Optional.empty();
    boolean substanceIsSet;
    @Nullable Ratio strength;
    @Nullable Optional<Ratio> strengthLowLimit = Optional.empty();
    boolean strengthLowLimitIsSet;
    @Nullable Optional<List<CodeableConcept>> country = Optional.empty();
    boolean countryIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> measurementPoint = Optional.empty();
    boolean measurementPointIsSet;
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
    @JsonProperty("substance")
    public void setSubstance(Optional<CodeableConcept> substance) {
      this.substance = substance;
      this.substanceIsSet = true;
    }
    @JsonProperty("strength")
    public void setStrength(Ratio strength) {
      this.strength = strength;
    }
    @JsonProperty("strengthLowLimit")
    public void setStrengthLowLimit(Optional<Ratio> strengthLowLimit) {
      this.strengthLowLimit = strengthLowLimit;
      this.strengthLowLimitIsSet = true;
    }
    @JsonProperty("country")
    public void setCountry(Optional<List<CodeableConcept>> country) {
      this.country = country;
      this.countryIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("measurementPoint")
    public void setMeasurementPoint(Optional<String> measurementPoint) {
      this.measurementPoint = measurementPoint;
      this.measurementPointIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> substance() { throw new UnsupportedOperationException(); }
    @Override
    public Ratio strength() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> strengthLowLimit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> country() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicinalProductIngredient_ReferenceStrength fromJson(Json json) {
    ImmutableMedicinalProductIngredient_ReferenceStrength.Builder builder = ((ImmutableMedicinalProductIngredient_ReferenceStrength.Builder) ImmutableMedicinalProductIngredient_ReferenceStrength.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.substanceIsSet) {
      builder.substance(json.substance);
    }
    if (json.strength != null) {
      builder.strength(json.strength);
    }
    if (json.strengthLowLimitIsSet) {
      builder.strengthLowLimit(json.strengthLowLimit);
    }
    if (json.countryIsSet) {
      builder.country(json.country);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.measurementPointIsSet) {
      builder.measurementPoint(json.measurementPoint);
    }
    return (ImmutableMedicinalProductIngredient_ReferenceStrength) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductIngredient_ReferenceStrength} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductIngredient_ReferenceStrength instance
   */
  public static MedicinalProductIngredient_ReferenceStrength copyOf(MedicinalProductIngredient_ReferenceStrength instance) {
    if (instance instanceof ImmutableMedicinalProductIngredient_ReferenceStrength) {
      return (ImmutableMedicinalProductIngredient_ReferenceStrength) instance;
    }
    return ((ImmutableMedicinalProductIngredient_ReferenceStrength.Builder) ImmutableMedicinalProductIngredient_ReferenceStrength.builder())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .substance(instance.substance())
        .strength(instance.strength())
        .strengthLowLimit(instance.strengthLowLimit())
        .country(instance.country())
        .extension(instance.extension())
        .measurementPoint(instance.measurementPoint())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductIngredient_ReferenceStrength MedicinalProductIngredient_ReferenceStrength}.
   * <pre>
   * ImmutableMedicinalProductIngredient_ReferenceStrength.builder()
   *    .id(String) // optional {@link MedicinalProductIngredient_ReferenceStrength#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductIngredient_ReferenceStrength#modifierExtension() modifierExtension}
   *    .substance(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicinalProductIngredient_ReferenceStrength#substance() substance}
   *    .strength(com.fhir.types.fhir.Ratio) // required {@link MedicinalProductIngredient_ReferenceStrength#strength() strength}
   *    .strengthLowLimit(com.fhir.types.fhir.Ratio) // optional {@link MedicinalProductIngredient_ReferenceStrength#strengthLowLimit() strengthLowLimit}
   *    .country(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProductIngredient_ReferenceStrength#country() country}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductIngredient_ReferenceStrength#extension() extension}
   *    .measurementPoint(String) // optional {@link MedicinalProductIngredient_ReferenceStrength#measurementPoint() measurementPoint}
   *    .build();
   * </pre>
   * @return A new MedicinalProductIngredient_ReferenceStrength builder
   */
  public static StrengthBuildStage builder() {
    return new ImmutableMedicinalProductIngredient_ReferenceStrength.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductIngredient_ReferenceStrength MedicinalProductIngredient_ReferenceStrength}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductIngredient_ReferenceStrength", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements StrengthBuildStage, BuildFinal {
    private static final long INIT_BIT_STRENGTH = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_SUBSTANCE = 0x4L;
    private static final long OPT_BIT_STRENGTH_LOW_LIMIT = 0x8L;
    private static final long OPT_BIT_COUNTRY = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_MEASUREMENT_POINT = 0x40L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept substance;
    private @Nullable Ratio strength;
    private @Nullable Ratio strengthLowLimit;
    private @Nullable List<CodeableConcept> country;
    private @Nullable List<Extension> extension;
    private @Nullable String measurementPoint;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#substance() substance} to substance.
     * @param substance The value for substance
     * @return {@code this} builder for chained invocation
     */
    public final Builder substance(CodeableConcept substance) {
      checkNotIsSet(substanceIsSet(), "substance");
      this.substance = Objects.requireNonNull(substance, "substance");
      optBits |= OPT_BIT_SUBSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#substance() substance} to substance.
     * @param substance The value for substance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("substance")
    public final Builder substance(Optional<? extends CodeableConcept> substance) {
      checkNotIsSet(substanceIsSet(), "substance");
      this.substance = substance.orElse(null);
      optBits |= OPT_BIT_SUBSTANCE;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProductIngredient_ReferenceStrength#strength() strength} attribute.
     * @param strength The value for strength 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("strength")
    public final Builder strength(Ratio strength) {
      checkNotIsSet(strengthIsSet(), "strength");
      this.strength = Objects.requireNonNull(strength, "strength");
      initBits &= ~INIT_BIT_STRENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#strengthLowLimit() strengthLowLimit} to strengthLowLimit.
     * @param strengthLowLimit The value for strengthLowLimit
     * @return {@code this} builder for chained invocation
     */
    public final Builder strengthLowLimit(Ratio strengthLowLimit) {
      checkNotIsSet(strengthLowLimitIsSet(), "strengthLowLimit");
      this.strengthLowLimit = Objects.requireNonNull(strengthLowLimit, "strengthLowLimit");
      optBits |= OPT_BIT_STRENGTH_LOW_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#strengthLowLimit() strengthLowLimit} to strengthLowLimit.
     * @param strengthLowLimit The value for strengthLowLimit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("strengthLowLimit")
    public final Builder strengthLowLimit(Optional<? extends Ratio> strengthLowLimit) {
      checkNotIsSet(strengthLowLimitIsSet(), "strengthLowLimit");
      this.strengthLowLimit = strengthLowLimit.orElse(null);
      optBits |= OPT_BIT_STRENGTH_LOW_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#country() country} to country.
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
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#country() country} to country.
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
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#measurementPoint() measurementPoint} to measurementPoint.
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
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#measurementPoint() measurementPoint} to measurementPoint.
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
     * Builds a new {@link MedicinalProductIngredient_ReferenceStrength MedicinalProductIngredient_ReferenceStrength}.
     * @return An immutable instance of MedicinalProductIngredient_ReferenceStrength
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductIngredient_ReferenceStrength build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductIngredient_ReferenceStrength(
          id,
          modifierExtension,
          substance,
          strength,
          strengthLowLimit,
          country,
          extension,
          measurementPoint);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean substanceIsSet() {
      return (optBits & OPT_BIT_SUBSTANCE) != 0;
    }

    private boolean strengthLowLimitIsSet() {
      return (optBits & OPT_BIT_STRENGTH_LOW_LIMIT) != 0;
    }

    private boolean countryIsSet() {
      return (optBits & OPT_BIT_COUNTRY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean measurementPointIsSet() {
      return (optBits & OPT_BIT_MEASUREMENT_POINT) != 0;
    }

    private boolean strengthIsSet() {
      return (initBits & INIT_BIT_STRENGTH) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductIngredient_ReferenceStrength is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!strengthIsSet()) attributes.add("strength");
      return "Cannot build MedicinalProductIngredient_ReferenceStrength, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductIngredient_ReferenceStrength", generator = "Immutables")
  public interface StrengthBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductIngredient_ReferenceStrength#strength() strength} attribute.
     * @param strength The value for strength 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal strength(Ratio strength);
  }

  @Generated(from = "MedicinalProductIngredient_ReferenceStrength", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#substance() substance} to substance.
     * @param substance The value for substance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal substance(CodeableConcept substance);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#substance() substance} to substance.
     * @param substance The value for substance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal substance(Optional<? extends CodeableConcept> substance);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#strengthLowLimit() strengthLowLimit} to strengthLowLimit.
     * @param strengthLowLimit The value for strengthLowLimit
     * @return {@code this} builder for chained invocation
     */
    BuildFinal strengthLowLimit(Ratio strengthLowLimit);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#strengthLowLimit() strengthLowLimit} to strengthLowLimit.
     * @param strengthLowLimit The value for strengthLowLimit
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal strengthLowLimit(Optional<? extends Ratio> strengthLowLimit);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for chained invocation
     */
    BuildFinal country(List<CodeableConcept> country);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal country(Optional<? extends List<CodeableConcept>> country);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#measurementPoint() measurementPoint} to measurementPoint.
     * @param measurementPoint The value for measurementPoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal measurementPoint(String measurementPoint);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_ReferenceStrength#measurementPoint() measurementPoint} to measurementPoint.
     * @param measurementPoint The value for measurementPoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal measurementPoint(Optional<String> measurementPoint);

    /**
     * Builds a new {@link MedicinalProductIngredient_ReferenceStrength MedicinalProductIngredient_ReferenceStrength}.
     * @return An immutable instance of MedicinalProductIngredient_ReferenceStrength
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductIngredient_ReferenceStrength build();
  }
}
