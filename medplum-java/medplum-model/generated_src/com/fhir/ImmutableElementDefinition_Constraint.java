//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ElementDefinition_Constraint}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableElementDefinition_Constraint.builder()}.
 */
@org.immutables.value.Generated(from = "ElementDefinition_Constraint", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableElementDefinition_Constraint implements com.fhir.ElementDefinition_Constraint {
  private final @javax.annotation.Nullable com.fhir.id key;
  private final @javax.annotation.Nullable java.lang.String expression;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String requirements;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.canonical source;
  private final @javax.annotation.Nullable java.lang.String xpath;
  private final @javax.annotation.Nullable com.fhir.Elementdefinition_constraintSeverity severity;
  private final @javax.annotation.Nullable java.lang.String human;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

  private ImmutableElementDefinition_Constraint(
      @javax.annotation.Nullable com.fhir.id key,
      @javax.annotation.Nullable java.lang.String expression,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String requirements,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.canonical source,
      @javax.annotation.Nullable java.lang.String xpath,
      @javax.annotation.Nullable com.fhir.Elementdefinition_constraintSeverity severity,
      @javax.annotation.Nullable java.lang.String human,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension) {
    this.key = key;
    this.expression = expression;
    this.id = id;
    this.requirements = requirements;
    this.modifierExtension = modifierExtension;
    this.source = source;
    this.xpath = xpath;
    this.severity = severity;
    this.human = human;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code key} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("key")
  @Override
  public java.util.Optional<com.fhir.id> key() {
    return java.util.Optional.ofNullable(key);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code requirements} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requirements")
  @Override
  public java.util.Optional<java.lang.String> requirements() {
    return java.util.Optional.ofNullable(requirements);
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
   * @return The value of the {@code source} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("source")
  @Override
  public java.util.Optional<com.fhir.canonical> source() {
    return java.util.Optional.ofNullable(source);
  }

  /**
   * @return The value of the {@code xpath} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("xpath")
  @Override
  public java.util.Optional<java.lang.String> xpath() {
    return java.util.Optional.ofNullable(xpath);
  }

  /**
   * @return The value of the {@code severity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("severity")
  @Override
  public java.util.Optional<com.fhir.Elementdefinition_constraintSeverity> severity() {
    return java.util.Optional.ofNullable(severity);
  }

  /**
   * @return The value of the {@code human} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("human")
  @Override
  public java.util.Optional<java.lang.String> human() {
    return java.util.Optional.ofNullable(human);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#key() key} attribute.
   * @param value The value for key
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withKey(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "key");
    if (this.key == newValue) return this;
    return new ImmutableElementDefinition_Constraint(
        newValue,
        this.expression,
        this.id,
        this.requirements,
        this.modifierExtension,
        this.source,
        this.xpath,
        this.severity,
        this.human,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#key() key} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for key
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Constraint withKey(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.key == value) return this;
    return new ImmutableElementDefinition_Constraint(
        value,
        this.expression,
        this.id,
        this.requirements,
        this.modifierExtension,
        this.source,
        this.xpath,
        this.severity,
        this.human,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#expression() expression} attribute.
   * @param value The value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withExpression(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "expression");
    if (java.util.Objects.equals(this.expression, newValue)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        newValue,
        this.id,
        this.requirements,
        this.modifierExtension,
        this.source,
        this.xpath,
        this.severity,
        this.human,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#expression() expression} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withExpression(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.expression, value)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        value,
        this.id,
        this.requirements,
        this.modifierExtension,
        this.source,
        this.xpath,
        this.severity,
        this.human,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        this.expression,
        newValue,
        this.requirements,
        this.modifierExtension,
        this.source,
        this.xpath,
        this.severity,
        this.human,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        this.expression,
        value,
        this.requirements,
        this.modifierExtension,
        this.source,
        this.xpath,
        this.severity,
        this.human,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#requirements() requirements} attribute.
   * @param value The value for requirements
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withRequirements(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "requirements");
    if (java.util.Objects.equals(this.requirements, newValue)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        this.expression,
        this.id,
        newValue,
        this.modifierExtension,
        this.source,
        this.xpath,
        this.severity,
        this.human,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#requirements() requirements} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requirements
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withRequirements(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.requirements, value)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        this.expression,
        this.id,
        value,
        this.modifierExtension,
        this.source,
        this.xpath,
        this.severity,
        this.human,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        this.expression,
        this.id,
        this.requirements,
        newValue,
        this.source,
        this.xpath,
        this.severity,
        this.human,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Constraint withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        this.expression,
        this.id,
        this.requirements,
        value,
        this.source,
        this.xpath,
        this.severity,
        this.human,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withSource(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        this.expression,
        this.id,
        this.requirements,
        this.modifierExtension,
        newValue,
        this.xpath,
        this.severity,
        this.human,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Constraint withSource(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        this.expression,
        this.id,
        this.requirements,
        this.modifierExtension,
        value,
        this.xpath,
        this.severity,
        this.human,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#xpath() xpath} attribute.
   * @param value The value for xpath
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withXpath(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "xpath");
    if (java.util.Objects.equals(this.xpath, newValue)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        this.expression,
        this.id,
        this.requirements,
        this.modifierExtension,
        this.source,
        newValue,
        this.severity,
        this.human,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#xpath() xpath} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for xpath
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withXpath(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.xpath, value)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        this.expression,
        this.id,
        this.requirements,
        this.modifierExtension,
        this.source,
        value,
        this.severity,
        this.human,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#severity() severity} attribute.
   * @param value The value for severity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withSeverity(com.fhir.Elementdefinition_constraintSeverity value) {
    @javax.annotation.Nullable com.fhir.Elementdefinition_constraintSeverity newValue = java.util.Objects.requireNonNull(value, "severity");
    if (this.severity == newValue) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        this.expression,
        this.id,
        this.requirements,
        this.modifierExtension,
        this.source,
        this.xpath,
        newValue,
        this.human,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#severity() severity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for severity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Constraint withSeverity(java.util.Optional<? extends com.fhir.Elementdefinition_constraintSeverity> optional) {
    @javax.annotation.Nullable com.fhir.Elementdefinition_constraintSeverity value = optional.orElse(null);
    if (this.severity == value) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        this.expression,
        this.id,
        this.requirements,
        this.modifierExtension,
        this.source,
        this.xpath,
        value,
        this.human,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#human() human} attribute.
   * @param value The value for human
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withHuman(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "human");
    if (java.util.Objects.equals(this.human, newValue)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        this.expression,
        this.id,
        this.requirements,
        this.modifierExtension,
        this.source,
        this.xpath,
        this.severity,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#human() human} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for human
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withHuman(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.human, value)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        this.expression,
        this.id,
        this.requirements,
        this.modifierExtension,
        this.source,
        this.xpath,
        this.severity,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        this.expression,
        this.id,
        this.requirements,
        this.modifierExtension,
        this.source,
        this.xpath,
        this.severity,
        this.human,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Constraint withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableElementDefinition_Constraint(
        this.key,
        this.expression,
        this.id,
        this.requirements,
        this.modifierExtension,
        this.source,
        this.xpath,
        this.severity,
        this.human,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableElementDefinition_Constraint} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableElementDefinition_Constraint
        && equalTo((ImmutableElementDefinition_Constraint) another);
  }

  private boolean equalTo(ImmutableElementDefinition_Constraint another) {
    return java.util.Objects.equals(key, another.key)
        && java.util.Objects.equals(expression, another.expression)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(requirements, another.requirements)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(source, another.source)
        && java.util.Objects.equals(xpath, another.xpath)
        && java.util.Objects.equals(severity, another.severity)
        && java.util.Objects.equals(human, another.human)
        && java.util.Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code key}, {@code expression}, {@code id}, {@code requirements}, {@code modifierExtension}, {@code source}, {@code xpath}, {@code severity}, {@code human}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(key);
    h += (h << 5) + java.util.Objects.hashCode(expression);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(requirements);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(source);
    h += (h << 5) + java.util.Objects.hashCode(xpath);
    h += (h << 5) + java.util.Objects.hashCode(severity);
    h += (h << 5) + java.util.Objects.hashCode(human);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code ElementDefinition_Constraint} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ElementDefinition_Constraint{");
    if (key != null) {
      builder.append("key=").append(key);
    }
    if (expression != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("expression=").append(expression);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (requirements != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("requirements=").append(requirements);
    }
    if (modifierExtension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (source != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (xpath != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("xpath=").append(xpath);
    }
    if (severity != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("severity=").append(severity);
    }
    if (human != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("human=").append(human);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ElementDefinition_Constraint", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ElementDefinition_Constraint {
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> key = java.util.Optional.empty();
    boolean keyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> expression = java.util.Optional.empty();
    boolean expressionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> requirements = java.util.Optional.empty();
    boolean requirementsIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> source = java.util.Optional.empty();
    boolean sourceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> xpath = java.util.Optional.empty();
    boolean xpathIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Elementdefinition_constraintSeverity> severity = java.util.Optional.empty();
    boolean severityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> human = java.util.Optional.empty();
    boolean humanIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    public void setKey(java.util.Optional<com.fhir.id> key) {
      this.key = key;
      this.keyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    public void setExpression(java.util.Optional<java.lang.String> expression) {
      this.expression = expression;
      this.expressionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requirements")
    public void setRequirements(java.util.Optional<java.lang.String> requirements) {
      this.requirements = requirements;
      this.requirementsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public void setSource(java.util.Optional<com.fhir.canonical> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("xpath")
    public void setXpath(java.util.Optional<java.lang.String> xpath) {
      this.xpath = xpath;
      this.xpathIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    public void setSeverity(java.util.Optional<com.fhir.Elementdefinition_constraintSeverity> severity) {
      this.severity = severity;
      this.severityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("human")
    public void setHuman(java.util.Optional<java.lang.String> human) {
      this.human = human;
      this.humanIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.id> key() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> expression() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> requirements() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> source() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> xpath() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Elementdefinition_constraintSeverity> severity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> human() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableElementDefinition_Constraint fromJson(Json json) {
    ImmutableElementDefinition_Constraint.Builder builder = ImmutableElementDefinition_Constraint.builder();
    if (json.keyIsSet) {
      builder.key(json.key);
    }
    if (json.expressionIsSet) {
      builder.expression(json.expression);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.requirementsIsSet) {
      builder.requirements(json.requirements);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.xpathIsSet) {
      builder.xpath(json.xpath);
    }
    if (json.severityIsSet) {
      builder.severity(json.severity);
    }
    if (json.humanIsSet) {
      builder.human(json.human);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableElementDefinition_Constraint) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ElementDefinition_Constraint} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ElementDefinition_Constraint instance
   */
  public static ElementDefinition_Constraint copyOf(ElementDefinition_Constraint instance) {
    if (instance instanceof ImmutableElementDefinition_Constraint) {
      return (ImmutableElementDefinition_Constraint) instance;
    }
    return ImmutableElementDefinition_Constraint.builder()
        .key(instance.key())
        .expression(instance.expression())
        .id(instance.id())
        .requirements(instance.requirements())
        .modifierExtension(instance.modifierExtension())
        .source(instance.source())
        .xpath(instance.xpath())
        .severity(instance.severity())
        .human(instance.human())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link ElementDefinition_Constraint ElementDefinition_Constraint}.
   * <pre>
   * ImmutableElementDefinition_Constraint.builder()
   *    .key(com.fhir.id) // optional {@link ElementDefinition_Constraint#key() key}
   *    .expression(String) // optional {@link ElementDefinition_Constraint#expression() expression}
   *    .id(String) // optional {@link ElementDefinition_Constraint#id() id}
   *    .requirements(String) // optional {@link ElementDefinition_Constraint#requirements() requirements}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Constraint#modifierExtension() modifierExtension}
   *    .source(com.fhir.canonical) // optional {@link ElementDefinition_Constraint#source() source}
   *    .xpath(String) // optional {@link ElementDefinition_Constraint#xpath() xpath}
   *    .severity(com.fhir.Elementdefinition_constraintSeverity) // optional {@link ElementDefinition_Constraint#severity() severity}
   *    .human(String) // optional {@link ElementDefinition_Constraint#human() human}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Constraint#extension() extension}
   *    .build();
   * </pre>
   * @return A new ElementDefinition_Constraint builder
   */
  public static ImmutableElementDefinition_Constraint.Builder builder() {
    return new ImmutableElementDefinition_Constraint.Builder();
  }

  /**
   * Builds instances of type {@link ElementDefinition_Constraint ElementDefinition_Constraint}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ElementDefinition_Constraint", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_KEY = 0x1L;
    private static final long OPT_BIT_EXPRESSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_REQUIREMENTS = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_SOURCE = 0x20L;
    private static final long OPT_BIT_XPATH = 0x40L;
    private static final long OPT_BIT_SEVERITY = 0x80L;
    private static final long OPT_BIT_HUMAN = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.id key;
    private @javax.annotation.Nullable java.lang.String expression;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String requirements;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.canonical source;
    private @javax.annotation.Nullable java.lang.String xpath;
    private @javax.annotation.Nullable com.fhir.Elementdefinition_constraintSeverity severity;
    private @javax.annotation.Nullable java.lang.String human;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#key() key} to key.
     * @param key The value for key
     * @return {@code this} builder for chained invocation
     */
    public final Builder key(com.fhir.id key) {
      checkNotIsSet(keyIsSet(), "key");
      this.key = java.util.Objects.requireNonNull(key, "key");
      optBits |= OPT_BIT_KEY;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#key() key} to key.
     * @param key The value for key
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    public final Builder key(java.util.Optional<? extends com.fhir.id> key) {
      checkNotIsSet(keyIsSet(), "key");
      this.key = key.orElse(null);
      optBits |= OPT_BIT_KEY;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#expression() expression} to expression.
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
     * Initializes the optional value {@link ElementDefinition_Constraint#expression() expression} to expression.
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
     * Initializes the optional value {@link ElementDefinition_Constraint#id() id} to id.
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
     * Initializes the optional value {@link ElementDefinition_Constraint#id() id} to id.
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
     * Initializes the optional value {@link ElementDefinition_Constraint#requirements() requirements} to requirements.
     * @param requirements The value for requirements
     * @return {@code this} builder for chained invocation
     */
    public final Builder requirements(java.lang.String requirements) {
      checkNotIsSet(requirementsIsSet(), "requirements");
      this.requirements = java.util.Objects.requireNonNull(requirements, "requirements");
      optBits |= OPT_BIT_REQUIREMENTS;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#requirements() requirements} to requirements.
     * @param requirements The value for requirements
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requirements")
    public final Builder requirements(java.util.Optional<java.lang.String> requirements) {
      checkNotIsSet(requirementsIsSet(), "requirements");
      this.requirements = requirements.orElse(null);
      optBits |= OPT_BIT_REQUIREMENTS;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Constraint#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Constraint#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(com.fhir.canonical source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = java.util.Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public final Builder source(java.util.Optional<? extends com.fhir.canonical> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#xpath() xpath} to xpath.
     * @param xpath The value for xpath
     * @return {@code this} builder for chained invocation
     */
    public final Builder xpath(java.lang.String xpath) {
      checkNotIsSet(xpathIsSet(), "xpath");
      this.xpath = java.util.Objects.requireNonNull(xpath, "xpath");
      optBits |= OPT_BIT_XPATH;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#xpath() xpath} to xpath.
     * @param xpath The value for xpath
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("xpath")
    public final Builder xpath(java.util.Optional<java.lang.String> xpath) {
      checkNotIsSet(xpathIsSet(), "xpath");
      this.xpath = xpath.orElse(null);
      optBits |= OPT_BIT_XPATH;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for chained invocation
     */
    public final Builder severity(com.fhir.Elementdefinition_constraintSeverity severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = java.util.Objects.requireNonNull(severity, "severity");
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    public final Builder severity(java.util.Optional<? extends com.fhir.Elementdefinition_constraintSeverity> severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = severity.orElse(null);
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#human() human} to human.
     * @param human The value for human
     * @return {@code this} builder for chained invocation
     */
    public final Builder human(java.lang.String human) {
      checkNotIsSet(humanIsSet(), "human");
      this.human = java.util.Objects.requireNonNull(human, "human");
      optBits |= OPT_BIT_HUMAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#human() human} to human.
     * @param human The value for human
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("human")
    public final Builder human(java.util.Optional<java.lang.String> human) {
      checkNotIsSet(humanIsSet(), "human");
      this.human = human.orElse(null);
      optBits |= OPT_BIT_HUMAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#extension() extension} to extension.
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
     * Initializes the optional value {@link ElementDefinition_Constraint#extension() extension} to extension.
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
     * Builds a new {@link ElementDefinition_Constraint ElementDefinition_Constraint}.
     * @return An immutable instance of ElementDefinition_Constraint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ElementDefinition_Constraint build() {
      return new ImmutableElementDefinition_Constraint(
          key,
          expression,
          id,
          requirements,
          modifierExtension,
          source,
          xpath,
          severity,
          human,
          extension);
    }

    private boolean keyIsSet() {
      return (optBits & OPT_BIT_KEY) != 0;
    }

    private boolean expressionIsSet() {
      return (optBits & OPT_BIT_EXPRESSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean requirementsIsSet() {
      return (optBits & OPT_BIT_REQUIREMENTS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean xpathIsSet() {
      return (optBits & OPT_BIT_XPATH) != 0;
    }

    private boolean severityIsSet() {
      return (optBits & OPT_BIT_SEVERITY) != 0;
    }

    private boolean humanIsSet() {
      return (optBits & OPT_BIT_HUMAN) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ElementDefinition_Constraint is strict, attribute is already set: ".concat(name));
    }
  }
}
