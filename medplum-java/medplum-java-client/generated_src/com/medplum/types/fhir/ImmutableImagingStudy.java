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
 * Immutable implementation of {@link ImagingStudy}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImagingStudy.builder()}.
 */
@Generated(from = "ImagingStudy", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImagingStudy implements ImagingStudy {
  private final @Nullable Reference referrer;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Coding> modality;
  private final @Nullable ImagingstudyStatus status;
  private final @Nullable DateTime started;
  private final @Nullable List<Reference> endpoint;
  private final @Nullable List<CodeableConcept> procedureCode;
  private final Reference subject;
  private final @Nullable Reference location;
  private final @Nullable List<ImagingStudy_Series> series;
  private final @Nullable String description;
  private final @Nullable List<Reference> interpreter;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code language;
  private final @Nullable Narrative text;
  private final @Nullable List<Annotation> note;
  private final @Nullable UnsignedInt numberOfInstances;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Reference> basedOn;
  private final @Nullable Reference procedureReference;
  private final @Nullable Meta meta;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference encounter;
  private final String resourceType;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable Id id;
  private final @Nullable UnsignedInt numberOfSeries;

  private ImmutableImagingStudy(
      @Nullable Reference referrer,
      @Nullable Uri implicitRules,
      @Nullable List<Coding> modality,
      @Nullable ImagingstudyStatus status,
      @Nullable DateTime started,
      @Nullable List<Reference> endpoint,
      @Nullable List<CodeableConcept> procedureCode,
      Reference subject,
      @Nullable Reference location,
      @Nullable List<ImagingStudy_Series> series,
      @Nullable String description,
      @Nullable List<Reference> interpreter,
      @Nullable List<ResourceList> contained,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable List<Extension> extension,
      @Nullable Code language,
      @Nullable Narrative text,
      @Nullable List<Annotation> note,
      @Nullable UnsignedInt numberOfInstances,
      @Nullable List<Identifier> identifier,
      @Nullable List<Reference> basedOn,
      @Nullable Reference procedureReference,
      @Nullable Meta meta,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference encounter,
      String resourceType,
      @Nullable List<Reference> reasonReference,
      @Nullable Id id,
      @Nullable UnsignedInt numberOfSeries) {
    this.referrer = referrer;
    this.implicitRules = implicitRules;
    this.modality = modality;
    this.status = status;
    this.started = started;
    this.endpoint = endpoint;
    this.procedureCode = procedureCode;
    this.subject = subject;
    this.location = location;
    this.series = series;
    this.description = description;
    this.interpreter = interpreter;
    this.contained = contained;
    this.reasonCode = reasonCode;
    this.extension = extension;
    this.language = language;
    this.text = text;
    this.note = note;
    this.numberOfInstances = numberOfInstances;
    this.identifier = identifier;
    this.basedOn = basedOn;
    this.procedureReference = procedureReference;
    this.meta = meta;
    this.modifierExtension = modifierExtension;
    this.encounter = encounter;
    this.resourceType = resourceType;
    this.reasonReference = reasonReference;
    this.id = id;
    this.numberOfSeries = numberOfSeries;
  }

  /**
   * @return The value of the {@code referrer} attribute
   */
  @JsonProperty("referrer")
  @Override
  public Optional<Reference> referrer() {
    return Optional.ofNullable(referrer);
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
   * @return The value of the {@code modality} attribute
   */
  @JsonProperty("modality")
  @Override
  public Optional<List<Coding>> modality() {
    return Optional.ofNullable(modality);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<ImagingstudyStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code started} attribute
   */
  @JsonProperty("started")
  @Override
  public Optional<DateTime> started() {
    return Optional.ofNullable(started);
  }

  /**
   * @return The value of the {@code endpoint} attribute
   */
  @JsonProperty("endpoint")
  @Override
  public Optional<List<Reference>> endpoint() {
    return Optional.ofNullable(endpoint);
  }

  /**
   * @return The value of the {@code procedureCode} attribute
   */
  @JsonProperty("procedureCode")
  @Override
  public Optional<List<CodeableConcept>> procedureCode() {
    return Optional.ofNullable(procedureCode);
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
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Optional<Reference> location() {
    return Optional.ofNullable(location);
  }

  /**
   * @return The value of the {@code series} attribute
   */
  @JsonProperty("series")
  @Override
  public Optional<List<ImagingStudy_Series>> series() {
    return Optional.ofNullable(series);
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
   * @return The value of the {@code interpreter} attribute
   */
  @JsonProperty("interpreter")
  @Override
  public Optional<List<Reference>> interpreter() {
    return Optional.ofNullable(interpreter);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @JsonProperty("reasonCode")
  @Override
  public Optional<List<CodeableConcept>> reasonCode() {
    return Optional.ofNullable(reasonCode);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code numberOfInstances} attribute
   */
  @JsonProperty("numberOfInstances")
  @Override
  public Optional<UnsignedInt> numberOfInstances() {
    return Optional.ofNullable(numberOfInstances);
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
   * @return The value of the {@code procedureReference} attribute
   */
  @JsonProperty("procedureReference")
  @Override
  public Optional<Reference> procedureReference() {
    return Optional.ofNullable(procedureReference);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code numberOfSeries} attribute
   */
  @JsonProperty("numberOfSeries")
  @Override
  public Optional<UnsignedInt> numberOfSeries() {
    return Optional.ofNullable(numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#referrer() referrer} attribute.
   * @param value The value for referrer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withReferrer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "referrer");
    if (this.referrer == newValue) return this;
    return new ImmutableImagingStudy(
        newValue,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#referrer() referrer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referrer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withReferrer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.referrer == value) return this;
    return new ImmutableImagingStudy(
        value,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        newValue,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        value,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#modality() modality} attribute.
   * @param value The value for modality
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withModality(List<Coding> value) {
    @Nullable List<Coding> newValue = Objects.requireNonNull(value, "modality");
    if (this.modality == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        newValue,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#modality() modality} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modality
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withModality(Optional<? extends List<Coding>> optional) {
    @Nullable List<Coding> value = optional.orElse(null);
    if (this.modality == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        value,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withStatus(ImagingstudyStatus value) {
    @Nullable ImagingstudyStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        newValue,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withStatus(Optional<? extends ImagingstudyStatus> optional) {
    @Nullable ImagingstudyStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        value,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#started() started} attribute.
   * @param value The value for started
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withStarted(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "started");
    if (this.started == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        newValue,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#started() started} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for started
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withStarted(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.started == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        value,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withEndpoint(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        newValue,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withEndpoint(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        value,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#procedureCode() procedureCode} attribute.
   * @param value The value for procedureCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withProcedureCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "procedureCode");
    if (this.procedureCode == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        newValue,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#procedureCode() procedureCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedureCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withProcedureCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.procedureCode == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        value,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImagingStudy#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImagingStudy withSubject(Reference value) {
    if (this.subject == value) return this;
    Reference newValue = Objects.requireNonNull(value, "subject");
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        newValue,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withLocation(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        newValue,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withLocation(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        value,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#series() series} attribute.
   * @param value The value for series
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withSeries(List<ImagingStudy_Series> value) {
    @Nullable List<ImagingStudy_Series> newValue = Objects.requireNonNull(value, "series");
    if (this.series == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        newValue,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#series() series} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for series
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withSeries(Optional<? extends List<ImagingStudy_Series>> optional) {
    @Nullable List<ImagingStudy_Series> value = optional.orElse(null);
    if (this.series == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        value,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        newValue,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        value,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#interpreter() interpreter} attribute.
   * @param value The value for interpreter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withInterpreter(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "interpreter");
    if (this.interpreter == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        newValue,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#interpreter() interpreter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for interpreter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withInterpreter(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.interpreter == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        value,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        newValue,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        value,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        newValue,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        value,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        newValue,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        value,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        newValue,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        value,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        newValue,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        value,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        newValue,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        value,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#numberOfInstances() numberOfInstances} attribute.
   * @param value The value for numberOfInstances
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withNumberOfInstances(UnsignedInt value) {
    @Nullable UnsignedInt newValue = Objects.requireNonNull(value, "numberOfInstances");
    if (this.numberOfInstances == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        newValue,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#numberOfInstances() numberOfInstances} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numberOfInstances
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withNumberOfInstances(Optional<? extends UnsignedInt> optional) {
    @Nullable UnsignedInt value = optional.orElse(null);
    if (this.numberOfInstances == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        value,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        newValue,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        value,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        newValue,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        value,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#procedureReference() procedureReference} attribute.
   * @param value The value for procedureReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withProcedureReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "procedureReference");
    if (this.procedureReference == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        newValue,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#procedureReference() procedureReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedureReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withProcedureReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.procedureReference == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        value,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        newValue,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        value,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        newValue,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        value,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        newValue,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        value,
        this.resourceType,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImagingStudy#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImagingStudy withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        newValue,
        this.reasonReference,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        newValue,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        value,
        this.id,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        newValue,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        value,
        this.numberOfSeries);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#numberOfSeries() numberOfSeries} attribute.
   * @param value The value for numberOfSeries
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withNumberOfSeries(UnsignedInt value) {
    @Nullable UnsignedInt newValue = Objects.requireNonNull(value, "numberOfSeries");
    if (this.numberOfSeries == newValue) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#numberOfSeries() numberOfSeries} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numberOfSeries
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withNumberOfSeries(Optional<? extends UnsignedInt> optional) {
    @Nullable UnsignedInt value = optional.orElse(null);
    if (this.numberOfSeries == value) return this;
    return new ImmutableImagingStudy(
        this.referrer,
        this.implicitRules,
        this.modality,
        this.status,
        this.started,
        this.endpoint,
        this.procedureCode,
        this.subject,
        this.location,
        this.series,
        this.description,
        this.interpreter,
        this.contained,
        this.reasonCode,
        this.extension,
        this.language,
        this.text,
        this.note,
        this.numberOfInstances,
        this.identifier,
        this.basedOn,
        this.procedureReference,
        this.meta,
        this.modifierExtension,
        this.encounter,
        this.resourceType,
        this.reasonReference,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImagingStudy} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImagingStudy
        && equalTo((ImmutableImagingStudy) another);
  }

  private boolean equalTo(ImmutableImagingStudy another) {
    return Objects.equals(referrer, another.referrer)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(modality, another.modality)
        && Objects.equals(status, another.status)
        && Objects.equals(started, another.started)
        && Objects.equals(endpoint, another.endpoint)
        && Objects.equals(procedureCode, another.procedureCode)
        && subject.equals(another.subject)
        && Objects.equals(location, another.location)
        && Objects.equals(series, another.series)
        && Objects.equals(description, another.description)
        && Objects.equals(interpreter, another.interpreter)
        && Objects.equals(contained, another.contained)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(extension, another.extension)
        && Objects.equals(language, another.language)
        && Objects.equals(text, another.text)
        && Objects.equals(note, another.note)
        && Objects.equals(numberOfInstances, another.numberOfInstances)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(procedureReference, another.procedureReference)
        && Objects.equals(meta, another.meta)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(encounter, another.encounter)
        && resourceType.equals(another.resourceType)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(id, another.id)
        && Objects.equals(numberOfSeries, another.numberOfSeries);
  }

  /**
   * Computes a hash code from attributes: {@code referrer}, {@code implicitRules}, {@code modality}, {@code status}, {@code started}, {@code endpoint}, {@code procedureCode}, {@code subject}, {@code location}, {@code series}, {@code description}, {@code interpreter}, {@code contained}, {@code reasonCode}, {@code extension}, {@code language}, {@code text}, {@code note}, {@code numberOfInstances}, {@code identifier}, {@code basedOn}, {@code procedureReference}, {@code meta}, {@code modifierExtension}, {@code encounter}, {@code resourceType}, {@code reasonReference}, {@code id}, {@code numberOfSeries}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(referrer);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(modality);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(started);
    h += (h << 5) + Objects.hashCode(endpoint);
    h += (h << 5) + Objects.hashCode(procedureCode);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(series);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(interpreter);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(numberOfInstances);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(procedureReference);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(numberOfSeries);
    return h;
  }

  /**
   * Prints the immutable value {@code ImagingStudy} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImagingStudy{");
    if (referrer != null) {
      builder.append("referrer=").append(referrer);
    }
    if (implicitRules != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (modality != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("modality=").append(modality);
    }
    if (status != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (started != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("started=").append(started);
    }
    if (endpoint != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (procedureCode != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("procedureCode=").append(procedureCode);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("subject=").append(subject);
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (series != null) {
      builder.append(", ");
      builder.append("series=").append(series);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (interpreter != null) {
      builder.append(", ");
      builder.append("interpreter=").append(interpreter);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (numberOfInstances != null) {
      builder.append(", ");
      builder.append("numberOfInstances=").append(numberOfInstances);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (procedureReference != null) {
      builder.append(", ");
      builder.append("procedureReference=").append(procedureReference);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (numberOfSeries != null) {
      builder.append(", ");
      builder.append("numberOfSeries=").append(numberOfSeries);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImagingStudy", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImagingStudy {
    @Nullable Optional<Reference> referrer = Optional.empty();
    boolean referrerIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Coding>> modality = Optional.empty();
    boolean modalityIsSet;
    @Nullable Optional<ImagingstudyStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<DateTime> started = Optional.empty();
    boolean startedIsSet;
    @Nullable Optional<List<Reference>> endpoint = Optional.empty();
    boolean endpointIsSet;
    @Nullable Optional<List<CodeableConcept>> procedureCode = Optional.empty();
    boolean procedureCodeIsSet;
    @Nullable Reference subject;
    @Nullable Optional<Reference> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<List<ImagingStudy_Series>> series = Optional.empty();
    boolean seriesIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Reference>> interpreter = Optional.empty();
    boolean interpreterIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<UnsignedInt> numberOfInstances = Optional.empty();
    boolean numberOfInstancesIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<Reference> procedureReference = Optional.empty();
    boolean procedureReferenceIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<UnsignedInt> numberOfSeries = Optional.empty();
    boolean numberOfSeriesIsSet;
    @JsonProperty("referrer")
    public void setReferrer(Optional<Reference> referrer) {
      this.referrer = referrer;
      this.referrerIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("modality")
    public void setModality(Optional<List<Coding>> modality) {
      this.modality = modality;
      this.modalityIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<ImagingstudyStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("started")
    public void setStarted(Optional<DateTime> started) {
      this.started = started;
      this.startedIsSet = true;
    }
    @JsonProperty("endpoint")
    public void setEndpoint(Optional<List<Reference>> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @JsonProperty("procedureCode")
    public void setProcedureCode(Optional<List<CodeableConcept>> procedureCode) {
      this.procedureCode = procedureCode;
      this.procedureCodeIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
      this.subject = subject;
    }
    @JsonProperty("location")
    public void setLocation(Optional<Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("series")
    public void setSeries(Optional<List<ImagingStudy_Series>> series) {
      this.series = series;
      this.seriesIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("interpreter")
    public void setInterpreter(Optional<List<Reference>> interpreter) {
      this.interpreter = interpreter;
      this.interpreterIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("numberOfInstances")
    public void setNumberOfInstances(Optional<UnsignedInt> numberOfInstances) {
      this.numberOfInstances = numberOfInstances;
      this.numberOfInstancesIsSet = true;
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
    @JsonProperty("procedureReference")
    public void setProcedureReference(Optional<Reference> procedureReference) {
      this.procedureReference = procedureReference;
      this.procedureReferenceIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
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
    @JsonProperty("numberOfSeries")
    public void setNumberOfSeries(Optional<UnsignedInt> numberOfSeries) {
      this.numberOfSeries = numberOfSeries;
      this.numberOfSeriesIsSet = true;
    }
    @Override
    public Optional<Reference> referrer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coding>> modality() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ImagingstudyStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> started() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> procedureCode() { throw new UnsupportedOperationException(); }
    @Override
    public Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ImagingStudy_Series>> series() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> interpreter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UnsignedInt> numberOfInstances() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> procedureReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UnsignedInt> numberOfSeries() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImagingStudy fromJson(Json json) {
    ImmutableImagingStudy.Builder builder = ((ImmutableImagingStudy.Builder) ImmutableImagingStudy.builder());
    if (json.referrerIsSet) {
      builder.referrer(json.referrer);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.modalityIsSet) {
      builder.modality(json.modality);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.startedIsSet) {
      builder.started(json.started);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.procedureCodeIsSet) {
      builder.procedureCode(json.procedureCode);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.seriesIsSet) {
      builder.series(json.series);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.interpreterIsSet) {
      builder.interpreter(json.interpreter);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.numberOfInstancesIsSet) {
      builder.numberOfInstances(json.numberOfInstances);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.procedureReferenceIsSet) {
      builder.procedureReference(json.procedureReference);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.numberOfSeriesIsSet) {
      builder.numberOfSeries(json.numberOfSeries);
    }
    return (ImmutableImagingStudy) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImagingStudy} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImagingStudy instance
   */
  public static ImagingStudy copyOf(ImagingStudy instance) {
    if (instance instanceof ImmutableImagingStudy) {
      return (ImmutableImagingStudy) instance;
    }
    return ((ImmutableImagingStudy.Builder) ImmutableImagingStudy.builder())
        .referrer(instance.referrer())
        .implicitRules(instance.implicitRules())
        .modality(instance.modality())
        .status(instance.status())
        .started(instance.started())
        .endpoint(instance.endpoint())
        .procedureCode(instance.procedureCode())
        .subject(instance.subject())
        .location(instance.location())
        .series(instance.series())
        .description(instance.description())
        .interpreter(instance.interpreter())
        .contained(instance.contained())
        .reasonCode(instance.reasonCode())
        .extension(instance.extension())
        .language(instance.language())
        .text(instance.text())
        .note(instance.note())
        .numberOfInstances(instance.numberOfInstances())
        .identifier(instance.identifier())
        .basedOn(instance.basedOn())
        .procedureReference(instance.procedureReference())
        .meta(instance.meta())
        .modifierExtension(instance.modifierExtension())
        .encounter(instance.encounter())
        .resourceType(instance.resourceType())
        .reasonReference(instance.reasonReference())
        .id(instance.id())
        .numberOfSeries(instance.numberOfSeries())
        .build();
  }

  /**
   * Creates a builder for {@link ImagingStudy ImagingStudy}.
   * <pre>
   * ImmutableImagingStudy.builder()
   *    .referrer(com.medplum.types.fhir.Reference) // optional {@link ImagingStudy#referrer() referrer}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link ImagingStudy#implicitRules() implicitRules}
   *    .modality(List&amp;lt;com.medplum.types.fhir.Coding&amp;gt;) // optional {@link ImagingStudy#modality() modality}
   *    .status(com.medplum.types.fhir.ImagingstudyStatus) // optional {@link ImagingStudy#status() status}
   *    .started(com.medplum.types.fhir.DateTime) // optional {@link ImagingStudy#started() started}
   *    .endpoint(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ImagingStudy#endpoint() endpoint}
   *    .procedureCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ImagingStudy#procedureCode() procedureCode}
   *    .subject(com.medplum.types.fhir.Reference) // required {@link ImagingStudy#subject() subject}
   *    .location(com.medplum.types.fhir.Reference) // optional {@link ImagingStudy#location() location}
   *    .series(List&amp;lt;com.medplum.types.fhir.ImagingStudy_Series&amp;gt;) // optional {@link ImagingStudy#series() series}
   *    .description(String) // optional {@link ImagingStudy#description() description}
   *    .interpreter(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ImagingStudy#interpreter() interpreter}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link ImagingStudy#contained() contained}
   *    .reasonCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ImagingStudy#reasonCode() reasonCode}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImagingStudy#extension() extension}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ImagingStudy#language() language}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link ImagingStudy#text() text}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link ImagingStudy#note() note}
   *    .numberOfInstances(com.medplum.types.fhir.UnsignedInt) // optional {@link ImagingStudy#numberOfInstances() numberOfInstances}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link ImagingStudy#identifier() identifier}
   *    .basedOn(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ImagingStudy#basedOn() basedOn}
   *    .procedureReference(com.medplum.types.fhir.Reference) // optional {@link ImagingStudy#procedureReference() procedureReference}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link ImagingStudy#meta() meta}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImagingStudy#modifierExtension() modifierExtension}
   *    .encounter(com.medplum.types.fhir.Reference) // optional {@link ImagingStudy#encounter() encounter}
   *    .resourceType(String) // required {@link ImagingStudy#resourceType() resourceType}
   *    .reasonReference(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ImagingStudy#reasonReference() reasonReference}
   *    .id(com.medplum.types.fhir.Id) // optional {@link ImagingStudy#id() id}
   *    .numberOfSeries(com.medplum.types.fhir.UnsignedInt) // optional {@link ImagingStudy#numberOfSeries() numberOfSeries}
   *    .build();
   * </pre>
   * @return A new ImagingStudy builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableImagingStudy.Builder();
  }

  /**
   * Builds instances of type {@link ImagingStudy ImagingStudy}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImagingStudy", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_REFERRER = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_MODALITY = 0x4L;
    private static final long OPT_BIT_STATUS = 0x8L;
    private static final long OPT_BIT_STARTED = 0x10L;
    private static final long OPT_BIT_ENDPOINT = 0x20L;
    private static final long OPT_BIT_PROCEDURE_CODE = 0x40L;
    private static final long OPT_BIT_LOCATION = 0x80L;
    private static final long OPT_BIT_SERIES = 0x100L;
    private static final long OPT_BIT_DESCRIPTION = 0x200L;
    private static final long OPT_BIT_INTERPRETER = 0x400L;
    private static final long OPT_BIT_CONTAINED = 0x800L;
    private static final long OPT_BIT_REASON_CODE = 0x1000L;
    private static final long OPT_BIT_EXTENSION = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private static final long OPT_BIT_TEXT = 0x8000L;
    private static final long OPT_BIT_NOTE = 0x10000L;
    private static final long OPT_BIT_NUMBER_OF_INSTANCES = 0x20000L;
    private static final long OPT_BIT_IDENTIFIER = 0x40000L;
    private static final long OPT_BIT_BASED_ON = 0x80000L;
    private static final long OPT_BIT_PROCEDURE_REFERENCE = 0x100000L;
    private static final long OPT_BIT_META = 0x200000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400000L;
    private static final long OPT_BIT_ENCOUNTER = 0x800000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x1000000L;
    private static final long OPT_BIT_ID = 0x2000000L;
    private static final long OPT_BIT_NUMBER_OF_SERIES = 0x4000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable Reference referrer;
    private @Nullable Uri implicitRules;
    private @Nullable List<Coding> modality;
    private @Nullable ImagingstudyStatus status;
    private @Nullable DateTime started;
    private @Nullable List<Reference> endpoint;
    private @Nullable List<CodeableConcept> procedureCode;
    private @Nullable Reference subject;
    private @Nullable Reference location;
    private @Nullable List<ImagingStudy_Series> series;
    private @Nullable String description;
    private @Nullable List<Reference> interpreter;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable List<Extension> extension;
    private @Nullable Code language;
    private @Nullable Narrative text;
    private @Nullable List<Annotation> note;
    private @Nullable UnsignedInt numberOfInstances;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Reference> basedOn;
    private @Nullable Reference procedureReference;
    private @Nullable Meta meta;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference encounter;
    private @Nullable String resourceType;
    private @Nullable List<Reference> reasonReference;
    private @Nullable Id id;
    private @Nullable UnsignedInt numberOfSeries;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImagingStudy#referrer() referrer} to referrer.
     * @param referrer The value for referrer
     * @return {@code this} builder for chained invocation
     */
    public final Builder referrer(Reference referrer) {
      checkNotIsSet(referrerIsSet(), "referrer");
      this.referrer = Objects.requireNonNull(referrer, "referrer");
      optBits |= OPT_BIT_REFERRER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#referrer() referrer} to referrer.
     * @param referrer The value for referrer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referrer")
    public final Builder referrer(Optional<? extends Reference> referrer) {
      checkNotIsSet(referrerIsSet(), "referrer");
      this.referrer = referrer.orElse(null);
      optBits |= OPT_BIT_REFERRER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ImagingStudy#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ImagingStudy#modality() modality} to modality.
     * @param modality The value for modality
     * @return {@code this} builder for chained invocation
     */
    public final Builder modality(List<Coding> modality) {
      checkNotIsSet(modalityIsSet(), "modality");
      this.modality = Objects.requireNonNull(modality, "modality");
      optBits |= OPT_BIT_MODALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#modality() modality} to modality.
     * @param modality The value for modality
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modality")
    public final Builder modality(Optional<? extends List<Coding>> modality) {
      checkNotIsSet(modalityIsSet(), "modality");
      this.modality = modality.orElse(null);
      optBits |= OPT_BIT_MODALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(ImagingstudyStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends ImagingstudyStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#started() started} to started.
     * @param started The value for started
     * @return {@code this} builder for chained invocation
     */
    public final Builder started(DateTime started) {
      checkNotIsSet(startedIsSet(), "started");
      this.started = Objects.requireNonNull(started, "started");
      optBits |= OPT_BIT_STARTED;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#started() started} to started.
     * @param started The value for started
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("started")
    public final Builder started(Optional<? extends DateTime> started) {
      checkNotIsSet(startedIsSet(), "started");
      this.started = started.orElse(null);
      optBits |= OPT_BIT_STARTED;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder endpoint(List<Reference> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = Objects.requireNonNull(endpoint, "endpoint");
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("endpoint")
    public final Builder endpoint(Optional<? extends List<Reference>> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = endpoint.orElse(null);
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#procedureCode() procedureCode} to procedureCode.
     * @param procedureCode The value for procedureCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedureCode(List<CodeableConcept> procedureCode) {
      checkNotIsSet(procedureCodeIsSet(), "procedureCode");
      this.procedureCode = Objects.requireNonNull(procedureCode, "procedureCode");
      optBits |= OPT_BIT_PROCEDURE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#procedureCode() procedureCode} to procedureCode.
     * @param procedureCode The value for procedureCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("procedureCode")
    public final Builder procedureCode(Optional<? extends List<CodeableConcept>> procedureCode) {
      checkNotIsSet(procedureCodeIsSet(), "procedureCode");
      this.procedureCode = procedureCode.orElse(null);
      optBits |= OPT_BIT_PROCEDURE_CODE;
      return this;
    }

    /**
     * Initializes the value for the {@link ImagingStudy#subject() subject} attribute.
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
     * Initializes the optional value {@link ImagingStudy#location() location} to location.
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
     * Initializes the optional value {@link ImagingStudy#location() location} to location.
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
     * Initializes the optional value {@link ImagingStudy#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for chained invocation
     */
    public final Builder series(List<ImagingStudy_Series> series) {
      checkNotIsSet(seriesIsSet(), "series");
      this.series = Objects.requireNonNull(series, "series");
      optBits |= OPT_BIT_SERIES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("series")
    public final Builder series(Optional<? extends List<ImagingStudy_Series>> series) {
      checkNotIsSet(seriesIsSet(), "series");
      this.series = series.orElse(null);
      optBits |= OPT_BIT_SERIES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#description() description} to description.
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
     * Initializes the optional value {@link ImagingStudy#description() description} to description.
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
     * Initializes the optional value {@link ImagingStudy#interpreter() interpreter} to interpreter.
     * @param interpreter The value for interpreter
     * @return {@code this} builder for chained invocation
     */
    public final Builder interpreter(List<Reference> interpreter) {
      checkNotIsSet(interpreterIsSet(), "interpreter");
      this.interpreter = Objects.requireNonNull(interpreter, "interpreter");
      optBits |= OPT_BIT_INTERPRETER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#interpreter() interpreter} to interpreter.
     * @param interpreter The value for interpreter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("interpreter")
    public final Builder interpreter(Optional<? extends List<Reference>> interpreter) {
      checkNotIsSet(interpreterIsSet(), "interpreter");
      this.interpreter = interpreter.orElse(null);
      optBits |= OPT_BIT_INTERPRETER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#contained() contained} to contained.
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
     * Initializes the optional value {@link ImagingStudy#contained() contained} to contained.
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
     * Initializes the optional value {@link ImagingStudy#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link ImagingStudy#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link ImagingStudy#extension() extension} to extension.
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
     * Initializes the optional value {@link ImagingStudy#extension() extension} to extension.
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
     * Initializes the optional value {@link ImagingStudy#language() language} to language.
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
     * Initializes the optional value {@link ImagingStudy#language() language} to language.
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
     * Initializes the optional value {@link ImagingStudy#text() text} to text.
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
     * Initializes the optional value {@link ImagingStudy#text() text} to text.
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
     * Initializes the optional value {@link ImagingStudy#note() note} to note.
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
     * Initializes the optional value {@link ImagingStudy#note() note} to note.
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
     * Initializes the optional value {@link ImagingStudy#numberOfInstances() numberOfInstances} to numberOfInstances.
     * @param numberOfInstances The value for numberOfInstances
     * @return {@code this} builder for chained invocation
     */
    public final Builder numberOfInstances(UnsignedInt numberOfInstances) {
      checkNotIsSet(numberOfInstancesIsSet(), "numberOfInstances");
      this.numberOfInstances = Objects.requireNonNull(numberOfInstances, "numberOfInstances");
      optBits |= OPT_BIT_NUMBER_OF_INSTANCES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#numberOfInstances() numberOfInstances} to numberOfInstances.
     * @param numberOfInstances The value for numberOfInstances
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("numberOfInstances")
    public final Builder numberOfInstances(Optional<? extends UnsignedInt> numberOfInstances) {
      checkNotIsSet(numberOfInstancesIsSet(), "numberOfInstances");
      this.numberOfInstances = numberOfInstances.orElse(null);
      optBits |= OPT_BIT_NUMBER_OF_INSTANCES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ImagingStudy#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ImagingStudy#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link ImagingStudy#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link ImagingStudy#procedureReference() procedureReference} to procedureReference.
     * @param procedureReference The value for procedureReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedureReference(Reference procedureReference) {
      checkNotIsSet(procedureReferenceIsSet(), "procedureReference");
      this.procedureReference = Objects.requireNonNull(procedureReference, "procedureReference");
      optBits |= OPT_BIT_PROCEDURE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#procedureReference() procedureReference} to procedureReference.
     * @param procedureReference The value for procedureReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("procedureReference")
    public final Builder procedureReference(Optional<? extends Reference> procedureReference) {
      checkNotIsSet(procedureReferenceIsSet(), "procedureReference");
      this.procedureReference = procedureReference.orElse(null);
      optBits |= OPT_BIT_PROCEDURE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#meta() meta} to meta.
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
     * Initializes the optional value {@link ImagingStudy#meta() meta} to meta.
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
     * Initializes the optional value {@link ImagingStudy#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImagingStudy#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImagingStudy#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link ImagingStudy#encounter() encounter} to encounter.
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
     * Initializes the value for the {@link ImagingStudy#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ImagingStudy#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link ImagingStudy#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link ImagingStudy#id() id} to id.
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
     * Initializes the optional value {@link ImagingStudy#id() id} to id.
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
     * Initializes the optional value {@link ImagingStudy#numberOfSeries() numberOfSeries} to numberOfSeries.
     * @param numberOfSeries The value for numberOfSeries
     * @return {@code this} builder for chained invocation
     */
    public final Builder numberOfSeries(UnsignedInt numberOfSeries) {
      checkNotIsSet(numberOfSeriesIsSet(), "numberOfSeries");
      this.numberOfSeries = Objects.requireNonNull(numberOfSeries, "numberOfSeries");
      optBits |= OPT_BIT_NUMBER_OF_SERIES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#numberOfSeries() numberOfSeries} to numberOfSeries.
     * @param numberOfSeries The value for numberOfSeries
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("numberOfSeries")
    public final Builder numberOfSeries(Optional<? extends UnsignedInt> numberOfSeries) {
      checkNotIsSet(numberOfSeriesIsSet(), "numberOfSeries");
      this.numberOfSeries = numberOfSeries.orElse(null);
      optBits |= OPT_BIT_NUMBER_OF_SERIES;
      return this;
    }

    /**
     * Builds a new {@link ImagingStudy ImagingStudy}.
     * @return An immutable instance of ImagingStudy
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImagingStudy build() {
      checkRequiredAttributes();
      return new ImmutableImagingStudy(
          referrer,
          implicitRules,
          modality,
          status,
          started,
          endpoint,
          procedureCode,
          subject,
          location,
          series,
          description,
          interpreter,
          contained,
          reasonCode,
          extension,
          language,
          text,
          note,
          numberOfInstances,
          identifier,
          basedOn,
          procedureReference,
          meta,
          modifierExtension,
          encounter,
          resourceType,
          reasonReference,
          id,
          numberOfSeries);
    }

    private boolean referrerIsSet() {
      return (optBits & OPT_BIT_REFERRER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modalityIsSet() {
      return (optBits & OPT_BIT_MODALITY) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean startedIsSet() {
      return (optBits & OPT_BIT_STARTED) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean procedureCodeIsSet() {
      return (optBits & OPT_BIT_PROCEDURE_CODE) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean seriesIsSet() {
      return (optBits & OPT_BIT_SERIES) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean interpreterIsSet() {
      return (optBits & OPT_BIT_INTERPRETER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean numberOfInstancesIsSet() {
      return (optBits & OPT_BIT_NUMBER_OF_INSTANCES) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean procedureReferenceIsSet() {
      return (optBits & OPT_BIT_PROCEDURE_REFERENCE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean numberOfSeriesIsSet() {
      return (optBits & OPT_BIT_NUMBER_OF_SERIES) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImagingStudy is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!subjectIsSet()) attributes.add("subject");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ImagingStudy, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ImagingStudy", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link ImagingStudy#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(Reference subject);
  }

  @Generated(from = "ImagingStudy", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ImagingStudy#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "ImagingStudy", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImagingStudy#referrer() referrer} to referrer.
     * @param referrer The value for referrer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referrer(Reference referrer);

    /**
     * Initializes the optional value {@link ImagingStudy#referrer() referrer} to referrer.
     * @param referrer The value for referrer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referrer(Optional<? extends Reference> referrer);

    /**
     * Initializes the optional value {@link ImagingStudy#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ImagingStudy#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ImagingStudy#modality() modality} to modality.
     * @param modality The value for modality
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modality(List<Coding> modality);

    /**
     * Initializes the optional value {@link ImagingStudy#modality() modality} to modality.
     * @param modality The value for modality
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modality(Optional<? extends List<Coding>> modality);

    /**
     * Initializes the optional value {@link ImagingStudy#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(ImagingstudyStatus status);

    /**
     * Initializes the optional value {@link ImagingStudy#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends ImagingstudyStatus> status);

    /**
     * Initializes the optional value {@link ImagingStudy#started() started} to started.
     * @param started The value for started
     * @return {@code this} builder for chained invocation
     */
    BuildFinal started(DateTime started);

    /**
     * Initializes the optional value {@link ImagingStudy#started() started} to started.
     * @param started The value for started
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal started(Optional<? extends DateTime> started);

    /**
     * Initializes the optional value {@link ImagingStudy#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endpoint(List<Reference> endpoint);

    /**
     * Initializes the optional value {@link ImagingStudy#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endpoint(Optional<? extends List<Reference>> endpoint);

    /**
     * Initializes the optional value {@link ImagingStudy#procedureCode() procedureCode} to procedureCode.
     * @param procedureCode The value for procedureCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal procedureCode(List<CodeableConcept> procedureCode);

    /**
     * Initializes the optional value {@link ImagingStudy#procedureCode() procedureCode} to procedureCode.
     * @param procedureCode The value for procedureCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal procedureCode(Optional<? extends List<CodeableConcept>> procedureCode);

    /**
     * Initializes the optional value {@link ImagingStudy#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(Reference location);

    /**
     * Initializes the optional value {@link ImagingStudy#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(Optional<? extends Reference> location);

    /**
     * Initializes the optional value {@link ImagingStudy#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for chained invocation
     */
    BuildFinal series(List<ImagingStudy_Series> series);

    /**
     * Initializes the optional value {@link ImagingStudy#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal series(Optional<? extends List<ImagingStudy_Series>> series);

    /**
     * Initializes the optional value {@link ImagingStudy#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link ImagingStudy#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link ImagingStudy#interpreter() interpreter} to interpreter.
     * @param interpreter The value for interpreter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal interpreter(List<Reference> interpreter);

    /**
     * Initializes the optional value {@link ImagingStudy#interpreter() interpreter} to interpreter.
     * @param interpreter The value for interpreter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal interpreter(Optional<? extends List<Reference>> interpreter);

    /**
     * Initializes the optional value {@link ImagingStudy#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ImagingStudy#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ImagingStudy#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link ImagingStudy#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link ImagingStudy#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ImagingStudy#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ImagingStudy#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ImagingStudy#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ImagingStudy#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ImagingStudy#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ImagingStudy#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link ImagingStudy#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link ImagingStudy#numberOfInstances() numberOfInstances} to numberOfInstances.
     * @param numberOfInstances The value for numberOfInstances
     * @return {@code this} builder for chained invocation
     */
    BuildFinal numberOfInstances(UnsignedInt numberOfInstances);

    /**
     * Initializes the optional value {@link ImagingStudy#numberOfInstances() numberOfInstances} to numberOfInstances.
     * @param numberOfInstances The value for numberOfInstances
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal numberOfInstances(Optional<? extends UnsignedInt> numberOfInstances);

    /**
     * Initializes the optional value {@link ImagingStudy#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link ImagingStudy#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link ImagingStudy#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link ImagingStudy#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link ImagingStudy#procedureReference() procedureReference} to procedureReference.
     * @param procedureReference The value for procedureReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal procedureReference(Reference procedureReference);

    /**
     * Initializes the optional value {@link ImagingStudy#procedureReference() procedureReference} to procedureReference.
     * @param procedureReference The value for procedureReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal procedureReference(Optional<? extends Reference> procedureReference);

    /**
     * Initializes the optional value {@link ImagingStudy#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ImagingStudy#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ImagingStudy#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImagingStudy#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImagingStudy#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link ImagingStudy#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link ImagingStudy#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link ImagingStudy#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link ImagingStudy#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ImagingStudy#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ImagingStudy#numberOfSeries() numberOfSeries} to numberOfSeries.
     * @param numberOfSeries The value for numberOfSeries
     * @return {@code this} builder for chained invocation
     */
    BuildFinal numberOfSeries(UnsignedInt numberOfSeries);

    /**
     * Initializes the optional value {@link ImagingStudy#numberOfSeries() numberOfSeries} to numberOfSeries.
     * @param numberOfSeries The value for numberOfSeries
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal numberOfSeries(Optional<? extends UnsignedInt> numberOfSeries);

    /**
     * Builds a new {@link ImagingStudy ImagingStudy}.
     * @return An immutable instance of ImagingStudy
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImagingStudy build();
  }
}
