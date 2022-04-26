package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link PlanDefinition_Action}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePlanDefinition_Action.builder()}.
 */
@Generated(from = "PlanDefinition_Action", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePlanDefinition_Action implements PlanDefinition_Action {
  private final @Nullable Range timingRange;
  private final @Nullable Code priority;
  private final @Nullable String timingDateTime;
  private final @Nullable Plandefinition_actionRequiredbehavior requiredBehavior;
  private final @Nullable List<Extension> extension;
  private final @Nullable Age timingAge;
  private final @Nullable String definitionUri;
  private final @Nullable Reference subjectReference;
  private final @Nullable Duration timingDuration;
  private final @Nullable List<PlanDefinition_RelatedAction> relatedAction;
  private final @Nullable Plandefinition_actionPrecheckbehavior precheckBehavior;
  private final @Nullable List<TriggerDefinition> trigger;
  private final @Nullable Period timingPeriod;
  private final @Nullable String description;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<CodeableConcept> code;
  private final @Nullable List<DataRequirement> input;
  private final @Nullable List<CodeableConcept> reason;
  private final @Nullable CodeableConcept subjectCodeableConcept;
  private final @Nullable List<DataRequirement> output;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<PlanDefinition_Action> action;
  private final @Nullable List<Id> goalId;
  private final @Nullable Plandefinition_actionSelectionbehavior selectionBehavior;
  private final @Nullable Canonical transform;
  private final @Nullable List<RelatedArtifact> documentation;
  private final @Nullable List<PlanDefinition_Participant> participant;
  private final @Nullable String id;
  private final @Nullable List<PlanDefinition_Condition> condition;
  private final @Nullable List<PlanDefinition_DynamicValue> dynamicValue;
  private final @Nullable String prefix;
  private final @Nullable String textEquivalent;
  private final @Nullable Timing timingTiming;
  private final @Nullable Plandefinition_actionCardinalitybehavior cardinalityBehavior;
  private final @Nullable Plandefinition_actionGroupingbehavior groupingBehavior;
  private final @Nullable String title;
  private final @Nullable String definitionCanonical;

  private ImmutablePlanDefinition_Action(
      @Nullable Range timingRange,
      @Nullable Code priority,
      @Nullable String timingDateTime,
      @Nullable Plandefinition_actionRequiredbehavior requiredBehavior,
      @Nullable List<Extension> extension,
      @Nullable Age timingAge,
      @Nullable String definitionUri,
      @Nullable Reference subjectReference,
      @Nullable Duration timingDuration,
      @Nullable List<PlanDefinition_RelatedAction> relatedAction,
      @Nullable Plandefinition_actionPrecheckbehavior precheckBehavior,
      @Nullable List<TriggerDefinition> trigger,
      @Nullable Period timingPeriod,
      @Nullable String description,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<CodeableConcept> code,
      @Nullable List<DataRequirement> input,
      @Nullable List<CodeableConcept> reason,
      @Nullable CodeableConcept subjectCodeableConcept,
      @Nullable List<DataRequirement> output,
      @Nullable CodeableConcept type,
      @Nullable List<PlanDefinition_Action> action,
      @Nullable List<Id> goalId,
      @Nullable Plandefinition_actionSelectionbehavior selectionBehavior,
      @Nullable Canonical transform,
      @Nullable List<RelatedArtifact> documentation,
      @Nullable List<PlanDefinition_Participant> participant,
      @Nullable String id,
      @Nullable List<PlanDefinition_Condition> condition,
      @Nullable List<PlanDefinition_DynamicValue> dynamicValue,
      @Nullable String prefix,
      @Nullable String textEquivalent,
      @Nullable Timing timingTiming,
      @Nullable Plandefinition_actionCardinalitybehavior cardinalityBehavior,
      @Nullable Plandefinition_actionGroupingbehavior groupingBehavior,
      @Nullable String title,
      @Nullable String definitionCanonical) {
    this.timingRange = timingRange;
    this.priority = priority;
    this.timingDateTime = timingDateTime;
    this.requiredBehavior = requiredBehavior;
    this.extension = extension;
    this.timingAge = timingAge;
    this.definitionUri = definitionUri;
    this.subjectReference = subjectReference;
    this.timingDuration = timingDuration;
    this.relatedAction = relatedAction;
    this.precheckBehavior = precheckBehavior;
    this.trigger = trigger;
    this.timingPeriod = timingPeriod;
    this.description = description;
    this.modifierExtension = modifierExtension;
    this.code = code;
    this.input = input;
    this.reason = reason;
    this.subjectCodeableConcept = subjectCodeableConcept;
    this.output = output;
    this.type = type;
    this.action = action;
    this.goalId = goalId;
    this.selectionBehavior = selectionBehavior;
    this.transform = transform;
    this.documentation = documentation;
    this.participant = participant;
    this.id = id;
    this.condition = condition;
    this.dynamicValue = dynamicValue;
    this.prefix = prefix;
    this.textEquivalent = textEquivalent;
    this.timingTiming = timingTiming;
    this.cardinalityBehavior = cardinalityBehavior;
    this.groupingBehavior = groupingBehavior;
    this.title = title;
    this.definitionCanonical = definitionCanonical;
  }

  /**
   * @return The value of the {@code timingRange} attribute
   */
  @JsonProperty("timingRange")
  @Override
  public Optional<Range> timingRange() {
    return Optional.ofNullable(timingRange);
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public Optional<Code> priority() {
    return Optional.ofNullable(priority);
  }

  /**
   * @return The value of the {@code timingDateTime} attribute
   */
  @JsonProperty("timingDateTime")
  @Override
  public Optional<String> timingDateTime() {
    return Optional.ofNullable(timingDateTime);
  }

  /**
   * @return The value of the {@code requiredBehavior} attribute
   */
  @JsonProperty("requiredBehavior")
  @Override
  public Optional<Plandefinition_actionRequiredbehavior> requiredBehavior() {
    return Optional.ofNullable(requiredBehavior);
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
   * @return The value of the {@code timingAge} attribute
   */
  @JsonProperty("timingAge")
  @Override
  public Optional<Age> timingAge() {
    return Optional.ofNullable(timingAge);
  }

  /**
   * @return The value of the {@code definitionUri} attribute
   */
  @JsonProperty("definitionUri")
  @Override
  public Optional<String> definitionUri() {
    return Optional.ofNullable(definitionUri);
  }

  /**
   * @return The value of the {@code subjectReference} attribute
   */
  @JsonProperty("subjectReference")
  @Override
  public Optional<Reference> subjectReference() {
    return Optional.ofNullable(subjectReference);
  }

  /**
   * @return The value of the {@code timingDuration} attribute
   */
  @JsonProperty("timingDuration")
  @Override
  public Optional<Duration> timingDuration() {
    return Optional.ofNullable(timingDuration);
  }

  /**
   * @return The value of the {@code relatedAction} attribute
   */
  @JsonProperty("relatedAction")
  @Override
  public Optional<List<PlanDefinition_RelatedAction>> relatedAction() {
    return Optional.ofNullable(relatedAction);
  }

  /**
   * @return The value of the {@code precheckBehavior} attribute
   */
  @JsonProperty("precheckBehavior")
  @Override
  public Optional<Plandefinition_actionPrecheckbehavior> precheckBehavior() {
    return Optional.ofNullable(precheckBehavior);
  }

  /**
   * @return The value of the {@code trigger} attribute
   */
  @JsonProperty("trigger")
  @Override
  public Optional<List<TriggerDefinition>> trigger() {
    return Optional.ofNullable(trigger);
  }

  /**
   * @return The value of the {@code timingPeriod} attribute
   */
  @JsonProperty("timingPeriod")
  @Override
  public Optional<Period> timingPeriod() {
    return Optional.ofNullable(timingPeriod);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<List<CodeableConcept>> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code input} attribute
   */
  @JsonProperty("input")
  @Override
  public Optional<List<DataRequirement>> input() {
    return Optional.ofNullable(input);
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
   * @return The value of the {@code subjectCodeableConcept} attribute
   */
  @JsonProperty("subjectCodeableConcept")
  @Override
  public Optional<CodeableConcept> subjectCodeableConcept() {
    return Optional.ofNullable(subjectCodeableConcept);
  }

  /**
   * @return The value of the {@code output} attribute
   */
  @JsonProperty("output")
  @Override
  public Optional<List<DataRequirement>> output() {
    return Optional.ofNullable(output);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code action} attribute
   */
  @JsonProperty("action")
  @Override
  public Optional<List<PlanDefinition_Action>> action() {
    return Optional.ofNullable(action);
  }

  /**
   * @return The value of the {@code goalId} attribute
   */
  @JsonProperty("goalId")
  @Override
  public Optional<List<Id>> goalId() {
    return Optional.ofNullable(goalId);
  }

  /**
   * @return The value of the {@code selectionBehavior} attribute
   */
  @JsonProperty("selectionBehavior")
  @Override
  public Optional<Plandefinition_actionSelectionbehavior> selectionBehavior() {
    return Optional.ofNullable(selectionBehavior);
  }

  /**
   * @return The value of the {@code transform} attribute
   */
  @JsonProperty("transform")
  @Override
  public Optional<Canonical> transform() {
    return Optional.ofNullable(transform);
  }

  /**
   * @return The value of the {@code documentation} attribute
   */
  @JsonProperty("documentation")
  @Override
  public Optional<List<RelatedArtifact>> documentation() {
    return Optional.ofNullable(documentation);
  }

  /**
   * @return The value of the {@code participant} attribute
   */
  @JsonProperty("participant")
  @Override
  public Optional<List<PlanDefinition_Participant>> participant() {
    return Optional.ofNullable(participant);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @JsonProperty("condition")
  @Override
  public Optional<List<PlanDefinition_Condition>> condition() {
    return Optional.ofNullable(condition);
  }

  /**
   * @return The value of the {@code dynamicValue} attribute
   */
  @JsonProperty("dynamicValue")
  @Override
  public Optional<List<PlanDefinition_DynamicValue>> dynamicValue() {
    return Optional.ofNullable(dynamicValue);
  }

  /**
   * @return The value of the {@code prefix} attribute
   */
  @JsonProperty("prefix")
  @Override
  public Optional<String> prefix() {
    return Optional.ofNullable(prefix);
  }

  /**
   * @return The value of the {@code textEquivalent} attribute
   */
  @JsonProperty("textEquivalent")
  @Override
  public Optional<String> textEquivalent() {
    return Optional.ofNullable(textEquivalent);
  }

  /**
   * @return The value of the {@code timingTiming} attribute
   */
  @JsonProperty("timingTiming")
  @Override
  public Optional<Timing> timingTiming() {
    return Optional.ofNullable(timingTiming);
  }

  /**
   * @return The value of the {@code cardinalityBehavior} attribute
   */
  @JsonProperty("cardinalityBehavior")
  @Override
  public Optional<Plandefinition_actionCardinalitybehavior> cardinalityBehavior() {
    return Optional.ofNullable(cardinalityBehavior);
  }

  /**
   * @return The value of the {@code groupingBehavior} attribute
   */
  @JsonProperty("groupingBehavior")
  @Override
  public Optional<Plandefinition_actionGroupingbehavior> groupingBehavior() {
    return Optional.ofNullable(groupingBehavior);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code definitionCanonical} attribute
   */
  @JsonProperty("definitionCanonical")
  @Override
  public Optional<String> definitionCanonical() {
    return Optional.ofNullable(definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#timingRange() timingRange} attribute.
   * @param value The value for timingRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTimingRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "timingRange");
    if (this.timingRange == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        newValue,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#timingRange() timingRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withTimingRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.timingRange == value) return this;
    return new ImmutablePlanDefinition_Action(
        value,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withPriority(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        newValue,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withPriority(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        value,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#timingDateTime() timingDateTime} attribute.
   * @param value The value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTimingDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "timingDateTime");
    if (Objects.equals(this.timingDateTime, newValue)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        newValue,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#timingDateTime() timingDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTimingDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.timingDateTime, value)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        value,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#requiredBehavior() requiredBehavior} attribute.
   * @param value The value for requiredBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withRequiredBehavior(Plandefinition_actionRequiredbehavior value) {
    @Nullable Plandefinition_actionRequiredbehavior newValue = Objects.requireNonNull(value, "requiredBehavior");
    if (this.requiredBehavior == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        newValue,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#requiredBehavior() requiredBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requiredBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withRequiredBehavior(Optional<? extends Plandefinition_actionRequiredbehavior> optional) {
    @Nullable Plandefinition_actionRequiredbehavior value = optional.orElse(null);
    if (this.requiredBehavior == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        value,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        newValue,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        value,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#timingAge() timingAge} attribute.
   * @param value The value for timingAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTimingAge(Age value) {
    @Nullable Age newValue = Objects.requireNonNull(value, "timingAge");
    if (this.timingAge == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        newValue,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#timingAge() timingAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withTimingAge(Optional<? extends Age> optional) {
    @Nullable Age value = optional.orElse(null);
    if (this.timingAge == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        value,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#definitionUri() definitionUri} attribute.
   * @param value The value for definitionUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withDefinitionUri(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "definitionUri");
    if (Objects.equals(this.definitionUri, newValue)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        newValue,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#definitionUri() definitionUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withDefinitionUri(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.definitionUri, value)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        value,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#subjectReference() subjectReference} attribute.
   * @param value The value for subjectReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withSubjectReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subjectReference");
    if (this.subjectReference == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        newValue,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#subjectReference() subjectReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withSubjectReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subjectReference == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        value,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#timingDuration() timingDuration} attribute.
   * @param value The value for timingDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTimingDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "timingDuration");
    if (this.timingDuration == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        newValue,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#timingDuration() timingDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withTimingDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.timingDuration == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        value,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#relatedAction() relatedAction} attribute.
   * @param value The value for relatedAction
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withRelatedAction(List<PlanDefinition_RelatedAction> value) {
    @Nullable List<PlanDefinition_RelatedAction> newValue = Objects.requireNonNull(value, "relatedAction");
    if (this.relatedAction == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        newValue,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#relatedAction() relatedAction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedAction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withRelatedAction(Optional<? extends List<PlanDefinition_RelatedAction>> optional) {
    @Nullable List<PlanDefinition_RelatedAction> value = optional.orElse(null);
    if (this.relatedAction == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        value,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#precheckBehavior() precheckBehavior} attribute.
   * @param value The value for precheckBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withPrecheckBehavior(Plandefinition_actionPrecheckbehavior value) {
    @Nullable Plandefinition_actionPrecheckbehavior newValue = Objects.requireNonNull(value, "precheckBehavior");
    if (this.precheckBehavior == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        newValue,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#precheckBehavior() precheckBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for precheckBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withPrecheckBehavior(Optional<? extends Plandefinition_actionPrecheckbehavior> optional) {
    @Nullable Plandefinition_actionPrecheckbehavior value = optional.orElse(null);
    if (this.precheckBehavior == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        value,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#trigger() trigger} attribute.
   * @param value The value for trigger
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTrigger(List<TriggerDefinition> value) {
    @Nullable List<TriggerDefinition> newValue = Objects.requireNonNull(value, "trigger");
    if (this.trigger == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        newValue,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#trigger() trigger} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for trigger
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withTrigger(Optional<? extends List<TriggerDefinition>> optional) {
    @Nullable List<TriggerDefinition> value = optional.orElse(null);
    if (this.trigger == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        value,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#timingPeriod() timingPeriod} attribute.
   * @param value The value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTimingPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "timingPeriod");
    if (this.timingPeriod == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        newValue,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#timingPeriod() timingPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withTimingPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.timingPeriod == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        value,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        newValue,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        value,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        newValue,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        value,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        newValue,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        value,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#input() input} attribute.
   * @param value The value for input
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withInput(List<DataRequirement> value) {
    @Nullable List<DataRequirement> newValue = Objects.requireNonNull(value, "input");
    if (this.input == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        newValue,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#input() input} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for input
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withInput(Optional<? extends List<DataRequirement>> optional) {
    @Nullable List<DataRequirement> value = optional.orElse(null);
    if (this.input == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        value,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withReason(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        newValue,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withReason(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        value,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * @param value The value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withSubjectCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "subjectCodeableConcept");
    if (this.subjectCodeableConcept == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        newValue,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withSubjectCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.subjectCodeableConcept == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        value,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#output() output} attribute.
   * @param value The value for output
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withOutput(List<DataRequirement> value) {
    @Nullable List<DataRequirement> newValue = Objects.requireNonNull(value, "output");
    if (this.output == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        newValue,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#output() output} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for output
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withOutput(Optional<? extends List<DataRequirement>> optional) {
    @Nullable List<DataRequirement> value = optional.orElse(null);
    if (this.output == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        value,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        newValue,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        value,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#action() action} attribute.
   * @param value The value for action
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withAction(List<PlanDefinition_Action> value) {
    @Nullable List<PlanDefinition_Action> newValue = Objects.requireNonNull(value, "action");
    if (this.action == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        newValue,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#action() action} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for action
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withAction(Optional<? extends List<PlanDefinition_Action>> optional) {
    @Nullable List<PlanDefinition_Action> value = optional.orElse(null);
    if (this.action == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        value,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#goalId() goalId} attribute.
   * @param value The value for goalId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withGoalId(List<Id> value) {
    @Nullable List<Id> newValue = Objects.requireNonNull(value, "goalId");
    if (this.goalId == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        newValue,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#goalId() goalId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for goalId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withGoalId(Optional<? extends List<Id>> optional) {
    @Nullable List<Id> value = optional.orElse(null);
    if (this.goalId == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        value,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#selectionBehavior() selectionBehavior} attribute.
   * @param value The value for selectionBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withSelectionBehavior(Plandefinition_actionSelectionbehavior value) {
    @Nullable Plandefinition_actionSelectionbehavior newValue = Objects.requireNonNull(value, "selectionBehavior");
    if (this.selectionBehavior == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        newValue,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#selectionBehavior() selectionBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for selectionBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withSelectionBehavior(Optional<? extends Plandefinition_actionSelectionbehavior> optional) {
    @Nullable Plandefinition_actionSelectionbehavior value = optional.orElse(null);
    if (this.selectionBehavior == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        value,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#transform() transform} attribute.
   * @param value The value for transform
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTransform(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "transform");
    if (this.transform == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        newValue,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#transform() transform} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for transform
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withTransform(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.transform == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        value,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withDocumentation(List<RelatedArtifact> value) {
    @Nullable List<RelatedArtifact> newValue = Objects.requireNonNull(value, "documentation");
    if (this.documentation == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        newValue,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#documentation() documentation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withDocumentation(Optional<? extends List<RelatedArtifact>> optional) {
    @Nullable List<RelatedArtifact> value = optional.orElse(null);
    if (this.documentation == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        value,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#participant() participant} attribute.
   * @param value The value for participant
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withParticipant(List<PlanDefinition_Participant> value) {
    @Nullable List<PlanDefinition_Participant> newValue = Objects.requireNonNull(value, "participant");
    if (this.participant == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        newValue,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#participant() participant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withParticipant(Optional<? extends List<PlanDefinition_Participant>> optional) {
    @Nullable List<PlanDefinition_Participant> value = optional.orElse(null);
    if (this.participant == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        value,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        newValue,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        value,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withCondition(List<PlanDefinition_Condition> value) {
    @Nullable List<PlanDefinition_Condition> newValue = Objects.requireNonNull(value, "condition");
    if (this.condition == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        newValue,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#condition() condition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withCondition(Optional<? extends List<PlanDefinition_Condition>> optional) {
    @Nullable List<PlanDefinition_Condition> value = optional.orElse(null);
    if (this.condition == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        value,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#dynamicValue() dynamicValue} attribute.
   * @param value The value for dynamicValue
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withDynamicValue(List<PlanDefinition_DynamicValue> value) {
    @Nullable List<PlanDefinition_DynamicValue> newValue = Objects.requireNonNull(value, "dynamicValue");
    if (this.dynamicValue == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        newValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#dynamicValue() dynamicValue} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dynamicValue
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withDynamicValue(Optional<? extends List<PlanDefinition_DynamicValue>> optional) {
    @Nullable List<PlanDefinition_DynamicValue> value = optional.orElse(null);
    if (this.dynamicValue == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        value,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#prefix() prefix} attribute.
   * @param value The value for prefix
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withPrefix(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "prefix");
    if (Objects.equals(this.prefix, newValue)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        newValue,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#prefix() prefix} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prefix
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withPrefix(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.prefix, value)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        value,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#textEquivalent() textEquivalent} attribute.
   * @param value The value for textEquivalent
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTextEquivalent(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "textEquivalent");
    if (Objects.equals(this.textEquivalent, newValue)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        newValue,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#textEquivalent() textEquivalent} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for textEquivalent
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTextEquivalent(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.textEquivalent, value)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        value,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#timingTiming() timingTiming} attribute.
   * @param value The value for timingTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTimingTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "timingTiming");
    if (this.timingTiming == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        newValue,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#timingTiming() timingTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withTimingTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.timingTiming == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        value,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#cardinalityBehavior() cardinalityBehavior} attribute.
   * @param value The value for cardinalityBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withCardinalityBehavior(Plandefinition_actionCardinalitybehavior value) {
    @Nullable Plandefinition_actionCardinalitybehavior newValue = Objects.requireNonNull(value, "cardinalityBehavior");
    if (this.cardinalityBehavior == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        newValue,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#cardinalityBehavior() cardinalityBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cardinalityBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withCardinalityBehavior(Optional<? extends Plandefinition_actionCardinalitybehavior> optional) {
    @Nullable Plandefinition_actionCardinalitybehavior value = optional.orElse(null);
    if (this.cardinalityBehavior == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        value,
        this.groupingBehavior,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#groupingBehavior() groupingBehavior} attribute.
   * @param value The value for groupingBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withGroupingBehavior(Plandefinition_actionGroupingbehavior value) {
    @Nullable Plandefinition_actionGroupingbehavior newValue = Objects.requireNonNull(value, "groupingBehavior");
    if (this.groupingBehavior == newValue) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        newValue,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#groupingBehavior() groupingBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupingBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Action withGroupingBehavior(Optional<? extends Plandefinition_actionGroupingbehavior> optional) {
    @Nullable Plandefinition_actionGroupingbehavior value = optional.orElse(null);
    if (this.groupingBehavior == value) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        value,
        this.title,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        newValue,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        value,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Action#definitionCanonical() definitionCanonical} attribute.
   * @param value The value for definitionCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withDefinitionCanonical(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "definitionCanonical");
    if (Objects.equals(this.definitionCanonical, newValue)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Action#definitionCanonical() definitionCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Action withDefinitionCanonical(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.definitionCanonical, value)) return this;
    return new ImmutablePlanDefinition_Action(
        this.timingRange,
        this.priority,
        this.timingDateTime,
        this.requiredBehavior,
        this.extension,
        this.timingAge,
        this.definitionUri,
        this.subjectReference,
        this.timingDuration,
        this.relatedAction,
        this.precheckBehavior,
        this.trigger,
        this.timingPeriod,
        this.description,
        this.modifierExtension,
        this.code,
        this.input,
        this.reason,
        this.subjectCodeableConcept,
        this.output,
        this.type,
        this.action,
        this.goalId,
        this.selectionBehavior,
        this.transform,
        this.documentation,
        this.participant,
        this.id,
        this.condition,
        this.dynamicValue,
        this.prefix,
        this.textEquivalent,
        this.timingTiming,
        this.cardinalityBehavior,
        this.groupingBehavior,
        this.title,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePlanDefinition_Action} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePlanDefinition_Action
        && equalTo((ImmutablePlanDefinition_Action) another);
  }

  private boolean equalTo(ImmutablePlanDefinition_Action another) {
    return Objects.equals(timingRange, another.timingRange)
        && Objects.equals(priority, another.priority)
        && Objects.equals(timingDateTime, another.timingDateTime)
        && Objects.equals(requiredBehavior, another.requiredBehavior)
        && Objects.equals(extension, another.extension)
        && Objects.equals(timingAge, another.timingAge)
        && Objects.equals(definitionUri, another.definitionUri)
        && Objects.equals(subjectReference, another.subjectReference)
        && Objects.equals(timingDuration, another.timingDuration)
        && Objects.equals(relatedAction, another.relatedAction)
        && Objects.equals(precheckBehavior, another.precheckBehavior)
        && Objects.equals(trigger, another.trigger)
        && Objects.equals(timingPeriod, another.timingPeriod)
        && Objects.equals(description, another.description)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(code, another.code)
        && Objects.equals(input, another.input)
        && Objects.equals(reason, another.reason)
        && Objects.equals(subjectCodeableConcept, another.subjectCodeableConcept)
        && Objects.equals(output, another.output)
        && Objects.equals(type, another.type)
        && Objects.equals(action, another.action)
        && Objects.equals(goalId, another.goalId)
        && Objects.equals(selectionBehavior, another.selectionBehavior)
        && Objects.equals(transform, another.transform)
        && Objects.equals(documentation, another.documentation)
        && Objects.equals(participant, another.participant)
        && Objects.equals(id, another.id)
        && Objects.equals(condition, another.condition)
        && Objects.equals(dynamicValue, another.dynamicValue)
        && Objects.equals(prefix, another.prefix)
        && Objects.equals(textEquivalent, another.textEquivalent)
        && Objects.equals(timingTiming, another.timingTiming)
        && Objects.equals(cardinalityBehavior, another.cardinalityBehavior)
        && Objects.equals(groupingBehavior, another.groupingBehavior)
        && Objects.equals(title, another.title)
        && Objects.equals(definitionCanonical, another.definitionCanonical);
  }

  /**
   * Computes a hash code from attributes: {@code timingRange}, {@code priority}, {@code timingDateTime}, {@code requiredBehavior}, {@code extension}, {@code timingAge}, {@code definitionUri}, {@code subjectReference}, {@code timingDuration}, {@code relatedAction}, {@code precheckBehavior}, {@code trigger}, {@code timingPeriod}, {@code description}, {@code modifierExtension}, {@code code}, {@code input}, {@code reason}, {@code subjectCodeableConcept}, {@code output}, {@code type}, {@code action}, {@code goalId}, {@code selectionBehavior}, {@code transform}, {@code documentation}, {@code participant}, {@code id}, {@code condition}, {@code dynamicValue}, {@code prefix}, {@code textEquivalent}, {@code timingTiming}, {@code cardinalityBehavior}, {@code groupingBehavior}, {@code title}, {@code definitionCanonical}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(timingRange);
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + Objects.hashCode(timingDateTime);
    h += (h << 5) + Objects.hashCode(requiredBehavior);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(timingAge);
    h += (h << 5) + Objects.hashCode(definitionUri);
    h += (h << 5) + Objects.hashCode(subjectReference);
    h += (h << 5) + Objects.hashCode(timingDuration);
    h += (h << 5) + Objects.hashCode(relatedAction);
    h += (h << 5) + Objects.hashCode(precheckBehavior);
    h += (h << 5) + Objects.hashCode(trigger);
    h += (h << 5) + Objects.hashCode(timingPeriod);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(input);
    h += (h << 5) + Objects.hashCode(reason);
    h += (h << 5) + Objects.hashCode(subjectCodeableConcept);
    h += (h << 5) + Objects.hashCode(output);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(action);
    h += (h << 5) + Objects.hashCode(goalId);
    h += (h << 5) + Objects.hashCode(selectionBehavior);
    h += (h << 5) + Objects.hashCode(transform);
    h += (h << 5) + Objects.hashCode(documentation);
    h += (h << 5) + Objects.hashCode(participant);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(condition);
    h += (h << 5) + Objects.hashCode(dynamicValue);
    h += (h << 5) + Objects.hashCode(prefix);
    h += (h << 5) + Objects.hashCode(textEquivalent);
    h += (h << 5) + Objects.hashCode(timingTiming);
    h += (h << 5) + Objects.hashCode(cardinalityBehavior);
    h += (h << 5) + Objects.hashCode(groupingBehavior);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(definitionCanonical);
    return h;
  }

  /**
   * Prints the immutable value {@code PlanDefinition_Action} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PlanDefinition_Action{");
    if (timingRange != null) {
      builder.append("timingRange=").append(timingRange);
    }
    if (priority != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (timingDateTime != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("timingDateTime=").append(timingDateTime);
    }
    if (requiredBehavior != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("requiredBehavior=").append(requiredBehavior);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (timingAge != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("timingAge=").append(timingAge);
    }
    if (definitionUri != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("definitionUri=").append(definitionUri);
    }
    if (subjectReference != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("subjectReference=").append(subjectReference);
    }
    if (timingDuration != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("timingDuration=").append(timingDuration);
    }
    if (relatedAction != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("relatedAction=").append(relatedAction);
    }
    if (precheckBehavior != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("precheckBehavior=").append(precheckBehavior);
    }
    if (trigger != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("trigger=").append(trigger);
    }
    if (timingPeriod != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("timingPeriod=").append(timingPeriod);
    }
    if (description != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (modifierExtension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (code != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (input != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("input=").append(input);
    }
    if (reason != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("reason=").append(reason);
    }
    if (subjectCodeableConcept != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("subjectCodeableConcept=").append(subjectCodeableConcept);
    }
    if (output != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("output=").append(output);
    }
    if (type != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (action != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("action=").append(action);
    }
    if (goalId != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("goalId=").append(goalId);
    }
    if (selectionBehavior != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("selectionBehavior=").append(selectionBehavior);
    }
    if (transform != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("transform=").append(transform);
    }
    if (documentation != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (participant != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("participant=").append(participant);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (condition != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("condition=").append(condition);
    }
    if (dynamicValue != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("dynamicValue=").append(dynamicValue);
    }
    if (prefix != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("prefix=").append(prefix);
    }
    if (textEquivalent != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("textEquivalent=").append(textEquivalent);
    }
    if (timingTiming != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("timingTiming=").append(timingTiming);
    }
    if (cardinalityBehavior != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("cardinalityBehavior=").append(cardinalityBehavior);
    }
    if (groupingBehavior != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("groupingBehavior=").append(groupingBehavior);
    }
    if (title != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (definitionCanonical != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("definitionCanonical=").append(definitionCanonical);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PlanDefinition_Action", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PlanDefinition_Action {
    @Nullable Optional<Range> timingRange = Optional.empty();
    boolean timingRangeIsSet;
    @Nullable Optional<Code> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable Optional<String> timingDateTime = Optional.empty();
    boolean timingDateTimeIsSet;
    @Nullable Optional<Plandefinition_actionRequiredbehavior> requiredBehavior = Optional.empty();
    boolean requiredBehaviorIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Age> timingAge = Optional.empty();
    boolean timingAgeIsSet;
    @Nullable Optional<String> definitionUri = Optional.empty();
    boolean definitionUriIsSet;
    @Nullable Optional<Reference> subjectReference = Optional.empty();
    boolean subjectReferenceIsSet;
    @Nullable Optional<Duration> timingDuration = Optional.empty();
    boolean timingDurationIsSet;
    @Nullable Optional<List<PlanDefinition_RelatedAction>> relatedAction = Optional.empty();
    boolean relatedActionIsSet;
    @Nullable Optional<Plandefinition_actionPrecheckbehavior> precheckBehavior = Optional.empty();
    boolean precheckBehaviorIsSet;
    @Nullable Optional<List<TriggerDefinition>> trigger = Optional.empty();
    boolean triggerIsSet;
    @Nullable Optional<Period> timingPeriod = Optional.empty();
    boolean timingPeriodIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<CodeableConcept>> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<DataRequirement>> input = Optional.empty();
    boolean inputIsSet;
    @Nullable Optional<List<CodeableConcept>> reason = Optional.empty();
    boolean reasonIsSet;
    @Nullable Optional<CodeableConcept> subjectCodeableConcept = Optional.empty();
    boolean subjectCodeableConceptIsSet;
    @Nullable Optional<List<DataRequirement>> output = Optional.empty();
    boolean outputIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<PlanDefinition_Action>> action = Optional.empty();
    boolean actionIsSet;
    @Nullable Optional<List<Id>> goalId = Optional.empty();
    boolean goalIdIsSet;
    @Nullable Optional<Plandefinition_actionSelectionbehavior> selectionBehavior = Optional.empty();
    boolean selectionBehaviorIsSet;
    @Nullable Optional<Canonical> transform = Optional.empty();
    boolean transformIsSet;
    @Nullable Optional<List<RelatedArtifact>> documentation = Optional.empty();
    boolean documentationIsSet;
    @Nullable Optional<List<PlanDefinition_Participant>> participant = Optional.empty();
    boolean participantIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<PlanDefinition_Condition>> condition = Optional.empty();
    boolean conditionIsSet;
    @Nullable Optional<List<PlanDefinition_DynamicValue>> dynamicValue = Optional.empty();
    boolean dynamicValueIsSet;
    @Nullable Optional<String> prefix = Optional.empty();
    boolean prefixIsSet;
    @Nullable Optional<String> textEquivalent = Optional.empty();
    boolean textEquivalentIsSet;
    @Nullable Optional<Timing> timingTiming = Optional.empty();
    boolean timingTimingIsSet;
    @Nullable Optional<Plandefinition_actionCardinalitybehavior> cardinalityBehavior = Optional.empty();
    boolean cardinalityBehaviorIsSet;
    @Nullable Optional<Plandefinition_actionGroupingbehavior> groupingBehavior = Optional.empty();
    boolean groupingBehaviorIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<String> definitionCanonical = Optional.empty();
    boolean definitionCanonicalIsSet;
    @JsonProperty("timingRange")
    public void setTimingRange(Optional<Range> timingRange) {
      this.timingRange = timingRange;
      this.timingRangeIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<Code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("timingDateTime")
    public void setTimingDateTime(Optional<String> timingDateTime) {
      this.timingDateTime = timingDateTime;
      this.timingDateTimeIsSet = true;
    }
    @JsonProperty("requiredBehavior")
    public void setRequiredBehavior(Optional<Plandefinition_actionRequiredbehavior> requiredBehavior) {
      this.requiredBehavior = requiredBehavior;
      this.requiredBehaviorIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("timingAge")
    public void setTimingAge(Optional<Age> timingAge) {
      this.timingAge = timingAge;
      this.timingAgeIsSet = true;
    }
    @JsonProperty("definitionUri")
    public void setDefinitionUri(Optional<String> definitionUri) {
      this.definitionUri = definitionUri;
      this.definitionUriIsSet = true;
    }
    @JsonProperty("subjectReference")
    public void setSubjectReference(Optional<Reference> subjectReference) {
      this.subjectReference = subjectReference;
      this.subjectReferenceIsSet = true;
    }
    @JsonProperty("timingDuration")
    public void setTimingDuration(Optional<Duration> timingDuration) {
      this.timingDuration = timingDuration;
      this.timingDurationIsSet = true;
    }
    @JsonProperty("relatedAction")
    public void setRelatedAction(Optional<List<PlanDefinition_RelatedAction>> relatedAction) {
      this.relatedAction = relatedAction;
      this.relatedActionIsSet = true;
    }
    @JsonProperty("precheckBehavior")
    public void setPrecheckBehavior(Optional<Plandefinition_actionPrecheckbehavior> precheckBehavior) {
      this.precheckBehavior = precheckBehavior;
      this.precheckBehaviorIsSet = true;
    }
    @JsonProperty("trigger")
    public void setTrigger(Optional<List<TriggerDefinition>> trigger) {
      this.trigger = trigger;
      this.triggerIsSet = true;
    }
    @JsonProperty("timingPeriod")
    public void setTimingPeriod(Optional<Period> timingPeriod) {
      this.timingPeriod = timingPeriod;
      this.timingPeriodIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<List<CodeableConcept>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("input")
    public void setInput(Optional<List<DataRequirement>> input) {
      this.input = input;
      this.inputIsSet = true;
    }
    @JsonProperty("reason")
    public void setReason(Optional<List<CodeableConcept>> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @JsonProperty("subjectCodeableConcept")
    public void setSubjectCodeableConcept(Optional<CodeableConcept> subjectCodeableConcept) {
      this.subjectCodeableConcept = subjectCodeableConcept;
      this.subjectCodeableConceptIsSet = true;
    }
    @JsonProperty("output")
    public void setOutput(Optional<List<DataRequirement>> output) {
      this.output = output;
      this.outputIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("action")
    public void setAction(Optional<List<PlanDefinition_Action>> action) {
      this.action = action;
      this.actionIsSet = true;
    }
    @JsonProperty("goalId")
    public void setGoalId(Optional<List<Id>> goalId) {
      this.goalId = goalId;
      this.goalIdIsSet = true;
    }
    @JsonProperty("selectionBehavior")
    public void setSelectionBehavior(Optional<Plandefinition_actionSelectionbehavior> selectionBehavior) {
      this.selectionBehavior = selectionBehavior;
      this.selectionBehaviorIsSet = true;
    }
    @JsonProperty("transform")
    public void setTransform(Optional<Canonical> transform) {
      this.transform = transform;
      this.transformIsSet = true;
    }
    @JsonProperty("documentation")
    public void setDocumentation(Optional<List<RelatedArtifact>> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @JsonProperty("participant")
    public void setParticipant(Optional<List<PlanDefinition_Participant>> participant) {
      this.participant = participant;
      this.participantIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("condition")
    public void setCondition(Optional<List<PlanDefinition_Condition>> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @JsonProperty("dynamicValue")
    public void setDynamicValue(Optional<List<PlanDefinition_DynamicValue>> dynamicValue) {
      this.dynamicValue = dynamicValue;
      this.dynamicValueIsSet = true;
    }
    @JsonProperty("prefix")
    public void setPrefix(Optional<String> prefix) {
      this.prefix = prefix;
      this.prefixIsSet = true;
    }
    @JsonProperty("textEquivalent")
    public void setTextEquivalent(Optional<String> textEquivalent) {
      this.textEquivalent = textEquivalent;
      this.textEquivalentIsSet = true;
    }
    @JsonProperty("timingTiming")
    public void setTimingTiming(Optional<Timing> timingTiming) {
      this.timingTiming = timingTiming;
      this.timingTimingIsSet = true;
    }
    @JsonProperty("cardinalityBehavior")
    public void setCardinalityBehavior(Optional<Plandefinition_actionCardinalitybehavior> cardinalityBehavior) {
      this.cardinalityBehavior = cardinalityBehavior;
      this.cardinalityBehaviorIsSet = true;
    }
    @JsonProperty("groupingBehavior")
    public void setGroupingBehavior(Optional<Plandefinition_actionGroupingbehavior> groupingBehavior) {
      this.groupingBehavior = groupingBehavior;
      this.groupingBehaviorIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("definitionCanonical")
    public void setDefinitionCanonical(Optional<String> definitionCanonical) {
      this.definitionCanonical = definitionCanonical;
      this.definitionCanonicalIsSet = true;
    }
    @Override
    public Optional<Range> timingRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> timingDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Plandefinition_actionRequiredbehavior> requiredBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Age> timingAge() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> definitionUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subjectReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> timingDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PlanDefinition_RelatedAction>> relatedAction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Plandefinition_actionPrecheckbehavior> precheckBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<TriggerDefinition>> trigger() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> timingPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DataRequirement>> input() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> subjectCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DataRequirement>> output() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PlanDefinition_Action>> action() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Id>> goalId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Plandefinition_actionSelectionbehavior> selectionBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> transform() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RelatedArtifact>> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PlanDefinition_Participant>> participant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PlanDefinition_Condition>> condition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PlanDefinition_DynamicValue>> dynamicValue() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> prefix() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> textEquivalent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> timingTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Plandefinition_actionCardinalitybehavior> cardinalityBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Plandefinition_actionGroupingbehavior> groupingBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> definitionCanonical() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePlanDefinition_Action fromJson(Json json) {
    ImmutablePlanDefinition_Action.Builder builder = ImmutablePlanDefinition_Action.builder();
    if (json.timingRangeIsSet) {
      builder.timingRange(json.timingRange);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.timingDateTimeIsSet) {
      builder.timingDateTime(json.timingDateTime);
    }
    if (json.requiredBehaviorIsSet) {
      builder.requiredBehavior(json.requiredBehavior);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.timingAgeIsSet) {
      builder.timingAge(json.timingAge);
    }
    if (json.definitionUriIsSet) {
      builder.definitionUri(json.definitionUri);
    }
    if (json.subjectReferenceIsSet) {
      builder.subjectReference(json.subjectReference);
    }
    if (json.timingDurationIsSet) {
      builder.timingDuration(json.timingDuration);
    }
    if (json.relatedActionIsSet) {
      builder.relatedAction(json.relatedAction);
    }
    if (json.precheckBehaviorIsSet) {
      builder.precheckBehavior(json.precheckBehavior);
    }
    if (json.triggerIsSet) {
      builder.trigger(json.trigger);
    }
    if (json.timingPeriodIsSet) {
      builder.timingPeriod(json.timingPeriod);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.inputIsSet) {
      builder.input(json.input);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.subjectCodeableConceptIsSet) {
      builder.subjectCodeableConcept(json.subjectCodeableConcept);
    }
    if (json.outputIsSet) {
      builder.output(json.output);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.actionIsSet) {
      builder.action(json.action);
    }
    if (json.goalIdIsSet) {
      builder.goalId(json.goalId);
    }
    if (json.selectionBehaviorIsSet) {
      builder.selectionBehavior(json.selectionBehavior);
    }
    if (json.transformIsSet) {
      builder.transform(json.transform);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.participantIsSet) {
      builder.participant(json.participant);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    if (json.dynamicValueIsSet) {
      builder.dynamicValue(json.dynamicValue);
    }
    if (json.prefixIsSet) {
      builder.prefix(json.prefix);
    }
    if (json.textEquivalentIsSet) {
      builder.textEquivalent(json.textEquivalent);
    }
    if (json.timingTimingIsSet) {
      builder.timingTiming(json.timingTiming);
    }
    if (json.cardinalityBehaviorIsSet) {
      builder.cardinalityBehavior(json.cardinalityBehavior);
    }
    if (json.groupingBehaviorIsSet) {
      builder.groupingBehavior(json.groupingBehavior);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.definitionCanonicalIsSet) {
      builder.definitionCanonical(json.definitionCanonical);
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
        .priority(instance.priority())
        .timingDateTime(instance.timingDateTime())
        .requiredBehavior(instance.requiredBehavior())
        .extension(instance.extension())
        .timingAge(instance.timingAge())
        .definitionUri(instance.definitionUri())
        .subjectReference(instance.subjectReference())
        .timingDuration(instance.timingDuration())
        .relatedAction(instance.relatedAction())
        .precheckBehavior(instance.precheckBehavior())
        .trigger(instance.trigger())
        .timingPeriod(instance.timingPeriod())
        .description(instance.description())
        .modifierExtension(instance.modifierExtension())
        .code(instance.code())
        .input(instance.input())
        .reason(instance.reason())
        .subjectCodeableConcept(instance.subjectCodeableConcept())
        .output(instance.output())
        .type(instance.type())
        .action(instance.action())
        .goalId(instance.goalId())
        .selectionBehavior(instance.selectionBehavior())
        .transform(instance.transform())
        .documentation(instance.documentation())
        .participant(instance.participant())
        .id(instance.id())
        .condition(instance.condition())
        .dynamicValue(instance.dynamicValue())
        .prefix(instance.prefix())
        .textEquivalent(instance.textEquivalent())
        .timingTiming(instance.timingTiming())
        .cardinalityBehavior(instance.cardinalityBehavior())
        .groupingBehavior(instance.groupingBehavior())
        .title(instance.title())
        .definitionCanonical(instance.definitionCanonical())
        .build();
  }

  /**
   * Creates a builder for {@link PlanDefinition_Action PlanDefinition_Action}.
   * <pre>
   * ImmutablePlanDefinition_Action.builder()
   *    .timingRange(com.medplum.types.fhir.Range) // optional {@link PlanDefinition_Action#timingRange() timingRange}
   *    .priority(com.medplum.types.fhir.Code) // optional {@link PlanDefinition_Action#priority() priority}
   *    .timingDateTime(String) // optional {@link PlanDefinition_Action#timingDateTime() timingDateTime}
   *    .requiredBehavior(com.medplum.types.fhir.Plandefinition_actionRequiredbehavior) // optional {@link PlanDefinition_Action#requiredBehavior() requiredBehavior}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link PlanDefinition_Action#extension() extension}
   *    .timingAge(com.medplum.types.fhir.Age) // optional {@link PlanDefinition_Action#timingAge() timingAge}
   *    .definitionUri(String) // optional {@link PlanDefinition_Action#definitionUri() definitionUri}
   *    .subjectReference(com.medplum.types.fhir.Reference) // optional {@link PlanDefinition_Action#subjectReference() subjectReference}
   *    .timingDuration(com.medplum.types.fhir.Duration) // optional {@link PlanDefinition_Action#timingDuration() timingDuration}
   *    .relatedAction(List&amp;lt;com.medplum.types.fhir.PlanDefinition_RelatedAction&amp;gt;) // optional {@link PlanDefinition_Action#relatedAction() relatedAction}
   *    .precheckBehavior(com.medplum.types.fhir.Plandefinition_actionPrecheckbehavior) // optional {@link PlanDefinition_Action#precheckBehavior() precheckBehavior}
   *    .trigger(List&amp;lt;com.medplum.types.fhir.TriggerDefinition&amp;gt;) // optional {@link PlanDefinition_Action#trigger() trigger}
   *    .timingPeriod(com.medplum.types.fhir.Period) // optional {@link PlanDefinition_Action#timingPeriod() timingPeriod}
   *    .description(String) // optional {@link PlanDefinition_Action#description() description}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link PlanDefinition_Action#modifierExtension() modifierExtension}
   *    .code(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link PlanDefinition_Action#code() code}
   *    .input(List&amp;lt;com.medplum.types.fhir.DataRequirement&amp;gt;) // optional {@link PlanDefinition_Action#input() input}
   *    .reason(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link PlanDefinition_Action#reason() reason}
   *    .subjectCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link PlanDefinition_Action#subjectCodeableConcept() subjectCodeableConcept}
   *    .output(List&amp;lt;com.medplum.types.fhir.DataRequirement&amp;gt;) // optional {@link PlanDefinition_Action#output() output}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link PlanDefinition_Action#type() type}
   *    .action(List&amp;lt;com.medplum.types.fhir.PlanDefinition_Action&amp;gt;) // optional {@link PlanDefinition_Action#action() action}
   *    .goalId(List&amp;lt;com.medplum.types.fhir.Id&amp;gt;) // optional {@link PlanDefinition_Action#goalId() goalId}
   *    .selectionBehavior(com.medplum.types.fhir.Plandefinition_actionSelectionbehavior) // optional {@link PlanDefinition_Action#selectionBehavior() selectionBehavior}
   *    .transform(com.medplum.types.fhir.Canonical) // optional {@link PlanDefinition_Action#transform() transform}
   *    .documentation(List&amp;lt;com.medplum.types.fhir.RelatedArtifact&amp;gt;) // optional {@link PlanDefinition_Action#documentation() documentation}
   *    .participant(List&amp;lt;com.medplum.types.fhir.PlanDefinition_Participant&amp;gt;) // optional {@link PlanDefinition_Action#participant() participant}
   *    .id(String) // optional {@link PlanDefinition_Action#id() id}
   *    .condition(List&amp;lt;com.medplum.types.fhir.PlanDefinition_Condition&amp;gt;) // optional {@link PlanDefinition_Action#condition() condition}
   *    .dynamicValue(List&amp;lt;com.medplum.types.fhir.PlanDefinition_DynamicValue&amp;gt;) // optional {@link PlanDefinition_Action#dynamicValue() dynamicValue}
   *    .prefix(String) // optional {@link PlanDefinition_Action#prefix() prefix}
   *    .textEquivalent(String) // optional {@link PlanDefinition_Action#textEquivalent() textEquivalent}
   *    .timingTiming(com.medplum.types.fhir.Timing) // optional {@link PlanDefinition_Action#timingTiming() timingTiming}
   *    .cardinalityBehavior(com.medplum.types.fhir.Plandefinition_actionCardinalitybehavior) // optional {@link PlanDefinition_Action#cardinalityBehavior() cardinalityBehavior}
   *    .groupingBehavior(com.medplum.types.fhir.Plandefinition_actionGroupingbehavior) // optional {@link PlanDefinition_Action#groupingBehavior() groupingBehavior}
   *    .title(String) // optional {@link PlanDefinition_Action#title() title}
   *    .definitionCanonical(String) // optional {@link PlanDefinition_Action#definitionCanonical() definitionCanonical}
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
  @Generated(from = "PlanDefinition_Action", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TIMING_RANGE = 0x1L;
    private static final long OPT_BIT_PRIORITY = 0x2L;
    private static final long OPT_BIT_TIMING_DATE_TIME = 0x4L;
    private static final long OPT_BIT_REQUIRED_BEHAVIOR = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_TIMING_AGE = 0x20L;
    private static final long OPT_BIT_DEFINITION_URI = 0x40L;
    private static final long OPT_BIT_SUBJECT_REFERENCE = 0x80L;
    private static final long OPT_BIT_TIMING_DURATION = 0x100L;
    private static final long OPT_BIT_RELATED_ACTION = 0x200L;
    private static final long OPT_BIT_PRECHECK_BEHAVIOR = 0x400L;
    private static final long OPT_BIT_TRIGGER = 0x800L;
    private static final long OPT_BIT_TIMING_PERIOD = 0x1000L;
    private static final long OPT_BIT_DESCRIPTION = 0x2000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000L;
    private static final long OPT_BIT_CODE = 0x8000L;
    private static final long OPT_BIT_INPUT = 0x10000L;
    private static final long OPT_BIT_REASON = 0x20000L;
    private static final long OPT_BIT_SUBJECT_CODEABLE_CONCEPT = 0x40000L;
    private static final long OPT_BIT_OUTPUT = 0x80000L;
    private static final long OPT_BIT_TYPE = 0x100000L;
    private static final long OPT_BIT_ACTION = 0x200000L;
    private static final long OPT_BIT_GOAL_ID = 0x400000L;
    private static final long OPT_BIT_SELECTION_BEHAVIOR = 0x800000L;
    private static final long OPT_BIT_TRANSFORM = 0x1000000L;
    private static final long OPT_BIT_DOCUMENTATION = 0x2000000L;
    private static final long OPT_BIT_PARTICIPANT = 0x4000000L;
    private static final long OPT_BIT_ID = 0x8000000L;
    private static final long OPT_BIT_CONDITION = 0x10000000L;
    private static final long OPT_BIT_DYNAMIC_VALUE = 0x20000000L;
    private static final long OPT_BIT_PREFIX = 0x40000000L;
    private static final long OPT_BIT_TEXT_EQUIVALENT = 0x80000000L;
    private static final long OPT_BIT_TIMING_TIMING = 0x100000000L;
    private static final long OPT_BIT_CARDINALITY_BEHAVIOR = 0x200000000L;
    private static final long OPT_BIT_GROUPING_BEHAVIOR = 0x400000000L;
    private static final long OPT_BIT_TITLE = 0x800000000L;
    private static final long OPT_BIT_DEFINITION_CANONICAL = 0x1000000000L;
    private long optBits;

    private @Nullable Range timingRange;
    private @Nullable Code priority;
    private @Nullable String timingDateTime;
    private @Nullable Plandefinition_actionRequiredbehavior requiredBehavior;
    private @Nullable List<Extension> extension;
    private @Nullable Age timingAge;
    private @Nullable String definitionUri;
    private @Nullable Reference subjectReference;
    private @Nullable Duration timingDuration;
    private @Nullable List<PlanDefinition_RelatedAction> relatedAction;
    private @Nullable Plandefinition_actionPrecheckbehavior precheckBehavior;
    private @Nullable List<TriggerDefinition> trigger;
    private @Nullable Period timingPeriod;
    private @Nullable String description;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<CodeableConcept> code;
    private @Nullable List<DataRequirement> input;
    private @Nullable List<CodeableConcept> reason;
    private @Nullable CodeableConcept subjectCodeableConcept;
    private @Nullable List<DataRequirement> output;
    private @Nullable CodeableConcept type;
    private @Nullable List<PlanDefinition_Action> action;
    private @Nullable List<Id> goalId;
    private @Nullable Plandefinition_actionSelectionbehavior selectionBehavior;
    private @Nullable Canonical transform;
    private @Nullable List<RelatedArtifact> documentation;
    private @Nullable List<PlanDefinition_Participant> participant;
    private @Nullable String id;
    private @Nullable List<PlanDefinition_Condition> condition;
    private @Nullable List<PlanDefinition_DynamicValue> dynamicValue;
    private @Nullable String prefix;
    private @Nullable String textEquivalent;
    private @Nullable Timing timingTiming;
    private @Nullable Plandefinition_actionCardinalitybehavior cardinalityBehavior;
    private @Nullable Plandefinition_actionGroupingbehavior groupingBehavior;
    private @Nullable String title;
    private @Nullable String definitionCanonical;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#timingRange() timingRange} to timingRange.
     * @param timingRange The value for timingRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingRange(Range timingRange) {
      checkNotIsSet(timingRangeIsSet(), "timingRange");
      this.timingRange = Objects.requireNonNull(timingRange, "timingRange");
      optBits |= OPT_BIT_TIMING_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#timingRange() timingRange} to timingRange.
     * @param timingRange The value for timingRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingRange")
    public final Builder timingRange(Optional<? extends Range> timingRange) {
      checkNotIsSet(timingRangeIsSet(), "timingRange");
      this.timingRange = timingRange.orElse(null);
      optBits |= OPT_BIT_TIMING_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(Code priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priority")
    public final Builder priority(Optional<? extends Code> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingDateTime(String timingDateTime) {
      checkNotIsSet(timingDateTimeIsSet(), "timingDateTime");
      this.timingDateTime = Objects.requireNonNull(timingDateTime, "timingDateTime");
      optBits |= OPT_BIT_TIMING_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingDateTime")
    public final Builder timingDateTime(Optional<String> timingDateTime) {
      checkNotIsSet(timingDateTimeIsSet(), "timingDateTime");
      this.timingDateTime = timingDateTime.orElse(null);
      optBits |= OPT_BIT_TIMING_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#requiredBehavior() requiredBehavior} to requiredBehavior.
     * @param requiredBehavior The value for requiredBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder requiredBehavior(Plandefinition_actionRequiredbehavior requiredBehavior) {
      checkNotIsSet(requiredBehaviorIsSet(), "requiredBehavior");
      this.requiredBehavior = Objects.requireNonNull(requiredBehavior, "requiredBehavior");
      optBits |= OPT_BIT_REQUIRED_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#requiredBehavior() requiredBehavior} to requiredBehavior.
     * @param requiredBehavior The value for requiredBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requiredBehavior")
    public final Builder requiredBehavior(Optional<? extends Plandefinition_actionRequiredbehavior> requiredBehavior) {
      checkNotIsSet(requiredBehaviorIsSet(), "requiredBehavior");
      this.requiredBehavior = requiredBehavior.orElse(null);
      optBits |= OPT_BIT_REQUIRED_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#extension() extension} to extension.
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
     * Initializes the optional value {@link PlanDefinition_Action#extension() extension} to extension.
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
     * Initializes the optional value {@link PlanDefinition_Action#timingAge() timingAge} to timingAge.
     * @param timingAge The value for timingAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingAge(Age timingAge) {
      checkNotIsSet(timingAgeIsSet(), "timingAge");
      this.timingAge = Objects.requireNonNull(timingAge, "timingAge");
      optBits |= OPT_BIT_TIMING_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#timingAge() timingAge} to timingAge.
     * @param timingAge The value for timingAge
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingAge")
    public final Builder timingAge(Optional<? extends Age> timingAge) {
      checkNotIsSet(timingAgeIsSet(), "timingAge");
      this.timingAge = timingAge.orElse(null);
      optBits |= OPT_BIT_TIMING_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#definitionUri() definitionUri} to definitionUri.
     * @param definitionUri The value for definitionUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder definitionUri(String definitionUri) {
      checkNotIsSet(definitionUriIsSet(), "definitionUri");
      this.definitionUri = Objects.requireNonNull(definitionUri, "definitionUri");
      optBits |= OPT_BIT_DEFINITION_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#definitionUri() definitionUri} to definitionUri.
     * @param definitionUri The value for definitionUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definitionUri")
    public final Builder definitionUri(Optional<String> definitionUri) {
      checkNotIsSet(definitionUriIsSet(), "definitionUri");
      this.definitionUri = definitionUri.orElse(null);
      optBits |= OPT_BIT_DEFINITION_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectReference(Reference subjectReference) {
      checkNotIsSet(subjectReferenceIsSet(), "subjectReference");
      this.subjectReference = Objects.requireNonNull(subjectReference, "subjectReference");
      optBits |= OPT_BIT_SUBJECT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subjectReference")
    public final Builder subjectReference(Optional<? extends Reference> subjectReference) {
      checkNotIsSet(subjectReferenceIsSet(), "subjectReference");
      this.subjectReference = subjectReference.orElse(null);
      optBits |= OPT_BIT_SUBJECT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#timingDuration() timingDuration} to timingDuration.
     * @param timingDuration The value for timingDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingDuration(Duration timingDuration) {
      checkNotIsSet(timingDurationIsSet(), "timingDuration");
      this.timingDuration = Objects.requireNonNull(timingDuration, "timingDuration");
      optBits |= OPT_BIT_TIMING_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#timingDuration() timingDuration} to timingDuration.
     * @param timingDuration The value for timingDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingDuration")
    public final Builder timingDuration(Optional<? extends Duration> timingDuration) {
      checkNotIsSet(timingDurationIsSet(), "timingDuration");
      this.timingDuration = timingDuration.orElse(null);
      optBits |= OPT_BIT_TIMING_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#relatedAction() relatedAction} to relatedAction.
     * @param relatedAction The value for relatedAction
     * @return {@code this} builder for chained invocation
     */
    public final Builder relatedAction(List<PlanDefinition_RelatedAction> relatedAction) {
      checkNotIsSet(relatedActionIsSet(), "relatedAction");
      this.relatedAction = Objects.requireNonNull(relatedAction, "relatedAction");
      optBits |= OPT_BIT_RELATED_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#relatedAction() relatedAction} to relatedAction.
     * @param relatedAction The value for relatedAction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relatedAction")
    public final Builder relatedAction(Optional<? extends List<PlanDefinition_RelatedAction>> relatedAction) {
      checkNotIsSet(relatedActionIsSet(), "relatedAction");
      this.relatedAction = relatedAction.orElse(null);
      optBits |= OPT_BIT_RELATED_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#precheckBehavior() precheckBehavior} to precheckBehavior.
     * @param precheckBehavior The value for precheckBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder precheckBehavior(Plandefinition_actionPrecheckbehavior precheckBehavior) {
      checkNotIsSet(precheckBehaviorIsSet(), "precheckBehavior");
      this.precheckBehavior = Objects.requireNonNull(precheckBehavior, "precheckBehavior");
      optBits |= OPT_BIT_PRECHECK_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#precheckBehavior() precheckBehavior} to precheckBehavior.
     * @param precheckBehavior The value for precheckBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("precheckBehavior")
    public final Builder precheckBehavior(Optional<? extends Plandefinition_actionPrecheckbehavior> precheckBehavior) {
      checkNotIsSet(precheckBehaviorIsSet(), "precheckBehavior");
      this.precheckBehavior = precheckBehavior.orElse(null);
      optBits |= OPT_BIT_PRECHECK_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#trigger() trigger} to trigger.
     * @param trigger The value for trigger
     * @return {@code this} builder for chained invocation
     */
    public final Builder trigger(List<TriggerDefinition> trigger) {
      checkNotIsSet(triggerIsSet(), "trigger");
      this.trigger = Objects.requireNonNull(trigger, "trigger");
      optBits |= OPT_BIT_TRIGGER;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#trigger() trigger} to trigger.
     * @param trigger The value for trigger
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("trigger")
    public final Builder trigger(Optional<? extends List<TriggerDefinition>> trigger) {
      checkNotIsSet(triggerIsSet(), "trigger");
      this.trigger = trigger.orElse(null);
      optBits |= OPT_BIT_TRIGGER;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingPeriod(Period timingPeriod) {
      checkNotIsSet(timingPeriodIsSet(), "timingPeriod");
      this.timingPeriod = Objects.requireNonNull(timingPeriod, "timingPeriod");
      optBits |= OPT_BIT_TIMING_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingPeriod")
    public final Builder timingPeriod(Optional<? extends Period> timingPeriod) {
      checkNotIsSet(timingPeriodIsSet(), "timingPeriod");
      this.timingPeriod = timingPeriod.orElse(null);
      optBits |= OPT_BIT_TIMING_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition_Action#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition_Action#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(List<CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends List<CodeableConcept>> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#input() input} to input.
     * @param input The value for input
     * @return {@code this} builder for chained invocation
     */
    public final Builder input(List<DataRequirement> input) {
      checkNotIsSet(inputIsSet(), "input");
      this.input = Objects.requireNonNull(input, "input");
      optBits |= OPT_BIT_INPUT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#input() input} to input.
     * @param input The value for input
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("input")
    public final Builder input(Optional<? extends List<DataRequirement>> input) {
      checkNotIsSet(inputIsSet(), "input");
      this.input = input.orElse(null);
      optBits |= OPT_BIT_INPUT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#reason() reason} to reason.
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
     * Initializes the optional value {@link PlanDefinition_Action#reason() reason} to reason.
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
     * Initializes the optional value {@link PlanDefinition_Action#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectCodeableConcept(CodeableConcept subjectCodeableConcept) {
      checkNotIsSet(subjectCodeableConceptIsSet(), "subjectCodeableConcept");
      this.subjectCodeableConcept = Objects.requireNonNull(subjectCodeableConcept, "subjectCodeableConcept");
      optBits |= OPT_BIT_SUBJECT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subjectCodeableConcept")
    public final Builder subjectCodeableConcept(Optional<? extends CodeableConcept> subjectCodeableConcept) {
      checkNotIsSet(subjectCodeableConceptIsSet(), "subjectCodeableConcept");
      this.subjectCodeableConcept = subjectCodeableConcept.orElse(null);
      optBits |= OPT_BIT_SUBJECT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#output() output} to output.
     * @param output The value for output
     * @return {@code this} builder for chained invocation
     */
    public final Builder output(List<DataRequirement> output) {
      checkNotIsSet(outputIsSet(), "output");
      this.output = Objects.requireNonNull(output, "output");
      optBits |= OPT_BIT_OUTPUT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#output() output} to output.
     * @param output The value for output
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("output")
    public final Builder output(Optional<? extends List<DataRequirement>> output) {
      checkNotIsSet(outputIsSet(), "output");
      this.output = output.orElse(null);
      optBits |= OPT_BIT_OUTPUT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    public final Builder action(List<PlanDefinition_Action> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = Objects.requireNonNull(action, "action");
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("action")
    public final Builder action(Optional<? extends List<PlanDefinition_Action>> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = action.orElse(null);
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#goalId() goalId} to goalId.
     * @param goalId The value for goalId
     * @return {@code this} builder for chained invocation
     */
    public final Builder goalId(List<Id> goalId) {
      checkNotIsSet(goalIdIsSet(), "goalId");
      this.goalId = Objects.requireNonNull(goalId, "goalId");
      optBits |= OPT_BIT_GOAL_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#goalId() goalId} to goalId.
     * @param goalId The value for goalId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("goalId")
    public final Builder goalId(Optional<? extends List<Id>> goalId) {
      checkNotIsSet(goalIdIsSet(), "goalId");
      this.goalId = goalId.orElse(null);
      optBits |= OPT_BIT_GOAL_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#selectionBehavior() selectionBehavior} to selectionBehavior.
     * @param selectionBehavior The value for selectionBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder selectionBehavior(Plandefinition_actionSelectionbehavior selectionBehavior) {
      checkNotIsSet(selectionBehaviorIsSet(), "selectionBehavior");
      this.selectionBehavior = Objects.requireNonNull(selectionBehavior, "selectionBehavior");
      optBits |= OPT_BIT_SELECTION_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#selectionBehavior() selectionBehavior} to selectionBehavior.
     * @param selectionBehavior The value for selectionBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("selectionBehavior")
    public final Builder selectionBehavior(Optional<? extends Plandefinition_actionSelectionbehavior> selectionBehavior) {
      checkNotIsSet(selectionBehaviorIsSet(), "selectionBehavior");
      this.selectionBehavior = selectionBehavior.orElse(null);
      optBits |= OPT_BIT_SELECTION_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#transform() transform} to transform.
     * @param transform The value for transform
     * @return {@code this} builder for chained invocation
     */
    public final Builder transform(Canonical transform) {
      checkNotIsSet(transformIsSet(), "transform");
      this.transform = Objects.requireNonNull(transform, "transform");
      optBits |= OPT_BIT_TRANSFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#transform() transform} to transform.
     * @param transform The value for transform
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("transform")
    public final Builder transform(Optional<? extends Canonical> transform) {
      checkNotIsSet(transformIsSet(), "transform");
      this.transform = transform.orElse(null);
      optBits |= OPT_BIT_TRANSFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentation(List<RelatedArtifact> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("documentation")
    public final Builder documentation(Optional<? extends List<RelatedArtifact>> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = documentation.orElse(null);
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    public final Builder participant(List<PlanDefinition_Participant> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = Objects.requireNonNull(participant, "participant");
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participant")
    public final Builder participant(Optional<? extends List<PlanDefinition_Participant>> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = participant.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    public final Builder condition(List<PlanDefinition_Condition> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("condition")
    public final Builder condition(Optional<? extends List<PlanDefinition_Condition>> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = condition.orElse(null);
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#dynamicValue() dynamicValue} to dynamicValue.
     * @param dynamicValue The value for dynamicValue
     * @return {@code this} builder for chained invocation
     */
    public final Builder dynamicValue(List<PlanDefinition_DynamicValue> dynamicValue) {
      checkNotIsSet(dynamicValueIsSet(), "dynamicValue");
      this.dynamicValue = Objects.requireNonNull(dynamicValue, "dynamicValue");
      optBits |= OPT_BIT_DYNAMIC_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#dynamicValue() dynamicValue} to dynamicValue.
     * @param dynamicValue The value for dynamicValue
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dynamicValue")
    public final Builder dynamicValue(Optional<? extends List<PlanDefinition_DynamicValue>> dynamicValue) {
      checkNotIsSet(dynamicValueIsSet(), "dynamicValue");
      this.dynamicValue = dynamicValue.orElse(null);
      optBits |= OPT_BIT_DYNAMIC_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#prefix() prefix} to prefix.
     * @param prefix The value for prefix
     * @return {@code this} builder for chained invocation
     */
    public final Builder prefix(String prefix) {
      checkNotIsSet(prefixIsSet(), "prefix");
      this.prefix = Objects.requireNonNull(prefix, "prefix");
      optBits |= OPT_BIT_PREFIX;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#prefix() prefix} to prefix.
     * @param prefix The value for prefix
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("prefix")
    public final Builder prefix(Optional<String> prefix) {
      checkNotIsSet(prefixIsSet(), "prefix");
      this.prefix = prefix.orElse(null);
      optBits |= OPT_BIT_PREFIX;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#textEquivalent() textEquivalent} to textEquivalent.
     * @param textEquivalent The value for textEquivalent
     * @return {@code this} builder for chained invocation
     */
    public final Builder textEquivalent(String textEquivalent) {
      checkNotIsSet(textEquivalentIsSet(), "textEquivalent");
      this.textEquivalent = Objects.requireNonNull(textEquivalent, "textEquivalent");
      optBits |= OPT_BIT_TEXT_EQUIVALENT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#textEquivalent() textEquivalent} to textEquivalent.
     * @param textEquivalent The value for textEquivalent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("textEquivalent")
    public final Builder textEquivalent(Optional<String> textEquivalent) {
      checkNotIsSet(textEquivalentIsSet(), "textEquivalent");
      this.textEquivalent = textEquivalent.orElse(null);
      optBits |= OPT_BIT_TEXT_EQUIVALENT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingTiming(Timing timingTiming) {
      checkNotIsSet(timingTimingIsSet(), "timingTiming");
      this.timingTiming = Objects.requireNonNull(timingTiming, "timingTiming");
      optBits |= OPT_BIT_TIMING_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingTiming")
    public final Builder timingTiming(Optional<? extends Timing> timingTiming) {
      checkNotIsSet(timingTimingIsSet(), "timingTiming");
      this.timingTiming = timingTiming.orElse(null);
      optBits |= OPT_BIT_TIMING_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#cardinalityBehavior() cardinalityBehavior} to cardinalityBehavior.
     * @param cardinalityBehavior The value for cardinalityBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder cardinalityBehavior(Plandefinition_actionCardinalitybehavior cardinalityBehavior) {
      checkNotIsSet(cardinalityBehaviorIsSet(), "cardinalityBehavior");
      this.cardinalityBehavior = Objects.requireNonNull(cardinalityBehavior, "cardinalityBehavior");
      optBits |= OPT_BIT_CARDINALITY_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#cardinalityBehavior() cardinalityBehavior} to cardinalityBehavior.
     * @param cardinalityBehavior The value for cardinalityBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cardinalityBehavior")
    public final Builder cardinalityBehavior(Optional<? extends Plandefinition_actionCardinalitybehavior> cardinalityBehavior) {
      checkNotIsSet(cardinalityBehaviorIsSet(), "cardinalityBehavior");
      this.cardinalityBehavior = cardinalityBehavior.orElse(null);
      optBits |= OPT_BIT_CARDINALITY_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#groupingBehavior() groupingBehavior} to groupingBehavior.
     * @param groupingBehavior The value for groupingBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder groupingBehavior(Plandefinition_actionGroupingbehavior groupingBehavior) {
      checkNotIsSet(groupingBehaviorIsSet(), "groupingBehavior");
      this.groupingBehavior = Objects.requireNonNull(groupingBehavior, "groupingBehavior");
      optBits |= OPT_BIT_GROUPING_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#groupingBehavior() groupingBehavior} to groupingBehavior.
     * @param groupingBehavior The value for groupingBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("groupingBehavior")
    public final Builder groupingBehavior(Optional<? extends Plandefinition_actionGroupingbehavior> groupingBehavior) {
      checkNotIsSet(groupingBehaviorIsSet(), "groupingBehavior");
      this.groupingBehavior = groupingBehavior.orElse(null);
      optBits |= OPT_BIT_GROUPING_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("title")
    public final Builder title(Optional<String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#definitionCanonical() definitionCanonical} to definitionCanonical.
     * @param definitionCanonical The value for definitionCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder definitionCanonical(String definitionCanonical) {
      checkNotIsSet(definitionCanonicalIsSet(), "definitionCanonical");
      this.definitionCanonical = Objects.requireNonNull(definitionCanonical, "definitionCanonical");
      optBits |= OPT_BIT_DEFINITION_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Action#definitionCanonical() definitionCanonical} to definitionCanonical.
     * @param definitionCanonical The value for definitionCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definitionCanonical")
    public final Builder definitionCanonical(Optional<String> definitionCanonical) {
      checkNotIsSet(definitionCanonicalIsSet(), "definitionCanonical");
      this.definitionCanonical = definitionCanonical.orElse(null);
      optBits |= OPT_BIT_DEFINITION_CANONICAL;
      return this;
    }

    /**
     * Builds a new {@link PlanDefinition_Action PlanDefinition_Action}.
     * @return An immutable instance of PlanDefinition_Action
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public PlanDefinition_Action build() {
      return new ImmutablePlanDefinition_Action(
          timingRange,
          priority,
          timingDateTime,
          requiredBehavior,
          extension,
          timingAge,
          definitionUri,
          subjectReference,
          timingDuration,
          relatedAction,
          precheckBehavior,
          trigger,
          timingPeriod,
          description,
          modifierExtension,
          code,
          input,
          reason,
          subjectCodeableConcept,
          output,
          type,
          action,
          goalId,
          selectionBehavior,
          transform,
          documentation,
          participant,
          id,
          condition,
          dynamicValue,
          prefix,
          textEquivalent,
          timingTiming,
          cardinalityBehavior,
          groupingBehavior,
          title,
          definitionCanonical);
    }

    private boolean timingRangeIsSet() {
      return (optBits & OPT_BIT_TIMING_RANGE) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean timingDateTimeIsSet() {
      return (optBits & OPT_BIT_TIMING_DATE_TIME) != 0;
    }

    private boolean requiredBehaviorIsSet() {
      return (optBits & OPT_BIT_REQUIRED_BEHAVIOR) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean timingAgeIsSet() {
      return (optBits & OPT_BIT_TIMING_AGE) != 0;
    }

    private boolean definitionUriIsSet() {
      return (optBits & OPT_BIT_DEFINITION_URI) != 0;
    }

    private boolean subjectReferenceIsSet() {
      return (optBits & OPT_BIT_SUBJECT_REFERENCE) != 0;
    }

    private boolean timingDurationIsSet() {
      return (optBits & OPT_BIT_TIMING_DURATION) != 0;
    }

    private boolean relatedActionIsSet() {
      return (optBits & OPT_BIT_RELATED_ACTION) != 0;
    }

    private boolean precheckBehaviorIsSet() {
      return (optBits & OPT_BIT_PRECHECK_BEHAVIOR) != 0;
    }

    private boolean triggerIsSet() {
      return (optBits & OPT_BIT_TRIGGER) != 0;
    }

    private boolean timingPeriodIsSet() {
      return (optBits & OPT_BIT_TIMING_PERIOD) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean inputIsSet() {
      return (optBits & OPT_BIT_INPUT) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean subjectCodeableConceptIsSet() {
      return (optBits & OPT_BIT_SUBJECT_CODEABLE_CONCEPT) != 0;
    }

    private boolean outputIsSet() {
      return (optBits & OPT_BIT_OUTPUT) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean actionIsSet() {
      return (optBits & OPT_BIT_ACTION) != 0;
    }

    private boolean goalIdIsSet() {
      return (optBits & OPT_BIT_GOAL_ID) != 0;
    }

    private boolean selectionBehaviorIsSet() {
      return (optBits & OPT_BIT_SELECTION_BEHAVIOR) != 0;
    }

    private boolean transformIsSet() {
      return (optBits & OPT_BIT_TRANSFORM) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean participantIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private boolean dynamicValueIsSet() {
      return (optBits & OPT_BIT_DYNAMIC_VALUE) != 0;
    }

    private boolean prefixIsSet() {
      return (optBits & OPT_BIT_PREFIX) != 0;
    }

    private boolean textEquivalentIsSet() {
      return (optBits & OPT_BIT_TEXT_EQUIVALENT) != 0;
    }

    private boolean timingTimingIsSet() {
      return (optBits & OPT_BIT_TIMING_TIMING) != 0;
    }

    private boolean cardinalityBehaviorIsSet() {
      return (optBits & OPT_BIT_CARDINALITY_BEHAVIOR) != 0;
    }

    private boolean groupingBehaviorIsSet() {
      return (optBits & OPT_BIT_GROUPING_BEHAVIOR) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean definitionCanonicalIsSet() {
      return (optBits & OPT_BIT_DEFINITION_CANONICAL) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of PlanDefinition_Action is strict, attribute is already set: ".concat(name));
    }
  }
}
