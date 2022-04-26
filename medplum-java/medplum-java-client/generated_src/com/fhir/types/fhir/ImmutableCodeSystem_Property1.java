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
 * Immutable implementation of {@link CodeSystem_Property1}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCodeSystem_Property1.builder()}.
 */
@Generated(from = "CodeSystem_Property1", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCodeSystem_Property1 implements CodeSystem_Property1 {
  private final @Nullable List<Extension> extension;
  private final @Nullable String valueString;
  private final @Nullable String valueCode;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Boolean valueBoolean;
  private final @Nullable Double valueInteger;
  private final @Nullable String id;
  private final @Nullable Code code;
  private final @Nullable String valueDateTime;
  private final @Nullable Double valueDecimal;
  private final @Nullable Coding valueCoding;

  private ImmutableCodeSystem_Property1(
      @Nullable List<Extension> extension,
      @Nullable String valueString,
      @Nullable String valueCode,
      @Nullable List<Extension> modifierExtension,
      @Nullable Boolean valueBoolean,
      @Nullable Double valueInteger,
      @Nullable String id,
      @Nullable Code code,
      @Nullable String valueDateTime,
      @Nullable Double valueDecimal,
      @Nullable Coding valueCoding) {
    this.extension = extension;
    this.valueString = valueString;
    this.valueCode = valueCode;
    this.modifierExtension = modifierExtension;
    this.valueBoolean = valueBoolean;
    this.valueInteger = valueInteger;
    this.id = id;
    this.code = code;
    this.valueDateTime = valueDateTime;
    this.valueDecimal = valueDecimal;
    this.valueCoding = valueCoding;
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
   * @return The value of the {@code valueString} attribute
   */
  @JsonProperty("valueString")
  @Override
  public Optional<String> valueString() {
    return Optional.ofNullable(valueString);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Code> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code valueDecimal} attribute
   */
  @JsonProperty("valueDecimal")
  @Override
  public Optional<Double> valueDecimal() {
    return Optional.ofNullable(valueDecimal);
  }

  /**
   * @return The value of the {@code valueCoding} attribute
   */
  @JsonProperty("valueCoding")
  @Override
  public Optional<Coding> valueCoding() {
    return Optional.ofNullable(valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCodeSystem_Property1(
        newValue,
        this.valueString,
        this.valueCode,
        this.modifierExtension,
        this.valueBoolean,
        this.valueInteger,
        this.id,
        this.code,
        this.valueDateTime,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Property1 withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCodeSystem_Property1(
        value,
        this.valueString,
        this.valueCode,
        this.modifierExtension,
        this.valueBoolean,
        this.valueInteger,
        this.id,
        this.code,
        this.valueDateTime,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueString");
    if (Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        newValue,
        this.valueCode,
        this.modifierExtension,
        this.valueBoolean,
        this.valueInteger,
        this.id,
        this.code,
        this.valueDateTime,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueString, value)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        value,
        this.valueCode,
        this.modifierExtension,
        this.valueBoolean,
        this.valueInteger,
        this.id,
        this.code,
        this.valueDateTime,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#valueCode() valueCode} attribute.
   * @param value The value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueCode(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueCode");
    if (Objects.equals(this.valueCode, newValue)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        newValue,
        this.modifierExtension,
        this.valueBoolean,
        this.valueInteger,
        this.id,
        this.code,
        this.valueDateTime,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#valueCode() valueCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueCode(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueCode, value)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        value,
        this.modifierExtension,
        this.valueBoolean,
        this.valueInteger,
        this.id,
        this.code,
        this.valueDateTime,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        this.valueCode,
        newValue,
        this.valueBoolean,
        this.valueInteger,
        this.id,
        this.code,
        this.valueDateTime,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Property1 withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        this.valueCode,
        value,
        this.valueBoolean,
        this.valueInteger,
        this.id,
        this.code,
        this.valueDateTime,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        this.valueCode,
        this.modifierExtension,
        newValue,
        this.valueInteger,
        this.id,
        this.code,
        this.valueDateTime,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        this.valueCode,
        this.modifierExtension,
        value,
        this.valueInteger,
        this.id,
        this.code,
        this.valueDateTime,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#valueInteger() valueInteger} attribute.
   * @param value The value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueInteger(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueInteger, newValue)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        this.valueCode,
        this.modifierExtension,
        this.valueBoolean,
        newValue,
        this.id,
        this.code,
        this.valueDateTime,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#valueInteger() valueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueInteger(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueInteger, value)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        this.valueCode,
        this.modifierExtension,
        this.valueBoolean,
        value,
        this.id,
        this.code,
        this.valueDateTime,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        this.valueCode,
        this.modifierExtension,
        this.valueBoolean,
        this.valueInteger,
        newValue,
        this.code,
        this.valueDateTime,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        this.valueCode,
        this.modifierExtension,
        this.valueBoolean,
        this.valueInteger,
        value,
        this.code,
        this.valueDateTime,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        this.valueCode,
        this.modifierExtension,
        this.valueBoolean,
        this.valueInteger,
        this.id,
        newValue,
        this.valueDateTime,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Property1 withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        this.valueCode,
        this.modifierExtension,
        this.valueBoolean,
        this.valueInteger,
        this.id,
        value,
        this.valueDateTime,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#valueDateTime() valueDateTime} attribute.
   * @param value The value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueDateTime");
    if (Objects.equals(this.valueDateTime, newValue)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        this.valueCode,
        this.modifierExtension,
        this.valueBoolean,
        this.valueInteger,
        this.id,
        this.code,
        newValue,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#valueDateTime() valueDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueDateTime, value)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        this.valueCode,
        this.modifierExtension,
        this.valueBoolean,
        this.valueInteger,
        this.id,
        this.code,
        value,
        this.valueDecimal,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#valueDecimal() valueDecimal} attribute.
   * @param value The value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueDecimal(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueDecimal, newValue)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        this.valueCode,
        this.modifierExtension,
        this.valueBoolean,
        this.valueInteger,
        this.id,
        this.code,
        this.valueDateTime,
        newValue,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#valueDecimal() valueDecimal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueDecimal(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueDecimal, value)) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        this.valueCode,
        this.modifierExtension,
        this.valueBoolean,
        this.valueInteger,
        this.id,
        this.code,
        this.valueDateTime,
        value,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property1#valueCoding() valueCoding} attribute.
   * @param value The value for valueCoding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property1 withValueCoding(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "valueCoding");
    if (this.valueCoding == newValue) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        this.valueCode,
        this.modifierExtension,
        this.valueBoolean,
        this.valueInteger,
        this.id,
        this.code,
        this.valueDateTime,
        this.valueDecimal,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property1#valueCoding() valueCoding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCoding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Property1 withValueCoding(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.valueCoding == value) return this;
    return new ImmutableCodeSystem_Property1(
        this.extension,
        this.valueString,
        this.valueCode,
        this.modifierExtension,
        this.valueBoolean,
        this.valueInteger,
        this.id,
        this.code,
        this.valueDateTime,
        this.valueDecimal,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCodeSystem_Property1} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCodeSystem_Property1
        && equalTo((ImmutableCodeSystem_Property1) another);
  }

  private boolean equalTo(ImmutableCodeSystem_Property1 another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(valueString, another.valueString)
        && Objects.equals(valueCode, another.valueCode)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(valueBoolean, another.valueBoolean)
        && Objects.equals(valueInteger, another.valueInteger)
        && Objects.equals(id, another.id)
        && Objects.equals(code, another.code)
        && Objects.equals(valueDateTime, another.valueDateTime)
        && Objects.equals(valueDecimal, another.valueDecimal)
        && Objects.equals(valueCoding, another.valueCoding);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code valueString}, {@code valueCode}, {@code modifierExtension}, {@code valueBoolean}, {@code valueInteger}, {@code id}, {@code code}, {@code valueDateTime}, {@code valueDecimal}, {@code valueCoding}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(valueString);
    h += (h << 5) + Objects.hashCode(valueCode);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(valueBoolean);
    h += (h << 5) + Objects.hashCode(valueInteger);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(valueDateTime);
    h += (h << 5) + Objects.hashCode(valueDecimal);
    h += (h << 5) + Objects.hashCode(valueCoding);
    return h;
  }

  /**
   * Prints the immutable value {@code CodeSystem_Property1} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CodeSystem_Property1{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (valueString != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (valueCode != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueCode=").append(valueCode);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (valueBoolean != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (valueInteger != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueInteger=").append(valueInteger);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (code != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (valueDateTime != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueDateTime=").append(valueDateTime);
    }
    if (valueDecimal != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueDecimal=").append(valueDecimal);
    }
    if (valueCoding != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueCoding=").append(valueCoding);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CodeSystem_Property1", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CodeSystem_Property1 {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> valueString = Optional.empty();
    boolean valueStringIsSet;
    @Nullable Optional<String> valueCode = Optional.empty();
    boolean valueCodeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Boolean> valueBoolean = Optional.empty();
    boolean valueBooleanIsSet;
    @Nullable Optional<Double> valueInteger = Optional.empty();
    boolean valueIntegerIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<String> valueDateTime = Optional.empty();
    boolean valueDateTimeIsSet;
    @Nullable Optional<Double> valueDecimal = Optional.empty();
    boolean valueDecimalIsSet;
    @Nullable Optional<Coding> valueCoding = Optional.empty();
    boolean valueCodingIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("valueString")
    public void setValueString(Optional<String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @JsonProperty("valueCode")
    public void setValueCode(Optional<String> valueCode) {
      this.valueCode = valueCode;
      this.valueCodeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
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
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<Code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("valueDateTime")
    public void setValueDateTime(Optional<String> valueDateTime) {
      this.valueDateTime = valueDateTime;
      this.valueDateTimeIsSet = true;
    }
    @JsonProperty("valueDecimal")
    public void setValueDecimal(Optional<Double> valueDecimal) {
      this.valueDecimal = valueDecimal;
      this.valueDecimalIsSet = true;
    }
    @JsonProperty("valueCoding")
    public void setValueCoding(Optional<Coding> valueCoding) {
      this.valueCoding = valueCoding;
      this.valueCodingIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueInteger() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueDecimal() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> valueCoding() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCodeSystem_Property1 fromJson(Json json) {
    ImmutableCodeSystem_Property1.Builder builder = ImmutableCodeSystem_Property1.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.valueCodeIsSet) {
      builder.valueCode(json.valueCode);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.valueIntegerIsSet) {
      builder.valueInteger(json.valueInteger);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.valueDateTimeIsSet) {
      builder.valueDateTime(json.valueDateTime);
    }
    if (json.valueDecimalIsSet) {
      builder.valueDecimal(json.valueDecimal);
    }
    if (json.valueCodingIsSet) {
      builder.valueCoding(json.valueCoding);
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
        .valueString(instance.valueString())
        .valueCode(instance.valueCode())
        .modifierExtension(instance.modifierExtension())
        .valueBoolean(instance.valueBoolean())
        .valueInteger(instance.valueInteger())
        .id(instance.id())
        .code(instance.code())
        .valueDateTime(instance.valueDateTime())
        .valueDecimal(instance.valueDecimal())
        .valueCoding(instance.valueCoding())
        .build();
  }

  /**
   * Creates a builder for {@link CodeSystem_Property1 CodeSystem_Property1}.
   * <pre>
   * ImmutableCodeSystem_Property1.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CodeSystem_Property1#extension() extension}
   *    .valueString(String) // optional {@link CodeSystem_Property1#valueString() valueString}
   *    .valueCode(String) // optional {@link CodeSystem_Property1#valueCode() valueCode}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CodeSystem_Property1#modifierExtension() modifierExtension}
   *    .valueBoolean(Boolean) // optional {@link CodeSystem_Property1#valueBoolean() valueBoolean}
   *    .valueInteger(Double) // optional {@link CodeSystem_Property1#valueInteger() valueInteger}
   *    .id(String) // optional {@link CodeSystem_Property1#id() id}
   *    .code(com.fhir.types.fhir.Code) // optional {@link CodeSystem_Property1#code() code}
   *    .valueDateTime(String) // optional {@link CodeSystem_Property1#valueDateTime() valueDateTime}
   *    .valueDecimal(Double) // optional {@link CodeSystem_Property1#valueDecimal() valueDecimal}
   *    .valueCoding(com.fhir.types.fhir.Coding) // optional {@link CodeSystem_Property1#valueCoding() valueCoding}
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
  @Generated(from = "CodeSystem_Property1", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_VALUE_STRING = 0x2L;
    private static final long OPT_BIT_VALUE_CODE = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x10L;
    private static final long OPT_BIT_VALUE_INTEGER = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_CODE = 0x80L;
    private static final long OPT_BIT_VALUE_DATE_TIME = 0x100L;
    private static final long OPT_BIT_VALUE_DECIMAL = 0x200L;
    private static final long OPT_BIT_VALUE_CODING = 0x400L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable String valueString;
    private @Nullable String valueCode;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Boolean valueBoolean;
    private @Nullable Double valueInteger;
    private @Nullable String id;
    private @Nullable Code code;
    private @Nullable String valueDateTime;
    private @Nullable Double valueDecimal;
    private @Nullable Coding valueCoding;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem_Property1#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem_Property1#valueString() valueString} to valueString.
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
     * Initializes the optional value {@link CodeSystem_Property1#valueString() valueString} to valueString.
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
     * Initializes the optional value {@link CodeSystem_Property1#valueCode() valueCode} to valueCode.
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
     * Initializes the optional value {@link CodeSystem_Property1#valueCode() valueCode} to valueCode.
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
     * Initializes the optional value {@link CodeSystem_Property1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem_Property1#modifierExtension() modifierExtension} to modifierExtension.
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
    @JsonProperty("valueBoolean")
    public final Builder valueBoolean(Optional<Boolean> valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean.orElse(null);
      optBits |= OPT_BIT_VALUE_BOOLEAN;
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
    @JsonProperty("valueInteger")
    public final Builder valueInteger(Optional<Double> valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger.orElse(null);
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem_Property1#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem_Property1#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(Code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends Code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#valueDateTime() valueDateTime} to valueDateTime.
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
     * Initializes the optional value {@link CodeSystem_Property1#valueDateTime() valueDateTime} to valueDateTime.
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
    @JsonProperty("valueDecimal")
    public final Builder valueDecimal(Optional<Double> valueDecimal) {
      checkNotIsSet(valueDecimalIsSet(), "valueDecimal");
      this.valueDecimal = valueDecimal.orElse(null);
      optBits |= OPT_BIT_VALUE_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#valueCoding() valueCoding} to valueCoding.
     * @param valueCoding The value for valueCoding
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCoding(Coding valueCoding) {
      checkNotIsSet(valueCodingIsSet(), "valueCoding");
      this.valueCoding = Objects.requireNonNull(valueCoding, "valueCoding");
      optBits |= OPT_BIT_VALUE_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property1#valueCoding() valueCoding} to valueCoding.
     * @param valueCoding The value for valueCoding
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueCoding")
    public final Builder valueCoding(Optional<? extends Coding> valueCoding) {
      checkNotIsSet(valueCodingIsSet(), "valueCoding");
      this.valueCoding = valueCoding.orElse(null);
      optBits |= OPT_BIT_VALUE_CODING;
      return this;
    }

    /**
     * Builds a new {@link CodeSystem_Property1 CodeSystem_Property1}.
     * @return An immutable instance of CodeSystem_Property1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CodeSystem_Property1 build() {
      return new ImmutableCodeSystem_Property1(
          extension,
          valueString,
          valueCode,
          modifierExtension,
          valueBoolean,
          valueInteger,
          id,
          code,
          valueDateTime,
          valueDecimal,
          valueCoding);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean valueCodeIsSet() {
      return (optBits & OPT_BIT_VALUE_CODE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean valueIntegerIsSet() {
      return (optBits & OPT_BIT_VALUE_INTEGER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean valueDateTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE_TIME) != 0;
    }

    private boolean valueDecimalIsSet() {
      return (optBits & OPT_BIT_VALUE_DECIMAL) != 0;
    }

    private boolean valueCodingIsSet() {
      return (optBits & OPT_BIT_VALUE_CODING) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CodeSystem_Property1 is strict, attribute is already set: ".concat(name));
    }
  }
}
