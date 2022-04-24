//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CompartmentDefinition_Resource}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCompartmentDefinition_Resource.builder()}.
 */
@org.immutables.value.Generated(from = "CompartmentDefinition_Resource", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCompartmentDefinition_Resource implements com.fhir.CompartmentDefinition_Resource {
  private final @javax.annotation.Nullable java.util.List<java.lang.String> param;
  private final @javax.annotation.Nullable com.fhir.code code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String documentation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String id;

  private ImmutableCompartmentDefinition_Resource(
      @javax.annotation.Nullable java.util.List<java.lang.String> param,
      @javax.annotation.Nullable com.fhir.code code,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String documentation,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String id) {
    this.param = param;
    this.code = code;
    this.modifierExtension = modifierExtension;
    this.documentation = documentation;
    this.extension = extension;
    this.id = id;
  }

  /**
   * @return The value of the {@code param} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("param")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> param() {
    return java.util.Optional.ofNullable(param);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code documentation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("documentation")
  @Override
  public java.util.Optional<java.lang.String> documentation() {
    return java.util.Optional.ofNullable(documentation);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition_Resource#param() param} attribute.
   * @param value The value for param
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition_Resource withParam(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "param");
    if (this.param == newValue) return this;
    return new ImmutableCompartmentDefinition_Resource(newValue, this.code, this.modifierExtension, this.documentation, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition_Resource#param() param} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for param
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition_Resource withParam(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.param == value) return this;
    return new ImmutableCompartmentDefinition_Resource(value, this.code, this.modifierExtension, this.documentation, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition_Resource#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition_Resource withCode(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableCompartmentDefinition_Resource(this.param, newValue, this.modifierExtension, this.documentation, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition_Resource#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition_Resource withCode(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableCompartmentDefinition_Resource(this.param, value, this.modifierExtension, this.documentation, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition_Resource#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition_Resource withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCompartmentDefinition_Resource(this.param, this.code, newValue, this.documentation, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition_Resource#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition_Resource withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCompartmentDefinition_Resource(this.param, this.code, value, this.documentation, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition_Resource#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition_Resource withDocumentation(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "documentation");
    if (java.util.Objects.equals(this.documentation, newValue)) return this;
    return new ImmutableCompartmentDefinition_Resource(this.param, this.code, this.modifierExtension, newValue, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition_Resource#documentation() documentation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition_Resource withDocumentation(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.documentation, value)) return this;
    return new ImmutableCompartmentDefinition_Resource(this.param, this.code, this.modifierExtension, value, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition_Resource#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition_Resource withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCompartmentDefinition_Resource(this.param, this.code, this.modifierExtension, this.documentation, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition_Resource#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition_Resource withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCompartmentDefinition_Resource(this.param, this.code, this.modifierExtension, this.documentation, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition_Resource#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition_Resource withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableCompartmentDefinition_Resource(this.param, this.code, this.modifierExtension, this.documentation, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition_Resource#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition_Resource withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableCompartmentDefinition_Resource(this.param, this.code, this.modifierExtension, this.documentation, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCompartmentDefinition_Resource} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCompartmentDefinition_Resource
        && equalTo((ImmutableCompartmentDefinition_Resource) another);
  }

  private boolean equalTo(ImmutableCompartmentDefinition_Resource another) {
    return java.util.Objects.equals(param, another.param)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(documentation, another.documentation)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code param}, {@code code}, {@code modifierExtension}, {@code documentation}, {@code extension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(param);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(documentation);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code CompartmentDefinition_Resource} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CompartmentDefinition_Resource{");
    if (param != null) {
      builder.append("param=").append(param);
    }
    if (code != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (documentation != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (extension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CompartmentDefinition_Resource", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CompartmentDefinition_Resource {
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> param = java.util.Optional.empty();
    boolean paramIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> documentation = java.util.Optional.empty();
    boolean documentationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("param")
    public void setParam(java.util.Optional<java.util.List<java.lang.String>> param) {
      this.param = param;
      this.paramIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public void setDocumentation(java.util.Optional<java.lang.String> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> param() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCompartmentDefinition_Resource fromJson(Json json) {
    ImmutableCompartmentDefinition_Resource.Builder builder = ImmutableCompartmentDefinition_Resource.builder();
    if (json.paramIsSet) {
      builder.param(json.param);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableCompartmentDefinition_Resource) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CompartmentDefinition_Resource} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CompartmentDefinition_Resource instance
   */
  public static CompartmentDefinition_Resource copyOf(CompartmentDefinition_Resource instance) {
    if (instance instanceof ImmutableCompartmentDefinition_Resource) {
      return (ImmutableCompartmentDefinition_Resource) instance;
    }
    return ImmutableCompartmentDefinition_Resource.builder()
        .param(instance.param())
        .code(instance.code())
        .modifierExtension(instance.modifierExtension())
        .documentation(instance.documentation())
        .extension(instance.extension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link CompartmentDefinition_Resource CompartmentDefinition_Resource}.
   * <pre>
   * ImmutableCompartmentDefinition_Resource.builder()
   *    .param(List&amp;lt;String&amp;gt;) // optional {@link CompartmentDefinition_Resource#param() param}
   *    .code(com.fhir.code) // optional {@link CompartmentDefinition_Resource#code() code}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CompartmentDefinition_Resource#modifierExtension() modifierExtension}
   *    .documentation(String) // optional {@link CompartmentDefinition_Resource#documentation() documentation}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CompartmentDefinition_Resource#extension() extension}
   *    .id(String) // optional {@link CompartmentDefinition_Resource#id() id}
   *    .build();
   * </pre>
   * @return A new CompartmentDefinition_Resource builder
   */
  public static ImmutableCompartmentDefinition_Resource.Builder builder() {
    return new ImmutableCompartmentDefinition_Resource.Builder();
  }

  /**
   * Builds instances of type {@link CompartmentDefinition_Resource CompartmentDefinition_Resource}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CompartmentDefinition_Resource", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_PARAM = 0x1L;
    private static final long OPT_BIT_CODE = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_DOCUMENTATION = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<java.lang.String> param;
    private @javax.annotation.Nullable com.fhir.code code;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String documentation;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition_Resource#param() param} to param.
     * @param param The value for param
     * @return {@code this} builder for chained invocation
     */
    public final Builder param(java.util.List<java.lang.String> param) {
      checkNotIsSet(paramIsSet(), "param");
      this.param = java.util.Objects.requireNonNull(param, "param");
      optBits |= OPT_BIT_PARAM;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition_Resource#param() param} to param.
     * @param param The value for param
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("param")
    public final Builder param(java.util.Optional<? extends java.util.List<java.lang.String>> param) {
      checkNotIsSet(paramIsSet(), "param");
      this.param = param.orElse(null);
      optBits |= OPT_BIT_PARAM;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition_Resource#code() code} to code.
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
     * Initializes the optional value {@link CompartmentDefinition_Resource#code() code} to code.
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
     * Initializes the optional value {@link CompartmentDefinition_Resource#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CompartmentDefinition_Resource#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CompartmentDefinition_Resource#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentation(java.lang.String documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = java.util.Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition_Resource#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public final Builder documentation(java.util.Optional<java.lang.String> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = documentation.orElse(null);
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition_Resource#extension() extension} to extension.
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
     * Initializes the optional value {@link CompartmentDefinition_Resource#extension() extension} to extension.
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
     * Initializes the optional value {@link CompartmentDefinition_Resource#id() id} to id.
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
     * Initializes the optional value {@link CompartmentDefinition_Resource#id() id} to id.
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
     * Builds a new {@link CompartmentDefinition_Resource CompartmentDefinition_Resource}.
     * @return An immutable instance of CompartmentDefinition_Resource
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CompartmentDefinition_Resource build() {
      return new ImmutableCompartmentDefinition_Resource(param, code, modifierExtension, documentation, extension, id);
    }

    private boolean paramIsSet() {
      return (optBits & OPT_BIT_PARAM) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CompartmentDefinition_Resource is strict, attribute is already set: ".concat(name));
    }
  }
}
