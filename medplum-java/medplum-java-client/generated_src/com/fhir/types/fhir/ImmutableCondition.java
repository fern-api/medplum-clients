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
 * Immutable implementation of {@link Condition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCondition.builder()}.
 */
@Generated(from = "Condition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCondition implements Condition {
  private final @Nullable Period onsetPeriod;
  private final @Nullable Age abatementAge;
  private final @Nullable List<Condition_Evidence> evidence;
  private final @Nullable DateTime recordedDate;
  private final @Nullable Reference recorder;
  private final @Nullable List<Extension> extension;
  private final @Nullable String abatementString;
  private final @Nullable Period abatementPeriod;
  private final @Nullable Reference encounter;
  private final @Nullable String onsetDateTime;
  private final @Nullable String onsetString;
  private final @Nullable Narrative text;
  private final @Nullable Range onsetRange;
  private final @Nullable Code language;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Meta meta;
  private final @Nullable Age onsetAge;
  private final @Nullable List<CodeableConcept> bodySite;
  private final @Nullable String abatementDateTime;
  private final @Nullable Uri implicitRules;
  private final @Nullable CodeableConcept clinicalStatus;
  private final @Nullable CodeableConcept verificationStatus;
  private final String resourceType;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Reference asserter;
  private final Reference subject;
  private final @Nullable Range abatementRange;
  private final @Nullable CodeableConcept severity;
  private final @Nullable Id id;
  private final @Nullable List<CodeableConcept> category;
  private final @Nullable CodeableConcept code;
  private final @Nullable List<Annotation> note;
  private final @Nullable List<Condition_Stage> stage;

  private ImmutableCondition(
      @Nullable Period onsetPeriod,
      @Nullable Age abatementAge,
      @Nullable List<Condition_Evidence> evidence,
      @Nullable DateTime recordedDate,
      @Nullable Reference recorder,
      @Nullable List<Extension> extension,
      @Nullable String abatementString,
      @Nullable Period abatementPeriod,
      @Nullable Reference encounter,
      @Nullable String onsetDateTime,
      @Nullable String onsetString,
      @Nullable Narrative text,
      @Nullable Range onsetRange,
      @Nullable Code language,
      @Nullable List<Identifier> identifier,
      @Nullable Meta meta,
      @Nullable Age onsetAge,
      @Nullable List<CodeableConcept> bodySite,
      @Nullable String abatementDateTime,
      @Nullable Uri implicitRules,
      @Nullable CodeableConcept clinicalStatus,
      @Nullable CodeableConcept verificationStatus,
      String resourceType,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<ResourceList> contained,
      @Nullable Reference asserter,
      Reference subject,
      @Nullable Range abatementRange,
      @Nullable CodeableConcept severity,
      @Nullable Id id,
      @Nullable List<CodeableConcept> category,
      @Nullable CodeableConcept code,
      @Nullable List<Annotation> note,
      @Nullable List<Condition_Stage> stage) {
    this.onsetPeriod = onsetPeriod;
    this.abatementAge = abatementAge;
    this.evidence = evidence;
    this.recordedDate = recordedDate;
    this.recorder = recorder;
    this.extension = extension;
    this.abatementString = abatementString;
    this.abatementPeriod = abatementPeriod;
    this.encounter = encounter;
    this.onsetDateTime = onsetDateTime;
    this.onsetString = onsetString;
    this.text = text;
    this.onsetRange = onsetRange;
    this.language = language;
    this.identifier = identifier;
    this.meta = meta;
    this.onsetAge = onsetAge;
    this.bodySite = bodySite;
    this.abatementDateTime = abatementDateTime;
    this.implicitRules = implicitRules;
    this.clinicalStatus = clinicalStatus;
    this.verificationStatus = verificationStatus;
    this.resourceType = resourceType;
    this.modifierExtension = modifierExtension;
    this.contained = contained;
    this.asserter = asserter;
    this.subject = subject;
    this.abatementRange = abatementRange;
    this.severity = severity;
    this.id = id;
    this.category = category;
    this.code = code;
    this.note = note;
    this.stage = stage;
  }

  /**
   * @return The value of the {@code onsetPeriod} attribute
   */
  @JsonProperty("onsetPeriod")
  @Override
  public Optional<Period> onsetPeriod() {
    return Optional.ofNullable(onsetPeriod);
  }

  /**
   * @return The value of the {@code abatementAge} attribute
   */
  @JsonProperty("abatementAge")
  @Override
  public Optional<Age> abatementAge() {
    return Optional.ofNullable(abatementAge);
  }

  /**
   * @return The value of the {@code evidence} attribute
   */
  @JsonProperty("evidence")
  @Override
  public Optional<List<Condition_Evidence>> evidence() {
    return Optional.ofNullable(evidence);
  }

  /**
   * @return The value of the {@code recordedDate} attribute
   */
  @JsonProperty("recordedDate")
  @Override
  public Optional<DateTime> recordedDate() {
    return Optional.ofNullable(recordedDate);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code abatementString} attribute
   */
  @JsonProperty("abatementString")
  @Override
  public Optional<String> abatementString() {
    return Optional.ofNullable(abatementString);
  }

  /**
   * @return The value of the {@code abatementPeriod} attribute
   */
  @JsonProperty("abatementPeriod")
  @Override
  public Optional<Period> abatementPeriod() {
    return Optional.ofNullable(abatementPeriod);
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
   * @return The value of the {@code onsetDateTime} attribute
   */
  @JsonProperty("onsetDateTime")
  @Override
  public Optional<String> onsetDateTime() {
    return Optional.ofNullable(onsetDateTime);
  }

  /**
   * @return The value of the {@code onsetString} attribute
   */
  @JsonProperty("onsetString")
  @Override
  public Optional<String> onsetString() {
    return Optional.ofNullable(onsetString);
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
   * @return The value of the {@code onsetRange} attribute
   */
  @JsonProperty("onsetRange")
  @Override
  public Optional<Range> onsetRange() {
    return Optional.ofNullable(onsetRange);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code onsetAge} attribute
   */
  @JsonProperty("onsetAge")
  @Override
  public Optional<Age> onsetAge() {
    return Optional.ofNullable(onsetAge);
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
   * @return The value of the {@code abatementDateTime} attribute
   */
  @JsonProperty("abatementDateTime")
  @Override
  public Optional<String> abatementDateTime() {
    return Optional.ofNullable(abatementDateTime);
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
   * @return The value of the {@code clinicalStatus} attribute
   */
  @JsonProperty("clinicalStatus")
  @Override
  public Optional<CodeableConcept> clinicalStatus() {
    return Optional.ofNullable(clinicalStatus);
  }

  /**
   * @return The value of the {@code verificationStatus} attribute
   */
  @JsonProperty("verificationStatus")
  @Override
  public Optional<CodeableConcept> verificationStatus() {
    return Optional.ofNullable(verificationStatus);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code asserter} attribute
   */
  @JsonProperty("asserter")
  @Override
  public Optional<Reference> asserter() {
    return Optional.ofNullable(asserter);
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
   * @return The value of the {@code abatementRange} attribute
   */
  @JsonProperty("abatementRange")
  @Override
  public Optional<Range> abatementRange() {
    return Optional.ofNullable(abatementRange);
  }

  /**
   * @return The value of the {@code severity} attribute
   */
  @JsonProperty("severity")
  @Override
  public Optional<CodeableConcept> severity() {
    return Optional.ofNullable(severity);
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<CodeableConcept>> category() {
    return Optional.ofNullable(category);
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
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code stage} attribute
   */
  @JsonProperty("stage")
  @Override
  public Optional<List<Condition_Stage>> stage() {
    return Optional.ofNullable(stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#onsetPeriod() onsetPeriod} attribute.
   * @param value The value for onsetPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withOnsetPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "onsetPeriod");
    if (this.onsetPeriod == newValue) return this;
    return new ImmutableCondition(
        newValue,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#onsetPeriod() onsetPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withOnsetPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.onsetPeriod == value) return this;
    return new ImmutableCondition(
        value,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#abatementAge() abatementAge} attribute.
   * @param value The value for abatementAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withAbatementAge(Age value) {
    @Nullable Age newValue = Objects.requireNonNull(value, "abatementAge");
    if (this.abatementAge == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        newValue,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#abatementAge() abatementAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for abatementAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withAbatementAge(Optional<? extends Age> optional) {
    @Nullable Age value = optional.orElse(null);
    if (this.abatementAge == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        value,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#evidence() evidence} attribute.
   * @param value The value for evidence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withEvidence(List<Condition_Evidence> value) {
    @Nullable List<Condition_Evidence> newValue = Objects.requireNonNull(value, "evidence");
    if (this.evidence == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        newValue,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#evidence() evidence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for evidence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withEvidence(Optional<? extends List<Condition_Evidence>> optional) {
    @Nullable List<Condition_Evidence> value = optional.orElse(null);
    if (this.evidence == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        value,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#recordedDate() recordedDate} attribute.
   * @param value The value for recordedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withRecordedDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "recordedDate");
    if (this.recordedDate == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        newValue,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#recordedDate() recordedDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recordedDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withRecordedDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.recordedDate == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        value,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#recorder() recorder} attribute.
   * @param value The value for recorder
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withRecorder(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "recorder");
    if (this.recorder == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        newValue,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#recorder() recorder} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recorder
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withRecorder(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.recorder == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        value,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        newValue,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        value,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#abatementString() abatementString} attribute.
   * @param value The value for abatementString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withAbatementString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "abatementString");
    if (Objects.equals(this.abatementString, newValue)) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        newValue,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#abatementString() abatementString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for abatementString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withAbatementString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.abatementString, value)) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        value,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#abatementPeriod() abatementPeriod} attribute.
   * @param value The value for abatementPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withAbatementPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "abatementPeriod");
    if (this.abatementPeriod == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        newValue,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#abatementPeriod() abatementPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for abatementPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withAbatementPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.abatementPeriod == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        value,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        newValue,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        value,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#onsetDateTime() onsetDateTime} attribute.
   * @param value The value for onsetDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withOnsetDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "onsetDateTime");
    if (Objects.equals(this.onsetDateTime, newValue)) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        newValue,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#onsetDateTime() onsetDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withOnsetDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.onsetDateTime, value)) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        value,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#onsetString() onsetString} attribute.
   * @param value The value for onsetString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withOnsetString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "onsetString");
    if (Objects.equals(this.onsetString, newValue)) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        newValue,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#onsetString() onsetString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withOnsetString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.onsetString, value)) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        value,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        newValue,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        value,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#onsetRange() onsetRange} attribute.
   * @param value The value for onsetRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withOnsetRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "onsetRange");
    if (this.onsetRange == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        newValue,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#onsetRange() onsetRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withOnsetRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.onsetRange == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        value,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        newValue,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        value,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        newValue,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        value,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        newValue,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        value,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#onsetAge() onsetAge} attribute.
   * @param value The value for onsetAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withOnsetAge(Age value) {
    @Nullable Age newValue = Objects.requireNonNull(value, "onsetAge");
    if (this.onsetAge == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        newValue,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#onsetAge() onsetAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withOnsetAge(Optional<? extends Age> optional) {
    @Nullable Age value = optional.orElse(null);
    if (this.onsetAge == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        value,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withBodySite(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        newValue,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withBodySite(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        value,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#abatementDateTime() abatementDateTime} attribute.
   * @param value The value for abatementDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withAbatementDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "abatementDateTime");
    if (Objects.equals(this.abatementDateTime, newValue)) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        newValue,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#abatementDateTime() abatementDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for abatementDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withAbatementDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.abatementDateTime, value)) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        value,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        newValue,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        value,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#clinicalStatus() clinicalStatus} attribute.
   * @param value The value for clinicalStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withClinicalStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "clinicalStatus");
    if (this.clinicalStatus == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        newValue,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#clinicalStatus() clinicalStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for clinicalStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withClinicalStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.clinicalStatus == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        value,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#verificationStatus() verificationStatus} attribute.
   * @param value The value for verificationStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withVerificationStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "verificationStatus");
    if (this.verificationStatus == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        newValue,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#verificationStatus() verificationStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for verificationStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withVerificationStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.verificationStatus == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        value,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Condition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCondition withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        newValue,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        newValue,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        value,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        newValue,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        value,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#asserter() asserter} attribute.
   * @param value The value for asserter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withAsserter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "asserter");
    if (this.asserter == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        newValue,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#asserter() asserter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for asserter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withAsserter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.asserter == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        value,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Condition#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCondition withSubject(Reference value) {
    if (this.subject == value) return this;
    Reference newValue = Objects.requireNonNull(value, "subject");
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        newValue,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#abatementRange() abatementRange} attribute.
   * @param value The value for abatementRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withAbatementRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "abatementRange");
    if (this.abatementRange == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        newValue,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#abatementRange() abatementRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for abatementRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withAbatementRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.abatementRange == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        value,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#severity() severity} attribute.
   * @param value The value for severity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withSeverity(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "severity");
    if (this.severity == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        newValue,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#severity() severity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for severity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withSeverity(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.severity == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        value,
        this.id,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        newValue,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        value,
        this.category,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        newValue,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        value,
        this.code,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        newValue,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        value,
        this.note,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        newValue,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        value,
        this.stage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#stage() stage} attribute.
   * @param value The value for stage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withStage(List<Condition_Stage> value) {
    @Nullable List<Condition_Stage> newValue = Objects.requireNonNull(value, "stage");
    if (this.stage == newValue) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#stage() stage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for stage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withStage(Optional<? extends List<Condition_Stage>> optional) {
    @Nullable List<Condition_Stage> value = optional.orElse(null);
    if (this.stage == value) return this;
    return new ImmutableCondition(
        this.onsetPeriod,
        this.abatementAge,
        this.evidence,
        this.recordedDate,
        this.recorder,
        this.extension,
        this.abatementString,
        this.abatementPeriod,
        this.encounter,
        this.onsetDateTime,
        this.onsetString,
        this.text,
        this.onsetRange,
        this.language,
        this.identifier,
        this.meta,
        this.onsetAge,
        this.bodySite,
        this.abatementDateTime,
        this.implicitRules,
        this.clinicalStatus,
        this.verificationStatus,
        this.resourceType,
        this.modifierExtension,
        this.contained,
        this.asserter,
        this.subject,
        this.abatementRange,
        this.severity,
        this.id,
        this.category,
        this.code,
        this.note,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCondition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCondition
        && equalTo((ImmutableCondition) another);
  }

  private boolean equalTo(ImmutableCondition another) {
    return Objects.equals(onsetPeriod, another.onsetPeriod)
        && Objects.equals(abatementAge, another.abatementAge)
        && Objects.equals(evidence, another.evidence)
        && Objects.equals(recordedDate, another.recordedDate)
        && Objects.equals(recorder, another.recorder)
        && Objects.equals(extension, another.extension)
        && Objects.equals(abatementString, another.abatementString)
        && Objects.equals(abatementPeriod, another.abatementPeriod)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(onsetDateTime, another.onsetDateTime)
        && Objects.equals(onsetString, another.onsetString)
        && Objects.equals(text, another.text)
        && Objects.equals(onsetRange, another.onsetRange)
        && Objects.equals(language, another.language)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(meta, another.meta)
        && Objects.equals(onsetAge, another.onsetAge)
        && Objects.equals(bodySite, another.bodySite)
        && Objects.equals(abatementDateTime, another.abatementDateTime)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(clinicalStatus, another.clinicalStatus)
        && Objects.equals(verificationStatus, another.verificationStatus)
        && resourceType.equals(another.resourceType)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(contained, another.contained)
        && Objects.equals(asserter, another.asserter)
        && subject.equals(another.subject)
        && Objects.equals(abatementRange, another.abatementRange)
        && Objects.equals(severity, another.severity)
        && Objects.equals(id, another.id)
        && Objects.equals(category, another.category)
        && Objects.equals(code, another.code)
        && Objects.equals(note, another.note)
        && Objects.equals(stage, another.stage);
  }

  /**
   * Computes a hash code from attributes: {@code onsetPeriod}, {@code abatementAge}, {@code evidence}, {@code recordedDate}, {@code recorder}, {@code extension}, {@code abatementString}, {@code abatementPeriod}, {@code encounter}, {@code onsetDateTime}, {@code onsetString}, {@code text}, {@code onsetRange}, {@code language}, {@code identifier}, {@code meta}, {@code onsetAge}, {@code bodySite}, {@code abatementDateTime}, {@code implicitRules}, {@code clinicalStatus}, {@code verificationStatus}, {@code resourceType}, {@code modifierExtension}, {@code contained}, {@code asserter}, {@code subject}, {@code abatementRange}, {@code severity}, {@code id}, {@code category}, {@code code}, {@code note}, {@code stage}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(onsetPeriod);
    h += (h << 5) + Objects.hashCode(abatementAge);
    h += (h << 5) + Objects.hashCode(evidence);
    h += (h << 5) + Objects.hashCode(recordedDate);
    h += (h << 5) + Objects.hashCode(recorder);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(abatementString);
    h += (h << 5) + Objects.hashCode(abatementPeriod);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(onsetDateTime);
    h += (h << 5) + Objects.hashCode(onsetString);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(onsetRange);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(onsetAge);
    h += (h << 5) + Objects.hashCode(bodySite);
    h += (h << 5) + Objects.hashCode(abatementDateTime);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(clinicalStatus);
    h += (h << 5) + Objects.hashCode(verificationStatus);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(asserter);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + Objects.hashCode(abatementRange);
    h += (h << 5) + Objects.hashCode(severity);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(stage);
    return h;
  }

  /**
   * Prints the immutable value {@code Condition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Condition{");
    if (onsetPeriod != null) {
      builder.append("onsetPeriod=").append(onsetPeriod);
    }
    if (abatementAge != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("abatementAge=").append(abatementAge);
    }
    if (evidence != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("evidence=").append(evidence);
    }
    if (recordedDate != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("recordedDate=").append(recordedDate);
    }
    if (recorder != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("recorder=").append(recorder);
    }
    if (extension != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (abatementString != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("abatementString=").append(abatementString);
    }
    if (abatementPeriod != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("abatementPeriod=").append(abatementPeriod);
    }
    if (encounter != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (onsetDateTime != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("onsetDateTime=").append(onsetDateTime);
    }
    if (onsetString != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("onsetString=").append(onsetString);
    }
    if (text != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (onsetRange != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("onsetRange=").append(onsetRange);
    }
    if (language != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (identifier != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (meta != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (onsetAge != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("onsetAge=").append(onsetAge);
    }
    if (bodySite != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (abatementDateTime != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("abatementDateTime=").append(abatementDateTime);
    }
    if (implicitRules != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (clinicalStatus != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("clinicalStatus=").append(clinicalStatus);
    }
    if (verificationStatus != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("verificationStatus=").append(verificationStatus);
    }
    if (builder.length() > 10) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (asserter != null) {
      builder.append(", ");
      builder.append("asserter=").append(asserter);
    }
    builder.append(", ");
    builder.append("subject=").append(subject);
    if (abatementRange != null) {
      builder.append(", ");
      builder.append("abatementRange=").append(abatementRange);
    }
    if (severity != null) {
      builder.append(", ");
      builder.append("severity=").append(severity);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (stage != null) {
      builder.append(", ");
      builder.append("stage=").append(stage);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Condition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Condition {
    @Nullable Optional<Period> onsetPeriod = Optional.empty();
    boolean onsetPeriodIsSet;
    @Nullable Optional<Age> abatementAge = Optional.empty();
    boolean abatementAgeIsSet;
    @Nullable Optional<List<Condition_Evidence>> evidence = Optional.empty();
    boolean evidenceIsSet;
    @Nullable Optional<DateTime> recordedDate = Optional.empty();
    boolean recordedDateIsSet;
    @Nullable Optional<Reference> recorder = Optional.empty();
    boolean recorderIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> abatementString = Optional.empty();
    boolean abatementStringIsSet;
    @Nullable Optional<Period> abatementPeriod = Optional.empty();
    boolean abatementPeriodIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<String> onsetDateTime = Optional.empty();
    boolean onsetDateTimeIsSet;
    @Nullable Optional<String> onsetString = Optional.empty();
    boolean onsetStringIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Range> onsetRange = Optional.empty();
    boolean onsetRangeIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Age> onsetAge = Optional.empty();
    boolean onsetAgeIsSet;
    @Nullable Optional<List<CodeableConcept>> bodySite = Optional.empty();
    boolean bodySiteIsSet;
    @Nullable Optional<String> abatementDateTime = Optional.empty();
    boolean abatementDateTimeIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<CodeableConcept> clinicalStatus = Optional.empty();
    boolean clinicalStatusIsSet;
    @Nullable Optional<CodeableConcept> verificationStatus = Optional.empty();
    boolean verificationStatusIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Reference> asserter = Optional.empty();
    boolean asserterIsSet;
    @Nullable Reference subject;
    @Nullable Optional<Range> abatementRange = Optional.empty();
    boolean abatementRangeIsSet;
    @Nullable Optional<CodeableConcept> severity = Optional.empty();
    boolean severityIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<List<Condition_Stage>> stage = Optional.empty();
    boolean stageIsSet;
    @JsonProperty("onsetPeriod")
    public void setOnsetPeriod(Optional<Period> onsetPeriod) {
      this.onsetPeriod = onsetPeriod;
      this.onsetPeriodIsSet = true;
    }
    @JsonProperty("abatementAge")
    public void setAbatementAge(Optional<Age> abatementAge) {
      this.abatementAge = abatementAge;
      this.abatementAgeIsSet = true;
    }
    @JsonProperty("evidence")
    public void setEvidence(Optional<List<Condition_Evidence>> evidence) {
      this.evidence = evidence;
      this.evidenceIsSet = true;
    }
    @JsonProperty("recordedDate")
    public void setRecordedDate(Optional<DateTime> recordedDate) {
      this.recordedDate = recordedDate;
      this.recordedDateIsSet = true;
    }
    @JsonProperty("recorder")
    public void setRecorder(Optional<Reference> recorder) {
      this.recorder = recorder;
      this.recorderIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("abatementString")
    public void setAbatementString(Optional<String> abatementString) {
      this.abatementString = abatementString;
      this.abatementStringIsSet = true;
    }
    @JsonProperty("abatementPeriod")
    public void setAbatementPeriod(Optional<Period> abatementPeriod) {
      this.abatementPeriod = abatementPeriod;
      this.abatementPeriodIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("onsetDateTime")
    public void setOnsetDateTime(Optional<String> onsetDateTime) {
      this.onsetDateTime = onsetDateTime;
      this.onsetDateTimeIsSet = true;
    }
    @JsonProperty("onsetString")
    public void setOnsetString(Optional<String> onsetString) {
      this.onsetString = onsetString;
      this.onsetStringIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("onsetRange")
    public void setOnsetRange(Optional<Range> onsetRange) {
      this.onsetRange = onsetRange;
      this.onsetRangeIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("onsetAge")
    public void setOnsetAge(Optional<Age> onsetAge) {
      this.onsetAge = onsetAge;
      this.onsetAgeIsSet = true;
    }
    @JsonProperty("bodySite")
    public void setBodySite(Optional<List<CodeableConcept>> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @JsonProperty("abatementDateTime")
    public void setAbatementDateTime(Optional<String> abatementDateTime) {
      this.abatementDateTime = abatementDateTime;
      this.abatementDateTimeIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("clinicalStatus")
    public void setClinicalStatus(Optional<CodeableConcept> clinicalStatus) {
      this.clinicalStatus = clinicalStatus;
      this.clinicalStatusIsSet = true;
    }
    @JsonProperty("verificationStatus")
    public void setVerificationStatus(Optional<CodeableConcept> verificationStatus) {
      this.verificationStatus = verificationStatus;
      this.verificationStatusIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("asserter")
    public void setAsserter(Optional<Reference> asserter) {
      this.asserter = asserter;
      this.asserterIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
      this.subject = subject;
    }
    @JsonProperty("abatementRange")
    public void setAbatementRange(Optional<Range> abatementRange) {
      this.abatementRange = abatementRange;
      this.abatementRangeIsSet = true;
    }
    @JsonProperty("severity")
    public void setSeverity(Optional<CodeableConcept> severity) {
      this.severity = severity;
      this.severityIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("stage")
    public void setStage(Optional<List<Condition_Stage>> stage) {
      this.stage = stage;
      this.stageIsSet = true;
    }
    @Override
    public Optional<Period> onsetPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Age> abatementAge() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Condition_Evidence>> evidence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> recordedDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> recorder() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> abatementString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> abatementPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> onsetDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> onsetString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> onsetRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Age> onsetAge() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> abatementDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> clinicalStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> verificationStatus() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> asserter() { throw new UnsupportedOperationException(); }
    @Override
    public Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> abatementRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> severity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Condition_Stage>> stage() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCondition fromJson(Json json) {
    ImmutableCondition.Builder builder = ((ImmutableCondition.Builder) ImmutableCondition.builder());
    if (json.onsetPeriodIsSet) {
      builder.onsetPeriod(json.onsetPeriod);
    }
    if (json.abatementAgeIsSet) {
      builder.abatementAge(json.abatementAge);
    }
    if (json.evidenceIsSet) {
      builder.evidence(json.evidence);
    }
    if (json.recordedDateIsSet) {
      builder.recordedDate(json.recordedDate);
    }
    if (json.recorderIsSet) {
      builder.recorder(json.recorder);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.abatementStringIsSet) {
      builder.abatementString(json.abatementString);
    }
    if (json.abatementPeriodIsSet) {
      builder.abatementPeriod(json.abatementPeriod);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.onsetDateTimeIsSet) {
      builder.onsetDateTime(json.onsetDateTime);
    }
    if (json.onsetStringIsSet) {
      builder.onsetString(json.onsetString);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.onsetRangeIsSet) {
      builder.onsetRange(json.onsetRange);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.onsetAgeIsSet) {
      builder.onsetAge(json.onsetAge);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.abatementDateTimeIsSet) {
      builder.abatementDateTime(json.abatementDateTime);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.clinicalStatusIsSet) {
      builder.clinicalStatus(json.clinicalStatus);
    }
    if (json.verificationStatusIsSet) {
      builder.verificationStatus(json.verificationStatus);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.asserterIsSet) {
      builder.asserter(json.asserter);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.abatementRangeIsSet) {
      builder.abatementRange(json.abatementRange);
    }
    if (json.severityIsSet) {
      builder.severity(json.severity);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.stageIsSet) {
      builder.stage(json.stage);
    }
    return (ImmutableCondition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Condition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Condition instance
   */
  public static Condition copyOf(Condition instance) {
    if (instance instanceof ImmutableCondition) {
      return (ImmutableCondition) instance;
    }
    return ((ImmutableCondition.Builder) ImmutableCondition.builder())
        .onsetPeriod(instance.onsetPeriod())
        .abatementAge(instance.abatementAge())
        .evidence(instance.evidence())
        .recordedDate(instance.recordedDate())
        .recorder(instance.recorder())
        .extension(instance.extension())
        .abatementString(instance.abatementString())
        .abatementPeriod(instance.abatementPeriod())
        .encounter(instance.encounter())
        .onsetDateTime(instance.onsetDateTime())
        .onsetString(instance.onsetString())
        .text(instance.text())
        .onsetRange(instance.onsetRange())
        .language(instance.language())
        .identifier(instance.identifier())
        .meta(instance.meta())
        .onsetAge(instance.onsetAge())
        .bodySite(instance.bodySite())
        .abatementDateTime(instance.abatementDateTime())
        .implicitRules(instance.implicitRules())
        .clinicalStatus(instance.clinicalStatus())
        .verificationStatus(instance.verificationStatus())
        .resourceType(instance.resourceType())
        .modifierExtension(instance.modifierExtension())
        .contained(instance.contained())
        .asserter(instance.asserter())
        .subject(instance.subject())
        .abatementRange(instance.abatementRange())
        .severity(instance.severity())
        .id(instance.id())
        .category(instance.category())
        .code(instance.code())
        .note(instance.note())
        .stage(instance.stage())
        .build();
  }

  /**
   * Creates a builder for {@link Condition Condition}.
   * <pre>
   * ImmutableCondition.builder()
   *    .onsetPeriod(com.fhir.types.fhir.Period) // optional {@link Condition#onsetPeriod() onsetPeriod}
   *    .abatementAge(com.fhir.types.fhir.Age) // optional {@link Condition#abatementAge() abatementAge}
   *    .evidence(List&amp;lt;com.fhir.types.fhir.Condition_Evidence&amp;gt;) // optional {@link Condition#evidence() evidence}
   *    .recordedDate(com.fhir.types.fhir.DateTime) // optional {@link Condition#recordedDate() recordedDate}
   *    .recorder(com.fhir.types.fhir.Reference) // optional {@link Condition#recorder() recorder}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Condition#extension() extension}
   *    .abatementString(String) // optional {@link Condition#abatementString() abatementString}
   *    .abatementPeriod(com.fhir.types.fhir.Period) // optional {@link Condition#abatementPeriod() abatementPeriod}
   *    .encounter(com.fhir.types.fhir.Reference) // optional {@link Condition#encounter() encounter}
   *    .onsetDateTime(String) // optional {@link Condition#onsetDateTime() onsetDateTime}
   *    .onsetString(String) // optional {@link Condition#onsetString() onsetString}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Condition#text() text}
   *    .onsetRange(com.fhir.types.fhir.Range) // optional {@link Condition#onsetRange() onsetRange}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Condition#language() language}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Condition#identifier() identifier}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Condition#meta() meta}
   *    .onsetAge(com.fhir.types.fhir.Age) // optional {@link Condition#onsetAge() onsetAge}
   *    .bodySite(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Condition#bodySite() bodySite}
   *    .abatementDateTime(String) // optional {@link Condition#abatementDateTime() abatementDateTime}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Condition#implicitRules() implicitRules}
   *    .clinicalStatus(com.fhir.types.fhir.CodeableConcept) // optional {@link Condition#clinicalStatus() clinicalStatus}
   *    .verificationStatus(com.fhir.types.fhir.CodeableConcept) // optional {@link Condition#verificationStatus() verificationStatus}
   *    .resourceType(String) // required {@link Condition#resourceType() resourceType}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Condition#modifierExtension() modifierExtension}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Condition#contained() contained}
   *    .asserter(com.fhir.types.fhir.Reference) // optional {@link Condition#asserter() asserter}
   *    .subject(com.fhir.types.fhir.Reference) // required {@link Condition#subject() subject}
   *    .abatementRange(com.fhir.types.fhir.Range) // optional {@link Condition#abatementRange() abatementRange}
   *    .severity(com.fhir.types.fhir.CodeableConcept) // optional {@link Condition#severity() severity}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Condition#id() id}
   *    .category(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Condition#category() category}
   *    .code(com.fhir.types.fhir.CodeableConcept) // optional {@link Condition#code() code}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link Condition#note() note}
   *    .stage(List&amp;lt;com.fhir.types.fhir.Condition_Stage&amp;gt;) // optional {@link Condition#stage() stage}
   *    .build();
   * </pre>
   * @return A new Condition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableCondition.Builder();
  }

  /**
   * Builds instances of type {@link Condition Condition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Condition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, SubjectBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_SUBJECT = 0x2L;
    private static final long OPT_BIT_ONSET_PERIOD = 0x1L;
    private static final long OPT_BIT_ABATEMENT_AGE = 0x2L;
    private static final long OPT_BIT_EVIDENCE = 0x4L;
    private static final long OPT_BIT_RECORDED_DATE = 0x8L;
    private static final long OPT_BIT_RECORDER = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_ABATEMENT_STRING = 0x40L;
    private static final long OPT_BIT_ABATEMENT_PERIOD = 0x80L;
    private static final long OPT_BIT_ENCOUNTER = 0x100L;
    private static final long OPT_BIT_ONSET_DATE_TIME = 0x200L;
    private static final long OPT_BIT_ONSET_STRING = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_ONSET_RANGE = 0x1000L;
    private static final long OPT_BIT_LANGUAGE = 0x2000L;
    private static final long OPT_BIT_IDENTIFIER = 0x4000L;
    private static final long OPT_BIT_META = 0x8000L;
    private static final long OPT_BIT_ONSET_AGE = 0x10000L;
    private static final long OPT_BIT_BODY_SITE = 0x20000L;
    private static final long OPT_BIT_ABATEMENT_DATE_TIME = 0x40000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80000L;
    private static final long OPT_BIT_CLINICAL_STATUS = 0x100000L;
    private static final long OPT_BIT_VERIFICATION_STATUS = 0x200000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400000L;
    private static final long OPT_BIT_CONTAINED = 0x800000L;
    private static final long OPT_BIT_ASSERTER = 0x1000000L;
    private static final long OPT_BIT_ABATEMENT_RANGE = 0x2000000L;
    private static final long OPT_BIT_SEVERITY = 0x4000000L;
    private static final long OPT_BIT_ID = 0x8000000L;
    private static final long OPT_BIT_CATEGORY = 0x10000000L;
    private static final long OPT_BIT_CODE = 0x20000000L;
    private static final long OPT_BIT_NOTE = 0x40000000L;
    private static final long OPT_BIT_STAGE = 0x80000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable Period onsetPeriod;
    private @Nullable Age abatementAge;
    private @Nullable List<Condition_Evidence> evidence;
    private @Nullable DateTime recordedDate;
    private @Nullable Reference recorder;
    private @Nullable List<Extension> extension;
    private @Nullable String abatementString;
    private @Nullable Period abatementPeriod;
    private @Nullable Reference encounter;
    private @Nullable String onsetDateTime;
    private @Nullable String onsetString;
    private @Nullable Narrative text;
    private @Nullable Range onsetRange;
    private @Nullable Code language;
    private @Nullable List<Identifier> identifier;
    private @Nullable Meta meta;
    private @Nullable Age onsetAge;
    private @Nullable List<CodeableConcept> bodySite;
    private @Nullable String abatementDateTime;
    private @Nullable Uri implicitRules;
    private @Nullable CodeableConcept clinicalStatus;
    private @Nullable CodeableConcept verificationStatus;
    private @Nullable String resourceType;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<ResourceList> contained;
    private @Nullable Reference asserter;
    private @Nullable Reference subject;
    private @Nullable Range abatementRange;
    private @Nullable CodeableConcept severity;
    private @Nullable Id id;
    private @Nullable List<CodeableConcept> category;
    private @Nullable CodeableConcept code;
    private @Nullable List<Annotation> note;
    private @Nullable List<Condition_Stage> stage;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Condition#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetPeriod(Period onsetPeriod) {
      checkNotIsSet(onsetPeriodIsSet(), "onsetPeriod");
      this.onsetPeriod = Objects.requireNonNull(onsetPeriod, "onsetPeriod");
      optBits |= OPT_BIT_ONSET_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onsetPeriod")
    public final Builder onsetPeriod(Optional<? extends Period> onsetPeriod) {
      checkNotIsSet(onsetPeriodIsSet(), "onsetPeriod");
      this.onsetPeriod = onsetPeriod.orElse(null);
      optBits |= OPT_BIT_ONSET_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#abatementAge() abatementAge} to abatementAge.
     * @param abatementAge The value for abatementAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder abatementAge(Age abatementAge) {
      checkNotIsSet(abatementAgeIsSet(), "abatementAge");
      this.abatementAge = Objects.requireNonNull(abatementAge, "abatementAge");
      optBits |= OPT_BIT_ABATEMENT_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#abatementAge() abatementAge} to abatementAge.
     * @param abatementAge The value for abatementAge
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("abatementAge")
    public final Builder abatementAge(Optional<? extends Age> abatementAge) {
      checkNotIsSet(abatementAgeIsSet(), "abatementAge");
      this.abatementAge = abatementAge.orElse(null);
      optBits |= OPT_BIT_ABATEMENT_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#evidence() evidence} to evidence.
     * @param evidence The value for evidence
     * @return {@code this} builder for chained invocation
     */
    public final Builder evidence(List<Condition_Evidence> evidence) {
      checkNotIsSet(evidenceIsSet(), "evidence");
      this.evidence = Objects.requireNonNull(evidence, "evidence");
      optBits |= OPT_BIT_EVIDENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#evidence() evidence} to evidence.
     * @param evidence The value for evidence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("evidence")
    public final Builder evidence(Optional<? extends List<Condition_Evidence>> evidence) {
      checkNotIsSet(evidenceIsSet(), "evidence");
      this.evidence = evidence.orElse(null);
      optBits |= OPT_BIT_EVIDENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder recordedDate(DateTime recordedDate) {
      checkNotIsSet(recordedDateIsSet(), "recordedDate");
      this.recordedDate = Objects.requireNonNull(recordedDate, "recordedDate");
      optBits |= OPT_BIT_RECORDED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("recordedDate")
    public final Builder recordedDate(Optional<? extends DateTime> recordedDate) {
      checkNotIsSet(recordedDateIsSet(), "recordedDate");
      this.recordedDate = recordedDate.orElse(null);
      optBits |= OPT_BIT_RECORDED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#recorder() recorder} to recorder.
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
     * Initializes the optional value {@link Condition#recorder() recorder} to recorder.
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
     * Initializes the optional value {@link Condition#extension() extension} to extension.
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
     * Initializes the optional value {@link Condition#extension() extension} to extension.
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
     * Initializes the optional value {@link Condition#abatementString() abatementString} to abatementString.
     * @param abatementString The value for abatementString
     * @return {@code this} builder for chained invocation
     */
    public final Builder abatementString(String abatementString) {
      checkNotIsSet(abatementStringIsSet(), "abatementString");
      this.abatementString = Objects.requireNonNull(abatementString, "abatementString");
      optBits |= OPT_BIT_ABATEMENT_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#abatementString() abatementString} to abatementString.
     * @param abatementString The value for abatementString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("abatementString")
    public final Builder abatementString(Optional<String> abatementString) {
      checkNotIsSet(abatementStringIsSet(), "abatementString");
      this.abatementString = abatementString.orElse(null);
      optBits |= OPT_BIT_ABATEMENT_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#abatementPeriod() abatementPeriod} to abatementPeriod.
     * @param abatementPeriod The value for abatementPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder abatementPeriod(Period abatementPeriod) {
      checkNotIsSet(abatementPeriodIsSet(), "abatementPeriod");
      this.abatementPeriod = Objects.requireNonNull(abatementPeriod, "abatementPeriod");
      optBits |= OPT_BIT_ABATEMENT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#abatementPeriod() abatementPeriod} to abatementPeriod.
     * @param abatementPeriod The value for abatementPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("abatementPeriod")
    public final Builder abatementPeriod(Optional<? extends Period> abatementPeriod) {
      checkNotIsSet(abatementPeriodIsSet(), "abatementPeriod");
      this.abatementPeriod = abatementPeriod.orElse(null);
      optBits |= OPT_BIT_ABATEMENT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Condition#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Condition#onsetDateTime() onsetDateTime} to onsetDateTime.
     * @param onsetDateTime The value for onsetDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetDateTime(String onsetDateTime) {
      checkNotIsSet(onsetDateTimeIsSet(), "onsetDateTime");
      this.onsetDateTime = Objects.requireNonNull(onsetDateTime, "onsetDateTime");
      optBits |= OPT_BIT_ONSET_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#onsetDateTime() onsetDateTime} to onsetDateTime.
     * @param onsetDateTime The value for onsetDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onsetDateTime")
    public final Builder onsetDateTime(Optional<String> onsetDateTime) {
      checkNotIsSet(onsetDateTimeIsSet(), "onsetDateTime");
      this.onsetDateTime = onsetDateTime.orElse(null);
      optBits |= OPT_BIT_ONSET_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetString(String onsetString) {
      checkNotIsSet(onsetStringIsSet(), "onsetString");
      this.onsetString = Objects.requireNonNull(onsetString, "onsetString");
      optBits |= OPT_BIT_ONSET_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onsetString")
    public final Builder onsetString(Optional<String> onsetString) {
      checkNotIsSet(onsetStringIsSet(), "onsetString");
      this.onsetString = onsetString.orElse(null);
      optBits |= OPT_BIT_ONSET_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#text() text} to text.
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
     * Initializes the optional value {@link Condition#text() text} to text.
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
     * Initializes the optional value {@link Condition#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetRange(Range onsetRange) {
      checkNotIsSet(onsetRangeIsSet(), "onsetRange");
      this.onsetRange = Objects.requireNonNull(onsetRange, "onsetRange");
      optBits |= OPT_BIT_ONSET_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onsetRange")
    public final Builder onsetRange(Optional<? extends Range> onsetRange) {
      checkNotIsSet(onsetRangeIsSet(), "onsetRange");
      this.onsetRange = onsetRange.orElse(null);
      optBits |= OPT_BIT_ONSET_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#language() language} to language.
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
     * Initializes the optional value {@link Condition#language() language} to language.
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
     * Initializes the optional value {@link Condition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Condition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Condition#meta() meta} to meta.
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
     * Initializes the optional value {@link Condition#meta() meta} to meta.
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
     * Initializes the optional value {@link Condition#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetAge(Age onsetAge) {
      checkNotIsSet(onsetAgeIsSet(), "onsetAge");
      this.onsetAge = Objects.requireNonNull(onsetAge, "onsetAge");
      optBits |= OPT_BIT_ONSET_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onsetAge")
    public final Builder onsetAge(Optional<? extends Age> onsetAge) {
      checkNotIsSet(onsetAgeIsSet(), "onsetAge");
      this.onsetAge = onsetAge.orElse(null);
      optBits |= OPT_BIT_ONSET_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#bodySite() bodySite} to bodySite.
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
     * Initializes the optional value {@link Condition#bodySite() bodySite} to bodySite.
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
     * Initializes the optional value {@link Condition#abatementDateTime() abatementDateTime} to abatementDateTime.
     * @param abatementDateTime The value for abatementDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder abatementDateTime(String abatementDateTime) {
      checkNotIsSet(abatementDateTimeIsSet(), "abatementDateTime");
      this.abatementDateTime = Objects.requireNonNull(abatementDateTime, "abatementDateTime");
      optBits |= OPT_BIT_ABATEMENT_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#abatementDateTime() abatementDateTime} to abatementDateTime.
     * @param abatementDateTime The value for abatementDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("abatementDateTime")
    public final Builder abatementDateTime(Optional<String> abatementDateTime) {
      checkNotIsSet(abatementDateTimeIsSet(), "abatementDateTime");
      this.abatementDateTime = abatementDateTime.orElse(null);
      optBits |= OPT_BIT_ABATEMENT_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Condition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Condition#clinicalStatus() clinicalStatus} to clinicalStatus.
     * @param clinicalStatus The value for clinicalStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder clinicalStatus(CodeableConcept clinicalStatus) {
      checkNotIsSet(clinicalStatusIsSet(), "clinicalStatus");
      this.clinicalStatus = Objects.requireNonNull(clinicalStatus, "clinicalStatus");
      optBits |= OPT_BIT_CLINICAL_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#clinicalStatus() clinicalStatus} to clinicalStatus.
     * @param clinicalStatus The value for clinicalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("clinicalStatus")
    public final Builder clinicalStatus(Optional<? extends CodeableConcept> clinicalStatus) {
      checkNotIsSet(clinicalStatusIsSet(), "clinicalStatus");
      this.clinicalStatus = clinicalStatus.orElse(null);
      optBits |= OPT_BIT_CLINICAL_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#verificationStatus() verificationStatus} to verificationStatus.
     * @param verificationStatus The value for verificationStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder verificationStatus(CodeableConcept verificationStatus) {
      checkNotIsSet(verificationStatusIsSet(), "verificationStatus");
      this.verificationStatus = Objects.requireNonNull(verificationStatus, "verificationStatus");
      optBits |= OPT_BIT_VERIFICATION_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#verificationStatus() verificationStatus} to verificationStatus.
     * @param verificationStatus The value for verificationStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("verificationStatus")
    public final Builder verificationStatus(Optional<? extends CodeableConcept> verificationStatus) {
      checkNotIsSet(verificationStatusIsSet(), "verificationStatus");
      this.verificationStatus = verificationStatus.orElse(null);
      optBits |= OPT_BIT_VERIFICATION_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link Condition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Condition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Condition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Condition#contained() contained} to contained.
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
     * Initializes the optional value {@link Condition#contained() contained} to contained.
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
     * Initializes the optional value {@link Condition#asserter() asserter} to asserter.
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
     * Initializes the optional value {@link Condition#asserter() asserter} to asserter.
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
     * Initializes the value for the {@link Condition#subject() subject} attribute.
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
     * Initializes the optional value {@link Condition#abatementRange() abatementRange} to abatementRange.
     * @param abatementRange The value for abatementRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder abatementRange(Range abatementRange) {
      checkNotIsSet(abatementRangeIsSet(), "abatementRange");
      this.abatementRange = Objects.requireNonNull(abatementRange, "abatementRange");
      optBits |= OPT_BIT_ABATEMENT_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#abatementRange() abatementRange} to abatementRange.
     * @param abatementRange The value for abatementRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("abatementRange")
    public final Builder abatementRange(Optional<? extends Range> abatementRange) {
      checkNotIsSet(abatementRangeIsSet(), "abatementRange");
      this.abatementRange = abatementRange.orElse(null);
      optBits |= OPT_BIT_ABATEMENT_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for chained invocation
     */
    public final Builder severity(CodeableConcept severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = Objects.requireNonNull(severity, "severity");
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("severity")
    public final Builder severity(Optional<? extends CodeableConcept> severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = severity.orElse(null);
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#id() id} to id.
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
     * Initializes the optional value {@link Condition#id() id} to id.
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
     * Initializes the optional value {@link Condition#category() category} to category.
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
     * Initializes the optional value {@link Condition#category() category} to category.
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
     * Initializes the optional value {@link Condition#code() code} to code.
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
     * Initializes the optional value {@link Condition#code() code} to code.
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
     * Initializes the optional value {@link Condition#note() note} to note.
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
     * Initializes the optional value {@link Condition#note() note} to note.
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
     * Initializes the optional value {@link Condition#stage() stage} to stage.
     * @param stage The value for stage
     * @return {@code this} builder for chained invocation
     */
    public final Builder stage(List<Condition_Stage> stage) {
      checkNotIsSet(stageIsSet(), "stage");
      this.stage = Objects.requireNonNull(stage, "stage");
      optBits |= OPT_BIT_STAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#stage() stage} to stage.
     * @param stage The value for stage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("stage")
    public final Builder stage(Optional<? extends List<Condition_Stage>> stage) {
      checkNotIsSet(stageIsSet(), "stage");
      this.stage = stage.orElse(null);
      optBits |= OPT_BIT_STAGE;
      return this;
    }

    /**
     * Builds a new {@link Condition Condition}.
     * @return An immutable instance of Condition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Condition build() {
      checkRequiredAttributes();
      return new ImmutableCondition(
          onsetPeriod,
          abatementAge,
          evidence,
          recordedDate,
          recorder,
          extension,
          abatementString,
          abatementPeriod,
          encounter,
          onsetDateTime,
          onsetString,
          text,
          onsetRange,
          language,
          identifier,
          meta,
          onsetAge,
          bodySite,
          abatementDateTime,
          implicitRules,
          clinicalStatus,
          verificationStatus,
          resourceType,
          modifierExtension,
          contained,
          asserter,
          subject,
          abatementRange,
          severity,
          id,
          category,
          code,
          note,
          stage);
    }

    private boolean onsetPeriodIsSet() {
      return (optBits & OPT_BIT_ONSET_PERIOD) != 0;
    }

    private boolean abatementAgeIsSet() {
      return (optBits & OPT_BIT_ABATEMENT_AGE) != 0;
    }

    private boolean evidenceIsSet() {
      return (optBits & OPT_BIT_EVIDENCE) != 0;
    }

    private boolean recordedDateIsSet() {
      return (optBits & OPT_BIT_RECORDED_DATE) != 0;
    }

    private boolean recorderIsSet() {
      return (optBits & OPT_BIT_RECORDER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean abatementStringIsSet() {
      return (optBits & OPT_BIT_ABATEMENT_STRING) != 0;
    }

    private boolean abatementPeriodIsSet() {
      return (optBits & OPT_BIT_ABATEMENT_PERIOD) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean onsetDateTimeIsSet() {
      return (optBits & OPT_BIT_ONSET_DATE_TIME) != 0;
    }

    private boolean onsetStringIsSet() {
      return (optBits & OPT_BIT_ONSET_STRING) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean onsetRangeIsSet() {
      return (optBits & OPT_BIT_ONSET_RANGE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean onsetAgeIsSet() {
      return (optBits & OPT_BIT_ONSET_AGE) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean abatementDateTimeIsSet() {
      return (optBits & OPT_BIT_ABATEMENT_DATE_TIME) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean clinicalStatusIsSet() {
      return (optBits & OPT_BIT_CLINICAL_STATUS) != 0;
    }

    private boolean verificationStatusIsSet() {
      return (optBits & OPT_BIT_VERIFICATION_STATUS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean asserterIsSet() {
      return (optBits & OPT_BIT_ASSERTER) != 0;
    }

    private boolean abatementRangeIsSet() {
      return (optBits & OPT_BIT_ABATEMENT_RANGE) != 0;
    }

    private boolean severityIsSet() {
      return (optBits & OPT_BIT_SEVERITY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean stageIsSet() {
      return (optBits & OPT_BIT_STAGE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Condition is strict, attribute is already set: ".concat(name));
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
      return "Cannot build Condition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Condition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Condition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    SubjectBuildStage resourceType(String resourceType);
  }

  @Generated(from = "Condition", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link Condition#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Reference subject);
  }

  @Generated(from = "Condition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Condition#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetPeriod(Period onsetPeriod);

    /**
     * Initializes the optional value {@link Condition#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetPeriod(Optional<? extends Period> onsetPeriod);

    /**
     * Initializes the optional value {@link Condition#abatementAge() abatementAge} to abatementAge.
     * @param abatementAge The value for abatementAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal abatementAge(Age abatementAge);

    /**
     * Initializes the optional value {@link Condition#abatementAge() abatementAge} to abatementAge.
     * @param abatementAge The value for abatementAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal abatementAge(Optional<? extends Age> abatementAge);

    /**
     * Initializes the optional value {@link Condition#evidence() evidence} to evidence.
     * @param evidence The value for evidence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal evidence(List<Condition_Evidence> evidence);

    /**
     * Initializes the optional value {@link Condition#evidence() evidence} to evidence.
     * @param evidence The value for evidence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal evidence(Optional<? extends List<Condition_Evidence>> evidence);

    /**
     * Initializes the optional value {@link Condition#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recordedDate(DateTime recordedDate);

    /**
     * Initializes the optional value {@link Condition#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recordedDate(Optional<? extends DateTime> recordedDate);

    /**
     * Initializes the optional value {@link Condition#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recorder(Reference recorder);

    /**
     * Initializes the optional value {@link Condition#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recorder(Optional<? extends Reference> recorder);

    /**
     * Initializes the optional value {@link Condition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Condition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Condition#abatementString() abatementString} to abatementString.
     * @param abatementString The value for abatementString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal abatementString(String abatementString);

    /**
     * Initializes the optional value {@link Condition#abatementString() abatementString} to abatementString.
     * @param abatementString The value for abatementString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal abatementString(Optional<String> abatementString);

    /**
     * Initializes the optional value {@link Condition#abatementPeriod() abatementPeriod} to abatementPeriod.
     * @param abatementPeriod The value for abatementPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal abatementPeriod(Period abatementPeriod);

    /**
     * Initializes the optional value {@link Condition#abatementPeriod() abatementPeriod} to abatementPeriod.
     * @param abatementPeriod The value for abatementPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal abatementPeriod(Optional<? extends Period> abatementPeriod);

    /**
     * Initializes the optional value {@link Condition#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link Condition#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link Condition#onsetDateTime() onsetDateTime} to onsetDateTime.
     * @param onsetDateTime The value for onsetDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetDateTime(String onsetDateTime);

    /**
     * Initializes the optional value {@link Condition#onsetDateTime() onsetDateTime} to onsetDateTime.
     * @param onsetDateTime The value for onsetDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetDateTime(Optional<String> onsetDateTime);

    /**
     * Initializes the optional value {@link Condition#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetString(String onsetString);

    /**
     * Initializes the optional value {@link Condition#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetString(Optional<String> onsetString);

    /**
     * Initializes the optional value {@link Condition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Condition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Condition#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetRange(Range onsetRange);

    /**
     * Initializes the optional value {@link Condition#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetRange(Optional<? extends Range> onsetRange);

    /**
     * Initializes the optional value {@link Condition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Condition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Condition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Condition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Condition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Condition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Condition#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetAge(Age onsetAge);

    /**
     * Initializes the optional value {@link Condition#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetAge(Optional<? extends Age> onsetAge);

    /**
     * Initializes the optional value {@link Condition#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(List<CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link Condition#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(Optional<? extends List<CodeableConcept>> bodySite);

    /**
     * Initializes the optional value {@link Condition#abatementDateTime() abatementDateTime} to abatementDateTime.
     * @param abatementDateTime The value for abatementDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal abatementDateTime(String abatementDateTime);

    /**
     * Initializes the optional value {@link Condition#abatementDateTime() abatementDateTime} to abatementDateTime.
     * @param abatementDateTime The value for abatementDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal abatementDateTime(Optional<String> abatementDateTime);

    /**
     * Initializes the optional value {@link Condition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Condition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Condition#clinicalStatus() clinicalStatus} to clinicalStatus.
     * @param clinicalStatus The value for clinicalStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal clinicalStatus(CodeableConcept clinicalStatus);

    /**
     * Initializes the optional value {@link Condition#clinicalStatus() clinicalStatus} to clinicalStatus.
     * @param clinicalStatus The value for clinicalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal clinicalStatus(Optional<? extends CodeableConcept> clinicalStatus);

    /**
     * Initializes the optional value {@link Condition#verificationStatus() verificationStatus} to verificationStatus.
     * @param verificationStatus The value for verificationStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal verificationStatus(CodeableConcept verificationStatus);

    /**
     * Initializes the optional value {@link Condition#verificationStatus() verificationStatus} to verificationStatus.
     * @param verificationStatus The value for verificationStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal verificationStatus(Optional<? extends CodeableConcept> verificationStatus);

    /**
     * Initializes the optional value {@link Condition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Condition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Condition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Condition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Condition#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal asserter(Reference asserter);

    /**
     * Initializes the optional value {@link Condition#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal asserter(Optional<? extends Reference> asserter);

    /**
     * Initializes the optional value {@link Condition#abatementRange() abatementRange} to abatementRange.
     * @param abatementRange The value for abatementRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal abatementRange(Range abatementRange);

    /**
     * Initializes the optional value {@link Condition#abatementRange() abatementRange} to abatementRange.
     * @param abatementRange The value for abatementRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal abatementRange(Optional<? extends Range> abatementRange);

    /**
     * Initializes the optional value {@link Condition#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal severity(CodeableConcept severity);

    /**
     * Initializes the optional value {@link Condition#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal severity(Optional<? extends CodeableConcept> severity);

    /**
     * Initializes the optional value {@link Condition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Condition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Condition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link Condition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link Condition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link Condition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link Condition#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link Condition#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link Condition#stage() stage} to stage.
     * @param stage The value for stage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal stage(List<Condition_Stage> stage);

    /**
     * Initializes the optional value {@link Condition#stage() stage} to stage.
     * @param stage The value for stage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal stage(Optional<? extends List<Condition_Stage>> stage);

    /**
     * Builds a new {@link Condition Condition}.
     * @return An immutable instance of Condition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Condition build();
  }
}
