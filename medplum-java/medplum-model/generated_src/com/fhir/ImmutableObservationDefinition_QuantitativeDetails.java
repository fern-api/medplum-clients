//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ObservationDefinition_QuantitativeDetails}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableObservationDefinition_QuantitativeDetails.builder()}.
 */
@org.immutables.value.Generated(from = "ObservationDefinition_QuantitativeDetails", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableObservationDefinition_QuantitativeDetails
    implements com.fhir.ObservationDefinition_QuantitativeDetails {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.decimal conversionFactor;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept customaryUnit;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept unit;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.Integer decimalPrecision;

  private ImmutableObservationDefinition_QuantitativeDetails(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.decimal conversionFactor,
      @javax.annotation.Nullable com.fhir.CodeableConcept customaryUnit,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CodeableConcept unit,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.Integer decimalPrecision) {
    this.modifierExtension = modifierExtension;
    this.conversionFactor = conversionFactor;
    this.customaryUnit = customaryUnit;
    this.extension = extension;
    this.unit = unit;
    this.id = id;
    this.decimalPrecision = decimalPrecision;
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code conversionFactor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("conversionFactor")
  @Override
  public java.util.Optional<com.fhir.decimal> conversionFactor() {
    return java.util.Optional.ofNullable(conversionFactor);
  }

  /**
   * @return The value of the {@code customaryUnit} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("customaryUnit")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> customaryUnit() {
    return java.util.Optional.ofNullable(customaryUnit);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code unit} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("unit")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> unit() {
    return java.util.Optional.ofNullable(unit);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code decimalPrecision} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("decimalPrecision")
  @Override
  public java.util.Optional<java.lang.Integer> decimalPrecision() {
    return java.util.Optional.ofNullable(decimalPrecision);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QuantitativeDetails#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        newValue,
        this.conversionFactor,
        this.customaryUnit,
        this.extension,
        this.unit,
        this.id,
        this.decimalPrecision);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QuantitativeDetails#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QuantitativeDetails withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        value,
        this.conversionFactor,
        this.customaryUnit,
        this.extension,
        this.unit,
        this.id,
        this.decimalPrecision);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QuantitativeDetails#conversionFactor() conversionFactor} attribute.
   * @param value The value for conversionFactor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withConversionFactor(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "conversionFactor");
    if (this.conversionFactor == newValue) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        newValue,
        this.customaryUnit,
        this.extension,
        this.unit,
        this.id,
        this.decimalPrecision);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QuantitativeDetails#conversionFactor() conversionFactor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for conversionFactor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QuantitativeDetails withConversionFactor(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.conversionFactor == value) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        value,
        this.customaryUnit,
        this.extension,
        this.unit,
        this.id,
        this.decimalPrecision);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QuantitativeDetails#customaryUnit() customaryUnit} attribute.
   * @param value The value for customaryUnit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withCustomaryUnit(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "customaryUnit");
    if (this.customaryUnit == newValue) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.conversionFactor,
        newValue,
        this.extension,
        this.unit,
        this.id,
        this.decimalPrecision);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QuantitativeDetails#customaryUnit() customaryUnit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for customaryUnit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QuantitativeDetails withCustomaryUnit(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.customaryUnit == value) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.conversionFactor,
        value,
        this.extension,
        this.unit,
        this.id,
        this.decimalPrecision);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QuantitativeDetails#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.conversionFactor,
        this.customaryUnit,
        newValue,
        this.unit,
        this.id,
        this.decimalPrecision);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QuantitativeDetails#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QuantitativeDetails withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.conversionFactor,
        this.customaryUnit,
        value,
        this.unit,
        this.id,
        this.decimalPrecision);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QuantitativeDetails#unit() unit} attribute.
   * @param value The value for unit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withUnit(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "unit");
    if (this.unit == newValue) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.conversionFactor,
        this.customaryUnit,
        this.extension,
        newValue,
        this.id,
        this.decimalPrecision);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QuantitativeDetails#unit() unit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition_QuantitativeDetails withUnit(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.unit == value) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.conversionFactor,
        this.customaryUnit,
        this.extension,
        value,
        this.id,
        this.decimalPrecision);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QuantitativeDetails#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.conversionFactor,
        this.customaryUnit,
        this.extension,
        this.unit,
        newValue,
        this.decimalPrecision);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QuantitativeDetails#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.conversionFactor,
        this.customaryUnit,
        this.extension,
        this.unit,
        value,
        this.decimalPrecision);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition_QuantitativeDetails#decimalPrecision() decimalPrecision} attribute.
   * @param value The value for decimalPrecision
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withDecimalPrecision(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.decimalPrecision, newValue)) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.conversionFactor,
        this.customaryUnit,
        this.extension,
        this.unit,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition_QuantitativeDetails#decimalPrecision() decimalPrecision} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for decimalPrecision
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition_QuantitativeDetails withDecimalPrecision(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.decimalPrecision, value)) return this;
    return new ImmutableObservationDefinition_QuantitativeDetails(
        this.modifierExtension,
        this.conversionFactor,
        this.customaryUnit,
        this.extension,
        this.unit,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableObservationDefinition_QuantitativeDetails} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableObservationDefinition_QuantitativeDetails
        && equalTo((ImmutableObservationDefinition_QuantitativeDetails) another);
  }

  private boolean equalTo(ImmutableObservationDefinition_QuantitativeDetails another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(conversionFactor, another.conversionFactor)
        && java.util.Objects.equals(customaryUnit, another.customaryUnit)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(unit, another.unit)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(decimalPrecision, another.decimalPrecision);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code conversionFactor}, {@code customaryUnit}, {@code extension}, {@code unit}, {@code id}, {@code decimalPrecision}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(conversionFactor);
    h += (h << 5) + java.util.Objects.hashCode(customaryUnit);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(unit);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(decimalPrecision);
    return h;
  }

  /**
   * Prints the immutable value {@code ObservationDefinition_QuantitativeDetails} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ObservationDefinition_QuantitativeDetails{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (conversionFactor != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("conversionFactor=").append(conversionFactor);
    }
    if (customaryUnit != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("customaryUnit=").append(customaryUnit);
    }
    if (extension != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (unit != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("unit=").append(unit);
    }
    if (id != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (decimalPrecision != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("decimalPrecision=").append(decimalPrecision);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ObservationDefinition_QuantitativeDetails", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ObservationDefinition_QuantitativeDetails {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> conversionFactor = java.util.Optional.empty();
    boolean conversionFactorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> customaryUnit = java.util.Optional.empty();
    boolean customaryUnitIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> unit = java.util.Optional.empty();
    boolean unitIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> decimalPrecision = java.util.Optional.empty();
    boolean decimalPrecisionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("conversionFactor")
    public void setConversionFactor(java.util.Optional<com.fhir.decimal> conversionFactor) {
      this.conversionFactor = conversionFactor;
      this.conversionFactorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("customaryUnit")
    public void setCustomaryUnit(java.util.Optional<com.fhir.CodeableConcept> customaryUnit) {
      this.customaryUnit = customaryUnit;
      this.customaryUnitIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    public void setUnit(java.util.Optional<com.fhir.CodeableConcept> unit) {
      this.unit = unit;
      this.unitIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("decimalPrecision")
    public void setDecimalPrecision(java.util.Optional<java.lang.Integer> decimalPrecision) {
      this.decimalPrecision = decimalPrecision;
      this.decimalPrecisionIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> conversionFactor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> customaryUnit() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> unit() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> decimalPrecision() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableObservationDefinition_QuantitativeDetails fromJson(Json json) {
    ImmutableObservationDefinition_QuantitativeDetails.Builder builder = ImmutableObservationDefinition_QuantitativeDetails.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.conversionFactorIsSet) {
      builder.conversionFactor(json.conversionFactor);
    }
    if (json.customaryUnitIsSet) {
      builder.customaryUnit(json.customaryUnit);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.unitIsSet) {
      builder.unit(json.unit);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.decimalPrecisionIsSet) {
      builder.decimalPrecision(json.decimalPrecision);
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
        .conversionFactor(instance.conversionFactor())
        .customaryUnit(instance.customaryUnit())
        .extension(instance.extension())
        .unit(instance.unit())
        .id(instance.id())
        .decimalPrecision(instance.decimalPrecision())
        .build();
  }

  /**
   * Creates a builder for {@link ObservationDefinition_QuantitativeDetails ObservationDefinition_QuantitativeDetails}.
   * <pre>
   * ImmutableObservationDefinition_QuantitativeDetails.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ObservationDefinition_QuantitativeDetails#modifierExtension() modifierExtension}
   *    .conversionFactor(com.fhir.decimal) // optional {@link ObservationDefinition_QuantitativeDetails#conversionFactor() conversionFactor}
   *    .customaryUnit(com.fhir.CodeableConcept) // optional {@link ObservationDefinition_QuantitativeDetails#customaryUnit() customaryUnit}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ObservationDefinition_QuantitativeDetails#extension() extension}
   *    .unit(com.fhir.CodeableConcept) // optional {@link ObservationDefinition_QuantitativeDetails#unit() unit}
   *    .id(String) // optional {@link ObservationDefinition_QuantitativeDetails#id() id}
   *    .decimalPrecision(Integer) // optional {@link ObservationDefinition_QuantitativeDetails#decimalPrecision() decimalPrecision}
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
  @org.immutables.value.Generated(from = "ObservationDefinition_QuantitativeDetails", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_CONVERSION_FACTOR = 0x2L;
    private static final long OPT_BIT_CUSTOMARY_UNIT = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_UNIT = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_DECIMAL_PRECISION = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.decimal conversionFactor;
    private @javax.annotation.Nullable com.fhir.CodeableConcept customaryUnit;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept unit;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.Integer decimalPrecision;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#conversionFactor() conversionFactor} to conversionFactor.
     * @param conversionFactor The value for conversionFactor
     * @return {@code this} builder for chained invocation
     */
    public final Builder conversionFactor(com.fhir.decimal conversionFactor) {
      checkNotIsSet(conversionFactorIsSet(), "conversionFactor");
      this.conversionFactor = java.util.Objects.requireNonNull(conversionFactor, "conversionFactor");
      optBits |= OPT_BIT_CONVERSION_FACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#conversionFactor() conversionFactor} to conversionFactor.
     * @param conversionFactor The value for conversionFactor
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conversionFactor")
    public final Builder conversionFactor(java.util.Optional<? extends com.fhir.decimal> conversionFactor) {
      checkNotIsSet(conversionFactorIsSet(), "conversionFactor");
      this.conversionFactor = conversionFactor.orElse(null);
      optBits |= OPT_BIT_CONVERSION_FACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#customaryUnit() customaryUnit} to customaryUnit.
     * @param customaryUnit The value for customaryUnit
     * @return {@code this} builder for chained invocation
     */
    public final Builder customaryUnit(com.fhir.CodeableConcept customaryUnit) {
      checkNotIsSet(customaryUnitIsSet(), "customaryUnit");
      this.customaryUnit = java.util.Objects.requireNonNull(customaryUnit, "customaryUnit");
      optBits |= OPT_BIT_CUSTOMARY_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#customaryUnit() customaryUnit} to customaryUnit.
     * @param customaryUnit The value for customaryUnit
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customaryUnit")
    public final Builder customaryUnit(java.util.Optional<? extends com.fhir.CodeableConcept> customaryUnit) {
      checkNotIsSet(customaryUnitIsSet(), "customaryUnit");
      this.customaryUnit = customaryUnit.orElse(null);
      optBits |= OPT_BIT_CUSTOMARY_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for chained invocation
     */
    public final Builder unit(com.fhir.CodeableConcept unit) {
      checkNotIsSet(unitIsSet(), "unit");
      this.unit = java.util.Objects.requireNonNull(unit, "unit");
      optBits |= OPT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    public final Builder unit(java.util.Optional<? extends com.fhir.CodeableConcept> unit) {
      checkNotIsSet(unitIsSet(), "unit");
      this.unit = unit.orElse(null);
      optBits |= OPT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition_QuantitativeDetails#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
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
    @com.fasterxml.jackson.annotation.JsonProperty("decimalPrecision")
    public final Builder decimalPrecision(java.util.Optional<java.lang.Integer> decimalPrecision) {
      checkNotIsSet(decimalPrecisionIsSet(), "decimalPrecision");
      this.decimalPrecision = decimalPrecision.orElse(null);
      optBits |= OPT_BIT_DECIMAL_PRECISION;
      return this;
    }

    /**
     * Builds a new {@link ObservationDefinition_QuantitativeDetails ObservationDefinition_QuantitativeDetails}.
     * @return An immutable instance of ObservationDefinition_QuantitativeDetails
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ObservationDefinition_QuantitativeDetails build() {
      return new ImmutableObservationDefinition_QuantitativeDetails(modifierExtension, conversionFactor, customaryUnit, extension, unit, id, decimalPrecision);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean conversionFactorIsSet() {
      return (optBits & OPT_BIT_CONVERSION_FACTOR) != 0;
    }

    private boolean customaryUnitIsSet() {
      return (optBits & OPT_BIT_CUSTOMARY_UNIT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean unitIsSet() {
      return (optBits & OPT_BIT_UNIT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean decimalPrecisionIsSet() {
      return (optBits & OPT_BIT_DECIMAL_PRECISION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ObservationDefinition_QuantitativeDetails is strict, attribute is already set: ".concat(name));
    }
  }
}
