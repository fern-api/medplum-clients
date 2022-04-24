//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link RequestGroup_Action}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRequestGroup_Action.builder()}.
 */
@org.immutables.value.Generated(from = "RequestGroup_Action", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRequestGroup_Action implements com.fhir.RequestGroup_Action {
  private final @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_Action> action;
  private final @javax.annotation.Nullable java.lang.String textEquivalent;
  private final @javax.annotation.Nullable com.fhir.Age timingAge;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Range timingRange;
  private final @javax.annotation.Nullable com.fhir.Period timingPeriod;
  private final @javax.annotation.Nullable com.fhir.code precheckBehavior;
  private final @javax.annotation.Nullable com.fhir.code requiredBehavior;
  private final @javax.annotation.Nullable com.fhir.code groupingBehavior;
  private final @javax.annotation.Nullable com.fhir.code priority;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> participant;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_Condition> condition;
  private final @javax.annotation.Nullable com.fhir.Duration timingDuration;
  private final @javax.annotation.Nullable com.fhir.code cardinalityBehavior;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code selectionBehavior;
  private final @javax.annotation.Nullable java.lang.String timingDateTime;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.lang.String prefix;
  private final @javax.annotation.Nullable com.fhir.Timing timingTiming;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_RelatedAction> relatedAction;
  private final @javax.annotation.Nullable com.fhir.Reference resource;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> documentation;

  private ImmutableRequestGroup_Action(
      @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_Action> action,
      @javax.annotation.Nullable java.lang.String textEquivalent,
      @javax.annotation.Nullable com.fhir.Age timingAge,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Range timingRange,
      @javax.annotation.Nullable com.fhir.Period timingPeriod,
      @javax.annotation.Nullable com.fhir.code precheckBehavior,
      @javax.annotation.Nullable com.fhir.code requiredBehavior,
      @javax.annotation.Nullable com.fhir.code groupingBehavior,
      @javax.annotation.Nullable com.fhir.code priority,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> participant,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_Condition> condition,
      @javax.annotation.Nullable com.fhir.Duration timingDuration,
      @javax.annotation.Nullable com.fhir.code cardinalityBehavior,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> code,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code selectionBehavior,
      @javax.annotation.Nullable java.lang.String timingDateTime,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.lang.String prefix,
      @javax.annotation.Nullable com.fhir.Timing timingTiming,
      @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_RelatedAction> relatedAction,
      @javax.annotation.Nullable com.fhir.Reference resource,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> documentation) {
    this.action = action;
    this.textEquivalent = textEquivalent;
    this.timingAge = timingAge;
    this.modifierExtension = modifierExtension;
    this.timingRange = timingRange;
    this.timingPeriod = timingPeriod;
    this.precheckBehavior = precheckBehavior;
    this.requiredBehavior = requiredBehavior;
    this.groupingBehavior = groupingBehavior;
    this.priority = priority;
    this.participant = participant;
    this.id = id;
    this.description = description;
    this.condition = condition;
    this.timingDuration = timingDuration;
    this.cardinalityBehavior = cardinalityBehavior;
    this.code = code;
    this.extension = extension;
    this.selectionBehavior = selectionBehavior;
    this.timingDateTime = timingDateTime;
    this.title = title;
    this.prefix = prefix;
    this.timingTiming = timingTiming;
    this.relatedAction = relatedAction;
    this.resource = resource;
    this.type = type;
    this.documentation = documentation;
  }

  /**
   * @return The value of the {@code action} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("action")
  @Override
  public java.util.Optional<java.util.List<com.fhir.RequestGroup_Action>> action() {
    return java.util.Optional.ofNullable(action);
  }

  /**
   * @return The value of the {@code textEquivalent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("textEquivalent")
  @Override
  public java.util.Optional<java.lang.String> textEquivalent() {
    return java.util.Optional.ofNullable(textEquivalent);
  }

  /**
   * @return The value of the {@code timingAge} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingAge")
  @Override
  public java.util.Optional<com.fhir.Age> timingAge() {
    return java.util.Optional.ofNullable(timingAge);
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
   * @return The value of the {@code timingRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingRange")
  @Override
  public java.util.Optional<com.fhir.Range> timingRange() {
    return java.util.Optional.ofNullable(timingRange);
  }

  /**
   * @return The value of the {@code timingPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> timingPeriod() {
    return java.util.Optional.ofNullable(timingPeriod);
  }

  /**
   * @return The value of the {@code precheckBehavior} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("precheckBehavior")
  @Override
  public java.util.Optional<com.fhir.code> precheckBehavior() {
    return java.util.Optional.ofNullable(precheckBehavior);
  }

  /**
   * @return The value of the {@code requiredBehavior} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requiredBehavior")
  @Override
  public java.util.Optional<com.fhir.code> requiredBehavior() {
    return java.util.Optional.ofNullable(requiredBehavior);
  }

  /**
   * @return The value of the {@code groupingBehavior} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("groupingBehavior")
  @Override
  public java.util.Optional<com.fhir.code> groupingBehavior() {
    return java.util.Optional.ofNullable(groupingBehavior);
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priority")
  @Override
  public java.util.Optional<com.fhir.code> priority() {
    return java.util.Optional.ofNullable(priority);
  }

  /**
   * @return The value of the {@code participant} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("participant")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> participant() {
    return java.util.Optional.ofNullable(participant);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("condition")
  @Override
  public java.util.Optional<java.util.List<com.fhir.RequestGroup_Condition>> condition() {
    return java.util.Optional.ofNullable(condition);
  }

  /**
   * @return The value of the {@code timingDuration} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingDuration")
  @Override
  public java.util.Optional<com.fhir.Duration> timingDuration() {
    return java.util.Optional.ofNullable(timingDuration);
  }

  /**
   * @return The value of the {@code cardinalityBehavior} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("cardinalityBehavior")
  @Override
  public java.util.Optional<com.fhir.code> cardinalityBehavior() {
    return java.util.Optional.ofNullable(cardinalityBehavior);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> code() {
    return java.util.Optional.ofNullable(code);
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
   * @return The value of the {@code selectionBehavior} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("selectionBehavior")
  @Override
  public java.util.Optional<com.fhir.code> selectionBehavior() {
    return java.util.Optional.ofNullable(selectionBehavior);
  }

  /**
   * @return The value of the {@code timingDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingDateTime")
  @Override
  public java.util.Optional<java.lang.String> timingDateTime() {
    return java.util.Optional.ofNullable(timingDateTime);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  @Override
  public java.util.Optional<java.lang.String> title() {
    return java.util.Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code prefix} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("prefix")
  @Override
  public java.util.Optional<java.lang.String> prefix() {
    return java.util.Optional.ofNullable(prefix);
  }

  /**
   * @return The value of the {@code timingTiming} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingTiming")
  @Override
  public java.util.Optional<com.fhir.Timing> timingTiming() {
    return java.util.Optional.ofNullable(timingTiming);
  }

  /**
   * @return The value of the {@code relatedAction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relatedAction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.RequestGroup_RelatedAction>> relatedAction() {
    return java.util.Optional.ofNullable(relatedAction);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resource")
  @Override
  public java.util.Optional<com.fhir.Reference> resource() {
    return java.util.Optional.ofNullable(resource);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code documentation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("documentation")
  @Override
  public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> documentation() {
    return java.util.Optional.ofNullable(documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#action() action} attribute.
   * @param value The value for action
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withAction(java.util.List<com.fhir.RequestGroup_Action> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_Action> newValue = java.util.Objects.requireNonNull(value, "action");
    if (this.action == newValue) return this;
    return new ImmutableRequestGroup_Action(
        newValue,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#action() action} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for action
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withAction(java.util.Optional<? extends java.util.List<com.fhir.RequestGroup_Action>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_Action> value = optional.orElse(null);
    if (this.action == value) return this;
    return new ImmutableRequestGroup_Action(
        value,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#textEquivalent() textEquivalent} attribute.
   * @param value The value for textEquivalent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTextEquivalent(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "textEquivalent");
    if (java.util.Objects.equals(this.textEquivalent, newValue)) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        newValue,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#textEquivalent() textEquivalent} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for textEquivalent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTextEquivalent(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.textEquivalent, value)) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        value,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#timingAge() timingAge} attribute.
   * @param value The value for timingAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTimingAge(com.fhir.Age value) {
    @javax.annotation.Nullable com.fhir.Age newValue = java.util.Objects.requireNonNull(value, "timingAge");
    if (this.timingAge == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        newValue,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#timingAge() timingAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withTimingAge(java.util.Optional<? extends com.fhir.Age> optional) {
    @javax.annotation.Nullable com.fhir.Age value = optional.orElse(null);
    if (this.timingAge == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        value,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        newValue,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        value,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#timingRange() timingRange} attribute.
   * @param value The value for timingRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTimingRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "timingRange");
    if (this.timingRange == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        newValue,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#timingRange() timingRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withTimingRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.timingRange == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        value,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#timingPeriod() timingPeriod} attribute.
   * @param value The value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTimingPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "timingPeriod");
    if (this.timingPeriod == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        newValue,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#timingPeriod() timingPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withTimingPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.timingPeriod == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        value,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#precheckBehavior() precheckBehavior} attribute.
   * @param value The value for precheckBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withPrecheckBehavior(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "precheckBehavior");
    if (this.precheckBehavior == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        newValue,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#precheckBehavior() precheckBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for precheckBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withPrecheckBehavior(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.precheckBehavior == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        value,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#requiredBehavior() requiredBehavior} attribute.
   * @param value The value for requiredBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withRequiredBehavior(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "requiredBehavior");
    if (this.requiredBehavior == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        newValue,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#requiredBehavior() requiredBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requiredBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withRequiredBehavior(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.requiredBehavior == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        value,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#groupingBehavior() groupingBehavior} attribute.
   * @param value The value for groupingBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withGroupingBehavior(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "groupingBehavior");
    if (this.groupingBehavior == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        newValue,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#groupingBehavior() groupingBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupingBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withGroupingBehavior(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.groupingBehavior == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        value,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withPriority(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        newValue,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withPriority(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        value,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#participant() participant} attribute.
   * @param value The value for participant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withParticipant(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "participant");
    if (this.participant == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        newValue,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#participant() participant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withParticipant(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.participant == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        value,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        newValue,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        value,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        newValue,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        value,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withCondition(java.util.List<com.fhir.RequestGroup_Condition> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_Condition> newValue = java.util.Objects.requireNonNull(value, "condition");
    if (this.condition == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        newValue,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#condition() condition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withCondition(java.util.Optional<? extends java.util.List<com.fhir.RequestGroup_Condition>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_Condition> value = optional.orElse(null);
    if (this.condition == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        value,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#timingDuration() timingDuration} attribute.
   * @param value The value for timingDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTimingDuration(com.fhir.Duration value) {
    @javax.annotation.Nullable com.fhir.Duration newValue = java.util.Objects.requireNonNull(value, "timingDuration");
    if (this.timingDuration == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        newValue,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#timingDuration() timingDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withTimingDuration(java.util.Optional<? extends com.fhir.Duration> optional) {
    @javax.annotation.Nullable com.fhir.Duration value = optional.orElse(null);
    if (this.timingDuration == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        value,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#cardinalityBehavior() cardinalityBehavior} attribute.
   * @param value The value for cardinalityBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withCardinalityBehavior(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "cardinalityBehavior");
    if (this.cardinalityBehavior == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        newValue,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#cardinalityBehavior() cardinalityBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cardinalityBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withCardinalityBehavior(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.cardinalityBehavior == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        value,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        newValue,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        value,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        newValue,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        value,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#selectionBehavior() selectionBehavior} attribute.
   * @param value The value for selectionBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withSelectionBehavior(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "selectionBehavior");
    if (this.selectionBehavior == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        newValue,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#selectionBehavior() selectionBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for selectionBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withSelectionBehavior(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.selectionBehavior == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        value,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#timingDateTime() timingDateTime} attribute.
   * @param value The value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTimingDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "timingDateTime");
    if (java.util.Objects.equals(this.timingDateTime, newValue)) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        newValue,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#timingDateTime() timingDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTimingDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.timingDateTime, value)) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        value,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        newValue,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        value,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#prefix() prefix} attribute.
   * @param value The value for prefix
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withPrefix(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "prefix");
    if (java.util.Objects.equals(this.prefix, newValue)) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        newValue,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#prefix() prefix} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prefix
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withPrefix(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.prefix, value)) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        value,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#timingTiming() timingTiming} attribute.
   * @param value The value for timingTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTimingTiming(com.fhir.Timing value) {
    @javax.annotation.Nullable com.fhir.Timing newValue = java.util.Objects.requireNonNull(value, "timingTiming");
    if (this.timingTiming == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        newValue,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#timingTiming() timingTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withTimingTiming(java.util.Optional<? extends com.fhir.Timing> optional) {
    @javax.annotation.Nullable com.fhir.Timing value = optional.orElse(null);
    if (this.timingTiming == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        value,
        this.relatedAction,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#relatedAction() relatedAction} attribute.
   * @param value The value for relatedAction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withRelatedAction(java.util.List<com.fhir.RequestGroup_RelatedAction> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_RelatedAction> newValue = java.util.Objects.requireNonNull(value, "relatedAction");
    if (this.relatedAction == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        newValue,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#relatedAction() relatedAction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedAction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withRelatedAction(java.util.Optional<? extends java.util.List<com.fhir.RequestGroup_RelatedAction>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_RelatedAction> value = optional.orElse(null);
    if (this.relatedAction == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        value,
        this.resource,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withResource(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        newValue,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withResource(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        value,
        this.type,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        newValue,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        value,
        this.documentation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withDocumentation(java.util.List<com.fhir.RelatedArtifact> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> newValue = java.util.Objects.requireNonNull(value, "documentation");
    if (this.documentation == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#documentation() documentation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withDocumentation(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> value = optional.orElse(null);
    if (this.documentation == value) return this;
    return new ImmutableRequestGroup_Action(
        this.action,
        this.textEquivalent,
        this.timingAge,
        this.modifierExtension,
        this.timingRange,
        this.timingPeriod,
        this.precheckBehavior,
        this.requiredBehavior,
        this.groupingBehavior,
        this.priority,
        this.participant,
        this.id,
        this.description,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.code,
        this.extension,
        this.selectionBehavior,
        this.timingDateTime,
        this.title,
        this.prefix,
        this.timingTiming,
        this.relatedAction,
        this.resource,
        this.type,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRequestGroup_Action} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRequestGroup_Action
        && equalTo((ImmutableRequestGroup_Action) another);
  }

  private boolean equalTo(ImmutableRequestGroup_Action another) {
    return java.util.Objects.equals(action, another.action)
        && java.util.Objects.equals(textEquivalent, another.textEquivalent)
        && java.util.Objects.equals(timingAge, another.timingAge)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(timingRange, another.timingRange)
        && java.util.Objects.equals(timingPeriod, another.timingPeriod)
        && java.util.Objects.equals(precheckBehavior, another.precheckBehavior)
        && java.util.Objects.equals(requiredBehavior, another.requiredBehavior)
        && java.util.Objects.equals(groupingBehavior, another.groupingBehavior)
        && java.util.Objects.equals(priority, another.priority)
        && java.util.Objects.equals(participant, another.participant)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(condition, another.condition)
        && java.util.Objects.equals(timingDuration, another.timingDuration)
        && java.util.Objects.equals(cardinalityBehavior, another.cardinalityBehavior)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(selectionBehavior, another.selectionBehavior)
        && java.util.Objects.equals(timingDateTime, another.timingDateTime)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(prefix, another.prefix)
        && java.util.Objects.equals(timingTiming, another.timingTiming)
        && java.util.Objects.equals(relatedAction, another.relatedAction)
        && java.util.Objects.equals(resource, another.resource)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(documentation, another.documentation);
  }

  /**
   * Computes a hash code from attributes: {@code action}, {@code textEquivalent}, {@code timingAge}, {@code modifierExtension}, {@code timingRange}, {@code timingPeriod}, {@code precheckBehavior}, {@code requiredBehavior}, {@code groupingBehavior}, {@code priority}, {@code participant}, {@code id}, {@code description}, {@code condition}, {@code timingDuration}, {@code cardinalityBehavior}, {@code code}, {@code extension}, {@code selectionBehavior}, {@code timingDateTime}, {@code title}, {@code prefix}, {@code timingTiming}, {@code relatedAction}, {@code resource}, {@code type}, {@code documentation}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(action);
    h += (h << 5) + java.util.Objects.hashCode(textEquivalent);
    h += (h << 5) + java.util.Objects.hashCode(timingAge);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(timingRange);
    h += (h << 5) + java.util.Objects.hashCode(timingPeriod);
    h += (h << 5) + java.util.Objects.hashCode(precheckBehavior);
    h += (h << 5) + java.util.Objects.hashCode(requiredBehavior);
    h += (h << 5) + java.util.Objects.hashCode(groupingBehavior);
    h += (h << 5) + java.util.Objects.hashCode(priority);
    h += (h << 5) + java.util.Objects.hashCode(participant);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(condition);
    h += (h << 5) + java.util.Objects.hashCode(timingDuration);
    h += (h << 5) + java.util.Objects.hashCode(cardinalityBehavior);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(selectionBehavior);
    h += (h << 5) + java.util.Objects.hashCode(timingDateTime);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(prefix);
    h += (h << 5) + java.util.Objects.hashCode(timingTiming);
    h += (h << 5) + java.util.Objects.hashCode(relatedAction);
    h += (h << 5) + java.util.Objects.hashCode(resource);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(documentation);
    return h;
  }

  /**
   * Prints the immutable value {@code RequestGroup_Action} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("RequestGroup_Action{");
    if (action != null) {
      builder.append("action=").append(action);
    }
    if (textEquivalent != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("textEquivalent=").append(textEquivalent);
    }
    if (timingAge != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("timingAge=").append(timingAge);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (timingRange != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("timingRange=").append(timingRange);
    }
    if (timingPeriod != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("timingPeriod=").append(timingPeriod);
    }
    if (precheckBehavior != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("precheckBehavior=").append(precheckBehavior);
    }
    if (requiredBehavior != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("requiredBehavior=").append(requiredBehavior);
    }
    if (groupingBehavior != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("groupingBehavior=").append(groupingBehavior);
    }
    if (priority != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (participant != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("participant=").append(participant);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (description != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (condition != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("condition=").append(condition);
    }
    if (timingDuration != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("timingDuration=").append(timingDuration);
    }
    if (cardinalityBehavior != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("cardinalityBehavior=").append(cardinalityBehavior);
    }
    if (code != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (selectionBehavior != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("selectionBehavior=").append(selectionBehavior);
    }
    if (timingDateTime != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("timingDateTime=").append(timingDateTime);
    }
    if (title != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (prefix != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("prefix=").append(prefix);
    }
    if (timingTiming != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("timingTiming=").append(timingTiming);
    }
    if (relatedAction != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("relatedAction=").append(relatedAction);
    }
    if (resource != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (type != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (documentation != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "RequestGroup_Action", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.RequestGroup_Action {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RequestGroup_Action>> action = java.util.Optional.empty();
    boolean actionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> textEquivalent = java.util.Optional.empty();
    boolean textEquivalentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Age> timingAge = java.util.Optional.empty();
    boolean timingAgeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> timingRange = java.util.Optional.empty();
    boolean timingRangeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> timingPeriod = java.util.Optional.empty();
    boolean timingPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> precheckBehavior = java.util.Optional.empty();
    boolean precheckBehaviorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> requiredBehavior = java.util.Optional.empty();
    boolean requiredBehaviorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> groupingBehavior = java.util.Optional.empty();
    boolean groupingBehaviorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> priority = java.util.Optional.empty();
    boolean priorityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> participant = java.util.Optional.empty();
    boolean participantIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RequestGroup_Condition>> condition = java.util.Optional.empty();
    boolean conditionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Duration> timingDuration = java.util.Optional.empty();
    boolean timingDurationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> cardinalityBehavior = java.util.Optional.empty();
    boolean cardinalityBehaviorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> selectionBehavior = java.util.Optional.empty();
    boolean selectionBehaviorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> timingDateTime = java.util.Optional.empty();
    boolean timingDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> prefix = java.util.Optional.empty();
    boolean prefixIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing> timingTiming = java.util.Optional.empty();
    boolean timingTimingIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RequestGroup_RelatedAction>> relatedAction = java.util.Optional.empty();
    boolean relatedActionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> resource = java.util.Optional.empty();
    boolean resourceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> documentation = java.util.Optional.empty();
    boolean documentationIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    public void setAction(java.util.Optional<java.util.List<com.fhir.RequestGroup_Action>> action) {
      this.action = action;
      this.actionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("textEquivalent")
    public void setTextEquivalent(java.util.Optional<java.lang.String> textEquivalent) {
      this.textEquivalent = textEquivalent;
      this.textEquivalentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingAge")
    public void setTimingAge(java.util.Optional<com.fhir.Age> timingAge) {
      this.timingAge = timingAge;
      this.timingAgeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingRange")
    public void setTimingRange(java.util.Optional<com.fhir.Range> timingRange) {
      this.timingRange = timingRange;
      this.timingRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingPeriod")
    public void setTimingPeriod(java.util.Optional<com.fhir.Period> timingPeriod) {
      this.timingPeriod = timingPeriod;
      this.timingPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("precheckBehavior")
    public void setPrecheckBehavior(java.util.Optional<com.fhir.code> precheckBehavior) {
      this.precheckBehavior = precheckBehavior;
      this.precheckBehaviorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requiredBehavior")
    public void setRequiredBehavior(java.util.Optional<com.fhir.code> requiredBehavior) {
      this.requiredBehavior = requiredBehavior;
      this.requiredBehaviorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("groupingBehavior")
    public void setGroupingBehavior(java.util.Optional<com.fhir.code> groupingBehavior) {
      this.groupingBehavior = groupingBehavior;
      this.groupingBehaviorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(java.util.Optional<com.fhir.code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("participant")
    public void setParticipant(java.util.Optional<java.util.List<com.fhir.Reference>> participant) {
      this.participant = participant;
      this.participantIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    public void setCondition(java.util.Optional<java.util.List<com.fhir.RequestGroup_Condition>> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingDuration")
    public void setTimingDuration(java.util.Optional<com.fhir.Duration> timingDuration) {
      this.timingDuration = timingDuration;
      this.timingDurationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("cardinalityBehavior")
    public void setCardinalityBehavior(java.util.Optional<com.fhir.code> cardinalityBehavior) {
      this.cardinalityBehavior = cardinalityBehavior;
      this.cardinalityBehaviorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("selectionBehavior")
    public void setSelectionBehavior(java.util.Optional<com.fhir.code> selectionBehavior) {
      this.selectionBehavior = selectionBehavior;
      this.selectionBehaviorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingDateTime")
    public void setTimingDateTime(java.util.Optional<java.lang.String> timingDateTime) {
      this.timingDateTime = timingDateTime;
      this.timingDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    public void setPrefix(java.util.Optional<java.lang.String> prefix) {
      this.prefix = prefix;
      this.prefixIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingTiming")
    public void setTimingTiming(java.util.Optional<com.fhir.Timing> timingTiming) {
      this.timingTiming = timingTiming;
      this.timingTimingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relatedAction")
    public void setRelatedAction(java.util.Optional<java.util.List<com.fhir.RequestGroup_RelatedAction>> relatedAction) {
      this.relatedAction = relatedAction;
      this.relatedActionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public void setResource(java.util.Optional<com.fhir.Reference> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public void setDocumentation(java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RequestGroup_Action>> action() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> textEquivalent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Age> timingAge() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Range> timingRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> timingPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> precheckBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> requiredBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> groupingBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> participant() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RequestGroup_Condition>> condition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Duration> timingDuration() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> cardinalityBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> selectionBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> timingDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> prefix() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Timing> timingTiming() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RequestGroup_RelatedAction>> relatedAction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> resource() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> documentation() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableRequestGroup_Action fromJson(Json json) {
    ImmutableRequestGroup_Action.Builder builder = ImmutableRequestGroup_Action.builder();
    if (json.actionIsSet) {
      builder.action(json.action);
    }
    if (json.textEquivalentIsSet) {
      builder.textEquivalent(json.textEquivalent);
    }
    if (json.timingAgeIsSet) {
      builder.timingAge(json.timingAge);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.timingRangeIsSet) {
      builder.timingRange(json.timingRange);
    }
    if (json.timingPeriodIsSet) {
      builder.timingPeriod(json.timingPeriod);
    }
    if (json.precheckBehaviorIsSet) {
      builder.precheckBehavior(json.precheckBehavior);
    }
    if (json.requiredBehaviorIsSet) {
      builder.requiredBehavior(json.requiredBehavior);
    }
    if (json.groupingBehaviorIsSet) {
      builder.groupingBehavior(json.groupingBehavior);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.participantIsSet) {
      builder.participant(json.participant);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    if (json.timingDurationIsSet) {
      builder.timingDuration(json.timingDuration);
    }
    if (json.cardinalityBehaviorIsSet) {
      builder.cardinalityBehavior(json.cardinalityBehavior);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.selectionBehaviorIsSet) {
      builder.selectionBehavior(json.selectionBehavior);
    }
    if (json.timingDateTimeIsSet) {
      builder.timingDateTime(json.timingDateTime);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.prefixIsSet) {
      builder.prefix(json.prefix);
    }
    if (json.timingTimingIsSet) {
      builder.timingTiming(json.timingTiming);
    }
    if (json.relatedActionIsSet) {
      builder.relatedAction(json.relatedAction);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    return (ImmutableRequestGroup_Action) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RequestGroup_Action} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RequestGroup_Action instance
   */
  public static RequestGroup_Action copyOf(RequestGroup_Action instance) {
    if (instance instanceof ImmutableRequestGroup_Action) {
      return (ImmutableRequestGroup_Action) instance;
    }
    return ImmutableRequestGroup_Action.builder()
        .action(instance.action())
        .textEquivalent(instance.textEquivalent())
        .timingAge(instance.timingAge())
        .modifierExtension(instance.modifierExtension())
        .timingRange(instance.timingRange())
        .timingPeriod(instance.timingPeriod())
        .precheckBehavior(instance.precheckBehavior())
        .requiredBehavior(instance.requiredBehavior())
        .groupingBehavior(instance.groupingBehavior())
        .priority(instance.priority())
        .participant(instance.participant())
        .id(instance.id())
        .description(instance.description())
        .condition(instance.condition())
        .timingDuration(instance.timingDuration())
        .cardinalityBehavior(instance.cardinalityBehavior())
        .code(instance.code())
        .extension(instance.extension())
        .selectionBehavior(instance.selectionBehavior())
        .timingDateTime(instance.timingDateTime())
        .title(instance.title())
        .prefix(instance.prefix())
        .timingTiming(instance.timingTiming())
        .relatedAction(instance.relatedAction())
        .resource(instance.resource())
        .type(instance.type())
        .documentation(instance.documentation())
        .build();
  }

  /**
   * Creates a builder for {@link RequestGroup_Action RequestGroup_Action}.
   * <pre>
   * ImmutableRequestGroup_Action.builder()
   *    .action(List&amp;lt;com.fhir.RequestGroup_Action&amp;gt;) // optional {@link RequestGroup_Action#action() action}
   *    .textEquivalent(String) // optional {@link RequestGroup_Action#textEquivalent() textEquivalent}
   *    .timingAge(com.fhir.Age) // optional {@link RequestGroup_Action#timingAge() timingAge}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RequestGroup_Action#modifierExtension() modifierExtension}
   *    .timingRange(com.fhir.Range) // optional {@link RequestGroup_Action#timingRange() timingRange}
   *    .timingPeriod(com.fhir.Period) // optional {@link RequestGroup_Action#timingPeriod() timingPeriod}
   *    .precheckBehavior(com.fhir.code) // optional {@link RequestGroup_Action#precheckBehavior() precheckBehavior}
   *    .requiredBehavior(com.fhir.code) // optional {@link RequestGroup_Action#requiredBehavior() requiredBehavior}
   *    .groupingBehavior(com.fhir.code) // optional {@link RequestGroup_Action#groupingBehavior() groupingBehavior}
   *    .priority(com.fhir.code) // optional {@link RequestGroup_Action#priority() priority}
   *    .participant(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link RequestGroup_Action#participant() participant}
   *    .id(String) // optional {@link RequestGroup_Action#id() id}
   *    .description(String) // optional {@link RequestGroup_Action#description() description}
   *    .condition(List&amp;lt;com.fhir.RequestGroup_Condition&amp;gt;) // optional {@link RequestGroup_Action#condition() condition}
   *    .timingDuration(com.fhir.Duration) // optional {@link RequestGroup_Action#timingDuration() timingDuration}
   *    .cardinalityBehavior(com.fhir.code) // optional {@link RequestGroup_Action#cardinalityBehavior() cardinalityBehavior}
   *    .code(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link RequestGroup_Action#code() code}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RequestGroup_Action#extension() extension}
   *    .selectionBehavior(com.fhir.code) // optional {@link RequestGroup_Action#selectionBehavior() selectionBehavior}
   *    .timingDateTime(String) // optional {@link RequestGroup_Action#timingDateTime() timingDateTime}
   *    .title(String) // optional {@link RequestGroup_Action#title() title}
   *    .prefix(String) // optional {@link RequestGroup_Action#prefix() prefix}
   *    .timingTiming(com.fhir.Timing) // optional {@link RequestGroup_Action#timingTiming() timingTiming}
   *    .relatedAction(List&amp;lt;com.fhir.RequestGroup_RelatedAction&amp;gt;) // optional {@link RequestGroup_Action#relatedAction() relatedAction}
   *    .resource(com.fhir.Reference) // optional {@link RequestGroup_Action#resource() resource}
   *    .type(com.fhir.CodeableConcept) // optional {@link RequestGroup_Action#type() type}
   *    .documentation(List&amp;lt;com.fhir.RelatedArtifact&amp;gt;) // optional {@link RequestGroup_Action#documentation() documentation}
   *    .build();
   * </pre>
   * @return A new RequestGroup_Action builder
   */
  public static ImmutableRequestGroup_Action.Builder builder() {
    return new ImmutableRequestGroup_Action.Builder();
  }

  /**
   * Builds instances of type {@link RequestGroup_Action RequestGroup_Action}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "RequestGroup_Action", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ACTION = 0x1L;
    private static final long OPT_BIT_TEXT_EQUIVALENT = 0x2L;
    private static final long OPT_BIT_TIMING_AGE = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_TIMING_RANGE = 0x10L;
    private static final long OPT_BIT_TIMING_PERIOD = 0x20L;
    private static final long OPT_BIT_PRECHECK_BEHAVIOR = 0x40L;
    private static final long OPT_BIT_REQUIRED_BEHAVIOR = 0x80L;
    private static final long OPT_BIT_GROUPING_BEHAVIOR = 0x100L;
    private static final long OPT_BIT_PRIORITY = 0x200L;
    private static final long OPT_BIT_PARTICIPANT = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_DESCRIPTION = 0x1000L;
    private static final long OPT_BIT_CONDITION = 0x2000L;
    private static final long OPT_BIT_TIMING_DURATION = 0x4000L;
    private static final long OPT_BIT_CARDINALITY_BEHAVIOR = 0x8000L;
    private static final long OPT_BIT_CODE = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private static final long OPT_BIT_SELECTION_BEHAVIOR = 0x40000L;
    private static final long OPT_BIT_TIMING_DATE_TIME = 0x80000L;
    private static final long OPT_BIT_TITLE = 0x100000L;
    private static final long OPT_BIT_PREFIX = 0x200000L;
    private static final long OPT_BIT_TIMING_TIMING = 0x400000L;
    private static final long OPT_BIT_RELATED_ACTION = 0x800000L;
    private static final long OPT_BIT_RESOURCE = 0x1000000L;
    private static final long OPT_BIT_TYPE = 0x2000000L;
    private static final long OPT_BIT_DOCUMENTATION = 0x4000000L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_Action> action;
    private @javax.annotation.Nullable java.lang.String textEquivalent;
    private @javax.annotation.Nullable com.fhir.Age timingAge;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Range timingRange;
    private @javax.annotation.Nullable com.fhir.Period timingPeriod;
    private @javax.annotation.Nullable com.fhir.code precheckBehavior;
    private @javax.annotation.Nullable com.fhir.code requiredBehavior;
    private @javax.annotation.Nullable com.fhir.code groupingBehavior;
    private @javax.annotation.Nullable com.fhir.code priority;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> participant;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_Condition> condition;
    private @javax.annotation.Nullable com.fhir.Duration timingDuration;
    private @javax.annotation.Nullable com.fhir.code cardinalityBehavior;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> code;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code selectionBehavior;
    private @javax.annotation.Nullable java.lang.String timingDateTime;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.lang.String prefix;
    private @javax.annotation.Nullable com.fhir.Timing timingTiming;
    private @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_RelatedAction> relatedAction;
    private @javax.annotation.Nullable com.fhir.Reference resource;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> documentation;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    public final Builder action(java.util.List<com.fhir.RequestGroup_Action> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = java.util.Objects.requireNonNull(action, "action");
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    public final Builder action(java.util.Optional<? extends java.util.List<com.fhir.RequestGroup_Action>> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = action.orElse(null);
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#textEquivalent() textEquivalent} to textEquivalent.
     * @param textEquivalent The value for textEquivalent
     * @return {@code this} builder for chained invocation
     */
    public final Builder textEquivalent(java.lang.String textEquivalent) {
      checkNotIsSet(textEquivalentIsSet(), "textEquivalent");
      this.textEquivalent = java.util.Objects.requireNonNull(textEquivalent, "textEquivalent");
      optBits |= OPT_BIT_TEXT_EQUIVALENT;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#textEquivalent() textEquivalent} to textEquivalent.
     * @param textEquivalent The value for textEquivalent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("textEquivalent")
    public final Builder textEquivalent(java.util.Optional<java.lang.String> textEquivalent) {
      checkNotIsSet(textEquivalentIsSet(), "textEquivalent");
      this.textEquivalent = textEquivalent.orElse(null);
      optBits |= OPT_BIT_TEXT_EQUIVALENT;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#timingAge() timingAge} to timingAge.
     * @param timingAge The value for timingAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingAge(com.fhir.Age timingAge) {
      checkNotIsSet(timingAgeIsSet(), "timingAge");
      this.timingAge = java.util.Objects.requireNonNull(timingAge, "timingAge");
      optBits |= OPT_BIT_TIMING_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#timingAge() timingAge} to timingAge.
     * @param timingAge The value for timingAge
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingAge")
    public final Builder timingAge(java.util.Optional<? extends com.fhir.Age> timingAge) {
      checkNotIsSet(timingAgeIsSet(), "timingAge");
      this.timingAge = timingAge.orElse(null);
      optBits |= OPT_BIT_TIMING_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RequestGroup_Action#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RequestGroup_Action#timingRange() timingRange} to timingRange.
     * @param timingRange The value for timingRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingRange(com.fhir.Range timingRange) {
      checkNotIsSet(timingRangeIsSet(), "timingRange");
      this.timingRange = java.util.Objects.requireNonNull(timingRange, "timingRange");
      optBits |= OPT_BIT_TIMING_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#timingRange() timingRange} to timingRange.
     * @param timingRange The value for timingRange
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingRange")
    public final Builder timingRange(java.util.Optional<? extends com.fhir.Range> timingRange) {
      checkNotIsSet(timingRangeIsSet(), "timingRange");
      this.timingRange = timingRange.orElse(null);
      optBits |= OPT_BIT_TIMING_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingPeriod(com.fhir.Period timingPeriod) {
      checkNotIsSet(timingPeriodIsSet(), "timingPeriod");
      this.timingPeriod = java.util.Objects.requireNonNull(timingPeriod, "timingPeriod");
      optBits |= OPT_BIT_TIMING_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingPeriod")
    public final Builder timingPeriod(java.util.Optional<? extends com.fhir.Period> timingPeriod) {
      checkNotIsSet(timingPeriodIsSet(), "timingPeriod");
      this.timingPeriod = timingPeriod.orElse(null);
      optBits |= OPT_BIT_TIMING_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#precheckBehavior() precheckBehavior} to precheckBehavior.
     * @param precheckBehavior The value for precheckBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder precheckBehavior(com.fhir.code precheckBehavior) {
      checkNotIsSet(precheckBehaviorIsSet(), "precheckBehavior");
      this.precheckBehavior = java.util.Objects.requireNonNull(precheckBehavior, "precheckBehavior");
      optBits |= OPT_BIT_PRECHECK_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#precheckBehavior() precheckBehavior} to precheckBehavior.
     * @param precheckBehavior The value for precheckBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("precheckBehavior")
    public final Builder precheckBehavior(java.util.Optional<? extends com.fhir.code> precheckBehavior) {
      checkNotIsSet(precheckBehaviorIsSet(), "precheckBehavior");
      this.precheckBehavior = precheckBehavior.orElse(null);
      optBits |= OPT_BIT_PRECHECK_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#requiredBehavior() requiredBehavior} to requiredBehavior.
     * @param requiredBehavior The value for requiredBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder requiredBehavior(com.fhir.code requiredBehavior) {
      checkNotIsSet(requiredBehaviorIsSet(), "requiredBehavior");
      this.requiredBehavior = java.util.Objects.requireNonNull(requiredBehavior, "requiredBehavior");
      optBits |= OPT_BIT_REQUIRED_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#requiredBehavior() requiredBehavior} to requiredBehavior.
     * @param requiredBehavior The value for requiredBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requiredBehavior")
    public final Builder requiredBehavior(java.util.Optional<? extends com.fhir.code> requiredBehavior) {
      checkNotIsSet(requiredBehaviorIsSet(), "requiredBehavior");
      this.requiredBehavior = requiredBehavior.orElse(null);
      optBits |= OPT_BIT_REQUIRED_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#groupingBehavior() groupingBehavior} to groupingBehavior.
     * @param groupingBehavior The value for groupingBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder groupingBehavior(com.fhir.code groupingBehavior) {
      checkNotIsSet(groupingBehaviorIsSet(), "groupingBehavior");
      this.groupingBehavior = java.util.Objects.requireNonNull(groupingBehavior, "groupingBehavior");
      optBits |= OPT_BIT_GROUPING_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#groupingBehavior() groupingBehavior} to groupingBehavior.
     * @param groupingBehavior The value for groupingBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupingBehavior")
    public final Builder groupingBehavior(java.util.Optional<? extends com.fhir.code> groupingBehavior) {
      checkNotIsSet(groupingBehaviorIsSet(), "groupingBehavior");
      this.groupingBehavior = groupingBehavior.orElse(null);
      optBits |= OPT_BIT_GROUPING_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(com.fhir.code priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = java.util.Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public final Builder priority(java.util.Optional<? extends com.fhir.code> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    public final Builder participant(java.util.List<com.fhir.Reference> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = java.util.Objects.requireNonNull(participant, "participant");
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("participant")
    public final Builder participant(java.util.Optional<? extends java.util.List<com.fhir.Reference>> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = participant.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#id() id} to id.
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
     * Initializes the optional value {@link RequestGroup_Action#id() id} to id.
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
     * Initializes the optional value {@link RequestGroup_Action#description() description} to description.
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
     * Initializes the optional value {@link RequestGroup_Action#description() description} to description.
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
     * Initializes the optional value {@link RequestGroup_Action#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    public final Builder condition(java.util.List<com.fhir.RequestGroup_Condition> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = java.util.Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    public final Builder condition(java.util.Optional<? extends java.util.List<com.fhir.RequestGroup_Condition>> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = condition.orElse(null);
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#timingDuration() timingDuration} to timingDuration.
     * @param timingDuration The value for timingDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingDuration(com.fhir.Duration timingDuration) {
      checkNotIsSet(timingDurationIsSet(), "timingDuration");
      this.timingDuration = java.util.Objects.requireNonNull(timingDuration, "timingDuration");
      optBits |= OPT_BIT_TIMING_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#timingDuration() timingDuration} to timingDuration.
     * @param timingDuration The value for timingDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingDuration")
    public final Builder timingDuration(java.util.Optional<? extends com.fhir.Duration> timingDuration) {
      checkNotIsSet(timingDurationIsSet(), "timingDuration");
      this.timingDuration = timingDuration.orElse(null);
      optBits |= OPT_BIT_TIMING_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#cardinalityBehavior() cardinalityBehavior} to cardinalityBehavior.
     * @param cardinalityBehavior The value for cardinalityBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder cardinalityBehavior(com.fhir.code cardinalityBehavior) {
      checkNotIsSet(cardinalityBehaviorIsSet(), "cardinalityBehavior");
      this.cardinalityBehavior = java.util.Objects.requireNonNull(cardinalityBehavior, "cardinalityBehavior");
      optBits |= OPT_BIT_CARDINALITY_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#cardinalityBehavior() cardinalityBehavior} to cardinalityBehavior.
     * @param cardinalityBehavior The value for cardinalityBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cardinalityBehavior")
    public final Builder cardinalityBehavior(java.util.Optional<? extends com.fhir.code> cardinalityBehavior) {
      checkNotIsSet(cardinalityBehaviorIsSet(), "cardinalityBehavior");
      this.cardinalityBehavior = cardinalityBehavior.orElse(null);
      optBits |= OPT_BIT_CARDINALITY_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(java.util.List<com.fhir.CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#extension() extension} to extension.
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
     * Initializes the optional value {@link RequestGroup_Action#extension() extension} to extension.
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
     * Initializes the optional value {@link RequestGroup_Action#selectionBehavior() selectionBehavior} to selectionBehavior.
     * @param selectionBehavior The value for selectionBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder selectionBehavior(com.fhir.code selectionBehavior) {
      checkNotIsSet(selectionBehaviorIsSet(), "selectionBehavior");
      this.selectionBehavior = java.util.Objects.requireNonNull(selectionBehavior, "selectionBehavior");
      optBits |= OPT_BIT_SELECTION_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#selectionBehavior() selectionBehavior} to selectionBehavior.
     * @param selectionBehavior The value for selectionBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selectionBehavior")
    public final Builder selectionBehavior(java.util.Optional<? extends com.fhir.code> selectionBehavior) {
      checkNotIsSet(selectionBehaviorIsSet(), "selectionBehavior");
      this.selectionBehavior = selectionBehavior.orElse(null);
      optBits |= OPT_BIT_SELECTION_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingDateTime(java.lang.String timingDateTime) {
      checkNotIsSet(timingDateTimeIsSet(), "timingDateTime");
      this.timingDateTime = java.util.Objects.requireNonNull(timingDateTime, "timingDateTime");
      optBits |= OPT_BIT_TIMING_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingDateTime")
    public final Builder timingDateTime(java.util.Optional<java.lang.String> timingDateTime) {
      checkNotIsSet(timingDateTimeIsSet(), "timingDateTime");
      this.timingDateTime = timingDateTime.orElse(null);
      optBits |= OPT_BIT_TIMING_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(java.lang.String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = java.util.Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public final Builder title(java.util.Optional<java.lang.String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#prefix() prefix} to prefix.
     * @param prefix The value for prefix
     * @return {@code this} builder for chained invocation
     */
    public final Builder prefix(java.lang.String prefix) {
      checkNotIsSet(prefixIsSet(), "prefix");
      this.prefix = java.util.Objects.requireNonNull(prefix, "prefix");
      optBits |= OPT_BIT_PREFIX;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#prefix() prefix} to prefix.
     * @param prefix The value for prefix
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    public final Builder prefix(java.util.Optional<java.lang.String> prefix) {
      checkNotIsSet(prefixIsSet(), "prefix");
      this.prefix = prefix.orElse(null);
      optBits |= OPT_BIT_PREFIX;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingTiming(com.fhir.Timing timingTiming) {
      checkNotIsSet(timingTimingIsSet(), "timingTiming");
      this.timingTiming = java.util.Objects.requireNonNull(timingTiming, "timingTiming");
      optBits |= OPT_BIT_TIMING_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingTiming")
    public final Builder timingTiming(java.util.Optional<? extends com.fhir.Timing> timingTiming) {
      checkNotIsSet(timingTimingIsSet(), "timingTiming");
      this.timingTiming = timingTiming.orElse(null);
      optBits |= OPT_BIT_TIMING_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#relatedAction() relatedAction} to relatedAction.
     * @param relatedAction The value for relatedAction
     * @return {@code this} builder for chained invocation
     */
    public final Builder relatedAction(java.util.List<com.fhir.RequestGroup_RelatedAction> relatedAction) {
      checkNotIsSet(relatedActionIsSet(), "relatedAction");
      this.relatedAction = java.util.Objects.requireNonNull(relatedAction, "relatedAction");
      optBits |= OPT_BIT_RELATED_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#relatedAction() relatedAction} to relatedAction.
     * @param relatedAction The value for relatedAction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relatedAction")
    public final Builder relatedAction(java.util.Optional<? extends java.util.List<com.fhir.RequestGroup_RelatedAction>> relatedAction) {
      checkNotIsSet(relatedActionIsSet(), "relatedAction");
      this.relatedAction = relatedAction.orElse(null);
      optBits |= OPT_BIT_RELATED_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(com.fhir.Reference resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = java.util.Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public final Builder resource(java.util.Optional<? extends com.fhir.Reference> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentation(java.util.List<com.fhir.RelatedArtifact> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = java.util.Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public final Builder documentation(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = documentation.orElse(null);
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Builds a new {@link RequestGroup_Action RequestGroup_Action}.
     * @return An immutable instance of RequestGroup_Action
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.RequestGroup_Action build() {
      return new ImmutableRequestGroup_Action(
          action,
          textEquivalent,
          timingAge,
          modifierExtension,
          timingRange,
          timingPeriod,
          precheckBehavior,
          requiredBehavior,
          groupingBehavior,
          priority,
          participant,
          id,
          description,
          condition,
          timingDuration,
          cardinalityBehavior,
          code,
          extension,
          selectionBehavior,
          timingDateTime,
          title,
          prefix,
          timingTiming,
          relatedAction,
          resource,
          type,
          documentation);
    }

    private boolean actionIsSet() {
      return (optBits & OPT_BIT_ACTION) != 0;
    }

    private boolean textEquivalentIsSet() {
      return (optBits & OPT_BIT_TEXT_EQUIVALENT) != 0;
    }

    private boolean timingAgeIsSet() {
      return (optBits & OPT_BIT_TIMING_AGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean timingRangeIsSet() {
      return (optBits & OPT_BIT_TIMING_RANGE) != 0;
    }

    private boolean timingPeriodIsSet() {
      return (optBits & OPT_BIT_TIMING_PERIOD) != 0;
    }

    private boolean precheckBehaviorIsSet() {
      return (optBits & OPT_BIT_PRECHECK_BEHAVIOR) != 0;
    }

    private boolean requiredBehaviorIsSet() {
      return (optBits & OPT_BIT_REQUIRED_BEHAVIOR) != 0;
    }

    private boolean groupingBehaviorIsSet() {
      return (optBits & OPT_BIT_GROUPING_BEHAVIOR) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean participantIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private boolean timingDurationIsSet() {
      return (optBits & OPT_BIT_TIMING_DURATION) != 0;
    }

    private boolean cardinalityBehaviorIsSet() {
      return (optBits & OPT_BIT_CARDINALITY_BEHAVIOR) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean selectionBehaviorIsSet() {
      return (optBits & OPT_BIT_SELECTION_BEHAVIOR) != 0;
    }

    private boolean timingDateTimeIsSet() {
      return (optBits & OPT_BIT_TIMING_DATE_TIME) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean prefixIsSet() {
      return (optBits & OPT_BIT_PREFIX) != 0;
    }

    private boolean timingTimingIsSet() {
      return (optBits & OPT_BIT_TIMING_TIMING) != 0;
    }

    private boolean relatedActionIsSet() {
      return (optBits & OPT_BIT_RELATED_ACTION) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of RequestGroup_Action is strict, attribute is already set: ".concat(name));
    }
  }
}
