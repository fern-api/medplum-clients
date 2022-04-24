//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Subscription}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubscription.builder()}.
 */
@org.immutables.value.Generated(from = "Subscription", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubscription implements com.fhir.Subscription {
  private final @javax.annotation.Nullable com.fhir.SubscriptionStatus status;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String error;
  private final com.fhir.Subscription_Channel channel;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String criteria;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> contact;
  private final @javax.annotation.Nullable java.lang.String reason;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.instant end;

  private ImmutableSubscription(
      @javax.annotation.Nullable com.fhir.SubscriptionStatus status,
      @javax.annotation.Nullable com.fhir.Narrative text,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String error,
      com.fhir.Subscription_Channel channel,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String criteria,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> contact,
      @javax.annotation.Nullable java.lang.String reason,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.instant end) {
    this.status = status;
    this.text = text;
    this.resourceType = resourceType;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.error = error;
    this.channel = channel;
    this.meta = meta;
    this.extension = extension;
    this.criteria = criteria;
    this.id = id;
    this.language = language;
    this.contact = contact;
    this.reason = reason;
    this.implicitRules = implicitRules;
    this.end = end;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.SubscriptionStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code error} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("error")
  @Override
  public java.util.Optional<java.lang.String> error() {
    return java.util.Optional.ofNullable(error);
  }

  /**
   * @return The value of the {@code channel} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("channel")
  @Override
  public com.fhir.Subscription_Channel channel() {
    return channel;
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code criteria} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("criteria")
  @Override
  public java.util.Optional<java.lang.String> criteria() {
    return java.util.Optional.ofNullable(criteria);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactPoint>> contact() {
    return java.util.Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code reason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reason")
  @Override
  public java.util.Optional<java.lang.String> reason() {
    return java.util.Optional.ofNullable(reason);
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
   * @return The value of the {@code end} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("end")
  @Override
  public java.util.Optional<com.fhir.instant> end() {
    return java.util.Optional.ofNullable(end);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withStatus(com.fhir.SubscriptionStatus value) {
    @javax.annotation.Nullable com.fhir.SubscriptionStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSubscription(
        newValue,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withStatus(java.util.Optional<? extends com.fhir.SubscriptionStatus> optional) {
    @javax.annotation.Nullable com.fhir.SubscriptionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSubscription(
        value,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSubscription(
        this.status,
        newValue,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSubscription(
        this.status,
        value,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Subscription#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubscription withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        newValue,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        newValue,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        value,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        newValue,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        value,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#error() error} attribute.
   * @param value The value for error
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withError(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "error");
    if (java.util.Objects.equals(this.error, newValue)) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        newValue,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#error() error} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for error
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withError(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.error, value)) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        value,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Subscription#channel() channel} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for channel
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubscription withChannel(com.fhir.Subscription_Channel value) {
    if (this.channel == value) return this;
    com.fhir.Subscription_Channel newValue = java.util.Objects.requireNonNull(value, "channel");
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        newValue,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        newValue,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        value,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        newValue,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        value,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#criteria() criteria} attribute.
   * @param value The value for criteria
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withCriteria(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "criteria");
    if (java.util.Objects.equals(this.criteria, newValue)) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        newValue,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#criteria() criteria} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for criteria
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withCriteria(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.criteria, value)) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        value,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        newValue,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        value,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        newValue,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        value,
        this.contact,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withContact(java.util.List<com.fhir.ContactPoint> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        newValue,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        value,
        this.reason,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withReason(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "reason");
    if (java.util.Objects.equals(this.reason, newValue)) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        newValue,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#reason() reason} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withReason(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.reason, value)) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        value,
        this.implicitRules,
        this.end);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        newValue,
        this.end);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        value,
        this.end);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#end() end} attribute.
   * @param value The value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withEnd(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "end");
    if (this.end == newValue) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#end() end} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for end
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withEnd(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.end == value) return this;
    return new ImmutableSubscription(
        this.status,
        this.text,
        this.resourceType,
        this.contained,
        this.modifierExtension,
        this.error,
        this.channel,
        this.meta,
        this.extension,
        this.criteria,
        this.id,
        this.language,
        this.contact,
        this.reason,
        this.implicitRules,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubscription} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubscription
        && equalTo((ImmutableSubscription) another);
  }

  private boolean equalTo(ImmutableSubscription another) {
    return java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(text, another.text)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(error, another.error)
        && channel.equals(another.channel)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(criteria, another.criteria)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(reason, another.reason)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(end, another.end);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code text}, {@code resourceType}, {@code contained}, {@code modifierExtension}, {@code error}, {@code channel}, {@code meta}, {@code extension}, {@code criteria}, {@code id}, {@code language}, {@code contact}, {@code reason}, {@code implicitRules}, {@code end}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(error);
    h += (h << 5) + channel.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(criteria);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(reason);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(end);
    return h;
  }

  /**
   * Prints the immutable value {@code Subscription} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Subscription{");
    if (status != null) {
      builder.append("status=").append(status);
    }
    if (text != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (error != null) {
      builder.append(", ");
      builder.append("error=").append(error);
    }
    builder.append(", ");
    builder.append("channel=").append(channel);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (criteria != null) {
      builder.append(", ");
      builder.append("criteria=").append(criteria);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (reason != null) {
      builder.append(", ");
      builder.append("reason=").append(reason);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (end != null) {
      builder.append(", ");
      builder.append("end=").append(end);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Subscription", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Subscription {
    @javax.annotation.Nullable java.util.Optional<com.fhir.SubscriptionStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> error = java.util.Optional.empty();
    boolean errorIsSet;
    @javax.annotation.Nullable com.fhir.Subscription_Channel channel;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> criteria = java.util.Optional.empty();
    boolean criteriaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactPoint>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> reason = java.util.Optional.empty();
    boolean reasonIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> end = java.util.Optional.empty();
    boolean endIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.SubscriptionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    public void setError(java.util.Optional<java.lang.String> error) {
      this.error = error;
      this.errorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("channel")
    public void setChannel(com.fhir.Subscription_Channel channel) {
      this.channel = channel;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("criteria")
    public void setCriteria(java.util.Optional<java.lang.String> criteria) {
      this.criteria = criteria;
      this.criteriaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactPoint>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(java.util.Optional<java.lang.String> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("end")
    public void setEnd(java.util.Optional<com.fhir.instant> end) {
      this.end = end;
      this.endIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.SubscriptionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> error() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Subscription_Channel channel() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> criteria() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactPoint>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> reason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> end() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSubscription fromJson(Json json) {
    ImmutableSubscription.Builder builder = ((ImmutableSubscription.Builder) ImmutableSubscription.builder());
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.errorIsSet) {
      builder.error(json.error);
    }
    if (json.channel != null) {
      builder.channel(json.channel);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.criteriaIsSet) {
      builder.criteria(json.criteria);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.endIsSet) {
      builder.end(json.end);
    }
    return (ImmutableSubscription) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Subscription} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Subscription instance
   */
  public static Subscription copyOf(Subscription instance) {
    if (instance instanceof ImmutableSubscription) {
      return (ImmutableSubscription) instance;
    }
    return ((ImmutableSubscription.Builder) ImmutableSubscription.builder())
        .status(instance.status())
        .text(instance.text())
        .resourceType(instance.resourceType())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .error(instance.error())
        .channel(instance.channel())
        .meta(instance.meta())
        .extension(instance.extension())
        .criteria(instance.criteria())
        .id(instance.id())
        .language(instance.language())
        .contact(instance.contact())
        .reason(instance.reason())
        .implicitRules(instance.implicitRules())
        .end(instance.end())
        .build();
  }

  /**
   * Creates a builder for {@link Subscription Subscription}.
   * <pre>
   * ImmutableSubscription.builder()
   *    .status(com.fhir.SubscriptionStatus) // optional {@link Subscription#status() status}
   *    .text(com.fhir.Narrative) // optional {@link Subscription#text() text}
   *    .resourceType(String) // required {@link Subscription#resourceType() resourceType}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Subscription#contained() contained}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Subscription#modifierExtension() modifierExtension}
   *    .error(String) // optional {@link Subscription#error() error}
   *    .channel(com.fhir.Subscription_Channel) // required {@link Subscription#channel() channel}
   *    .meta(com.fhir.Meta) // optional {@link Subscription#meta() meta}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Subscription#extension() extension}
   *    .criteria(String) // optional {@link Subscription#criteria() criteria}
   *    .id(com.fhir.id) // optional {@link Subscription#id() id}
   *    .language(com.fhir.code) // optional {@link Subscription#language() language}
   *    .contact(List&amp;lt;com.fhir.ContactPoint&amp;gt;) // optional {@link Subscription#contact() contact}
   *    .reason(String) // optional {@link Subscription#reason() reason}
   *    .implicitRules(com.fhir.uri) // optional {@link Subscription#implicitRules() implicitRules}
   *    .end(com.fhir.instant) // optional {@link Subscription#end() end}
   *    .build();
   * </pre>
   * @return A new Subscription builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableSubscription.Builder();
  }

  /**
   * Builds instances of type {@link Subscription Subscription}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Subscription", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, ChannelBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_CHANNEL = 0x2L;
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_TEXT = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_ERROR = 0x10L;
    private static final long OPT_BIT_META = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_CRITERIA = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_LANGUAGE = 0x200L;
    private static final long OPT_BIT_CONTACT = 0x400L;
    private static final long OPT_BIT_REASON = 0x800L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000L;
    private static final long OPT_BIT_END = 0x2000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.SubscriptionStatus status;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String error;
    private @javax.annotation.Nullable com.fhir.Subscription_Channel channel;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String criteria;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> contact;
    private @javax.annotation.Nullable java.lang.String reason;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.instant end;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Subscription#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.SubscriptionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.SubscriptionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#text() text} to text.
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
     * Initializes the optional value {@link Subscription#text() text} to text.
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
     * Initializes the value for the {@link Subscription#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Subscription#contained() contained} to contained.
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
     * Initializes the optional value {@link Subscription#contained() contained} to contained.
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
     * Initializes the optional value {@link Subscription#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Subscription#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Subscription#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for chained invocation
     */
    public final Builder error(java.lang.String error) {
      checkNotIsSet(errorIsSet(), "error");
      this.error = java.util.Objects.requireNonNull(error, "error");
      optBits |= OPT_BIT_ERROR;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    public final Builder error(java.util.Optional<java.lang.String> error) {
      checkNotIsSet(errorIsSet(), "error");
      this.error = error.orElse(null);
      optBits |= OPT_BIT_ERROR;
      return this;
    }

    /**
     * Initializes the value for the {@link Subscription#channel() channel} attribute.
     * @param channel The value for channel 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("channel")
    public final Builder channel(com.fhir.Subscription_Channel channel) {
      checkNotIsSet(channelIsSet(), "channel");
      this.channel = java.util.Objects.requireNonNull(channel, "channel");
      initBits &= ~INIT_BIT_CHANNEL;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#meta() meta} to meta.
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
     * Initializes the optional value {@link Subscription#meta() meta} to meta.
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
     * Initializes the optional value {@link Subscription#extension() extension} to extension.
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
     * Initializes the optional value {@link Subscription#extension() extension} to extension.
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
     * Initializes the optional value {@link Subscription#criteria() criteria} to criteria.
     * @param criteria The value for criteria
     * @return {@code this} builder for chained invocation
     */
    public final Builder criteria(java.lang.String criteria) {
      checkNotIsSet(criteriaIsSet(), "criteria");
      this.criteria = java.util.Objects.requireNonNull(criteria, "criteria");
      optBits |= OPT_BIT_CRITERIA;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#criteria() criteria} to criteria.
     * @param criteria The value for criteria
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("criteria")
    public final Builder criteria(java.util.Optional<java.lang.String> criteria) {
      checkNotIsSet(criteriaIsSet(), "criteria");
      this.criteria = criteria.orElse(null);
      optBits |= OPT_BIT_CRITERIA;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#id() id} to id.
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
     * Initializes the optional value {@link Subscription#id() id} to id.
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
     * Initializes the optional value {@link Subscription#language() language} to language.
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
     * Initializes the optional value {@link Subscription#language() language} to language.
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
     * Initializes the optional value {@link Subscription#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(java.util.List<com.fhir.ContactPoint> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = java.util.Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public final Builder contact(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(java.lang.String reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = java.util.Objects.requireNonNull(reason, "reason");
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public final Builder reason(java.util.Optional<java.lang.String> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = reason.orElse(null);
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Subscription#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Subscription#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for chained invocation
     */
    public final Builder end(com.fhir.instant end) {
      checkNotIsSet(endIsSet(), "end");
      this.end = java.util.Objects.requireNonNull(end, "end");
      optBits |= OPT_BIT_END;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("end")
    public final Builder end(java.util.Optional<? extends com.fhir.instant> end) {
      checkNotIsSet(endIsSet(), "end");
      this.end = end.orElse(null);
      optBits |= OPT_BIT_END;
      return this;
    }

    /**
     * Builds a new {@link Subscription Subscription}.
     * @return An immutable instance of Subscription
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Subscription build() {
      checkRequiredAttributes();
      return new ImmutableSubscription(
          status,
          text,
          resourceType,
          contained,
          modifierExtension,
          error,
          channel,
          meta,
          extension,
          criteria,
          id,
          language,
          contact,
          reason,
          implicitRules,
          end);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean errorIsSet() {
      return (optBits & OPT_BIT_ERROR) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean criteriaIsSet() {
      return (optBits & OPT_BIT_CRITERIA) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean endIsSet() {
      return (optBits & OPT_BIT_END) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean channelIsSet() {
      return (initBits & INIT_BIT_CHANNEL) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Subscription is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!channelIsSet()) attributes.add("channel");
      return "Cannot build Subscription, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Subscription", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Subscription#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    ChannelBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Subscription", generator = "Immutables")
  public interface ChannelBuildStage {
    /**
     * Initializes the value for the {@link Subscription#channel() channel} attribute.
     * @param channel The value for channel 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal channel(com.fhir.Subscription_Channel channel);
  }

  @org.immutables.value.Generated(from = "Subscription", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Subscription#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.SubscriptionStatus status);

    /**
     * Initializes the optional value {@link Subscription#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.SubscriptionStatus> status);

    /**
     * Initializes the optional value {@link Subscription#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Subscription#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Subscription#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Subscription#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Subscription#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Subscription#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Subscription#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for chained invocation
     */
    BuildFinal error(java.lang.String error);

    /**
     * Initializes the optional value {@link Subscription#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal error(java.util.Optional<java.lang.String> error);

    /**
     * Initializes the optional value {@link Subscription#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Subscription#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Subscription#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Subscription#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Subscription#criteria() criteria} to criteria.
     * @param criteria The value for criteria
     * @return {@code this} builder for chained invocation
     */
    BuildFinal criteria(java.lang.String criteria);

    /**
     * Initializes the optional value {@link Subscription#criteria() criteria} to criteria.
     * @param criteria The value for criteria
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal criteria(java.util.Optional<java.lang.String> criteria);

    /**
     * Initializes the optional value {@link Subscription#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Subscription#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Subscription#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Subscription#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Subscription#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactPoint> contact);

    /**
     * Initializes the optional value {@link Subscription#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> contact);

    /**
     * Initializes the optional value {@link Subscription#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reason(java.lang.String reason);

    /**
     * Initializes the optional value {@link Subscription#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reason(java.util.Optional<java.lang.String> reason);

    /**
     * Initializes the optional value {@link Subscription#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Subscription#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Subscription#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for chained invocation
     */
    BuildFinal end(com.fhir.instant end);

    /**
     * Initializes the optional value {@link Subscription#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal end(java.util.Optional<? extends com.fhir.instant> end);

    /**
     * Builds a new {@link Subscription Subscription}.
     * @return An immutable instance of Subscription
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Subscription build();
  }
}
