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
 * Immutable implementation of {@link DetectedIssue}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDetectedIssue.builder()}.
 */
@Generated(from = "DetectedIssue", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDetectedIssue implements DetectedIssue {
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Extension> extension;
  private final @Nullable DetectedissueSeverity severity;
  private final @Nullable Code language;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Meta meta;
  private final @Nullable Narrative text;
  private final @Nullable CodeableConcept code;
  private final @Nullable Code status;
  private final @Nullable Reference patient;
  private final @Nullable List<DetectedIssue_Evidence> evidence;
  private final @Nullable List<Reference> implicated;
  private final @Nullable Reference author;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String detail;
  private final @Nullable Period identifiedPeriod;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Id id;
  private final String resourceType;
  private final @Nullable String identifiedDateTime;
  private final @Nullable Uri reference;
  private final @Nullable List<DetectedIssue_Mitigation> mitigation;

  private ImmutableDetectedIssue(
      @Nullable Uri implicitRules,
      @Nullable List<Extension> extension,
      @Nullable DetectedissueSeverity severity,
      @Nullable Code language,
      @Nullable List<ResourceList> contained,
      @Nullable Meta meta,
      @Nullable Narrative text,
      @Nullable CodeableConcept code,
      @Nullable Code status,
      @Nullable Reference patient,
      @Nullable List<DetectedIssue_Evidence> evidence,
      @Nullable List<Reference> implicated,
      @Nullable Reference author,
      @Nullable List<Extension> modifierExtension,
      @Nullable String detail,
      @Nullable Period identifiedPeriod,
      @Nullable List<Identifier> identifier,
      @Nullable Id id,
      String resourceType,
      @Nullable String identifiedDateTime,
      @Nullable Uri reference,
      @Nullable List<DetectedIssue_Mitigation> mitigation) {
    this.implicitRules = implicitRules;
    this.extension = extension;
    this.severity = severity;
    this.language = language;
    this.contained = contained;
    this.meta = meta;
    this.text = text;
    this.code = code;
    this.status = status;
    this.patient = patient;
    this.evidence = evidence;
    this.implicated = implicated;
    this.author = author;
    this.modifierExtension = modifierExtension;
    this.detail = detail;
    this.identifiedPeriod = identifiedPeriod;
    this.identifier = identifier;
    this.id = id;
    this.resourceType = resourceType;
    this.identifiedDateTime = identifiedDateTime;
    this.reference = reference;
    this.mitigation = mitigation;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code severity} attribute
   */
  @JsonProperty("severity")
  @Override
  public Optional<DetectedissueSeverity> severity() {
    return Optional.ofNullable(severity);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code patient} attribute
   */
  @JsonProperty("patient")
  @Override
  public Optional<Reference> patient() {
    return Optional.ofNullable(patient);
  }

  /**
   * @return The value of the {@code evidence} attribute
   */
  @JsonProperty("evidence")
  @Override
  public Optional<List<DetectedIssue_Evidence>> evidence() {
    return Optional.ofNullable(evidence);
  }

  /**
   * @return The value of the {@code implicated} attribute
   */
  @JsonProperty("implicated")
  @Override
  public Optional<List<Reference>> implicated() {
    return Optional.ofNullable(implicated);
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<Reference> author() {
    return Optional.ofNullable(author);
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
   * @return The value of the {@code detail} attribute
   */
  @JsonProperty("detail")
  @Override
  public Optional<String> detail() {
    return Optional.ofNullable(detail);
  }

  /**
   * @return The value of the {@code identifiedPeriod} attribute
   */
  @JsonProperty("identifiedPeriod")
  @Override
  public Optional<Period> identifiedPeriod() {
    return Optional.ofNullable(identifiedPeriod);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code identifiedDateTime} attribute
   */
  @JsonProperty("identifiedDateTime")
  @Override
  public Optional<String> identifiedDateTime() {
    return Optional.ofNullable(identifiedDateTime);
  }

  /**
   * @return The value of the {@code reference} attribute
   */
  @JsonProperty("reference")
  @Override
  public Optional<Uri> reference() {
    return Optional.ofNullable(reference);
  }

  /**
   * @return The value of the {@code mitigation} attribute
   */
  @JsonProperty("mitigation")
  @Override
  public Optional<List<DetectedIssue_Mitigation>> mitigation() {
    return Optional.ofNullable(mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDetectedIssue(
        newValue,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDetectedIssue(
        value,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        newValue,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        value,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#severity() severity} attribute.
   * @param value The value for severity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withSeverity(DetectedissueSeverity value) {
    @Nullable DetectedissueSeverity newValue = Objects.requireNonNull(value, "severity");
    if (this.severity == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        newValue,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#severity() severity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for severity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withSeverity(Optional<? extends DetectedissueSeverity> optional) {
    @Nullable DetectedissueSeverity value = optional.orElse(null);
    if (this.severity == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        value,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        newValue,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        value,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        newValue,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        value,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        newValue,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        value,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        newValue,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        value,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        newValue,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        value,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        newValue,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        value,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#patient() patient} attribute.
   * @param value The value for patient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withPatient(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "patient");
    if (this.patient == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        newValue,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#patient() patient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withPatient(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.patient == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        value,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#evidence() evidence} attribute.
   * @param value The value for evidence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withEvidence(List<DetectedIssue_Evidence> value) {
    @Nullable List<DetectedIssue_Evidence> newValue = Objects.requireNonNull(value, "evidence");
    if (this.evidence == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        newValue,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#evidence() evidence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for evidence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withEvidence(Optional<? extends List<DetectedIssue_Evidence>> optional) {
    @Nullable List<DetectedIssue_Evidence> value = optional.orElse(null);
    if (this.evidence == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        value,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#implicated() implicated} attribute.
   * @param value The value for implicated
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withImplicated(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "implicated");
    if (this.implicated == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        newValue,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#implicated() implicated} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicated
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withImplicated(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.implicated == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        value,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withAuthor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        newValue,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withAuthor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        value,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        newValue,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        value,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withDetail(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "detail");
    if (Objects.equals(this.detail, newValue)) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        newValue,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#detail() detail} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withDetail(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.detail, value)) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        value,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#identifiedPeriod() identifiedPeriod} attribute.
   * @param value The value for identifiedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withIdentifiedPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "identifiedPeriod");
    if (this.identifiedPeriod == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        newValue,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#identifiedPeriod() identifiedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifiedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withIdentifiedPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.identifiedPeriod == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        value,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        newValue,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        value,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        newValue,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        value,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DetectedIssue#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDetectedIssue withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        newValue,
        this.identifiedDateTime,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#identifiedDateTime() identifiedDateTime} attribute.
   * @param value The value for identifiedDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withIdentifiedDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "identifiedDateTime");
    if (Objects.equals(this.identifiedDateTime, newValue)) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        newValue,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#identifiedDateTime() identifiedDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifiedDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withIdentifiedDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.identifiedDateTime, value)) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        value,
        this.reference,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#reference() reference} attribute.
   * @param value The value for reference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withReference(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "reference");
    if (this.reference == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        newValue,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#reference() reference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withReference(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.reference == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        value,
        this.mitigation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#mitigation() mitigation} attribute.
   * @param value The value for mitigation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withMitigation(List<DetectedIssue_Mitigation> value) {
    @Nullable List<DetectedIssue_Mitigation> newValue = Objects.requireNonNull(value, "mitigation");
    if (this.mitigation == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#mitigation() mitigation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mitigation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withMitigation(Optional<? extends List<DetectedIssue_Mitigation>> optional) {
    @Nullable List<DetectedIssue_Mitigation> value = optional.orElse(null);
    if (this.mitigation == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.extension,
        this.severity,
        this.language,
        this.contained,
        this.meta,
        this.text,
        this.code,
        this.status,
        this.patient,
        this.evidence,
        this.implicated,
        this.author,
        this.modifierExtension,
        this.detail,
        this.identifiedPeriod,
        this.identifier,
        this.id,
        this.resourceType,
        this.identifiedDateTime,
        this.reference,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDetectedIssue} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDetectedIssue
        && equalTo((ImmutableDetectedIssue) another);
  }

  private boolean equalTo(ImmutableDetectedIssue another) {
    return Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(extension, another.extension)
        && Objects.equals(severity, another.severity)
        && Objects.equals(language, another.language)
        && Objects.equals(contained, another.contained)
        && Objects.equals(meta, another.meta)
        && Objects.equals(text, another.text)
        && Objects.equals(code, another.code)
        && Objects.equals(status, another.status)
        && Objects.equals(patient, another.patient)
        && Objects.equals(evidence, another.evidence)
        && Objects.equals(implicated, another.implicated)
        && Objects.equals(author, another.author)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(detail, another.detail)
        && Objects.equals(identifiedPeriod, another.identifiedPeriod)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(id, another.id)
        && resourceType.equals(another.resourceType)
        && Objects.equals(identifiedDateTime, another.identifiedDateTime)
        && Objects.equals(reference, another.reference)
        && Objects.equals(mitigation, another.mitigation);
  }

  /**
   * Computes a hash code from attributes: {@code implicitRules}, {@code extension}, {@code severity}, {@code language}, {@code contained}, {@code meta}, {@code text}, {@code code}, {@code status}, {@code patient}, {@code evidence}, {@code implicated}, {@code author}, {@code modifierExtension}, {@code detail}, {@code identifiedPeriod}, {@code identifier}, {@code id}, {@code resourceType}, {@code identifiedDateTime}, {@code reference}, {@code mitigation}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(severity);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(patient);
    h += (h << 5) + Objects.hashCode(evidence);
    h += (h << 5) + Objects.hashCode(implicated);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(detail);
    h += (h << 5) + Objects.hashCode(identifiedPeriod);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(identifiedDateTime);
    h += (h << 5) + Objects.hashCode(reference);
    h += (h << 5) + Objects.hashCode(mitigation);
    return h;
  }

  /**
   * Prints the immutable value {@code DetectedIssue} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DetectedIssue{");
    if (implicitRules != null) {
      builder.append("implicitRules=").append(implicitRules);
    }
    if (extension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (severity != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("severity=").append(severity);
    }
    if (language != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (contained != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (meta != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (text != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (code != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (status != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (patient != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("patient=").append(patient);
    }
    if (evidence != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("evidence=").append(evidence);
    }
    if (implicated != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("implicated=").append(implicated);
    }
    if (author != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (modifierExtension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (detail != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("detail=").append(detail);
    }
    if (identifiedPeriod != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("identifiedPeriod=").append(identifiedPeriod);
    }
    if (identifier != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (id != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (identifiedDateTime != null) {
      builder.append(", ");
      builder.append("identifiedDateTime=").append(identifiedDateTime);
    }
    if (reference != null) {
      builder.append(", ");
      builder.append("reference=").append(reference);
    }
    if (mitigation != null) {
      builder.append(", ");
      builder.append("mitigation=").append(mitigation);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DetectedIssue", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DetectedIssue {
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<DetectedissueSeverity> severity = Optional.empty();
    boolean severityIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Reference> patient = Optional.empty();
    boolean patientIsSet;
    @Nullable Optional<List<DetectedIssue_Evidence>> evidence = Optional.empty();
    boolean evidenceIsSet;
    @Nullable Optional<List<Reference>> implicated = Optional.empty();
    boolean implicatedIsSet;
    @Nullable Optional<Reference> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> detail = Optional.empty();
    boolean detailIsSet;
    @Nullable Optional<Period> identifiedPeriod = Optional.empty();
    boolean identifiedPeriodIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable String resourceType;
    @Nullable Optional<String> identifiedDateTime = Optional.empty();
    boolean identifiedDateTimeIsSet;
    @Nullable Optional<Uri> reference = Optional.empty();
    boolean referenceIsSet;
    @Nullable Optional<List<DetectedIssue_Mitigation>> mitigation = Optional.empty();
    boolean mitigationIsSet;
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("severity")
    public void setSeverity(Optional<DetectedissueSeverity> severity) {
      this.severity = severity;
      this.severityIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Optional<Reference> patient) {
      this.patient = patient;
      this.patientIsSet = true;
    }
    @JsonProperty("evidence")
    public void setEvidence(Optional<List<DetectedIssue_Evidence>> evidence) {
      this.evidence = evidence;
      this.evidenceIsSet = true;
    }
    @JsonProperty("implicated")
    public void setImplicated(Optional<List<Reference>> implicated) {
      this.implicated = implicated;
      this.implicatedIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("detail")
    public void setDetail(Optional<String> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @JsonProperty("identifiedPeriod")
    public void setIdentifiedPeriod(Optional<Period> identifiedPeriod) {
      this.identifiedPeriod = identifiedPeriod;
      this.identifiedPeriodIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("identifiedDateTime")
    public void setIdentifiedDateTime(Optional<String> identifiedDateTime) {
      this.identifiedDateTime = identifiedDateTime;
      this.identifiedDateTimeIsSet = true;
    }
    @JsonProperty("reference")
    public void setReference(Optional<Uri> reference) {
      this.reference = reference;
      this.referenceIsSet = true;
    }
    @JsonProperty("mitigation")
    public void setMitigation(Optional<List<DetectedIssue_Mitigation>> mitigation) {
      this.mitigation = mitigation;
      this.mitigationIsSet = true;
    }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DetectedissueSeverity> severity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DetectedIssue_Evidence>> evidence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> implicated() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> detail() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> identifiedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> identifiedDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> reference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DetectedIssue_Mitigation>> mitigation() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDetectedIssue fromJson(Json json) {
    ImmutableDetectedIssue.Builder builder = ((ImmutableDetectedIssue.Builder) ImmutableDetectedIssue.builder());
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.severityIsSet) {
      builder.severity(json.severity);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.patientIsSet) {
      builder.patient(json.patient);
    }
    if (json.evidenceIsSet) {
      builder.evidence(json.evidence);
    }
    if (json.implicatedIsSet) {
      builder.implicated(json.implicated);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.identifiedPeriodIsSet) {
      builder.identifiedPeriod(json.identifiedPeriod);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.identifiedDateTimeIsSet) {
      builder.identifiedDateTime(json.identifiedDateTime);
    }
    if (json.referenceIsSet) {
      builder.reference(json.reference);
    }
    if (json.mitigationIsSet) {
      builder.mitigation(json.mitigation);
    }
    return (ImmutableDetectedIssue) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DetectedIssue} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DetectedIssue instance
   */
  public static DetectedIssue copyOf(DetectedIssue instance) {
    if (instance instanceof ImmutableDetectedIssue) {
      return (ImmutableDetectedIssue) instance;
    }
    return ((ImmutableDetectedIssue.Builder) ImmutableDetectedIssue.builder())
        .implicitRules(instance.implicitRules())
        .extension(instance.extension())
        .severity(instance.severity())
        .language(instance.language())
        .contained(instance.contained())
        .meta(instance.meta())
        .text(instance.text())
        .code(instance.code())
        .status(instance.status())
        .patient(instance.patient())
        .evidence(instance.evidence())
        .implicated(instance.implicated())
        .author(instance.author())
        .modifierExtension(instance.modifierExtension())
        .detail(instance.detail())
        .identifiedPeriod(instance.identifiedPeriod())
        .identifier(instance.identifier())
        .id(instance.id())
        .resourceType(instance.resourceType())
        .identifiedDateTime(instance.identifiedDateTime())
        .reference(instance.reference())
        .mitigation(instance.mitigation())
        .build();
  }

  /**
   * Creates a builder for {@link DetectedIssue DetectedIssue}.
   * <pre>
   * ImmutableDetectedIssue.builder()
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link DetectedIssue#implicitRules() implicitRules}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DetectedIssue#extension() extension}
   *    .severity(com.medplum.types.fhir.DetectedissueSeverity) // optional {@link DetectedIssue#severity() severity}
   *    .language(com.medplum.types.fhir.Code) // optional {@link DetectedIssue#language() language}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link DetectedIssue#contained() contained}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link DetectedIssue#meta() meta}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link DetectedIssue#text() text}
   *    .code(com.medplum.types.fhir.CodeableConcept) // optional {@link DetectedIssue#code() code}
   *    .status(com.medplum.types.fhir.Code) // optional {@link DetectedIssue#status() status}
   *    .patient(com.medplum.types.fhir.Reference) // optional {@link DetectedIssue#patient() patient}
   *    .evidence(List&amp;lt;com.medplum.types.fhir.DetectedIssue_Evidence&amp;gt;) // optional {@link DetectedIssue#evidence() evidence}
   *    .implicated(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link DetectedIssue#implicated() implicated}
   *    .author(com.medplum.types.fhir.Reference) // optional {@link DetectedIssue#author() author}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DetectedIssue#modifierExtension() modifierExtension}
   *    .detail(String) // optional {@link DetectedIssue#detail() detail}
   *    .identifiedPeriod(com.medplum.types.fhir.Period) // optional {@link DetectedIssue#identifiedPeriod() identifiedPeriod}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link DetectedIssue#identifier() identifier}
   *    .id(com.medplum.types.fhir.Id) // optional {@link DetectedIssue#id() id}
   *    .resourceType(String) // required {@link DetectedIssue#resourceType() resourceType}
   *    .identifiedDateTime(String) // optional {@link DetectedIssue#identifiedDateTime() identifiedDateTime}
   *    .reference(com.medplum.types.fhir.Uri) // optional {@link DetectedIssue#reference() reference}
   *    .mitigation(List&amp;lt;com.medplum.types.fhir.DetectedIssue_Mitigation&amp;gt;) // optional {@link DetectedIssue#mitigation() mitigation}
   *    .build();
   * </pre>
   * @return A new DetectedIssue builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableDetectedIssue.Builder();
  }

  /**
   * Builds instances of type {@link DetectedIssue DetectedIssue}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DetectedIssue", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_SEVERITY = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_CONTAINED = 0x10L;
    private static final long OPT_BIT_META = 0x20L;
    private static final long OPT_BIT_TEXT = 0x40L;
    private static final long OPT_BIT_CODE = 0x80L;
    private static final long OPT_BIT_STATUS = 0x100L;
    private static final long OPT_BIT_PATIENT = 0x200L;
    private static final long OPT_BIT_EVIDENCE = 0x400L;
    private static final long OPT_BIT_IMPLICATED = 0x800L;
    private static final long OPT_BIT_AUTHOR = 0x1000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000L;
    private static final long OPT_BIT_DETAIL = 0x4000L;
    private static final long OPT_BIT_IDENTIFIED_PERIOD = 0x8000L;
    private static final long OPT_BIT_IDENTIFIER = 0x10000L;
    private static final long OPT_BIT_ID = 0x20000L;
    private static final long OPT_BIT_IDENTIFIED_DATE_TIME = 0x40000L;
    private static final long OPT_BIT_REFERENCE = 0x80000L;
    private static final long OPT_BIT_MITIGATION = 0x100000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Uri implicitRules;
    private @Nullable List<Extension> extension;
    private @Nullable DetectedissueSeverity severity;
    private @Nullable Code language;
    private @Nullable List<ResourceList> contained;
    private @Nullable Meta meta;
    private @Nullable Narrative text;
    private @Nullable CodeableConcept code;
    private @Nullable Code status;
    private @Nullable Reference patient;
    private @Nullable List<DetectedIssue_Evidence> evidence;
    private @Nullable List<Reference> implicated;
    private @Nullable Reference author;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String detail;
    private @Nullable Period identifiedPeriod;
    private @Nullable List<Identifier> identifier;
    private @Nullable Id id;
    private @Nullable String resourceType;
    private @Nullable String identifiedDateTime;
    private @Nullable Uri reference;
    private @Nullable List<DetectedIssue_Mitigation> mitigation;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DetectedIssue#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DetectedIssue#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DetectedIssue#extension() extension} to extension.
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
     * Initializes the optional value {@link DetectedIssue#extension() extension} to extension.
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
     * Initializes the optional value {@link DetectedIssue#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for chained invocation
     */
    public final Builder severity(DetectedissueSeverity severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = Objects.requireNonNull(severity, "severity");
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("severity")
    public final Builder severity(Optional<? extends DetectedissueSeverity> severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = severity.orElse(null);
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#language() language} to language.
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
     * Initializes the optional value {@link DetectedIssue#language() language} to language.
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
     * Initializes the optional value {@link DetectedIssue#contained() contained} to contained.
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
     * Initializes the optional value {@link DetectedIssue#contained() contained} to contained.
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
     * Initializes the optional value {@link DetectedIssue#meta() meta} to meta.
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
     * Initializes the optional value {@link DetectedIssue#meta() meta} to meta.
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
     * Initializes the optional value {@link DetectedIssue#text() text} to text.
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
     * Initializes the optional value {@link DetectedIssue#text() text} to text.
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
     * Initializes the optional value {@link DetectedIssue#code() code} to code.
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
     * Initializes the optional value {@link DetectedIssue#code() code} to code.
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
     * Initializes the optional value {@link DetectedIssue#status() status} to status.
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
     * Initializes the optional value {@link DetectedIssue#status() status} to status.
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
     * Initializes the optional value {@link DetectedIssue#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    public final Builder patient(Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = Objects.requireNonNull(patient, "patient");
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patient")
    public final Builder patient(Optional<? extends Reference> patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = patient.orElse(null);
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#evidence() evidence} to evidence.
     * @param evidence The value for evidence
     * @return {@code this} builder for chained invocation
     */
    public final Builder evidence(List<DetectedIssue_Evidence> evidence) {
      checkNotIsSet(evidenceIsSet(), "evidence");
      this.evidence = Objects.requireNonNull(evidence, "evidence");
      optBits |= OPT_BIT_EVIDENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#evidence() evidence} to evidence.
     * @param evidence The value for evidence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("evidence")
    public final Builder evidence(Optional<? extends List<DetectedIssue_Evidence>> evidence) {
      checkNotIsSet(evidenceIsSet(), "evidence");
      this.evidence = evidence.orElse(null);
      optBits |= OPT_BIT_EVIDENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#implicated() implicated} to implicated.
     * @param implicated The value for implicated
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicated(List<Reference> implicated) {
      checkNotIsSet(implicatedIsSet(), "implicated");
      this.implicated = Objects.requireNonNull(implicated, "implicated");
      optBits |= OPT_BIT_IMPLICATED;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#implicated() implicated} to implicated.
     * @param implicated The value for implicated
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicated")
    public final Builder implicated(Optional<? extends List<Reference>> implicated) {
      checkNotIsSet(implicatedIsSet(), "implicated");
      this.implicated = implicated.orElse(null);
      optBits |= OPT_BIT_IMPLICATED;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(Reference author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("author")
    public final Builder author(Optional<? extends Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DetectedIssue#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DetectedIssue#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(String detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detail")
    public final Builder detail(Optional<String> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#identifiedPeriod() identifiedPeriod} to identifiedPeriod.
     * @param identifiedPeriod The value for identifiedPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifiedPeriod(Period identifiedPeriod) {
      checkNotIsSet(identifiedPeriodIsSet(), "identifiedPeriod");
      this.identifiedPeriod = Objects.requireNonNull(identifiedPeriod, "identifiedPeriod");
      optBits |= OPT_BIT_IDENTIFIED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#identifiedPeriod() identifiedPeriod} to identifiedPeriod.
     * @param identifiedPeriod The value for identifiedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifiedPeriod")
    public final Builder identifiedPeriod(Optional<? extends Period> identifiedPeriod) {
      checkNotIsSet(identifiedPeriodIsSet(), "identifiedPeriod");
      this.identifiedPeriod = identifiedPeriod.orElse(null);
      optBits |= OPT_BIT_IDENTIFIED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DetectedIssue#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DetectedIssue#id() id} to id.
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
     * Initializes the optional value {@link DetectedIssue#id() id} to id.
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
     * Initializes the value for the {@link DetectedIssue#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link DetectedIssue#identifiedDateTime() identifiedDateTime} to identifiedDateTime.
     * @param identifiedDateTime The value for identifiedDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifiedDateTime(String identifiedDateTime) {
      checkNotIsSet(identifiedDateTimeIsSet(), "identifiedDateTime");
      this.identifiedDateTime = Objects.requireNonNull(identifiedDateTime, "identifiedDateTime");
      optBits |= OPT_BIT_IDENTIFIED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#identifiedDateTime() identifiedDateTime} to identifiedDateTime.
     * @param identifiedDateTime The value for identifiedDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifiedDateTime")
    public final Builder identifiedDateTime(Optional<String> identifiedDateTime) {
      checkNotIsSet(identifiedDateTimeIsSet(), "identifiedDateTime");
      this.identifiedDateTime = identifiedDateTime.orElse(null);
      optBits |= OPT_BIT_IDENTIFIED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reference(Uri reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = Objects.requireNonNull(reference, "reference");
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reference")
    public final Builder reference(Optional<? extends Uri> reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = reference.orElse(null);
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#mitigation() mitigation} to mitigation.
     * @param mitigation The value for mitigation
     * @return {@code this} builder for chained invocation
     */
    public final Builder mitigation(List<DetectedIssue_Mitigation> mitigation) {
      checkNotIsSet(mitigationIsSet(), "mitigation");
      this.mitigation = Objects.requireNonNull(mitigation, "mitigation");
      optBits |= OPT_BIT_MITIGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#mitigation() mitigation} to mitigation.
     * @param mitigation The value for mitigation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("mitigation")
    public final Builder mitigation(Optional<? extends List<DetectedIssue_Mitigation>> mitigation) {
      checkNotIsSet(mitigationIsSet(), "mitigation");
      this.mitigation = mitigation.orElse(null);
      optBits |= OPT_BIT_MITIGATION;
      return this;
    }

    /**
     * Builds a new {@link DetectedIssue DetectedIssue}.
     * @return An immutable instance of DetectedIssue
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DetectedIssue build() {
      checkRequiredAttributes();
      return new ImmutableDetectedIssue(
          implicitRules,
          extension,
          severity,
          language,
          contained,
          meta,
          text,
          code,
          status,
          patient,
          evidence,
          implicated,
          author,
          modifierExtension,
          detail,
          identifiedPeriod,
          identifier,
          id,
          resourceType,
          identifiedDateTime,
          reference,
          mitigation);
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean severityIsSet() {
      return (optBits & OPT_BIT_SEVERITY) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean patientIsSet() {
      return (optBits & OPT_BIT_PATIENT) != 0;
    }

    private boolean evidenceIsSet() {
      return (optBits & OPT_BIT_EVIDENCE) != 0;
    }

    private boolean implicatedIsSet() {
      return (optBits & OPT_BIT_IMPLICATED) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean identifiedPeriodIsSet() {
      return (optBits & OPT_BIT_IDENTIFIED_PERIOD) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean identifiedDateTimeIsSet() {
      return (optBits & OPT_BIT_IDENTIFIED_DATE_TIME) != 0;
    }

    private boolean referenceIsSet() {
      return (optBits & OPT_BIT_REFERENCE) != 0;
    }

    private boolean mitigationIsSet() {
      return (optBits & OPT_BIT_MITIGATION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DetectedIssue is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build DetectedIssue, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "DetectedIssue", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link DetectedIssue#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "DetectedIssue", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DetectedIssue#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link DetectedIssue#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link DetectedIssue#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link DetectedIssue#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link DetectedIssue#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal severity(DetectedissueSeverity severity);

    /**
     * Initializes the optional value {@link DetectedIssue#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal severity(Optional<? extends DetectedissueSeverity> severity);

    /**
     * Initializes the optional value {@link DetectedIssue#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link DetectedIssue#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link DetectedIssue#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link DetectedIssue#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link DetectedIssue#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link DetectedIssue#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link DetectedIssue#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link DetectedIssue#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link DetectedIssue#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link DetectedIssue#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link DetectedIssue#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link DetectedIssue#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link DetectedIssue#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patient(Reference patient);

    /**
     * Initializes the optional value {@link DetectedIssue#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(Optional<? extends Reference> patient);

    /**
     * Initializes the optional value {@link DetectedIssue#evidence() evidence} to evidence.
     * @param evidence The value for evidence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal evidence(List<DetectedIssue_Evidence> evidence);

    /**
     * Initializes the optional value {@link DetectedIssue#evidence() evidence} to evidence.
     * @param evidence The value for evidence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal evidence(Optional<? extends List<DetectedIssue_Evidence>> evidence);

    /**
     * Initializes the optional value {@link DetectedIssue#implicated() implicated} to implicated.
     * @param implicated The value for implicated
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicated(List<Reference> implicated);

    /**
     * Initializes the optional value {@link DetectedIssue#implicated() implicated} to implicated.
     * @param implicated The value for implicated
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicated(Optional<? extends List<Reference>> implicated);

    /**
     * Initializes the optional value {@link DetectedIssue#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(Reference author);

    /**
     * Initializes the optional value {@link DetectedIssue#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends Reference> author);

    /**
     * Initializes the optional value {@link DetectedIssue#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DetectedIssue#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DetectedIssue#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detail(String detail);

    /**
     * Initializes the optional value {@link DetectedIssue#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detail(Optional<String> detail);

    /**
     * Initializes the optional value {@link DetectedIssue#identifiedPeriod() identifiedPeriod} to identifiedPeriod.
     * @param identifiedPeriod The value for identifiedPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifiedPeriod(Period identifiedPeriod);

    /**
     * Initializes the optional value {@link DetectedIssue#identifiedPeriod() identifiedPeriod} to identifiedPeriod.
     * @param identifiedPeriod The value for identifiedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifiedPeriod(Optional<? extends Period> identifiedPeriod);

    /**
     * Initializes the optional value {@link DetectedIssue#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link DetectedIssue#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link DetectedIssue#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link DetectedIssue#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link DetectedIssue#identifiedDateTime() identifiedDateTime} to identifiedDateTime.
     * @param identifiedDateTime The value for identifiedDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifiedDateTime(String identifiedDateTime);

    /**
     * Initializes the optional value {@link DetectedIssue#identifiedDateTime() identifiedDateTime} to identifiedDateTime.
     * @param identifiedDateTime The value for identifiedDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifiedDateTime(Optional<String> identifiedDateTime);

    /**
     * Initializes the optional value {@link DetectedIssue#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reference(Uri reference);

    /**
     * Initializes the optional value {@link DetectedIssue#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reference(Optional<? extends Uri> reference);

    /**
     * Initializes the optional value {@link DetectedIssue#mitigation() mitigation} to mitigation.
     * @param mitigation The value for mitigation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal mitigation(List<DetectedIssue_Mitigation> mitigation);

    /**
     * Initializes the optional value {@link DetectedIssue#mitigation() mitigation} to mitigation.
     * @param mitigation The value for mitigation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal mitigation(Optional<? extends List<DetectedIssue_Mitigation>> mitigation);

    /**
     * Builds a new {@link DetectedIssue DetectedIssue}.
     * @return An immutable instance of DetectedIssue
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DetectedIssue build();
  }
}
