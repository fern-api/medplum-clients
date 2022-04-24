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
 * Immutable implementation of {@link DeviceRequest_Parameter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeviceRequest_Parameter.builder()}.
 */
@Generated(from = "DeviceRequest_Parameter", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDeviceRequest_Parameter implements DeviceRequest_Parameter {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Boolean valueBoolean;
  private final @Nullable CodeableConcept valueCodeableConcept;
  private final @Nullable Range valueRange;
  private final @Nullable String id;
  private final @Nullable Quantity valueQuantity;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept code;

  private ImmutableDeviceRequest_Parameter(
      @Nullable List<Extension> modifierExtension,
      @Nullable Boolean valueBoolean,
      @Nullable CodeableConcept valueCodeableConcept,
      @Nullable Range valueRange,
      @Nullable String id,
      @Nullable Quantity valueQuantity,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept code) {
    this.modifierExtension = modifierExtension;
    this.valueBoolean = valueBoolean;
    this.valueCodeableConcept = valueCodeableConcept;
    this.valueRange = valueRange;
    this.id = id;
    this.valueQuantity = valueQuantity;
    this.extension = extension;
    this.code = code;
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
   * @return The value of the {@code valueCodeableConcept} attribute
   */
  @JsonProperty("valueCodeableConcept")
  @Override
  public Optional<CodeableConcept> valueCodeableConcept() {
    return Optional.ofNullable(valueCodeableConcept);
  }

  /**
   * @return The value of the {@code valueRange} attribute
   */
  @JsonProperty("valueRange")
  @Override
  public Optional<Range> valueRange() {
    return Optional.ofNullable(valueRange);
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
   * @return The value of the {@code valueQuantity} attribute
   */
  @JsonProperty("valueQuantity")
  @Override
  public Optional<Quantity> valueQuantity() {
    return Optional.ofNullable(valueQuantity);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest_Parameter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest_Parameter withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDeviceRequest_Parameter(
        newValue,
        this.valueBoolean,
        this.valueCodeableConcept,
        this.valueRange,
        this.id,
        this.valueQuantity,
        this.extension,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest_Parameter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest_Parameter withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDeviceRequest_Parameter(
        value,
        this.valueBoolean,
        this.valueCodeableConcept,
        this.valueRange,
        this.id,
        this.valueQuantity,
        this.extension,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest_Parameter#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest_Parameter withValueBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableDeviceRequest_Parameter(
        this.modifierExtension,
        newValue,
        this.valueCodeableConcept,
        this.valueRange,
        this.id,
        this.valueQuantity,
        this.extension,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest_Parameter#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest_Parameter withValueBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableDeviceRequest_Parameter(
        this.modifierExtension,
        value,
        this.valueCodeableConcept,
        this.valueRange,
        this.id,
        this.valueQuantity,
        this.extension,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest_Parameter#valueCodeableConcept() valueCodeableConcept} attribute.
   * @param value The value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest_Parameter withValueCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "valueCodeableConcept");
    if (this.valueCodeableConcept == newValue) return this;
    return new ImmutableDeviceRequest_Parameter(
        this.modifierExtension,
        this.valueBoolean,
        newValue,
        this.valueRange,
        this.id,
        this.valueQuantity,
        this.extension,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest_Parameter#valueCodeableConcept() valueCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest_Parameter withValueCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.valueCodeableConcept == value) return this;
    return new ImmutableDeviceRequest_Parameter(
        this.modifierExtension,
        this.valueBoolean,
        value,
        this.valueRange,
        this.id,
        this.valueQuantity,
        this.extension,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest_Parameter#valueRange() valueRange} attribute.
   * @param value The value for valueRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest_Parameter withValueRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "valueRange");
    if (this.valueRange == newValue) return this;
    return new ImmutableDeviceRequest_Parameter(
        this.modifierExtension,
        this.valueBoolean,
        this.valueCodeableConcept,
        newValue,
        this.id,
        this.valueQuantity,
        this.extension,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest_Parameter#valueRange() valueRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest_Parameter withValueRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.valueRange == value) return this;
    return new ImmutableDeviceRequest_Parameter(
        this.modifierExtension,
        this.valueBoolean,
        this.valueCodeableConcept,
        value,
        this.id,
        this.valueQuantity,
        this.extension,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest_Parameter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest_Parameter withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDeviceRequest_Parameter(
        this.modifierExtension,
        this.valueBoolean,
        this.valueCodeableConcept,
        this.valueRange,
        newValue,
        this.valueQuantity,
        this.extension,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest_Parameter#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest_Parameter withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDeviceRequest_Parameter(
        this.modifierExtension,
        this.valueBoolean,
        this.valueCodeableConcept,
        this.valueRange,
        value,
        this.valueQuantity,
        this.extension,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest_Parameter#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest_Parameter withValueQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableDeviceRequest_Parameter(
        this.modifierExtension,
        this.valueBoolean,
        this.valueCodeableConcept,
        this.valueRange,
        this.id,
        newValue,
        this.extension,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest_Parameter#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest_Parameter withValueQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableDeviceRequest_Parameter(
        this.modifierExtension,
        this.valueBoolean,
        this.valueCodeableConcept,
        this.valueRange,
        this.id,
        value,
        this.extension,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest_Parameter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest_Parameter withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDeviceRequest_Parameter(
        this.modifierExtension,
        this.valueBoolean,
        this.valueCodeableConcept,
        this.valueRange,
        this.id,
        this.valueQuantity,
        newValue,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest_Parameter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest_Parameter withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDeviceRequest_Parameter(
        this.modifierExtension,
        this.valueBoolean,
        this.valueCodeableConcept,
        this.valueRange,
        this.id,
        this.valueQuantity,
        value,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest_Parameter#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest_Parameter withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableDeviceRequest_Parameter(
        this.modifierExtension,
        this.valueBoolean,
        this.valueCodeableConcept,
        this.valueRange,
        this.id,
        this.valueQuantity,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest_Parameter#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest_Parameter withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableDeviceRequest_Parameter(
        this.modifierExtension,
        this.valueBoolean,
        this.valueCodeableConcept,
        this.valueRange,
        this.id,
        this.valueQuantity,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeviceRequest_Parameter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeviceRequest_Parameter
        && equalTo((ImmutableDeviceRequest_Parameter) another);
  }

  private boolean equalTo(ImmutableDeviceRequest_Parameter another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(valueBoolean, another.valueBoolean)
        && Objects.equals(valueCodeableConcept, another.valueCodeableConcept)
        && Objects.equals(valueRange, another.valueRange)
        && Objects.equals(id, another.id)
        && Objects.equals(valueQuantity, another.valueQuantity)
        && Objects.equals(extension, another.extension)
        && Objects.equals(code, another.code);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code valueBoolean}, {@code valueCodeableConcept}, {@code valueRange}, {@code id}, {@code valueQuantity}, {@code extension}, {@code code}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(valueBoolean);
    h += (h << 5) + Objects.hashCode(valueCodeableConcept);
    h += (h << 5) + Objects.hashCode(valueRange);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(valueQuantity);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(code);
    return h;
  }

  /**
   * Prints the immutable value {@code DeviceRequest_Parameter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DeviceRequest_Parameter{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (valueBoolean != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (valueCodeableConcept != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("valueCodeableConcept=").append(valueCodeableConcept);
    }
    if (valueRange != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("valueRange=").append(valueRange);
    }
    if (id != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (valueQuantity != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("valueQuantity=").append(valueQuantity);
    }
    if (extension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (code != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("code=").append(code);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DeviceRequest_Parameter", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DeviceRequest_Parameter {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Boolean> valueBoolean = Optional.empty();
    boolean valueBooleanIsSet;
    @Nullable Optional<CodeableConcept> valueCodeableConcept = Optional.empty();
    boolean valueCodeableConceptIsSet;
    @Nullable Optional<Range> valueRange = Optional.empty();
    boolean valueRangeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Quantity> valueQuantity = Optional.empty();
    boolean valueQuantityIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
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
    @JsonProperty("valueCodeableConcept")
    public void setValueCodeableConcept(Optional<CodeableConcept> valueCodeableConcept) {
      this.valueCodeableConcept = valueCodeableConcept;
      this.valueCodeableConceptIsSet = true;
    }
    @JsonProperty("valueRange")
    public void setValueRange(Optional<Range> valueRange) {
      this.valueRange = valueRange;
      this.valueRangeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Optional<Quantity> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> valueCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> valueRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> valueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDeviceRequest_Parameter fromJson(Json json) {
    ImmutableDeviceRequest_Parameter.Builder builder = ImmutableDeviceRequest_Parameter.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.valueCodeableConceptIsSet) {
      builder.valueCodeableConcept(json.valueCodeableConcept);
    }
    if (json.valueRangeIsSet) {
      builder.valueRange(json.valueRange);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    return (ImmutableDeviceRequest_Parameter) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DeviceRequest_Parameter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DeviceRequest_Parameter instance
   */
  public static DeviceRequest_Parameter copyOf(DeviceRequest_Parameter instance) {
    if (instance instanceof ImmutableDeviceRequest_Parameter) {
      return (ImmutableDeviceRequest_Parameter) instance;
    }
    return ImmutableDeviceRequest_Parameter.builder()
        .modifierExtension(instance.modifierExtension())
        .valueBoolean(instance.valueBoolean())
        .valueCodeableConcept(instance.valueCodeableConcept())
        .valueRange(instance.valueRange())
        .id(instance.id())
        .valueQuantity(instance.valueQuantity())
        .extension(instance.extension())
        .code(instance.code())
        .build();
  }

  /**
   * Creates a builder for {@link DeviceRequest_Parameter DeviceRequest_Parameter}.
   * <pre>
   * ImmutableDeviceRequest_Parameter.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DeviceRequest_Parameter#modifierExtension() modifierExtension}
   *    .valueBoolean(Boolean) // optional {@link DeviceRequest_Parameter#valueBoolean() valueBoolean}
   *    .valueCodeableConcept(com.fhir.CodeableConcept) // optional {@link DeviceRequest_Parameter#valueCodeableConcept() valueCodeableConcept}
   *    .valueRange(com.fhir.Range) // optional {@link DeviceRequest_Parameter#valueRange() valueRange}
   *    .id(String) // optional {@link DeviceRequest_Parameter#id() id}
   *    .valueQuantity(com.fhir.Quantity) // optional {@link DeviceRequest_Parameter#valueQuantity() valueQuantity}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DeviceRequest_Parameter#extension() extension}
   *    .code(com.fhir.CodeableConcept) // optional {@link DeviceRequest_Parameter#code() code}
   *    .build();
   * </pre>
   * @return A new DeviceRequest_Parameter builder
   */
  public static ImmutableDeviceRequest_Parameter.Builder builder() {
    return new ImmutableDeviceRequest_Parameter.Builder();
  }

  /**
   * Builds instances of type {@link DeviceRequest_Parameter DeviceRequest_Parameter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DeviceRequest_Parameter", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x2L;
    private static final long OPT_BIT_VALUE_CODEABLE_CONCEPT = 0x4L;
    private static final long OPT_BIT_VALUE_RANGE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_VALUE_QUANTITY = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_CODE = 0x80L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Boolean valueBoolean;
    private @Nullable CodeableConcept valueCodeableConcept;
    private @Nullable Range valueRange;
    private @Nullable String id;
    private @Nullable Quantity valueQuantity;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept code;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DeviceRequest_Parameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceRequest_Parameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceRequest_Parameter#valueBoolean() valueBoolean} to valueBoolean.
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
     * Initializes the optional value {@link DeviceRequest_Parameter#valueBoolean() valueBoolean} to valueBoolean.
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
     * Initializes the optional value {@link DeviceRequest_Parameter#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCodeableConcept(CodeableConcept valueCodeableConcept) {
      checkNotIsSet(valueCodeableConceptIsSet(), "valueCodeableConcept");
      this.valueCodeableConcept = Objects.requireNonNull(valueCodeableConcept, "valueCodeableConcept");
      optBits |= OPT_BIT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest_Parameter#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueCodeableConcept")
    public final Builder valueCodeableConcept(Optional<? extends CodeableConcept> valueCodeableConcept) {
      checkNotIsSet(valueCodeableConceptIsSet(), "valueCodeableConcept");
      this.valueCodeableConcept = valueCodeableConcept.orElse(null);
      optBits |= OPT_BIT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest_Parameter#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueRange(Range valueRange) {
      checkNotIsSet(valueRangeIsSet(), "valueRange");
      this.valueRange = Objects.requireNonNull(valueRange, "valueRange");
      optBits |= OPT_BIT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest_Parameter#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueRange")
    public final Builder valueRange(Optional<? extends Range> valueRange) {
      checkNotIsSet(valueRangeIsSet(), "valueRange");
      this.valueRange = valueRange.orElse(null);
      optBits |= OPT_BIT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest_Parameter#id() id} to id.
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
     * Initializes the optional value {@link DeviceRequest_Parameter#id() id} to id.
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
     * Initializes the optional value {@link DeviceRequest_Parameter#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueQuantity(Quantity valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = Objects.requireNonNull(valueQuantity, "valueQuantity");
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest_Parameter#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueQuantity")
    public final Builder valueQuantity(Optional<? extends Quantity> valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = valueQuantity.orElse(null);
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest_Parameter#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceRequest_Parameter#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceRequest_Parameter#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest_Parameter#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Builds a new {@link DeviceRequest_Parameter DeviceRequest_Parameter}.
     * @return An immutable instance of DeviceRequest_Parameter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DeviceRequest_Parameter build() {
      return new ImmutableDeviceRequest_Parameter(
          modifierExtension,
          valueBoolean,
          valueCodeableConcept,
          valueRange,
          id,
          valueQuantity,
          extension,
          code);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean valueCodeableConceptIsSet() {
      return (optBits & OPT_BIT_VALUE_CODEABLE_CONCEPT) != 0;
    }

    private boolean valueRangeIsSet() {
      return (optBits & OPT_BIT_VALUE_RANGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DeviceRequest_Parameter is strict, attribute is already set: ".concat(name));
    }
  }
}
