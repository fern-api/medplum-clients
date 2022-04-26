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
 * Immutable implementation of {@link StructureMap_Parameter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureMap_Parameter.builder()}.
 */
@Generated(from = "StructureMap_Parameter", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureMap_Parameter implements StructureMap_Parameter {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable String valueString;
  private final @Nullable Boolean valueBoolean;
  private final @Nullable String valueId;
  private final @Nullable Double valueDecimal;
  private final @Nullable Double valueInteger;

  private ImmutableStructureMap_Parameter(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable String valueString,
      @Nullable Boolean valueBoolean,
      @Nullable String valueId,
      @Nullable Double valueDecimal,
      @Nullable Double valueInteger) {
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.id = id;
    this.valueString = valueString;
    this.valueBoolean = valueBoolean;
    this.valueId = valueId;
    this.valueDecimal = valueDecimal;
    this.valueInteger = valueInteger;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code valueString} attribute
   */
  @JsonProperty("valueString")
  @Override
  public Optional<String> valueString() {
    return Optional.ofNullable(valueString);
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
   * @return The value of the {@code valueId} attribute
   */
  @JsonProperty("valueId")
  @Override
  public Optional<String> valueId() {
    return Optional.ofNullable(valueId);
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
   * @return The value of the {@code valueInteger} attribute
   */
  @JsonProperty("valueInteger")
  @Override
  public Optional<Double> valueInteger() {
    return Optional.ofNullable(valueInteger);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Parameter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Parameter withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureMap_Parameter(
        newValue,
        this.extension,
        this.id,
        this.valueString,
        this.valueBoolean,
        this.valueId,
        this.valueDecimal,
        this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Parameter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Parameter withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureMap_Parameter(
        value,
        this.extension,
        this.id,
        this.valueString,
        this.valueBoolean,
        this.valueId,
        this.valueDecimal,
        this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Parameter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Parameter withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureMap_Parameter(
        this.modifierExtension,
        newValue,
        this.id,
        this.valueString,
        this.valueBoolean,
        this.valueId,
        this.valueDecimal,
        this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Parameter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Parameter withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureMap_Parameter(
        this.modifierExtension,
        value,
        this.id,
        this.valueString,
        this.valueBoolean,
        this.valueId,
        this.valueDecimal,
        this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Parameter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Parameter withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableStructureMap_Parameter(
        this.modifierExtension,
        this.extension,
        newValue,
        this.valueString,
        this.valueBoolean,
        this.valueId,
        this.valueDecimal,
        this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Parameter#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Parameter withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableStructureMap_Parameter(
        this.modifierExtension,
        this.extension,
        value,
        this.valueString,
        this.valueBoolean,
        this.valueId,
        this.valueDecimal,
        this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Parameter#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Parameter withValueString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueString");
    if (Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableStructureMap_Parameter(
        this.modifierExtension,
        this.extension,
        this.id,
        newValue,
        this.valueBoolean,
        this.valueId,
        this.valueDecimal,
        this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Parameter#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Parameter withValueString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueString, value)) return this;
    return new ImmutableStructureMap_Parameter(
        this.modifierExtension,
        this.extension,
        this.id,
        value,
        this.valueBoolean,
        this.valueId,
        this.valueDecimal,
        this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Parameter#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Parameter withValueBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableStructureMap_Parameter(
        this.modifierExtension,
        this.extension,
        this.id,
        this.valueString,
        newValue,
        this.valueId,
        this.valueDecimal,
        this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Parameter#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Parameter withValueBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableStructureMap_Parameter(
        this.modifierExtension,
        this.extension,
        this.id,
        this.valueString,
        value,
        this.valueId,
        this.valueDecimal,
        this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Parameter#valueId() valueId} attribute.
   * @param value The value for valueId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Parameter withValueId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueId");
    if (Objects.equals(this.valueId, newValue)) return this;
    return new ImmutableStructureMap_Parameter(
        this.modifierExtension,
        this.extension,
        this.id,
        this.valueString,
        this.valueBoolean,
        newValue,
        this.valueDecimal,
        this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Parameter#valueId() valueId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Parameter withValueId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueId, value)) return this;
    return new ImmutableStructureMap_Parameter(
        this.modifierExtension,
        this.extension,
        this.id,
        this.valueString,
        this.valueBoolean,
        value,
        this.valueDecimal,
        this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Parameter#valueDecimal() valueDecimal} attribute.
   * @param value The value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Parameter withValueDecimal(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueDecimal, newValue)) return this;
    return new ImmutableStructureMap_Parameter(
        this.modifierExtension,
        this.extension,
        this.id,
        this.valueString,
        this.valueBoolean,
        this.valueId,
        newValue,
        this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Parameter#valueDecimal() valueDecimal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Parameter withValueDecimal(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueDecimal, value)) return this;
    return new ImmutableStructureMap_Parameter(
        this.modifierExtension,
        this.extension,
        this.id,
        this.valueString,
        this.valueBoolean,
        this.valueId,
        value,
        this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Parameter#valueInteger() valueInteger} attribute.
   * @param value The value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Parameter withValueInteger(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueInteger, newValue)) return this;
    return new ImmutableStructureMap_Parameter(
        this.modifierExtension,
        this.extension,
        this.id,
        this.valueString,
        this.valueBoolean,
        this.valueId,
        this.valueDecimal,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Parameter#valueInteger() valueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Parameter withValueInteger(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueInteger, value)) return this;
    return new ImmutableStructureMap_Parameter(
        this.modifierExtension,
        this.extension,
        this.id,
        this.valueString,
        this.valueBoolean,
        this.valueId,
        this.valueDecimal,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureMap_Parameter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureMap_Parameter
        && equalTo((ImmutableStructureMap_Parameter) another);
  }

  private boolean equalTo(ImmutableStructureMap_Parameter another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(valueString, another.valueString)
        && Objects.equals(valueBoolean, another.valueBoolean)
        && Objects.equals(valueId, another.valueId)
        && Objects.equals(valueDecimal, another.valueDecimal)
        && Objects.equals(valueInteger, another.valueInteger);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code extension}, {@code id}, {@code valueString}, {@code valueBoolean}, {@code valueId}, {@code valueDecimal}, {@code valueInteger}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(valueString);
    h += (h << 5) + Objects.hashCode(valueBoolean);
    h += (h << 5) + Objects.hashCode(valueId);
    h += (h << 5) + Objects.hashCode(valueDecimal);
    h += (h << 5) + Objects.hashCode(valueInteger);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureMap_Parameter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("StructureMap_Parameter{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (valueString != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (valueBoolean != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (valueId != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("valueId=").append(valueId);
    }
    if (valueDecimal != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("valueDecimal=").append(valueDecimal);
    }
    if (valueInteger != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("valueInteger=").append(valueInteger);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "StructureMap_Parameter", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements StructureMap_Parameter {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> valueString = Optional.empty();
    boolean valueStringIsSet;
    @Nullable Optional<Boolean> valueBoolean = Optional.empty();
    boolean valueBooleanIsSet;
    @Nullable Optional<String> valueId = Optional.empty();
    boolean valueIdIsSet;
    @Nullable Optional<Double> valueDecimal = Optional.empty();
    boolean valueDecimalIsSet;
    @Nullable Optional<Double> valueInteger = Optional.empty();
    boolean valueIntegerIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("valueString")
    public void setValueString(Optional<String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Optional<Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @JsonProperty("valueId")
    public void setValueId(Optional<String> valueId) {
      this.valueId = valueId;
      this.valueIdIsSet = true;
    }
    @JsonProperty("valueDecimal")
    public void setValueDecimal(Optional<Double> valueDecimal) {
      this.valueDecimal = valueDecimal;
      this.valueDecimalIsSet = true;
    }
    @JsonProperty("valueInteger")
    public void setValueInteger(Optional<Double> valueInteger) {
      this.valueInteger = valueInteger;
      this.valueIntegerIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueDecimal() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueInteger() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableStructureMap_Parameter fromJson(Json json) {
    ImmutableStructureMap_Parameter.Builder builder = ImmutableStructureMap_Parameter.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.valueIdIsSet) {
      builder.valueId(json.valueId);
    }
    if (json.valueDecimalIsSet) {
      builder.valueDecimal(json.valueDecimal);
    }
    if (json.valueIntegerIsSet) {
      builder.valueInteger(json.valueInteger);
    }
    return (ImmutableStructureMap_Parameter) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StructureMap_Parameter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StructureMap_Parameter instance
   */
  public static StructureMap_Parameter copyOf(StructureMap_Parameter instance) {
    if (instance instanceof ImmutableStructureMap_Parameter) {
      return (ImmutableStructureMap_Parameter) instance;
    }
    return ImmutableStructureMap_Parameter.builder()
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .id(instance.id())
        .valueString(instance.valueString())
        .valueBoolean(instance.valueBoolean())
        .valueId(instance.valueId())
        .valueDecimal(instance.valueDecimal())
        .valueInteger(instance.valueInteger())
        .build();
  }

  /**
   * Creates a builder for {@link StructureMap_Parameter StructureMap_Parameter}.
   * <pre>
   * ImmutableStructureMap_Parameter.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link StructureMap_Parameter#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link StructureMap_Parameter#extension() extension}
   *    .id(String) // optional {@link StructureMap_Parameter#id() id}
   *    .valueString(String) // optional {@link StructureMap_Parameter#valueString() valueString}
   *    .valueBoolean(Boolean) // optional {@link StructureMap_Parameter#valueBoolean() valueBoolean}
   *    .valueId(String) // optional {@link StructureMap_Parameter#valueId() valueId}
   *    .valueDecimal(Double) // optional {@link StructureMap_Parameter#valueDecimal() valueDecimal}
   *    .valueInteger(Double) // optional {@link StructureMap_Parameter#valueInteger() valueInteger}
   *    .build();
   * </pre>
   * @return A new StructureMap_Parameter builder
   */
  public static ImmutableStructureMap_Parameter.Builder builder() {
    return new ImmutableStructureMap_Parameter.Builder();
  }

  /**
   * Builds instances of type {@link StructureMap_Parameter StructureMap_Parameter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "StructureMap_Parameter", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_VALUE_STRING = 0x8L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x10L;
    private static final long OPT_BIT_VALUE_ID = 0x20L;
    private static final long OPT_BIT_VALUE_DECIMAL = 0x40L;
    private static final long OPT_BIT_VALUE_INTEGER = 0x80L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable String valueString;
    private @Nullable Boolean valueBoolean;
    private @Nullable String valueId;
    private @Nullable Double valueDecimal;
    private @Nullable Double valueInteger;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureMap_Parameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Parameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Parameter#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Parameter#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Parameter#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Parameter#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Parameter#valueString() valueString} to valueString.
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
     * Initializes the optional value {@link StructureMap_Parameter#valueString() valueString} to valueString.
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
     * Initializes the optional value {@link StructureMap_Parameter#valueBoolean() valueBoolean} to valueBoolean.
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
     * Initializes the optional value {@link StructureMap_Parameter#valueBoolean() valueBoolean} to valueBoolean.
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
     * Initializes the optional value {@link StructureMap_Parameter#valueId() valueId} to valueId.
     * @param valueId The value for valueId
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueId(String valueId) {
      checkNotIsSet(valueIdIsSet(), "valueId");
      this.valueId = Objects.requireNonNull(valueId, "valueId");
      optBits |= OPT_BIT_VALUE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Parameter#valueId() valueId} to valueId.
     * @param valueId The value for valueId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueId")
    public final Builder valueId(Optional<String> valueId) {
      checkNotIsSet(valueIdIsSet(), "valueId");
      this.valueId = valueId.orElse(null);
      optBits |= OPT_BIT_VALUE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Parameter#valueDecimal() valueDecimal} to valueDecimal.
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
     * Initializes the optional value {@link StructureMap_Parameter#valueDecimal() valueDecimal} to valueDecimal.
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
     * Initializes the optional value {@link StructureMap_Parameter#valueInteger() valueInteger} to valueInteger.
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
     * Initializes the optional value {@link StructureMap_Parameter#valueInteger() valueInteger} to valueInteger.
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
     * Builds a new {@link StructureMap_Parameter StructureMap_Parameter}.
     * @return An immutable instance of StructureMap_Parameter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public StructureMap_Parameter build() {
      return new ImmutableStructureMap_Parameter(
          modifierExtension,
          extension,
          id,
          valueString,
          valueBoolean,
          valueId,
          valueDecimal,
          valueInteger);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean valueIdIsSet() {
      return (optBits & OPT_BIT_VALUE_ID) != 0;
    }

    private boolean valueDecimalIsSet() {
      return (optBits & OPT_BIT_VALUE_DECIMAL) != 0;
    }

    private boolean valueIntegerIsSet() {
      return (optBits & OPT_BIT_VALUE_INTEGER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of StructureMap_Parameter is strict, attribute is already set: ".concat(name));
    }
  }
}
