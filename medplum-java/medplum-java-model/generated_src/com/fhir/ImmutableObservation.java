//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Observation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableObservation.builder()}.
 */
@org.immutables.value.Generated(from = "Observation", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableObservation implements com.fhir.Observation {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> performer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String valueTime;
  private final @javax.annotation.Nullable com.fhir.Reference device;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> hasMember;
  private final @javax.annotation.Nullable com.fhir.Quantity valueQuantity;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept bodySite;
  private final @javax.annotation.Nullable java.lang.String valueDateTime;
  private final @javax.annotation.Nullable com.fhir.SampledData valueSampledData;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable com.fhir.instant issued;
  private final @javax.annotation.Nullable com.fhir.Period valuePeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.lang.String effectiveDateTime;
  private final @javax.annotation.Nullable com.fhir.Period effectivePeriod;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Observation_Component> component;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable java.lang.Double valueInteger;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.ObservationStatus status;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept method;
  private final @javax.annotation.Nullable com.fhir.Range valueRange;
  private final com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> derivedFrom;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> focus;
  private final @javax.annotation.Nullable java.lang.String effectiveInstant;
  private final @javax.annotation.Nullable com.fhir.Timing effectiveTiming;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept valueCodeableConcept;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
  private final @javax.annotation.Nullable java.lang.String valueString;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Observation_ReferenceRange> referenceRange;
  private final @javax.annotation.Nullable com.fhir.Ratio valueRatio;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept dataAbsentReason;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> interpretation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.Boolean valueBoolean;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Reference specimen;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;

  private ImmutableObservation(
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> performer,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String valueTime,
      @javax.annotation.Nullable com.fhir.Reference device,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> hasMember,
      @javax.annotation.Nullable com.fhir.Quantity valueQuantity,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.CodeableConcept bodySite,
      @javax.annotation.Nullable java.lang.String valueDateTime,
      @javax.annotation.Nullable com.fhir.SampledData valueSampledData,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable com.fhir.instant issued,
      @javax.annotation.Nullable com.fhir.Period valuePeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.lang.String effectiveDateTime,
      @javax.annotation.Nullable com.fhir.Period effectivePeriod,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Observation_Component> component,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable java.lang.Double valueInteger,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.ObservationStatus status,
      @javax.annotation.Nullable com.fhir.CodeableConcept method,
      @javax.annotation.Nullable com.fhir.Range valueRange,
      com.fhir.CodeableConcept code,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> derivedFrom,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> focus,
      @javax.annotation.Nullable java.lang.String effectiveInstant,
      @javax.annotation.Nullable com.fhir.Timing effectiveTiming,
      @javax.annotation.Nullable com.fhir.CodeableConcept valueCodeableConcept,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf,
      @javax.annotation.Nullable java.lang.String valueString,
      @javax.annotation.Nullable java.util.List<com.fhir.Observation_ReferenceRange> referenceRange,
      @javax.annotation.Nullable com.fhir.Ratio valueRatio,
      @javax.annotation.Nullable com.fhir.CodeableConcept dataAbsentReason,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Reference subject,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> interpretation,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.Boolean valueBoolean,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Reference specimen,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category) {
    this.performer = performer;
    this.modifierExtension = modifierExtension;
    this.valueTime = valueTime;
    this.device = device;
    this.hasMember = hasMember;
    this.valueQuantity = valueQuantity;
    this.implicitRules = implicitRules;
    this.bodySite = bodySite;
    this.valueDateTime = valueDateTime;
    this.valueSampledData = valueSampledData;
    this.basedOn = basedOn;
    this.issued = issued;
    this.valuePeriod = valuePeriod;
    this.extension = extension;
    this.identifier = identifier;
    this.effectiveDateTime = effectiveDateTime;
    this.effectivePeriod = effectivePeriod;
    this.id = id;
    this.component = component;
    this.encounter = encounter;
    this.valueInteger = valueInteger;
    this.text = text;
    this.status = status;
    this.method = method;
    this.valueRange = valueRange;
    this.code = code;
    this.derivedFrom = derivedFrom;
    this.focus = focus;
    this.effectiveInstant = effectiveInstant;
    this.effectiveTiming = effectiveTiming;
    this.valueCodeableConcept = valueCodeableConcept;
    this.partOf = partOf;
    this.valueString = valueString;
    this.referenceRange = referenceRange;
    this.valueRatio = valueRatio;
    this.dataAbsentReason = dataAbsentReason;
    this.resourceType = resourceType;
    this.subject = subject;
    this.interpretation = interpretation;
    this.note = note;
    this.language = language;
    this.valueBoolean = valueBoolean;
    this.meta = meta;
    this.contained = contained;
    this.specimen = specimen;
    this.category = category;
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> performer() {
    return java.util.Optional.ofNullable(performer);
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
   * @return The value of the {@code valueTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueTime")
  @Override
  public java.util.Optional<java.lang.String> valueTime() {
    return java.util.Optional.ofNullable(valueTime);
  }

  /**
   * @return The value of the {@code device} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("device")
  @Override
  public java.util.Optional<com.fhir.Reference> device() {
    return java.util.Optional.ofNullable(device);
  }

  /**
   * @return The value of the {@code hasMember} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("hasMember")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> hasMember() {
    return java.util.Optional.ofNullable(hasMember);
  }

  /**
   * @return The value of the {@code valueQuantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueQuantity")
  @Override
  public java.util.Optional<com.fhir.Quantity> valueQuantity() {
    return java.util.Optional.ofNullable(valueQuantity);
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
   * @return The value of the {@code bodySite} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> bodySite() {
    return java.util.Optional.ofNullable(bodySite);
  }

  /**
   * @return The value of the {@code valueDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueDateTime")
  @Override
  public java.util.Optional<java.lang.String> valueDateTime() {
    return java.util.Optional.ofNullable(valueDateTime);
  }

  /**
   * @return The value of the {@code valueSampledData} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueSampledData")
  @Override
  public java.util.Optional<com.fhir.SampledData> valueSampledData() {
    return java.util.Optional.ofNullable(valueSampledData);
  }

  /**
   * @return The value of the {@code basedOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() {
    return java.util.Optional.ofNullable(basedOn);
  }

  /**
   * @return The value of the {@code issued} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("issued")
  @Override
  public java.util.Optional<com.fhir.instant> issued() {
    return java.util.Optional.ofNullable(issued);
  }

  /**
   * @return The value of the {@code valuePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valuePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> valuePeriod() {
    return java.util.Optional.ofNullable(valuePeriod);
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
   * @return The value of the {@code effectiveDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectiveDateTime")
  @Override
  public java.util.Optional<java.lang.String> effectiveDateTime() {
    return java.util.Optional.ofNullable(effectiveDateTime);
  }

  /**
   * @return The value of the {@code effectivePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> effectivePeriod() {
    return java.util.Optional.ofNullable(effectivePeriod);
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
   * @return The value of the {@code component} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("component")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Observation_Component>> component() {
    return java.util.Optional.ofNullable(component);
  }

  /**
   * @return The value of the {@code encounter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("encounter")
  @Override
  public java.util.Optional<com.fhir.Reference> encounter() {
    return java.util.Optional.ofNullable(encounter);
  }

  /**
   * @return The value of the {@code valueInteger} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueInteger")
  @Override
  public java.util.Optional<java.lang.Double> valueInteger() {
    return java.util.Optional.ofNullable(valueInteger);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.ObservationStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code method} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("method")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> method() {
    return java.util.Optional.ofNullable(method);
  }

  /**
   * @return The value of the {@code valueRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueRange")
  @Override
  public java.util.Optional<com.fhir.Range> valueRange() {
    return java.util.Optional.ofNullable(valueRange);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public com.fhir.CodeableConcept code() {
    return code;
  }

  /**
   * @return The value of the {@code derivedFrom} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("derivedFrom")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> derivedFrom() {
    return java.util.Optional.ofNullable(derivedFrom);
  }

  /**
   * @return The value of the {@code focus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("focus")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> focus() {
    return java.util.Optional.ofNullable(focus);
  }

  /**
   * @return The value of the {@code effectiveInstant} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectiveInstant")
  @Override
  public java.util.Optional<java.lang.String> effectiveInstant() {
    return java.util.Optional.ofNullable(effectiveInstant);
  }

  /**
   * @return The value of the {@code effectiveTiming} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectiveTiming")
  @Override
  public java.util.Optional<com.fhir.Timing> effectiveTiming() {
    return java.util.Optional.ofNullable(effectiveTiming);
  }

  /**
   * @return The value of the {@code valueCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> valueCodeableConcept() {
    return java.util.Optional.ofNullable(valueCodeableConcept);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("partOf")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() {
    return java.util.Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code valueString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueString")
  @Override
  public java.util.Optional<java.lang.String> valueString() {
    return java.util.Optional.ofNullable(valueString);
  }

  /**
   * @return The value of the {@code referenceRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("referenceRange")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Observation_ReferenceRange>> referenceRange() {
    return java.util.Optional.ofNullable(referenceRange);
  }

  /**
   * @return The value of the {@code valueRatio} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueRatio")
  @Override
  public java.util.Optional<com.fhir.Ratio> valueRatio() {
    return java.util.Optional.ofNullable(valueRatio);
  }

  /**
   * @return The value of the {@code dataAbsentReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dataAbsentReason")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> dataAbsentReason() {
    return java.util.Optional.ofNullable(dataAbsentReason);
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
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public java.util.Optional<com.fhir.Reference> subject() {
    return java.util.Optional.ofNullable(subject);
  }

  /**
   * @return The value of the {@code interpretation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("interpretation")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> interpretation() {
    return java.util.Optional.ofNullable(interpretation);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code valueBoolean} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueBoolean")
  @Override
  public java.util.Optional<java.lang.Boolean> valueBoolean() {
    return java.util.Optional.ofNullable(valueBoolean);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code specimen} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("specimen")
  @Override
  public java.util.Optional<com.fhir.Reference> specimen() {
    return java.util.Optional.ofNullable(specimen);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withPerformer(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableObservation(
        newValue,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withPerformer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableObservation(
        value,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        newValue,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableObservation(
        this.performer,
        value,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueTime() valueTime} attribute.
   * @param value The value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueTime");
    if (java.util.Objects.equals(this.valueTime, newValue)) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        newValue,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueTime() valueTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueTime, value)) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        value,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#device() device} attribute.
   * @param value The value for device
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withDevice(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "device");
    if (this.device == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        newValue,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#device() device} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for device
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withDevice(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.device == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        value,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#hasMember() hasMember} attribute.
   * @param value The value for hasMember
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withHasMember(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "hasMember");
    if (this.hasMember == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        newValue,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#hasMember() hasMember} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hasMember
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withHasMember(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.hasMember == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        value,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        newValue,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withValueQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        value,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        newValue,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        value,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withBodySite(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        newValue,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withBodySite(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        value,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueDateTime() valueDateTime} attribute.
   * @param value The value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueDateTime");
    if (java.util.Objects.equals(this.valueDateTime, newValue)) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        newValue,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueDateTime() valueDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueDateTime, value)) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        value,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueSampledData() valueSampledData} attribute.
   * @param value The value for valueSampledData
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueSampledData(com.fhir.SampledData value) {
    @javax.annotation.Nullable com.fhir.SampledData newValue = java.util.Objects.requireNonNull(value, "valueSampledData");
    if (this.valueSampledData == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        newValue,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueSampledData() valueSampledData} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSampledData
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withValueSampledData(java.util.Optional<? extends com.fhir.SampledData> optional) {
    @javax.annotation.Nullable com.fhir.SampledData value = optional.orElse(null);
    if (this.valueSampledData == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        value,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        newValue,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        value,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#issued() issued} attribute.
   * @param value The value for issued
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withIssued(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "issued");
    if (this.issued == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        newValue,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#issued() issued} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issued
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withIssued(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.issued == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        value,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valuePeriod() valuePeriod} attribute.
   * @param value The value for valuePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValuePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "valuePeriod");
    if (this.valuePeriod == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        newValue,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valuePeriod() valuePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valuePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withValuePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.valuePeriod == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        value,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        newValue,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        value,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        newValue,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        value,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#effectiveDateTime() effectiveDateTime} attribute.
   * @param value The value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withEffectiveDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "effectiveDateTime");
    if (java.util.Objects.equals(this.effectiveDateTime, newValue)) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        newValue,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#effectiveDateTime() effectiveDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withEffectiveDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.effectiveDateTime, value)) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        value,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withEffectivePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        newValue,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withEffectivePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        value,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        newValue,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        value,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#component() component} attribute.
   * @param value The value for component
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withComponent(java.util.List<com.fhir.Observation_Component> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Observation_Component> newValue = java.util.Objects.requireNonNull(value, "component");
    if (this.component == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        newValue,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#component() component} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for component
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withComponent(java.util.Optional<? extends java.util.List<com.fhir.Observation_Component>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Observation_Component> value = optional.orElse(null);
    if (this.component == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        value,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        newValue,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        value,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueInteger() valueInteger} attribute.
   * @param value The value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueInteger(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.valueInteger, newValue)) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        newValue,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueInteger() valueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueInteger(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueInteger, value)) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        value,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        newValue,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        value,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withStatus(com.fhir.ObservationStatus value) {
    @javax.annotation.Nullable com.fhir.ObservationStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        newValue,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withStatus(java.util.Optional<? extends com.fhir.ObservationStatus> optional) {
    @javax.annotation.Nullable com.fhir.ObservationStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        value,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withMethod(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        newValue,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withMethod(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        value,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueRange() valueRange} attribute.
   * @param value The value for valueRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "valueRange");
    if (this.valueRange == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        newValue,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueRange() valueRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withValueRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.valueRange == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        value,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Observation#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableObservation withCode(com.fhir.CodeableConcept value) {
    if (this.code == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        newValue,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#derivedFrom() derivedFrom} attribute.
   * @param value The value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withDerivedFrom(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "derivedFrom");
    if (this.derivedFrom == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        newValue,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#derivedFrom() derivedFrom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withDerivedFrom(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.derivedFrom == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        value,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#focus() focus} attribute.
   * @param value The value for focus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withFocus(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "focus");
    if (this.focus == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        newValue,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#focus() focus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withFocus(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.focus == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        value,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#effectiveInstant() effectiveInstant} attribute.
   * @param value The value for effectiveInstant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withEffectiveInstant(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "effectiveInstant");
    if (java.util.Objects.equals(this.effectiveInstant, newValue)) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        newValue,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#effectiveInstant() effectiveInstant} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveInstant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withEffectiveInstant(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.effectiveInstant, value)) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        value,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#effectiveTiming() effectiveTiming} attribute.
   * @param value The value for effectiveTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withEffectiveTiming(com.fhir.Timing value) {
    @javax.annotation.Nullable com.fhir.Timing newValue = java.util.Objects.requireNonNull(value, "effectiveTiming");
    if (this.effectiveTiming == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        newValue,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#effectiveTiming() effectiveTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withEffectiveTiming(java.util.Optional<? extends com.fhir.Timing> optional) {
    @javax.annotation.Nullable com.fhir.Timing value = optional.orElse(null);
    if (this.effectiveTiming == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        value,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueCodeableConcept() valueCodeableConcept} attribute.
   * @param value The value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "valueCodeableConcept");
    if (this.valueCodeableConcept == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        newValue,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueCodeableConcept() valueCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withValueCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.valueCodeableConcept == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        value,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withPartOf(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        newValue,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withPartOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        value,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueString");
    if (java.util.Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        newValue,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueString, value)) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        value,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#referenceRange() referenceRange} attribute.
   * @param value The value for referenceRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withReferenceRange(java.util.List<com.fhir.Observation_ReferenceRange> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Observation_ReferenceRange> newValue = java.util.Objects.requireNonNull(value, "referenceRange");
    if (this.referenceRange == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        newValue,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#referenceRange() referenceRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referenceRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withReferenceRange(java.util.Optional<? extends java.util.List<com.fhir.Observation_ReferenceRange>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Observation_ReferenceRange> value = optional.orElse(null);
    if (this.referenceRange == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        value,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueRatio() valueRatio} attribute.
   * @param value The value for valueRatio
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueRatio(com.fhir.Ratio value) {
    @javax.annotation.Nullable com.fhir.Ratio newValue = java.util.Objects.requireNonNull(value, "valueRatio");
    if (this.valueRatio == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        newValue,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueRatio() valueRatio} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRatio
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withValueRatio(java.util.Optional<? extends com.fhir.Ratio> optional) {
    @javax.annotation.Nullable com.fhir.Ratio value = optional.orElse(null);
    if (this.valueRatio == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        value,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#dataAbsentReason() dataAbsentReason} attribute.
   * @param value The value for dataAbsentReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withDataAbsentReason(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "dataAbsentReason");
    if (this.dataAbsentReason == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        newValue,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#dataAbsentReason() dataAbsentReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dataAbsentReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withDataAbsentReason(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.dataAbsentReason == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        value,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Observation#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableObservation withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        newValue,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        newValue,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        value,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#interpretation() interpretation} attribute.
   * @param value The value for interpretation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withInterpretation(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "interpretation");
    if (this.interpretation == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        newValue,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#interpretation() interpretation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for interpretation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withInterpretation(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.interpretation == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        value,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        newValue,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        value,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        newValue,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        value,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueBoolean(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        newValue,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withValueBoolean(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        value,
        this.meta,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        newValue,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        value,
        this.contained,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        newValue,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        value,
        this.specimen,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#specimen() specimen} attribute.
   * @param value The value for specimen
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withSpecimen(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "specimen");
    if (this.specimen == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        newValue,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#specimen() specimen} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specimen
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withSpecimen(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.specimen == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        value,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation withCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation withCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableObservation(
        this.performer,
        this.modifierExtension,
        this.valueTime,
        this.device,
        this.hasMember,
        this.valueQuantity,
        this.implicitRules,
        this.bodySite,
        this.valueDateTime,
        this.valueSampledData,
        this.basedOn,
        this.issued,
        this.valuePeriod,
        this.extension,
        this.identifier,
        this.effectiveDateTime,
        this.effectivePeriod,
        this.id,
        this.component,
        this.encounter,
        this.valueInteger,
        this.text,
        this.status,
        this.method,
        this.valueRange,
        this.code,
        this.derivedFrom,
        this.focus,
        this.effectiveInstant,
        this.effectiveTiming,
        this.valueCodeableConcept,
        this.partOf,
        this.valueString,
        this.referenceRange,
        this.valueRatio,
        this.dataAbsentReason,
        this.resourceType,
        this.subject,
        this.interpretation,
        this.note,
        this.language,
        this.valueBoolean,
        this.meta,
        this.contained,
        this.specimen,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableObservation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableObservation
        && equalTo((ImmutableObservation) another);
  }

  private boolean equalTo(ImmutableObservation another) {
    return java.util.Objects.equals(performer, another.performer)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(valueTime, another.valueTime)
        && java.util.Objects.equals(device, another.device)
        && java.util.Objects.equals(hasMember, another.hasMember)
        && java.util.Objects.equals(valueQuantity, another.valueQuantity)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(bodySite, another.bodySite)
        && java.util.Objects.equals(valueDateTime, another.valueDateTime)
        && java.util.Objects.equals(valueSampledData, another.valueSampledData)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(issued, another.issued)
        && java.util.Objects.equals(valuePeriod, another.valuePeriod)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(effectiveDateTime, another.effectiveDateTime)
        && java.util.Objects.equals(effectivePeriod, another.effectivePeriod)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(component, another.component)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(valueInteger, another.valueInteger)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(method, another.method)
        && java.util.Objects.equals(valueRange, another.valueRange)
        && code.equals(another.code)
        && java.util.Objects.equals(derivedFrom, another.derivedFrom)
        && java.util.Objects.equals(focus, another.focus)
        && java.util.Objects.equals(effectiveInstant, another.effectiveInstant)
        && java.util.Objects.equals(effectiveTiming, another.effectiveTiming)
        && java.util.Objects.equals(valueCodeableConcept, another.valueCodeableConcept)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(valueString, another.valueString)
        && java.util.Objects.equals(referenceRange, another.referenceRange)
        && java.util.Objects.equals(valueRatio, another.valueRatio)
        && java.util.Objects.equals(dataAbsentReason, another.dataAbsentReason)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(interpretation, another.interpretation)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(valueBoolean, another.valueBoolean)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(specimen, another.specimen)
        && java.util.Objects.equals(category, another.category);
  }

  /**
   * Computes a hash code from attributes: {@code performer}, {@code modifierExtension}, {@code valueTime}, {@code device}, {@code hasMember}, {@code valueQuantity}, {@code implicitRules}, {@code bodySite}, {@code valueDateTime}, {@code valueSampledData}, {@code basedOn}, {@code issued}, {@code valuePeriod}, {@code extension}, {@code identifier}, {@code effectiveDateTime}, {@code effectivePeriod}, {@code id}, {@code component}, {@code encounter}, {@code valueInteger}, {@code text}, {@code status}, {@code method}, {@code valueRange}, {@code code}, {@code derivedFrom}, {@code focus}, {@code effectiveInstant}, {@code effectiveTiming}, {@code valueCodeableConcept}, {@code partOf}, {@code valueString}, {@code referenceRange}, {@code valueRatio}, {@code dataAbsentReason}, {@code resourceType}, {@code subject}, {@code interpretation}, {@code note}, {@code language}, {@code valueBoolean}, {@code meta}, {@code contained}, {@code specimen}, {@code category}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(performer);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(valueTime);
    h += (h << 5) + java.util.Objects.hashCode(device);
    h += (h << 5) + java.util.Objects.hashCode(hasMember);
    h += (h << 5) + java.util.Objects.hashCode(valueQuantity);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(bodySite);
    h += (h << 5) + java.util.Objects.hashCode(valueDateTime);
    h += (h << 5) + java.util.Objects.hashCode(valueSampledData);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(issued);
    h += (h << 5) + java.util.Objects.hashCode(valuePeriod);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(effectiveDateTime);
    h += (h << 5) + java.util.Objects.hashCode(effectivePeriod);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(component);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(valueInteger);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(method);
    h += (h << 5) + java.util.Objects.hashCode(valueRange);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(derivedFrom);
    h += (h << 5) + java.util.Objects.hashCode(focus);
    h += (h << 5) + java.util.Objects.hashCode(effectiveInstant);
    h += (h << 5) + java.util.Objects.hashCode(effectiveTiming);
    h += (h << 5) + java.util.Objects.hashCode(valueCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(valueString);
    h += (h << 5) + java.util.Objects.hashCode(referenceRange);
    h += (h << 5) + java.util.Objects.hashCode(valueRatio);
    h += (h << 5) + java.util.Objects.hashCode(dataAbsentReason);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(interpretation);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(valueBoolean);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(specimen);
    h += (h << 5) + java.util.Objects.hashCode(category);
    return h;
  }

  /**
   * Prints the immutable value {@code Observation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Observation{");
    if (performer != null) {
      builder.append("performer=").append(performer);
    }
    if (modifierExtension != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (valueTime != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("valueTime=").append(valueTime);
    }
    if (device != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("device=").append(device);
    }
    if (hasMember != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("hasMember=").append(hasMember);
    }
    if (valueQuantity != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("valueQuantity=").append(valueQuantity);
    }
    if (implicitRules != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (bodySite != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (valueDateTime != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("valueDateTime=").append(valueDateTime);
    }
    if (valueSampledData != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("valueSampledData=").append(valueSampledData);
    }
    if (basedOn != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (issued != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("issued=").append(issued);
    }
    if (valuePeriod != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("valuePeriod=").append(valuePeriod);
    }
    if (extension != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (identifier != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (effectiveDateTime != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("effectiveDateTime=").append(effectiveDateTime);
    }
    if (effectivePeriod != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (id != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (component != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("component=").append(component);
    }
    if (encounter != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (valueInteger != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("valueInteger=").append(valueInteger);
    }
    if (text != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (status != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (method != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("method=").append(method);
    }
    if (valueRange != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("valueRange=").append(valueRange);
    }
    if (builder.length() > 12) builder.append(", ");
    builder.append("code=").append(code);
    if (derivedFrom != null) {
      builder.append(", ");
      builder.append("derivedFrom=").append(derivedFrom);
    }
    if (focus != null) {
      builder.append(", ");
      builder.append("focus=").append(focus);
    }
    if (effectiveInstant != null) {
      builder.append(", ");
      builder.append("effectiveInstant=").append(effectiveInstant);
    }
    if (effectiveTiming != null) {
      builder.append(", ");
      builder.append("effectiveTiming=").append(effectiveTiming);
    }
    if (valueCodeableConcept != null) {
      builder.append(", ");
      builder.append("valueCodeableConcept=").append(valueCodeableConcept);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (valueString != null) {
      builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (referenceRange != null) {
      builder.append(", ");
      builder.append("referenceRange=").append(referenceRange);
    }
    if (valueRatio != null) {
      builder.append(", ");
      builder.append("valueRatio=").append(valueRatio);
    }
    if (dataAbsentReason != null) {
      builder.append(", ");
      builder.append("dataAbsentReason=").append(dataAbsentReason);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (interpretation != null) {
      builder.append(", ");
      builder.append("interpretation=").append(interpretation);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (valueBoolean != null) {
      builder.append(", ");
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (specimen != null) {
      builder.append(", ");
      builder.append("specimen=").append(specimen);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Observation", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Observation {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueTime = java.util.Optional.empty();
    boolean valueTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> device = java.util.Optional.empty();
    boolean deviceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> hasMember = java.util.Optional.empty();
    boolean hasMemberIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> valueQuantity = java.util.Optional.empty();
    boolean valueQuantityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> bodySite = java.util.Optional.empty();
    boolean bodySiteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueDateTime = java.util.Optional.empty();
    boolean valueDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.SampledData> valueSampledData = java.util.Optional.empty();
    boolean valueSampledDataIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> issued = java.util.Optional.empty();
    boolean issuedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> valuePeriod = java.util.Optional.empty();
    boolean valuePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> effectiveDateTime = java.util.Optional.empty();
    boolean effectiveDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> effectivePeriod = java.util.Optional.empty();
    boolean effectivePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Observation_Component>> component = java.util.Optional.empty();
    boolean componentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> valueInteger = java.util.Optional.empty();
    boolean valueIntegerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ObservationStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> method = java.util.Optional.empty();
    boolean methodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> valueRange = java.util.Optional.empty();
    boolean valueRangeIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept code;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> derivedFrom = java.util.Optional.empty();
    boolean derivedFromIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> focus = java.util.Optional.empty();
    boolean focusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> effectiveInstant = java.util.Optional.empty();
    boolean effectiveInstantIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing> effectiveTiming = java.util.Optional.empty();
    boolean effectiveTimingIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> valueCodeableConcept = java.util.Optional.empty();
    boolean valueCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueString = java.util.Optional.empty();
    boolean valueStringIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Observation_ReferenceRange>> referenceRange = java.util.Optional.empty();
    boolean referenceRangeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Ratio> valueRatio = java.util.Optional.empty();
    boolean valueRatioIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> dataAbsentReason = java.util.Optional.empty();
    boolean dataAbsentReasonIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> interpretation = java.util.Optional.empty();
    boolean interpretationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> valueBoolean = java.util.Optional.empty();
    boolean valueBooleanIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> specimen = java.util.Optional.empty();
    boolean specimenIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<java.util.List<com.fhir.Reference>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueTime")
    public void setValueTime(java.util.Optional<java.lang.String> valueTime) {
      this.valueTime = valueTime;
      this.valueTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    public void setDevice(java.util.Optional<com.fhir.Reference> device) {
      this.device = device;
      this.deviceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("hasMember")
    public void setHasMember(java.util.Optional<java.util.List<com.fhir.Reference>> hasMember) {
      this.hasMember = hasMember;
      this.hasMemberIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueQuantity")
    public void setValueQuantity(java.util.Optional<com.fhir.Quantity> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public void setBodySite(java.util.Optional<com.fhir.CodeableConcept> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueDateTime")
    public void setValueDateTime(java.util.Optional<java.lang.String> valueDateTime) {
      this.valueDateTime = valueDateTime;
      this.valueDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueSampledData")
    public void setValueSampledData(java.util.Optional<com.fhir.SampledData> valueSampledData) {
      this.valueSampledData = valueSampledData;
      this.valueSampledDataIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("issued")
    public void setIssued(java.util.Optional<com.fhir.instant> issued) {
      this.issued = issued;
      this.issuedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valuePeriod")
    public void setValuePeriod(java.util.Optional<com.fhir.Period> valuePeriod) {
      this.valuePeriod = valuePeriod;
      this.valuePeriodIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveDateTime")
    public void setEffectiveDateTime(java.util.Optional<java.lang.String> effectiveDateTime) {
      this.effectiveDateTime = effectiveDateTime;
      this.effectiveDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public void setEffectivePeriod(java.util.Optional<com.fhir.Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("component")
    public void setComponent(java.util.Optional<java.util.List<com.fhir.Observation_Component>> component) {
      this.component = component;
      this.componentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueInteger")
    public void setValueInteger(java.util.Optional<java.lang.Double> valueInteger) {
      this.valueInteger = valueInteger;
      this.valueIntegerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.ObservationStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("method")
    public void setMethod(java.util.Optional<com.fhir.CodeableConcept> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueRange")
    public void setValueRange(java.util.Optional<com.fhir.Range> valueRange) {
      this.valueRange = valueRange;
      this.valueRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(com.fhir.CodeableConcept code) {
      this.code = code;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("derivedFrom")
    public void setDerivedFrom(java.util.Optional<java.util.List<com.fhir.Reference>> derivedFrom) {
      this.derivedFrom = derivedFrom;
      this.derivedFromIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("focus")
    public void setFocus(java.util.Optional<java.util.List<com.fhir.Reference>> focus) {
      this.focus = focus;
      this.focusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveInstant")
    public void setEffectiveInstant(java.util.Optional<java.lang.String> effectiveInstant) {
      this.effectiveInstant = effectiveInstant;
      this.effectiveInstantIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveTiming")
    public void setEffectiveTiming(java.util.Optional<com.fhir.Timing> effectiveTiming) {
      this.effectiveTiming = effectiveTiming;
      this.effectiveTimingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueCodeableConcept")
    public void setValueCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> valueCodeableConcept) {
      this.valueCodeableConcept = valueCodeableConcept;
      this.valueCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<java.util.List<com.fhir.Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueString")
    public void setValueString(java.util.Optional<java.lang.String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("referenceRange")
    public void setReferenceRange(java.util.Optional<java.util.List<com.fhir.Observation_ReferenceRange>> referenceRange) {
      this.referenceRange = referenceRange;
      this.referenceRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueRatio")
    public void setValueRatio(java.util.Optional<com.fhir.Ratio> valueRatio) {
      this.valueRatio = valueRatio;
      this.valueRatioIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dataAbsentReason")
    public void setDataAbsentReason(java.util.Optional<com.fhir.CodeableConcept> dataAbsentReason) {
      this.dataAbsentReason = dataAbsentReason;
      this.dataAbsentReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("interpretation")
    public void setInterpretation(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> interpretation) {
      this.interpretation = interpretation;
      this.interpretationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueBoolean")
    public void setValueBoolean(java.util.Optional<java.lang.Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("specimen")
    public void setSpecimen(java.util.Optional<com.fhir.Reference> specimen) {
      this.specimen = specimen;
      this.specimenIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> device() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> hasMember() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> valueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.SampledData> valueSampledData() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> issued() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> valuePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> effectiveDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Observation_Component>> component() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Double> valueInteger() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ObservationStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> method() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Range> valueRange() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> derivedFrom() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> focus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> effectiveInstant() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Timing> effectiveTiming() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> valueCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Observation_ReferenceRange>> referenceRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Ratio> valueRatio() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> dataAbsentReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> interpretation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> specimen() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableObservation fromJson(Json json) {
    ImmutableObservation.Builder builder = ((ImmutableObservation.Builder) ImmutableObservation.builder());
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueTimeIsSet) {
      builder.valueTime(json.valueTime);
    }
    if (json.deviceIsSet) {
      builder.device(json.device);
    }
    if (json.hasMemberIsSet) {
      builder.hasMember(json.hasMember);
    }
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.valueDateTimeIsSet) {
      builder.valueDateTime(json.valueDateTime);
    }
    if (json.valueSampledDataIsSet) {
      builder.valueSampledData(json.valueSampledData);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.issuedIsSet) {
      builder.issued(json.issued);
    }
    if (json.valuePeriodIsSet) {
      builder.valuePeriod(json.valuePeriod);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.effectiveDateTimeIsSet) {
      builder.effectiveDateTime(json.effectiveDateTime);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.componentIsSet) {
      builder.component(json.component);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.valueIntegerIsSet) {
      builder.valueInteger(json.valueInteger);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    if (json.valueRangeIsSet) {
      builder.valueRange(json.valueRange);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.derivedFromIsSet) {
      builder.derivedFrom(json.derivedFrom);
    }
    if (json.focusIsSet) {
      builder.focus(json.focus);
    }
    if (json.effectiveInstantIsSet) {
      builder.effectiveInstant(json.effectiveInstant);
    }
    if (json.effectiveTimingIsSet) {
      builder.effectiveTiming(json.effectiveTiming);
    }
    if (json.valueCodeableConceptIsSet) {
      builder.valueCodeableConcept(json.valueCodeableConcept);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.referenceRangeIsSet) {
      builder.referenceRange(json.referenceRange);
    }
    if (json.valueRatioIsSet) {
      builder.valueRatio(json.valueRatio);
    }
    if (json.dataAbsentReasonIsSet) {
      builder.dataAbsentReason(json.dataAbsentReason);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.interpretationIsSet) {
      builder.interpretation(json.interpretation);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.specimenIsSet) {
      builder.specimen(json.specimen);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
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
        .performer(instance.performer())
        .modifierExtension(instance.modifierExtension())
        .valueTime(instance.valueTime())
        .device(instance.device())
        .hasMember(instance.hasMember())
        .valueQuantity(instance.valueQuantity())
        .implicitRules(instance.implicitRules())
        .bodySite(instance.bodySite())
        .valueDateTime(instance.valueDateTime())
        .valueSampledData(instance.valueSampledData())
        .basedOn(instance.basedOn())
        .issued(instance.issued())
        .valuePeriod(instance.valuePeriod())
        .extension(instance.extension())
        .identifier(instance.identifier())
        .effectiveDateTime(instance.effectiveDateTime())
        .effectivePeriod(instance.effectivePeriod())
        .id(instance.id())
        .component(instance.component())
        .encounter(instance.encounter())
        .valueInteger(instance.valueInteger())
        .text(instance.text())
        .status(instance.status())
        .method(instance.method())
        .valueRange(instance.valueRange())
        .code(instance.code())
        .derivedFrom(instance.derivedFrom())
        .focus(instance.focus())
        .effectiveInstant(instance.effectiveInstant())
        .effectiveTiming(instance.effectiveTiming())
        .valueCodeableConcept(instance.valueCodeableConcept())
        .partOf(instance.partOf())
        .valueString(instance.valueString())
        .referenceRange(instance.referenceRange())
        .valueRatio(instance.valueRatio())
        .dataAbsentReason(instance.dataAbsentReason())
        .resourceType(instance.resourceType())
        .subject(instance.subject())
        .interpretation(instance.interpretation())
        .note(instance.note())
        .language(instance.language())
        .valueBoolean(instance.valueBoolean())
        .meta(instance.meta())
        .contained(instance.contained())
        .specimen(instance.specimen())
        .category(instance.category())
        .build();
  }

  /**
   * Creates a builder for {@link Observation Observation}.
   * <pre>
   * ImmutableObservation.builder()
   *    .performer(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Observation#performer() performer}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Observation#modifierExtension() modifierExtension}
   *    .valueTime(String) // optional {@link Observation#valueTime() valueTime}
   *    .device(com.fhir.Reference) // optional {@link Observation#device() device}
   *    .hasMember(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Observation#hasMember() hasMember}
   *    .valueQuantity(com.fhir.Quantity) // optional {@link Observation#valueQuantity() valueQuantity}
   *    .implicitRules(com.fhir.uri) // optional {@link Observation#implicitRules() implicitRules}
   *    .bodySite(com.fhir.CodeableConcept) // optional {@link Observation#bodySite() bodySite}
   *    .valueDateTime(String) // optional {@link Observation#valueDateTime() valueDateTime}
   *    .valueSampledData(com.fhir.SampledData) // optional {@link Observation#valueSampledData() valueSampledData}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Observation#basedOn() basedOn}
   *    .issued(com.fhir.instant) // optional {@link Observation#issued() issued}
   *    .valuePeriod(com.fhir.Period) // optional {@link Observation#valuePeriod() valuePeriod}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Observation#extension() extension}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Observation#identifier() identifier}
   *    .effectiveDateTime(String) // optional {@link Observation#effectiveDateTime() effectiveDateTime}
   *    .effectivePeriod(com.fhir.Period) // optional {@link Observation#effectivePeriod() effectivePeriod}
   *    .id(com.fhir.id) // optional {@link Observation#id() id}
   *    .component(List&amp;lt;com.fhir.Observation_Component&amp;gt;) // optional {@link Observation#component() component}
   *    .encounter(com.fhir.Reference) // optional {@link Observation#encounter() encounter}
   *    .valueInteger(Double) // optional {@link Observation#valueInteger() valueInteger}
   *    .text(com.fhir.Narrative) // optional {@link Observation#text() text}
   *    .status(com.fhir.ObservationStatus) // optional {@link Observation#status() status}
   *    .method(com.fhir.CodeableConcept) // optional {@link Observation#method() method}
   *    .valueRange(com.fhir.Range) // optional {@link Observation#valueRange() valueRange}
   *    .code(com.fhir.CodeableConcept) // required {@link Observation#code() code}
   *    .derivedFrom(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Observation#derivedFrom() derivedFrom}
   *    .focus(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Observation#focus() focus}
   *    .effectiveInstant(String) // optional {@link Observation#effectiveInstant() effectiveInstant}
   *    .effectiveTiming(com.fhir.Timing) // optional {@link Observation#effectiveTiming() effectiveTiming}
   *    .valueCodeableConcept(com.fhir.CodeableConcept) // optional {@link Observation#valueCodeableConcept() valueCodeableConcept}
   *    .partOf(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Observation#partOf() partOf}
   *    .valueString(String) // optional {@link Observation#valueString() valueString}
   *    .referenceRange(List&amp;lt;com.fhir.Observation_ReferenceRange&amp;gt;) // optional {@link Observation#referenceRange() referenceRange}
   *    .valueRatio(com.fhir.Ratio) // optional {@link Observation#valueRatio() valueRatio}
   *    .dataAbsentReason(com.fhir.CodeableConcept) // optional {@link Observation#dataAbsentReason() dataAbsentReason}
   *    .resourceType(String) // required {@link Observation#resourceType() resourceType}
   *    .subject(com.fhir.Reference) // optional {@link Observation#subject() subject}
   *    .interpretation(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Observation#interpretation() interpretation}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link Observation#note() note}
   *    .language(com.fhir.code) // optional {@link Observation#language() language}
   *    .valueBoolean(Boolean) // optional {@link Observation#valueBoolean() valueBoolean}
   *    .meta(com.fhir.Meta) // optional {@link Observation#meta() meta}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Observation#contained() contained}
   *    .specimen(com.fhir.Reference) // optional {@link Observation#specimen() specimen}
   *    .category(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Observation#category() category}
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
  @org.immutables.value.Generated(from = "Observation", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements CodeBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_PERFORMER = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_VALUE_TIME = 0x4L;
    private static final long OPT_BIT_DEVICE = 0x8L;
    private static final long OPT_BIT_HAS_MEMBER = 0x10L;
    private static final long OPT_BIT_VALUE_QUANTITY = 0x20L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40L;
    private static final long OPT_BIT_BODY_SITE = 0x80L;
    private static final long OPT_BIT_VALUE_DATE_TIME = 0x100L;
    private static final long OPT_BIT_VALUE_SAMPLED_DATA = 0x200L;
    private static final long OPT_BIT_BASED_ON = 0x400L;
    private static final long OPT_BIT_ISSUED = 0x800L;
    private static final long OPT_BIT_VALUE_PERIOD = 0x1000L;
    private static final long OPT_BIT_EXTENSION = 0x2000L;
    private static final long OPT_BIT_IDENTIFIER = 0x4000L;
    private static final long OPT_BIT_EFFECTIVE_DATE_TIME = 0x8000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x10000L;
    private static final long OPT_BIT_ID = 0x20000L;
    private static final long OPT_BIT_COMPONENT = 0x40000L;
    private static final long OPT_BIT_ENCOUNTER = 0x80000L;
    private static final long OPT_BIT_VALUE_INTEGER = 0x100000L;
    private static final long OPT_BIT_TEXT = 0x200000L;
    private static final long OPT_BIT_STATUS = 0x400000L;
    private static final long OPT_BIT_METHOD = 0x800000L;
    private static final long OPT_BIT_VALUE_RANGE = 0x1000000L;
    private static final long OPT_BIT_DERIVED_FROM = 0x2000000L;
    private static final long OPT_BIT_FOCUS = 0x4000000L;
    private static final long OPT_BIT_EFFECTIVE_INSTANT = 0x8000000L;
    private static final long OPT_BIT_EFFECTIVE_TIMING = 0x10000000L;
    private static final long OPT_BIT_VALUE_CODEABLE_CONCEPT = 0x20000000L;
    private static final long OPT_BIT_PART_OF = 0x40000000L;
    private static final long OPT_BIT_VALUE_STRING = 0x80000000L;
    private static final long OPT_BIT_REFERENCE_RANGE = 0x100000000L;
    private static final long OPT_BIT_VALUE_RATIO = 0x200000000L;
    private static final long OPT_BIT_DATA_ABSENT_REASON = 0x400000000L;
    private static final long OPT_BIT_SUBJECT = 0x800000000L;
    private static final long OPT_BIT_INTERPRETATION = 0x1000000000L;
    private static final long OPT_BIT_NOTE = 0x2000000000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000000000L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x8000000000L;
    private static final long OPT_BIT_META = 0x10000000000L;
    private static final long OPT_BIT_CONTAINED = 0x20000000000L;
    private static final long OPT_BIT_SPECIMEN = 0x40000000000L;
    private static final long OPT_BIT_CATEGORY = 0x80000000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> performer;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String valueTime;
    private @javax.annotation.Nullable com.fhir.Reference device;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> hasMember;
    private @javax.annotation.Nullable com.fhir.Quantity valueQuantity;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.CodeableConcept bodySite;
    private @javax.annotation.Nullable java.lang.String valueDateTime;
    private @javax.annotation.Nullable com.fhir.SampledData valueSampledData;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable com.fhir.instant issued;
    private @javax.annotation.Nullable com.fhir.Period valuePeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.lang.String effectiveDateTime;
    private @javax.annotation.Nullable com.fhir.Period effectivePeriod;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Observation_Component> component;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable java.lang.Double valueInteger;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.ObservationStatus status;
    private @javax.annotation.Nullable com.fhir.CodeableConcept method;
    private @javax.annotation.Nullable com.fhir.Range valueRange;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> derivedFrom;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> focus;
    private @javax.annotation.Nullable java.lang.String effectiveInstant;
    private @javax.annotation.Nullable com.fhir.Timing effectiveTiming;
    private @javax.annotation.Nullable com.fhir.CodeableConcept valueCodeableConcept;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
    private @javax.annotation.Nullable java.lang.String valueString;
    private @javax.annotation.Nullable java.util.List<com.fhir.Observation_ReferenceRange> referenceRange;
    private @javax.annotation.Nullable com.fhir.Ratio valueRatio;
    private @javax.annotation.Nullable com.fhir.CodeableConcept dataAbsentReason;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> interpretation;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.Boolean valueBoolean;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Reference specimen;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Observation#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(java.util.List<com.fhir.Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = java.util.Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public final Builder performer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Observation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Observation#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueTime(java.lang.String valueTime) {
      checkNotIsSet(valueTimeIsSet(), "valueTime");
      this.valueTime = java.util.Objects.requireNonNull(valueTime, "valueTime");
      optBits |= OPT_BIT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueTime")
    public final Builder valueTime(java.util.Optional<java.lang.String> valueTime) {
      checkNotIsSet(valueTimeIsSet(), "valueTime");
      this.valueTime = valueTime.orElse(null);
      optBits |= OPT_BIT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    public final Builder device(com.fhir.Reference device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = java.util.Objects.requireNonNull(device, "device");
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    public final Builder device(java.util.Optional<? extends com.fhir.Reference> device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = device.orElse(null);
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#hasMember() hasMember} to hasMember.
     * @param hasMember The value for hasMember
     * @return {@code this} builder for chained invocation
     */
    public final Builder hasMember(java.util.List<com.fhir.Reference> hasMember) {
      checkNotIsSet(hasMemberIsSet(), "hasMember");
      this.hasMember = java.util.Objects.requireNonNull(hasMember, "hasMember");
      optBits |= OPT_BIT_HAS_MEMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#hasMember() hasMember} to hasMember.
     * @param hasMember The value for hasMember
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hasMember")
    public final Builder hasMember(java.util.Optional<? extends java.util.List<com.fhir.Reference>> hasMember) {
      checkNotIsSet(hasMemberIsSet(), "hasMember");
      this.hasMember = hasMember.orElse(null);
      optBits |= OPT_BIT_HAS_MEMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueQuantity(com.fhir.Quantity valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = java.util.Objects.requireNonNull(valueQuantity, "valueQuantity");
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueQuantity")
    public final Builder valueQuantity(java.util.Optional<? extends com.fhir.Quantity> valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = valueQuantity.orElse(null);
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Observation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Observation#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    public final Builder bodySite(com.fhir.CodeableConcept bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = java.util.Objects.requireNonNull(bodySite, "bodySite");
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public final Builder bodySite(java.util.Optional<? extends com.fhir.CodeableConcept> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = bodySite.orElse(null);
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDateTime(java.lang.String valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = java.util.Objects.requireNonNull(valueDateTime, "valueDateTime");
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueDateTime")
    public final Builder valueDateTime(java.util.Optional<java.lang.String> valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = valueDateTime.orElse(null);
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueSampledData(com.fhir.SampledData valueSampledData) {
      checkNotIsSet(valueSampledDataIsSet(), "valueSampledData");
      this.valueSampledData = java.util.Objects.requireNonNull(valueSampledData, "valueSampledData");
      optBits |= OPT_BIT_VALUE_SAMPLED_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueSampledData")
    public final Builder valueSampledData(java.util.Optional<? extends com.fhir.SampledData> valueSampledData) {
      checkNotIsSet(valueSampledDataIsSet(), "valueSampledData");
      this.valueSampledData = valueSampledData.orElse(null);
      optBits |= OPT_BIT_VALUE_SAMPLED_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(java.util.List<com.fhir.Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = java.util.Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public final Builder basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    public final Builder issued(com.fhir.instant issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = java.util.Objects.requireNonNull(issued, "issued");
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("issued")
    public final Builder issued(java.util.Optional<? extends com.fhir.instant> issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = issued.orElse(null);
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder valuePeriod(com.fhir.Period valuePeriod) {
      checkNotIsSet(valuePeriodIsSet(), "valuePeriod");
      this.valuePeriod = java.util.Objects.requireNonNull(valuePeriod, "valuePeriod");
      optBits |= OPT_BIT_VALUE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valuePeriod")
    public final Builder valuePeriod(java.util.Optional<? extends com.fhir.Period> valuePeriod) {
      checkNotIsSet(valuePeriodIsSet(), "valuePeriod");
      this.valuePeriod = valuePeriod.orElse(null);
      optBits |= OPT_BIT_VALUE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#extension() extension} to extension.
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
     * Initializes the optional value {@link Observation#extension() extension} to extension.
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
     * Initializes the optional value {@link Observation#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Observation#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Observation#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectiveDateTime(java.lang.String effectiveDateTime) {
      checkNotIsSet(effectiveDateTimeIsSet(), "effectiveDateTime");
      this.effectiveDateTime = java.util.Objects.requireNonNull(effectiveDateTime, "effectiveDateTime");
      optBits |= OPT_BIT_EFFECTIVE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveDateTime")
    public final Builder effectiveDateTime(java.util.Optional<java.lang.String> effectiveDateTime) {
      checkNotIsSet(effectiveDateTimeIsSet(), "effectiveDateTime");
      this.effectiveDateTime = effectiveDateTime.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectivePeriod(com.fhir.Period effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = java.util.Objects.requireNonNull(effectivePeriod, "effectivePeriod");
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public final Builder effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = effectivePeriod.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#id() id} to id.
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
     * Initializes the optional value {@link Observation#id() id} to id.
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
     * Initializes the optional value {@link Observation#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for chained invocation
     */
    public final Builder component(java.util.List<com.fhir.Observation_Component> component) {
      checkNotIsSet(componentIsSet(), "component");
      this.component = java.util.Objects.requireNonNull(component, "component");
      optBits |= OPT_BIT_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("component")
    public final Builder component(java.util.Optional<? extends java.util.List<com.fhir.Observation_Component>> component) {
      checkNotIsSet(componentIsSet(), "component");
      this.component = component.orElse(null);
      optBits |= OPT_BIT_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(com.fhir.Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = java.util.Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public final Builder encounter(java.util.Optional<? extends com.fhir.Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
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
    @com.fasterxml.jackson.annotation.JsonProperty("valueInteger")
    public final Builder valueInteger(java.util.Optional<java.lang.Double> valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger.orElse(null);
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#text() text} to text.
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
     * Initializes the optional value {@link Observation#text() text} to text.
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
     * Initializes the optional value {@link Observation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.ObservationStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.ObservationStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(com.fhir.CodeableConcept method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = java.util.Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("method")
    public final Builder method(java.util.Optional<? extends com.fhir.CodeableConcept> method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = method.orElse(null);
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueRange(com.fhir.Range valueRange) {
      checkNotIsSet(valueRangeIsSet(), "valueRange");
      this.valueRange = java.util.Objects.requireNonNull(valueRange, "valueRange");
      optBits |= OPT_BIT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueRange")
    public final Builder valueRange(java.util.Optional<? extends com.fhir.Range> valueRange) {
      checkNotIsSet(valueRangeIsSet(), "valueRange");
      this.valueRange = valueRange.orElse(null);
      optBits |= OPT_BIT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the value for the {@link Observation#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    public final Builder derivedFrom(java.util.List<com.fhir.Reference> derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = java.util.Objects.requireNonNull(derivedFrom, "derivedFrom");
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("derivedFrom")
    public final Builder derivedFrom(java.util.Optional<? extends java.util.List<com.fhir.Reference>> derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = derivedFrom.orElse(null);
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    public final Builder focus(java.util.List<com.fhir.Reference> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = java.util.Objects.requireNonNull(focus, "focus");
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("focus")
    public final Builder focus(java.util.Optional<? extends java.util.List<com.fhir.Reference>> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = focus.orElse(null);
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#effectiveInstant() effectiveInstant} to effectiveInstant.
     * @param effectiveInstant The value for effectiveInstant
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectiveInstant(java.lang.String effectiveInstant) {
      checkNotIsSet(effectiveInstantIsSet(), "effectiveInstant");
      this.effectiveInstant = java.util.Objects.requireNonNull(effectiveInstant, "effectiveInstant");
      optBits |= OPT_BIT_EFFECTIVE_INSTANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#effectiveInstant() effectiveInstant} to effectiveInstant.
     * @param effectiveInstant The value for effectiveInstant
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveInstant")
    public final Builder effectiveInstant(java.util.Optional<java.lang.String> effectiveInstant) {
      checkNotIsSet(effectiveInstantIsSet(), "effectiveInstant");
      this.effectiveInstant = effectiveInstant.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_INSTANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#effectiveTiming() effectiveTiming} to effectiveTiming.
     * @param effectiveTiming The value for effectiveTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectiveTiming(com.fhir.Timing effectiveTiming) {
      checkNotIsSet(effectiveTimingIsSet(), "effectiveTiming");
      this.effectiveTiming = java.util.Objects.requireNonNull(effectiveTiming, "effectiveTiming");
      optBits |= OPT_BIT_EFFECTIVE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#effectiveTiming() effectiveTiming} to effectiveTiming.
     * @param effectiveTiming The value for effectiveTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveTiming")
    public final Builder effectiveTiming(java.util.Optional<? extends com.fhir.Timing> effectiveTiming) {
      checkNotIsSet(effectiveTimingIsSet(), "effectiveTiming");
      this.effectiveTiming = effectiveTiming.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCodeableConcept(com.fhir.CodeableConcept valueCodeableConcept) {
      checkNotIsSet(valueCodeableConceptIsSet(), "valueCodeableConcept");
      this.valueCodeableConcept = java.util.Objects.requireNonNull(valueCodeableConcept, "valueCodeableConcept");
      optBits |= OPT_BIT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueCodeableConcept")
    public final Builder valueCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> valueCodeableConcept) {
      checkNotIsSet(valueCodeableConceptIsSet(), "valueCodeableConcept");
      this.valueCodeableConcept = valueCodeableConcept.orElse(null);
      optBits |= OPT_BIT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(java.util.List<com.fhir.Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = java.util.Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public final Builder partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueString(java.lang.String valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = java.util.Objects.requireNonNull(valueString, "valueString");
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueString")
    public final Builder valueString(java.util.Optional<java.lang.String> valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = valueString.orElse(null);
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#referenceRange() referenceRange} to referenceRange.
     * @param referenceRange The value for referenceRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder referenceRange(java.util.List<com.fhir.Observation_ReferenceRange> referenceRange) {
      checkNotIsSet(referenceRangeIsSet(), "referenceRange");
      this.referenceRange = java.util.Objects.requireNonNull(referenceRange, "referenceRange");
      optBits |= OPT_BIT_REFERENCE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#referenceRange() referenceRange} to referenceRange.
     * @param referenceRange The value for referenceRange
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceRange")
    public final Builder referenceRange(java.util.Optional<? extends java.util.List<com.fhir.Observation_ReferenceRange>> referenceRange) {
      checkNotIsSet(referenceRangeIsSet(), "referenceRange");
      this.referenceRange = referenceRange.orElse(null);
      optBits |= OPT_BIT_REFERENCE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueRatio(com.fhir.Ratio valueRatio) {
      checkNotIsSet(valueRatioIsSet(), "valueRatio");
      this.valueRatio = java.util.Objects.requireNonNull(valueRatio, "valueRatio");
      optBits |= OPT_BIT_VALUE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueRatio")
    public final Builder valueRatio(java.util.Optional<? extends com.fhir.Ratio> valueRatio) {
      checkNotIsSet(valueRatioIsSet(), "valueRatio");
      this.valueRatio = valueRatio.orElse(null);
      optBits |= OPT_BIT_VALUE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder dataAbsentReason(com.fhir.CodeableConcept dataAbsentReason) {
      checkNotIsSet(dataAbsentReasonIsSet(), "dataAbsentReason");
      this.dataAbsentReason = java.util.Objects.requireNonNull(dataAbsentReason, "dataAbsentReason");
      optBits |= OPT_BIT_DATA_ABSENT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataAbsentReason")
    public final Builder dataAbsentReason(java.util.Optional<? extends com.fhir.CodeableConcept> dataAbsentReason) {
      checkNotIsSet(dataAbsentReasonIsSet(), "dataAbsentReason");
      this.dataAbsentReason = dataAbsentReason.orElse(null);
      optBits |= OPT_BIT_DATA_ABSENT_REASON;
      return this;
    }

    /**
     * Initializes the value for the {@link Observation#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Observation#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(com.fhir.Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(java.util.Optional<? extends com.fhir.Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#interpretation() interpretation} to interpretation.
     * @param interpretation The value for interpretation
     * @return {@code this} builder for chained invocation
     */
    public final Builder interpretation(java.util.List<com.fhir.CodeableConcept> interpretation) {
      checkNotIsSet(interpretationIsSet(), "interpretation");
      this.interpretation = java.util.Objects.requireNonNull(interpretation, "interpretation");
      optBits |= OPT_BIT_INTERPRETATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#interpretation() interpretation} to interpretation.
     * @param interpretation The value for interpretation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interpretation")
    public final Builder interpretation(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> interpretation) {
      checkNotIsSet(interpretationIsSet(), "interpretation");
      this.interpretation = interpretation.orElse(null);
      optBits |= OPT_BIT_INTERPRETATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#note() note} to note.
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
     * Initializes the optional value {@link Observation#note() note} to note.
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
     * Initializes the optional value {@link Observation#language() language} to language.
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
     * Initializes the optional value {@link Observation#language() language} to language.
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
    @com.fasterxml.jackson.annotation.JsonProperty("valueBoolean")
    public final Builder valueBoolean(java.util.Optional<java.lang.Boolean> valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean.orElse(null);
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#meta() meta} to meta.
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
     * Initializes the optional value {@link Observation#meta() meta} to meta.
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
     * Initializes the optional value {@link Observation#contained() contained} to contained.
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
     * Initializes the optional value {@link Observation#contained() contained} to contained.
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
     * Initializes the optional value {@link Observation#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    public final Builder specimen(com.fhir.Reference specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = java.util.Objects.requireNonNull(specimen, "specimen");
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("specimen")
    public final Builder specimen(java.util.Optional<? extends com.fhir.Reference> specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = specimen.orElse(null);
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation#category() category} to category.
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
     * Initializes the optional value {@link Observation#category() category} to category.
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
     * Builds a new {@link Observation Observation}.
     * @return An immutable instance of Observation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Observation build() {
      checkRequiredAttributes();
      return new ImmutableObservation(
          performer,
          modifierExtension,
          valueTime,
          device,
          hasMember,
          valueQuantity,
          implicitRules,
          bodySite,
          valueDateTime,
          valueSampledData,
          basedOn,
          issued,
          valuePeriod,
          extension,
          identifier,
          effectiveDateTime,
          effectivePeriod,
          id,
          component,
          encounter,
          valueInteger,
          text,
          status,
          method,
          valueRange,
          code,
          derivedFrom,
          focus,
          effectiveInstant,
          effectiveTiming,
          valueCodeableConcept,
          partOf,
          valueString,
          referenceRange,
          valueRatio,
          dataAbsentReason,
          resourceType,
          subject,
          interpretation,
          note,
          language,
          valueBoolean,
          meta,
          contained,
          specimen,
          category);
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_TIME) != 0;
    }

    private boolean deviceIsSet() {
      return (optBits & OPT_BIT_DEVICE) != 0;
    }

    private boolean hasMemberIsSet() {
      return (optBits & OPT_BIT_HAS_MEMBER) != 0;
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean valueDateTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE_TIME) != 0;
    }

    private boolean valueSampledDataIsSet() {
      return (optBits & OPT_BIT_VALUE_SAMPLED_DATA) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean issuedIsSet() {
      return (optBits & OPT_BIT_ISSUED) != 0;
    }

    private boolean valuePeriodIsSet() {
      return (optBits & OPT_BIT_VALUE_PERIOD) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean effectiveDateTimeIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_DATE_TIME) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean componentIsSet() {
      return (optBits & OPT_BIT_COMPONENT) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean valueIntegerIsSet() {
      return (optBits & OPT_BIT_VALUE_INTEGER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private boolean valueRangeIsSet() {
      return (optBits & OPT_BIT_VALUE_RANGE) != 0;
    }

    private boolean derivedFromIsSet() {
      return (optBits & OPT_BIT_DERIVED_FROM) != 0;
    }

    private boolean focusIsSet() {
      return (optBits & OPT_BIT_FOCUS) != 0;
    }

    private boolean effectiveInstantIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_INSTANT) != 0;
    }

    private boolean effectiveTimingIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_TIMING) != 0;
    }

    private boolean valueCodeableConceptIsSet() {
      return (optBits & OPT_BIT_VALUE_CODEABLE_CONCEPT) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean referenceRangeIsSet() {
      return (optBits & OPT_BIT_REFERENCE_RANGE) != 0;
    }

    private boolean valueRatioIsSet() {
      return (optBits & OPT_BIT_VALUE_RATIO) != 0;
    }

    private boolean dataAbsentReasonIsSet() {
      return (optBits & OPT_BIT_DATA_ABSENT_REASON) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean interpretationIsSet() {
      return (optBits & OPT_BIT_INTERPRETATION) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean specimenIsSet() {
      return (optBits & OPT_BIT_SPECIMEN) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Observation is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!codeIsSet()) attributes.add("code");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Observation, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Observation", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link Observation#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage code(com.fhir.CodeableConcept code);
  }

  @org.immutables.value.Generated(from = "Observation", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Observation#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Observation", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Observation#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(java.util.List<com.fhir.Reference> performer);

    /**
     * Initializes the optional value {@link Observation#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> performer);

    /**
     * Initializes the optional value {@link Observation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Observation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Observation#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueTime(java.lang.String valueTime);

    /**
     * Initializes the optional value {@link Observation#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueTime(java.util.Optional<java.lang.String> valueTime);

    /**
     * Initializes the optional value {@link Observation#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    BuildFinal device(com.fhir.Reference device);

    /**
     * Initializes the optional value {@link Observation#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal device(java.util.Optional<? extends com.fhir.Reference> device);

    /**
     * Initializes the optional value {@link Observation#hasMember() hasMember} to hasMember.
     * @param hasMember The value for hasMember
     * @return {@code this} builder for chained invocation
     */
    BuildFinal hasMember(java.util.List<com.fhir.Reference> hasMember);

    /**
     * Initializes the optional value {@link Observation#hasMember() hasMember} to hasMember.
     * @param hasMember The value for hasMember
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal hasMember(java.util.Optional<? extends java.util.List<com.fhir.Reference>> hasMember);

    /**
     * Initializes the optional value {@link Observation#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueQuantity(com.fhir.Quantity valueQuantity);

    /**
     * Initializes the optional value {@link Observation#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueQuantity(java.util.Optional<? extends com.fhir.Quantity> valueQuantity);

    /**
     * Initializes the optional value {@link Observation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Observation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Observation#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(com.fhir.CodeableConcept bodySite);

    /**
     * Initializes the optional value {@link Observation#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(java.util.Optional<? extends com.fhir.CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link Observation#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueDateTime(java.lang.String valueDateTime);

    /**
     * Initializes the optional value {@link Observation#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueDateTime(java.util.Optional<java.lang.String> valueDateTime);

    /**
     * Initializes the optional value {@link Observation#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueSampledData(com.fhir.SampledData valueSampledData);

    /**
     * Initializes the optional value {@link Observation#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueSampledData(java.util.Optional<? extends com.fhir.SampledData> valueSampledData);

    /**
     * Initializes the optional value {@link Observation#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link Observation#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link Observation#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    BuildFinal issued(com.fhir.instant issued);

    /**
     * Initializes the optional value {@link Observation#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal issued(java.util.Optional<? extends com.fhir.instant> issued);

    /**
     * Initializes the optional value {@link Observation#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valuePeriod(com.fhir.Period valuePeriod);

    /**
     * Initializes the optional value {@link Observation#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valuePeriod(java.util.Optional<? extends com.fhir.Period> valuePeriod);

    /**
     * Initializes the optional value {@link Observation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Observation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Observation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Observation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Observation#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectiveDateTime(java.lang.String effectiveDateTime);

    /**
     * Initializes the optional value {@link Observation#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectiveDateTime(java.util.Optional<java.lang.String> effectiveDateTime);

    /**
     * Initializes the optional value {@link Observation#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(com.fhir.Period effectivePeriod);

    /**
     * Initializes the optional value {@link Observation#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod);

    /**
     * Initializes the optional value {@link Observation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Observation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Observation#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for chained invocation
     */
    BuildFinal component(java.util.List<com.fhir.Observation_Component> component);

    /**
     * Initializes the optional value {@link Observation#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal component(java.util.Optional<? extends java.util.List<com.fhir.Observation_Component>> component);

    /**
     * Initializes the optional value {@link Observation#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link Observation#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

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
    BuildFinal valueInteger(java.util.Optional<java.lang.Double> valueInteger);

    /**
     * Initializes the optional value {@link Observation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Observation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Observation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.ObservationStatus status);

    /**
     * Initializes the optional value {@link Observation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.ObservationStatus> status);

    /**
     * Initializes the optional value {@link Observation#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    BuildFinal method(com.fhir.CodeableConcept method);

    /**
     * Initializes the optional value {@link Observation#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal method(java.util.Optional<? extends com.fhir.CodeableConcept> method);

    /**
     * Initializes the optional value {@link Observation#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueRange(com.fhir.Range valueRange);

    /**
     * Initializes the optional value {@link Observation#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueRange(java.util.Optional<? extends com.fhir.Range> valueRange);

    /**
     * Initializes the optional value {@link Observation#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal derivedFrom(java.util.List<com.fhir.Reference> derivedFrom);

    /**
     * Initializes the optional value {@link Observation#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal derivedFrom(java.util.Optional<? extends java.util.List<com.fhir.Reference>> derivedFrom);

    /**
     * Initializes the optional value {@link Observation#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal focus(java.util.List<com.fhir.Reference> focus);

    /**
     * Initializes the optional value {@link Observation#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal focus(java.util.Optional<? extends java.util.List<com.fhir.Reference>> focus);

    /**
     * Initializes the optional value {@link Observation#effectiveInstant() effectiveInstant} to effectiveInstant.
     * @param effectiveInstant The value for effectiveInstant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectiveInstant(java.lang.String effectiveInstant);

    /**
     * Initializes the optional value {@link Observation#effectiveInstant() effectiveInstant} to effectiveInstant.
     * @param effectiveInstant The value for effectiveInstant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectiveInstant(java.util.Optional<java.lang.String> effectiveInstant);

    /**
     * Initializes the optional value {@link Observation#effectiveTiming() effectiveTiming} to effectiveTiming.
     * @param effectiveTiming The value for effectiveTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectiveTiming(com.fhir.Timing effectiveTiming);

    /**
     * Initializes the optional value {@link Observation#effectiveTiming() effectiveTiming} to effectiveTiming.
     * @param effectiveTiming The value for effectiveTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectiveTiming(java.util.Optional<? extends com.fhir.Timing> effectiveTiming);

    /**
     * Initializes the optional value {@link Observation#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueCodeableConcept(com.fhir.CodeableConcept valueCodeableConcept);

    /**
     * Initializes the optional value {@link Observation#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> valueCodeableConcept);

    /**
     * Initializes the optional value {@link Observation#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(java.util.List<com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link Observation#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf);

    /**
     * Initializes the optional value {@link Observation#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueString(java.lang.String valueString);

    /**
     * Initializes the optional value {@link Observation#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueString(java.util.Optional<java.lang.String> valueString);

    /**
     * Initializes the optional value {@link Observation#referenceRange() referenceRange} to referenceRange.
     * @param referenceRange The value for referenceRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referenceRange(java.util.List<com.fhir.Observation_ReferenceRange> referenceRange);

    /**
     * Initializes the optional value {@link Observation#referenceRange() referenceRange} to referenceRange.
     * @param referenceRange The value for referenceRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referenceRange(java.util.Optional<? extends java.util.List<com.fhir.Observation_ReferenceRange>> referenceRange);

    /**
     * Initializes the optional value {@link Observation#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueRatio(com.fhir.Ratio valueRatio);

    /**
     * Initializes the optional value {@link Observation#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueRatio(java.util.Optional<? extends com.fhir.Ratio> valueRatio);

    /**
     * Initializes the optional value {@link Observation#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dataAbsentReason(com.fhir.CodeableConcept dataAbsentReason);

    /**
     * Initializes the optional value {@link Observation#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dataAbsentReason(java.util.Optional<? extends com.fhir.CodeableConcept> dataAbsentReason);

    /**
     * Initializes the optional value {@link Observation#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link Observation#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link Observation#interpretation() interpretation} to interpretation.
     * @param interpretation The value for interpretation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal interpretation(java.util.List<com.fhir.CodeableConcept> interpretation);

    /**
     * Initializes the optional value {@link Observation#interpretation() interpretation} to interpretation.
     * @param interpretation The value for interpretation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal interpretation(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> interpretation);

    /**
     * Initializes the optional value {@link Observation#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link Observation#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link Observation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Observation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

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
    BuildFinal valueBoolean(java.util.Optional<java.lang.Boolean> valueBoolean);

    /**
     * Initializes the optional value {@link Observation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Observation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Observation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Observation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Observation#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specimen(com.fhir.Reference specimen);

    /**
     * Initializes the optional value {@link Observation#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specimen(java.util.Optional<? extends com.fhir.Reference> specimen);

    /**
     * Initializes the optional value {@link Observation#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link Observation#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category);

    /**
     * Builds a new {@link Observation Observation}.
     * @return An immutable instance of Observation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Observation build();
  }
}
