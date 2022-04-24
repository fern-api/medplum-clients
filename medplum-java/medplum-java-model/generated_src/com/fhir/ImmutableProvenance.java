//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Provenance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProvenance.builder()}.
 */
@org.immutables.value.Generated(from = "Provenance", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableProvenance implements com.fhir.Provenance {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Provenance_Entity> entity;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.instant recorded;
  private final @javax.annotation.Nullable java.lang.String occurredDateTime;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reason;
  private final java.util.List<com.fhir.Reference> target;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final java.util.List<com.fhir.Provenance_Agent> agent;
  private final @javax.annotation.Nullable com.fhir.Reference location;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> policy;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Signature> signature;
  private final @javax.annotation.Nullable com.fhir.Period occurredPeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept activity;

  private ImmutableProvenance(
      @javax.annotation.Nullable java.util.List<com.fhir.Provenance_Entity> entity,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.instant recorded,
      @javax.annotation.Nullable java.lang.String occurredDateTime,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reason,
      java.util.List<com.fhir.Reference> target,
      @javax.annotation.Nullable com.fhir.code language,
      java.util.List<com.fhir.Provenance_Agent> agent,
      @javax.annotation.Nullable com.fhir.Reference location,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> policy,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Signature> signature,
      @javax.annotation.Nullable com.fhir.Period occurredPeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.CodeableConcept activity) {
    this.entity = entity;
    this.resourceType = resourceType;
    this.recorded = recorded;
    this.occurredDateTime = occurredDateTime;
    this.reason = reason;
    this.target = target;
    this.language = language;
    this.agent = agent;
    this.location = location;
    this.policy = policy;
    this.implicitRules = implicitRules;
    this.text = text;
    this.extension = extension;
    this.signature = signature;
    this.occurredPeriod = occurredPeriod;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.meta = meta;
    this.contained = contained;
    this.activity = activity;
  }

  /**
   * @return The value of the {@code entity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("entity")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Provenance_Entity>> entity() {
    return java.util.Optional.ofNullable(entity);
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
   * @return The value of the {@code recorded} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("recorded")
  @Override
  public java.util.Optional<com.fhir.instant> recorded() {
    return java.util.Optional.ofNullable(recorded);
  }

  /**
   * @return The value of the {@code occurredDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurredDateTime")
  @Override
  public java.util.Optional<java.lang.String> occurredDateTime() {
    return java.util.Optional.ofNullable(occurredDateTime);
  }

  /**
   * @return The value of the {@code reason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reason")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reason() {
    return java.util.Optional.ofNullable(reason);
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("target")
  @Override
  public java.util.List<com.fhir.Reference> target() {
    return target;
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
   * @return The value of the {@code agent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("agent")
  @Override
  public java.util.List<com.fhir.Provenance_Agent> agent() {
    return agent;
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("location")
  @Override
  public java.util.Optional<com.fhir.Reference> location() {
    return java.util.Optional.ofNullable(location);
  }

  /**
   * @return The value of the {@code policy} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("policy")
  @Override
  public java.util.Optional<java.util.List<com.fhir.uri>> policy() {
    return java.util.Optional.ofNullable(policy);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code signature} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("signature")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Signature>> signature() {
    return java.util.Optional.ofNullable(signature);
  }

  /**
   * @return The value of the {@code occurredPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurredPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> occurredPeriod() {
    return java.util.Optional.ofNullable(occurredPeriod);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code activity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("activity")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> activity() {
    return java.util.Optional.ofNullable(activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#entity() entity} attribute.
   * @param value The value for entity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withEntity(java.util.List<com.fhir.Provenance_Entity> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Provenance_Entity> newValue = java.util.Objects.requireNonNull(value, "entity");
    if (this.entity == newValue) return this;
    return new ImmutableProvenance(
        newValue,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#entity() entity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withEntity(java.util.Optional<? extends java.util.List<com.fhir.Provenance_Entity>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Provenance_Entity> value = optional.orElse(null);
    if (this.entity == value) return this;
    return new ImmutableProvenance(
        value,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Provenance#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProvenance withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableProvenance(
        this.entity,
        newValue,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#recorded() recorded} attribute.
   * @param value The value for recorded
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withRecorded(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "recorded");
    if (this.recorded == newValue) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        newValue,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#recorded() recorded} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recorded
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withRecorded(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.recorded == value) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        value,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#occurredDateTime() occurredDateTime} attribute.
   * @param value The value for occurredDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withOccurredDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "occurredDateTime");
    if (java.util.Objects.equals(this.occurredDateTime, newValue)) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        newValue,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#occurredDateTime() occurredDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurredDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withOccurredDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.occurredDateTime, value)) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        value,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withReason(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        newValue,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        value,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Provenance#target() target}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withTarget(com.fhir.Reference... elements) {
    java.util.List<com.fhir.Reference> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        newValue,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Provenance#target() target}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of target elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withTarget(Iterable<? extends com.fhir.Reference> elements) {
    if (this.target == elements) return this;
    java.util.List<com.fhir.Reference> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        newValue,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        newValue,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        value,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Provenance#agent() agent}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withAgent(com.fhir.Provenance_Agent... elements) {
    java.util.List<com.fhir.Provenance_Agent> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        newValue,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Provenance#agent() agent}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of agent elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withAgent(Iterable<? extends com.fhir.Provenance_Agent> elements) {
    if (this.agent == elements) return this;
    java.util.List<com.fhir.Provenance_Agent> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        newValue,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withLocation(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        newValue,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withLocation(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        value,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#policy() policy} attribute.
   * @param value The value for policy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withPolicy(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "policy");
    if (this.policy == newValue) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        newValue,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#policy() policy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for policy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withPolicy(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.policy == value) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        value,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        newValue,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        value,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        newValue,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        value,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        newValue,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        value,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#signature() signature} attribute.
   * @param value The value for signature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withSignature(java.util.List<com.fhir.Signature> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Signature> newValue = java.util.Objects.requireNonNull(value, "signature");
    if (this.signature == newValue) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        newValue,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#signature() signature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for signature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withSignature(java.util.Optional<? extends java.util.List<com.fhir.Signature>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Signature> value = optional.orElse(null);
    if (this.signature == value) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        value,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#occurredPeriod() occurredPeriod} attribute.
   * @param value The value for occurredPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withOccurredPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "occurredPeriod");
    if (this.occurredPeriod == newValue) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        newValue,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#occurredPeriod() occurredPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurredPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withOccurredPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.occurredPeriod == value) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        value,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        newValue,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        value,
        this.id,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        newValue,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        value,
        this.meta,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        newValue,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        value,
        this.contained,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        newValue,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        value,
        this.activity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance#activity() activity} attribute.
   * @param value The value for activity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance withActivity(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "activity");
    if (this.activity == newValue) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance#activity() activity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for activity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance withActivity(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.activity == value) return this;
    return new ImmutableProvenance(
        this.entity,
        this.resourceType,
        this.recorded,
        this.occurredDateTime,
        this.reason,
        this.target,
        this.language,
        this.agent,
        this.location,
        this.policy,
        this.implicitRules,
        this.text,
        this.extension,
        this.signature,
        this.occurredPeriod,
        this.modifierExtension,
        this.id,
        this.meta,
        this.contained,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProvenance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProvenance
        && equalTo((ImmutableProvenance) another);
  }

  private boolean equalTo(ImmutableProvenance another) {
    return java.util.Objects.equals(entity, another.entity)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(recorded, another.recorded)
        && java.util.Objects.equals(occurredDateTime, another.occurredDateTime)
        && java.util.Objects.equals(reason, another.reason)
        && target.equals(another.target)
        && java.util.Objects.equals(language, another.language)
        && agent.equals(another.agent)
        && java.util.Objects.equals(location, another.location)
        && java.util.Objects.equals(policy, another.policy)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(signature, another.signature)
        && java.util.Objects.equals(occurredPeriod, another.occurredPeriod)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(activity, another.activity);
  }

  /**
   * Computes a hash code from attributes: {@code entity}, {@code resourceType}, {@code recorded}, {@code occurredDateTime}, {@code reason}, {@code target}, {@code language}, {@code agent}, {@code location}, {@code policy}, {@code implicitRules}, {@code text}, {@code extension}, {@code signature}, {@code occurredPeriod}, {@code modifierExtension}, {@code id}, {@code meta}, {@code contained}, {@code activity}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(entity);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(recorded);
    h += (h << 5) + java.util.Objects.hashCode(occurredDateTime);
    h += (h << 5) + java.util.Objects.hashCode(reason);
    h += (h << 5) + target.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + agent.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(location);
    h += (h << 5) + java.util.Objects.hashCode(policy);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(signature);
    h += (h << 5) + java.util.Objects.hashCode(occurredPeriod);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(activity);
    return h;
  }

  /**
   * Prints the immutable value {@code Provenance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Provenance{");
    if (entity != null) {
      builder.append("entity=").append(entity);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (recorded != null) {
      builder.append(", ");
      builder.append("recorded=").append(recorded);
    }
    if (occurredDateTime != null) {
      builder.append(", ");
      builder.append("occurredDateTime=").append(occurredDateTime);
    }
    if (reason != null) {
      builder.append(", ");
      builder.append("reason=").append(reason);
    }
    builder.append(", ");
    builder.append("target=").append(target);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    builder.append(", ");
    builder.append("agent=").append(agent);
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (policy != null) {
      builder.append(", ");
      builder.append("policy=").append(policy);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (signature != null) {
      builder.append(", ");
      builder.append("signature=").append(signature);
    }
    if (occurredPeriod != null) {
      builder.append(", ");
      builder.append("occurredPeriod=").append(occurredPeriod);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (activity != null) {
      builder.append(", ");
      builder.append("activity=").append(activity);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Provenance", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Provenance {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Provenance_Entity>> entity = java.util.Optional.empty();
    boolean entityIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> recorded = java.util.Optional.empty();
    boolean recordedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> occurredDateTime = java.util.Optional.empty();
    boolean occurredDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reason = java.util.Optional.empty();
    boolean reasonIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> target = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.Provenance_Agent> agent = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> location = java.util.Optional.empty();
    boolean locationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> policy = java.util.Optional.empty();
    boolean policyIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Signature>> signature = java.util.Optional.empty();
    boolean signatureIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> occurredPeriod = java.util.Optional.empty();
    boolean occurredPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> activity = java.util.Optional.empty();
    boolean activityIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("entity")
    public void setEntity(java.util.Optional<java.util.List<com.fhir.Provenance_Entity>> entity) {
      this.entity = entity;
      this.entityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recorded")
    public void setRecorded(java.util.Optional<com.fhir.instant> recorded) {
      this.recorded = recorded;
      this.recordedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurredDateTime")
    public void setOccurredDateTime(java.util.Optional<java.lang.String> occurredDateTime) {
      this.occurredDateTime = occurredDateTime;
      this.occurredDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    public void setTarget(java.util.List<com.fhir.Reference> target) {
      this.target = target;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("agent")
    public void setAgent(java.util.List<com.fhir.Provenance_Agent> agent) {
      this.agent = agent;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<com.fhir.Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    public void setPolicy(java.util.Optional<java.util.List<com.fhir.uri>> policy) {
      this.policy = policy;
      this.policyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("signature")
    public void setSignature(java.util.Optional<java.util.List<com.fhir.Signature>> signature) {
      this.signature = signature;
      this.signatureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurredPeriod")
    public void setOccurredPeriod(java.util.Optional<com.fhir.Period> occurredPeriod) {
      this.occurredPeriod = occurredPeriod;
      this.occurredPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("activity")
    public void setActivity(java.util.Optional<com.fhir.CodeableConcept> activity) {
      this.activity = activity;
      this.activityIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Provenance_Entity>> entity() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> recorded() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> occurredDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.Reference> target() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.Provenance_Agent> agent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> policy() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Signature>> signature() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> occurredPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> activity() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableProvenance fromJson(Json json) {
    ImmutableProvenance.Builder builder = ((ImmutableProvenance.Builder) ImmutableProvenance.builder());
    if (json.entityIsSet) {
      builder.entity(json.entity);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.recordedIsSet) {
      builder.recorded(json.recorded);
    }
    if (json.occurredDateTimeIsSet) {
      builder.occurredDateTime(json.occurredDateTime);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.target != null) {
      builder.addAllTarget(json.target);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.agent != null) {
      builder.addAllAgent(json.agent);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.policyIsSet) {
      builder.policy(json.policy);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.signatureIsSet) {
      builder.signature(json.signature);
    }
    if (json.occurredPeriodIsSet) {
      builder.occurredPeriod(json.occurredPeriod);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.activityIsSet) {
      builder.activity(json.activity);
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
        .entity(instance.entity())
        .resourceType(instance.resourceType())
        .recorded(instance.recorded())
        .occurredDateTime(instance.occurredDateTime())
        .reason(instance.reason())
        .addAllTarget(instance.target())
        .language(instance.language())
        .addAllAgent(instance.agent())
        .location(instance.location())
        .policy(instance.policy())
        .implicitRules(instance.implicitRules())
        .text(instance.text())
        .extension(instance.extension())
        .signature(instance.signature())
        .occurredPeriod(instance.occurredPeriod())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .meta(instance.meta())
        .contained(instance.contained())
        .activity(instance.activity())
        .build();
  }

  /**
   * Creates a builder for {@link Provenance Provenance}.
   * <pre>
   * ImmutableProvenance.builder()
   *    .entity(List&amp;lt;com.fhir.Provenance_Entity&amp;gt;) // optional {@link Provenance#entity() entity}
   *    .resourceType(String) // required {@link Provenance#resourceType() resourceType}
   *    .recorded(com.fhir.instant) // optional {@link Provenance#recorded() recorded}
   *    .occurredDateTime(String) // optional {@link Provenance#occurredDateTime() occurredDateTime}
   *    .reason(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Provenance#reason() reason}
   *    .addTarget|addAllTarget(com.fhir.Reference) // {@link Provenance#target() target} elements
   *    .language(com.fhir.code) // optional {@link Provenance#language() language}
   *    .addAgent|addAllAgent(com.fhir.Provenance_Agent) // {@link Provenance#agent() agent} elements
   *    .location(com.fhir.Reference) // optional {@link Provenance#location() location}
   *    .policy(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link Provenance#policy() policy}
   *    .implicitRules(com.fhir.uri) // optional {@link Provenance#implicitRules() implicitRules}
   *    .text(com.fhir.Narrative) // optional {@link Provenance#text() text}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Provenance#extension() extension}
   *    .signature(List&amp;lt;com.fhir.Signature&amp;gt;) // optional {@link Provenance#signature() signature}
   *    .occurredPeriod(com.fhir.Period) // optional {@link Provenance#occurredPeriod() occurredPeriod}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Provenance#modifierExtension() modifierExtension}
   *    .id(com.fhir.id) // optional {@link Provenance#id() id}
   *    .meta(com.fhir.Meta) // optional {@link Provenance#meta() meta}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Provenance#contained() contained}
   *    .activity(com.fhir.CodeableConcept) // optional {@link Provenance#activity() activity}
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
  @org.immutables.value.Generated(from = "Provenance", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_ENTITY = 0x1L;
    private static final long OPT_BIT_RECORDED = 0x2L;
    private static final long OPT_BIT_OCCURRED_DATE_TIME = 0x4L;
    private static final long OPT_BIT_REASON = 0x8L;
    private static final long OPT_BIT_LANGUAGE = 0x10L;
    private static final long OPT_BIT_LOCATION = 0x20L;
    private static final long OPT_BIT_POLICY = 0x40L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_SIGNATURE = 0x400L;
    private static final long OPT_BIT_OCCURRED_PERIOD = 0x800L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000L;
    private static final long OPT_BIT_ID = 0x2000L;
    private static final long OPT_BIT_META = 0x4000L;
    private static final long OPT_BIT_CONTAINED = 0x8000L;
    private static final long OPT_BIT_ACTIVITY = 0x10000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Provenance_Entity> entity;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.instant recorded;
    private @javax.annotation.Nullable java.lang.String occurredDateTime;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reason;
    private final java.util.List<com.fhir.Reference> target = new java.util.ArrayList<com.fhir.Reference>();
    private @javax.annotation.Nullable com.fhir.code language;
    private final java.util.List<com.fhir.Provenance_Agent> agent = new java.util.ArrayList<com.fhir.Provenance_Agent>();
    private @javax.annotation.Nullable com.fhir.Reference location;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> policy;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Signature> signature;
    private @javax.annotation.Nullable com.fhir.Period occurredPeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.CodeableConcept activity;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Provenance#entity() entity} to entity.
     * @param entity The value for entity
     * @return {@code this} builder for chained invocation
     */
    public final Builder entity(java.util.List<com.fhir.Provenance_Entity> entity) {
      checkNotIsSet(entityIsSet(), "entity");
      this.entity = java.util.Objects.requireNonNull(entity, "entity");
      optBits |= OPT_BIT_ENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#entity() entity} to entity.
     * @param entity The value for entity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entity")
    public final Builder entity(java.util.Optional<? extends java.util.List<com.fhir.Provenance_Entity>> entity) {
      checkNotIsSet(entityIsSet(), "entity");
      this.entity = entity.orElse(null);
      optBits |= OPT_BIT_ENTITY;
      return this;
    }

    /**
     * Initializes the value for the {@link Provenance#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Provenance#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for chained invocation
     */
    public final Builder recorded(com.fhir.instant recorded) {
      checkNotIsSet(recordedIsSet(), "recorded");
      this.recorded = java.util.Objects.requireNonNull(recorded, "recorded");
      optBits |= OPT_BIT_RECORDED;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recorded")
    public final Builder recorded(java.util.Optional<? extends com.fhir.instant> recorded) {
      checkNotIsSet(recordedIsSet(), "recorded");
      this.recorded = recorded.orElse(null);
      optBits |= OPT_BIT_RECORDED;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#occurredDateTime() occurredDateTime} to occurredDateTime.
     * @param occurredDateTime The value for occurredDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurredDateTime(java.lang.String occurredDateTime) {
      checkNotIsSet(occurredDateTimeIsSet(), "occurredDateTime");
      this.occurredDateTime = java.util.Objects.requireNonNull(occurredDateTime, "occurredDateTime");
      optBits |= OPT_BIT_OCCURRED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#occurredDateTime() occurredDateTime} to occurredDateTime.
     * @param occurredDateTime The value for occurredDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("occurredDateTime")
    public final Builder occurredDateTime(java.util.Optional<java.lang.String> occurredDateTime) {
      checkNotIsSet(occurredDateTimeIsSet(), "occurredDateTime");
      this.occurredDateTime = occurredDateTime.orElse(null);
      optBits |= OPT_BIT_OCCURRED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(java.util.List<com.fhir.CodeableConcept> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = java.util.Objects.requireNonNull(reason, "reason");
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public final Builder reason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = reason.orElse(null);
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Adds one element to {@link Provenance#target() target} list.
     * @param element A target element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTarget(com.fhir.Reference element) {
      this.target.add(java.util.Objects.requireNonNull(element, "target element"));
      return this;
    }

    /**
     * Adds elements to {@link Provenance#target() target} list.
     * @param elements An array of target elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTarget(com.fhir.Reference... elements) {
      for (com.fhir.Reference element : elements) {
        this.target.add(java.util.Objects.requireNonNull(element, "target element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Provenance#target() target} list.
     * @param elements An iterable of target elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllTarget(Iterable<? extends com.fhir.Reference> elements) {
      for (com.fhir.Reference element : elements) {
        this.target.add(java.util.Objects.requireNonNull(element, "target element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#language() language} to language.
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
     * Initializes the optional value {@link Provenance#language() language} to language.
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
     * Adds one element to {@link Provenance#agent() agent} list.
     * @param element A agent element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAgent(com.fhir.Provenance_Agent element) {
      this.agent.add(java.util.Objects.requireNonNull(element, "agent element"));
      return this;
    }

    /**
     * Adds elements to {@link Provenance#agent() agent} list.
     * @param elements An array of agent elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAgent(com.fhir.Provenance_Agent... elements) {
      for (com.fhir.Provenance_Agent element : elements) {
        this.agent.add(java.util.Objects.requireNonNull(element, "agent element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Provenance#agent() agent} list.
     * @param elements An iterable of agent elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAgent(Iterable<? extends com.fhir.Provenance_Agent> elements) {
      for (com.fhir.Provenance_Agent element : elements) {
        this.agent.add(java.util.Objects.requireNonNull(element, "agent element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(com.fhir.Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = java.util.Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public final Builder location(java.util.Optional<? extends com.fhir.Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for chained invocation
     */
    public final Builder policy(java.util.List<com.fhir.uri> policy) {
      checkNotIsSet(policyIsSet(), "policy");
      this.policy = java.util.Objects.requireNonNull(policy, "policy");
      optBits |= OPT_BIT_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    public final Builder policy(java.util.Optional<? extends java.util.List<com.fhir.uri>> policy) {
      checkNotIsSet(policyIsSet(), "policy");
      this.policy = policy.orElse(null);
      optBits |= OPT_BIT_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Provenance#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Provenance#text() text} to text.
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
     * Initializes the optional value {@link Provenance#text() text} to text.
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
     * Initializes the optional value {@link Provenance#extension() extension} to extension.
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
     * Initializes the optional value {@link Provenance#extension() extension} to extension.
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
     * Initializes the optional value {@link Provenance#signature() signature} to signature.
     * @param signature The value for signature
     * @return {@code this} builder for chained invocation
     */
    public final Builder signature(java.util.List<com.fhir.Signature> signature) {
      checkNotIsSet(signatureIsSet(), "signature");
      this.signature = java.util.Objects.requireNonNull(signature, "signature");
      optBits |= OPT_BIT_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#signature() signature} to signature.
     * @param signature The value for signature
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("signature")
    public final Builder signature(java.util.Optional<? extends java.util.List<com.fhir.Signature>> signature) {
      checkNotIsSet(signatureIsSet(), "signature");
      this.signature = signature.orElse(null);
      optBits |= OPT_BIT_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#occurredPeriod() occurredPeriod} to occurredPeriod.
     * @param occurredPeriod The value for occurredPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurredPeriod(com.fhir.Period occurredPeriod) {
      checkNotIsSet(occurredPeriodIsSet(), "occurredPeriod");
      this.occurredPeriod = java.util.Objects.requireNonNull(occurredPeriod, "occurredPeriod");
      optBits |= OPT_BIT_OCCURRED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#occurredPeriod() occurredPeriod} to occurredPeriod.
     * @param occurredPeriod The value for occurredPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("occurredPeriod")
    public final Builder occurredPeriod(java.util.Optional<? extends com.fhir.Period> occurredPeriod) {
      checkNotIsSet(occurredPeriodIsSet(), "occurredPeriod");
      this.occurredPeriod = occurredPeriod.orElse(null);
      optBits |= OPT_BIT_OCCURRED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Provenance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Provenance#id() id} to id.
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
     * Initializes the optional value {@link Provenance#id() id} to id.
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
     * Initializes the optional value {@link Provenance#meta() meta} to meta.
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
     * Initializes the optional value {@link Provenance#meta() meta} to meta.
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
     * Initializes the optional value {@link Provenance#contained() contained} to contained.
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
     * Initializes the optional value {@link Provenance#contained() contained} to contained.
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
     * Initializes the optional value {@link Provenance#activity() activity} to activity.
     * @param activity The value for activity
     * @return {@code this} builder for chained invocation
     */
    public final Builder activity(com.fhir.CodeableConcept activity) {
      checkNotIsSet(activityIsSet(), "activity");
      this.activity = java.util.Objects.requireNonNull(activity, "activity");
      optBits |= OPT_BIT_ACTIVITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance#activity() activity} to activity.
     * @param activity The value for activity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("activity")
    public final Builder activity(java.util.Optional<? extends com.fhir.CodeableConcept> activity) {
      checkNotIsSet(activityIsSet(), "activity");
      this.activity = activity.orElse(null);
      optBits |= OPT_BIT_ACTIVITY;
      return this;
    }

    /**
     * Builds a new {@link Provenance Provenance}.
     * @return An immutable instance of Provenance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Provenance build() {
      checkRequiredAttributes();
      return new ImmutableProvenance(
          entity,
          resourceType,
          recorded,
          occurredDateTime,
          reason,
          createUnmodifiableList(true, target),
          language,
          createUnmodifiableList(true, agent),
          location,
          policy,
          implicitRules,
          text,
          extension,
          signature,
          occurredPeriod,
          modifierExtension,
          id,
          meta,
          contained,
          activity);
    }

    private boolean entityIsSet() {
      return (optBits & OPT_BIT_ENTITY) != 0;
    }

    private boolean recordedIsSet() {
      return (optBits & OPT_BIT_RECORDED) != 0;
    }

    private boolean occurredDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRED_DATE_TIME) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean policyIsSet() {
      return (optBits & OPT_BIT_POLICY) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean signatureIsSet() {
      return (optBits & OPT_BIT_SIGNATURE) != 0;
    }

    private boolean occurredPeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRED_PERIOD) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean activityIsSet() {
      return (optBits & OPT_BIT_ACTIVITY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Provenance is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Provenance, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Provenance", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Provenance#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Provenance", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Provenance#entity() entity} to entity.
     * @param entity The value for entity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal entity(java.util.List<com.fhir.Provenance_Entity> entity);

    /**
     * Initializes the optional value {@link Provenance#entity() entity} to entity.
     * @param entity The value for entity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal entity(java.util.Optional<? extends java.util.List<com.fhir.Provenance_Entity>> entity);

    /**
     * Initializes the optional value {@link Provenance#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recorded(com.fhir.instant recorded);

    /**
     * Initializes the optional value {@link Provenance#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recorded(java.util.Optional<? extends com.fhir.instant> recorded);

    /**
     * Initializes the optional value {@link Provenance#occurredDateTime() occurredDateTime} to occurredDateTime.
     * @param occurredDateTime The value for occurredDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurredDateTime(java.lang.String occurredDateTime);

    /**
     * Initializes the optional value {@link Provenance#occurredDateTime() occurredDateTime} to occurredDateTime.
     * @param occurredDateTime The value for occurredDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurredDateTime(java.util.Optional<java.lang.String> occurredDateTime);

    /**
     * Initializes the optional value {@link Provenance#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reason(java.util.List<com.fhir.CodeableConcept> reason);

    /**
     * Initializes the optional value {@link Provenance#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reason);

    /**
     * Adds one element to {@link Provenance#target() target} list.
     * @param element A target element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addTarget(com.fhir.Reference element);

    /**
     * Adds elements to {@link Provenance#target() target} list.
     * @param elements An array of target elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addTarget(com.fhir.Reference... elements);

    /**
     * Adds elements to {@link Provenance#target() target} list.
     * @param elements An iterable of target elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllTarget(Iterable<? extends com.fhir.Reference> elements);

    /**
     * Initializes the optional value {@link Provenance#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Provenance#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Adds one element to {@link Provenance#agent() agent} list.
     * @param element A agent element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAgent(com.fhir.Provenance_Agent element);

    /**
     * Adds elements to {@link Provenance#agent() agent} list.
     * @param elements An array of agent elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAgent(com.fhir.Provenance_Agent... elements);

    /**
     * Adds elements to {@link Provenance#agent() agent} list.
     * @param elements An iterable of agent elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllAgent(Iterable<? extends com.fhir.Provenance_Agent> elements);

    /**
     * Initializes the optional value {@link Provenance#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(com.fhir.Reference location);

    /**
     * Initializes the optional value {@link Provenance#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(java.util.Optional<? extends com.fhir.Reference> location);

    /**
     * Initializes the optional value {@link Provenance#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal policy(java.util.List<com.fhir.uri> policy);

    /**
     * Initializes the optional value {@link Provenance#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal policy(java.util.Optional<? extends java.util.List<com.fhir.uri>> policy);

    /**
     * Initializes the optional value {@link Provenance#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Provenance#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Provenance#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Provenance#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Provenance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Provenance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Provenance#signature() signature} to signature.
     * @param signature The value for signature
     * @return {@code this} builder for chained invocation
     */
    BuildFinal signature(java.util.List<com.fhir.Signature> signature);

    /**
     * Initializes the optional value {@link Provenance#signature() signature} to signature.
     * @param signature The value for signature
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal signature(java.util.Optional<? extends java.util.List<com.fhir.Signature>> signature);

    /**
     * Initializes the optional value {@link Provenance#occurredPeriod() occurredPeriod} to occurredPeriod.
     * @param occurredPeriod The value for occurredPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurredPeriod(com.fhir.Period occurredPeriod);

    /**
     * Initializes the optional value {@link Provenance#occurredPeriod() occurredPeriod} to occurredPeriod.
     * @param occurredPeriod The value for occurredPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurredPeriod(java.util.Optional<? extends com.fhir.Period> occurredPeriod);

    /**
     * Initializes the optional value {@link Provenance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Provenance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Provenance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Provenance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Provenance#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Provenance#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Provenance#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Provenance#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Provenance#activity() activity} to activity.
     * @param activity The value for activity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal activity(com.fhir.CodeableConcept activity);

    /**
     * Initializes the optional value {@link Provenance#activity() activity} to activity.
     * @param activity The value for activity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal activity(java.util.Optional<? extends com.fhir.CodeableConcept> activity);

    /**
     * Builds a new {@link Provenance Provenance}.
     * @return An immutable instance of Provenance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Provenance build();
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
