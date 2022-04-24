//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ValueSet_Filter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableValueSet_Filter.builder()}.
 */
@org.immutables.value.Generated(from = "ValueSet_Filter", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableValueSet_Filter implements com.fhir.ValueSet_Filter {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String value;
  private final @javax.annotation.Nullable com.fhir.Valueset_filterOp op;
  private final @javax.annotation.Nullable com.fhir.code property;

  private ImmutableValueSet_Filter(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String value,
      @javax.annotation.Nullable com.fhir.Valueset_filterOp op,
      @javax.annotation.Nullable com.fhir.code property) {
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.value = value;
    this.op = op;
    this.property = property;
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code value} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("value")
  @Override
  public java.util.Optional<java.lang.String> value() {
    return java.util.Optional.ofNullable(value);
  }

  /**
   * @return The value of the {@code op} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("op")
  @Override
  public java.util.Optional<com.fhir.Valueset_filterOp> op() {
    return java.util.Optional.ofNullable(op);
  }

  /**
   * @return The value of the {@code property} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("property")
  @Override
  public java.util.Optional<com.fhir.code> property() {
    return java.util.Optional.ofNullable(property);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Filter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Filter withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableValueSet_Filter(newValue, this.extension, this.modifierExtension, this.value, this.op, this.property);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Filter#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Filter withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableValueSet_Filter(value, this.extension, this.modifierExtension, this.value, this.op, this.property);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Filter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Filter withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableValueSet_Filter(this.id, newValue, this.modifierExtension, this.value, this.op, this.property);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Filter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Filter withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableValueSet_Filter(this.id, value, this.modifierExtension, this.value, this.op, this.property);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Filter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Filter withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableValueSet_Filter(this.id, this.extension, newValue, this.value, this.op, this.property);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Filter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Filter withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableValueSet_Filter(this.id, this.extension, value, this.value, this.op, this.property);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Filter#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Filter withValue(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "value");
    if (java.util.Objects.equals(this.value, newValue)) return this;
    return new ImmutableValueSet_Filter(this.id, this.extension, this.modifierExtension, newValue, this.op, this.property);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Filter#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Filter withValue(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.value, value)) return this;
    return new ImmutableValueSet_Filter(this.id, this.extension, this.modifierExtension, value, this.op, this.property);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Filter#op() op} attribute.
   * @param value The value for op
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Filter withOp(com.fhir.Valueset_filterOp value) {
    @javax.annotation.Nullable com.fhir.Valueset_filterOp newValue = java.util.Objects.requireNonNull(value, "op");
    if (this.op == newValue) return this;
    return new ImmutableValueSet_Filter(this.id, this.extension, this.modifierExtension, this.value, newValue, this.property);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Filter#op() op} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for op
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Filter withOp(java.util.Optional<? extends com.fhir.Valueset_filterOp> optional) {
    @javax.annotation.Nullable com.fhir.Valueset_filterOp value = optional.orElse(null);
    if (this.op == value) return this;
    return new ImmutableValueSet_Filter(this.id, this.extension, this.modifierExtension, this.value, value, this.property);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Filter#property() property} attribute.
   * @param value The value for property
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Filter withProperty(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "property");
    if (this.property == newValue) return this;
    return new ImmutableValueSet_Filter(this.id, this.extension, this.modifierExtension, this.value, this.op, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Filter#property() property} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for property
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Filter withProperty(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.property == value) return this;
    return new ImmutableValueSet_Filter(this.id, this.extension, this.modifierExtension, this.value, this.op, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableValueSet_Filter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableValueSet_Filter
        && equalTo((ImmutableValueSet_Filter) another);
  }

  private boolean equalTo(ImmutableValueSet_Filter another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(value, another.value)
        && java.util.Objects.equals(op, another.op)
        && java.util.Objects.equals(property, another.property);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code modifierExtension}, {@code value}, {@code op}, {@code property}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(value);
    h += (h << 5) + java.util.Objects.hashCode(op);
    h += (h << 5) + java.util.Objects.hashCode(property);
    return h;
  }

  /**
   * Prints the immutable value {@code ValueSet_Filter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ValueSet_Filter{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (value != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (op != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("op=").append(op);
    }
    if (property != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("property=").append(property);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ValueSet_Filter", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ValueSet_Filter {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> value = java.util.Optional.empty();
    boolean valueIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Valueset_filterOp> op = java.util.Optional.empty();
    boolean opIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> property = java.util.Optional.empty();
    boolean propertyIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public void setValue(java.util.Optional<java.lang.String> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("op")
    public void setOp(java.util.Optional<com.fhir.Valueset_filterOp> op) {
      this.op = op;
      this.opIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("property")
    public void setProperty(java.util.Optional<com.fhir.code> property) {
      this.property = property;
      this.propertyIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> value() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Valueset_filterOp> op() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> property() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableValueSet_Filter fromJson(Json json) {
    ImmutableValueSet_Filter.Builder builder = ImmutableValueSet_Filter.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.opIsSet) {
      builder.op(json.op);
    }
    if (json.propertyIsSet) {
      builder.property(json.property);
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
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .value(instance.value())
        .op(instance.op())
        .property(instance.property())
        .build();
  }

  /**
   * Creates a builder for {@link ValueSet_Filter ValueSet_Filter}.
   * <pre>
   * ImmutableValueSet_Filter.builder()
   *    .id(String) // optional {@link ValueSet_Filter#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ValueSet_Filter#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ValueSet_Filter#modifierExtension() modifierExtension}
   *    .value(String) // optional {@link ValueSet_Filter#value() value}
   *    .op(com.fhir.Valueset_filterOp) // optional {@link ValueSet_Filter#op() op}
   *    .property(com.fhir.code) // optional {@link ValueSet_Filter#property() property}
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
  @org.immutables.value.Generated(from = "ValueSet_Filter", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_VALUE = 0x8L;
    private static final long OPT_BIT_OP = 0x10L;
    private static final long OPT_BIT_PROPERTY = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String value;
    private @javax.annotation.Nullable com.fhir.Valueset_filterOp op;
    private @javax.annotation.Nullable com.fhir.code property;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ValueSet_Filter#id() id} to id.
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
     * Initializes the optional value {@link ValueSet_Filter#id() id} to id.
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
     * Initializes the optional value {@link ValueSet_Filter#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Filter#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Filter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ValueSet_Filter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ValueSet_Filter#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(java.lang.String value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = java.util.Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Filter#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public final Builder value(java.util.Optional<java.lang.String> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Filter#op() op} to op.
     * @param op The value for op
     * @return {@code this} builder for chained invocation
     */
    public final Builder op(com.fhir.Valueset_filterOp op) {
      checkNotIsSet(opIsSet(), "op");
      this.op = java.util.Objects.requireNonNull(op, "op");
      optBits |= OPT_BIT_OP;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Filter#op() op} to op.
     * @param op The value for op
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("op")
    public final Builder op(java.util.Optional<? extends com.fhir.Valueset_filterOp> op) {
      checkNotIsSet(opIsSet(), "op");
      this.op = op.orElse(null);
      optBits |= OPT_BIT_OP;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Filter#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    public final Builder property(com.fhir.code property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = java.util.Objects.requireNonNull(property, "property");
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Filter#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("property")
    public final Builder property(java.util.Optional<? extends com.fhir.code> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = property.orElse(null);
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Builds a new {@link ValueSet_Filter ValueSet_Filter}.
     * @return An immutable instance of ValueSet_Filter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ValueSet_Filter build() {
      return new ImmutableValueSet_Filter(id, extension, modifierExtension, value, op, property);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean opIsSet() {
      return (optBits & OPT_BIT_OP) != 0;
    }

    private boolean propertyIsSet() {
      return (optBits & OPT_BIT_PROPERTY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ValueSet_Filter is strict, attribute is already set: ".concat(name));
    }
  }
}
