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
 * Immutable implementation of {@link SupplyRequest_Parameter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSupplyRequest_Parameter.builder()}.
 */
@Generated(from = "SupplyRequest_Parameter", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSupplyRequest_Parameter implements SupplyRequest_Parameter {
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept code;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Quantity valueQuantity;
  private final @Nullable Range valueRange;
  private final @Nullable Boolean valueBoolean;
  private final @Nullable String id;
  private final @Nullable CodeableConcept valueCodeableConcept;

  private ImmutableSupplyRequest_Parameter(
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept code,
      @Nullable List<Extension> modifierExtension,
      @Nullable Quantity valueQuantity,
      @Nullable Range valueRange,
      @Nullable Boolean valueBoolean,
      @Nullable String id,
      @Nullable CodeableConcept valueCodeableConcept) {
    this.extension = extension;
    this.code = code;
    this.modifierExtension = modifierExtension;
    this.valueQuantity = valueQuantity;
    this.valueRange = valueRange;
    this.valueBoolean = valueBoolean;
    this.id = id;
    this.valueCodeableConcept = valueCodeableConcept;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code valueRange} attribute
   */
  @JsonProperty("valueRange")
  @Override
  public Optional<Range> valueRange() {
    return Optional.ofNullable(valueRange);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest_Parameter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest_Parameter withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSupplyRequest_Parameter(
        newValue,
        this.code,
        this.modifierExtension,
        this.valueQuantity,
        this.valueRange,
        this.valueBoolean,
        this.id,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest_Parameter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest_Parameter withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSupplyRequest_Parameter(
        value,
        this.code,
        this.modifierExtension,
        this.valueQuantity,
        this.valueRange,
        this.valueBoolean,
        this.id,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest_Parameter#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest_Parameter withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableSupplyRequest_Parameter(
        this.extension,
        newValue,
        this.modifierExtension,
        this.valueQuantity,
        this.valueRange,
        this.valueBoolean,
        this.id,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest_Parameter#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest_Parameter withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableSupplyRequest_Parameter(
        this.extension,
        value,
        this.modifierExtension,
        this.valueQuantity,
        this.valueRange,
        this.valueBoolean,
        this.id,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest_Parameter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest_Parameter withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSupplyRequest_Parameter(
        this.extension,
        this.code,
        newValue,
        this.valueQuantity,
        this.valueRange,
        this.valueBoolean,
        this.id,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest_Parameter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest_Parameter withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSupplyRequest_Parameter(
        this.extension,
        this.code,
        value,
        this.valueQuantity,
        this.valueRange,
        this.valueBoolean,
        this.id,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest_Parameter#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest_Parameter withValueQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableSupplyRequest_Parameter(
        this.extension,
        this.code,
        this.modifierExtension,
        newValue,
        this.valueRange,
        this.valueBoolean,
        this.id,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest_Parameter#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest_Parameter withValueQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableSupplyRequest_Parameter(
        this.extension,
        this.code,
        this.modifierExtension,
        value,
        this.valueRange,
        this.valueBoolean,
        this.id,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest_Parameter#valueRange() valueRange} attribute.
   * @param value The value for valueRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest_Parameter withValueRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "valueRange");
    if (this.valueRange == newValue) return this;
    return new ImmutableSupplyRequest_Parameter(
        this.extension,
        this.code,
        this.modifierExtension,
        this.valueQuantity,
        newValue,
        this.valueBoolean,
        this.id,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest_Parameter#valueRange() valueRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest_Parameter withValueRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.valueRange == value) return this;
    return new ImmutableSupplyRequest_Parameter(
        this.extension,
        this.code,
        this.modifierExtension,
        this.valueQuantity,
        value,
        this.valueBoolean,
        this.id,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest_Parameter#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest_Parameter withValueBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableSupplyRequest_Parameter(
        this.extension,
        this.code,
        this.modifierExtension,
        this.valueQuantity,
        this.valueRange,
        newValue,
        this.id,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest_Parameter#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest_Parameter withValueBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableSupplyRequest_Parameter(
        this.extension,
        this.code,
        this.modifierExtension,
        this.valueQuantity,
        this.valueRange,
        value,
        this.id,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest_Parameter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest_Parameter withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSupplyRequest_Parameter(
        this.extension,
        this.code,
        this.modifierExtension,
        this.valueQuantity,
        this.valueRange,
        this.valueBoolean,
        newValue,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest_Parameter#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest_Parameter withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSupplyRequest_Parameter(
        this.extension,
        this.code,
        this.modifierExtension,
        this.valueQuantity,
        this.valueRange,
        this.valueBoolean,
        value,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest_Parameter#valueCodeableConcept() valueCodeableConcept} attribute.
   * @param value The value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest_Parameter withValueCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "valueCodeableConcept");
    if (this.valueCodeableConcept == newValue) return this;
    return new ImmutableSupplyRequest_Parameter(
        this.extension,
        this.code,
        this.modifierExtension,
        this.valueQuantity,
        this.valueRange,
        this.valueBoolean,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest_Parameter#valueCodeableConcept() valueCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest_Parameter withValueCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.valueCodeableConcept == value) return this;
    return new ImmutableSupplyRequest_Parameter(
        this.extension,
        this.code,
        this.modifierExtension,
        this.valueQuantity,
        this.valueRange,
        this.valueBoolean,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSupplyRequest_Parameter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSupplyRequest_Parameter
        && equalTo((ImmutableSupplyRequest_Parameter) another);
  }

  private boolean equalTo(ImmutableSupplyRequest_Parameter another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(code, another.code)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(valueQuantity, another.valueQuantity)
        && Objects.equals(valueRange, another.valueRange)
        && Objects.equals(valueBoolean, another.valueBoolean)
        && Objects.equals(id, another.id)
        && Objects.equals(valueCodeableConcept, another.valueCodeableConcept);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code code}, {@code modifierExtension}, {@code valueQuantity}, {@code valueRange}, {@code valueBoolean}, {@code id}, {@code valueCodeableConcept}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(valueQuantity);
    h += (h << 5) + Objects.hashCode(valueRange);
    h += (h << 5) + Objects.hashCode(valueBoolean);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(valueCodeableConcept);
    return h;
  }

  /**
   * Prints the immutable value {@code SupplyRequest_Parameter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SupplyRequest_Parameter{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (code != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (modifierExtension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (valueQuantity != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("valueQuantity=").append(valueQuantity);
    }
    if (valueRange != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("valueRange=").append(valueRange);
    }
    if (valueBoolean != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (id != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (valueCodeableConcept != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("valueCodeableConcept=").append(valueCodeableConcept);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SupplyRequest_Parameter", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SupplyRequest_Parameter {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Quantity> valueQuantity = Optional.empty();
    boolean valueQuantityIsSet;
    @Nullable Optional<Range> valueRange = Optional.empty();
    boolean valueRangeIsSet;
    @Nullable Optional<Boolean> valueBoolean = Optional.empty();
    boolean valueBooleanIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> valueCodeableConcept = Optional.empty();
    boolean valueCodeableConceptIsSet;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Optional<Quantity> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
    }
    @JsonProperty("valueRange")
    public void setValueRange(Optional<Range> valueRange) {
      this.valueRange = valueRange;
      this.valueRangeIsSet = true;
    }
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Optional<Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("valueCodeableConcept")
    public void setValueCodeableConcept(Optional<CodeableConcept> valueCodeableConcept) {
      this.valueCodeableConcept = valueCodeableConcept;
      this.valueCodeableConceptIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> valueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> valueRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> valueCodeableConcept() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSupplyRequest_Parameter fromJson(Json json) {
    ImmutableSupplyRequest_Parameter.Builder builder = ImmutableSupplyRequest_Parameter.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    if (json.valueRangeIsSet) {
      builder.valueRange(json.valueRange);
    }
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.valueCodeableConceptIsSet) {
      builder.valueCodeableConcept(json.valueCodeableConcept);
    }
    return (ImmutableSupplyRequest_Parameter) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SupplyRequest_Parameter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SupplyRequest_Parameter instance
   */
  public static SupplyRequest_Parameter copyOf(SupplyRequest_Parameter instance) {
    if (instance instanceof ImmutableSupplyRequest_Parameter) {
      return (ImmutableSupplyRequest_Parameter) instance;
    }
    return ImmutableSupplyRequest_Parameter.builder()
        .extension(instance.extension())
        .code(instance.code())
        .modifierExtension(instance.modifierExtension())
        .valueQuantity(instance.valueQuantity())
        .valueRange(instance.valueRange())
        .valueBoolean(instance.valueBoolean())
        .id(instance.id())
        .valueCodeableConcept(instance.valueCodeableConcept())
        .build();
  }

  /**
   * Creates a builder for {@link SupplyRequest_Parameter SupplyRequest_Parameter}.
   * <pre>
   * ImmutableSupplyRequest_Parameter.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SupplyRequest_Parameter#extension() extension}
   *    .code(com.fhir.CodeableConcept) // optional {@link SupplyRequest_Parameter#code() code}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SupplyRequest_Parameter#modifierExtension() modifierExtension}
   *    .valueQuantity(com.fhir.Quantity) // optional {@link SupplyRequest_Parameter#valueQuantity() valueQuantity}
   *    .valueRange(com.fhir.Range) // optional {@link SupplyRequest_Parameter#valueRange() valueRange}
   *    .valueBoolean(Boolean) // optional {@link SupplyRequest_Parameter#valueBoolean() valueBoolean}
   *    .id(String) // optional {@link SupplyRequest_Parameter#id() id}
   *    .valueCodeableConcept(com.fhir.CodeableConcept) // optional {@link SupplyRequest_Parameter#valueCodeableConcept() valueCodeableConcept}
   *    .build();
   * </pre>
   * @return A new SupplyRequest_Parameter builder
   */
  public static ImmutableSupplyRequest_Parameter.Builder builder() {
    return new ImmutableSupplyRequest_Parameter.Builder();
  }

  /**
   * Builds instances of type {@link SupplyRequest_Parameter SupplyRequest_Parameter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SupplyRequest_Parameter", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_CODE = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_VALUE_QUANTITY = 0x8L;
    private static final long OPT_BIT_VALUE_RANGE = 0x10L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_VALUE_CODEABLE_CONCEPT = 0x80L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept code;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Quantity valueQuantity;
    private @Nullable Range valueRange;
    private @Nullable Boolean valueBoolean;
    private @Nullable String id;
    private @Nullable CodeableConcept valueCodeableConcept;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SupplyRequest_Parameter#extension() extension} to extension.
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
     * Initializes the optional value {@link SupplyRequest_Parameter#extension() extension} to extension.
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
     * Initializes the optional value {@link SupplyRequest_Parameter#code() code} to code.
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
     * Initializes the optional value {@link SupplyRequest_Parameter#code() code} to code.
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
     * Initializes the optional value {@link SupplyRequest_Parameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SupplyRequest_Parameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SupplyRequest_Parameter#valueQuantity() valueQuantity} to valueQuantity.
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
     * Initializes the optional value {@link SupplyRequest_Parameter#valueQuantity() valueQuantity} to valueQuantity.
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
     * Initializes the optional value {@link SupplyRequest_Parameter#valueRange() valueRange} to valueRange.
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
     * Initializes the optional value {@link SupplyRequest_Parameter#valueRange() valueRange} to valueRange.
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
     * Initializes the optional value {@link SupplyRequest_Parameter#valueBoolean() valueBoolean} to valueBoolean.
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
     * Initializes the optional value {@link SupplyRequest_Parameter#valueBoolean() valueBoolean} to valueBoolean.
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
     * Initializes the optional value {@link SupplyRequest_Parameter#id() id} to id.
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
     * Initializes the optional value {@link SupplyRequest_Parameter#id() id} to id.
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
     * Initializes the optional value {@link SupplyRequest_Parameter#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
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
     * Initializes the optional value {@link SupplyRequest_Parameter#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
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
     * Builds a new {@link SupplyRequest_Parameter SupplyRequest_Parameter}.
     * @return An immutable instance of SupplyRequest_Parameter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SupplyRequest_Parameter build() {
      return new ImmutableSupplyRequest_Parameter(
          extension,
          code,
          modifierExtension,
          valueQuantity,
          valueRange,
          valueBoolean,
          id,
          valueCodeableConcept);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean valueRangeIsSet() {
      return (optBits & OPT_BIT_VALUE_RANGE) != 0;
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueCodeableConceptIsSet() {
      return (optBits & OPT_BIT_VALUE_CODEABLE_CONCEPT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SupplyRequest_Parameter is strict, attribute is already set: ".concat(name));
    }
  }
}
