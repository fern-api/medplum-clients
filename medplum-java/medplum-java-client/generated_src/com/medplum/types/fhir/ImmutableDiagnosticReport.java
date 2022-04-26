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
 * Immutable implementation of {@link DiagnosticReport}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDiagnosticReport.builder()}.
 */
@Generated(from = "DiagnosticReport", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDiagnosticReport implements DiagnosticReport {
  private final @Nullable Reference encounter;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<CodeableConcept> category;
  private final @Nullable Instant issued;
  private final CodeableConcept code;
  private final @Nullable Code language;
  private final @Nullable DiagnosticreportStatus status;
  private final @Nullable Period effectivePeriod;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<CodeableConcept> conclusionCode;
  private final @Nullable Reference subject;
  private final String resourceType;
  private final @Nullable Meta meta;
  private final @Nullable List<Reference> basedOn;
  private final @Nullable String effectiveDateTime;
  private final @Nullable List<Reference> imagingStudy;
  private final @Nullable Id id;
  private final @Nullable List<Reference> resultsInterpreter;
  private final @Nullable Narrative text;
  private final @Nullable List<Reference> specimen;
  private final @Nullable List<Extension> extension;
  private final @Nullable String conclusion;
  private final @Nullable List<Attachment> presentedForm;
  private final @Nullable List<Reference> performer;
  private final @Nullable List<Reference> result;
  private final @Nullable List<DiagnosticReport_Media> media;

  private ImmutableDiagnosticReport(
      @Nullable Reference encounter,
      @Nullable Uri implicitRules,
      @Nullable List<CodeableConcept> category,
      @Nullable Instant issued,
      CodeableConcept code,
      @Nullable Code language,
      @Nullable DiagnosticreportStatus status,
      @Nullable Period effectivePeriod,
      @Nullable List<ResourceList> contained,
      @Nullable List<Identifier> identifier,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<CodeableConcept> conclusionCode,
      @Nullable Reference subject,
      String resourceType,
      @Nullable Meta meta,
      @Nullable List<Reference> basedOn,
      @Nullable String effectiveDateTime,
      @Nullable List<Reference> imagingStudy,
      @Nullable Id id,
      @Nullable List<Reference> resultsInterpreter,
      @Nullable Narrative text,
      @Nullable List<Reference> specimen,
      @Nullable List<Extension> extension,
      @Nullable String conclusion,
      @Nullable List<Attachment> presentedForm,
      @Nullable List<Reference> performer,
      @Nullable List<Reference> result,
      @Nullable List<DiagnosticReport_Media> media) {
    this.encounter = encounter;
    this.implicitRules = implicitRules;
    this.category = category;
    this.issued = issued;
    this.code = code;
    this.language = language;
    this.status = status;
    this.effectivePeriod = effectivePeriod;
    this.contained = contained;
    this.identifier = identifier;
    this.modifierExtension = modifierExtension;
    this.conclusionCode = conclusionCode;
    this.subject = subject;
    this.resourceType = resourceType;
    this.meta = meta;
    this.basedOn = basedOn;
    this.effectiveDateTime = effectiveDateTime;
    this.imagingStudy = imagingStudy;
    this.id = id;
    this.resultsInterpreter = resultsInterpreter;
    this.text = text;
    this.specimen = specimen;
    this.extension = extension;
    this.conclusion = conclusion;
    this.presentedForm = presentedForm;
    this.performer = performer;
    this.result = result;
    this.media = media;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code issued} attribute
   */
  @JsonProperty("issued")
  @Override
  public Optional<Instant> issued() {
    return Optional.ofNullable(issued);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<DiagnosticreportStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code conclusionCode} attribute
   */
  @JsonProperty("conclusionCode")
  @Override
  public Optional<List<CodeableConcept>> conclusionCode() {
    return Optional.ofNullable(conclusionCode);
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
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<List<Reference>> basedOn() {
    return Optional.ofNullable(basedOn);
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
   * @return The value of the {@code imagingStudy} attribute
   */
  @JsonProperty("imagingStudy")
  @Override
  public Optional<List<Reference>> imagingStudy() {
    return Optional.ofNullable(imagingStudy);
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
   * @return The value of the {@code resultsInterpreter} attribute
   */
  @JsonProperty("resultsInterpreter")
  @Override
  public Optional<List<Reference>> resultsInterpreter() {
    return Optional.ofNullable(resultsInterpreter);
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
   * @return The value of the {@code specimen} attribute
   */
  @JsonProperty("specimen")
  @Override
  public Optional<List<Reference>> specimen() {
    return Optional.ofNullable(specimen);
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
   * @return The value of the {@code conclusion} attribute
   */
  @JsonProperty("conclusion")
  @Override
  public Optional<String> conclusion() {
    return Optional.ofNullable(conclusion);
  }

  /**
   * @return The value of the {@code presentedForm} attribute
   */
  @JsonProperty("presentedForm")
  @Override
  public Optional<List<Attachment>> presentedForm() {
    return Optional.ofNullable(presentedForm);
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
   * @return The value of the {@code result} attribute
   */
  @JsonProperty("result")
  @Override
  public Optional<List<Reference>> result() {
    return Optional.ofNullable(result);
  }

  /**
   * @return The value of the {@code media} attribute
   */
  @JsonProperty("media")
  @Override
  public Optional<List<DiagnosticReport_Media>> media() {
    return Optional.ofNullable(media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableDiagnosticReport(
        newValue,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableDiagnosticReport(
        value,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        newValue,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        value,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        newValue,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        value,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#issued() issued} attribute.
   * @param value The value for issued
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withIssued(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "issued");
    if (this.issued == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        newValue,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#issued() issued} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issued
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withIssued(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.issued == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        value,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiagnosticReport#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiagnosticReport withCode(CodeableConcept value) {
    if (this.code == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "code");
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        newValue,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        newValue,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        value,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withStatus(DiagnosticreportStatus value) {
    @Nullable DiagnosticreportStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        newValue,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withStatus(Optional<? extends DiagnosticreportStatus> optional) {
    @Nullable DiagnosticreportStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        value,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        newValue,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        value,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        newValue,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        value,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        newValue,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        value,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        newValue,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        value,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#conclusionCode() conclusionCode} attribute.
   * @param value The value for conclusionCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withConclusionCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "conclusionCode");
    if (this.conclusionCode == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        newValue,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#conclusionCode() conclusionCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for conclusionCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withConclusionCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.conclusionCode == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        value,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        newValue,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        value,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiagnosticReport#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiagnosticReport withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        newValue,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        newValue,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        value,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        newValue,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        value,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#effectiveDateTime() effectiveDateTime} attribute.
   * @param value The value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withEffectiveDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "effectiveDateTime");
    if (Objects.equals(this.effectiveDateTime, newValue)) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        newValue,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#effectiveDateTime() effectiveDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withEffectiveDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.effectiveDateTime, value)) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        value,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#imagingStudy() imagingStudy} attribute.
   * @param value The value for imagingStudy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withImagingStudy(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "imagingStudy");
    if (this.imagingStudy == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        newValue,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#imagingStudy() imagingStudy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for imagingStudy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withImagingStudy(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.imagingStudy == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        value,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        newValue,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        value,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#resultsInterpreter() resultsInterpreter} attribute.
   * @param value The value for resultsInterpreter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withResultsInterpreter(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "resultsInterpreter");
    if (this.resultsInterpreter == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        newValue,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#resultsInterpreter() resultsInterpreter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resultsInterpreter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withResultsInterpreter(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.resultsInterpreter == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        value,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        newValue,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        value,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#specimen() specimen} attribute.
   * @param value The value for specimen
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withSpecimen(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "specimen");
    if (this.specimen == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        newValue,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#specimen() specimen} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specimen
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withSpecimen(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.specimen == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        value,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        newValue,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        value,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#conclusion() conclusion} attribute.
   * @param value The value for conclusion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withConclusion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "conclusion");
    if (Objects.equals(this.conclusion, newValue)) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        newValue,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#conclusion() conclusion} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for conclusion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withConclusion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.conclusion, value)) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        value,
        this.presentedForm,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#presentedForm() presentedForm} attribute.
   * @param value The value for presentedForm
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withPresentedForm(List<Attachment> value) {
    @Nullable List<Attachment> newValue = Objects.requireNonNull(value, "presentedForm");
    if (this.presentedForm == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        newValue,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#presentedForm() presentedForm} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for presentedForm
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withPresentedForm(Optional<? extends List<Attachment>> optional) {
    @Nullable List<Attachment> value = optional.orElse(null);
    if (this.presentedForm == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        value,
        this.performer,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withPerformer(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        newValue,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withPerformer(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        value,
        this.result,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#result() result} attribute.
   * @param value The value for result
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withResult(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "result");
    if (this.result == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        newValue,
        this.media);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#result() result} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for result
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withResult(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.result == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        value,
        this.media);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#media() media} attribute.
   * @param value The value for media
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withMedia(List<DiagnosticReport_Media> value) {
    @Nullable List<DiagnosticReport_Media> newValue = Objects.requireNonNull(value, "media");
    if (this.media == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#media() media} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for media
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withMedia(Optional<? extends List<DiagnosticReport_Media>> optional) {
    @Nullable List<DiagnosticReport_Media> value = optional.orElse(null);
    if (this.media == value) return this;
    return new ImmutableDiagnosticReport(
        this.encounter,
        this.implicitRules,
        this.category,
        this.issued,
        this.code,
        this.language,
        this.status,
        this.effectivePeriod,
        this.contained,
        this.identifier,
        this.modifierExtension,
        this.conclusionCode,
        this.subject,
        this.resourceType,
        this.meta,
        this.basedOn,
        this.effectiveDateTime,
        this.imagingStudy,
        this.id,
        this.resultsInterpreter,
        this.text,
        this.specimen,
        this.extension,
        this.conclusion,
        this.presentedForm,
        this.performer,
        this.result,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDiagnosticReport} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDiagnosticReport
        && equalTo((ImmutableDiagnosticReport) another);
  }

  private boolean equalTo(ImmutableDiagnosticReport another) {
    return Objects.equals(encounter, another.encounter)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(category, another.category)
        && Objects.equals(issued, another.issued)
        && code.equals(another.code)
        && Objects.equals(language, another.language)
        && Objects.equals(status, another.status)
        && Objects.equals(effectivePeriod, another.effectivePeriod)
        && Objects.equals(contained, another.contained)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(conclusionCode, another.conclusionCode)
        && Objects.equals(subject, another.subject)
        && resourceType.equals(another.resourceType)
        && Objects.equals(meta, another.meta)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(effectiveDateTime, another.effectiveDateTime)
        && Objects.equals(imagingStudy, another.imagingStudy)
        && Objects.equals(id, another.id)
        && Objects.equals(resultsInterpreter, another.resultsInterpreter)
        && Objects.equals(text, another.text)
        && Objects.equals(specimen, another.specimen)
        && Objects.equals(extension, another.extension)
        && Objects.equals(conclusion, another.conclusion)
        && Objects.equals(presentedForm, another.presentedForm)
        && Objects.equals(performer, another.performer)
        && Objects.equals(result, another.result)
        && Objects.equals(media, another.media);
  }

  /**
   * Computes a hash code from attributes: {@code encounter}, {@code implicitRules}, {@code category}, {@code issued}, {@code code}, {@code language}, {@code status}, {@code effectivePeriod}, {@code contained}, {@code identifier}, {@code modifierExtension}, {@code conclusionCode}, {@code subject}, {@code resourceType}, {@code meta}, {@code basedOn}, {@code effectiveDateTime}, {@code imagingStudy}, {@code id}, {@code resultsInterpreter}, {@code text}, {@code specimen}, {@code extension}, {@code conclusion}, {@code presentedForm}, {@code performer}, {@code result}, {@code media}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(issued);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(effectivePeriod);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(conclusionCode);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(effectiveDateTime);
    h += (h << 5) + Objects.hashCode(imagingStudy);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(resultsInterpreter);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(specimen);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(conclusion);
    h += (h << 5) + Objects.hashCode(presentedForm);
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + Objects.hashCode(result);
    h += (h << 5) + Objects.hashCode(media);
    return h;
  }

  /**
   * Prints the immutable value {@code DiagnosticReport} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DiagnosticReport{");
    if (encounter != null) {
      builder.append("encounter=").append(encounter);
    }
    if (implicitRules != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (category != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (issued != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("issued=").append(issued);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("code=").append(code);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (conclusionCode != null) {
      builder.append(", ");
      builder.append("conclusionCode=").append(conclusionCode);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (effectiveDateTime != null) {
      builder.append(", ");
      builder.append("effectiveDateTime=").append(effectiveDateTime);
    }
    if (imagingStudy != null) {
      builder.append(", ");
      builder.append("imagingStudy=").append(imagingStudy);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (resultsInterpreter != null) {
      builder.append(", ");
      builder.append("resultsInterpreter=").append(resultsInterpreter);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (specimen != null) {
      builder.append(", ");
      builder.append("specimen=").append(specimen);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (conclusion != null) {
      builder.append(", ");
      builder.append("conclusion=").append(conclusion);
    }
    if (presentedForm != null) {
      builder.append(", ");
      builder.append("presentedForm=").append(presentedForm);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (result != null) {
      builder.append(", ");
      builder.append("result=").append(result);
    }
    if (media != null) {
      builder.append(", ");
      builder.append("media=").append(media);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DiagnosticReport", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DiagnosticReport {
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<Instant> issued = Optional.empty();
    boolean issuedIsSet;
    @Nullable CodeableConcept code;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<DiagnosticreportStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Period> effectivePeriod = Optional.empty();
    boolean effectivePeriodIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<CodeableConcept>> conclusionCode = Optional.empty();
    boolean conclusionCodeIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<String> effectiveDateTime = Optional.empty();
    boolean effectiveDateTimeIsSet;
    @Nullable Optional<List<Reference>> imagingStudy = Optional.empty();
    boolean imagingStudyIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Reference>> resultsInterpreter = Optional.empty();
    boolean resultsInterpreterIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Reference>> specimen = Optional.empty();
    boolean specimenIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> conclusion = Optional.empty();
    boolean conclusionIsSet;
    @Nullable Optional<List<Attachment>> presentedForm = Optional.empty();
    boolean presentedFormIsSet;
    @Nullable Optional<List<Reference>> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable Optional<List<Reference>> result = Optional.empty();
    boolean resultIsSet;
    @Nullable Optional<List<DiagnosticReport_Media>> media = Optional.empty();
    boolean mediaIsSet;
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("issued")
    public void setIssued(Optional<Instant> issued) {
      this.issued = issued;
      this.issuedIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
      this.code = code;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<DiagnosticreportStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("effectivePeriod")
    public void setEffectivePeriod(Optional<Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("conclusionCode")
    public void setConclusionCode(Optional<List<CodeableConcept>> conclusionCode) {
      this.conclusionCode = conclusionCode;
      this.conclusionCodeIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
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
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("effectiveDateTime")
    public void setEffectiveDateTime(Optional<String> effectiveDateTime) {
      this.effectiveDateTime = effectiveDateTime;
      this.effectiveDateTimeIsSet = true;
    }
    @JsonProperty("imagingStudy")
    public void setImagingStudy(Optional<List<Reference>> imagingStudy) {
      this.imagingStudy = imagingStudy;
      this.imagingStudyIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("resultsInterpreter")
    public void setResultsInterpreter(Optional<List<Reference>> resultsInterpreter) {
      this.resultsInterpreter = resultsInterpreter;
      this.resultsInterpreterIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("specimen")
    public void setSpecimen(Optional<List<Reference>> specimen) {
      this.specimen = specimen;
      this.specimenIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("conclusion")
    public void setConclusion(Optional<String> conclusion) {
      this.conclusion = conclusion;
      this.conclusionIsSet = true;
    }
    @JsonProperty("presentedForm")
    public void setPresentedForm(Optional<List<Attachment>> presentedForm) {
      this.presentedForm = presentedForm;
      this.presentedFormIsSet = true;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<List<Reference>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @JsonProperty("result")
    public void setResult(Optional<List<Reference>> result) {
      this.result = result;
      this.resultIsSet = true;
    }
    @JsonProperty("media")
    public void setMedia(Optional<List<DiagnosticReport_Media>> media) {
      this.media = media;
      this.mediaIsSet = true;
    }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> issued() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DiagnosticreportStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> conclusionCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> effectiveDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> imagingStudy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> resultsInterpreter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> specimen() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> conclusion() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Attachment>> presentedForm() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> result() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DiagnosticReport_Media>> media() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDiagnosticReport fromJson(Json json) {
    ImmutableDiagnosticReport.Builder builder = ((ImmutableDiagnosticReport.Builder) ImmutableDiagnosticReport.builder());
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.issuedIsSet) {
      builder.issued(json.issued);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.conclusionCodeIsSet) {
      builder.conclusionCode(json.conclusionCode);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.effectiveDateTimeIsSet) {
      builder.effectiveDateTime(json.effectiveDateTime);
    }
    if (json.imagingStudyIsSet) {
      builder.imagingStudy(json.imagingStudy);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resultsInterpreterIsSet) {
      builder.resultsInterpreter(json.resultsInterpreter);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.specimenIsSet) {
      builder.specimen(json.specimen);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.conclusionIsSet) {
      builder.conclusion(json.conclusion);
    }
    if (json.presentedFormIsSet) {
      builder.presentedForm(json.presentedForm);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.resultIsSet) {
      builder.result(json.result);
    }
    if (json.mediaIsSet) {
      builder.media(json.media);
    }
    return (ImmutableDiagnosticReport) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DiagnosticReport} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DiagnosticReport instance
   */
  public static DiagnosticReport copyOf(DiagnosticReport instance) {
    if (instance instanceof ImmutableDiagnosticReport) {
      return (ImmutableDiagnosticReport) instance;
    }
    return ((ImmutableDiagnosticReport.Builder) ImmutableDiagnosticReport.builder())
        .encounter(instance.encounter())
        .implicitRules(instance.implicitRules())
        .category(instance.category())
        .issued(instance.issued())
        .code(instance.code())
        .language(instance.language())
        .status(instance.status())
        .effectivePeriod(instance.effectivePeriod())
        .contained(instance.contained())
        .identifier(instance.identifier())
        .modifierExtension(instance.modifierExtension())
        .conclusionCode(instance.conclusionCode())
        .subject(instance.subject())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .basedOn(instance.basedOn())
        .effectiveDateTime(instance.effectiveDateTime())
        .imagingStudy(instance.imagingStudy())
        .id(instance.id())
        .resultsInterpreter(instance.resultsInterpreter())
        .text(instance.text())
        .specimen(instance.specimen())
        .extension(instance.extension())
        .conclusion(instance.conclusion())
        .presentedForm(instance.presentedForm())
        .performer(instance.performer())
        .result(instance.result())
        .media(instance.media())
        .build();
  }

  /**
   * Creates a builder for {@link DiagnosticReport DiagnosticReport}.
   * <pre>
   * ImmutableDiagnosticReport.builder()
   *    .encounter(com.medplum.types.fhir.Reference) // optional {@link DiagnosticReport#encounter() encounter}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link DiagnosticReport#implicitRules() implicitRules}
   *    .category(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link DiagnosticReport#category() category}
   *    .issued(com.medplum.types.fhir.Instant) // optional {@link DiagnosticReport#issued() issued}
   *    .code(com.medplum.types.fhir.CodeableConcept) // required {@link DiagnosticReport#code() code}
   *    .language(com.medplum.types.fhir.Code) // optional {@link DiagnosticReport#language() language}
   *    .status(com.medplum.types.fhir.DiagnosticreportStatus) // optional {@link DiagnosticReport#status() status}
   *    .effectivePeriod(com.medplum.types.fhir.Period) // optional {@link DiagnosticReport#effectivePeriod() effectivePeriod}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link DiagnosticReport#contained() contained}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link DiagnosticReport#identifier() identifier}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DiagnosticReport#modifierExtension() modifierExtension}
   *    .conclusionCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link DiagnosticReport#conclusionCode() conclusionCode}
   *    .subject(com.medplum.types.fhir.Reference) // optional {@link DiagnosticReport#subject() subject}
   *    .resourceType(String) // required {@link DiagnosticReport#resourceType() resourceType}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link DiagnosticReport#meta() meta}
   *    .basedOn(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link DiagnosticReport#basedOn() basedOn}
   *    .effectiveDateTime(String) // optional {@link DiagnosticReport#effectiveDateTime() effectiveDateTime}
   *    .imagingStudy(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link DiagnosticReport#imagingStudy() imagingStudy}
   *    .id(com.medplum.types.fhir.Id) // optional {@link DiagnosticReport#id() id}
   *    .resultsInterpreter(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link DiagnosticReport#resultsInterpreter() resultsInterpreter}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link DiagnosticReport#text() text}
   *    .specimen(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link DiagnosticReport#specimen() specimen}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DiagnosticReport#extension() extension}
   *    .conclusion(String) // optional {@link DiagnosticReport#conclusion() conclusion}
   *    .presentedForm(List&amp;lt;com.medplum.types.fhir.Attachment&amp;gt;) // optional {@link DiagnosticReport#presentedForm() presentedForm}
   *    .performer(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link DiagnosticReport#performer() performer}
   *    .result(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link DiagnosticReport#result() result}
   *    .media(List&amp;lt;com.medplum.types.fhir.DiagnosticReport_Media&amp;gt;) // optional {@link DiagnosticReport#media() media}
   *    .build();
   * </pre>
   * @return A new DiagnosticReport builder
   */
  public static CodeBuildStage builder() {
    return new ImmutableDiagnosticReport.Builder();
  }

  /**
   * Builds instances of type {@link DiagnosticReport DiagnosticReport}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DiagnosticReport", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CodeBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_ENCOUNTER = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_CATEGORY = 0x4L;
    private static final long OPT_BIT_ISSUED = 0x8L;
    private static final long OPT_BIT_LANGUAGE = 0x10L;
    private static final long OPT_BIT_STATUS = 0x20L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x40L;
    private static final long OPT_BIT_CONTAINED = 0x80L;
    private static final long OPT_BIT_IDENTIFIER = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_CONCLUSION_CODE = 0x400L;
    private static final long OPT_BIT_SUBJECT = 0x800L;
    private static final long OPT_BIT_META = 0x1000L;
    private static final long OPT_BIT_BASED_ON = 0x2000L;
    private static final long OPT_BIT_EFFECTIVE_DATE_TIME = 0x4000L;
    private static final long OPT_BIT_IMAGING_STUDY = 0x8000L;
    private static final long OPT_BIT_ID = 0x10000L;
    private static final long OPT_BIT_RESULTS_INTERPRETER = 0x20000L;
    private static final long OPT_BIT_TEXT = 0x40000L;
    private static final long OPT_BIT_SPECIMEN = 0x80000L;
    private static final long OPT_BIT_EXTENSION = 0x100000L;
    private static final long OPT_BIT_CONCLUSION = 0x200000L;
    private static final long OPT_BIT_PRESENTED_FORM = 0x400000L;
    private static final long OPT_BIT_PERFORMER = 0x800000L;
    private static final long OPT_BIT_RESULT = 0x1000000L;
    private static final long OPT_BIT_MEDIA = 0x2000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable Reference encounter;
    private @Nullable Uri implicitRules;
    private @Nullable List<CodeableConcept> category;
    private @Nullable Instant issued;
    private @Nullable CodeableConcept code;
    private @Nullable Code language;
    private @Nullable DiagnosticreportStatus status;
    private @Nullable Period effectivePeriod;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<CodeableConcept> conclusionCode;
    private @Nullable Reference subject;
    private @Nullable String resourceType;
    private @Nullable Meta meta;
    private @Nullable List<Reference> basedOn;
    private @Nullable String effectiveDateTime;
    private @Nullable List<Reference> imagingStudy;
    private @Nullable Id id;
    private @Nullable List<Reference> resultsInterpreter;
    private @Nullable Narrative text;
    private @Nullable List<Reference> specimen;
    private @Nullable List<Extension> extension;
    private @Nullable String conclusion;
    private @Nullable List<Attachment> presentedForm;
    private @Nullable List<Reference> performer;
    private @Nullable List<Reference> result;
    private @Nullable List<DiagnosticReport_Media> media;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link DiagnosticReport#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link DiagnosticReport#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DiagnosticReport#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DiagnosticReport#category() category} to category.
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
     * Initializes the optional value {@link DiagnosticReport#category() category} to category.
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
     * Initializes the optional value {@link DiagnosticReport#issued() issued} to issued.
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
     * Initializes the optional value {@link DiagnosticReport#issued() issued} to issued.
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
     * Initializes the value for the {@link DiagnosticReport#code() code} attribute.
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
     * Initializes the optional value {@link DiagnosticReport#language() language} to language.
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
     * Initializes the optional value {@link DiagnosticReport#language() language} to language.
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
     * Initializes the optional value {@link DiagnosticReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(DiagnosticreportStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends DiagnosticreportStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link DiagnosticReport#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link DiagnosticReport#contained() contained} to contained.
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
     * Initializes the optional value {@link DiagnosticReport#contained() contained} to contained.
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
     * Initializes the optional value {@link DiagnosticReport#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DiagnosticReport#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DiagnosticReport#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DiagnosticReport#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DiagnosticReport#conclusionCode() conclusionCode} to conclusionCode.
     * @param conclusionCode The value for conclusionCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder conclusionCode(List<CodeableConcept> conclusionCode) {
      checkNotIsSet(conclusionCodeIsSet(), "conclusionCode");
      this.conclusionCode = Objects.requireNonNull(conclusionCode, "conclusionCode");
      optBits |= OPT_BIT_CONCLUSION_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#conclusionCode() conclusionCode} to conclusionCode.
     * @param conclusionCode The value for conclusionCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("conclusionCode")
    public final Builder conclusionCode(Optional<? extends List<CodeableConcept>> conclusionCode) {
      checkNotIsSet(conclusionCodeIsSet(), "conclusionCode");
      this.conclusionCode = conclusionCode.orElse(null);
      optBits |= OPT_BIT_CONCLUSION_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#subject() subject} to subject.
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
     * Initializes the optional value {@link DiagnosticReport#subject() subject} to subject.
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
     * Initializes the value for the {@link DiagnosticReport#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link DiagnosticReport#meta() meta} to meta.
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
     * Initializes the optional value {@link DiagnosticReport#meta() meta} to meta.
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
     * Initializes the optional value {@link DiagnosticReport#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link DiagnosticReport#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link DiagnosticReport#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
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
     * Initializes the optional value {@link DiagnosticReport#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
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
     * Initializes the optional value {@link DiagnosticReport#imagingStudy() imagingStudy} to imagingStudy.
     * @param imagingStudy The value for imagingStudy
     * @return {@code this} builder for chained invocation
     */
    public final Builder imagingStudy(List<Reference> imagingStudy) {
      checkNotIsSet(imagingStudyIsSet(), "imagingStudy");
      this.imagingStudy = Objects.requireNonNull(imagingStudy, "imagingStudy");
      optBits |= OPT_BIT_IMAGING_STUDY;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#imagingStudy() imagingStudy} to imagingStudy.
     * @param imagingStudy The value for imagingStudy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("imagingStudy")
    public final Builder imagingStudy(Optional<? extends List<Reference>> imagingStudy) {
      checkNotIsSet(imagingStudyIsSet(), "imagingStudy");
      this.imagingStudy = imagingStudy.orElse(null);
      optBits |= OPT_BIT_IMAGING_STUDY;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#id() id} to id.
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
     * Initializes the optional value {@link DiagnosticReport#id() id} to id.
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
     * Initializes the optional value {@link DiagnosticReport#resultsInterpreter() resultsInterpreter} to resultsInterpreter.
     * @param resultsInterpreter The value for resultsInterpreter
     * @return {@code this} builder for chained invocation
     */
    public final Builder resultsInterpreter(List<Reference> resultsInterpreter) {
      checkNotIsSet(resultsInterpreterIsSet(), "resultsInterpreter");
      this.resultsInterpreter = Objects.requireNonNull(resultsInterpreter, "resultsInterpreter");
      optBits |= OPT_BIT_RESULTS_INTERPRETER;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#resultsInterpreter() resultsInterpreter} to resultsInterpreter.
     * @param resultsInterpreter The value for resultsInterpreter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resultsInterpreter")
    public final Builder resultsInterpreter(Optional<? extends List<Reference>> resultsInterpreter) {
      checkNotIsSet(resultsInterpreterIsSet(), "resultsInterpreter");
      this.resultsInterpreter = resultsInterpreter.orElse(null);
      optBits |= OPT_BIT_RESULTS_INTERPRETER;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#text() text} to text.
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
     * Initializes the optional value {@link DiagnosticReport#text() text} to text.
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
     * Initializes the optional value {@link DiagnosticReport#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    public final Builder specimen(List<Reference> specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = Objects.requireNonNull(specimen, "specimen");
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specimen")
    public final Builder specimen(Optional<? extends List<Reference>> specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = specimen.orElse(null);
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#extension() extension} to extension.
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
     * Initializes the optional value {@link DiagnosticReport#extension() extension} to extension.
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
     * Initializes the optional value {@link DiagnosticReport#conclusion() conclusion} to conclusion.
     * @param conclusion The value for conclusion
     * @return {@code this} builder for chained invocation
     */
    public final Builder conclusion(String conclusion) {
      checkNotIsSet(conclusionIsSet(), "conclusion");
      this.conclusion = Objects.requireNonNull(conclusion, "conclusion");
      optBits |= OPT_BIT_CONCLUSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#conclusion() conclusion} to conclusion.
     * @param conclusion The value for conclusion
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("conclusion")
    public final Builder conclusion(Optional<String> conclusion) {
      checkNotIsSet(conclusionIsSet(), "conclusion");
      this.conclusion = conclusion.orElse(null);
      optBits |= OPT_BIT_CONCLUSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#presentedForm() presentedForm} to presentedForm.
     * @param presentedForm The value for presentedForm
     * @return {@code this} builder for chained invocation
     */
    public final Builder presentedForm(List<Attachment> presentedForm) {
      checkNotIsSet(presentedFormIsSet(), "presentedForm");
      this.presentedForm = Objects.requireNonNull(presentedForm, "presentedForm");
      optBits |= OPT_BIT_PRESENTED_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#presentedForm() presentedForm} to presentedForm.
     * @param presentedForm The value for presentedForm
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("presentedForm")
    public final Builder presentedForm(Optional<? extends List<Attachment>> presentedForm) {
      checkNotIsSet(presentedFormIsSet(), "presentedForm");
      this.presentedForm = presentedForm.orElse(null);
      optBits |= OPT_BIT_PRESENTED_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#performer() performer} to performer.
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
     * Initializes the optional value {@link DiagnosticReport#performer() performer} to performer.
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
     * Initializes the optional value {@link DiagnosticReport#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for chained invocation
     */
    public final Builder result(List<Reference> result) {
      checkNotIsSet(resultIsSet(), "result");
      this.result = Objects.requireNonNull(result, "result");
      optBits |= OPT_BIT_RESULT;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("result")
    public final Builder result(Optional<? extends List<Reference>> result) {
      checkNotIsSet(resultIsSet(), "result");
      this.result = result.orElse(null);
      optBits |= OPT_BIT_RESULT;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#media() media} to media.
     * @param media The value for media
     * @return {@code this} builder for chained invocation
     */
    public final Builder media(List<DiagnosticReport_Media> media) {
      checkNotIsSet(mediaIsSet(), "media");
      this.media = Objects.requireNonNull(media, "media");
      optBits |= OPT_BIT_MEDIA;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#media() media} to media.
     * @param media The value for media
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("media")
    public final Builder media(Optional<? extends List<DiagnosticReport_Media>> media) {
      checkNotIsSet(mediaIsSet(), "media");
      this.media = media.orElse(null);
      optBits |= OPT_BIT_MEDIA;
      return this;
    }

    /**
     * Builds a new {@link DiagnosticReport DiagnosticReport}.
     * @return An immutable instance of DiagnosticReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DiagnosticReport build() {
      checkRequiredAttributes();
      return new ImmutableDiagnosticReport(
          encounter,
          implicitRules,
          category,
          issued,
          code,
          language,
          status,
          effectivePeriod,
          contained,
          identifier,
          modifierExtension,
          conclusionCode,
          subject,
          resourceType,
          meta,
          basedOn,
          effectiveDateTime,
          imagingStudy,
          id,
          resultsInterpreter,
          text,
          specimen,
          extension,
          conclusion,
          presentedForm,
          performer,
          result,
          media);
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean issuedIsSet() {
      return (optBits & OPT_BIT_ISSUED) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean conclusionCodeIsSet() {
      return (optBits & OPT_BIT_CONCLUSION_CODE) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean effectiveDateTimeIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_DATE_TIME) != 0;
    }

    private boolean imagingStudyIsSet() {
      return (optBits & OPT_BIT_IMAGING_STUDY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resultsInterpreterIsSet() {
      return (optBits & OPT_BIT_RESULTS_INTERPRETER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean specimenIsSet() {
      return (optBits & OPT_BIT_SPECIMEN) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean conclusionIsSet() {
      return (optBits & OPT_BIT_CONCLUSION) != 0;
    }

    private boolean presentedFormIsSet() {
      return (optBits & OPT_BIT_PRESENTED_FORM) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean resultIsSet() {
      return (optBits & OPT_BIT_RESULT) != 0;
    }

    private boolean mediaIsSet() {
      return (optBits & OPT_BIT_MEDIA) != 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DiagnosticReport is strict, attribute is already set: ".concat(name));
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
      return "Cannot build DiagnosticReport, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "DiagnosticReport", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link DiagnosticReport#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage code(CodeableConcept code);
  }

  @Generated(from = "DiagnosticReport", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link DiagnosticReport#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "DiagnosticReport", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DiagnosticReport#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link DiagnosticReport#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link DiagnosticReport#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link DiagnosticReport#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link DiagnosticReport#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link DiagnosticReport#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link DiagnosticReport#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    BuildFinal issued(Instant issued);

    /**
     * Initializes the optional value {@link DiagnosticReport#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal issued(Optional<? extends Instant> issued);

    /**
     * Initializes the optional value {@link DiagnosticReport#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link DiagnosticReport#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link DiagnosticReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(DiagnosticreportStatus status);

    /**
     * Initializes the optional value {@link DiagnosticReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends DiagnosticreportStatus> status);

    /**
     * Initializes the optional value {@link DiagnosticReport#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(Period effectivePeriod);

    /**
     * Initializes the optional value {@link DiagnosticReport#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(Optional<? extends Period> effectivePeriod);

    /**
     * Initializes the optional value {@link DiagnosticReport#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link DiagnosticReport#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link DiagnosticReport#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link DiagnosticReport#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link DiagnosticReport#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DiagnosticReport#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DiagnosticReport#conclusionCode() conclusionCode} to conclusionCode.
     * @param conclusionCode The value for conclusionCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal conclusionCode(List<CodeableConcept> conclusionCode);

    /**
     * Initializes the optional value {@link DiagnosticReport#conclusionCode() conclusionCode} to conclusionCode.
     * @param conclusionCode The value for conclusionCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal conclusionCode(Optional<? extends List<CodeableConcept>> conclusionCode);

    /**
     * Initializes the optional value {@link DiagnosticReport#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link DiagnosticReport#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link DiagnosticReport#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link DiagnosticReport#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link DiagnosticReport#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link DiagnosticReport#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link DiagnosticReport#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectiveDateTime(String effectiveDateTime);

    /**
     * Initializes the optional value {@link DiagnosticReport#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectiveDateTime(Optional<String> effectiveDateTime);

    /**
     * Initializes the optional value {@link DiagnosticReport#imagingStudy() imagingStudy} to imagingStudy.
     * @param imagingStudy The value for imagingStudy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal imagingStudy(List<Reference> imagingStudy);

    /**
     * Initializes the optional value {@link DiagnosticReport#imagingStudy() imagingStudy} to imagingStudy.
     * @param imagingStudy The value for imagingStudy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal imagingStudy(Optional<? extends List<Reference>> imagingStudy);

    /**
     * Initializes the optional value {@link DiagnosticReport#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link DiagnosticReport#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link DiagnosticReport#resultsInterpreter() resultsInterpreter} to resultsInterpreter.
     * @param resultsInterpreter The value for resultsInterpreter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resultsInterpreter(List<Reference> resultsInterpreter);

    /**
     * Initializes the optional value {@link DiagnosticReport#resultsInterpreter() resultsInterpreter} to resultsInterpreter.
     * @param resultsInterpreter The value for resultsInterpreter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resultsInterpreter(Optional<? extends List<Reference>> resultsInterpreter);

    /**
     * Initializes the optional value {@link DiagnosticReport#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link DiagnosticReport#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link DiagnosticReport#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specimen(List<Reference> specimen);

    /**
     * Initializes the optional value {@link DiagnosticReport#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specimen(Optional<? extends List<Reference>> specimen);

    /**
     * Initializes the optional value {@link DiagnosticReport#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link DiagnosticReport#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link DiagnosticReport#conclusion() conclusion} to conclusion.
     * @param conclusion The value for conclusion
     * @return {@code this} builder for chained invocation
     */
    BuildFinal conclusion(String conclusion);

    /**
     * Initializes the optional value {@link DiagnosticReport#conclusion() conclusion} to conclusion.
     * @param conclusion The value for conclusion
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal conclusion(Optional<String> conclusion);

    /**
     * Initializes the optional value {@link DiagnosticReport#presentedForm() presentedForm} to presentedForm.
     * @param presentedForm The value for presentedForm
     * @return {@code this} builder for chained invocation
     */
    BuildFinal presentedForm(List<Attachment> presentedForm);

    /**
     * Initializes the optional value {@link DiagnosticReport#presentedForm() presentedForm} to presentedForm.
     * @param presentedForm The value for presentedForm
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal presentedForm(Optional<? extends List<Attachment>> presentedForm);

    /**
     * Initializes the optional value {@link DiagnosticReport#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(List<Reference> performer);

    /**
     * Initializes the optional value {@link DiagnosticReport#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(Optional<? extends List<Reference>> performer);

    /**
     * Initializes the optional value {@link DiagnosticReport#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for chained invocation
     */
    BuildFinal result(List<Reference> result);

    /**
     * Initializes the optional value {@link DiagnosticReport#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal result(Optional<? extends List<Reference>> result);

    /**
     * Initializes the optional value {@link DiagnosticReport#media() media} to media.
     * @param media The value for media
     * @return {@code this} builder for chained invocation
     */
    BuildFinal media(List<DiagnosticReport_Media> media);

    /**
     * Initializes the optional value {@link DiagnosticReport#media() media} to media.
     * @param media The value for media
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal media(Optional<? extends List<DiagnosticReport_Media>> media);

    /**
     * Builds a new {@link DiagnosticReport DiagnosticReport}.
     * @return An immutable instance of DiagnosticReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DiagnosticReport build();
  }
}
