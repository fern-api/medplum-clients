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
 * Immutable implementation of {@link StructureMap_Target}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureMap_Target.builder()}.
 */
@Generated(from = "StructureMap_Target", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureMap_Target implements StructureMap_Target {
  private final @Nullable List<Structuremap_TargetListmodeItem> listMode;
  private final @Nullable Id context;
  private final @Nullable Id listRuleId;
  private final @Nullable String element;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable Structuremap_TargetContexttype contextType;
  private final @Nullable List<Extension> extension;
  private final @Nullable Id variable;
  private final @Nullable Structuremap_TargetTransform transform;
  private final @Nullable List<StructureMap_Parameter> parameter;

  private ImmutableStructureMap_Target(
      @Nullable List<Structuremap_TargetListmodeItem> listMode,
      @Nullable Id context,
      @Nullable Id listRuleId,
      @Nullable String element,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable Structuremap_TargetContexttype contextType,
      @Nullable List<Extension> extension,
      @Nullable Id variable,
      @Nullable Structuremap_TargetTransform transform,
      @Nullable List<StructureMap_Parameter> parameter) {
    this.listMode = listMode;
    this.context = context;
    this.listRuleId = listRuleId;
    this.element = element;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.contextType = contextType;
    this.extension = extension;
    this.variable = variable;
    this.transform = transform;
    this.parameter = parameter;
  }

  /**
   * @return The value of the {@code listMode} attribute
   */
  @JsonProperty("listMode")
  @Override
  public Optional<List<Structuremap_TargetListmodeItem>> listMode() {
    return Optional.ofNullable(listMode);
  }

  /**
   * @return The value of the {@code context} attribute
   */
  @JsonProperty("context")
  @Override
  public Optional<Id> context() {
    return Optional.ofNullable(context);
  }

  /**
   * @return The value of the {@code listRuleId} attribute
   */
  @JsonProperty("listRuleId")
  @Override
  public Optional<Id> listRuleId() {
    return Optional.ofNullable(listRuleId);
  }

  /**
   * @return The value of the {@code element} attribute
   */
  @JsonProperty("element")
  @Override
  public Optional<String> element() {
    return Optional.ofNullable(element);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code contextType} attribute
   */
  @JsonProperty("contextType")
  @Override
  public Optional<Structuremap_TargetContexttype> contextType() {
    return Optional.ofNullable(contextType);
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
   * @return The value of the {@code variable} attribute
   */
  @JsonProperty("variable")
  @Override
  public Optional<Id> variable() {
    return Optional.ofNullable(variable);
  }

  /**
   * @return The value of the {@code transform} attribute
   */
  @JsonProperty("transform")
  @Override
  public Optional<Structuremap_TargetTransform> transform() {
    return Optional.ofNullable(transform);
  }

  /**
   * @return The value of the {@code parameter} attribute
   */
  @JsonProperty("parameter")
  @Override
  public Optional<List<StructureMap_Parameter>> parameter() {
    return Optional.ofNullable(parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#listMode() listMode} attribute.
   * @param value The value for listMode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withListMode(List<Structuremap_TargetListmodeItem> value) {
    @Nullable List<Structuremap_TargetListmodeItem> newValue = Objects.requireNonNull(value, "listMode");
    if (this.listMode == newValue) return this;
    return new ImmutableStructureMap_Target(
        newValue,
        this.context,
        this.listRuleId,
        this.element,
        this.modifierExtension,
        this.id,
        this.contextType,
        this.extension,
        this.variable,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#listMode() listMode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for listMode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withListMode(Optional<? extends List<Structuremap_TargetListmodeItem>> optional) {
    @Nullable List<Structuremap_TargetListmodeItem> value = optional.orElse(null);
    if (this.listMode == value) return this;
    return new ImmutableStructureMap_Target(
        value,
        this.context,
        this.listRuleId,
        this.element,
        this.modifierExtension,
        this.id,
        this.contextType,
        this.extension,
        this.variable,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withContext(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        newValue,
        this.listRuleId,
        this.element,
        this.modifierExtension,
        this.id,
        this.contextType,
        this.extension,
        this.variable,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withContext(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        value,
        this.listRuleId,
        this.element,
        this.modifierExtension,
        this.id,
        this.contextType,
        this.extension,
        this.variable,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#listRuleId() listRuleId} attribute.
   * @param value The value for listRuleId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withListRuleId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "listRuleId");
    if (this.listRuleId == newValue) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        newValue,
        this.element,
        this.modifierExtension,
        this.id,
        this.contextType,
        this.extension,
        this.variable,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#listRuleId() listRuleId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for listRuleId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withListRuleId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.listRuleId == value) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        value,
        this.element,
        this.modifierExtension,
        this.id,
        this.contextType,
        this.extension,
        this.variable,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#element() element} attribute.
   * @param value The value for element
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withElement(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "element");
    if (Objects.equals(this.element, newValue)) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        this.listRuleId,
        newValue,
        this.modifierExtension,
        this.id,
        this.contextType,
        this.extension,
        this.variable,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#element() element} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for element
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withElement(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.element, value)) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        this.listRuleId,
        value,
        this.modifierExtension,
        this.id,
        this.contextType,
        this.extension,
        this.variable,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        this.listRuleId,
        this.element,
        newValue,
        this.id,
        this.contextType,
        this.extension,
        this.variable,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        this.listRuleId,
        this.element,
        value,
        this.id,
        this.contextType,
        this.extension,
        this.variable,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        this.listRuleId,
        this.element,
        this.modifierExtension,
        newValue,
        this.contextType,
        this.extension,
        this.variable,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        this.listRuleId,
        this.element,
        this.modifierExtension,
        value,
        this.contextType,
        this.extension,
        this.variable,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#contextType() contextType} attribute.
   * @param value The value for contextType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withContextType(Structuremap_TargetContexttype value) {
    @Nullable Structuremap_TargetContexttype newValue = Objects.requireNonNull(value, "contextType");
    if (this.contextType == newValue) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        this.listRuleId,
        this.element,
        this.modifierExtension,
        this.id,
        newValue,
        this.extension,
        this.variable,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#contextType() contextType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contextType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withContextType(Optional<? extends Structuremap_TargetContexttype> optional) {
    @Nullable Structuremap_TargetContexttype value = optional.orElse(null);
    if (this.contextType == value) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        this.listRuleId,
        this.element,
        this.modifierExtension,
        this.id,
        value,
        this.extension,
        this.variable,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        this.listRuleId,
        this.element,
        this.modifierExtension,
        this.id,
        this.contextType,
        newValue,
        this.variable,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        this.listRuleId,
        this.element,
        this.modifierExtension,
        this.id,
        this.contextType,
        value,
        this.variable,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#variable() variable} attribute.
   * @param value The value for variable
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withVariable(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "variable");
    if (this.variable == newValue) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        this.listRuleId,
        this.element,
        this.modifierExtension,
        this.id,
        this.contextType,
        this.extension,
        newValue,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#variable() variable} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for variable
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withVariable(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.variable == value) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        this.listRuleId,
        this.element,
        this.modifierExtension,
        this.id,
        this.contextType,
        this.extension,
        value,
        this.transform,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#transform() transform} attribute.
   * @param value The value for transform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withTransform(Structuremap_TargetTransform value) {
    @Nullable Structuremap_TargetTransform newValue = Objects.requireNonNull(value, "transform");
    if (this.transform == newValue) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        this.listRuleId,
        this.element,
        this.modifierExtension,
        this.id,
        this.contextType,
        this.extension,
        this.variable,
        newValue,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#transform() transform} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for transform
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withTransform(Optional<? extends Structuremap_TargetTransform> optional) {
    @Nullable Structuremap_TargetTransform value = optional.orElse(null);
    if (this.transform == value) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        this.listRuleId,
        this.element,
        this.modifierExtension,
        this.id,
        this.contextType,
        this.extension,
        this.variable,
        value,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Target#parameter() parameter} attribute.
   * @param value The value for parameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Target withParameter(List<StructureMap_Parameter> value) {
    @Nullable List<StructureMap_Parameter> newValue = Objects.requireNonNull(value, "parameter");
    if (this.parameter == newValue) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        this.listRuleId,
        this.element,
        this.modifierExtension,
        this.id,
        this.contextType,
        this.extension,
        this.variable,
        this.transform,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Target#parameter() parameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Target withParameter(Optional<? extends List<StructureMap_Parameter>> optional) {
    @Nullable List<StructureMap_Parameter> value = optional.orElse(null);
    if (this.parameter == value) return this;
    return new ImmutableStructureMap_Target(
        this.listMode,
        this.context,
        this.listRuleId,
        this.element,
        this.modifierExtension,
        this.id,
        this.contextType,
        this.extension,
        this.variable,
        this.transform,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureMap_Target} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureMap_Target
        && equalTo((ImmutableStructureMap_Target) another);
  }

  private boolean equalTo(ImmutableStructureMap_Target another) {
    return Objects.equals(listMode, another.listMode)
        && Objects.equals(context, another.context)
        && Objects.equals(listRuleId, another.listRuleId)
        && Objects.equals(element, another.element)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(contextType, another.contextType)
        && Objects.equals(extension, another.extension)
        && Objects.equals(variable, another.variable)
        && Objects.equals(transform, another.transform)
        && Objects.equals(parameter, another.parameter);
  }

  /**
   * Computes a hash code from attributes: {@code listMode}, {@code context}, {@code listRuleId}, {@code element}, {@code modifierExtension}, {@code id}, {@code contextType}, {@code extension}, {@code variable}, {@code transform}, {@code parameter}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(listMode);
    h += (h << 5) + Objects.hashCode(context);
    h += (h << 5) + Objects.hashCode(listRuleId);
    h += (h << 5) + Objects.hashCode(element);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(contextType);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(variable);
    h += (h << 5) + Objects.hashCode(transform);
    h += (h << 5) + Objects.hashCode(parameter);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureMap_Target} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("StructureMap_Target{");
    if (listMode != null) {
      builder.append("listMode=").append(listMode);
    }
    if (context != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("context=").append(context);
    }
    if (listRuleId != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("listRuleId=").append(listRuleId);
    }
    if (element != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("element=").append(element);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contextType != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("contextType=").append(contextType);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (variable != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("variable=").append(variable);
    }
    if (transform != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("transform=").append(transform);
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
  @Generated(from = "StructureMap_Target", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements StructureMap_Target {
    @Nullable Optional<List<Structuremap_TargetListmodeItem>> listMode = Optional.empty();
    boolean listModeIsSet;
    @Nullable Optional<Id> context = Optional.empty();
    boolean contextIsSet;
    @Nullable Optional<Id> listRuleId = Optional.empty();
    boolean listRuleIdIsSet;
    @Nullable Optional<String> element = Optional.empty();
    boolean elementIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Structuremap_TargetContexttype> contextType = Optional.empty();
    boolean contextTypeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Id> variable = Optional.empty();
    boolean variableIsSet;
    @Nullable Optional<Structuremap_TargetTransform> transform = Optional.empty();
    boolean transformIsSet;
    @Nullable Optional<List<StructureMap_Parameter>> parameter = Optional.empty();
    boolean parameterIsSet;
    @JsonProperty("listMode")
    public void setListMode(Optional<List<Structuremap_TargetListmodeItem>> listMode) {
      this.listMode = listMode;
      this.listModeIsSet = true;
    }
    @JsonProperty("context")
    public void setContext(Optional<Id> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @JsonProperty("listRuleId")
    public void setListRuleId(Optional<Id> listRuleId) {
      this.listRuleId = listRuleId;
      this.listRuleIdIsSet = true;
    }
    @JsonProperty("element")
    public void setElement(Optional<String> element) {
      this.element = element;
      this.elementIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("contextType")
    public void setContextType(Optional<Structuremap_TargetContexttype> contextType) {
      this.contextType = contextType;
      this.contextTypeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("variable")
    public void setVariable(Optional<Id> variable) {
      this.variable = variable;
      this.variableIsSet = true;
    }
    @JsonProperty("transform")
    public void setTransform(Optional<Structuremap_TargetTransform> transform) {
      this.transform = transform;
      this.transformIsSet = true;
    }
    @JsonProperty("parameter")
    public void setParameter(Optional<List<StructureMap_Parameter>> parameter) {
      this.parameter = parameter;
      this.parameterIsSet = true;
    }
    @Override
    public Optional<List<Structuremap_TargetListmodeItem>> listMode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> context() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> listRuleId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> element() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Structuremap_TargetContexttype> contextType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> variable() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Structuremap_TargetTransform> transform() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<StructureMap_Parameter>> parameter() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableStructureMap_Target fromJson(Json json) {
    ImmutableStructureMap_Target.Builder builder = ImmutableStructureMap_Target.builder();
    if (json.listModeIsSet) {
      builder.listMode(json.listMode);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.listRuleIdIsSet) {
      builder.listRuleId(json.listRuleId);
    }
    if (json.elementIsSet) {
      builder.element(json.element);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.contextTypeIsSet) {
      builder.contextType(json.contextType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.variableIsSet) {
      builder.variable(json.variable);
    }
    if (json.transformIsSet) {
      builder.transform(json.transform);
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
        .listMode(instance.listMode())
        .context(instance.context())
        .listRuleId(instance.listRuleId())
        .element(instance.element())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .contextType(instance.contextType())
        .extension(instance.extension())
        .variable(instance.variable())
        .transform(instance.transform())
        .parameter(instance.parameter())
        .build();
  }

  /**
   * Creates a builder for {@link StructureMap_Target StructureMap_Target}.
   * <pre>
   * ImmutableStructureMap_Target.builder()
   *    .listMode(List&amp;lt;Structuremap_TargetListmodeItem&amp;gt;) // optional {@link StructureMap_Target#listMode() listMode}
   *    .context(com.fhir.types.fhir.Id) // optional {@link StructureMap_Target#context() context}
   *    .listRuleId(com.fhir.types.fhir.Id) // optional {@link StructureMap_Target#listRuleId() listRuleId}
   *    .element(String) // optional {@link StructureMap_Target#element() element}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link StructureMap_Target#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link StructureMap_Target#id() id}
   *    .contextType(Structuremap_TargetContexttype) // optional {@link StructureMap_Target#contextType() contextType}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link StructureMap_Target#extension() extension}
   *    .variable(com.fhir.types.fhir.Id) // optional {@link StructureMap_Target#variable() variable}
   *    .transform(Structuremap_TargetTransform) // optional {@link StructureMap_Target#transform() transform}
   *    .parameter(List&amp;lt;com.fhir.types.fhir.StructureMap_Parameter&amp;gt;) // optional {@link StructureMap_Target#parameter() parameter}
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
  @Generated(from = "StructureMap_Target", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_LIST_MODE = 0x1L;
    private static final long OPT_BIT_CONTEXT = 0x2L;
    private static final long OPT_BIT_LIST_RULE_ID = 0x4L;
    private static final long OPT_BIT_ELEMENT = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_CONTEXT_TYPE = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_VARIABLE = 0x100L;
    private static final long OPT_BIT_TRANSFORM = 0x200L;
    private static final long OPT_BIT_PARAMETER = 0x400L;
    private long optBits;

    private @Nullable List<Structuremap_TargetListmodeItem> listMode;
    private @Nullable Id context;
    private @Nullable Id listRuleId;
    private @Nullable String element;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable Structuremap_TargetContexttype contextType;
    private @Nullable List<Extension> extension;
    private @Nullable Id variable;
    private @Nullable Structuremap_TargetTransform transform;
    private @Nullable List<StructureMap_Parameter> parameter;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#listMode() listMode} to listMode.
     * @param listMode The value for listMode
     * @return {@code this} builder for chained invocation
     */
    public final Builder listMode(List<Structuremap_TargetListmodeItem> listMode) {
      checkNotIsSet(listModeIsSet(), "listMode");
      this.listMode = Objects.requireNonNull(listMode, "listMode");
      optBits |= OPT_BIT_LIST_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#listMode() listMode} to listMode.
     * @param listMode The value for listMode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("listMode")
    public final Builder listMode(Optional<? extends List<Structuremap_TargetListmodeItem>> listMode) {
      checkNotIsSet(listModeIsSet(), "listMode");
      this.listMode = listMode.orElse(null);
      optBits |= OPT_BIT_LIST_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    public final Builder context(Id context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = Objects.requireNonNull(context, "context");
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("context")
    public final Builder context(Optional<? extends Id> context) {
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
    public final Builder listRuleId(Id listRuleId) {
      checkNotIsSet(listRuleIdIsSet(), "listRuleId");
      this.listRuleId = Objects.requireNonNull(listRuleId, "listRuleId");
      optBits |= OPT_BIT_LIST_RULE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#listRuleId() listRuleId} to listRuleId.
     * @param listRuleId The value for listRuleId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("listRuleId")
    public final Builder listRuleId(Optional<? extends Id> listRuleId) {
      checkNotIsSet(listRuleIdIsSet(), "listRuleId");
      this.listRuleId = listRuleId.orElse(null);
      optBits |= OPT_BIT_LIST_RULE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#element() element} to element.
     * @param element The value for element
     * @return {@code this} builder for chained invocation
     */
    public final Builder element(String element) {
      checkNotIsSet(elementIsSet(), "element");
      this.element = Objects.requireNonNull(element, "element");
      optBits |= OPT_BIT_ELEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#element() element} to element.
     * @param element The value for element
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("element")
    public final Builder element(Optional<String> element) {
      checkNotIsSet(elementIsSet(), "element");
      this.element = element.orElse(null);
      optBits |= OPT_BIT_ELEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Target#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Target#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Target#contextType() contextType} to contextType.
     * @param contextType The value for contextType
     * @return {@code this} builder for chained invocation
     */
    public final Builder contextType(Structuremap_TargetContexttype contextType) {
      checkNotIsSet(contextTypeIsSet(), "contextType");
      this.contextType = Objects.requireNonNull(contextType, "contextType");
      optBits |= OPT_BIT_CONTEXT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#contextType() contextType} to contextType.
     * @param contextType The value for contextType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contextType")
    public final Builder contextType(Optional<? extends Structuremap_TargetContexttype> contextType) {
      checkNotIsSet(contextTypeIsSet(), "contextType");
      this.contextType = contextType.orElse(null);
      optBits |= OPT_BIT_CONTEXT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Target#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Target#variable() variable} to variable.
     * @param variable The value for variable
     * @return {@code this} builder for chained invocation
     */
    public final Builder variable(Id variable) {
      checkNotIsSet(variableIsSet(), "variable");
      this.variable = Objects.requireNonNull(variable, "variable");
      optBits |= OPT_BIT_VARIABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#variable() variable} to variable.
     * @param variable The value for variable
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("variable")
    public final Builder variable(Optional<? extends Id> variable) {
      checkNotIsSet(variableIsSet(), "variable");
      this.variable = variable.orElse(null);
      optBits |= OPT_BIT_VARIABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#transform() transform} to transform.
     * @param transform The value for transform
     * @return {@code this} builder for chained invocation
     */
    public final Builder transform(Structuremap_TargetTransform transform) {
      checkNotIsSet(transformIsSet(), "transform");
      this.transform = Objects.requireNonNull(transform, "transform");
      optBits |= OPT_BIT_TRANSFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#transform() transform} to transform.
     * @param transform The value for transform
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("transform")
    public final Builder transform(Optional<? extends Structuremap_TargetTransform> transform) {
      checkNotIsSet(transformIsSet(), "transform");
      this.transform = transform.orElse(null);
      optBits |= OPT_BIT_TRANSFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameter(List<StructureMap_Parameter> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = Objects.requireNonNull(parameter, "parameter");
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Target#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parameter")
    public final Builder parameter(Optional<? extends List<StructureMap_Parameter>> parameter) {
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
    public StructureMap_Target build() {
      return new ImmutableStructureMap_Target(
          listMode,
          context,
          listRuleId,
          element,
          modifierExtension,
          id,
          contextType,
          extension,
          variable,
          transform,
          parameter);
    }

    private boolean listModeIsSet() {
      return (optBits & OPT_BIT_LIST_MODE) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean listRuleIdIsSet() {
      return (optBits & OPT_BIT_LIST_RULE_ID) != 0;
    }

    private boolean elementIsSet() {
      return (optBits & OPT_BIT_ELEMENT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean contextTypeIsSet() {
      return (optBits & OPT_BIT_CONTEXT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean variableIsSet() {
      return (optBits & OPT_BIT_VARIABLE) != 0;
    }

    private boolean transformIsSet() {
      return (optBits & OPT_BIT_TRANSFORM) != 0;
    }

    private boolean parameterIsSet() {
      return (optBits & OPT_BIT_PARAMETER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of StructureMap_Target is strict, attribute is already set: ".concat(name));
    }
  }
}
