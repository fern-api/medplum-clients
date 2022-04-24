//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link AuditEvent}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuditEvent.builder()}.
 */
@org.immutables.value.Generated(from = "AuditEvent", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAuditEvent implements com.fhir.AuditEvent {
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> purposeOfEvent;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String outcomeDesc;
  private final com.fhir.AuditEvent_Source source;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Coding> subtype;
  private final @javax.annotation.Nullable java.util.List<com.fhir.AuditEvent_Entity> entity;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.AuditeventOutcome outcome;
  private final @javax.annotation.Nullable com.fhir.instant recorded;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.AuditeventAction action;
  private final @javax.annotation.Nullable com.fhir.Period period;
  private final java.util.List<com.fhir.AuditEvent_Agent> agent;
  private final com.fhir.Coding type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;

  private ImmutableAuditEvent(
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> purposeOfEvent,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String outcomeDesc,
      com.fhir.AuditEvent_Source source,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Coding> subtype,
      @javax.annotation.Nullable java.util.List<com.fhir.AuditEvent_Entity> entity,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.AuditeventOutcome outcome,
      @javax.annotation.Nullable com.fhir.instant recorded,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.AuditeventAction action,
      @javax.annotation.Nullable com.fhir.Period period,
      java.util.List<com.fhir.AuditEvent_Agent> agent,
      com.fhir.Coding type,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained) {
    this.purposeOfEvent = purposeOfEvent;
    this.implicitRules = implicitRules;
    this.language = language;
    this.outcomeDesc = outcomeDesc;
    this.source = source;
    this.id = id;
    this.extension = extension;
    this.subtype = subtype;
    this.entity = entity;
    this.resourceType = resourceType;
    this.outcome = outcome;
    this.recorded = recorded;
    this.meta = meta;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.action = action;
    this.period = period;
    this.agent = agent;
    this.type = type;
    this.contained = contained;
  }

  /**
   * @return The value of the {@code purposeOfEvent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("purposeOfEvent")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> purposeOfEvent() {
    return java.util.Optional.ofNullable(purposeOfEvent);
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
   * @return The value of the {@code outcomeDesc} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outcomeDesc")
  @Override
  public java.util.Optional<java.lang.String> outcomeDesc() {
    return java.util.Optional.ofNullable(outcomeDesc);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("source")
  @Override
  public com.fhir.AuditEvent_Source source() {
    return source;
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code subtype} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subtype")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Coding>> subtype() {
    return java.util.Optional.ofNullable(subtype);
  }

  /**
   * @return The value of the {@code entity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("entity")
  @Override
  public java.util.Optional<java.util.List<com.fhir.AuditEvent_Entity>> entity() {
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
   * @return The value of the {@code outcome} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outcome")
  @Override
  public java.util.Optional<com.fhir.AuditeventOutcome> outcome() {
    return java.util.Optional.ofNullable(outcome);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code action} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("action")
  @Override
  public java.util.Optional<com.fhir.AuditeventAction> action() {
    return java.util.Optional.ofNullable(action);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("period")
  @Override
  public java.util.Optional<com.fhir.Period> period() {
    return java.util.Optional.ofNullable(period);
  }

  /**
   * @return The value of the {@code agent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("agent")
  @Override
  public java.util.List<com.fhir.AuditEvent_Agent> agent() {
    return agent;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public com.fhir.Coding type() {
    return type;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#purposeOfEvent() purposeOfEvent} attribute.
   * @param value The value for purposeOfEvent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withPurposeOfEvent(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "purposeOfEvent");
    if (this.purposeOfEvent == newValue) return this;
    return new ImmutableAuditEvent(
        newValue,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#purposeOfEvent() purposeOfEvent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purposeOfEvent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withPurposeOfEvent(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.purposeOfEvent == value) return this;
    return new ImmutableAuditEvent(
        value,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        newValue,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        value,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        newValue,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        value,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#outcomeDesc() outcomeDesc} attribute.
   * @param value The value for outcomeDesc
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withOutcomeDesc(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "outcomeDesc");
    if (java.util.Objects.equals(this.outcomeDesc, newValue)) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        newValue,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#outcomeDesc() outcomeDesc} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcomeDesc
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withOutcomeDesc(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.outcomeDesc, value)) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        value,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuditEvent#source() source} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for source
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuditEvent withSource(com.fhir.AuditEvent_Source value) {
    if (this.source == value) return this;
    com.fhir.AuditEvent_Source newValue = java.util.Objects.requireNonNull(value, "source");
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        newValue,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        newValue,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        value,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        newValue,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        value,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#subtype() subtype} attribute.
   * @param value The value for subtype
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withSubtype(java.util.List<com.fhir.Coding> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> newValue = java.util.Objects.requireNonNull(value, "subtype");
    if (this.subtype == newValue) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        newValue,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#subtype() subtype} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtype
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withSubtype(java.util.Optional<? extends java.util.List<com.fhir.Coding>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> value = optional.orElse(null);
    if (this.subtype == value) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        value,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#entity() entity} attribute.
   * @param value The value for entity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withEntity(java.util.List<com.fhir.AuditEvent_Entity> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.AuditEvent_Entity> newValue = java.util.Objects.requireNonNull(value, "entity");
    if (this.entity == newValue) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        newValue,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#entity() entity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withEntity(java.util.Optional<? extends java.util.List<com.fhir.AuditEvent_Entity>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.AuditEvent_Entity> value = optional.orElse(null);
    if (this.entity == value) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        value,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuditEvent#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuditEvent withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        newValue,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withOutcome(com.fhir.AuditeventOutcome value) {
    @javax.annotation.Nullable com.fhir.AuditeventOutcome newValue = java.util.Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        newValue,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withOutcome(java.util.Optional<? extends com.fhir.AuditeventOutcome> optional) {
    @javax.annotation.Nullable com.fhir.AuditeventOutcome value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        value,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#recorded() recorded} attribute.
   * @param value The value for recorded
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withRecorded(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "recorded");
    if (this.recorded == newValue) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        newValue,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#recorded() recorded} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recorded
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withRecorded(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.recorded == value) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        value,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        newValue,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        value,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        newValue,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        value,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        newValue,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        value,
        this.action,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#action() action} attribute.
   * @param value The value for action
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withAction(com.fhir.AuditeventAction value) {
    @javax.annotation.Nullable com.fhir.AuditeventAction newValue = java.util.Objects.requireNonNull(value, "action");
    if (this.action == newValue) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        newValue,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#action() action} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for action
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withAction(java.util.Optional<? extends com.fhir.AuditeventAction> optional) {
    @javax.annotation.Nullable com.fhir.AuditeventAction value = optional.orElse(null);
    if (this.action == value) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        value,
        this.period,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        newValue,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        value,
        this.agent,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AuditEvent#agent() agent}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withAgent(com.fhir.AuditEvent_Agent... elements) {
    java.util.List<com.fhir.AuditEvent_Agent> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        newValue,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AuditEvent#agent() agent}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of agent elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withAgent(Iterable<? extends com.fhir.AuditEvent_Agent> elements) {
    if (this.agent == elements) return this;
    java.util.List<com.fhir.AuditEvent_Agent> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        newValue,
        this.type,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuditEvent#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuditEvent withType(com.fhir.Coding value) {
    if (this.type == value) return this;
    com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "type");
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        newValue,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableAuditEvent(
        this.purposeOfEvent,
        this.implicitRules,
        this.language,
        this.outcomeDesc,
        this.source,
        this.id,
        this.extension,
        this.subtype,
        this.entity,
        this.resourceType,
        this.outcome,
        this.recorded,
        this.meta,
        this.text,
        this.modifierExtension,
        this.action,
        this.period,
        this.agent,
        this.type,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuditEvent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuditEvent
        && equalTo((ImmutableAuditEvent) another);
  }

  private boolean equalTo(ImmutableAuditEvent another) {
    return java.util.Objects.equals(purposeOfEvent, another.purposeOfEvent)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(outcomeDesc, another.outcomeDesc)
        && source.equals(another.source)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(subtype, another.subtype)
        && java.util.Objects.equals(entity, another.entity)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(outcome, another.outcome)
        && java.util.Objects.equals(recorded, another.recorded)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(action, another.action)
        && java.util.Objects.equals(period, another.period)
        && agent.equals(another.agent)
        && type.equals(another.type)
        && java.util.Objects.equals(contained, another.contained);
  }

  /**
   * Computes a hash code from attributes: {@code purposeOfEvent}, {@code implicitRules}, {@code language}, {@code outcomeDesc}, {@code source}, {@code id}, {@code extension}, {@code subtype}, {@code entity}, {@code resourceType}, {@code outcome}, {@code recorded}, {@code meta}, {@code text}, {@code modifierExtension}, {@code action}, {@code period}, {@code agent}, {@code type}, {@code contained}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(purposeOfEvent);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(outcomeDesc);
    h += (h << 5) + source.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(subtype);
    h += (h << 5) + java.util.Objects.hashCode(entity);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(outcome);
    h += (h << 5) + java.util.Objects.hashCode(recorded);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(action);
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + agent.hashCode();
    h += (h << 5) + type.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(contained);
    return h;
  }

  /**
   * Prints the immutable value {@code AuditEvent} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("AuditEvent{");
    if (purposeOfEvent != null) {
      builder.append("purposeOfEvent=").append(purposeOfEvent);
    }
    if (implicitRules != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (outcomeDesc != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("outcomeDesc=").append(outcomeDesc);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("source=").append(source);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (subtype != null) {
      builder.append(", ");
      builder.append("subtype=").append(subtype);
    }
    if (entity != null) {
      builder.append(", ");
      builder.append("entity=").append(entity);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (outcome != null) {
      builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (recorded != null) {
      builder.append(", ");
      builder.append("recorded=").append(recorded);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (action != null) {
      builder.append(", ");
      builder.append("action=").append(action);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    builder.append(", ");
    builder.append("agent=").append(agent);
    builder.append(", ");
    builder.append("type=").append(type);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "AuditEvent", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.AuditEvent {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> purposeOfEvent = java.util.Optional.empty();
    boolean purposeOfEventIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> outcomeDesc = java.util.Optional.empty();
    boolean outcomeDescIsSet;
    @javax.annotation.Nullable com.fhir.AuditEvent_Source source;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Coding>> subtype = java.util.Optional.empty();
    boolean subtypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.AuditEvent_Entity>> entity = java.util.Optional.empty();
    boolean entityIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.AuditeventOutcome> outcome = java.util.Optional.empty();
    boolean outcomeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> recorded = java.util.Optional.empty();
    boolean recordedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.AuditeventAction> action = java.util.Optional.empty();
    boolean actionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.AuditEvent_Agent> agent = java.util.Collections.emptyList();
    @javax.annotation.Nullable com.fhir.Coding type;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("purposeOfEvent")
    public void setPurposeOfEvent(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> purposeOfEvent) {
      this.purposeOfEvent = purposeOfEvent;
      this.purposeOfEventIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("outcomeDesc")
    public void setOutcomeDesc(java.util.Optional<java.lang.String> outcomeDesc) {
      this.outcomeDesc = outcomeDesc;
      this.outcomeDescIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public void setSource(com.fhir.AuditEvent_Source source) {
      this.source = source;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subtype")
    public void setSubtype(java.util.Optional<java.util.List<com.fhir.Coding>> subtype) {
      this.subtype = subtype;
      this.subtypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("entity")
    public void setEntity(java.util.Optional<java.util.List<com.fhir.AuditEvent_Entity>> entity) {
      this.entity = entity;
      this.entityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public void setOutcome(java.util.Optional<com.fhir.AuditeventOutcome> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recorded")
    public void setRecorded(java.util.Optional<com.fhir.instant> recorded) {
      this.recorded = recorded;
      this.recordedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    public void setAction(java.util.Optional<com.fhir.AuditeventAction> action) {
      this.action = action;
      this.actionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public void setPeriod(java.util.Optional<com.fhir.Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("agent")
    public void setAgent(java.util.List<com.fhir.AuditEvent_Agent> agent) {
      this.agent = agent;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(com.fhir.Coding type) {
      this.type = type;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> purposeOfEvent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> outcomeDesc() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.AuditEvent_Source source() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Coding>> subtype() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.AuditEvent_Entity>> entity() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.AuditeventOutcome> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> recorded() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.AuditeventAction> action() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.AuditEvent_Agent> agent() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Coding type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableAuditEvent fromJson(Json json) {
    ImmutableAuditEvent.Builder builder = ((ImmutableAuditEvent.Builder) ImmutableAuditEvent.builder());
    if (json.purposeOfEventIsSet) {
      builder.purposeOfEvent(json.purposeOfEvent);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.outcomeDescIsSet) {
      builder.outcomeDesc(json.outcomeDesc);
    }
    if (json.source != null) {
      builder.source(json.source);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.subtypeIsSet) {
      builder.subtype(json.subtype);
    }
    if (json.entityIsSet) {
      builder.entity(json.entity);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.recordedIsSet) {
      builder.recorded(json.recorded);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.actionIsSet) {
      builder.action(json.action);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.agent != null) {
      builder.addAllAgent(json.agent);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    return (ImmutableAuditEvent) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AuditEvent} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AuditEvent instance
   */
  public static AuditEvent copyOf(AuditEvent instance) {
    if (instance instanceof ImmutableAuditEvent) {
      return (ImmutableAuditEvent) instance;
    }
    return ((ImmutableAuditEvent.Builder) ImmutableAuditEvent.builder())
        .purposeOfEvent(instance.purposeOfEvent())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .outcomeDesc(instance.outcomeDesc())
        .source(instance.source())
        .id(instance.id())
        .extension(instance.extension())
        .subtype(instance.subtype())
        .entity(instance.entity())
        .resourceType(instance.resourceType())
        .outcome(instance.outcome())
        .recorded(instance.recorded())
        .meta(instance.meta())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .action(instance.action())
        .period(instance.period())
        .addAllAgent(instance.agent())
        .type(instance.type())
        .contained(instance.contained())
        .build();
  }

  /**
   * Creates a builder for {@link AuditEvent AuditEvent}.
   * <pre>
   * ImmutableAuditEvent.builder()
   *    .purposeOfEvent(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link AuditEvent#purposeOfEvent() purposeOfEvent}
   *    .implicitRules(com.fhir.uri) // optional {@link AuditEvent#implicitRules() implicitRules}
   *    .language(com.fhir.code) // optional {@link AuditEvent#language() language}
   *    .outcomeDesc(String) // optional {@link AuditEvent#outcomeDesc() outcomeDesc}
   *    .source(com.fhir.AuditEvent_Source) // required {@link AuditEvent#source() source}
   *    .id(com.fhir.id) // optional {@link AuditEvent#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AuditEvent#extension() extension}
   *    .subtype(List&amp;lt;com.fhir.Coding&amp;gt;) // optional {@link AuditEvent#subtype() subtype}
   *    .entity(List&amp;lt;com.fhir.AuditEvent_Entity&amp;gt;) // optional {@link AuditEvent#entity() entity}
   *    .resourceType(String) // required {@link AuditEvent#resourceType() resourceType}
   *    .outcome(com.fhir.AuditeventOutcome) // optional {@link AuditEvent#outcome() outcome}
   *    .recorded(com.fhir.instant) // optional {@link AuditEvent#recorded() recorded}
   *    .meta(com.fhir.Meta) // optional {@link AuditEvent#meta() meta}
   *    .text(com.fhir.Narrative) // optional {@link AuditEvent#text() text}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AuditEvent#modifierExtension() modifierExtension}
   *    .action(com.fhir.AuditeventAction) // optional {@link AuditEvent#action() action}
   *    .period(com.fhir.Period) // optional {@link AuditEvent#period() period}
   *    .addAgent|addAllAgent(com.fhir.AuditEvent_Agent) // {@link AuditEvent#agent() agent} elements
   *    .type(com.fhir.Coding) // required {@link AuditEvent#type() type}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link AuditEvent#contained() contained}
   *    .build();
   * </pre>
   * @return A new AuditEvent builder
   */
  public static SourceBuildStage builder() {
    return new ImmutableAuditEvent.Builder();
  }

  /**
   * Builds instances of type {@link AuditEvent AuditEvent}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "AuditEvent", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements SourceBuildStage, ResourceTypeBuildStage, TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SOURCE = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long INIT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_PURPOSE_OF_EVENT = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_LANGUAGE = 0x4L;
    private static final long OPT_BIT_OUTCOME_DESC = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_SUBTYPE = 0x40L;
    private static final long OPT_BIT_ENTITY = 0x80L;
    private static final long OPT_BIT_OUTCOME = 0x100L;
    private static final long OPT_BIT_RECORDED = 0x200L;
    private static final long OPT_BIT_META = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000L;
    private static final long OPT_BIT_ACTION = 0x2000L;
    private static final long OPT_BIT_PERIOD = 0x4000L;
    private static final long OPT_BIT_CONTAINED = 0x8000L;
    private long initBits = 0x7L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> purposeOfEvent;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String outcomeDesc;
    private @javax.annotation.Nullable com.fhir.AuditEvent_Source source;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Coding> subtype;
    private @javax.annotation.Nullable java.util.List<com.fhir.AuditEvent_Entity> entity;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.AuditeventOutcome outcome;
    private @javax.annotation.Nullable com.fhir.instant recorded;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.AuditeventAction action;
    private @javax.annotation.Nullable com.fhir.Period period;
    private final java.util.List<com.fhir.AuditEvent_Agent> agent = new java.util.ArrayList<com.fhir.AuditEvent_Agent>();
    private @javax.annotation.Nullable com.fhir.Coding type;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AuditEvent#purposeOfEvent() purposeOfEvent} to purposeOfEvent.
     * @param purposeOfEvent The value for purposeOfEvent
     * @return {@code this} builder for chained invocation
     */
    public final Builder purposeOfEvent(java.util.List<com.fhir.CodeableConcept> purposeOfEvent) {
      checkNotIsSet(purposeOfEventIsSet(), "purposeOfEvent");
      this.purposeOfEvent = java.util.Objects.requireNonNull(purposeOfEvent, "purposeOfEvent");
      optBits |= OPT_BIT_PURPOSE_OF_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#purposeOfEvent() purposeOfEvent} to purposeOfEvent.
     * @param purposeOfEvent The value for purposeOfEvent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("purposeOfEvent")
    public final Builder purposeOfEvent(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> purposeOfEvent) {
      checkNotIsSet(purposeOfEventIsSet(), "purposeOfEvent");
      this.purposeOfEvent = purposeOfEvent.orElse(null);
      optBits |= OPT_BIT_PURPOSE_OF_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link AuditEvent#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link AuditEvent#language() language} to language.
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
     * Initializes the optional value {@link AuditEvent#language() language} to language.
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
     * Initializes the optional value {@link AuditEvent#outcomeDesc() outcomeDesc} to outcomeDesc.
     * @param outcomeDesc The value for outcomeDesc
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcomeDesc(java.lang.String outcomeDesc) {
      checkNotIsSet(outcomeDescIsSet(), "outcomeDesc");
      this.outcomeDesc = java.util.Objects.requireNonNull(outcomeDesc, "outcomeDesc");
      optBits |= OPT_BIT_OUTCOME_DESC;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#outcomeDesc() outcomeDesc} to outcomeDesc.
     * @param outcomeDesc The value for outcomeDesc
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outcomeDesc")
    public final Builder outcomeDesc(java.util.Optional<java.lang.String> outcomeDesc) {
      checkNotIsSet(outcomeDescIsSet(), "outcomeDesc");
      this.outcomeDesc = outcomeDesc.orElse(null);
      optBits |= OPT_BIT_OUTCOME_DESC;
      return this;
    }

    /**
     * Initializes the value for the {@link AuditEvent#source() source} attribute.
     * @param source The value for source 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public final Builder source(com.fhir.AuditEvent_Source source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = java.util.Objects.requireNonNull(source, "source");
      initBits &= ~INIT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#id() id} to id.
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
     * Initializes the optional value {@link AuditEvent#id() id} to id.
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
     * Initializes the optional value {@link AuditEvent#extension() extension} to extension.
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
     * Initializes the optional value {@link AuditEvent#extension() extension} to extension.
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
     * Initializes the optional value {@link AuditEvent#subtype() subtype} to subtype.
     * @param subtype The value for subtype
     * @return {@code this} builder for chained invocation
     */
    public final Builder subtype(java.util.List<com.fhir.Coding> subtype) {
      checkNotIsSet(subtypeIsSet(), "subtype");
      this.subtype = java.util.Objects.requireNonNull(subtype, "subtype");
      optBits |= OPT_BIT_SUBTYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#subtype() subtype} to subtype.
     * @param subtype The value for subtype
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subtype")
    public final Builder subtype(java.util.Optional<? extends java.util.List<com.fhir.Coding>> subtype) {
      checkNotIsSet(subtypeIsSet(), "subtype");
      this.subtype = subtype.orElse(null);
      optBits |= OPT_BIT_SUBTYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#entity() entity} to entity.
     * @param entity The value for entity
     * @return {@code this} builder for chained invocation
     */
    public final Builder entity(java.util.List<com.fhir.AuditEvent_Entity> entity) {
      checkNotIsSet(entityIsSet(), "entity");
      this.entity = java.util.Objects.requireNonNull(entity, "entity");
      optBits |= OPT_BIT_ENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#entity() entity} to entity.
     * @param entity The value for entity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entity")
    public final Builder entity(java.util.Optional<? extends java.util.List<com.fhir.AuditEvent_Entity>> entity) {
      checkNotIsSet(entityIsSet(), "entity");
      this.entity = entity.orElse(null);
      optBits |= OPT_BIT_ENTITY;
      return this;
    }

    /**
     * Initializes the value for the {@link AuditEvent#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link AuditEvent#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(com.fhir.AuditeventOutcome outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = java.util.Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public final Builder outcome(java.util.Optional<? extends com.fhir.AuditeventOutcome> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#recorded() recorded} to recorded.
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
     * Initializes the optional value {@link AuditEvent#recorded() recorded} to recorded.
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
     * Initializes the optional value {@link AuditEvent#meta() meta} to meta.
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
     * Initializes the optional value {@link AuditEvent#meta() meta} to meta.
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
     * Initializes the optional value {@link AuditEvent#text() text} to text.
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
     * Initializes the optional value {@link AuditEvent#text() text} to text.
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
     * Initializes the optional value {@link AuditEvent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AuditEvent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AuditEvent#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    public final Builder action(com.fhir.AuditeventAction action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = java.util.Objects.requireNonNull(action, "action");
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    public final Builder action(java.util.Optional<? extends com.fhir.AuditeventAction> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = action.orElse(null);
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(com.fhir.Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = java.util.Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public final Builder period(java.util.Optional<? extends com.fhir.Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Adds one element to {@link AuditEvent#agent() agent} list.
     * @param element A agent element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAgent(com.fhir.AuditEvent_Agent element) {
      this.agent.add(java.util.Objects.requireNonNull(element, "agent element"));
      return this;
    }

    /**
     * Adds elements to {@link AuditEvent#agent() agent} list.
     * @param elements An array of agent elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAgent(com.fhir.AuditEvent_Agent... elements) {
      for (com.fhir.AuditEvent_Agent element : elements) {
        this.agent.add(java.util.Objects.requireNonNull(element, "agent element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link AuditEvent#agent() agent} list.
     * @param elements An iterable of agent elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAgent(Iterable<? extends com.fhir.AuditEvent_Agent> elements) {
      for (com.fhir.AuditEvent_Agent element : elements) {
        this.agent.add(java.util.Objects.requireNonNull(element, "agent element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link AuditEvent#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(com.fhir.Coding type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#contained() contained} to contained.
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
     * Initializes the optional value {@link AuditEvent#contained() contained} to contained.
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
     * Builds a new {@link AuditEvent AuditEvent}.
     * @return An immutable instance of AuditEvent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.AuditEvent build() {
      checkRequiredAttributes();
      return new ImmutableAuditEvent(
          purposeOfEvent,
          implicitRules,
          language,
          outcomeDesc,
          source,
          id,
          extension,
          subtype,
          entity,
          resourceType,
          outcome,
          recorded,
          meta,
          text,
          modifierExtension,
          action,
          period,
          createUnmodifiableList(true, agent),
          type,
          contained);
    }

    private boolean purposeOfEventIsSet() {
      return (optBits & OPT_BIT_PURPOSE_OF_EVENT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean outcomeDescIsSet() {
      return (optBits & OPT_BIT_OUTCOME_DESC) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean subtypeIsSet() {
      return (optBits & OPT_BIT_SUBTYPE) != 0;
    }

    private boolean entityIsSet() {
      return (optBits & OPT_BIT_ENTITY) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean recordedIsSet() {
      return (optBits & OPT_BIT_RECORDED) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean actionIsSet() {
      return (optBits & OPT_BIT_ACTION) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean sourceIsSet() {
      return (initBits & INIT_BIT_SOURCE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of AuditEvent is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!sourceIsSet()) attributes.add("source");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build AuditEvent, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "AuditEvent", generator = "Immutables")
  public interface SourceBuildStage {
    /**
     * Initializes the value for the {@link AuditEvent#source() source} attribute.
     * @param source The value for source 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage source(com.fhir.AuditEvent_Source source);
  }

  @org.immutables.value.Generated(from = "AuditEvent", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link AuditEvent#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    TypeBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "AuditEvent", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link AuditEvent#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(com.fhir.Coding type);
  }

  @org.immutables.value.Generated(from = "AuditEvent", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link AuditEvent#purposeOfEvent() purposeOfEvent} to purposeOfEvent.
     * @param purposeOfEvent The value for purposeOfEvent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purposeOfEvent(java.util.List<com.fhir.CodeableConcept> purposeOfEvent);

    /**
     * Initializes the optional value {@link AuditEvent#purposeOfEvent() purposeOfEvent} to purposeOfEvent.
     * @param purposeOfEvent The value for purposeOfEvent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purposeOfEvent(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> purposeOfEvent);

    /**
     * Initializes the optional value {@link AuditEvent#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link AuditEvent#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link AuditEvent#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link AuditEvent#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link AuditEvent#outcomeDesc() outcomeDesc} to outcomeDesc.
     * @param outcomeDesc The value for outcomeDesc
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcomeDesc(java.lang.String outcomeDesc);

    /**
     * Initializes the optional value {@link AuditEvent#outcomeDesc() outcomeDesc} to outcomeDesc.
     * @param outcomeDesc The value for outcomeDesc
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcomeDesc(java.util.Optional<java.lang.String> outcomeDesc);

    /**
     * Initializes the optional value {@link AuditEvent#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link AuditEvent#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link AuditEvent#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link AuditEvent#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link AuditEvent#subtype() subtype} to subtype.
     * @param subtype The value for subtype
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subtype(java.util.List<com.fhir.Coding> subtype);

    /**
     * Initializes the optional value {@link AuditEvent#subtype() subtype} to subtype.
     * @param subtype The value for subtype
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subtype(java.util.Optional<? extends java.util.List<com.fhir.Coding>> subtype);

    /**
     * Initializes the optional value {@link AuditEvent#entity() entity} to entity.
     * @param entity The value for entity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal entity(java.util.List<com.fhir.AuditEvent_Entity> entity);

    /**
     * Initializes the optional value {@link AuditEvent#entity() entity} to entity.
     * @param entity The value for entity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal entity(java.util.Optional<? extends java.util.List<com.fhir.AuditEvent_Entity>> entity);

    /**
     * Initializes the optional value {@link AuditEvent#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(com.fhir.AuditeventOutcome outcome);

    /**
     * Initializes the optional value {@link AuditEvent#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(java.util.Optional<? extends com.fhir.AuditeventOutcome> outcome);

    /**
     * Initializes the optional value {@link AuditEvent#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recorded(com.fhir.instant recorded);

    /**
     * Initializes the optional value {@link AuditEvent#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recorded(java.util.Optional<? extends com.fhir.instant> recorded);

    /**
     * Initializes the optional value {@link AuditEvent#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link AuditEvent#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link AuditEvent#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link AuditEvent#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link AuditEvent#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link AuditEvent#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link AuditEvent#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    BuildFinal action(com.fhir.AuditeventAction action);

    /**
     * Initializes the optional value {@link AuditEvent#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal action(java.util.Optional<? extends com.fhir.AuditeventAction> action);

    /**
     * Initializes the optional value {@link AuditEvent#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(com.fhir.Period period);

    /**
     * Initializes the optional value {@link AuditEvent#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(java.util.Optional<? extends com.fhir.Period> period);

    /**
     * Adds one element to {@link AuditEvent#agent() agent} list.
     * @param element A agent element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAgent(com.fhir.AuditEvent_Agent element);

    /**
     * Adds elements to {@link AuditEvent#agent() agent} list.
     * @param elements An array of agent elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAgent(com.fhir.AuditEvent_Agent... elements);

    /**
     * Adds elements to {@link AuditEvent#agent() agent} list.
     * @param elements An iterable of agent elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllAgent(Iterable<? extends com.fhir.AuditEvent_Agent> elements);

    /**
     * Initializes the optional value {@link AuditEvent#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link AuditEvent#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Builds a new {@link AuditEvent AuditEvent}.
     * @return An immutable instance of AuditEvent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    AuditEvent build();
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
