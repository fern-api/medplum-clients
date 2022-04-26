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
 * Immutable implementation of {@link TestScript_Variable}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript_Variable.builder()}.
 */
@Generated(from = "TestScript_Variable", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript_Variable implements TestScript_Variable {
  private final @Nullable Id sourceId;
  private final @Nullable List<Extension> extension;
  private final @Nullable String headerField;
  private final @Nullable String name;
  private final @Nullable String description;
  private final @Nullable String expression;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String defaultValue;
  private final @Nullable String hint;
  private final @Nullable String id;
  private final @Nullable String path;

  private ImmutableTestScript_Variable(
      @Nullable Id sourceId,
      @Nullable List<Extension> extension,
      @Nullable String headerField,
      @Nullable String name,
      @Nullable String description,
      @Nullable String expression,
      @Nullable List<Extension> modifierExtension,
      @Nullable String defaultValue,
      @Nullable String hint,
      @Nullable String id,
      @Nullable String path) {
    this.sourceId = sourceId;
    this.extension = extension;
    this.headerField = headerField;
    this.name = name;
    this.description = description;
    this.expression = expression;
    this.modifierExtension = modifierExtension;
    this.defaultValue = defaultValue;
    this.hint = hint;
    this.id = id;
    this.path = path;
  }

  /**
   * @return The value of the {@code sourceId} attribute
   */
  @JsonProperty("sourceId")
  @Override
  public Optional<Id> sourceId() {
    return Optional.ofNullable(sourceId);
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
   * @return The value of the {@code headerField} attribute
   */
  @JsonProperty("headerField")
  @Override
  public Optional<String> headerField() {
    return Optional.ofNullable(headerField);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
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
   * @return The value of the {@code expression} attribute
   */
  @JsonProperty("expression")
  @Override
  public Optional<String> expression() {
    return Optional.ofNullable(expression);
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
   * @return The value of the {@code defaultValue} attribute
   */
  @JsonProperty("defaultValue")
  @Override
  public Optional<String> defaultValue() {
    return Optional.ofNullable(defaultValue);
  }

  /**
   * @return The value of the {@code hint} attribute
   */
  @JsonProperty("hint")
  @Override
  public Optional<String> hint() {
    return Optional.ofNullable(hint);
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
   * @return The value of the {@code path} attribute
   */
  @JsonProperty("path")
  @Override
  public Optional<String> path() {
    return Optional.ofNullable(path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#sourceId() sourceId} attribute.
   * @param value The value for sourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withSourceId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "sourceId");
    if (this.sourceId == newValue) return this;
    return new ImmutableTestScript_Variable(
        newValue,
        this.extension,
        this.headerField,
        this.name,
        this.description,
        this.expression,
        this.modifierExtension,
        this.defaultValue,
        this.hint,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#sourceId() sourceId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Variable withSourceId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.sourceId == value) return this;
    return new ImmutableTestScript_Variable(
        value,
        this.extension,
        this.headerField,
        this.name,
        this.description,
        this.expression,
        this.modifierExtension,
        this.defaultValue,
        this.hint,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        newValue,
        this.headerField,
        this.name,
        this.description,
        this.expression,
        this.modifierExtension,
        this.defaultValue,
        this.hint,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Variable withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        value,
        this.headerField,
        this.name,
        this.description,
        this.expression,
        this.modifierExtension,
        this.defaultValue,
        this.hint,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#headerField() headerField} attribute.
   * @param value The value for headerField
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withHeaderField(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "headerField");
    if (Objects.equals(this.headerField, newValue)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        newValue,
        this.name,
        this.description,
        this.expression,
        this.modifierExtension,
        this.defaultValue,
        this.hint,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#headerField() headerField} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for headerField
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withHeaderField(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.headerField, value)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        value,
        this.name,
        this.description,
        this.expression,
        this.modifierExtension,
        this.defaultValue,
        this.hint,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        this.headerField,
        newValue,
        this.description,
        this.expression,
        this.modifierExtension,
        this.defaultValue,
        this.hint,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        this.headerField,
        value,
        this.description,
        this.expression,
        this.modifierExtension,
        this.defaultValue,
        this.hint,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        this.headerField,
        this.name,
        newValue,
        this.expression,
        this.modifierExtension,
        this.defaultValue,
        this.hint,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        this.headerField,
        this.name,
        value,
        this.expression,
        this.modifierExtension,
        this.defaultValue,
        this.hint,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#expression() expression} attribute.
   * @param value The value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withExpression(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "expression");
    if (Objects.equals(this.expression, newValue)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        this.headerField,
        this.name,
        this.description,
        newValue,
        this.modifierExtension,
        this.defaultValue,
        this.hint,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#expression() expression} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withExpression(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.expression, value)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        this.headerField,
        this.name,
        this.description,
        value,
        this.modifierExtension,
        this.defaultValue,
        this.hint,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        this.headerField,
        this.name,
        this.description,
        this.expression,
        newValue,
        this.defaultValue,
        this.hint,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Variable withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        this.headerField,
        this.name,
        this.description,
        this.expression,
        value,
        this.defaultValue,
        this.hint,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#defaultValue() defaultValue} attribute.
   * @param value The value for defaultValue
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withDefaultValue(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "defaultValue");
    if (Objects.equals(this.defaultValue, newValue)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        this.headerField,
        this.name,
        this.description,
        this.expression,
        this.modifierExtension,
        newValue,
        this.hint,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#defaultValue() defaultValue} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValue
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withDefaultValue(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.defaultValue, value)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        this.headerField,
        this.name,
        this.description,
        this.expression,
        this.modifierExtension,
        value,
        this.hint,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#hint() hint} attribute.
   * @param value The value for hint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withHint(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "hint");
    if (Objects.equals(this.hint, newValue)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        this.headerField,
        this.name,
        this.description,
        this.expression,
        this.modifierExtension,
        this.defaultValue,
        newValue,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#hint() hint} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withHint(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.hint, value)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        this.headerField,
        this.name,
        this.description,
        this.expression,
        this.modifierExtension,
        this.defaultValue,
        value,
        this.id,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        this.headerField,
        this.name,
        this.description,
        this.expression,
        this.modifierExtension,
        this.defaultValue,
        this.hint,
        newValue,
        this.path);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        this.headerField,
        this.name,
        this.description,
        this.expression,
        this.modifierExtension,
        this.defaultValue,
        this.hint,
        value,
        this.path);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#path() path} attribute.
   * @param value The value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withPath(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "path");
    if (Objects.equals(this.path, newValue)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        this.headerField,
        this.name,
        this.description,
        this.expression,
        this.modifierExtension,
        this.defaultValue,
        this.hint,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Variable#path() path} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withPath(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.path, value)) return this;
    return new ImmutableTestScript_Variable(
        this.sourceId,
        this.extension,
        this.headerField,
        this.name,
        this.description,
        this.expression,
        this.modifierExtension,
        this.defaultValue,
        this.hint,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript_Variable} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript_Variable
        && equalTo((ImmutableTestScript_Variable) another);
  }

  private boolean equalTo(ImmutableTestScript_Variable another) {
    return Objects.equals(sourceId, another.sourceId)
        && Objects.equals(extension, another.extension)
        && Objects.equals(headerField, another.headerField)
        && Objects.equals(name, another.name)
        && Objects.equals(description, another.description)
        && Objects.equals(expression, another.expression)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(defaultValue, another.defaultValue)
        && Objects.equals(hint, another.hint)
        && Objects.equals(id, another.id)
        && Objects.equals(path, another.path);
  }

  /**
   * Computes a hash code from attributes: {@code sourceId}, {@code extension}, {@code headerField}, {@code name}, {@code description}, {@code expression}, {@code modifierExtension}, {@code defaultValue}, {@code hint}, {@code id}, {@code path}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(sourceId);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(headerField);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(expression);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(defaultValue);
    h += (h << 5) + Objects.hashCode(hint);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(path);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript_Variable} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestScript_Variable{");
    if (sourceId != null) {
      builder.append("sourceId=").append(sourceId);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (headerField != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("headerField=").append(headerField);
    }
    if (name != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (description != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (expression != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("expression=").append(expression);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (defaultValue != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValue=").append(defaultValue);
    }
    if (hint != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("hint=").append(hint);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
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
  @Generated(from = "TestScript_Variable", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestScript_Variable {
    @Nullable Optional<Id> sourceId = Optional.empty();
    boolean sourceIdIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> headerField = Optional.empty();
    boolean headerFieldIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<String> expression = Optional.empty();
    boolean expressionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> defaultValue = Optional.empty();
    boolean defaultValueIsSet;
    @Nullable Optional<String> hint = Optional.empty();
    boolean hintIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> path = Optional.empty();
    boolean pathIsSet;
    @JsonProperty("sourceId")
    public void setSourceId(Optional<Id> sourceId) {
      this.sourceId = sourceId;
      this.sourceIdIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("headerField")
    public void setHeaderField(Optional<String> headerField) {
      this.headerField = headerField;
      this.headerFieldIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("expression")
    public void setExpression(Optional<String> expression) {
      this.expression = expression;
      this.expressionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("defaultValue")
    public void setDefaultValue(Optional<String> defaultValue) {
      this.defaultValue = defaultValue;
      this.defaultValueIsSet = true;
    }
    @JsonProperty("hint")
    public void setHint(Optional<String> hint) {
      this.hint = hint;
      this.hintIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("path")
    public void setPath(Optional<String> path) {
      this.path = path;
      this.pathIsSet = true;
    }
    @Override
    public Optional<Id> sourceId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> headerField() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> expression() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> defaultValue() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> hint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> path() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTestScript_Variable fromJson(Json json) {
    ImmutableTestScript_Variable.Builder builder = ImmutableTestScript_Variable.builder();
    if (json.sourceIdIsSet) {
      builder.sourceId(json.sourceId);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.headerFieldIsSet) {
      builder.headerField(json.headerField);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.expressionIsSet) {
      builder.expression(json.expression);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.defaultValueIsSet) {
      builder.defaultValue(json.defaultValue);
    }
    if (json.hintIsSet) {
      builder.hint(json.hint);
    }
    if (json.idIsSet) {
      builder.id(json.id);
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
        .extension(instance.extension())
        .headerField(instance.headerField())
        .name(instance.name())
        .description(instance.description())
        .expression(instance.expression())
        .modifierExtension(instance.modifierExtension())
        .defaultValue(instance.defaultValue())
        .hint(instance.hint())
        .id(instance.id())
        .path(instance.path())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript_Variable TestScript_Variable}.
   * <pre>
   * ImmutableTestScript_Variable.builder()
   *    .sourceId(com.fhir.types.fhir.Id) // optional {@link TestScript_Variable#sourceId() sourceId}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Variable#extension() extension}
   *    .headerField(String) // optional {@link TestScript_Variable#headerField() headerField}
   *    .name(String) // optional {@link TestScript_Variable#name() name}
   *    .description(String) // optional {@link TestScript_Variable#description() description}
   *    .expression(String) // optional {@link TestScript_Variable#expression() expression}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Variable#modifierExtension() modifierExtension}
   *    .defaultValue(String) // optional {@link TestScript_Variable#defaultValue() defaultValue}
   *    .hint(String) // optional {@link TestScript_Variable#hint() hint}
   *    .id(String) // optional {@link TestScript_Variable#id() id}
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
  @Generated(from = "TestScript_Variable", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SOURCE_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_HEADER_FIELD = 0x4L;
    private static final long OPT_BIT_NAME = 0x8L;
    private static final long OPT_BIT_DESCRIPTION = 0x10L;
    private static final long OPT_BIT_EXPRESSION = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_DEFAULT_VALUE = 0x80L;
    private static final long OPT_BIT_HINT = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_PATH = 0x400L;
    private long optBits;

    private @Nullable Id sourceId;
    private @Nullable List<Extension> extension;
    private @Nullable String headerField;
    private @Nullable String name;
    private @Nullable String description;
    private @Nullable String expression;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String defaultValue;
    private @Nullable String hint;
    private @Nullable String id;
    private @Nullable String path;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#sourceId() sourceId} to sourceId.
     * @param sourceId The value for sourceId
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceId(Id sourceId) {
      checkNotIsSet(sourceIdIsSet(), "sourceId");
      this.sourceId = Objects.requireNonNull(sourceId, "sourceId");
      optBits |= OPT_BIT_SOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#sourceId() sourceId} to sourceId.
     * @param sourceId The value for sourceId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourceId")
    public final Builder sourceId(Optional<? extends Id> sourceId) {
      checkNotIsSet(sourceIdIsSet(), "sourceId");
      this.sourceId = sourceId.orElse(null);
      optBits |= OPT_BIT_SOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Variable#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Variable#headerField() headerField} to headerField.
     * @param headerField The value for headerField
     * @return {@code this} builder for chained invocation
     */
    public final Builder headerField(String headerField) {
      checkNotIsSet(headerFieldIsSet(), "headerField");
      this.headerField = Objects.requireNonNull(headerField, "headerField");
      optBits |= OPT_BIT_HEADER_FIELD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#headerField() headerField} to headerField.
     * @param headerField The value for headerField
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("headerField")
    public final Builder headerField(Optional<String> headerField) {
      checkNotIsSet(headerFieldIsSet(), "headerField");
      this.headerField = headerField.orElse(null);
      optBits |= OPT_BIT_HEADER_FIELD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#description() description} to description.
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
     * Initializes the optional value {@link TestScript_Variable#description() description} to description.
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
     * Initializes the optional value {@link TestScript_Variable#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for chained invocation
     */
    public final Builder expression(String expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = Objects.requireNonNull(expression, "expression");
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("expression")
    public final Builder expression(Optional<String> expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = expression.orElse(null);
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Variable#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Variable#defaultValue() defaultValue} to defaultValue.
     * @param defaultValue The value for defaultValue
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValue(String defaultValue) {
      checkNotIsSet(defaultValueIsSet(), "defaultValue");
      this.defaultValue = Objects.requireNonNull(defaultValue, "defaultValue");
      optBits |= OPT_BIT_DEFAULT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#defaultValue() defaultValue} to defaultValue.
     * @param defaultValue The value for defaultValue
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValue")
    public final Builder defaultValue(Optional<String> defaultValue) {
      checkNotIsSet(defaultValueIsSet(), "defaultValue");
      this.defaultValue = defaultValue.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#hint() hint} to hint.
     * @param hint The value for hint
     * @return {@code this} builder for chained invocation
     */
    public final Builder hint(String hint) {
      checkNotIsSet(hintIsSet(), "hint");
      this.hint = Objects.requireNonNull(hint, "hint");
      optBits |= OPT_BIT_HINT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#hint() hint} to hint.
     * @param hint The value for hint
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("hint")
    public final Builder hint(Optional<String> hint) {
      checkNotIsSet(hintIsSet(), "hint");
      this.hint = hint.orElse(null);
      optBits |= OPT_BIT_HINT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#id() id} to id.
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
     * Initializes the optional value {@link TestScript_Variable#id() id} to id.
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
     * Initializes the optional value {@link TestScript_Variable#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for chained invocation
     */
    public final Builder path(String path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = Objects.requireNonNull(path, "path");
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Variable#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("path")
    public final Builder path(Optional<String> path) {
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
    public TestScript_Variable build() {
      return new ImmutableTestScript_Variable(
          sourceId,
          extension,
          headerField,
          name,
          description,
          expression,
          modifierExtension,
          defaultValue,
          hint,
          id,
          path);
    }

    private boolean sourceIdIsSet() {
      return (optBits & OPT_BIT_SOURCE_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean headerFieldIsSet() {
      return (optBits & OPT_BIT_HEADER_FIELD) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean expressionIsSet() {
      return (optBits & OPT_BIT_EXPRESSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean defaultValueIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE) != 0;
    }

    private boolean hintIsSet() {
      return (optBits & OPT_BIT_HINT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean pathIsSet() {
      return (optBits & OPT_BIT_PATH) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestScript_Variable is strict, attribute is already set: ".concat(name));
    }
  }
}
