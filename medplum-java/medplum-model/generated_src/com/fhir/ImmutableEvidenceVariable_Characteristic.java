package com.fhir;

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
 * Immutable implementation of {@link EvidenceVariable_Characteristic}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEvidenceVariable_Characteristic.builder()}.
 */
@Generated(from = "EvidenceVariable_Characteristic", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEvidenceVariable_Characteristic
    implements EvidenceVariable_Characteristic {
  private final @Nullable Reference definitionReference;
  private final @Nullable Expression definitionExpression;
  private final @Nullable Period participantEffectivePeriod;
  private final @Nullable List<Extension> extension;
  private final @Nullable Duration participantEffectiveDuration;
  private final @Nullable Timing participantEffectiveTiming;
  private final @Nullable String id;
  private final @Nullable Duration timeFromStart;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String definitionCanonical;
  private final @Nullable CodeableConcept definitionCodeableConcept;
  private final @Nullable String description;
  private final @Nullable Boolean exclude;
  private final @Nullable DataRequirement definitionDataRequirement;
  private final @Nullable List<UsageContext> usageContext;
  private final @Nullable String participantEffectiveDateTime;
  private final @Nullable Evidencevariable_characteristicGroupmeasure groupMeasure;
  private final @Nullable TriggerDefinition definitionTriggerDefinition;

  private ImmutableEvidenceVariable_Characteristic(
      @Nullable Reference definitionReference,
      @Nullable Expression definitionExpression,
      @Nullable Period participantEffectivePeriod,
      @Nullable List<Extension> extension,
      @Nullable Duration participantEffectiveDuration,
      @Nullable Timing participantEffectiveTiming,
      @Nullable String id,
      @Nullable Duration timeFromStart,
      @Nullable List<Extension> modifierExtension,
      @Nullable String definitionCanonical,
      @Nullable CodeableConcept definitionCodeableConcept,
      @Nullable String description,
      @Nullable Boolean exclude,
      @Nullable DataRequirement definitionDataRequirement,
      @Nullable List<UsageContext> usageContext,
      @Nullable String participantEffectiveDateTime,
      @Nullable Evidencevariable_characteristicGroupmeasure groupMeasure,
      @Nullable TriggerDefinition definitionTriggerDefinition) {
    this.definitionReference = definitionReference;
    this.definitionExpression = definitionExpression;
    this.participantEffectivePeriod = participantEffectivePeriod;
    this.extension = extension;
    this.participantEffectiveDuration = participantEffectiveDuration;
    this.participantEffectiveTiming = participantEffectiveTiming;
    this.id = id;
    this.timeFromStart = timeFromStart;
    this.modifierExtension = modifierExtension;
    this.definitionCanonical = definitionCanonical;
    this.definitionCodeableConcept = definitionCodeableConcept;
    this.description = description;
    this.exclude = exclude;
    this.definitionDataRequirement = definitionDataRequirement;
    this.usageContext = usageContext;
    this.participantEffectiveDateTime = participantEffectiveDateTime;
    this.groupMeasure = groupMeasure;
    this.definitionTriggerDefinition = definitionTriggerDefinition;
  }

  /**
   * @return The value of the {@code definitionReference} attribute
   */
  @JsonProperty("definitionReference")
  @Override
  public Optional<Reference> definitionReference() {
    return Optional.ofNullable(definitionReference);
  }

  /**
   * @return The value of the {@code definitionExpression} attribute
   */
  @JsonProperty("definitionExpression")
  @Override
  public Optional<Expression> definitionExpression() {
    return Optional.ofNullable(definitionExpression);
  }

  /**
   * @return The value of the {@code participantEffectivePeriod} attribute
   */
  @JsonProperty("participantEffectivePeriod")
  @Override
  public Optional<Period> participantEffectivePeriod() {
    return Optional.ofNullable(participantEffectivePeriod);
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
   * @return The value of the {@code participantEffectiveDuration} attribute
   */
  @JsonProperty("participantEffectiveDuration")
  @Override
  public Optional<Duration> participantEffectiveDuration() {
    return Optional.ofNullable(participantEffectiveDuration);
  }

  /**
   * @return The value of the {@code participantEffectiveTiming} attribute
   */
  @JsonProperty("participantEffectiveTiming")
  @Override
  public Optional<Timing> participantEffectiveTiming() {
    return Optional.ofNullable(participantEffectiveTiming);
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
   * @return The value of the {@code timeFromStart} attribute
   */
  @JsonProperty("timeFromStart")
  @Override
  public Optional<Duration> timeFromStart() {
    return Optional.ofNullable(timeFromStart);
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
   * @return The value of the {@code definitionCanonical} attribute
   */
  @JsonProperty("definitionCanonical")
  @Override
  public Optional<String> definitionCanonical() {
    return Optional.ofNullable(definitionCanonical);
  }

  /**
   * @return The value of the {@code definitionCodeableConcept} attribute
   */
  @JsonProperty("definitionCodeableConcept")
  @Override
  public Optional<CodeableConcept> definitionCodeableConcept() {
    return Optional.ofNullable(definitionCodeableConcept);
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
   * @return The value of the {@code exclude} attribute
   */
  @JsonProperty("exclude")
  @Override
  public Optional<Boolean> exclude() {
    return Optional.ofNullable(exclude);
  }

  /**
   * @return The value of the {@code definitionDataRequirement} attribute
   */
  @JsonProperty("definitionDataRequirement")
  @Override
  public Optional<DataRequirement> definitionDataRequirement() {
    return Optional.ofNullable(definitionDataRequirement);
  }

  /**
   * @return The value of the {@code usageContext} attribute
   */
  @JsonProperty("usageContext")
  @Override
  public Optional<List<UsageContext>> usageContext() {
    return Optional.ofNullable(usageContext);
  }

  /**
   * @return The value of the {@code participantEffectiveDateTime} attribute
   */
  @JsonProperty("participantEffectiveDateTime")
  @Override
  public Optional<String> participantEffectiveDateTime() {
    return Optional.ofNullable(participantEffectiveDateTime);
  }

  /**
   * @return The value of the {@code groupMeasure} attribute
   */
  @JsonProperty("groupMeasure")
  @Override
  public Optional<Evidencevariable_characteristicGroupmeasure> groupMeasure() {
    return Optional.ofNullable(groupMeasure);
  }

  /**
   * @return The value of the {@code definitionTriggerDefinition} attribute
   */
  @JsonProperty("definitionTriggerDefinition")
  @Override
  public Optional<TriggerDefinition> definitionTriggerDefinition() {
    return Optional.ofNullable(definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#definitionReference() definitionReference} attribute.
   * @param value The value for definitionReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withDefinitionReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "definitionReference");
    if (this.definitionReference == newValue) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        newValue,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#definitionReference() definitionReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable_Characteristic withDefinitionReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.definitionReference == value) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        value,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#definitionExpression() definitionExpression} attribute.
   * @param value The value for definitionExpression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withDefinitionExpression(Expression value) {
    @Nullable Expression newValue = Objects.requireNonNull(value, "definitionExpression");
    if (this.definitionExpression == newValue) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        newValue,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#definitionExpression() definitionExpression} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionExpression
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable_Characteristic withDefinitionExpression(Optional<? extends Expression> optional) {
    @Nullable Expression value = optional.orElse(null);
    if (this.definitionExpression == value) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        value,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#participantEffectivePeriod() participantEffectivePeriod} attribute.
   * @param value The value for participantEffectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withParticipantEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "participantEffectivePeriod");
    if (this.participantEffectivePeriod == newValue) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        newValue,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#participantEffectivePeriod() participantEffectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participantEffectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable_Characteristic withParticipantEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.participantEffectivePeriod == value) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        value,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        newValue,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable_Characteristic withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        value,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#participantEffectiveDuration() participantEffectiveDuration} attribute.
   * @param value The value for participantEffectiveDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withParticipantEffectiveDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "participantEffectiveDuration");
    if (this.participantEffectiveDuration == newValue) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        newValue,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#participantEffectiveDuration() participantEffectiveDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participantEffectiveDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable_Characteristic withParticipantEffectiveDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.participantEffectiveDuration == value) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        value,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#participantEffectiveTiming() participantEffectiveTiming} attribute.
   * @param value The value for participantEffectiveTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withParticipantEffectiveTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "participantEffectiveTiming");
    if (this.participantEffectiveTiming == newValue) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        newValue,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#participantEffectiveTiming() participantEffectiveTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participantEffectiveTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable_Characteristic withParticipantEffectiveTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.participantEffectiveTiming == value) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        value,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        newValue,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        value,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#timeFromStart() timeFromStart} attribute.
   * @param value The value for timeFromStart
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withTimeFromStart(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "timeFromStart");
    if (this.timeFromStart == newValue) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        newValue,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#timeFromStart() timeFromStart} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timeFromStart
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable_Characteristic withTimeFromStart(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.timeFromStart == value) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        value,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        newValue,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable_Characteristic withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        value,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#definitionCanonical() definitionCanonical} attribute.
   * @param value The value for definitionCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withDefinitionCanonical(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "definitionCanonical");
    if (Objects.equals(this.definitionCanonical, newValue)) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        newValue,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#definitionCanonical() definitionCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withDefinitionCanonical(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.definitionCanonical, value)) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        value,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#definitionCodeableConcept() definitionCodeableConcept} attribute.
   * @param value The value for definitionCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withDefinitionCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "definitionCodeableConcept");
    if (this.definitionCodeableConcept == newValue) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        newValue,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#definitionCodeableConcept() definitionCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable_Characteristic withDefinitionCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.definitionCodeableConcept == value) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        value,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        newValue,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        value,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#exclude() exclude} attribute.
   * @param value The value for exclude
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withExclude(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.exclude, newValue)) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        newValue,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#exclude() exclude} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exclude
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withExclude(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.exclude, value)) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        value,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#definitionDataRequirement() definitionDataRequirement} attribute.
   * @param value The value for definitionDataRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withDefinitionDataRequirement(DataRequirement value) {
    @Nullable DataRequirement newValue = Objects.requireNonNull(value, "definitionDataRequirement");
    if (this.definitionDataRequirement == newValue) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        newValue,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#definitionDataRequirement() definitionDataRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionDataRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable_Characteristic withDefinitionDataRequirement(Optional<? extends DataRequirement> optional) {
    @Nullable DataRequirement value = optional.orElse(null);
    if (this.definitionDataRequirement == value) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        value,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#usageContext() usageContext} attribute.
   * @param value The value for usageContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withUsageContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "usageContext");
    if (this.usageContext == newValue) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        newValue,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#usageContext() usageContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usageContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable_Characteristic withUsageContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.usageContext == value) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        value,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#participantEffectiveDateTime() participantEffectiveDateTime} attribute.
   * @param value The value for participantEffectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withParticipantEffectiveDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "participantEffectiveDateTime");
    if (Objects.equals(this.participantEffectiveDateTime, newValue)) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        newValue,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#participantEffectiveDateTime() participantEffectiveDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participantEffectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withParticipantEffectiveDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.participantEffectiveDateTime, value)) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        value,
        this.groupMeasure,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#groupMeasure() groupMeasure} attribute.
   * @param value The value for groupMeasure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withGroupMeasure(Evidencevariable_characteristicGroupmeasure value) {
    @Nullable Evidencevariable_characteristicGroupmeasure newValue = Objects.requireNonNull(value, "groupMeasure");
    if (this.groupMeasure == newValue) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        newValue,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#groupMeasure() groupMeasure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupMeasure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable_Characteristic withGroupMeasure(Optional<? extends Evidencevariable_characteristicGroupmeasure> optional) {
    @Nullable Evidencevariable_characteristicGroupmeasure value = optional.orElse(null);
    if (this.groupMeasure == value) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        value,
        this.definitionTriggerDefinition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable_Characteristic#definitionTriggerDefinition() definitionTriggerDefinition} attribute.
   * @param value The value for definitionTriggerDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable_Characteristic withDefinitionTriggerDefinition(TriggerDefinition value) {
    @Nullable TriggerDefinition newValue = Objects.requireNonNull(value, "definitionTriggerDefinition");
    if (this.definitionTriggerDefinition == newValue) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable_Characteristic#definitionTriggerDefinition() definitionTriggerDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionTriggerDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable_Characteristic withDefinitionTriggerDefinition(Optional<? extends TriggerDefinition> optional) {
    @Nullable TriggerDefinition value = optional.orElse(null);
    if (this.definitionTriggerDefinition == value) return this;
    return new ImmutableEvidenceVariable_Characteristic(
        this.definitionReference,
        this.definitionExpression,
        this.participantEffectivePeriod,
        this.extension,
        this.participantEffectiveDuration,
        this.participantEffectiveTiming,
        this.id,
        this.timeFromStart,
        this.modifierExtension,
        this.definitionCanonical,
        this.definitionCodeableConcept,
        this.description,
        this.exclude,
        this.definitionDataRequirement,
        this.usageContext,
        this.participantEffectiveDateTime,
        this.groupMeasure,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEvidenceVariable_Characteristic} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEvidenceVariable_Characteristic
        && equalTo((ImmutableEvidenceVariable_Characteristic) another);
  }

  private boolean equalTo(ImmutableEvidenceVariable_Characteristic another) {
    return Objects.equals(definitionReference, another.definitionReference)
        && Objects.equals(definitionExpression, another.definitionExpression)
        && Objects.equals(participantEffectivePeriod, another.participantEffectivePeriod)
        && Objects.equals(extension, another.extension)
        && Objects.equals(participantEffectiveDuration, another.participantEffectiveDuration)
        && Objects.equals(participantEffectiveTiming, another.participantEffectiveTiming)
        && Objects.equals(id, another.id)
        && Objects.equals(timeFromStart, another.timeFromStart)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(definitionCanonical, another.definitionCanonical)
        && Objects.equals(definitionCodeableConcept, another.definitionCodeableConcept)
        && Objects.equals(description, another.description)
        && Objects.equals(exclude, another.exclude)
        && Objects.equals(definitionDataRequirement, another.definitionDataRequirement)
        && Objects.equals(usageContext, another.usageContext)
        && Objects.equals(participantEffectiveDateTime, another.participantEffectiveDateTime)
        && Objects.equals(groupMeasure, another.groupMeasure)
        && Objects.equals(definitionTriggerDefinition, another.definitionTriggerDefinition);
  }

  /**
   * Computes a hash code from attributes: {@code definitionReference}, {@code definitionExpression}, {@code participantEffectivePeriod}, {@code extension}, {@code participantEffectiveDuration}, {@code participantEffectiveTiming}, {@code id}, {@code timeFromStart}, {@code modifierExtension}, {@code definitionCanonical}, {@code definitionCodeableConcept}, {@code description}, {@code exclude}, {@code definitionDataRequirement}, {@code usageContext}, {@code participantEffectiveDateTime}, {@code groupMeasure}, {@code definitionTriggerDefinition}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(definitionReference);
    h += (h << 5) + Objects.hashCode(definitionExpression);
    h += (h << 5) + Objects.hashCode(participantEffectivePeriod);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(participantEffectiveDuration);
    h += (h << 5) + Objects.hashCode(participantEffectiveTiming);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(timeFromStart);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(definitionCanonical);
    h += (h << 5) + Objects.hashCode(definitionCodeableConcept);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(exclude);
    h += (h << 5) + Objects.hashCode(definitionDataRequirement);
    h += (h << 5) + Objects.hashCode(usageContext);
    h += (h << 5) + Objects.hashCode(participantEffectiveDateTime);
    h += (h << 5) + Objects.hashCode(groupMeasure);
    h += (h << 5) + Objects.hashCode(definitionTriggerDefinition);
    return h;
  }

  /**
   * Prints the immutable value {@code EvidenceVariable_Characteristic} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EvidenceVariable_Characteristic{");
    if (definitionReference != null) {
      builder.append("definitionReference=").append(definitionReference);
    }
    if (definitionExpression != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("definitionExpression=").append(definitionExpression);
    }
    if (participantEffectivePeriod != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("participantEffectivePeriod=").append(participantEffectivePeriod);
    }
    if (extension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (participantEffectiveDuration != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("participantEffectiveDuration=").append(participantEffectiveDuration);
    }
    if (participantEffectiveTiming != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("participantEffectiveTiming=").append(participantEffectiveTiming);
    }
    if (id != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (timeFromStart != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("timeFromStart=").append(timeFromStart);
    }
    if (modifierExtension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (definitionCanonical != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("definitionCanonical=").append(definitionCanonical);
    }
    if (definitionCodeableConcept != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("definitionCodeableConcept=").append(definitionCodeableConcept);
    }
    if (description != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (exclude != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("exclude=").append(exclude);
    }
    if (definitionDataRequirement != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("definitionDataRequirement=").append(definitionDataRequirement);
    }
    if (usageContext != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("usageContext=").append(usageContext);
    }
    if (participantEffectiveDateTime != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("participantEffectiveDateTime=").append(participantEffectiveDateTime);
    }
    if (groupMeasure != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("groupMeasure=").append(groupMeasure);
    }
    if (definitionTriggerDefinition != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("definitionTriggerDefinition=").append(definitionTriggerDefinition);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "EvidenceVariable_Characteristic", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements EvidenceVariable_Characteristic {
    @Nullable Optional<Reference> definitionReference = Optional.empty();
    boolean definitionReferenceIsSet;
    @Nullable Optional<Expression> definitionExpression = Optional.empty();
    boolean definitionExpressionIsSet;
    @Nullable Optional<Period> participantEffectivePeriod = Optional.empty();
    boolean participantEffectivePeriodIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Duration> participantEffectiveDuration = Optional.empty();
    boolean participantEffectiveDurationIsSet;
    @Nullable Optional<Timing> participantEffectiveTiming = Optional.empty();
    boolean participantEffectiveTimingIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Duration> timeFromStart = Optional.empty();
    boolean timeFromStartIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> definitionCanonical = Optional.empty();
    boolean definitionCanonicalIsSet;
    @Nullable Optional<CodeableConcept> definitionCodeableConcept = Optional.empty();
    boolean definitionCodeableConceptIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Boolean> exclude = Optional.empty();
    boolean excludeIsSet;
    @Nullable Optional<DataRequirement> definitionDataRequirement = Optional.empty();
    boolean definitionDataRequirementIsSet;
    @Nullable Optional<List<UsageContext>> usageContext = Optional.empty();
    boolean usageContextIsSet;
    @Nullable Optional<String> participantEffectiveDateTime = Optional.empty();
    boolean participantEffectiveDateTimeIsSet;
    @Nullable Optional<Evidencevariable_characteristicGroupmeasure> groupMeasure = Optional.empty();
    boolean groupMeasureIsSet;
    @Nullable Optional<TriggerDefinition> definitionTriggerDefinition = Optional.empty();
    boolean definitionTriggerDefinitionIsSet;
    @JsonProperty("definitionReference")
    public void setDefinitionReference(Optional<Reference> definitionReference) {
      this.definitionReference = definitionReference;
      this.definitionReferenceIsSet = true;
    }
    @JsonProperty("definitionExpression")
    public void setDefinitionExpression(Optional<Expression> definitionExpression) {
      this.definitionExpression = definitionExpression;
      this.definitionExpressionIsSet = true;
    }
    @JsonProperty("participantEffectivePeriod")
    public void setParticipantEffectivePeriod(Optional<Period> participantEffectivePeriod) {
      this.participantEffectivePeriod = participantEffectivePeriod;
      this.participantEffectivePeriodIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("participantEffectiveDuration")
    public void setParticipantEffectiveDuration(Optional<Duration> participantEffectiveDuration) {
      this.participantEffectiveDuration = participantEffectiveDuration;
      this.participantEffectiveDurationIsSet = true;
    }
    @JsonProperty("participantEffectiveTiming")
    public void setParticipantEffectiveTiming(Optional<Timing> participantEffectiveTiming) {
      this.participantEffectiveTiming = participantEffectiveTiming;
      this.participantEffectiveTimingIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("timeFromStart")
    public void setTimeFromStart(Optional<Duration> timeFromStart) {
      this.timeFromStart = timeFromStart;
      this.timeFromStartIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("definitionCanonical")
    public void setDefinitionCanonical(Optional<String> definitionCanonical) {
      this.definitionCanonical = definitionCanonical;
      this.definitionCanonicalIsSet = true;
    }
    @JsonProperty("definitionCodeableConcept")
    public void setDefinitionCodeableConcept(Optional<CodeableConcept> definitionCodeableConcept) {
      this.definitionCodeableConcept = definitionCodeableConcept;
      this.definitionCodeableConceptIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("exclude")
    public void setExclude(Optional<Boolean> exclude) {
      this.exclude = exclude;
      this.excludeIsSet = true;
    }
    @JsonProperty("definitionDataRequirement")
    public void setDefinitionDataRequirement(Optional<DataRequirement> definitionDataRequirement) {
      this.definitionDataRequirement = definitionDataRequirement;
      this.definitionDataRequirementIsSet = true;
    }
    @JsonProperty("usageContext")
    public void setUsageContext(Optional<List<UsageContext>> usageContext) {
      this.usageContext = usageContext;
      this.usageContextIsSet = true;
    }
    @JsonProperty("participantEffectiveDateTime")
    public void setParticipantEffectiveDateTime(Optional<String> participantEffectiveDateTime) {
      this.participantEffectiveDateTime = participantEffectiveDateTime;
      this.participantEffectiveDateTimeIsSet = true;
    }
    @JsonProperty("groupMeasure")
    public void setGroupMeasure(Optional<Evidencevariable_characteristicGroupmeasure> groupMeasure) {
      this.groupMeasure = groupMeasure;
      this.groupMeasureIsSet = true;
    }
    @JsonProperty("definitionTriggerDefinition")
    public void setDefinitionTriggerDefinition(Optional<TriggerDefinition> definitionTriggerDefinition) {
      this.definitionTriggerDefinition = definitionTriggerDefinition;
      this.definitionTriggerDefinitionIsSet = true;
    }
    @Override
    public Optional<Reference> definitionReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Expression> definitionExpression() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> participantEffectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> participantEffectiveDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> participantEffectiveTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> timeFromStart() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> definitionCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> definitionCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> exclude() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DataRequirement> definitionDataRequirement() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> usageContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> participantEffectiveDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Evidencevariable_characteristicGroupmeasure> groupMeasure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TriggerDefinition> definitionTriggerDefinition() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEvidenceVariable_Characteristic fromJson(Json json) {
    ImmutableEvidenceVariable_Characteristic.Builder builder = ImmutableEvidenceVariable_Characteristic.builder();
    if (json.definitionReferenceIsSet) {
      builder.definitionReference(json.definitionReference);
    }
    if (json.definitionExpressionIsSet) {
      builder.definitionExpression(json.definitionExpression);
    }
    if (json.participantEffectivePeriodIsSet) {
      builder.participantEffectivePeriod(json.participantEffectivePeriod);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.participantEffectiveDurationIsSet) {
      builder.participantEffectiveDuration(json.participantEffectiveDuration);
    }
    if (json.participantEffectiveTimingIsSet) {
      builder.participantEffectiveTiming(json.participantEffectiveTiming);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.timeFromStartIsSet) {
      builder.timeFromStart(json.timeFromStart);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.definitionCanonicalIsSet) {
      builder.definitionCanonical(json.definitionCanonical);
    }
    if (json.definitionCodeableConceptIsSet) {
      builder.definitionCodeableConcept(json.definitionCodeableConcept);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.excludeIsSet) {
      builder.exclude(json.exclude);
    }
    if (json.definitionDataRequirementIsSet) {
      builder.definitionDataRequirement(json.definitionDataRequirement);
    }
    if (json.usageContextIsSet) {
      builder.usageContext(json.usageContext);
    }
    if (json.participantEffectiveDateTimeIsSet) {
      builder.participantEffectiveDateTime(json.participantEffectiveDateTime);
    }
    if (json.groupMeasureIsSet) {
      builder.groupMeasure(json.groupMeasure);
    }
    if (json.definitionTriggerDefinitionIsSet) {
      builder.definitionTriggerDefinition(json.definitionTriggerDefinition);
    }
    return (ImmutableEvidenceVariable_Characteristic) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EvidenceVariable_Characteristic} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EvidenceVariable_Characteristic instance
   */
  public static EvidenceVariable_Characteristic copyOf(EvidenceVariable_Characteristic instance) {
    if (instance instanceof ImmutableEvidenceVariable_Characteristic) {
      return (ImmutableEvidenceVariable_Characteristic) instance;
    }
    return ImmutableEvidenceVariable_Characteristic.builder()
        .definitionReference(instance.definitionReference())
        .definitionExpression(instance.definitionExpression())
        .participantEffectivePeriod(instance.participantEffectivePeriod())
        .extension(instance.extension())
        .participantEffectiveDuration(instance.participantEffectiveDuration())
        .participantEffectiveTiming(instance.participantEffectiveTiming())
        .id(instance.id())
        .timeFromStart(instance.timeFromStart())
        .modifierExtension(instance.modifierExtension())
        .definitionCanonical(instance.definitionCanonical())
        .definitionCodeableConcept(instance.definitionCodeableConcept())
        .description(instance.description())
        .exclude(instance.exclude())
        .definitionDataRequirement(instance.definitionDataRequirement())
        .usageContext(instance.usageContext())
        .participantEffectiveDateTime(instance.participantEffectiveDateTime())
        .groupMeasure(instance.groupMeasure())
        .definitionTriggerDefinition(instance.definitionTriggerDefinition())
        .build();
  }

  /**
   * Creates a builder for {@link EvidenceVariable_Characteristic EvidenceVariable_Characteristic}.
   * <pre>
   * ImmutableEvidenceVariable_Characteristic.builder()
   *    .definitionReference(com.fhir.Reference) // optional {@link EvidenceVariable_Characteristic#definitionReference() definitionReference}
   *    .definitionExpression(com.fhir.Expression) // optional {@link EvidenceVariable_Characteristic#definitionExpression() definitionExpression}
   *    .participantEffectivePeriod(com.fhir.Period) // optional {@link EvidenceVariable_Characteristic#participantEffectivePeriod() participantEffectivePeriod}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link EvidenceVariable_Characteristic#extension() extension}
   *    .participantEffectiveDuration(com.fhir.Duration) // optional {@link EvidenceVariable_Characteristic#participantEffectiveDuration() participantEffectiveDuration}
   *    .participantEffectiveTiming(com.fhir.Timing) // optional {@link EvidenceVariable_Characteristic#participantEffectiveTiming() participantEffectiveTiming}
   *    .id(String) // optional {@link EvidenceVariable_Characteristic#id() id}
   *    .timeFromStart(com.fhir.Duration) // optional {@link EvidenceVariable_Characteristic#timeFromStart() timeFromStart}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link EvidenceVariable_Characteristic#modifierExtension() modifierExtension}
   *    .definitionCanonical(String) // optional {@link EvidenceVariable_Characteristic#definitionCanonical() definitionCanonical}
   *    .definitionCodeableConcept(com.fhir.CodeableConcept) // optional {@link EvidenceVariable_Characteristic#definitionCodeableConcept() definitionCodeableConcept}
   *    .description(String) // optional {@link EvidenceVariable_Characteristic#description() description}
   *    .exclude(Boolean) // optional {@link EvidenceVariable_Characteristic#exclude() exclude}
   *    .definitionDataRequirement(com.fhir.DataRequirement) // optional {@link EvidenceVariable_Characteristic#definitionDataRequirement() definitionDataRequirement}
   *    .usageContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link EvidenceVariable_Characteristic#usageContext() usageContext}
   *    .participantEffectiveDateTime(String) // optional {@link EvidenceVariable_Characteristic#participantEffectiveDateTime() participantEffectiveDateTime}
   *    .groupMeasure(com.fhir.Evidencevariable_characteristicGroupmeasure) // optional {@link EvidenceVariable_Characteristic#groupMeasure() groupMeasure}
   *    .definitionTriggerDefinition(com.fhir.TriggerDefinition) // optional {@link EvidenceVariable_Characteristic#definitionTriggerDefinition() definitionTriggerDefinition}
   *    .build();
   * </pre>
   * @return A new EvidenceVariable_Characteristic builder
   */
  public static ImmutableEvidenceVariable_Characteristic.Builder builder() {
    return new ImmutableEvidenceVariable_Characteristic.Builder();
  }

  /**
   * Builds instances of type {@link EvidenceVariable_Characteristic EvidenceVariable_Characteristic}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "EvidenceVariable_Characteristic", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DEFINITION_REFERENCE = 0x1L;
    private static final long OPT_BIT_DEFINITION_EXPRESSION = 0x2L;
    private static final long OPT_BIT_PARTICIPANT_EFFECTIVE_PERIOD = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_PARTICIPANT_EFFECTIVE_DURATION = 0x10L;
    private static final long OPT_BIT_PARTICIPANT_EFFECTIVE_TIMING = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_TIME_FROM_START = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_DEFINITION_CANONICAL = 0x200L;
    private static final long OPT_BIT_DEFINITION_CODEABLE_CONCEPT = 0x400L;
    private static final long OPT_BIT_DESCRIPTION = 0x800L;
    private static final long OPT_BIT_EXCLUDE = 0x1000L;
    private static final long OPT_BIT_DEFINITION_DATA_REQUIREMENT = 0x2000L;
    private static final long OPT_BIT_USAGE_CONTEXT = 0x4000L;
    private static final long OPT_BIT_PARTICIPANT_EFFECTIVE_DATE_TIME = 0x8000L;
    private static final long OPT_BIT_GROUP_MEASURE = 0x10000L;
    private static final long OPT_BIT_DEFINITION_TRIGGER_DEFINITION = 0x20000L;
    private long optBits;

    private @Nullable Reference definitionReference;
    private @Nullable Expression definitionExpression;
    private @Nullable Period participantEffectivePeriod;
    private @Nullable List<Extension> extension;
    private @Nullable Duration participantEffectiveDuration;
    private @Nullable Timing participantEffectiveTiming;
    private @Nullable String id;
    private @Nullable Duration timeFromStart;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String definitionCanonical;
    private @Nullable CodeableConcept definitionCodeableConcept;
    private @Nullable String description;
    private @Nullable Boolean exclude;
    private @Nullable DataRequirement definitionDataRequirement;
    private @Nullable List<UsageContext> usageContext;
    private @Nullable String participantEffectiveDateTime;
    private @Nullable Evidencevariable_characteristicGroupmeasure groupMeasure;
    private @Nullable TriggerDefinition definitionTriggerDefinition;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#definitionReference() definitionReference} to definitionReference.
     * @param definitionReference The value for definitionReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder definitionReference(Reference definitionReference) {
      checkNotIsSet(definitionReferenceIsSet(), "definitionReference");
      this.definitionReference = Objects.requireNonNull(definitionReference, "definitionReference");
      optBits |= OPT_BIT_DEFINITION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#definitionReference() definitionReference} to definitionReference.
     * @param definitionReference The value for definitionReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definitionReference")
    public final Builder definitionReference(Optional<? extends Reference> definitionReference) {
      checkNotIsSet(definitionReferenceIsSet(), "definitionReference");
      this.definitionReference = definitionReference.orElse(null);
      optBits |= OPT_BIT_DEFINITION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#definitionExpression() definitionExpression} to definitionExpression.
     * @param definitionExpression The value for definitionExpression
     * @return {@code this} builder for chained invocation
     */
    public final Builder definitionExpression(Expression definitionExpression) {
      checkNotIsSet(definitionExpressionIsSet(), "definitionExpression");
      this.definitionExpression = Objects.requireNonNull(definitionExpression, "definitionExpression");
      optBits |= OPT_BIT_DEFINITION_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#definitionExpression() definitionExpression} to definitionExpression.
     * @param definitionExpression The value for definitionExpression
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definitionExpression")
    public final Builder definitionExpression(Optional<? extends Expression> definitionExpression) {
      checkNotIsSet(definitionExpressionIsSet(), "definitionExpression");
      this.definitionExpression = definitionExpression.orElse(null);
      optBits |= OPT_BIT_DEFINITION_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#participantEffectivePeriod() participantEffectivePeriod} to participantEffectivePeriod.
     * @param participantEffectivePeriod The value for participantEffectivePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder participantEffectivePeriod(Period participantEffectivePeriod) {
      checkNotIsSet(participantEffectivePeriodIsSet(), "participantEffectivePeriod");
      this.participantEffectivePeriod = Objects.requireNonNull(participantEffectivePeriod, "participantEffectivePeriod");
      optBits |= OPT_BIT_PARTICIPANT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#participantEffectivePeriod() participantEffectivePeriod} to participantEffectivePeriod.
     * @param participantEffectivePeriod The value for participantEffectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participantEffectivePeriod")
    public final Builder participantEffectivePeriod(Optional<? extends Period> participantEffectivePeriod) {
      checkNotIsSet(participantEffectivePeriodIsSet(), "participantEffectivePeriod");
      this.participantEffectivePeriod = participantEffectivePeriod.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#extension() extension} to extension.
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
     * Initializes the optional value {@link EvidenceVariable_Characteristic#extension() extension} to extension.
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
     * Initializes the optional value {@link EvidenceVariable_Characteristic#participantEffectiveDuration() participantEffectiveDuration} to participantEffectiveDuration.
     * @param participantEffectiveDuration The value for participantEffectiveDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder participantEffectiveDuration(Duration participantEffectiveDuration) {
      checkNotIsSet(participantEffectiveDurationIsSet(), "participantEffectiveDuration");
      this.participantEffectiveDuration = Objects.requireNonNull(participantEffectiveDuration, "participantEffectiveDuration");
      optBits |= OPT_BIT_PARTICIPANT_EFFECTIVE_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#participantEffectiveDuration() participantEffectiveDuration} to participantEffectiveDuration.
     * @param participantEffectiveDuration The value for participantEffectiveDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participantEffectiveDuration")
    public final Builder participantEffectiveDuration(Optional<? extends Duration> participantEffectiveDuration) {
      checkNotIsSet(participantEffectiveDurationIsSet(), "participantEffectiveDuration");
      this.participantEffectiveDuration = participantEffectiveDuration.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT_EFFECTIVE_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#participantEffectiveTiming() participantEffectiveTiming} to participantEffectiveTiming.
     * @param participantEffectiveTiming The value for participantEffectiveTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder participantEffectiveTiming(Timing participantEffectiveTiming) {
      checkNotIsSet(participantEffectiveTimingIsSet(), "participantEffectiveTiming");
      this.participantEffectiveTiming = Objects.requireNonNull(participantEffectiveTiming, "participantEffectiveTiming");
      optBits |= OPT_BIT_PARTICIPANT_EFFECTIVE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#participantEffectiveTiming() participantEffectiveTiming} to participantEffectiveTiming.
     * @param participantEffectiveTiming The value for participantEffectiveTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participantEffectiveTiming")
    public final Builder participantEffectiveTiming(Optional<? extends Timing> participantEffectiveTiming) {
      checkNotIsSet(participantEffectiveTimingIsSet(), "participantEffectiveTiming");
      this.participantEffectiveTiming = participantEffectiveTiming.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT_EFFECTIVE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#id() id} to id.
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
     * Initializes the optional value {@link EvidenceVariable_Characteristic#id() id} to id.
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
     * Initializes the optional value {@link EvidenceVariable_Characteristic#timeFromStart() timeFromStart} to timeFromStart.
     * @param timeFromStart The value for timeFromStart
     * @return {@code this} builder for chained invocation
     */
    public final Builder timeFromStart(Duration timeFromStart) {
      checkNotIsSet(timeFromStartIsSet(), "timeFromStart");
      this.timeFromStart = Objects.requireNonNull(timeFromStart, "timeFromStart");
      optBits |= OPT_BIT_TIME_FROM_START;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#timeFromStart() timeFromStart} to timeFromStart.
     * @param timeFromStart The value for timeFromStart
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timeFromStart")
    public final Builder timeFromStart(Optional<? extends Duration> timeFromStart) {
      checkNotIsSet(timeFromStartIsSet(), "timeFromStart");
      this.timeFromStart = timeFromStart.orElse(null);
      optBits |= OPT_BIT_TIME_FROM_START;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EvidenceVariable_Characteristic#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EvidenceVariable_Characteristic#definitionCanonical() definitionCanonical} to definitionCanonical.
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
     * Initializes the optional value {@link EvidenceVariable_Characteristic#definitionCanonical() definitionCanonical} to definitionCanonical.
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
     * Initializes the optional value {@link EvidenceVariable_Characteristic#definitionCodeableConcept() definitionCodeableConcept} to definitionCodeableConcept.
     * @param definitionCodeableConcept The value for definitionCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder definitionCodeableConcept(CodeableConcept definitionCodeableConcept) {
      checkNotIsSet(definitionCodeableConceptIsSet(), "definitionCodeableConcept");
      this.definitionCodeableConcept = Objects.requireNonNull(definitionCodeableConcept, "definitionCodeableConcept");
      optBits |= OPT_BIT_DEFINITION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#definitionCodeableConcept() definitionCodeableConcept} to definitionCodeableConcept.
     * @param definitionCodeableConcept The value for definitionCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definitionCodeableConcept")
    public final Builder definitionCodeableConcept(Optional<? extends CodeableConcept> definitionCodeableConcept) {
      checkNotIsSet(definitionCodeableConceptIsSet(), "definitionCodeableConcept");
      this.definitionCodeableConcept = definitionCodeableConcept.orElse(null);
      optBits |= OPT_BIT_DEFINITION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#description() description} to description.
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
     * Initializes the optional value {@link EvidenceVariable_Characteristic#description() description} to description.
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
     * Initializes the optional value {@link EvidenceVariable_Characteristic#exclude() exclude} to exclude.
     * @param exclude The value for exclude
     * @return {@code this} builder for chained invocation
     */
    public final Builder exclude(boolean exclude) {
      checkNotIsSet(excludeIsSet(), "exclude");
      this.exclude = exclude;
      optBits |= OPT_BIT_EXCLUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#exclude() exclude} to exclude.
     * @param exclude The value for exclude
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("exclude")
    public final Builder exclude(Optional<Boolean> exclude) {
      checkNotIsSet(excludeIsSet(), "exclude");
      this.exclude = exclude.orElse(null);
      optBits |= OPT_BIT_EXCLUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#definitionDataRequirement() definitionDataRequirement} to definitionDataRequirement.
     * @param definitionDataRequirement The value for definitionDataRequirement
     * @return {@code this} builder for chained invocation
     */
    public final Builder definitionDataRequirement(DataRequirement definitionDataRequirement) {
      checkNotIsSet(definitionDataRequirementIsSet(), "definitionDataRequirement");
      this.definitionDataRequirement = Objects.requireNonNull(definitionDataRequirement, "definitionDataRequirement");
      optBits |= OPT_BIT_DEFINITION_DATA_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#definitionDataRequirement() definitionDataRequirement} to definitionDataRequirement.
     * @param definitionDataRequirement The value for definitionDataRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definitionDataRequirement")
    public final Builder definitionDataRequirement(Optional<? extends DataRequirement> definitionDataRequirement) {
      checkNotIsSet(definitionDataRequirementIsSet(), "definitionDataRequirement");
      this.definitionDataRequirement = definitionDataRequirement.orElse(null);
      optBits |= OPT_BIT_DEFINITION_DATA_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#usageContext() usageContext} to usageContext.
     * @param usageContext The value for usageContext
     * @return {@code this} builder for chained invocation
     */
    public final Builder usageContext(List<UsageContext> usageContext) {
      checkNotIsSet(usageContextIsSet(), "usageContext");
      this.usageContext = Objects.requireNonNull(usageContext, "usageContext");
      optBits |= OPT_BIT_USAGE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#usageContext() usageContext} to usageContext.
     * @param usageContext The value for usageContext
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("usageContext")
    public final Builder usageContext(Optional<? extends List<UsageContext>> usageContext) {
      checkNotIsSet(usageContextIsSet(), "usageContext");
      this.usageContext = usageContext.orElse(null);
      optBits |= OPT_BIT_USAGE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#participantEffectiveDateTime() participantEffectiveDateTime} to participantEffectiveDateTime.
     * @param participantEffectiveDateTime The value for participantEffectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder participantEffectiveDateTime(String participantEffectiveDateTime) {
      checkNotIsSet(participantEffectiveDateTimeIsSet(), "participantEffectiveDateTime");
      this.participantEffectiveDateTime = Objects.requireNonNull(participantEffectiveDateTime, "participantEffectiveDateTime");
      optBits |= OPT_BIT_PARTICIPANT_EFFECTIVE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#participantEffectiveDateTime() participantEffectiveDateTime} to participantEffectiveDateTime.
     * @param participantEffectiveDateTime The value for participantEffectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participantEffectiveDateTime")
    public final Builder participantEffectiveDateTime(Optional<String> participantEffectiveDateTime) {
      checkNotIsSet(participantEffectiveDateTimeIsSet(), "participantEffectiveDateTime");
      this.participantEffectiveDateTime = participantEffectiveDateTime.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT_EFFECTIVE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#groupMeasure() groupMeasure} to groupMeasure.
     * @param groupMeasure The value for groupMeasure
     * @return {@code this} builder for chained invocation
     */
    public final Builder groupMeasure(Evidencevariable_characteristicGroupmeasure groupMeasure) {
      checkNotIsSet(groupMeasureIsSet(), "groupMeasure");
      this.groupMeasure = Objects.requireNonNull(groupMeasure, "groupMeasure");
      optBits |= OPT_BIT_GROUP_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#groupMeasure() groupMeasure} to groupMeasure.
     * @param groupMeasure The value for groupMeasure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("groupMeasure")
    public final Builder groupMeasure(Optional<? extends Evidencevariable_characteristicGroupmeasure> groupMeasure) {
      checkNotIsSet(groupMeasureIsSet(), "groupMeasure");
      this.groupMeasure = groupMeasure.orElse(null);
      optBits |= OPT_BIT_GROUP_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#definitionTriggerDefinition() definitionTriggerDefinition} to definitionTriggerDefinition.
     * @param definitionTriggerDefinition The value for definitionTriggerDefinition
     * @return {@code this} builder for chained invocation
     */
    public final Builder definitionTriggerDefinition(TriggerDefinition definitionTriggerDefinition) {
      checkNotIsSet(definitionTriggerDefinitionIsSet(), "definitionTriggerDefinition");
      this.definitionTriggerDefinition = Objects.requireNonNull(definitionTriggerDefinition, "definitionTriggerDefinition");
      optBits |= OPT_BIT_DEFINITION_TRIGGER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable_Characteristic#definitionTriggerDefinition() definitionTriggerDefinition} to definitionTriggerDefinition.
     * @param definitionTriggerDefinition The value for definitionTriggerDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definitionTriggerDefinition")
    public final Builder definitionTriggerDefinition(Optional<? extends TriggerDefinition> definitionTriggerDefinition) {
      checkNotIsSet(definitionTriggerDefinitionIsSet(), "definitionTriggerDefinition");
      this.definitionTriggerDefinition = definitionTriggerDefinition.orElse(null);
      optBits |= OPT_BIT_DEFINITION_TRIGGER_DEFINITION;
      return this;
    }

    /**
     * Builds a new {@link EvidenceVariable_Characteristic EvidenceVariable_Characteristic}.
     * @return An immutable instance of EvidenceVariable_Characteristic
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public EvidenceVariable_Characteristic build() {
      return new ImmutableEvidenceVariable_Characteristic(
          definitionReference,
          definitionExpression,
          participantEffectivePeriod,
          extension,
          participantEffectiveDuration,
          participantEffectiveTiming,
          id,
          timeFromStart,
          modifierExtension,
          definitionCanonical,
          definitionCodeableConcept,
          description,
          exclude,
          definitionDataRequirement,
          usageContext,
          participantEffectiveDateTime,
          groupMeasure,
          definitionTriggerDefinition);
    }

    private boolean definitionReferenceIsSet() {
      return (optBits & OPT_BIT_DEFINITION_REFERENCE) != 0;
    }

    private boolean definitionExpressionIsSet() {
      return (optBits & OPT_BIT_DEFINITION_EXPRESSION) != 0;
    }

    private boolean participantEffectivePeriodIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean participantEffectiveDurationIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT_EFFECTIVE_DURATION) != 0;
    }

    private boolean participantEffectiveTimingIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT_EFFECTIVE_TIMING) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean timeFromStartIsSet() {
      return (optBits & OPT_BIT_TIME_FROM_START) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean definitionCanonicalIsSet() {
      return (optBits & OPT_BIT_DEFINITION_CANONICAL) != 0;
    }

    private boolean definitionCodeableConceptIsSet() {
      return (optBits & OPT_BIT_DEFINITION_CODEABLE_CONCEPT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean excludeIsSet() {
      return (optBits & OPT_BIT_EXCLUDE) != 0;
    }

    private boolean definitionDataRequirementIsSet() {
      return (optBits & OPT_BIT_DEFINITION_DATA_REQUIREMENT) != 0;
    }

    private boolean usageContextIsSet() {
      return (optBits & OPT_BIT_USAGE_CONTEXT) != 0;
    }

    private boolean participantEffectiveDateTimeIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT_EFFECTIVE_DATE_TIME) != 0;
    }

    private boolean groupMeasureIsSet() {
      return (optBits & OPT_BIT_GROUP_MEASURE) != 0;
    }

    private boolean definitionTriggerDefinitionIsSet() {
      return (optBits & OPT_BIT_DEFINITION_TRIGGER_DEFINITION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of EvidenceVariable_Characteristic is strict, attribute is already set: ".concat(name));
    }
  }
}
