//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link GraphDefinition_Compartment}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGraphDefinition_Compartment.builder()}.
 */
@org.immutables.value.Generated(from = "GraphDefinition_Compartment", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableGraphDefinition_Compartment implements com.fhir.GraphDefinition_Compartment {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.code code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable com.fhir.Graphdefinition_compartmentUse use;
  private final @javax.annotation.Nullable java.lang.String expression;
  private final @javax.annotation.Nullable com.fhir.Graphdefinition_compartmentRule rule;

  private ImmutableGraphDefinition_Compartment(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.code code,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable com.fhir.Graphdefinition_compartmentUse use,
      @javax.annotation.Nullable java.lang.String expression,
      @javax.annotation.Nullable com.fhir.Graphdefinition_compartmentRule rule) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.code = code;
    this.extension = extension;
    this.description = description;
    this.use = use;
    this.expression = expression;
    this.rule = rule;
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.code> code() {
    return java.util.Optional.ofNullable(code);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("use")
  @Override
  public java.util.Optional<com.fhir.Graphdefinition_compartmentUse> use() {
    return java.util.Optional.ofNullable(use);
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
   * @return The value of the {@code rule} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("rule")
  @Override
  public java.util.Optional<com.fhir.Graphdefinition_compartmentRule> rule() {
    return java.util.Optional.ofNullable(rule);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Compartment#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Compartment withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableGraphDefinition_Compartment(
        newValue,
        this.modifierExtension,
        this.code,
        this.extension,
        this.description,
        this.use,
        this.expression,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Compartment#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Compartment withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableGraphDefinition_Compartment(
        value,
        this.modifierExtension,
        this.code,
        this.extension,
        this.description,
        this.use,
        this.expression,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Compartment#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Compartment withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableGraphDefinition_Compartment(
        this.id,
        newValue,
        this.code,
        this.extension,
        this.description,
        this.use,
        this.expression,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Compartment#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Compartment withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableGraphDefinition_Compartment(
        this.id,
        value,
        this.code,
        this.extension,
        this.description,
        this.use,
        this.expression,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Compartment#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Compartment withCode(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableGraphDefinition_Compartment(
        this.id,
        this.modifierExtension,
        newValue,
        this.extension,
        this.description,
        this.use,
        this.expression,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Compartment#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Compartment withCode(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableGraphDefinition_Compartment(
        this.id,
        this.modifierExtension,
        value,
        this.extension,
        this.description,
        this.use,
        this.expression,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Compartment#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Compartment withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableGraphDefinition_Compartment(
        this.id,
        this.modifierExtension,
        this.code,
        newValue,
        this.description,
        this.use,
        this.expression,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Compartment#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Compartment withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableGraphDefinition_Compartment(
        this.id,
        this.modifierExtension,
        this.code,
        value,
        this.description,
        this.use,
        this.expression,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Compartment#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Compartment withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableGraphDefinition_Compartment(
        this.id,
        this.modifierExtension,
        this.code,
        this.extension,
        newValue,
        this.use,
        this.expression,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Compartment#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Compartment withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableGraphDefinition_Compartment(
        this.id,
        this.modifierExtension,
        this.code,
        this.extension,
        value,
        this.use,
        this.expression,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Compartment#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Compartment withUse(com.fhir.Graphdefinition_compartmentUse value) {
    @javax.annotation.Nullable com.fhir.Graphdefinition_compartmentUse newValue = java.util.Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableGraphDefinition_Compartment(
        this.id,
        this.modifierExtension,
        this.code,
        this.extension,
        this.description,
        newValue,
        this.expression,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Compartment#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Compartment withUse(java.util.Optional<? extends com.fhir.Graphdefinition_compartmentUse> optional) {
    @javax.annotation.Nullable com.fhir.Graphdefinition_compartmentUse value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableGraphDefinition_Compartment(
        this.id,
        this.modifierExtension,
        this.code,
        this.extension,
        this.description,
        value,
        this.expression,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Compartment#expression() expression} attribute.
   * @param value The value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Compartment withExpression(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "expression");
    if (java.util.Objects.equals(this.expression, newValue)) return this;
    return new ImmutableGraphDefinition_Compartment(
        this.id,
        this.modifierExtension,
        this.code,
        this.extension,
        this.description,
        this.use,
        newValue,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Compartment#expression() expression} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Compartment withExpression(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.expression, value)) return this;
    return new ImmutableGraphDefinition_Compartment(
        this.id,
        this.modifierExtension,
        this.code,
        this.extension,
        this.description,
        this.use,
        value,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition_Compartment#rule() rule} attribute.
   * @param value The value for rule
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition_Compartment withRule(com.fhir.Graphdefinition_compartmentRule value) {
    @javax.annotation.Nullable com.fhir.Graphdefinition_compartmentRule newValue = java.util.Objects.requireNonNull(value, "rule");
    if (this.rule == newValue) return this;
    return new ImmutableGraphDefinition_Compartment(
        this.id,
        this.modifierExtension,
        this.code,
        this.extension,
        this.description,
        this.use,
        this.expression,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition_Compartment#rule() rule} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rule
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition_Compartment withRule(java.util.Optional<? extends com.fhir.Graphdefinition_compartmentRule> optional) {
    @javax.annotation.Nullable com.fhir.Graphdefinition_compartmentRule value = optional.orElse(null);
    if (this.rule == value) return this;
    return new ImmutableGraphDefinition_Compartment(
        this.id,
        this.modifierExtension,
        this.code,
        this.extension,
        this.description,
        this.use,
        this.expression,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGraphDefinition_Compartment} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGraphDefinition_Compartment
        && equalTo((ImmutableGraphDefinition_Compartment) another);
  }

  private boolean equalTo(ImmutableGraphDefinition_Compartment another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(use, another.use)
        && java.util.Objects.equals(expression, another.expression)
        && java.util.Objects.equals(rule, another.rule);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code code}, {@code extension}, {@code description}, {@code use}, {@code expression}, {@code rule}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(use);
    h += (h << 5) + java.util.Objects.hashCode(expression);
    h += (h << 5) + java.util.Objects.hashCode(rule);
    return h;
  }

  /**
   * Prints the immutable value {@code GraphDefinition_Compartment} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("GraphDefinition_Compartment{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (code != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (extension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (description != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (use != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("use=").append(use);
    }
    if (expression != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("expression=").append(expression);
    }
    if (rule != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("rule=").append(rule);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "GraphDefinition_Compartment", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.GraphDefinition_Compartment {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Graphdefinition_compartmentUse> use = java.util.Optional.empty();
    boolean useIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> expression = java.util.Optional.empty();
    boolean expressionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Graphdefinition_compartmentRule> rule = java.util.Optional.empty();
    boolean ruleIsSet;
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
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public void setUse(java.util.Optional<com.fhir.Graphdefinition_compartmentUse> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    public void setExpression(java.util.Optional<java.lang.String> expression) {
      this.expression = expression;
      this.expressionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("rule")
    public void setRule(java.util.Optional<com.fhir.Graphdefinition_compartmentRule> rule) {
      this.rule = rule;
      this.ruleIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Graphdefinition_compartmentUse> use() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> expression() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Graphdefinition_compartmentRule> rule() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableGraphDefinition_Compartment fromJson(Json json) {
    ImmutableGraphDefinition_Compartment.Builder builder = ImmutableGraphDefinition_Compartment.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.expressionIsSet) {
      builder.expression(json.expression);
    }
    if (json.ruleIsSet) {
      builder.rule(json.rule);
    }
    return (ImmutableGraphDefinition_Compartment) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link GraphDefinition_Compartment} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GraphDefinition_Compartment instance
   */
  public static GraphDefinition_Compartment copyOf(GraphDefinition_Compartment instance) {
    if (instance instanceof ImmutableGraphDefinition_Compartment) {
      return (ImmutableGraphDefinition_Compartment) instance;
    }
    return ImmutableGraphDefinition_Compartment.builder()
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .code(instance.code())
        .extension(instance.extension())
        .description(instance.description())
        .use(instance.use())
        .expression(instance.expression())
        .rule(instance.rule())
        .build();
  }

  /**
   * Creates a builder for {@link GraphDefinition_Compartment GraphDefinition_Compartment}.
   * <pre>
   * ImmutableGraphDefinition_Compartment.builder()
   *    .id(String) // optional {@link GraphDefinition_Compartment#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link GraphDefinition_Compartment#modifierExtension() modifierExtension}
   *    .code(com.fhir.code) // optional {@link GraphDefinition_Compartment#code() code}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link GraphDefinition_Compartment#extension() extension}
   *    .description(String) // optional {@link GraphDefinition_Compartment#description() description}
   *    .use(com.fhir.Graphdefinition_compartmentUse) // optional {@link GraphDefinition_Compartment#use() use}
   *    .expression(String) // optional {@link GraphDefinition_Compartment#expression() expression}
   *    .rule(com.fhir.Graphdefinition_compartmentRule) // optional {@link GraphDefinition_Compartment#rule() rule}
   *    .build();
   * </pre>
   * @return A new GraphDefinition_Compartment builder
   */
  public static ImmutableGraphDefinition_Compartment.Builder builder() {
    return new ImmutableGraphDefinition_Compartment.Builder();
  }

  /**
   * Builds instances of type {@link GraphDefinition_Compartment GraphDefinition_Compartment}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "GraphDefinition_Compartment", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_CODE = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_DESCRIPTION = 0x10L;
    private static final long OPT_BIT_USE = 0x20L;
    private static final long OPT_BIT_EXPRESSION = 0x40L;
    private static final long OPT_BIT_RULE = 0x80L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.code code;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable com.fhir.Graphdefinition_compartmentUse use;
    private @javax.annotation.Nullable java.lang.String expression;
    private @javax.annotation.Nullable com.fhir.Graphdefinition_compartmentRule rule;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Compartment#id() id} to id.
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
     * Initializes the optional value {@link GraphDefinition_Compartment#id() id} to id.
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
     * Initializes the optional value {@link GraphDefinition_Compartment#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link GraphDefinition_Compartment#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link GraphDefinition_Compartment#code() code} to code.
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
     * Initializes the optional value {@link GraphDefinition_Compartment#code() code} to code.
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
     * Initializes the optional value {@link GraphDefinition_Compartment#extension() extension} to extension.
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
     * Initializes the optional value {@link GraphDefinition_Compartment#extension() extension} to extension.
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
     * Initializes the optional value {@link GraphDefinition_Compartment#description() description} to description.
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
     * Initializes the optional value {@link GraphDefinition_Compartment#description() description} to description.
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
     * Initializes the optional value {@link GraphDefinition_Compartment#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(com.fhir.Graphdefinition_compartmentUse use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = java.util.Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Compartment#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public final Builder use(java.util.Optional<? extends com.fhir.Graphdefinition_compartmentUse> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Compartment#expression() expression} to expression.
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
     * Initializes the optional value {@link GraphDefinition_Compartment#expression() expression} to expression.
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
     * Initializes the optional value {@link GraphDefinition_Compartment#rule() rule} to rule.
     * @param rule The value for rule
     * @return {@code this} builder for chained invocation
     */
    public final Builder rule(com.fhir.Graphdefinition_compartmentRule rule) {
      checkNotIsSet(ruleIsSet(), "rule");
      this.rule = java.util.Objects.requireNonNull(rule, "rule");
      optBits |= OPT_BIT_RULE;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition_Compartment#rule() rule} to rule.
     * @param rule The value for rule
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rule")
    public final Builder rule(java.util.Optional<? extends com.fhir.Graphdefinition_compartmentRule> rule) {
      checkNotIsSet(ruleIsSet(), "rule");
      this.rule = rule.orElse(null);
      optBits |= OPT_BIT_RULE;
      return this;
    }

    /**
     * Builds a new {@link GraphDefinition_Compartment GraphDefinition_Compartment}.
     * @return An immutable instance of GraphDefinition_Compartment
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.GraphDefinition_Compartment build() {
      return new ImmutableGraphDefinition_Compartment(id, modifierExtension, code, extension, description, use, expression, rule);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean expressionIsSet() {
      return (optBits & OPT_BIT_EXPRESSION) != 0;
    }

    private boolean ruleIsSet() {
      return (optBits & OPT_BIT_RULE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of GraphDefinition_Compartment is strict, attribute is already set: ".concat(name));
    }
  }
}
