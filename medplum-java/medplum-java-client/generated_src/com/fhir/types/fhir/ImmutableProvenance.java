package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Provenance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProvenance.builder()}.
 */
@Generated(from = "Provenance", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableProvenance implements Provenance {
  private final @Nullable Narrative text;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Uri> policy;
  private final List<Provenance_Agent> agent;
  private final @Nullable String occurredDateTime;
  private final @Nullable List<Signature> signature;
  private final @Nullable List<CodeableConcept> reason;
  private final @Nullable Reference location;
  private final @Nullable Uri implicitRules;
  private final List<Reference> target;
  private final @Nullable List<ResourceList> contained;
  private final String resourceType;
  private final @Nullable CodeableConcept activity;
  private final @Nullable List<Extension> extension;
  private final @Nullable Period occurredPeriod;
  private final @Nullable Id id;
  private final @Nullable Meta meta;
  private final @Nullable Code language;
  private final @Nullable Instant recorded;
  private final @Nullable List<Provenance_Entity> entity;

  private ImmutableProvenance(
      @Nullable Narrative text,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Uri> policy,
      List<Provenance_Agent> agent,
      @Nullable String occurredDateTime,
      @Nullable List<Signature> signature,
      @Nullable List<CodeableConcept> reason,
      @Nullable Reference location,
      @Nullable Uri implicitRules,
      List<Reference> target,
      @Nullable List<ResourceList> contained,
      String resourceType,
      @Nullable CodeableConcept activity,
      @Nullable List<Extension> extension,
      @Nullable Period occurredPeriod,
      @Nullable Id id,
      @Nullable Meta meta,
      @Nullable Code language,
      @Nullable Instant recorded,
      @Nullable List<Provenance_Entity> entity) {
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.policy = policy;
    this.agent = agent;
    this.occurredDateTime = occurredDateTime;
    this.signature = signature;
    this.reason = reason;
    this.location = location;
    this.implicitRules = implicitRules;
    this.target = target;
    this.contained = contained;
    this.resourceType = resourceType;
    this.activity = activity;
    this.extension = extension;
    this.occurredPeriod = occurredPeriod;
    this.id = id;
    this.meta = meta;
    this.language = language;
    this.recorded = recorded;
    this.entity = entity;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code policy} attribute
   */
  @JsonProperty("policy")
  @Override
  public Optional<List<Uri>> policy() {
    return Optional.ofNullable(policy);
  }

  /**
   * @return The value of the {@code agent} attribute
   */
  @JsonProperty("agent")
  @Override
  public List<Provenance_Agent> agent() {
    return agent;
  }

  /**
   * @return The value of the {@code occurredDateTime} attribute
   */
  @JsonProperty("occurredDateTime")
  @Override
  public Optional<String> occurredDateTime() {
    return Optional.ofNullable(occurredDateTime);
  }

  /**
   * @return The value of the {@code signature} attribute
   */
  @JsonProperty("signature")
  @Override
  public Optional<List<Signature>> signature() {
    return Optional.ofNullable(signature);
  }

  /**
   * @return The value of the {@code reason} attribute
   */
  @JsonProperty("reason")
  @Override
  public Optional<List<CodeableConcept>> reason() {
    return Optional.ofNullable(reason);
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Optional<Reference> location() {
    return Optional.ofNullable(location);
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
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public List<Reference> target() {
    return target;
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code activity} attribute
   */
  @JsonProperty("activity")
  @Override
  public Optional<CodeableConcept> activity() {
    return Optional.ofNullable(activity);
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
   * @return The value of the {@code occurredPeriod} attribute
   */
  @JsonProperty("occurredPeriod")
  @Override
  public Optional<Period> occurredPeriod() {
    return Optional.ofNullable(occurredPeriod);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code recorded} attribute
   */
  @JsonProperty("recorded")
  @Override
  public Optional<Instant> recorded() {
    return Optional.ofNullable(recorded);
  }

  /**
   * @return The value of the {@code entity} attribute
   */
  @JsonProperty("entity")
  @Override
  public Optional<List<Provenance_Entity>> entity() {
    return Optional.ofNullable(entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableProvenance(
        newValue,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableProvenance(
        value,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableProvenance(
        this.text,
        newValue,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableProvenance(
        this.text,
        value,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#policy() policy} attribute.
   * @param value The value for policy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withPolicy(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "policy");
    if (this.policy == newValue) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        newValue,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#policy() policy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for policy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withPolicy(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.policy == value) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        value,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Provenance#agent() agent}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withAgent(Provenance_Agent... elements) {
    List<Provenance_Agent> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        newValue,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Provenance#agent() agent}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of agent elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withAgent(Iterable<? extends Provenance_Agent> elements) {
    if (this.agent == elements) return this;
    List<Provenance_Agent> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        newValue,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#occurredDateTime() occurredDateTime} attribute.
   * @param value The value for occurredDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withOccurredDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "occurredDateTime");
    if (Objects.equals(this.occurredDateTime, newValue)) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        newValue,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#occurredDateTime() occurredDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurredDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withOccurredDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.occurredDateTime, value)) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        value,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#signature() signature} attribute.
   * @param value The value for signature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withSignature(List<Signature> value) {
    @Nullable List<Signature> newValue = Objects.requireNonNull(value, "signature");
    if (this.signature == newValue) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        newValue,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#signature() signature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for signature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withSignature(Optional<? extends List<Signature>> optional) {
    @Nullable List<Signature> value = optional.orElse(null);
    if (this.signature == value) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        value,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withReason(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        newValue,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withReason(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        value,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withLocation(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        newValue,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withLocation(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        value,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        newValue,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        value,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Provenance#target() target}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withTarget(Reference... elements) {
    List<Reference> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        newValue,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Provenance#target() target}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of target elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withTarget(Iterable<? extends Reference> elements) {
    if (this.target == elements) return this;
    List<Reference> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        newValue,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        newValue,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        value,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Provenance#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProvenance withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        newValue,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#activity() activity} attribute.
   * @param value The value for activity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withActivity(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "activity");
    if (this.activity == newValue) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        newValue,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#activity() activity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for activity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withActivity(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.activity == value) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        value,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        newValue,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        value,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#occurredPeriod() occurredPeriod} attribute.
   * @param value The value for occurredPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withOccurredPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "occurredPeriod");
    if (this.occurredPeriod == newValue) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        newValue,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#occurredPeriod() occurredPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurredPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withOccurredPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.occurredPeriod == value) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        value,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        newValue,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        value,
        this.meta,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        newValue,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        value,
        this.language,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        newValue,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        value,
        this.recorded,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#recorded() recorded} attribute.
   * @param value The value for recorded
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withRecorded(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "recorded");
    if (this.recorded == newValue) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        newValue,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#recorded() recorded} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recorded
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withRecorded(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.recorded == value) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        value,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#entity() entity} attribute.
   * @param value The value for entity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withEntity(List<Provenance_Entity> value) {
    @Nullable List<Provenance_Entity> newValue = Objects.requireNonNull(value, "entity");
    if (this.entity == newValue) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#entity() entity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withEntity(Optional<? extends List<Provenance_Entity>> optional) {
    @Nullable List<Provenance_Entity> value = optional.orElse(null);
    if (this.entity == value) return this;
    return new ImmutableProvenance(
        this.text,
        this.modifierExtension,
        this.policy,
        this.agent,
        this.occurredDateTime,
        this.signature,
        this.reason,
        this.location,
        this.implicitRules,
        this.target,
        this.contained,
        this.resourceType,
        this.activity,
        this.extension,
        this.occurredPeriod,
        this.id,
        this.meta,
        this.language,
        this.recorded,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProvenance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProvenance
        && equalTo((ImmutableProvenance) another);
  }

  private boolean equalTo(ImmutableProvenance another) {
    return Objects.equals(text, another.text)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(policy, another.policy)
        && agent.equals(another.agent)
        && Objects.equals(occurredDateTime, another.occurredDateTime)
        && Objects.equals(signature, another.signature)
        && Objects.equals(reason, another.reason)
        && Objects.equals(location, another.location)
        && Objects.equals(implicitRules, another.implicitRules)
        && target.equals(another.target)
        && Objects.equals(contained, another.contained)
        && resourceType.equals(another.resourceType)
        && Objects.equals(activity, another.activity)
        && Objects.equals(extension, another.extension)
        && Objects.equals(occurredPeriod, another.occurredPeriod)
        && Objects.equals(id, another.id)
        && Objects.equals(meta, another.meta)
        && Objects.equals(language, another.language)
        && Objects.equals(recorded, another.recorded)
        && Objects.equals(entity, another.entity);
  }

  /**
   * Computes a hash code from attributes: {@code text}, {@code modifierExtension}, {@code policy}, {@code agent}, {@code occurredDateTime}, {@code signature}, {@code reason}, {@code location}, {@code implicitRules}, {@code target}, {@code contained}, {@code resourceType}, {@code activity}, {@code extension}, {@code occurredPeriod}, {@code id}, {@code meta}, {@code language}, {@code recorded}, {@code entity}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(policy);
    h += (h << 5) + agent.hashCode();
    h += (h << 5) + Objects.hashCode(occurredDateTime);
    h += (h << 5) + Objects.hashCode(signature);
    h += (h << 5) + Objects.hashCode(reason);
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + target.hashCode();
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(activity);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(occurredPeriod);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(recorded);
    h += (h << 5) + Objects.hashCode(entity);
    return h;
  }

  /**
   * Prints the immutable value {@code Provenance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Provenance{");
    if (text != null) {
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (policy != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("policy=").append(policy);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("agent=").append(agent);
    if (occurredDateTime != null) {
      builder.append(", ");
      builder.append("occurredDateTime=").append(occurredDateTime);
    }
    if (signature != null) {
      builder.append(", ");
      builder.append("signature=").append(signature);
    }
    if (reason != null) {
      builder.append(", ");
      builder.append("reason=").append(reason);
    }
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    builder.append(", ");
    builder.append("target=").append(target);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (activity != null) {
      builder.append(", ");
      builder.append("activity=").append(activity);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (occurredPeriod != null) {
      builder.append(", ");
      builder.append("occurredPeriod=").append(occurredPeriod);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (recorded != null) {
      builder.append(", ");
      builder.append("recorded=").append(recorded);
    }
    if (entity != null) {
      builder.append(", ");
      builder.append("entity=").append(entity);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Provenance", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Provenance {
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Uri>> policy = Optional.empty();
    boolean policyIsSet;
    @Nullable List<Provenance_Agent> agent = Collections.emptyList();
    @Nullable Optional<String> occurredDateTime = Optional.empty();
    boolean occurredDateTimeIsSet;
    @Nullable Optional<List<Signature>> signature = Optional.empty();
    boolean signatureIsSet;
    @Nullable Optional<List<CodeableConcept>> reason = Optional.empty();
    boolean reasonIsSet;
    @Nullable Optional<Reference> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable List<Reference> target = Collections.emptyList();
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable String resourceType;
    @Nullable Optional<CodeableConcept> activity = Optional.empty();
    boolean activityIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Period> occurredPeriod = Optional.empty();
    boolean occurredPeriodIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Instant> recorded = Optional.empty();
    boolean recordedIsSet;
    @Nullable Optional<List<Provenance_Entity>> entity = Optional.empty();
    boolean entityIsSet;
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("policy")
    public void setPolicy(Optional<List<Uri>> policy) {
      this.policy = policy;
      this.policyIsSet = true;
    }
    @JsonProperty("agent")
    public void setAgent(List<Provenance_Agent> agent) {
      this.agent = agent;
    }
    @JsonProperty("occurredDateTime")
    public void setOccurredDateTime(Optional<String> occurredDateTime) {
      this.occurredDateTime = occurredDateTime;
      this.occurredDateTimeIsSet = true;
    }
    @JsonProperty("signature")
    public void setSignature(Optional<List<Signature>> signature) {
      this.signature = signature;
      this.signatureIsSet = true;
    }
    @JsonProperty("reason")
    public void setReason(Optional<List<CodeableConcept>> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Optional<Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("target")
    public void setTarget(List<Reference> target) {
      this.target = target;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("activity")
    public void setActivity(Optional<CodeableConcept> activity) {
      this.activity = activity;
      this.activityIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("occurredPeriod")
    public void setOccurredPeriod(Optional<Period> occurredPeriod) {
      this.occurredPeriod = occurredPeriod;
      this.occurredPeriodIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("recorded")
    public void setRecorded(Optional<Instant> recorded) {
      this.recorded = recorded;
      this.recordedIsSet = true;
    }
    @JsonProperty("entity")
    public void setEntity(Optional<List<Provenance_Entity>> entity) {
      this.entity = entity;
      this.entityIsSet = true;
    }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> policy() { throw new UnsupportedOperationException(); }
    @Override
    public List<Provenance_Agent> agent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> occurredDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Signature>> signature() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public List<Reference> target() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> activity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> occurredPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> recorded() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Provenance_Entity>> entity() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableProvenance fromJson(Json json) {
    ImmutableProvenance.Builder builder = ((ImmutableProvenance.Builder) ImmutableProvenance.builder());
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.policyIsSet) {
      builder.policy(json.policy);
    }
    if (json.agent != null) {
      builder.addAllAgent(json.agent);
    }
    if (json.occurredDateTimeIsSet) {
      builder.occurredDateTime(json.occurredDateTime);
    }
    if (json.signatureIsSet) {
      builder.signature(json.signature);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.target != null) {
      builder.addAllTarget(json.target);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.activityIsSet) {
      builder.activity(json.activity);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.occurredPeriodIsSet) {
      builder.occurredPeriod(json.occurredPeriod);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.recordedIsSet) {
      builder.recorded(json.recorded);
    }
    if (json.entityIsSet) {
      builder.entity(json.entity);
    }
    return (ImmutableProvenance) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Provenance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Provenance instance
   */
  public static Provenance copyOf(Provenance instance) {
    if (instance instanceof ImmutableProvenance) {
      return (ImmutableProvenance) instance;
    }
    return ((ImmutableProvenance.Builder) ImmutableProvenance.builder())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .policy(instance.policy())
        .addAllAgent(instance.agent())
        .occurredDateTime(instance.occurredDateTime())
        .signature(instance.signature())
        .reason(instance.reason())
        .location(instance.location())
        .implicitRules(instance.implicitRules())
        .addAllTarget(instance.target())
        .contained(instance.contained())
        .resourceType(instance.resourceType())
        .activity(instance.activity())
        .extension(instance.extension())
        .occurredPeriod(instance.occurredPeriod())
        .id(instance.id())
        .meta(instance.meta())
        .language(instance.language())
        .recorded(instance.recorded())
        .entity(instance.entity())
        .build();
  }

  /**
   * Creates a builder for {@link Provenance Provenance}.
   * <pre>
   * ImmutableProvenance.builder()
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Provenance#text() text}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Provenance#modifierExtension() modifierExtension}
   *    .policy(List&amp;lt;com.fhir.types.fhir.Uri&amp;gt;) // optional {@link Provenance#policy() policy}
   *    .addAgent|addAllAgent(com.fhir.types.fhir.Provenance_Agent) // {@link Provenance#agent() agent} elements
   *    .occurredDateTime(String) // optional {@link Provenance#occurredDateTime() occurredDateTime}
   *    .signature(List&amp;lt;com.fhir.types.fhir.Signature&amp;gt;) // optional {@link Provenance#signature() signature}
   *    .reason(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Provenance#reason() reason}
   *    .location(com.fhir.types.fhir.Reference) // optional {@link Provenance#location() location}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Provenance#implicitRules() implicitRules}
   *    .addTarget|addAllTarget(com.fhir.types.fhir.Reference) // {@link Provenance#target() target} elements
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Provenance#contained() contained}
   *    .resourceType(String) // required {@link Provenance#resourceType() resourceType}
   *    .activity(com.fhir.types.fhir.CodeableConcept) // optional {@link Provenance#activity() activity}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Provenance#extension() extension}
   *    .occurredPeriod(com.fhir.types.fhir.Period) // optional {@link Provenance#occurredPeriod() occurredPeriod}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Provenance#id() id}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Provenance#meta() meta}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Provenance#language() language}
   *    .recorded(com.fhir.types.fhir.Instant) // optional {@link Provenance#recorded() recorded}
   *    .entity(List&amp;lt;com.fhir.types.fhir.Provenance_Entity&amp;gt;) // optional {@link Provenance#entity() entity}
   *    .build();
   * </pre>
   * @return A new Provenance builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableProvenance.Builder();
  }

  /**
   * Builds instances of type {@link Provenance Provenance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Provenance", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_TEXT = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_POLICY = 0x4L;
    private static final long OPT_BIT_OCCURRED_DATE_TIME = 0x8L;
    private static final long OPT_BIT_SIGNATURE = 0x10L;
    private static final long OPT_BIT_REASON = 0x20L;
    private static final long OPT_BIT_LOCATION = 0x40L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80L;
    private static final long OPT_BIT_CONTAINED = 0x100L;
    private static final long OPT_BIT_ACTIVITY = 0x200L;
    private static final long OPT_BIT_EXTENSION = 0x400L;
    private static final long OPT_BIT_OCCURRED_PERIOD = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private static final long OPT_BIT_META = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private static final long OPT_BIT_RECORDED = 0x8000L;
    private static final long OPT_BIT_ENTITY = 0x10000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Narrative text;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Uri> policy;
    private final List<Provenance_Agent> agent = new ArrayList<Provenance_Agent>();
    private @Nullable String occurredDateTime;
    private @Nullable List<Signature> signature;
    private @Nullable List<CodeableConcept> reason;
    private @Nullable Reference location;
    private @Nullable Uri implicitRules;
    private final List<Reference> target = new ArrayList<Reference>();
    private @Nullable List<ResourceList> contained;
    private @Nullable String resourceType;
    private @Nullable CodeableConcept activity;
    private @Nullable List<Extension> extension;
    private @Nullable Period occurredPeriod;
    private @Nullable Id id;
    private @Nullable Meta meta;
    private @Nullable Code language;
    private @Nullable Instant recorded;
    private @Nullable List<Provenance_Entity> entity;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Provenance#text() text} to text.
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
     * Initializes the optional value {@link Provenance#text() text} to text.
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
     * Initializes the optional value {@link Provenance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Provenance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Provenance#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for chained invocation
     */
    public final Builder policy(List<Uri> policy) {
      checkNotIsSet(policyIsSet(), "policy");
      this.policy = Objects.requireNonNull(policy, "policy");
      optBits |= OPT_BIT_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("policy")
    public final Builder policy(Optional<? extends List<Uri>> policy) {
      checkNotIsSet(policyIsSet(), "policy");
      this.policy = policy.orElse(null);
      optBits |= OPT_BIT_POLICY;
      return this;
    }

    /**
     * Adds one element to {@link Provenance#agent() agent} list.
     * @param element A agent element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAgent(Provenance_Agent element) {
      this.agent.add(Objects.requireNonNull(element, "agent element"));
      return this;
    }

    /**
     * Adds elements to {@link Provenance#agent() agent} list.
     * @param elements An array of agent elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAgent(Provenance_Agent... elements) {
      for (Provenance_Agent element : elements) {
        this.agent.add(Objects.requireNonNull(element, "agent element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Provenance#agent() agent} list.
     * @param elements An iterable of agent elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAgent(Iterable<? extends Provenance_Agent> elements) {
      for (Provenance_Agent element : elements) {
        this.agent.add(Objects.requireNonNull(element, "agent element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#occurredDateTime() occurredDateTime} to occurredDateTime.
     * @param occurredDateTime The value for occurredDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurredDateTime(String occurredDateTime) {
      checkNotIsSet(occurredDateTimeIsSet(), "occurredDateTime");
      this.occurredDateTime = Objects.requireNonNull(occurredDateTime, "occurredDateTime");
      optBits |= OPT_BIT_OCCURRED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#occurredDateTime() occurredDateTime} to occurredDateTime.
     * @param occurredDateTime The value for occurredDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("occurredDateTime")
    public final Builder occurredDateTime(Optional<String> occurredDateTime) {
      checkNotIsSet(occurredDateTimeIsSet(), "occurredDateTime");
      this.occurredDateTime = occurredDateTime.orElse(null);
      optBits |= OPT_BIT_OCCURRED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#signature() signature} to signature.
     * @param signature The value for signature
     * @return {@code this} builder for chained invocation
     */
    public final Builder signature(List<Signature> signature) {
      checkNotIsSet(signatureIsSet(), "signature");
      this.signature = Objects.requireNonNull(signature, "signature");
      optBits |= OPT_BIT_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#signature() signature} to signature.
     * @param signature The value for signature
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("signature")
    public final Builder signature(Optional<? extends List<Signature>> signature) {
      checkNotIsSet(signatureIsSet(), "signature");
      this.signature = signature.orElse(null);
      optBits |= OPT_BIT_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(List<CodeableConcept> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = Objects.requireNonNull(reason, "reason");
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reason")
    public final Builder reason(Optional<? extends List<CodeableConcept>> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = reason.orElse(null);
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(Optional<? extends Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Provenance#implicitRules() implicitRules} to implicitRules.
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
     * Adds one element to {@link Provenance#target() target} list.
     * @param element A target element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTarget(Reference element) {
      this.target.add(Objects.requireNonNull(element, "target element"));
      return this;
    }

    /**
     * Adds elements to {@link Provenance#target() target} list.
     * @param elements An array of target elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTarget(Reference... elements) {
      for (Reference element : elements) {
        this.target.add(Objects.requireNonNull(element, "target element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Provenance#target() target} list.
     * @param elements An iterable of target elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllTarget(Iterable<? extends Reference> elements) {
      for (Reference element : elements) {
        this.target.add(Objects.requireNonNull(element, "target element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#contained() contained} to contained.
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
     * Initializes the optional value {@link Provenance#contained() contained} to contained.
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
     * Initializes the value for the {@link Provenance#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Provenance#activity() activity} to activity.
     * @param activity The value for activity
     * @return {@code this} builder for chained invocation
     */
    public final Builder activity(CodeableConcept activity) {
      checkNotIsSet(activityIsSet(), "activity");
      this.activity = Objects.requireNonNull(activity, "activity");
      optBits |= OPT_BIT_ACTIVITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#activity() activity} to activity.
     * @param activity The value for activity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("activity")
    public final Builder activity(Optional<? extends CodeableConcept> activity) {
      checkNotIsSet(activityIsSet(), "activity");
      this.activity = activity.orElse(null);
      optBits |= OPT_BIT_ACTIVITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#extension() extension} to extension.
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
     * Initializes the optional value {@link Provenance#extension() extension} to extension.
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
     * Initializes the optional value {@link Provenance#occurredPeriod() occurredPeriod} to occurredPeriod.
     * @param occurredPeriod The value for occurredPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurredPeriod(Period occurredPeriod) {
      checkNotIsSet(occurredPeriodIsSet(), "occurredPeriod");
      this.occurredPeriod = Objects.requireNonNull(occurredPeriod, "occurredPeriod");
      optBits |= OPT_BIT_OCCURRED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#occurredPeriod() occurredPeriod} to occurredPeriod.
     * @param occurredPeriod The value for occurredPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("occurredPeriod")
    public final Builder occurredPeriod(Optional<? extends Period> occurredPeriod) {
      checkNotIsSet(occurredPeriodIsSet(), "occurredPeriod");
      this.occurredPeriod = occurredPeriod.orElse(null);
      optBits |= OPT_BIT_OCCURRED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#id() id} to id.
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
     * Initializes the optional value {@link Provenance#id() id} to id.
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
     * Initializes the optional value {@link Provenance#meta() meta} to meta.
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
     * Initializes the optional value {@link Provenance#meta() meta} to meta.
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
     * Initializes the optional value {@link Provenance#language() language} to language.
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
     * Initializes the optional value {@link Provenance#language() language} to language.
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
     * Initializes the optional value {@link Provenance#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for chained invocation
     */
    public final Builder recorded(Instant recorded) {
      checkNotIsSet(recordedIsSet(), "recorded");
      this.recorded = Objects.requireNonNull(recorded, "recorded");
      optBits |= OPT_BIT_RECORDED;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("recorded")
    public final Builder recorded(Optional<? extends Instant> recorded) {
      checkNotIsSet(recordedIsSet(), "recorded");
      this.recorded = recorded.orElse(null);
      optBits |= OPT_BIT_RECORDED;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#entity() entity} to entity.
     * @param entity The value for entity
     * @return {@code this} builder for chained invocation
     */
    public final Builder entity(List<Provenance_Entity> entity) {
      checkNotIsSet(entityIsSet(), "entity");
      this.entity = Objects.requireNonNull(entity, "entity");
      optBits |= OPT_BIT_ENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#entity() entity} to entity.
     * @param entity The value for entity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entity")
    public final Builder entity(Optional<? extends List<Provenance_Entity>> entity) {
      checkNotIsSet(entityIsSet(), "entity");
      this.entity = entity.orElse(null);
      optBits |= OPT_BIT_ENTITY;
      return this;
    }

    /**
     * Builds a new {@link Provenance Provenance}.
     * @return An immutable instance of Provenance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Provenance build() {
      checkRequiredAttributes();
      return new ImmutableProvenance(
          text,
          modifierExtension,
          policy,
          createUnmodifiableList(true, agent),
          occurredDateTime,
          signature,
          reason,
          location,
          implicitRules,
          createUnmodifiableList(true, target),
          contained,
          resourceType,
          activity,
          extension,
          occurredPeriod,
          id,
          meta,
          language,
          recorded,
          entity);
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean policyIsSet() {
      return (optBits & OPT_BIT_POLICY) != 0;
    }

    private boolean occurredDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRED_DATE_TIME) != 0;
    }

    private boolean signatureIsSet() {
      return (optBits & OPT_BIT_SIGNATURE) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean activityIsSet() {
      return (optBits & OPT_BIT_ACTIVITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean occurredPeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRED_PERIOD) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean recordedIsSet() {
      return (optBits & OPT_BIT_RECORDED) != 0;
    }

    private boolean entityIsSet() {
      return (optBits & OPT_BIT_ENTITY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Provenance is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Provenance, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Provenance", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Provenance#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Provenance", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Provenance#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Provenance#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Provenance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Provenance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Provenance#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal policy(List<Uri> policy);

    /**
     * Initializes the optional value {@link Provenance#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal policy(Optional<? extends List<Uri>> policy);

    /**
     * Adds one element to {@link Provenance#agent() agent} list.
     * @param element A agent element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAgent(Provenance_Agent element);

    /**
     * Adds elements to {@link Provenance#agent() agent} list.
     * @param elements An array of agent elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAgent(Provenance_Agent... elements);

    /**
     * Adds elements to {@link Provenance#agent() agent} list.
     * @param elements An iterable of agent elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllAgent(Iterable<? extends Provenance_Agent> elements);

    /**
     * Initializes the optional value {@link Provenance#occurredDateTime() occurredDateTime} to occurredDateTime.
     * @param occurredDateTime The value for occurredDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurredDateTime(String occurredDateTime);

    /**
     * Initializes the optional value {@link Provenance#occurredDateTime() occurredDateTime} to occurredDateTime.
     * @param occurredDateTime The value for occurredDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurredDateTime(Optional<String> occurredDateTime);

    /**
     * Initializes the optional value {@link Provenance#signature() signature} to signature.
     * @param signature The value for signature
     * @return {@code this} builder for chained invocation
     */
    BuildFinal signature(List<Signature> signature);

    /**
     * Initializes the optional value {@link Provenance#signature() signature} to signature.
     * @param signature The value for signature
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal signature(Optional<? extends List<Signature>> signature);

    /**
     * Initializes the optional value {@link Provenance#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reason(List<CodeableConcept> reason);

    /**
     * Initializes the optional value {@link Provenance#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reason(Optional<? extends List<CodeableConcept>> reason);

    /**
     * Initializes the optional value {@link Provenance#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(Reference location);

    /**
     * Initializes the optional value {@link Provenance#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(Optional<? extends Reference> location);

    /**
     * Initializes the optional value {@link Provenance#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Provenance#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Adds one element to {@link Provenance#target() target} list.
     * @param element A target element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addTarget(Reference element);

    /**
     * Adds elements to {@link Provenance#target() target} list.
     * @param elements An array of target elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addTarget(Reference... elements);

    /**
     * Adds elements to {@link Provenance#target() target} list.
     * @param elements An iterable of target elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllTarget(Iterable<? extends Reference> elements);

    /**
     * Initializes the optional value {@link Provenance#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Provenance#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Provenance#activity() activity} to activity.
     * @param activity The value for activity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal activity(CodeableConcept activity);

    /**
     * Initializes the optional value {@link Provenance#activity() activity} to activity.
     * @param activity The value for activity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal activity(Optional<? extends CodeableConcept> activity);

    /**
     * Initializes the optional value {@link Provenance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Provenance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Provenance#occurredPeriod() occurredPeriod} to occurredPeriod.
     * @param occurredPeriod The value for occurredPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurredPeriod(Period occurredPeriod);

    /**
     * Initializes the optional value {@link Provenance#occurredPeriod() occurredPeriod} to occurredPeriod.
     * @param occurredPeriod The value for occurredPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurredPeriod(Optional<? extends Period> occurredPeriod);

    /**
     * Initializes the optional value {@link Provenance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Provenance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Provenance#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Provenance#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Provenance#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Provenance#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Provenance#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recorded(Instant recorded);

    /**
     * Initializes the optional value {@link Provenance#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recorded(Optional<? extends Instant> recorded);

    /**
     * Initializes the optional value {@link Provenance#entity() entity} to entity.
     * @param entity The value for entity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal entity(List<Provenance_Entity> entity);

    /**
     * Initializes the optional value {@link Provenance#entity() entity} to entity.
     * @param entity The value for entity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal entity(Optional<? extends List<Provenance_Entity>> entity);

    /**
     * Builds a new {@link Provenance Provenance}.
     * @return An immutable instance of Provenance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Provenance build();
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
