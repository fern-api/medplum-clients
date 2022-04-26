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
 * Immutable implementation of {@link ValueSet_Filter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableValueSet_Filter.builder()}.
 */
@Generated(from = "ValueSet_Filter", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableValueSet_Filter implements ValueSet_Filter {
  private final @Nullable List<Extension> extension;
  private final @Nullable String value;
  private final @Nullable String id;
  private final @Nullable Code property;
  private final @Nullable Valueset_filterOp op;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableValueSet_Filter(
      @Nullable List<Extension> extension,
      @Nullable String value,
      @Nullable String id,
      @Nullable Code property,
      @Nullable Valueset_filterOp op,
      @Nullable List<Extension> modifierExtension) {
    this.extension = extension;
    this.value = value;
    this.id = id;
    this.property = property;
    this.op = op;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<String> value() {
    return Optional.ofNullable(value);
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
   * @return The value of the {@code property} attribute
   */
  @JsonProperty("property")
  @Override
  public Optional<Code> property() {
    return Optional.ofNullable(property);
  }

  /**
   * @return The value of the {@code op} attribute
   */
  @JsonProperty("op")
  @Override
  public Optional<Valueset_filterOp> op() {
    return Optional.ofNullable(op);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Filter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Filter withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableValueSet_Filter(newValue, this.value, this.id, this.property, this.op, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Filter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Filter withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableValueSet_Filter(value, this.value, this.id, this.property, this.op, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Filter#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Filter withValue(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "value");
    if (Objects.equals(this.value, newValue)) return this;
    return new ImmutableValueSet_Filter(this.extension, newValue, this.id, this.property, this.op, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Filter#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Filter withValue(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.value, value)) return this;
    return new ImmutableValueSet_Filter(this.extension, value, this.id, this.property, this.op, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Filter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Filter withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableValueSet_Filter(this.extension, this.value, newValue, this.property, this.op, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Filter#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Filter withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableValueSet_Filter(this.extension, this.value, value, this.property, this.op, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Filter#property() property} attribute.
   * @param value The value for property
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Filter withProperty(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "property");
    if (this.property == newValue) return this;
    return new ImmutableValueSet_Filter(this.extension, this.value, this.id, newValue, this.op, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Filter#property() property} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for property
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Filter withProperty(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.property == value) return this;
    return new ImmutableValueSet_Filter(this.extension, this.value, this.id, value, this.op, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Filter#op() op} attribute.
   * @param value The value for op
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Filter withOp(Valueset_filterOp value) {
    @Nullable Valueset_filterOp newValue = Objects.requireNonNull(value, "op");
    if (this.op == newValue) return this;
    return new ImmutableValueSet_Filter(this.extension, this.value, this.id, this.property, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Filter#op() op} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for op
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Filter withOp(Optional<? extends Valueset_filterOp> optional) {
    @Nullable Valueset_filterOp value = optional.orElse(null);
    if (this.op == value) return this;
    return new ImmutableValueSet_Filter(this.extension, this.value, this.id, this.property, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Filter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Filter withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableValueSet_Filter(this.extension, this.value, this.id, this.property, this.op, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Filter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Filter withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableValueSet_Filter(this.extension, this.value, this.id, this.property, this.op, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableValueSet_Filter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableValueSet_Filter
        && equalTo((ImmutableValueSet_Filter) another);
  }

  private boolean equalTo(ImmutableValueSet_Filter another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(value, another.value)
        && Objects.equals(id, another.id)
        && Objects.equals(property, another.property)
        && Objects.equals(op, another.op)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code value}, {@code id}, {@code property}, {@code op}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(property);
    h += (h << 5) + Objects.hashCode(op);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ValueSet_Filter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ValueSet_Filter{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (value != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (property != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("property=").append(property);
    }
    if (op != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("op=").append(op);
    }
    if (modifierExtension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ValueSet_Filter", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ValueSet_Filter {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> property = Optional.empty();
    boolean propertyIsSet;
    @Nullable Optional<Valueset_filterOp> op = Optional.empty();
    boolean opIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<String> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("property")
    public void setProperty(Optional<Code> property) {
      this.property = property;
      this.propertyIsSet = true;
    }
    @JsonProperty("op")
    public void setOp(Optional<Valueset_filterOp> op) {
      this.op = op;
      this.opIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> property() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Valueset_filterOp> op() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableValueSet_Filter fromJson(Json json) {
    ImmutableValueSet_Filter.Builder builder = ImmutableValueSet_Filter.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.propertyIsSet) {
      builder.property(json.property);
    }
    if (json.opIsSet) {
      builder.op(json.op);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableValueSet_Filter) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ValueSet_Filter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ValueSet_Filter instance
   */
  public static ValueSet_Filter copyOf(ValueSet_Filter instance) {
    if (instance instanceof ImmutableValueSet_Filter) {
      return (ImmutableValueSet_Filter) instance;
    }
    return ImmutableValueSet_Filter.builder()
        .extension(instance.extension())
        .value(instance.value())
        .id(instance.id())
        .property(instance.property())
        .op(instance.op())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ValueSet_Filter ValueSet_Filter}.
   * <pre>
   * ImmutableValueSet_Filter.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ValueSet_Filter#extension() extension}
   *    .value(String) // optional {@link ValueSet_Filter#value() value}
   *    .id(String) // optional {@link ValueSet_Filter#id() id}
   *    .property(com.medplum.types.fhir.Code) // optional {@link ValueSet_Filter#property() property}
   *    .op(com.medplum.types.fhir.Valueset_filterOp) // optional {@link ValueSet_Filter#op() op}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ValueSet_Filter#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ValueSet_Filter builder
   */
  public static ImmutableValueSet_Filter.Builder builder() {
    return new ImmutableValueSet_Filter.Builder();
  }

  /**
   * Builds instances of type {@link ValueSet_Filter ValueSet_Filter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ValueSet_Filter", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_VALUE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_PROPERTY = 0x8L;
    private static final long OPT_BIT_OP = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable String value;
    private @Nullable String id;
    private @Nullable Code property;
    private @Nullable Valueset_filterOp op;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ValueSet_Filter#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Filter#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Filter#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(String value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Filter#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<String> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Filter#id() id} to id.
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
     * Initializes the optional value {@link ValueSet_Filter#id() id} to id.
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
     * Initializes the optional value {@link ValueSet_Filter#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    public final Builder property(Code property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = Objects.requireNonNull(property, "property");
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Filter#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("property")
    public final Builder property(Optional<? extends Code> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = property.orElse(null);
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Filter#op() op} to op.
     * @param op The value for op
     * @return {@code this} builder for chained invocation
     */
    public final Builder op(Valueset_filterOp op) {
      checkNotIsSet(opIsSet(), "op");
      this.op = Objects.requireNonNull(op, "op");
      optBits |= OPT_BIT_OP;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Filter#op() op} to op.
     * @param op The value for op
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("op")
    public final Builder op(Optional<? extends Valueset_filterOp> op) {
      checkNotIsSet(opIsSet(), "op");
      this.op = op.orElse(null);
      optBits |= OPT_BIT_OP;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Filter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ValueSet_Filter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ValueSet_Filter ValueSet_Filter}.
     * @return An immutable instance of ValueSet_Filter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ValueSet_Filter build() {
      return new ImmutableValueSet_Filter(extension, value, id, property, op, modifierExtension);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean propertyIsSet() {
      return (optBits & OPT_BIT_PROPERTY) != 0;
    }

    private boolean opIsSet() {
      return (optBits & OPT_BIT_OP) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ValueSet_Filter is strict, attribute is already set: ".concat(name));
    }
  }
}
