package com.medplum.types.fhir;

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
 * Immutable implementation of {@link ClinicalImpression}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClinicalImpression.builder()}.
 */
@Generated(from = "ClinicalImpression", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClinicalImpression implements ClinicalImpression {
  private final @Nullable String summary;
  private final @Nullable List<Annotation> note;
  private final @Nullable Meta meta;
  private final @Nullable Uri implicitRules;
  private final @Nullable Reference encounter;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String effectiveDateTime;
  private final @Nullable List<Reference> supportingInfo;
  private final @Nullable List<Reference> prognosisReference;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Narrative text;
  private final @Nullable Reference assessor;
  private final String resourceType;
  private final @Nullable List<Reference> problem;
  private final @Nullable List<ClinicalImpression_Finding> finding;
  private final @Nullable Code status;
  private final @Nullable Code language;
  private final @Nullable String description;
  private final @Nullable List<Extension> extension;
  private final @Nullable Id id;
  private final @Nullable List<ClinicalImpression_Investigation> investigation;
  private final @Nullable List<Uri> protocol;
  private final Reference subject;
  private final @Nullable CodeableConcept code;
  private final @Nullable List<CodeableConcept> prognosisCodeableConcept;
  private final @Nullable Period effectivePeriod;
  private final @Nullable Reference previous;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable CodeableConcept statusReason;
  private final @Nullable DateTime date;

  private ImmutableClinicalImpression(
      @Nullable String summary,
      @Nullable List<Annotation> note,
      @Nullable Meta meta,
      @Nullable Uri implicitRules,
      @Nullable Reference encounter,
      @Nullable List<Extension> modifierExtension,
      @Nullable String effectiveDateTime,
      @Nullable List<Reference> supportingInfo,
      @Nullable List<Reference> prognosisReference,
      @Nullable List<ResourceList> contained,
      @Nullable Narrative text,
      @Nullable Reference assessor,
      String resourceType,
      @Nullable List<Reference> problem,
      @Nullable List<ClinicalImpression_Finding> finding,
      @Nullable Code status,
      @Nullable Code language,
      @Nullable String description,
      @Nullable List<Extension> extension,
      @Nullable Id id,
      @Nullable List<ClinicalImpression_Investigation> investigation,
      @Nullable List<Uri> protocol,
      Reference subject,
      @Nullable CodeableConcept code,
      @Nullable List<CodeableConcept> prognosisCodeableConcept,
      @Nullable Period effectivePeriod,
      @Nullable Reference previous,
      @Nullable List<Identifier> identifier,
      @Nullable CodeableConcept statusReason,
      @Nullable DateTime date) {
    this.summary = summary;
    this.note = note;
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.encounter = encounter;
    this.modifierExtension = modifierExtension;
    this.effectiveDateTime = effectiveDateTime;
    this.supportingInfo = supportingInfo;
    this.prognosisReference = prognosisReference;
    this.contained = contained;
    this.text = text;
    this.assessor = assessor;
    this.resourceType = resourceType;
    this.problem = problem;
    this.finding = finding;
    this.status = status;
    this.language = language;
    this.description = description;
    this.extension = extension;
    this.id = id;
    this.investigation = investigation;
    this.protocol = protocol;
    this.subject = subject;
    this.code = code;
    this.prognosisCodeableConcept = prognosisCodeableConcept;
    this.effectivePeriod = effectivePeriod;
    this.previous = previous;
    this.identifier = identifier;
    this.statusReason = statusReason;
    this.date = date;
  }

  /**
   * @return The value of the {@code summary} attribute
   */
  @JsonProperty("summary")
  @Override
  public Optional<String> summary() {
    return Optional.ofNullable(summary);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code encounter} attribute
   */
  @JsonProperty("encounter")
  @Override
  public Optional<Reference> encounter() {
    return Optional.ofNullable(encounter);
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
   * @return The value of the {@code effectiveDateTime} attribute
   */
  @JsonProperty("effectiveDateTime")
  @Override
  public Optional<String> effectiveDateTime() {
    return Optional.ofNullable(effectiveDateTime);
  }

  /**
   * @return The value of the {@code supportingInfo} attribute
   */
  @JsonProperty("supportingInfo")
  @Override
  public Optional<List<Reference>> supportingInfo() {
    return Optional.ofNullable(supportingInfo);
  }

  /**
   * @return The value of the {@code prognosisReference} attribute
   */
  @JsonProperty("prognosisReference")
  @Override
  public Optional<List<Reference>> prognosisReference() {
    return Optional.ofNullable(prognosisReference);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code assessor} attribute
   */
  @JsonProperty("assessor")
  @Override
  public Optional<Reference> assessor() {
    return Optional.ofNullable(assessor);
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
   * @return The value of the {@code problem} attribute
   */
  @JsonProperty("problem")
  @Override
  public Optional<List<Reference>> problem() {
    return Optional.ofNullable(problem);
  }

  /**
   * @return The value of the {@code finding} attribute
   */
  @JsonProperty("finding")
  @Override
  public Optional<List<ClinicalImpression_Finding>> finding() {
    return Optional.ofNullable(finding);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code investigation} attribute
   */
  @JsonProperty("investigation")
  @Override
  public Optional<List<ClinicalImpression_Investigation>> investigation() {
    return Optional.ofNullable(investigation);
  }

  /**
   * @return The value of the {@code protocol} attribute
   */
  @JsonProperty("protocol")
  @Override
  public Optional<List<Uri>> protocol() {
    return Optional.ofNullable(protocol);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code prognosisCodeableConcept} attribute
   */
  @JsonProperty("prognosisCodeableConcept")
  @Override
  public Optional<List<CodeableConcept>> prognosisCodeableConcept() {
    return Optional.ofNullable(prognosisCodeableConcept);
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
   * @return The value of the {@code previous} attribute
   */
  @JsonProperty("previous")
  @Override
  public Optional<Reference> previous() {
    return Optional.ofNullable(previous);
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
   * @return The value of the {@code statusReason} attribute
   */
  @JsonProperty("statusReason")
  @Override
  public Optional<CodeableConcept> statusReason() {
    return Optional.ofNullable(statusReason);
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#summary() summary} attribute.
   * @param value The value for summary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withSummary(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "summary");
    if (Objects.equals(this.summary, newValue)) return this;
    return new ImmutableClinicalImpression(
        newValue,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#summary() summary} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for summary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withSummary(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.summary, value)) return this;
    return new ImmutableClinicalImpression(
        value,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        newValue,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        value,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        newValue,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        value,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        newValue,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        value,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        newValue,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        value,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        newValue,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        value,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#effectiveDateTime() effectiveDateTime} attribute.
   * @param value The value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withEffectiveDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "effectiveDateTime");
    if (Objects.equals(this.effectiveDateTime, newValue)) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        newValue,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#effectiveDateTime() effectiveDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withEffectiveDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.effectiveDateTime, value)) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        value,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#supportingInfo() supportingInfo} attribute.
   * @param value The value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withSupportingInfo(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "supportingInfo");
    if (this.supportingInfo == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        newValue,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#supportingInfo() supportingInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withSupportingInfo(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.supportingInfo == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        value,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#prognosisReference() prognosisReference} attribute.
   * @param value The value for prognosisReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withPrognosisReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "prognosisReference");
    if (this.prognosisReference == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        newValue,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#prognosisReference() prognosisReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prognosisReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withPrognosisReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.prognosisReference == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        value,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        newValue,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        value,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        newValue,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        value,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#assessor() assessor} attribute.
   * @param value The value for assessor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withAssessor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "assessor");
    if (this.assessor == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        newValue,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#assessor() assessor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for assessor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withAssessor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.assessor == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        value,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClinicalImpression#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClinicalImpression withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        newValue,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#problem() problem} attribute.
   * @param value The value for problem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withProblem(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "problem");
    if (this.problem == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        newValue,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#problem() problem} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for problem
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withProblem(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.problem == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        value,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#finding() finding} attribute.
   * @param value The value for finding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withFinding(List<ClinicalImpression_Finding> value) {
    @Nullable List<ClinicalImpression_Finding> newValue = Objects.requireNonNull(value, "finding");
    if (this.finding == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        newValue,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#finding() finding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for finding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withFinding(Optional<? extends List<ClinicalImpression_Finding>> optional) {
    @Nullable List<ClinicalImpression_Finding> value = optional.orElse(null);
    if (this.finding == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        value,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        newValue,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        value,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        newValue,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        value,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        newValue,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        value,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        newValue,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        value,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        newValue,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        value,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#investigation() investigation} attribute.
   * @param value The value for investigation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withInvestigation(List<ClinicalImpression_Investigation> value) {
    @Nullable List<ClinicalImpression_Investigation> newValue = Objects.requireNonNull(value, "investigation");
    if (this.investigation == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        newValue,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#investigation() investigation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for investigation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withInvestigation(Optional<? extends List<ClinicalImpression_Investigation>> optional) {
    @Nullable List<ClinicalImpression_Investigation> value = optional.orElse(null);
    if (this.investigation == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        value,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#protocol() protocol} attribute.
   * @param value The value for protocol
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withProtocol(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "protocol");
    if (this.protocol == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        newValue,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#protocol() protocol} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for protocol
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withProtocol(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.protocol == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        value,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClinicalImpression#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClinicalImpression withSubject(Reference value) {
    if (this.subject == value) return this;
    Reference newValue = Objects.requireNonNull(value, "subject");
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        newValue,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        newValue,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        value,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#prognosisCodeableConcept() prognosisCodeableConcept} attribute.
   * @param value The value for prognosisCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withPrognosisCodeableConcept(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "prognosisCodeableConcept");
    if (this.prognosisCodeableConcept == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        newValue,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#prognosisCodeableConcept() prognosisCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prognosisCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withPrognosisCodeableConcept(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.prognosisCodeableConcept == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        value,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        newValue,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        value,
        this.previous,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#previous() previous} attribute.
   * @param value The value for previous
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withPrevious(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "previous");
    if (this.previous == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        newValue,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#previous() previous} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for previous
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withPrevious(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.previous == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        value,
        this.identifier,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        newValue,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        value,
        this.statusReason,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withStatusReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        newValue,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withStatusReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        value,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableClinicalImpression(
        this.summary,
        this.note,
        this.meta,
        this.implicitRules,
        this.encounter,
        this.modifierExtension,
        this.effectiveDateTime,
        this.supportingInfo,
        this.prognosisReference,
        this.contained,
        this.text,
        this.assessor,
        this.resourceType,
        this.problem,
        this.finding,
        this.status,
        this.language,
        this.description,
        this.extension,
        this.id,
        this.investigation,
        this.protocol,
        this.subject,
        this.code,
        this.prognosisCodeableConcept,
        this.effectivePeriod,
        this.previous,
        this.identifier,
        this.statusReason,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClinicalImpression} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClinicalImpression
        && equalTo((ImmutableClinicalImpression) another);
  }

  private boolean equalTo(ImmutableClinicalImpression another) {
    return Objects.equals(summary, another.summary)
        && Objects.equals(note, another.note)
        && Objects.equals(meta, another.meta)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(effectiveDateTime, another.effectiveDateTime)
        && Objects.equals(supportingInfo, another.supportingInfo)
        && Objects.equals(prognosisReference, another.prognosisReference)
        && Objects.equals(contained, another.contained)
        && Objects.equals(text, another.text)
        && Objects.equals(assessor, another.assessor)
        && resourceType.equals(another.resourceType)
        && Objects.equals(problem, another.problem)
        && Objects.equals(finding, another.finding)
        && Objects.equals(status, another.status)
        && Objects.equals(language, another.language)
        && Objects.equals(description, another.description)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(investigation, another.investigation)
        && Objects.equals(protocol, another.protocol)
        && subject.equals(another.subject)
        && Objects.equals(code, another.code)
        && Objects.equals(prognosisCodeableConcept, another.prognosisCodeableConcept)
        && Objects.equals(effectivePeriod, another.effectivePeriod)
        && Objects.equals(previous, another.previous)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(statusReason, another.statusReason)
        && Objects.equals(date, another.date);
  }

  /**
   * Computes a hash code from attributes: {@code summary}, {@code note}, {@code meta}, {@code implicitRules}, {@code encounter}, {@code modifierExtension}, {@code effectiveDateTime}, {@code supportingInfo}, {@code prognosisReference}, {@code contained}, {@code text}, {@code assessor}, {@code resourceType}, {@code problem}, {@code finding}, {@code status}, {@code language}, {@code description}, {@code extension}, {@code id}, {@code investigation}, {@code protocol}, {@code subject}, {@code code}, {@code prognosisCodeableConcept}, {@code effectivePeriod}, {@code previous}, {@code identifier}, {@code statusReason}, {@code date}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(summary);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(effectiveDateTime);
    h += (h << 5) + Objects.hashCode(supportingInfo);
    h += (h << 5) + Objects.hashCode(prognosisReference);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(assessor);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(problem);
    h += (h << 5) + Objects.hashCode(finding);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(investigation);
    h += (h << 5) + Objects.hashCode(protocol);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(prognosisCodeableConcept);
    h += (h << 5) + Objects.hashCode(effectivePeriod);
    h += (h << 5) + Objects.hashCode(previous);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(statusReason);
    h += (h << 5) + Objects.hashCode(date);
    return h;
  }

  /**
   * Prints the immutable value {@code ClinicalImpression} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ClinicalImpression{");
    if (summary != null) {
      builder.append("summary=").append(summary);
    }
    if (note != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (meta != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (encounter != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (effectiveDateTime != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("effectiveDateTime=").append(effectiveDateTime);
    }
    if (supportingInfo != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (prognosisReference != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("prognosisReference=").append(prognosisReference);
    }
    if (contained != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (text != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (assessor != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("assessor=").append(assessor);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (problem != null) {
      builder.append(", ");
      builder.append("problem=").append(problem);
    }
    if (finding != null) {
      builder.append(", ");
      builder.append("finding=").append(finding);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (investigation != null) {
      builder.append(", ");
      builder.append("investigation=").append(investigation);
    }
    if (protocol != null) {
      builder.append(", ");
      builder.append("protocol=").append(protocol);
    }
    builder.append(", ");
    builder.append("subject=").append(subject);
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (prognosisCodeableConcept != null) {
      builder.append(", ");
      builder.append("prognosisCodeableConcept=").append(prognosisCodeableConcept);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (previous != null) {
      builder.append(", ");
      builder.append("previous=").append(previous);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ClinicalImpression", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ClinicalImpression {
    @Nullable Optional<String> summary = Optional.empty();
    boolean summaryIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> effectiveDateTime = Optional.empty();
    boolean effectiveDateTimeIsSet;
    @Nullable Optional<List<Reference>> supportingInfo = Optional.empty();
    boolean supportingInfoIsSet;
    @Nullable Optional<List<Reference>> prognosisReference = Optional.empty();
    boolean prognosisReferenceIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Reference> assessor = Optional.empty();
    boolean assessorIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Reference>> problem = Optional.empty();
    boolean problemIsSet;
    @Nullable Optional<List<ClinicalImpression_Finding>> finding = Optional.empty();
    boolean findingIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<ClinicalImpression_Investigation>> investigation = Optional.empty();
    boolean investigationIsSet;
    @Nullable Optional<List<Uri>> protocol = Optional.empty();
    boolean protocolIsSet;
    @Nullable Reference subject;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<CodeableConcept>> prognosisCodeableConcept = Optional.empty();
    boolean prognosisCodeableConceptIsSet;
    @Nullable Optional<Period> effectivePeriod = Optional.empty();
    boolean effectivePeriodIsSet;
    @Nullable Optional<Reference> previous = Optional.empty();
    boolean previousIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<CodeableConcept> statusReason = Optional.empty();
    boolean statusReasonIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @JsonProperty("summary")
    public void setSummary(Optional<String> summary) {
      this.summary = summary;
      this.summaryIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("effectiveDateTime")
    public void setEffectiveDateTime(Optional<String> effectiveDateTime) {
      this.effectiveDateTime = effectiveDateTime;
      this.effectiveDateTimeIsSet = true;
    }
    @JsonProperty("supportingInfo")
    public void setSupportingInfo(Optional<List<Reference>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @JsonProperty("prognosisReference")
    public void setPrognosisReference(Optional<List<Reference>> prognosisReference) {
      this.prognosisReference = prognosisReference;
      this.prognosisReferenceIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("assessor")
    public void setAssessor(Optional<Reference> assessor) {
      this.assessor = assessor;
      this.assessorIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("problem")
    public void setProblem(Optional<List<Reference>> problem) {
      this.problem = problem;
      this.problemIsSet = true;
    }
    @JsonProperty("finding")
    public void setFinding(Optional<List<ClinicalImpression_Finding>> finding) {
      this.finding = finding;
      this.findingIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("investigation")
    public void setInvestigation(Optional<List<ClinicalImpression_Investigation>> investigation) {
      this.investigation = investigation;
      this.investigationIsSet = true;
    }
    @JsonProperty("protocol")
    public void setProtocol(Optional<List<Uri>> protocol) {
      this.protocol = protocol;
      this.protocolIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
      this.subject = subject;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("prognosisCodeableConcept")
    public void setPrognosisCodeableConcept(Optional<List<CodeableConcept>> prognosisCodeableConcept) {
      this.prognosisCodeableConcept = prognosisCodeableConcept;
      this.prognosisCodeableConceptIsSet = true;
    }
    @JsonProperty("effectivePeriod")
    public void setEffectivePeriod(Optional<Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @JsonProperty("previous")
    public void setPrevious(Optional<Reference> previous) {
      this.previous = previous;
      this.previousIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("statusReason")
    public void setStatusReason(Optional<CodeableConcept> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @Override
    public Optional<String> summary() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> effectiveDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> prognosisReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> assessor() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> problem() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ClinicalImpression_Finding>> finding() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ClinicalImpression_Investigation>> investigation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> protocol() { throw new UnsupportedOperationException(); }
    @Override
    public Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> prognosisCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> previous() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClinicalImpression fromJson(Json json) {
    ImmutableClinicalImpression.Builder builder = ((ImmutableClinicalImpression.Builder) ImmutableClinicalImpression.builder());
    if (json.summaryIsSet) {
      builder.summary(json.summary);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.effectiveDateTimeIsSet) {
      builder.effectiveDateTime(json.effectiveDateTime);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.prognosisReferenceIsSet) {
      builder.prognosisReference(json.prognosisReference);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.assessorIsSet) {
      builder.assessor(json.assessor);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.problemIsSet) {
      builder.problem(json.problem);
    }
    if (json.findingIsSet) {
      builder.finding(json.finding);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.investigationIsSet) {
      builder.investigation(json.investigation);
    }
    if (json.protocolIsSet) {
      builder.protocol(json.protocol);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.prognosisCodeableConceptIsSet) {
      builder.prognosisCodeableConcept(json.prognosisCodeableConcept);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.previousIsSet) {
      builder.previous(json.previous);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    return (ImmutableClinicalImpression) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClinicalImpression} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClinicalImpression instance
   */
  public static ClinicalImpression copyOf(ClinicalImpression instance) {
    if (instance instanceof ImmutableClinicalImpression) {
      return (ImmutableClinicalImpression) instance;
    }
    return ((ImmutableClinicalImpression.Builder) ImmutableClinicalImpression.builder())
        .summary(instance.summary())
        .note(instance.note())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .encounter(instance.encounter())
        .modifierExtension(instance.modifierExtension())
        .effectiveDateTime(instance.effectiveDateTime())
        .supportingInfo(instance.supportingInfo())
        .prognosisReference(instance.prognosisReference())
        .contained(instance.contained())
        .text(instance.text())
        .assessor(instance.assessor())
        .resourceType(instance.resourceType())
        .problem(instance.problem())
        .finding(instance.finding())
        .status(instance.status())
        .language(instance.language())
        .description(instance.description())
        .extension(instance.extension())
        .id(instance.id())
        .investigation(instance.investigation())
        .protocol(instance.protocol())
        .subject(instance.subject())
        .code(instance.code())
        .prognosisCodeableConcept(instance.prognosisCodeableConcept())
        .effectivePeriod(instance.effectivePeriod())
        .previous(instance.previous())
        .identifier(instance.identifier())
        .statusReason(instance.statusReason())
        .date(instance.date())
        .build();
  }

  /**
   * Creates a builder for {@link ClinicalImpression ClinicalImpression}.
   * <pre>
   * ImmutableClinicalImpression.builder()
   *    .summary(String) // optional {@link ClinicalImpression#summary() summary}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link ClinicalImpression#note() note}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link ClinicalImpression#meta() meta}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link ClinicalImpression#implicitRules() implicitRules}
   *    .encounter(com.medplum.types.fhir.Reference) // optional {@link ClinicalImpression#encounter() encounter}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ClinicalImpression#modifierExtension() modifierExtension}
   *    .effectiveDateTime(String) // optional {@link ClinicalImpression#effectiveDateTime() effectiveDateTime}
   *    .supportingInfo(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ClinicalImpression#supportingInfo() supportingInfo}
   *    .prognosisReference(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ClinicalImpression#prognosisReference() prognosisReference}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link ClinicalImpression#contained() contained}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link ClinicalImpression#text() text}
   *    .assessor(com.medplum.types.fhir.Reference) // optional {@link ClinicalImpression#assessor() assessor}
   *    .resourceType(String) // required {@link ClinicalImpression#resourceType() resourceType}
   *    .problem(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ClinicalImpression#problem() problem}
   *    .finding(List&amp;lt;com.medplum.types.fhir.ClinicalImpression_Finding&amp;gt;) // optional {@link ClinicalImpression#finding() finding}
   *    .status(com.medplum.types.fhir.Code) // optional {@link ClinicalImpression#status() status}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ClinicalImpression#language() language}
   *    .description(String) // optional {@link ClinicalImpression#description() description}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ClinicalImpression#extension() extension}
   *    .id(com.medplum.types.fhir.Id) // optional {@link ClinicalImpression#id() id}
   *    .investigation(List&amp;lt;com.medplum.types.fhir.ClinicalImpression_Investigation&amp;gt;) // optional {@link ClinicalImpression#investigation() investigation}
   *    .protocol(List&amp;lt;com.medplum.types.fhir.Uri&amp;gt;) // optional {@link ClinicalImpression#protocol() protocol}
   *    .subject(com.medplum.types.fhir.Reference) // required {@link ClinicalImpression#subject() subject}
   *    .code(com.medplum.types.fhir.CodeableConcept) // optional {@link ClinicalImpression#code() code}
   *    .prognosisCodeableConcept(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ClinicalImpression#prognosisCodeableConcept() prognosisCodeableConcept}
   *    .effectivePeriod(com.medplum.types.fhir.Period) // optional {@link ClinicalImpression#effectivePeriod() effectivePeriod}
   *    .previous(com.medplum.types.fhir.Reference) // optional {@link ClinicalImpression#previous() previous}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link ClinicalImpression#identifier() identifier}
   *    .statusReason(com.medplum.types.fhir.CodeableConcept) // optional {@link ClinicalImpression#statusReason() statusReason}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link ClinicalImpression#date() date}
   *    .build();
   * </pre>
   * @return A new ClinicalImpression builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableClinicalImpression.Builder();
  }

  /**
   * Builds instances of type {@link ClinicalImpression ClinicalImpression}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ClinicalImpression", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, SubjectBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_SUBJECT = 0x2L;
    private static final long OPT_BIT_SUMMARY = 0x1L;
    private static final long OPT_BIT_NOTE = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8L;
    private static final long OPT_BIT_ENCOUNTER = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_EFFECTIVE_DATE_TIME = 0x40L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x80L;
    private static final long OPT_BIT_PROGNOSIS_REFERENCE = 0x100L;
    private static final long OPT_BIT_CONTAINED = 0x200L;
    private static final long OPT_BIT_TEXT = 0x400L;
    private static final long OPT_BIT_ASSESSOR = 0x800L;
    private static final long OPT_BIT_PROBLEM = 0x1000L;
    private static final long OPT_BIT_FINDING = 0x2000L;
    private static final long OPT_BIT_STATUS = 0x4000L;
    private static final long OPT_BIT_LANGUAGE = 0x8000L;
    private static final long OPT_BIT_DESCRIPTION = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private static final long OPT_BIT_ID = 0x40000L;
    private static final long OPT_BIT_INVESTIGATION = 0x80000L;
    private static final long OPT_BIT_PROTOCOL = 0x100000L;
    private static final long OPT_BIT_CODE = 0x200000L;
    private static final long OPT_BIT_PROGNOSIS_CODEABLE_CONCEPT = 0x400000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x800000L;
    private static final long OPT_BIT_PREVIOUS = 0x1000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x2000000L;
    private static final long OPT_BIT_STATUS_REASON = 0x4000000L;
    private static final long OPT_BIT_DATE = 0x8000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable String summary;
    private @Nullable List<Annotation> note;
    private @Nullable Meta meta;
    private @Nullable Uri implicitRules;
    private @Nullable Reference encounter;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String effectiveDateTime;
    private @Nullable List<Reference> supportingInfo;
    private @Nullable List<Reference> prognosisReference;
    private @Nullable List<ResourceList> contained;
    private @Nullable Narrative text;
    private @Nullable Reference assessor;
    private @Nullable String resourceType;
    private @Nullable List<Reference> problem;
    private @Nullable List<ClinicalImpression_Finding> finding;
    private @Nullable Code status;
    private @Nullable Code language;
    private @Nullable String description;
    private @Nullable List<Extension> extension;
    private @Nullable Id id;
    private @Nullable List<ClinicalImpression_Investigation> investigation;
    private @Nullable List<Uri> protocol;
    private @Nullable Reference subject;
    private @Nullable CodeableConcept code;
    private @Nullable List<CodeableConcept> prognosisCodeableConcept;
    private @Nullable Period effectivePeriod;
    private @Nullable Reference previous;
    private @Nullable List<Identifier> identifier;
    private @Nullable CodeableConcept statusReason;
    private @Nullable DateTime date;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#summary() summary} to summary.
     * @param summary The value for summary
     * @return {@code this} builder for chained invocation
     */
    public final Builder summary(String summary) {
      checkNotIsSet(summaryIsSet(), "summary");
      this.summary = Objects.requireNonNull(summary, "summary");
      optBits |= OPT_BIT_SUMMARY;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#summary() summary} to summary.
     * @param summary The value for summary
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("summary")
    public final Builder summary(Optional<String> summary) {
      checkNotIsSet(summaryIsSet(), "summary");
      this.summary = summary.orElse(null);
      optBits |= OPT_BIT_SUMMARY;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#note() note} to note.
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
     * Initializes the optional value {@link ClinicalImpression#note() note} to note.
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
     * Initializes the optional value {@link ClinicalImpression#meta() meta} to meta.
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
     * Initializes the optional value {@link ClinicalImpression#meta() meta} to meta.
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
     * Initializes the optional value {@link ClinicalImpression#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ClinicalImpression#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ClinicalImpression#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link ClinicalImpression#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link ClinicalImpression#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClinicalImpression#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClinicalImpression#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
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
     * Initializes the optional value {@link ClinicalImpression#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
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
     * Initializes the optional value {@link ClinicalImpression#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInfo(List<Reference> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = Objects.requireNonNull(supportingInfo, "supportingInfo");
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportingInfo")
    public final Builder supportingInfo(Optional<? extends List<Reference>> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = supportingInfo.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#prognosisReference() prognosisReference} to prognosisReference.
     * @param prognosisReference The value for prognosisReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder prognosisReference(List<Reference> prognosisReference) {
      checkNotIsSet(prognosisReferenceIsSet(), "prognosisReference");
      this.prognosisReference = Objects.requireNonNull(prognosisReference, "prognosisReference");
      optBits |= OPT_BIT_PROGNOSIS_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#prognosisReference() prognosisReference} to prognosisReference.
     * @param prognosisReference The value for prognosisReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("prognosisReference")
    public final Builder prognosisReference(Optional<? extends List<Reference>> prognosisReference) {
      checkNotIsSet(prognosisReferenceIsSet(), "prognosisReference");
      this.prognosisReference = prognosisReference.orElse(null);
      optBits |= OPT_BIT_PROGNOSIS_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#contained() contained} to contained.
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
     * Initializes the optional value {@link ClinicalImpression#contained() contained} to contained.
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
     * Initializes the optional value {@link ClinicalImpression#text() text} to text.
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
     * Initializes the optional value {@link ClinicalImpression#text() text} to text.
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
     * Initializes the optional value {@link ClinicalImpression#assessor() assessor} to assessor.
     * @param assessor The value for assessor
     * @return {@code this} builder for chained invocation
     */
    public final Builder assessor(Reference assessor) {
      checkNotIsSet(assessorIsSet(), "assessor");
      this.assessor = Objects.requireNonNull(assessor, "assessor");
      optBits |= OPT_BIT_ASSESSOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#assessor() assessor} to assessor.
     * @param assessor The value for assessor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("assessor")
    public final Builder assessor(Optional<? extends Reference> assessor) {
      checkNotIsSet(assessorIsSet(), "assessor");
      this.assessor = assessor.orElse(null);
      optBits |= OPT_BIT_ASSESSOR;
      return this;
    }

    /**
     * Initializes the value for the {@link ClinicalImpression#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ClinicalImpression#problem() problem} to problem.
     * @param problem The value for problem
     * @return {@code this} builder for chained invocation
     */
    public final Builder problem(List<Reference> problem) {
      checkNotIsSet(problemIsSet(), "problem");
      this.problem = Objects.requireNonNull(problem, "problem");
      optBits |= OPT_BIT_PROBLEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#problem() problem} to problem.
     * @param problem The value for problem
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("problem")
    public final Builder problem(Optional<? extends List<Reference>> problem) {
      checkNotIsSet(problemIsSet(), "problem");
      this.problem = problem.orElse(null);
      optBits |= OPT_BIT_PROBLEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#finding() finding} to finding.
     * @param finding The value for finding
     * @return {@code this} builder for chained invocation
     */
    public final Builder finding(List<ClinicalImpression_Finding> finding) {
      checkNotIsSet(findingIsSet(), "finding");
      this.finding = Objects.requireNonNull(finding, "finding");
      optBits |= OPT_BIT_FINDING;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#finding() finding} to finding.
     * @param finding The value for finding
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("finding")
    public final Builder finding(Optional<? extends List<ClinicalImpression_Finding>> finding) {
      checkNotIsSet(findingIsSet(), "finding");
      this.finding = finding.orElse(null);
      optBits |= OPT_BIT_FINDING;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#status() status} to status.
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
     * Initializes the optional value {@link ClinicalImpression#status() status} to status.
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
     * Initializes the optional value {@link ClinicalImpression#language() language} to language.
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
     * Initializes the optional value {@link ClinicalImpression#language() language} to language.
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
     * Initializes the optional value {@link ClinicalImpression#description() description} to description.
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
     * Initializes the optional value {@link ClinicalImpression#description() description} to description.
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
     * Initializes the optional value {@link ClinicalImpression#extension() extension} to extension.
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
     * Initializes the optional value {@link ClinicalImpression#extension() extension} to extension.
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
     * Initializes the optional value {@link ClinicalImpression#id() id} to id.
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
     * Initializes the optional value {@link ClinicalImpression#id() id} to id.
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
     * Initializes the optional value {@link ClinicalImpression#investigation() investigation} to investigation.
     * @param investigation The value for investigation
     * @return {@code this} builder for chained invocation
     */
    public final Builder investigation(List<ClinicalImpression_Investigation> investigation) {
      checkNotIsSet(investigationIsSet(), "investigation");
      this.investigation = Objects.requireNonNull(investigation, "investigation");
      optBits |= OPT_BIT_INVESTIGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#investigation() investigation} to investigation.
     * @param investigation The value for investigation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("investigation")
    public final Builder investigation(Optional<? extends List<ClinicalImpression_Investigation>> investigation) {
      checkNotIsSet(investigationIsSet(), "investigation");
      this.investigation = investigation.orElse(null);
      optBits |= OPT_BIT_INVESTIGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#protocol() protocol} to protocol.
     * @param protocol The value for protocol
     * @return {@code this} builder for chained invocation
     */
    public final Builder protocol(List<Uri> protocol) {
      checkNotIsSet(protocolIsSet(), "protocol");
      this.protocol = Objects.requireNonNull(protocol, "protocol");
      optBits |= OPT_BIT_PROTOCOL;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#protocol() protocol} to protocol.
     * @param protocol The value for protocol
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("protocol")
    public final Builder protocol(Optional<? extends List<Uri>> protocol) {
      checkNotIsSet(protocolIsSet(), "protocol");
      this.protocol = protocol.orElse(null);
      optBits |= OPT_BIT_PROTOCOL;
      return this;
    }

    /**
     * Initializes the value for the {@link ClinicalImpression#subject() subject} attribute.
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
     * Initializes the optional value {@link ClinicalImpression#code() code} to code.
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
     * Initializes the optional value {@link ClinicalImpression#code() code} to code.
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
     * Initializes the optional value {@link ClinicalImpression#prognosisCodeableConcept() prognosisCodeableConcept} to prognosisCodeableConcept.
     * @param prognosisCodeableConcept The value for prognosisCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder prognosisCodeableConcept(List<CodeableConcept> prognosisCodeableConcept) {
      checkNotIsSet(prognosisCodeableConceptIsSet(), "prognosisCodeableConcept");
      this.prognosisCodeableConcept = Objects.requireNonNull(prognosisCodeableConcept, "prognosisCodeableConcept");
      optBits |= OPT_BIT_PROGNOSIS_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#prognosisCodeableConcept() prognosisCodeableConcept} to prognosisCodeableConcept.
     * @param prognosisCodeableConcept The value for prognosisCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("prognosisCodeableConcept")
    public final Builder prognosisCodeableConcept(Optional<? extends List<CodeableConcept>> prognosisCodeableConcept) {
      checkNotIsSet(prognosisCodeableConceptIsSet(), "prognosisCodeableConcept");
      this.prognosisCodeableConcept = prognosisCodeableConcept.orElse(null);
      optBits |= OPT_BIT_PROGNOSIS_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link ClinicalImpression#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link ClinicalImpression#previous() previous} to previous.
     * @param previous The value for previous
     * @return {@code this} builder for chained invocation
     */
    public final Builder previous(Reference previous) {
      checkNotIsSet(previousIsSet(), "previous");
      this.previous = Objects.requireNonNull(previous, "previous");
      optBits |= OPT_BIT_PREVIOUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#previous() previous} to previous.
     * @param previous The value for previous
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("previous")
    public final Builder previous(Optional<? extends Reference> previous) {
      checkNotIsSet(previousIsSet(), "previous");
      this.previous = previous.orElse(null);
      optBits |= OPT_BIT_PREVIOUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ClinicalImpression#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ClinicalImpression#statusReason() statusReason} to statusReason.
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
     * Initializes the optional value {@link ClinicalImpression#statusReason() statusReason} to statusReason.
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
     * Initializes the optional value {@link ClinicalImpression#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(DateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends DateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Builds a new {@link ClinicalImpression ClinicalImpression}.
     * @return An immutable instance of ClinicalImpression
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ClinicalImpression build() {
      checkRequiredAttributes();
      return new ImmutableClinicalImpression(
          summary,
          note,
          meta,
          implicitRules,
          encounter,
          modifierExtension,
          effectiveDateTime,
          supportingInfo,
          prognosisReference,
          contained,
          text,
          assessor,
          resourceType,
          problem,
          finding,
          status,
          language,
          description,
          extension,
          id,
          investigation,
          protocol,
          subject,
          code,
          prognosisCodeableConcept,
          effectivePeriod,
          previous,
          identifier,
          statusReason,
          date);
    }

    private boolean summaryIsSet() {
      return (optBits & OPT_BIT_SUMMARY) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean effectiveDateTimeIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_DATE_TIME) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean prognosisReferenceIsSet() {
      return (optBits & OPT_BIT_PROGNOSIS_REFERENCE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean assessorIsSet() {
      return (optBits & OPT_BIT_ASSESSOR) != 0;
    }

    private boolean problemIsSet() {
      return (optBits & OPT_BIT_PROBLEM) != 0;
    }

    private boolean findingIsSet() {
      return (optBits & OPT_BIT_FINDING) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean investigationIsSet() {
      return (optBits & OPT_BIT_INVESTIGATION) != 0;
    }

    private boolean protocolIsSet() {
      return (optBits & OPT_BIT_PROTOCOL) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean prognosisCodeableConceptIsSet() {
      return (optBits & OPT_BIT_PROGNOSIS_CODEABLE_CONCEPT) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean previousIsSet() {
      return (optBits & OPT_BIT_PREVIOUS) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ClinicalImpression is strict, attribute is already set: ".concat(name));
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
      return "Cannot build ClinicalImpression, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ClinicalImpression", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ClinicalImpression#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    SubjectBuildStage resourceType(String resourceType);
  }

  @Generated(from = "ClinicalImpression", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link ClinicalImpression#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Reference subject);
  }

  @Generated(from = "ClinicalImpression", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ClinicalImpression#summary() summary} to summary.
     * @param summary The value for summary
     * @return {@code this} builder for chained invocation
     */
    BuildFinal summary(String summary);

    /**
     * Initializes the optional value {@link ClinicalImpression#summary() summary} to summary.
     * @param summary The value for summary
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal summary(Optional<String> summary);

    /**
     * Initializes the optional value {@link ClinicalImpression#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link ClinicalImpression#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link ClinicalImpression#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ClinicalImpression#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ClinicalImpression#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ClinicalImpression#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ClinicalImpression#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link ClinicalImpression#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link ClinicalImpression#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ClinicalImpression#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ClinicalImpression#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectiveDateTime(String effectiveDateTime);

    /**
     * Initializes the optional value {@link ClinicalImpression#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectiveDateTime(Optional<String> effectiveDateTime);

    /**
     * Initializes the optional value {@link ClinicalImpression#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInfo(List<Reference> supportingInfo);

    /**
     * Initializes the optional value {@link ClinicalImpression#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInfo(Optional<? extends List<Reference>> supportingInfo);

    /**
     * Initializes the optional value {@link ClinicalImpression#prognosisReference() prognosisReference} to prognosisReference.
     * @param prognosisReference The value for prognosisReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal prognosisReference(List<Reference> prognosisReference);

    /**
     * Initializes the optional value {@link ClinicalImpression#prognosisReference() prognosisReference} to prognosisReference.
     * @param prognosisReference The value for prognosisReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal prognosisReference(Optional<? extends List<Reference>> prognosisReference);

    /**
     * Initializes the optional value {@link ClinicalImpression#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ClinicalImpression#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ClinicalImpression#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ClinicalImpression#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ClinicalImpression#assessor() assessor} to assessor.
     * @param assessor The value for assessor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal assessor(Reference assessor);

    /**
     * Initializes the optional value {@link ClinicalImpression#assessor() assessor} to assessor.
     * @param assessor The value for assessor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal assessor(Optional<? extends Reference> assessor);

    /**
     * Initializes the optional value {@link ClinicalImpression#problem() problem} to problem.
     * @param problem The value for problem
     * @return {@code this} builder for chained invocation
     */
    BuildFinal problem(List<Reference> problem);

    /**
     * Initializes the optional value {@link ClinicalImpression#problem() problem} to problem.
     * @param problem The value for problem
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal problem(Optional<? extends List<Reference>> problem);

    /**
     * Initializes the optional value {@link ClinicalImpression#finding() finding} to finding.
     * @param finding The value for finding
     * @return {@code this} builder for chained invocation
     */
    BuildFinal finding(List<ClinicalImpression_Finding> finding);

    /**
     * Initializes the optional value {@link ClinicalImpression#finding() finding} to finding.
     * @param finding The value for finding
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal finding(Optional<? extends List<ClinicalImpression_Finding>> finding);

    /**
     * Initializes the optional value {@link ClinicalImpression#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link ClinicalImpression#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link ClinicalImpression#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ClinicalImpression#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ClinicalImpression#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link ClinicalImpression#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link ClinicalImpression#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ClinicalImpression#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ClinicalImpression#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ClinicalImpression#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ClinicalImpression#investigation() investigation} to investigation.
     * @param investigation The value for investigation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal investigation(List<ClinicalImpression_Investigation> investigation);

    /**
     * Initializes the optional value {@link ClinicalImpression#investigation() investigation} to investigation.
     * @param investigation The value for investigation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal investigation(Optional<? extends List<ClinicalImpression_Investigation>> investigation);

    /**
     * Initializes the optional value {@link ClinicalImpression#protocol() protocol} to protocol.
     * @param protocol The value for protocol
     * @return {@code this} builder for chained invocation
     */
    BuildFinal protocol(List<Uri> protocol);

    /**
     * Initializes the optional value {@link ClinicalImpression#protocol() protocol} to protocol.
     * @param protocol The value for protocol
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal protocol(Optional<? extends List<Uri>> protocol);

    /**
     * Initializes the optional value {@link ClinicalImpression#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link ClinicalImpression#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link ClinicalImpression#prognosisCodeableConcept() prognosisCodeableConcept} to prognosisCodeableConcept.
     * @param prognosisCodeableConcept The value for prognosisCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal prognosisCodeableConcept(List<CodeableConcept> prognosisCodeableConcept);

    /**
     * Initializes the optional value {@link ClinicalImpression#prognosisCodeableConcept() prognosisCodeableConcept} to prognosisCodeableConcept.
     * @param prognosisCodeableConcept The value for prognosisCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal prognosisCodeableConcept(Optional<? extends List<CodeableConcept>> prognosisCodeableConcept);

    /**
     * Initializes the optional value {@link ClinicalImpression#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(Period effectivePeriod);

    /**
     * Initializes the optional value {@link ClinicalImpression#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(Optional<? extends Period> effectivePeriod);

    /**
     * Initializes the optional value {@link ClinicalImpression#previous() previous} to previous.
     * @param previous The value for previous
     * @return {@code this} builder for chained invocation
     */
    BuildFinal previous(Reference previous);

    /**
     * Initializes the optional value {@link ClinicalImpression#previous() previous} to previous.
     * @param previous The value for previous
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal previous(Optional<? extends Reference> previous);

    /**
     * Initializes the optional value {@link ClinicalImpression#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link ClinicalImpression#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link ClinicalImpression#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(CodeableConcept statusReason);

    /**
     * Initializes the optional value {@link ClinicalImpression#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(Optional<? extends CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link ClinicalImpression#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link ClinicalImpression#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Builds a new {@link ClinicalImpression ClinicalImpression}.
     * @return An immutable instance of ClinicalImpression
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ClinicalImpression build();
  }
}
