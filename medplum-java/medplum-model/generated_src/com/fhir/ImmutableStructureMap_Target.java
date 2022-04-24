//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link StructureMap_Target}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureMap_Target.builder()}.
 */
@org.immutables.value.Generated(from = "StructureMap_Target", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureMap_Target implements com.fhir.StructureMap_Target {
  private final @javax.annotation.Nullable com.fhir.id variable;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String element;
  private final @javax.annotation.Nullable com.fhir.id context;
  private final @javax.annotation.Nullable com.fhir.id listRuleId;
  private final @javax.annotation.Nullable com.fhir.Structuremap_targetTransform transform;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Structuremap_targetListmodeItem> listMode;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Structuremap_targetContexttype contextType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Parameter> parameter;

  private ImmutableStructureMap_Target(
      @javax.annotation.Nullable com.fhir.id variable,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String element,
      @javax.annotation.Nullable com.fhir.id context,
      @javax.annotation.Nullable com.fhir.id listRuleId,
      @javax.annotation.Nullable com.fhir.Structuremap_targetTransform transform,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Structuremap_targetListmodeItem> listMode,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Structuremap_targetContexttype contextType,
      @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Parameter> parameter) {
    this.variable = variable;
    this.id = id;
    this.element = element;
    this.context = context;
    this.listRuleId = listRuleId;
    this.transform = transform;
    this.extension = extension;
    this.listMode = listMode;
    this.modifierExtension = modifierExtension;
    this.contextType = contextType;
    this.parameter = parameter;
  }

  /**
   * @return The value of the {@code variable} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("variable")
  @Override
  public java.util.Optional<com.fhir.id> variable() {
    return java.util.Optional.ofNullable(variable);
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
   * @return The value of the {@code element} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("element")
  @Override
  public java.util.Optional<java.lang.String> element() {
    return java.util.Optional.ofNullable(element);
  }

  /**
   * @return The value of the {@code context} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("context")
  @Override
  public java.util.Optional<com.fhir.id> context() {
    return java.util.Optional.ofNullable(context);
  }

  /**
   * @return The value of the {@code listRuleId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("listRuleId")
  @Override
  public java.util.Optional<com.fhir.id> listRuleId() {
    return java.util.Optional.ofNullable(listRuleId);
  }

  /**
   * @return The value of the {@code transform} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("transform")
  @Override
  public java.util.Optional<com.fhir.Structuremap_targetTransform> transform() {
    return java.util.Optional.ofNullable(transform);
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
   * @return The value of the {@code listMode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("listMode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Structuremap_targetListmodeItem>> listMode() {
    return java.util.Optional.ofNullable(listMode);
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
   * @return The value of the {@code contextType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contextType")
  @Override
  public java.util.Optional<com.fhir.Structuremap_targetContexttype> contextType() {
    return java.util.Optional.ofNullable(contextType);
  }

  /**
   * @return The value of the {@code parameter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parameter")
  @Override
  public java.util.Optional<java.util.List<com.fhir.StructureMap_Parameter>> parameter() {
    return java.util.Optional.ofNullable(parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#variable() variable} attribute.
   * @param value The value for variable
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withVariable(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "variable");
    if (this.variable == newValue) return this;
    return new ImmutableStructureMap_Target(
        newValue,
        this.id,
        this.element,
        this.context,
        this.listRuleId,
        this.transform,
        this.extension,
        this.listMode,
        this.modifierExtension,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#variable() variable} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for variable
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withVariable(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.variable == value) return this;
    return new ImmutableStructureMap_Target(
        value,
        this.id,
        this.element,
        this.context,
        this.listRuleId,
        this.transform,
        this.extension,
        this.listMode,
        this.modifierExtension,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        newValue,
        this.element,
        this.context,
        this.listRuleId,
        this.transform,
        this.extension,
        this.listMode,
        this.modifierExtension,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        value,
        this.element,
        this.context,
        this.listRuleId,
        this.transform,
        this.extension,
        this.listMode,
        this.modifierExtension,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#element() element} attribute.
   * @param value The value for element
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withElement(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "element");
    if (java.util.Objects.equals(this.element, newValue)) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        newValue,
        this.context,
        this.listRuleId,
        this.transform,
        this.extension,
        this.listMode,
        this.modifierExtension,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#element() element} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for element
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withElement(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.element, value)) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        value,
        this.context,
        this.listRuleId,
        this.transform,
        this.extension,
        this.listMode,
        this.modifierExtension,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withContext(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        this.element,
        newValue,
        this.listRuleId,
        this.transform,
        this.extension,
        this.listMode,
        this.modifierExtension,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withContext(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        this.element,
        value,
        this.listRuleId,
        this.transform,
        this.extension,
        this.listMode,
        this.modifierExtension,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#listRuleId() listRuleId} attribute.
   * @param value The value for listRuleId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withListRuleId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "listRuleId");
    if (this.listRuleId == newValue) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        this.element,
        this.context,
        newValue,
        this.transform,
        this.extension,
        this.listMode,
        this.modifierExtension,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#listRuleId() listRuleId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for listRuleId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withListRuleId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.listRuleId == value) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        this.element,
        this.context,
        value,
        this.transform,
        this.extension,
        this.listMode,
        this.modifierExtension,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#transform() transform} attribute.
   * @param value The value for transform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withTransform(com.fhir.Structuremap_targetTransform value) {
    @javax.annotation.Nullable com.fhir.Structuremap_targetTransform newValue = java.util.Objects.requireNonNull(value, "transform");
    if (this.transform == newValue) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        this.element,
        this.context,
        this.listRuleId,
        newValue,
        this.extension,
        this.listMode,
        this.modifierExtension,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#transform() transform} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for transform
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withTransform(java.util.Optional<? extends com.fhir.Structuremap_targetTransform> optional) {
    @javax.annotation.Nullable com.fhir.Structuremap_targetTransform value = optional.orElse(null);
    if (this.transform == value) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        this.element,
        this.context,
        this.listRuleId,
        value,
        this.extension,
        this.listMode,
        this.modifierExtension,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        this.element,
        this.context,
        this.listRuleId,
        this.transform,
        newValue,
        this.listMode,
        this.modifierExtension,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        this.element,
        this.context,
        this.listRuleId,
        this.transform,
        value,
        this.listMode,
        this.modifierExtension,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#listMode() listMode} attribute.
   * @param value The value for listMode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withListMode(java.util.List<com.fhir.Structuremap_targetListmodeItem> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Structuremap_targetListmodeItem> newValue = java.util.Objects.requireNonNull(value, "listMode");
    if (this.listMode == newValue) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        this.element,
        this.context,
        this.listRuleId,
        this.transform,
        this.extension,
        newValue,
        this.modifierExtension,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#listMode() listMode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for listMode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withListMode(java.util.Optional<? extends java.util.List<com.fhir.Structuremap_targetListmodeItem>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Structuremap_targetListmodeItem> value = optional.orElse(null);
    if (this.listMode == value) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        this.element,
        this.context,
        this.listRuleId,
        this.transform,
        this.extension,
        value,
        this.modifierExtension,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        this.element,
        this.context,
        this.listRuleId,
        this.transform,
        this.extension,
        this.listMode,
        newValue,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        this.element,
        this.context,
        this.listRuleId,
        this.transform,
        this.extension,
        this.listMode,
        value,
        this.contextType,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#contextType() contextType} attribute.
   * @param value The value for contextType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withContextType(com.fhir.Structuremap_targetContexttype value) {
    @javax.annotation.Nullable com.fhir.Structuremap_targetContexttype newValue = java.util.Objects.requireNonNull(value, "contextType");
    if (this.contextType == newValue) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        this.element,
        this.context,
        this.listRuleId,
        this.transform,
        this.extension,
        this.listMode,
        this.modifierExtension,
        newValue,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#contextType() contextType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contextType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withContextType(java.util.Optional<? extends com.fhir.Structuremap_targetContexttype> optional) {
    @javax.annotation.Nullable com.fhir.Structuremap_targetContexttype value = optional.orElse(null);
    if (this.contextType == value) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        this.element,
        this.context,
        this.listRuleId,
        this.transform,
        this.extension,
        this.listMode,
        this.modifierExtension,
        value,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#parameter() parameter} attribute.
   * @param value The value for parameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withParameter(java.util.List<com.fhir.StructureMap_Parameter> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Parameter> newValue = java.util.Objects.requireNonNull(value, "parameter");
    if (this.parameter == newValue) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        this.element,
        this.context,
        this.listRuleId,
        this.transform,
        this.extension,
        this.listMode,
        this.modifierExtension,
        this.contextType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#parameter() parameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withParameter(java.util.Optional<? extends java.util.List<com.fhir.StructureMap_Parameter>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Parameter> value = optional.orElse(null);
    if (this.parameter == value) return this;
    return new ImmutableStructureMap_Target(
        this.variable,
        this.id,
        this.element,
        this.context,
        this.listRuleId,
        this.transform,
        this.extension,
        this.listMode,
        this.modifierExtension,
        this.contextType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureMap_Target} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureMap_Target
        && equalTo((ImmutableStructureMap_Target) another);
  }

  private boolean equalTo(ImmutableStructureMap_Target another) {
    return java.util.Objects.equals(variable, another.variable)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(element, another.element)
        && java.util.Objects.equals(context, another.context)
        && java.util.Objects.equals(listRuleId, another.listRuleId)
        && java.util.Objects.equals(transform, another.transform)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(listMode, another.listMode)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(contextType, another.contextType)
        && java.util.Objects.equals(parameter, another.parameter);
  }

  /**
   * Computes a hash code from attributes: {@code variable}, {@code id}, {@code element}, {@code context}, {@code listRuleId}, {@code transform}, {@code extension}, {@code listMode}, {@code modifierExtension}, {@code contextType}, {@code parameter}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(variable);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(element);
    h += (h << 5) + java.util.Objects.hashCode(context);
    h += (h << 5) + java.util.Objects.hashCode(listRuleId);
    h += (h << 5) + java.util.Objects.hashCode(transform);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(listMode);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(contextType);
    h += (h << 5) + java.util.Objects.hashCode(parameter);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureMap_Target} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("StructureMap_Target{");
    if (variable != null) {
      builder.append("variable=").append(variable);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (element != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("element=").append(element);
    }
    if (context != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("context=").append(context);
    }
    if (listRuleId != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("listRuleId=").append(listRuleId);
    }
    if (transform != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("transform=").append(transform);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (listMode != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("listMode=").append(listMode);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (contextType != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("contextType=").append(contextType);
    }
    if (parameter != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("parameter=").append(parameter);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "StructureMap_Target", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.StructureMap_Target {
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> variable = java.util.Optional.empty();
    boolean variableIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> element = java.util.Optional.empty();
    boolean elementIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> context = java.util.Optional.empty();
    boolean contextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> listRuleId = java.util.Optional.empty();
    boolean listRuleIdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Structuremap_targetTransform> transform = java.util.Optional.empty();
    boolean transformIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Structuremap_targetListmodeItem>> listMode = java.util.Optional.empty();
    boolean listModeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Structuremap_targetContexttype> contextType = java.util.Optional.empty();
    boolean contextTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.StructureMap_Parameter>> parameter = java.util.Optional.empty();
    boolean parameterIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("variable")
    public void setVariable(java.util.Optional<com.fhir.id> variable) {
      this.variable = variable;
      this.variableIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("element")
    public void setElement(java.util.Optional<java.lang.String> element) {
      this.element = element;
      this.elementIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public void setContext(java.util.Optional<com.fhir.id> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("listRuleId")
    public void setListRuleId(java.util.Optional<com.fhir.id> listRuleId) {
      this.listRuleId = listRuleId;
      this.listRuleIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("transform")
    public void setTransform(java.util.Optional<com.fhir.Structuremap_targetTransform> transform) {
      this.transform = transform;
      this.transformIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("listMode")
    public void setListMode(java.util.Optional<java.util.List<com.fhir.Structuremap_targetListmodeItem>> listMode) {
      this.listMode = listMode;
      this.listModeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contextType")
    public void setContextType(java.util.Optional<com.fhir.Structuremap_targetContexttype> contextType) {
      this.contextType = contextType;
      this.contextTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public void setParameter(java.util.Optional<java.util.List<com.fhir.StructureMap_Parameter>> parameter) {
      this.parameter = parameter;
      this.parameterIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.id> variable() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> element() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> context() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> listRuleId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Structuremap_targetTransform> transform() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Structuremap_targetListmodeItem>> listMode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Structuremap_targetContexttype> contextType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.StructureMap_Parameter>> parameter() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableStructureMap_Target fromJson(Json json) {
    ImmutableStructureMap_Target.Builder builder = ImmutableStructureMap_Target.builder();
    if (json.variableIsSet) {
      builder.variable(json.variable);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.elementIsSet) {
      builder.element(json.element);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.listRuleIdIsSet) {
      builder.listRuleId(json.listRuleId);
    }
    if (json.transformIsSet) {
      builder.transform(json.transform);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.listModeIsSet) {
      builder.listMode(json.listMode);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.contextTypeIsSet) {
      builder.contextType(json.contextType);
    }
    if (json.parameterIsSet) {
      builder.parameter(json.parameter);
    }
    return (ImmutableStructureMap_Target) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StructureMap_Target} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StructureMap_Target instance
   */
  public static StructureMap_Target copyOf(StructureMap_Target instance) {
    if (instance instanceof ImmutableStructureMap_Target) {
      return (ImmutableStructureMap_Target) instance;
    }
    return ImmutableStructureMap_Target.builder()
        .variable(instance.variable())
        .id(instance.id())
        .element(instance.element())
        .context(instance.context())
        .listRuleId(instance.listRuleId())
        .transform(instance.transform())
        .extension(instance.extension())
        .listMode(instance.listMode())
        .modifierExtension(instance.modifierExtension())
        .contextType(instance.contextType())
        .parameter(instance.parameter())
        .build();
  }

  /**
   * Creates a builder for {@link StructureMap_Target StructureMap_Target}.
   * <pre>
   * ImmutableStructureMap_Target.builder()
   *    .variable(com.fhir.id) // optional {@link StructureMap_Target#variable() variable}
   *    .id(String) // optional {@link StructureMap_Target#id() id}
   *    .element(String) // optional {@link StructureMap_Target#element() element}
   *    .context(com.fhir.id) // optional {@link StructureMap_Target#context() context}
   *    .listRuleId(com.fhir.id) // optional {@link StructureMap_Target#listRuleId() listRuleId}
   *    .transform(com.fhir.Structuremap_targetTransform) // optional {@link StructureMap_Target#transform() transform}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link StructureMap_Target#extension() extension}
   *    .listMode(List&amp;lt;com.fhir.Structuremap_targetListmodeItem&amp;gt;) // optional {@link StructureMap_Target#listMode() listMode}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link StructureMap_Target#modifierExtension() modifierExtension}
   *    .contextType(com.fhir.Structuremap_targetContexttype) // optional {@link StructureMap_Target#contextType() contextType}
   *    .parameter(List&amp;lt;com.fhir.StructureMap_Parameter&amp;gt;) // optional {@link StructureMap_Target#parameter() parameter}
   *    .build();
   * </pre>
   * @return A new StructureMap_Target builder
   */
  public static ImmutableStructureMap_Target.Builder builder() {
    return new ImmutableStructureMap_Target.Builder();
  }

  /**
   * Builds instances of type {@link StructureMap_Target StructureMap_Target}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "StructureMap_Target", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_VARIABLE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_ELEMENT = 0x4L;
    private static final long OPT_BIT_CONTEXT = 0x8L;
    private static final long OPT_BIT_LIST_RULE_ID = 0x10L;
    private static final long OPT_BIT_TRANSFORM = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_LIST_MODE = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_CONTEXT_TYPE = 0x200L;
    private static final long OPT_BIT_PARAMETER = 0x400L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.id variable;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String element;
    private @javax.annotation.Nullable com.fhir.id context;
    private @javax.annotation.Nullable com.fhir.id listRuleId;
    private @javax.annotation.Nullable com.fhir.Structuremap_targetTransform transform;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Structuremap_targetListmodeItem> listMode;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Structuremap_targetContexttype contextType;
    private @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Parameter> parameter;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#variable() variable} to variable.
     * @param variable The value for variable
     * @return {@code this} builder for chained invocation
     */
    public final Builder variable(com.fhir.id variable) {
      checkNotIsSet(variableIsSet(), "variable");
      this.variable = java.util.Objects.requireNonNull(variable, "variable");
      optBits |= OPT_BIT_VARIABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#variable() variable} to variable.
     * @param variable The value for variable
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("variable")
    public final Builder variable(java.util.Optional<? extends com.fhir.id> variable) {
      checkNotIsSet(variableIsSet(), "variable");
      this.variable = variable.orElse(null);
      optBits |= OPT_BIT_VARIABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Target#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Target#element() element} to element.
     * @param element The value for element
     * @return {@code this} builder for chained invocation
     */
    public final Builder element(java.lang.String element) {
      checkNotIsSet(elementIsSet(), "element");
      this.element = java.util.Objects.requireNonNull(element, "element");
      optBits |= OPT_BIT_ELEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#element() element} to element.
     * @param element The value for element
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("element")
    public final Builder element(java.util.Optional<java.lang.String> element) {
      checkNotIsSet(elementIsSet(), "element");
      this.element = element.orElse(null);
      optBits |= OPT_BIT_ELEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    public final Builder context(com.fhir.id context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = java.util.Objects.requireNonNull(context, "context");
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public final Builder context(java.util.Optional<? extends com.fhir.id> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = context.orElse(null);
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#listRuleId() listRuleId} to listRuleId.
     * @param listRuleId The value for listRuleId
     * @return {@code this} builder for chained invocation
     */
    public final Builder listRuleId(com.fhir.id listRuleId) {
      checkNotIsSet(listRuleIdIsSet(), "listRuleId");
      this.listRuleId = java.util.Objects.requireNonNull(listRuleId, "listRuleId");
      optBits |= OPT_BIT_LIST_RULE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#listRuleId() listRuleId} to listRuleId.
     * @param listRuleId The value for listRuleId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listRuleId")
    public final Builder listRuleId(java.util.Optional<? extends com.fhir.id> listRuleId) {
      checkNotIsSet(listRuleIdIsSet(), "listRuleId");
      this.listRuleId = listRuleId.orElse(null);
      optBits |= OPT_BIT_LIST_RULE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#transform() transform} to transform.
     * @param transform The value for transform
     * @return {@code this} builder for chained invocation
     */
    public final Builder transform(com.fhir.Structuremap_targetTransform transform) {
      checkNotIsSet(transformIsSet(), "transform");
      this.transform = java.util.Objects.requireNonNull(transform, "transform");
      optBits |= OPT_BIT_TRANSFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#transform() transform} to transform.
     * @param transform The value for transform
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transform")
    public final Builder transform(java.util.Optional<? extends com.fhir.Structuremap_targetTransform> transform) {
      checkNotIsSet(transformIsSet(), "transform");
      this.transform = transform.orElse(null);
      optBits |= OPT_BIT_TRANSFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Target#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Target#listMode() listMode} to listMode.
     * @param listMode The value for listMode
     * @return {@code this} builder for chained invocation
     */
    public final Builder listMode(java.util.List<com.fhir.Structuremap_targetListmodeItem> listMode) {
      checkNotIsSet(listModeIsSet(), "listMode");
      this.listMode = java.util.Objects.requireNonNull(listMode, "listMode");
      optBits |= OPT_BIT_LIST_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#listMode() listMode} to listMode.
     * @param listMode The value for listMode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listMode")
    public final Builder listMode(java.util.Optional<? extends java.util.List<com.fhir.Structuremap_targetListmodeItem>> listMode) {
      checkNotIsSet(listModeIsSet(), "listMode");
      this.listMode = listMode.orElse(null);
      optBits |= OPT_BIT_LIST_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Target#contextType() contextType} to contextType.
     * @param contextType The value for contextType
     * @return {@code this} builder for chained invocation
     */
    public final Builder contextType(com.fhir.Structuremap_targetContexttype contextType) {
      checkNotIsSet(contextTypeIsSet(), "contextType");
      this.contextType = java.util.Objects.requireNonNull(contextType, "contextType");
      optBits |= OPT_BIT_CONTEXT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#contextType() contextType} to contextType.
     * @param contextType The value for contextType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contextType")
    public final Builder contextType(java.util.Optional<? extends com.fhir.Structuremap_targetContexttype> contextType) {
      checkNotIsSet(contextTypeIsSet(), "contextType");
      this.contextType = contextType.orElse(null);
      optBits |= OPT_BIT_CONTEXT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameter(java.util.List<com.fhir.StructureMap_Parameter> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = java.util.Objects.requireNonNull(parameter, "parameter");
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public final Builder parameter(java.util.Optional<? extends java.util.List<com.fhir.StructureMap_Parameter>> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = parameter.orElse(null);
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Builds a new {@link StructureMap_Target StructureMap_Target}.
     * @return An immutable instance of StructureMap_Target
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.StructureMap_Target build() {
      return new ImmutableStructureMap_Target(
          variable,
          id,
          element,
          context,
          listRuleId,
          transform,
          extension,
          listMode,
          modifierExtension,
          contextType,
          parameter);
    }

    private boolean variableIsSet() {
      return (optBits & OPT_BIT_VARIABLE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean elementIsSet() {
      return (optBits & OPT_BIT_ELEMENT) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean listRuleIdIsSet() {
      return (optBits & OPT_BIT_LIST_RULE_ID) != 0;
    }

    private boolean transformIsSet() {
      return (optBits & OPT_BIT_TRANSFORM) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean listModeIsSet() {
      return (optBits & OPT_BIT_LIST_MODE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean contextTypeIsSet() {
      return (optBits & OPT_BIT_CONTEXT_TYPE) != 0;
    }

    private boolean parameterIsSet() {
      return (optBits & OPT_BIT_PARAMETER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of StructureMap_Target is strict, attribute is already set: ".concat(name));
    }
  }
}
