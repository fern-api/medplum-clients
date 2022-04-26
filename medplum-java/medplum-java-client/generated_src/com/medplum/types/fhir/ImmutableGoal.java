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
 * Immutable implementation of {@link Goal}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGoal.builder()}.
 */
@Generated(from = "Goal", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableGoal implements Goal {
  private final @Nullable CodeableConcept startCodeableConcept;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<CodeableConcept> category;
  private final Reference subject;
  private final @Nullable List<Goal_Target> target;
  private final @Nullable Id id;
  private final @Nullable List<Reference> addresses;
  private final @Nullable List<Reference> outcomeReference;
  private final @Nullable List<Annotation> note;
  private final CodeableConcept description;
  private final @Nullable String statusReason;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept achievementStatus;
  private final @Nullable Date statusDate;
  private final String resourceType;
  private final @Nullable CodeableConcept priority;
  private final @Nullable Meta meta;
  private final @Nullable Narrative text;
  private final @Nullable GoalLifecyclestatus lifecycleStatus;
  private final @Nullable Reference expressedBy;
  private final @Nullable List<CodeableConcept> outcomeCode;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code language;
  private final @Nullable String startDate;

  private ImmutableGoal(
      @Nullable CodeableConcept startCodeableConcept,
      @Nullable Uri implicitRules,
      @Nullable List<CodeableConcept> category,
      Reference subject,
      @Nullable List<Goal_Target> target,
      @Nullable Id id,
      @Nullable List<Reference> addresses,
      @Nullable List<Reference> outcomeReference,
      @Nullable List<Annotation> note,
      CodeableConcept description,
      @Nullable String statusReason,
      @Nullable List<Identifier> identifier,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept achievementStatus,
      @Nullable Date statusDate,
      String resourceType,
      @Nullable CodeableConcept priority,
      @Nullable Meta meta,
      @Nullable Narrative text,
      @Nullable GoalLifecyclestatus lifecycleStatus,
      @Nullable Reference expressedBy,
      @Nullable List<CodeableConcept> outcomeCode,
      @Nullable List<Extension> extension,
      @Nullable Code language,
      @Nullable String startDate) {
    this.startCodeableConcept = startCodeableConcept;
    this.implicitRules = implicitRules;
    this.category = category;
    this.subject = subject;
    this.target = target;
    this.id = id;
    this.addresses = addresses;
    this.outcomeReference = outcomeReference;
    this.note = note;
    this.description = description;
    this.statusReason = statusReason;
    this.identifier = identifier;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.achievementStatus = achievementStatus;
    this.statusDate = statusDate;
    this.resourceType = resourceType;
    this.priority = priority;
    this.meta = meta;
    this.text = text;
    this.lifecycleStatus = lifecycleStatus;
    this.expressedBy = expressedBy;
    this.outcomeCode = outcomeCode;
    this.extension = extension;
    this.language = language;
    this.startDate = startDate;
  }

  /**
   * @return The value of the {@code startCodeableConcept} attribute
   */
  @JsonProperty("startCodeableConcept")
  @Override
  public Optional<CodeableConcept> startCodeableConcept() {
    return Optional.ofNullable(startCodeableConcept);
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<CodeableConcept>> category() {
    return Optional.ofNullable(category);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Reference subject() {
    return subject;
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public Optional<List<Goal_Target>> target() {
    return Optional.ofNullable(target);
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
   * @return The value of the {@code addresses} attribute
   */
  @JsonProperty("addresses")
  @Override
  public Optional<List<Reference>> addresses() {
    return Optional.ofNullable(addresses);
  }

  /**
   * @return The value of the {@code outcomeReference} attribute
   */
  @JsonProperty("outcomeReference")
  @Override
  public Optional<List<Reference>> outcomeReference() {
    return Optional.ofNullable(outcomeReference);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public CodeableConcept description() {
    return description;
  }

  /**
   * @return The value of the {@code statusReason} attribute
   */
  @JsonProperty("statusReason")
  @Override
  public Optional<String> statusReason() {
    return Optional.ofNullable(statusReason);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code achievementStatus} attribute
   */
  @JsonProperty("achievementStatus")
  @Override
  public Optional<CodeableConcept> achievementStatus() {
    return Optional.ofNullable(achievementStatus);
  }

  /**
   * @return The value of the {@code statusDate} attribute
   */
  @JsonProperty("statusDate")
  @Override
  public Optional<Date> statusDate() {
    return Optional.ofNullable(statusDate);
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
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public Optional<CodeableConcept> priority() {
    return Optional.ofNullable(priority);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code lifecycleStatus} attribute
   */
  @JsonProperty("lifecycleStatus")
  @Override
  public Optional<GoalLifecyclestatus> lifecycleStatus() {
    return Optional.ofNullable(lifecycleStatus);
  }

  /**
   * @return The value of the {@code expressedBy} attribute
   */
  @JsonProperty("expressedBy")
  @Override
  public Optional<Reference> expressedBy() {
    return Optional.ofNullable(expressedBy);
  }

  /**
   * @return The value of the {@code outcomeCode} attribute
   */
  @JsonProperty("outcomeCode")
  @Override
  public Optional<List<CodeableConcept>> outcomeCode() {
    return Optional.ofNullable(outcomeCode);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code startDate} attribute
   */
  @JsonProperty("startDate")
  @Override
  public Optional<String> startDate() {
    return Optional.ofNullable(startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#startCodeableConcept() startCodeableConcept} attribute.
   * @param value The value for startCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withStartCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "startCodeableConcept");
    if (this.startCodeableConcept == newValue) return this;
    return new ImmutableGoal(
        newValue,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#startCodeableConcept() startCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for startCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withStartCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.startCodeableConcept == value) return this;
    return new ImmutableGoal(
        value,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        newValue,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        value,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        newValue,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        value,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Goal#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGoal withSubject(Reference value) {
    if (this.subject == value) return this;
    Reference newValue = Objects.requireNonNull(value, "subject");
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        newValue,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withTarget(List<Goal_Target> value) {
    @Nullable List<Goal_Target> newValue = Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        newValue,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withTarget(Optional<? extends List<Goal_Target>> optional) {
    @Nullable List<Goal_Target> value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        value,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        newValue,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        value,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#addresses() addresses} attribute.
   * @param value The value for addresses
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withAddresses(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "addresses");
    if (this.addresses == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        newValue,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#addresses() addresses} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for addresses
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withAddresses(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.addresses == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        value,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#outcomeReference() outcomeReference} attribute.
   * @param value The value for outcomeReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withOutcomeReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "outcomeReference");
    if (this.outcomeReference == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        newValue,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#outcomeReference() outcomeReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcomeReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withOutcomeReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.outcomeReference == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        value,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        newValue,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        value,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Goal#description() description} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGoal withDescription(CodeableConcept value) {
    if (this.description == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "description");
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        newValue,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withStatusReason(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "statusReason");
    if (Objects.equals(this.statusReason, newValue)) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        newValue,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#statusReason() statusReason} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withStatusReason(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.statusReason, value)) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        value,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        newValue,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        value,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        newValue,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        value,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        newValue,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        value,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#achievementStatus() achievementStatus} attribute.
   * @param value The value for achievementStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withAchievementStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "achievementStatus");
    if (this.achievementStatus == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        newValue,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#achievementStatus() achievementStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for achievementStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withAchievementStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.achievementStatus == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        value,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#statusDate() statusDate} attribute.
   * @param value The value for statusDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withStatusDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "statusDate");
    if (this.statusDate == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        newValue,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#statusDate() statusDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withStatusDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.statusDate == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        value,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Goal#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGoal withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        newValue,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withPriority(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        newValue,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withPriority(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        value,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        newValue,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        value,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        newValue,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        value,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#lifecycleStatus() lifecycleStatus} attribute.
   * @param value The value for lifecycleStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withLifecycleStatus(GoalLifecyclestatus value) {
    @Nullable GoalLifecyclestatus newValue = Objects.requireNonNull(value, "lifecycleStatus");
    if (this.lifecycleStatus == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        newValue,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#lifecycleStatus() lifecycleStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lifecycleStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withLifecycleStatus(Optional<? extends GoalLifecyclestatus> optional) {
    @Nullable GoalLifecyclestatus value = optional.orElse(null);
    if (this.lifecycleStatus == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        value,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#expressedBy() expressedBy} attribute.
   * @param value The value for expressedBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withExpressedBy(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "expressedBy");
    if (this.expressedBy == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        newValue,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#expressedBy() expressedBy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expressedBy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withExpressedBy(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.expressedBy == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        value,
        this.outcomeCode,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#outcomeCode() outcomeCode} attribute.
   * @param value The value for outcomeCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withOutcomeCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "outcomeCode");
    if (this.outcomeCode == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        newValue,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#outcomeCode() outcomeCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcomeCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withOutcomeCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.outcomeCode == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        value,
        this.extension,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        newValue,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        value,
        this.language,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        newValue,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        value,
        this.startDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#startDate() startDate} attribute.
   * @param value The value for startDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withStartDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "startDate");
    if (Objects.equals(this.startDate, newValue)) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#startDate() startDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for startDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withStartDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.startDate, value)) return this;
    return new ImmutableGoal(
        this.startCodeableConcept,
        this.implicitRules,
        this.category,
        this.subject,
        this.target,
        this.id,
        this.addresses,
        this.outcomeReference,
        this.note,
        this.description,
        this.statusReason,
        this.identifier,
        this.contained,
        this.modifierExtension,
        this.achievementStatus,
        this.statusDate,
        this.resourceType,
        this.priority,
        this.meta,
        this.text,
        this.lifecycleStatus,
        this.expressedBy,
        this.outcomeCode,
        this.extension,
        this.language,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGoal} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGoal
        && equalTo((ImmutableGoal) another);
  }

  private boolean equalTo(ImmutableGoal another) {
    return Objects.equals(startCodeableConcept, another.startCodeableConcept)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(category, another.category)
        && subject.equals(another.subject)
        && Objects.equals(target, another.target)
        && Objects.equals(id, another.id)
        && Objects.equals(addresses, another.addresses)
        && Objects.equals(outcomeReference, another.outcomeReference)
        && Objects.equals(note, another.note)
        && description.equals(another.description)
        && Objects.equals(statusReason, another.statusReason)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(contained, another.contained)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(achievementStatus, another.achievementStatus)
        && Objects.equals(statusDate, another.statusDate)
        && resourceType.equals(another.resourceType)
        && Objects.equals(priority, another.priority)
        && Objects.equals(meta, another.meta)
        && Objects.equals(text, another.text)
        && Objects.equals(lifecycleStatus, another.lifecycleStatus)
        && Objects.equals(expressedBy, another.expressedBy)
        && Objects.equals(outcomeCode, another.outcomeCode)
        && Objects.equals(extension, another.extension)
        && Objects.equals(language, another.language)
        && Objects.equals(startDate, another.startDate);
  }

  /**
   * Computes a hash code from attributes: {@code startCodeableConcept}, {@code implicitRules}, {@code category}, {@code subject}, {@code target}, {@code id}, {@code addresses}, {@code outcomeReference}, {@code note}, {@code description}, {@code statusReason}, {@code identifier}, {@code contained}, {@code modifierExtension}, {@code achievementStatus}, {@code statusDate}, {@code resourceType}, {@code priority}, {@code meta}, {@code text}, {@code lifecycleStatus}, {@code expressedBy}, {@code outcomeCode}, {@code extension}, {@code language}, {@code startDate}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(startCodeableConcept);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + Objects.hashCode(target);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(addresses);
    h += (h << 5) + Objects.hashCode(outcomeReference);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + description.hashCode();
    h += (h << 5) + Objects.hashCode(statusReason);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(achievementStatus);
    h += (h << 5) + Objects.hashCode(statusDate);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(lifecycleStatus);
    h += (h << 5) + Objects.hashCode(expressedBy);
    h += (h << 5) + Objects.hashCode(outcomeCode);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(startDate);
    return h;
  }

  /**
   * Prints the immutable value {@code Goal} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Goal{");
    if (startCodeableConcept != null) {
      builder.append("startCodeableConcept=").append(startCodeableConcept);
    }
    if (implicitRules != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (category != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (builder.length() > 5) builder.append(", ");
    builder.append("subject=").append(subject);
    if (target != null) {
      builder.append(", ");
      builder.append("target=").append(target);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (addresses != null) {
      builder.append(", ");
      builder.append("addresses=").append(addresses);
    }
    if (outcomeReference != null) {
      builder.append(", ");
      builder.append("outcomeReference=").append(outcomeReference);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    builder.append(", ");
    builder.append("description=").append(description);
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (achievementStatus != null) {
      builder.append(", ");
      builder.append("achievementStatus=").append(achievementStatus);
    }
    if (statusDate != null) {
      builder.append(", ");
      builder.append("statusDate=").append(statusDate);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (lifecycleStatus != null) {
      builder.append(", ");
      builder.append("lifecycleStatus=").append(lifecycleStatus);
    }
    if (expressedBy != null) {
      builder.append(", ");
      builder.append("expressedBy=").append(expressedBy);
    }
    if (outcomeCode != null) {
      builder.append(", ");
      builder.append("outcomeCode=").append(outcomeCode);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (startDate != null) {
      builder.append(", ");
      builder.append("startDate=").append(startDate);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Goal", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Goal {
    @Nullable Optional<CodeableConcept> startCodeableConcept = Optional.empty();
    boolean startCodeableConceptIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Reference subject;
    @Nullable Optional<List<Goal_Target>> target = Optional.empty();
    boolean targetIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Reference>> addresses = Optional.empty();
    boolean addressesIsSet;
    @Nullable Optional<List<Reference>> outcomeReference = Optional.empty();
    boolean outcomeReferenceIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable CodeableConcept description;
    @Nullable Optional<String> statusReason = Optional.empty();
    boolean statusReasonIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> achievementStatus = Optional.empty();
    boolean achievementStatusIsSet;
    @Nullable Optional<Date> statusDate = Optional.empty();
    boolean statusDateIsSet;
    @Nullable String resourceType;
    @Nullable Optional<CodeableConcept> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<GoalLifecyclestatus> lifecycleStatus = Optional.empty();
    boolean lifecycleStatusIsSet;
    @Nullable Optional<Reference> expressedBy = Optional.empty();
    boolean expressedByIsSet;
    @Nullable Optional<List<CodeableConcept>> outcomeCode = Optional.empty();
    boolean outcomeCodeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<String> startDate = Optional.empty();
    boolean startDateIsSet;
    @JsonProperty("startCodeableConcept")
    public void setStartCodeableConcept(Optional<CodeableConcept> startCodeableConcept) {
      this.startCodeableConcept = startCodeableConcept;
      this.startCodeableConceptIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
      this.subject = subject;
    }
    @JsonProperty("target")
    public void setTarget(Optional<List<Goal_Target>> target) {
      this.target = target;
      this.targetIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("addresses")
    public void setAddresses(Optional<List<Reference>> addresses) {
      this.addresses = addresses;
      this.addressesIsSet = true;
    }
    @JsonProperty("outcomeReference")
    public void setOutcomeReference(Optional<List<Reference>> outcomeReference) {
      this.outcomeReference = outcomeReference;
      this.outcomeReferenceIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(CodeableConcept description) {
      this.description = description;
    }
    @JsonProperty("statusReason")
    public void setStatusReason(Optional<String> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("achievementStatus")
    public void setAchievementStatus(Optional<CodeableConcept> achievementStatus) {
      this.achievementStatus = achievementStatus;
      this.achievementStatusIsSet = true;
    }
    @JsonProperty("statusDate")
    public void setStatusDate(Optional<Date> statusDate) {
      this.statusDate = statusDate;
      this.statusDateIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<CodeableConcept> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("lifecycleStatus")
    public void setLifecycleStatus(Optional<GoalLifecyclestatus> lifecycleStatus) {
      this.lifecycleStatus = lifecycleStatus;
      this.lifecycleStatusIsSet = true;
    }
    @JsonProperty("expressedBy")
    public void setExpressedBy(Optional<Reference> expressedBy) {
      this.expressedBy = expressedBy;
      this.expressedByIsSet = true;
    }
    @JsonProperty("outcomeCode")
    public void setOutcomeCode(Optional<List<CodeableConcept>> outcomeCode) {
      this.outcomeCode = outcomeCode;
      this.outcomeCodeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("startDate")
    public void setStartDate(Optional<String> startDate) {
      this.startDate = startDate;
      this.startDateIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> startCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Goal_Target>> target() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> addresses() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> outcomeReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> achievementStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> statusDate() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> priority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<GoalLifecyclestatus> lifecycleStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> expressedBy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> outcomeCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> startDate() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableGoal fromJson(Json json) {
    ImmutableGoal.Builder builder = ((ImmutableGoal.Builder) ImmutableGoal.builder());
    if (json.startCodeableConceptIsSet) {
      builder.startCodeableConcept(json.startCodeableConcept);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.addressesIsSet) {
      builder.addresses(json.addresses);
    }
    if (json.outcomeReferenceIsSet) {
      builder.outcomeReference(json.outcomeReference);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.achievementStatusIsSet) {
      builder.achievementStatus(json.achievementStatus);
    }
    if (json.statusDateIsSet) {
      builder.statusDate(json.statusDate);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.lifecycleStatusIsSet) {
      builder.lifecycleStatus(json.lifecycleStatus);
    }
    if (json.expressedByIsSet) {
      builder.expressedBy(json.expressedBy);
    }
    if (json.outcomeCodeIsSet) {
      builder.outcomeCode(json.outcomeCode);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.startDateIsSet) {
      builder.startDate(json.startDate);
    }
    return (ImmutableGoal) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Goal} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Goal instance
   */
  public static Goal copyOf(Goal instance) {
    if (instance instanceof ImmutableGoal) {
      return (ImmutableGoal) instance;
    }
    return ((ImmutableGoal.Builder) ImmutableGoal.builder())
        .startCodeableConcept(instance.startCodeableConcept())
        .implicitRules(instance.implicitRules())
        .category(instance.category())
        .subject(instance.subject())
        .target(instance.target())
        .id(instance.id())
        .addresses(instance.addresses())
        .outcomeReference(instance.outcomeReference())
        .note(instance.note())
        .description(instance.description())
        .statusReason(instance.statusReason())
        .identifier(instance.identifier())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .achievementStatus(instance.achievementStatus())
        .statusDate(instance.statusDate())
        .resourceType(instance.resourceType())
        .priority(instance.priority())
        .meta(instance.meta())
        .text(instance.text())
        .lifecycleStatus(instance.lifecycleStatus())
        .expressedBy(instance.expressedBy())
        .outcomeCode(instance.outcomeCode())
        .extension(instance.extension())
        .language(instance.language())
        .startDate(instance.startDate())
        .build();
  }

  /**
   * Creates a builder for {@link Goal Goal}.
   * <pre>
   * ImmutableGoal.builder()
   *    .startCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link Goal#startCodeableConcept() startCodeableConcept}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Goal#implicitRules() implicitRules}
   *    .category(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Goal#category() category}
   *    .subject(com.medplum.types.fhir.Reference) // required {@link Goal#subject() subject}
   *    .target(List&amp;lt;com.medplum.types.fhir.Goal_Target&amp;gt;) // optional {@link Goal#target() target}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Goal#id() id}
   *    .addresses(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Goal#addresses() addresses}
   *    .outcomeReference(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Goal#outcomeReference() outcomeReference}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link Goal#note() note}
   *    .description(com.medplum.types.fhir.CodeableConcept) // required {@link Goal#description() description}
   *    .statusReason(String) // optional {@link Goal#statusReason() statusReason}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Goal#identifier() identifier}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Goal#contained() contained}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Goal#modifierExtension() modifierExtension}
   *    .achievementStatus(com.medplum.types.fhir.CodeableConcept) // optional {@link Goal#achievementStatus() achievementStatus}
   *    .statusDate(com.medplum.types.fhir.Date) // optional {@link Goal#statusDate() statusDate}
   *    .resourceType(String) // required {@link Goal#resourceType() resourceType}
   *    .priority(com.medplum.types.fhir.CodeableConcept) // optional {@link Goal#priority() priority}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Goal#meta() meta}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Goal#text() text}
   *    .lifecycleStatus(com.medplum.types.fhir.GoalLifecyclestatus) // optional {@link Goal#lifecycleStatus() lifecycleStatus}
   *    .expressedBy(com.medplum.types.fhir.Reference) // optional {@link Goal#expressedBy() expressedBy}
   *    .outcomeCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Goal#outcomeCode() outcomeCode}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Goal#extension() extension}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Goal#language() language}
   *    .startDate(String) // optional {@link Goal#startDate() startDate}
   *    .build();
   * </pre>
   * @return A new Goal builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableGoal.Builder();
  }

  /**
   * Builds instances of type {@link Goal Goal}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Goal", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements SubjectBuildStage, DescriptionBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_DESCRIPTION = 0x2L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long OPT_BIT_START_CODEABLE_CONCEPT = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_CATEGORY = 0x4L;
    private static final long OPT_BIT_TARGET = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_ADDRESSES = 0x20L;
    private static final long OPT_BIT_OUTCOME_REFERENCE = 0x40L;
    private static final long OPT_BIT_NOTE = 0x80L;
    private static final long OPT_BIT_STATUS_REASON = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800L;
    private static final long OPT_BIT_ACHIEVEMENT_STATUS = 0x1000L;
    private static final long OPT_BIT_STATUS_DATE = 0x2000L;
    private static final long OPT_BIT_PRIORITY = 0x4000L;
    private static final long OPT_BIT_META = 0x8000L;
    private static final long OPT_BIT_TEXT = 0x10000L;
    private static final long OPT_BIT_LIFECYCLE_STATUS = 0x20000L;
    private static final long OPT_BIT_EXPRESSED_BY = 0x40000L;
    private static final long OPT_BIT_OUTCOME_CODE = 0x80000L;
    private static final long OPT_BIT_EXTENSION = 0x100000L;
    private static final long OPT_BIT_LANGUAGE = 0x200000L;
    private static final long OPT_BIT_START_DATE = 0x400000L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable CodeableConcept startCodeableConcept;
    private @Nullable Uri implicitRules;
    private @Nullable List<CodeableConcept> category;
    private @Nullable Reference subject;
    private @Nullable List<Goal_Target> target;
    private @Nullable Id id;
    private @Nullable List<Reference> addresses;
    private @Nullable List<Reference> outcomeReference;
    private @Nullable List<Annotation> note;
    private @Nullable CodeableConcept description;
    private @Nullable String statusReason;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept achievementStatus;
    private @Nullable Date statusDate;
    private @Nullable String resourceType;
    private @Nullable CodeableConcept priority;
    private @Nullable Meta meta;
    private @Nullable Narrative text;
    private @Nullable GoalLifecyclestatus lifecycleStatus;
    private @Nullable Reference expressedBy;
    private @Nullable List<CodeableConcept> outcomeCode;
    private @Nullable List<Extension> extension;
    private @Nullable Code language;
    private @Nullable String startDate;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Goal#startCodeableConcept() startCodeableConcept} to startCodeableConcept.
     * @param startCodeableConcept The value for startCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder startCodeableConcept(CodeableConcept startCodeableConcept) {
      checkNotIsSet(startCodeableConceptIsSet(), "startCodeableConcept");
      this.startCodeableConcept = Objects.requireNonNull(startCodeableConcept, "startCodeableConcept");
      optBits |= OPT_BIT_START_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#startCodeableConcept() startCodeableConcept} to startCodeableConcept.
     * @param startCodeableConcept The value for startCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("startCodeableConcept")
    public final Builder startCodeableConcept(Optional<? extends CodeableConcept> startCodeableConcept) {
      checkNotIsSet(startCodeableConceptIsSet(), "startCodeableConcept");
      this.startCodeableConcept = startCodeableConcept.orElse(null);
      optBits |= OPT_BIT_START_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Goal#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Goal#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(List<CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends List<CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the value for the {@link Goal#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      initBits &= ~INIT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(List<Goal_Target> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(Optional<? extends List<Goal_Target>> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#id() id} to id.
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
     * Initializes the optional value {@link Goal#id() id} to id.
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
     * Initializes the optional value {@link Goal#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for chained invocation
     */
    public final Builder addresses(List<Reference> addresses) {
      checkNotIsSet(addressesIsSet(), "addresses");
      this.addresses = Objects.requireNonNull(addresses, "addresses");
      optBits |= OPT_BIT_ADDRESSES;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("addresses")
    public final Builder addresses(Optional<? extends List<Reference>> addresses) {
      checkNotIsSet(addressesIsSet(), "addresses");
      this.addresses = addresses.orElse(null);
      optBits |= OPT_BIT_ADDRESSES;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#outcomeReference() outcomeReference} to outcomeReference.
     * @param outcomeReference The value for outcomeReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcomeReference(List<Reference> outcomeReference) {
      checkNotIsSet(outcomeReferenceIsSet(), "outcomeReference");
      this.outcomeReference = Objects.requireNonNull(outcomeReference, "outcomeReference");
      optBits |= OPT_BIT_OUTCOME_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#outcomeReference() outcomeReference} to outcomeReference.
     * @param outcomeReference The value for outcomeReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcomeReference")
    public final Builder outcomeReference(Optional<? extends List<Reference>> outcomeReference) {
      checkNotIsSet(outcomeReferenceIsSet(), "outcomeReference");
      this.outcomeReference = outcomeReference.orElse(null);
      optBits |= OPT_BIT_OUTCOME_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(List<Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("note")
    public final Builder note(Optional<? extends List<Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the value for the {@link Goal#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(CodeableConcept description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(String statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusReason")
    public final Builder statusReason(Optional<String> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#contained() contained} to contained.
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
     * Initializes the optional value {@link Goal#contained() contained} to contained.
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
     * Initializes the optional value {@link Goal#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Goal#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Goal#achievementStatus() achievementStatus} to achievementStatus.
     * @param achievementStatus The value for achievementStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder achievementStatus(CodeableConcept achievementStatus) {
      checkNotIsSet(achievementStatusIsSet(), "achievementStatus");
      this.achievementStatus = Objects.requireNonNull(achievementStatus, "achievementStatus");
      optBits |= OPT_BIT_ACHIEVEMENT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#achievementStatus() achievementStatus} to achievementStatus.
     * @param achievementStatus The value for achievementStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("achievementStatus")
    public final Builder achievementStatus(Optional<? extends CodeableConcept> achievementStatus) {
      checkNotIsSet(achievementStatusIsSet(), "achievementStatus");
      this.achievementStatus = achievementStatus.orElse(null);
      optBits |= OPT_BIT_ACHIEVEMENT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusDate(Date statusDate) {
      checkNotIsSet(statusDateIsSet(), "statusDate");
      this.statusDate = Objects.requireNonNull(statusDate, "statusDate");
      optBits |= OPT_BIT_STATUS_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusDate")
    public final Builder statusDate(Optional<? extends Date> statusDate) {
      checkNotIsSet(statusDateIsSet(), "statusDate");
      this.statusDate = statusDate.orElse(null);
      optBits |= OPT_BIT_STATUS_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link Goal#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Goal#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(CodeableConcept priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priority")
    public final Builder priority(Optional<? extends CodeableConcept> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#meta() meta} to meta.
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
     * Initializes the optional value {@link Goal#meta() meta} to meta.
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
     * Initializes the optional value {@link Goal#text() text} to text.
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
     * Initializes the optional value {@link Goal#text() text} to text.
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
     * Initializes the optional value {@link Goal#lifecycleStatus() lifecycleStatus} to lifecycleStatus.
     * @param lifecycleStatus The value for lifecycleStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder lifecycleStatus(GoalLifecyclestatus lifecycleStatus) {
      checkNotIsSet(lifecycleStatusIsSet(), "lifecycleStatus");
      this.lifecycleStatus = Objects.requireNonNull(lifecycleStatus, "lifecycleStatus");
      optBits |= OPT_BIT_LIFECYCLE_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#lifecycleStatus() lifecycleStatus} to lifecycleStatus.
     * @param lifecycleStatus The value for lifecycleStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lifecycleStatus")
    public final Builder lifecycleStatus(Optional<? extends GoalLifecyclestatus> lifecycleStatus) {
      checkNotIsSet(lifecycleStatusIsSet(), "lifecycleStatus");
      this.lifecycleStatus = lifecycleStatus.orElse(null);
      optBits |= OPT_BIT_LIFECYCLE_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#expressedBy() expressedBy} to expressedBy.
     * @param expressedBy The value for expressedBy
     * @return {@code this} builder for chained invocation
     */
    public final Builder expressedBy(Reference expressedBy) {
      checkNotIsSet(expressedByIsSet(), "expressedBy");
      this.expressedBy = Objects.requireNonNull(expressedBy, "expressedBy");
      optBits |= OPT_BIT_EXPRESSED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#expressedBy() expressedBy} to expressedBy.
     * @param expressedBy The value for expressedBy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("expressedBy")
    public final Builder expressedBy(Optional<? extends Reference> expressedBy) {
      checkNotIsSet(expressedByIsSet(), "expressedBy");
      this.expressedBy = expressedBy.orElse(null);
      optBits |= OPT_BIT_EXPRESSED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#outcomeCode() outcomeCode} to outcomeCode.
     * @param outcomeCode The value for outcomeCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcomeCode(List<CodeableConcept> outcomeCode) {
      checkNotIsSet(outcomeCodeIsSet(), "outcomeCode");
      this.outcomeCode = Objects.requireNonNull(outcomeCode, "outcomeCode");
      optBits |= OPT_BIT_OUTCOME_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#outcomeCode() outcomeCode} to outcomeCode.
     * @param outcomeCode The value for outcomeCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcomeCode")
    public final Builder outcomeCode(Optional<? extends List<CodeableConcept>> outcomeCode) {
      checkNotIsSet(outcomeCodeIsSet(), "outcomeCode");
      this.outcomeCode = outcomeCode.orElse(null);
      optBits |= OPT_BIT_OUTCOME_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#extension() extension} to extension.
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
     * Initializes the optional value {@link Goal#extension() extension} to extension.
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
     * Initializes the optional value {@link Goal#language() language} to language.
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
     * Initializes the optional value {@link Goal#language() language} to language.
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
     * Initializes the optional value {@link Goal#startDate() startDate} to startDate.
     * @param startDate The value for startDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder startDate(String startDate) {
      checkNotIsSet(startDateIsSet(), "startDate");
      this.startDate = Objects.requireNonNull(startDate, "startDate");
      optBits |= OPT_BIT_START_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#startDate() startDate} to startDate.
     * @param startDate The value for startDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("startDate")
    public final Builder startDate(Optional<String> startDate) {
      checkNotIsSet(startDateIsSet(), "startDate");
      this.startDate = startDate.orElse(null);
      optBits |= OPT_BIT_START_DATE;
      return this;
    }

    /**
     * Builds a new {@link Goal Goal}.
     * @return An immutable instance of Goal
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Goal build() {
      checkRequiredAttributes();
      return new ImmutableGoal(
          startCodeableConcept,
          implicitRules,
          category,
          subject,
          target,
          id,
          addresses,
          outcomeReference,
          note,
          description,
          statusReason,
          identifier,
          contained,
          modifierExtension,
          achievementStatus,
          statusDate,
          resourceType,
          priority,
          meta,
          text,
          lifecycleStatus,
          expressedBy,
          outcomeCode,
          extension,
          language,
          startDate);
    }

    private boolean startCodeableConceptIsSet() {
      return (optBits & OPT_BIT_START_CODEABLE_CONCEPT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean addressesIsSet() {
      return (optBits & OPT_BIT_ADDRESSES) != 0;
    }

    private boolean outcomeReferenceIsSet() {
      return (optBits & OPT_BIT_OUTCOME_REFERENCE) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean achievementStatusIsSet() {
      return (optBits & OPT_BIT_ACHIEVEMENT_STATUS) != 0;
    }

    private boolean statusDateIsSet() {
      return (optBits & OPT_BIT_STATUS_DATE) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean lifecycleStatusIsSet() {
      return (optBits & OPT_BIT_LIFECYCLE_STATUS) != 0;
    }

    private boolean expressedByIsSet() {
      return (optBits & OPT_BIT_EXPRESSED_BY) != 0;
    }

    private boolean outcomeCodeIsSet() {
      return (optBits & OPT_BIT_OUTCOME_CODE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean startDateIsSet() {
      return (optBits & OPT_BIT_START_DATE) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean descriptionIsSet() {
      return (initBits & INIT_BIT_DESCRIPTION) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Goal is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!subjectIsSet()) attributes.add("subject");
      if (!descriptionIsSet()) attributes.add("description");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Goal, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Goal", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link Goal#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    DescriptionBuildStage subject(Reference subject);
  }

  @Generated(from = "Goal", generator = "Immutables")
  public interface DescriptionBuildStage {
    /**
     * Initializes the value for the {@link Goal#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage description(CodeableConcept description);
  }

  @Generated(from = "Goal", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Goal#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Goal", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Goal#startCodeableConcept() startCodeableConcept} to startCodeableConcept.
     * @param startCodeableConcept The value for startCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal startCodeableConcept(CodeableConcept startCodeableConcept);

    /**
     * Initializes the optional value {@link Goal#startCodeableConcept() startCodeableConcept} to startCodeableConcept.
     * @param startCodeableConcept The value for startCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal startCodeableConcept(Optional<? extends CodeableConcept> startCodeableConcept);

    /**
     * Initializes the optional value {@link Goal#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Goal#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Goal#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link Goal#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link Goal#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    BuildFinal target(List<Goal_Target> target);

    /**
     * Initializes the optional value {@link Goal#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal target(Optional<? extends List<Goal_Target>> target);

    /**
     * Initializes the optional value {@link Goal#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Goal#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Goal#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for chained invocation
     */
    BuildFinal addresses(List<Reference> addresses);

    /**
     * Initializes the optional value {@link Goal#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addresses(Optional<? extends List<Reference>> addresses);

    /**
     * Initializes the optional value {@link Goal#outcomeReference() outcomeReference} to outcomeReference.
     * @param outcomeReference The value for outcomeReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcomeReference(List<Reference> outcomeReference);

    /**
     * Initializes the optional value {@link Goal#outcomeReference() outcomeReference} to outcomeReference.
     * @param outcomeReference The value for outcomeReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcomeReference(Optional<? extends List<Reference>> outcomeReference);

    /**
     * Initializes the optional value {@link Goal#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link Goal#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link Goal#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(String statusReason);

    /**
     * Initializes the optional value {@link Goal#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(Optional<String> statusReason);

    /**
     * Initializes the optional value {@link Goal#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Goal#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Goal#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Goal#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Goal#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Goal#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Goal#achievementStatus() achievementStatus} to achievementStatus.
     * @param achievementStatus The value for achievementStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal achievementStatus(CodeableConcept achievementStatus);

    /**
     * Initializes the optional value {@link Goal#achievementStatus() achievementStatus} to achievementStatus.
     * @param achievementStatus The value for achievementStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal achievementStatus(Optional<? extends CodeableConcept> achievementStatus);

    /**
     * Initializes the optional value {@link Goal#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusDate(Date statusDate);

    /**
     * Initializes the optional value {@link Goal#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusDate(Optional<? extends Date> statusDate);

    /**
     * Initializes the optional value {@link Goal#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(CodeableConcept priority);

    /**
     * Initializes the optional value {@link Goal#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(Optional<? extends CodeableConcept> priority);

    /**
     * Initializes the optional value {@link Goal#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Goal#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Goal#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Goal#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Goal#lifecycleStatus() lifecycleStatus} to lifecycleStatus.
     * @param lifecycleStatus The value for lifecycleStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lifecycleStatus(GoalLifecyclestatus lifecycleStatus);

    /**
     * Initializes the optional value {@link Goal#lifecycleStatus() lifecycleStatus} to lifecycleStatus.
     * @param lifecycleStatus The value for lifecycleStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lifecycleStatus(Optional<? extends GoalLifecyclestatus> lifecycleStatus);

    /**
     * Initializes the optional value {@link Goal#expressedBy() expressedBy} to expressedBy.
     * @param expressedBy The value for expressedBy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal expressedBy(Reference expressedBy);

    /**
     * Initializes the optional value {@link Goal#expressedBy() expressedBy} to expressedBy.
     * @param expressedBy The value for expressedBy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal expressedBy(Optional<? extends Reference> expressedBy);

    /**
     * Initializes the optional value {@link Goal#outcomeCode() outcomeCode} to outcomeCode.
     * @param outcomeCode The value for outcomeCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcomeCode(List<CodeableConcept> outcomeCode);

    /**
     * Initializes the optional value {@link Goal#outcomeCode() outcomeCode} to outcomeCode.
     * @param outcomeCode The value for outcomeCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcomeCode(Optional<? extends List<CodeableConcept>> outcomeCode);

    /**
     * Initializes the optional value {@link Goal#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Goal#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Goal#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Goal#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Goal#startDate() startDate} to startDate.
     * @param startDate The value for startDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal startDate(String startDate);

    /**
     * Initializes the optional value {@link Goal#startDate() startDate} to startDate.
     * @param startDate The value for startDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal startDate(Optional<String> startDate);

    /**
     * Builds a new {@link Goal Goal}.
     * @return An immutable instance of Goal
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Goal build();
  }
}