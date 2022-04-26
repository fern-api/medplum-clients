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
 * Immutable implementation of {@link ResearchElementDefinition_Characteristic}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableResearchElementDefinition_Characteristic.builder()}.
 */
@Generated(from = "ResearchElementDefinition_Characteristic", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableResearchElementDefinition_Characteristic
    implements ResearchElementDefinition_Characteristic {
  private final @Nullable CodeableConcept unitOfMeasure;
  private final @Nullable Duration studyEffectiveTimeFromStart;
  private final @Nullable Duration studyEffectiveDuration;
  private final @Nullable Researchelementdefinition_characteristicParticipanteffectivegroupmeasure participantEffectiveGroupMeasure;
  private final @Nullable CodeableConcept definitionCodeableConcept;
  private final @Nullable Timing participantEffectiveTiming;
  private final @Nullable List<Extension> extension;
  private final @Nullable Period studyEffectivePeriod;
  private final @Nullable Researchelementdefinition_characteristicStudyeffectivegroupmeasure studyEffectiveGroupMeasure;
  private final @Nullable String id;
  private final @Nullable Timing studyEffectiveTiming;
  private final @Nullable Expression definitionExpression;
  private final @Nullable String participantEffectiveDateTime;
  private final @Nullable String participantEffectiveDescription;
  private final @Nullable String studyEffectiveDescription;
  private final @Nullable Period participantEffectivePeriod;
  private final @Nullable List<UsageContext> usageContext;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable DataRequirement definitionDataRequirement;
  private final @Nullable String definitionCanonical;
  private final @Nullable Boolean exclude;
  private final @Nullable Duration participantEffectiveTimeFromStart;
  private final @Nullable String studyEffectiveDateTime;
  private final @Nullable Duration participantEffectiveDuration;

  private ImmutableResearchElementDefinition_Characteristic(
      @Nullable CodeableConcept unitOfMeasure,
      @Nullable Duration studyEffectiveTimeFromStart,
      @Nullable Duration studyEffectiveDuration,
      @Nullable Researchelementdefinition_characteristicParticipanteffectivegroupmeasure participantEffectiveGroupMeasure,
      @Nullable CodeableConcept definitionCodeableConcept,
      @Nullable Timing participantEffectiveTiming,
      @Nullable List<Extension> extension,
      @Nullable Period studyEffectivePeriod,
      @Nullable Researchelementdefinition_characteristicStudyeffectivegroupmeasure studyEffectiveGroupMeasure,
      @Nullable String id,
      @Nullable Timing studyEffectiveTiming,
      @Nullable Expression definitionExpression,
      @Nullable String participantEffectiveDateTime,
      @Nullable String participantEffectiveDescription,
      @Nullable String studyEffectiveDescription,
      @Nullable Period participantEffectivePeriod,
      @Nullable List<UsageContext> usageContext,
      @Nullable List<Extension> modifierExtension,
      @Nullable DataRequirement definitionDataRequirement,
      @Nullable String definitionCanonical,
      @Nullable Boolean exclude,
      @Nullable Duration participantEffectiveTimeFromStart,
      @Nullable String studyEffectiveDateTime,
      @Nullable Duration participantEffectiveDuration) {
    this.unitOfMeasure = unitOfMeasure;
    this.studyEffectiveTimeFromStart = studyEffectiveTimeFromStart;
    this.studyEffectiveDuration = studyEffectiveDuration;
    this.participantEffectiveGroupMeasure = participantEffectiveGroupMeasure;
    this.definitionCodeableConcept = definitionCodeableConcept;
    this.participantEffectiveTiming = participantEffectiveTiming;
    this.extension = extension;
    this.studyEffectivePeriod = studyEffectivePeriod;
    this.studyEffectiveGroupMeasure = studyEffectiveGroupMeasure;
    this.id = id;
    this.studyEffectiveTiming = studyEffectiveTiming;
    this.definitionExpression = definitionExpression;
    this.participantEffectiveDateTime = participantEffectiveDateTime;
    this.participantEffectiveDescription = participantEffectiveDescription;
    this.studyEffectiveDescription = studyEffectiveDescription;
    this.participantEffectivePeriod = participantEffectivePeriod;
    this.usageContext = usageContext;
    this.modifierExtension = modifierExtension;
    this.definitionDataRequirement = definitionDataRequirement;
    this.definitionCanonical = definitionCanonical;
    this.exclude = exclude;
    this.participantEffectiveTimeFromStart = participantEffectiveTimeFromStart;
    this.studyEffectiveDateTime = studyEffectiveDateTime;
    this.participantEffectiveDuration = participantEffectiveDuration;
  }

  /**
   * @return The value of the {@code unitOfMeasure} attribute
   */
  @JsonProperty("unitOfMeasure")
  @Override
  public Optional<CodeableConcept> unitOfMeasure() {
    return Optional.ofNullable(unitOfMeasure);
  }

  /**
   * @return The value of the {@code studyEffectiveTimeFromStart} attribute
   */
  @JsonProperty("studyEffectiveTimeFromStart")
  @Override
  public Optional<Duration> studyEffectiveTimeFromStart() {
    return Optional.ofNullable(studyEffectiveTimeFromStart);
  }

  /**
   * @return The value of the {@code studyEffectiveDuration} attribute
   */
  @JsonProperty("studyEffectiveDuration")
  @Override
  public Optional<Duration> studyEffectiveDuration() {
    return Optional.ofNullable(studyEffectiveDuration);
  }

  /**
   * @return The value of the {@code participantEffectiveGroupMeasure} attribute
   */
  @JsonProperty("participantEffectiveGroupMeasure")
  @Override
  public Optional<Researchelementdefinition_characteristicParticipanteffectivegroupmeasure> participantEffectiveGroupMeasure() {
    return Optional.ofNullable(participantEffectiveGroupMeasure);
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
   * @return The value of the {@code participantEffectiveTiming} attribute
   */
  @JsonProperty("participantEffectiveTiming")
  @Override
  public Optional<Timing> participantEffectiveTiming() {
    return Optional.ofNullable(participantEffectiveTiming);
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
   * @return The value of the {@code studyEffectivePeriod} attribute
   */
  @JsonProperty("studyEffectivePeriod")
  @Override
  public Optional<Period> studyEffectivePeriod() {
    return Optional.ofNullable(studyEffectivePeriod);
  }

  /**
   * @return The value of the {@code studyEffectiveGroupMeasure} attribute
   */
  @JsonProperty("studyEffectiveGroupMeasure")
  @Override
  public Optional<Researchelementdefinition_characteristicStudyeffectivegroupmeasure> studyEffectiveGroupMeasure() {
    return Optional.ofNullable(studyEffectiveGroupMeasure);
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
   * @return The value of the {@code studyEffectiveTiming} attribute
   */
  @JsonProperty("studyEffectiveTiming")
  @Override
  public Optional<Timing> studyEffectiveTiming() {
    return Optional.ofNullable(studyEffectiveTiming);
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
   * @return The value of the {@code participantEffectiveDateTime} attribute
   */
  @JsonProperty("participantEffectiveDateTime")
  @Override
  public Optional<String> participantEffectiveDateTime() {
    return Optional.ofNullable(participantEffectiveDateTime);
  }

  /**
   * @return The value of the {@code participantEffectiveDescription} attribute
   */
  @JsonProperty("participantEffectiveDescription")
  @Override
  public Optional<String> participantEffectiveDescription() {
    return Optional.ofNullable(participantEffectiveDescription);
  }

  /**
   * @return The value of the {@code studyEffectiveDescription} attribute
   */
  @JsonProperty("studyEffectiveDescription")
  @Override
  public Optional<String> studyEffectiveDescription() {
    return Optional.ofNullable(studyEffectiveDescription);
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
   * @return The value of the {@code usageContext} attribute
   */
  @JsonProperty("usageContext")
  @Override
  public Optional<List<UsageContext>> usageContext() {
    return Optional.ofNullable(usageContext);
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
   * @return The value of the {@code definitionDataRequirement} attribute
   */
  @JsonProperty("definitionDataRequirement")
  @Override
  public Optional<DataRequirement> definitionDataRequirement() {
    return Optional.ofNullable(definitionDataRequirement);
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
   * @return The value of the {@code exclude} attribute
   */
  @JsonProperty("exclude")
  @Override
  public Optional<Boolean> exclude() {
    return Optional.ofNullable(exclude);
  }

  /**
   * @return The value of the {@code participantEffectiveTimeFromStart} attribute
   */
  @JsonProperty("participantEffectiveTimeFromStart")
  @Override
  public Optional<Duration> participantEffectiveTimeFromStart() {
    return Optional.ofNullable(participantEffectiveTimeFromStart);
  }

  /**
   * @return The value of the {@code studyEffectiveDateTime} attribute
   */
  @JsonProperty("studyEffectiveDateTime")
  @Override
  public Optional<String> studyEffectiveDateTime() {
    return Optional.ofNullable(studyEffectiveDateTime);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#unitOfMeasure() unitOfMeasure} attribute.
   * @param value The value for unitOfMeasure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withUnitOfMeasure(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "unitOfMeasure");
    if (this.unitOfMeasure == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        newValue,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#unitOfMeasure() unitOfMeasure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitOfMeasure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withUnitOfMeasure(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.unitOfMeasure == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        value,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#studyEffectiveTimeFromStart() studyEffectiveTimeFromStart} attribute.
   * @param value The value for studyEffectiveTimeFromStart
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withStudyEffectiveTimeFromStart(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "studyEffectiveTimeFromStart");
    if (this.studyEffectiveTimeFromStart == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        newValue,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#studyEffectiveTimeFromStart() studyEffectiveTimeFromStart} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for studyEffectiveTimeFromStart
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withStudyEffectiveTimeFromStart(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.studyEffectiveTimeFromStart == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        value,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#studyEffectiveDuration() studyEffectiveDuration} attribute.
   * @param value The value for studyEffectiveDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withStudyEffectiveDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "studyEffectiveDuration");
    if (this.studyEffectiveDuration == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        newValue,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#studyEffectiveDuration() studyEffectiveDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for studyEffectiveDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withStudyEffectiveDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.studyEffectiveDuration == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        value,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#participantEffectiveGroupMeasure() participantEffectiveGroupMeasure} attribute.
   * @param value The value for participantEffectiveGroupMeasure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withParticipantEffectiveGroupMeasure(Researchelementdefinition_characteristicParticipanteffectivegroupmeasure value) {
    @Nullable Researchelementdefinition_characteristicParticipanteffectivegroupmeasure newValue = Objects.requireNonNull(value, "participantEffectiveGroupMeasure");
    if (this.participantEffectiveGroupMeasure == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        newValue,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#participantEffectiveGroupMeasure() participantEffectiveGroupMeasure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participantEffectiveGroupMeasure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withParticipantEffectiveGroupMeasure(Optional<? extends Researchelementdefinition_characteristicParticipanteffectivegroupmeasure> optional) {
    @Nullable Researchelementdefinition_characteristicParticipanteffectivegroupmeasure value = optional.orElse(null);
    if (this.participantEffectiveGroupMeasure == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        value,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#definitionCodeableConcept() definitionCodeableConcept} attribute.
   * @param value The value for definitionCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withDefinitionCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "definitionCodeableConcept");
    if (this.definitionCodeableConcept == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        newValue,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#definitionCodeableConcept() definitionCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withDefinitionCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.definitionCodeableConcept == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        value,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#participantEffectiveTiming() participantEffectiveTiming} attribute.
   * @param value The value for participantEffectiveTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withParticipantEffectiveTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "participantEffectiveTiming");
    if (this.participantEffectiveTiming == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        newValue,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#participantEffectiveTiming() participantEffectiveTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participantEffectiveTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withParticipantEffectiveTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.participantEffectiveTiming == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        value,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        newValue,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        value,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#studyEffectivePeriod() studyEffectivePeriod} attribute.
   * @param value The value for studyEffectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withStudyEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "studyEffectivePeriod");
    if (this.studyEffectivePeriod == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        newValue,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#studyEffectivePeriod() studyEffectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for studyEffectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withStudyEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.studyEffectivePeriod == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        value,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#studyEffectiveGroupMeasure() studyEffectiveGroupMeasure} attribute.
   * @param value The value for studyEffectiveGroupMeasure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withStudyEffectiveGroupMeasure(Researchelementdefinition_characteristicStudyeffectivegroupmeasure value) {
    @Nullable Researchelementdefinition_characteristicStudyeffectivegroupmeasure newValue = Objects.requireNonNull(value, "studyEffectiveGroupMeasure");
    if (this.studyEffectiveGroupMeasure == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        newValue,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#studyEffectiveGroupMeasure() studyEffectiveGroupMeasure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for studyEffectiveGroupMeasure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withStudyEffectiveGroupMeasure(Optional<? extends Researchelementdefinition_characteristicStudyeffectivegroupmeasure> optional) {
    @Nullable Researchelementdefinition_characteristicStudyeffectivegroupmeasure value = optional.orElse(null);
    if (this.studyEffectiveGroupMeasure == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        value,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        newValue,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        value,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#studyEffectiveTiming() studyEffectiveTiming} attribute.
   * @param value The value for studyEffectiveTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withStudyEffectiveTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "studyEffectiveTiming");
    if (this.studyEffectiveTiming == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        newValue,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#studyEffectiveTiming() studyEffectiveTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for studyEffectiveTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withStudyEffectiveTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.studyEffectiveTiming == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        value,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#definitionExpression() definitionExpression} attribute.
   * @param value The value for definitionExpression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withDefinitionExpression(Expression value) {
    @Nullable Expression newValue = Objects.requireNonNull(value, "definitionExpression");
    if (this.definitionExpression == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        newValue,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#definitionExpression() definitionExpression} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionExpression
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withDefinitionExpression(Optional<? extends Expression> optional) {
    @Nullable Expression value = optional.orElse(null);
    if (this.definitionExpression == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        value,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#participantEffectiveDateTime() participantEffectiveDateTime} attribute.
   * @param value The value for participantEffectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withParticipantEffectiveDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "participantEffectiveDateTime");
    if (Objects.equals(this.participantEffectiveDateTime, newValue)) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        newValue,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#participantEffectiveDateTime() participantEffectiveDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participantEffectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withParticipantEffectiveDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.participantEffectiveDateTime, value)) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        value,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#participantEffectiveDescription() participantEffectiveDescription} attribute.
   * @param value The value for participantEffectiveDescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withParticipantEffectiveDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "participantEffectiveDescription");
    if (Objects.equals(this.participantEffectiveDescription, newValue)) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        newValue,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#participantEffectiveDescription() participantEffectiveDescription} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participantEffectiveDescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withParticipantEffectiveDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.participantEffectiveDescription, value)) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        value,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#studyEffectiveDescription() studyEffectiveDescription} attribute.
   * @param value The value for studyEffectiveDescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withStudyEffectiveDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "studyEffectiveDescription");
    if (Objects.equals(this.studyEffectiveDescription, newValue)) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        newValue,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#studyEffectiveDescription() studyEffectiveDescription} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for studyEffectiveDescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withStudyEffectiveDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.studyEffectiveDescription, value)) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        value,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#participantEffectivePeriod() participantEffectivePeriod} attribute.
   * @param value The value for participantEffectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withParticipantEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "participantEffectivePeriod");
    if (this.participantEffectivePeriod == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        newValue,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#participantEffectivePeriod() participantEffectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participantEffectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withParticipantEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.participantEffectivePeriod == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        value,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#usageContext() usageContext} attribute.
   * @param value The value for usageContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withUsageContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "usageContext");
    if (this.usageContext == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        newValue,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#usageContext() usageContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usageContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withUsageContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.usageContext == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        value,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        newValue,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        value,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#definitionDataRequirement() definitionDataRequirement} attribute.
   * @param value The value for definitionDataRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withDefinitionDataRequirement(DataRequirement value) {
    @Nullable DataRequirement newValue = Objects.requireNonNull(value, "definitionDataRequirement");
    if (this.definitionDataRequirement == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        newValue,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#definitionDataRequirement() definitionDataRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionDataRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withDefinitionDataRequirement(Optional<? extends DataRequirement> optional) {
    @Nullable DataRequirement value = optional.orElse(null);
    if (this.definitionDataRequirement == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        value,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#definitionCanonical() definitionCanonical} attribute.
   * @param value The value for definitionCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withDefinitionCanonical(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "definitionCanonical");
    if (Objects.equals(this.definitionCanonical, newValue)) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        newValue,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#definitionCanonical() definitionCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withDefinitionCanonical(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.definitionCanonical, value)) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        value,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#exclude() exclude} attribute.
   * @param value The value for exclude
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withExclude(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.exclude, newValue)) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        newValue,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#exclude() exclude} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exclude
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withExclude(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.exclude, value)) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        value,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#participantEffectiveTimeFromStart() participantEffectiveTimeFromStart} attribute.
   * @param value The value for participantEffectiveTimeFromStart
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withParticipantEffectiveTimeFromStart(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "participantEffectiveTimeFromStart");
    if (this.participantEffectiveTimeFromStart == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        newValue,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#participantEffectiveTimeFromStart() participantEffectiveTimeFromStart} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participantEffectiveTimeFromStart
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withParticipantEffectiveTimeFromStart(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.participantEffectiveTimeFromStart == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        value,
        this.studyEffectiveDateTime,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#studyEffectiveDateTime() studyEffectiveDateTime} attribute.
   * @param value The value for studyEffectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withStudyEffectiveDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "studyEffectiveDateTime");
    if (Objects.equals(this.studyEffectiveDateTime, newValue)) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        newValue,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#studyEffectiveDateTime() studyEffectiveDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for studyEffectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withStudyEffectiveDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.studyEffectiveDateTime, value)) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        value,
        this.participantEffectiveDuration);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition_Characteristic#participantEffectiveDuration() participantEffectiveDuration} attribute.
   * @param value The value for participantEffectiveDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition_Characteristic withParticipantEffectiveDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "participantEffectiveDuration");
    if (this.participantEffectiveDuration == newValue) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition_Characteristic#participantEffectiveDuration() participantEffectiveDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participantEffectiveDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition_Characteristic withParticipantEffectiveDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.participantEffectiveDuration == value) return this;
    return new ImmutableResearchElementDefinition_Characteristic(
        this.unitOfMeasure,
        this.studyEffectiveTimeFromStart,
        this.studyEffectiveDuration,
        this.participantEffectiveGroupMeasure,
        this.definitionCodeableConcept,
        this.participantEffectiveTiming,
        this.extension,
        this.studyEffectivePeriod,
        this.studyEffectiveGroupMeasure,
        this.id,
        this.studyEffectiveTiming,
        this.definitionExpression,
        this.participantEffectiveDateTime,
        this.participantEffectiveDescription,
        this.studyEffectiveDescription,
        this.participantEffectivePeriod,
        this.usageContext,
        this.modifierExtension,
        this.definitionDataRequirement,
        this.definitionCanonical,
        this.exclude,
        this.participantEffectiveTimeFromStart,
        this.studyEffectiveDateTime,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableResearchElementDefinition_Characteristic} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableResearchElementDefinition_Characteristic
        && equalTo((ImmutableResearchElementDefinition_Characteristic) another);
  }

  private boolean equalTo(ImmutableResearchElementDefinition_Characteristic another) {
    return Objects.equals(unitOfMeasure, another.unitOfMeasure)
        && Objects.equals(studyEffectiveTimeFromStart, another.studyEffectiveTimeFromStart)
        && Objects.equals(studyEffectiveDuration, another.studyEffectiveDuration)
        && Objects.equals(participantEffectiveGroupMeasure, another.participantEffectiveGroupMeasure)
        && Objects.equals(definitionCodeableConcept, another.definitionCodeableConcept)
        && Objects.equals(participantEffectiveTiming, another.participantEffectiveTiming)
        && Objects.equals(extension, another.extension)
        && Objects.equals(studyEffectivePeriod, another.studyEffectivePeriod)
        && Objects.equals(studyEffectiveGroupMeasure, another.studyEffectiveGroupMeasure)
        && Objects.equals(id, another.id)
        && Objects.equals(studyEffectiveTiming, another.studyEffectiveTiming)
        && Objects.equals(definitionExpression, another.definitionExpression)
        && Objects.equals(participantEffectiveDateTime, another.participantEffectiveDateTime)
        && Objects.equals(participantEffectiveDescription, another.participantEffectiveDescription)
        && Objects.equals(studyEffectiveDescription, another.studyEffectiveDescription)
        && Objects.equals(participantEffectivePeriod, another.participantEffectivePeriod)
        && Objects.equals(usageContext, another.usageContext)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(definitionDataRequirement, another.definitionDataRequirement)
        && Objects.equals(definitionCanonical, another.definitionCanonical)
        && Objects.equals(exclude, another.exclude)
        && Objects.equals(participantEffectiveTimeFromStart, another.participantEffectiveTimeFromStart)
        && Objects.equals(studyEffectiveDateTime, another.studyEffectiveDateTime)
        && Objects.equals(participantEffectiveDuration, another.participantEffectiveDuration);
  }

  /**
   * Computes a hash code from attributes: {@code unitOfMeasure}, {@code studyEffectiveTimeFromStart}, {@code studyEffectiveDuration}, {@code participantEffectiveGroupMeasure}, {@code definitionCodeableConcept}, {@code participantEffectiveTiming}, {@code extension}, {@code studyEffectivePeriod}, {@code studyEffectiveGroupMeasure}, {@code id}, {@code studyEffectiveTiming}, {@code definitionExpression}, {@code participantEffectiveDateTime}, {@code participantEffectiveDescription}, {@code studyEffectiveDescription}, {@code participantEffectivePeriod}, {@code usageContext}, {@code modifierExtension}, {@code definitionDataRequirement}, {@code definitionCanonical}, {@code exclude}, {@code participantEffectiveTimeFromStart}, {@code studyEffectiveDateTime}, {@code participantEffectiveDuration}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(unitOfMeasure);
    h += (h << 5) + Objects.hashCode(studyEffectiveTimeFromStart);
    h += (h << 5) + Objects.hashCode(studyEffectiveDuration);
    h += (h << 5) + Objects.hashCode(participantEffectiveGroupMeasure);
    h += (h << 5) + Objects.hashCode(definitionCodeableConcept);
    h += (h << 5) + Objects.hashCode(participantEffectiveTiming);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(studyEffectivePeriod);
    h += (h << 5) + Objects.hashCode(studyEffectiveGroupMeasure);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(studyEffectiveTiming);
    h += (h << 5) + Objects.hashCode(definitionExpression);
    h += (h << 5) + Objects.hashCode(participantEffectiveDateTime);
    h += (h << 5) + Objects.hashCode(participantEffectiveDescription);
    h += (h << 5) + Objects.hashCode(studyEffectiveDescription);
    h += (h << 5) + Objects.hashCode(participantEffectivePeriod);
    h += (h << 5) + Objects.hashCode(usageContext);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(definitionDataRequirement);
    h += (h << 5) + Objects.hashCode(definitionCanonical);
    h += (h << 5) + Objects.hashCode(exclude);
    h += (h << 5) + Objects.hashCode(participantEffectiveTimeFromStart);
    h += (h << 5) + Objects.hashCode(studyEffectiveDateTime);
    h += (h << 5) + Objects.hashCode(participantEffectiveDuration);
    return h;
  }

  /**
   * Prints the immutable value {@code ResearchElementDefinition_Characteristic} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ResearchElementDefinition_Characteristic{");
    if (unitOfMeasure != null) {
      builder.append("unitOfMeasure=").append(unitOfMeasure);
    }
    if (studyEffectiveTimeFromStart != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("studyEffectiveTimeFromStart=").append(studyEffectiveTimeFromStart);
    }
    if (studyEffectiveDuration != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("studyEffectiveDuration=").append(studyEffectiveDuration);
    }
    if (participantEffectiveGroupMeasure != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("participantEffectiveGroupMeasure=").append(participantEffectiveGroupMeasure);
    }
    if (definitionCodeableConcept != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("definitionCodeableConcept=").append(definitionCodeableConcept);
    }
    if (participantEffectiveTiming != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("participantEffectiveTiming=").append(participantEffectiveTiming);
    }
    if (extension != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (studyEffectivePeriod != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("studyEffectivePeriod=").append(studyEffectivePeriod);
    }
    if (studyEffectiveGroupMeasure != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("studyEffectiveGroupMeasure=").append(studyEffectiveGroupMeasure);
    }
    if (id != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (studyEffectiveTiming != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("studyEffectiveTiming=").append(studyEffectiveTiming);
    }
    if (definitionExpression != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("definitionExpression=").append(definitionExpression);
    }
    if (participantEffectiveDateTime != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("participantEffectiveDateTime=").append(participantEffectiveDateTime);
    }
    if (participantEffectiveDescription != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("participantEffectiveDescription=").append(participantEffectiveDescription);
    }
    if (studyEffectiveDescription != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("studyEffectiveDescription=").append(studyEffectiveDescription);
    }
    if (participantEffectivePeriod != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("participantEffectivePeriod=").append(participantEffectivePeriod);
    }
    if (usageContext != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("usageContext=").append(usageContext);
    }
    if (modifierExtension != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (definitionDataRequirement != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("definitionDataRequirement=").append(definitionDataRequirement);
    }
    if (definitionCanonical != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("definitionCanonical=").append(definitionCanonical);
    }
    if (exclude != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("exclude=").append(exclude);
    }
    if (participantEffectiveTimeFromStart != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("participantEffectiveTimeFromStart=").append(participantEffectiveTimeFromStart);
    }
    if (studyEffectiveDateTime != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("studyEffectiveDateTime=").append(studyEffectiveDateTime);
    }
    if (participantEffectiveDuration != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("participantEffectiveDuration=").append(participantEffectiveDuration);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ResearchElementDefinition_Characteristic", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ResearchElementDefinition_Characteristic {
    @Nullable Optional<CodeableConcept> unitOfMeasure = Optional.empty();
    boolean unitOfMeasureIsSet;
    @Nullable Optional<Duration> studyEffectiveTimeFromStart = Optional.empty();
    boolean studyEffectiveTimeFromStartIsSet;
    @Nullable Optional<Duration> studyEffectiveDuration = Optional.empty();
    boolean studyEffectiveDurationIsSet;
    @Nullable Optional<Researchelementdefinition_characteristicParticipanteffectivegroupmeasure> participantEffectiveGroupMeasure = Optional.empty();
    boolean participantEffectiveGroupMeasureIsSet;
    @Nullable Optional<CodeableConcept> definitionCodeableConcept = Optional.empty();
    boolean definitionCodeableConceptIsSet;
    @Nullable Optional<Timing> participantEffectiveTiming = Optional.empty();
    boolean participantEffectiveTimingIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Period> studyEffectivePeriod = Optional.empty();
    boolean studyEffectivePeriodIsSet;
    @Nullable Optional<Researchelementdefinition_characteristicStudyeffectivegroupmeasure> studyEffectiveGroupMeasure = Optional.empty();
    boolean studyEffectiveGroupMeasureIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Timing> studyEffectiveTiming = Optional.empty();
    boolean studyEffectiveTimingIsSet;
    @Nullable Optional<Expression> definitionExpression = Optional.empty();
    boolean definitionExpressionIsSet;
    @Nullable Optional<String> participantEffectiveDateTime = Optional.empty();
    boolean participantEffectiveDateTimeIsSet;
    @Nullable Optional<String> participantEffectiveDescription = Optional.empty();
    boolean participantEffectiveDescriptionIsSet;
    @Nullable Optional<String> studyEffectiveDescription = Optional.empty();
    boolean studyEffectiveDescriptionIsSet;
    @Nullable Optional<Period> participantEffectivePeriod = Optional.empty();
    boolean participantEffectivePeriodIsSet;
    @Nullable Optional<List<UsageContext>> usageContext = Optional.empty();
    boolean usageContextIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<DataRequirement> definitionDataRequirement = Optional.empty();
    boolean definitionDataRequirementIsSet;
    @Nullable Optional<String> definitionCanonical = Optional.empty();
    boolean definitionCanonicalIsSet;
    @Nullable Optional<Boolean> exclude = Optional.empty();
    boolean excludeIsSet;
    @Nullable Optional<Duration> participantEffectiveTimeFromStart = Optional.empty();
    boolean participantEffectiveTimeFromStartIsSet;
    @Nullable Optional<String> studyEffectiveDateTime = Optional.empty();
    boolean studyEffectiveDateTimeIsSet;
    @Nullable Optional<Duration> participantEffectiveDuration = Optional.empty();
    boolean participantEffectiveDurationIsSet;
    @JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(Optional<CodeableConcept> unitOfMeasure) {
      this.unitOfMeasure = unitOfMeasure;
      this.unitOfMeasureIsSet = true;
    }
    @JsonProperty("studyEffectiveTimeFromStart")
    public void setStudyEffectiveTimeFromStart(Optional<Duration> studyEffectiveTimeFromStart) {
      this.studyEffectiveTimeFromStart = studyEffectiveTimeFromStart;
      this.studyEffectiveTimeFromStartIsSet = true;
    }
    @JsonProperty("studyEffectiveDuration")
    public void setStudyEffectiveDuration(Optional<Duration> studyEffectiveDuration) {
      this.studyEffectiveDuration = studyEffectiveDuration;
      this.studyEffectiveDurationIsSet = true;
    }
    @JsonProperty("participantEffectiveGroupMeasure")
    public void setParticipantEffectiveGroupMeasure(Optional<Researchelementdefinition_characteristicParticipanteffectivegroupmeasure> participantEffectiveGroupMeasure) {
      this.participantEffectiveGroupMeasure = participantEffectiveGroupMeasure;
      this.participantEffectiveGroupMeasureIsSet = true;
    }
    @JsonProperty("definitionCodeableConcept")
    public void setDefinitionCodeableConcept(Optional<CodeableConcept> definitionCodeableConcept) {
      this.definitionCodeableConcept = definitionCodeableConcept;
      this.definitionCodeableConceptIsSet = true;
    }
    @JsonProperty("participantEffectiveTiming")
    public void setParticipantEffectiveTiming(Optional<Timing> participantEffectiveTiming) {
      this.participantEffectiveTiming = participantEffectiveTiming;
      this.participantEffectiveTimingIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("studyEffectivePeriod")
    public void setStudyEffectivePeriod(Optional<Period> studyEffectivePeriod) {
      this.studyEffectivePeriod = studyEffectivePeriod;
      this.studyEffectivePeriodIsSet = true;
    }
    @JsonProperty("studyEffectiveGroupMeasure")
    public void setStudyEffectiveGroupMeasure(Optional<Researchelementdefinition_characteristicStudyeffectivegroupmeasure> studyEffectiveGroupMeasure) {
      this.studyEffectiveGroupMeasure = studyEffectiveGroupMeasure;
      this.studyEffectiveGroupMeasureIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("studyEffectiveTiming")
    public void setStudyEffectiveTiming(Optional<Timing> studyEffectiveTiming) {
      this.studyEffectiveTiming = studyEffectiveTiming;
      this.studyEffectiveTimingIsSet = true;
    }
    @JsonProperty("definitionExpression")
    public void setDefinitionExpression(Optional<Expression> definitionExpression) {
      this.definitionExpression = definitionExpression;
      this.definitionExpressionIsSet = true;
    }
    @JsonProperty("participantEffectiveDateTime")
    public void setParticipantEffectiveDateTime(Optional<String> participantEffectiveDateTime) {
      this.participantEffectiveDateTime = participantEffectiveDateTime;
      this.participantEffectiveDateTimeIsSet = true;
    }
    @JsonProperty("participantEffectiveDescription")
    public void setParticipantEffectiveDescription(Optional<String> participantEffectiveDescription) {
      this.participantEffectiveDescription = participantEffectiveDescription;
      this.participantEffectiveDescriptionIsSet = true;
    }
    @JsonProperty("studyEffectiveDescription")
    public void setStudyEffectiveDescription(Optional<String> studyEffectiveDescription) {
      this.studyEffectiveDescription = studyEffectiveDescription;
      this.studyEffectiveDescriptionIsSet = true;
    }
    @JsonProperty("participantEffectivePeriod")
    public void setParticipantEffectivePeriod(Optional<Period> participantEffectivePeriod) {
      this.participantEffectivePeriod = participantEffectivePeriod;
      this.participantEffectivePeriodIsSet = true;
    }
    @JsonProperty("usageContext")
    public void setUsageContext(Optional<List<UsageContext>> usageContext) {
      this.usageContext = usageContext;
      this.usageContextIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("definitionDataRequirement")
    public void setDefinitionDataRequirement(Optional<DataRequirement> definitionDataRequirement) {
      this.definitionDataRequirement = definitionDataRequirement;
      this.definitionDataRequirementIsSet = true;
    }
    @JsonProperty("definitionCanonical")
    public void setDefinitionCanonical(Optional<String> definitionCanonical) {
      this.definitionCanonical = definitionCanonical;
      this.definitionCanonicalIsSet = true;
    }
    @JsonProperty("exclude")
    public void setExclude(Optional<Boolean> exclude) {
      this.exclude = exclude;
      this.excludeIsSet = true;
    }
    @JsonProperty("participantEffectiveTimeFromStart")
    public void setParticipantEffectiveTimeFromStart(Optional<Duration> participantEffectiveTimeFromStart) {
      this.participantEffectiveTimeFromStart = participantEffectiveTimeFromStart;
      this.participantEffectiveTimeFromStartIsSet = true;
    }
    @JsonProperty("studyEffectiveDateTime")
    public void setStudyEffectiveDateTime(Optional<String> studyEffectiveDateTime) {
      this.studyEffectiveDateTime = studyEffectiveDateTime;
      this.studyEffectiveDateTimeIsSet = true;
    }
    @JsonProperty("participantEffectiveDuration")
    public void setParticipantEffectiveDuration(Optional<Duration> participantEffectiveDuration) {
      this.participantEffectiveDuration = participantEffectiveDuration;
      this.participantEffectiveDurationIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> unitOfMeasure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> studyEffectiveTimeFromStart() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> studyEffectiveDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Researchelementdefinition_characteristicParticipanteffectivegroupmeasure> participantEffectiveGroupMeasure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> definitionCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> participantEffectiveTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> studyEffectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Researchelementdefinition_characteristicStudyeffectivegroupmeasure> studyEffectiveGroupMeasure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> studyEffectiveTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Expression> definitionExpression() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> participantEffectiveDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> participantEffectiveDescription() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> studyEffectiveDescription() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> participantEffectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> usageContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DataRequirement> definitionDataRequirement() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> definitionCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> exclude() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> participantEffectiveTimeFromStart() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> studyEffectiveDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> participantEffectiveDuration() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableResearchElementDefinition_Characteristic fromJson(Json json) {
    ImmutableResearchElementDefinition_Characteristic.Builder builder = ImmutableResearchElementDefinition_Characteristic.builder();
    if (json.unitOfMeasureIsSet) {
      builder.unitOfMeasure(json.unitOfMeasure);
    }
    if (json.studyEffectiveTimeFromStartIsSet) {
      builder.studyEffectiveTimeFromStart(json.studyEffectiveTimeFromStart);
    }
    if (json.studyEffectiveDurationIsSet) {
      builder.studyEffectiveDuration(json.studyEffectiveDuration);
    }
    if (json.participantEffectiveGroupMeasureIsSet) {
      builder.participantEffectiveGroupMeasure(json.participantEffectiveGroupMeasure);
    }
    if (json.definitionCodeableConceptIsSet) {
      builder.definitionCodeableConcept(json.definitionCodeableConcept);
    }
    if (json.participantEffectiveTimingIsSet) {
      builder.participantEffectiveTiming(json.participantEffectiveTiming);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.studyEffectivePeriodIsSet) {
      builder.studyEffectivePeriod(json.studyEffectivePeriod);
    }
    if (json.studyEffectiveGroupMeasureIsSet) {
      builder.studyEffectiveGroupMeasure(json.studyEffectiveGroupMeasure);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.studyEffectiveTimingIsSet) {
      builder.studyEffectiveTiming(json.studyEffectiveTiming);
    }
    if (json.definitionExpressionIsSet) {
      builder.definitionExpression(json.definitionExpression);
    }
    if (json.participantEffectiveDateTimeIsSet) {
      builder.participantEffectiveDateTime(json.participantEffectiveDateTime);
    }
    if (json.participantEffectiveDescriptionIsSet) {
      builder.participantEffectiveDescription(json.participantEffectiveDescription);
    }
    if (json.studyEffectiveDescriptionIsSet) {
      builder.studyEffectiveDescription(json.studyEffectiveDescription);
    }
    if (json.participantEffectivePeriodIsSet) {
      builder.participantEffectivePeriod(json.participantEffectivePeriod);
    }
    if (json.usageContextIsSet) {
      builder.usageContext(json.usageContext);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.definitionDataRequirementIsSet) {
      builder.definitionDataRequirement(json.definitionDataRequirement);
    }
    if (json.definitionCanonicalIsSet) {
      builder.definitionCanonical(json.definitionCanonical);
    }
    if (json.excludeIsSet) {
      builder.exclude(json.exclude);
    }
    if (json.participantEffectiveTimeFromStartIsSet) {
      builder.participantEffectiveTimeFromStart(json.participantEffectiveTimeFromStart);
    }
    if (json.studyEffectiveDateTimeIsSet) {
      builder.studyEffectiveDateTime(json.studyEffectiveDateTime);
    }
    if (json.participantEffectiveDurationIsSet) {
      builder.participantEffectiveDuration(json.participantEffectiveDuration);
    }
    return (ImmutableResearchElementDefinition_Characteristic) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ResearchElementDefinition_Characteristic} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ResearchElementDefinition_Characteristic instance
   */
  public static ResearchElementDefinition_Characteristic copyOf(ResearchElementDefinition_Characteristic instance) {
    if (instance instanceof ImmutableResearchElementDefinition_Characteristic) {
      return (ImmutableResearchElementDefinition_Characteristic) instance;
    }
    return ImmutableResearchElementDefinition_Characteristic.builder()
        .unitOfMeasure(instance.unitOfMeasure())
        .studyEffectiveTimeFromStart(instance.studyEffectiveTimeFromStart())
        .studyEffectiveDuration(instance.studyEffectiveDuration())
        .participantEffectiveGroupMeasure(instance.participantEffectiveGroupMeasure())
        .definitionCodeableConcept(instance.definitionCodeableConcept())
        .participantEffectiveTiming(instance.participantEffectiveTiming())
        .extension(instance.extension())
        .studyEffectivePeriod(instance.studyEffectivePeriod())
        .studyEffectiveGroupMeasure(instance.studyEffectiveGroupMeasure())
        .id(instance.id())
        .studyEffectiveTiming(instance.studyEffectiveTiming())
        .definitionExpression(instance.definitionExpression())
        .participantEffectiveDateTime(instance.participantEffectiveDateTime())
        .participantEffectiveDescription(instance.participantEffectiveDescription())
        .studyEffectiveDescription(instance.studyEffectiveDescription())
        .participantEffectivePeriod(instance.participantEffectivePeriod())
        .usageContext(instance.usageContext())
        .modifierExtension(instance.modifierExtension())
        .definitionDataRequirement(instance.definitionDataRequirement())
        .definitionCanonical(instance.definitionCanonical())
        .exclude(instance.exclude())
        .participantEffectiveTimeFromStart(instance.participantEffectiveTimeFromStart())
        .studyEffectiveDateTime(instance.studyEffectiveDateTime())
        .participantEffectiveDuration(instance.participantEffectiveDuration())
        .build();
  }

  /**
   * Creates a builder for {@link ResearchElementDefinition_Characteristic ResearchElementDefinition_Characteristic}.
   * <pre>
   * ImmutableResearchElementDefinition_Characteristic.builder()
   *    .unitOfMeasure(com.medplum.types.fhir.CodeableConcept) // optional {@link ResearchElementDefinition_Characteristic#unitOfMeasure() unitOfMeasure}
   *    .studyEffectiveTimeFromStart(com.medplum.types.fhir.Duration) // optional {@link ResearchElementDefinition_Characteristic#studyEffectiveTimeFromStart() studyEffectiveTimeFromStart}
   *    .studyEffectiveDuration(com.medplum.types.fhir.Duration) // optional {@link ResearchElementDefinition_Characteristic#studyEffectiveDuration() studyEffectiveDuration}
   *    .participantEffectiveGroupMeasure(com.medplum.types.fhir.Researchelementdefinition_characteristicParticipanteffectivegroupmeasure) // optional {@link ResearchElementDefinition_Characteristic#participantEffectiveGroupMeasure() participantEffectiveGroupMeasure}
   *    .definitionCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link ResearchElementDefinition_Characteristic#definitionCodeableConcept() definitionCodeableConcept}
   *    .participantEffectiveTiming(com.medplum.types.fhir.Timing) // optional {@link ResearchElementDefinition_Characteristic#participantEffectiveTiming() participantEffectiveTiming}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ResearchElementDefinition_Characteristic#extension() extension}
   *    .studyEffectivePeriod(com.medplum.types.fhir.Period) // optional {@link ResearchElementDefinition_Characteristic#studyEffectivePeriod() studyEffectivePeriod}
   *    .studyEffectiveGroupMeasure(com.medplum.types.fhir.Researchelementdefinition_characteristicStudyeffectivegroupmeasure) // optional {@link ResearchElementDefinition_Characteristic#studyEffectiveGroupMeasure() studyEffectiveGroupMeasure}
   *    .id(String) // optional {@link ResearchElementDefinition_Characteristic#id() id}
   *    .studyEffectiveTiming(com.medplum.types.fhir.Timing) // optional {@link ResearchElementDefinition_Characteristic#studyEffectiveTiming() studyEffectiveTiming}
   *    .definitionExpression(com.medplum.types.fhir.Expression) // optional {@link ResearchElementDefinition_Characteristic#definitionExpression() definitionExpression}
   *    .participantEffectiveDateTime(String) // optional {@link ResearchElementDefinition_Characteristic#participantEffectiveDateTime() participantEffectiveDateTime}
   *    .participantEffectiveDescription(String) // optional {@link ResearchElementDefinition_Characteristic#participantEffectiveDescription() participantEffectiveDescription}
   *    .studyEffectiveDescription(String) // optional {@link ResearchElementDefinition_Characteristic#studyEffectiveDescription() studyEffectiveDescription}
   *    .participantEffectivePeriod(com.medplum.types.fhir.Period) // optional {@link ResearchElementDefinition_Characteristic#participantEffectivePeriod() participantEffectivePeriod}
   *    .usageContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link ResearchElementDefinition_Characteristic#usageContext() usageContext}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ResearchElementDefinition_Characteristic#modifierExtension() modifierExtension}
   *    .definitionDataRequirement(com.medplum.types.fhir.DataRequirement) // optional {@link ResearchElementDefinition_Characteristic#definitionDataRequirement() definitionDataRequirement}
   *    .definitionCanonical(String) // optional {@link ResearchElementDefinition_Characteristic#definitionCanonical() definitionCanonical}
   *    .exclude(Boolean) // optional {@link ResearchElementDefinition_Characteristic#exclude() exclude}
   *    .participantEffectiveTimeFromStart(com.medplum.types.fhir.Duration) // optional {@link ResearchElementDefinition_Characteristic#participantEffectiveTimeFromStart() participantEffectiveTimeFromStart}
   *    .studyEffectiveDateTime(String) // optional {@link ResearchElementDefinition_Characteristic#studyEffectiveDateTime() studyEffectiveDateTime}
   *    .participantEffectiveDuration(com.medplum.types.fhir.Duration) // optional {@link ResearchElementDefinition_Characteristic#participantEffectiveDuration() participantEffectiveDuration}
   *    .build();
   * </pre>
   * @return A new ResearchElementDefinition_Characteristic builder
   */
  public static ImmutableResearchElementDefinition_Characteristic.Builder builder() {
    return new ImmutableResearchElementDefinition_Characteristic.Builder();
  }

  /**
   * Builds instances of type {@link ResearchElementDefinition_Characteristic ResearchElementDefinition_Characteristic}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ResearchElementDefinition_Characteristic", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_UNIT_OF_MEASURE = 0x1L;
    private static final long OPT_BIT_STUDY_EFFECTIVE_TIME_FROM_START = 0x2L;
    private static final long OPT_BIT_STUDY_EFFECTIVE_DURATION = 0x4L;
    private static final long OPT_BIT_PARTICIPANT_EFFECTIVE_GROUP_MEASURE = 0x8L;
    private static final long OPT_BIT_DEFINITION_CODEABLE_CONCEPT = 0x10L;
    private static final long OPT_BIT_PARTICIPANT_EFFECTIVE_TIMING = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_STUDY_EFFECTIVE_PERIOD = 0x80L;
    private static final long OPT_BIT_STUDY_EFFECTIVE_GROUP_MEASURE = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_STUDY_EFFECTIVE_TIMING = 0x400L;
    private static final long OPT_BIT_DEFINITION_EXPRESSION = 0x800L;
    private static final long OPT_BIT_PARTICIPANT_EFFECTIVE_DATE_TIME = 0x1000L;
    private static final long OPT_BIT_PARTICIPANT_EFFECTIVE_DESCRIPTION = 0x2000L;
    private static final long OPT_BIT_STUDY_EFFECTIVE_DESCRIPTION = 0x4000L;
    private static final long OPT_BIT_PARTICIPANT_EFFECTIVE_PERIOD = 0x8000L;
    private static final long OPT_BIT_USAGE_CONTEXT = 0x10000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20000L;
    private static final long OPT_BIT_DEFINITION_DATA_REQUIREMENT = 0x40000L;
    private static final long OPT_BIT_DEFINITION_CANONICAL = 0x80000L;
    private static final long OPT_BIT_EXCLUDE = 0x100000L;
    private static final long OPT_BIT_PARTICIPANT_EFFECTIVE_TIME_FROM_START = 0x200000L;
    private static final long OPT_BIT_STUDY_EFFECTIVE_DATE_TIME = 0x400000L;
    private static final long OPT_BIT_PARTICIPANT_EFFECTIVE_DURATION = 0x800000L;
    private long optBits;

    private @Nullable CodeableConcept unitOfMeasure;
    private @Nullable Duration studyEffectiveTimeFromStart;
    private @Nullable Duration studyEffectiveDuration;
    private @Nullable Researchelementdefinition_characteristicParticipanteffectivegroupmeasure participantEffectiveGroupMeasure;
    private @Nullable CodeableConcept definitionCodeableConcept;
    private @Nullable Timing participantEffectiveTiming;
    private @Nullable List<Extension> extension;
    private @Nullable Period studyEffectivePeriod;
    private @Nullable Researchelementdefinition_characteristicStudyeffectivegroupmeasure studyEffectiveGroupMeasure;
    private @Nullable String id;
    private @Nullable Timing studyEffectiveTiming;
    private @Nullable Expression definitionExpression;
    private @Nullable String participantEffectiveDateTime;
    private @Nullable String participantEffectiveDescription;
    private @Nullable String studyEffectiveDescription;
    private @Nullable Period participantEffectivePeriod;
    private @Nullable List<UsageContext> usageContext;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable DataRequirement definitionDataRequirement;
    private @Nullable String definitionCanonical;
    private @Nullable Boolean exclude;
    private @Nullable Duration participantEffectiveTimeFromStart;
    private @Nullable String studyEffectiveDateTime;
    private @Nullable Duration participantEffectiveDuration;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#unitOfMeasure() unitOfMeasure} to unitOfMeasure.
     * @param unitOfMeasure The value for unitOfMeasure
     * @return {@code this} builder for chained invocation
     */
    public final Builder unitOfMeasure(CodeableConcept unitOfMeasure) {
      checkNotIsSet(unitOfMeasureIsSet(), "unitOfMeasure");
      this.unitOfMeasure = Objects.requireNonNull(unitOfMeasure, "unitOfMeasure");
      optBits |= OPT_BIT_UNIT_OF_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#unitOfMeasure() unitOfMeasure} to unitOfMeasure.
     * @param unitOfMeasure The value for unitOfMeasure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("unitOfMeasure")
    public final Builder unitOfMeasure(Optional<? extends CodeableConcept> unitOfMeasure) {
      checkNotIsSet(unitOfMeasureIsSet(), "unitOfMeasure");
      this.unitOfMeasure = unitOfMeasure.orElse(null);
      optBits |= OPT_BIT_UNIT_OF_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#studyEffectiveTimeFromStart() studyEffectiveTimeFromStart} to studyEffectiveTimeFromStart.
     * @param studyEffectiveTimeFromStart The value for studyEffectiveTimeFromStart
     * @return {@code this} builder for chained invocation
     */
    public final Builder studyEffectiveTimeFromStart(Duration studyEffectiveTimeFromStart) {
      checkNotIsSet(studyEffectiveTimeFromStartIsSet(), "studyEffectiveTimeFromStart");
      this.studyEffectiveTimeFromStart = Objects.requireNonNull(studyEffectiveTimeFromStart, "studyEffectiveTimeFromStart");
      optBits |= OPT_BIT_STUDY_EFFECTIVE_TIME_FROM_START;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#studyEffectiveTimeFromStart() studyEffectiveTimeFromStart} to studyEffectiveTimeFromStart.
     * @param studyEffectiveTimeFromStart The value for studyEffectiveTimeFromStart
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("studyEffectiveTimeFromStart")
    public final Builder studyEffectiveTimeFromStart(Optional<? extends Duration> studyEffectiveTimeFromStart) {
      checkNotIsSet(studyEffectiveTimeFromStartIsSet(), "studyEffectiveTimeFromStart");
      this.studyEffectiveTimeFromStart = studyEffectiveTimeFromStart.orElse(null);
      optBits |= OPT_BIT_STUDY_EFFECTIVE_TIME_FROM_START;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#studyEffectiveDuration() studyEffectiveDuration} to studyEffectiveDuration.
     * @param studyEffectiveDuration The value for studyEffectiveDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder studyEffectiveDuration(Duration studyEffectiveDuration) {
      checkNotIsSet(studyEffectiveDurationIsSet(), "studyEffectiveDuration");
      this.studyEffectiveDuration = Objects.requireNonNull(studyEffectiveDuration, "studyEffectiveDuration");
      optBits |= OPT_BIT_STUDY_EFFECTIVE_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#studyEffectiveDuration() studyEffectiveDuration} to studyEffectiveDuration.
     * @param studyEffectiveDuration The value for studyEffectiveDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("studyEffectiveDuration")
    public final Builder studyEffectiveDuration(Optional<? extends Duration> studyEffectiveDuration) {
      checkNotIsSet(studyEffectiveDurationIsSet(), "studyEffectiveDuration");
      this.studyEffectiveDuration = studyEffectiveDuration.orElse(null);
      optBits |= OPT_BIT_STUDY_EFFECTIVE_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#participantEffectiveGroupMeasure() participantEffectiveGroupMeasure} to participantEffectiveGroupMeasure.
     * @param participantEffectiveGroupMeasure The value for participantEffectiveGroupMeasure
     * @return {@code this} builder for chained invocation
     */
    public final Builder participantEffectiveGroupMeasure(Researchelementdefinition_characteristicParticipanteffectivegroupmeasure participantEffectiveGroupMeasure) {
      checkNotIsSet(participantEffectiveGroupMeasureIsSet(), "participantEffectiveGroupMeasure");
      this.participantEffectiveGroupMeasure = Objects.requireNonNull(participantEffectiveGroupMeasure, "participantEffectiveGroupMeasure");
      optBits |= OPT_BIT_PARTICIPANT_EFFECTIVE_GROUP_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#participantEffectiveGroupMeasure() participantEffectiveGroupMeasure} to participantEffectiveGroupMeasure.
     * @param participantEffectiveGroupMeasure The value for participantEffectiveGroupMeasure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participantEffectiveGroupMeasure")
    public final Builder participantEffectiveGroupMeasure(Optional<? extends Researchelementdefinition_characteristicParticipanteffectivegroupmeasure> participantEffectiveGroupMeasure) {
      checkNotIsSet(participantEffectiveGroupMeasureIsSet(), "participantEffectiveGroupMeasure");
      this.participantEffectiveGroupMeasure = participantEffectiveGroupMeasure.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT_EFFECTIVE_GROUP_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#definitionCodeableConcept() definitionCodeableConcept} to definitionCodeableConcept.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#definitionCodeableConcept() definitionCodeableConcept} to definitionCodeableConcept.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#participantEffectiveTiming() participantEffectiveTiming} to participantEffectiveTiming.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#participantEffectiveTiming() participantEffectiveTiming} to participantEffectiveTiming.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#studyEffectivePeriod() studyEffectivePeriod} to studyEffectivePeriod.
     * @param studyEffectivePeriod The value for studyEffectivePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder studyEffectivePeriod(Period studyEffectivePeriod) {
      checkNotIsSet(studyEffectivePeriodIsSet(), "studyEffectivePeriod");
      this.studyEffectivePeriod = Objects.requireNonNull(studyEffectivePeriod, "studyEffectivePeriod");
      optBits |= OPT_BIT_STUDY_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#studyEffectivePeriod() studyEffectivePeriod} to studyEffectivePeriod.
     * @param studyEffectivePeriod The value for studyEffectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("studyEffectivePeriod")
    public final Builder studyEffectivePeriod(Optional<? extends Period> studyEffectivePeriod) {
      checkNotIsSet(studyEffectivePeriodIsSet(), "studyEffectivePeriod");
      this.studyEffectivePeriod = studyEffectivePeriod.orElse(null);
      optBits |= OPT_BIT_STUDY_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#studyEffectiveGroupMeasure() studyEffectiveGroupMeasure} to studyEffectiveGroupMeasure.
     * @param studyEffectiveGroupMeasure The value for studyEffectiveGroupMeasure
     * @return {@code this} builder for chained invocation
     */
    public final Builder studyEffectiveGroupMeasure(Researchelementdefinition_characteristicStudyeffectivegroupmeasure studyEffectiveGroupMeasure) {
      checkNotIsSet(studyEffectiveGroupMeasureIsSet(), "studyEffectiveGroupMeasure");
      this.studyEffectiveGroupMeasure = Objects.requireNonNull(studyEffectiveGroupMeasure, "studyEffectiveGroupMeasure");
      optBits |= OPT_BIT_STUDY_EFFECTIVE_GROUP_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#studyEffectiveGroupMeasure() studyEffectiveGroupMeasure} to studyEffectiveGroupMeasure.
     * @param studyEffectiveGroupMeasure The value for studyEffectiveGroupMeasure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("studyEffectiveGroupMeasure")
    public final Builder studyEffectiveGroupMeasure(Optional<? extends Researchelementdefinition_characteristicStudyeffectivegroupmeasure> studyEffectiveGroupMeasure) {
      checkNotIsSet(studyEffectiveGroupMeasureIsSet(), "studyEffectiveGroupMeasure");
      this.studyEffectiveGroupMeasure = studyEffectiveGroupMeasure.orElse(null);
      optBits |= OPT_BIT_STUDY_EFFECTIVE_GROUP_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#id() id} to id.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#id() id} to id.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#studyEffectiveTiming() studyEffectiveTiming} to studyEffectiveTiming.
     * @param studyEffectiveTiming The value for studyEffectiveTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder studyEffectiveTiming(Timing studyEffectiveTiming) {
      checkNotIsSet(studyEffectiveTimingIsSet(), "studyEffectiveTiming");
      this.studyEffectiveTiming = Objects.requireNonNull(studyEffectiveTiming, "studyEffectiveTiming");
      optBits |= OPT_BIT_STUDY_EFFECTIVE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#studyEffectiveTiming() studyEffectiveTiming} to studyEffectiveTiming.
     * @param studyEffectiveTiming The value for studyEffectiveTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("studyEffectiveTiming")
    public final Builder studyEffectiveTiming(Optional<? extends Timing> studyEffectiveTiming) {
      checkNotIsSet(studyEffectiveTimingIsSet(), "studyEffectiveTiming");
      this.studyEffectiveTiming = studyEffectiveTiming.orElse(null);
      optBits |= OPT_BIT_STUDY_EFFECTIVE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#definitionExpression() definitionExpression} to definitionExpression.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#definitionExpression() definitionExpression} to definitionExpression.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#participantEffectiveDateTime() participantEffectiveDateTime} to participantEffectiveDateTime.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#participantEffectiveDateTime() participantEffectiveDateTime} to participantEffectiveDateTime.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#participantEffectiveDescription() participantEffectiveDescription} to participantEffectiveDescription.
     * @param participantEffectiveDescription The value for participantEffectiveDescription
     * @return {@code this} builder for chained invocation
     */
    public final Builder participantEffectiveDescription(String participantEffectiveDescription) {
      checkNotIsSet(participantEffectiveDescriptionIsSet(), "participantEffectiveDescription");
      this.participantEffectiveDescription = Objects.requireNonNull(participantEffectiveDescription, "participantEffectiveDescription");
      optBits |= OPT_BIT_PARTICIPANT_EFFECTIVE_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#participantEffectiveDescription() participantEffectiveDescription} to participantEffectiveDescription.
     * @param participantEffectiveDescription The value for participantEffectiveDescription
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participantEffectiveDescription")
    public final Builder participantEffectiveDescription(Optional<String> participantEffectiveDescription) {
      checkNotIsSet(participantEffectiveDescriptionIsSet(), "participantEffectiveDescription");
      this.participantEffectiveDescription = participantEffectiveDescription.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT_EFFECTIVE_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#studyEffectiveDescription() studyEffectiveDescription} to studyEffectiveDescription.
     * @param studyEffectiveDescription The value for studyEffectiveDescription
     * @return {@code this} builder for chained invocation
     */
    public final Builder studyEffectiveDescription(String studyEffectiveDescription) {
      checkNotIsSet(studyEffectiveDescriptionIsSet(), "studyEffectiveDescription");
      this.studyEffectiveDescription = Objects.requireNonNull(studyEffectiveDescription, "studyEffectiveDescription");
      optBits |= OPT_BIT_STUDY_EFFECTIVE_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#studyEffectiveDescription() studyEffectiveDescription} to studyEffectiveDescription.
     * @param studyEffectiveDescription The value for studyEffectiveDescription
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("studyEffectiveDescription")
    public final Builder studyEffectiveDescription(Optional<String> studyEffectiveDescription) {
      checkNotIsSet(studyEffectiveDescriptionIsSet(), "studyEffectiveDescription");
      this.studyEffectiveDescription = studyEffectiveDescription.orElse(null);
      optBits |= OPT_BIT_STUDY_EFFECTIVE_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#participantEffectivePeriod() participantEffectivePeriod} to participantEffectivePeriod.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#participantEffectivePeriod() participantEffectivePeriod} to participantEffectivePeriod.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#usageContext() usageContext} to usageContext.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#usageContext() usageContext} to usageContext.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#definitionDataRequirement() definitionDataRequirement} to definitionDataRequirement.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#definitionDataRequirement() definitionDataRequirement} to definitionDataRequirement.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#definitionCanonical() definitionCanonical} to definitionCanonical.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#definitionCanonical() definitionCanonical} to definitionCanonical.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#exclude() exclude} to exclude.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#exclude() exclude} to exclude.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#participantEffectiveTimeFromStart() participantEffectiveTimeFromStart} to participantEffectiveTimeFromStart.
     * @param participantEffectiveTimeFromStart The value for participantEffectiveTimeFromStart
     * @return {@code this} builder for chained invocation
     */
    public final Builder participantEffectiveTimeFromStart(Duration participantEffectiveTimeFromStart) {
      checkNotIsSet(participantEffectiveTimeFromStartIsSet(), "participantEffectiveTimeFromStart");
      this.participantEffectiveTimeFromStart = Objects.requireNonNull(participantEffectiveTimeFromStart, "participantEffectiveTimeFromStart");
      optBits |= OPT_BIT_PARTICIPANT_EFFECTIVE_TIME_FROM_START;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#participantEffectiveTimeFromStart() participantEffectiveTimeFromStart} to participantEffectiveTimeFromStart.
     * @param participantEffectiveTimeFromStart The value for participantEffectiveTimeFromStart
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participantEffectiveTimeFromStart")
    public final Builder participantEffectiveTimeFromStart(Optional<? extends Duration> participantEffectiveTimeFromStart) {
      checkNotIsSet(participantEffectiveTimeFromStartIsSet(), "participantEffectiveTimeFromStart");
      this.participantEffectiveTimeFromStart = participantEffectiveTimeFromStart.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT_EFFECTIVE_TIME_FROM_START;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#studyEffectiveDateTime() studyEffectiveDateTime} to studyEffectiveDateTime.
     * @param studyEffectiveDateTime The value for studyEffectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder studyEffectiveDateTime(String studyEffectiveDateTime) {
      checkNotIsSet(studyEffectiveDateTimeIsSet(), "studyEffectiveDateTime");
      this.studyEffectiveDateTime = Objects.requireNonNull(studyEffectiveDateTime, "studyEffectiveDateTime");
      optBits |= OPT_BIT_STUDY_EFFECTIVE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#studyEffectiveDateTime() studyEffectiveDateTime} to studyEffectiveDateTime.
     * @param studyEffectiveDateTime The value for studyEffectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("studyEffectiveDateTime")
    public final Builder studyEffectiveDateTime(Optional<String> studyEffectiveDateTime) {
      checkNotIsSet(studyEffectiveDateTimeIsSet(), "studyEffectiveDateTime");
      this.studyEffectiveDateTime = studyEffectiveDateTime.orElse(null);
      optBits |= OPT_BIT_STUDY_EFFECTIVE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#participantEffectiveDuration() participantEffectiveDuration} to participantEffectiveDuration.
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
     * Initializes the optional value {@link ResearchElementDefinition_Characteristic#participantEffectiveDuration() participantEffectiveDuration} to participantEffectiveDuration.
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
     * Builds a new {@link ResearchElementDefinition_Characteristic ResearchElementDefinition_Characteristic}.
     * @return An immutable instance of ResearchElementDefinition_Characteristic
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ResearchElementDefinition_Characteristic build() {
      return new ImmutableResearchElementDefinition_Characteristic(
          unitOfMeasure,
          studyEffectiveTimeFromStart,
          studyEffectiveDuration,
          participantEffectiveGroupMeasure,
          definitionCodeableConcept,
          participantEffectiveTiming,
          extension,
          studyEffectivePeriod,
          studyEffectiveGroupMeasure,
          id,
          studyEffectiveTiming,
          definitionExpression,
          participantEffectiveDateTime,
          participantEffectiveDescription,
          studyEffectiveDescription,
          participantEffectivePeriod,
          usageContext,
          modifierExtension,
          definitionDataRequirement,
          definitionCanonical,
          exclude,
          participantEffectiveTimeFromStart,
          studyEffectiveDateTime,
          participantEffectiveDuration);
    }

    private boolean unitOfMeasureIsSet() {
      return (optBits & OPT_BIT_UNIT_OF_MEASURE) != 0;
    }

    private boolean studyEffectiveTimeFromStartIsSet() {
      return (optBits & OPT_BIT_STUDY_EFFECTIVE_TIME_FROM_START) != 0;
    }

    private boolean studyEffectiveDurationIsSet() {
      return (optBits & OPT_BIT_STUDY_EFFECTIVE_DURATION) != 0;
    }

    private boolean participantEffectiveGroupMeasureIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT_EFFECTIVE_GROUP_MEASURE) != 0;
    }

    private boolean definitionCodeableConceptIsSet() {
      return (optBits & OPT_BIT_DEFINITION_CODEABLE_CONCEPT) != 0;
    }

    private boolean participantEffectiveTimingIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT_EFFECTIVE_TIMING) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean studyEffectivePeriodIsSet() {
      return (optBits & OPT_BIT_STUDY_EFFECTIVE_PERIOD) != 0;
    }

    private boolean studyEffectiveGroupMeasureIsSet() {
      return (optBits & OPT_BIT_STUDY_EFFECTIVE_GROUP_MEASURE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean studyEffectiveTimingIsSet() {
      return (optBits & OPT_BIT_STUDY_EFFECTIVE_TIMING) != 0;
    }

    private boolean definitionExpressionIsSet() {
      return (optBits & OPT_BIT_DEFINITION_EXPRESSION) != 0;
    }

    private boolean participantEffectiveDateTimeIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT_EFFECTIVE_DATE_TIME) != 0;
    }

    private boolean participantEffectiveDescriptionIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT_EFFECTIVE_DESCRIPTION) != 0;
    }

    private boolean studyEffectiveDescriptionIsSet() {
      return (optBits & OPT_BIT_STUDY_EFFECTIVE_DESCRIPTION) != 0;
    }

    private boolean participantEffectivePeriodIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean usageContextIsSet() {
      return (optBits & OPT_BIT_USAGE_CONTEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean definitionDataRequirementIsSet() {
      return (optBits & OPT_BIT_DEFINITION_DATA_REQUIREMENT) != 0;
    }

    private boolean definitionCanonicalIsSet() {
      return (optBits & OPT_BIT_DEFINITION_CANONICAL) != 0;
    }

    private boolean excludeIsSet() {
      return (optBits & OPT_BIT_EXCLUDE) != 0;
    }

    private boolean participantEffectiveTimeFromStartIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT_EFFECTIVE_TIME_FROM_START) != 0;
    }

    private boolean studyEffectiveDateTimeIsSet() {
      return (optBits & OPT_BIT_STUDY_EFFECTIVE_DATE_TIME) != 0;
    }

    private boolean participantEffectiveDurationIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT_EFFECTIVE_DURATION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ResearchElementDefinition_Characteristic is strict, attribute is already set: ".concat(name));
    }
  }
}