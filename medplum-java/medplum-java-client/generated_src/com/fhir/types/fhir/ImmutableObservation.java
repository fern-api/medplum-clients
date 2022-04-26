package com.fhir.types.fhir;

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
 * Immutable implementation of {@link Observation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableObservation.builder()}.
 */
@Generated(from = "Observation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableObservation implements Observation {
  private final @Nullable Quantity valueQuantity;
  private final @Nullable Instant issued;
  private final @Nullable String valueString;
  private final @Nullable Reference specimen;
  private final @Nullable List<Reference> hasMember;
  private final @Nullable Reference encounter;
  private final @Nullable Period valuePeriod;
  private final @Nullable CodeableConcept bodySite;
  private final @Nullable Narrative text;
  private final CodeableConcept code;
  private final @Nullable Double valueInteger;
  private final @Nullable List<Annotation> note;
  private final @Nullable List<CodeableConcept> category;
  private final String resourceType;
  private final @Nullable Code language;
  private final @Nullable List<Reference> performer;
  private final @Nullable List<Reference> derivedFrom;
  private final @Nullable Meta meta;
  private final @Nullable ObservationStatus status;
  private final @Nullable String effectiveDateTime;
  private final @Nullable List<CodeableConcept> interpretation;
  private final @Nullable CodeableConcept method;
  private final @Nullable CodeableConcept valueCodeableConcept;
  private final @Nullable CodeableConcept dataAbsentReason;
  private final @Nullable Reference subject;
  private final @Nullable Uri implicitRules;
  private final @Nullable String valueDateTime;
  private final @Nullable List<Reference> partOf;
  private final @Nullable List<Reference> basedOn;
  private final @Nullable List<Reference> focus;
  private final @Nullable String valueTime;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Observation_Component> component;
  private final @Nullable SampledData valueSampledData;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Ratio valueRatio;
  private final @Nullable List<Observation_ReferenceRange> referenceRange;
  private final @Nullable Reference device;
  private final @Nullable String effectiveInstant;
  private final @Nullable Id id;
  private final @Nullable Period effectivePeriod;
  private final @Nullable Boolean valueBoolean;
  private final @Nullable List<Extension> extension;
  private final @Nullable Range valueRange;
  private final @Nullable Timing effectiveTiming;

  private ImmutableObservation(
      @Nullable Quantity valueQuantity,
      @Nullable Instant issued,
      @Nullable String valueString,
      @Nullable Reference specimen,
      @Nullable List<Reference> hasMember,
      @Nullable Reference encounter,
      @Nullable Period valuePeriod,
      @Nullable CodeableConcept bodySite,
      @Nullable Narrative text,
      CodeableConcept code,
      @Nullable Double valueInteger,
      @Nullable List<Annotation> note,
      @Nullable List<CodeableConcept> category,
      String resourceType,
      @Nullable Code language,
      @Nullable List<Reference> performer,
      @Nullable List<Reference> derivedFrom,
      @Nullable Meta meta,
      @Nullable ObservationStatus status,
      @Nullable String effectiveDateTime,
      @Nullable List<CodeableConcept> interpretation,
      @Nullable CodeableConcept method,
      @Nullable CodeableConcept valueCodeableConcept,
      @Nullable CodeableConcept dataAbsentReason,
      @Nullable Reference subject,
      @Nullable Uri implicitRules,
      @Nullable String valueDateTime,
      @Nullable List<Reference> partOf,
      @Nullable List<Reference> basedOn,
      @Nullable List<Reference> focus,
      @Nullable String valueTime,
      @Nullable List<Identifier> identifier,
      @Nullable List<Observation_Component> component,
      @Nullable SampledData valueSampledData,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> modifierExtension,
      @Nullable Ratio valueRatio,
      @Nullable List<Observation_ReferenceRange> referenceRange,
      @Nullable Reference device,
      @Nullable String effectiveInstant,
      @Nullable Id id,
      @Nullable Period effectivePeriod,
      @Nullable Boolean valueBoolean,
      @Nullable List<Extension> extension,
      @Nullable Range valueRange,
      @Nullable Timing effectiveTiming) {
    this.valueQuantity = valueQuantity;
    this.issued = issued;
    this.valueString = valueString;
    this.specimen = specimen;
    this.hasMember = hasMember;
    this.encounter = encounter;
    this.valuePeriod = valuePeriod;
    this.bodySite = bodySite;
    this.text = text;
    this.code = code;
    this.valueInteger = valueInteger;
    this.note = note;
    this.category = category;
    this.resourceType = resourceType;
    this.language = language;
    this.performer = performer;
    this.derivedFrom = derivedFrom;
    this.meta = meta;
    this.status = status;
    this.effectiveDateTime = effectiveDateTime;
    this.interpretation = interpretation;
    this.method = method;
    this.valueCodeableConcept = valueCodeableConcept;
    this.dataAbsentReason = dataAbsentReason;
    this.subject = subject;
    this.implicitRules = implicitRules;
    this.valueDateTime = valueDateTime;
    this.partOf = partOf;
    this.basedOn = basedOn;
    this.focus = focus;
    this.valueTime = valueTime;
    this.identifier = identifier;
    this.component = component;
    this.valueSampledData = valueSampledData;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.valueRatio = valueRatio;
    this.referenceRange = referenceRange;
    this.device = device;
    this.effectiveInstant = effectiveInstant;
    this.id = id;
    this.effectivePeriod = effectivePeriod;
    this.valueBoolean = valueBoolean;
    this.extension = extension;
    this.valueRange = valueRange;
    this.effectiveTiming = effectiveTiming;
  }

  /**
   * @return The value of the {@code valueQuantity} attribute
   */
  @JsonProperty("valueQuantity")
  @Override
  public Optional<Quantity> valueQuantity() {
    return Optional.ofNullable(valueQuantity);
  }

  /**
   * @return The value of the {@code issued} attribute
   */
  @JsonProperty("issued")
  @Override
  public Optional<Instant> issued() {
    return Optional.ofNullable(issued);
  }

  /**
   * @return The value of the {@code valueString} attribute
   */
  @JsonProperty("valueString")
  @Override
  public Optional<String> valueString() {
    return Optional.ofNullable(valueString);
  }

  /**
   * @return The value of the {@code specimen} attribute
   */
  @JsonProperty("specimen")
  @Override
  public Optional<Reference> specimen() {
    return Optional.ofNullable(specimen);
  }

  /**
   * @return The value of the {@code hasMember} attribute
   */
  @JsonProperty("hasMember")
  @Override
  public Optional<List<Reference>> hasMember() {
    return Optional.ofNullable(hasMember);
  }

  /**
   * @return The value of the {@code encounter} attribute
   */
  @JsonProperty("encounter")
  @Override
  public Optional<Reference> encounter() {
    return Optional.ofNullable(encounter);
  }

  /**
   * @return The value of the {@code valuePeriod} attribute
   */
  @JsonProperty("valuePeriod")
  @Override
  public Optional<Period> valuePeriod() {
    return Optional.ofNullable(valuePeriod);
  }

  /**
   * @return The value of the {@code bodySite} attribute
   */
  @JsonProperty("bodySite")
  @Override
  public Optional<CodeableConcept> bodySite() {
    return Optional.ofNullable(bodySite);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public CodeableConcept code() {
    return code;
  }

  /**
   * @return The value of the {@code valueInteger} attribute
   */
  @JsonProperty("valueInteger")
  @Override
  public Optional<Double> valueInteger() {
    return Optional.ofNullable(valueInteger);
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<CodeableConcept>> category() {
    return Optional.ofNullable(category);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @JsonProperty("performer")
  @Override
  public Optional<List<Reference>> performer() {
    return Optional.ofNullable(performer);
  }

  /**
   * @return The value of the {@code derivedFrom} attribute
   */
  @JsonProperty("derivedFrom")
  @Override
  public Optional<List<Reference>> derivedFrom() {
    return Optional.ofNullable(derivedFrom);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<ObservationStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code effectiveDateTime} attribute
   */
  @JsonProperty("effectiveDateTime")
  @Override
  public Optional<String> effectiveDateTime() {
    return Optional.ofNullable(effectiveDateTime);
  }

  /**
   * @return The value of the {@code interpretation} attribute
   */
  @JsonProperty("interpretation")
  @Override
  public Optional<List<CodeableConcept>> interpretation() {
    return Optional.ofNullable(interpretation);
  }

  /**
   * @return The value of the {@code method} attribute
   */
  @JsonProperty("method")
  @Override
  public Optional<CodeableConcept> method() {
    return Optional.ofNullable(method);
  }

  /**
   * @return The value of the {@code valueCodeableConcept} attribute
   */
  @JsonProperty("valueCodeableConcept")
  @Override
  public Optional<CodeableConcept> valueCodeableConcept() {
    return Optional.ofNullable(valueCodeableConcept);
  }

  /**
   * @return The value of the {@code dataAbsentReason} attribute
   */
  @JsonProperty("dataAbsentReason")
  @Override
  public Optional<CodeableConcept> dataAbsentReason() {
    return Optional.ofNullable(dataAbsentReason);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<Reference> subject() {
    return Optional.ofNullable(subject);
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
   * @return The value of the {@code valueDateTime} attribute
   */
  @JsonProperty("valueDateTime")
  @Override
  public Optional<String> valueDateTime() {
    return Optional.ofNullable(valueDateTime);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @JsonProperty("partOf")
  @Override
  public Optional<List<Reference>> partOf() {
    return Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<List<Reference>> basedOn() {
    return Optional.ofNullable(basedOn);
  }

  /**
   * @return The value of the {@code focus} attribute
   */
  @JsonProperty("focus")
  @Override
  public Optional<List<Reference>> focus() {
    return Optional.ofNullable(focus);
  }

  /**
   * @return The value of the {@code valueTime} attribute
   */
  @JsonProperty("valueTime")
  @Override
  public Optional<String> valueTime() {
    return Optional.ofNullable(valueTime);
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
   * @return The value of the {@code component} attribute
   */
  @JsonProperty("component")
  @Override
  public Optional<List<Observation_Component>> component() {
    return Optional.ofNullable(component);
  }

  /**
   * @return The value of the {@code valueSampledData} attribute
   */
  @JsonProperty("valueSampledData")
  @Override
  public Optional<SampledData> valueSampledData() {
    return Optional.ofNullable(valueSampledData);
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
   * @return The value of the {@code valueRatio} attribute
   */
  @JsonProperty("valueRatio")
  @Override
  public Optional<Ratio> valueRatio() {
    return Optional.ofNullable(valueRatio);
  }

  /**
   * @return The value of the {@code referenceRange} attribute
   */
  @JsonProperty("referenceRange")
  @Override
  public Optional<List<Observation_ReferenceRange>> referenceRange() {
    return Optional.ofNullable(referenceRange);
  }

  /**
   * @return The value of the {@code device} attribute
   */
  @JsonProperty("device")
  @Override
  public Optional<Reference> device() {
    return Optional.ofNullable(device);
  }

  /**
   * @return The value of the {@code effectiveInstant} attribute
   */
  @JsonProperty("effectiveInstant")
  @Override
  public Optional<String> effectiveInstant() {
    return Optional.ofNullable(effectiveInstant);
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
   * @return The value of the {@code effectivePeriod} attribute
   */
  @JsonProperty("effectivePeriod")
  @Override
  public Optional<Period> effectivePeriod() {
    return Optional.ofNullable(effectivePeriod);
  }

  /**
   * @return The value of the {@code valueBoolean} attribute
   */
  @JsonProperty("valueBoolean")
  @Override
  public Optional<Boolean> valueBoolean() {
    return Optional.ofNullable(valueBoolean);
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
   * @return The value of the {@code valueRange} attribute
   */
  @JsonProperty("valueRange")
  @Override
  public Optional<Range> valueRange() {
    return Optional.ofNullable(valueRange);
  }

  /**
   * @return The value of the {@code effectiveTiming} attribute
   */
  @JsonProperty("effectiveTiming")
  @Override
  public Optional<Timing> effectiveTiming() {
    return Optional.ofNullable(effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableObservation(
        newValue,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withValueQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableObservation(
        value,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#issued() issued} attribute.
   * @param value The value for issued
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withIssued(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "issued");
    if (this.issued == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        newValue,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#issued() issued} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issued
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withIssued(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.issued == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        value,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueString");
    if (Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        newValue,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueString, value)) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        value,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#specimen() specimen} attribute.
   * @param value The value for specimen
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withSpecimen(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "specimen");
    if (this.specimen == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        newValue,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#specimen() specimen} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specimen
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withSpecimen(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.specimen == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        value,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#hasMember() hasMember} attribute.
   * @param value The value for hasMember
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withHasMember(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "hasMember");
    if (this.hasMember == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        newValue,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#hasMember() hasMember} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hasMember
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withHasMember(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.hasMember == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        value,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        newValue,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        value,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valuePeriod() valuePeriod} attribute.
   * @param value The value for valuePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValuePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "valuePeriod");
    if (this.valuePeriod == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        newValue,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valuePeriod() valuePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valuePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withValuePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.valuePeriod == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        value,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withBodySite(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        newValue,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withBodySite(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        value,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        newValue,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        value,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Observation#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableObservation withCode(CodeableConcept value) {
    if (this.code == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "code");
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        newValue,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueInteger() valueInteger} attribute.
   * @param value The value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueInteger(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueInteger, newValue)) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        newValue,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueInteger() valueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueInteger(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueInteger, value)) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        value,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        newValue,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        value,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        newValue,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        value,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Observation#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableObservation withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        newValue,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        newValue,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        value,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withPerformer(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        newValue,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withPerformer(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        value,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#derivedFrom() derivedFrom} attribute.
   * @param value The value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withDerivedFrom(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "derivedFrom");
    if (this.derivedFrom == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        newValue,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#derivedFrom() derivedFrom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withDerivedFrom(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.derivedFrom == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        value,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        newValue,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        value,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withStatus(ObservationStatus value) {
    @Nullable ObservationStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        newValue,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withStatus(Optional<? extends ObservationStatus> optional) {
    @Nullable ObservationStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        value,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#effectiveDateTime() effectiveDateTime} attribute.
   * @param value The value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withEffectiveDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "effectiveDateTime");
    if (Objects.equals(this.effectiveDateTime, newValue)) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        newValue,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#effectiveDateTime() effectiveDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withEffectiveDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.effectiveDateTime, value)) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        value,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#interpretation() interpretation} attribute.
   * @param value The value for interpretation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withInterpretation(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "interpretation");
    if (this.interpretation == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        newValue,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#interpretation() interpretation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for interpretation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withInterpretation(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.interpretation == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        value,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withMethod(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        newValue,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withMethod(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        value,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueCodeableConcept() valueCodeableConcept} attribute.
   * @param value The value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "valueCodeableConcept");
    if (this.valueCodeableConcept == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        newValue,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueCodeableConcept() valueCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withValueCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.valueCodeableConcept == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        value,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#dataAbsentReason() dataAbsentReason} attribute.
   * @param value The value for dataAbsentReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withDataAbsentReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "dataAbsentReason");
    if (this.dataAbsentReason == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        newValue,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#dataAbsentReason() dataAbsentReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dataAbsentReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withDataAbsentReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.dataAbsentReason == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        value,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        newValue,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        value,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        newValue,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        value,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueDateTime() valueDateTime} attribute.
   * @param value The value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueDateTime");
    if (Objects.equals(this.valueDateTime, newValue)) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        newValue,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueDateTime() valueDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueDateTime, value)) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        value,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withPartOf(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        newValue,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withPartOf(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        value,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        newValue,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        value,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#focus() focus} attribute.
   * @param value The value for focus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withFocus(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "focus");
    if (this.focus == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        newValue,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#focus() focus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withFocus(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.focus == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        value,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueTime() valueTime} attribute.
   * @param value The value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueTime");
    if (Objects.equals(this.valueTime, newValue)) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        newValue,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueTime() valueTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueTime, value)) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        value,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        newValue,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        value,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#component() component} attribute.
   * @param value The value for component
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withComponent(List<Observation_Component> value) {
    @Nullable List<Observation_Component> newValue = Objects.requireNonNull(value, "component");
    if (this.component == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        newValue,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#component() component} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for component
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withComponent(Optional<? extends List<Observation_Component>> optional) {
    @Nullable List<Observation_Component> value = optional.orElse(null);
    if (this.component == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        value,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueSampledData() valueSampledData} attribute.
   * @param value The value for valueSampledData
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueSampledData(SampledData value) {
    @Nullable SampledData newValue = Objects.requireNonNull(value, "valueSampledData");
    if (this.valueSampledData == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        newValue,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueSampledData() valueSampledData} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSampledData
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withValueSampledData(Optional<? extends SampledData> optional) {
    @Nullable SampledData value = optional.orElse(null);
    if (this.valueSampledData == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        value,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        newValue,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        value,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        newValue,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        value,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueRatio() valueRatio} attribute.
   * @param value The value for valueRatio
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueRatio(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "valueRatio");
    if (this.valueRatio == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        newValue,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueRatio() valueRatio} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRatio
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withValueRatio(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.valueRatio == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        value,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#referenceRange() referenceRange} attribute.
   * @param value The value for referenceRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withReferenceRange(List<Observation_ReferenceRange> value) {
    @Nullable List<Observation_ReferenceRange> newValue = Objects.requireNonNull(value, "referenceRange");
    if (this.referenceRange == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        newValue,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#referenceRange() referenceRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referenceRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withReferenceRange(Optional<? extends List<Observation_ReferenceRange>> optional) {
    @Nullable List<Observation_ReferenceRange> value = optional.orElse(null);
    if (this.referenceRange == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        value,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#device() device} attribute.
   * @param value The value for device
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withDevice(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "device");
    if (this.device == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        newValue,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#device() device} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for device
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withDevice(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.device == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        value,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#effectiveInstant() effectiveInstant} attribute.
   * @param value The value for effectiveInstant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withEffectiveInstant(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "effectiveInstant");
    if (Objects.equals(this.effectiveInstant, newValue)) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        newValue,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#effectiveInstant() effectiveInstant} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveInstant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withEffectiveInstant(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.effectiveInstant, value)) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        value,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        newValue,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        value,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        newValue,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        value,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        newValue,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        value,
        this.extension,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        newValue,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        value,
        this.valueRange,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueRange() valueRange} attribute.
   * @param value The value for valueRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "valueRange");
    if (this.valueRange == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        newValue,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueRange() valueRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withValueRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.valueRange == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        value,
        this.effectiveTiming);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#effectiveTiming() effectiveTiming} attribute.
   * @param value The value for effectiveTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withEffectiveTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "effectiveTiming");
    if (this.effectiveTiming == newValue) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#effectiveTiming() effectiveTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withEffectiveTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.effectiveTiming == value) return this;
    return new ImmutableObservation(
        this.valueQuantity,
        this.issued,
        this.valueString,
        this.specimen,
        this.hasMember,
        this.encounter,
        this.valuePeriod,
        this.bodySite,
        this.text,
        this.code,
        this.valueInteger,
        this.note,
        this.category,
        this.resourceType,
        this.language,
        this.performer,
        this.derivedFrom,
        this.meta,
        this.status,
        this.effectiveDateTime,
        this.interpretation,
        this.method,
        this.valueCodeableConcept,
        this.dataAbsentReason,
        this.subject,
        this.implicitRules,
        this.valueDateTime,
        this.partOf,
        this.basedOn,
        this.focus,
        this.valueTime,
        this.identifier,
        this.component,
        this.valueSampledData,
        this.contained,
        this.modifierExtension,
        this.valueRatio,
        this.referenceRange,
        this.device,
        this.effectiveInstant,
        this.id,
        this.effectivePeriod,
        this.valueBoolean,
        this.extension,
        this.valueRange,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableObservation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableObservation
        && equalTo((ImmutableObservation) another);
  }

  private boolean equalTo(ImmutableObservation another) {
    return Objects.equals(valueQuantity, another.valueQuantity)
        && Objects.equals(issued, another.issued)
        && Objects.equals(valueString, another.valueString)
        && Objects.equals(specimen, another.specimen)
        && Objects.equals(hasMember, another.hasMember)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(valuePeriod, another.valuePeriod)
        && Objects.equals(bodySite, another.bodySite)
        && Objects.equals(text, another.text)
        && code.equals(another.code)
        && Objects.equals(valueInteger, another.valueInteger)
        && Objects.equals(note, another.note)
        && Objects.equals(category, another.category)
        && resourceType.equals(another.resourceType)
        && Objects.equals(language, another.language)
        && Objects.equals(performer, another.performer)
        && Objects.equals(derivedFrom, another.derivedFrom)
        && Objects.equals(meta, another.meta)
        && Objects.equals(status, another.status)
        && Objects.equals(effectiveDateTime, another.effectiveDateTime)
        && Objects.equals(interpretation, another.interpretation)
        && Objects.equals(method, another.method)
        && Objects.equals(valueCodeableConcept, another.valueCodeableConcept)
        && Objects.equals(dataAbsentReason, another.dataAbsentReason)
        && Objects.equals(subject, another.subject)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(valueDateTime, another.valueDateTime)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(focus, another.focus)
        && Objects.equals(valueTime, another.valueTime)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(component, another.component)
        && Objects.equals(valueSampledData, another.valueSampledData)
        && Objects.equals(contained, another.contained)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(valueRatio, another.valueRatio)
        && Objects.equals(referenceRange, another.referenceRange)
        && Objects.equals(device, another.device)
        && Objects.equals(effectiveInstant, another.effectiveInstant)
        && Objects.equals(id, another.id)
        && Objects.equals(effectivePeriod, another.effectivePeriod)
        && Objects.equals(valueBoolean, another.valueBoolean)
        && Objects.equals(extension, another.extension)
        && Objects.equals(valueRange, another.valueRange)
        && Objects.equals(effectiveTiming, another.effectiveTiming);
  }

  /**
   * Computes a hash code from attributes: {@code valueQuantity}, {@code issued}, {@code valueString}, {@code specimen}, {@code hasMember}, {@code encounter}, {@code valuePeriod}, {@code bodySite}, {@code text}, {@code code}, {@code valueInteger}, {@code note}, {@code category}, {@code resourceType}, {@code language}, {@code performer}, {@code derivedFrom}, {@code meta}, {@code status}, {@code effectiveDateTime}, {@code interpretation}, {@code method}, {@code valueCodeableConcept}, {@code dataAbsentReason}, {@code subject}, {@code implicitRules}, {@code valueDateTime}, {@code partOf}, {@code basedOn}, {@code focus}, {@code valueTime}, {@code identifier}, {@code component}, {@code valueSampledData}, {@code contained}, {@code modifierExtension}, {@code valueRatio}, {@code referenceRange}, {@code device}, {@code effectiveInstant}, {@code id}, {@code effectivePeriod}, {@code valueBoolean}, {@code extension}, {@code valueRange}, {@code effectiveTiming}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(valueQuantity);
    h += (h << 5) + Objects.hashCode(issued);
    h += (h << 5) + Objects.hashCode(valueString);
    h += (h << 5) + Objects.hashCode(specimen);
    h += (h << 5) + Objects.hashCode(hasMember);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(valuePeriod);
    h += (h << 5) + Objects.hashCode(bodySite);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + Objects.hashCode(valueInteger);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + Objects.hashCode(derivedFrom);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(effectiveDateTime);
    h += (h << 5) + Objects.hashCode(interpretation);
    h += (h << 5) + Objects.hashCode(method);
    h += (h << 5) + Objects.hashCode(valueCodeableConcept);
    h += (h << 5) + Objects.hashCode(dataAbsentReason);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(valueDateTime);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(focus);
    h += (h << 5) + Objects.hashCode(valueTime);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(component);
    h += (h << 5) + Objects.hashCode(valueSampledData);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(valueRatio);
    h += (h << 5) + Objects.hashCode(referenceRange);
    h += (h << 5) + Objects.hashCode(device);
    h += (h << 5) + Objects.hashCode(effectiveInstant);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(effectivePeriod);
    h += (h << 5) + Objects.hashCode(valueBoolean);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(valueRange);
    h += (h << 5) + Objects.hashCode(effectiveTiming);
    return h;
  }

  /**
   * Prints the immutable value {@code Observation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Observation{");
    if (valueQuantity != null) {
      builder.append("valueQuantity=").append(valueQuantity);
    }
    if (issued != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("issued=").append(issued);
    }
    if (valueString != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (specimen != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("specimen=").append(specimen);
    }
    if (hasMember != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("hasMember=").append(hasMember);
    }
    if (encounter != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (valuePeriod != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("valuePeriod=").append(valuePeriod);
    }
    if (bodySite != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (text != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (builder.length() > 12) builder.append(", ");
    builder.append("code=").append(code);
    if (valueInteger != null) {
      builder.append(", ");
      builder.append("valueInteger=").append(valueInteger);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (derivedFrom != null) {
      builder.append(", ");
      builder.append("derivedFrom=").append(derivedFrom);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (effectiveDateTime != null) {
      builder.append(", ");
      builder.append("effectiveDateTime=").append(effectiveDateTime);
    }
    if (interpretation != null) {
      builder.append(", ");
      builder.append("interpretation=").append(interpretation);
    }
    if (method != null) {
      builder.append(", ");
      builder.append("method=").append(method);
    }
    if (valueCodeableConcept != null) {
      builder.append(", ");
      builder.append("valueCodeableConcept=").append(valueCodeableConcept);
    }
    if (dataAbsentReason != null) {
      builder.append(", ");
      builder.append("dataAbsentReason=").append(dataAbsentReason);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (valueDateTime != null) {
      builder.append(", ");
      builder.append("valueDateTime=").append(valueDateTime);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (focus != null) {
      builder.append(", ");
      builder.append("focus=").append(focus);
    }
    if (valueTime != null) {
      builder.append(", ");
      builder.append("valueTime=").append(valueTime);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (component != null) {
      builder.append(", ");
      builder.append("component=").append(component);
    }
    if (valueSampledData != null) {
      builder.append(", ");
      builder.append("valueSampledData=").append(valueSampledData);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (valueRatio != null) {
      builder.append(", ");
      builder.append("valueRatio=").append(valueRatio);
    }
    if (referenceRange != null) {
      builder.append(", ");
      builder.append("referenceRange=").append(referenceRange);
    }
    if (device != null) {
      builder.append(", ");
      builder.append("device=").append(device);
    }
    if (effectiveInstant != null) {
      builder.append(", ");
      builder.append("effectiveInstant=").append(effectiveInstant);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (valueBoolean != null) {
      builder.append(", ");
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (valueRange != null) {
      builder.append(", ");
      builder.append("valueRange=").append(valueRange);
    }
    if (effectiveTiming != null) {
      builder.append(", ");
      builder.append("effectiveTiming=").append(effectiveTiming);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Observation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Observation {
    @Nullable Optional<Quantity> valueQuantity = Optional.empty();
    boolean valueQuantityIsSet;
    @Nullable Optional<Instant> issued = Optional.empty();
    boolean issuedIsSet;
    @Nullable Optional<String> valueString = Optional.empty();
    boolean valueStringIsSet;
    @Nullable Optional<Reference> specimen = Optional.empty();
    boolean specimenIsSet;
    @Nullable Optional<List<Reference>> hasMember = Optional.empty();
    boolean hasMemberIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<Period> valuePeriod = Optional.empty();
    boolean valuePeriodIsSet;
    @Nullable Optional<CodeableConcept> bodySite = Optional.empty();
    boolean bodySiteIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable CodeableConcept code;
    @Nullable Optional<Double> valueInteger = Optional.empty();
    boolean valueIntegerIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Reference>> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable Optional<List<Reference>> derivedFrom = Optional.empty();
    boolean derivedFromIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<ObservationStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<String> effectiveDateTime = Optional.empty();
    boolean effectiveDateTimeIsSet;
    @Nullable Optional<List<CodeableConcept>> interpretation = Optional.empty();
    boolean interpretationIsSet;
    @Nullable Optional<CodeableConcept> method = Optional.empty();
    boolean methodIsSet;
    @Nullable Optional<CodeableConcept> valueCodeableConcept = Optional.empty();
    boolean valueCodeableConceptIsSet;
    @Nullable Optional<CodeableConcept> dataAbsentReason = Optional.empty();
    boolean dataAbsentReasonIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<String> valueDateTime = Optional.empty();
    boolean valueDateTimeIsSet;
    @Nullable Optional<List<Reference>> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<List<Reference>> focus = Optional.empty();
    boolean focusIsSet;
    @Nullable Optional<String> valueTime = Optional.empty();
    boolean valueTimeIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Observation_Component>> component = Optional.empty();
    boolean componentIsSet;
    @Nullable Optional<SampledData> valueSampledData = Optional.empty();
    boolean valueSampledDataIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Ratio> valueRatio = Optional.empty();
    boolean valueRatioIsSet;
    @Nullable Optional<List<Observation_ReferenceRange>> referenceRange = Optional.empty();
    boolean referenceRangeIsSet;
    @Nullable Optional<Reference> device = Optional.empty();
    boolean deviceIsSet;
    @Nullable Optional<String> effectiveInstant = Optional.empty();
    boolean effectiveInstantIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Period> effectivePeriod = Optional.empty();
    boolean effectivePeriodIsSet;
    @Nullable Optional<Boolean> valueBoolean = Optional.empty();
    boolean valueBooleanIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Range> valueRange = Optional.empty();
    boolean valueRangeIsSet;
    @Nullable Optional<Timing> effectiveTiming = Optional.empty();
    boolean effectiveTimingIsSet;
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Optional<Quantity> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
    }
    @JsonProperty("issued")
    public void setIssued(Optional<Instant> issued) {
      this.issued = issued;
      this.issuedIsSet = true;
    }
    @JsonProperty("valueString")
    public void setValueString(Optional<String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @JsonProperty("specimen")
    public void setSpecimen(Optional<Reference> specimen) {
      this.specimen = specimen;
      this.specimenIsSet = true;
    }
    @JsonProperty("hasMember")
    public void setHasMember(Optional<List<Reference>> hasMember) {
      this.hasMember = hasMember;
      this.hasMemberIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("valuePeriod")
    public void setValuePeriod(Optional<Period> valuePeriod) {
      this.valuePeriod = valuePeriod;
      this.valuePeriodIsSet = true;
    }
    @JsonProperty("bodySite")
    public void setBodySite(Optional<CodeableConcept> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
      this.code = code;
    }
    @JsonProperty("valueInteger")
    public void setValueInteger(Optional<Double> valueInteger) {
      this.valueInteger = valueInteger;
      this.valueIntegerIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<List<Reference>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @JsonProperty("derivedFrom")
    public void setDerivedFrom(Optional<List<Reference>> derivedFrom) {
      this.derivedFrom = derivedFrom;
      this.derivedFromIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<ObservationStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("effectiveDateTime")
    public void setEffectiveDateTime(Optional<String> effectiveDateTime) {
      this.effectiveDateTime = effectiveDateTime;
      this.effectiveDateTimeIsSet = true;
    }
    @JsonProperty("interpretation")
    public void setInterpretation(Optional<List<CodeableConcept>> interpretation) {
      this.interpretation = interpretation;
      this.interpretationIsSet = true;
    }
    @JsonProperty("method")
    public void setMethod(Optional<CodeableConcept> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @JsonProperty("valueCodeableConcept")
    public void setValueCodeableConcept(Optional<CodeableConcept> valueCodeableConcept) {
      this.valueCodeableConcept = valueCodeableConcept;
      this.valueCodeableConceptIsSet = true;
    }
    @JsonProperty("dataAbsentReason")
    public void setDataAbsentReason(Optional<CodeableConcept> dataAbsentReason) {
      this.dataAbsentReason = dataAbsentReason;
      this.dataAbsentReasonIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("valueDateTime")
    public void setValueDateTime(Optional<String> valueDateTime) {
      this.valueDateTime = valueDateTime;
      this.valueDateTimeIsSet = true;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<List<Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("focus")
    public void setFocus(Optional<List<Reference>> focus) {
      this.focus = focus;
      this.focusIsSet = true;
    }
    @JsonProperty("valueTime")
    public void setValueTime(Optional<String> valueTime) {
      this.valueTime = valueTime;
      this.valueTimeIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("component")
    public void setComponent(Optional<List<Observation_Component>> component) {
      this.component = component;
      this.componentIsSet = true;
    }
    @JsonProperty("valueSampledData")
    public void setValueSampledData(Optional<SampledData> valueSampledData) {
      this.valueSampledData = valueSampledData;
      this.valueSampledDataIsSet = true;
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
    @JsonProperty("valueRatio")
    public void setValueRatio(Optional<Ratio> valueRatio) {
      this.valueRatio = valueRatio;
      this.valueRatioIsSet = true;
    }
    @JsonProperty("referenceRange")
    public void setReferenceRange(Optional<List<Observation_ReferenceRange>> referenceRange) {
      this.referenceRange = referenceRange;
      this.referenceRangeIsSet = true;
    }
    @JsonProperty("device")
    public void setDevice(Optional<Reference> device) {
      this.device = device;
      this.deviceIsSet = true;
    }
    @JsonProperty("effectiveInstant")
    public void setEffectiveInstant(Optional<String> effectiveInstant) {
      this.effectiveInstant = effectiveInstant;
      this.effectiveInstantIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("effectivePeriod")
    public void setEffectivePeriod(Optional<Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Optional<Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("valueRange")
    public void setValueRange(Optional<Range> valueRange) {
      this.valueRange = valueRange;
      this.valueRangeIsSet = true;
    }
    @JsonProperty("effectiveTiming")
    public void setEffectiveTiming(Optional<Timing> effectiveTiming) {
      this.effectiveTiming = effectiveTiming;
      this.effectiveTimingIsSet = true;
    }
    @Override
    public Optional<Quantity> valueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> issued() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> specimen() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> hasMember() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> valuePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueInteger() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> derivedFrom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ObservationStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> effectiveDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> interpretation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> method() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> valueCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> dataAbsentReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> focus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Observation_Component>> component() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SampledData> valueSampledData() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> valueRatio() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Observation_ReferenceRange>> referenceRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> device() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> effectiveInstant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> valueRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> effectiveTiming() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableObservation fromJson(Json json) {
    ImmutableObservation.Builder builder = ((ImmutableObservation.Builder) ImmutableObservation.builder());
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    if (json.issuedIsSet) {
      builder.issued(json.issued);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.specimenIsSet) {
      builder.specimen(json.specimen);
    }
    if (json.hasMemberIsSet) {
      builder.hasMember(json.hasMember);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.valuePeriodIsSet) {
      builder.valuePeriod(json.valuePeriod);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.valueIntegerIsSet) {
      builder.valueInteger(json.valueInteger);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.derivedFromIsSet) {
      builder.derivedFrom(json.derivedFrom);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.effectiveDateTimeIsSet) {
      builder.effectiveDateTime(json.effectiveDateTime);
    }
    if (json.interpretationIsSet) {
      builder.interpretation(json.interpretation);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    if (json.valueCodeableConceptIsSet) {
      builder.valueCodeableConcept(json.valueCodeableConcept);
    }
    if (json.dataAbsentReasonIsSet) {
      builder.dataAbsentReason(json.dataAbsentReason);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.valueDateTimeIsSet) {
      builder.valueDateTime(json.valueDateTime);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.focusIsSet) {
      builder.focus(json.focus);
    }
    if (json.valueTimeIsSet) {
      builder.valueTime(json.valueTime);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.componentIsSet) {
      builder.component(json.component);
    }
    if (json.valueSampledDataIsSet) {
      builder.valueSampledData(json.valueSampledData);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueRatioIsSet) {
      builder.valueRatio(json.valueRatio);
    }
    if (json.referenceRangeIsSet) {
      builder.referenceRange(json.referenceRange);
    }
    if (json.deviceIsSet) {
      builder.device(json.device);
    }
    if (json.effectiveInstantIsSet) {
      builder.effectiveInstant(json.effectiveInstant);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueRangeIsSet) {
      builder.valueRange(json.valueRange);
    }
    if (json.effectiveTimingIsSet) {
      builder.effectiveTiming(json.effectiveTiming);
    }
    return (ImmutableObservation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Observation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Observation instance
   */
  public static Observation copyOf(Observation instance) {
    if (instance instanceof ImmutableObservation) {
      return (ImmutableObservation) instance;
    }
    return ((ImmutableObservation.Builder) ImmutableObservation.builder())
        .valueQuantity(instance.valueQuantity())
        .issued(instance.issued())
        .valueString(instance.valueString())
        .specimen(instance.specimen())
        .hasMember(instance.hasMember())
        .encounter(instance.encounter())
        .valuePeriod(instance.valuePeriod())
        .bodySite(instance.bodySite())
        .text(instance.text())
        .code(instance.code())
        .valueInteger(instance.valueInteger())
        .note(instance.note())
        .category(instance.category())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .performer(instance.performer())
        .derivedFrom(instance.derivedFrom())
        .meta(instance.meta())
        .status(instance.status())
        .effectiveDateTime(instance.effectiveDateTime())
        .interpretation(instance.interpretation())
        .method(instance.method())
        .valueCodeableConcept(instance.valueCodeableConcept())
        .dataAbsentReason(instance.dataAbsentReason())
        .subject(instance.subject())
        .implicitRules(instance.implicitRules())
        .valueDateTime(instance.valueDateTime())
        .partOf(instance.partOf())
        .basedOn(instance.basedOn())
        .focus(instance.focus())
        .valueTime(instance.valueTime())
        .identifier(instance.identifier())
        .component(instance.component())
        .valueSampledData(instance.valueSampledData())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .valueRatio(instance.valueRatio())
        .referenceRange(instance.referenceRange())
        .device(instance.device())
        .effectiveInstant(instance.effectiveInstant())
        .id(instance.id())
        .effectivePeriod(instance.effectivePeriod())
        .valueBoolean(instance.valueBoolean())
        .extension(instance.extension())
        .valueRange(instance.valueRange())
        .effectiveTiming(instance.effectiveTiming())
        .build();
  }

  /**
   * Creates a builder for {@link Observation Observation}.
   * <pre>
   * ImmutableObservation.builder()
   *    .valueQuantity(com.fhir.types.fhir.Quantity) // optional {@link Observation#valueQuantity() valueQuantity}
   *    .issued(com.fhir.types.fhir.Instant) // optional {@link Observation#issued() issued}
   *    .valueString(String) // optional {@link Observation#valueString() valueString}
   *    .specimen(com.fhir.types.fhir.Reference) // optional {@link Observation#specimen() specimen}
   *    .hasMember(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Observation#hasMember() hasMember}
   *    .encounter(com.fhir.types.fhir.Reference) // optional {@link Observation#encounter() encounter}
   *    .valuePeriod(com.fhir.types.fhir.Period) // optional {@link Observation#valuePeriod() valuePeriod}
   *    .bodySite(com.fhir.types.fhir.CodeableConcept) // optional {@link Observation#bodySite() bodySite}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Observation#text() text}
   *    .code(com.fhir.types.fhir.CodeableConcept) // required {@link Observation#code() code}
   *    .valueInteger(Double) // optional {@link Observation#valueInteger() valueInteger}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link Observation#note() note}
   *    .category(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Observation#category() category}
   *    .resourceType(String) // required {@link Observation#resourceType() resourceType}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Observation#language() language}
   *    .performer(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Observation#performer() performer}
   *    .derivedFrom(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Observation#derivedFrom() derivedFrom}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Observation#meta() meta}
   *    .status(com.fhir.types.fhir.ObservationStatus) // optional {@link Observation#status() status}
   *    .effectiveDateTime(String) // optional {@link Observation#effectiveDateTime() effectiveDateTime}
   *    .interpretation(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Observation#interpretation() interpretation}
   *    .method(com.fhir.types.fhir.CodeableConcept) // optional {@link Observation#method() method}
   *    .valueCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link Observation#valueCodeableConcept() valueCodeableConcept}
   *    .dataAbsentReason(com.fhir.types.fhir.CodeableConcept) // optional {@link Observation#dataAbsentReason() dataAbsentReason}
   *    .subject(com.fhir.types.fhir.Reference) // optional {@link Observation#subject() subject}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Observation#implicitRules() implicitRules}
   *    .valueDateTime(String) // optional {@link Observation#valueDateTime() valueDateTime}
   *    .partOf(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Observation#partOf() partOf}
   *    .basedOn(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Observation#basedOn() basedOn}
   *    .focus(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Observation#focus() focus}
   *    .valueTime(String) // optional {@link Observation#valueTime() valueTime}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Observation#identifier() identifier}
   *    .component(List&amp;lt;com.fhir.types.fhir.Observation_Component&amp;gt;) // optional {@link Observation#component() component}
   *    .valueSampledData(com.fhir.types.fhir.SampledData) // optional {@link Observation#valueSampledData() valueSampledData}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Observation#contained() contained}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Observation#modifierExtension() modifierExtension}
   *    .valueRatio(com.fhir.types.fhir.Ratio) // optional {@link Observation#valueRatio() valueRatio}
   *    .referenceRange(List&amp;lt;com.fhir.types.fhir.Observation_ReferenceRange&amp;gt;) // optional {@link Observation#referenceRange() referenceRange}
   *    .device(com.fhir.types.fhir.Reference) // optional {@link Observation#device() device}
   *    .effectiveInstant(String) // optional {@link Observation#effectiveInstant() effectiveInstant}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Observation#id() id}
   *    .effectivePeriod(com.fhir.types.fhir.Period) // optional {@link Observation#effectivePeriod() effectivePeriod}
   *    .valueBoolean(Boolean) // optional {@link Observation#valueBoolean() valueBoolean}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Observation#extension() extension}
   *    .valueRange(com.fhir.types.fhir.Range) // optional {@link Observation#valueRange() valueRange}
   *    .effectiveTiming(com.fhir.types.fhir.Timing) // optional {@link Observation#effectiveTiming() effectiveTiming}
   *    .build();
   * </pre>
   * @return A new Observation builder
   */
  public static CodeBuildStage builder() {
    return new ImmutableObservation.Builder();
  }

  /**
   * Builds instances of type {@link Observation Observation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Observation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CodeBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_VALUE_QUANTITY = 0x1L;
    private static final long OPT_BIT_ISSUED = 0x2L;
    private static final long OPT_BIT_VALUE_STRING = 0x4L;
    private static final long OPT_BIT_SPECIMEN = 0x8L;
    private static final long OPT_BIT_HAS_MEMBER = 0x10L;
    private static final long OPT_BIT_ENCOUNTER = 0x20L;
    private static final long OPT_BIT_VALUE_PERIOD = 0x40L;
    private static final long OPT_BIT_BODY_SITE = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_VALUE_INTEGER = 0x200L;
    private static final long OPT_BIT_NOTE = 0x400L;
    private static final long OPT_BIT_CATEGORY = 0x800L;
    private static final long OPT_BIT_LANGUAGE = 0x1000L;
    private static final long OPT_BIT_PERFORMER = 0x2000L;
    private static final long OPT_BIT_DERIVED_FROM = 0x4000L;
    private static final long OPT_BIT_META = 0x8000L;
    private static final long OPT_BIT_STATUS = 0x10000L;
    private static final long OPT_BIT_EFFECTIVE_DATE_TIME = 0x20000L;
    private static final long OPT_BIT_INTERPRETATION = 0x40000L;
    private static final long OPT_BIT_METHOD = 0x80000L;
    private static final long OPT_BIT_VALUE_CODEABLE_CONCEPT = 0x100000L;
    private static final long OPT_BIT_DATA_ABSENT_REASON = 0x200000L;
    private static final long OPT_BIT_SUBJECT = 0x400000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800000L;
    private static final long OPT_BIT_VALUE_DATE_TIME = 0x1000000L;
    private static final long OPT_BIT_PART_OF = 0x2000000L;
    private static final long OPT_BIT_BASED_ON = 0x4000000L;
    private static final long OPT_BIT_FOCUS = 0x8000000L;
    private static final long OPT_BIT_VALUE_TIME = 0x10000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x20000000L;
    private static final long OPT_BIT_COMPONENT = 0x40000000L;
    private static final long OPT_BIT_VALUE_SAMPLED_DATA = 0x80000000L;
    private static final long OPT_BIT_CONTAINED = 0x100000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200000000L;
    private static final long OPT_BIT_VALUE_RATIO = 0x400000000L;
    private static final long OPT_BIT_REFERENCE_RANGE = 0x800000000L;
    private static final long OPT_BIT_DEVICE = 0x1000000000L;
    private static final long OPT_BIT_EFFECTIVE_INSTANT = 0x2000000000L;
    private static final long OPT_BIT_ID = 0x4000000000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x8000000000L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x10000000000L;
    private static final long OPT_BIT_EXTENSION = 0x20000000000L;
    private static final long OPT_BIT_VALUE_RANGE = 0x40000000000L;
    private static final long OPT_BIT_EFFECTIVE_TIMING = 0x80000000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable Quantity valueQuantity;
    private @Nullable Instant issued;
    private @Nullable String valueString;
    private @Nullable Reference specimen;
    private @Nullable List<Reference> hasMember;
    private @Nullable Reference encounter;
    private @Nullable Period valuePeriod;
    private @Nullable CodeableConcept bodySite;
    private @Nullable Narrative text;
    private @Nullable CodeableConcept code;
    private @Nullable Double valueInteger;
    private @Nullable List<Annotation> note;
    private @Nullable List<CodeableConcept> category;
    private @Nullable String resourceType;
    private @Nullable Code language;
    private @Nullable List<Reference> performer;
    private @Nullable List<Reference> derivedFrom;
    private @Nullable Meta meta;
    private @Nullable ObservationStatus status;
    private @Nullable String effectiveDateTime;
    private @Nullable List<CodeableConcept> interpretation;
    private @Nullable CodeableConcept method;
    private @Nullable CodeableConcept valueCodeableConcept;
    private @Nullable CodeableConcept dataAbsentReason;
    private @Nullable Reference subject;
    private @Nullable Uri implicitRules;
    private @Nullable String valueDateTime;
    private @Nullable List<Reference> partOf;
    private @Nullable List<Reference> basedOn;
    private @Nullable List<Reference> focus;
    private @Nullable String valueTime;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Observation_Component> component;
    private @Nullable SampledData valueSampledData;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Ratio valueRatio;
    private @Nullable List<Observation_ReferenceRange> referenceRange;
    private @Nullable Reference device;
    private @Nullable String effectiveInstant;
    private @Nullable Id id;
    private @Nullable Period effectivePeriod;
    private @Nullable Boolean valueBoolean;
    private @Nullable List<Extension> extension;
    private @Nullable Range valueRange;
    private @Nullable Timing effectiveTiming;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Observation#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueQuantity(Quantity valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = Objects.requireNonNull(valueQuantity, "valueQuantity");
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueQuantity")
    public final Builder valueQuantity(Optional<? extends Quantity> valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = valueQuantity.orElse(null);
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    public final Builder issued(Instant issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = Objects.requireNonNull(issued, "issued");
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("issued")
    public final Builder issued(Optional<? extends Instant> issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = issued.orElse(null);
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueString(String valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = Objects.requireNonNull(valueString, "valueString");
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueString")
    public final Builder valueString(Optional<String> valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = valueString.orElse(null);
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    public final Builder specimen(Reference specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = Objects.requireNonNull(specimen, "specimen");
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specimen")
    public final Builder specimen(Optional<? extends Reference> specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = specimen.orElse(null);
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#hasMember() hasMember} to hasMember.
     * @param hasMember The value for hasMember
     * @return {@code this} builder for chained invocation
     */
    public final Builder hasMember(List<Reference> hasMember) {
      checkNotIsSet(hasMemberIsSet(), "hasMember");
      this.hasMember = Objects.requireNonNull(hasMember, "hasMember");
      optBits |= OPT_BIT_HAS_MEMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#hasMember() hasMember} to hasMember.
     * @param hasMember The value for hasMember
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("hasMember")
    public final Builder hasMember(Optional<? extends List<Reference>> hasMember) {
      checkNotIsSet(hasMemberIsSet(), "hasMember");
      this.hasMember = hasMember.orElse(null);
      optBits |= OPT_BIT_HAS_MEMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("encounter")
    public final Builder encounter(Optional<? extends Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder valuePeriod(Period valuePeriod) {
      checkNotIsSet(valuePeriodIsSet(), "valuePeriod");
      this.valuePeriod = Objects.requireNonNull(valuePeriod, "valuePeriod");
      optBits |= OPT_BIT_VALUE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valuePeriod")
    public final Builder valuePeriod(Optional<? extends Period> valuePeriod) {
      checkNotIsSet(valuePeriodIsSet(), "valuePeriod");
      this.valuePeriod = valuePeriod.orElse(null);
      optBits |= OPT_BIT_VALUE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    public final Builder bodySite(CodeableConcept bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = Objects.requireNonNull(bodySite, "bodySite");
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("bodySite")
    public final Builder bodySite(Optional<? extends CodeableConcept> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = bodySite.orElse(null);
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#text() text} to text.
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
     * Initializes the optional value {@link Observation#text() text} to text.
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
     * Initializes the value for the {@link Observation#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueInteger(double valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger;
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueInteger")
    public final Builder valueInteger(Optional<Double> valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger.orElse(null);
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#note() note} to note.
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
     * Initializes the optional value {@link Observation#note() note} to note.
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
     * Initializes the optional value {@link Observation#category() category} to category.
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
     * Initializes the optional value {@link Observation#category() category} to category.
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
     * Initializes the value for the {@link Observation#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Observation#language() language} to language.
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
     * Initializes the optional value {@link Observation#language() language} to language.
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
     * Initializes the optional value {@link Observation#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(List<Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performer")
    public final Builder performer(Optional<? extends List<Reference>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    public final Builder derivedFrom(List<Reference> derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = Objects.requireNonNull(derivedFrom, "derivedFrom");
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("derivedFrom")
    public final Builder derivedFrom(Optional<? extends List<Reference>> derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = derivedFrom.orElse(null);
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#meta() meta} to meta.
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
     * Initializes the optional value {@link Observation#meta() meta} to meta.
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
     * Initializes the optional value {@link Observation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(ObservationStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends ObservationStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectiveDateTime(String effectiveDateTime) {
      checkNotIsSet(effectiveDateTimeIsSet(), "effectiveDateTime");
      this.effectiveDateTime = Objects.requireNonNull(effectiveDateTime, "effectiveDateTime");
      optBits |= OPT_BIT_EFFECTIVE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("effectiveDateTime")
    public final Builder effectiveDateTime(Optional<String> effectiveDateTime) {
      checkNotIsSet(effectiveDateTimeIsSet(), "effectiveDateTime");
      this.effectiveDateTime = effectiveDateTime.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#interpretation() interpretation} to interpretation.
     * @param interpretation The value for interpretation
     * @return {@code this} builder for chained invocation
     */
    public final Builder interpretation(List<CodeableConcept> interpretation) {
      checkNotIsSet(interpretationIsSet(), "interpretation");
      this.interpretation = Objects.requireNonNull(interpretation, "interpretation");
      optBits |= OPT_BIT_INTERPRETATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#interpretation() interpretation} to interpretation.
     * @param interpretation The value for interpretation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("interpretation")
    public final Builder interpretation(Optional<? extends List<CodeableConcept>> interpretation) {
      checkNotIsSet(interpretationIsSet(), "interpretation");
      this.interpretation = interpretation.orElse(null);
      optBits |= OPT_BIT_INTERPRETATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(CodeableConcept method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("method")
    public final Builder method(Optional<? extends CodeableConcept> method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = method.orElse(null);
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCodeableConcept(CodeableConcept valueCodeableConcept) {
      checkNotIsSet(valueCodeableConceptIsSet(), "valueCodeableConcept");
      this.valueCodeableConcept = Objects.requireNonNull(valueCodeableConcept, "valueCodeableConcept");
      optBits |= OPT_BIT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueCodeableConcept")
    public final Builder valueCodeableConcept(Optional<? extends CodeableConcept> valueCodeableConcept) {
      checkNotIsSet(valueCodeableConceptIsSet(), "valueCodeableConcept");
      this.valueCodeableConcept = valueCodeableConcept.orElse(null);
      optBits |= OPT_BIT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder dataAbsentReason(CodeableConcept dataAbsentReason) {
      checkNotIsSet(dataAbsentReasonIsSet(), "dataAbsentReason");
      this.dataAbsentReason = Objects.requireNonNull(dataAbsentReason, "dataAbsentReason");
      optBits |= OPT_BIT_DATA_ABSENT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataAbsentReason")
    public final Builder dataAbsentReason(Optional<? extends CodeableConcept> dataAbsentReason) {
      checkNotIsSet(dataAbsentReasonIsSet(), "dataAbsentReason");
      this.dataAbsentReason = dataAbsentReason.orElse(null);
      optBits |= OPT_BIT_DATA_ABSENT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Optional<? extends Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Observation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Observation#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDateTime(String valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = Objects.requireNonNull(valueDateTime, "valueDateTime");
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDateTime")
    public final Builder valueDateTime(Optional<String> valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = valueDateTime.orElse(null);
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(List<Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("partOf")
    public final Builder partOf(Optional<? extends List<Reference>> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(List<Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("basedOn")
    public final Builder basedOn(Optional<? extends List<Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    public final Builder focus(List<Reference> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = Objects.requireNonNull(focus, "focus");
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("focus")
    public final Builder focus(Optional<? extends List<Reference>> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = focus.orElse(null);
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueTime(String valueTime) {
      checkNotIsSet(valueTimeIsSet(), "valueTime");
      this.valueTime = Objects.requireNonNull(valueTime, "valueTime");
      optBits |= OPT_BIT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueTime")
    public final Builder valueTime(Optional<String> valueTime) {
      checkNotIsSet(valueTimeIsSet(), "valueTime");
      this.valueTime = valueTime.orElse(null);
      optBits |= OPT_BIT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Observation#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Observation#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for chained invocation
     */
    public final Builder component(List<Observation_Component> component) {
      checkNotIsSet(componentIsSet(), "component");
      this.component = Objects.requireNonNull(component, "component");
      optBits |= OPT_BIT_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("component")
    public final Builder component(Optional<? extends List<Observation_Component>> component) {
      checkNotIsSet(componentIsSet(), "component");
      this.component = component.orElse(null);
      optBits |= OPT_BIT_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueSampledData(SampledData valueSampledData) {
      checkNotIsSet(valueSampledDataIsSet(), "valueSampledData");
      this.valueSampledData = Objects.requireNonNull(valueSampledData, "valueSampledData");
      optBits |= OPT_BIT_VALUE_SAMPLED_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueSampledData")
    public final Builder valueSampledData(Optional<? extends SampledData> valueSampledData) {
      checkNotIsSet(valueSampledDataIsSet(), "valueSampledData");
      this.valueSampledData = valueSampledData.orElse(null);
      optBits |= OPT_BIT_VALUE_SAMPLED_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#contained() contained} to contained.
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
     * Initializes the optional value {@link Observation#contained() contained} to contained.
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
     * Initializes the optional value {@link Observation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Observation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Observation#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueRatio(Ratio valueRatio) {
      checkNotIsSet(valueRatioIsSet(), "valueRatio");
      this.valueRatio = Objects.requireNonNull(valueRatio, "valueRatio");
      optBits |= OPT_BIT_VALUE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueRatio")
    public final Builder valueRatio(Optional<? extends Ratio> valueRatio) {
      checkNotIsSet(valueRatioIsSet(), "valueRatio");
      this.valueRatio = valueRatio.orElse(null);
      optBits |= OPT_BIT_VALUE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#referenceRange() referenceRange} to referenceRange.
     * @param referenceRange The value for referenceRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder referenceRange(List<Observation_ReferenceRange> referenceRange) {
      checkNotIsSet(referenceRangeIsSet(), "referenceRange");
      this.referenceRange = Objects.requireNonNull(referenceRange, "referenceRange");
      optBits |= OPT_BIT_REFERENCE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#referenceRange() referenceRange} to referenceRange.
     * @param referenceRange The value for referenceRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referenceRange")
    public final Builder referenceRange(Optional<? extends List<Observation_ReferenceRange>> referenceRange) {
      checkNotIsSet(referenceRangeIsSet(), "referenceRange");
      this.referenceRange = referenceRange.orElse(null);
      optBits |= OPT_BIT_REFERENCE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    public final Builder device(Reference device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = Objects.requireNonNull(device, "device");
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("device")
    public final Builder device(Optional<? extends Reference> device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = device.orElse(null);
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#effectiveInstant() effectiveInstant} to effectiveInstant.
     * @param effectiveInstant The value for effectiveInstant
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectiveInstant(String effectiveInstant) {
      checkNotIsSet(effectiveInstantIsSet(), "effectiveInstant");
      this.effectiveInstant = Objects.requireNonNull(effectiveInstant, "effectiveInstant");
      optBits |= OPT_BIT_EFFECTIVE_INSTANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#effectiveInstant() effectiveInstant} to effectiveInstant.
     * @param effectiveInstant The value for effectiveInstant
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("effectiveInstant")
    public final Builder effectiveInstant(Optional<String> effectiveInstant) {
      checkNotIsSet(effectiveInstantIsSet(), "effectiveInstant");
      this.effectiveInstant = effectiveInstant.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_INSTANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#id() id} to id.
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
     * Initializes the optional value {@link Observation#id() id} to id.
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
     * Initializes the optional value {@link Observation#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectivePeriod(Period effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = Objects.requireNonNull(effectivePeriod, "effectivePeriod");
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("effectivePeriod")
    public final Builder effectivePeriod(Optional<? extends Period> effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = effectivePeriod.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueBoolean(boolean valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean;
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueBoolean")
    public final Builder valueBoolean(Optional<Boolean> valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean.orElse(null);
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#extension() extension} to extension.
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
     * Initializes the optional value {@link Observation#extension() extension} to extension.
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
     * Initializes the optional value {@link Observation#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueRange(Range valueRange) {
      checkNotIsSet(valueRangeIsSet(), "valueRange");
      this.valueRange = Objects.requireNonNull(valueRange, "valueRange");
      optBits |= OPT_BIT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueRange")
    public final Builder valueRange(Optional<? extends Range> valueRange) {
      checkNotIsSet(valueRangeIsSet(), "valueRange");
      this.valueRange = valueRange.orElse(null);
      optBits |= OPT_BIT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#effectiveTiming() effectiveTiming} to effectiveTiming.
     * @param effectiveTiming The value for effectiveTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectiveTiming(Timing effectiveTiming) {
      checkNotIsSet(effectiveTimingIsSet(), "effectiveTiming");
      this.effectiveTiming = Objects.requireNonNull(effectiveTiming, "effectiveTiming");
      optBits |= OPT_BIT_EFFECTIVE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#effectiveTiming() effectiveTiming} to effectiveTiming.
     * @param effectiveTiming The value for effectiveTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("effectiveTiming")
    public final Builder effectiveTiming(Optional<? extends Timing> effectiveTiming) {
      checkNotIsSet(effectiveTimingIsSet(), "effectiveTiming");
      this.effectiveTiming = effectiveTiming.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_TIMING;
      return this;
    }

    /**
     * Builds a new {@link Observation Observation}.
     * @return An immutable instance of Observation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Observation build() {
      checkRequiredAttributes();
      return new ImmutableObservation(
          valueQuantity,
          issued,
          valueString,
          specimen,
          hasMember,
          encounter,
          valuePeriod,
          bodySite,
          text,
          code,
          valueInteger,
          note,
          category,
          resourceType,
          language,
          performer,
          derivedFrom,
          meta,
          status,
          effectiveDateTime,
          interpretation,
          method,
          valueCodeableConcept,
          dataAbsentReason,
          subject,
          implicitRules,
          valueDateTime,
          partOf,
          basedOn,
          focus,
          valueTime,
          identifier,
          component,
          valueSampledData,
          contained,
          modifierExtension,
          valueRatio,
          referenceRange,
          device,
          effectiveInstant,
          id,
          effectivePeriod,
          valueBoolean,
          extension,
          valueRange,
          effectiveTiming);
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean issuedIsSet() {
      return (optBits & OPT_BIT_ISSUED) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean specimenIsSet() {
      return (optBits & OPT_BIT_SPECIMEN) != 0;
    }

    private boolean hasMemberIsSet() {
      return (optBits & OPT_BIT_HAS_MEMBER) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean valuePeriodIsSet() {
      return (optBits & OPT_BIT_VALUE_PERIOD) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean valueIntegerIsSet() {
      return (optBits & OPT_BIT_VALUE_INTEGER) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean derivedFromIsSet() {
      return (optBits & OPT_BIT_DERIVED_FROM) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean effectiveDateTimeIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_DATE_TIME) != 0;
    }

    private boolean interpretationIsSet() {
      return (optBits & OPT_BIT_INTERPRETATION) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private boolean valueCodeableConceptIsSet() {
      return (optBits & OPT_BIT_VALUE_CODEABLE_CONCEPT) != 0;
    }

    private boolean dataAbsentReasonIsSet() {
      return (optBits & OPT_BIT_DATA_ABSENT_REASON) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean valueDateTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE_TIME) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean focusIsSet() {
      return (optBits & OPT_BIT_FOCUS) != 0;
    }

    private boolean valueTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_TIME) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean componentIsSet() {
      return (optBits & OPT_BIT_COMPONENT) != 0;
    }

    private boolean valueSampledDataIsSet() {
      return (optBits & OPT_BIT_VALUE_SAMPLED_DATA) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueRatioIsSet() {
      return (optBits & OPT_BIT_VALUE_RATIO) != 0;
    }

    private boolean referenceRangeIsSet() {
      return (optBits & OPT_BIT_REFERENCE_RANGE) != 0;
    }

    private boolean deviceIsSet() {
      return (optBits & OPT_BIT_DEVICE) != 0;
    }

    private boolean effectiveInstantIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_INSTANT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueRangeIsSet() {
      return (optBits & OPT_BIT_VALUE_RANGE) != 0;
    }

    private boolean effectiveTimingIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_TIMING) != 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Observation is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!codeIsSet()) attributes.add("code");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Observation, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Observation", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link Observation#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage code(CodeableConcept code);
  }

  @Generated(from = "Observation", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Observation#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Observation", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Observation#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueQuantity(Quantity valueQuantity);

    /**
     * Initializes the optional value {@link Observation#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueQuantity(Optional<? extends Quantity> valueQuantity);

    /**
     * Initializes the optional value {@link Observation#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    BuildFinal issued(Instant issued);

    /**
     * Initializes the optional value {@link Observation#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal issued(Optional<? extends Instant> issued);

    /**
     * Initializes the optional value {@link Observation#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueString(String valueString);

    /**
     * Initializes the optional value {@link Observation#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueString(Optional<String> valueString);

    /**
     * Initializes the optional value {@link Observation#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specimen(Reference specimen);

    /**
     * Initializes the optional value {@link Observation#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specimen(Optional<? extends Reference> specimen);

    /**
     * Initializes the optional value {@link Observation#hasMember() hasMember} to hasMember.
     * @param hasMember The value for hasMember
     * @return {@code this} builder for chained invocation
     */
    BuildFinal hasMember(List<Reference> hasMember);

    /**
     * Initializes the optional value {@link Observation#hasMember() hasMember} to hasMember.
     * @param hasMember The value for hasMember
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal hasMember(Optional<? extends List<Reference>> hasMember);

    /**
     * Initializes the optional value {@link Observation#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link Observation#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link Observation#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valuePeriod(Period valuePeriod);

    /**
     * Initializes the optional value {@link Observation#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valuePeriod(Optional<? extends Period> valuePeriod);

    /**
     * Initializes the optional value {@link Observation#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(CodeableConcept bodySite);

    /**
     * Initializes the optional value {@link Observation#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(Optional<? extends CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link Observation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Observation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Observation#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueInteger(double valueInteger);

    /**
     * Initializes the optional value {@link Observation#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueInteger(Optional<Double> valueInteger);

    /**
     * Initializes the optional value {@link Observation#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link Observation#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link Observation#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link Observation#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link Observation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Observation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Observation#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(List<Reference> performer);

    /**
     * Initializes the optional value {@link Observation#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(Optional<? extends List<Reference>> performer);

    /**
     * Initializes the optional value {@link Observation#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal derivedFrom(List<Reference> derivedFrom);

    /**
     * Initializes the optional value {@link Observation#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal derivedFrom(Optional<? extends List<Reference>> derivedFrom);

    /**
     * Initializes the optional value {@link Observation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Observation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Observation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(ObservationStatus status);

    /**
     * Initializes the optional value {@link Observation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends ObservationStatus> status);

    /**
     * Initializes the optional value {@link Observation#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectiveDateTime(String effectiveDateTime);

    /**
     * Initializes the optional value {@link Observation#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectiveDateTime(Optional<String> effectiveDateTime);

    /**
     * Initializes the optional value {@link Observation#interpretation() interpretation} to interpretation.
     * @param interpretation The value for interpretation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal interpretation(List<CodeableConcept> interpretation);

    /**
     * Initializes the optional value {@link Observation#interpretation() interpretation} to interpretation.
     * @param interpretation The value for interpretation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal interpretation(Optional<? extends List<CodeableConcept>> interpretation);

    /**
     * Initializes the optional value {@link Observation#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    BuildFinal method(CodeableConcept method);

    /**
     * Initializes the optional value {@link Observation#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal method(Optional<? extends CodeableConcept> method);

    /**
     * Initializes the optional value {@link Observation#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueCodeableConcept(CodeableConcept valueCodeableConcept);

    /**
     * Initializes the optional value {@link Observation#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueCodeableConcept(Optional<? extends CodeableConcept> valueCodeableConcept);

    /**
     * Initializes the optional value {@link Observation#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dataAbsentReason(CodeableConcept dataAbsentReason);

    /**
     * Initializes the optional value {@link Observation#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dataAbsentReason(Optional<? extends CodeableConcept> dataAbsentReason);

    /**
     * Initializes the optional value {@link Observation#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link Observation#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link Observation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Observation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Observation#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueDateTime(String valueDateTime);

    /**
     * Initializes the optional value {@link Observation#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueDateTime(Optional<String> valueDateTime);

    /**
     * Initializes the optional value {@link Observation#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(List<Reference> partOf);

    /**
     * Initializes the optional value {@link Observation#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends List<Reference>> partOf);

    /**
     * Initializes the optional value {@link Observation#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link Observation#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link Observation#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal focus(List<Reference> focus);

    /**
     * Initializes the optional value {@link Observation#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal focus(Optional<? extends List<Reference>> focus);

    /**
     * Initializes the optional value {@link Observation#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueTime(String valueTime);

    /**
     * Initializes the optional value {@link Observation#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueTime(Optional<String> valueTime);

    /**
     * Initializes the optional value {@link Observation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Observation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Observation#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for chained invocation
     */
    BuildFinal component(List<Observation_Component> component);

    /**
     * Initializes the optional value {@link Observation#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal component(Optional<? extends List<Observation_Component>> component);

    /**
     * Initializes the optional value {@link Observation#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueSampledData(SampledData valueSampledData);

    /**
     * Initializes the optional value {@link Observation#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueSampledData(Optional<? extends SampledData> valueSampledData);

    /**
     * Initializes the optional value {@link Observation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Observation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Observation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Observation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Observation#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueRatio(Ratio valueRatio);

    /**
     * Initializes the optional value {@link Observation#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueRatio(Optional<? extends Ratio> valueRatio);

    /**
     * Initializes the optional value {@link Observation#referenceRange() referenceRange} to referenceRange.
     * @param referenceRange The value for referenceRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referenceRange(List<Observation_ReferenceRange> referenceRange);

    /**
     * Initializes the optional value {@link Observation#referenceRange() referenceRange} to referenceRange.
     * @param referenceRange The value for referenceRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referenceRange(Optional<? extends List<Observation_ReferenceRange>> referenceRange);

    /**
     * Initializes the optional value {@link Observation#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    BuildFinal device(Reference device);

    /**
     * Initializes the optional value {@link Observation#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal device(Optional<? extends Reference> device);

    /**
     * Initializes the optional value {@link Observation#effectiveInstant() effectiveInstant} to effectiveInstant.
     * @param effectiveInstant The value for effectiveInstant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectiveInstant(String effectiveInstant);

    /**
     * Initializes the optional value {@link Observation#effectiveInstant() effectiveInstant} to effectiveInstant.
     * @param effectiveInstant The value for effectiveInstant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectiveInstant(Optional<String> effectiveInstant);

    /**
     * Initializes the optional value {@link Observation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Observation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Observation#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(Period effectivePeriod);

    /**
     * Initializes the optional value {@link Observation#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(Optional<? extends Period> effectivePeriod);

    /**
     * Initializes the optional value {@link Observation#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueBoolean(boolean valueBoolean);

    /**
     * Initializes the optional value {@link Observation#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueBoolean(Optional<Boolean> valueBoolean);

    /**
     * Initializes the optional value {@link Observation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Observation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Observation#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueRange(Range valueRange);

    /**
     * Initializes the optional value {@link Observation#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueRange(Optional<? extends Range> valueRange);

    /**
     * Initializes the optional value {@link Observation#effectiveTiming() effectiveTiming} to effectiveTiming.
     * @param effectiveTiming The value for effectiveTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectiveTiming(Timing effectiveTiming);

    /**
     * Initializes the optional value {@link Observation#effectiveTiming() effectiveTiming} to effectiveTiming.
     * @param effectiveTiming The value for effectiveTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectiveTiming(Optional<? extends Timing> effectiveTiming);

    /**
     * Builds a new {@link Observation Observation}.
     * @return An immutable instance of Observation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Observation build();
  }
}
