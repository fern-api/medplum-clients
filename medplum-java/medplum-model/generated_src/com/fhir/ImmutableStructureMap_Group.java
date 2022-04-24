//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link StructureMap_Group}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureMap_Group.builder()}.
 */
@org.immutables.value.Generated(from = "StructureMap_Group", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureMap_Group implements com.fhir.StructureMap_Group {
  private final @javax.annotation.Nullable com.fhir.id _extends;
  private final @javax.annotation.Nullable java.lang.String documentation;
  private final java.util.List<com.fhir.StructureMap_Input> input;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.id name;
  private final @javax.annotation.Nullable com.fhir.Structuremap_groupTypemode typeMode;
  private final java.util.List<com.fhir.StructureMap_Rule> rule;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

  private ImmutableStructureMap_Group(
      @javax.annotation.Nullable com.fhir.id _extends,
      @javax.annotation.Nullable java.lang.String documentation,
      java.util.List<com.fhir.StructureMap_Input> input,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.id name,
      @javax.annotation.Nullable com.fhir.Structuremap_groupTypemode typeMode,
      java.util.List<com.fhir.StructureMap_Rule> rule,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension) {
    this._extends = _extends;
    this.documentation = documentation;
    this.input = input;
    this.modifierExtension = modifierExtension;
    this.name = name;
    this.typeMode = typeMode;
    this.rule = rule;
    this.id = id;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code _extends} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extends")
  @Override
  public java.util.Optional<com.fhir.id> _extends() {
    return java.util.Optional.ofNullable(_extends);
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
   * @return The value of the {@code input} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("input")
  @Override
  public java.util.List<com.fhir.StructureMap_Input> input() {
    return input;
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
   * @return The value of the {@code typeMode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("typeMode")
  @Override
  public java.util.Optional<com.fhir.Structuremap_groupTypemode> typeMode() {
    return java.util.Optional.ofNullable(typeMode);
  }

  /**
   * @return The value of the {@code rule} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("rule")
  @Override
  public java.util.List<com.fhir.StructureMap_Rule> rule() {
    return rule;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Group#_extends() _extends} attribute.
   * @param value The value for _extends
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group with_extends(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "_extends");
    if (this._extends == newValue) return this;
    return new ImmutableStructureMap_Group(
        newValue,
        this.documentation,
        this.input,
        this.modifierExtension,
        this.name,
        this.typeMode,
        this.rule,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Group#_extends() _extends} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _extends
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Group with_extends(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this._extends == value) return this;
    return new ImmutableStructureMap_Group(
        value,
        this.documentation,
        this.input,
        this.modifierExtension,
        this.name,
        this.typeMode,
        this.rule,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Group#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withDocumentation(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "documentation");
    if (java.util.Objects.equals(this.documentation, newValue)) return this;
    return new ImmutableStructureMap_Group(
        this._extends,
        newValue,
        this.input,
        this.modifierExtension,
        this.name,
        this.typeMode,
        this.rule,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Group#documentation() documentation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withDocumentation(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.documentation, value)) return this;
    return new ImmutableStructureMap_Group(
        this._extends,
        value,
        this.input,
        this.modifierExtension,
        this.name,
        this.typeMode,
        this.rule,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureMap_Group#input() input}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withInput(com.fhir.StructureMap_Input... elements) {
    java.util.List<com.fhir.StructureMap_Input> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableStructureMap_Group(
        this._extends,
        this.documentation,
        newValue,
        this.modifierExtension,
        this.name,
        this.typeMode,
        this.rule,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureMap_Group#input() input}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of input elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withInput(Iterable<? extends com.fhir.StructureMap_Input> elements) {
    if (this.input == elements) return this;
    java.util.List<com.fhir.StructureMap_Input> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableStructureMap_Group(
        this._extends,
        this.documentation,
        newValue,
        this.modifierExtension,
        this.name,
        this.typeMode,
        this.rule,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Group#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureMap_Group(
        this._extends,
        this.documentation,
        this.input,
        newValue,
        this.name,
        this.typeMode,
        this.rule,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Group#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Group withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureMap_Group(
        this._extends,
        this.documentation,
        this.input,
        value,
        this.name,
        this.typeMode,
        this.rule,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Group#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withName(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutableStructureMap_Group(
        this._extends,
        this.documentation,
        this.input,
        this.modifierExtension,
        newValue,
        this.typeMode,
        this.rule,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Group#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Group withName(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutableStructureMap_Group(
        this._extends,
        this.documentation,
        this.input,
        this.modifierExtension,
        value,
        this.typeMode,
        this.rule,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Group#typeMode() typeMode} attribute.
   * @param value The value for typeMode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withTypeMode(com.fhir.Structuremap_groupTypemode value) {
    @javax.annotation.Nullable com.fhir.Structuremap_groupTypemode newValue = java.util.Objects.requireNonNull(value, "typeMode");
    if (this.typeMode == newValue) return this;
    return new ImmutableStructureMap_Group(
        this._extends,
        this.documentation,
        this.input,
        this.modifierExtension,
        this.name,
        newValue,
        this.rule,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Group#typeMode() typeMode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for typeMode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Group withTypeMode(java.util.Optional<? extends com.fhir.Structuremap_groupTypemode> optional) {
    @javax.annotation.Nullable com.fhir.Structuremap_groupTypemode value = optional.orElse(null);
    if (this.typeMode == value) return this;
    return new ImmutableStructureMap_Group(
        this._extends,
        this.documentation,
        this.input,
        this.modifierExtension,
        this.name,
        value,
        this.rule,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureMap_Group#rule() rule}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withRule(com.fhir.StructureMap_Rule... elements) {
    java.util.List<com.fhir.StructureMap_Rule> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableStructureMap_Group(
        this._extends,
        this.documentation,
        this.input,
        this.modifierExtension,
        this.name,
        this.typeMode,
        newValue,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureMap_Group#rule() rule}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of rule elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withRule(Iterable<? extends com.fhir.StructureMap_Rule> elements) {
    if (this.rule == elements) return this;
    java.util.List<com.fhir.StructureMap_Rule> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableStructureMap_Group(
        this._extends,
        this.documentation,
        this.input,
        this.modifierExtension,
        this.name,
        this.typeMode,
        newValue,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Group#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableStructureMap_Group(
        this._extends,
        this.documentation,
        this.input,
        this.modifierExtension,
        this.name,
        this.typeMode,
        this.rule,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Group#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableStructureMap_Group(
        this._extends,
        this.documentation,
        this.input,
        this.modifierExtension,
        this.name,
        this.typeMode,
        this.rule,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Group#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureMap_Group(
        this._extends,
        this.documentation,
        this.input,
        this.modifierExtension,
        this.name,
        this.typeMode,
        this.rule,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Group#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Group withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureMap_Group(
        this._extends,
        this.documentation,
        this.input,
        this.modifierExtension,
        this.name,
        this.typeMode,
        this.rule,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureMap_Group} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureMap_Group
        && equalTo((ImmutableStructureMap_Group) another);
  }

  private boolean equalTo(ImmutableStructureMap_Group another) {
    return java.util.Objects.equals(_extends, another._extends)
        && java.util.Objects.equals(documentation, another.documentation)
        && input.equals(another.input)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(typeMode, another.typeMode)
        && rule.equals(another.rule)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code _extends}, {@code documentation}, {@code input}, {@code modifierExtension}, {@code name}, {@code typeMode}, {@code rule}, {@code id}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(_extends);
    h += (h << 5) + java.util.Objects.hashCode(documentation);
    h += (h << 5) + input.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(typeMode);
    h += (h << 5) + rule.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureMap_Group} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("StructureMap_Group{");
    if (_extends != null) {
      builder.append("_extends=").append(_extends);
    }
    if (documentation != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("input=").append(input);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (typeMode != null) {
      builder.append(", ");
      builder.append("typeMode=").append(typeMode);
    }
    builder.append(", ");
    builder.append("rule=").append(rule);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "StructureMap_Group", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.StructureMap_Group {
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> _extends = java.util.Optional.empty();
    boolean _extendsIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> documentation = java.util.Optional.empty();
    boolean documentationIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Input> input = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Structuremap_groupTypemode> typeMode = java.util.Optional.empty();
    boolean typeModeIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Rule> rule = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extends")
    public void set_extends(java.util.Optional<com.fhir.id> _extends) {
      this._extends = _extends;
      this._extendsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public void setDocumentation(java.util.Optional<java.lang.String> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("input")
    public void setInput(java.util.List<com.fhir.StructureMap_Input> input) {
      this.input = input;
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
    @com.fasterxml.jackson.annotation.JsonProperty("typeMode")
    public void setTypeMode(java.util.Optional<com.fhir.Structuremap_groupTypemode> typeMode) {
      this.typeMode = typeMode;
      this.typeModeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("rule")
    public void setRule(java.util.List<com.fhir.StructureMap_Rule> rule) {
      this.rule = rule;
    }
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
    @Override
    public java.util.Optional<com.fhir.id> _extends() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.StructureMap_Input> input() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Structuremap_groupTypemode> typeMode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.StructureMap_Rule> rule() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
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
  static ImmutableStructureMap_Group fromJson(Json json) {
    ImmutableStructureMap_Group.Builder builder = ImmutableStructureMap_Group.builder();
    if (json._extendsIsSet) {
      builder._extends(json._extends);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.input != null) {
      builder.addAllInput(json.input);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.typeModeIsSet) {
      builder.typeMode(json.typeMode);
    }
    if (json.rule != null) {
      builder.addAllRule(json.rule);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableStructureMap_Group) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StructureMap_Group} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StructureMap_Group instance
   */
  public static StructureMap_Group copyOf(StructureMap_Group instance) {
    if (instance instanceof ImmutableStructureMap_Group) {
      return (ImmutableStructureMap_Group) instance;
    }
    return ImmutableStructureMap_Group.builder()
        ._extends(instance._extends())
        .documentation(instance.documentation())
        .addAllInput(instance.input())
        .modifierExtension(instance.modifierExtension())
        .name(instance.name())
        .typeMode(instance.typeMode())
        .addAllRule(instance.rule())
        .id(instance.id())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link StructureMap_Group StructureMap_Group}.
   * <pre>
   * ImmutableStructureMap_Group.builder()
   *    ._extends(com.fhir.id) // optional {@link StructureMap_Group#_extends() _extends}
   *    .documentation(String) // optional {@link StructureMap_Group#documentation() documentation}
   *    .addInput|addAllInput(com.fhir.StructureMap_Input) // {@link StructureMap_Group#input() input} elements
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link StructureMap_Group#modifierExtension() modifierExtension}
   *    .name(com.fhir.id) // optional {@link StructureMap_Group#name() name}
   *    .typeMode(com.fhir.Structuremap_groupTypemode) // optional {@link StructureMap_Group#typeMode() typeMode}
   *    .addRule|addAllRule(com.fhir.StructureMap_Rule) // {@link StructureMap_Group#rule() rule} elements
   *    .id(String) // optional {@link StructureMap_Group#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link StructureMap_Group#extension() extension}
   *    .build();
   * </pre>
   * @return A new StructureMap_Group builder
   */
  public static ImmutableStructureMap_Group.Builder builder() {
    return new ImmutableStructureMap_Group.Builder();
  }

  /**
   * Builds instances of type {@link StructureMap_Group StructureMap_Group}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "StructureMap_Group", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT__EXTENDS = 0x1L;
    private static final long OPT_BIT_DOCUMENTATION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_NAME = 0x8L;
    private static final long OPT_BIT_TYPE_MODE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.id _extends;
    private @javax.annotation.Nullable java.lang.String documentation;
    private final java.util.List<com.fhir.StructureMap_Input> input = new java.util.ArrayList<com.fhir.StructureMap_Input>();
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.id name;
    private @javax.annotation.Nullable com.fhir.Structuremap_groupTypemode typeMode;
    private final java.util.List<com.fhir.StructureMap_Rule> rule = new java.util.ArrayList<com.fhir.StructureMap_Rule>();
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureMap_Group#_extends() _extends} to _extends.
     * @param _extends The value for _extends
     * @return {@code this} builder for chained invocation
     */
    public final Builder _extends(com.fhir.id _extends) {
      checkNotIsSet(_extendsIsSet(), "_extends");
      this._extends = java.util.Objects.requireNonNull(_extends, "_extends");
      optBits |= OPT_BIT__EXTENDS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Group#_extends() _extends} to _extends.
     * @param _extends The value for _extends
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extends")
    public final Builder _extends(java.util.Optional<? extends com.fhir.id> _extends) {
      checkNotIsSet(_extendsIsSet(), "_extends");
      this._extends = _extends.orElse(null);
      optBits |= OPT_BIT__EXTENDS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Group#documentation() documentation} to documentation.
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
     * Initializes the optional value {@link StructureMap_Group#documentation() documentation} to documentation.
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
     * Adds one element to {@link StructureMap_Group#input() input} list.
     * @param element A input element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInput(com.fhir.StructureMap_Input element) {
      this.input.add(java.util.Objects.requireNonNull(element, "input element"));
      return this;
    }

    /**
     * Adds elements to {@link StructureMap_Group#input() input} list.
     * @param elements An array of input elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInput(com.fhir.StructureMap_Input... elements) {
      for (com.fhir.StructureMap_Input element : elements) {
        this.input.add(java.util.Objects.requireNonNull(element, "input element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link StructureMap_Group#input() input} list.
     * @param elements An iterable of input elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllInput(Iterable<? extends com.fhir.StructureMap_Input> elements) {
      for (com.fhir.StructureMap_Input element : elements) {
        this.input.add(java.util.Objects.requireNonNull(element, "input element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Group#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Group#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Group#name() name} to name.
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
     * Initializes the optional value {@link StructureMap_Group#name() name} to name.
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
     * Initializes the optional value {@link StructureMap_Group#typeMode() typeMode} to typeMode.
     * @param typeMode The value for typeMode
     * @return {@code this} builder for chained invocation
     */
    public final Builder typeMode(com.fhir.Structuremap_groupTypemode typeMode) {
      checkNotIsSet(typeModeIsSet(), "typeMode");
      this.typeMode = java.util.Objects.requireNonNull(typeMode, "typeMode");
      optBits |= OPT_BIT_TYPE_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Group#typeMode() typeMode} to typeMode.
     * @param typeMode The value for typeMode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("typeMode")
    public final Builder typeMode(java.util.Optional<? extends com.fhir.Structuremap_groupTypemode> typeMode) {
      checkNotIsSet(typeModeIsSet(), "typeMode");
      this.typeMode = typeMode.orElse(null);
      optBits |= OPT_BIT_TYPE_MODE;
      return this;
    }

    /**
     * Adds one element to {@link StructureMap_Group#rule() rule} list.
     * @param element A rule element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRule(com.fhir.StructureMap_Rule element) {
      this.rule.add(java.util.Objects.requireNonNull(element, "rule element"));
      return this;
    }

    /**
     * Adds elements to {@link StructureMap_Group#rule() rule} list.
     * @param elements An array of rule elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRule(com.fhir.StructureMap_Rule... elements) {
      for (com.fhir.StructureMap_Rule element : elements) {
        this.rule.add(java.util.Objects.requireNonNull(element, "rule element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link StructureMap_Group#rule() rule} list.
     * @param elements An iterable of rule elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRule(Iterable<? extends com.fhir.StructureMap_Rule> elements) {
      for (com.fhir.StructureMap_Rule element : elements) {
        this.rule.add(java.util.Objects.requireNonNull(element, "rule element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Group#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Group#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Group#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Group#extension() extension} to extension.
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
     * Builds a new {@link StructureMap_Group StructureMap_Group}.
     * @return An immutable instance of StructureMap_Group
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.StructureMap_Group build() {
      return new ImmutableStructureMap_Group(
          _extends,
          documentation,
          createUnmodifiableList(true, input),
          modifierExtension,
          name,
          typeMode,
          createUnmodifiableList(true, rule),
          id,
          extension);
    }

    private boolean _extendsIsSet() {
      return (optBits & OPT_BIT__EXTENDS) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean typeModeIsSet() {
      return (optBits & OPT_BIT_TYPE_MODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of StructureMap_Group is strict, attribute is already set: ".concat(name));
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
