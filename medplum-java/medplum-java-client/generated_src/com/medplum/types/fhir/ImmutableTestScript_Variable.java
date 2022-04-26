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
  private final @Nullable String expression;
  private final @Nullable String hint;
  private final @Nullable String path;
  private final @Nullable String name;
  private final @Nullable String id;
  private final @Nullable String defaultValue;
  private final @Nullable String description;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String headerField;

  private ImmutableTestScript_Variable(
      @Nullable Id sourceId,
      @Nullable String expression,
      @Nullable String hint,
      @Nullable String path,
      @Nullable String name,
      @Nullable String id,
      @Nullable String defaultValue,
      @Nullable String description,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String headerField) {
    this.sourceId = sourceId;
    this.expression = expression;
    this.hint = hint;
    this.path = path;
    this.name = name;
    this.id = id;
    this.defaultValue = defaultValue;
    this.description = description;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.headerField = headerField;
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
   * @return The value of the {@code expression} attribute
   */
  @JsonProperty("expression")
  @Override
  public Optional<String> expression() {
    return Optional.ofNullable(expression);
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
   * @return The value of the {@code path} attribute
   */
  @JsonProperty("path")
  @Override
  public Optional<String> path() {
    return Optional.ofNullable(path);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Variable#sourceId() sourceId} attribute.
   * @param value The value for sourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Variable withSourceId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "sourceId");
    if (this.sourceId == newValue) return this;
    return new ImmutableTestScript_Variable(
        newValue,
        this.expression,
        this.hint,
        this.path,
        this.name,
        this.id,
        this.defaultValue,
        this.description,
        this.extension,
        this.modifierExtension,
        this.headerField);
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
        this.expression,
        this.hint,
        this.path,
        this.name,
        this.id,
        this.defaultValue,
        this.description,
        this.extension,
        this.modifierExtension,
        this.headerField);
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
        newValue,
        this.hint,
        this.path,
        this.name,
        this.id,
        this.defaultValue,
        this.description,
        this.extension,
        this.modifierExtension,
        this.headerField);
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
        value,
        this.hint,
        this.path,
        this.name,
        this.id,
        this.defaultValue,
        this.description,
        this.extension,
        this.modifierExtension,
        this.headerField);
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
        this.expression,
        newValue,
        this.path,
        this.name,
        this.id,
        this.defaultValue,
        this.description,
        this.extension,
        this.modifierExtension,
        this.headerField);
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
        this.expression,
        value,
        this.path,
        this.name,
        this.id,
        this.defaultValue,
        this.description,
        this.extension,
        this.modifierExtension,
        this.headerField);
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
        this.expression,
        this.hint,
        newValue,
        this.name,
        this.id,
        this.defaultValue,
        this.description,
        this.extension,
        this.modifierExtension,
        this.headerField);
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
        this.expression,
        this.hint,
        value,
        this.name,
        this.id,
        this.defaultValue,
        this.description,
        this.extension,
        this.modifierExtension,
        this.headerField);
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
        this.expression,
        this.hint,
        this.path,
        newValue,
        this.id,
        this.defaultValue,
        this.description,
        this.extension,
        this.modifierExtension,
        this.headerField);
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
        this.expression,
        this.hint,
        this.path,
        value,
        this.id,
        this.defaultValue,
        this.description,
        this.extension,
        this.modifierExtension,
        this.headerField);
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
        this.expression,
        this.hint,
        this.path,
        this.name,
        newValue,
        this.defaultValue,
        this.description,
        this.extension,
        this.modifierExtension,
        this.headerField);
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
        this.expression,
        this.hint,
        this.path,
        this.name,
        value,
        this.defaultValue,
        this.description,
        this.extension,
        this.modifierExtension,
        this.headerField);
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
        this.expression,
        this.hint,
        this.path,
        this.name,
        this.id,
        newValue,
        this.description,
        this.extension,
        this.modifierExtension,
        this.headerField);
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
        this.expression,
        this.hint,
        this.path,
        this.name,
        this.id,
        value,
        this.description,
        this.extension,
        this.modifierExtension,
        this.headerField);
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
        this.expression,
        this.hint,
        this.path,
        this.name,
        this.id,
        this.defaultValue,
        newValue,
        this.extension,
        this.modifierExtension,
        this.headerField);
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
        this.expression,
        this.hint,
        this.path,
        this.name,
        this.id,
        this.defaultValue,
        value,
        this.extension,
        this.modifierExtension,
        this.headerField);
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
        this.expression,
        this.hint,
        this.path,
        this.name,
        this.id,
        this.defaultValue,
        this.description,
        newValue,
        this.modifierExtension,
        this.headerField);
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
        this.expression,
        this.hint,
        this.path,
        this.name,
        this.id,
        this.defaultValue,
        this.description,
        value,
        this.modifierExtension,
        this.headerField);
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
        this.expression,
        this.hint,
        this.path,
        this.name,
        this.id,
        this.defaultValue,
        this.description,
        this.extension,
        newValue,
        this.headerField);
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
        this.expression,
        this.hint,
        this.path,
        this.name,
        this.id,
        this.defaultValue,
        this.description,
        this.extension,
        value,
        this.headerField);
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
        this.expression,
        this.hint,
        this.path,
        this.name,
        this.id,
        this.defaultValue,
        this.description,
        this.extension,
        this.modifierExtension,
        newValue);
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
        this.expression,
        this.hint,
        this.path,
        this.name,
        this.id,
        this.defaultValue,
        this.description,
        this.extension,
        this.modifierExtension,
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
        && Objects.equals(expression, another.expression)
        && Objects.equals(hint, another.hint)
        && Objects.equals(path, another.path)
        && Objects.equals(name, another.name)
        && Objects.equals(id, another.id)
        && Objects.equals(defaultValue, another.defaultValue)
        && Objects.equals(description, another.description)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(headerField, another.headerField);
  }

  /**
   * Computes a hash code from attributes: {@code sourceId}, {@code expression}, {@code hint}, {@code path}, {@code name}, {@code id}, {@code defaultValue}, {@code description}, {@code extension}, {@code modifierExtension}, {@code headerField}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(sourceId);
    h += (h << 5) + Objects.hashCode(expression);
    h += (h << 5) + Objects.hashCode(hint);
    h += (h << 5) + Objects.hashCode(path);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(defaultValue);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(headerField);
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
    if (expression != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("expression=").append(expression);
    }
    if (hint != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("hint=").append(hint);
    }
    if (path != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("path=").append(path);
    }
    if (name != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (defaultValue != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValue=").append(defaultValue);
    }
    if (description != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (headerField != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("headerField=").append(headerField);
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
    @Nullable Optional<String> expression = Optional.empty();
    boolean expressionIsSet;
    @Nullable Optional<String> hint = Optional.empty();
    boolean hintIsSet;
    @Nullable Optional<String> path = Optional.empty();
    boolean pathIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> defaultValue = Optional.empty();
    boolean defaultValueIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> headerField = Optional.empty();
    boolean headerFieldIsSet;
    @JsonProperty("sourceId")
    public void setSourceId(Optional<Id> sourceId) {
      this.sourceId = sourceId;
      this.sourceIdIsSet = true;
    }
    @JsonProperty("expression")
    public void setExpression(Optional<String> expression) {
      this.expression = expression;
      this.expressionIsSet = true;
    }
    @JsonProperty("hint")
    public void setHint(Optional<String> hint) {
      this.hint = hint;
      this.hintIsSet = true;
    }
    @JsonProperty("path")
    public void setPath(Optional<String> path) {
      this.path = path;
      this.pathIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("defaultValue")
    public void setDefaultValue(Optional<String> defaultValue) {
      this.defaultValue = defaultValue;
      this.defaultValueIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("headerField")
    public void setHeaderField(Optional<String> headerField) {
      this.headerField = headerField;
      this.headerFieldIsSet = true;
    }
    @Override
    public Optional<Id> sourceId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> expression() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> hint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> path() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> defaultValue() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> headerField() { throw new UnsupportedOperationException(); }
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
    if (json.expressionIsSet) {
      builder.expression(json.expression);
    }
    if (json.hintIsSet) {
      builder.hint(json.hint);
    }
    if (json.pathIsSet) {
      builder.path(json.path);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.defaultValueIsSet) {
      builder.defaultValue(json.defaultValue);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.headerFieldIsSet) {
      builder.headerField(json.headerField);
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
        .expression(instance.expression())
        .hint(instance.hint())
        .path(instance.path())
        .name(instance.name())
        .id(instance.id())
        .defaultValue(instance.defaultValue())
        .description(instance.description())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .headerField(instance.headerField())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript_Variable TestScript_Variable}.
   * <pre>
   * ImmutableTestScript_Variable.builder()
   *    .sourceId(com.medplum.types.fhir.Id) // optional {@link TestScript_Variable#sourceId() sourceId}
   *    .expression(String) // optional {@link TestScript_Variable#expression() expression}
   *    .hint(String) // optional {@link TestScript_Variable#hint() hint}
   *    .path(String) // optional {@link TestScript_Variable#path() path}
   *    .name(String) // optional {@link TestScript_Variable#name() name}
   *    .id(String) // optional {@link TestScript_Variable#id() id}
   *    .defaultValue(String) // optional {@link TestScript_Variable#defaultValue() defaultValue}
   *    .description(String) // optional {@link TestScript_Variable#description() description}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Variable#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Variable#modifierExtension() modifierExtension}
   *    .headerField(String) // optional {@link TestScript_Variable#headerField() headerField}
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
    private static final long OPT_BIT_EXPRESSION = 0x2L;
    private static final long OPT_BIT_HINT = 0x4L;
    private static final long OPT_BIT_PATH = 0x8L;
    private static final long OPT_BIT_NAME = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_DEFAULT_VALUE = 0x40L;
    private static final long OPT_BIT_DESCRIPTION = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_HEADER_FIELD = 0x400L;
    private long optBits;

    private @Nullable Id sourceId;
    private @Nullable String expression;
    private @Nullable String hint;
    private @Nullable String path;
    private @Nullable String name;
    private @Nullable String id;
    private @Nullable String defaultValue;
    private @Nullable String description;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String headerField;

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
     * Builds a new {@link TestScript_Variable TestScript_Variable}.
     * @return An immutable instance of TestScript_Variable
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestScript_Variable build() {
      return new ImmutableTestScript_Variable(
          sourceId,
          expression,
          hint,
          path,
          name,
          id,
          defaultValue,
          description,
          extension,
          modifierExtension,
          headerField);
    }

    private boolean sourceIdIsSet() {
      return (optBits & OPT_BIT_SOURCE_ID) != 0;
    }

    private boolean expressionIsSet() {
      return (optBits & OPT_BIT_EXPRESSION) != 0;
    }

    private boolean hintIsSet() {
      return (optBits & OPT_BIT_HINT) != 0;
    }

    private boolean pathIsSet() {
      return (optBits & OPT_BIT_PATH) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean defaultValueIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean headerFieldIsSet() {
      return (optBits & OPT_BIT_HEADER_FIELD) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestScript_Variable is strict, attribute is already set: ".concat(name));
    }
  }
}
