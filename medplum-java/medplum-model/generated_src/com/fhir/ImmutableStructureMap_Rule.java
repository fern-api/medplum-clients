//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link StructureMap_Rule}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureMap_Rule.builder()}.
 */
@org.immutables.value.Generated(from = "StructureMap_Rule", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureMap_Rule implements com.fhir.StructureMap_Rule {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final java.util.List<com.fhir.StructureMap_Source> source;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.id name;
  private final @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Rule> rule;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Target> target;
  private final @javax.annotation.Nullable java.lang.String documentation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Dependent> dependent;

  private ImmutableStructureMap_Rule(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      java.util.List<com.fhir.StructureMap_Source> source,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.id name,
      @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Rule> rule,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Target> target,
      @javax.annotation.Nullable java.lang.String documentation,
      @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Dependent> dependent) {
    this.extension = extension;
    this.source = source;
    this.modifierExtension = modifierExtension;
    this.name = name;
    this.rule = rule;
    this.id = id;
    this.target = target;
    this.documentation = documentation;
    this.dependent = dependent;
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
   * @return The value of the {@code source} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("source")
  @Override
  public java.util.List<com.fhir.StructureMap_Source> source() {
    return source;
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
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<com.fhir.id> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code rule} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("rule")
  @Override
  public java.util.Optional<java.util.List<com.fhir.StructureMap_Rule>> rule() {
    return java.util.Optional.ofNullable(rule);
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
   * @return The value of the {@code target} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("target")
  @Override
  public java.util.Optional<java.util.List<com.fhir.StructureMap_Target>> target() {
    return java.util.Optional.ofNullable(target);
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
   * @return The value of the {@code dependent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dependent")
  @Override
  public java.util.Optional<java.util.List<com.fhir.StructureMap_Dependent>> dependent() {
    return java.util.Optional.ofNullable(dependent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Rule#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureMap_Rule(
        newValue,
        this.source,
        this.modifierExtension,
        this.name,
        this.rule,
        this.id,
        this.target,
        this.documentation,
        this.dependent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Rule#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Rule withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureMap_Rule(
        value,
        this.source,
        this.modifierExtension,
        this.name,
        this.rule,
        this.id,
        this.target,
        this.documentation,
        this.dependent);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureMap_Rule#source() source}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withSource(com.fhir.StructureMap_Source... elements) {
    java.util.List<com.fhir.StructureMap_Source> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableStructureMap_Rule(
        this.extension,
        newValue,
        this.modifierExtension,
        this.name,
        this.rule,
        this.id,
        this.target,
        this.documentation,
        this.dependent);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureMap_Rule#source() source}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of source elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withSource(Iterable<? extends com.fhir.StructureMap_Source> elements) {
    if (this.source == elements) return this;
    java.util.List<com.fhir.StructureMap_Source> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableStructureMap_Rule(
        this.extension,
        newValue,
        this.modifierExtension,
        this.name,
        this.rule,
        this.id,
        this.target,
        this.documentation,
        this.dependent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Rule#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureMap_Rule(
        this.extension,
        this.source,
        newValue,
        this.name,
        this.rule,
        this.id,
        this.target,
        this.documentation,
        this.dependent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Rule#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Rule withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureMap_Rule(
        this.extension,
        this.source,
        value,
        this.name,
        this.rule,
        this.id,
        this.target,
        this.documentation,
        this.dependent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Rule#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withName(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutableStructureMap_Rule(
        this.extension,
        this.source,
        this.modifierExtension,
        newValue,
        this.rule,
        this.id,
        this.target,
        this.documentation,
        this.dependent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Rule#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Rule withName(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutableStructureMap_Rule(
        this.extension,
        this.source,
        this.modifierExtension,
        value,
        this.rule,
        this.id,
        this.target,
        this.documentation,
        this.dependent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Rule#rule() rule} attribute.
   * @param value The value for rule
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withRule(java.util.List<com.fhir.StructureMap_Rule> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Rule> newValue = java.util.Objects.requireNonNull(value, "rule");
    if (this.rule == newValue) return this;
    return new ImmutableStructureMap_Rule(
        this.extension,
        this.source,
        this.modifierExtension,
        this.name,
        newValue,
        this.id,
        this.target,
        this.documentation,
        this.dependent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Rule#rule() rule} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rule
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Rule withRule(java.util.Optional<? extends java.util.List<com.fhir.StructureMap_Rule>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Rule> value = optional.orElse(null);
    if (this.rule == value) return this;
    return new ImmutableStructureMap_Rule(
        this.extension,
        this.source,
        this.modifierExtension,
        this.name,
        value,
        this.id,
        this.target,
        this.documentation,
        this.dependent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Rule#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableStructureMap_Rule(
        this.extension,
        this.source,
        this.modifierExtension,
        this.name,
        this.rule,
        newValue,
        this.target,
        this.documentation,
        this.dependent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Rule#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableStructureMap_Rule(
        this.extension,
        this.source,
        this.modifierExtension,
        this.name,
        this.rule,
        value,
        this.target,
        this.documentation,
        this.dependent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Rule#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withTarget(java.util.List<com.fhir.StructureMap_Target> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Target> newValue = java.util.Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutableStructureMap_Rule(
        this.extension,
        this.source,
        this.modifierExtension,
        this.name,
        this.rule,
        this.id,
        newValue,
        this.documentation,
        this.dependent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Rule#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Rule withTarget(java.util.Optional<? extends java.util.List<com.fhir.StructureMap_Target>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Target> value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutableStructureMap_Rule(
        this.extension,
        this.source,
        this.modifierExtension,
        this.name,
        this.rule,
        this.id,
        value,
        this.documentation,
        this.dependent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Rule#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withDocumentation(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "documentation");
    if (java.util.Objects.equals(this.documentation, newValue)) return this;
    return new ImmutableStructureMap_Rule(
        this.extension,
        this.source,
        this.modifierExtension,
        this.name,
        this.rule,
        this.id,
        this.target,
        newValue,
        this.dependent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Rule#documentation() documentation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withDocumentation(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.documentation, value)) return this;
    return new ImmutableStructureMap_Rule(
        this.extension,
        this.source,
        this.modifierExtension,
        this.name,
        this.rule,
        this.id,
        this.target,
        value,
        this.dependent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Rule#dependent() dependent} attribute.
   * @param value The value for dependent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withDependent(java.util.List<com.fhir.StructureMap_Dependent> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Dependent> newValue = java.util.Objects.requireNonNull(value, "dependent");
    if (this.dependent == newValue) return this;
    return new ImmutableStructureMap_Rule(
        this.extension,
        this.source,
        this.modifierExtension,
        this.name,
        this.rule,
        this.id,
        this.target,
        this.documentation,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Rule#dependent() dependent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dependent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Rule withDependent(java.util.Optional<? extends java.util.List<com.fhir.StructureMap_Dependent>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Dependent> value = optional.orElse(null);
    if (this.dependent == value) return this;
    return new ImmutableStructureMap_Rule(
        this.extension,
        this.source,
        this.modifierExtension,
        this.name,
        this.rule,
        this.id,
        this.target,
        this.documentation,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureMap_Rule} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureMap_Rule
        && equalTo((ImmutableStructureMap_Rule) another);
  }

  private boolean equalTo(ImmutableStructureMap_Rule another) {
    return java.util.Objects.equals(extension, another.extension)
        && source.equals(another.source)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(rule, another.rule)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(target, another.target)
        && java.util.Objects.equals(documentation, another.documentation)
        && java.util.Objects.equals(dependent, another.dependent);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code source}, {@code modifierExtension}, {@code name}, {@code rule}, {@code id}, {@code target}, {@code documentation}, {@code dependent}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + source.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(rule);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(target);
    h += (h << 5) + java.util.Objects.hashCode(documentation);
    h += (h << 5) + java.util.Objects.hashCode(dependent);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureMap_Rule} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("StructureMap_Rule{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("source=").append(source);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (rule != null) {
      builder.append(", ");
      builder.append("rule=").append(rule);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (target != null) {
      builder.append(", ");
      builder.append("target=").append(target);
    }
    if (documentation != null) {
      builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (dependent != null) {
      builder.append(", ");
      builder.append("dependent=").append(dependent);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "StructureMap_Rule", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.StructureMap_Rule {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Source> source = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.StructureMap_Rule>> rule = java.util.Optional.empty();
    boolean ruleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.StructureMap_Target>> target = java.util.Optional.empty();
    boolean targetIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> documentation = java.util.Optional.empty();
    boolean documentationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.StructureMap_Dependent>> dependent = java.util.Optional.empty();
    boolean dependentIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public void setSource(java.util.List<com.fhir.StructureMap_Source> source) {
      this.source = source;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<com.fhir.id> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("rule")
    public void setRule(java.util.Optional<java.util.List<com.fhir.StructureMap_Rule>> rule) {
      this.rule = rule;
      this.ruleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    public void setTarget(java.util.Optional<java.util.List<com.fhir.StructureMap_Target>> target) {
      this.target = target;
      this.targetIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public void setDocumentation(java.util.Optional<java.lang.String> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dependent")
    public void setDependent(java.util.Optional<java.util.List<com.fhir.StructureMap_Dependent>> dependent) {
      this.dependent = dependent;
      this.dependentIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.StructureMap_Source> source() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.StructureMap_Rule>> rule() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.StructureMap_Target>> target() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.StructureMap_Dependent>> dependent() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableStructureMap_Rule fromJson(Json json) {
    ImmutableStructureMap_Rule.Builder builder = ImmutableStructureMap_Rule.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.source != null) {
      builder.addAllSource(json.source);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.ruleIsSet) {
      builder.rule(json.rule);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.dependentIsSet) {
      builder.dependent(json.dependent);
    }
    return (ImmutableStructureMap_Rule) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StructureMap_Rule} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StructureMap_Rule instance
   */
  public static StructureMap_Rule copyOf(StructureMap_Rule instance) {
    if (instance instanceof ImmutableStructureMap_Rule) {
      return (ImmutableStructureMap_Rule) instance;
    }
    return ImmutableStructureMap_Rule.builder()
        .extension(instance.extension())
        .addAllSource(instance.source())
        .modifierExtension(instance.modifierExtension())
        .name(instance.name())
        .rule(instance.rule())
        .id(instance.id())
        .target(instance.target())
        .documentation(instance.documentation())
        .dependent(instance.dependent())
        .build();
  }

  /**
   * Creates a builder for {@link StructureMap_Rule StructureMap_Rule}.
   * <pre>
   * ImmutableStructureMap_Rule.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link StructureMap_Rule#extension() extension}
   *    .addSource|addAllSource(com.fhir.StructureMap_Source) // {@link StructureMap_Rule#source() source} elements
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link StructureMap_Rule#modifierExtension() modifierExtension}
   *    .name(com.fhir.id) // optional {@link StructureMap_Rule#name() name}
   *    .rule(List&amp;lt;com.fhir.StructureMap_Rule&amp;gt;) // optional {@link StructureMap_Rule#rule() rule}
   *    .id(String) // optional {@link StructureMap_Rule#id() id}
   *    .target(List&amp;lt;com.fhir.StructureMap_Target&amp;gt;) // optional {@link StructureMap_Rule#target() target}
   *    .documentation(String) // optional {@link StructureMap_Rule#documentation() documentation}
   *    .dependent(List&amp;lt;com.fhir.StructureMap_Dependent&amp;gt;) // optional {@link StructureMap_Rule#dependent() dependent}
   *    .build();
   * </pre>
   * @return A new StructureMap_Rule builder
   */
  public static ImmutableStructureMap_Rule.Builder builder() {
    return new ImmutableStructureMap_Rule.Builder();
  }

  /**
   * Builds instances of type {@link StructureMap_Rule StructureMap_Rule}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "StructureMap_Rule", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_NAME = 0x4L;
    private static final long OPT_BIT_RULE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_TARGET = 0x20L;
    private static final long OPT_BIT_DOCUMENTATION = 0x40L;
    private static final long OPT_BIT_DEPENDENT = 0x80L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private final java.util.List<com.fhir.StructureMap_Source> source = new java.util.ArrayList<com.fhir.StructureMap_Source>();
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.id name;
    private @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Rule> rule;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Target> target;
    private @javax.annotation.Nullable java.lang.String documentation;
    private @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Dependent> dependent;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Rule#extension() extension} to extension.
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
     * Adds one element to {@link StructureMap_Rule#source() source} list.
     * @param element A source element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSource(com.fhir.StructureMap_Source element) {
      this.source.add(java.util.Objects.requireNonNull(element, "source element"));
      return this;
    }

    /**
     * Adds elements to {@link StructureMap_Rule#source() source} list.
     * @param elements An array of source elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSource(com.fhir.StructureMap_Source... elements) {
      for (com.fhir.StructureMap_Source element : elements) {
        this.source.add(java.util.Objects.requireNonNull(element, "source element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link StructureMap_Rule#source() source} list.
     * @param elements An iterable of source elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllSource(Iterable<? extends com.fhir.StructureMap_Source> elements) {
      for (com.fhir.StructureMap_Source element : elements) {
        this.source.add(java.util.Objects.requireNonNull(element, "source element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Rule#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Rule#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(com.fhir.id name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<? extends com.fhir.id> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#rule() rule} to rule.
     * @param rule The value for rule
     * @return {@code this} builder for chained invocation
     */
    public final Builder rule(java.util.List<com.fhir.StructureMap_Rule> rule) {
      checkNotIsSet(ruleIsSet(), "rule");
      this.rule = java.util.Objects.requireNonNull(rule, "rule");
      optBits |= OPT_BIT_RULE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#rule() rule} to rule.
     * @param rule The value for rule
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rule")
    public final Builder rule(java.util.Optional<? extends java.util.List<com.fhir.StructureMap_Rule>> rule) {
      checkNotIsSet(ruleIsSet(), "rule");
      this.rule = rule.orElse(null);
      optBits |= OPT_BIT_RULE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Rule#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Rule#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(java.util.List<com.fhir.StructureMap_Target> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = java.util.Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    public final Builder target(java.util.Optional<? extends java.util.List<com.fhir.StructureMap_Target>> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#documentation() documentation} to documentation.
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
     * Initializes the optional value {@link StructureMap_Rule#documentation() documentation} to documentation.
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
     * Initializes the optional value {@link StructureMap_Rule#dependent() dependent} to dependent.
     * @param dependent The value for dependent
     * @return {@code this} builder for chained invocation
     */
    public final Builder dependent(java.util.List<com.fhir.StructureMap_Dependent> dependent) {
      checkNotIsSet(dependentIsSet(), "dependent");
      this.dependent = java.util.Objects.requireNonNull(dependent, "dependent");
      optBits |= OPT_BIT_DEPENDENT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#dependent() dependent} to dependent.
     * @param dependent The value for dependent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dependent")
    public final Builder dependent(java.util.Optional<? extends java.util.List<com.fhir.StructureMap_Dependent>> dependent) {
      checkNotIsSet(dependentIsSet(), "dependent");
      this.dependent = dependent.orElse(null);
      optBits |= OPT_BIT_DEPENDENT;
      return this;
    }

    /**
     * Builds a new {@link StructureMap_Rule StructureMap_Rule}.
     * @return An immutable instance of StructureMap_Rule
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.StructureMap_Rule build() {
      return new ImmutableStructureMap_Rule(
          extension,
          createUnmodifiableList(true, source),
          modifierExtension,
          name,
          rule,
          id,
          target,
          documentation,
          dependent);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean ruleIsSet() {
      return (optBits & OPT_BIT_RULE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean dependentIsSet() {
      return (optBits & OPT_BIT_DEPENDENT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of StructureMap_Rule is strict, attribute is already set: ".concat(name));
    }
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    java.util.ArrayList<T> list;
    if (iterable instanceof java.util.Collection<?>) {
      int size = ((java.util.Collection<?>) iterable).size();
      if (size == 0) return java.util.Collections.emptyList();
      list = new java.util.ArrayList<>();
    } else {
      list = new java.util.ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) java.util.Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return java.util.Collections.emptyList();
    case 1: return java.util.Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList<>(list));
      } else {
        if (list instanceof java.util.ArrayList<?>) {
          ((java.util.ArrayList<?>) list).trimToSize();
        }
        return java.util.Collections.unmodifiableList(list);
      }
    }
  }
}
