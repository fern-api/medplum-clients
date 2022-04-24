//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CodeSystem_Property1}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCodeSystem_Property1.builder()}.
 */
@org.immutables.value.Generated(from = "CodeSystem_Property1", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCodeSystem_Property1 implements com.fhir.CodeSystem_Property1 {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code code;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String valueCode;
  private final @javax.annotation.Nullable java.lang.Double valueDecimal;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.Boolean valueBoolean;
  private final @javax.annotation.Nullable com.fhir.Coding valueCoding;
  private final @javax.annotation.Nullable java.lang.String valueString;
  private final @javax.annotation.Nullable java.lang.Double valueInteger;
  private final @javax.annotation.Nullable java.lang.String valueDateTime;

  private ImmutableCodeSystem_Property1(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code code,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String valueCode,
      @javax.annotation.Nullable java.lang.Double valueDecimal,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.Boolean valueBoolean,
      @javax.annotation.Nullable com.fhir.Coding valueCoding,
      @javax.annotation.Nullable java.lang.String valueString,
      @javax.annotation.Nullable java.lang.Double valueInteger,
      @javax.annotation.Nullable java.lang.String valueDateTime) {
    this.extension = extension;
    this.code = code;
    this.id = id;
    this.valueCode = valueCode;
    this.valueDecimal = valueDecimal;
    this.modifierExtension = modifierExtension;
    this.valueBoolean = valueBoolean;
    this.valueCoding = valueCoding;
    this.valueString = valueString;
    this.valueInteger = valueInteger;
    this.valueDateTime = valueDateTime;
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.code> code() {
    return java.util.Optional.ofNullable(code);
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
   * @return The value of the {@code valueCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueCode")
  @Override
  public java.util.Optional<java.lang.String> valueCode() {
    return java.util.Optional.ofNullable(valueCode);
  }

  /**
   * @return The value of the {@code valueDecimal} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueDecimal")
  @Override
  public java.util.Optional<java.lang.Double> valueDecimal() {
    return java.util.Optional.ofNullable(valueDecimal);
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
   * @return The value of the {@code valueBoolean} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueBoolean")
  @Override
  public java.util.Optional<java.lang.Boolean> valueBoolean() {
    return java.util.Optional.ofNullable(valueBoolean);
  }

  /**
   * @return The value of the {@code valueCoding} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueCoding")
  @Override
  public java.util.Optional<com.fhir.Coding> valueCoding() {
    return java.util.Optional.ofNullable(valueCoding);
  }

  /**
   * @return The value of the {@code valueString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueString")
  @Override
  public java.util.Optional<java.lang.String> valueString() {
    return java.util.Optional.ofNullable(valueString);
  }

  /**
   * @return The value of the {@code valueInteger} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueInteger")
  @Override
  public java.util.Optional<java.lang.Double> valueInteger() {
    return java.util.Optional.ofNullable(valueInteger);
  }

  /**
   * @return The value of the {@code valueDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueDateTime")
  @Override
  public java.util.Optional<java.lang.String> valueDateTime() {
    return java.util.Optional.ofNullable(valueDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCodeSystem_Property1(
        newValue,
        this.code,
        this.id,
        this.valueCode,
        this.valueDecimal,
        this.modifierExtension,
        this.valueBoolean,
        this.valueCoding,
        this.valueString,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Property1 withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCodeSystem_Property1(
        value,
        this.code,
        this.id,
        this.valueCode,
        this.valueDecimal,
        this.modifierExtension,
        this.valueBoolean,
        this.valueCoding,
        this.valueString,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withCode(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        newValue,
        this.id,
        this.valueCode,
        this.valueDecimal,
        this.modifierExtension,
        this.valueBoolean,
        this.valueCoding,
        this.valueString,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Property1 withCode(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        value,
        this.id,
        this.valueCode,
        this.valueDecimal,
        this.modifierExtension,
        this.valueBoolean,
        this.valueCoding,
        this.valueString,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        newValue,
        this.valueCode,
        this.valueDecimal,
        this.modifierExtension,
        this.valueBoolean,
        this.valueCoding,
        this.valueString,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        value,
        this.valueCode,
        this.valueDecimal,
        this.modifierExtension,
        this.valueBoolean,
        this.valueCoding,
        this.valueString,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#valueCode() valueCode} attribute.
   * @param value The value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueCode(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueCode");
    if (java.util.Objects.equals(this.valueCode, newValue)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        this.id,
        newValue,
        this.valueDecimal,
        this.modifierExtension,
        this.valueBoolean,
        this.valueCoding,
        this.valueString,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#valueCode() valueCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueCode(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueCode, value)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        this.id,
        value,
        this.valueDecimal,
        this.modifierExtension,
        this.valueBoolean,
        this.valueCoding,
        this.valueString,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#valueDecimal() valueDecimal} attribute.
   * @param value The value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueDecimal(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.valueDecimal, newValue)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        this.id,
        this.valueCode,
        newValue,
        this.modifierExtension,
        this.valueBoolean,
        this.valueCoding,
        this.valueString,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#valueDecimal() valueDecimal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueDecimal(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueDecimal, value)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        this.id,
        this.valueCode,
        value,
        this.modifierExtension,
        this.valueBoolean,
        this.valueCoding,
        this.valueString,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        this.id,
        this.valueCode,
        this.valueDecimal,
        newValue,
        this.valueBoolean,
        this.valueCoding,
        this.valueString,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Property1 withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        this.id,
        this.valueCode,
        this.valueDecimal,
        value,
        this.valueBoolean,
        this.valueCoding,
        this.valueString,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueBoolean(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        this.id,
        this.valueCode,
        this.valueDecimal,
        this.modifierExtension,
        newValue,
        this.valueCoding,
        this.valueString,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueBoolean(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        this.id,
        this.valueCode,
        this.valueDecimal,
        this.modifierExtension,
        value,
        this.valueCoding,
        this.valueString,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#valueCoding() valueCoding} attribute.
   * @param value The value for valueCoding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueCoding(com.fhir.Coding value) {
    @javax.annotation.Nullable com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "valueCoding");
    if (this.valueCoding == newValue) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        this.id,
        this.valueCode,
        this.valueDecimal,
        this.modifierExtension,
        this.valueBoolean,
        newValue,
        this.valueString,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#valueCoding() valueCoding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCoding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Property1 withValueCoding(java.util.Optional<? extends com.fhir.Coding> optional) {
    @javax.annotation.Nullable com.fhir.Coding value = optional.orElse(null);
    if (this.valueCoding == value) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        this.id,
        this.valueCode,
        this.valueDecimal,
        this.modifierExtension,
        this.valueBoolean,
        value,
        this.valueString,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueString");
    if (java.util.Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        this.id,
        this.valueCode,
        this.valueDecimal,
        this.modifierExtension,
        this.valueBoolean,
        this.valueCoding,
        newValue,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueString, value)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        this.id,
        this.valueCode,
        this.valueDecimal,
        this.modifierExtension,
        this.valueBoolean,
        this.valueCoding,
        value,
        this.valueInteger,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#valueInteger() valueInteger} attribute.
   * @param value The value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueInteger(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.valueInteger, newValue)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        this.id,
        this.valueCode,
        this.valueDecimal,
        this.modifierExtension,
        this.valueBoolean,
        this.valueCoding,
        this.valueString,
        newValue,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#valueInteger() valueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueInteger(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueInteger, value)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        this.id,
        this.valueCode,
        this.valueDecimal,
        this.modifierExtension,
        this.valueBoolean,
        this.valueCoding,
        this.valueString,
        value,
        this.valueDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#valueDateTime() valueDateTime} attribute.
   * @param value The value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueDateTime");
    if (java.util.Objects.equals(this.valueDateTime, newValue)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        this.id,
        this.valueCode,
        this.valueDecimal,
        this.modifierExtension,
        this.valueBoolean,
        this.valueCoding,
        this.valueString,
        this.valueInteger,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#valueDateTime() valueDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueDateTime, value)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.code,
        this.id,
        this.valueCode,
        this.valueDecimal,
        this.modifierExtension,
        this.valueBoolean,
        this.valueCoding,
        this.valueString,
        this.valueInteger,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCodeSystem_Property1} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCodeSystem_Property1
        && equalTo((ImmutableCodeSystem_Property1) another);
  }

  private boolean equalTo(ImmutableCodeSystem_Property1 another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(valueCode, another.valueCode)
        && java.util.Objects.equals(valueDecimal, another.valueDecimal)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(valueBoolean, another.valueBoolean)
        && java.util.Objects.equals(valueCoding, another.valueCoding)
        && java.util.Objects.equals(valueString, another.valueString)
        && java.util.Objects.equals(valueInteger, another.valueInteger)
        && java.util.Objects.equals(valueDateTime, another.valueDateTime);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code code}, {@code id}, {@code valueCode}, {@code valueDecimal}, {@code modifierExtension}, {@code valueBoolean}, {@code valueCoding}, {@code valueString}, {@code valueInteger}, {@code valueDateTime}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(valueCode);
    h += (h << 5) + java.util.Objects.hashCode(valueDecimal);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(valueBoolean);
    h += (h << 5) + java.util.Objects.hashCode(valueCoding);
    h += (h << 5) + java.util.Objects.hashCode(valueString);
    h += (h << 5) + java.util.Objects.hashCode(valueInteger);
    h += (h << 5) + java.util.Objects.hashCode(valueDateTime);
    return h;
  }

  /**
   * Prints the immutable value {@code CodeSystem_Property1} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CodeSystem_Property1{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (code != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (valueCode != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueCode=").append(valueCode);
    }
    if (valueDecimal != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueDecimal=").append(valueDecimal);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (valueBoolean != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (valueCoding != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueCoding=").append(valueCoding);
    }
    if (valueString != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (valueInteger != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueInteger=").append(valueInteger);
    }
    if (valueDateTime != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueDateTime=").append(valueDateTime);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CodeSystem_Property1", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CodeSystem_Property1 {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueCode = java.util.Optional.empty();
    boolean valueCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> valueDecimal = java.util.Optional.empty();
    boolean valueDecimalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> valueBoolean = java.util.Optional.empty();
    boolean valueBooleanIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Coding> valueCoding = java.util.Optional.empty();
    boolean valueCodingIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueString = java.util.Optional.empty();
    boolean valueStringIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> valueInteger = java.util.Optional.empty();
    boolean valueIntegerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueDateTime = java.util.Optional.empty();
    boolean valueDateTimeIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueCode")
    public void setValueCode(java.util.Optional<java.lang.String> valueCode) {
      this.valueCode = valueCode;
      this.valueCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueDecimal")
    public void setValueDecimal(java.util.Optional<java.lang.Double> valueDecimal) {
      this.valueDecimal = valueDecimal;
      this.valueDecimalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueBoolean")
    public void setValueBoolean(java.util.Optional<java.lang.Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueCoding")
    public void setValueCoding(java.util.Optional<com.fhir.Coding> valueCoding) {
      this.valueCoding = valueCoding;
      this.valueCodingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueString")
    public void setValueString(java.util.Optional<java.lang.String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueInteger")
    public void setValueInteger(java.util.Optional<java.lang.Double> valueInteger) {
      this.valueInteger = valueInteger;
      this.valueIntegerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueDateTime")
    public void setValueDateTime(java.util.Optional<java.lang.String> valueDateTime) {
      this.valueDateTime = valueDateTime;
      this.valueDateTimeIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Double> valueDecimal() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Coding> valueCoding() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Double> valueInteger() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueDateTime() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCodeSystem_Property1 fromJson(Json json) {
    ImmutableCodeSystem_Property1.Builder builder = ImmutableCodeSystem_Property1.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.valueCodeIsSet) {
      builder.valueCode(json.valueCode);
    }
    if (json.valueDecimalIsSet) {
      builder.valueDecimal(json.valueDecimal);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.valueCodingIsSet) {
      builder.valueCoding(json.valueCoding);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.valueIntegerIsSet) {
      builder.valueInteger(json.valueInteger);
    }
    if (json.valueDateTimeIsSet) {
      builder.valueDateTime(json.valueDateTime);
    }
    return (ImmutableCodeSystem_Property1) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CodeSystem_Property1} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CodeSystem_Property1 instance
   */
  public static CodeSystem_Property1 copyOf(CodeSystem_Property1 instance) {
    if (instance instanceof ImmutableCodeSystem_Property1) {
      return (ImmutableCodeSystem_Property1) instance;
    }
    return ImmutableCodeSystem_Property1.builder()
        .extension(instance.extension())
        .code(instance.code())
        .id(instance.id())
        .valueCode(instance.valueCode())
        .valueDecimal(instance.valueDecimal())
        .modifierExtension(instance.modifierExtension())
        .valueBoolean(instance.valueBoolean())
        .valueCoding(instance.valueCoding())
        .valueString(instance.valueString())
        .valueInteger(instance.valueInteger())
        .valueDateTime(instance.valueDateTime())
        .build();
  }

  /**
   * Creates a builder for {@link CodeSystem_Property1 CodeSystem_Property1}.
   * <pre>
   * ImmutableCodeSystem_Property1.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CodeSystem_Property1#extension() extension}
   *    .code(com.fhir.code) // optional {@link CodeSystem_Property1#code() code}
   *    .id(String) // optional {@link CodeSystem_Property1#id() id}
   *    .valueCode(String) // optional {@link CodeSystem_Property1#valueCode() valueCode}
   *    .valueDecimal(Double) // optional {@link CodeSystem_Property1#valueDecimal() valueDecimal}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CodeSystem_Property1#modifierExtension() modifierExtension}
   *    .valueBoolean(Boolean) // optional {@link CodeSystem_Property1#valueBoolean() valueBoolean}
   *    .valueCoding(com.fhir.Coding) // optional {@link CodeSystem_Property1#valueCoding() valueCoding}
   *    .valueString(String) // optional {@link CodeSystem_Property1#valueString() valueString}
   *    .valueInteger(Double) // optional {@link CodeSystem_Property1#valueInteger() valueInteger}
   *    .valueDateTime(String) // optional {@link CodeSystem_Property1#valueDateTime() valueDateTime}
   *    .build();
   * </pre>
   * @return A new CodeSystem_Property1 builder
   */
  public static ImmutableCodeSystem_Property1.Builder builder() {
    return new ImmutableCodeSystem_Property1.Builder();
  }

  /**
   * Builds instances of type {@link CodeSystem_Property1 CodeSystem_Property1}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CodeSystem_Property1", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_CODE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_VALUE_CODE = 0x8L;
    private static final long OPT_BIT_VALUE_DECIMAL = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x40L;
    private static final long OPT_BIT_VALUE_CODING = 0x80L;
    private static final long OPT_BIT_VALUE_STRING = 0x100L;
    private static final long OPT_BIT_VALUE_INTEGER = 0x200L;
    private static final long OPT_BIT_VALUE_DATE_TIME = 0x400L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code code;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String valueCode;
    private @javax.annotation.Nullable java.lang.Double valueDecimal;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.Boolean valueBoolean;
    private @javax.annotation.Nullable com.fhir.Coding valueCoding;
    private @javax.annotation.Nullable java.lang.String valueString;
    private @javax.annotation.Nullable java.lang.Double valueInteger;
    private @javax.annotation.Nullable java.lang.String valueDateTime;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem_Property1#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem_Property1#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem_Property1#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem_Property1#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCode(java.lang.String valueCode) {
      checkNotIsSet(valueCodeIsSet(), "valueCode");
      this.valueCode = java.util.Objects.requireNonNull(valueCode, "valueCode");
      optBits |= OPT_BIT_VALUE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueCode")
    public final Builder valueCode(java.util.Optional<java.lang.String> valueCode) {
      checkNotIsSet(valueCodeIsSet(), "valueCode");
      this.valueCode = valueCode.orElse(null);
      optBits |= OPT_BIT_VALUE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#valueDecimal() valueDecimal} to valueDecimal.
     * @param valueDecimal The value for valueDecimal
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDecimal(double valueDecimal) {
      checkNotIsSet(valueDecimalIsSet(), "valueDecimal");
      this.valueDecimal = valueDecimal;
      optBits |= OPT_BIT_VALUE_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#valueDecimal() valueDecimal} to valueDecimal.
     * @param valueDecimal The value for valueDecimal
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueDecimal")
    public final Builder valueDecimal(java.util.Optional<java.lang.Double> valueDecimal) {
      checkNotIsSet(valueDecimalIsSet(), "valueDecimal");
      this.valueDecimal = valueDecimal.orElse(null);
      optBits |= OPT_BIT_VALUE_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem_Property1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem_Property1#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueBoolean(boolean valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean;
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueBoolean")
    public final Builder valueBoolean(java.util.Optional<java.lang.Boolean> valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean.orElse(null);
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#valueCoding() valueCoding} to valueCoding.
     * @param valueCoding The value for valueCoding
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCoding(com.fhir.Coding valueCoding) {
      checkNotIsSet(valueCodingIsSet(), "valueCoding");
      this.valueCoding = java.util.Objects.requireNonNull(valueCoding, "valueCoding");
      optBits |= OPT_BIT_VALUE_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#valueCoding() valueCoding} to valueCoding.
     * @param valueCoding The value for valueCoding
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueCoding")
    public final Builder valueCoding(java.util.Optional<? extends com.fhir.Coding> valueCoding) {
      checkNotIsSet(valueCodingIsSet(), "valueCoding");
      this.valueCoding = valueCoding.orElse(null);
      optBits |= OPT_BIT_VALUE_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueString(java.lang.String valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = java.util.Objects.requireNonNull(valueString, "valueString");
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueString")
    public final Builder valueString(java.util.Optional<java.lang.String> valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = valueString.orElse(null);
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueInteger(double valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger;
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueInteger")
    public final Builder valueInteger(java.util.Optional<java.lang.Double> valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger.orElse(null);
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDateTime(java.lang.String valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = java.util.Objects.requireNonNull(valueDateTime, "valueDateTime");
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueDateTime")
    public final Builder valueDateTime(java.util.Optional<java.lang.String> valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = valueDateTime.orElse(null);
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Builds a new {@link CodeSystem_Property1 CodeSystem_Property1}.
     * @return An immutable instance of CodeSystem_Property1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CodeSystem_Property1 build() {
      return new ImmutableCodeSystem_Property1(
          extension,
          code,
          id,
          valueCode,
          valueDecimal,
          modifierExtension,
          valueBoolean,
          valueCoding,
          valueString,
          valueInteger,
          valueDateTime);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueCodeIsSet() {
      return (optBits & OPT_BIT_VALUE_CODE) != 0;
    }

    private boolean valueDecimalIsSet() {
      return (optBits & OPT_BIT_VALUE_DECIMAL) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean valueCodingIsSet() {
      return (optBits & OPT_BIT_VALUE_CODING) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean valueIntegerIsSet() {
      return (optBits & OPT_BIT_VALUE_INTEGER) != 0;
    }

    private boolean valueDateTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE_TIME) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CodeSystem_Property1 is strict, attribute is already set: ".concat(name));
    }
  }
}
