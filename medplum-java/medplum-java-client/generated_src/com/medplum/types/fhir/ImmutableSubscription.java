package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Subscription}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubscription.builder()}.
 */
@Generated(from = "Subscription", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubscription implements Subscription {
  private final @Nullable List<ContactPoint> contact;
  private final @Nullable Narrative text;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable SubscriptionStatus status;
  private final @Nullable Instant end;
  private final @Nullable List<Extension> extension;
  private final @Nullable Id id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String error;
  private final @Nullable String criteria;
  private final @Nullable Meta meta;
  private final String resourceType;
  private final Subscription_Channel channel;
  private final @Nullable String reason;

  private ImmutableSubscription(
      @Nullable List<ContactPoint> contact,
      @Nullable Narrative text,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      @Nullable List<ResourceList> contained,
      @Nullable SubscriptionStatus status,
      @Nullable Instant end,
      @Nullable List<Extension> extension,
      @Nullable Id id,
      @Nullable List<Extension> modifierExtension,
      @Nullable String error,
      @Nullable String criteria,
      @Nullable Meta meta,
      String resourceType,
      Subscription_Channel channel,
      @Nullable String reason) {
    this.contact = contact;
    this.text = text;
    this.implicitRules = implicitRules;
    this.language = language;
    this.contained = contained;
    this.status = status;
    this.end = end;
    this.extension = extension;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.error = error;
    this.criteria = criteria;
    this.meta = meta;
    this.resourceType = resourceType;
    this.channel = channel;
    this.reason = reason;
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<ContactPoint>> contact() {
    return Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<SubscriptionStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code end} attribute
   */
  @JsonProperty("end")
  @Override
  public Optional<Instant> end() {
    return Optional.ofNullable(end);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code error} attribute
   */
  @JsonProperty("error")
  @Override
  public Optional<String> error() {
    return Optional.ofNullable(error);
  }

  /**
   * @return The value of the {@code criteria} attribute
   */
  @JsonProperty("criteria")
  @Override
  public Optional<String> criteria() {
    return Optional.ofNullable(criteria);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code channel} attribute
   */
  @JsonProperty("channel")
  @Override
  public Subscription_Channel channel() {
    return channel;
  }

  /**
   * @return The value of the {@code reason} attribute
   */
  @JsonProperty("reason")
  @Override
  public Optional<String> reason() {
    return Optional.ofNullable(reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withContact(List<ContactPoint> value) {
    @Nullable List<ContactPoint> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableSubscription(
        newValue,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withContact(Optional<? extends List<ContactPoint>> optional) {
    @Nullable List<ContactPoint> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableSubscription(
        value,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSubscription(
        this.contact,
        newValue,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSubscription(
        this.contact,
        value,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        newValue,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        value,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        newValue,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        value,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        newValue,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        value,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withStatus(SubscriptionStatus value) {
    @Nullable SubscriptionStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        newValue,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withStatus(Optional<? extends SubscriptionStatus> optional) {
    @Nullable SubscriptionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        value,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#end() end} attribute.
   * @param value The value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withEnd(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "end");
    if (this.end == newValue) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        newValue,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#end() end} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for end
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withEnd(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.end == value) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        value,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        newValue,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        value,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        newValue,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        value,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        newValue,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        value,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#error() error} attribute.
   * @param value The value for error
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withError(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "error");
    if (Objects.equals(this.error, newValue)) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        newValue,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#error() error} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for error
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withError(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.error, value)) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        value,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#criteria() criteria} attribute.
   * @param value The value for criteria
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withCriteria(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "criteria");
    if (Objects.equals(this.criteria, newValue)) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        newValue,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#criteria() criteria} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for criteria
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withCriteria(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.criteria, value)) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        value,
        this.meta,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        newValue,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubscription withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        value,
        this.resourceType,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Subscription#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubscription withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        newValue,
        this.channel,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Subscription#channel() channel} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for channel
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubscription withChannel(Subscription_Channel value) {
    if (this.channel == value) return this;
    Subscription_Channel newValue = Objects.requireNonNull(value, "channel");
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        newValue,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Subscription#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withReason(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "reason");
    if (Objects.equals(this.reason, newValue)) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Subscription#reason() reason} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubscription withReason(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.reason, value)) return this;
    return new ImmutableSubscription(
        this.contact,
        this.text,
        this.implicitRules,
        this.language,
        this.contained,
        this.status,
        this.end,
        this.extension,
        this.id,
        this.modifierExtension,
        this.error,
        this.criteria,
        this.meta,
        this.resourceType,
        this.channel,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubscription} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubscription
        && equalTo((ImmutableSubscription) another);
  }

  private boolean equalTo(ImmutableSubscription another) {
    return Objects.equals(contact, another.contact)
        && Objects.equals(text, another.text)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && Objects.equals(contained, another.contained)
        && Objects.equals(status, another.status)
        && Objects.equals(end, another.end)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(error, another.error)
        && Objects.equals(criteria, another.criteria)
        && Objects.equals(meta, another.meta)
        && resourceType.equals(another.resourceType)
        && channel.equals(another.channel)
        && Objects.equals(reason, another.reason);
  }

  /**
   * Computes a hash code from attributes: {@code contact}, {@code text}, {@code implicitRules}, {@code language}, {@code contained}, {@code status}, {@code end}, {@code extension}, {@code id}, {@code modifierExtension}, {@code error}, {@code criteria}, {@code meta}, {@code resourceType}, {@code channel}, {@code reason}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(end);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(error);
    h += (h << 5) + Objects.hashCode(criteria);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + channel.hashCode();
    h += (h << 5) + Objects.hashCode(reason);
    return h;
  }

  /**
   * Prints the immutable value {@code Subscription} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Subscription{");
    if (contact != null) {
      builder.append("contact=").append(contact);
    }
    if (text != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (implicitRules != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (contained != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (status != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (end != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("end=").append(end);
    }
    if (extension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (error != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("error=").append(error);
    }
    if (criteria != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("criteria=").append(criteria);
    }
    if (meta != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    builder.append(", ");
    builder.append("channel=").append(channel);
    if (reason != null) {
      builder.append(", ");
      builder.append("reason=").append(reason);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Subscription", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Subscription {
    @Nullable Optional<List<ContactPoint>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<SubscriptionStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Instant> end = Optional.empty();
    boolean endIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> error = Optional.empty();
    boolean errorIsSet;
    @Nullable Optional<String> criteria = Optional.empty();
    boolean criteriaIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable String resourceType;
    @Nullable Subscription_Channel channel;
    @Nullable Optional<String> reason = Optional.empty();
    boolean reasonIsSet;
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactPoint>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<SubscriptionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("end")
    public void setEnd(Optional<Instant> end) {
      this.end = end;
      this.endIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("error")
    public void setError(Optional<String> error) {
      this.error = error;
      this.errorIsSet = true;
    }
    @JsonProperty("criteria")
    public void setCriteria(Optional<String> criteria) {
      this.criteria = criteria;
      this.criteriaIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("channel")
    public void setChannel(Subscription_Channel channel) {
      this.channel = channel;
    }
    @JsonProperty("reason")
    public void setReason(Optional<String> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @Override
    public Optional<List<ContactPoint>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SubscriptionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> end() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> error() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> criteria() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Subscription_Channel channel() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> reason() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubscription fromJson(Json json) {
    ImmutableSubscription.Builder builder = ((ImmutableSubscription.Builder) ImmutableSubscription.builder());
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.endIsSet) {
      builder.end(json.end);
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
    if (json.errorIsSet) {
      builder.error(json.error);
    }
    if (json.criteriaIsSet) {
      builder.criteria(json.criteria);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.channel != null) {
      builder.channel(json.channel);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
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
        .contact(instance.contact())
        .text(instance.text())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .contained(instance.contained())
        .status(instance.status())
        .end(instance.end())
        .extension(instance.extension())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .error(instance.error())
        .criteria(instance.criteria())
        .meta(instance.meta())
        .resourceType(instance.resourceType())
        .channel(instance.channel())
        .reason(instance.reason())
        .build();
  }

  /**
   * Creates a builder for {@link Subscription Subscription}.
   * <pre>
   * ImmutableSubscription.builder()
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactPoint&amp;gt;) // optional {@link Subscription#contact() contact}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Subscription#text() text}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Subscription#implicitRules() implicitRules}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Subscription#language() language}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Subscription#contained() contained}
   *    .status(com.medplum.types.fhir.SubscriptionStatus) // optional {@link Subscription#status() status}
   *    .end(com.medplum.types.fhir.Instant) // optional {@link Subscription#end() end}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Subscription#extension() extension}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Subscription#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Subscription#modifierExtension() modifierExtension}
   *    .error(String) // optional {@link Subscription#error() error}
   *    .criteria(String) // optional {@link Subscription#criteria() criteria}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Subscription#meta() meta}
   *    .resourceType(String) // required {@link Subscription#resourceType() resourceType}
   *    .channel(com.medplum.types.fhir.Subscription_Channel) // required {@link Subscription#channel() channel}
   *    .reason(String) // optional {@link Subscription#reason() reason}
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
  @Generated(from = "Subscription", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, ChannelBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_CHANNEL = 0x2L;
    private static final long OPT_BIT_CONTACT = 0x1L;
    private static final long OPT_BIT_TEXT = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_CONTAINED = 0x10L;
    private static final long OPT_BIT_STATUS = 0x20L;
    private static final long OPT_BIT_END = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_ERROR = 0x400L;
    private static final long OPT_BIT_CRITERIA = 0x800L;
    private static final long OPT_BIT_META = 0x1000L;
    private static final long OPT_BIT_REASON = 0x2000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<ContactPoint> contact;
    private @Nullable Narrative text;
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable List<ResourceList> contained;
    private @Nullable SubscriptionStatus status;
    private @Nullable Instant end;
    private @Nullable List<Extension> extension;
    private @Nullable Id id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String error;
    private @Nullable String criteria;
    private @Nullable Meta meta;
    private @Nullable String resourceType;
    private @Nullable Subscription_Channel channel;
    private @Nullable String reason;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Subscription#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(List<ContactPoint> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contact")
    public final Builder contact(Optional<? extends List<ContactPoint>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<? extends Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(List<ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contained")
    public final Builder contained(Optional<? extends List<ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(SubscriptionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends SubscriptionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for chained invocation
     */
    public final Builder end(Instant end) {
      checkNotIsSet(endIsSet(), "end");
      this.end = Objects.requireNonNull(end, "end");
      optBits |= OPT_BIT_END;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("end")
    public final Builder end(Optional<? extends Instant> end) {
      checkNotIsSet(endIsSet(), "end");
      this.end = end.orElse(null);
      optBits |= OPT_BIT_END;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
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
    public final Builder error(String error) {
      checkNotIsSet(errorIsSet(), "error");
      this.error = Objects.requireNonNull(error, "error");
      optBits |= OPT_BIT_ERROR;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("error")
    public final Builder error(Optional<String> error) {
      checkNotIsSet(errorIsSet(), "error");
      this.error = error.orElse(null);
      optBits |= OPT_BIT_ERROR;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#criteria() criteria} to criteria.
     * @param criteria The value for criteria
     * @return {@code this} builder for chained invocation
     */
    public final Builder criteria(String criteria) {
      checkNotIsSet(criteriaIsSet(), "criteria");
      this.criteria = Objects.requireNonNull(criteria, "criteria");
      optBits |= OPT_BIT_CRITERIA;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#criteria() criteria} to criteria.
     * @param criteria The value for criteria
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("criteria")
    public final Builder criteria(Optional<String> criteria) {
      checkNotIsSet(criteriaIsSet(), "criteria");
      this.criteria = criteria.orElse(null);
      optBits |= OPT_BIT_CRITERIA;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the value for the {@link Subscription#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link Subscription#channel() channel} attribute.
     * @param channel The value for channel 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("channel")
    public final Builder channel(Subscription_Channel channel) {
      checkNotIsSet(channelIsSet(), "channel");
      this.channel = Objects.requireNonNull(channel, "channel");
      initBits &= ~INIT_BIT_CHANNEL;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(String reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = Objects.requireNonNull(reason, "reason");
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Subscription#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reason")
    public final Builder reason(Optional<String> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = reason.orElse(null);
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Builds a new {@link Subscription Subscription}.
     * @return An immutable instance of Subscription
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Subscription build() {
      checkRequiredAttributes();
      return new ImmutableSubscription(
          contact,
          text,
          implicitRules,
          language,
          contained,
          status,
          end,
          extension,
          id,
          modifierExtension,
          error,
          criteria,
          meta,
          resourceType,
          channel,
          reason);
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean endIsSet() {
      return (optBits & OPT_BIT_END) != 0;
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

    private boolean errorIsSet() {
      return (optBits & OPT_BIT_ERROR) != 0;
    }

    private boolean criteriaIsSet() {
      return (optBits & OPT_BIT_CRITERIA) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean channelIsSet() {
      return (initBits & INIT_BIT_CHANNEL) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Subscription is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!channelIsSet()) attributes.add("channel");
      return "Cannot build Subscription, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Subscription", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Subscription#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    ChannelBuildStage resourceType(String resourceType);
  }

  @Generated(from = "Subscription", generator = "Immutables")
  public interface ChannelBuildStage {
    /**
     * Initializes the value for the {@link Subscription#channel() channel} attribute.
     * @param channel The value for channel 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal channel(Subscription_Channel channel);
  }

  @Generated(from = "Subscription", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Subscription#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactPoint> contact);

    /**
     * Initializes the optional value {@link Subscription#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactPoint>> contact);

    /**
     * Initializes the optional value {@link Subscription#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Subscription#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Subscription#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Subscription#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Subscription#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Subscription#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Subscription#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Subscription#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Subscription#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(SubscriptionStatus status);

    /**
     * Initializes the optional value {@link Subscription#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends SubscriptionStatus> status);

    /**
     * Initializes the optional value {@link Subscription#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for chained invocation
     */
    BuildFinal end(Instant end);

    /**
     * Initializes the optional value {@link Subscription#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal end(Optional<? extends Instant> end);

    /**
     * Initializes the optional value {@link Subscription#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Subscription#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Subscription#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Subscription#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Subscription#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Subscription#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Subscription#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for chained invocation
     */
    BuildFinal error(String error);

    /**
     * Initializes the optional value {@link Subscription#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal error(Optional<String> error);

    /**
     * Initializes the optional value {@link Subscription#criteria() criteria} to criteria.
     * @param criteria The value for criteria
     * @return {@code this} builder for chained invocation
     */
    BuildFinal criteria(String criteria);

    /**
     * Initializes the optional value {@link Subscription#criteria() criteria} to criteria.
     * @param criteria The value for criteria
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal criteria(Optional<String> criteria);

    /**
     * Initializes the optional value {@link Subscription#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Subscription#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Subscription#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reason(String reason);

    /**
     * Initializes the optional value {@link Subscription#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reason(Optional<String> reason);

    /**
     * Builds a new {@link Subscription Subscription}.
     * @return An immutable instance of Subscription
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Subscription build();
  }
}
