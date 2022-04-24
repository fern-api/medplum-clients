//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link SearchParameter_Component}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSearchParameter_Component.builder()}.
 */
@org.immutables.value.Generated(from = "SearchParameter_Component", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSearchParameter_Component implements com.fhir.SearchParameter_Component {
  private final @javax.annotation.Nullable java.lang.String expression;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final com.fhir.canonical definition;

  private ImmutableSearchParameter_Component(
      @javax.annotation.Nullable java.lang.String expression,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      com.fhir.canonical definition) {
    this.expression = expression;
    this.extension = extension;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.definition = definition;
  }

  /**
   * @return The value of the {@code expression} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("expression")
  @Override
  public java.util.Optional<java.lang.String> expression() {
    return java.util.Optional.ofNullable(expression);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code definition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("definition")
  @Override
  public com.fhir.canonical definition() {
    return definition;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter_Component#expression() expression} attribute.
   * @param value The value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter_Component withExpression(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "expression");
    if (java.util.Objects.equals(this.expression, newValue)) return this;
    return new ImmutableSearchParameter_Component(newValue, this.extension, this.id, this.modifierExtension, this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter_Component#expression() expression} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter_Component withExpression(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.expression, value)) return this;
    return new ImmutableSearchParameter_Component(value, this.extension, this.id, this.modifierExtension, this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter_Component#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter_Component withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSearchParameter_Component(this.expression, newValue, this.id, this.modifierExtension, this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter_Component#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter_Component withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSearchParameter_Component(this.expression, value, this.id, this.modifierExtension, this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter_Component#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter_Component withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableSearchParameter_Component(this.expression, this.extension, newValue, this.modifierExtension, this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter_Component#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter_Component withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableSearchParameter_Component(this.expression, this.extension, value, this.modifierExtension, this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter_Component#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter_Component withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSearchParameter_Component(this.expression, this.extension, this.id, newValue, this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter_Component#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter_Component withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSearchParameter_Component(this.expression, this.extension, this.id, value, this.definition);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchParameter_Component#definition() definition} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for definition
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchParameter_Component withDefinition(com.fhir.canonical value) {
    if (this.definition == value) return this;
    com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "definition");
    return new ImmutableSearchParameter_Component(this.expression, this.extension, this.id, this.modifierExtension, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSearchParameter_Component} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSearchParameter_Component
        && equalTo((ImmutableSearchParameter_Component) another);
  }

  private boolean equalTo(ImmutableSearchParameter_Component another) {
    return java.util.Objects.equals(expression, another.expression)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && definition.equals(another.definition);
  }

  /**
   * Computes a hash code from attributes: {@code expression}, {@code extension}, {@code id}, {@code modifierExtension}, {@code definition}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(expression);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + definition.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SearchParameter_Component} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("SearchParameter_Component{");
    if (expression != null) {
      builder.append("expression=").append(expression);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 26) builder.append(", ");
    builder.append("definition=").append(definition);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "SearchParameter_Component", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.SearchParameter_Component {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> expression = java.util.Optional.empty();
    boolean expressionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable com.fhir.canonical definition;
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    public void setExpression(java.util.Optional<java.lang.String> expression) {
      this.expression = expression;
      this.expressionIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    public void setDefinition(com.fhir.canonical definition) {
      this.definition = definition;
    }
    @Override
    public java.util.Optional<java.lang.String> expression() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.canonical definition() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSearchParameter_Component fromJson(Json json) {
    ImmutableSearchParameter_Component.Builder builder = ((ImmutableSearchParameter_Component.Builder) ImmutableSearchParameter_Component.builder());
    if (json.expressionIsSet) {
      builder.expression(json.expression);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.definition != null) {
      builder.definition(json.definition);
    }
    return (ImmutableSearchParameter_Component) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SearchParameter_Component} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SearchParameter_Component instance
   */
  public static SearchParameter_Component copyOf(SearchParameter_Component instance) {
    if (instance instanceof ImmutableSearchParameter_Component) {
      return (ImmutableSearchParameter_Component) instance;
    }
    return ((ImmutableSearchParameter_Component.Builder) ImmutableSearchParameter_Component.builder())
        .expression(instance.expression())
        .extension(instance.extension())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .definition(instance.definition())
        .build();
  }

  /**
   * Creates a builder for {@link SearchParameter_Component SearchParameter_Component}.
   * <pre>
   * ImmutableSearchParameter_Component.builder()
   *    .expression(String) // optional {@link SearchParameter_Component#expression() expression}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SearchParameter_Component#extension() extension}
   *    .id(String) // optional {@link SearchParameter_Component#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SearchParameter_Component#modifierExtension() modifierExtension}
   *    .definition(com.fhir.canonical) // required {@link SearchParameter_Component#definition() definition}
   *    .build();
   * </pre>
   * @return A new SearchParameter_Component builder
   */
  public static DefinitionBuildStage builder() {
    return new ImmutableSearchParameter_Component.Builder();
  }

  /**
   * Builds instances of type {@link SearchParameter_Component SearchParameter_Component}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "SearchParameter_Component", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements DefinitionBuildStage, BuildFinal {
    private static final long INIT_BIT_DEFINITION = 0x1L;
    private static final long OPT_BIT_EXPRESSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String expression;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.canonical definition;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SearchParameter_Component#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for chained invocation
     */
    public final Builder expression(java.lang.String expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = java.util.Objects.requireNonNull(expression, "expression");
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter_Component#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    public final Builder expression(java.util.Optional<java.lang.String> expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = expression.orElse(null);
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter_Component#extension() extension} to extension.
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
     * Initializes the optional value {@link SearchParameter_Component#extension() extension} to extension.
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
     * Initializes the optional value {@link SearchParameter_Component#id() id} to id.
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
     * Initializes the optional value {@link SearchParameter_Component#id() id} to id.
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
     * Initializes the optional value {@link SearchParameter_Component#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SearchParameter_Component#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link SearchParameter_Component#definition() definition} attribute.
     * @param definition The value for definition 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    public final Builder definition(com.fhir.canonical definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = java.util.Objects.requireNonNull(definition, "definition");
      initBits &= ~INIT_BIT_DEFINITION;
      return this;
    }

    /**
     * Builds a new {@link SearchParameter_Component SearchParameter_Component}.
     * @return An immutable instance of SearchParameter_Component
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.SearchParameter_Component build() {
      checkRequiredAttributes();
      return new ImmutableSearchParameter_Component(expression, extension, id, modifierExtension, definition);
    }

    private boolean expressionIsSet() {
      return (optBits & OPT_BIT_EXPRESSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean definitionIsSet() {
      return (initBits & INIT_BIT_DEFINITION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of SearchParameter_Component is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!definitionIsSet()) attributes.add("definition");
      return "Cannot build SearchParameter_Component, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "SearchParameter_Component", generator = "Immutables")
  public interface DefinitionBuildStage {
    /**
     * Initializes the value for the {@link SearchParameter_Component#definition() definition} attribute.
     * @param definition The value for definition 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal definition(com.fhir.canonical definition);
  }

  @org.immutables.value.Generated(from = "SearchParameter_Component", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SearchParameter_Component#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for chained invocation
     */
    BuildFinal expression(java.lang.String expression);

    /**
     * Initializes the optional value {@link SearchParameter_Component#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal expression(java.util.Optional<java.lang.String> expression);

    /**
     * Initializes the optional value {@link SearchParameter_Component#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link SearchParameter_Component#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link SearchParameter_Component#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link SearchParameter_Component#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link SearchParameter_Component#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SearchParameter_Component#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Builds a new {@link SearchParameter_Component SearchParameter_Component}.
     * @return An immutable instance of SearchParameter_Component
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SearchParameter_Component build();
  }
}
