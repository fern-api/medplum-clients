//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link OperationDefinition_Parameter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOperationDefinition_Parameter.builder()}.
 */
@org.immutables.value.Generated(from = "OperationDefinition_Parameter", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableOperationDefinition_Parameter implements com.fhir.OperationDefinition_Parameter {
  private final @javax.annotation.Nullable com.fhir.code name;
  private final @javax.annotation.Nullable com.fhir.OperationDefinition_Binding binding;
  private final @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_ReferencedFrom> referencedFrom;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.code type;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.Operationdefinition_parameterUse use;
  private final @javax.annotation.Nullable java.lang.String max;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> targetProfile;
  private final @javax.annotation.Nullable java.lang.String documentation;
  private final @javax.annotation.Nullable com.fhir.Operationdefinition_parameterSearchtype searchType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_Parameter> part;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.Integer min;

  private ImmutableOperationDefinition_Parameter(
      @javax.annotation.Nullable com.fhir.code name,
      @javax.annotation.Nullable com.fhir.OperationDefinition_Binding binding,
      @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_ReferencedFrom> referencedFrom,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.code type,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.Operationdefinition_parameterUse use,
      @javax.annotation.Nullable java.lang.String max,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> targetProfile,
      @javax.annotation.Nullable java.lang.String documentation,
      @javax.annotation.Nullable com.fhir.Operationdefinition_parameterSearchtype searchType,
      @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_Parameter> part,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.Integer min) {
    this.name = name;
    this.binding = binding;
    this.referencedFrom = referencedFrom;
    this.modifierExtension = modifierExtension;
    this.type = type;
    this.id = id;
    this.use = use;
    this.max = max;
    this.targetProfile = targetProfile;
    this.documentation = documentation;
    this.searchType = searchType;
    this.part = part;
    this.extension = extension;
    this.min = min;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<com.fhir.code> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code binding} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("binding")
  @Override
  public java.util.Optional<com.fhir.OperationDefinition_Binding> binding() {
    return java.util.Optional.ofNullable(binding);
  }

  /**
   * @return The value of the {@code referencedFrom} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("referencedFrom")
  @Override
  public java.util.Optional<java.util.List<com.fhir.OperationDefinition_ReferencedFrom>> referencedFrom() {
    return java.util.Optional.ofNullable(referencedFrom);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.code> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code use} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("use")
  @Override
  public java.util.Optional<com.fhir.Operationdefinition_parameterUse> use() {
    return java.util.Optional.ofNullable(use);
  }

  /**
   * @return The value of the {@code max} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("max")
  @Override
  public java.util.Optional<java.lang.String> max() {
    return java.util.Optional.ofNullable(max);
  }

  /**
   * @return The value of the {@code targetProfile} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("targetProfile")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> targetProfile() {
    return java.util.Optional.ofNullable(targetProfile);
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
   * @return The value of the {@code searchType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("searchType")
  @Override
  public java.util.Optional<com.fhir.Operationdefinition_parameterSearchtype> searchType() {
    return java.util.Optional.ofNullable(searchType);
  }

  /**
   * @return The value of the {@code part} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("part")
  @Override
  public java.util.Optional<java.util.List<com.fhir.OperationDefinition_Parameter>> part() {
    return java.util.Optional.ofNullable(part);
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
   * @return The value of the {@code min} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("min")
  @Override
  public java.util.Optional<java.lang.Integer> min() {
    return java.util.Optional.ofNullable(min);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withName(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        newValue,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withName(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        value,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#binding() binding} attribute.
   * @param value The value for binding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withBinding(com.fhir.OperationDefinition_Binding value) {
    @javax.annotation.Nullable com.fhir.OperationDefinition_Binding newValue = java.util.Objects.requireNonNull(value, "binding");
    if (this.binding == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        newValue,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#binding() binding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for binding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withBinding(java.util.Optional<? extends com.fhir.OperationDefinition_Binding> optional) {
    @javax.annotation.Nullable com.fhir.OperationDefinition_Binding value = optional.orElse(null);
    if (this.binding == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        value,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#referencedFrom() referencedFrom} attribute.
   * @param value The value for referencedFrom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withReferencedFrom(java.util.List<com.fhir.OperationDefinition_ReferencedFrom> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_ReferencedFrom> newValue = java.util.Objects.requireNonNull(value, "referencedFrom");
    if (this.referencedFrom == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        newValue,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#referencedFrom() referencedFrom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referencedFrom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withReferencedFrom(java.util.Optional<? extends java.util.List<com.fhir.OperationDefinition_ReferencedFrom>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_ReferencedFrom> value = optional.orElse(null);
    if (this.referencedFrom == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        value,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        newValue,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        value,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withType(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        newValue,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withType(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        value,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        newValue,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        value,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withUse(com.fhir.Operationdefinition_parameterUse value) {
    @javax.annotation.Nullable com.fhir.Operationdefinition_parameterUse newValue = java.util.Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        newValue,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withUse(java.util.Optional<? extends com.fhir.Operationdefinition_parameterUse> optional) {
    @javax.annotation.Nullable com.fhir.Operationdefinition_parameterUse value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        value,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#max() max} attribute.
   * @param value The value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withMax(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "max");
    if (java.util.Objects.equals(this.max, newValue)) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        newValue,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#max() max} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withMax(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.max, value)) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        value,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#targetProfile() targetProfile} attribute.
   * @param value The value for targetProfile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withTargetProfile(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "targetProfile");
    if (this.targetProfile == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        newValue,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#targetProfile() targetProfile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetProfile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withTargetProfile(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.targetProfile == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        value,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withDocumentation(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "documentation");
    if (java.util.Objects.equals(this.documentation, newValue)) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        newValue,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#documentation() documentation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withDocumentation(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.documentation, value)) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        value,
        this.searchType,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#searchType() searchType} attribute.
   * @param value The value for searchType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withSearchType(com.fhir.Operationdefinition_parameterSearchtype value) {
    @javax.annotation.Nullable com.fhir.Operationdefinition_parameterSearchtype newValue = java.util.Objects.requireNonNull(value, "searchType");
    if (this.searchType == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        newValue,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#searchType() searchType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for searchType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withSearchType(java.util.Optional<? extends com.fhir.Operationdefinition_parameterSearchtype> optional) {
    @javax.annotation.Nullable com.fhir.Operationdefinition_parameterSearchtype value = optional.orElse(null);
    if (this.searchType == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        value,
        this.part,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#part() part} attribute.
   * @param value The value for part
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withPart(java.util.List<com.fhir.OperationDefinition_Parameter> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_Parameter> newValue = java.util.Objects.requireNonNull(value, "part");
    if (this.part == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        newValue,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#part() part} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for part
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withPart(java.util.Optional<? extends java.util.List<com.fhir.OperationDefinition_Parameter>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_Parameter> value = optional.orElse(null);
    if (this.part == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        value,
        this.extension,
        this.min);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        newValue,
        this.min);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        value,
        this.min);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#min() min} attribute.
   * @param value The value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withMin(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.min, newValue)) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#min() min} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withMin(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.min, value)) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.name,
        this.binding,
        this.referencedFrom,
        this.modifierExtension,
        this.type,
        this.id,
        this.use,
        this.max,
        this.targetProfile,
        this.documentation,
        this.searchType,
        this.part,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOperationDefinition_Parameter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOperationDefinition_Parameter
        && equalTo((ImmutableOperationDefinition_Parameter) another);
  }

  private boolean equalTo(ImmutableOperationDefinition_Parameter another) {
    return java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(binding, another.binding)
        && java.util.Objects.equals(referencedFrom, another.referencedFrom)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(use, another.use)
        && java.util.Objects.equals(max, another.max)
        && java.util.Objects.equals(targetProfile, another.targetProfile)
        && java.util.Objects.equals(documentation, another.documentation)
        && java.util.Objects.equals(searchType, another.searchType)
        && java.util.Objects.equals(part, another.part)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(min, another.min);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code binding}, {@code referencedFrom}, {@code modifierExtension}, {@code type}, {@code id}, {@code use}, {@code max}, {@code targetProfile}, {@code documentation}, {@code searchType}, {@code part}, {@code extension}, {@code min}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(binding);
    h += (h << 5) + java.util.Objects.hashCode(referencedFrom);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(use);
    h += (h << 5) + java.util.Objects.hashCode(max);
    h += (h << 5) + java.util.Objects.hashCode(targetProfile);
    h += (h << 5) + java.util.Objects.hashCode(documentation);
    h += (h << 5) + java.util.Objects.hashCode(searchType);
    h += (h << 5) + java.util.Objects.hashCode(part);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(min);
    return h;
  }

  /**
   * Prints the immutable value {@code OperationDefinition_Parameter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("OperationDefinition_Parameter{");
    if (name != null) {
      builder.append("name=").append(name);
    }
    if (binding != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("binding=").append(binding);
    }
    if (referencedFrom != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("referencedFrom=").append(referencedFrom);
    }
    if (modifierExtension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (type != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (id != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (use != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("use=").append(use);
    }
    if (max != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("max=").append(max);
    }
    if (targetProfile != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("targetProfile=").append(targetProfile);
    }
    if (documentation != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (searchType != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("searchType=").append(searchType);
    }
    if (part != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("part=").append(part);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (min != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("min=").append(min);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "OperationDefinition_Parameter", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.OperationDefinition_Parameter {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.OperationDefinition_Binding> binding = java.util.Optional.empty();
    boolean bindingIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.OperationDefinition_ReferencedFrom>> referencedFrom = java.util.Optional.empty();
    boolean referencedFromIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Operationdefinition_parameterUse> use = java.util.Optional.empty();
    boolean useIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> max = java.util.Optional.empty();
    boolean maxIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> targetProfile = java.util.Optional.empty();
    boolean targetProfileIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> documentation = java.util.Optional.empty();
    boolean documentationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Operationdefinition_parameterSearchtype> searchType = java.util.Optional.empty();
    boolean searchTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.OperationDefinition_Parameter>> part = java.util.Optional.empty();
    boolean partIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> min = java.util.Optional.empty();
    boolean minIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<com.fhir.code> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("binding")
    public void setBinding(java.util.Optional<com.fhir.OperationDefinition_Binding> binding) {
      this.binding = binding;
      this.bindingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("referencedFrom")
    public void setReferencedFrom(java.util.Optional<java.util.List<com.fhir.OperationDefinition_ReferencedFrom>> referencedFrom) {
      this.referencedFrom = referencedFrom;
      this.referencedFromIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.code> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public void setUse(java.util.Optional<com.fhir.Operationdefinition_parameterUse> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    public void setMax(java.util.Optional<java.lang.String> max) {
      this.max = max;
      this.maxIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("targetProfile")
    public void setTargetProfile(java.util.Optional<java.util.List<com.fhir.canonical>> targetProfile) {
      this.targetProfile = targetProfile;
      this.targetProfileIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public void setDocumentation(java.util.Optional<java.lang.String> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("searchType")
    public void setSearchType(java.util.Optional<com.fhir.Operationdefinition_parameterSearchtype> searchType) {
      this.searchType = searchType;
      this.searchTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("part")
    public void setPart(java.util.Optional<java.util.List<com.fhir.OperationDefinition_Parameter>> part) {
      this.part = part;
      this.partIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    public void setMin(java.util.Optional<java.lang.Integer> min) {
      this.min = min;
      this.minIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.code> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.OperationDefinition_Binding> binding() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.OperationDefinition_ReferencedFrom>> referencedFrom() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Operationdefinition_parameterUse> use() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> max() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> targetProfile() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Operationdefinition_parameterSearchtype> searchType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.OperationDefinition_Parameter>> part() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> min() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableOperationDefinition_Parameter fromJson(Json json) {
    ImmutableOperationDefinition_Parameter.Builder builder = ImmutableOperationDefinition_Parameter.builder();
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.bindingIsSet) {
      builder.binding(json.binding);
    }
    if (json.referencedFromIsSet) {
      builder.referencedFrom(json.referencedFrom);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.maxIsSet) {
      builder.max(json.max);
    }
    if (json.targetProfileIsSet) {
      builder.targetProfile(json.targetProfile);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.searchTypeIsSet) {
      builder.searchType(json.searchType);
    }
    if (json.partIsSet) {
      builder.part(json.part);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.minIsSet) {
      builder.min(json.min);
    }
    return (ImmutableOperationDefinition_Parameter) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link OperationDefinition_Parameter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OperationDefinition_Parameter instance
   */
  public static OperationDefinition_Parameter copyOf(OperationDefinition_Parameter instance) {
    if (instance instanceof ImmutableOperationDefinition_Parameter) {
      return (ImmutableOperationDefinition_Parameter) instance;
    }
    return ImmutableOperationDefinition_Parameter.builder()
        .name(instance.name())
        .binding(instance.binding())
        .referencedFrom(instance.referencedFrom())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .id(instance.id())
        .use(instance.use())
        .max(instance.max())
        .targetProfile(instance.targetProfile())
        .documentation(instance.documentation())
        .searchType(instance.searchType())
        .part(instance.part())
        .extension(instance.extension())
        .min(instance.min())
        .build();
  }

  /**
   * Creates a builder for {@link OperationDefinition_Parameter OperationDefinition_Parameter}.
   * <pre>
   * ImmutableOperationDefinition_Parameter.builder()
   *    .name(com.fhir.code) // optional {@link OperationDefinition_Parameter#name() name}
   *    .binding(com.fhir.OperationDefinition_Binding) // optional {@link OperationDefinition_Parameter#binding() binding}
   *    .referencedFrom(List&amp;lt;com.fhir.OperationDefinition_ReferencedFrom&amp;gt;) // optional {@link OperationDefinition_Parameter#referencedFrom() referencedFrom}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link OperationDefinition_Parameter#modifierExtension() modifierExtension}
   *    .type(com.fhir.code) // optional {@link OperationDefinition_Parameter#type() type}
   *    .id(String) // optional {@link OperationDefinition_Parameter#id() id}
   *    .use(com.fhir.Operationdefinition_parameterUse) // optional {@link OperationDefinition_Parameter#use() use}
   *    .max(String) // optional {@link OperationDefinition_Parameter#max() max}
   *    .targetProfile(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link OperationDefinition_Parameter#targetProfile() targetProfile}
   *    .documentation(String) // optional {@link OperationDefinition_Parameter#documentation() documentation}
   *    .searchType(com.fhir.Operationdefinition_parameterSearchtype) // optional {@link OperationDefinition_Parameter#searchType() searchType}
   *    .part(List&amp;lt;com.fhir.OperationDefinition_Parameter&amp;gt;) // optional {@link OperationDefinition_Parameter#part() part}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link OperationDefinition_Parameter#extension() extension}
   *    .min(Integer) // optional {@link OperationDefinition_Parameter#min() min}
   *    .build();
   * </pre>
   * @return A new OperationDefinition_Parameter builder
   */
  public static ImmutableOperationDefinition_Parameter.Builder builder() {
    return new ImmutableOperationDefinition_Parameter.Builder();
  }

  /**
   * Builds instances of type {@link OperationDefinition_Parameter OperationDefinition_Parameter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "OperationDefinition_Parameter", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_NAME = 0x1L;
    private static final long OPT_BIT_BINDING = 0x2L;
    private static final long OPT_BIT_REFERENCED_FROM = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_USE = 0x40L;
    private static final long OPT_BIT_MAX = 0x80L;
    private static final long OPT_BIT_TARGET_PROFILE = 0x100L;
    private static final long OPT_BIT_DOCUMENTATION = 0x200L;
    private static final long OPT_BIT_SEARCH_TYPE = 0x400L;
    private static final long OPT_BIT_PART = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private static final long OPT_BIT_MIN = 0x2000L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code name;
    private @javax.annotation.Nullable com.fhir.OperationDefinition_Binding binding;
    private @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_ReferencedFrom> referencedFrom;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.code type;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.Operationdefinition_parameterUse use;
    private @javax.annotation.Nullable java.lang.String max;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> targetProfile;
    private @javax.annotation.Nullable java.lang.String documentation;
    private @javax.annotation.Nullable com.fhir.Operationdefinition_parameterSearchtype searchType;
    private @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_Parameter> part;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.Integer min;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(com.fhir.code name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<? extends com.fhir.code> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#binding() binding} to binding.
     * @param binding The value for binding
     * @return {@code this} builder for chained invocation
     */
    public final Builder binding(com.fhir.OperationDefinition_Binding binding) {
      checkNotIsSet(bindingIsSet(), "binding");
      this.binding = java.util.Objects.requireNonNull(binding, "binding");
      optBits |= OPT_BIT_BINDING;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#binding() binding} to binding.
     * @param binding The value for binding
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("binding")
    public final Builder binding(java.util.Optional<? extends com.fhir.OperationDefinition_Binding> binding) {
      checkNotIsSet(bindingIsSet(), "binding");
      this.binding = binding.orElse(null);
      optBits |= OPT_BIT_BINDING;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#referencedFrom() referencedFrom} to referencedFrom.
     * @param referencedFrom The value for referencedFrom
     * @return {@code this} builder for chained invocation
     */
    public final Builder referencedFrom(java.util.List<com.fhir.OperationDefinition_ReferencedFrom> referencedFrom) {
      checkNotIsSet(referencedFromIsSet(), "referencedFrom");
      this.referencedFrom = java.util.Objects.requireNonNull(referencedFrom, "referencedFrom");
      optBits |= OPT_BIT_REFERENCED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#referencedFrom() referencedFrom} to referencedFrom.
     * @param referencedFrom The value for referencedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referencedFrom")
    public final Builder referencedFrom(java.util.Optional<? extends java.util.List<com.fhir.OperationDefinition_ReferencedFrom>> referencedFrom) {
      checkNotIsSet(referencedFromIsSet(), "referencedFrom");
      this.referencedFrom = referencedFrom.orElse(null);
      optBits |= OPT_BIT_REFERENCED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.code type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.code> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#id() id} to id.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#id() id} to id.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(com.fhir.Operationdefinition_parameterUse use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = java.util.Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public final Builder use(java.util.Optional<? extends com.fhir.Operationdefinition_parameterUse> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#max() max} to max.
     * @param max The value for max
     * @return {@code this} builder for chained invocation
     */
    public final Builder max(java.lang.String max) {
      checkNotIsSet(maxIsSet(), "max");
      this.max = java.util.Objects.requireNonNull(max, "max");
      optBits |= OPT_BIT_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#max() max} to max.
     * @param max The value for max
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    public final Builder max(java.util.Optional<java.lang.String> max) {
      checkNotIsSet(maxIsSet(), "max");
      this.max = max.orElse(null);
      optBits |= OPT_BIT_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#targetProfile() targetProfile} to targetProfile.
     * @param targetProfile The value for targetProfile
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetProfile(java.util.List<com.fhir.canonical> targetProfile) {
      checkNotIsSet(targetProfileIsSet(), "targetProfile");
      this.targetProfile = java.util.Objects.requireNonNull(targetProfile, "targetProfile");
      optBits |= OPT_BIT_TARGET_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#targetProfile() targetProfile} to targetProfile.
     * @param targetProfile The value for targetProfile
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetProfile")
    public final Builder targetProfile(java.util.Optional<? extends java.util.List<com.fhir.canonical>> targetProfile) {
      checkNotIsSet(targetProfileIsSet(), "targetProfile");
      this.targetProfile = targetProfile.orElse(null);
      optBits |= OPT_BIT_TARGET_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#documentation() documentation} to documentation.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#documentation() documentation} to documentation.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#searchType() searchType} to searchType.
     * @param searchType The value for searchType
     * @return {@code this} builder for chained invocation
     */
    public final Builder searchType(com.fhir.Operationdefinition_parameterSearchtype searchType) {
      checkNotIsSet(searchTypeIsSet(), "searchType");
      this.searchType = java.util.Objects.requireNonNull(searchType, "searchType");
      optBits |= OPT_BIT_SEARCH_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#searchType() searchType} to searchType.
     * @param searchType The value for searchType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("searchType")
    public final Builder searchType(java.util.Optional<? extends com.fhir.Operationdefinition_parameterSearchtype> searchType) {
      checkNotIsSet(searchTypeIsSet(), "searchType");
      this.searchType = searchType.orElse(null);
      optBits |= OPT_BIT_SEARCH_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#part() part} to part.
     * @param part The value for part
     * @return {@code this} builder for chained invocation
     */
    public final Builder part(java.util.List<com.fhir.OperationDefinition_Parameter> part) {
      checkNotIsSet(partIsSet(), "part");
      this.part = java.util.Objects.requireNonNull(part, "part");
      optBits |= OPT_BIT_PART;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#part() part} to part.
     * @param part The value for part
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("part")
    public final Builder part(java.util.Optional<? extends java.util.List<com.fhir.OperationDefinition_Parameter>> part) {
      checkNotIsSet(partIsSet(), "part");
      this.part = part.orElse(null);
      optBits |= OPT_BIT_PART;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#min() min} to min.
     * @param min The value for min
     * @return {@code this} builder for chained invocation
     */
    public final Builder min(int min) {
      checkNotIsSet(minIsSet(), "min");
      this.min = min;
      optBits |= OPT_BIT_MIN;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#min() min} to min.
     * @param min The value for min
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    public final Builder min(java.util.Optional<java.lang.Integer> min) {
      checkNotIsSet(minIsSet(), "min");
      this.min = min.orElse(null);
      optBits |= OPT_BIT_MIN;
      return this;
    }

    /**
     * Builds a new {@link OperationDefinition_Parameter OperationDefinition_Parameter}.
     * @return An immutable instance of OperationDefinition_Parameter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.OperationDefinition_Parameter build() {
      return new ImmutableOperationDefinition_Parameter(
          name,
          binding,
          referencedFrom,
          modifierExtension,
          type,
          id,
          use,
          max,
          targetProfile,
          documentation,
          searchType,
          part,
          extension,
          min);
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean bindingIsSet() {
      return (optBits & OPT_BIT_BINDING) != 0;
    }

    private boolean referencedFromIsSet() {
      return (optBits & OPT_BIT_REFERENCED_FROM) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean maxIsSet() {
      return (optBits & OPT_BIT_MAX) != 0;
    }

    private boolean targetProfileIsSet() {
      return (optBits & OPT_BIT_TARGET_PROFILE) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean searchTypeIsSet() {
      return (optBits & OPT_BIT_SEARCH_TYPE) != 0;
    }

    private boolean partIsSet() {
      return (optBits & OPT_BIT_PART) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean minIsSet() {
      return (optBits & OPT_BIT_MIN) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of OperationDefinition_Parameter is strict, attribute is already set: ".concat(name));
    }
  }
}
