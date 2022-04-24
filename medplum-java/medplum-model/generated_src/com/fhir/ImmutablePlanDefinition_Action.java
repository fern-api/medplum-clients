//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link PlanDefinition_Action}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePlanDefinition_Action.builder()}.
 */
@org.immutables.value.Generated(from = "PlanDefinition_Action", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePlanDefinition_Action implements com.fhir.PlanDefinition_Action {
  private final @javax.annotation.Nullable com.fhir.Range timingRange;
  private final @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_DynamicValue> dynamicValue;
  private final @javax.annotation.Nullable com.fhir.canonical transform;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_RelatedAction> relatedAction;
  private final @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Participant> participant;
  private final @javax.annotation.Nullable com.fhir.Plandefinition_actionSelectionbehavior selectionBehavior;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> code;
  private final @javax.annotation.Nullable com.fhir.Reference subjectReference;
  private final @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Condition> condition;
  private final @javax.annotation.Nullable java.util.List<com.fhir.TriggerDefinition> trigger;
  private final @javax.annotation.Nullable java.lang.String timingDateTime;
  private final @javax.annotation.Nullable com.fhir.Timing timingTiming;
  private final @javax.annotation.Nullable java.lang.String textEquivalent;
  private final @javax.annotation.Nullable java.util.List<com.fhir.id> goalId;
  private final @javax.annotation.Nullable com.fhir.Plandefinition_actionGroupingbehavior groupingBehavior;
  private final @javax.annotation.Nullable com.fhir.Plandefinition_actionRequiredbehavior requiredBehavior;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> input;
  private final @javax.annotation.Nullable com.fhir.Plandefinition_actionPrecheckbehavior precheckBehavior;
  private final @javax.annotation.Nullable com.fhir.Period timingPeriod;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> output;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code priority;
  private final @javax.annotation.Nullable java.lang.String definitionUri;
  private final @javax.annotation.Nullable com.fhir.Age timingAge;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> documentation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reason;
  private final @javax.annotation.Nullable java.lang.String definitionCanonical;
  private final @javax.annotation.Nullable com.fhir.Plandefinition_actionCardinalitybehavior cardinalityBehavior;
  private final @javax.annotation.Nullable java.lang.String prefix;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.Duration timingDuration;
  private final @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Action> action;

  private ImmutablePlanDefinition_Action(
      @javax.annotation.Nullable com.fhir.Range timingRange,
      @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_DynamicValue> dynamicValue,
      @javax.annotation.Nullable com.fhir.canonical transform,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_RelatedAction> relatedAction,
      @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Participant> participant,
      @javax.annotation.Nullable com.fhir.Plandefinition_actionSelectionbehavior selectionBehavior,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> code,
      @javax.annotation.Nullable com.fhir.Reference subjectReference,
      @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Condition> condition,
      @javax.annotation.Nullable java.util.List<com.fhir.TriggerDefinition> trigger,
      @javax.annotation.Nullable java.lang.String timingDateTime,
      @javax.annotation.Nullable com.fhir.Timing timingTiming,
      @javax.annotation.Nullable java.lang.String textEquivalent,
      @javax.annotation.Nullable java.util.List<com.fhir.id> goalId,
      @javax.annotation.Nullable com.fhir.Plandefinition_actionGroupingbehavior groupingBehavior,
      @javax.annotation.Nullable com.fhir.Plandefinition_actionRequiredbehavior requiredBehavior,
      @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> input,
      @javax.annotation.Nullable com.fhir.Plandefinition_actionPrecheckbehavior precheckBehavior,
      @javax.annotation.Nullable com.fhir.Period timingPeriod,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> output,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code priority,
      @javax.annotation.Nullable java.lang.String definitionUri,
      @javax.annotation.Nullable com.fhir.Age timingAge,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> documentation,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reason,
      @javax.annotation.Nullable java.lang.String definitionCanonical,
      @javax.annotation.Nullable com.fhir.Plandefinition_actionCardinalitybehavior cardinalityBehavior,
      @javax.annotation.Nullable java.lang.String prefix,
      @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept,
      @javax.annotation.Nullable com.fhir.Duration timingDuration,
      @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Action> action) {
    this.timingRange = timingRange;
    this.dynamicValue = dynamicValue;
    this.transform = transform;
    this.modifierExtension = modifierExtension;
    this.relatedAction = relatedAction;
    this.participant = participant;
    this.selectionBehavior = selectionBehavior;
    this.type = type;
    this.id = id;
    this.code = code;
    this.subjectReference = subjectReference;
    this.condition = condition;
    this.trigger = trigger;
    this.timingDateTime = timingDateTime;
    this.timingTiming = timingTiming;
    this.textEquivalent = textEquivalent;
    this.goalId = goalId;
    this.groupingBehavior = groupingBehavior;
    this.requiredBehavior = requiredBehavior;
    this.input = input;
    this.precheckBehavior = precheckBehavior;
    this.timingPeriod = timingPeriod;
    this.title = title;
    this.output = output;
    this.extension = extension;
    this.priority = priority;
    this.definitionUri = definitionUri;
    this.timingAge = timingAge;
    this.description = description;
    this.documentation = documentation;
    this.reason = reason;
    this.definitionCanonical = definitionCanonical;
    this.cardinalityBehavior = cardinalityBehavior;
    this.prefix = prefix;
    this.subjectCodeableConcept = subjectCodeableConcept;
    this.timingDuration = timingDuration;
    this.action = action;
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
   * @return The value of the {@code dynamicValue} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dynamicValue")
  @Override
  public java.util.Optional<java.util.List<com.fhir.PlanDefinition_DynamicValue>> dynamicValue() {
    return java.util.Optional.ofNullable(dynamicValue);
  }

  /**
   * @return The value of the {@code transform} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("transform")
  @Override
  public java.util.Optional<com.fhir.canonical> transform() {
    return java.util.Optional.ofNullable(transform);
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
   * @return The value of the {@code relatedAction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relatedAction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.PlanDefinition_RelatedAction>> relatedAction() {
    return java.util.Optional.ofNullable(relatedAction);
  }

  /**
   * @return The value of the {@code participant} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("participant")
  @Override
  public java.util.Optional<java.util.List<com.fhir.PlanDefinition_Participant>> participant() {
    return java.util.Optional.ofNullable(participant);
  }

  /**
   * @return The value of the {@code selectionBehavior} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("selectionBehavior")
  @Override
  public java.util.Optional<com.fhir.Plandefinition_actionSelectionbehavior> selectionBehavior() {
    return java.util.Optional.ofNullable(selectionBehavior);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code subjectReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subjectReference")
  @Override
  public java.util.Optional<com.fhir.Reference> subjectReference() {
    return java.util.Optional.ofNullable(subjectReference);
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("condition")
  @Override
  public java.util.Optional<java.util.List<com.fhir.PlanDefinition_Condition>> condition() {
    return java.util.Optional.ofNullable(condition);
  }

  /**
   * @return The value of the {@code trigger} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("trigger")
  @Override
  public java.util.Optional<java.util.List<com.fhir.TriggerDefinition>> trigger() {
    return java.util.Optional.ofNullable(trigger);
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
   * @return The value of the {@code timingTiming} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingTiming")
  @Override
  public java.util.Optional<com.fhir.Timing> timingTiming() {
    return java.util.Optional.ofNullable(timingTiming);
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
   * @return The value of the {@code goalId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("goalId")
  @Override
  public java.util.Optional<java.util.List<com.fhir.id>> goalId() {
    return java.util.Optional.ofNullable(goalId);
  }

  /**
   * @return The value of the {@code groupingBehavior} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("groupingBehavior")
  @Override
  public java.util.Optional<com.fhir.Plandefinition_actionGroupingbehavior> groupingBehavior() {
    return java.util.Optional.ofNullable(groupingBehavior);
  }

  /**
   * @return The value of the {@code requiredBehavior} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requiredBehavior")
  @Override
  public java.util.Optional<com.fhir.Plandefinition_actionRequiredbehavior> requiredBehavior() {
    return java.util.Optional.ofNullable(requiredBehavior);
  }

  /**
   * @return The value of the {@code input} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("input")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DataRequirement>> input() {
    return java.util.Optional.ofNullable(input);
  }

  /**
   * @return The value of the {@code precheckBehavior} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("precheckBehavior")
  @Override
  public java.util.Optional<com.fhir.Plandefinition_actionPrecheckbehavior> precheckBehavior() {
    return java.util.Optional.ofNullable(precheckBehavior);
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
   * @return The value of the {@code title} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  @Override
  public java.util.Optional<java.lang.String> title() {
    return java.util.Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code output} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("output")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DataRequirement>> output() {
    return java.util.Optional.ofNullable(output);
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
   * @return The value of the {@code priority} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priority")
  @Override
  public java.util.Optional<com.fhir.code> priority() {
    return java.util.Optional.ofNullable(priority);
  }

  /**
   * @return The value of the {@code definitionUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("definitionUri")
  @Override
  public java.util.Optional<java.lang.String> definitionUri() {
    return java.util.Optional.ofNullable(definitionUri);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code reason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reason")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reason() {
    return java.util.Optional.ofNullable(reason);
  }

  /**
   * @return The value of the {@code definitionCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("definitionCanonical")
  @Override
  public java.util.Optional<java.lang.String> definitionCanonical() {
    return java.util.Optional.ofNullable(definitionCanonical);
  }

  /**
   * @return The value of the {@code cardinalityBehavior} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("cardinalityBehavior")
  @Override
  public java.util.Optional<com.fhir.Plandefinition_actionCardinalitybehavior> cardinalityBehavior() {
    return java.util.Optional.ofNullable(cardinalityBehavior);
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
   * @return The value of the {@code subjectCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subjectCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept() {
    return java.util.Optional.ofNullable(subjectCodeableConcept);
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
   * @return The value of the {@code action} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("action")
  @Override
  public java.util.Optional<java.util.List<com.fhir.PlanDefinition_Action>> action() {
    return java.util.Optional.ofNullable(action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#timingRange() timingRange} attribute.
   * @param value The value for timingRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTimingRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "timingRange");
    if (this.timingRange == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        newValue,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#timingRange() timingRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withTimingRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.timingRange == value) return this;
    return new ImmutablePlanDefinition_Action(
        value,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#dynamicValue() dynamicValue} attribute.
   * @param value The value for dynamicValue
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withDynamicValue(java.util.List<com.fhir.PlanDefinition_DynamicValue> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_DynamicValue> newValue = java.util.Objects.requireNonNull(value, "dynamicValue");
    if (this.dynamicValue == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        newValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#dynamicValue() dynamicValue} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dynamicValue
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withDynamicValue(java.util.Optional<? extends java.util.List<com.fhir.PlanDefinition_DynamicValue>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_DynamicValue> value = optional.orElse(null);
    if (this.dynamicValue == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        value,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#transform() transform} attribute.
   * @param value The value for transform
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTransform(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "transform");
    if (this.transform == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        newValue,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#transform() transform} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for transform
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withTransform(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.transform == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        value,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        newValue,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        value,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#relatedAction() relatedAction} attribute.
   * @param value The value for relatedAction
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withRelatedAction(java.util.List<com.fhir.PlanDefinition_RelatedAction> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_RelatedAction> newValue = java.util.Objects.requireNonNull(value, "relatedAction");
    if (this.relatedAction == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        newValue,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#relatedAction() relatedAction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedAction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withRelatedAction(java.util.Optional<? extends java.util.List<com.fhir.PlanDefinition_RelatedAction>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_RelatedAction> value = optional.orElse(null);
    if (this.relatedAction == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        value,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#participant() participant} attribute.
   * @param value The value for participant
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withParticipant(java.util.List<com.fhir.PlanDefinition_Participant> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Participant> newValue = java.util.Objects.requireNonNull(value, "participant");
    if (this.participant == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        newValue,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#participant() participant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withParticipant(java.util.Optional<? extends java.util.List<com.fhir.PlanDefinition_Participant>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Participant> value = optional.orElse(null);
    if (this.participant == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        value,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#selectionBehavior() selectionBehavior} attribute.
   * @param value The value for selectionBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withSelectionBehavior(com.fhir.Plandefinition_actionSelectionbehavior value) {
    @javax.annotation.Nullable com.fhir.Plandefinition_actionSelectionbehavior newValue = java.util.Objects.requireNonNull(value, "selectionBehavior");
    if (this.selectionBehavior == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        newValue,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#selectionBehavior() selectionBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for selectionBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withSelectionBehavior(java.util.Optional<? extends com.fhir.Plandefinition_actionSelectionbehavior> optional) {
    @javax.annotation.Nullable com.fhir.Plandefinition_actionSelectionbehavior value = optional.orElse(null);
    if (this.selectionBehavior == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        value,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        newValue,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        value,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        newValue,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        value,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        newValue,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        value,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#subjectReference() subjectReference} attribute.
   * @param value The value for subjectReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withSubjectReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subjectReference");
    if (this.subjectReference == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        newValue,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#subjectReference() subjectReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withSubjectReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subjectReference == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        value,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withCondition(java.util.List<com.fhir.PlanDefinition_Condition> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Condition> newValue = java.util.Objects.requireNonNull(value, "condition");
    if (this.condition == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        newValue,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#condition() condition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withCondition(java.util.Optional<? extends java.util.List<com.fhir.PlanDefinition_Condition>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Condition> value = optional.orElse(null);
    if (this.condition == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        value,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#trigger() trigger} attribute.
   * @param value The value for trigger
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTrigger(java.util.List<com.fhir.TriggerDefinition> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.TriggerDefinition> newValue = java.util.Objects.requireNonNull(value, "trigger");
    if (this.trigger == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        newValue,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#trigger() trigger} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for trigger
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withTrigger(java.util.Optional<? extends java.util.List<com.fhir.TriggerDefinition>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.TriggerDefinition> value = optional.orElse(null);
    if (this.trigger == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        value,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#timingDateTime() timingDateTime} attribute.
   * @param value The value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTimingDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "timingDateTime");
    if (java.util.Objects.equals(this.timingDateTime, newValue)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        newValue,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#timingDateTime() timingDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTimingDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.timingDateTime, value)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        value,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#timingTiming() timingTiming} attribute.
   * @param value The value for timingTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTimingTiming(com.fhir.Timing value) {
    @javax.annotation.Nullable com.fhir.Timing newValue = java.util.Objects.requireNonNull(value, "timingTiming");
    if (this.timingTiming == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        newValue,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#timingTiming() timingTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withTimingTiming(java.util.Optional<? extends com.fhir.Timing> optional) {
    @javax.annotation.Nullable com.fhir.Timing value = optional.orElse(null);
    if (this.timingTiming == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        value,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#textEquivalent() textEquivalent} attribute.
   * @param value The value for textEquivalent
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTextEquivalent(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "textEquivalent");
    if (java.util.Objects.equals(this.textEquivalent, newValue)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        newValue,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#textEquivalent() textEquivalent} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for textEquivalent
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTextEquivalent(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.textEquivalent, value)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        value,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#goalId() goalId} attribute.
   * @param value The value for goalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withGoalId(java.util.List<com.fhir.id> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.id> newValue = java.util.Objects.requireNonNull(value, "goalId");
    if (this.goalId == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        newValue,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#goalId() goalId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for goalId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withGoalId(java.util.Optional<? extends java.util.List<com.fhir.id>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.id> value = optional.orElse(null);
    if (this.goalId == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        value,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#groupingBehavior() groupingBehavior} attribute.
   * @param value The value for groupingBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withGroupingBehavior(com.fhir.Plandefinition_actionGroupingbehavior value) {
    @javax.annotation.Nullable com.fhir.Plandefinition_actionGroupingbehavior newValue = java.util.Objects.requireNonNull(value, "groupingBehavior");
    if (this.groupingBehavior == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        newValue,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#groupingBehavior() groupingBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupingBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withGroupingBehavior(java.util.Optional<? extends com.fhir.Plandefinition_actionGroupingbehavior> optional) {
    @javax.annotation.Nullable com.fhir.Plandefinition_actionGroupingbehavior value = optional.orElse(null);
    if (this.groupingBehavior == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        value,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#requiredBehavior() requiredBehavior} attribute.
   * @param value The value for requiredBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withRequiredBehavior(com.fhir.Plandefinition_actionRequiredbehavior value) {
    @javax.annotation.Nullable com.fhir.Plandefinition_actionRequiredbehavior newValue = java.util.Objects.requireNonNull(value, "requiredBehavior");
    if (this.requiredBehavior == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        newValue,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#requiredBehavior() requiredBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requiredBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withRequiredBehavior(java.util.Optional<? extends com.fhir.Plandefinition_actionRequiredbehavior> optional) {
    @javax.annotation.Nullable com.fhir.Plandefinition_actionRequiredbehavior value = optional.orElse(null);
    if (this.requiredBehavior == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        value,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#input() input} attribute.
   * @param value The value for input
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withInput(java.util.List<com.fhir.DataRequirement> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> newValue = java.util.Objects.requireNonNull(value, "input");
    if (this.input == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        newValue,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#input() input} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for input
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withInput(java.util.Optional<? extends java.util.List<com.fhir.DataRequirement>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> value = optional.orElse(null);
    if (this.input == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        value,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#precheckBehavior() precheckBehavior} attribute.
   * @param value The value for precheckBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withPrecheckBehavior(com.fhir.Plandefinition_actionPrecheckbehavior value) {
    @javax.annotation.Nullable com.fhir.Plandefinition_actionPrecheckbehavior newValue = java.util.Objects.requireNonNull(value, "precheckBehavior");
    if (this.precheckBehavior == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        newValue,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#precheckBehavior() precheckBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for precheckBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withPrecheckBehavior(java.util.Optional<? extends com.fhir.Plandefinition_actionPrecheckbehavior> optional) {
    @javax.annotation.Nullable com.fhir.Plandefinition_actionPrecheckbehavior value = optional.orElse(null);
    if (this.precheckBehavior == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        value,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#timingPeriod() timingPeriod} attribute.
   * @param value The value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTimingPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "timingPeriod");
    if (this.timingPeriod == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        newValue,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#timingPeriod() timingPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withTimingPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.timingPeriod == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        value,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        newValue,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        value,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#output() output} attribute.
   * @param value The value for output
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withOutput(java.util.List<com.fhir.DataRequirement> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> newValue = java.util.Objects.requireNonNull(value, "output");
    if (this.output == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        newValue,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#output() output} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for output
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withOutput(java.util.Optional<? extends java.util.List<com.fhir.DataRequirement>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> value = optional.orElse(null);
    if (this.output == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        value,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        newValue,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        value,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withPriority(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        newValue,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withPriority(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        value,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#definitionUri() definitionUri} attribute.
   * @param value The value for definitionUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withDefinitionUri(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "definitionUri");
    if (java.util.Objects.equals(this.definitionUri, newValue)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        newValue,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#definitionUri() definitionUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withDefinitionUri(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.definitionUri, value)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        value,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#timingAge() timingAge} attribute.
   * @param value The value for timingAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTimingAge(com.fhir.Age value) {
    @javax.annotation.Nullable com.fhir.Age newValue = java.util.Objects.requireNonNull(value, "timingAge");
    if (this.timingAge == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        newValue,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#timingAge() timingAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withTimingAge(java.util.Optional<? extends com.fhir.Age> optional) {
    @javax.annotation.Nullable com.fhir.Age value = optional.orElse(null);
    if (this.timingAge == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        value,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        newValue,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        value,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withDocumentation(java.util.List<com.fhir.RelatedArtifact> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> newValue = java.util.Objects.requireNonNull(value, "documentation");
    if (this.documentation == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        newValue,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#documentation() documentation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withDocumentation(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> value = optional.orElse(null);
    if (this.documentation == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        value,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withReason(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        newValue,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        value,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#definitionCanonical() definitionCanonical} attribute.
   * @param value The value for definitionCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withDefinitionCanonical(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "definitionCanonical");
    if (java.util.Objects.equals(this.definitionCanonical, newValue)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        newValue,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#definitionCanonical() definitionCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withDefinitionCanonical(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.definitionCanonical, value)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        value,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#cardinalityBehavior() cardinalityBehavior} attribute.
   * @param value The value for cardinalityBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withCardinalityBehavior(com.fhir.Plandefinition_actionCardinalitybehavior value) {
    @javax.annotation.Nullable com.fhir.Plandefinition_actionCardinalitybehavior newValue = java.util.Objects.requireNonNull(value, "cardinalityBehavior");
    if (this.cardinalityBehavior == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        newValue,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#cardinalityBehavior() cardinalityBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cardinalityBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withCardinalityBehavior(java.util.Optional<? extends com.fhir.Plandefinition_actionCardinalitybehavior> optional) {
    @javax.annotation.Nullable com.fhir.Plandefinition_actionCardinalitybehavior value = optional.orElse(null);
    if (this.cardinalityBehavior == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        value,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#prefix() prefix} attribute.
   * @param value The value for prefix
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withPrefix(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "prefix");
    if (java.util.Objects.equals(this.prefix, newValue)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        newValue,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#prefix() prefix} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prefix
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withPrefix(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.prefix, value)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        value,
        this.subjectCodeableConcept,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * @param value The value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withSubjectCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "subjectCodeableConcept");
    if (this.subjectCodeableConcept == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        newValue,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withSubjectCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.subjectCodeableConcept == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        value,
        this.timingDuration,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#timingDuration() timingDuration} attribute.
   * @param value The value for timingDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTimingDuration(com.fhir.Duration value) {
    @javax.annotation.Nullable com.fhir.Duration newValue = java.util.Objects.requireNonNull(value, "timingDuration");
    if (this.timingDuration == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        newValue,
        this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#timingDuration() timingDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withTimingDuration(java.util.Optional<? extends com.fhir.Duration> optional) {
    @javax.annotation.Nullable com.fhir.Duration value = optional.orElse(null);
    if (this.timingDuration == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        value,
        this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#action() action} attribute.
   * @param value The value for action
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withAction(java.util.List<com.fhir.PlanDefinition_Action> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Action> newValue = java.util.Objects.requireNonNull(value, "action");
    if (this.action == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#action() action} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for action
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withAction(java.util.Optional<? extends java.util.List<com.fhir.PlanDefinition_Action>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Action> value = optional.orElse(null);
    if (this.action == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.dynamicValue,
        this.transform,
        this.modifierExtension,
        this.relatedAction,
        this.participant,
        this.selectionBehavior,
        this.type,
        this.id,
        this.code,
        this.subjectReference,
        this.condition,
        this.trigger,
        this.timingDateTime,
        this.timingTiming,
        this.textEquivalent,
        this.goalId,
        this.groupingBehavior,
        this.requiredBehavior,
        this.input,
        this.precheckBehavior,
        this.timingPeriod,
        this.title,
        this.output,
        this.extension,
        this.priority,
        this.definitionUri,
        this.timingAge,
        this.description,
        this.documentation,
        this.reason,
        this.definitionCanonical,
        this.cardinalityBehavior,
        this.prefix,
        this.subjectCodeableConcept,
        this.timingDuration,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePlanDefinition_Action} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePlanDefinition_Action
        && equalTo((ImmutablePlanDefinition_Action) another);
  }

  private boolean equalTo(ImmutablePlanDefinition_Action another) {
    return java.util.Objects.equals(timingRange, another.timingRange)
        && java.util.Objects.equals(dynamicValue, another.dynamicValue)
        && java.util.Objects.equals(transform, another.transform)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(relatedAction, another.relatedAction)
        && java.util.Objects.equals(participant, another.participant)
        && java.util.Objects.equals(selectionBehavior, another.selectionBehavior)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(subjectReference, another.subjectReference)
        && java.util.Objects.equals(condition, another.condition)
        && java.util.Objects.equals(trigger, another.trigger)
        && java.util.Objects.equals(timingDateTime, another.timingDateTime)
        && java.util.Objects.equals(timingTiming, another.timingTiming)
        && java.util.Objects.equals(textEquivalent, another.textEquivalent)
        && java.util.Objects.equals(goalId, another.goalId)
        && java.util.Objects.equals(groupingBehavior, another.groupingBehavior)
        && java.util.Objects.equals(requiredBehavior, another.requiredBehavior)
        && java.util.Objects.equals(input, another.input)
        && java.util.Objects.equals(precheckBehavior, another.precheckBehavior)
        && java.util.Objects.equals(timingPeriod, another.timingPeriod)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(output, another.output)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(priority, another.priority)
        && java.util.Objects.equals(definitionUri, another.definitionUri)
        && java.util.Objects.equals(timingAge, another.timingAge)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(documentation, another.documentation)
        && java.util.Objects.equals(reason, another.reason)
        && java.util.Objects.equals(definitionCanonical, another.definitionCanonical)
        && java.util.Objects.equals(cardinalityBehavior, another.cardinalityBehavior)
        && java.util.Objects.equals(prefix, another.prefix)
        && java.util.Objects.equals(subjectCodeableConcept, another.subjectCodeableConcept)
        && java.util.Objects.equals(timingDuration, another.timingDuration)
        && java.util.Objects.equals(action, another.action);
  }

  /**
   * Computes a hash code from attributes: {@code timingRange}, {@code dynamicValue}, {@code transform}, {@code modifierExtension}, {@code relatedAction}, {@code participant}, {@code selectionBehavior}, {@code type}, {@code id}, {@code code}, {@code subjectReference}, {@code condition}, {@code trigger}, {@code timingDateTime}, {@code timingTiming}, {@code textEquivalent}, {@code goalId}, {@code groupingBehavior}, {@code requiredBehavior}, {@code input}, {@code precheckBehavior}, {@code timingPeriod}, {@code title}, {@code output}, {@code extension}, {@code priority}, {@code definitionUri}, {@code timingAge}, {@code description}, {@code documentation}, {@code reason}, {@code definitionCanonical}, {@code cardinalityBehavior}, {@code prefix}, {@code subjectCodeableConcept}, {@code timingDuration}, {@code action}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(timingRange);
    h += (h << 5) + java.util.Objects.hashCode(dynamicValue);
    h += (h << 5) + java.util.Objects.hashCode(transform);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(relatedAction);
    h += (h << 5) + java.util.Objects.hashCode(participant);
    h += (h << 5) + java.util.Objects.hashCode(selectionBehavior);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(subjectReference);
    h += (h << 5) + java.util.Objects.hashCode(condition);
    h += (h << 5) + java.util.Objects.hashCode(trigger);
    h += (h << 5) + java.util.Objects.hashCode(timingDateTime);
    h += (h << 5) + java.util.Objects.hashCode(timingTiming);
    h += (h << 5) + java.util.Objects.hashCode(textEquivalent);
    h += (h << 5) + java.util.Objects.hashCode(goalId);
    h += (h << 5) + java.util.Objects.hashCode(groupingBehavior);
    h += (h << 5) + java.util.Objects.hashCode(requiredBehavior);
    h += (h << 5) + java.util.Objects.hashCode(input);
    h += (h << 5) + java.util.Objects.hashCode(precheckBehavior);
    h += (h << 5) + java.util.Objects.hashCode(timingPeriod);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(output);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(priority);
    h += (h << 5) + java.util.Objects.hashCode(definitionUri);
    h += (h << 5) + java.util.Objects.hashCode(timingAge);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(documentation);
    h += (h << 5) + java.util.Objects.hashCode(reason);
    h += (h << 5) + java.util.Objects.hashCode(definitionCanonical);
    h += (h << 5) + java.util.Objects.hashCode(cardinalityBehavior);
    h += (h << 5) + java.util.Objects.hashCode(prefix);
    h += (h << 5) + java.util.Objects.hashCode(subjectCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(timingDuration);
    h += (h << 5) + java.util.Objects.hashCode(action);
    return h;
  }

  /**
   * Prints the immutable value {@code PlanDefinition_Action} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("PlanDefinition_Action{");
    if (timingRange != null) {
      builder.append("timingRange=").append(timingRange);
    }
    if (dynamicValue != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("dynamicValue=").append(dynamicValue);
    }
    if (transform != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("transform=").append(transform);
    }
    if (modifierExtension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (relatedAction != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("relatedAction=").append(relatedAction);
    }
    if (participant != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("participant=").append(participant);
    }
    if (selectionBehavior != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("selectionBehavior=").append(selectionBehavior);
    }
    if (type != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (code != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (subjectReference != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("subjectReference=").append(subjectReference);
    }
    if (condition != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("condition=").append(condition);
    }
    if (trigger != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("trigger=").append(trigger);
    }
    if (timingDateTime != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("timingDateTime=").append(timingDateTime);
    }
    if (timingTiming != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("timingTiming=").append(timingTiming);
    }
    if (textEquivalent != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("textEquivalent=").append(textEquivalent);
    }
    if (goalId != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("goalId=").append(goalId);
    }
    if (groupingBehavior != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("groupingBehavior=").append(groupingBehavior);
    }
    if (requiredBehavior != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("requiredBehavior=").append(requiredBehavior);
    }
    if (input != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("input=").append(input);
    }
    if (precheckBehavior != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("precheckBehavior=").append(precheckBehavior);
    }
    if (timingPeriod != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("timingPeriod=").append(timingPeriod);
    }
    if (title != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (output != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("output=").append(output);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (priority != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (definitionUri != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("definitionUri=").append(definitionUri);
    }
    if (timingAge != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("timingAge=").append(timingAge);
    }
    if (description != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (documentation != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (reason != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("reason=").append(reason);
    }
    if (definitionCanonical != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("definitionCanonical=").append(definitionCanonical);
    }
    if (cardinalityBehavior != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("cardinalityBehavior=").append(cardinalityBehavior);
    }
    if (prefix != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("prefix=").append(prefix);
    }
    if (subjectCodeableConcept != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("subjectCodeableConcept=").append(subjectCodeableConcept);
    }
    if (timingDuration != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("timingDuration=").append(timingDuration);
    }
    if (action != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("action=").append(action);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "PlanDefinition_Action", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.PlanDefinition_Action {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> timingRange = java.util.Optional.empty();
    boolean timingRangeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.PlanDefinition_DynamicValue>> dynamicValue = java.util.Optional.empty();
    boolean dynamicValueIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> transform = java.util.Optional.empty();
    boolean transformIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.PlanDefinition_RelatedAction>> relatedAction = java.util.Optional.empty();
    boolean relatedActionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.PlanDefinition_Participant>> participant = java.util.Optional.empty();
    boolean participantIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Plandefinition_actionSelectionbehavior> selectionBehavior = java.util.Optional.empty();
    boolean selectionBehaviorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subjectReference = java.util.Optional.empty();
    boolean subjectReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.PlanDefinition_Condition>> condition = java.util.Optional.empty();
    boolean conditionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.TriggerDefinition>> trigger = java.util.Optional.empty();
    boolean triggerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> timingDateTime = java.util.Optional.empty();
    boolean timingDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing> timingTiming = java.util.Optional.empty();
    boolean timingTimingIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> textEquivalent = java.util.Optional.empty();
    boolean textEquivalentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.id>> goalId = java.util.Optional.empty();
    boolean goalIdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Plandefinition_actionGroupingbehavior> groupingBehavior = java.util.Optional.empty();
    boolean groupingBehaviorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Plandefinition_actionRequiredbehavior> requiredBehavior = java.util.Optional.empty();
    boolean requiredBehaviorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DataRequirement>> input = java.util.Optional.empty();
    boolean inputIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Plandefinition_actionPrecheckbehavior> precheckBehavior = java.util.Optional.empty();
    boolean precheckBehaviorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> timingPeriod = java.util.Optional.empty();
    boolean timingPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DataRequirement>> output = java.util.Optional.empty();
    boolean outputIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> priority = java.util.Optional.empty();
    boolean priorityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> definitionUri = java.util.Optional.empty();
    boolean definitionUriIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Age> timingAge = java.util.Optional.empty();
    boolean timingAgeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> documentation = java.util.Optional.empty();
    boolean documentationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reason = java.util.Optional.empty();
    boolean reasonIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> definitionCanonical = java.util.Optional.empty();
    boolean definitionCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Plandefinition_actionCardinalitybehavior> cardinalityBehavior = java.util.Optional.empty();
    boolean cardinalityBehaviorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> prefix = java.util.Optional.empty();
    boolean prefixIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept = java.util.Optional.empty();
    boolean subjectCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Duration> timingDuration = java.util.Optional.empty();
    boolean timingDurationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.PlanDefinition_Action>> action = java.util.Optional.empty();
    boolean actionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("timingRange")
    public void setTimingRange(java.util.Optional<com.fhir.Range> timingRange) {
      this.timingRange = timingRange;
      this.timingRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dynamicValue")
    public void setDynamicValue(java.util.Optional<java.util.List<com.fhir.PlanDefinition_DynamicValue>> dynamicValue) {
      this.dynamicValue = dynamicValue;
      this.dynamicValueIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("transform")
    public void setTransform(java.util.Optional<com.fhir.canonical> transform) {
      this.transform = transform;
      this.transformIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relatedAction")
    public void setRelatedAction(java.util.Optional<java.util.List<com.fhir.PlanDefinition_RelatedAction>> relatedAction) {
      this.relatedAction = relatedAction;
      this.relatedActionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("participant")
    public void setParticipant(java.util.Optional<java.util.List<com.fhir.PlanDefinition_Participant>> participant) {
      this.participant = participant;
      this.participantIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("selectionBehavior")
    public void setSelectionBehavior(java.util.Optional<com.fhir.Plandefinition_actionSelectionbehavior> selectionBehavior) {
      this.selectionBehavior = selectionBehavior;
      this.selectionBehaviorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subjectReference")
    public void setSubjectReference(java.util.Optional<com.fhir.Reference> subjectReference) {
      this.subjectReference = subjectReference;
      this.subjectReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    public void setCondition(java.util.Optional<java.util.List<com.fhir.PlanDefinition_Condition>> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("trigger")
    public void setTrigger(java.util.Optional<java.util.List<com.fhir.TriggerDefinition>> trigger) {
      this.trigger = trigger;
      this.triggerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingDateTime")
    public void setTimingDateTime(java.util.Optional<java.lang.String> timingDateTime) {
      this.timingDateTime = timingDateTime;
      this.timingDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingTiming")
    public void setTimingTiming(java.util.Optional<com.fhir.Timing> timingTiming) {
      this.timingTiming = timingTiming;
      this.timingTimingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("textEquivalent")
    public void setTextEquivalent(java.util.Optional<java.lang.String> textEquivalent) {
      this.textEquivalent = textEquivalent;
      this.textEquivalentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("goalId")
    public void setGoalId(java.util.Optional<java.util.List<com.fhir.id>> goalId) {
      this.goalId = goalId;
      this.goalIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("groupingBehavior")
    public void setGroupingBehavior(java.util.Optional<com.fhir.Plandefinition_actionGroupingbehavior> groupingBehavior) {
      this.groupingBehavior = groupingBehavior;
      this.groupingBehaviorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requiredBehavior")
    public void setRequiredBehavior(java.util.Optional<com.fhir.Plandefinition_actionRequiredbehavior> requiredBehavior) {
      this.requiredBehavior = requiredBehavior;
      this.requiredBehaviorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("input")
    public void setInput(java.util.Optional<java.util.List<com.fhir.DataRequirement>> input) {
      this.input = input;
      this.inputIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("precheckBehavior")
    public void setPrecheckBehavior(java.util.Optional<com.fhir.Plandefinition_actionPrecheckbehavior> precheckBehavior) {
      this.precheckBehavior = precheckBehavior;
      this.precheckBehaviorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingPeriod")
    public void setTimingPeriod(java.util.Optional<com.fhir.Period> timingPeriod) {
      this.timingPeriod = timingPeriod;
      this.timingPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("output")
    public void setOutput(java.util.Optional<java.util.List<com.fhir.DataRequirement>> output) {
      this.output = output;
      this.outputIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(java.util.Optional<com.fhir.code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("definitionUri")
    public void setDefinitionUri(java.util.Optional<java.lang.String> definitionUri) {
      this.definitionUri = definitionUri;
      this.definitionUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingAge")
    public void setTimingAge(java.util.Optional<com.fhir.Age> timingAge) {
      this.timingAge = timingAge;
      this.timingAgeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public void setDocumentation(java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("definitionCanonical")
    public void setDefinitionCanonical(java.util.Optional<java.lang.String> definitionCanonical) {
      this.definitionCanonical = definitionCanonical;
      this.definitionCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("cardinalityBehavior")
    public void setCardinalityBehavior(java.util.Optional<com.fhir.Plandefinition_actionCardinalitybehavior> cardinalityBehavior) {
      this.cardinalityBehavior = cardinalityBehavior;
      this.cardinalityBehaviorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    public void setPrefix(java.util.Optional<java.lang.String> prefix) {
      this.prefix = prefix;
      this.prefixIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subjectCodeableConcept")
    public void setSubjectCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept) {
      this.subjectCodeableConcept = subjectCodeableConcept;
      this.subjectCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingDuration")
    public void setTimingDuration(java.util.Optional<com.fhir.Duration> timingDuration) {
      this.timingDuration = timingDuration;
      this.timingDurationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    public void setAction(java.util.Optional<java.util.List<com.fhir.PlanDefinition_Action>> action) {
      this.action = action;
      this.actionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Range> timingRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.PlanDefinition_DynamicValue>> dynamicValue() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> transform() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.PlanDefinition_RelatedAction>> relatedAction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.PlanDefinition_Participant>> participant() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Plandefinition_actionSelectionbehavior> selectionBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subjectReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.PlanDefinition_Condition>> condition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.TriggerDefinition>> trigger() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> timingDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Timing> timingTiming() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> textEquivalent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.id>> goalId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Plandefinition_actionGroupingbehavior> groupingBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Plandefinition_actionRequiredbehavior> requiredBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DataRequirement>> input() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Plandefinition_actionPrecheckbehavior> precheckBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> timingPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DataRequirement>> output() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> definitionUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Age> timingAge() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> definitionCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Plandefinition_actionCardinalitybehavior> cardinalityBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> prefix() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Duration> timingDuration() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.PlanDefinition_Action>> action() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutablePlanDefinition_Action fromJson(Json json) {
    ImmutablePlanDefinition_Action.Builder builder = ImmutablePlanDefinition_Action.builder();
    if (json.timingRangeIsSet) {
      builder.timingRange(json.timingRange);
    }
    if (json.dynamicValueIsSet) {
      builder.dynamicValue(json.dynamicValue);
    }
    if (json.transformIsSet) {
      builder.transform(json.transform);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.relatedActionIsSet) {
      builder.relatedAction(json.relatedAction);
    }
    if (json.participantIsSet) {
      builder.participant(json.participant);
    }
    if (json.selectionBehaviorIsSet) {
      builder.selectionBehavior(json.selectionBehavior);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.subjectReferenceIsSet) {
      builder.subjectReference(json.subjectReference);
    }
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    if (json.triggerIsSet) {
      builder.trigger(json.trigger);
    }
    if (json.timingDateTimeIsSet) {
      builder.timingDateTime(json.timingDateTime);
    }
    if (json.timingTimingIsSet) {
      builder.timingTiming(json.timingTiming);
    }
    if (json.textEquivalentIsSet) {
      builder.textEquivalent(json.textEquivalent);
    }
    if (json.goalIdIsSet) {
      builder.goalId(json.goalId);
    }
    if (json.groupingBehaviorIsSet) {
      builder.groupingBehavior(json.groupingBehavior);
    }
    if (json.requiredBehaviorIsSet) {
      builder.requiredBehavior(json.requiredBehavior);
    }
    if (json.inputIsSet) {
      builder.input(json.input);
    }
    if (json.precheckBehaviorIsSet) {
      builder.precheckBehavior(json.precheckBehavior);
    }
    if (json.timingPeriodIsSet) {
      builder.timingPeriod(json.timingPeriod);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.outputIsSet) {
      builder.output(json.output);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.definitionUriIsSet) {
      builder.definitionUri(json.definitionUri);
    }
    if (json.timingAgeIsSet) {
      builder.timingAge(json.timingAge);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.definitionCanonicalIsSet) {
      builder.definitionCanonical(json.definitionCanonical);
    }
    if (json.cardinalityBehaviorIsSet) {
      builder.cardinalityBehavior(json.cardinalityBehavior);
    }
    if (json.prefixIsSet) {
      builder.prefix(json.prefix);
    }
    if (json.subjectCodeableConceptIsSet) {
      builder.subjectCodeableConcept(json.subjectCodeableConcept);
    }
    if (json.timingDurationIsSet) {
      builder.timingDuration(json.timingDuration);
    }
    if (json.actionIsSet) {
      builder.action(json.action);
    }
    return (ImmutablePlanDefinition_Action) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PlanDefinition_Action} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PlanDefinition_Action instance
   */
  public static PlanDefinition_Action copyOf(PlanDefinition_Action instance) {
    if (instance instanceof ImmutablePlanDefinition_Action) {
      return (ImmutablePlanDefinition_Action) instance;
    }
    return ImmutablePlanDefinition_Action.builder()
        .timingRange(instance.timingRange())
        .dynamicValue(instance.dynamicValue())
        .transform(instance.transform())
        .modifierExtension(instance.modifierExtension())
        .relatedAction(instance.relatedAction())
        .participant(instance.participant())
        .selectionBehavior(instance.selectionBehavior())
        .type(instance.type())
        .id(instance.id())
        .code(instance.code())
        .subjectReference(instance.subjectReference())
        .condition(instance.condition())
        .trigger(instance.trigger())
        .timingDateTime(instance.timingDateTime())
        .timingTiming(instance.timingTiming())
        .textEquivalent(instance.textEquivalent())
        .goalId(instance.goalId())
        .groupingBehavior(instance.groupingBehavior())
        .requiredBehavior(instance.requiredBehavior())
        .input(instance.input())
        .precheckBehavior(instance.precheckBehavior())
        .timingPeriod(instance.timingPeriod())
        .title(instance.title())
        .output(instance.output())
        .extension(instance.extension())
        .priority(instance.priority())
        .definitionUri(instance.definitionUri())
        .timingAge(instance.timingAge())
        .description(instance.description())
        .documentation(instance.documentation())
        .reason(instance.reason())
        .definitionCanonical(instance.definitionCanonical())
        .cardinalityBehavior(instance.cardinalityBehavior())
        .prefix(instance.prefix())
        .subjectCodeableConcept(instance.subjectCodeableConcept())
        .timingDuration(instance.timingDuration())
        .action(instance.action())
        .build();
  }

  /**
   * Creates a builder for {@link PlanDefinition_Action PlanDefinition_Action}.
   * <pre>
   * ImmutablePlanDefinition_Action.builder()
   *    .timingRange(com.fhir.Range) // optional {@link PlanDefinition_Action#timingRange() timingRange}
   *    .dynamicValue(List&amp;lt;com.fhir.PlanDefinition_DynamicValue&amp;gt;) // optional {@link PlanDefinition_Action#dynamicValue() dynamicValue}
   *    .transform(com.fhir.canonical) // optional {@link PlanDefinition_Action#transform() transform}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link PlanDefinition_Action#modifierExtension() modifierExtension}
   *    .relatedAction(List&amp;lt;com.fhir.PlanDefinition_RelatedAction&amp;gt;) // optional {@link PlanDefinition_Action#relatedAction() relatedAction}
   *    .participant(List&amp;lt;com.fhir.PlanDefinition_Participant&amp;gt;) // optional {@link PlanDefinition_Action#participant() participant}
   *    .selectionBehavior(com.fhir.Plandefinition_actionSelectionbehavior) // optional {@link PlanDefinition_Action#selectionBehavior() selectionBehavior}
   *    .type(com.fhir.CodeableConcept) // optional {@link PlanDefinition_Action#type() type}
   *    .id(String) // optional {@link PlanDefinition_Action#id() id}
   *    .code(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link PlanDefinition_Action#code() code}
   *    .subjectReference(com.fhir.Reference) // optional {@link PlanDefinition_Action#subjectReference() subjectReference}
   *    .condition(List&amp;lt;com.fhir.PlanDefinition_Condition&amp;gt;) // optional {@link PlanDefinition_Action#condition() condition}
   *    .trigger(List&amp;lt;com.fhir.TriggerDefinition&amp;gt;) // optional {@link PlanDefinition_Action#trigger() trigger}
   *    .timingDateTime(String) // optional {@link PlanDefinition_Action#timingDateTime() timingDateTime}
   *    .timingTiming(com.fhir.Timing) // optional {@link PlanDefinition_Action#timingTiming() timingTiming}
   *    .textEquivalent(String) // optional {@link PlanDefinition_Action#textEquivalent() textEquivalent}
   *    .goalId(List&amp;lt;com.fhir.id&amp;gt;) // optional {@link PlanDefinition_Action#goalId() goalId}
   *    .groupingBehavior(com.fhir.Plandefinition_actionGroupingbehavior) // optional {@link PlanDefinition_Action#groupingBehavior() groupingBehavior}
   *    .requiredBehavior(com.fhir.Plandefinition_actionRequiredbehavior) // optional {@link PlanDefinition_Action#requiredBehavior() requiredBehavior}
   *    .input(List&amp;lt;com.fhir.DataRequirement&amp;gt;) // optional {@link PlanDefinition_Action#input() input}
   *    .precheckBehavior(com.fhir.Plandefinition_actionPrecheckbehavior) // optional {@link PlanDefinition_Action#precheckBehavior() precheckBehavior}
   *    .timingPeriod(com.fhir.Period) // optional {@link PlanDefinition_Action#timingPeriod() timingPeriod}
   *    .title(String) // optional {@link PlanDefinition_Action#title() title}
   *    .output(List&amp;lt;com.fhir.DataRequirement&amp;gt;) // optional {@link PlanDefinition_Action#output() output}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link PlanDefinition_Action#extension() extension}
   *    .priority(com.fhir.code) // optional {@link PlanDefinition_Action#priority() priority}
   *    .definitionUri(String) // optional {@link PlanDefinition_Action#definitionUri() definitionUri}
   *    .timingAge(com.fhir.Age) // optional {@link PlanDefinition_Action#timingAge() timingAge}
   *    .description(String) // optional {@link PlanDefinition_Action#description() description}
   *    .documentation(List&amp;lt;com.fhir.RelatedArtifact&amp;gt;) // optional {@link PlanDefinition_Action#documentation() documentation}
   *    .reason(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link PlanDefinition_Action#reason() reason}
   *    .definitionCanonical(String) // optional {@link PlanDefinition_Action#definitionCanonical() definitionCanonical}
   *    .cardinalityBehavior(com.fhir.Plandefinition_actionCardinalitybehavior) // optional {@link PlanDefinition_Action#cardinalityBehavior() cardinalityBehavior}
   *    .prefix(String) // optional {@link PlanDefinition_Action#prefix() prefix}
   *    .subjectCodeableConcept(com.fhir.CodeableConcept) // optional {@link PlanDefinition_Action#subjectCodeableConcept() subjectCodeableConcept}
   *    .timingDuration(com.fhir.Duration) // optional {@link PlanDefinition_Action#timingDuration() timingDuration}
   *    .action(List&amp;lt;com.fhir.PlanDefinition_Action&amp;gt;) // optional {@link PlanDefinition_Action#action() action}
   *    .build();
   * </pre>
   * @return A new PlanDefinition_Action builder
   */
  public static ImmutablePlanDefinition_Action.Builder builder() {
    return new ImmutablePlanDefinition_Action.Builder();
  }

  /**
   * Builds instances of type {@link PlanDefinition_Action PlanDefinition_Action}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "PlanDefinition_Action", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TIMING_RANGE = 0x1L;
    private static final long OPT_BIT_DYNAMIC_VALUE = 0x2L;
    private static final long OPT_BIT_TRANSFORM = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_RELATED_ACTION = 0x10L;
    private static final long OPT_BIT_PARTICIPANT = 0x20L;
    private static final long OPT_BIT_SELECTION_BEHAVIOR = 0x40L;
    private static final long OPT_BIT_TYPE = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_CODE = 0x200L;
    private static final long OPT_BIT_SUBJECT_REFERENCE = 0x400L;
    private static final long OPT_BIT_CONDITION = 0x800L;
    private static final long OPT_BIT_TRIGGER = 0x1000L;
    private static final long OPT_BIT_TIMING_DATE_TIME = 0x2000L;
    private static final long OPT_BIT_TIMING_TIMING = 0x4000L;
    private static final long OPT_BIT_TEXT_EQUIVALENT = 0x8000L;
    private static final long OPT_BIT_GOAL_ID = 0x10000L;
    private static final long OPT_BIT_GROUPING_BEHAVIOR = 0x20000L;
    private static final long OPT_BIT_REQUIRED_BEHAVIOR = 0x40000L;
    private static final long OPT_BIT_INPUT = 0x80000L;
    private static final long OPT_BIT_PRECHECK_BEHAVIOR = 0x100000L;
    private static final long OPT_BIT_TIMING_PERIOD = 0x200000L;
    private static final long OPT_BIT_TITLE = 0x400000L;
    private static final long OPT_BIT_OUTPUT = 0x800000L;
    private static final long OPT_BIT_EXTENSION = 0x1000000L;
    private static final long OPT_BIT_PRIORITY = 0x2000000L;
    private static final long OPT_BIT_DEFINITION_URI = 0x4000000L;
    private static final long OPT_BIT_TIMING_AGE = 0x8000000L;
    private static final long OPT_BIT_DESCRIPTION = 0x10000000L;
    private static final long OPT_BIT_DOCUMENTATION = 0x20000000L;
    private static final long OPT_BIT_REASON = 0x40000000L;
    private static final long OPT_BIT_DEFINITION_CANONICAL = 0x80000000L;
    private static final long OPT_BIT_CARDINALITY_BEHAVIOR = 0x100000000L;
    private static final long OPT_BIT_PREFIX = 0x200000000L;
    private static final long OPT_BIT_SUBJECT_CODEABLE_CONCEPT = 0x400000000L;
    private static final long OPT_BIT_TIMING_DURATION = 0x800000000L;
    private static final long OPT_BIT_ACTION = 0x1000000000L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Range timingRange;
    private @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_DynamicValue> dynamicValue;
    private @javax.annotation.Nullable com.fhir.canonical transform;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_RelatedAction> relatedAction;
    private @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Participant> participant;
    private @javax.annotation.Nullable com.fhir.Plandefinition_actionSelectionbehavior selectionBehavior;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> code;
    private @javax.annotation.Nullable com.fhir.Reference subjectReference;
    private @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Condition> condition;
    private @javax.annotation.Nullable java.util.List<com.fhir.TriggerDefinition> trigger;
    private @javax.annotation.Nullable java.lang.String timingDateTime;
    private @javax.annotation.Nullable com.fhir.Timing timingTiming;
    private @javax.annotation.Nullable java.lang.String textEquivalent;
    private @javax.annotation.Nullable java.util.List<com.fhir.id> goalId;
    private @javax.annotation.Nullable com.fhir.Plandefinition_actionGroupingbehavior groupingBehavior;
    private @javax.annotation.Nullable com.fhir.Plandefinition_actionRequiredbehavior requiredBehavior;
    private @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> input;
    private @javax.annotation.Nullable com.fhir.Plandefinition_actionPrecheckbehavior precheckBehavior;
    private @javax.annotation.Nullable com.fhir.Period timingPeriod;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> output;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code priority;
    private @javax.annotation.Nullable java.lang.String definitionUri;
    private @javax.annotation.Nullable com.fhir.Age timingAge;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> documentation;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reason;
    private @javax.annotation.Nullable java.lang.String definitionCanonical;
    private @javax.annotation.Nullable com.fhir.Plandefinition_actionCardinalitybehavior cardinalityBehavior;
    private @javax.annotation.Nullable java.lang.String prefix;
    private @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept;
    private @javax.annotation.Nullable com.fhir.Duration timingDuration;
    private @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Action> action;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#timingRange() timingRange} to timingRange.
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
     * Initializes the optional value {@link PlanDefinition_Action#timingRange() timingRange} to timingRange.
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
     * Initializes the optional value {@link PlanDefinition_Action#dynamicValue() dynamicValue} to dynamicValue.
     * @param dynamicValue The value for dynamicValue
     * @return {@code this} builder for chained invocation
     */
    public final Builder dynamicValue(java.util.List<com.fhir.PlanDefinition_DynamicValue> dynamicValue) {
      checkNotIsSet(dynamicValueIsSet(), "dynamicValue");
      this.dynamicValue = java.util.Objects.requireNonNull(dynamicValue, "dynamicValue");
      optBits |= OPT_BIT_DYNAMIC_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#dynamicValue() dynamicValue} to dynamicValue.
     * @param dynamicValue The value for dynamicValue
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dynamicValue")
    public final Builder dynamicValue(java.util.Optional<? extends java.util.List<com.fhir.PlanDefinition_DynamicValue>> dynamicValue) {
      checkNotIsSet(dynamicValueIsSet(), "dynamicValue");
      this.dynamicValue = dynamicValue.orElse(null);
      optBits |= OPT_BIT_DYNAMIC_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#transform() transform} to transform.
     * @param transform The value for transform
     * @return {@code this} builder for chained invocation
     */
    public final Builder transform(com.fhir.canonical transform) {
      checkNotIsSet(transformIsSet(), "transform");
      this.transform = java.util.Objects.requireNonNull(transform, "transform");
      optBits |= OPT_BIT_TRANSFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#transform() transform} to transform.
     * @param transform The value for transform
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transform")
    public final Builder transform(java.util.Optional<? extends com.fhir.canonical> transform) {
      checkNotIsSet(transformIsSet(), "transform");
      this.transform = transform.orElse(null);
      optBits |= OPT_BIT_TRANSFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition_Action#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition_Action#relatedAction() relatedAction} to relatedAction.
     * @param relatedAction The value for relatedAction
     * @return {@code this} builder for chained invocation
     */
    public final Builder relatedAction(java.util.List<com.fhir.PlanDefinition_RelatedAction> relatedAction) {
      checkNotIsSet(relatedActionIsSet(), "relatedAction");
      this.relatedAction = java.util.Objects.requireNonNull(relatedAction, "relatedAction");
      optBits |= OPT_BIT_RELATED_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#relatedAction() relatedAction} to relatedAction.
     * @param relatedAction The value for relatedAction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relatedAction")
    public final Builder relatedAction(java.util.Optional<? extends java.util.List<com.fhir.PlanDefinition_RelatedAction>> relatedAction) {
      checkNotIsSet(relatedActionIsSet(), "relatedAction");
      this.relatedAction = relatedAction.orElse(null);
      optBits |= OPT_BIT_RELATED_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    public final Builder participant(java.util.List<com.fhir.PlanDefinition_Participant> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = java.util.Objects.requireNonNull(participant, "participant");
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("participant")
    public final Builder participant(java.util.Optional<? extends java.util.List<com.fhir.PlanDefinition_Participant>> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = participant.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#selectionBehavior() selectionBehavior} to selectionBehavior.
     * @param selectionBehavior The value for selectionBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder selectionBehavior(com.fhir.Plandefinition_actionSelectionbehavior selectionBehavior) {
      checkNotIsSet(selectionBehaviorIsSet(), "selectionBehavior");
      this.selectionBehavior = java.util.Objects.requireNonNull(selectionBehavior, "selectionBehavior");
      optBits |= OPT_BIT_SELECTION_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#selectionBehavior() selectionBehavior} to selectionBehavior.
     * @param selectionBehavior The value for selectionBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selectionBehavior")
    public final Builder selectionBehavior(java.util.Optional<? extends com.fhir.Plandefinition_actionSelectionbehavior> selectionBehavior) {
      checkNotIsSet(selectionBehaviorIsSet(), "selectionBehavior");
      this.selectionBehavior = selectionBehavior.orElse(null);
      optBits |= OPT_BIT_SELECTION_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#type() type} to type.
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
     * Initializes the optional value {@link PlanDefinition_Action#type() type} to type.
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
     * Initializes the optional value {@link PlanDefinition_Action#id() id} to id.
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
     * Initializes the optional value {@link PlanDefinition_Action#id() id} to id.
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
     * Initializes the optional value {@link PlanDefinition_Action#code() code} to code.
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
     * Initializes the optional value {@link PlanDefinition_Action#code() code} to code.
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
     * Initializes the optional value {@link PlanDefinition_Action#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectReference(com.fhir.Reference subjectReference) {
      checkNotIsSet(subjectReferenceIsSet(), "subjectReference");
      this.subjectReference = java.util.Objects.requireNonNull(subjectReference, "subjectReference");
      optBits |= OPT_BIT_SUBJECT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectReference")
    public final Builder subjectReference(java.util.Optional<? extends com.fhir.Reference> subjectReference) {
      checkNotIsSet(subjectReferenceIsSet(), "subjectReference");
      this.subjectReference = subjectReference.orElse(null);
      optBits |= OPT_BIT_SUBJECT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    public final Builder condition(java.util.List<com.fhir.PlanDefinition_Condition> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = java.util.Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    public final Builder condition(java.util.Optional<? extends java.util.List<com.fhir.PlanDefinition_Condition>> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = condition.orElse(null);
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#trigger() trigger} to trigger.
     * @param trigger The value for trigger
     * @return {@code this} builder for chained invocation
     */
    public final Builder trigger(java.util.List<com.fhir.TriggerDefinition> trigger) {
      checkNotIsSet(triggerIsSet(), "trigger");
      this.trigger = java.util.Objects.requireNonNull(trigger, "trigger");
      optBits |= OPT_BIT_TRIGGER;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#trigger() trigger} to trigger.
     * @param trigger The value for trigger
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trigger")
    public final Builder trigger(java.util.Optional<? extends java.util.List<com.fhir.TriggerDefinition>> trigger) {
      checkNotIsSet(triggerIsSet(), "trigger");
      this.trigger = trigger.orElse(null);
      optBits |= OPT_BIT_TRIGGER;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#timingDateTime() timingDateTime} to timingDateTime.
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
     * Initializes the optional value {@link PlanDefinition_Action#timingDateTime() timingDateTime} to timingDateTime.
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
     * Initializes the optional value {@link PlanDefinition_Action#timingTiming() timingTiming} to timingTiming.
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
     * Initializes the optional value {@link PlanDefinition_Action#timingTiming() timingTiming} to timingTiming.
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
     * Initializes the optional value {@link PlanDefinition_Action#textEquivalent() textEquivalent} to textEquivalent.
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
     * Initializes the optional value {@link PlanDefinition_Action#textEquivalent() textEquivalent} to textEquivalent.
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
     * Initializes the optional value {@link PlanDefinition_Action#goalId() goalId} to goalId.
     * @param goalId The value for goalId
     * @return {@code this} builder for chained invocation
     */
    public final Builder goalId(java.util.List<com.fhir.id> goalId) {
      checkNotIsSet(goalIdIsSet(), "goalId");
      this.goalId = java.util.Objects.requireNonNull(goalId, "goalId");
      optBits |= OPT_BIT_GOAL_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#goalId() goalId} to goalId.
     * @param goalId The value for goalId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("goalId")
    public final Builder goalId(java.util.Optional<? extends java.util.List<com.fhir.id>> goalId) {
      checkNotIsSet(goalIdIsSet(), "goalId");
      this.goalId = goalId.orElse(null);
      optBits |= OPT_BIT_GOAL_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#groupingBehavior() groupingBehavior} to groupingBehavior.
     * @param groupingBehavior The value for groupingBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder groupingBehavior(com.fhir.Plandefinition_actionGroupingbehavior groupingBehavior) {
      checkNotIsSet(groupingBehaviorIsSet(), "groupingBehavior");
      this.groupingBehavior = java.util.Objects.requireNonNull(groupingBehavior, "groupingBehavior");
      optBits |= OPT_BIT_GROUPING_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#groupingBehavior() groupingBehavior} to groupingBehavior.
     * @param groupingBehavior The value for groupingBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupingBehavior")
    public final Builder groupingBehavior(java.util.Optional<? extends com.fhir.Plandefinition_actionGroupingbehavior> groupingBehavior) {
      checkNotIsSet(groupingBehaviorIsSet(), "groupingBehavior");
      this.groupingBehavior = groupingBehavior.orElse(null);
      optBits |= OPT_BIT_GROUPING_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#requiredBehavior() requiredBehavior} to requiredBehavior.
     * @param requiredBehavior The value for requiredBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder requiredBehavior(com.fhir.Plandefinition_actionRequiredbehavior requiredBehavior) {
      checkNotIsSet(requiredBehaviorIsSet(), "requiredBehavior");
      this.requiredBehavior = java.util.Objects.requireNonNull(requiredBehavior, "requiredBehavior");
      optBits |= OPT_BIT_REQUIRED_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#requiredBehavior() requiredBehavior} to requiredBehavior.
     * @param requiredBehavior The value for requiredBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requiredBehavior")
    public final Builder requiredBehavior(java.util.Optional<? extends com.fhir.Plandefinition_actionRequiredbehavior> requiredBehavior) {
      checkNotIsSet(requiredBehaviorIsSet(), "requiredBehavior");
      this.requiredBehavior = requiredBehavior.orElse(null);
      optBits |= OPT_BIT_REQUIRED_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#input() input} to input.
     * @param input The value for input
     * @return {@code this} builder for chained invocation
     */
    public final Builder input(java.util.List<com.fhir.DataRequirement> input) {
      checkNotIsSet(inputIsSet(), "input");
      this.input = java.util.Objects.requireNonNull(input, "input");
      optBits |= OPT_BIT_INPUT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#input() input} to input.
     * @param input The value for input
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("input")
    public final Builder input(java.util.Optional<? extends java.util.List<com.fhir.DataRequirement>> input) {
      checkNotIsSet(inputIsSet(), "input");
      this.input = input.orElse(null);
      optBits |= OPT_BIT_INPUT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#precheckBehavior() precheckBehavior} to precheckBehavior.
     * @param precheckBehavior The value for precheckBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder precheckBehavior(com.fhir.Plandefinition_actionPrecheckbehavior precheckBehavior) {
      checkNotIsSet(precheckBehaviorIsSet(), "precheckBehavior");
      this.precheckBehavior = java.util.Objects.requireNonNull(precheckBehavior, "precheckBehavior");
      optBits |= OPT_BIT_PRECHECK_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#precheckBehavior() precheckBehavior} to precheckBehavior.
     * @param precheckBehavior The value for precheckBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("precheckBehavior")
    public final Builder precheckBehavior(java.util.Optional<? extends com.fhir.Plandefinition_actionPrecheckbehavior> precheckBehavior) {
      checkNotIsSet(precheckBehaviorIsSet(), "precheckBehavior");
      this.precheckBehavior = precheckBehavior.orElse(null);
      optBits |= OPT_BIT_PRECHECK_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#timingPeriod() timingPeriod} to timingPeriod.
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
     * Initializes the optional value {@link PlanDefinition_Action#timingPeriod() timingPeriod} to timingPeriod.
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
     * Initializes the optional value {@link PlanDefinition_Action#title() title} to title.
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
     * Initializes the optional value {@link PlanDefinition_Action#title() title} to title.
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
     * Initializes the optional value {@link PlanDefinition_Action#output() output} to output.
     * @param output The value for output
     * @return {@code this} builder for chained invocation
     */
    public final Builder output(java.util.List<com.fhir.DataRequirement> output) {
      checkNotIsSet(outputIsSet(), "output");
      this.output = java.util.Objects.requireNonNull(output, "output");
      optBits |= OPT_BIT_OUTPUT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#output() output} to output.
     * @param output The value for output
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("output")
    public final Builder output(java.util.Optional<? extends java.util.List<com.fhir.DataRequirement>> output) {
      checkNotIsSet(outputIsSet(), "output");
      this.output = output.orElse(null);
      optBits |= OPT_BIT_OUTPUT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#extension() extension} to extension.
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
     * Initializes the optional value {@link PlanDefinition_Action#extension() extension} to extension.
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
     * Initializes the optional value {@link PlanDefinition_Action#priority() priority} to priority.
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
     * Initializes the optional value {@link PlanDefinition_Action#priority() priority} to priority.
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
     * Initializes the optional value {@link PlanDefinition_Action#definitionUri() definitionUri} to definitionUri.
     * @param definitionUri The value for definitionUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder definitionUri(java.lang.String definitionUri) {
      checkNotIsSet(definitionUriIsSet(), "definitionUri");
      this.definitionUri = java.util.Objects.requireNonNull(definitionUri, "definitionUri");
      optBits |= OPT_BIT_DEFINITION_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#definitionUri() definitionUri} to definitionUri.
     * @param definitionUri The value for definitionUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definitionUri")
    public final Builder definitionUri(java.util.Optional<java.lang.String> definitionUri) {
      checkNotIsSet(definitionUriIsSet(), "definitionUri");
      this.definitionUri = definitionUri.orElse(null);
      optBits |= OPT_BIT_DEFINITION_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#timingAge() timingAge} to timingAge.
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
     * Initializes the optional value {@link PlanDefinition_Action#timingAge() timingAge} to timingAge.
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
     * Initializes the optional value {@link PlanDefinition_Action#description() description} to description.
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
     * Initializes the optional value {@link PlanDefinition_Action#description() description} to description.
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
     * Initializes the optional value {@link PlanDefinition_Action#documentation() documentation} to documentation.
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
     * Initializes the optional value {@link PlanDefinition_Action#documentation() documentation} to documentation.
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
     * Initializes the optional value {@link PlanDefinition_Action#reason() reason} to reason.
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
     * Initializes the optional value {@link PlanDefinition_Action#reason() reason} to reason.
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
     * Initializes the optional value {@link PlanDefinition_Action#definitionCanonical() definitionCanonical} to definitionCanonical.
     * @param definitionCanonical The value for definitionCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder definitionCanonical(java.lang.String definitionCanonical) {
      checkNotIsSet(definitionCanonicalIsSet(), "definitionCanonical");
      this.definitionCanonical = java.util.Objects.requireNonNull(definitionCanonical, "definitionCanonical");
      optBits |= OPT_BIT_DEFINITION_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#definitionCanonical() definitionCanonical} to definitionCanonical.
     * @param definitionCanonical The value for definitionCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definitionCanonical")
    public final Builder definitionCanonical(java.util.Optional<java.lang.String> definitionCanonical) {
      checkNotIsSet(definitionCanonicalIsSet(), "definitionCanonical");
      this.definitionCanonical = definitionCanonical.orElse(null);
      optBits |= OPT_BIT_DEFINITION_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#cardinalityBehavior() cardinalityBehavior} to cardinalityBehavior.
     * @param cardinalityBehavior The value for cardinalityBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder cardinalityBehavior(com.fhir.Plandefinition_actionCardinalitybehavior cardinalityBehavior) {
      checkNotIsSet(cardinalityBehaviorIsSet(), "cardinalityBehavior");
      this.cardinalityBehavior = java.util.Objects.requireNonNull(cardinalityBehavior, "cardinalityBehavior");
      optBits |= OPT_BIT_CARDINALITY_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#cardinalityBehavior() cardinalityBehavior} to cardinalityBehavior.
     * @param cardinalityBehavior The value for cardinalityBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cardinalityBehavior")
    public final Builder cardinalityBehavior(java.util.Optional<? extends com.fhir.Plandefinition_actionCardinalitybehavior> cardinalityBehavior) {
      checkNotIsSet(cardinalityBehaviorIsSet(), "cardinalityBehavior");
      this.cardinalityBehavior = cardinalityBehavior.orElse(null);
      optBits |= OPT_BIT_CARDINALITY_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#prefix() prefix} to prefix.
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
     * Initializes the optional value {@link PlanDefinition_Action#prefix() prefix} to prefix.
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
     * Initializes the optional value {@link PlanDefinition_Action#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectCodeableConcept(com.fhir.CodeableConcept subjectCodeableConcept) {
      checkNotIsSet(subjectCodeableConceptIsSet(), "subjectCodeableConcept");
      this.subjectCodeableConcept = java.util.Objects.requireNonNull(subjectCodeableConcept, "subjectCodeableConcept");
      optBits |= OPT_BIT_SUBJECT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectCodeableConcept")
    public final Builder subjectCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> subjectCodeableConcept) {
      checkNotIsSet(subjectCodeableConceptIsSet(), "subjectCodeableConcept");
      this.subjectCodeableConcept = subjectCodeableConcept.orElse(null);
      optBits |= OPT_BIT_SUBJECT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#timingDuration() timingDuration} to timingDuration.
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
     * Initializes the optional value {@link PlanDefinition_Action#timingDuration() timingDuration} to timingDuration.
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
     * Initializes the optional value {@link PlanDefinition_Action#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    public final Builder action(java.util.List<com.fhir.PlanDefinition_Action> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = java.util.Objects.requireNonNull(action, "action");
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    public final Builder action(java.util.Optional<? extends java.util.List<com.fhir.PlanDefinition_Action>> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = action.orElse(null);
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Builds a new {@link PlanDefinition_Action PlanDefinition_Action}.
     * @return An immutable instance of PlanDefinition_Action
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.PlanDefinition_Action build() {
      return new ImmutablePlanDefinition_Action(
          timingRange,
          dynamicValue,
          transform,
          modifierExtension,
          relatedAction,
          participant,
          selectionBehavior,
          type,
          id,
          code,
          subjectReference,
          condition,
          trigger,
          timingDateTime,
          timingTiming,
          textEquivalent,
          goalId,
          groupingBehavior,
          requiredBehavior,
          input,
          precheckBehavior,
          timingPeriod,
          title,
          output,
          extension,
          priority,
          definitionUri,
          timingAge,
          description,
          documentation,
          reason,
          definitionCanonical,
          cardinalityBehavior,
          prefix,
          subjectCodeableConcept,
          timingDuration,
          action);
    }

    private boolean timingRangeIsSet() {
      return (optBits & OPT_BIT_TIMING_RANGE) != 0;
    }

    private boolean dynamicValueIsSet() {
      return (optBits & OPT_BIT_DYNAMIC_VALUE) != 0;
    }

    private boolean transformIsSet() {
      return (optBits & OPT_BIT_TRANSFORM) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean relatedActionIsSet() {
      return (optBits & OPT_BIT_RELATED_ACTION) != 0;
    }

    private boolean participantIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT) != 0;
    }

    private boolean selectionBehaviorIsSet() {
      return (optBits & OPT_BIT_SELECTION_BEHAVIOR) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean subjectReferenceIsSet() {
      return (optBits & OPT_BIT_SUBJECT_REFERENCE) != 0;
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private boolean triggerIsSet() {
      return (optBits & OPT_BIT_TRIGGER) != 0;
    }

    private boolean timingDateTimeIsSet() {
      return (optBits & OPT_BIT_TIMING_DATE_TIME) != 0;
    }

    private boolean timingTimingIsSet() {
      return (optBits & OPT_BIT_TIMING_TIMING) != 0;
    }

    private boolean textEquivalentIsSet() {
      return (optBits & OPT_BIT_TEXT_EQUIVALENT) != 0;
    }

    private boolean goalIdIsSet() {
      return (optBits & OPT_BIT_GOAL_ID) != 0;
    }

    private boolean groupingBehaviorIsSet() {
      return (optBits & OPT_BIT_GROUPING_BEHAVIOR) != 0;
    }

    private boolean requiredBehaviorIsSet() {
      return (optBits & OPT_BIT_REQUIRED_BEHAVIOR) != 0;
    }

    private boolean inputIsSet() {
      return (optBits & OPT_BIT_INPUT) != 0;
    }

    private boolean precheckBehaviorIsSet() {
      return (optBits & OPT_BIT_PRECHECK_BEHAVIOR) != 0;
    }

    private boolean timingPeriodIsSet() {
      return (optBits & OPT_BIT_TIMING_PERIOD) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean outputIsSet() {
      return (optBits & OPT_BIT_OUTPUT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean definitionUriIsSet() {
      return (optBits & OPT_BIT_DEFINITION_URI) != 0;
    }

    private boolean timingAgeIsSet() {
      return (optBits & OPT_BIT_TIMING_AGE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean definitionCanonicalIsSet() {
      return (optBits & OPT_BIT_DEFINITION_CANONICAL) != 0;
    }

    private boolean cardinalityBehaviorIsSet() {
      return (optBits & OPT_BIT_CARDINALITY_BEHAVIOR) != 0;
    }

    private boolean prefixIsSet() {
      return (optBits & OPT_BIT_PREFIX) != 0;
    }

    private boolean subjectCodeableConceptIsSet() {
      return (optBits & OPT_BIT_SUBJECT_CODEABLE_CONCEPT) != 0;
    }

    private boolean timingDurationIsSet() {
      return (optBits & OPT_BIT_TIMING_DURATION) != 0;
    }

    private boolean actionIsSet() {
      return (optBits & OPT_BIT_ACTION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of PlanDefinition_Action is strict, attribute is already set: ".concat(name));
    }
  }
}
