package com.fhir;

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
 * Immutable implementation of {@link ValueSet_Parameter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableValueSet_Parameter.builder()}.
 */
@Generated(from = "ValueSet_Parameter", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableValueSet_Parameter implements ValueSet_Parameter {
  private final @Nullable List<Extension> extension;
  private final @Nullable String name;
  private final @Nullable String valueDateTime;
  private final @Nullable String valueCode;
  private final @Nullable Boolean valueBoolean;
  private final @Nullable Double valueInteger;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Double valueDecimal;
  private final @Nullable String valueString;
  private final @Nullable String valueUri;
  private final @Nullable String id;

  private ImmutableValueSet_Parameter(
      @Nullable List<Extension> extension,
      @Nullable String name,
      @Nullable String valueDateTime,
      @Nullable String valueCode,
      @Nullable Boolean valueBoolean,
      @Nullable Double valueInteger,
      @Nullable List<Extension> modifierExtension,
      @Nullable Double valueDecimal,
      @Nullable String valueString,
      @Nullable String valueUri,
      @Nullable String id) {
    this.extension = extension;
    this.name = name;
    this.valueDateTime = valueDateTime;
    this.valueCode = valueCode;
    this.valueBoolean = valueBoolean;
    this.valueInteger = valueInteger;
    this.modifierExtension = modifierExtension;
    this.valueDecimal = valueDecimal;
    this.valueString = valueString;
    this.valueUri = valueUri;
    this.id = id;
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code valueDateTime} attribute
   */
  @JsonProperty("valueDateTime")
  @Override
  public Optional<String> valueDateTime() {
    return Optional.ofNullable(valueDateTime);
  }

  /**
   * @return The value of the {@code valueCode} attribute
   */
  @JsonProperty("valueCode")
  @Override
  public Optional<String> valueCode() {
    return Optional.ofNullable(valueCode);
  }

  /**
   * @return The value of the {@code valueBoolean} attribute
   */
  @JsonProperty("valueBoolean")
  @Override
  public Optional<Boolean> valueBoolean() {
    return Optional.ofNullable(valueBoolean);
  }

  /**
   * @return The value of the {@code valueInteger} attribute
   */
  @JsonProperty("valueInteger")
  @Override
  public Optional<Double> valueInteger() {
    return Optional.ofNullable(valueInteger);
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
   * @return The value of the {@code valueDecimal} attribute
   */
  @JsonProperty("valueDecimal")
  @Override
  public Optional<Double> valueDecimal() {
    return Optional.ofNullable(valueDecimal);
  }

  /**
   * @return The value of the {@code valueString} attribute
   */
  @JsonProperty("valueString")
  @Override
  public Optional<String> valueString() {
    return Optional.ofNullable(valueString);
  }

  /**
   * @return The value of the {@code valueUri} attribute
   */
  @JsonProperty("valueUri")
  @Override
  public Optional<String> valueUri() {
    return Optional.ofNullable(valueUri);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Parameter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableValueSet_Parameter(
        newValue,
        this.name,
        this.valueDateTime,
        this.valueCode,
        this.valueBoolean,
        this.valueInteger,
        this.modifierExtension,
        this.valueDecimal,
        this.valueString,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Parameter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Parameter withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableValueSet_Parameter(
        value,
        this.name,
        this.valueDateTime,
        this.valueCode,
        this.valueBoolean,
        this.valueInteger,
        this.modifierExtension,
        this.valueDecimal,
        this.valueString,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Parameter#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        newValue,
        this.valueDateTime,
        this.valueCode,
        this.valueBoolean,
        this.valueInteger,
        this.modifierExtension,
        this.valueDecimal,
        this.valueString,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Parameter#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        value,
        this.valueDateTime,
        this.valueCode,
        this.valueBoolean,
        this.valueInteger,
        this.modifierExtension,
        this.valueDecimal,
        this.valueString,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Parameter#valueDateTime() valueDateTime} attribute.
   * @param value The value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withValueDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueDateTime");
    if (Objects.equals(this.valueDateTime, newValue)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        newValue,
        this.valueCode,
        this.valueBoolean,
        this.valueInteger,
        this.modifierExtension,
        this.valueDecimal,
        this.valueString,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Parameter#valueDateTime() valueDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withValueDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueDateTime, value)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        value,
        this.valueCode,
        this.valueBoolean,
        this.valueInteger,
        this.modifierExtension,
        this.valueDecimal,
        this.valueString,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Parameter#valueCode() valueCode} attribute.
   * @param value The value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withValueCode(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueCode");
    if (Objects.equals(this.valueCode, newValue)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        this.valueDateTime,
        newValue,
        this.valueBoolean,
        this.valueInteger,
        this.modifierExtension,
        this.valueDecimal,
        this.valueString,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Parameter#valueCode() valueCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withValueCode(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueCode, value)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        this.valueDateTime,
        value,
        this.valueBoolean,
        this.valueInteger,
        this.modifierExtension,
        this.valueDecimal,
        this.valueString,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Parameter#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withValueBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        this.valueDateTime,
        this.valueCode,
        newValue,
        this.valueInteger,
        this.modifierExtension,
        this.valueDecimal,
        this.valueString,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Parameter#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withValueBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        this.valueDateTime,
        this.valueCode,
        value,
        this.valueInteger,
        this.modifierExtension,
        this.valueDecimal,
        this.valueString,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Parameter#valueInteger() valueInteger} attribute.
   * @param value The value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withValueInteger(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueInteger, newValue)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        this.valueDateTime,
        this.valueCode,
        this.valueBoolean,
        newValue,
        this.modifierExtension,
        this.valueDecimal,
        this.valueString,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Parameter#valueInteger() valueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withValueInteger(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueInteger, value)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        this.valueDateTime,
        this.valueCode,
        this.valueBoolean,
        value,
        this.modifierExtension,
        this.valueDecimal,
        this.valueString,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Parameter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        this.valueDateTime,
        this.valueCode,
        this.valueBoolean,
        this.valueInteger,
        newValue,
        this.valueDecimal,
        this.valueString,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Parameter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Parameter withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        this.valueDateTime,
        this.valueCode,
        this.valueBoolean,
        this.valueInteger,
        value,
        this.valueDecimal,
        this.valueString,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Parameter#valueDecimal() valueDecimal} attribute.
   * @param value The value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withValueDecimal(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueDecimal, newValue)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        this.valueDateTime,
        this.valueCode,
        this.valueBoolean,
        this.valueInteger,
        this.modifierExtension,
        newValue,
        this.valueString,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Parameter#valueDecimal() valueDecimal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withValueDecimal(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueDecimal, value)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        this.valueDateTime,
        this.valueCode,
        this.valueBoolean,
        this.valueInteger,
        this.modifierExtension,
        value,
        this.valueString,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Parameter#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withValueString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueString");
    if (Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        this.valueDateTime,
        this.valueCode,
        this.valueBoolean,
        this.valueInteger,
        this.modifierExtension,
        this.valueDecimal,
        newValue,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Parameter#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withValueString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueString, value)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        this.valueDateTime,
        this.valueCode,
        this.valueBoolean,
        this.valueInteger,
        this.modifierExtension,
        this.valueDecimal,
        value,
        this.valueUri,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Parameter#valueUri() valueUri} attribute.
   * @param value The value for valueUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withValueUri(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueUri");
    if (Objects.equals(this.valueUri, newValue)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        this.valueDateTime,
        this.valueCode,
        this.valueBoolean,
        this.valueInteger,
        this.modifierExtension,
        this.valueDecimal,
        this.valueString,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Parameter#valueUri() valueUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withValueUri(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueUri, value)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        this.valueDateTime,
        this.valueCode,
        this.valueBoolean,
        this.valueInteger,
        this.modifierExtension,
        this.valueDecimal,
        this.valueString,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Parameter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        this.valueDateTime,
        this.valueCode,
        this.valueBoolean,
        this.valueInteger,
        this.modifierExtension,
        this.valueDecimal,
        this.valueString,
        this.valueUri,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Parameter#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Parameter withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableValueSet_Parameter(
        this.extension,
        this.name,
        this.valueDateTime,
        this.valueCode,
        this.valueBoolean,
        this.valueInteger,
        this.modifierExtension,
        this.valueDecimal,
        this.valueString,
        this.valueUri,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableValueSet_Parameter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableValueSet_Parameter
        && equalTo((ImmutableValueSet_Parameter) another);
  }

  private boolean equalTo(ImmutableValueSet_Parameter another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(name, another.name)
        && Objects.equals(valueDateTime, another.valueDateTime)
        && Objects.equals(valueCode, another.valueCode)
        && Objects.equals(valueBoolean, another.valueBoolean)
        && Objects.equals(valueInteger, another.valueInteger)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(valueDecimal, another.valueDecimal)
        && Objects.equals(valueString, another.valueString)
        && Objects.equals(valueUri, another.valueUri)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code name}, {@code valueDateTime}, {@code valueCode}, {@code valueBoolean}, {@code valueInteger}, {@code modifierExtension}, {@code valueDecimal}, {@code valueString}, {@code valueUri}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(valueDateTime);
    h += (h << 5) + Objects.hashCode(valueCode);
    h += (h << 5) + Objects.hashCode(valueBoolean);
    h += (h << 5) + Objects.hashCode(valueInteger);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(valueDecimal);
    h += (h << 5) + Objects.hashCode(valueString);
    h += (h << 5) + Objects.hashCode(valueUri);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code ValueSet_Parameter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ValueSet_Parameter{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (name != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (valueDateTime != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("valueDateTime=").append(valueDateTime);
    }
    if (valueCode != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("valueCode=").append(valueCode);
    }
    if (valueBoolean != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (valueInteger != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("valueInteger=").append(valueInteger);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (valueDecimal != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("valueDecimal=").append(valueDecimal);
    }
    if (valueString != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (valueUri != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("valueUri=").append(valueUri);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ValueSet_Parameter", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ValueSet_Parameter {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> valueDateTime = Optional.empty();
    boolean valueDateTimeIsSet;
    @Nullable Optional<String> valueCode = Optional.empty();
    boolean valueCodeIsSet;
    @Nullable Optional<Boolean> valueBoolean = Optional.empty();
    boolean valueBooleanIsSet;
    @Nullable Optional<Double> valueInteger = Optional.empty();
    boolean valueIntegerIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Double> valueDecimal = Optional.empty();
    boolean valueDecimalIsSet;
    @Nullable Optional<String> valueString = Optional.empty();
    boolean valueStringIsSet;
    @Nullable Optional<String> valueUri = Optional.empty();
    boolean valueUriIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("valueDateTime")
    public void setValueDateTime(Optional<String> valueDateTime) {
      this.valueDateTime = valueDateTime;
      this.valueDateTimeIsSet = true;
    }
    @JsonProperty("valueCode")
    public void setValueCode(Optional<String> valueCode) {
      this.valueCode = valueCode;
      this.valueCodeIsSet = true;
    }
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Optional<Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @JsonProperty("valueInteger")
    public void setValueInteger(Optional<Double> valueInteger) {
      this.valueInteger = valueInteger;
      this.valueIntegerIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("valueDecimal")
    public void setValueDecimal(Optional<Double> valueDecimal) {
      this.valueDecimal = valueDecimal;
      this.valueDecimalIsSet = true;
    }
    @JsonProperty("valueString")
    public void setValueString(Optional<String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @JsonProperty("valueUri")
    public void setValueUri(Optional<String> valueUri) {
      this.valueUri = valueUri;
      this.valueUriIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueInteger() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueDecimal() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueUri() { throw new UnsupportedOperationException(); }
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
  static ImmutableValueSet_Parameter fromJson(Json json) {
    ImmutableValueSet_Parameter.Builder builder = ImmutableValueSet_Parameter.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.valueDateTimeIsSet) {
      builder.valueDateTime(json.valueDateTime);
    }
    if (json.valueCodeIsSet) {
      builder.valueCode(json.valueCode);
    }
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.valueIntegerIsSet) {
      builder.valueInteger(json.valueInteger);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueDecimalIsSet) {
      builder.valueDecimal(json.valueDecimal);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.valueUriIsSet) {
      builder.valueUri(json.valueUri);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableValueSet_Parameter) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ValueSet_Parameter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ValueSet_Parameter instance
   */
  public static ValueSet_Parameter copyOf(ValueSet_Parameter instance) {
    if (instance instanceof ImmutableValueSet_Parameter) {
      return (ImmutableValueSet_Parameter) instance;
    }
    return ImmutableValueSet_Parameter.builder()
        .extension(instance.extension())
        .name(instance.name())
        .valueDateTime(instance.valueDateTime())
        .valueCode(instance.valueCode())
        .valueBoolean(instance.valueBoolean())
        .valueInteger(instance.valueInteger())
        .modifierExtension(instance.modifierExtension())
        .valueDecimal(instance.valueDecimal())
        .valueString(instance.valueString())
        .valueUri(instance.valueUri())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link ValueSet_Parameter ValueSet_Parameter}.
   * <pre>
   * ImmutableValueSet_Parameter.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ValueSet_Parameter#extension() extension}
   *    .name(String) // optional {@link ValueSet_Parameter#name() name}
   *    .valueDateTime(String) // optional {@link ValueSet_Parameter#valueDateTime() valueDateTime}
   *    .valueCode(String) // optional {@link ValueSet_Parameter#valueCode() valueCode}
   *    .valueBoolean(Boolean) // optional {@link ValueSet_Parameter#valueBoolean() valueBoolean}
   *    .valueInteger(Double) // optional {@link ValueSet_Parameter#valueInteger() valueInteger}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ValueSet_Parameter#modifierExtension() modifierExtension}
   *    .valueDecimal(Double) // optional {@link ValueSet_Parameter#valueDecimal() valueDecimal}
   *    .valueString(String) // optional {@link ValueSet_Parameter#valueString() valueString}
   *    .valueUri(String) // optional {@link ValueSet_Parameter#valueUri() valueUri}
   *    .id(String) // optional {@link ValueSet_Parameter#id() id}
   *    .build();
   * </pre>
   * @return A new ValueSet_Parameter builder
   */
  public static ImmutableValueSet_Parameter.Builder builder() {
    return new ImmutableValueSet_Parameter.Builder();
  }

  /**
   * Builds instances of type {@link ValueSet_Parameter ValueSet_Parameter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ValueSet_Parameter", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_NAME = 0x2L;
    private static final long OPT_BIT_VALUE_DATE_TIME = 0x4L;
    private static final long OPT_BIT_VALUE_CODE = 0x8L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x10L;
    private static final long OPT_BIT_VALUE_INTEGER = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_VALUE_DECIMAL = 0x80L;
    private static final long OPT_BIT_VALUE_STRING = 0x100L;
    private static final long OPT_BIT_VALUE_URI = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable String name;
    private @Nullable String valueDateTime;
    private @Nullable String valueCode;
    private @Nullable Boolean valueBoolean;
    private @Nullable Double valueInteger;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Double valueDecimal;
    private @Nullable String valueString;
    private @Nullable String valueUri;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ValueSet_Parameter#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Parameter#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Parameter#name() name} to name.
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
     * Initializes the optional value {@link ValueSet_Parameter#name() name} to name.
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
     * Initializes the optional value {@link ValueSet_Parameter#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDateTime(String valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = Objects.requireNonNull(valueDateTime, "valueDateTime");
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Parameter#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDateTime")
    public final Builder valueDateTime(Optional<String> valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = valueDateTime.orElse(null);
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Parameter#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCode(String valueCode) {
      checkNotIsSet(valueCodeIsSet(), "valueCode");
      this.valueCode = Objects.requireNonNull(valueCode, "valueCode");
      optBits |= OPT_BIT_VALUE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Parameter#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueCode")
    public final Builder valueCode(Optional<String> valueCode) {
      checkNotIsSet(valueCodeIsSet(), "valueCode");
      this.valueCode = valueCode.orElse(null);
      optBits |= OPT_BIT_VALUE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Parameter#valueBoolean() valueBoolean} to valueBoolean.
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
     * Initializes the optional value {@link ValueSet_Parameter#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueBoolean")
    public final Builder valueBoolean(Optional<Boolean> valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean.orElse(null);
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Parameter#valueInteger() valueInteger} to valueInteger.
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
     * Initializes the optional value {@link ValueSet_Parameter#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueInteger")
    public final Builder valueInteger(Optional<Double> valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger.orElse(null);
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Parameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ValueSet_Parameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ValueSet_Parameter#valueDecimal() valueDecimal} to valueDecimal.
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
     * Initializes the optional value {@link ValueSet_Parameter#valueDecimal() valueDecimal} to valueDecimal.
     * @param valueDecimal The value for valueDecimal
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDecimal")
    public final Builder valueDecimal(Optional<Double> valueDecimal) {
      checkNotIsSet(valueDecimalIsSet(), "valueDecimal");
      this.valueDecimal = valueDecimal.orElse(null);
      optBits |= OPT_BIT_VALUE_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Parameter#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueString(String valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = Objects.requireNonNull(valueString, "valueString");
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Parameter#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueString")
    public final Builder valueString(Optional<String> valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = valueString.orElse(null);
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Parameter#valueUri() valueUri} to valueUri.
     * @param valueUri The value for valueUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueUri(String valueUri) {
      checkNotIsSet(valueUriIsSet(), "valueUri");
      this.valueUri = Objects.requireNonNull(valueUri, "valueUri");
      optBits |= OPT_BIT_VALUE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Parameter#valueUri() valueUri} to valueUri.
     * @param valueUri The value for valueUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueUri")
    public final Builder valueUri(Optional<String> valueUri) {
      checkNotIsSet(valueUriIsSet(), "valueUri");
      this.valueUri = valueUri.orElse(null);
      optBits |= OPT_BIT_VALUE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Parameter#id() id} to id.
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
     * Initializes the optional value {@link ValueSet_Parameter#id() id} to id.
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
     * Builds a new {@link ValueSet_Parameter ValueSet_Parameter}.
     * @return An immutable instance of ValueSet_Parameter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ValueSet_Parameter build() {
      return new ImmutableValueSet_Parameter(
          extension,
          name,
          valueDateTime,
          valueCode,
          valueBoolean,
          valueInteger,
          modifierExtension,
          valueDecimal,
          valueString,
          valueUri,
          id);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean valueDateTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE_TIME) != 0;
    }

    private boolean valueCodeIsSet() {
      return (optBits & OPT_BIT_VALUE_CODE) != 0;
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean valueIntegerIsSet() {
      return (optBits & OPT_BIT_VALUE_INTEGER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueDecimalIsSet() {
      return (optBits & OPT_BIT_VALUE_DECIMAL) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean valueUriIsSet() {
      return (optBits & OPT_BIT_VALUE_URI) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ValueSet_Parameter is strict, attribute is already set: ".concat(name));
    }
  }
}