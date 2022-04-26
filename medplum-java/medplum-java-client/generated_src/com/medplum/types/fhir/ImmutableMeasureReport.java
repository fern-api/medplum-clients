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
 * Immutable implementation of {@link MeasureReport}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeasureReport.builder()}.
 */
@Generated(from = "MeasureReport", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMeasureReport implements MeasureReport {
  private final @Nullable MeasurereportType type;
  private final @Nullable List<Extension> modifierExtension;
  private final Period period;
  private final @Nullable Id id;
  private final @Nullable List<MeasureReport_Group> group;
  private final @Nullable DateTime date;
  private final @Nullable Reference reporter;
  private final @Nullable List<Extension> extension;
  private final @Nullable Meta meta;
  private final @Nullable Narrative text;
  private final Canonical measure;
  private final @Nullable List<Identifier> identifier;
  private final String resourceType;
  private final @Nullable Code language;
  private final @Nullable List<Reference> evaluatedResource;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable MeasurereportStatus status;
  private final @Nullable Reference subject;
  private final @Nullable CodeableConcept improvementNotation;

  private ImmutableMeasureReport(
      @Nullable MeasurereportType type,
      @Nullable List<Extension> modifierExtension,
      Period period,
      @Nullable Id id,
      @Nullable List<MeasureReport_Group> group,
      @Nullable DateTime date,
      @Nullable Reference reporter,
      @Nullable List<Extension> extension,
      @Nullable Meta meta,
      @Nullable Narrative text,
      Canonical measure,
      @Nullable List<Identifier> identifier,
      String resourceType,
      @Nullable Code language,
      @Nullable List<Reference> evaluatedResource,
      @Nullable Uri implicitRules,
      @Nullable List<ResourceList> contained,
      @Nullable MeasurereportStatus status,
      @Nullable Reference subject,
      @Nullable CodeableConcept improvementNotation) {
    this.type = type;
    this.modifierExtension = modifierExtension;
    this.period = period;
    this.id = id;
    this.group = group;
    this.date = date;
    this.reporter = reporter;
    this.extension = extension;
    this.meta = meta;
    this.text = text;
    this.measure = measure;
    this.identifier = identifier;
    this.resourceType = resourceType;
    this.language = language;
    this.evaluatedResource = evaluatedResource;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.status = status;
    this.subject = subject;
    this.improvementNotation = improvementNotation;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<MeasurereportType> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Period period() {
    return period;
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
   * @return The value of the {@code group} attribute
   */
  @JsonProperty("group")
  @Override
  public Optional<List<MeasureReport_Group>> group() {
    return Optional.ofNullable(group);
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
   * @return The value of the {@code reporter} attribute
   */
  @JsonProperty("reporter")
  @Override
  public Optional<Reference> reporter() {
    return Optional.ofNullable(reporter);
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
   * @return The value of the {@code measure} attribute
   */
  @JsonProperty("measure")
  @Override
  public Canonical measure() {
    return measure;
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
   * @return The value of the {@code evaluatedResource} attribute
   */
  @JsonProperty("evaluatedResource")
  @Override
  public Optional<List<Reference>> evaluatedResource() {
    return Optional.ofNullable(evaluatedResource);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<MeasurereportStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code improvementNotation} attribute
   */
  @JsonProperty("improvementNotation")
  @Override
  public Optional<CodeableConcept> improvementNotation() {
    return Optional.ofNullable(improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withType(MeasurereportType value) {
    @Nullable MeasurereportType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMeasureReport(
        newValue,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withType(Optional<? extends MeasurereportType> optional) {
    @Nullable MeasurereportType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMeasureReport(
        value,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMeasureReport(
        this.type,
        newValue,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMeasureReport(
        this.type,
        value,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasureReport#period() period} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for period
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasureReport withPeriod(Period value) {
    if (this.period == value) return this;
    Period newValue = Objects.requireNonNull(value, "period");
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        newValue,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        newValue,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        value,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#group() group} attribute.
   * @param value The value for group
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withGroup(List<MeasureReport_Group> value) {
    @Nullable List<MeasureReport_Group> newValue = Objects.requireNonNull(value, "group");
    if (this.group == newValue) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        newValue,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#group() group} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for group
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withGroup(Optional<? extends List<MeasureReport_Group>> optional) {
    @Nullable List<MeasureReport_Group> value = optional.orElse(null);
    if (this.group == value) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        value,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        newValue,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        value,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#reporter() reporter} attribute.
   * @param value The value for reporter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withReporter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "reporter");
    if (this.reporter == newValue) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        newValue,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#reporter() reporter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reporter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withReporter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.reporter == value) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        value,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        newValue,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        value,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        newValue,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        value,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        newValue,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        value,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasureReport#measure() measure} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for measure
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasureReport withMeasure(Canonical value) {
    if (this.measure == value) return this;
    Canonical newValue = Objects.requireNonNull(value, "measure");
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        newValue,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        newValue,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        value,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MeasureReport#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasureReport withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        newValue,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        newValue,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        value,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#evaluatedResource() evaluatedResource} attribute.
   * @param value The value for evaluatedResource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withEvaluatedResource(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "evaluatedResource");
    if (this.evaluatedResource == newValue) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        newValue,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#evaluatedResource() evaluatedResource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for evaluatedResource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withEvaluatedResource(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.evaluatedResource == value) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        value,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        newValue,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        value,
        this.contained,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        newValue,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        value,
        this.status,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withStatus(MeasurereportStatus value) {
    @Nullable MeasurereportStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        newValue,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withStatus(Optional<? extends MeasurereportStatus> optional) {
    @Nullable MeasurereportStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        value,
        this.subject,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        newValue,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        value,
        this.improvementNotation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport#improvementNotation() improvementNotation} attribute.
   * @param value The value for improvementNotation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport withImprovementNotation(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "improvementNotation");
    if (this.improvementNotation == newValue) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport#improvementNotation() improvementNotation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for improvementNotation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport withImprovementNotation(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.improvementNotation == value) return this;
    return new ImmutableMeasureReport(
        this.type,
        this.modifierExtension,
        this.period,
        this.id,
        this.group,
        this.date,
        this.reporter,
        this.extension,
        this.meta,
        this.text,
        this.measure,
        this.identifier,
        this.resourceType,
        this.language,
        this.evaluatedResource,
        this.implicitRules,
        this.contained,
        this.status,
        this.subject,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeasureReport} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeasureReport
        && equalTo((ImmutableMeasureReport) another);
  }

  private boolean equalTo(ImmutableMeasureReport another) {
    return Objects.equals(type, another.type)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && period.equals(another.period)
        && Objects.equals(id, another.id)
        && Objects.equals(group, another.group)
        && Objects.equals(date, another.date)
        && Objects.equals(reporter, another.reporter)
        && Objects.equals(extension, another.extension)
        && Objects.equals(meta, another.meta)
        && Objects.equals(text, another.text)
        && measure.equals(another.measure)
        && Objects.equals(identifier, another.identifier)
        && resourceType.equals(another.resourceType)
        && Objects.equals(language, another.language)
        && Objects.equals(evaluatedResource, another.evaluatedResource)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(contained, another.contained)
        && Objects.equals(status, another.status)
        && Objects.equals(subject, another.subject)
        && Objects.equals(improvementNotation, another.improvementNotation);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code modifierExtension}, {@code period}, {@code id}, {@code group}, {@code date}, {@code reporter}, {@code extension}, {@code meta}, {@code text}, {@code measure}, {@code identifier}, {@code resourceType}, {@code language}, {@code evaluatedResource}, {@code implicitRules}, {@code contained}, {@code status}, {@code subject}, {@code improvementNotation}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + period.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(group);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(reporter);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + measure.hashCode();
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(evaluatedResource);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(improvementNotation);
    return h;
  }

  /**
   * Prints the immutable value {@code MeasureReport} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MeasureReport{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (modifierExtension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("period=").append(period);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (group != null) {
      builder.append(", ");
      builder.append("group=").append(group);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (reporter != null) {
      builder.append(", ");
      builder.append("reporter=").append(reporter);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    builder.append(", ");
    builder.append("measure=").append(measure);
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (evaluatedResource != null) {
      builder.append(", ");
      builder.append("evaluatedResource=").append(evaluatedResource);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (improvementNotation != null) {
      builder.append(", ");
      builder.append("improvementNotation=").append(improvementNotation);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MeasureReport", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MeasureReport {
    @Nullable Optional<MeasurereportType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Period period;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<MeasureReport_Group>> group = Optional.empty();
    boolean groupIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Reference> reporter = Optional.empty();
    boolean reporterIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Canonical measure;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Reference>> evaluatedResource = Optional.empty();
    boolean evaluatedResourceIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<MeasurereportStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<CodeableConcept> improvementNotation = Optional.empty();
    boolean improvementNotationIsSet;
    @JsonProperty("type")
    public void setType(Optional<MeasurereportType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Period period) {
      this.period = period;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("group")
    public void setGroup(Optional<List<MeasureReport_Group>> group) {
      this.group = group;
      this.groupIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("reporter")
    public void setReporter(Optional<Reference> reporter) {
      this.reporter = reporter;
      this.reporterIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
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
    @JsonProperty("measure")
    public void setMeasure(Canonical measure) {
      this.measure = measure;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
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
    @JsonProperty("evaluatedResource")
    public void setEvaluatedResource(Optional<List<Reference>> evaluatedResource) {
      this.evaluatedResource = evaluatedResource;
      this.evaluatedResourceIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<MeasurereportStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("improvementNotation")
    public void setImprovementNotation(Optional<CodeableConcept> improvementNotation) {
      this.improvementNotation = improvementNotation;
      this.improvementNotationIsSet = true;
    }
    @Override
    public Optional<MeasurereportType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Period period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MeasureReport_Group>> group() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> reporter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Canonical measure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> evaluatedResource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MeasurereportStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> improvementNotation() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMeasureReport fromJson(Json json) {
    ImmutableMeasureReport.Builder builder = ((ImmutableMeasureReport.Builder) ImmutableMeasureReport.builder());
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.period != null) {
      builder.period(json.period);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.groupIsSet) {
      builder.group(json.group);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.reporterIsSet) {
      builder.reporter(json.reporter);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.measure != null) {
      builder.measure(json.measure);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.evaluatedResourceIsSet) {
      builder.evaluatedResource(json.evaluatedResource);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.improvementNotationIsSet) {
      builder.improvementNotation(json.improvementNotation);
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
        .type(instance.type())
        .modifierExtension(instance.modifierExtension())
        .period(instance.period())
        .id(instance.id())
        .group(instance.group())
        .date(instance.date())
        .reporter(instance.reporter())
        .extension(instance.extension())
        .meta(instance.meta())
        .text(instance.text())
        .measure(instance.measure())
        .identifier(instance.identifier())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .evaluatedResource(instance.evaluatedResource())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .status(instance.status())
        .subject(instance.subject())
        .improvementNotation(instance.improvementNotation())
        .build();
  }

  /**
   * Creates a builder for {@link MeasureReport MeasureReport}.
   * <pre>
   * ImmutableMeasureReport.builder()
   *    .type(com.medplum.types.fhir.MeasurereportType) // optional {@link MeasureReport#type() type}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MeasureReport#modifierExtension() modifierExtension}
   *    .period(com.medplum.types.fhir.Period) // required {@link MeasureReport#period() period}
   *    .id(com.medplum.types.fhir.Id) // optional {@link MeasureReport#id() id}
   *    .group(List&amp;lt;com.medplum.types.fhir.MeasureReport_Group&amp;gt;) // optional {@link MeasureReport#group() group}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link MeasureReport#date() date}
   *    .reporter(com.medplum.types.fhir.Reference) // optional {@link MeasureReport#reporter() reporter}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MeasureReport#extension() extension}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link MeasureReport#meta() meta}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link MeasureReport#text() text}
   *    .measure(com.medplum.types.fhir.Canonical) // required {@link MeasureReport#measure() measure}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link MeasureReport#identifier() identifier}
   *    .resourceType(String) // required {@link MeasureReport#resourceType() resourceType}
   *    .language(com.medplum.types.fhir.Code) // optional {@link MeasureReport#language() language}
   *    .evaluatedResource(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MeasureReport#evaluatedResource() evaluatedResource}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link MeasureReport#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link MeasureReport#contained() contained}
   *    .status(com.medplum.types.fhir.MeasurereportStatus) // optional {@link MeasureReport#status() status}
   *    .subject(com.medplum.types.fhir.Reference) // optional {@link MeasureReport#subject() subject}
   *    .improvementNotation(com.medplum.types.fhir.CodeableConcept) // optional {@link MeasureReport#improvementNotation() improvementNotation}
   *    .build();
   * </pre>
   * @return A new MeasureReport builder
   */
  public static PeriodBuildStage builder() {
    return new ImmutableMeasureReport.Builder();
  }

  /**
   * Builds instances of type {@link MeasureReport MeasureReport}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MeasureReport", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements PeriodBuildStage, MeasureBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_PERIOD = 0x1L;
    private static final long INIT_BIT_MEASURE = 0x2L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_GROUP = 0x8L;
    private static final long OPT_BIT_DATE = 0x10L;
    private static final long OPT_BIT_REPORTER = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_EVALUATED_RESOURCE = 0x800L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000L;
    private static final long OPT_BIT_CONTAINED = 0x2000L;
    private static final long OPT_BIT_STATUS = 0x4000L;
    private static final long OPT_BIT_SUBJECT = 0x8000L;
    private static final long OPT_BIT_IMPROVEMENT_NOTATION = 0x10000L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable MeasurereportType type;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Period period;
    private @Nullable Id id;
    private @Nullable List<MeasureReport_Group> group;
    private @Nullable DateTime date;
    private @Nullable Reference reporter;
    private @Nullable List<Extension> extension;
    private @Nullable Meta meta;
    private @Nullable Narrative text;
    private @Nullable Canonical measure;
    private @Nullable List<Identifier> identifier;
    private @Nullable String resourceType;
    private @Nullable Code language;
    private @Nullable List<Reference> evaluatedResource;
    private @Nullable Uri implicitRules;
    private @Nullable List<ResourceList> contained;
    private @Nullable MeasurereportStatus status;
    private @Nullable Reference subject;
    private @Nullable CodeableConcept improvementNotation;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MeasureReport#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(MeasurereportType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends MeasurereportType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MeasureReport#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link MeasureReport#period() period} attribute.
     * @param period The value for period 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      initBits &= ~INIT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#id() id} to id.
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
     * Initializes the optional value {@link MeasureReport#id() id} to id.
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
     * Initializes the optional value {@link MeasureReport#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for chained invocation
     */
    public final Builder group(List<MeasureReport_Group> group) {
      checkNotIsSet(groupIsSet(), "group");
      this.group = Objects.requireNonNull(group, "group");
      optBits |= OPT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("group")
    public final Builder group(Optional<? extends List<MeasureReport_Group>> group) {
      checkNotIsSet(groupIsSet(), "group");
      this.group = group.orElse(null);
      optBits |= OPT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#date() date} to date.
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
     * Initializes the optional value {@link MeasureReport#date() date} to date.
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
     * Initializes the optional value {@link MeasureReport#reporter() reporter} to reporter.
     * @param reporter The value for reporter
     * @return {@code this} builder for chained invocation
     */
    public final Builder reporter(Reference reporter) {
      checkNotIsSet(reporterIsSet(), "reporter");
      this.reporter = Objects.requireNonNull(reporter, "reporter");
      optBits |= OPT_BIT_REPORTER;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#reporter() reporter} to reporter.
     * @param reporter The value for reporter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reporter")
    public final Builder reporter(Optional<? extends Reference> reporter) {
      checkNotIsSet(reporterIsSet(), "reporter");
      this.reporter = reporter.orElse(null);
      optBits |= OPT_BIT_REPORTER;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#extension() extension} to extension.
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
     * Initializes the optional value {@link MeasureReport#extension() extension} to extension.
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
     * Initializes the optional value {@link MeasureReport#meta() meta} to meta.
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
     * Initializes the optional value {@link MeasureReport#meta() meta} to meta.
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
     * Initializes the optional value {@link MeasureReport#text() text} to text.
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
     * Initializes the optional value {@link MeasureReport#text() text} to text.
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
     * Initializes the value for the {@link MeasureReport#measure() measure} attribute.
     * @param measure The value for measure 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("measure")
    public final Builder measure(Canonical measure) {
      checkNotIsSet(measureIsSet(), "measure");
      this.measure = Objects.requireNonNull(measure, "measure");
      initBits &= ~INIT_BIT_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MeasureReport#identifier() identifier} to identifier.
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
     * Initializes the value for the {@link MeasureReport#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MeasureReport#language() language} to language.
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
     * Initializes the optional value {@link MeasureReport#language() language} to language.
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
     * Initializes the optional value {@link MeasureReport#evaluatedResource() evaluatedResource} to evaluatedResource.
     * @param evaluatedResource The value for evaluatedResource
     * @return {@code this} builder for chained invocation
     */
    public final Builder evaluatedResource(List<Reference> evaluatedResource) {
      checkNotIsSet(evaluatedResourceIsSet(), "evaluatedResource");
      this.evaluatedResource = Objects.requireNonNull(evaluatedResource, "evaluatedResource");
      optBits |= OPT_BIT_EVALUATED_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#evaluatedResource() evaluatedResource} to evaluatedResource.
     * @param evaluatedResource The value for evaluatedResource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("evaluatedResource")
    public final Builder evaluatedResource(Optional<? extends List<Reference>> evaluatedResource) {
      checkNotIsSet(evaluatedResourceIsSet(), "evaluatedResource");
      this.evaluatedResource = evaluatedResource.orElse(null);
      optBits |= OPT_BIT_EVALUATED_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MeasureReport#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MeasureReport#contained() contained} to contained.
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
     * Initializes the optional value {@link MeasureReport#contained() contained} to contained.
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
     * Initializes the optional value {@link MeasureReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(MeasurereportStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends MeasurereportStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#subject() subject} to subject.
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
     * Initializes the optional value {@link MeasureReport#subject() subject} to subject.
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
     * Initializes the optional value {@link MeasureReport#improvementNotation() improvementNotation} to improvementNotation.
     * @param improvementNotation The value for improvementNotation
     * @return {@code this} builder for chained invocation
     */
    public final Builder improvementNotation(CodeableConcept improvementNotation) {
      checkNotIsSet(improvementNotationIsSet(), "improvementNotation");
      this.improvementNotation = Objects.requireNonNull(improvementNotation, "improvementNotation");
      optBits |= OPT_BIT_IMPROVEMENT_NOTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport#improvementNotation() improvementNotation} to improvementNotation.
     * @param improvementNotation The value for improvementNotation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("improvementNotation")
    public final Builder improvementNotation(Optional<? extends CodeableConcept> improvementNotation) {
      checkNotIsSet(improvementNotationIsSet(), "improvementNotation");
      this.improvementNotation = improvementNotation.orElse(null);
      optBits |= OPT_BIT_IMPROVEMENT_NOTATION;
      return this;
    }

    /**
     * Builds a new {@link MeasureReport MeasureReport}.
     * @return An immutable instance of MeasureReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MeasureReport build() {
      checkRequiredAttributes();
      return new ImmutableMeasureReport(
          type,
          modifierExtension,
          period,
          id,
          group,
          date,
          reporter,
          extension,
          meta,
          text,
          measure,
          identifier,
          resourceType,
          language,
          evaluatedResource,
          implicitRules,
          contained,
          status,
          subject,
          improvementNotation);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean groupIsSet() {
      return (optBits & OPT_BIT_GROUP) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean reporterIsSet() {
      return (optBits & OPT_BIT_REPORTER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean evaluatedResourceIsSet() {
      return (optBits & OPT_BIT_EVALUATED_RESOURCE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean improvementNotationIsSet() {
      return (optBits & OPT_BIT_IMPROVEMENT_NOTATION) != 0;
    }

    private boolean periodIsSet() {
      return (initBits & INIT_BIT_PERIOD) == 0;
    }

    private boolean measureIsSet() {
      return (initBits & INIT_BIT_MEASURE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MeasureReport is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!periodIsSet()) attributes.add("period");
      if (!measureIsSet()) attributes.add("measure");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MeasureReport, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MeasureReport", generator = "Immutables")
  public interface PeriodBuildStage {
    /**
     * Initializes the value for the {@link MeasureReport#period() period} attribute.
     * @param period The value for period 
     * @return {@code this} builder for use in a chained invocation
     */
    MeasureBuildStage period(Period period);
  }

  @Generated(from = "MeasureReport", generator = "Immutables")
  public interface MeasureBuildStage {
    /**
     * Initializes the value for the {@link MeasureReport#measure() measure} attribute.
     * @param measure The value for measure 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage measure(Canonical measure);
  }

  @Generated(from = "MeasureReport", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MeasureReport#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MeasureReport", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MeasureReport#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(MeasurereportType type);

    /**
     * Initializes the optional value {@link MeasureReport#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends MeasurereportType> type);

    /**
     * Initializes the optional value {@link MeasureReport#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MeasureReport#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MeasureReport#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MeasureReport#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MeasureReport#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for chained invocation
     */
    BuildFinal group(List<MeasureReport_Group> group);

    /**
     * Initializes the optional value {@link MeasureReport#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal group(Optional<? extends List<MeasureReport_Group>> group);

    /**
     * Initializes the optional value {@link MeasureReport#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link MeasureReport#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link MeasureReport#reporter() reporter} to reporter.
     * @param reporter The value for reporter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reporter(Reference reporter);

    /**
     * Initializes the optional value {@link MeasureReport#reporter() reporter} to reporter.
     * @param reporter The value for reporter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reporter(Optional<? extends Reference> reporter);

    /**
     * Initializes the optional value {@link MeasureReport#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MeasureReport#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MeasureReport#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MeasureReport#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MeasureReport#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MeasureReport#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MeasureReport#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link MeasureReport#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link MeasureReport#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MeasureReport#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MeasureReport#evaluatedResource() evaluatedResource} to evaluatedResource.
     * @param evaluatedResource The value for evaluatedResource
     * @return {@code this} builder for chained invocation
     */
    BuildFinal evaluatedResource(List<Reference> evaluatedResource);

    /**
     * Initializes the optional value {@link MeasureReport#evaluatedResource() evaluatedResource} to evaluatedResource.
     * @param evaluatedResource The value for evaluatedResource
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal evaluatedResource(Optional<? extends List<Reference>> evaluatedResource);

    /**
     * Initializes the optional value {@link MeasureReport#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MeasureReport#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MeasureReport#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MeasureReport#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MeasureReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(MeasurereportStatus status);

    /**
     * Initializes the optional value {@link MeasureReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends MeasurereportStatus> status);

    /**
     * Initializes the optional value {@link MeasureReport#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link MeasureReport#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link MeasureReport#improvementNotation() improvementNotation} to improvementNotation.
     * @param improvementNotation The value for improvementNotation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal improvementNotation(CodeableConcept improvementNotation);

    /**
     * Initializes the optional value {@link MeasureReport#improvementNotation() improvementNotation} to improvementNotation.
     * @param improvementNotation The value for improvementNotation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal improvementNotation(Optional<? extends CodeableConcept> improvementNotation);

    /**
     * Builds a new {@link MeasureReport MeasureReport}.
     * @return An immutable instance of MeasureReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MeasureReport build();
  }
}
