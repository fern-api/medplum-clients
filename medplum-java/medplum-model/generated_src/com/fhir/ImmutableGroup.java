//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Group}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGroup.builder()}.
 */
@org.immutables.value.Generated(from = "Group", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableGroup implements com.fhir.Group {
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.lang.Boolean active;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Group_Characteristic> characteristic;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.lang.Boolean actual;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Group_Member> member;
  private final @javax.annotation.Nullable com.fhir.GroupType type;
  private final @javax.annotation.Nullable com.fhir.Reference managingEntity;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.unsignedInt quantity;

  private ImmutableGroup(
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.lang.Boolean active,
      @javax.annotation.Nullable java.util.List<com.fhir.Group_Characteristic> characteristic,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.lang.Boolean actual,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Group_Member> member,
      @javax.annotation.Nullable com.fhir.GroupType type,
      @javax.annotation.Nullable com.fhir.Reference managingEntity,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.unsignedInt quantity) {
    this.name = name;
    this.active = active;
    this.characteristic = characteristic;
    this.code = code;
    this.meta = meta;
    this.modifierExtension = modifierExtension;
    this.implicitRules = implicitRules;
    this.language = language;
    this.text = text;
    this.actual = actual;
    this.resourceType = resourceType;
    this.identifier = identifier;
    this.extension = extension;
    this.member = member;
    this.type = type;
    this.managingEntity = managingEntity;
    this.contained = contained;
    this.id = id;
    this.quantity = quantity;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code active} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("active")
  @Override
  public java.util.Optional<java.lang.Boolean> active() {
    return java.util.Optional.ofNullable(active);
  }

  /**
   * @return The value of the {@code characteristic} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("characteristic")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Group_Characteristic>> characteristic() {
    return java.util.Optional.ofNullable(characteristic);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code actual} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("actual")
  @Override
  public java.util.Optional<java.lang.Boolean> actual() {
    return java.util.Optional.ofNullable(actual);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
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
   * @return The value of the {@code member} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("member")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Group_Member>> member() {
    return java.util.Optional.ofNullable(member);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.GroupType> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code managingEntity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("managingEntity")
  @Override
  public java.util.Optional<com.fhir.Reference> managingEntity() {
    return java.util.Optional.ofNullable(managingEntity);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code quantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("quantity")
  @Override
  public java.util.Optional<com.fhir.unsignedInt> quantity() {
    return java.util.Optional.ofNullable(quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableGroup(
        newValue,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableGroup(
        value,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withActive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.active, newValue)) return this;
    return new ImmutableGroup(
        this.name,
        newValue,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withActive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.active, value)) return this;
    return new ImmutableGroup(
        this.name,
        value,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#characteristic() characteristic} attribute.
   * @param value The value for characteristic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withCharacteristic(java.util.List<com.fhir.Group_Characteristic> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Group_Characteristic> newValue = java.util.Objects.requireNonNull(value, "characteristic");
    if (this.characteristic == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        newValue,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#characteristic() characteristic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for characteristic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withCharacteristic(java.util.Optional<? extends java.util.List<com.fhir.Group_Characteristic>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Group_Characteristic> value = optional.orElse(null);
    if (this.characteristic == value) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        value,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        newValue,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        value,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        newValue,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        value,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        newValue,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        value,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        newValue,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        value,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        newValue,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        value,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        newValue,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        value,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#actual() actual} attribute.
   * @param value The value for actual
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withActual(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.actual, newValue)) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        newValue,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#actual() actual} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actual
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withActual(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.actual, value)) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        value,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Group#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGroup withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        newValue,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        newValue,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        value,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        newValue,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        value,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#member() member} attribute.
   * @param value The value for member
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withMember(java.util.List<com.fhir.Group_Member> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Group_Member> newValue = java.util.Objects.requireNonNull(value, "member");
    if (this.member == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        newValue,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#member() member} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for member
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withMember(java.util.Optional<? extends java.util.List<com.fhir.Group_Member>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Group_Member> value = optional.orElse(null);
    if (this.member == value) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        value,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withType(com.fhir.GroupType value) {
    @javax.annotation.Nullable com.fhir.GroupType newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        newValue,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withType(java.util.Optional<? extends com.fhir.GroupType> optional) {
    @javax.annotation.Nullable com.fhir.GroupType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        value,
        this.managingEntity,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#managingEntity() managingEntity} attribute.
   * @param value The value for managingEntity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withManagingEntity(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "managingEntity");
    if (this.managingEntity == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        newValue,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#managingEntity() managingEntity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for managingEntity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withManagingEntity(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.managingEntity == value) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        value,
        this.contained,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        newValue,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        value,
        this.id,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        newValue,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        value,
        this.quantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withQuantity(com.fhir.unsignedInt value) {
    @javax.annotation.Nullable com.fhir.unsignedInt newValue = java.util.Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withQuantity(java.util.Optional<? extends com.fhir.unsignedInt> optional) {
    @javax.annotation.Nullable com.fhir.unsignedInt value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableGroup(
        this.name,
        this.active,
        this.characteristic,
        this.code,
        this.meta,
        this.modifierExtension,
        this.implicitRules,
        this.language,
        this.text,
        this.actual,
        this.resourceType,
        this.identifier,
        this.extension,
        this.member,
        this.type,
        this.managingEntity,
        this.contained,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGroup} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGroup
        && equalTo((ImmutableGroup) another);
  }

  private boolean equalTo(ImmutableGroup another) {
    return java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(active, another.active)
        && java.util.Objects.equals(characteristic, another.characteristic)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(actual, another.actual)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(member, another.member)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(managingEntity, another.managingEntity)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(quantity, another.quantity);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code active}, {@code characteristic}, {@code code}, {@code meta}, {@code modifierExtension}, {@code implicitRules}, {@code language}, {@code text}, {@code actual}, {@code resourceType}, {@code identifier}, {@code extension}, {@code member}, {@code type}, {@code managingEntity}, {@code contained}, {@code id}, {@code quantity}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(active);
    h += (h << 5) + java.util.Objects.hashCode(characteristic);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(actual);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(member);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(managingEntity);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(quantity);
    return h;
  }

  /**
   * Prints the immutable value {@code Group} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Group{");
    if (name != null) {
      builder.append("name=").append(name);
    }
    if (active != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("active=").append(active);
    }
    if (characteristic != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("characteristic=").append(characteristic);
    }
    if (code != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (meta != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (modifierExtension != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (implicitRules != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (text != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (actual != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("actual=").append(actual);
    }
    if (builder.length() > 6) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (member != null) {
      builder.append(", ");
      builder.append("member=").append(member);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (managingEntity != null) {
      builder.append(", ");
      builder.append("managingEntity=").append(managingEntity);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Group", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Group {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> active = java.util.Optional.empty();
    boolean activeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Group_Characteristic>> characteristic = java.util.Optional.empty();
    boolean characteristicIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> actual = java.util.Optional.empty();
    boolean actualIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Group_Member>> member = java.util.Optional.empty();
    boolean memberIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.GroupType> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> managingEntity = java.util.Optional.empty();
    boolean managingEntityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.unsignedInt> quantity = java.util.Optional.empty();
    boolean quantityIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public void setActive(java.util.Optional<java.lang.Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("characteristic")
    public void setCharacteristic(java.util.Optional<java.util.List<com.fhir.Group_Characteristic>> characteristic) {
      this.characteristic = characteristic;
      this.characteristicIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("actual")
    public void setActual(java.util.Optional<java.lang.Boolean> actual) {
      this.actual = actual;
      this.actualIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("member")
    public void setMember(java.util.Optional<java.util.List<com.fhir.Group_Member>> member) {
      this.member = member;
      this.memberIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.GroupType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("managingEntity")
    public void setManagingEntity(java.util.Optional<com.fhir.Reference> managingEntity) {
      this.managingEntity = managingEntity;
      this.managingEntityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public void setQuantity(java.util.Optional<com.fhir.unsignedInt> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Group_Characteristic>> characteristic() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> actual() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Group_Member>> member() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.GroupType> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> managingEntity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.unsignedInt> quantity() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableGroup fromJson(Json json) {
    ImmutableGroup.Builder builder = ((ImmutableGroup.Builder) ImmutableGroup.builder());
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.characteristicIsSet) {
      builder.characteristic(json.characteristic);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.actualIsSet) {
      builder.actual(json.actual);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.memberIsSet) {
      builder.member(json.member);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.managingEntityIsSet) {
      builder.managingEntity(json.managingEntity);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    return (ImmutableGroup) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Group} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Group instance
   */
  public static Group copyOf(Group instance) {
    if (instance instanceof ImmutableGroup) {
      return (ImmutableGroup) instance;
    }
    return ((ImmutableGroup.Builder) ImmutableGroup.builder())
        .name(instance.name())
        .active(instance.active())
        .characteristic(instance.characteristic())
        .code(instance.code())
        .meta(instance.meta())
        .modifierExtension(instance.modifierExtension())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .text(instance.text())
        .actual(instance.actual())
        .resourceType(instance.resourceType())
        .identifier(instance.identifier())
        .extension(instance.extension())
        .member(instance.member())
        .type(instance.type())
        .managingEntity(instance.managingEntity())
        .contained(instance.contained())
        .id(instance.id())
        .quantity(instance.quantity())
        .build();
  }

  /**
   * Creates a builder for {@link Group Group}.
   * <pre>
   * ImmutableGroup.builder()
   *    .name(String) // optional {@link Group#name() name}
   *    .active(Boolean) // optional {@link Group#active() active}
   *    .characteristic(List&amp;lt;com.fhir.Group_Characteristic&amp;gt;) // optional {@link Group#characteristic() characteristic}
   *    .code(com.fhir.CodeableConcept) // optional {@link Group#code() code}
   *    .meta(com.fhir.Meta) // optional {@link Group#meta() meta}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Group#modifierExtension() modifierExtension}
   *    .implicitRules(com.fhir.uri) // optional {@link Group#implicitRules() implicitRules}
   *    .language(com.fhir.code) // optional {@link Group#language() language}
   *    .text(com.fhir.Narrative) // optional {@link Group#text() text}
   *    .actual(Boolean) // optional {@link Group#actual() actual}
   *    .resourceType(String) // required {@link Group#resourceType() resourceType}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Group#identifier() identifier}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Group#extension() extension}
   *    .member(List&amp;lt;com.fhir.Group_Member&amp;gt;) // optional {@link Group#member() member}
   *    .type(com.fhir.GroupType) // optional {@link Group#type() type}
   *    .managingEntity(com.fhir.Reference) // optional {@link Group#managingEntity() managingEntity}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Group#contained() contained}
   *    .id(com.fhir.id) // optional {@link Group#id() id}
   *    .quantity(com.fhir.unsignedInt) // optional {@link Group#quantity() quantity}
   *    .build();
   * </pre>
   * @return A new Group builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableGroup.Builder();
  }

  /**
   * Builds instances of type {@link Group Group}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Group", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_NAME = 0x1L;
    private static final long OPT_BIT_ACTIVE = 0x2L;
    private static final long OPT_BIT_CHARACTERISTIC = 0x4L;
    private static final long OPT_BIT_CODE = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40L;
    private static final long OPT_BIT_LANGUAGE = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_ACTUAL = 0x200L;
    private static final long OPT_BIT_IDENTIFIER = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_MEMBER = 0x1000L;
    private static final long OPT_BIT_TYPE = 0x2000L;
    private static final long OPT_BIT_MANAGING_ENTITY = 0x4000L;
    private static final long OPT_BIT_CONTAINED = 0x8000L;
    private static final long OPT_BIT_ID = 0x10000L;
    private static final long OPT_BIT_QUANTITY = 0x20000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.lang.Boolean active;
    private @javax.annotation.Nullable java.util.List<com.fhir.Group_Characteristic> characteristic;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.Boolean actual;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Group_Member> member;
    private @javax.annotation.Nullable com.fhir.GroupType type;
    private @javax.annotation.Nullable com.fhir.Reference managingEntity;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.unsignedInt quantity;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Group#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.lang.String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<java.lang.String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    public final Builder active(boolean active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active;
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public final Builder active(java.util.Optional<java.lang.Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#characteristic() characteristic} to characteristic.
     * @param characteristic The value for characteristic
     * @return {@code this} builder for chained invocation
     */
    public final Builder characteristic(java.util.List<com.fhir.Group_Characteristic> characteristic) {
      checkNotIsSet(characteristicIsSet(), "characteristic");
      this.characteristic = java.util.Objects.requireNonNull(characteristic, "characteristic");
      optBits |= OPT_BIT_CHARACTERISTIC;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#characteristic() characteristic} to characteristic.
     * @param characteristic The value for characteristic
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("characteristic")
    public final Builder characteristic(java.util.Optional<? extends java.util.List<com.fhir.Group_Characteristic>> characteristic) {
      checkNotIsSet(characteristicIsSet(), "characteristic");
      this.characteristic = characteristic.orElse(null);
      optBits |= OPT_BIT_CHARACTERISTIC;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public final Builder meta(java.util.Optional<? extends com.fhir.Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Group#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Group#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(com.fhir.uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = java.util.Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public final Builder implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(com.fhir.Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public final Builder text(java.util.Optional<? extends com.fhir.Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#actual() actual} to actual.
     * @param actual The value for actual
     * @return {@code this} builder for chained invocation
     */
    public final Builder actual(boolean actual) {
      checkNotIsSet(actualIsSet(), "actual");
      this.actual = actual;
      optBits |= OPT_BIT_ACTUAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#actual() actual} to actual.
     * @param actual The value for actual
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("actual")
    public final Builder actual(java.util.Optional<java.lang.Boolean> actual) {
      checkNotIsSet(actualIsSet(), "actual");
      this.actual = actual.orElse(null);
      optBits |= OPT_BIT_ACTUAL;
      return this;
    }

    /**
     * Initializes the value for the {@link Group#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(java.util.List<com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#extension() extension} to extension.
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
     * Initializes the optional value {@link Group#extension() extension} to extension.
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
     * Initializes the optional value {@link Group#member() member} to member.
     * @param member The value for member
     * @return {@code this} builder for chained invocation
     */
    public final Builder member(java.util.List<com.fhir.Group_Member> member) {
      checkNotIsSet(memberIsSet(), "member");
      this.member = java.util.Objects.requireNonNull(member, "member");
      optBits |= OPT_BIT_MEMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#member() member} to member.
     * @param member The value for member
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("member")
    public final Builder member(java.util.Optional<? extends java.util.List<com.fhir.Group_Member>> member) {
      checkNotIsSet(memberIsSet(), "member");
      this.member = member.orElse(null);
      optBits |= OPT_BIT_MEMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.GroupType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.GroupType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#managingEntity() managingEntity} to managingEntity.
     * @param managingEntity The value for managingEntity
     * @return {@code this} builder for chained invocation
     */
    public final Builder managingEntity(com.fhir.Reference managingEntity) {
      checkNotIsSet(managingEntityIsSet(), "managingEntity");
      this.managingEntity = java.util.Objects.requireNonNull(managingEntity, "managingEntity");
      optBits |= OPT_BIT_MANAGING_ENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#managingEntity() managingEntity} to managingEntity.
     * @param managingEntity The value for managingEntity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managingEntity")
    public final Builder managingEntity(java.util.Optional<? extends com.fhir.Reference> managingEntity) {
      checkNotIsSet(managingEntityIsSet(), "managingEntity");
      this.managingEntity = managingEntity.orElse(null);
      optBits |= OPT_BIT_MANAGING_ENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(java.util.List<com.fhir.ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = java.util.Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public final Builder contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(com.fhir.unsignedInt quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = java.util.Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public final Builder quantity(java.util.Optional<? extends com.fhir.unsignedInt> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Builds a new {@link Group Group}.
     * @return An immutable instance of Group
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Group build() {
      checkRequiredAttributes();
      return new ImmutableGroup(
          name,
          active,
          characteristic,
          code,
          meta,
          modifierExtension,
          implicitRules,
          language,
          text,
          actual,
          resourceType,
          identifier,
          extension,
          member,
          type,
          managingEntity,
          contained,
          id,
          quantity);
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean characteristicIsSet() {
      return (optBits & OPT_BIT_CHARACTERISTIC) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean actualIsSet() {
      return (optBits & OPT_BIT_ACTUAL) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean memberIsSet() {
      return (optBits & OPT_BIT_MEMBER) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean managingEntityIsSet() {
      return (optBits & OPT_BIT_MANAGING_ENTITY) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Group is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Group, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Group", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Group#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Group", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Group#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link Group#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link Group#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    BuildFinal active(boolean active);

    /**
     * Initializes the optional value {@link Group#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal active(java.util.Optional<java.lang.Boolean> active);

    /**
     * Initializes the optional value {@link Group#characteristic() characteristic} to characteristic.
     * @param characteristic The value for characteristic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal characteristic(java.util.List<com.fhir.Group_Characteristic> characteristic);

    /**
     * Initializes the optional value {@link Group#characteristic() characteristic} to characteristic.
     * @param characteristic The value for characteristic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal characteristic(java.util.Optional<? extends java.util.List<com.fhir.Group_Characteristic>> characteristic);

    /**
     * Initializes the optional value {@link Group#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);

    /**
     * Initializes the optional value {@link Group#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link Group#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Group#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Group#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Group#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Group#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Group#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Group#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Group#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Group#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Group#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Group#actual() actual} to actual.
     * @param actual The value for actual
     * @return {@code this} builder for chained invocation
     */
    BuildFinal actual(boolean actual);

    /**
     * Initializes the optional value {@link Group#actual() actual} to actual.
     * @param actual The value for actual
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal actual(java.util.Optional<java.lang.Boolean> actual);

    /**
     * Initializes the optional value {@link Group#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Group#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Group#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Group#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Group#member() member} to member.
     * @param member The value for member
     * @return {@code this} builder for chained invocation
     */
    BuildFinal member(java.util.List<com.fhir.Group_Member> member);

    /**
     * Initializes the optional value {@link Group#member() member} to member.
     * @param member The value for member
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal member(java.util.Optional<? extends java.util.List<com.fhir.Group_Member>> member);

    /**
     * Initializes the optional value {@link Group#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.GroupType type);

    /**
     * Initializes the optional value {@link Group#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.GroupType> type);

    /**
     * Initializes the optional value {@link Group#managingEntity() managingEntity} to managingEntity.
     * @param managingEntity The value for managingEntity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal managingEntity(com.fhir.Reference managingEntity);

    /**
     * Initializes the optional value {@link Group#managingEntity() managingEntity} to managingEntity.
     * @param managingEntity The value for managingEntity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal managingEntity(java.util.Optional<? extends com.fhir.Reference> managingEntity);

    /**
     * Initializes the optional value {@link Group#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Group#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Group#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Group#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Group#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(com.fhir.unsignedInt quantity);

    /**
     * Initializes the optional value {@link Group#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(java.util.Optional<? extends com.fhir.unsignedInt> quantity);

    /**
     * Builds a new {@link Group Group}.
     * @return An immutable instance of Group
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Group build();
  }
}
