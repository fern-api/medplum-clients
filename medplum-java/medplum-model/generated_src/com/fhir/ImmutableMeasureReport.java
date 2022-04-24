//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MeasureReport}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeasureReport.builder()}.
 */
@org.immutables.value.Generated(from = "MeasureReport", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMeasureReport implements com.fhir.MeasureReport {
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MeasureReport_Group> group;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> evaluatedResource;
  private final @javax.annotation.Nullable com.fhir.MeasurereportType type;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.MeasurereportStatus status;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Reference reporter;
  private final com.fhir.canonical measure;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept improvementNotation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final com.fhir.Period period;
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableMeasureReport(
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.MeasureReport_Group> group,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> evaluatedResource,
      @javax.annotation.Nullable com.fhir.MeasurereportType type,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.MeasurereportStatus status,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Reference reporter,
      com.fhir.canonical measure,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.CodeableConcept improvementNotation,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      com.fhir.Period period,
      @javax.annotation.Nullable com.fhir.Reference subject,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.date = date;
    this.group = group;
    this.evaluatedResource = evaluatedResource;
    this.type = type;
    this.text = text;
    this.contained = contained;
    this.status = status;
    this.id = id;
    this.reporter = reporter;
    this.measure = measure;
    this.language = language;
    this.improvementNotation = improvementNotation;
    this.extension = extension;
    this.identifier = identifier;
    this.implicitRules = implicitRules;
    this.period = period;
    this.subject = subject;
    this.resourceType = resourceType;
    this.meta = meta;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code group} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("group")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MeasureReport_Group>> group() {
    return java.util.Optional.ofNullable(group);
  }

  /**
   * @return The value of the {@code evaluatedResource} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("evaluatedResource")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> evaluatedResource() {
    return java.util.Optional.ofNullable(evaluatedResource);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.MeasurereportType> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.MeasurereportStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code reporter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reporter")
  @Override
  public java.util.Optional<com.fhir.Reference> reporter() {
    return java.util.Optional.ofNullable(reporter);
  }

  /**
   * @return The value of the {@code measure} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("measure")
  @Override
  public com.fhir.canonical measure() {
    return measure;
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
   * @return The value of the {@code improvementNotation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("improvementNotation")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> improvementNotation() {
    return java.util.Optional.ofNullable(improvementNotation);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("period")
  @Override
  public com.fhir.Period period() {
    return period;
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableMeasureReport(
        newValue,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableMeasureReport(
        value,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#group() group} attribute.
   * @param value The value for group
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withGroup(java.util.List<com.fhir.MeasureReport_Group> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MeasureReport_Group> newValue = java.util.Objects.requireNonNull(value, "group");
    if (this.group == newValue) return this;
    return new ImmutableMeasureReport(
        this.date,
        newValue,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#group() group} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for group
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withGroup(java.util.Optional<? extends java.util.List<com.fhir.MeasureReport_Group>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MeasureReport_Group> value = optional.orElse(null);
    if (this.group == value) return this;
    return new ImmutableMeasureReport(
        this.date,
        value,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#evaluatedResource() evaluatedResource} attribute.
   * @param value The value for evaluatedResource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withEvaluatedResource(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "evaluatedResource");
    if (this.evaluatedResource == newValue) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        newValue,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#evaluatedResource() evaluatedResource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for evaluatedResource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withEvaluatedResource(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.evaluatedResource == value) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        value,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withType(com.fhir.MeasurereportType value) {
    @javax.annotation.Nullable com.fhir.MeasurereportType newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        newValue,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withType(java.util.Optional<? extends com.fhir.MeasurereportType> optional) {
    @javax.annotation.Nullable com.fhir.MeasurereportType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        value,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        newValue,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        value,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        newValue,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        value,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withStatus(com.fhir.MeasurereportStatus value) {
    @javax.annotation.Nullable com.fhir.MeasurereportStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        newValue,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withStatus(java.util.Optional<? extends com.fhir.MeasurereportStatus> optional) {
    @javax.annotation.Nullable com.fhir.MeasurereportStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        value,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        newValue,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        value,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#reporter() reporter} attribute.
   * @param value The value for reporter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withReporter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "reporter");
    if (this.reporter == newValue) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        newValue,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#reporter() reporter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reporter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withReporter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.reporter == value) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        value,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasureReport#measure() measure} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for measure
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasureReport withMeasure(com.fhir.canonical value) {
    if (this.measure == value) return this;
    com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "measure");
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        newValue,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        newValue,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        value,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#improvementNotation() improvementNotation} attribute.
   * @param value The value for improvementNotation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withImprovementNotation(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "improvementNotation");
    if (this.improvementNotation == newValue) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        newValue,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#improvementNotation() improvementNotation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for improvementNotation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withImprovementNotation(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.improvementNotation == value) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        value,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        newValue,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        value,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        newValue,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        value,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        newValue,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        value,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasureReport#period() period} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for period
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasureReport withPeriod(com.fhir.Period value) {
    if (this.period == value) return this;
    com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "period");
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        newValue,
        this.subject,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        newValue,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        value,
        this.resourceType,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasureReport#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasureReport withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        newValue,
        this.meta,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMeasureReport(
        this.date,
        this.group,
        this.evaluatedResource,
        this.type,
        this.text,
        this.contained,
        this.status,
        this.id,
        this.reporter,
        this.measure,
        this.language,
        this.improvementNotation,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.period,
        this.subject,
        this.resourceType,
        this.meta,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeasureReport} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeasureReport
        && equalTo((ImmutableMeasureReport) another);
  }

  private boolean equalTo(ImmutableMeasureReport another) {
    return java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(group, another.group)
        && java.util.Objects.equals(evaluatedResource, another.evaluatedResource)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(reporter, another.reporter)
        && measure.equals(another.measure)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(improvementNotation, another.improvementNotation)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && period.equals(another.period)
        && java.util.Objects.equals(subject, another.subject)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code date}, {@code group}, {@code evaluatedResource}, {@code type}, {@code text}, {@code contained}, {@code status}, {@code id}, {@code reporter}, {@code measure}, {@code language}, {@code improvementNotation}, {@code extension}, {@code identifier}, {@code implicitRules}, {@code period}, {@code subject}, {@code resourceType}, {@code meta}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(group);
    h += (h << 5) + java.util.Objects.hashCode(evaluatedResource);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(reporter);
    h += (h << 5) + measure.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(improvementNotation);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + period.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code MeasureReport} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MeasureReport{");
    if (date != null) {
      builder.append("date=").append(date);
    }
    if (group != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("group=").append(group);
    }
    if (evaluatedResource != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("evaluatedResource=").append(evaluatedResource);
    }
    if (type != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (text != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contained != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (status != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (id != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (reporter != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("reporter=").append(reporter);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("measure=").append(measure);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (improvementNotation != null) {
      builder.append(", ");
      builder.append("improvementNotation=").append(improvementNotation);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    builder.append(", ");
    builder.append("period=").append(period);
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
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MeasureReport", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MeasureReport {
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MeasureReport_Group>> group = java.util.Optional.empty();
    boolean groupIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> evaluatedResource = java.util.Optional.empty();
    boolean evaluatedResourceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.MeasurereportType> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.MeasurereportStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> reporter = java.util.Optional.empty();
    boolean reporterIsSet;
    @javax.annotation.Nullable com.fhir.canonical measure;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> improvementNotation = java.util.Optional.empty();
    boolean improvementNotationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable com.fhir.Period period;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("group")
    public void setGroup(java.util.Optional<java.util.List<com.fhir.MeasureReport_Group>> group) {
      this.group = group;
      this.groupIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("evaluatedResource")
    public void setEvaluatedResource(java.util.Optional<java.util.List<com.fhir.Reference>> evaluatedResource) {
      this.evaluatedResource = evaluatedResource;
      this.evaluatedResourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.MeasurereportType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.MeasurereportStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reporter")
    public void setReporter(java.util.Optional<com.fhir.Reference> reporter) {
      this.reporter = reporter;
      this.reporterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("measure")
    public void setMeasure(com.fhir.canonical measure) {
      this.measure = measure;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("improvementNotation")
    public void setImprovementNotation(java.util.Optional<com.fhir.CodeableConcept> improvementNotation) {
      this.improvementNotation = improvementNotation;
      this.improvementNotationIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public void setPeriod(com.fhir.Period period) {
      this.period = period;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MeasureReport_Group>> group() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> evaluatedResource() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.MeasurereportType> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.MeasurereportStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> reporter() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.canonical measure() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> improvementNotation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Period period() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMeasureReport fromJson(Json json) {
    ImmutableMeasureReport.Builder builder = ((ImmutableMeasureReport.Builder) ImmutableMeasureReport.builder());
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.groupIsSet) {
      builder.group(json.group);
    }
    if (json.evaluatedResourceIsSet) {
      builder.evaluatedResource(json.evaluatedResource);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.reporterIsSet) {
      builder.reporter(json.reporter);
    }
    if (json.measure != null) {
      builder.measure(json.measure);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.improvementNotationIsSet) {
      builder.improvementNotation(json.improvementNotation);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.period != null) {
      builder.period(json.period);
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
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableMeasureReport) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MeasureReport} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MeasureReport instance
   */
  public static MeasureReport copyOf(MeasureReport instance) {
    if (instance instanceof ImmutableMeasureReport) {
      return (ImmutableMeasureReport) instance;
    }
    return ((ImmutableMeasureReport.Builder) ImmutableMeasureReport.builder())
        .date(instance.date())
        .group(instance.group())
        .evaluatedResource(instance.evaluatedResource())
        .type(instance.type())
        .text(instance.text())
        .contained(instance.contained())
        .status(instance.status())
        .id(instance.id())
        .reporter(instance.reporter())
        .measure(instance.measure())
        .language(instance.language())
        .improvementNotation(instance.improvementNotation())
        .extension(instance.extension())
        .identifier(instance.identifier())
        .implicitRules(instance.implicitRules())
        .period(instance.period())
        .subject(instance.subject())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link MeasureReport MeasureReport}.
   * <pre>
   * ImmutableMeasureReport.builder()
   *    .date(com.fhir.dateTime) // optional {@link MeasureReport#date() date}
   *    .group(List&amp;lt;com.fhir.MeasureReport_Group&amp;gt;) // optional {@link MeasureReport#group() group}
   *    .evaluatedResource(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MeasureReport#evaluatedResource() evaluatedResource}
   *    .type(com.fhir.MeasurereportType) // optional {@link MeasureReport#type() type}
   *    .text(com.fhir.Narrative) // optional {@link MeasureReport#text() text}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MeasureReport#contained() contained}
   *    .status(com.fhir.MeasurereportStatus) // optional {@link MeasureReport#status() status}
   *    .id(com.fhir.id) // optional {@link MeasureReport#id() id}
   *    .reporter(com.fhir.Reference) // optional {@link MeasureReport#reporter() reporter}
   *    .measure(com.fhir.canonical) // required {@link MeasureReport#measure() measure}
   *    .language(com.fhir.code) // optional {@link MeasureReport#language() language}
   *    .improvementNotation(com.fhir.CodeableConcept) // optional {@link MeasureReport#improvementNotation() improvementNotation}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MeasureReport#extension() extension}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link MeasureReport#identifier() identifier}
   *    .implicitRules(com.fhir.uri) // optional {@link MeasureReport#implicitRules() implicitRules}
   *    .period(com.fhir.Period) // required {@link MeasureReport#period() period}
   *    .subject(com.fhir.Reference) // optional {@link MeasureReport#subject() subject}
   *    .resourceType(String) // required {@link MeasureReport#resourceType() resourceType}
   *    .meta(com.fhir.Meta) // optional {@link MeasureReport#meta() meta}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MeasureReport#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new MeasureReport builder
   */
  public static MeasureBuildStage builder() {
    return new ImmutableMeasureReport.Builder();
  }

  /**
   * Builds instances of type {@link MeasureReport MeasureReport}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MeasureReport", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements MeasureBuildStage, PeriodBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_MEASURE = 0x1L;
    private static final long INIT_BIT_PERIOD = 0x2L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long OPT_BIT_DATE = 0x1L;
    private static final long OPT_BIT_GROUP = 0x2L;
    private static final long OPT_BIT_EVALUATED_RESOURCE = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_STATUS = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_REPORTER = 0x100L;
    private static final long OPT_BIT_LANGUAGE = 0x200L;
    private static final long OPT_BIT_IMPROVEMENT_NOTATION = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_IDENTIFIER = 0x1000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2000L;
    private static final long OPT_BIT_SUBJECT = 0x4000L;
    private static final long OPT_BIT_META = 0x8000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000L;
    private long initBits = 0x7L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.MeasureReport_Group> group;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> evaluatedResource;
    private @javax.annotation.Nullable com.fhir.MeasurereportType type;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.MeasurereportStatus status;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Reference reporter;
    private @javax.annotation.Nullable com.fhir.canonical measure;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept improvementNotation;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Period period;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MeasureReport#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(com.fhir.dateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = java.util.Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public final Builder date(java.util.Optional<? extends com.fhir.dateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for chained invocation
     */
    public final Builder group(java.util.List<com.fhir.MeasureReport_Group> group) {
      checkNotIsSet(groupIsSet(), "group");
      this.group = java.util.Objects.requireNonNull(group, "group");
      optBits |= OPT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("group")
    public final Builder group(java.util.Optional<? extends java.util.List<com.fhir.MeasureReport_Group>> group) {
      checkNotIsSet(groupIsSet(), "group");
      this.group = group.orElse(null);
      optBits |= OPT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#evaluatedResource() evaluatedResource} to evaluatedResource.
     * @param evaluatedResource The value for evaluatedResource
     * @return {@code this} builder for chained invocation
     */
    public final Builder evaluatedResource(java.util.List<com.fhir.Reference> evaluatedResource) {
      checkNotIsSet(evaluatedResourceIsSet(), "evaluatedResource");
      this.evaluatedResource = java.util.Objects.requireNonNull(evaluatedResource, "evaluatedResource");
      optBits |= OPT_BIT_EVALUATED_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#evaluatedResource() evaluatedResource} to evaluatedResource.
     * @param evaluatedResource The value for evaluatedResource
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("evaluatedResource")
    public final Builder evaluatedResource(java.util.Optional<? extends java.util.List<com.fhir.Reference>> evaluatedResource) {
      checkNotIsSet(evaluatedResourceIsSet(), "evaluatedResource");
      this.evaluatedResource = evaluatedResource.orElse(null);
      optBits |= OPT_BIT_EVALUATED_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.MeasurereportType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.MeasurereportType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#text() text} to text.
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
     * Initializes the optional value {@link MeasureReport#text() text} to text.
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
     * Initializes the optional value {@link MeasureReport#contained() contained} to contained.
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
     * Initializes the optional value {@link MeasureReport#contained() contained} to contained.
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
     * Initializes the optional value {@link MeasureReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.MeasurereportStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.MeasurereportStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#id() id} to id.
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
     * Initializes the optional value {@link MeasureReport#id() id} to id.
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
     * Initializes the optional value {@link MeasureReport#reporter() reporter} to reporter.
     * @param reporter The value for reporter
     * @return {@code this} builder for chained invocation
     */
    public final Builder reporter(com.fhir.Reference reporter) {
      checkNotIsSet(reporterIsSet(), "reporter");
      this.reporter = java.util.Objects.requireNonNull(reporter, "reporter");
      optBits |= OPT_BIT_REPORTER;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#reporter() reporter} to reporter.
     * @param reporter The value for reporter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reporter")
    public final Builder reporter(java.util.Optional<? extends com.fhir.Reference> reporter) {
      checkNotIsSet(reporterIsSet(), "reporter");
      this.reporter = reporter.orElse(null);
      optBits |= OPT_BIT_REPORTER;
      return this;
    }

    /**
     * Initializes the value for the {@link MeasureReport#measure() measure} attribute.
     * @param measure The value for measure 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("measure")
    public final Builder measure(com.fhir.canonical measure) {
      checkNotIsSet(measureIsSet(), "measure");
      this.measure = java.util.Objects.requireNonNull(measure, "measure");
      initBits &= ~INIT_BIT_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#language() language} to language.
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
     * Initializes the optional value {@link MeasureReport#language() language} to language.
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
     * Initializes the optional value {@link MeasureReport#improvementNotation() improvementNotation} to improvementNotation.
     * @param improvementNotation The value for improvementNotation
     * @return {@code this} builder for chained invocation
     */
    public final Builder improvementNotation(com.fhir.CodeableConcept improvementNotation) {
      checkNotIsSet(improvementNotationIsSet(), "improvementNotation");
      this.improvementNotation = java.util.Objects.requireNonNull(improvementNotation, "improvementNotation");
      optBits |= OPT_BIT_IMPROVEMENT_NOTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#improvementNotation() improvementNotation} to improvementNotation.
     * @param improvementNotation The value for improvementNotation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("improvementNotation")
    public final Builder improvementNotation(java.util.Optional<? extends com.fhir.CodeableConcept> improvementNotation) {
      checkNotIsSet(improvementNotationIsSet(), "improvementNotation");
      this.improvementNotation = improvementNotation.orElse(null);
      optBits |= OPT_BIT_IMPROVEMENT_NOTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#extension() extension} to extension.
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
     * Initializes the optional value {@link MeasureReport#extension() extension} to extension.
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
     * Initializes the optional value {@link MeasureReport#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MeasureReport#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MeasureReport#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MeasureReport#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the value for the {@link MeasureReport#period() period} attribute.
     * @param period The value for period 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public final Builder period(com.fhir.Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = java.util.Objects.requireNonNull(period, "period");
      initBits &= ~INIT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#subject() subject} to subject.
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
     * Initializes the optional value {@link MeasureReport#subject() subject} to subject.
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
     * Initializes the value for the {@link MeasureReport#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MeasureReport#meta() meta} to meta.
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
     * Initializes the optional value {@link MeasureReport#meta() meta} to meta.
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
     * Initializes the optional value {@link MeasureReport#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MeasureReport#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link MeasureReport MeasureReport}.
     * @return An immutable instance of MeasureReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MeasureReport build() {
      checkRequiredAttributes();
      return new ImmutableMeasureReport(
          date,
          group,
          evaluatedResource,
          type,
          text,
          contained,
          status,
          id,
          reporter,
          measure,
          language,
          improvementNotation,
          extension,
          identifier,
          implicitRules,
          period,
          subject,
          resourceType,
          meta,
          modifierExtension);
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean groupIsSet() {
      return (optBits & OPT_BIT_GROUP) != 0;
    }

    private boolean evaluatedResourceIsSet() {
      return (optBits & OPT_BIT_EVALUATED_RESOURCE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean reporterIsSet() {
      return (optBits & OPT_BIT_REPORTER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean improvementNotationIsSet() {
      return (optBits & OPT_BIT_IMPROVEMENT_NOTATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean measureIsSet() {
      return (initBits & INIT_BIT_MEASURE) == 0;
    }

    private boolean periodIsSet() {
      return (initBits & INIT_BIT_PERIOD) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MeasureReport is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!measureIsSet()) attributes.add("measure");
      if (!periodIsSet()) attributes.add("period");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MeasureReport, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MeasureReport", generator = "Immutables")
  public interface MeasureBuildStage {
    /**
     * Initializes the value for the {@link MeasureReport#measure() measure} attribute.
     * @param measure The value for measure 
     * @return {@code this} builder for use in a chained invocation
     */
    PeriodBuildStage measure(com.fhir.canonical measure);
  }

  @org.immutables.value.Generated(from = "MeasureReport", generator = "Immutables")
  public interface PeriodBuildStage {
    /**
     * Initializes the value for the {@link MeasureReport#period() period} attribute.
     * @param period The value for period 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage period(com.fhir.Period period);
  }

  @org.immutables.value.Generated(from = "MeasureReport", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MeasureReport#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MeasureReport", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MeasureReport#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link MeasureReport#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link MeasureReport#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for chained invocation
     */
    BuildFinal group(java.util.List<com.fhir.MeasureReport_Group> group);

    /**
     * Initializes the optional value {@link MeasureReport#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal group(java.util.Optional<? extends java.util.List<com.fhir.MeasureReport_Group>> group);

    /**
     * Initializes the optional value {@link MeasureReport#evaluatedResource() evaluatedResource} to evaluatedResource.
     * @param evaluatedResource The value for evaluatedResource
     * @return {@code this} builder for chained invocation
     */
    BuildFinal evaluatedResource(java.util.List<com.fhir.Reference> evaluatedResource);

    /**
     * Initializes the optional value {@link MeasureReport#evaluatedResource() evaluatedResource} to evaluatedResource.
     * @param evaluatedResource The value for evaluatedResource
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal evaluatedResource(java.util.Optional<? extends java.util.List<com.fhir.Reference>> evaluatedResource);

    /**
     * Initializes the optional value {@link MeasureReport#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.MeasurereportType type);

    /**
     * Initializes the optional value {@link MeasureReport#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.MeasurereportType> type);

    /**
     * Initializes the optional value {@link MeasureReport#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MeasureReport#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MeasureReport#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MeasureReport#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MeasureReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.MeasurereportStatus status);

    /**
     * Initializes the optional value {@link MeasureReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.MeasurereportStatus> status);

    /**
     * Initializes the optional value {@link MeasureReport#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MeasureReport#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MeasureReport#reporter() reporter} to reporter.
     * @param reporter The value for reporter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reporter(com.fhir.Reference reporter);

    /**
     * Initializes the optional value {@link MeasureReport#reporter() reporter} to reporter.
     * @param reporter The value for reporter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reporter(java.util.Optional<? extends com.fhir.Reference> reporter);

    /**
     * Initializes the optional value {@link MeasureReport#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MeasureReport#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MeasureReport#improvementNotation() improvementNotation} to improvementNotation.
     * @param improvementNotation The value for improvementNotation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal improvementNotation(com.fhir.CodeableConcept improvementNotation);

    /**
     * Initializes the optional value {@link MeasureReport#improvementNotation() improvementNotation} to improvementNotation.
     * @param improvementNotation The value for improvementNotation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal improvementNotation(java.util.Optional<? extends com.fhir.CodeableConcept> improvementNotation);

    /**
     * Initializes the optional value {@link MeasureReport#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MeasureReport#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MeasureReport#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link MeasureReport#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link MeasureReport#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MeasureReport#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MeasureReport#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link MeasureReport#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link MeasureReport#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MeasureReport#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link MeasureReport#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MeasureReport#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Builds a new {@link MeasureReport MeasureReport}.
     * @return An immutable instance of MeasureReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MeasureReport build();
  }
}
