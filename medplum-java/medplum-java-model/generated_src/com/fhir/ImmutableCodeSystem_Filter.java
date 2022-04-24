//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CodeSystem_Filter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCodeSystem_Filter.builder()}.
 */
@org.immutables.value.Generated(from = "CodeSystem_Filter", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCodeSystem_Filter implements com.fhir.CodeSystem_Filter {
  private final @javax.annotation.Nullable java.lang.String value;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.code> operator;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code code;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String description;

  private ImmutableCodeSystem_Filter(
      @javax.annotation.Nullable java.lang.String value,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.code> operator,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code code,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String description) {
    this.value = value;
    this.modifierExtension = modifierExtension;
    this.operator = operator;
    this.extension = extension;
    this.code = code;
    this.id = id;
    this.description = description;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code operator} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("operator")
  @Override
  public java.util.Optional<java.util.List<com.fhir.code>> operator() {
    return java.util.Optional.ofNullable(operator);
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.code> code() {
    return java.util.Optional.ofNullable(code);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Filter#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Filter withValue(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "value");
    if (java.util.Objects.equals(this.value, newValue)) return this;
    return new ImmutableCodeSystem_Filter(
        newValue,
        this.modifierExtension,
        this.operator,
        this.extension,
        this.code,
        this.id,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Filter#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Filter withValue(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.value, value)) return this;
    return new ImmutableCodeSystem_Filter(
        value,
        this.modifierExtension,
        this.operator,
        this.extension,
        this.code,
        this.id,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Filter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Filter withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCodeSystem_Filter(this.value, newValue, this.operator, this.extension, this.code, this.id, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Filter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Filter withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCodeSystem_Filter(this.value, value, this.operator, this.extension, this.code, this.id, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Filter#operator() operator} attribute.
   * @param value The value for operator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Filter withOperator(java.util.List<com.fhir.code> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> newValue = java.util.Objects.requireNonNull(value, "operator");
    if (this.operator == newValue) return this;
    return new ImmutableCodeSystem_Filter(
        this.value,
        this.modifierExtension,
        newValue,
        this.extension,
        this.code,
        this.id,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Filter#operator() operator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Filter withOperator(java.util.Optional<? extends java.util.List<com.fhir.code>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> value = optional.orElse(null);
    if (this.operator == value) return this;
    return new ImmutableCodeSystem_Filter(this.value, this.modifierExtension, value, this.extension, this.code, this.id, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Filter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Filter withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCodeSystem_Filter(
        this.value,
        this.modifierExtension,
        this.operator,
        newValue,
        this.code,
        this.id,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Filter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Filter withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCodeSystem_Filter(this.value, this.modifierExtension, this.operator, value, this.code, this.id, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Filter#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Filter withCode(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableCodeSystem_Filter(
        this.value,
        this.modifierExtension,
        this.operator,
        this.extension,
        newValue,
        this.id,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Filter#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Filter withCode(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableCodeSystem_Filter(
        this.value,
        this.modifierExtension,
        this.operator,
        this.extension,
        value,
        this.id,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Filter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Filter withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableCodeSystem_Filter(
        this.value,
        this.modifierExtension,
        this.operator,
        this.extension,
        this.code,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Filter#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Filter withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableCodeSystem_Filter(
        this.value,
        this.modifierExtension,
        this.operator,
        this.extension,
        this.code,
        value,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Filter#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Filter withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableCodeSystem_Filter(this.value, this.modifierExtension, this.operator, this.extension, this.code, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Filter#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Filter withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableCodeSystem_Filter(this.value, this.modifierExtension, this.operator, this.extension, this.code, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCodeSystem_Filter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCodeSystem_Filter
        && equalTo((ImmutableCodeSystem_Filter) another);
  }

  private boolean equalTo(ImmutableCodeSystem_Filter another) {
    return java.util.Objects.equals(value, another.value)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(operator, another.operator)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code value}, {@code modifierExtension}, {@code operator}, {@code extension}, {@code code}, {@code id}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(value);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(operator);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code CodeSystem_Filter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CodeSystem_Filter{");
    if (value != null) {
      builder.append("value=").append(value);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (operator != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("operator=").append(operator);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (code != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (description != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("description=").append(description);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CodeSystem_Filter", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CodeSystem_Filter {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> value = java.util.Optional.empty();
    boolean valueIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.code>> operator = java.util.Optional.empty();
    boolean operatorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public void setValue(java.util.Optional<java.lang.String> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    public void setOperator(java.util.Optional<java.util.List<com.fhir.code>> operator) {
      this.operator = operator;
      this.operatorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> value() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.code>> operator() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCodeSystem_Filter fromJson(Json json) {
    ImmutableCodeSystem_Filter.Builder builder = ImmutableCodeSystem_Filter.builder();
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.operatorIsSet) {
      builder.operator(json.operator);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    return (ImmutableCodeSystem_Filter) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CodeSystem_Filter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CodeSystem_Filter instance
   */
  public static CodeSystem_Filter copyOf(CodeSystem_Filter instance) {
    if (instance instanceof ImmutableCodeSystem_Filter) {
      return (ImmutableCodeSystem_Filter) instance;
    }
    return ImmutableCodeSystem_Filter.builder()
        .value(instance.value())
        .modifierExtension(instance.modifierExtension())
        .operator(instance.operator())
        .extension(instance.extension())
        .code(instance.code())
        .id(instance.id())
        .description(instance.description())
        .build();
  }

  /**
   * Creates a builder for {@link CodeSystem_Filter CodeSystem_Filter}.
   * <pre>
   * ImmutableCodeSystem_Filter.builder()
   *    .value(String) // optional {@link CodeSystem_Filter#value() value}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CodeSystem_Filter#modifierExtension() modifierExtension}
   *    .operator(List&amp;lt;com.fhir.code&amp;gt;) // optional {@link CodeSystem_Filter#operator() operator}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CodeSystem_Filter#extension() extension}
   *    .code(com.fhir.code) // optional {@link CodeSystem_Filter#code() code}
   *    .id(String) // optional {@link CodeSystem_Filter#id() id}
   *    .description(String) // optional {@link CodeSystem_Filter#description() description}
   *    .build();
   * </pre>
   * @return A new CodeSystem_Filter builder
   */
  public static ImmutableCodeSystem_Filter.Builder builder() {
    return new ImmutableCodeSystem_Filter.Builder();
  }

  /**
   * Builds instances of type {@link CodeSystem_Filter CodeSystem_Filter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CodeSystem_Filter", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_VALUE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_OPERATOR = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_CODE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_DESCRIPTION = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String value;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.code> operator;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code code;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String description;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CodeSystem_Filter#value() value} to value.
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
     * Initializes the optional value {@link CodeSystem_Filter#value() value} to value.
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
     * Initializes the optional value {@link CodeSystem_Filter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem_Filter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem_Filter#operator() operator} to operator.
     * @param operator The value for operator
     * @return {@code this} builder for chained invocation
     */
    public final Builder operator(java.util.List<com.fhir.code> operator) {
      checkNotIsSet(operatorIsSet(), "operator");
      this.operator = java.util.Objects.requireNonNull(operator, "operator");
      optBits |= OPT_BIT_OPERATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Filter#operator() operator} to operator.
     * @param operator The value for operator
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    public final Builder operator(java.util.Optional<? extends java.util.List<com.fhir.code>> operator) {
      checkNotIsSet(operatorIsSet(), "operator");
      this.operator = operator.orElse(null);
      optBits |= OPT_BIT_OPERATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Filter#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem_Filter#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem_Filter#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Filter#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Filter#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem_Filter#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem_Filter#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Filter#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Builds a new {@link CodeSystem_Filter CodeSystem_Filter}.
     * @return An immutable instance of CodeSystem_Filter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CodeSystem_Filter build() {
      return new ImmutableCodeSystem_Filter(value, modifierExtension, operator, extension, code, id, description);
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean operatorIsSet() {
      return (optBits & OPT_BIT_OPERATOR) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CodeSystem_Filter is strict, attribute is already set: ".concat(name));
    }
  }
}