//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ValueSet_Contains}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableValueSet_Contains.builder()}.
 */
@org.immutables.value.Generated(from = "ValueSet_Contains", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableValueSet_Contains implements com.fhir.ValueSet_Contains {
  private final @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Contains> contains;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String display;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.Boolean _abstract;
  private final @javax.annotation.Nullable com.fhir.code code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Designation> designation;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.lang.Boolean inactive;
  private final @javax.annotation.Nullable com.fhir.uri system;

  private ImmutableValueSet_Contains(
      @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Contains> contains,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String display,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.Boolean _abstract,
      @javax.annotation.Nullable com.fhir.code code,
      @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Designation> designation,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.lang.Boolean inactive,
      @javax.annotation.Nullable com.fhir.uri system) {
    this.contains = contains;
    this.modifierExtension = modifierExtension;
    this.display = display;
    this.extension = extension;
    this._abstract = _abstract;
    this.code = code;
    this.designation = designation;
    this.id = id;
    this.version = version;
    this.inactive = inactive;
    this.system = system;
  }

  /**
   * @return The value of the {@code contains} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contains")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ValueSet_Contains>> contains() {
    return java.util.Optional.ofNullable(contains);
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
   * @return The value of the {@code display} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("display")
  @Override
  public java.util.Optional<java.lang.String> display() {
    return java.util.Optional.ofNullable(display);
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
   * @return The value of the {@code _abstract} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("abstract")
  @Override
  public java.util.Optional<java.lang.Boolean> _abstract() {
    return java.util.Optional.ofNullable(_abstract);
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
   * @return The value of the {@code designation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("designation")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ValueSet_Designation>> designation() {
    return java.util.Optional.ofNullable(designation);
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
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.lang.String> version() {
    return java.util.Optional.ofNullable(version);
  }

  /**
   * @return The value of the {@code inactive} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("inactive")
  @Override
  public java.util.Optional<java.lang.Boolean> inactive() {
    return java.util.Optional.ofNullable(inactive);
  }

  /**
   * @return The value of the {@code system} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("system")
  @Override
  public java.util.Optional<com.fhir.uri> system() {
    return java.util.Optional.ofNullable(system);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#contains() contains} attribute.
   * @param value The value for contains
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withContains(java.util.List<com.fhir.ValueSet_Contains> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Contains> newValue = java.util.Objects.requireNonNull(value, "contains");
    if (this.contains == newValue) return this;
    return new ImmutableValueSet_Contains(
        newValue,
        this.modifierExtension,
        this.display,
        this.extension,
        this._abstract,
        this.code,
        this.designation,
        this.id,
        this.version,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#contains() contains} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contains
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Contains withContains(java.util.Optional<? extends java.util.List<com.fhir.ValueSet_Contains>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Contains> value = optional.orElse(null);
    if (this.contains == value) return this;
    return new ImmutableValueSet_Contains(
        value,
        this.modifierExtension,
        this.display,
        this.extension,
        this._abstract,
        this.code,
        this.designation,
        this.id,
        this.version,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        newValue,
        this.display,
        this.extension,
        this._abstract,
        this.code,
        this.designation,
        this.id,
        this.version,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Contains withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        value,
        this.display,
        this.extension,
        this._abstract,
        this.code,
        this.designation,
        this.id,
        this.version,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#display() display} attribute.
   * @param value The value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withDisplay(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "display");
    if (java.util.Objects.equals(this.display, newValue)) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        newValue,
        this.extension,
        this._abstract,
        this.code,
        this.designation,
        this.id,
        this.version,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#display() display} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withDisplay(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.display, value)) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        value,
        this.extension,
        this._abstract,
        this.code,
        this.designation,
        this.id,
        this.version,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        this.display,
        newValue,
        this._abstract,
        this.code,
        this.designation,
        this.id,
        this.version,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Contains withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        this.display,
        value,
        this._abstract,
        this.code,
        this.designation,
        this.id,
        this.version,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#_abstract() _abstract} attribute.
   * @param value The value for _abstract
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains with_abstract(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this._abstract, newValue)) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        this.display,
        this.extension,
        newValue,
        this.code,
        this.designation,
        this.id,
        this.version,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#_abstract() _abstract} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _abstract
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains with_abstract(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this._abstract, value)) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        this.display,
        this.extension,
        value,
        this.code,
        this.designation,
        this.id,
        this.version,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withCode(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        this.display,
        this.extension,
        this._abstract,
        newValue,
        this.designation,
        this.id,
        this.version,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Contains withCode(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        this.display,
        this.extension,
        this._abstract,
        value,
        this.designation,
        this.id,
        this.version,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#designation() designation} attribute.
   * @param value The value for designation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withDesignation(java.util.List<com.fhir.ValueSet_Designation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Designation> newValue = java.util.Objects.requireNonNull(value, "designation");
    if (this.designation == newValue) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        this.display,
        this.extension,
        this._abstract,
        this.code,
        newValue,
        this.id,
        this.version,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#designation() designation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for designation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Contains withDesignation(java.util.Optional<? extends java.util.List<com.fhir.ValueSet_Designation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Designation> value = optional.orElse(null);
    if (this.designation == value) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        this.display,
        this.extension,
        this._abstract,
        this.code,
        value,
        this.id,
        this.version,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        this.display,
        this.extension,
        this._abstract,
        this.code,
        this.designation,
        newValue,
        this.version,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        this.display,
        this.extension,
        this._abstract,
        this.code,
        this.designation,
        value,
        this.version,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        this.display,
        this.extension,
        this._abstract,
        this.code,
        this.designation,
        this.id,
        newValue,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        this.display,
        this.extension,
        this._abstract,
        this.code,
        this.designation,
        this.id,
        value,
        this.inactive,
        this.system);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#inactive() inactive} attribute.
   * @param value The value for inactive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withInactive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.inactive, newValue)) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        this.display,
        this.extension,
        this._abstract,
        this.code,
        this.designation,
        this.id,
        this.version,
        newValue,
        this.system);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#inactive() inactive} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for inactive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withInactive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.inactive, value)) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        this.display,
        this.extension,
        this._abstract,
        this.code,
        this.designation,
        this.id,
        this.version,
        value,
        this.system);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withSystem(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "system");
    if (this.system == newValue) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        this.display,
        this.extension,
        this._abstract,
        this.code,
        this.designation,
        this.id,
        this.version,
        this.inactive,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#system() system} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Contains withSystem(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.system == value) return this;
    return new ImmutableValueSet_Contains(
        this.contains,
        this.modifierExtension,
        this.display,
        this.extension,
        this._abstract,
        this.code,
        this.designation,
        this.id,
        this.version,
        this.inactive,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableValueSet_Contains} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableValueSet_Contains
        && equalTo((ImmutableValueSet_Contains) another);
  }

  private boolean equalTo(ImmutableValueSet_Contains another) {
    return java.util.Objects.equals(contains, another.contains)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(display, another.display)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(_abstract, another._abstract)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(designation, another.designation)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(inactive, another.inactive)
        && java.util.Objects.equals(system, another.system);
  }

  /**
   * Computes a hash code from attributes: {@code contains}, {@code modifierExtension}, {@code display}, {@code extension}, {@code _abstract}, {@code code}, {@code designation}, {@code id}, {@code version}, {@code inactive}, {@code system}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(contains);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(display);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(_abstract);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(designation);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(inactive);
    h += (h << 5) + java.util.Objects.hashCode(system);
    return h;
  }

  /**
   * Prints the immutable value {@code ValueSet_Contains} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ValueSet_Contains{");
    if (contains != null) {
      builder.append("contains=").append(contains);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (display != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("display=").append(display);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (_abstract != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("_abstract=").append(_abstract);
    }
    if (code != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (designation != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("designation=").append(designation);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (version != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (inactive != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("inactive=").append(inactive);
    }
    if (system != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("system=").append(system);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ValueSet_Contains", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ValueSet_Contains {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ValueSet_Contains>> contains = java.util.Optional.empty();
    boolean containsIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> display = java.util.Optional.empty();
    boolean displayIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> _abstract = java.util.Optional.empty();
    boolean _abstractIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ValueSet_Designation>> designation = java.util.Optional.empty();
    boolean designationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> inactive = java.util.Optional.empty();
    boolean inactiveIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> system = java.util.Optional.empty();
    boolean systemIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("contains")
    public void setContains(java.util.Optional<java.util.List<com.fhir.ValueSet_Contains>> contains) {
      this.contains = contains;
      this.containsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    public void setDisplay(java.util.Optional<java.lang.String> display) {
      this.display = display;
      this.displayIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("abstract")
    public void set_abstract(java.util.Optional<java.lang.Boolean> _abstract) {
      this._abstract = _abstract;
      this._abstractIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("designation")
    public void setDesignation(java.util.Optional<java.util.List<com.fhir.ValueSet_Designation>> designation) {
      this.designation = designation;
      this.designationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("inactive")
    public void setInactive(java.util.Optional<java.lang.Boolean> inactive) {
      this.inactive = inactive;
      this.inactiveIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("system")
    public void setSystem(java.util.Optional<com.fhir.uri> system) {
      this.system = system;
      this.systemIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ValueSet_Contains>> contains() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> display() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> _abstract() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ValueSet_Designation>> designation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> inactive() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> system() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableValueSet_Contains fromJson(Json json) {
    ImmutableValueSet_Contains.Builder builder = ImmutableValueSet_Contains.builder();
    if (json.containsIsSet) {
      builder.contains(json.contains);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.displayIsSet) {
      builder.display(json.display);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json._abstractIsSet) {
      builder._abstract(json._abstract);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.designationIsSet) {
      builder.designation(json.designation);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.inactiveIsSet) {
      builder.inactive(json.inactive);
    }
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    return (ImmutableValueSet_Contains) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ValueSet_Contains} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ValueSet_Contains instance
   */
  public static ValueSet_Contains copyOf(ValueSet_Contains instance) {
    if (instance instanceof ImmutableValueSet_Contains) {
      return (ImmutableValueSet_Contains) instance;
    }
    return ImmutableValueSet_Contains.builder()
        .contains(instance.contains())
        .modifierExtension(instance.modifierExtension())
        .display(instance.display())
        .extension(instance.extension())
        ._abstract(instance._abstract())
        .code(instance.code())
        .designation(instance.designation())
        .id(instance.id())
        .version(instance.version())
        .inactive(instance.inactive())
        .system(instance.system())
        .build();
  }

  /**
   * Creates a builder for {@link ValueSet_Contains ValueSet_Contains}.
   * <pre>
   * ImmutableValueSet_Contains.builder()
   *    .contains(List&amp;lt;com.fhir.ValueSet_Contains&amp;gt;) // optional {@link ValueSet_Contains#contains() contains}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ValueSet_Contains#modifierExtension() modifierExtension}
   *    .display(String) // optional {@link ValueSet_Contains#display() display}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ValueSet_Contains#extension() extension}
   *    ._abstract(Boolean) // optional {@link ValueSet_Contains#_abstract() _abstract}
   *    .code(com.fhir.code) // optional {@link ValueSet_Contains#code() code}
   *    .designation(List&amp;lt;com.fhir.ValueSet_Designation&amp;gt;) // optional {@link ValueSet_Contains#designation() designation}
   *    .id(String) // optional {@link ValueSet_Contains#id() id}
   *    .version(String) // optional {@link ValueSet_Contains#version() version}
   *    .inactive(Boolean) // optional {@link ValueSet_Contains#inactive() inactive}
   *    .system(com.fhir.uri) // optional {@link ValueSet_Contains#system() system}
   *    .build();
   * </pre>
   * @return A new ValueSet_Contains builder
   */
  public static ImmutableValueSet_Contains.Builder builder() {
    return new ImmutableValueSet_Contains.Builder();
  }

  /**
   * Builds instances of type {@link ValueSet_Contains ValueSet_Contains}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ValueSet_Contains", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_CONTAINS = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_DISPLAY = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT__ABSTRACT = 0x10L;
    private static final long OPT_BIT_CODE = 0x20L;
    private static final long OPT_BIT_DESIGNATION = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_VERSION = 0x100L;
    private static final long OPT_BIT_INACTIVE = 0x200L;
    private static final long OPT_BIT_SYSTEM = 0x400L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Contains> contains;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String display;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.Boolean _abstract;
    private @javax.annotation.Nullable com.fhir.code code;
    private @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Designation> designation;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.lang.Boolean inactive;
    private @javax.annotation.Nullable com.fhir.uri system;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#contains() contains} to contains.
     * @param contains The value for contains
     * @return {@code this} builder for chained invocation
     */
    public final Builder contains(java.util.List<com.fhir.ValueSet_Contains> contains) {
      checkNotIsSet(containsIsSet(), "contains");
      this.contains = java.util.Objects.requireNonNull(contains, "contains");
      optBits |= OPT_BIT_CONTAINS;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#contains() contains} to contains.
     * @param contains The value for contains
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contains")
    public final Builder contains(java.util.Optional<? extends java.util.List<com.fhir.ValueSet_Contains>> contains) {
      checkNotIsSet(containsIsSet(), "contains");
      this.contains = contains.orElse(null);
      optBits |= OPT_BIT_CONTAINS;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ValueSet_Contains#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ValueSet_Contains#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for chained invocation
     */
    public final Builder display(java.lang.String display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = java.util.Objects.requireNonNull(display, "display");
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    public final Builder display(java.util.Optional<java.lang.String> display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = display.orElse(null);
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Contains#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Contains#_abstract() _abstract} to _abstract.
     * @param _abstract The value for _abstract
     * @return {@code this} builder for chained invocation
     */
    public final Builder _abstract(boolean _abstract) {
      checkNotIsSet(_abstractIsSet(), "_abstract");
      this._abstract = _abstract;
      optBits |= OPT_BIT__ABSTRACT;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#_abstract() _abstract} to _abstract.
     * @param _abstract The value for _abstract
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("abstract")
    public final Builder _abstract(java.util.Optional<java.lang.Boolean> _abstract) {
      checkNotIsSet(_abstractIsSet(), "_abstract");
      this._abstract = _abstract.orElse(null);
      optBits |= OPT_BIT__ABSTRACT;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#code() code} to code.
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
     * Initializes the optional value {@link ValueSet_Contains#code() code} to code.
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
     * Initializes the optional value {@link ValueSet_Contains#designation() designation} to designation.
     * @param designation The value for designation
     * @return {@code this} builder for chained invocation
     */
    public final Builder designation(java.util.List<com.fhir.ValueSet_Designation> designation) {
      checkNotIsSet(designationIsSet(), "designation");
      this.designation = java.util.Objects.requireNonNull(designation, "designation");
      optBits |= OPT_BIT_DESIGNATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#designation() designation} to designation.
     * @param designation The value for designation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("designation")
    public final Builder designation(java.util.Optional<? extends java.util.List<com.fhir.ValueSet_Designation>> designation) {
      checkNotIsSet(designationIsSet(), "designation");
      this.designation = designation.orElse(null);
      optBits |= OPT_BIT_DESIGNATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#id() id} to id.
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
     * Initializes the optional value {@link ValueSet_Contains#id() id} to id.
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
     * Initializes the optional value {@link ValueSet_Contains#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(java.lang.String version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = java.util.Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public final Builder version(java.util.Optional<java.lang.String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#inactive() inactive} to inactive.
     * @param inactive The value for inactive
     * @return {@code this} builder for chained invocation
     */
    public final Builder inactive(boolean inactive) {
      checkNotIsSet(inactiveIsSet(), "inactive");
      this.inactive = inactive;
      optBits |= OPT_BIT_INACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#inactive() inactive} to inactive.
     * @param inactive The value for inactive
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inactive")
    public final Builder inactive(java.util.Optional<java.lang.Boolean> inactive) {
      checkNotIsSet(inactiveIsSet(), "inactive");
      this.inactive = inactive.orElse(null);
      optBits |= OPT_BIT_INACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    public final Builder system(com.fhir.uri system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = java.util.Objects.requireNonNull(system, "system");
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("system")
    public final Builder system(java.util.Optional<? extends com.fhir.uri> system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system.orElse(null);
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Builds a new {@link ValueSet_Contains ValueSet_Contains}.
     * @return An immutable instance of ValueSet_Contains
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ValueSet_Contains build() {
      return new ImmutableValueSet_Contains(
          contains,
          modifierExtension,
          display,
          extension,
          _abstract,
          code,
          designation,
          id,
          version,
          inactive,
          system);
    }

    private boolean containsIsSet() {
      return (optBits & OPT_BIT_CONTAINS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean displayIsSet() {
      return (optBits & OPT_BIT_DISPLAY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean _abstractIsSet() {
      return (optBits & OPT_BIT__ABSTRACT) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean designationIsSet() {
      return (optBits & OPT_BIT_DESIGNATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean inactiveIsSet() {
      return (optBits & OPT_BIT_INACTIVE) != 0;
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ValueSet_Contains is strict, attribute is already set: ".concat(name));
    }
  }
}
