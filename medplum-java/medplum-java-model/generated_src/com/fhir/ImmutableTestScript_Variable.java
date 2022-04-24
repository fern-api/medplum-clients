//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link TestScript_Variable}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript_Variable.builder()}.
 */
@org.immutables.value.Generated(from = "TestScript_Variable", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript_Variable implements com.fhir.TestScript_Variable {
  private final @javax.annotation.Nullable com.fhir.id sourceId;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.lang.String headerField;
  private final @javax.annotation.Nullable java.lang.String expression;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.lang.String defaultValue;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String hint;
  private final @javax.annotation.Nullable java.lang.String path;

  private ImmutableTestScript_Variable(
      @javax.annotation.Nullable com.fhir.id sourceId,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.lang.String headerField,
      @javax.annotation.Nullable java.lang.String expression,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.lang.String defaultValue,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String hint,
      @javax.annotation.Nullable java.lang.String path) {
    this.sourceId = sourceId;
    this.id = id;
    this.description = description;
    this.headerField = headerField;
    this.expression = expression;
    this.name = name;
    this.defaultValue = defaultValue;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.hint = hint;
    this.path = path;
  }

  /**
   * @return The value of the {@code sourceId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
  @Override
  public java.util.Optional<com.fhir.id> sourceId() {
    return java.util.Optional.ofNullable(sourceId);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code headerField} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("headerField")
  @Override
  public java.util.Optional<java.lang.String> headerField() {
    return java.util.Optional.ofNullable(headerField);
  }

  /**
   * @return The value of the {@code expression} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("expression")
  @Override
  public java.util.Optional<java.lang.String> expression() {
    return java.util.Optional.ofNullable(expression);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code defaultValue} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
  @Override
  public java.util.Optional<java.lang.String> defaultValue() {
    return java.util.Optional.ofNullable(defaultValue);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code hint} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("hint")
  @Override
  public java.util.Optional<java.lang.String> hint() {
    return java.util.Optional.ofNullable(hint);
  }

  /**
   * @return The value of the {@code path} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("path")
  @Override
  public java.util.Optional<java.lang.String> path() {
    return java.util.Optional.ofNullable(path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#sourceId() sourceId} attribute.
   * @param value The value for sourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withSourceId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "sourceId");
    if (this.sourceId == newValue) return this;
    return new ImmutableTestScript_Variable(
        newValue,
        this.id,
        this.description,
        this.headerField,
        this.expression,
        this.name,
        this.defaultValue,
        this.extension,
        this.modifierExtension,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#sourceId() sourceId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Variable withSourceId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.sourceId == value) return this;
    return new ImmutableTestScript_Variable(
        value,
        this.id,
        this.description,
        this.headerField,
        this.expression,
        this.name,
        this.defaultValue,
        this.extension,
        this.modifierExtension,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        newValue,
        this.description,
        this.headerField,
        this.expression,
        this.name,
        this.defaultValue,
        this.extension,
        this.modifierExtension,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        value,
        this.description,
        this.headerField,
        this.expression,
        this.name,
        this.defaultValue,
        this.extension,
        this.modifierExtension,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        newValue,
        this.headerField,
        this.expression,
        this.name,
        this.defaultValue,
        this.extension,
        this.modifierExtension,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        value,
        this.headerField,
        this.expression,
        this.name,
        this.defaultValue,
        this.extension,
        this.modifierExtension,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#headerField() headerField} attribute.
   * @param value The value for headerField
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withHeaderField(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "headerField");
    if (java.util.Objects.equals(this.headerField, newValue)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        this.description,
        newValue,
        this.expression,
        this.name,
        this.defaultValue,
        this.extension,
        this.modifierExtension,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#headerField() headerField} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for headerField
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withHeaderField(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.headerField, value)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        this.description,
        value,
        this.expression,
        this.name,
        this.defaultValue,
        this.extension,
        this.modifierExtension,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#expression() expression} attribute.
   * @param value The value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withExpression(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "expression");
    if (java.util.Objects.equals(this.expression, newValue)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        this.description,
        this.headerField,
        newValue,
        this.name,
        this.defaultValue,
        this.extension,
        this.modifierExtension,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#expression() expression} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withExpression(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.expression, value)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        this.description,
        this.headerField,
        value,
        this.name,
        this.defaultValue,
        this.extension,
        this.modifierExtension,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        this.description,
        this.headerField,
        this.expression,
        newValue,
        this.defaultValue,
        this.extension,
        this.modifierExtension,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        this.description,
        this.headerField,
        this.expression,
        value,
        this.defaultValue,
        this.extension,
        this.modifierExtension,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#defaultValue() defaultValue} attribute.
   * @param value The value for defaultValue
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withDefaultValue(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "defaultValue");
    if (java.util.Objects.equals(this.defaultValue, newValue)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        this.description,
        this.headerField,
        this.expression,
        this.name,
        newValue,
        this.extension,
        this.modifierExtension,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#defaultValue() defaultValue} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValue
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withDefaultValue(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValue, value)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        this.description,
        this.headerField,
        this.expression,
        this.name,
        value,
        this.extension,
        this.modifierExtension,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        this.description,
        this.headerField,
        this.expression,
        this.name,
        this.defaultValue,
        newValue,
        this.modifierExtension,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Variable withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        this.description,
        this.headerField,
        this.expression,
        this.name,
        this.defaultValue,
        value,
        this.modifierExtension,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        this.description,
        this.headerField,
        this.expression,
        this.name,
        this.defaultValue,
        this.extension,
        newValue,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Variable withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        this.description,
        this.headerField,
        this.expression,
        this.name,
        this.defaultValue,
        this.extension,
        value,
        this.hint,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#hint() hint} attribute.
   * @param value The value for hint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withHint(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "hint");
    if (java.util.Objects.equals(this.hint, newValue)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        this.description,
        this.headerField,
        this.expression,
        this.name,
        this.defaultValue,
        this.extension,
        this.modifierExtension,
        newValue,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#hint() hint} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withHint(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.hint, value)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        this.description,
        this.headerField,
        this.expression,
        this.name,
        this.defaultValue,
        this.extension,
        this.modifierExtension,
        value,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#path() path} attribute.
   * @param value The value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withPath(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "path");
    if (java.util.Objects.equals(this.path, newValue)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        this.description,
        this.headerField,
        this.expression,
        this.name,
        this.defaultValue,
        this.extension,
        this.modifierExtension,
        this.hint,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#path() path} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withPath(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.path, value)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.id,
        this.description,
        this.headerField,
        this.expression,
        this.name,
        this.defaultValue,
        this.extension,
        this.modifierExtension,
        this.hint,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript_Variable} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript_Variable
        && equalTo((ImmutableTestScript_Variable) another);
  }

  private boolean equalTo(ImmutableTestScript_Variable another) {
    return java.util.Objects.equals(sourceId, another.sourceId)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(headerField, another.headerField)
        && java.util.Objects.equals(expression, another.expression)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(defaultValue, another.defaultValue)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(hint, another.hint)
        && java.util.Objects.equals(path, another.path);
  }

  /**
   * Computes a hash code from attributes: {@code sourceId}, {@code id}, {@code description}, {@code headerField}, {@code expression}, {@code name}, {@code defaultValue}, {@code extension}, {@code modifierExtension}, {@code hint}, {@code path}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(sourceId);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(headerField);
    h += (h << 5) + java.util.Objects.hashCode(expression);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(defaultValue);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(hint);
    h += (h << 5) + java.util.Objects.hashCode(path);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript_Variable} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("TestScript_Variable{");
    if (sourceId != null) {
      builder.append("sourceId=").append(sourceId);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (description != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (headerField != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("headerField=").append(headerField);
    }
    if (expression != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("expression=").append(expression);
    }
    if (name != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (defaultValue != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValue=").append(defaultValue);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (hint != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("hint=").append(hint);
    }
    if (path != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("path=").append(path);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "TestScript_Variable", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.TestScript_Variable {
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> sourceId = java.util.Optional.empty();
    boolean sourceIdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> headerField = java.util.Optional.empty();
    boolean headerFieldIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> expression = java.util.Optional.empty();
    boolean expressionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> defaultValue = java.util.Optional.empty();
    boolean defaultValueIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> hint = java.util.Optional.empty();
    boolean hintIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> path = java.util.Optional.empty();
    boolean pathIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    public void setSourceId(java.util.Optional<com.fhir.id> sourceId) {
      this.sourceId = sourceId;
      this.sourceIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("headerField")
    public void setHeaderField(java.util.Optional<java.lang.String> headerField) {
      this.headerField = headerField;
      this.headerFieldIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    public void setExpression(java.util.Optional<java.lang.String> expression) {
      this.expression = expression;
      this.expressionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    public void setDefaultValue(java.util.Optional<java.lang.String> defaultValue) {
      this.defaultValue = defaultValue;
      this.defaultValueIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("hint")
    public void setHint(java.util.Optional<java.lang.String> hint) {
      this.hint = hint;
      this.hintIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    public void setPath(java.util.Optional<java.lang.String> path) {
      this.path = path;
      this.pathIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.id> sourceId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> headerField() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> expression() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> defaultValue() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> hint() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> path() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableTestScript_Variable fromJson(Json json) {
    ImmutableTestScript_Variable.Builder builder = ImmutableTestScript_Variable.builder();
    if (json.sourceIdIsSet) {
      builder.sourceId(json.sourceId);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.headerFieldIsSet) {
      builder.headerField(json.headerField);
    }
    if (json.expressionIsSet) {
      builder.expression(json.expression);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.defaultValueIsSet) {
      builder.defaultValue(json.defaultValue);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.hintIsSet) {
      builder.hint(json.hint);
    }
    if (json.pathIsSet) {
      builder.path(json.path);
    }
    return (ImmutableTestScript_Variable) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestScript_Variable} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestScript_Variable instance
   */
  public static TestScript_Variable copyOf(TestScript_Variable instance) {
    if (instance instanceof ImmutableTestScript_Variable) {
      return (ImmutableTestScript_Variable) instance;
    }
    return ImmutableTestScript_Variable.builder()
        .sourceId(instance.sourceId())
        .id(instance.id())
        .description(instance.description())
        .headerField(instance.headerField())
        .expression(instance.expression())
        .name(instance.name())
        .defaultValue(instance.defaultValue())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .hint(instance.hint())
        .path(instance.path())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript_Variable TestScript_Variable}.
   * <pre>
   * ImmutableTestScript_Variable.builder()
   *    .sourceId(com.fhir.id) // optional {@link TestScript_Variable#sourceId() sourceId}
   *    .id(String) // optional {@link TestScript_Variable#id() id}
   *    .description(String) // optional {@link TestScript_Variable#description() description}
   *    .headerField(String) // optional {@link TestScript_Variable#headerField() headerField}
   *    .expression(String) // optional {@link TestScript_Variable#expression() expression}
   *    .name(String) // optional {@link TestScript_Variable#name() name}
   *    .defaultValue(String) // optional {@link TestScript_Variable#defaultValue() defaultValue}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestScript_Variable#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestScript_Variable#modifierExtension() modifierExtension}
   *    .hint(String) // optional {@link TestScript_Variable#hint() hint}
   *    .path(String) // optional {@link TestScript_Variable#path() path}
   *    .build();
   * </pre>
   * @return A new TestScript_Variable builder
   */
  public static ImmutableTestScript_Variable.Builder builder() {
    return new ImmutableTestScript_Variable.Builder();
  }

  /**
   * Builds instances of type {@link TestScript_Variable TestScript_Variable}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "TestScript_Variable", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SOURCE_ID = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_DESCRIPTION = 0x4L;
    private static final long OPT_BIT_HEADER_FIELD = 0x8L;
    private static final long OPT_BIT_EXPRESSION = 0x10L;
    private static final long OPT_BIT_NAME = 0x20L;
    private static final long OPT_BIT_DEFAULT_VALUE = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_HINT = 0x200L;
    private static final long OPT_BIT_PATH = 0x400L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.id sourceId;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.lang.String headerField;
    private @javax.annotation.Nullable java.lang.String expression;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.lang.String defaultValue;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String hint;
    private @javax.annotation.Nullable java.lang.String path;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#sourceId() sourceId} to sourceId.
     * @param sourceId The value for sourceId
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceId(com.fhir.id sourceId) {
      checkNotIsSet(sourceIdIsSet(), "sourceId");
      this.sourceId = java.util.Objects.requireNonNull(sourceId, "sourceId");
      optBits |= OPT_BIT_SOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#sourceId() sourceId} to sourceId.
     * @param sourceId The value for sourceId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    public final Builder sourceId(java.util.Optional<? extends com.fhir.id> sourceId) {
      checkNotIsSet(sourceIdIsSet(), "sourceId");
      this.sourceId = sourceId.orElse(null);
      optBits |= OPT_BIT_SOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#id() id} to id.
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
     * Initializes the optional value {@link TestScript_Variable#id() id} to id.
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
     * Initializes the optional value {@link TestScript_Variable#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#headerField() headerField} to headerField.
     * @param headerField The value for headerField
     * @return {@code this} builder for chained invocation
     */
    public final Builder headerField(java.lang.String headerField) {
      checkNotIsSet(headerFieldIsSet(), "headerField");
      this.headerField = java.util.Objects.requireNonNull(headerField, "headerField");
      optBits |= OPT_BIT_HEADER_FIELD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#headerField() headerField} to headerField.
     * @param headerField The value for headerField
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("headerField")
    public final Builder headerField(java.util.Optional<java.lang.String> headerField) {
      checkNotIsSet(headerFieldIsSet(), "headerField");
      this.headerField = headerField.orElse(null);
      optBits |= OPT_BIT_HEADER_FIELD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for chained invocation
     */
    public final Builder expression(java.lang.String expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = java.util.Objects.requireNonNull(expression, "expression");
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    public final Builder expression(java.util.Optional<java.lang.String> expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = expression.orElse(null);
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.lang.String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<java.lang.String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#defaultValue() defaultValue} to defaultValue.
     * @param defaultValue The value for defaultValue
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValue(java.lang.String defaultValue) {
      checkNotIsSet(defaultValueIsSet(), "defaultValue");
      this.defaultValue = java.util.Objects.requireNonNull(defaultValue, "defaultValue");
      optBits |= OPT_BIT_DEFAULT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#defaultValue() defaultValue} to defaultValue.
     * @param defaultValue The value for defaultValue
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    public final Builder defaultValue(java.util.Optional<java.lang.String> defaultValue) {
      checkNotIsSet(defaultValueIsSet(), "defaultValue");
      this.defaultValue = defaultValue.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Variable#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Variable#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Variable#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Variable#hint() hint} to hint.
     * @param hint The value for hint
     * @return {@code this} builder for chained invocation
     */
    public final Builder hint(java.lang.String hint) {
      checkNotIsSet(hintIsSet(), "hint");
      this.hint = java.util.Objects.requireNonNull(hint, "hint");
      optBits |= OPT_BIT_HINT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#hint() hint} to hint.
     * @param hint The value for hint
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hint")
    public final Builder hint(java.util.Optional<java.lang.String> hint) {
      checkNotIsSet(hintIsSet(), "hint");
      this.hint = hint.orElse(null);
      optBits |= OPT_BIT_HINT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for chained invocation
     */
    public final Builder path(java.lang.String path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = java.util.Objects.requireNonNull(path, "path");
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    public final Builder path(java.util.Optional<java.lang.String> path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = path.orElse(null);
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Builds a new {@link TestScript_Variable TestScript_Variable}.
     * @return An immutable instance of TestScript_Variable
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.TestScript_Variable build() {
      return new ImmutableTestScript_Variable(
          sourceId,
          id,
          description,
          headerField,
          expression,
          name,
          defaultValue,
          extension,
          modifierExtension,
          hint,
          path);
    }

    private boolean sourceIdIsSet() {
      return (optBits & OPT_BIT_SOURCE_ID) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean headerFieldIsSet() {
      return (optBits & OPT_BIT_HEADER_FIELD) != 0;
    }

    private boolean expressionIsSet() {
      return (optBits & OPT_BIT_EXPRESSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean defaultValueIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean hintIsSet() {
      return (optBits & OPT_BIT_HINT) != 0;
    }

    private boolean pathIsSet() {
      return (optBits & OPT_BIT_PATH) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of TestScript_Variable is strict, attribute is already set: ".concat(name));
    }
  }
}
