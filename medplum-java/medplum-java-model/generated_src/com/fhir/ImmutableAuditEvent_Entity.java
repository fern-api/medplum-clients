//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link AuditEvent_Entity}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuditEvent_Entity.builder()}.
 */
@org.immutables.value.Generated(from = "AuditEvent_Entity", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAuditEvent_Entity implements com.fhir.AuditEvent_Entity {
  private final @javax.annotation.Nullable com.fhir.Coding role;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Coding> securityLabel;
  private final @javax.annotation.Nullable com.fhir.Coding type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.AuditEvent_Detail> detail;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.Reference what;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.base64Binary query;
  private final @javax.annotation.Nullable com.fhir.Coding lifecycle;

  private ImmutableAuditEvent_Entity(
      @javax.annotation.Nullable com.fhir.Coding role,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Coding> securityLabel,
      @javax.annotation.Nullable com.fhir.Coding type,
      @javax.annotation.Nullable java.util.List<com.fhir.AuditEvent_Detail> detail,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.Reference what,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.base64Binary query,
      @javax.annotation.Nullable com.fhir.Coding lifecycle) {
    this.role = role;
    this.extension = extension;
    this.securityLabel = securityLabel;
    this.type = type;
    this.detail = detail;
    this.name = name;
    this.what = what;
    this.modifierExtension = modifierExtension;
    this.description = description;
    this.id = id;
    this.query = query;
    this.lifecycle = lifecycle;
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("role")
  @Override
  public java.util.Optional<com.fhir.Coding> role() {
    return java.util.Optional.ofNullable(role);
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
   * @return The value of the {@code securityLabel} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("securityLabel")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Coding>> securityLabel() {
    return java.util.Optional.ofNullable(securityLabel);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.Coding> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code detail} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("detail")
  @Override
  public java.util.Optional<java.util.List<com.fhir.AuditEvent_Detail>> detail() {
    return java.util.Optional.ofNullable(detail);
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
   * @return The value of the {@code what} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("what")
  @Override
  public java.util.Optional<com.fhir.Reference> what() {
    return java.util.Optional.ofNullable(what);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code query} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("query")
  @Override
  public java.util.Optional<com.fhir.base64Binary> query() {
    return java.util.Optional.ofNullable(query);
  }

  /**
   * @return The value of the {@code lifecycle} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lifecycle")
  @Override
  public java.util.Optional<com.fhir.Coding> lifecycle() {
    return java.util.Optional.ofNullable(lifecycle);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#role() role} attribute.
   * @param value The value for role
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withRole(com.fhir.Coding value) {
    @javax.annotation.Nullable com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "role");
    if (this.role == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        newValue,
        this.extension,
        this.securityLabel,
        this.type,
        this.detail,
        this.name,
        this.what,
        this.modifierExtension,
        this.description,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#role() role} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for role
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withRole(java.util.Optional<? extends com.fhir.Coding> optional) {
    @javax.annotation.Nullable com.fhir.Coding value = optional.orElse(null);
    if (this.role == value) return this;
    return new ImmutableAuditEvent_Entity(
        value,
        this.extension,
        this.securityLabel,
        this.type,
        this.detail,
        this.name,
        this.what,
        this.modifierExtension,
        this.description,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        newValue,
        this.securityLabel,
        this.type,
        this.detail,
        this.name,
        this.what,
        this.modifierExtension,
        this.description,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        value,
        this.securityLabel,
        this.type,
        this.detail,
        this.name,
        this.what,
        this.modifierExtension,
        this.description,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#securityLabel() securityLabel} attribute.
   * @param value The value for securityLabel
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withSecurityLabel(java.util.List<com.fhir.Coding> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> newValue = java.util.Objects.requireNonNull(value, "securityLabel");
    if (this.securityLabel == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        newValue,
        this.type,
        this.detail,
        this.name,
        this.what,
        this.modifierExtension,
        this.description,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#securityLabel() securityLabel} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for securityLabel
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withSecurityLabel(java.util.Optional<? extends java.util.List<com.fhir.Coding>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> value = optional.orElse(null);
    if (this.securityLabel == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        value,
        this.type,
        this.detail,
        this.name,
        this.what,
        this.modifierExtension,
        this.description,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withType(com.fhir.Coding value) {
    @javax.annotation.Nullable com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        newValue,
        this.detail,
        this.name,
        this.what,
        this.modifierExtension,
        this.description,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withType(java.util.Optional<? extends com.fhir.Coding> optional) {
    @javax.annotation.Nullable com.fhir.Coding value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        value,
        this.detail,
        this.name,
        this.what,
        this.modifierExtension,
        this.description,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withDetail(java.util.List<com.fhir.AuditEvent_Detail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.AuditEvent_Detail> newValue = java.util.Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        this.type,
        newValue,
        this.name,
        this.what,
        this.modifierExtension,
        this.description,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withDetail(java.util.Optional<? extends java.util.List<com.fhir.AuditEvent_Detail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.AuditEvent_Detail> value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        this.type,
        value,
        this.name,
        this.what,
        this.modifierExtension,
        this.description,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        this.type,
        this.detail,
        newValue,
        this.what,
        this.modifierExtension,
        this.description,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        this.type,
        this.detail,
        value,
        this.what,
        this.modifierExtension,
        this.description,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#what() what} attribute.
   * @param value The value for what
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withWhat(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "what");
    if (this.what == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        this.type,
        this.detail,
        this.name,
        newValue,
        this.modifierExtension,
        this.description,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#what() what} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for what
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withWhat(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.what == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        this.type,
        this.detail,
        this.name,
        value,
        this.modifierExtension,
        this.description,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        this.type,
        this.detail,
        this.name,
        this.what,
        newValue,
        this.description,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        this.type,
        this.detail,
        this.name,
        this.what,
        value,
        this.description,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        this.type,
        this.detail,
        this.name,
        this.what,
        this.modifierExtension,
        newValue,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        this.type,
        this.detail,
        this.name,
        this.what,
        this.modifierExtension,
        value,
        this.id,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        this.type,
        this.detail,
        this.name,
        this.what,
        this.modifierExtension,
        this.description,
        newValue,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        this.type,
        this.detail,
        this.name,
        this.what,
        this.modifierExtension,
        this.description,
        value,
        this.query,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#query() query} attribute.
   * @param value The value for query
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withQuery(com.fhir.base64Binary value) {
    @javax.annotation.Nullable com.fhir.base64Binary newValue = java.util.Objects.requireNonNull(value, "query");
    if (this.query == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        this.type,
        this.detail,
        this.name,
        this.what,
        this.modifierExtension,
        this.description,
        this.id,
        newValue,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#query() query} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for query
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withQuery(java.util.Optional<? extends com.fhir.base64Binary> optional) {
    @javax.annotation.Nullable com.fhir.base64Binary value = optional.orElse(null);
    if (this.query == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        this.type,
        this.detail,
        this.name,
        this.what,
        this.modifierExtension,
        this.description,
        this.id,
        value,
        this.lifecycle);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Entity#lifecycle() lifecycle} attribute.
   * @param value The value for lifecycle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Entity withLifecycle(com.fhir.Coding value) {
    @javax.annotation.Nullable com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "lifecycle");
    if (this.lifecycle == newValue) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        this.type,
        this.detail,
        this.name,
        this.what,
        this.modifierExtension,
        this.description,
        this.id,
        this.query,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Entity#lifecycle() lifecycle} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lifecycle
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Entity withLifecycle(java.util.Optional<? extends com.fhir.Coding> optional) {
    @javax.annotation.Nullable com.fhir.Coding value = optional.orElse(null);
    if (this.lifecycle == value) return this;
    return new ImmutableAuditEvent_Entity(
        this.role,
        this.extension,
        this.securityLabel,
        this.type,
        this.detail,
        this.name,
        this.what,
        this.modifierExtension,
        this.description,
        this.id,
        this.query,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuditEvent_Entity} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuditEvent_Entity
        && equalTo((ImmutableAuditEvent_Entity) another);
  }

  private boolean equalTo(ImmutableAuditEvent_Entity another) {
    return java.util.Objects.equals(role, another.role)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(securityLabel, another.securityLabel)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(detail, another.detail)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(what, another.what)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(query, another.query)
        && java.util.Objects.equals(lifecycle, another.lifecycle);
  }

  /**
   * Computes a hash code from attributes: {@code role}, {@code extension}, {@code securityLabel}, {@code type}, {@code detail}, {@code name}, {@code what}, {@code modifierExtension}, {@code description}, {@code id}, {@code query}, {@code lifecycle}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(role);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(securityLabel);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(detail);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(what);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(query);
    h += (h << 5) + java.util.Objects.hashCode(lifecycle);
    return h;
  }

  /**
   * Prints the immutable value {@code AuditEvent_Entity} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("AuditEvent_Entity{");
    if (role != null) {
      builder.append("role=").append(role);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (securityLabel != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("securityLabel=").append(securityLabel);
    }
    if (type != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (detail != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("detail=").append(detail);
    }
    if (name != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (what != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("what=").append(what);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (description != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (query != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("query=").append(query);
    }
    if (lifecycle != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("lifecycle=").append(lifecycle);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "AuditEvent_Entity", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.AuditEvent_Entity {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Coding> role = java.util.Optional.empty();
    boolean roleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Coding>> securityLabel = java.util.Optional.empty();
    boolean securityLabelIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Coding> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.AuditEvent_Detail>> detail = java.util.Optional.empty();
    boolean detailIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> what = java.util.Optional.empty();
    boolean whatIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.base64Binary> query = java.util.Optional.empty();
    boolean queryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Coding> lifecycle = java.util.Optional.empty();
    boolean lifecycleIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    public void setRole(java.util.Optional<com.fhir.Coding> role) {
      this.role = role;
      this.roleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("securityLabel")
    public void setSecurityLabel(java.util.Optional<java.util.List<com.fhir.Coding>> securityLabel) {
      this.securityLabel = securityLabel;
      this.securityLabelIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.Coding> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    public void setDetail(java.util.Optional<java.util.List<com.fhir.AuditEvent_Detail>> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("what")
    public void setWhat(java.util.Optional<com.fhir.Reference> what) {
      this.what = what;
      this.whatIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    public void setQuery(java.util.Optional<com.fhir.base64Binary> query) {
      this.query = query;
      this.queryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycle")
    public void setLifecycle(java.util.Optional<com.fhir.Coding> lifecycle) {
      this.lifecycle = lifecycle;
      this.lifecycleIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Coding> role() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Coding>> securityLabel() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Coding> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.AuditEvent_Detail>> detail() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> what() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.base64Binary> query() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Coding> lifecycle() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableAuditEvent_Entity fromJson(Json json) {
    ImmutableAuditEvent_Entity.Builder builder = ImmutableAuditEvent_Entity.builder();
    if (json.roleIsSet) {
      builder.role(json.role);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.securityLabelIsSet) {
      builder.securityLabel(json.securityLabel);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.whatIsSet) {
      builder.what(json.what);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.queryIsSet) {
      builder.query(json.query);
    }
    if (json.lifecycleIsSet) {
      builder.lifecycle(json.lifecycle);
    }
    return (ImmutableAuditEvent_Entity) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AuditEvent_Entity} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AuditEvent_Entity instance
   */
  public static AuditEvent_Entity copyOf(AuditEvent_Entity instance) {
    if (instance instanceof ImmutableAuditEvent_Entity) {
      return (ImmutableAuditEvent_Entity) instance;
    }
    return ImmutableAuditEvent_Entity.builder()
        .role(instance.role())
        .extension(instance.extension())
        .securityLabel(instance.securityLabel())
        .type(instance.type())
        .detail(instance.detail())
        .name(instance.name())
        .what(instance.what())
        .modifierExtension(instance.modifierExtension())
        .description(instance.description())
        .id(instance.id())
        .query(instance.query())
        .lifecycle(instance.lifecycle())
        .build();
  }

  /**
   * Creates a builder for {@link AuditEvent_Entity AuditEvent_Entity}.
   * <pre>
   * ImmutableAuditEvent_Entity.builder()
   *    .role(com.fhir.Coding) // optional {@link AuditEvent_Entity#role() role}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AuditEvent_Entity#extension() extension}
   *    .securityLabel(List&amp;lt;com.fhir.Coding&amp;gt;) // optional {@link AuditEvent_Entity#securityLabel() securityLabel}
   *    .type(com.fhir.Coding) // optional {@link AuditEvent_Entity#type() type}
   *    .detail(List&amp;lt;com.fhir.AuditEvent_Detail&amp;gt;) // optional {@link AuditEvent_Entity#detail() detail}
   *    .name(String) // optional {@link AuditEvent_Entity#name() name}
   *    .what(com.fhir.Reference) // optional {@link AuditEvent_Entity#what() what}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AuditEvent_Entity#modifierExtension() modifierExtension}
   *    .description(String) // optional {@link AuditEvent_Entity#description() description}
   *    .id(String) // optional {@link AuditEvent_Entity#id() id}
   *    .query(com.fhir.base64Binary) // optional {@link AuditEvent_Entity#query() query}
   *    .lifecycle(com.fhir.Coding) // optional {@link AuditEvent_Entity#lifecycle() lifecycle}
   *    .build();
   * </pre>
   * @return A new AuditEvent_Entity builder
   */
  public static ImmutableAuditEvent_Entity.Builder builder() {
    return new ImmutableAuditEvent_Entity.Builder();
  }

  /**
   * Builds instances of type {@link AuditEvent_Entity AuditEvent_Entity}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "AuditEvent_Entity", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ROLE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_SECURITY_LABEL = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_DETAIL = 0x10L;
    private static final long OPT_BIT_NAME = 0x20L;
    private static final long OPT_BIT_WHAT = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_DESCRIPTION = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_QUERY = 0x400L;
    private static final long OPT_BIT_LIFECYCLE = 0x800L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Coding role;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Coding> securityLabel;
    private @javax.annotation.Nullable com.fhir.Coding type;
    private @javax.annotation.Nullable java.util.List<com.fhir.AuditEvent_Detail> detail;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.Reference what;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.base64Binary query;
    private @javax.annotation.Nullable com.fhir.Coding lifecycle;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    public final Builder role(com.fhir.Coding role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = java.util.Objects.requireNonNull(role, "role");
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    public final Builder role(java.util.Optional<? extends com.fhir.Coding> role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = role.orElse(null);
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#extension() extension} to extension.
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
     * Initializes the optional value {@link AuditEvent_Entity#extension() extension} to extension.
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
     * Initializes the optional value {@link AuditEvent_Entity#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for chained invocation
     */
    public final Builder securityLabel(java.util.List<com.fhir.Coding> securityLabel) {
      checkNotIsSet(securityLabelIsSet(), "securityLabel");
      this.securityLabel = java.util.Objects.requireNonNull(securityLabel, "securityLabel");
      optBits |= OPT_BIT_SECURITY_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityLabel")
    public final Builder securityLabel(java.util.Optional<? extends java.util.List<com.fhir.Coding>> securityLabel) {
      checkNotIsSet(securityLabelIsSet(), "securityLabel");
      this.securityLabel = securityLabel.orElse(null);
      optBits |= OPT_BIT_SECURITY_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.Coding type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.Coding> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(java.util.List<com.fhir.AuditEvent_Detail> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = java.util.Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    public final Builder detail(java.util.Optional<? extends java.util.List<com.fhir.AuditEvent_Detail>> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#name() name} to name.
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
     * Initializes the optional value {@link AuditEvent_Entity#name() name} to name.
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
     * Initializes the optional value {@link AuditEvent_Entity#what() what} to what.
     * @param what The value for what
     * @return {@code this} builder for chained invocation
     */
    public final Builder what(com.fhir.Reference what) {
      checkNotIsSet(whatIsSet(), "what");
      this.what = java.util.Objects.requireNonNull(what, "what");
      optBits |= OPT_BIT_WHAT;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#what() what} to what.
     * @param what The value for what
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("what")
    public final Builder what(java.util.Optional<? extends com.fhir.Reference> what) {
      checkNotIsSet(whatIsSet(), "what");
      this.what = what.orElse(null);
      optBits |= OPT_BIT_WHAT;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AuditEvent_Entity#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AuditEvent_Entity#description() description} to description.
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
     * Initializes the optional value {@link AuditEvent_Entity#description() description} to description.
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
     * Initializes the optional value {@link AuditEvent_Entity#id() id} to id.
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
     * Initializes the optional value {@link AuditEvent_Entity#id() id} to id.
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
     * Initializes the optional value {@link AuditEvent_Entity#query() query} to query.
     * @param query The value for query
     * @return {@code this} builder for chained invocation
     */
    public final Builder query(com.fhir.base64Binary query) {
      checkNotIsSet(queryIsSet(), "query");
      this.query = java.util.Objects.requireNonNull(query, "query");
      optBits |= OPT_BIT_QUERY;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#query() query} to query.
     * @param query The value for query
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    public final Builder query(java.util.Optional<? extends com.fhir.base64Binary> query) {
      checkNotIsSet(queryIsSet(), "query");
      this.query = query.orElse(null);
      optBits |= OPT_BIT_QUERY;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#lifecycle() lifecycle} to lifecycle.
     * @param lifecycle The value for lifecycle
     * @return {@code this} builder for chained invocation
     */
    public final Builder lifecycle(com.fhir.Coding lifecycle) {
      checkNotIsSet(lifecycleIsSet(), "lifecycle");
      this.lifecycle = java.util.Objects.requireNonNull(lifecycle, "lifecycle");
      optBits |= OPT_BIT_LIFECYCLE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Entity#lifecycle() lifecycle} to lifecycle.
     * @param lifecycle The value for lifecycle
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycle")
    public final Builder lifecycle(java.util.Optional<? extends com.fhir.Coding> lifecycle) {
      checkNotIsSet(lifecycleIsSet(), "lifecycle");
      this.lifecycle = lifecycle.orElse(null);
      optBits |= OPT_BIT_LIFECYCLE;
      return this;
    }

    /**
     * Builds a new {@link AuditEvent_Entity AuditEvent_Entity}.
     * @return An immutable instance of AuditEvent_Entity
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.AuditEvent_Entity build() {
      return new ImmutableAuditEvent_Entity(
          role,
          extension,
          securityLabel,
          type,
          detail,
          name,
          what,
          modifierExtension,
          description,
          id,
          query,
          lifecycle);
    }

    private boolean roleIsSet() {
      return (optBits & OPT_BIT_ROLE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean securityLabelIsSet() {
      return (optBits & OPT_BIT_SECURITY_LABEL) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean whatIsSet() {
      return (optBits & OPT_BIT_WHAT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean queryIsSet() {
      return (optBits & OPT_BIT_QUERY) != 0;
    }

    private boolean lifecycleIsSet() {
      return (optBits & OPT_BIT_LIFECYCLE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of AuditEvent_Entity is strict, attribute is already set: ".concat(name));
    }
  }
}
