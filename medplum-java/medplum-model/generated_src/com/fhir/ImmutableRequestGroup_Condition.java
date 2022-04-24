//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link RequestGroup_Condition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRequestGroup_Condition.builder()}.
 */
@org.immutables.value.Generated(from = "RequestGroup_Condition", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRequestGroup_Condition implements com.fhir.RequestGroup_Condition {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.code kind;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Expression expression;

  private ImmutableRequestGroup_Condition(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.code kind,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Expression expression) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.kind = kind;
    this.extension = extension;
    this.expression = expression;
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("kind")
  @Override
  public java.util.Optional<com.fhir.code> kind() {
    return java.util.Optional.ofNullable(kind);
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
   * @return The value of the {@code expression} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("expression")
  @Override
  public java.util.Optional<com.fhir.Expression> expression() {
    return java.util.Optional.ofNullable(expression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Condition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Condition withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRequestGroup_Condition(newValue, this.id, this.kind, this.extension, this.expression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Condition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Condition withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRequestGroup_Condition(value, this.id, this.kind, this.extension, this.expression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Condition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Condition withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableRequestGroup_Condition(this.modifierExtension, newValue, this.kind, this.extension, this.expression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Condition#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Condition withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableRequestGroup_Condition(this.modifierExtension, value, this.kind, this.extension, this.expression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Condition#kind() kind} attribute.
   * @param value The value for kind
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Condition withKind(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "kind");
    if (this.kind == newValue) return this;
    return new ImmutableRequestGroup_Condition(this.modifierExtension, this.id, newValue, this.extension, this.expression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Condition#kind() kind} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kind
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Condition withKind(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.kind == value) return this;
    return new ImmutableRequestGroup_Condition(this.modifierExtension, this.id, value, this.extension, this.expression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Condition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Condition withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRequestGroup_Condition(this.modifierExtension, this.id, this.kind, newValue, this.expression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Condition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Condition withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRequestGroup_Condition(this.modifierExtension, this.id, this.kind, value, this.expression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Condition#expression() expression} attribute.
   * @param value The value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Condition withExpression(com.fhir.Expression value) {
    @javax.annotation.Nullable com.fhir.Expression newValue = java.util.Objects.requireNonNull(value, "expression");
    if (this.expression == newValue) return this;
    return new ImmutableRequestGroup_Condition(this.modifierExtension, this.id, this.kind, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Condition#expression() expression} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expression
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Condition withExpression(java.util.Optional<? extends com.fhir.Expression> optional) {
    @javax.annotation.Nullable com.fhir.Expression value = optional.orElse(null);
    if (this.expression == value) return this;
    return new ImmutableRequestGroup_Condition(this.modifierExtension, this.id, this.kind, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRequestGroup_Condition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRequestGroup_Condition
        && equalTo((ImmutableRequestGroup_Condition) another);
  }

  private boolean equalTo(ImmutableRequestGroup_Condition another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(kind, another.kind)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(expression, another.expression);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code kind}, {@code extension}, {@code expression}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(kind);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(expression);
    return h;
  }

  /**
   * Prints the immutable value {@code RequestGroup_Condition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("RequestGroup_Condition{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (kind != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("kind=").append(kind);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (expression != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("expression=").append(expression);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "RequestGroup_Condition", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.RequestGroup_Condition {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> kind = java.util.Optional.empty();
    boolean kindIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Expression> expression = java.util.Optional.empty();
    boolean expressionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    public void setKind(java.util.Optional<com.fhir.code> kind) {
      this.kind = kind;
      this.kindIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    public void setExpression(java.util.Optional<com.fhir.Expression> expression) {
      this.expression = expression;
      this.expressionIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> kind() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Expression> expression() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableRequestGroup_Condition fromJson(Json json) {
    ImmutableRequestGroup_Condition.Builder builder = ImmutableRequestGroup_Condition.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.kindIsSet) {
      builder.kind(json.kind);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.expressionIsSet) {
      builder.expression(json.expression);
    }
    return (ImmutableRequestGroup_Condition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RequestGroup_Condition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RequestGroup_Condition instance
   */
  public static RequestGroup_Condition copyOf(RequestGroup_Condition instance) {
    if (instance instanceof ImmutableRequestGroup_Condition) {
      return (ImmutableRequestGroup_Condition) instance;
    }
    return ImmutableRequestGroup_Condition.builder()
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .kind(instance.kind())
        .extension(instance.extension())
        .expression(instance.expression())
        .build();
  }

  /**
   * Creates a builder for {@link RequestGroup_Condition RequestGroup_Condition}.
   * <pre>
   * ImmutableRequestGroup_Condition.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RequestGroup_Condition#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link RequestGroup_Condition#id() id}
   *    .kind(com.fhir.code) // optional {@link RequestGroup_Condition#kind() kind}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RequestGroup_Condition#extension() extension}
   *    .expression(com.fhir.Expression) // optional {@link RequestGroup_Condition#expression() expression}
   *    .build();
   * </pre>
   * @return A new RequestGroup_Condition builder
   */
  public static ImmutableRequestGroup_Condition.Builder builder() {
    return new ImmutableRequestGroup_Condition.Builder();
  }

  /**
   * Builds instances of type {@link RequestGroup_Condition RequestGroup_Condition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "RequestGroup_Condition", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_KIND = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_EXPRESSION = 0x10L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.code kind;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Expression expression;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RequestGroup_Condition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RequestGroup_Condition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RequestGroup_Condition#id() id} to id.
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
     * Initializes the optional value {@link RequestGroup_Condition#id() id} to id.
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
     * Initializes the optional value {@link RequestGroup_Condition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    public final Builder kind(com.fhir.code kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = java.util.Objects.requireNonNull(kind, "kind");
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Condition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    public final Builder kind(java.util.Optional<? extends com.fhir.code> kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = kind.orElse(null);
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Condition#extension() extension} to extension.
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
     * Initializes the optional value {@link RequestGroup_Condition#extension() extension} to extension.
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
     * Initializes the optional value {@link RequestGroup_Condition#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for chained invocation
     */
    public final Builder expression(com.fhir.Expression expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = java.util.Objects.requireNonNull(expression, "expression");
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Condition#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    public final Builder expression(java.util.Optional<? extends com.fhir.Expression> expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = expression.orElse(null);
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Builds a new {@link RequestGroup_Condition RequestGroup_Condition}.
     * @return An immutable instance of RequestGroup_Condition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.RequestGroup_Condition build() {
      return new ImmutableRequestGroup_Condition(modifierExtension, id, kind, extension, expression);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean kindIsSet() {
      return (optBits & OPT_BIT_KIND) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean expressionIsSet() {
      return (optBits & OPT_BIT_EXPRESSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of RequestGroup_Condition is strict, attribute is already set: ".concat(name));
    }
  }
}
