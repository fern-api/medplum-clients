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
 * Immutable implementation of {@link Procedure}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProcedure.builder()}.
 */
@Generated(from = "Procedure", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableProcedure implements Procedure {
  private final @Nullable CodeableConcept category;
  private final @Nullable List<Procedure_Performer> performer;
  private final @Nullable Code status;
  private final @Nullable Reference asserter;
  private final @Nullable Period performedPeriod;
  private final @Nullable List<Reference> report;
  private final String resourceType;
  private final @Nullable Meta meta;
  private final @Nullable String performedDateTime;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable Id id;
  private final @Nullable List<CodeableConcept> usedCode;
  private final @Nullable List<Reference> partOf;
  private final @Nullable Reference location;
  private final @Nullable List<Canonical> instantiatesCanonical;
  private final @Nullable List<CodeableConcept> followUp;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable CodeableConcept outcome;
  private final @Nullable Age performedAge;
  private final @Nullable List<CodeableConcept> complication;
  private final @Nullable List<Reference> complicationDetail;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable List<Reference> usedReference;
  private final @Nullable Reference encounter;
  private final @Nullable List<Annotation> note;
  private final @Nullable Narrative text;
  private final Reference subject;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Uri> instantiatesUri;
  private final @Nullable CodeableConcept code;
  private final @Nullable Reference recorder;
  private final @Nullable Range performedRange;
  private final @Nullable List<CodeableConcept> bodySite;
  private final @Nullable String performedString;
  private final @Nullable Code language;
  private final @Nullable CodeableConcept statusReason;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Reference> basedOn;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Procedure_FocalDevice> focalDevice;

  private ImmutableProcedure(
      @Nullable CodeableConcept category,
      @Nullable List<Procedure_Performer> performer,
      @Nullable Code status,
      @Nullable Reference asserter,
      @Nullable Period performedPeriod,
      @Nullable List<Reference> report,
      String resourceType,
      @Nullable Meta meta,
      @Nullable String performedDateTime,
      @Nullable List<Reference> reasonReference,
      @Nullable Id id,
      @Nullable List<CodeableConcept> usedCode,
      @Nullable List<Reference> partOf,
      @Nullable Reference location,
      @Nullable List<Canonical> instantiatesCanonical,
      @Nullable List<CodeableConcept> followUp,
      @Nullable List<ResourceList> contained,
      @Nullable CodeableConcept outcome,
      @Nullable Age performedAge,
      @Nullable List<CodeableConcept> complication,
      @Nullable List<Reference> complicationDetail,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable List<Reference> usedReference,
      @Nullable Reference encounter,
      @Nullable List<Annotation> note,
      @Nullable Narrative text,
      Reference subject,
      @Nullable Uri implicitRules,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Uri> instantiatesUri,
      @Nullable CodeableConcept code,
      @Nullable Reference recorder,
      @Nullable Range performedRange,
      @Nullable List<CodeableConcept> bodySite,
      @Nullable String performedString,
      @Nullable Code language,
      @Nullable CodeableConcept statusReason,
      @Nullable List<Identifier> identifier,
      @Nullable List<Reference> basedOn,
      @Nullable List<Extension> extension,
      @Nullable List<Procedure_FocalDevice> focalDevice) {
    this.category = category;
    this.performer = performer;
    this.status = status;
    this.asserter = asserter;
    this.performedPeriod = performedPeriod;
    this.report = report;
    this.resourceType = resourceType;
    this.meta = meta;
    this.performedDateTime = performedDateTime;
    this.reasonReference = reasonReference;
    this.id = id;
    this.usedCode = usedCode;
    this.partOf = partOf;
    this.location = location;
    this.instantiatesCanonical = instantiatesCanonical;
    this.followUp = followUp;
    this.contained = contained;
    this.outcome = outcome;
    this.performedAge = performedAge;
    this.complication = complication;
    this.complicationDetail = complicationDetail;
    this.reasonCode = reasonCode;
    this.usedReference = usedReference;
    this.encounter = encounter;
    this.note = note;
    this.text = text;
    this.subject = subject;
    this.implicitRules = implicitRules;
    this.modifierExtension = modifierExtension;
    this.instantiatesUri = instantiatesUri;
    this.code = code;
    this.recorder = recorder;
    this.performedRange = performedRange;
    this.bodySite = bodySite;
    this.performedString = performedString;
    this.language = language;
    this.statusReason = statusReason;
    this.identifier = identifier;
    this.basedOn = basedOn;
    this.extension = extension;
    this.focalDevice = focalDevice;
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<CodeableConcept> category() {
    return Optional.ofNullable(category);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @JsonProperty("performer")
  @Override
  public Optional<List<Procedure_Performer>> performer() {
    return Optional.ofNullable(performer);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code asserter} attribute
   */
  @JsonProperty("asserter")
  @Override
  public Optional<Reference> asserter() {
    return Optional.ofNullable(asserter);
  }

  /**
   * @return The value of the {@code performedPeriod} attribute
   */
  @JsonProperty("performedPeriod")
  @Override
  public Optional<Period> performedPeriod() {
    return Optional.ofNullable(performedPeriod);
  }

  /**
   * @return The value of the {@code report} attribute
   */
  @JsonProperty("report")
  @Override
  public Optional<List<Reference>> report() {
    return Optional.ofNullable(report);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code performedDateTime} attribute
   */
  @JsonProperty("performedDateTime")
  @Override
  public Optional<String> performedDateTime() {
    return Optional.ofNullable(performedDateTime);
  }

  /**
   * @return The value of the {@code reasonReference} attribute
   */
  @JsonProperty("reasonReference")
  @Override
  public Optional<List<Reference>> reasonReference() {
    return Optional.ofNullable(reasonReference);
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
   * @return The value of the {@code usedCode} attribute
   */
  @JsonProperty("usedCode")
  @Override
  public Optional<List<CodeableConcept>> usedCode() {
    return Optional.ofNullable(usedCode);
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
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Optional<Reference> location() {
    return Optional.ofNullable(location);
  }

  /**
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @JsonProperty("instantiatesCanonical")
  @Override
  public Optional<List<Canonical>> instantiatesCanonical() {
    return Optional.ofNullable(instantiatesCanonical);
  }

  /**
   * @return The value of the {@code followUp} attribute
   */
  @JsonProperty("followUp")
  @Override
  public Optional<List<CodeableConcept>> followUp() {
    return Optional.ofNullable(followUp);
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
   * @return The value of the {@code outcome} attribute
   */
  @JsonProperty("outcome")
  @Override
  public Optional<CodeableConcept> outcome() {
    return Optional.ofNullable(outcome);
  }

  /**
   * @return The value of the {@code performedAge} attribute
   */
  @JsonProperty("performedAge")
  @Override
  public Optional<Age> performedAge() {
    return Optional.ofNullable(performedAge);
  }

  /**
   * @return The value of the {@code complication} attribute
   */
  @JsonProperty("complication")
  @Override
  public Optional<List<CodeableConcept>> complication() {
    return Optional.ofNullable(complication);
  }

  /**
   * @return The value of the {@code complicationDetail} attribute
   */
  @JsonProperty("complicationDetail")
  @Override
  public Optional<List<Reference>> complicationDetail() {
    return Optional.ofNullable(complicationDetail);
  }

  /**
   * @return The value of the {@code reasonCode} attribute
   */
  @JsonProperty("reasonCode")
  @Override
  public Optional<List<CodeableConcept>> reasonCode() {
    return Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code usedReference} attribute
   */
  @JsonProperty("usedReference")
  @Override
  public Optional<List<Reference>> usedReference() {
    return Optional.ofNullable(usedReference);
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
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
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
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Reference subject() {
    return subject;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code instantiatesUri} attribute
   */
  @JsonProperty("instantiatesUri")
  @Override
  public Optional<List<Uri>> instantiatesUri() {
    return Optional.ofNullable(instantiatesUri);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code recorder} attribute
   */
  @JsonProperty("recorder")
  @Override
  public Optional<Reference> recorder() {
    return Optional.ofNullable(recorder);
  }

  /**
   * @return The value of the {@code performedRange} attribute
   */
  @JsonProperty("performedRange")
  @Override
  public Optional<Range> performedRange() {
    return Optional.ofNullable(performedRange);
  }

  /**
   * @return The value of the {@code bodySite} attribute
   */
  @JsonProperty("bodySite")
  @Override
  public Optional<List<CodeableConcept>> bodySite() {
    return Optional.ofNullable(bodySite);
  }

  /**
   * @return The value of the {@code performedString} attribute
   */
  @JsonProperty("performedString")
  @Override
  public Optional<String> performedString() {
    return Optional.ofNullable(performedString);
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
   * @return The value of the {@code statusReason} attribute
   */
  @JsonProperty("statusReason")
  @Override
  public Optional<CodeableConcept> statusReason() {
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
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<List<Reference>> basedOn() {
    return Optional.ofNullable(basedOn);
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
   * @return The value of the {@code focalDevice} attribute
   */
  @JsonProperty("focalDevice")
  @Override
  public Optional<List<Procedure_FocalDevice>> focalDevice() {
    return Optional.ofNullable(focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withCategory(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableProcedure(
        newValue,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withCategory(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableProcedure(
        value,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPerformer(List<Procedure_Performer> value) {
    @Nullable List<Procedure_Performer> newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        newValue,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withPerformer(Optional<? extends List<Procedure_Performer>> optional) {
    @Nullable List<Procedure_Performer> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableProcedure(
        this.category,
        value,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        newValue,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        value,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#asserter() asserter} attribute.
   * @param value The value for asserter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withAsserter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "asserter");
    if (this.asserter == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        newValue,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#asserter() asserter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for asserter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withAsserter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.asserter == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        value,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#performedPeriod() performedPeriod} attribute.
   * @param value The value for performedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPerformedPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "performedPeriod");
    if (this.performedPeriod == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        newValue,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#performedPeriod() performedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withPerformedPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.performedPeriod == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        value,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#report() report} attribute.
   * @param value The value for report
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withReport(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "report");
    if (this.report == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        newValue,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#report() report} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for report
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withReport(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.report == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        value,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Procedure#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProcedure withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        newValue,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        newValue,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        value,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#performedDateTime() performedDateTime} attribute.
   * @param value The value for performedDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPerformedDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "performedDateTime");
    if (Objects.equals(this.performedDateTime, newValue)) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        newValue,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#performedDateTime() performedDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performedDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPerformedDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.performedDateTime, value)) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        value,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        newValue,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        value,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        newValue,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        value,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#usedCode() usedCode} attribute.
   * @param value The value for usedCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withUsedCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "usedCode");
    if (this.usedCode == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        newValue,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#usedCode() usedCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usedCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withUsedCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.usedCode == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        value,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPartOf(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        newValue,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withPartOf(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        value,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withLocation(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        newValue,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withLocation(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        value,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withInstantiatesCanonical(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        newValue,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withInstantiatesCanonical(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        value,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#followUp() followUp} attribute.
   * @param value The value for followUp
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withFollowUp(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "followUp");
    if (this.followUp == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        newValue,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#followUp() followUp} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for followUp
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withFollowUp(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.followUp == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        value,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        newValue,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        value,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withOutcome(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        newValue,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withOutcome(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        value,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#performedAge() performedAge} attribute.
   * @param value The value for performedAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPerformedAge(Age value) {
    @Nullable Age newValue = Objects.requireNonNull(value, "performedAge");
    if (this.performedAge == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        newValue,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#performedAge() performedAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performedAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withPerformedAge(Optional<? extends Age> optional) {
    @Nullable Age value = optional.orElse(null);
    if (this.performedAge == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        value,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#complication() complication} attribute.
   * @param value The value for complication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withComplication(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "complication");
    if (this.complication == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        newValue,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#complication() complication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for complication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withComplication(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.complication == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        value,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#complicationDetail() complicationDetail} attribute.
   * @param value The value for complicationDetail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withComplicationDetail(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "complicationDetail");
    if (this.complicationDetail == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        newValue,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#complicationDetail() complicationDetail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for complicationDetail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withComplicationDetail(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.complicationDetail == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        value,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        newValue,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        value,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#usedReference() usedReference} attribute.
   * @param value The value for usedReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withUsedReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "usedReference");
    if (this.usedReference == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        newValue,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#usedReference() usedReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usedReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withUsedReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.usedReference == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        value,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        newValue,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        value,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        newValue,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        value,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        newValue,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        value,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Procedure#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProcedure withSubject(Reference value) {
    if (this.subject == value) return this;
    Reference newValue = Objects.requireNonNull(value, "subject");
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        newValue,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        newValue,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        value,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        newValue,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        value,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withInstantiatesUri(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        newValue,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withInstantiatesUri(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        value,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        newValue,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        value,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#recorder() recorder} attribute.
   * @param value The value for recorder
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withRecorder(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "recorder");
    if (this.recorder == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        newValue,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#recorder() recorder} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recorder
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withRecorder(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.recorder == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        value,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#performedRange() performedRange} attribute.
   * @param value The value for performedRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPerformedRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "performedRange");
    if (this.performedRange == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        newValue,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#performedRange() performedRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performedRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withPerformedRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.performedRange == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        value,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withBodySite(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        newValue,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withBodySite(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        value,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#performedString() performedString} attribute.
   * @param value The value for performedString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPerformedString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "performedString");
    if (Objects.equals(this.performedString, newValue)) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        newValue,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#performedString() performedString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performedString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPerformedString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.performedString, value)) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        value,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        newValue,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        value,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withStatusReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        newValue,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withStatusReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        value,
        this.identifier,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        newValue,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        value,
        this.basedOn,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        newValue,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        value,
        this.extension,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        newValue,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        value,
        this.focalDevice);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#focalDevice() focalDevice} attribute.
   * @param value The value for focalDevice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withFocalDevice(List<Procedure_FocalDevice> value) {
    @Nullable List<Procedure_FocalDevice> newValue = Objects.requireNonNull(value, "focalDevice");
    if (this.focalDevice == newValue) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#focalDevice() focalDevice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focalDevice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withFocalDevice(Optional<? extends List<Procedure_FocalDevice>> optional) {
    @Nullable List<Procedure_FocalDevice> value = optional.orElse(null);
    if (this.focalDevice == value) return this;
    return new ImmutableProcedure(
        this.category,
        this.performer,
        this.status,
        this.asserter,
        this.performedPeriod,
        this.report,
        this.resourceType,
        this.meta,
        this.performedDateTime,
        this.reasonReference,
        this.id,
        this.usedCode,
        this.partOf,
        this.location,
        this.instantiatesCanonical,
        this.followUp,
        this.contained,
        this.outcome,
        this.performedAge,
        this.complication,
        this.complicationDetail,
        this.reasonCode,
        this.usedReference,
        this.encounter,
        this.note,
        this.text,
        this.subject,
        this.implicitRules,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.recorder,
        this.performedRange,
        this.bodySite,
        this.performedString,
        this.language,
        this.statusReason,
        this.identifier,
        this.basedOn,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProcedure} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProcedure
        && equalTo((ImmutableProcedure) another);
  }

  private boolean equalTo(ImmutableProcedure another) {
    return Objects.equals(category, another.category)
        && Objects.equals(performer, another.performer)
        && Objects.equals(status, another.status)
        && Objects.equals(asserter, another.asserter)
        && Objects.equals(performedPeriod, another.performedPeriod)
        && Objects.equals(report, another.report)
        && resourceType.equals(another.resourceType)
        && Objects.equals(meta, another.meta)
        && Objects.equals(performedDateTime, another.performedDateTime)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(id, another.id)
        && Objects.equals(usedCode, another.usedCode)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(location, another.location)
        && Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && Objects.equals(followUp, another.followUp)
        && Objects.equals(contained, another.contained)
        && Objects.equals(outcome, another.outcome)
        && Objects.equals(performedAge, another.performedAge)
        && Objects.equals(complication, another.complication)
        && Objects.equals(complicationDetail, another.complicationDetail)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(usedReference, another.usedReference)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(note, another.note)
        && Objects.equals(text, another.text)
        && subject.equals(another.subject)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(instantiatesUri, another.instantiatesUri)
        && Objects.equals(code, another.code)
        && Objects.equals(recorder, another.recorder)
        && Objects.equals(performedRange, another.performedRange)
        && Objects.equals(bodySite, another.bodySite)
        && Objects.equals(performedString, another.performedString)
        && Objects.equals(language, another.language)
        && Objects.equals(statusReason, another.statusReason)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(extension, another.extension)
        && Objects.equals(focalDevice, another.focalDevice);
  }

  /**
   * Computes a hash code from attributes: {@code category}, {@code performer}, {@code status}, {@code asserter}, {@code performedPeriod}, {@code report}, {@code resourceType}, {@code meta}, {@code performedDateTime}, {@code reasonReference}, {@code id}, {@code usedCode}, {@code partOf}, {@code location}, {@code instantiatesCanonical}, {@code followUp}, {@code contained}, {@code outcome}, {@code performedAge}, {@code complication}, {@code complicationDetail}, {@code reasonCode}, {@code usedReference}, {@code encounter}, {@code note}, {@code text}, {@code subject}, {@code implicitRules}, {@code modifierExtension}, {@code instantiatesUri}, {@code code}, {@code recorder}, {@code performedRange}, {@code bodySite}, {@code performedString}, {@code language}, {@code statusReason}, {@code identifier}, {@code basedOn}, {@code extension}, {@code focalDevice}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(asserter);
    h += (h << 5) + Objects.hashCode(performedPeriod);
    h += (h << 5) + Objects.hashCode(report);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(performedDateTime);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(usedCode);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + Objects.hashCode(followUp);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(outcome);
    h += (h << 5) + Objects.hashCode(performedAge);
    h += (h << 5) + Objects.hashCode(complication);
    h += (h << 5) + Objects.hashCode(complicationDetail);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(usedReference);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(instantiatesUri);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(recorder);
    h += (h << 5) + Objects.hashCode(performedRange);
    h += (h << 5) + Objects.hashCode(bodySite);
    h += (h << 5) + Objects.hashCode(performedString);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(statusReason);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(focalDevice);
    return h;
  }

  /**
   * Prints the immutable value {@code Procedure} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Procedure{");
    if (category != null) {
      builder.append("category=").append(category);
    }
    if (performer != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (status != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (asserter != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("asserter=").append(asserter);
    }
    if (performedPeriod != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("performedPeriod=").append(performedPeriod);
    }
    if (report != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("report=").append(report);
    }
    if (builder.length() > 10) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (performedDateTime != null) {
      builder.append(", ");
      builder.append("performedDateTime=").append(performedDateTime);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (usedCode != null) {
      builder.append(", ");
      builder.append("usedCode=").append(usedCode);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (instantiatesCanonical != null) {
      builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (followUp != null) {
      builder.append(", ");
      builder.append("followUp=").append(followUp);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (outcome != null) {
      builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (performedAge != null) {
      builder.append(", ");
      builder.append("performedAge=").append(performedAge);
    }
    if (complication != null) {
      builder.append(", ");
      builder.append("complication=").append(complication);
    }
    if (complicationDetail != null) {
      builder.append(", ");
      builder.append("complicationDetail=").append(complicationDetail);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (usedReference != null) {
      builder.append(", ");
      builder.append("usedReference=").append(usedReference);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    builder.append(", ");
    builder.append("subject=").append(subject);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (instantiatesUri != null) {
      builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (recorder != null) {
      builder.append(", ");
      builder.append("recorder=").append(recorder);
    }
    if (performedRange != null) {
      builder.append(", ");
      builder.append("performedRange=").append(performedRange);
    }
    if (bodySite != null) {
      builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (performedString != null) {
      builder.append(", ");
      builder.append("performedString=").append(performedString);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (focalDevice != null) {
      builder.append(", ");
      builder.append("focalDevice=").append(focalDevice);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Procedure", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Procedure {
    @Nullable Optional<CodeableConcept> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<List<Procedure_Performer>> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Reference> asserter = Optional.empty();
    boolean asserterIsSet;
    @Nullable Optional<Period> performedPeriod = Optional.empty();
    boolean performedPeriodIsSet;
    @Nullable Optional<List<Reference>> report = Optional.empty();
    boolean reportIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<String> performedDateTime = Optional.empty();
    boolean performedDateTimeIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<CodeableConcept>> usedCode = Optional.empty();
    boolean usedCodeIsSet;
    @Nullable Optional<List<Reference>> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<Reference> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<List<Canonical>> instantiatesCanonical = Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @Nullable Optional<List<CodeableConcept>> followUp = Optional.empty();
    boolean followUpIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<CodeableConcept> outcome = Optional.empty();
    boolean outcomeIsSet;
    @Nullable Optional<Age> performedAge = Optional.empty();
    boolean performedAgeIsSet;
    @Nullable Optional<List<CodeableConcept>> complication = Optional.empty();
    boolean complicationIsSet;
    @Nullable Optional<List<Reference>> complicationDetail = Optional.empty();
    boolean complicationDetailIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<List<Reference>> usedReference = Optional.empty();
    boolean usedReferenceIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Reference subject;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Uri>> instantiatesUri = Optional.empty();
    boolean instantiatesUriIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<Reference> recorder = Optional.empty();
    boolean recorderIsSet;
    @Nullable Optional<Range> performedRange = Optional.empty();
    boolean performedRangeIsSet;
    @Nullable Optional<List<CodeableConcept>> bodySite = Optional.empty();
    boolean bodySiteIsSet;
    @Nullable Optional<String> performedString = Optional.empty();
    boolean performedStringIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<CodeableConcept> statusReason = Optional.empty();
    boolean statusReasonIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Procedure_FocalDevice>> focalDevice = Optional.empty();
    boolean focalDeviceIsSet;
    @JsonProperty("category")
    public void setCategory(Optional<CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<List<Procedure_Performer>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("asserter")
    public void setAsserter(Optional<Reference> asserter) {
      this.asserter = asserter;
      this.asserterIsSet = true;
    }
    @JsonProperty("performedPeriod")
    public void setPerformedPeriod(Optional<Period> performedPeriod) {
      this.performedPeriod = performedPeriod;
      this.performedPeriodIsSet = true;
    }
    @JsonProperty("report")
    public void setReport(Optional<List<Reference>> report) {
      this.report = report;
      this.reportIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("performedDateTime")
    public void setPerformedDateTime(Optional<String> performedDateTime) {
      this.performedDateTime = performedDateTime;
      this.performedDateTimeIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("usedCode")
    public void setUsedCode(Optional<List<CodeableConcept>> usedCode) {
      this.usedCode = usedCode;
      this.usedCodeIsSet = true;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<List<Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Optional<Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(Optional<List<Canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @JsonProperty("followUp")
    public void setFollowUp(Optional<List<CodeableConcept>> followUp) {
      this.followUp = followUp;
      this.followUpIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("outcome")
    public void setOutcome(Optional<CodeableConcept> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @JsonProperty("performedAge")
    public void setPerformedAge(Optional<Age> performedAge) {
      this.performedAge = performedAge;
      this.performedAgeIsSet = true;
    }
    @JsonProperty("complication")
    public void setComplication(Optional<List<CodeableConcept>> complication) {
      this.complication = complication;
      this.complicationIsSet = true;
    }
    @JsonProperty("complicationDetail")
    public void setComplicationDetail(Optional<List<Reference>> complicationDetail) {
      this.complicationDetail = complicationDetail;
      this.complicationDetailIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("usedReference")
    public void setUsedReference(Optional<List<Reference>> usedReference) {
      this.usedReference = usedReference;
      this.usedReferenceIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
      this.subject = subject;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(Optional<List<Uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("recorder")
    public void setRecorder(Optional<Reference> recorder) {
      this.recorder = recorder;
      this.recorderIsSet = true;
    }
    @JsonProperty("performedRange")
    public void setPerformedRange(Optional<Range> performedRange) {
      this.performedRange = performedRange;
      this.performedRangeIsSet = true;
    }
    @JsonProperty("bodySite")
    public void setBodySite(Optional<List<CodeableConcept>> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @JsonProperty("performedString")
    public void setPerformedString(Optional<String> performedString) {
      this.performedString = performedString;
      this.performedStringIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("statusReason")
    public void setStatusReason(Optional<CodeableConcept> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("focalDevice")
    public void setFocalDevice(Optional<List<Procedure_FocalDevice>> focalDevice) {
      this.focalDevice = focalDevice;
      this.focalDeviceIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Procedure_Performer>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> asserter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> performedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> report() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> performedDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> usedCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> followUp() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Age> performedAge() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> complication() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> complicationDetail() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> usedReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> recorder() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> performedRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> performedString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Procedure_FocalDevice>> focalDevice() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableProcedure fromJson(Json json) {
    ImmutableProcedure.Builder builder = ((ImmutableProcedure.Builder) ImmutableProcedure.builder());
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.asserterIsSet) {
      builder.asserter(json.asserter);
    }
    if (json.performedPeriodIsSet) {
      builder.performedPeriod(json.performedPeriod);
    }
    if (json.reportIsSet) {
      builder.report(json.report);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.performedDateTimeIsSet) {
      builder.performedDateTime(json.performedDateTime);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.usedCodeIsSet) {
      builder.usedCode(json.usedCode);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.followUpIsSet) {
      builder.followUp(json.followUp);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.performedAgeIsSet) {
      builder.performedAge(json.performedAge);
    }
    if (json.complicationIsSet) {
      builder.complication(json.complication);
    }
    if (json.complicationDetailIsSet) {
      builder.complicationDetail(json.complicationDetail);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.usedReferenceIsSet) {
      builder.usedReference(json.usedReference);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.recorderIsSet) {
      builder.recorder(json.recorder);
    }
    if (json.performedRangeIsSet) {
      builder.performedRange(json.performedRange);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.performedStringIsSet) {
      builder.performedString(json.performedString);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.focalDeviceIsSet) {
      builder.focalDevice(json.focalDevice);
    }
    return (ImmutableProcedure) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Procedure} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Procedure instance
   */
  public static Procedure copyOf(Procedure instance) {
    if (instance instanceof ImmutableProcedure) {
      return (ImmutableProcedure) instance;
    }
    return ((ImmutableProcedure.Builder) ImmutableProcedure.builder())
        .category(instance.category())
        .performer(instance.performer())
        .status(instance.status())
        .asserter(instance.asserter())
        .performedPeriod(instance.performedPeriod())
        .report(instance.report())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .performedDateTime(instance.performedDateTime())
        .reasonReference(instance.reasonReference())
        .id(instance.id())
        .usedCode(instance.usedCode())
        .partOf(instance.partOf())
        .location(instance.location())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .followUp(instance.followUp())
        .contained(instance.contained())
        .outcome(instance.outcome())
        .performedAge(instance.performedAge())
        .complication(instance.complication())
        .complicationDetail(instance.complicationDetail())
        .reasonCode(instance.reasonCode())
        .usedReference(instance.usedReference())
        .encounter(instance.encounter())
        .note(instance.note())
        .text(instance.text())
        .subject(instance.subject())
        .implicitRules(instance.implicitRules())
        .modifierExtension(instance.modifierExtension())
        .instantiatesUri(instance.instantiatesUri())
        .code(instance.code())
        .recorder(instance.recorder())
        .performedRange(instance.performedRange())
        .bodySite(instance.bodySite())
        .performedString(instance.performedString())
        .language(instance.language())
        .statusReason(instance.statusReason())
        .identifier(instance.identifier())
        .basedOn(instance.basedOn())
        .extension(instance.extension())
        .focalDevice(instance.focalDevice())
        .build();
  }

  /**
   * Creates a builder for {@link Procedure Procedure}.
   * <pre>
   * ImmutableProcedure.builder()
   *    .category(com.fhir.types.fhir.CodeableConcept) // optional {@link Procedure#category() category}
   *    .performer(List&amp;lt;com.fhir.types.fhir.Procedure_Performer&amp;gt;) // optional {@link Procedure#performer() performer}
   *    .status(com.fhir.types.fhir.Code) // optional {@link Procedure#status() status}
   *    .asserter(com.fhir.types.fhir.Reference) // optional {@link Procedure#asserter() asserter}
   *    .performedPeriod(com.fhir.types.fhir.Period) // optional {@link Procedure#performedPeriod() performedPeriod}
   *    .report(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Procedure#report() report}
   *    .resourceType(String) // required {@link Procedure#resourceType() resourceType}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Procedure#meta() meta}
   *    .performedDateTime(String) // optional {@link Procedure#performedDateTime() performedDateTime}
   *    .reasonReference(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Procedure#reasonReference() reasonReference}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Procedure#id() id}
   *    .usedCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Procedure#usedCode() usedCode}
   *    .partOf(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Procedure#partOf() partOf}
   *    .location(com.fhir.types.fhir.Reference) // optional {@link Procedure#location() location}
   *    .instantiatesCanonical(List&amp;lt;com.fhir.types.fhir.Canonical&amp;gt;) // optional {@link Procedure#instantiatesCanonical() instantiatesCanonical}
   *    .followUp(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Procedure#followUp() followUp}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Procedure#contained() contained}
   *    .outcome(com.fhir.types.fhir.CodeableConcept) // optional {@link Procedure#outcome() outcome}
   *    .performedAge(com.fhir.types.fhir.Age) // optional {@link Procedure#performedAge() performedAge}
   *    .complication(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Procedure#complication() complication}
   *    .complicationDetail(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Procedure#complicationDetail() complicationDetail}
   *    .reasonCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Procedure#reasonCode() reasonCode}
   *    .usedReference(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Procedure#usedReference() usedReference}
   *    .encounter(com.fhir.types.fhir.Reference) // optional {@link Procedure#encounter() encounter}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link Procedure#note() note}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Procedure#text() text}
   *    .subject(com.fhir.types.fhir.Reference) // required {@link Procedure#subject() subject}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Procedure#implicitRules() implicitRules}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Procedure#modifierExtension() modifierExtension}
   *    .instantiatesUri(List&amp;lt;com.fhir.types.fhir.Uri&amp;gt;) // optional {@link Procedure#instantiatesUri() instantiatesUri}
   *    .code(com.fhir.types.fhir.CodeableConcept) // optional {@link Procedure#code() code}
   *    .recorder(com.fhir.types.fhir.Reference) // optional {@link Procedure#recorder() recorder}
   *    .performedRange(com.fhir.types.fhir.Range) // optional {@link Procedure#performedRange() performedRange}
   *    .bodySite(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Procedure#bodySite() bodySite}
   *    .performedString(String) // optional {@link Procedure#performedString() performedString}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Procedure#language() language}
   *    .statusReason(com.fhir.types.fhir.CodeableConcept) // optional {@link Procedure#statusReason() statusReason}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Procedure#identifier() identifier}
   *    .basedOn(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Procedure#basedOn() basedOn}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Procedure#extension() extension}
   *    .focalDevice(List&amp;lt;com.fhir.types.fhir.Procedure_FocalDevice&amp;gt;) // optional {@link Procedure#focalDevice() focalDevice}
   *    .build();
   * </pre>
   * @return A new Procedure builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableProcedure.Builder();
  }

  /**
   * Builds instances of type {@link Procedure Procedure}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Procedure", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, SubjectBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_SUBJECT = 0x2L;
    private static final long OPT_BIT_CATEGORY = 0x1L;
    private static final long OPT_BIT_PERFORMER = 0x2L;
    private static final long OPT_BIT_STATUS = 0x4L;
    private static final long OPT_BIT_ASSERTER = 0x8L;
    private static final long OPT_BIT_PERFORMED_PERIOD = 0x10L;
    private static final long OPT_BIT_REPORT = 0x20L;
    private static final long OPT_BIT_META = 0x40L;
    private static final long OPT_BIT_PERFORMED_DATE_TIME = 0x80L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_USED_CODE = 0x400L;
    private static final long OPT_BIT_PART_OF = 0x800L;
    private static final long OPT_BIT_LOCATION = 0x1000L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x2000L;
    private static final long OPT_BIT_FOLLOW_UP = 0x4000L;
    private static final long OPT_BIT_CONTAINED = 0x8000L;
    private static final long OPT_BIT_OUTCOME = 0x10000L;
    private static final long OPT_BIT_PERFORMED_AGE = 0x20000L;
    private static final long OPT_BIT_COMPLICATION = 0x40000L;
    private static final long OPT_BIT_COMPLICATION_DETAIL = 0x80000L;
    private static final long OPT_BIT_REASON_CODE = 0x100000L;
    private static final long OPT_BIT_USED_REFERENCE = 0x200000L;
    private static final long OPT_BIT_ENCOUNTER = 0x400000L;
    private static final long OPT_BIT_NOTE = 0x800000L;
    private static final long OPT_BIT_TEXT = 0x1000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000000L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x8000000L;
    private static final long OPT_BIT_CODE = 0x10000000L;
    private static final long OPT_BIT_RECORDER = 0x20000000L;
    private static final long OPT_BIT_PERFORMED_RANGE = 0x40000000L;
    private static final long OPT_BIT_BODY_SITE = 0x80000000L;
    private static final long OPT_BIT_PERFORMED_STRING = 0x100000000L;
    private static final long OPT_BIT_LANGUAGE = 0x200000000L;
    private static final long OPT_BIT_STATUS_REASON = 0x400000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x800000000L;
    private static final long OPT_BIT_BASED_ON = 0x1000000000L;
    private static final long OPT_BIT_EXTENSION = 0x2000000000L;
    private static final long OPT_BIT_FOCAL_DEVICE = 0x4000000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable CodeableConcept category;
    private @Nullable List<Procedure_Performer> performer;
    private @Nullable Code status;
    private @Nullable Reference asserter;
    private @Nullable Period performedPeriod;
    private @Nullable List<Reference> report;
    private @Nullable String resourceType;
    private @Nullable Meta meta;
    private @Nullable String performedDateTime;
    private @Nullable List<Reference> reasonReference;
    private @Nullable Id id;
    private @Nullable List<CodeableConcept> usedCode;
    private @Nullable List<Reference> partOf;
    private @Nullable Reference location;
    private @Nullable List<Canonical> instantiatesCanonical;
    private @Nullable List<CodeableConcept> followUp;
    private @Nullable List<ResourceList> contained;
    private @Nullable CodeableConcept outcome;
    private @Nullable Age performedAge;
    private @Nullable List<CodeableConcept> complication;
    private @Nullable List<Reference> complicationDetail;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable List<Reference> usedReference;
    private @Nullable Reference encounter;
    private @Nullable List<Annotation> note;
    private @Nullable Narrative text;
    private @Nullable Reference subject;
    private @Nullable Uri implicitRules;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Uri> instantiatesUri;
    private @Nullable CodeableConcept code;
    private @Nullable Reference recorder;
    private @Nullable Range performedRange;
    private @Nullable List<CodeableConcept> bodySite;
    private @Nullable String performedString;
    private @Nullable Code language;
    private @Nullable CodeableConcept statusReason;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Reference> basedOn;
    private @Nullable List<Extension> extension;
    private @Nullable List<Procedure_FocalDevice> focalDevice;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Procedure#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(List<Procedure_Performer> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performer")
    public final Builder performer(Optional<? extends List<Procedure_Performer>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(Code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends Code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for chained invocation
     */
    public final Builder asserter(Reference asserter) {
      checkNotIsSet(asserterIsSet(), "asserter");
      this.asserter = Objects.requireNonNull(asserter, "asserter");
      optBits |= OPT_BIT_ASSERTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("asserter")
    public final Builder asserter(Optional<? extends Reference> asserter) {
      checkNotIsSet(asserterIsSet(), "asserter");
      this.asserter = asserter.orElse(null);
      optBits |= OPT_BIT_ASSERTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedPeriod() performedPeriod} to performedPeriod.
     * @param performedPeriod The value for performedPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder performedPeriod(Period performedPeriod) {
      checkNotIsSet(performedPeriodIsSet(), "performedPeriod");
      this.performedPeriod = Objects.requireNonNull(performedPeriod, "performedPeriod");
      optBits |= OPT_BIT_PERFORMED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedPeriod() performedPeriod} to performedPeriod.
     * @param performedPeriod The value for performedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performedPeriod")
    public final Builder performedPeriod(Optional<? extends Period> performedPeriod) {
      checkNotIsSet(performedPeriodIsSet(), "performedPeriod");
      this.performedPeriod = performedPeriod.orElse(null);
      optBits |= OPT_BIT_PERFORMED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#report() report} to report.
     * @param report The value for report
     * @return {@code this} builder for chained invocation
     */
    public final Builder report(List<Reference> report) {
      checkNotIsSet(reportIsSet(), "report");
      this.report = Objects.requireNonNull(report, "report");
      optBits |= OPT_BIT_REPORT;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#report() report} to report.
     * @param report The value for report
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("report")
    public final Builder report(Optional<? extends List<Reference>> report) {
      checkNotIsSet(reportIsSet(), "report");
      this.report = report.orElse(null);
      optBits |= OPT_BIT_REPORT;
      return this;
    }

    /**
     * Initializes the value for the {@link Procedure#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Procedure#meta() meta} to meta.
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
     * Initializes the optional value {@link Procedure#meta() meta} to meta.
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
     * Initializes the optional value {@link Procedure#performedDateTime() performedDateTime} to performedDateTime.
     * @param performedDateTime The value for performedDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder performedDateTime(String performedDateTime) {
      checkNotIsSet(performedDateTimeIsSet(), "performedDateTime");
      this.performedDateTime = Objects.requireNonNull(performedDateTime, "performedDateTime");
      optBits |= OPT_BIT_PERFORMED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedDateTime() performedDateTime} to performedDateTime.
     * @param performedDateTime The value for performedDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performedDateTime")
    public final Builder performedDateTime(Optional<String> performedDateTime) {
      checkNotIsSet(performedDateTimeIsSet(), "performedDateTime");
      this.performedDateTime = performedDateTime.orElse(null);
      optBits |= OPT_BIT_PERFORMED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(List<Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonReference")
    public final Builder reasonReference(Optional<? extends List<Reference>> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#id() id} to id.
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
     * Initializes the optional value {@link Procedure#id() id} to id.
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
     * Initializes the optional value {@link Procedure#usedCode() usedCode} to usedCode.
     * @param usedCode The value for usedCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder usedCode(List<CodeableConcept> usedCode) {
      checkNotIsSet(usedCodeIsSet(), "usedCode");
      this.usedCode = Objects.requireNonNull(usedCode, "usedCode");
      optBits |= OPT_BIT_USED_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#usedCode() usedCode} to usedCode.
     * @param usedCode The value for usedCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("usedCode")
    public final Builder usedCode(Optional<? extends List<CodeableConcept>> usedCode) {
      checkNotIsSet(usedCodeIsSet(), "usedCode");
      this.usedCode = usedCode.orElse(null);
      optBits |= OPT_BIT_USED_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link Procedure#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link Procedure#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(Optional<? extends Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesCanonical(List<Canonical> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = Objects.requireNonNull(instantiatesCanonical, "instantiatesCanonical");
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesCanonical")
    public final Builder instantiatesCanonical(Optional<? extends List<Canonical>> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = instantiatesCanonical.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#followUp() followUp} to followUp.
     * @param followUp The value for followUp
     * @return {@code this} builder for chained invocation
     */
    public final Builder followUp(List<CodeableConcept> followUp) {
      checkNotIsSet(followUpIsSet(), "followUp");
      this.followUp = Objects.requireNonNull(followUp, "followUp");
      optBits |= OPT_BIT_FOLLOW_UP;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#followUp() followUp} to followUp.
     * @param followUp The value for followUp
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("followUp")
    public final Builder followUp(Optional<? extends List<CodeableConcept>> followUp) {
      checkNotIsSet(followUpIsSet(), "followUp");
      this.followUp = followUp.orElse(null);
      optBits |= OPT_BIT_FOLLOW_UP;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#contained() contained} to contained.
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
     * Initializes the optional value {@link Procedure#contained() contained} to contained.
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
     * Initializes the optional value {@link Procedure#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(CodeableConcept outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder outcome(Optional<? extends CodeableConcept> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedAge() performedAge} to performedAge.
     * @param performedAge The value for performedAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder performedAge(Age performedAge) {
      checkNotIsSet(performedAgeIsSet(), "performedAge");
      this.performedAge = Objects.requireNonNull(performedAge, "performedAge");
      optBits |= OPT_BIT_PERFORMED_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedAge() performedAge} to performedAge.
     * @param performedAge The value for performedAge
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performedAge")
    public final Builder performedAge(Optional<? extends Age> performedAge) {
      checkNotIsSet(performedAgeIsSet(), "performedAge");
      this.performedAge = performedAge.orElse(null);
      optBits |= OPT_BIT_PERFORMED_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#complication() complication} to complication.
     * @param complication The value for complication
     * @return {@code this} builder for chained invocation
     */
    public final Builder complication(List<CodeableConcept> complication) {
      checkNotIsSet(complicationIsSet(), "complication");
      this.complication = Objects.requireNonNull(complication, "complication");
      optBits |= OPT_BIT_COMPLICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#complication() complication} to complication.
     * @param complication The value for complication
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("complication")
    public final Builder complication(Optional<? extends List<CodeableConcept>> complication) {
      checkNotIsSet(complicationIsSet(), "complication");
      this.complication = complication.orElse(null);
      optBits |= OPT_BIT_COMPLICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#complicationDetail() complicationDetail} to complicationDetail.
     * @param complicationDetail The value for complicationDetail
     * @return {@code this} builder for chained invocation
     */
    public final Builder complicationDetail(List<Reference> complicationDetail) {
      checkNotIsSet(complicationDetailIsSet(), "complicationDetail");
      this.complicationDetail = Objects.requireNonNull(complicationDetail, "complicationDetail");
      optBits |= OPT_BIT_COMPLICATION_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#complicationDetail() complicationDetail} to complicationDetail.
     * @param complicationDetail The value for complicationDetail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("complicationDetail")
    public final Builder complicationDetail(Optional<? extends List<Reference>> complicationDetail) {
      checkNotIsSet(complicationDetailIsSet(), "complicationDetail");
      this.complicationDetail = complicationDetail.orElse(null);
      optBits |= OPT_BIT_COMPLICATION_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(List<CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonCode")
    public final Builder reasonCode(Optional<? extends List<CodeableConcept>> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#usedReference() usedReference} to usedReference.
     * @param usedReference The value for usedReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder usedReference(List<Reference> usedReference) {
      checkNotIsSet(usedReferenceIsSet(), "usedReference");
      this.usedReference = Objects.requireNonNull(usedReference, "usedReference");
      optBits |= OPT_BIT_USED_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#usedReference() usedReference} to usedReference.
     * @param usedReference The value for usedReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("usedReference")
    public final Builder usedReference(Optional<? extends List<Reference>> usedReference) {
      checkNotIsSet(usedReferenceIsSet(), "usedReference");
      this.usedReference = usedReference.orElse(null);
      optBits |= OPT_BIT_USED_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Procedure#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Procedure#note() note} to note.
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
     * Initializes the optional value {@link Procedure#note() note} to note.
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
     * Initializes the optional value {@link Procedure#text() text} to text.
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
     * Initializes the optional value {@link Procedure#text() text} to text.
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
     * Initializes the value for the {@link Procedure#subject() subject} attribute.
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
     * Initializes the optional value {@link Procedure#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Procedure#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Procedure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Procedure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Procedure#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesUri(List<Uri> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = Objects.requireNonNull(instantiatesUri, "instantiatesUri");
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesUri")
    public final Builder instantiatesUri(Optional<? extends List<Uri>> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = instantiatesUri.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for chained invocation
     */
    public final Builder recorder(Reference recorder) {
      checkNotIsSet(recorderIsSet(), "recorder");
      this.recorder = Objects.requireNonNull(recorder, "recorder");
      optBits |= OPT_BIT_RECORDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("recorder")
    public final Builder recorder(Optional<? extends Reference> recorder) {
      checkNotIsSet(recorderIsSet(), "recorder");
      this.recorder = recorder.orElse(null);
      optBits |= OPT_BIT_RECORDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedRange() performedRange} to performedRange.
     * @param performedRange The value for performedRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder performedRange(Range performedRange) {
      checkNotIsSet(performedRangeIsSet(), "performedRange");
      this.performedRange = Objects.requireNonNull(performedRange, "performedRange");
      optBits |= OPT_BIT_PERFORMED_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedRange() performedRange} to performedRange.
     * @param performedRange The value for performedRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performedRange")
    public final Builder performedRange(Optional<? extends Range> performedRange) {
      checkNotIsSet(performedRangeIsSet(), "performedRange");
      this.performedRange = performedRange.orElse(null);
      optBits |= OPT_BIT_PERFORMED_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    public final Builder bodySite(List<CodeableConcept> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = Objects.requireNonNull(bodySite, "bodySite");
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("bodySite")
    public final Builder bodySite(Optional<? extends List<CodeableConcept>> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = bodySite.orElse(null);
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedString() performedString} to performedString.
     * @param performedString The value for performedString
     * @return {@code this} builder for chained invocation
     */
    public final Builder performedString(String performedString) {
      checkNotIsSet(performedStringIsSet(), "performedString");
      this.performedString = Objects.requireNonNull(performedString, "performedString");
      optBits |= OPT_BIT_PERFORMED_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedString() performedString} to performedString.
     * @param performedString The value for performedString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performedString")
    public final Builder performedString(Optional<String> performedString) {
      checkNotIsSet(performedStringIsSet(), "performedString");
      this.performedString = performedString.orElse(null);
      optBits |= OPT_BIT_PERFORMED_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#language() language} to language.
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
     * Initializes the optional value {@link Procedure#language() language} to language.
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
     * Initializes the optional value {@link Procedure#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(CodeableConcept statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusReason")
    public final Builder statusReason(Optional<? extends CodeableConcept> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Procedure#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Procedure#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link Procedure#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link Procedure#extension() extension} to extension.
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
     * Initializes the optional value {@link Procedure#extension() extension} to extension.
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
     * Initializes the optional value {@link Procedure#focalDevice() focalDevice} to focalDevice.
     * @param focalDevice The value for focalDevice
     * @return {@code this} builder for chained invocation
     */
    public final Builder focalDevice(List<Procedure_FocalDevice> focalDevice) {
      checkNotIsSet(focalDeviceIsSet(), "focalDevice");
      this.focalDevice = Objects.requireNonNull(focalDevice, "focalDevice");
      optBits |= OPT_BIT_FOCAL_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#focalDevice() focalDevice} to focalDevice.
     * @param focalDevice The value for focalDevice
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("focalDevice")
    public final Builder focalDevice(Optional<? extends List<Procedure_FocalDevice>> focalDevice) {
      checkNotIsSet(focalDeviceIsSet(), "focalDevice");
      this.focalDevice = focalDevice.orElse(null);
      optBits |= OPT_BIT_FOCAL_DEVICE;
      return this;
    }

    /**
     * Builds a new {@link Procedure Procedure}.
     * @return An immutable instance of Procedure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Procedure build() {
      checkRequiredAttributes();
      return new ImmutableProcedure(
          category,
          performer,
          status,
          asserter,
          performedPeriod,
          report,
          resourceType,
          meta,
          performedDateTime,
          reasonReference,
          id,
          usedCode,
          partOf,
          location,
          instantiatesCanonical,
          followUp,
          contained,
          outcome,
          performedAge,
          complication,
          complicationDetail,
          reasonCode,
          usedReference,
          encounter,
          note,
          text,
          subject,
          implicitRules,
          modifierExtension,
          instantiatesUri,
          code,
          recorder,
          performedRange,
          bodySite,
          performedString,
          language,
          statusReason,
          identifier,
          basedOn,
          extension,
          focalDevice);
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean asserterIsSet() {
      return (optBits & OPT_BIT_ASSERTER) != 0;
    }

    private boolean performedPeriodIsSet() {
      return (optBits & OPT_BIT_PERFORMED_PERIOD) != 0;
    }

    private boolean reportIsSet() {
      return (optBits & OPT_BIT_REPORT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean performedDateTimeIsSet() {
      return (optBits & OPT_BIT_PERFORMED_DATE_TIME) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean usedCodeIsSet() {
      return (optBits & OPT_BIT_USED_CODE) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean followUpIsSet() {
      return (optBits & OPT_BIT_FOLLOW_UP) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean performedAgeIsSet() {
      return (optBits & OPT_BIT_PERFORMED_AGE) != 0;
    }

    private boolean complicationIsSet() {
      return (optBits & OPT_BIT_COMPLICATION) != 0;
    }

    private boolean complicationDetailIsSet() {
      return (optBits & OPT_BIT_COMPLICATION_DETAIL) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean usedReferenceIsSet() {
      return (optBits & OPT_BIT_USED_REFERENCE) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean recorderIsSet() {
      return (optBits & OPT_BIT_RECORDER) != 0;
    }

    private boolean performedRangeIsSet() {
      return (optBits & OPT_BIT_PERFORMED_RANGE) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean performedStringIsSet() {
      return (optBits & OPT_BIT_PERFORMED_STRING) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean focalDeviceIsSet() {
      return (optBits & OPT_BIT_FOCAL_DEVICE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Procedure is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!subjectIsSet()) attributes.add("subject");
      return "Cannot build Procedure, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Procedure", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Procedure#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    SubjectBuildStage resourceType(String resourceType);
  }

  @Generated(from = "Procedure", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link Procedure#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Reference subject);
  }

  @Generated(from = "Procedure", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Procedure#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(CodeableConcept category);

    /**
     * Initializes the optional value {@link Procedure#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends CodeableConcept> category);

    /**
     * Initializes the optional value {@link Procedure#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(List<Procedure_Performer> performer);

    /**
     * Initializes the optional value {@link Procedure#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(Optional<? extends List<Procedure_Performer>> performer);

    /**
     * Initializes the optional value {@link Procedure#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link Procedure#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link Procedure#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal asserter(Reference asserter);

    /**
     * Initializes the optional value {@link Procedure#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal asserter(Optional<? extends Reference> asserter);

    /**
     * Initializes the optional value {@link Procedure#performedPeriod() performedPeriod} to performedPeriod.
     * @param performedPeriod The value for performedPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performedPeriod(Period performedPeriod);

    /**
     * Initializes the optional value {@link Procedure#performedPeriod() performedPeriod} to performedPeriod.
     * @param performedPeriod The value for performedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performedPeriod(Optional<? extends Period> performedPeriod);

    /**
     * Initializes the optional value {@link Procedure#report() report} to report.
     * @param report The value for report
     * @return {@code this} builder for chained invocation
     */
    BuildFinal report(List<Reference> report);

    /**
     * Initializes the optional value {@link Procedure#report() report} to report.
     * @param report The value for report
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal report(Optional<? extends List<Reference>> report);

    /**
     * Initializes the optional value {@link Procedure#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Procedure#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Procedure#performedDateTime() performedDateTime} to performedDateTime.
     * @param performedDateTime The value for performedDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performedDateTime(String performedDateTime);

    /**
     * Initializes the optional value {@link Procedure#performedDateTime() performedDateTime} to performedDateTime.
     * @param performedDateTime The value for performedDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performedDateTime(Optional<String> performedDateTime);

    /**
     * Initializes the optional value {@link Procedure#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link Procedure#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link Procedure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Procedure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Procedure#usedCode() usedCode} to usedCode.
     * @param usedCode The value for usedCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usedCode(List<CodeableConcept> usedCode);

    /**
     * Initializes the optional value {@link Procedure#usedCode() usedCode} to usedCode.
     * @param usedCode The value for usedCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usedCode(Optional<? extends List<CodeableConcept>> usedCode);

    /**
     * Initializes the optional value {@link Procedure#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(List<Reference> partOf);

    /**
     * Initializes the optional value {@link Procedure#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends List<Reference>> partOf);

    /**
     * Initializes the optional value {@link Procedure#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(Reference location);

    /**
     * Initializes the optional value {@link Procedure#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(Optional<? extends Reference> location);

    /**
     * Initializes the optional value {@link Procedure#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(List<Canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link Procedure#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(Optional<? extends List<Canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link Procedure#followUp() followUp} to followUp.
     * @param followUp The value for followUp
     * @return {@code this} builder for chained invocation
     */
    BuildFinal followUp(List<CodeableConcept> followUp);

    /**
     * Initializes the optional value {@link Procedure#followUp() followUp} to followUp.
     * @param followUp The value for followUp
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal followUp(Optional<? extends List<CodeableConcept>> followUp);

    /**
     * Initializes the optional value {@link Procedure#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Procedure#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Procedure#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(CodeableConcept outcome);

    /**
     * Initializes the optional value {@link Procedure#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(Optional<? extends CodeableConcept> outcome);

    /**
     * Initializes the optional value {@link Procedure#performedAge() performedAge} to performedAge.
     * @param performedAge The value for performedAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performedAge(Age performedAge);

    /**
     * Initializes the optional value {@link Procedure#performedAge() performedAge} to performedAge.
     * @param performedAge The value for performedAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performedAge(Optional<? extends Age> performedAge);

    /**
     * Initializes the optional value {@link Procedure#complication() complication} to complication.
     * @param complication The value for complication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal complication(List<CodeableConcept> complication);

    /**
     * Initializes the optional value {@link Procedure#complication() complication} to complication.
     * @param complication The value for complication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal complication(Optional<? extends List<CodeableConcept>> complication);

    /**
     * Initializes the optional value {@link Procedure#complicationDetail() complicationDetail} to complicationDetail.
     * @param complicationDetail The value for complicationDetail
     * @return {@code this} builder for chained invocation
     */
    BuildFinal complicationDetail(List<Reference> complicationDetail);

    /**
     * Initializes the optional value {@link Procedure#complicationDetail() complicationDetail} to complicationDetail.
     * @param complicationDetail The value for complicationDetail
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal complicationDetail(Optional<? extends List<Reference>> complicationDetail);

    /**
     * Initializes the optional value {@link Procedure#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link Procedure#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link Procedure#usedReference() usedReference} to usedReference.
     * @param usedReference The value for usedReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usedReference(List<Reference> usedReference);

    /**
     * Initializes the optional value {@link Procedure#usedReference() usedReference} to usedReference.
     * @param usedReference The value for usedReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usedReference(Optional<? extends List<Reference>> usedReference);

    /**
     * Initializes the optional value {@link Procedure#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link Procedure#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link Procedure#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link Procedure#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link Procedure#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Procedure#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Procedure#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Procedure#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Procedure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Procedure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Procedure#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(List<Uri> instantiatesUri);

    /**
     * Initializes the optional value {@link Procedure#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(Optional<? extends List<Uri>> instantiatesUri);

    /**
     * Initializes the optional value {@link Procedure#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link Procedure#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link Procedure#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recorder(Reference recorder);

    /**
     * Initializes the optional value {@link Procedure#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recorder(Optional<? extends Reference> recorder);

    /**
     * Initializes the optional value {@link Procedure#performedRange() performedRange} to performedRange.
     * @param performedRange The value for performedRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performedRange(Range performedRange);

    /**
     * Initializes the optional value {@link Procedure#performedRange() performedRange} to performedRange.
     * @param performedRange The value for performedRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performedRange(Optional<? extends Range> performedRange);

    /**
     * Initializes the optional value {@link Procedure#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(List<CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link Procedure#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(Optional<? extends List<CodeableConcept>> bodySite);

    /**
     * Initializes the optional value {@link Procedure#performedString() performedString} to performedString.
     * @param performedString The value for performedString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performedString(String performedString);

    /**
     * Initializes the optional value {@link Procedure#performedString() performedString} to performedString.
     * @param performedString The value for performedString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performedString(Optional<String> performedString);

    /**
     * Initializes the optional value {@link Procedure#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Procedure#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Procedure#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(CodeableConcept statusReason);

    /**
     * Initializes the optional value {@link Procedure#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(Optional<? extends CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link Procedure#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Procedure#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Procedure#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link Procedure#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link Procedure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Procedure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Procedure#focalDevice() focalDevice} to focalDevice.
     * @param focalDevice The value for focalDevice
     * @return {@code this} builder for chained invocation
     */
    BuildFinal focalDevice(List<Procedure_FocalDevice> focalDevice);

    /**
     * Initializes the optional value {@link Procedure#focalDevice() focalDevice} to focalDevice.
     * @param focalDevice The value for focalDevice
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal focalDevice(Optional<? extends List<Procedure_FocalDevice>> focalDevice);

    /**
     * Builds a new {@link Procedure Procedure}.
     * @return An immutable instance of Procedure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Procedure build();
  }
}
