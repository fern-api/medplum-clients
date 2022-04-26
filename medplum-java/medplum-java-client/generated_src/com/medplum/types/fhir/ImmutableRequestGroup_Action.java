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
 * Immutable implementation of {@link RequestGroup_Action}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRequestGroup_Action.builder()}.
 */
@Generated(from = "RequestGroup_Action", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRequestGroup_Action implements RequestGroup_Action {
  private final @Nullable List<RequestGroup_RelatedAction> relatedAction;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Code requiredBehavior;
  private final @Nullable Range timingRange;
  private final @Nullable List<CodeableConcept> code;
  private final @Nullable List<RelatedArtifact> documentation;
  private final @Nullable Code precheckBehavior;
  private final @Nullable List<Extension> extension;
  private final @Nullable String textEquivalent;
  private final @Nullable CodeableConcept type;
  private final @Nullable Code priority;
  private final @Nullable String timingDateTime;
  private final @Nullable String description;
  private final @Nullable String prefix;
  private final @Nullable List<RequestGroup_Action> action;
  private final @Nullable List<RequestGroup_Condition> condition;
  private final @Nullable Duration timingDuration;
  private final @Nullable Code cardinalityBehavior;
  private final @Nullable Reference resource;
  private final @Nullable Age timingAge;
  private final @Nullable Period timingPeriod;
  private final @Nullable List<Reference> participant;
  private final @Nullable String title;
  private final @Nullable Timing timingTiming;
  private final @Nullable Code selectionBehavior;
  private final @Nullable Code groupingBehavior;
  private final @Nullable String id;

  private ImmutableRequestGroup_Action(
      @Nullable List<RequestGroup_RelatedAction> relatedAction,
      @Nullable List<Extension> modifierExtension,
      @Nullable Code requiredBehavior,
      @Nullable Range timingRange,
      @Nullable List<CodeableConcept> code,
      @Nullable List<RelatedArtifact> documentation,
      @Nullable Code precheckBehavior,
      @Nullable List<Extension> extension,
      @Nullable String textEquivalent,
      @Nullable CodeableConcept type,
      @Nullable Code priority,
      @Nullable String timingDateTime,
      @Nullable String description,
      @Nullable String prefix,
      @Nullable List<RequestGroup_Action> action,
      @Nullable List<RequestGroup_Condition> condition,
      @Nullable Duration timingDuration,
      @Nullable Code cardinalityBehavior,
      @Nullable Reference resource,
      @Nullable Age timingAge,
      @Nullable Period timingPeriod,
      @Nullable List<Reference> participant,
      @Nullable String title,
      @Nullable Timing timingTiming,
      @Nullable Code selectionBehavior,
      @Nullable Code groupingBehavior,
      @Nullable String id) {
    this.relatedAction = relatedAction;
    this.modifierExtension = modifierExtension;
    this.requiredBehavior = requiredBehavior;
    this.timingRange = timingRange;
    this.code = code;
    this.documentation = documentation;
    this.precheckBehavior = precheckBehavior;
    this.extension = extension;
    this.textEquivalent = textEquivalent;
    this.type = type;
    this.priority = priority;
    this.timingDateTime = timingDateTime;
    this.description = description;
    this.prefix = prefix;
    this.action = action;
    this.condition = condition;
    this.timingDuration = timingDuration;
    this.cardinalityBehavior = cardinalityBehavior;
    this.resource = resource;
    this.timingAge = timingAge;
    this.timingPeriod = timingPeriod;
    this.participant = participant;
    this.title = title;
    this.timingTiming = timingTiming;
    this.selectionBehavior = selectionBehavior;
    this.groupingBehavior = groupingBehavior;
    this.id = id;
  }

  /**
   * @return The value of the {@code relatedAction} attribute
   */
  @JsonProperty("relatedAction")
  @Override
  public Optional<List<RequestGroup_RelatedAction>> relatedAction() {
    return Optional.ofNullable(relatedAction);
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
   * @return The value of the {@code requiredBehavior} attribute
   */
  @JsonProperty("requiredBehavior")
  @Override
  public Optional<Code> requiredBehavior() {
    return Optional.ofNullable(requiredBehavior);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<List<CodeableConcept>> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code precheckBehavior} attribute
   */
  @JsonProperty("precheckBehavior")
  @Override
  public Optional<Code> precheckBehavior() {
    return Optional.ofNullable(precheckBehavior);
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
   * @return The value of the {@code textEquivalent} attribute
   */
  @JsonProperty("textEquivalent")
  @Override
  public Optional<String> textEquivalent() {
    return Optional.ofNullable(textEquivalent);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code action} attribute
   */
  @JsonProperty("action")
  @Override
  public Optional<List<RequestGroup_Action>> action() {
    return Optional.ofNullable(action);
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @JsonProperty("condition")
  @Override
  public Optional<List<RequestGroup_Condition>> condition() {
    return Optional.ofNullable(condition);
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
   * @return The value of the {@code cardinalityBehavior} attribute
   */
  @JsonProperty("cardinalityBehavior")
  @Override
  public Optional<Code> cardinalityBehavior() {
    return Optional.ofNullable(cardinalityBehavior);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @JsonProperty("resource")
  @Override
  public Optional<Reference> resource() {
    return Optional.ofNullable(resource);
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
   * @return The value of the {@code timingPeriod} attribute
   */
  @JsonProperty("timingPeriod")
  @Override
  public Optional<Period> timingPeriod() {
    return Optional.ofNullable(timingPeriod);
  }

  /**
   * @return The value of the {@code participant} attribute
   */
  @JsonProperty("participant")
  @Override
  public Optional<List<Reference>> participant() {
    return Optional.ofNullable(participant);
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
   * @return The value of the {@code timingTiming} attribute
   */
  @JsonProperty("timingTiming")
  @Override
  public Optional<Timing> timingTiming() {
    return Optional.ofNullable(timingTiming);
  }

  /**
   * @return The value of the {@code selectionBehavior} attribute
   */
  @JsonProperty("selectionBehavior")
  @Override
  public Optional<Code> selectionBehavior() {
    return Optional.ofNullable(selectionBehavior);
  }

  /**
   * @return The value of the {@code groupingBehavior} attribute
   */
  @JsonProperty("groupingBehavior")
  @Override
  public Optional<Code> groupingBehavior() {
    return Optional.ofNullable(groupingBehavior);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#relatedAction() relatedAction} attribute.
   * @param value The value for relatedAction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withRelatedAction(List<RequestGroup_RelatedAction> value) {
    @Nullable List<RequestGroup_RelatedAction> newValue = Objects.requireNonNull(value, "relatedAction");
    if (this.relatedAction == newValue) return this;
    return new ImmutableRequestGroup_Action(
        newValue,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#relatedAction() relatedAction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedAction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withRelatedAction(Optional<? extends List<RequestGroup_RelatedAction>> optional) {
    @Nullable List<RequestGroup_RelatedAction> value = optional.orElse(null);
    if (this.relatedAction == value) return this;
    return new ImmutableRequestGroup_Action(
        value,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        newValue,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        value,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#requiredBehavior() requiredBehavior} attribute.
   * @param value The value for requiredBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withRequiredBehavior(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "requiredBehavior");
    if (this.requiredBehavior == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        newValue,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#requiredBehavior() requiredBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requiredBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withRequiredBehavior(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.requiredBehavior == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        value,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#timingRange() timingRange} attribute.
   * @param value The value for timingRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTimingRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "timingRange");
    if (this.timingRange == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        newValue,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#timingRange() timingRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withTimingRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.timingRange == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        value,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        newValue,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        value,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withDocumentation(List<RelatedArtifact> value) {
    @Nullable List<RelatedArtifact> newValue = Objects.requireNonNull(value, "documentation");
    if (this.documentation == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        newValue,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#documentation() documentation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withDocumentation(Optional<? extends List<RelatedArtifact>> optional) {
    @Nullable List<RelatedArtifact> value = optional.orElse(null);
    if (this.documentation == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        value,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#precheckBehavior() precheckBehavior} attribute.
   * @param value The value for precheckBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withPrecheckBehavior(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "precheckBehavior");
    if (this.precheckBehavior == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        newValue,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#precheckBehavior() precheckBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for precheckBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withPrecheckBehavior(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.precheckBehavior == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        value,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        newValue,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        value,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#textEquivalent() textEquivalent} attribute.
   * @param value The value for textEquivalent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTextEquivalent(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "textEquivalent");
    if (Objects.equals(this.textEquivalent, newValue)) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        newValue,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#textEquivalent() textEquivalent} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for textEquivalent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTextEquivalent(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.textEquivalent, value)) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        value,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        newValue,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        value,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withPriority(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        newValue,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withPriority(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        value,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#timingDateTime() timingDateTime} attribute.
   * @param value The value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTimingDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "timingDateTime");
    if (Objects.equals(this.timingDateTime, newValue)) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        newValue,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#timingDateTime() timingDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTimingDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.timingDateTime, value)) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        value,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        newValue,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        value,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#prefix() prefix} attribute.
   * @param value The value for prefix
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withPrefix(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "prefix");
    if (Objects.equals(this.prefix, newValue)) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        newValue,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#prefix() prefix} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prefix
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withPrefix(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.prefix, value)) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        value,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#action() action} attribute.
   * @param value The value for action
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withAction(List<RequestGroup_Action> value) {
    @Nullable List<RequestGroup_Action> newValue = Objects.requireNonNull(value, "action");
    if (this.action == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        newValue,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#action() action} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for action
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withAction(Optional<? extends List<RequestGroup_Action>> optional) {
    @Nullable List<RequestGroup_Action> value = optional.orElse(null);
    if (this.action == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        value,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withCondition(List<RequestGroup_Condition> value) {
    @Nullable List<RequestGroup_Condition> newValue = Objects.requireNonNull(value, "condition");
    if (this.condition == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        newValue,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#condition() condition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withCondition(Optional<? extends List<RequestGroup_Condition>> optional) {
    @Nullable List<RequestGroup_Condition> value = optional.orElse(null);
    if (this.condition == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        value,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#timingDuration() timingDuration} attribute.
   * @param value The value for timingDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTimingDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "timingDuration");
    if (this.timingDuration == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        newValue,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#timingDuration() timingDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withTimingDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.timingDuration == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        value,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#cardinalityBehavior() cardinalityBehavior} attribute.
   * @param value The value for cardinalityBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withCardinalityBehavior(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "cardinalityBehavior");
    if (this.cardinalityBehavior == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        newValue,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#cardinalityBehavior() cardinalityBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cardinalityBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withCardinalityBehavior(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.cardinalityBehavior == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        value,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withResource(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        newValue,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withResource(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        value,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#timingAge() timingAge} attribute.
   * @param value The value for timingAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTimingAge(Age value) {
    @Nullable Age newValue = Objects.requireNonNull(value, "timingAge");
    if (this.timingAge == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        newValue,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#timingAge() timingAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withTimingAge(Optional<? extends Age> optional) {
    @Nullable Age value = optional.orElse(null);
    if (this.timingAge == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        value,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#timingPeriod() timingPeriod} attribute.
   * @param value The value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTimingPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "timingPeriod");
    if (this.timingPeriod == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        newValue,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#timingPeriod() timingPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withTimingPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.timingPeriod == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        value,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#participant() participant} attribute.
   * @param value The value for participant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withParticipant(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "participant");
    if (this.participant == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        newValue,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#participant() participant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withParticipant(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.participant == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        value,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        newValue,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        value,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#timingTiming() timingTiming} attribute.
   * @param value The value for timingTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withTimingTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "timingTiming");
    if (this.timingTiming == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        newValue,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#timingTiming() timingTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withTimingTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.timingTiming == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        value,
        this.selectionBehavior,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#selectionBehavior() selectionBehavior} attribute.
   * @param value The value for selectionBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withSelectionBehavior(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "selectionBehavior");
    if (this.selectionBehavior == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        newValue,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#selectionBehavior() selectionBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for selectionBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withSelectionBehavior(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.selectionBehavior == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        value,
        this.groupingBehavior,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#groupingBehavior() groupingBehavior} attribute.
   * @param value The value for groupingBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withGroupingBehavior(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "groupingBehavior");
    if (this.groupingBehavior == newValue) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#groupingBehavior() groupingBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupingBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_Action withGroupingBehavior(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.groupingBehavior == value) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_Action#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_Action#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_Action withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableRequestGroup_Action(
        this.relatedAction,
        this.modifierExtension,
        this.requiredBehavior,
        this.timingRange,
        this.code,
        this.documentation,
        this.precheckBehavior,
        this.extension,
        this.textEquivalent,
        this.type,
        this.priority,
        this.timingDateTime,
        this.description,
        this.prefix,
        this.action,
        this.condition,
        this.timingDuration,
        this.cardinalityBehavior,
        this.resource,
        this.timingAge,
        this.timingPeriod,
        this.participant,
        this.title,
        this.timingTiming,
        this.selectionBehavior,
        this.groupingBehavior,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRequestGroup_Action} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRequestGroup_Action
        && equalTo((ImmutableRequestGroup_Action) another);
  }

  private boolean equalTo(ImmutableRequestGroup_Action another) {
    return Objects.equals(relatedAction, another.relatedAction)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(requiredBehavior, another.requiredBehavior)
        && Objects.equals(timingRange, another.timingRange)
        && Objects.equals(code, another.code)
        && Objects.equals(documentation, another.documentation)
        && Objects.equals(precheckBehavior, another.precheckBehavior)
        && Objects.equals(extension, another.extension)
        && Objects.equals(textEquivalent, another.textEquivalent)
        && Objects.equals(type, another.type)
        && Objects.equals(priority, another.priority)
        && Objects.equals(timingDateTime, another.timingDateTime)
        && Objects.equals(description, another.description)
        && Objects.equals(prefix, another.prefix)
        && Objects.equals(action, another.action)
        && Objects.equals(condition, another.condition)
        && Objects.equals(timingDuration, another.timingDuration)
        && Objects.equals(cardinalityBehavior, another.cardinalityBehavior)
        && Objects.equals(resource, another.resource)
        && Objects.equals(timingAge, another.timingAge)
        && Objects.equals(timingPeriod, another.timingPeriod)
        && Objects.equals(participant, another.participant)
        && Objects.equals(title, another.title)
        && Objects.equals(timingTiming, another.timingTiming)
        && Objects.equals(selectionBehavior, another.selectionBehavior)
        && Objects.equals(groupingBehavior, another.groupingBehavior)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code relatedAction}, {@code modifierExtension}, {@code requiredBehavior}, {@code timingRange}, {@code code}, {@code documentation}, {@code precheckBehavior}, {@code extension}, {@code textEquivalent}, {@code type}, {@code priority}, {@code timingDateTime}, {@code description}, {@code prefix}, {@code action}, {@code condition}, {@code timingDuration}, {@code cardinalityBehavior}, {@code resource}, {@code timingAge}, {@code timingPeriod}, {@code participant}, {@code title}, {@code timingTiming}, {@code selectionBehavior}, {@code groupingBehavior}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(relatedAction);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(requiredBehavior);
    h += (h << 5) + Objects.hashCode(timingRange);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(documentation);
    h += (h << 5) + Objects.hashCode(precheckBehavior);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(textEquivalent);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + Objects.hashCode(timingDateTime);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(prefix);
    h += (h << 5) + Objects.hashCode(action);
    h += (h << 5) + Objects.hashCode(condition);
    h += (h << 5) + Objects.hashCode(timingDuration);
    h += (h << 5) + Objects.hashCode(cardinalityBehavior);
    h += (h << 5) + Objects.hashCode(resource);
    h += (h << 5) + Objects.hashCode(timingAge);
    h += (h << 5) + Objects.hashCode(timingPeriod);
    h += (h << 5) + Objects.hashCode(participant);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(timingTiming);
    h += (h << 5) + Objects.hashCode(selectionBehavior);
    h += (h << 5) + Objects.hashCode(groupingBehavior);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code RequestGroup_Action} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("RequestGroup_Action{");
    if (relatedAction != null) {
      builder.append("relatedAction=").append(relatedAction);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (requiredBehavior != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("requiredBehavior=").append(requiredBehavior);
    }
    if (timingRange != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("timingRange=").append(timingRange);
    }
    if (code != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (documentation != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (precheckBehavior != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("precheckBehavior=").append(precheckBehavior);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (textEquivalent != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("textEquivalent=").append(textEquivalent);
    }
    if (type != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (priority != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (timingDateTime != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("timingDateTime=").append(timingDateTime);
    }
    if (description != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (prefix != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("prefix=").append(prefix);
    }
    if (action != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("action=").append(action);
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
    if (resource != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (timingAge != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("timingAge=").append(timingAge);
    }
    if (timingPeriod != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("timingPeriod=").append(timingPeriod);
    }
    if (participant != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("participant=").append(participant);
    }
    if (title != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (timingTiming != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("timingTiming=").append(timingTiming);
    }
    if (selectionBehavior != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("selectionBehavior=").append(selectionBehavior);
    }
    if (groupingBehavior != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("groupingBehavior=").append(groupingBehavior);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "RequestGroup_Action", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RequestGroup_Action {
    @Nullable Optional<List<RequestGroup_RelatedAction>> relatedAction = Optional.empty();
    boolean relatedActionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Code> requiredBehavior = Optional.empty();
    boolean requiredBehaviorIsSet;
    @Nullable Optional<Range> timingRange = Optional.empty();
    boolean timingRangeIsSet;
    @Nullable Optional<List<CodeableConcept>> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<RelatedArtifact>> documentation = Optional.empty();
    boolean documentationIsSet;
    @Nullable Optional<Code> precheckBehavior = Optional.empty();
    boolean precheckBehaviorIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> textEquivalent = Optional.empty();
    boolean textEquivalentIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Code> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable Optional<String> timingDateTime = Optional.empty();
    boolean timingDateTimeIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<String> prefix = Optional.empty();
    boolean prefixIsSet;
    @Nullable Optional<List<RequestGroup_Action>> action = Optional.empty();
    boolean actionIsSet;
    @Nullable Optional<List<RequestGroup_Condition>> condition = Optional.empty();
    boolean conditionIsSet;
    @Nullable Optional<Duration> timingDuration = Optional.empty();
    boolean timingDurationIsSet;
    @Nullable Optional<Code> cardinalityBehavior = Optional.empty();
    boolean cardinalityBehaviorIsSet;
    @Nullable Optional<Reference> resource = Optional.empty();
    boolean resourceIsSet;
    @Nullable Optional<Age> timingAge = Optional.empty();
    boolean timingAgeIsSet;
    @Nullable Optional<Period> timingPeriod = Optional.empty();
    boolean timingPeriodIsSet;
    @Nullable Optional<List<Reference>> participant = Optional.empty();
    boolean participantIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<Timing> timingTiming = Optional.empty();
    boolean timingTimingIsSet;
    @Nullable Optional<Code> selectionBehavior = Optional.empty();
    boolean selectionBehaviorIsSet;
    @Nullable Optional<Code> groupingBehavior = Optional.empty();
    boolean groupingBehaviorIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("relatedAction")
    public void setRelatedAction(Optional<List<RequestGroup_RelatedAction>> relatedAction) {
      this.relatedAction = relatedAction;
      this.relatedActionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("requiredBehavior")
    public void setRequiredBehavior(Optional<Code> requiredBehavior) {
      this.requiredBehavior = requiredBehavior;
      this.requiredBehaviorIsSet = true;
    }
    @JsonProperty("timingRange")
    public void setTimingRange(Optional<Range> timingRange) {
      this.timingRange = timingRange;
      this.timingRangeIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<List<CodeableConcept>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("documentation")
    public void setDocumentation(Optional<List<RelatedArtifact>> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @JsonProperty("precheckBehavior")
    public void setPrecheckBehavior(Optional<Code> precheckBehavior) {
      this.precheckBehavior = precheckBehavior;
      this.precheckBehaviorIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("textEquivalent")
    public void setTextEquivalent(Optional<String> textEquivalent) {
      this.textEquivalent = textEquivalent;
      this.textEquivalentIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
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
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("prefix")
    public void setPrefix(Optional<String> prefix) {
      this.prefix = prefix;
      this.prefixIsSet = true;
    }
    @JsonProperty("action")
    public void setAction(Optional<List<RequestGroup_Action>> action) {
      this.action = action;
      this.actionIsSet = true;
    }
    @JsonProperty("condition")
    public void setCondition(Optional<List<RequestGroup_Condition>> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @JsonProperty("timingDuration")
    public void setTimingDuration(Optional<Duration> timingDuration) {
      this.timingDuration = timingDuration;
      this.timingDurationIsSet = true;
    }
    @JsonProperty("cardinalityBehavior")
    public void setCardinalityBehavior(Optional<Code> cardinalityBehavior) {
      this.cardinalityBehavior = cardinalityBehavior;
      this.cardinalityBehaviorIsSet = true;
    }
    @JsonProperty("resource")
    public void setResource(Optional<Reference> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @JsonProperty("timingAge")
    public void setTimingAge(Optional<Age> timingAge) {
      this.timingAge = timingAge;
      this.timingAgeIsSet = true;
    }
    @JsonProperty("timingPeriod")
    public void setTimingPeriod(Optional<Period> timingPeriod) {
      this.timingPeriod = timingPeriod;
      this.timingPeriodIsSet = true;
    }
    @JsonProperty("participant")
    public void setParticipant(Optional<List<Reference>> participant) {
      this.participant = participant;
      this.participantIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("timingTiming")
    public void setTimingTiming(Optional<Timing> timingTiming) {
      this.timingTiming = timingTiming;
      this.timingTimingIsSet = true;
    }
    @JsonProperty("selectionBehavior")
    public void setSelectionBehavior(Optional<Code> selectionBehavior) {
      this.selectionBehavior = selectionBehavior;
      this.selectionBehaviorIsSet = true;
    }
    @JsonProperty("groupingBehavior")
    public void setGroupingBehavior(Optional<Code> groupingBehavior) {
      this.groupingBehavior = groupingBehavior;
      this.groupingBehaviorIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<RequestGroup_RelatedAction>> relatedAction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> requiredBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> timingRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RelatedArtifact>> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> precheckBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> textEquivalent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> timingDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> prefix() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RequestGroup_Action>> action() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RequestGroup_Condition>> condition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> timingDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> cardinalityBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> resource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Age> timingAge() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> timingPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> participant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> timingTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> selectionBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> groupingBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRequestGroup_Action fromJson(Json json) {
    ImmutableRequestGroup_Action.Builder builder = ImmutableRequestGroup_Action.builder();
    if (json.relatedActionIsSet) {
      builder.relatedAction(json.relatedAction);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.requiredBehaviorIsSet) {
      builder.requiredBehavior(json.requiredBehavior);
    }
    if (json.timingRangeIsSet) {
      builder.timingRange(json.timingRange);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.precheckBehaviorIsSet) {
      builder.precheckBehavior(json.precheckBehavior);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textEquivalentIsSet) {
      builder.textEquivalent(json.textEquivalent);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.timingDateTimeIsSet) {
      builder.timingDateTime(json.timingDateTime);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.prefixIsSet) {
      builder.prefix(json.prefix);
    }
    if (json.actionIsSet) {
      builder.action(json.action);
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
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.timingAgeIsSet) {
      builder.timingAge(json.timingAge);
    }
    if (json.timingPeriodIsSet) {
      builder.timingPeriod(json.timingPeriod);
    }
    if (json.participantIsSet) {
      builder.participant(json.participant);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.timingTimingIsSet) {
      builder.timingTiming(json.timingTiming);
    }
    if (json.selectionBehaviorIsSet) {
      builder.selectionBehavior(json.selectionBehavior);
    }
    if (json.groupingBehaviorIsSet) {
      builder.groupingBehavior(json.groupingBehavior);
    }
    if (json.idIsSet) {
      builder.id(json.id);
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
        .relatedAction(instance.relatedAction())
        .modifierExtension(instance.modifierExtension())
        .requiredBehavior(instance.requiredBehavior())
        .timingRange(instance.timingRange())
        .code(instance.code())
        .documentation(instance.documentation())
        .precheckBehavior(instance.precheckBehavior())
        .extension(instance.extension())
        .textEquivalent(instance.textEquivalent())
        .type(instance.type())
        .priority(instance.priority())
        .timingDateTime(instance.timingDateTime())
        .description(instance.description())
        .prefix(instance.prefix())
        .action(instance.action())
        .condition(instance.condition())
        .timingDuration(instance.timingDuration())
        .cardinalityBehavior(instance.cardinalityBehavior())
        .resource(instance.resource())
        .timingAge(instance.timingAge())
        .timingPeriod(instance.timingPeriod())
        .participant(instance.participant())
        .title(instance.title())
        .timingTiming(instance.timingTiming())
        .selectionBehavior(instance.selectionBehavior())
        .groupingBehavior(instance.groupingBehavior())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link RequestGroup_Action RequestGroup_Action}.
   * <pre>
   * ImmutableRequestGroup_Action.builder()
   *    .relatedAction(List&amp;lt;com.medplum.types.fhir.RequestGroup_RelatedAction&amp;gt;) // optional {@link RequestGroup_Action#relatedAction() relatedAction}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link RequestGroup_Action#modifierExtension() modifierExtension}
   *    .requiredBehavior(com.medplum.types.fhir.Code) // optional {@link RequestGroup_Action#requiredBehavior() requiredBehavior}
   *    .timingRange(com.medplum.types.fhir.Range) // optional {@link RequestGroup_Action#timingRange() timingRange}
   *    .code(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link RequestGroup_Action#code() code}
   *    .documentation(List&amp;lt;com.medplum.types.fhir.RelatedArtifact&amp;gt;) // optional {@link RequestGroup_Action#documentation() documentation}
   *    .precheckBehavior(com.medplum.types.fhir.Code) // optional {@link RequestGroup_Action#precheckBehavior() precheckBehavior}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link RequestGroup_Action#extension() extension}
   *    .textEquivalent(String) // optional {@link RequestGroup_Action#textEquivalent() textEquivalent}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link RequestGroup_Action#type() type}
   *    .priority(com.medplum.types.fhir.Code) // optional {@link RequestGroup_Action#priority() priority}
   *    .timingDateTime(String) // optional {@link RequestGroup_Action#timingDateTime() timingDateTime}
   *    .description(String) // optional {@link RequestGroup_Action#description() description}
   *    .prefix(String) // optional {@link RequestGroup_Action#prefix() prefix}
   *    .action(List&amp;lt;com.medplum.types.fhir.RequestGroup_Action&amp;gt;) // optional {@link RequestGroup_Action#action() action}
   *    .condition(List&amp;lt;com.medplum.types.fhir.RequestGroup_Condition&amp;gt;) // optional {@link RequestGroup_Action#condition() condition}
   *    .timingDuration(com.medplum.types.fhir.Duration) // optional {@link RequestGroup_Action#timingDuration() timingDuration}
   *    .cardinalityBehavior(com.medplum.types.fhir.Code) // optional {@link RequestGroup_Action#cardinalityBehavior() cardinalityBehavior}
   *    .resource(com.medplum.types.fhir.Reference) // optional {@link RequestGroup_Action#resource() resource}
   *    .timingAge(com.medplum.types.fhir.Age) // optional {@link RequestGroup_Action#timingAge() timingAge}
   *    .timingPeriod(com.medplum.types.fhir.Period) // optional {@link RequestGroup_Action#timingPeriod() timingPeriod}
   *    .participant(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link RequestGroup_Action#participant() participant}
   *    .title(String) // optional {@link RequestGroup_Action#title() title}
   *    .timingTiming(com.medplum.types.fhir.Timing) // optional {@link RequestGroup_Action#timingTiming() timingTiming}
   *    .selectionBehavior(com.medplum.types.fhir.Code) // optional {@link RequestGroup_Action#selectionBehavior() selectionBehavior}
   *    .groupingBehavior(com.medplum.types.fhir.Code) // optional {@link RequestGroup_Action#groupingBehavior() groupingBehavior}
   *    .id(String) // optional {@link RequestGroup_Action#id() id}
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
  @Generated(from = "RequestGroup_Action", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_RELATED_ACTION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_REQUIRED_BEHAVIOR = 0x4L;
    private static final long OPT_BIT_TIMING_RANGE = 0x8L;
    private static final long OPT_BIT_CODE = 0x10L;
    private static final long OPT_BIT_DOCUMENTATION = 0x20L;
    private static final long OPT_BIT_PRECHECK_BEHAVIOR = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_TEXT_EQUIVALENT = 0x100L;
    private static final long OPT_BIT_TYPE = 0x200L;
    private static final long OPT_BIT_PRIORITY = 0x400L;
    private static final long OPT_BIT_TIMING_DATE_TIME = 0x800L;
    private static final long OPT_BIT_DESCRIPTION = 0x1000L;
    private static final long OPT_BIT_PREFIX = 0x2000L;
    private static final long OPT_BIT_ACTION = 0x4000L;
    private static final long OPT_BIT_CONDITION = 0x8000L;
    private static final long OPT_BIT_TIMING_DURATION = 0x10000L;
    private static final long OPT_BIT_CARDINALITY_BEHAVIOR = 0x20000L;
    private static final long OPT_BIT_RESOURCE = 0x40000L;
    private static final long OPT_BIT_TIMING_AGE = 0x80000L;
    private static final long OPT_BIT_TIMING_PERIOD = 0x100000L;
    private static final long OPT_BIT_PARTICIPANT = 0x200000L;
    private static final long OPT_BIT_TITLE = 0x400000L;
    private static final long OPT_BIT_TIMING_TIMING = 0x800000L;
    private static final long OPT_BIT_SELECTION_BEHAVIOR = 0x1000000L;
    private static final long OPT_BIT_GROUPING_BEHAVIOR = 0x2000000L;
    private static final long OPT_BIT_ID = 0x4000000L;
    private long optBits;

    private @Nullable List<RequestGroup_RelatedAction> relatedAction;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Code requiredBehavior;
    private @Nullable Range timingRange;
    private @Nullable List<CodeableConcept> code;
    private @Nullable List<RelatedArtifact> documentation;
    private @Nullable Code precheckBehavior;
    private @Nullable List<Extension> extension;
    private @Nullable String textEquivalent;
    private @Nullable CodeableConcept type;
    private @Nullable Code priority;
    private @Nullable String timingDateTime;
    private @Nullable String description;
    private @Nullable String prefix;
    private @Nullable List<RequestGroup_Action> action;
    private @Nullable List<RequestGroup_Condition> condition;
    private @Nullable Duration timingDuration;
    private @Nullable Code cardinalityBehavior;
    private @Nullable Reference resource;
    private @Nullable Age timingAge;
    private @Nullable Period timingPeriod;
    private @Nullable List<Reference> participant;
    private @Nullable String title;
    private @Nullable Timing timingTiming;
    private @Nullable Code selectionBehavior;
    private @Nullable Code groupingBehavior;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#relatedAction() relatedAction} to relatedAction.
     * @param relatedAction The value for relatedAction
     * @return {@code this} builder for chained invocation
     */
    public final Builder relatedAction(List<RequestGroup_RelatedAction> relatedAction) {
      checkNotIsSet(relatedActionIsSet(), "relatedAction");
      this.relatedAction = Objects.requireNonNull(relatedAction, "relatedAction");
      optBits |= OPT_BIT_RELATED_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#relatedAction() relatedAction} to relatedAction.
     * @param relatedAction The value for relatedAction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relatedAction")
    public final Builder relatedAction(Optional<? extends List<RequestGroup_RelatedAction>> relatedAction) {
      checkNotIsSet(relatedActionIsSet(), "relatedAction");
      this.relatedAction = relatedAction.orElse(null);
      optBits |= OPT_BIT_RELATED_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RequestGroup_Action#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RequestGroup_Action#requiredBehavior() requiredBehavior} to requiredBehavior.
     * @param requiredBehavior The value for requiredBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder requiredBehavior(Code requiredBehavior) {
      checkNotIsSet(requiredBehaviorIsSet(), "requiredBehavior");
      this.requiredBehavior = Objects.requireNonNull(requiredBehavior, "requiredBehavior");
      optBits |= OPT_BIT_REQUIRED_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#requiredBehavior() requiredBehavior} to requiredBehavior.
     * @param requiredBehavior The value for requiredBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requiredBehavior")
    public final Builder requiredBehavior(Optional<? extends Code> requiredBehavior) {
      checkNotIsSet(requiredBehaviorIsSet(), "requiredBehavior");
      this.requiredBehavior = requiredBehavior.orElse(null);
      optBits |= OPT_BIT_REQUIRED_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#timingRange() timingRange} to timingRange.
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
     * Initializes the optional value {@link RequestGroup_Action#timingRange() timingRange} to timingRange.
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
     * Initializes the optional value {@link RequestGroup_Action#code() code} to code.
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
     * Initializes the optional value {@link RequestGroup_Action#code() code} to code.
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
     * Initializes the optional value {@link RequestGroup_Action#documentation() documentation} to documentation.
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
     * Initializes the optional value {@link RequestGroup_Action#documentation() documentation} to documentation.
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
     * Initializes the optional value {@link RequestGroup_Action#precheckBehavior() precheckBehavior} to precheckBehavior.
     * @param precheckBehavior The value for precheckBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder precheckBehavior(Code precheckBehavior) {
      checkNotIsSet(precheckBehaviorIsSet(), "precheckBehavior");
      this.precheckBehavior = Objects.requireNonNull(precheckBehavior, "precheckBehavior");
      optBits |= OPT_BIT_PRECHECK_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#precheckBehavior() precheckBehavior} to precheckBehavior.
     * @param precheckBehavior The value for precheckBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("precheckBehavior")
    public final Builder precheckBehavior(Optional<? extends Code> precheckBehavior) {
      checkNotIsSet(precheckBehaviorIsSet(), "precheckBehavior");
      this.precheckBehavior = precheckBehavior.orElse(null);
      optBits |= OPT_BIT_PRECHECK_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#extension() extension} to extension.
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
     * Initializes the optional value {@link RequestGroup_Action#extension() extension} to extension.
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
     * Initializes the optional value {@link RequestGroup_Action#textEquivalent() textEquivalent} to textEquivalent.
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
     * Initializes the optional value {@link RequestGroup_Action#textEquivalent() textEquivalent} to textEquivalent.
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
     * Initializes the optional value {@link RequestGroup_Action#type() type} to type.
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
     * Initializes the optional value {@link RequestGroup_Action#type() type} to type.
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
     * Initializes the optional value {@link RequestGroup_Action#priority() priority} to priority.
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
     * Initializes the optional value {@link RequestGroup_Action#priority() priority} to priority.
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
     * Initializes the optional value {@link RequestGroup_Action#timingDateTime() timingDateTime} to timingDateTime.
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
     * Initializes the optional value {@link RequestGroup_Action#timingDateTime() timingDateTime} to timingDateTime.
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
     * Initializes the optional value {@link RequestGroup_Action#description() description} to description.
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
     * Initializes the optional value {@link RequestGroup_Action#description() description} to description.
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
     * Initializes the optional value {@link RequestGroup_Action#prefix() prefix} to prefix.
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
     * Initializes the optional value {@link RequestGroup_Action#prefix() prefix} to prefix.
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
     * Initializes the optional value {@link RequestGroup_Action#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    public final Builder action(List<RequestGroup_Action> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = Objects.requireNonNull(action, "action");
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("action")
    public final Builder action(Optional<? extends List<RequestGroup_Action>> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = action.orElse(null);
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    public final Builder condition(List<RequestGroup_Condition> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("condition")
    public final Builder condition(Optional<? extends List<RequestGroup_Condition>> condition) {
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
    public final Builder timingDuration(Duration timingDuration) {
      checkNotIsSet(timingDurationIsSet(), "timingDuration");
      this.timingDuration = Objects.requireNonNull(timingDuration, "timingDuration");
      optBits |= OPT_BIT_TIMING_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#timingDuration() timingDuration} to timingDuration.
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
     * Initializes the optional value {@link RequestGroup_Action#cardinalityBehavior() cardinalityBehavior} to cardinalityBehavior.
     * @param cardinalityBehavior The value for cardinalityBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder cardinalityBehavior(Code cardinalityBehavior) {
      checkNotIsSet(cardinalityBehaviorIsSet(), "cardinalityBehavior");
      this.cardinalityBehavior = Objects.requireNonNull(cardinalityBehavior, "cardinalityBehavior");
      optBits |= OPT_BIT_CARDINALITY_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#cardinalityBehavior() cardinalityBehavior} to cardinalityBehavior.
     * @param cardinalityBehavior The value for cardinalityBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cardinalityBehavior")
    public final Builder cardinalityBehavior(Optional<? extends Code> cardinalityBehavior) {
      checkNotIsSet(cardinalityBehaviorIsSet(), "cardinalityBehavior");
      this.cardinalityBehavior = cardinalityBehavior.orElse(null);
      optBits |= OPT_BIT_CARDINALITY_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(Reference resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resource")
    public final Builder resource(Optional<? extends Reference> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#timingAge() timingAge} to timingAge.
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
     * Initializes the optional value {@link RequestGroup_Action#timingAge() timingAge} to timingAge.
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
     * Initializes the optional value {@link RequestGroup_Action#timingPeriod() timingPeriod} to timingPeriod.
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
     * Initializes the optional value {@link RequestGroup_Action#timingPeriod() timingPeriod} to timingPeriod.
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
     * Initializes the optional value {@link RequestGroup_Action#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    public final Builder participant(List<Reference> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = Objects.requireNonNull(participant, "participant");
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participant")
    public final Builder participant(Optional<? extends List<Reference>> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = participant.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#title() title} to title.
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
     * Initializes the optional value {@link RequestGroup_Action#title() title} to title.
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
     * Initializes the optional value {@link RequestGroup_Action#timingTiming() timingTiming} to timingTiming.
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
     * Initializes the optional value {@link RequestGroup_Action#timingTiming() timingTiming} to timingTiming.
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
     * Initializes the optional value {@link RequestGroup_Action#selectionBehavior() selectionBehavior} to selectionBehavior.
     * @param selectionBehavior The value for selectionBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder selectionBehavior(Code selectionBehavior) {
      checkNotIsSet(selectionBehaviorIsSet(), "selectionBehavior");
      this.selectionBehavior = Objects.requireNonNull(selectionBehavior, "selectionBehavior");
      optBits |= OPT_BIT_SELECTION_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#selectionBehavior() selectionBehavior} to selectionBehavior.
     * @param selectionBehavior The value for selectionBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("selectionBehavior")
    public final Builder selectionBehavior(Optional<? extends Code> selectionBehavior) {
      checkNotIsSet(selectionBehaviorIsSet(), "selectionBehavior");
      this.selectionBehavior = selectionBehavior.orElse(null);
      optBits |= OPT_BIT_SELECTION_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#groupingBehavior() groupingBehavior} to groupingBehavior.
     * @param groupingBehavior The value for groupingBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder groupingBehavior(Code groupingBehavior) {
      checkNotIsSet(groupingBehaviorIsSet(), "groupingBehavior");
      this.groupingBehavior = Objects.requireNonNull(groupingBehavior, "groupingBehavior");
      optBits |= OPT_BIT_GROUPING_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#groupingBehavior() groupingBehavior} to groupingBehavior.
     * @param groupingBehavior The value for groupingBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("groupingBehavior")
    public final Builder groupingBehavior(Optional<? extends Code> groupingBehavior) {
      checkNotIsSet(groupingBehaviorIsSet(), "groupingBehavior");
      this.groupingBehavior = groupingBehavior.orElse(null);
      optBits |= OPT_BIT_GROUPING_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_Action#id() id} to id.
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
     * Initializes the optional value {@link RequestGroup_Action#id() id} to id.
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
     * Builds a new {@link RequestGroup_Action RequestGroup_Action}.
     * @return An immutable instance of RequestGroup_Action
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public RequestGroup_Action build() {
      return new ImmutableRequestGroup_Action(
          relatedAction,
          modifierExtension,
          requiredBehavior,
          timingRange,
          code,
          documentation,
          precheckBehavior,
          extension,
          textEquivalent,
          type,
          priority,
          timingDateTime,
          description,
          prefix,
          action,
          condition,
          timingDuration,
          cardinalityBehavior,
          resource,
          timingAge,
          timingPeriod,
          participant,
          title,
          timingTiming,
          selectionBehavior,
          groupingBehavior,
          id);
    }

    private boolean relatedActionIsSet() {
      return (optBits & OPT_BIT_RELATED_ACTION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean requiredBehaviorIsSet() {
      return (optBits & OPT_BIT_REQUIRED_BEHAVIOR) != 0;
    }

    private boolean timingRangeIsSet() {
      return (optBits & OPT_BIT_TIMING_RANGE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean precheckBehaviorIsSet() {
      return (optBits & OPT_BIT_PRECHECK_BEHAVIOR) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textEquivalentIsSet() {
      return (optBits & OPT_BIT_TEXT_EQUIVALENT) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean timingDateTimeIsSet() {
      return (optBits & OPT_BIT_TIMING_DATE_TIME) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean prefixIsSet() {
      return (optBits & OPT_BIT_PREFIX) != 0;
    }

    private boolean actionIsSet() {
      return (optBits & OPT_BIT_ACTION) != 0;
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

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean timingAgeIsSet() {
      return (optBits & OPT_BIT_TIMING_AGE) != 0;
    }

    private boolean timingPeriodIsSet() {
      return (optBits & OPT_BIT_TIMING_PERIOD) != 0;
    }

    private boolean participantIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean timingTimingIsSet() {
      return (optBits & OPT_BIT_TIMING_TIMING) != 0;
    }

    private boolean selectionBehaviorIsSet() {
      return (optBits & OPT_BIT_SELECTION_BEHAVIOR) != 0;
    }

    private boolean groupingBehaviorIsSet() {
      return (optBits & OPT_BIT_GROUPING_BEHAVIOR) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of RequestGroup_Action is strict, attribute is already set: ".concat(name));
    }
  }
}
