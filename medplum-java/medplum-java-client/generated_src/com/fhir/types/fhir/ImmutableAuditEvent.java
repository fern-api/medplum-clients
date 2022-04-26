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
 * Immutable implementation of {@link AuditEvent}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuditEvent.builder()}.
 */
@Generated(from = "AuditEvent", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAuditEvent implements AuditEvent {
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Coding> subtype;
  private final AuditEvent_Source source;
  private final @Nullable Meta meta;
  private final Coding type;
  private final @Nullable Code language;
  private final String resourceType;
  private final @Nullable Uri implicitRules;
  private final @Nullable String outcomeDesc;
  private final @Nullable Period period;
  private final @Nullable Id id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Instant recorded;
  private final @Nullable Narrative text;
  private final @Nullable AuditeventOutcome outcome;
  private final @Nullable List<CodeableConcept> purposeOfEvent;
  private final @Nullable List<Extension> extension;
  private final @Nullable AuditeventAction action;
  private final List<AuditEvent_Agent> agent;
  private final @Nullable List<AuditEvent_Entity> entity;

  private ImmutableAuditEvent(
      @Nullable List<ResourceList> contained,
      @Nullable List<Coding> subtype,
      AuditEvent_Source source,
      @Nullable Meta meta,
      Coding type,
      @Nullable Code language,
      String resourceType,
      @Nullable Uri implicitRules,
      @Nullable String outcomeDesc,
      @Nullable Period period,
      @Nullable Id id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Instant recorded,
      @Nullable Narrative text,
      @Nullable AuditeventOutcome outcome,
      @Nullable List<CodeableConcept> purposeOfEvent,
      @Nullable List<Extension> extension,
      @Nullable AuditeventAction action,
      List<AuditEvent_Agent> agent,
      @Nullable List<AuditEvent_Entity> entity) {
    this.contained = contained;
    this.subtype = subtype;
    this.source = source;
    this.meta = meta;
    this.type = type;
    this.language = language;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.outcomeDesc = outcomeDesc;
    this.period = period;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.recorded = recorded;
    this.text = text;
    this.outcome = outcome;
    this.purposeOfEvent = purposeOfEvent;
    this.extension = extension;
    this.action = action;
    this.agent = agent;
    this.entity = entity;
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
   * @return The value of the {@code subtype} attribute
   */
  @JsonProperty("subtype")
  @Override
  public Optional<List<Coding>> subtype() {
    return Optional.ofNullable(subtype);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public AuditEvent_Source source() {
    return source;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Coding type() {
    return type;
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code outcomeDesc} attribute
   */
  @JsonProperty("outcomeDesc")
  @Override
  public Optional<String> outcomeDesc() {
    return Optional.ofNullable(outcomeDesc);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
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
   * @return The value of the {@code recorded} attribute
   */
  @JsonProperty("recorded")
  @Override
  public Optional<Instant> recorded() {
    return Optional.ofNullable(recorded);
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
   * @return The value of the {@code outcome} attribute
   */
  @JsonProperty("outcome")
  @Override
  public Optional<AuditeventOutcome> outcome() {
    return Optional.ofNullable(outcome);
  }

  /**
   * @return The value of the {@code purposeOfEvent} attribute
   */
  @JsonProperty("purposeOfEvent")
  @Override
  public Optional<List<CodeableConcept>> purposeOfEvent() {
    return Optional.ofNullable(purposeOfEvent);
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
   * @return The value of the {@code action} attribute
   */
  @JsonProperty("action")
  @Override
  public Optional<AuditeventAction> action() {
    return Optional.ofNullable(action);
  }

  /**
   * @return The value of the {@code agent} attribute
   */
  @JsonProperty("agent")
  @Override
  public List<AuditEvent_Agent> agent() {
    return agent;
  }

  /**
   * @return The value of the {@code entity} attribute
   */
  @JsonProperty("entity")
  @Override
  public Optional<List<AuditEvent_Entity>> entity() {
    return Optional.ofNullable(entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableAuditEvent(
        newValue,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableAuditEvent(
        value,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#subtype() subtype} attribute.
   * @param value The value for subtype
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withSubtype(List<Coding> value) {
    @Nullable List<Coding> newValue = Objects.requireNonNull(value, "subtype");
    if (this.subtype == newValue) return this;
    return new ImmutableAuditEvent(
        this.contained,
        newValue,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#subtype() subtype} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtype
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withSubtype(Optional<? extends List<Coding>> optional) {
    @Nullable List<Coding> value = optional.orElse(null);
    if (this.subtype == value) return this;
    return new ImmutableAuditEvent(
        this.contained,
        value,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuditEvent#source() source} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for source
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuditEvent withSource(AuditEvent_Source value) {
    if (this.source == value) return this;
    AuditEvent_Source newValue = Objects.requireNonNull(value, "source");
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        newValue,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        newValue,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        value,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuditEvent#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuditEvent withType(Coding value) {
    if (this.type == value) return this;
    Coding newValue = Objects.requireNonNull(value, "type");
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        newValue,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        value,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuditEvent#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuditEvent withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        newValue,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        newValue,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        value,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#outcomeDesc() outcomeDesc} attribute.
   * @param value The value for outcomeDesc
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withOutcomeDesc(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "outcomeDesc");
    if (Objects.equals(this.outcomeDesc, newValue)) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#outcomeDesc() outcomeDesc} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcomeDesc
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withOutcomeDesc(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.outcomeDesc, value)) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        value,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        newValue,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        value,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        newValue,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        value,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        newValue,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        value,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#recorded() recorded} attribute.
   * @param value The value for recorded
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withRecorded(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "recorded");
    if (this.recorded == newValue) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        newValue,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#recorded() recorded} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recorded
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withRecorded(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.recorded == value) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        value,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        newValue,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        value,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withOutcome(AuditeventOutcome value) {
    @Nullable AuditeventOutcome newValue = Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        newValue,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withOutcome(Optional<? extends AuditeventOutcome> optional) {
    @Nullable AuditeventOutcome value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        value,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#purposeOfEvent() purposeOfEvent} attribute.
   * @param value The value for purposeOfEvent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withPurposeOfEvent(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "purposeOfEvent");
    if (this.purposeOfEvent == newValue) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        newValue,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#purposeOfEvent() purposeOfEvent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purposeOfEvent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withPurposeOfEvent(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.purposeOfEvent == value) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        value,
        this.extension,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        newValue,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        value,
        this.action,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#action() action} attribute.
   * @param value The value for action
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withAction(AuditeventAction value) {
    @Nullable AuditeventAction newValue = Objects.requireNonNull(value, "action");
    if (this.action == newValue) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        newValue,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#action() action} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for action
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withAction(Optional<? extends AuditeventAction> optional) {
    @Nullable AuditeventAction value = optional.orElse(null);
    if (this.action == value) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        value,
        this.agent,
        this.entity);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AuditEvent#agent() agent}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withAgent(AuditEvent_Agent... elements) {
    List<AuditEvent_Agent> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        newValue,
        this.entity);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AuditEvent#agent() agent}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of agent elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withAgent(Iterable<? extends AuditEvent_Agent> elements) {
    if (this.agent == elements) return this;
    List<AuditEvent_Agent> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        newValue,
        this.entity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent#entity() entity} attribute.
   * @param value The value for entity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent withEntity(List<AuditEvent_Entity> value) {
    @Nullable List<AuditEvent_Entity> newValue = Objects.requireNonNull(value, "entity");
    if (this.entity == newValue) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent#entity() entity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent withEntity(Optional<? extends List<AuditEvent_Entity>> optional) {
    @Nullable List<AuditEvent_Entity> value = optional.orElse(null);
    if (this.entity == value) return this;
    return new ImmutableAuditEvent(
        this.contained,
        this.subtype,
        this.source,
        this.meta,
        this.type,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.outcomeDesc,
        this.period,
        this.id,
        this.modifierExtension,
        this.recorded,
        this.text,
        this.outcome,
        this.purposeOfEvent,
        this.extension,
        this.action,
        this.agent,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuditEvent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuditEvent
        && equalTo((ImmutableAuditEvent) another);
  }

  private boolean equalTo(ImmutableAuditEvent another) {
    return Objects.equals(contained, another.contained)
        && Objects.equals(subtype, another.subtype)
        && source.equals(another.source)
        && Objects.equals(meta, another.meta)
        && type.equals(another.type)
        && Objects.equals(language, another.language)
        && resourceType.equals(another.resourceType)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(outcomeDesc, another.outcomeDesc)
        && Objects.equals(period, another.period)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(recorded, another.recorded)
        && Objects.equals(text, another.text)
        && Objects.equals(outcome, another.outcome)
        && Objects.equals(purposeOfEvent, another.purposeOfEvent)
        && Objects.equals(extension, another.extension)
        && Objects.equals(action, another.action)
        && agent.equals(another.agent)
        && Objects.equals(entity, another.entity);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code subtype}, {@code source}, {@code meta}, {@code type}, {@code language}, {@code resourceType}, {@code implicitRules}, {@code outcomeDesc}, {@code period}, {@code id}, {@code modifierExtension}, {@code recorded}, {@code text}, {@code outcome}, {@code purposeOfEvent}, {@code extension}, {@code action}, {@code agent}, {@code entity}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(subtype);
    h += (h << 5) + source.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(outcomeDesc);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(recorded);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(outcome);
    h += (h << 5) + Objects.hashCode(purposeOfEvent);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(action);
    h += (h << 5) + agent.hashCode();
    h += (h << 5) + Objects.hashCode(entity);
    return h;
  }

  /**
   * Prints the immutable value {@code AuditEvent} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AuditEvent{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (subtype != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("subtype=").append(subtype);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("source=").append(source);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    builder.append(", ");
    builder.append("type=").append(type);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (outcomeDesc != null) {
      builder.append(", ");
      builder.append("outcomeDesc=").append(outcomeDesc);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (recorded != null) {
      builder.append(", ");
      builder.append("recorded=").append(recorded);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (outcome != null) {
      builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (purposeOfEvent != null) {
      builder.append(", ");
      builder.append("purposeOfEvent=").append(purposeOfEvent);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (action != null) {
      builder.append(", ");
      builder.append("action=").append(action);
    }
    builder.append(", ");
    builder.append("agent=").append(agent);
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
  @Generated(from = "AuditEvent", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AuditEvent {
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Coding>> subtype = Optional.empty();
    boolean subtypeIsSet;
    @Nullable AuditEvent_Source source;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Coding type;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<String> outcomeDesc = Optional.empty();
    boolean outcomeDescIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Instant> recorded = Optional.empty();
    boolean recordedIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<AuditeventOutcome> outcome = Optional.empty();
    boolean outcomeIsSet;
    @Nullable Optional<List<CodeableConcept>> purposeOfEvent = Optional.empty();
    boolean purposeOfEventIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<AuditeventAction> action = Optional.empty();
    boolean actionIsSet;
    @Nullable List<AuditEvent_Agent> agent = Collections.emptyList();
    @Nullable Optional<List<AuditEvent_Entity>> entity = Optional.empty();
    boolean entityIsSet;
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("subtype")
    public void setSubtype(Optional<List<Coding>> subtype) {
      this.subtype = subtype;
      this.subtypeIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(AuditEvent_Source source) {
      this.source = source;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Coding type) {
      this.type = type;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("outcomeDesc")
    public void setOutcomeDesc(Optional<String> outcomeDesc) {
      this.outcomeDesc = outcomeDesc;
      this.outcomeDescIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
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
    @JsonProperty("recorded")
    public void setRecorded(Optional<Instant> recorded) {
      this.recorded = recorded;
      this.recordedIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("outcome")
    public void setOutcome(Optional<AuditeventOutcome> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @JsonProperty("purposeOfEvent")
    public void setPurposeOfEvent(Optional<List<CodeableConcept>> purposeOfEvent) {
      this.purposeOfEvent = purposeOfEvent;
      this.purposeOfEventIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("action")
    public void setAction(Optional<AuditeventAction> action) {
      this.action = action;
      this.actionIsSet = true;
    }
    @JsonProperty("agent")
    public void setAgent(List<AuditEvent_Agent> agent) {
      this.agent = agent;
    }
    @JsonProperty("entity")
    public void setEntity(Optional<List<AuditEvent_Entity>> entity) {
      this.entity = entity;
      this.entityIsSet = true;
    }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coding>> subtype() { throw new UnsupportedOperationException(); }
    @Override
    public AuditEvent_Source source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Coding type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> outcomeDesc() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> recorded() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<AuditeventOutcome> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> purposeOfEvent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<AuditeventAction> action() { throw new UnsupportedOperationException(); }
    @Override
    public List<AuditEvent_Agent> agent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<AuditEvent_Entity>> entity() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAuditEvent fromJson(Json json) {
    ImmutableAuditEvent.Builder builder = ((ImmutableAuditEvent.Builder) ImmutableAuditEvent.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.subtypeIsSet) {
      builder.subtype(json.subtype);
    }
    if (json.source != null) {
      builder.source(json.source);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.outcomeDescIsSet) {
      builder.outcomeDesc(json.outcomeDesc);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.recordedIsSet) {
      builder.recorded(json.recorded);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.purposeOfEventIsSet) {
      builder.purposeOfEvent(json.purposeOfEvent);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.actionIsSet) {
      builder.action(json.action);
    }
    if (json.agent != null) {
      builder.addAllAgent(json.agent);
    }
    if (json.entityIsSet) {
      builder.entity(json.entity);
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
        .contained(instance.contained())
        .subtype(instance.subtype())
        .source(instance.source())
        .meta(instance.meta())
        .type(instance.type())
        .language(instance.language())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .outcomeDesc(instance.outcomeDesc())
        .period(instance.period())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .recorded(instance.recorded())
        .text(instance.text())
        .outcome(instance.outcome())
        .purposeOfEvent(instance.purposeOfEvent())
        .extension(instance.extension())
        .action(instance.action())
        .addAllAgent(instance.agent())
        .entity(instance.entity())
        .build();
  }

  /**
   * Creates a builder for {@link AuditEvent AuditEvent}.
   * <pre>
   * ImmutableAuditEvent.builder()
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link AuditEvent#contained() contained}
   *    .subtype(List&amp;lt;com.fhir.types.fhir.Coding&amp;gt;) // optional {@link AuditEvent#subtype() subtype}
   *    .source(com.fhir.types.fhir.AuditEvent_Source) // required {@link AuditEvent#source() source}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link AuditEvent#meta() meta}
   *    .type(com.fhir.types.fhir.Coding) // required {@link AuditEvent#type() type}
   *    .language(com.fhir.types.fhir.Code) // optional {@link AuditEvent#language() language}
   *    .resourceType(String) // required {@link AuditEvent#resourceType() resourceType}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link AuditEvent#implicitRules() implicitRules}
   *    .outcomeDesc(String) // optional {@link AuditEvent#outcomeDesc() outcomeDesc}
   *    .period(com.fhir.types.fhir.Period) // optional {@link AuditEvent#period() period}
   *    .id(com.fhir.types.fhir.Id) // optional {@link AuditEvent#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link AuditEvent#modifierExtension() modifierExtension}
   *    .recorded(com.fhir.types.fhir.Instant) // optional {@link AuditEvent#recorded() recorded}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link AuditEvent#text() text}
   *    .outcome(com.fhir.types.fhir.AuditeventOutcome) // optional {@link AuditEvent#outcome() outcome}
   *    .purposeOfEvent(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link AuditEvent#purposeOfEvent() purposeOfEvent}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link AuditEvent#extension() extension}
   *    .action(com.fhir.types.fhir.AuditeventAction) // optional {@link AuditEvent#action() action}
   *    .addAgent|addAllAgent(com.fhir.types.fhir.AuditEvent_Agent) // {@link AuditEvent#agent() agent} elements
   *    .entity(List&amp;lt;com.fhir.types.fhir.AuditEvent_Entity&amp;gt;) // optional {@link AuditEvent#entity() entity}
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
  @Generated(from = "AuditEvent", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements SourceBuildStage, TypeBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SOURCE = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_SUBTYPE = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10L;
    private static final long OPT_BIT_OUTCOME_DESC = 0x20L;
    private static final long OPT_BIT_PERIOD = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_RECORDED = 0x200L;
    private static final long OPT_BIT_TEXT = 0x400L;
    private static final long OPT_BIT_OUTCOME = 0x800L;
    private static final long OPT_BIT_PURPOSE_OF_EVENT = 0x1000L;
    private static final long OPT_BIT_EXTENSION = 0x2000L;
    private static final long OPT_BIT_ACTION = 0x4000L;
    private static final long OPT_BIT_ENTITY = 0x8000L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable List<ResourceList> contained;
    private @Nullable List<Coding> subtype;
    private @Nullable AuditEvent_Source source;
    private @Nullable Meta meta;
    private @Nullable Coding type;
    private @Nullable Code language;
    private @Nullable String resourceType;
    private @Nullable Uri implicitRules;
    private @Nullable String outcomeDesc;
    private @Nullable Period period;
    private @Nullable Id id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Instant recorded;
    private @Nullable Narrative text;
    private @Nullable AuditeventOutcome outcome;
    private @Nullable List<CodeableConcept> purposeOfEvent;
    private @Nullable List<Extension> extension;
    private @Nullable AuditeventAction action;
    private final List<AuditEvent_Agent> agent = new ArrayList<AuditEvent_Agent>();
    private @Nullable List<AuditEvent_Entity> entity;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AuditEvent#contained() contained} to contained.
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
     * Initializes the optional value {@link AuditEvent#contained() contained} to contained.
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
     * Initializes the optional value {@link AuditEvent#subtype() subtype} to subtype.
     * @param subtype The value for subtype
     * @return {@code this} builder for chained invocation
     */
    public final Builder subtype(List<Coding> subtype) {
      checkNotIsSet(subtypeIsSet(), "subtype");
      this.subtype = Objects.requireNonNull(subtype, "subtype");
      optBits |= OPT_BIT_SUBTYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#subtype() subtype} to subtype.
     * @param subtype The value for subtype
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subtype")
    public final Builder subtype(Optional<? extends List<Coding>> subtype) {
      checkNotIsSet(subtypeIsSet(), "subtype");
      this.subtype = subtype.orElse(null);
      optBits |= OPT_BIT_SUBTYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link AuditEvent#source() source} attribute.
     * @param source The value for source 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(AuditEvent_Source source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      initBits &= ~INIT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#meta() meta} to meta.
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
     * Initializes the optional value {@link AuditEvent#meta() meta} to meta.
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
     * Initializes the value for the {@link AuditEvent#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Coding type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#language() language} to language.
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
     * Initializes the optional value {@link AuditEvent#language() language} to language.
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
     * Initializes the value for the {@link AuditEvent#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link AuditEvent#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link AuditEvent#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link AuditEvent#outcomeDesc() outcomeDesc} to outcomeDesc.
     * @param outcomeDesc The value for outcomeDesc
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcomeDesc(String outcomeDesc) {
      checkNotIsSet(outcomeDescIsSet(), "outcomeDesc");
      this.outcomeDesc = Objects.requireNonNull(outcomeDesc, "outcomeDesc");
      optBits |= OPT_BIT_OUTCOME_DESC;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#outcomeDesc() outcomeDesc} to outcomeDesc.
     * @param outcomeDesc The value for outcomeDesc
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcomeDesc")
    public final Builder outcomeDesc(Optional<String> outcomeDesc) {
      checkNotIsSet(outcomeDescIsSet(), "outcomeDesc");
      this.outcomeDesc = outcomeDesc.orElse(null);
      optBits |= OPT_BIT_OUTCOME_DESC;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#id() id} to id.
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
     * Initializes the optional value {@link AuditEvent#id() id} to id.
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
     * Initializes the optional value {@link AuditEvent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AuditEvent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AuditEvent#recorded() recorded} to recorded.
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
     * Initializes the optional value {@link AuditEvent#recorded() recorded} to recorded.
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
     * Initializes the optional value {@link AuditEvent#text() text} to text.
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
     * Initializes the optional value {@link AuditEvent#text() text} to text.
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
     * Initializes the optional value {@link AuditEvent#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(AuditeventOutcome outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder outcome(Optional<? extends AuditeventOutcome> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#purposeOfEvent() purposeOfEvent} to purposeOfEvent.
     * @param purposeOfEvent The value for purposeOfEvent
     * @return {@code this} builder for chained invocation
     */
    public final Builder purposeOfEvent(List<CodeableConcept> purposeOfEvent) {
      checkNotIsSet(purposeOfEventIsSet(), "purposeOfEvent");
      this.purposeOfEvent = Objects.requireNonNull(purposeOfEvent, "purposeOfEvent");
      optBits |= OPT_BIT_PURPOSE_OF_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#purposeOfEvent() purposeOfEvent} to purposeOfEvent.
     * @param purposeOfEvent The value for purposeOfEvent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("purposeOfEvent")
    public final Builder purposeOfEvent(Optional<? extends List<CodeableConcept>> purposeOfEvent) {
      checkNotIsSet(purposeOfEventIsSet(), "purposeOfEvent");
      this.purposeOfEvent = purposeOfEvent.orElse(null);
      optBits |= OPT_BIT_PURPOSE_OF_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#extension() extension} to extension.
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
     * Initializes the optional value {@link AuditEvent#extension() extension} to extension.
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
     * Initializes the optional value {@link AuditEvent#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    public final Builder action(AuditeventAction action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = Objects.requireNonNull(action, "action");
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("action")
    public final Builder action(Optional<? extends AuditeventAction> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = action.orElse(null);
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Adds one element to {@link AuditEvent#agent() agent} list.
     * @param element A agent element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAgent(AuditEvent_Agent element) {
      this.agent.add(Objects.requireNonNull(element, "agent element"));
      return this;
    }

    /**
     * Adds elements to {@link AuditEvent#agent() agent} list.
     * @param elements An array of agent elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAgent(AuditEvent_Agent... elements) {
      for (AuditEvent_Agent element : elements) {
        this.agent.add(Objects.requireNonNull(element, "agent element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link AuditEvent#agent() agent} list.
     * @param elements An iterable of agent elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAgent(Iterable<? extends AuditEvent_Agent> elements) {
      for (AuditEvent_Agent element : elements) {
        this.agent.add(Objects.requireNonNull(element, "agent element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#entity() entity} to entity.
     * @param entity The value for entity
     * @return {@code this} builder for chained invocation
     */
    public final Builder entity(List<AuditEvent_Entity> entity) {
      checkNotIsSet(entityIsSet(), "entity");
      this.entity = Objects.requireNonNull(entity, "entity");
      optBits |= OPT_BIT_ENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent#entity() entity} to entity.
     * @param entity The value for entity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entity")
    public final Builder entity(Optional<? extends List<AuditEvent_Entity>> entity) {
      checkNotIsSet(entityIsSet(), "entity");
      this.entity = entity.orElse(null);
      optBits |= OPT_BIT_ENTITY;
      return this;
    }

    /**
     * Builds a new {@link AuditEvent AuditEvent}.
     * @return An immutable instance of AuditEvent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public AuditEvent build() {
      checkRequiredAttributes();
      return new ImmutableAuditEvent(
          contained,
          subtype,
          source,
          meta,
          type,
          language,
          resourceType,
          implicitRules,
          outcomeDesc,
          period,
          id,
          modifierExtension,
          recorded,
          text,
          outcome,
          purposeOfEvent,
          extension,
          action,
          createUnmodifiableList(true, agent),
          entity);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean subtypeIsSet() {
      return (optBits & OPT_BIT_SUBTYPE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean outcomeDescIsSet() {
      return (optBits & OPT_BIT_OUTCOME_DESC) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean recordedIsSet() {
      return (optBits & OPT_BIT_RECORDED) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean purposeOfEventIsSet() {
      return (optBits & OPT_BIT_PURPOSE_OF_EVENT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean actionIsSet() {
      return (optBits & OPT_BIT_ACTION) != 0;
    }

    private boolean entityIsSet() {
      return (optBits & OPT_BIT_ENTITY) != 0;
    }

    private boolean sourceIsSet() {
      return (initBits & INIT_BIT_SOURCE) == 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of AuditEvent is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!sourceIsSet()) attributes.add("source");
      if (!typeIsSet()) attributes.add("type");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build AuditEvent, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "AuditEvent", generator = "Immutables")
  public interface SourceBuildStage {
    /**
     * Initializes the value for the {@link AuditEvent#source() source} attribute.
     * @param source The value for source 
     * @return {@code this} builder for use in a chained invocation
     */
    TypeBuildStage source(AuditEvent_Source source);
  }

  @Generated(from = "AuditEvent", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link AuditEvent#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage type(Coding type);
  }

  @Generated(from = "AuditEvent", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link AuditEvent#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "AuditEvent", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link AuditEvent#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link AuditEvent#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link AuditEvent#subtype() subtype} to subtype.
     * @param subtype The value for subtype
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subtype(List<Coding> subtype);

    /**
     * Initializes the optional value {@link AuditEvent#subtype() subtype} to subtype.
     * @param subtype The value for subtype
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subtype(Optional<? extends List<Coding>> subtype);

    /**
     * Initializes the optional value {@link AuditEvent#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link AuditEvent#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link AuditEvent#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link AuditEvent#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link AuditEvent#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link AuditEvent#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link AuditEvent#outcomeDesc() outcomeDesc} to outcomeDesc.
     * @param outcomeDesc The value for outcomeDesc
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcomeDesc(String outcomeDesc);

    /**
     * Initializes the optional value {@link AuditEvent#outcomeDesc() outcomeDesc} to outcomeDesc.
     * @param outcomeDesc The value for outcomeDesc
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcomeDesc(Optional<String> outcomeDesc);

    /**
     * Initializes the optional value {@link AuditEvent#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link AuditEvent#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Initializes the optional value {@link AuditEvent#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link AuditEvent#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link AuditEvent#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link AuditEvent#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link AuditEvent#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recorded(Instant recorded);

    /**
     * Initializes the optional value {@link AuditEvent#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recorded(Optional<? extends Instant> recorded);

    /**
     * Initializes the optional value {@link AuditEvent#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link AuditEvent#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link AuditEvent#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(AuditeventOutcome outcome);

    /**
     * Initializes the optional value {@link AuditEvent#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(Optional<? extends AuditeventOutcome> outcome);

    /**
     * Initializes the optional value {@link AuditEvent#purposeOfEvent() purposeOfEvent} to purposeOfEvent.
     * @param purposeOfEvent The value for purposeOfEvent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purposeOfEvent(List<CodeableConcept> purposeOfEvent);

    /**
     * Initializes the optional value {@link AuditEvent#purposeOfEvent() purposeOfEvent} to purposeOfEvent.
     * @param purposeOfEvent The value for purposeOfEvent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purposeOfEvent(Optional<? extends List<CodeableConcept>> purposeOfEvent);

    /**
     * Initializes the optional value {@link AuditEvent#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link AuditEvent#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link AuditEvent#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    BuildFinal action(AuditeventAction action);

    /**
     * Initializes the optional value {@link AuditEvent#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal action(Optional<? extends AuditeventAction> action);

    /**
     * Adds one element to {@link AuditEvent#agent() agent} list.
     * @param element A agent element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAgent(AuditEvent_Agent element);

    /**
     * Adds elements to {@link AuditEvent#agent() agent} list.
     * @param elements An array of agent elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAgent(AuditEvent_Agent... elements);

    /**
     * Adds elements to {@link AuditEvent#agent() agent} list.
     * @param elements An iterable of agent elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllAgent(Iterable<? extends AuditEvent_Agent> elements);

    /**
     * Initializes the optional value {@link AuditEvent#entity() entity} to entity.
     * @param entity The value for entity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal entity(List<AuditEvent_Entity> entity);

    /**
     * Initializes the optional value {@link AuditEvent#entity() entity} to entity.
     * @param entity The value for entity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal entity(Optional<? extends List<AuditEvent_Entity>> entity);

    /**
     * Builds a new {@link AuditEvent AuditEvent}.
     * @return An immutable instance of AuditEvent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    AuditEvent build();
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
