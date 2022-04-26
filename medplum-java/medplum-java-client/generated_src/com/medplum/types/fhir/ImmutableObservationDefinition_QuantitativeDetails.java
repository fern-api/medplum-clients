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
 * Immutable implementation of {@link ObservationDefinition_QuantitativeDetails}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableObservationDefinition_QuantitativeDetails.builder()}.
 */
@Generated(from = "ObservationDefinition_QuantitativeDetails", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableObservationDefinition_QuantitativeDetails
    implements ObservationDefinition_QuantitativeDetails {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept unit;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept customaryUnit;
  private final @Nullable Decimal conversionFactor;
  private final @Nullable Integer decimalPrecision;
  private final @Nullable String id;

  private ImmutableObservationDefinition_QuantitativeDetails(
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept unit,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept customaryUnit,
      @Nullable Decimal conversionFactor,
      @Nullable Integer decimalPrecision,
      @Nullable String id) {
    this.modifierExtension = modifierExtension;
    this.unit = unit;
    this.extension = extension;
    this.customaryUnit = customaryUnit;
    this.conversionFactor = conversionFactor;
    this.decimalPrecision = decimalPrecision;
    this.id = id;
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
   * @return The value of the {@code unit} attribute
   */
  @JsonProperty("unit")
  @Override
  public Optional<CodeableConcept> unit() {
    return Optional.ofNullable(unit);
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
   * @return The value of the {@code customaryUnit} attribute
   */
  @JsonProperty("customaryUnit")
  @Override
  public Optional<CodeableConcept> customaryUnit() {
    return Optional.ofNullable(customaryUnit);
  }

  /**
   * @return The value of the {@code conversionFactor} attribute
   */
  @JsonProperty("conversionFactor")
  @Override
  public Optional<Decimal> conversionFactor() {
    return Optional.ofNullable(conversionFactor);
  }

  /**
   * @return The value of the {@code decimalPrecision} attribute
   */
  @JsonProperty("decimalPrecision")
  @Override
  public Optional<Integer> decimalPrecision() {
    return Optional.ofNullable(decimalPrecision);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QuantitativeDetails#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        newValue,
        this.unit,
        this.extension,
        this.customaryUnit,
        this.conversionFactor,
        this.decimalPrecision,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QuantitativeDetails#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QuantitativeDetails withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        value,
        this.unit,
        this.extension,
        this.customaryUnit,
        this.conversionFactor,
        this.decimalPrecision,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QuantitativeDetails#unit() unit} attribute.
   * @param value The value for unit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withUnit(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "unit");
    if (this.unit == newValue) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        newValue,
        this.extension,
        this.customaryUnit,
        this.conversionFactor,
        this.decimalPrecision,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QuantitativeDetails#unit() unit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QuantitativeDetails withUnit(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.unit == value) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        value,
        this.extension,
        this.customaryUnit,
        this.conversionFactor,
        this.decimalPrecision,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QuantitativeDetails#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.unit,
        newValue,
        this.customaryUnit,
        this.conversionFactor,
        this.decimalPrecision,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QuantitativeDetails#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QuantitativeDetails withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.unit,
        value,
        this.customaryUnit,
        this.conversionFactor,
        this.decimalPrecision,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QuantitativeDetails#customaryUnit() customaryUnit} attribute.
   * @param value The value for customaryUnit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withCustomaryUnit(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "customaryUnit");
    if (this.customaryUnit == newValue) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.unit,
        this.extension,
        newValue,
        this.conversionFactor,
        this.decimalPrecision,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QuantitativeDetails#customaryUnit() customaryUnit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for customaryUnit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QuantitativeDetails withCustomaryUnit(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.customaryUnit == value) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.unit,
        this.extension,
        value,
        this.conversionFactor,
        this.decimalPrecision,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QuantitativeDetails#conversionFactor() conversionFactor} attribute.
   * @param value The value for conversionFactor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withConversionFactor(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "conversionFactor");
    if (this.conversionFactor == newValue) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.unit,
        this.extension,
        this.customaryUnit,
        newValue,
        this.decimalPrecision,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QuantitativeDetails#conversionFactor() conversionFactor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for conversionFactor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QuantitativeDetails withConversionFactor(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.conversionFactor == value) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.unit,
        this.extension,
        this.customaryUnit,
        value,
        this.decimalPrecision,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QuantitativeDetails#decimalPrecision() decimalPrecision} attribute.
   * @param value The value for decimalPrecision
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withDecimalPrecision(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.decimalPrecision, newValue)) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.unit,
        this.extension,
        this.customaryUnit,
        this.conversionFactor,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QuantitativeDetails#decimalPrecision() decimalPrecision} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for decimalPrecision
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withDecimalPrecision(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.decimalPrecision, value)) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.unit,
        this.extension,
        this.customaryUnit,
        this.conversionFactor,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QuantitativeDetails#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.unit,
        this.extension,
        this.customaryUnit,
        this.conversionFactor,
        this.decimalPrecision,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QuantitativeDetails#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.unit,
        this.extension,
        this.customaryUnit,
        this.conversionFactor,
        this.decimalPrecision,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableObservationDefinition_QuantitativeDetails} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableObservationDefinition_QuantitativeDetails
        && equalTo((ImmutableObservationDefinition_QuantitativeDetails) another);
  }

  private boolean equalTo(ImmutableObservationDefinition_QuantitativeDetails another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(unit, another.unit)
        && Objects.equals(extension, another.extension)
        && Objects.equals(customaryUnit, another.customaryUnit)
        && Objects.equals(conversionFactor, another.conversionFactor)
        && Objects.equals(decimalPrecision, another.decimalPrecision)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code unit}, {@code extension}, {@code customaryUnit}, {@code conversionFactor}, {@code decimalPrecision}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(unit);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(customaryUnit);
    h += (h << 5) + Objects.hashCode(conversionFactor);
    h += (h << 5) + Objects.hashCode(decimalPrecision);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code ObservationDefinition_QuantitativeDetails} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ObservationDefinition_QuantitativeDetails{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (unit != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("unit=").append(unit);
    }
    if (extension != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (customaryUnit != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("customaryUnit=").append(customaryUnit);
    }
    if (conversionFactor != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("conversionFactor=").append(conversionFactor);
    }
    if (decimalPrecision != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("decimalPrecision=").append(decimalPrecision);
    }
    if (id != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ObservationDefinition_QuantitativeDetails", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ObservationDefinition_QuantitativeDetails {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> unit = Optional.empty();
    boolean unitIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> customaryUnit = Optional.empty();
    boolean customaryUnitIsSet;
    @Nullable Optional<Decimal> conversionFactor = Optional.empty();
    boolean conversionFactorIsSet;
    @Nullable Optional<Integer> decimalPrecision = Optional.empty();
    boolean decimalPrecisionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("unit")
    public void setUnit(Optional<CodeableConcept> unit) {
      this.unit = unit;
      this.unitIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("customaryUnit")
    public void setCustomaryUnit(Optional<CodeableConcept> customaryUnit) {
      this.customaryUnit = customaryUnit;
      this.customaryUnitIsSet = true;
    }
    @JsonProperty("conversionFactor")
    public void setConversionFactor(Optional<Decimal> conversionFactor) {
      this.conversionFactor = conversionFactor;
      this.conversionFactorIsSet = true;
    }
    @JsonProperty("decimalPrecision")
    public void setDecimalPrecision(Optional<Integer> decimalPrecision) {
      this.decimalPrecision = decimalPrecision;
      this.decimalPrecisionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> unit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> customaryUnit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> conversionFactor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> decimalPrecision() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableObservationDefinition_QuantitativeDetails fromJson(Json json) {
    ImmutableObservationDefinition_QuantitativeDetails.Builder builder = ImmutableObservationDefinition_QuantitativeDetails.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.unitIsSet) {
      builder.unit(json.unit);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.customaryUnitIsSet) {
      builder.customaryUnit(json.customaryUnit);
    }
    if (json.conversionFactorIsSet) {
      builder.conversionFactor(json.conversionFactor);
    }
    if (json.decimalPrecisionIsSet) {
      builder.decimalPrecision(json.decimalPrecision);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableObservationDefinition_QuantitativeDetails) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ObservationDefinition_QuantitativeDetails} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ObservationDefinition_QuantitativeDetails instance
   */
  public static ObservationDefinition_QuantitativeDetails copyOf(ObservationDefinition_QuantitativeDetails instance) {
    if (instance instanceof ImmutableObservationDefinition_QuantitativeDetails) {
      return (ImmutableObservationDefinition_QuantitativeDetails) instance;
    }
    return ImmutableObservationDefinition_QuantitativeDetails.builder()
        .modifierExtension(instance.modifierExtension())
        .unit(instance.unit())
        .extension(instance.extension())
        .customaryUnit(instance.customaryUnit())
        .conversionFactor(instance.conversionFactor())
        .decimalPrecision(instance.decimalPrecision())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link ObservationDefinition_QuantitativeDetails ObservationDefinition_QuantitativeDetails}.
   * <pre>
   * ImmutableObservationDefinition_QuantitativeDetails.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ObservationDefinition_QuantitativeDetails#modifierExtension() modifierExtension}
   *    .unit(com.medplum.types.fhir.CodeableConcept) // optional {@link ObservationDefinition_QuantitativeDetails#unit() unit}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ObservationDefinition_QuantitativeDetails#extension() extension}
   *    .customaryUnit(com.medplum.types.fhir.CodeableConcept) // optional {@link ObservationDefinition_QuantitativeDetails#customaryUnit() customaryUnit}
   *    .conversionFactor(com.medplum.types.fhir.Decimal) // optional {@link ObservationDefinition_QuantitativeDetails#conversionFactor() conversionFactor}
   *    .decimalPrecision(Integer) // optional {@link ObservationDefinition_QuantitativeDetails#decimalPrecision() decimalPrecision}
   *    .id(String) // optional {@link ObservationDefinition_QuantitativeDetails#id() id}
   *    .build();
   * </pre>
   * @return A new ObservationDefinition_QuantitativeDetails builder
   */
  public static ImmutableObservationDefinition_QuantitativeDetails.Builder builder() {
    return new ImmutableObservationDefinition_QuantitativeDetails.Builder();
  }

  /**
   * Builds instances of type {@link ObservationDefinition_QuantitativeDetails ObservationDefinition_QuantitativeDetails}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ObservationDefinition_QuantitativeDetails", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_UNIT = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_CUSTOMARY_UNIT = 0x8L;
    private static final long OPT_BIT_CONVERSION_FACTOR = 0x10L;
    private static final long OPT_BIT_DECIMAL_PRECISION = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept unit;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept customaryUnit;
    private @Nullable Decimal conversionFactor;
    private @Nullable Integer decimalPrecision;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#unit() unit} to unit.
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
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#unit() unit} to unit.
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
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#extension() extension} to extension.
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
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#extension() extension} to extension.
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
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#customaryUnit() customaryUnit} to customaryUnit.
     * @param customaryUnit The value for customaryUnit
     * @return {@code this} builder for chained invocation
     */
    public final Builder customaryUnit(CodeableConcept customaryUnit) {
      checkNotIsSet(customaryUnitIsSet(), "customaryUnit");
      this.customaryUnit = Objects.requireNonNull(customaryUnit, "customaryUnit");
      optBits |= OPT_BIT_CUSTOMARY_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#customaryUnit() customaryUnit} to customaryUnit.
     * @param customaryUnit The value for customaryUnit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("customaryUnit")
    public final Builder customaryUnit(Optional<? extends CodeableConcept> customaryUnit) {
      checkNotIsSet(customaryUnitIsSet(), "customaryUnit");
      this.customaryUnit = customaryUnit.orElse(null);
      optBits |= OPT_BIT_CUSTOMARY_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#conversionFactor() conversionFactor} to conversionFactor.
     * @param conversionFactor The value for conversionFactor
     * @return {@code this} builder for chained invocation
     */
    public final Builder conversionFactor(Decimal conversionFactor) {
      checkNotIsSet(conversionFactorIsSet(), "conversionFactor");
      this.conversionFactor = Objects.requireNonNull(conversionFactor, "conversionFactor");
      optBits |= OPT_BIT_CONVERSION_FACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#conversionFactor() conversionFactor} to conversionFactor.
     * @param conversionFactor The value for conversionFactor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("conversionFactor")
    public final Builder conversionFactor(Optional<? extends Decimal> conversionFactor) {
      checkNotIsSet(conversionFactorIsSet(), "conversionFactor");
      this.conversionFactor = conversionFactor.orElse(null);
      optBits |= OPT_BIT_CONVERSION_FACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#decimalPrecision() decimalPrecision} to decimalPrecision.
     * @param decimalPrecision The value for decimalPrecision
     * @return {@code this} builder for chained invocation
     */
    public final Builder decimalPrecision(int decimalPrecision) {
      checkNotIsSet(decimalPrecisionIsSet(), "decimalPrecision");
      this.decimalPrecision = decimalPrecision;
      optBits |= OPT_BIT_DECIMAL_PRECISION;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#decimalPrecision() decimalPrecision} to decimalPrecision.
     * @param decimalPrecision The value for decimalPrecision
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("decimalPrecision")
    public final Builder decimalPrecision(Optional<Integer> decimalPrecision) {
      checkNotIsSet(decimalPrecisionIsSet(), "decimalPrecision");
      this.decimalPrecision = decimalPrecision.orElse(null);
      optBits |= OPT_BIT_DECIMAL_PRECISION;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#id() id} to id.
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
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#id() id} to id.
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
     * Builds a new {@link ObservationDefinition_QuantitativeDetails ObservationDefinition_QuantitativeDetails}.
     * @return An immutable instance of ObservationDefinition_QuantitativeDetails
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ObservationDefinition_QuantitativeDetails build() {
      return new ImmutableObservationDefinition_QuantitativeDetails(modifierExtension, unit, extension, customaryUnit, conversionFactor, decimalPrecision, id);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean unitIsSet() {
      return (optBits & OPT_BIT_UNIT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean customaryUnitIsSet() {
      return (optBits & OPT_BIT_CUSTOMARY_UNIT) != 0;
    }

    private boolean conversionFactorIsSet() {
      return (optBits & OPT_BIT_CONVERSION_FACTOR) != 0;
    }

    private boolean decimalPrecisionIsSet() {
      return (optBits & OPT_BIT_DECIMAL_PRECISION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ObservationDefinition_QuantitativeDetails is strict, attribute is already set: ".concat(name));
    }
  }
}
