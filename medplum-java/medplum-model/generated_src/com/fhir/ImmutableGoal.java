//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Goal}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGoal.builder()}.
 */
@org.immutables.value.Generated(from = "Goal", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableGoal implements com.fhir.Goal {
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept achievementStatus;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept startCodeableConcept;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.date statusDate;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> addresses;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Goal_Target> target;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.String startDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> outcomeCode;
  private final @javax.annotation.Nullable com.fhir.GoalLifecyclestatus lifecycleStatus;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> outcomeReference;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Reference expressedBy;
  private final com.fhir.Reference subject;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final com.fhir.CodeableConcept description;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept priority;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.lang.String statusReason;

  private ImmutableGoal(
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.CodeableConcept achievementStatus,
      @javax.annotation.Nullable com.fhir.CodeableConcept startCodeableConcept,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.date statusDate,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> addresses,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Goal_Target> target,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.String startDate,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> outcomeCode,
      @javax.annotation.Nullable com.fhir.GoalLifecyclestatus lifecycleStatus,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> outcomeReference,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Reference expressedBy,
      com.fhir.Reference subject,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category,
      @javax.annotation.Nullable com.fhir.code language,
      com.fhir.CodeableConcept description,
      @javax.annotation.Nullable com.fhir.CodeableConcept priority,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.lang.String statusReason) {
    this.meta = meta;
    this.achievementStatus = achievementStatus;
    this.startCodeableConcept = startCodeableConcept;
    this.resourceType = resourceType;
    this.statusDate = statusDate;
    this.text = text;
    this.addresses = addresses;
    this.note = note;
    this.modifierExtension = modifierExtension;
    this.target = target;
    this.contained = contained;
    this.id = id;
    this.startDate = startDate;
    this.outcomeCode = outcomeCode;
    this.lifecycleStatus = lifecycleStatus;
    this.outcomeReference = outcomeReference;
    this.extension = extension;
    this.identifier = identifier;
    this.expressedBy = expressedBy;
    this.subject = subject;
    this.category = category;
    this.language = language;
    this.description = description;
    this.priority = priority;
    this.implicitRules = implicitRules;
    this.statusReason = statusReason;
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
   * @return The value of the {@code achievementStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("achievementStatus")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> achievementStatus() {
    return java.util.Optional.ofNullable(achievementStatus);
  }

  /**
   * @return The value of the {@code startCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("startCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> startCodeableConcept() {
    return java.util.Optional.ofNullable(startCodeableConcept);
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
   * @return The value of the {@code statusDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusDate")
  @Override
  public java.util.Optional<com.fhir.date> statusDate() {
    return java.util.Optional.ofNullable(statusDate);
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
   * @return The value of the {@code addresses} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("addresses")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> addresses() {
    return java.util.Optional.ofNullable(addresses);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
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
   * @return The value of the {@code target} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("target")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Goal_Target>> target() {
    return java.util.Optional.ofNullable(target);
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
   * @return The value of the {@code startDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("startDate")
  @Override
  public java.util.Optional<java.lang.String> startDate() {
    return java.util.Optional.ofNullable(startDate);
  }

  /**
   * @return The value of the {@code outcomeCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outcomeCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> outcomeCode() {
    return java.util.Optional.ofNullable(outcomeCode);
  }

  /**
   * @return The value of the {@code lifecycleStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStatus")
  @Override
  public java.util.Optional<com.fhir.GoalLifecyclestatus> lifecycleStatus() {
    return java.util.Optional.ofNullable(lifecycleStatus);
  }

  /**
   * @return The value of the {@code outcomeReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outcomeReference")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> outcomeReference() {
    return java.util.Optional.ofNullable(outcomeReference);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code expressedBy} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("expressedBy")
  @Override
  public java.util.Optional<com.fhir.Reference> expressedBy() {
    return java.util.Optional.ofNullable(expressedBy);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public com.fhir.Reference subject() {
    return subject;
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() {
    return java.util.Optional.ofNullable(category);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public com.fhir.CodeableConcept description() {
    return description;
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priority")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> priority() {
    return java.util.Optional.ofNullable(priority);
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
   * @return The value of the {@code statusReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
  @Override
  public java.util.Optional<java.lang.String> statusReason() {
    return java.util.Optional.ofNullable(statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableGoal(
        newValue,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableGoal(
        value,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#achievementStatus() achievementStatus} attribute.
   * @param value The value for achievementStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withAchievementStatus(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "achievementStatus");
    if (this.achievementStatus == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        newValue,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#achievementStatus() achievementStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for achievementStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withAchievementStatus(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.achievementStatus == value) return this;
    return new ImmutableGoal(
        this.meta,
        value,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#startCodeableConcept() startCodeableConcept} attribute.
   * @param value The value for startCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withStartCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "startCodeableConcept");
    if (this.startCodeableConcept == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        newValue,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#startCodeableConcept() startCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for startCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withStartCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.startCodeableConcept == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        value,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Goal#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGoal withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        newValue,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#statusDate() statusDate} attribute.
   * @param value The value for statusDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withStatusDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "statusDate");
    if (this.statusDate == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        newValue,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#statusDate() statusDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withStatusDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.statusDate == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        value,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        newValue,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        value,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#addresses() addresses} attribute.
   * @param value The value for addresses
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withAddresses(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "addresses");
    if (this.addresses == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        newValue,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#addresses() addresses} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for addresses
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withAddresses(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.addresses == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        value,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        newValue,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        value,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        newValue,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        value,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withTarget(java.util.List<com.fhir.Goal_Target> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Goal_Target> newValue = java.util.Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        newValue,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withTarget(java.util.Optional<? extends java.util.List<com.fhir.Goal_Target>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Goal_Target> value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        value,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        newValue,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        value,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        newValue,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        value,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#startDate() startDate} attribute.
   * @param value The value for startDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withStartDate(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "startDate");
    if (java.util.Objects.equals(this.startDate, newValue)) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        newValue,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#startDate() startDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for startDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withStartDate(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.startDate, value)) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        value,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#outcomeCode() outcomeCode} attribute.
   * @param value The value for outcomeCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withOutcomeCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "outcomeCode");
    if (this.outcomeCode == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        newValue,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#outcomeCode() outcomeCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcomeCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withOutcomeCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.outcomeCode == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        value,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#lifecycleStatus() lifecycleStatus} attribute.
   * @param value The value for lifecycleStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withLifecycleStatus(com.fhir.GoalLifecyclestatus value) {
    @javax.annotation.Nullable com.fhir.GoalLifecyclestatus newValue = java.util.Objects.requireNonNull(value, "lifecycleStatus");
    if (this.lifecycleStatus == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        newValue,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#lifecycleStatus() lifecycleStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lifecycleStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withLifecycleStatus(java.util.Optional<? extends com.fhir.GoalLifecyclestatus> optional) {
    @javax.annotation.Nullable com.fhir.GoalLifecyclestatus value = optional.orElse(null);
    if (this.lifecycleStatus == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        value,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#outcomeReference() outcomeReference} attribute.
   * @param value The value for outcomeReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withOutcomeReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "outcomeReference");
    if (this.outcomeReference == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        newValue,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#outcomeReference() outcomeReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcomeReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withOutcomeReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.outcomeReference == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        value,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        newValue,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        value,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        newValue,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        value,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#expressedBy() expressedBy} attribute.
   * @param value The value for expressedBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withExpressedBy(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "expressedBy");
    if (this.expressedBy == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        newValue,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#expressedBy() expressedBy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expressedBy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withExpressedBy(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.expressedBy == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        value,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Goal#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGoal withSubject(com.fhir.Reference value) {
    if (this.subject == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        newValue,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        newValue,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        value,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        newValue,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        value,
        this.description,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Goal#description() description} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGoal withDescription(com.fhir.CodeableConcept value) {
    if (this.description == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "description");
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        newValue,
        this.priority,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withPriority(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        newValue,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withPriority(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        value,
        this.implicitRules,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        newValue,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        value,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withStatusReason(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "statusReason");
    if (java.util.Objects.equals(this.statusReason, newValue)) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal#statusReason() statusReason} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal withStatusReason(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.statusReason, value)) return this;
    return new ImmutableGoal(
        this.meta,
        this.achievementStatus,
        this.startCodeableConcept,
        this.resourceType,
        this.statusDate,
        this.text,
        this.addresses,
        this.note,
        this.modifierExtension,
        this.target,
        this.contained,
        this.id,
        this.startDate,
        this.outcomeCode,
        this.lifecycleStatus,
        this.outcomeReference,
        this.extension,
        this.identifier,
        this.expressedBy,
        this.subject,
        this.category,
        this.language,
        this.description,
        this.priority,
        this.implicitRules,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGoal} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGoal
        && equalTo((ImmutableGoal) another);
  }

  private boolean equalTo(ImmutableGoal another) {
    return java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(achievementStatus, another.achievementStatus)
        && java.util.Objects.equals(startCodeableConcept, another.startCodeableConcept)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(statusDate, another.statusDate)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(addresses, another.addresses)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(target, another.target)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(startDate, another.startDate)
        && java.util.Objects.equals(outcomeCode, another.outcomeCode)
        && java.util.Objects.equals(lifecycleStatus, another.lifecycleStatus)
        && java.util.Objects.equals(outcomeReference, another.outcomeReference)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(expressedBy, another.expressedBy)
        && subject.equals(another.subject)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(language, another.language)
        && description.equals(another.description)
        && java.util.Objects.equals(priority, another.priority)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(statusReason, another.statusReason);
  }

  /**
   * Computes a hash code from attributes: {@code meta}, {@code achievementStatus}, {@code startCodeableConcept}, {@code resourceType}, {@code statusDate}, {@code text}, {@code addresses}, {@code note}, {@code modifierExtension}, {@code target}, {@code contained}, {@code id}, {@code startDate}, {@code outcomeCode}, {@code lifecycleStatus}, {@code outcomeReference}, {@code extension}, {@code identifier}, {@code expressedBy}, {@code subject}, {@code category}, {@code language}, {@code description}, {@code priority}, {@code implicitRules}, {@code statusReason}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(achievementStatus);
    h += (h << 5) + java.util.Objects.hashCode(startCodeableConcept);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(statusDate);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(addresses);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(target);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(startDate);
    h += (h << 5) + java.util.Objects.hashCode(outcomeCode);
    h += (h << 5) + java.util.Objects.hashCode(lifecycleStatus);
    h += (h << 5) + java.util.Objects.hashCode(outcomeReference);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(expressedBy);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + description.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(priority);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(statusReason);
    return h;
  }

  /**
   * Prints the immutable value {@code Goal} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Goal{");
    if (meta != null) {
      builder.append("meta=").append(meta);
    }
    if (achievementStatus != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("achievementStatus=").append(achievementStatus);
    }
    if (startCodeableConcept != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("startCodeableConcept=").append(startCodeableConcept);
    }
    if (builder.length() > 5) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (statusDate != null) {
      builder.append(", ");
      builder.append("statusDate=").append(statusDate);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (addresses != null) {
      builder.append(", ");
      builder.append("addresses=").append(addresses);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (target != null) {
      builder.append(", ");
      builder.append("target=").append(target);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (startDate != null) {
      builder.append(", ");
      builder.append("startDate=").append(startDate);
    }
    if (outcomeCode != null) {
      builder.append(", ");
      builder.append("outcomeCode=").append(outcomeCode);
    }
    if (lifecycleStatus != null) {
      builder.append(", ");
      builder.append("lifecycleStatus=").append(lifecycleStatus);
    }
    if (outcomeReference != null) {
      builder.append(", ");
      builder.append("outcomeReference=").append(outcomeReference);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (expressedBy != null) {
      builder.append(", ");
      builder.append("expressedBy=").append(expressedBy);
    }
    builder.append(", ");
    builder.append("subject=").append(subject);
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    builder.append(", ");
    builder.append("description=").append(description);
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Goal", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Goal {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> achievementStatus = java.util.Optional.empty();
    boolean achievementStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> startCodeableConcept = java.util.Optional.empty();
    boolean startCodeableConceptIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> statusDate = java.util.Optional.empty();
    boolean statusDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> addresses = java.util.Optional.empty();
    boolean addressesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Goal_Target>> target = java.util.Optional.empty();
    boolean targetIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> startDate = java.util.Optional.empty();
    boolean startDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> outcomeCode = java.util.Optional.empty();
    boolean outcomeCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.GoalLifecyclestatus> lifecycleStatus = java.util.Optional.empty();
    boolean lifecycleStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> outcomeReference = java.util.Optional.empty();
    boolean outcomeReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> expressedBy = java.util.Optional.empty();
    boolean expressedByIsSet;
    @javax.annotation.Nullable com.fhir.Reference subject;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept description;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> priority = java.util.Optional.empty();
    boolean priorityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> statusReason = java.util.Optional.empty();
    boolean statusReasonIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("achievementStatus")
    public void setAchievementStatus(java.util.Optional<com.fhir.CodeableConcept> achievementStatus) {
      this.achievementStatus = achievementStatus;
      this.achievementStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("startCodeableConcept")
    public void setStartCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> startCodeableConcept) {
      this.startCodeableConcept = startCodeableConcept;
      this.startCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusDate")
    public void setStatusDate(java.util.Optional<com.fhir.date> statusDate) {
      this.statusDate = statusDate;
      this.statusDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("addresses")
    public void setAddresses(java.util.Optional<java.util.List<com.fhir.Reference>> addresses) {
      this.addresses = addresses;
      this.addressesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    public void setTarget(java.util.Optional<java.util.List<com.fhir.Goal_Target>> target) {
      this.target = target;
      this.targetIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("startDate")
    public void setStartDate(java.util.Optional<java.lang.String> startDate) {
      this.startDate = startDate;
      this.startDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("outcomeCode")
    public void setOutcomeCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> outcomeCode) {
      this.outcomeCode = outcomeCode;
      this.outcomeCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStatus")
    public void setLifecycleStatus(java.util.Optional<com.fhir.GoalLifecyclestatus> lifecycleStatus) {
      this.lifecycleStatus = lifecycleStatus;
      this.lifecycleStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("outcomeReference")
    public void setOutcomeReference(java.util.Optional<java.util.List<com.fhir.Reference>> outcomeReference) {
      this.outcomeReference = outcomeReference;
      this.outcomeReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("expressedBy")
    public void setExpressedBy(java.util.Optional<com.fhir.Reference> expressedBy) {
      this.expressedBy = expressedBy;
      this.expressedByIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(com.fhir.Reference subject) {
      this.subject = subject;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(com.fhir.CodeableConcept description) {
      this.description = description;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(java.util.Optional<com.fhir.CodeableConcept> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public void setStatusReason(java.util.Optional<java.lang.String> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> achievementStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> startCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> statusDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> addresses() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Goal_Target>> target() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> startDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> outcomeCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.GoalLifecyclestatus> lifecycleStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> outcomeReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> expressedBy() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> priority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> statusReason() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableGoal fromJson(Json json) {
    ImmutableGoal.Builder builder = ((ImmutableGoal.Builder) ImmutableGoal.builder());
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.achievementStatusIsSet) {
      builder.achievementStatus(json.achievementStatus);
    }
    if (json.startCodeableConceptIsSet) {
      builder.startCodeableConcept(json.startCodeableConcept);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.statusDateIsSet) {
      builder.statusDate(json.statusDate);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.addressesIsSet) {
      builder.addresses(json.addresses);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.startDateIsSet) {
      builder.startDate(json.startDate);
    }
    if (json.outcomeCodeIsSet) {
      builder.outcomeCode(json.outcomeCode);
    }
    if (json.lifecycleStatusIsSet) {
      builder.lifecycleStatus(json.lifecycleStatus);
    }
    if (json.outcomeReferenceIsSet) {
      builder.outcomeReference(json.outcomeReference);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.expressedByIsSet) {
      builder.expressedBy(json.expressedBy);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
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
        .meta(instance.meta())
        .achievementStatus(instance.achievementStatus())
        .startCodeableConcept(instance.startCodeableConcept())
        .resourceType(instance.resourceType())
        .statusDate(instance.statusDate())
        .text(instance.text())
        .addresses(instance.addresses())
        .note(instance.note())
        .modifierExtension(instance.modifierExtension())
        .target(instance.target())
        .contained(instance.contained())
        .id(instance.id())
        .startDate(instance.startDate())
        .outcomeCode(instance.outcomeCode())
        .lifecycleStatus(instance.lifecycleStatus())
        .outcomeReference(instance.outcomeReference())
        .extension(instance.extension())
        .identifier(instance.identifier())
        .expressedBy(instance.expressedBy())
        .subject(instance.subject())
        .category(instance.category())
        .language(instance.language())
        .description(instance.description())
        .priority(instance.priority())
        .implicitRules(instance.implicitRules())
        .statusReason(instance.statusReason())
        .build();
  }

  /**
   * Creates a builder for {@link Goal Goal}.
   * <pre>
   * ImmutableGoal.builder()
   *    .meta(com.fhir.Meta) // optional {@link Goal#meta() meta}
   *    .achievementStatus(com.fhir.CodeableConcept) // optional {@link Goal#achievementStatus() achievementStatus}
   *    .startCodeableConcept(com.fhir.CodeableConcept) // optional {@link Goal#startCodeableConcept() startCodeableConcept}
   *    .resourceType(String) // required {@link Goal#resourceType() resourceType}
   *    .statusDate(com.fhir.date) // optional {@link Goal#statusDate() statusDate}
   *    .text(com.fhir.Narrative) // optional {@link Goal#text() text}
   *    .addresses(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Goal#addresses() addresses}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link Goal#note() note}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Goal#modifierExtension() modifierExtension}
   *    .target(List&amp;lt;com.fhir.Goal_Target&amp;gt;) // optional {@link Goal#target() target}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Goal#contained() contained}
   *    .id(com.fhir.id) // optional {@link Goal#id() id}
   *    .startDate(String) // optional {@link Goal#startDate() startDate}
   *    .outcomeCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Goal#outcomeCode() outcomeCode}
   *    .lifecycleStatus(com.fhir.GoalLifecyclestatus) // optional {@link Goal#lifecycleStatus() lifecycleStatus}
   *    .outcomeReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Goal#outcomeReference() outcomeReference}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Goal#extension() extension}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Goal#identifier() identifier}
   *    .expressedBy(com.fhir.Reference) // optional {@link Goal#expressedBy() expressedBy}
   *    .subject(com.fhir.Reference) // required {@link Goal#subject() subject}
   *    .category(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Goal#category() category}
   *    .language(com.fhir.code) // optional {@link Goal#language() language}
   *    .description(com.fhir.CodeableConcept) // required {@link Goal#description() description}
   *    .priority(com.fhir.CodeableConcept) // optional {@link Goal#priority() priority}
   *    .implicitRules(com.fhir.uri) // optional {@link Goal#implicitRules() implicitRules}
   *    .statusReason(String) // optional {@link Goal#statusReason() statusReason}
   *    .build();
   * </pre>
   * @return A new Goal builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableGoal.Builder();
  }

  /**
   * Builds instances of type {@link Goal Goal}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Goal", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, SubjectBuildStage, DescriptionBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_SUBJECT = 0x2L;
    private static final long INIT_BIT_DESCRIPTION = 0x4L;
    private static final long OPT_BIT_META = 0x1L;
    private static final long OPT_BIT_ACHIEVEMENT_STATUS = 0x2L;
    private static final long OPT_BIT_START_CODEABLE_CONCEPT = 0x4L;
    private static final long OPT_BIT_STATUS_DATE = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_ADDRESSES = 0x20L;
    private static final long OPT_BIT_NOTE = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_TARGET = 0x100L;
    private static final long OPT_BIT_CONTAINED = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_START_DATE = 0x800L;
    private static final long OPT_BIT_OUTCOME_CODE = 0x1000L;
    private static final long OPT_BIT_LIFECYCLE_STATUS = 0x2000L;
    private static final long OPT_BIT_OUTCOME_REFERENCE = 0x4000L;
    private static final long OPT_BIT_EXTENSION = 0x8000L;
    private static final long OPT_BIT_IDENTIFIER = 0x10000L;
    private static final long OPT_BIT_EXPRESSED_BY = 0x20000L;
    private static final long OPT_BIT_CATEGORY = 0x40000L;
    private static final long OPT_BIT_LANGUAGE = 0x80000L;
    private static final long OPT_BIT_PRIORITY = 0x100000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200000L;
    private static final long OPT_BIT_STATUS_REASON = 0x400000L;
    private long initBits = 0x7L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.CodeableConcept achievementStatus;
    private @javax.annotation.Nullable com.fhir.CodeableConcept startCodeableConcept;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.date statusDate;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> addresses;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Goal_Target> target;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String startDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> outcomeCode;
    private @javax.annotation.Nullable com.fhir.GoalLifecyclestatus lifecycleStatus;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> outcomeReference;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Reference expressedBy;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept description;
    private @javax.annotation.Nullable com.fhir.CodeableConcept priority;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.lang.String statusReason;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Goal#meta() meta} to meta.
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
     * Initializes the optional value {@link Goal#meta() meta} to meta.
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
     * Initializes the optional value {@link Goal#achievementStatus() achievementStatus} to achievementStatus.
     * @param achievementStatus The value for achievementStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder achievementStatus(com.fhir.CodeableConcept achievementStatus) {
      checkNotIsSet(achievementStatusIsSet(), "achievementStatus");
      this.achievementStatus = java.util.Objects.requireNonNull(achievementStatus, "achievementStatus");
      optBits |= OPT_BIT_ACHIEVEMENT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#achievementStatus() achievementStatus} to achievementStatus.
     * @param achievementStatus The value for achievementStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("achievementStatus")
    public final Builder achievementStatus(java.util.Optional<? extends com.fhir.CodeableConcept> achievementStatus) {
      checkNotIsSet(achievementStatusIsSet(), "achievementStatus");
      this.achievementStatus = achievementStatus.orElse(null);
      optBits |= OPT_BIT_ACHIEVEMENT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#startCodeableConcept() startCodeableConcept} to startCodeableConcept.
     * @param startCodeableConcept The value for startCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder startCodeableConcept(com.fhir.CodeableConcept startCodeableConcept) {
      checkNotIsSet(startCodeableConceptIsSet(), "startCodeableConcept");
      this.startCodeableConcept = java.util.Objects.requireNonNull(startCodeableConcept, "startCodeableConcept");
      optBits |= OPT_BIT_START_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#startCodeableConcept() startCodeableConcept} to startCodeableConcept.
     * @param startCodeableConcept The value for startCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startCodeableConcept")
    public final Builder startCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> startCodeableConcept) {
      checkNotIsSet(startCodeableConceptIsSet(), "startCodeableConcept");
      this.startCodeableConcept = startCodeableConcept.orElse(null);
      optBits |= OPT_BIT_START_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the value for the {@link Goal#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Goal#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusDate(com.fhir.date statusDate) {
      checkNotIsSet(statusDateIsSet(), "statusDate");
      this.statusDate = java.util.Objects.requireNonNull(statusDate, "statusDate");
      optBits |= OPT_BIT_STATUS_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusDate")
    public final Builder statusDate(java.util.Optional<? extends com.fhir.date> statusDate) {
      checkNotIsSet(statusDateIsSet(), "statusDate");
      this.statusDate = statusDate.orElse(null);
      optBits |= OPT_BIT_STATUS_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#text() text} to text.
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
     * Initializes the optional value {@link Goal#text() text} to text.
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
     * Initializes the optional value {@link Goal#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for chained invocation
     */
    public final Builder addresses(java.util.List<com.fhir.Reference> addresses) {
      checkNotIsSet(addressesIsSet(), "addresses");
      this.addresses = java.util.Objects.requireNonNull(addresses, "addresses");
      optBits |= OPT_BIT_ADDRESSES;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("addresses")
    public final Builder addresses(java.util.Optional<? extends java.util.List<com.fhir.Reference>> addresses) {
      checkNotIsSet(addressesIsSet(), "addresses");
      this.addresses = addresses.orElse(null);
      optBits |= OPT_BIT_ADDRESSES;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(java.util.List<com.fhir.Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = java.util.Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public final Builder note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Goal#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Goal#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(java.util.List<com.fhir.Goal_Target> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = java.util.Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    public final Builder target(java.util.Optional<? extends java.util.List<com.fhir.Goal_Target>> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#contained() contained} to contained.
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
     * Initializes the optional value {@link Goal#contained() contained} to contained.
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
     * Initializes the optional value {@link Goal#id() id} to id.
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
     * Initializes the optional value {@link Goal#id() id} to id.
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
     * Initializes the optional value {@link Goal#startDate() startDate} to startDate.
     * @param startDate The value for startDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder startDate(java.lang.String startDate) {
      checkNotIsSet(startDateIsSet(), "startDate");
      this.startDate = java.util.Objects.requireNonNull(startDate, "startDate");
      optBits |= OPT_BIT_START_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#startDate() startDate} to startDate.
     * @param startDate The value for startDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startDate")
    public final Builder startDate(java.util.Optional<java.lang.String> startDate) {
      checkNotIsSet(startDateIsSet(), "startDate");
      this.startDate = startDate.orElse(null);
      optBits |= OPT_BIT_START_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#outcomeCode() outcomeCode} to outcomeCode.
     * @param outcomeCode The value for outcomeCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcomeCode(java.util.List<com.fhir.CodeableConcept> outcomeCode) {
      checkNotIsSet(outcomeCodeIsSet(), "outcomeCode");
      this.outcomeCode = java.util.Objects.requireNonNull(outcomeCode, "outcomeCode");
      optBits |= OPT_BIT_OUTCOME_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#outcomeCode() outcomeCode} to outcomeCode.
     * @param outcomeCode The value for outcomeCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outcomeCode")
    public final Builder outcomeCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> outcomeCode) {
      checkNotIsSet(outcomeCodeIsSet(), "outcomeCode");
      this.outcomeCode = outcomeCode.orElse(null);
      optBits |= OPT_BIT_OUTCOME_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#lifecycleStatus() lifecycleStatus} to lifecycleStatus.
     * @param lifecycleStatus The value for lifecycleStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder lifecycleStatus(com.fhir.GoalLifecyclestatus lifecycleStatus) {
      checkNotIsSet(lifecycleStatusIsSet(), "lifecycleStatus");
      this.lifecycleStatus = java.util.Objects.requireNonNull(lifecycleStatus, "lifecycleStatus");
      optBits |= OPT_BIT_LIFECYCLE_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#lifecycleStatus() lifecycleStatus} to lifecycleStatus.
     * @param lifecycleStatus The value for lifecycleStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStatus")
    public final Builder lifecycleStatus(java.util.Optional<? extends com.fhir.GoalLifecyclestatus> lifecycleStatus) {
      checkNotIsSet(lifecycleStatusIsSet(), "lifecycleStatus");
      this.lifecycleStatus = lifecycleStatus.orElse(null);
      optBits |= OPT_BIT_LIFECYCLE_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#outcomeReference() outcomeReference} to outcomeReference.
     * @param outcomeReference The value for outcomeReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcomeReference(java.util.List<com.fhir.Reference> outcomeReference) {
      checkNotIsSet(outcomeReferenceIsSet(), "outcomeReference");
      this.outcomeReference = java.util.Objects.requireNonNull(outcomeReference, "outcomeReference");
      optBits |= OPT_BIT_OUTCOME_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#outcomeReference() outcomeReference} to outcomeReference.
     * @param outcomeReference The value for outcomeReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outcomeReference")
    public final Builder outcomeReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> outcomeReference) {
      checkNotIsSet(outcomeReferenceIsSet(), "outcomeReference");
      this.outcomeReference = outcomeReference.orElse(null);
      optBits |= OPT_BIT_OUTCOME_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#extension() extension} to extension.
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
     * Initializes the optional value {@link Goal#extension() extension} to extension.
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
     * Initializes the optional value {@link Goal#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Goal#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Goal#expressedBy() expressedBy} to expressedBy.
     * @param expressedBy The value for expressedBy
     * @return {@code this} builder for chained invocation
     */
    public final Builder expressedBy(com.fhir.Reference expressedBy) {
      checkNotIsSet(expressedByIsSet(), "expressedBy");
      this.expressedBy = java.util.Objects.requireNonNull(expressedBy, "expressedBy");
      optBits |= OPT_BIT_EXPRESSED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#expressedBy() expressedBy} to expressedBy.
     * @param expressedBy The value for expressedBy
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expressedBy")
    public final Builder expressedBy(java.util.Optional<? extends com.fhir.Reference> expressedBy) {
      checkNotIsSet(expressedByIsSet(), "expressedBy");
      this.expressedBy = expressedBy.orElse(null);
      optBits |= OPT_BIT_EXPRESSED_BY;
      return this;
    }

    /**
     * Initializes the value for the {@link Goal#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(com.fhir.Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      initBits &= ~INIT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(java.util.List<com.fhir.CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#language() language} to language.
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
     * Initializes the optional value {@link Goal#language() language} to language.
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
     * Initializes the value for the {@link Goal#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(com.fhir.CodeableConcept description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(com.fhir.CodeableConcept priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = java.util.Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public final Builder priority(java.util.Optional<? extends com.fhir.CodeableConcept> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Goal#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Goal#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(java.lang.String statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = java.util.Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public final Builder statusReason(java.util.Optional<java.lang.String> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Builds a new {@link Goal Goal}.
     * @return An immutable instance of Goal
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Goal build() {
      checkRequiredAttributes();
      return new ImmutableGoal(
          meta,
          achievementStatus,
          startCodeableConcept,
          resourceType,
          statusDate,
          text,
          addresses,
          note,
          modifierExtension,
          target,
          contained,
          id,
          startDate,
          outcomeCode,
          lifecycleStatus,
          outcomeReference,
          extension,
          identifier,
          expressedBy,
          subject,
          category,
          language,
          description,
          priority,
          implicitRules,
          statusReason);
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean achievementStatusIsSet() {
      return (optBits & OPT_BIT_ACHIEVEMENT_STATUS) != 0;
    }

    private boolean startCodeableConceptIsSet() {
      return (optBits & OPT_BIT_START_CODEABLE_CONCEPT) != 0;
    }

    private boolean statusDateIsSet() {
      return (optBits & OPT_BIT_STATUS_DATE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean addressesIsSet() {
      return (optBits & OPT_BIT_ADDRESSES) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean startDateIsSet() {
      return (optBits & OPT_BIT_START_DATE) != 0;
    }

    private boolean outcomeCodeIsSet() {
      return (optBits & OPT_BIT_OUTCOME_CODE) != 0;
    }

    private boolean lifecycleStatusIsSet() {
      return (optBits & OPT_BIT_LIFECYCLE_STATUS) != 0;
    }

    private boolean outcomeReferenceIsSet() {
      return (optBits & OPT_BIT_OUTCOME_REFERENCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean expressedByIsSet() {
      return (optBits & OPT_BIT_EXPRESSED_BY) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean descriptionIsSet() {
      return (initBits & INIT_BIT_DESCRIPTION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Goal is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!subjectIsSet()) attributes.add("subject");
      if (!descriptionIsSet()) attributes.add("description");
      return "Cannot build Goal, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Goal", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Goal#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    SubjectBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Goal", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link Goal#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    DescriptionBuildStage subject(com.fhir.Reference subject);
  }

  @org.immutables.value.Generated(from = "Goal", generator = "Immutables")
  public interface DescriptionBuildStage {
    /**
     * Initializes the value for the {@link Goal#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(com.fhir.CodeableConcept description);
  }

  @org.immutables.value.Generated(from = "Goal", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Goal#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Goal#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Goal#achievementStatus() achievementStatus} to achievementStatus.
     * @param achievementStatus The value for achievementStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal achievementStatus(com.fhir.CodeableConcept achievementStatus);

    /**
     * Initializes the optional value {@link Goal#achievementStatus() achievementStatus} to achievementStatus.
     * @param achievementStatus The value for achievementStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal achievementStatus(java.util.Optional<? extends com.fhir.CodeableConcept> achievementStatus);

    /**
     * Initializes the optional value {@link Goal#startCodeableConcept() startCodeableConcept} to startCodeableConcept.
     * @param startCodeableConcept The value for startCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal startCodeableConcept(com.fhir.CodeableConcept startCodeableConcept);

    /**
     * Initializes the optional value {@link Goal#startCodeableConcept() startCodeableConcept} to startCodeableConcept.
     * @param startCodeableConcept The value for startCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal startCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> startCodeableConcept);

    /**
     * Initializes the optional value {@link Goal#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusDate(com.fhir.date statusDate);

    /**
     * Initializes the optional value {@link Goal#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusDate(java.util.Optional<? extends com.fhir.date> statusDate);

    /**
     * Initializes the optional value {@link Goal#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Goal#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Goal#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for chained invocation
     */
    BuildFinal addresses(java.util.List<com.fhir.Reference> addresses);

    /**
     * Initializes the optional value {@link Goal#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addresses(java.util.Optional<? extends java.util.List<com.fhir.Reference>> addresses);

    /**
     * Initializes the optional value {@link Goal#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link Goal#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link Goal#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Goal#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Goal#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    BuildFinal target(java.util.List<com.fhir.Goal_Target> target);

    /**
     * Initializes the optional value {@link Goal#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal target(java.util.Optional<? extends java.util.List<com.fhir.Goal_Target>> target);

    /**
     * Initializes the optional value {@link Goal#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Goal#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Goal#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Goal#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Goal#startDate() startDate} to startDate.
     * @param startDate The value for startDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal startDate(java.lang.String startDate);

    /**
     * Initializes the optional value {@link Goal#startDate() startDate} to startDate.
     * @param startDate The value for startDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal startDate(java.util.Optional<java.lang.String> startDate);

    /**
     * Initializes the optional value {@link Goal#outcomeCode() outcomeCode} to outcomeCode.
     * @param outcomeCode The value for outcomeCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcomeCode(java.util.List<com.fhir.CodeableConcept> outcomeCode);

    /**
     * Initializes the optional value {@link Goal#outcomeCode() outcomeCode} to outcomeCode.
     * @param outcomeCode The value for outcomeCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcomeCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> outcomeCode);

    /**
     * Initializes the optional value {@link Goal#lifecycleStatus() lifecycleStatus} to lifecycleStatus.
     * @param lifecycleStatus The value for lifecycleStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lifecycleStatus(com.fhir.GoalLifecyclestatus lifecycleStatus);

    /**
     * Initializes the optional value {@link Goal#lifecycleStatus() lifecycleStatus} to lifecycleStatus.
     * @param lifecycleStatus The value for lifecycleStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lifecycleStatus(java.util.Optional<? extends com.fhir.GoalLifecyclestatus> lifecycleStatus);

    /**
     * Initializes the optional value {@link Goal#outcomeReference() outcomeReference} to outcomeReference.
     * @param outcomeReference The value for outcomeReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcomeReference(java.util.List<com.fhir.Reference> outcomeReference);

    /**
     * Initializes the optional value {@link Goal#outcomeReference() outcomeReference} to outcomeReference.
     * @param outcomeReference The value for outcomeReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcomeReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> outcomeReference);

    /**
     * Initializes the optional value {@link Goal#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Goal#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Goal#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Goal#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Goal#expressedBy() expressedBy} to expressedBy.
     * @param expressedBy The value for expressedBy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal expressedBy(com.fhir.Reference expressedBy);

    /**
     * Initializes the optional value {@link Goal#expressedBy() expressedBy} to expressedBy.
     * @param expressedBy The value for expressedBy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal expressedBy(java.util.Optional<? extends com.fhir.Reference> expressedBy);

    /**
     * Initializes the optional value {@link Goal#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link Goal#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category);

    /**
     * Initializes the optional value {@link Goal#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Goal#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Goal#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(com.fhir.CodeableConcept priority);

    /**
     * Initializes the optional value {@link Goal#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(java.util.Optional<? extends com.fhir.CodeableConcept> priority);

    /**
     * Initializes the optional value {@link Goal#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Goal#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Goal#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(java.lang.String statusReason);

    /**
     * Initializes the optional value {@link Goal#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(java.util.Optional<java.lang.String> statusReason);

    /**
     * Builds a new {@link Goal Goal}.
     * @return An immutable instance of Goal
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Goal build();
  }
}
